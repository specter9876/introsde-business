package isde.sde.soap;

import introsde.*;//cmbiare
import introsde.User;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;



import org.glassfish.jersey.client.ClientConfig;

import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.json.*;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebService;

//Service Implementation

@WebService(endpointInterface = "isde.sde.soap.Business", serviceName="BusinessService")
public class BusinessImpl implements Business {
  
    ////////////////////////////////BUSINESS METHODsS///////////////////////////////////
    
    ///////////////////////////////////////////USER////////////////////////////////
    
    
    @Override
    public User login(String userName,String password ){//ok
      
        
        Storage storage=getStorage();
        if(storage.controlUsernamePassword(userName, password)){
            
            User user=storage.getUserByUsernamePassword(userName, password);
            System.out.println("OK");
            return user;
        }
        else{
            System.out.println("NO");


            return null;
        }
    }
    

    
    
    @Override
    public User createUser(User user, List<HealthMeasure> healthMeasures){ //ok
        //+++al create user creo anche healht va che è piu compatto lo posso fare in process
        
        Storage storage=getStorage();
        String result=null;
        
        User u=storage.createUser(user);
        for(HealthMeasure hm:healthmeasure){
            
            result=this.addHealthMeasure(hm);
        }
        
       
        return u;
        
        
    }
    
    
    @Override
    public User updateUser(User user){//ok solo sistematina che cosi fa update di tutti i campi
        
        Storage storage=getStorage();
        //User userRetrieved=storage.getUserById(user.getId());
        //
        //+++magari verificare i campi updatati ricevendo qualcosa da sopra se li passo null magari tiene quelli(boh vedere)
        
        

        return storage.updateUser(user);
    }
    
    //////////////////////////////////HEALTHMEASURE/////////////////////////////////

    
    @Override
    public List<HealthMeasure> getRecentHealthMeasureByUser(Long idUser){//OK\\
        
        Storage storage=getStorage();
        List <HealthMeasure> current= new ArrayList <HealthMeasure> ();
        List <HealthMeasure> healthMeasureWeightRetrieve = storage.getHealthMeasureByIdUserType(idUser,"weight");
        List <HealthMeasure> healthMeasureHeightRetrieve = storage.getHealthMeasureByIdUserType(idUser,"height");
        List <HealthMeasure> healthMeasureDistanceRetrieve = storage.getHealthMeasureByIdUserType(idUser,"distance");
        List <HealthMeasure> healthMeasureStepRetrieve = storage.getHealthMeasureByIdUserType(idUser,"steps");
        //add di piu se voglio

        
        //veloce e furbo XD
        if(healthMeasureWeightRetrieve.size()>0){
            current.add(healthMeasureWeightRetrieve.get(0));
        }
        if(healthMeasureHeightRetrieve.size()>0){
            current.add(healthMeasureHeightRetrieve.get(0));
        }
        if(healthMeasureDistanceRetrieve.size()>0){
            current.add(healthMeasureDistanceRetrieve.get(0));
        }
        if(healthMeasureStepRetrieve.size()>0){
            current.add(healthMeasureStepRetrieve.get(0));
        }
        
        return current;
    }
    
    @Override
    public List<HealthMeasure> getHistoryOfAllHealthMeasureByUser(Long idUser ){//OK\\
        
        Storage storage=getStorage();
        List<HealthMeasure> healthMeasure=storage.getHealthMeasureByIdUser(idUser);
        return healthMeasure;
    }
    

    @Override
    public String addHealthMeasure( Long idUser, HealthMeasure healthMeasure ){//OK\\
        //magari per distance la metto incrementale?
        Storage storage=getStorage();
        System.out.println("add health measure");
        String result=null;
        
        //controlllo con l ultima healthmeasure se è meglio o peggio
        List<HealthMeasure> hm=this.getRecentHealthMeasureByUser(idUser);
        System.out.println("size of retrieved: "+hm.size());
        for (HealthMeasure hmtemp:hm){
            System.out.println("looking for");
            if(hmtemp.getType().equals(healthMeasure.getType())){
                System.out.println("match rtpe");
                
                ///weght and step and heght
                if (healthMeasure.getType().equals("weight")){
                    
                    if(healthMeasure.getValue()<hmtemp.getValue()){
                        
                        System.out.println("well done, go on and remember: "+storage.getQuote());
                        result="well done, go on and remember: "+storage.getQuote();
                    }
                    else{
                        
                         System.out.println("You are static, go on and remember: "+storage.getQuote());
                         result="You are static, go on and remember: "+storage.getQuote();

                    }
                    
                }
                if(healthMeasure.getType().equals("height")){
                    
                    if(healthMeasure.getValue()<hmtemp.getValue()){
                        
                        System.out.println("you are restricting, go on and remember: "+storage.getQuote());
                        result="you are restricting, go on and remember: "+storage.getQuote();
                    }
                    else{
                        
                        System.out.println("You are growing, go on and remember: "+storage.getQuote());
                        result="You are growing, go on and remember: "+storage.getQuote();
                    }

                    
                }
                if((healthMeasure.getType().equals("steps")) || (healthMeasure.getType().equals("distance"))){
                    
                    if(healthMeasure.getValue()>hmtemp.getValue()){
                        
                        System.out.println("well done, go on and remember: "+storage.getQuote());
                        result="well done, go on and remember: "+storage.getQuote();
                    }
                    else{
                        
                        System.out.println("You are static, go on and remember: "+storage.getQuote());
                        result="You are static, go on and remember: "+storage.getQuote();
                    }

                    
                }
                
                
            }
            
        }
    
        //completato
        try{
            
            
            String timeStamp = new SimpleDateFormat("y/M/d").format(Calendar.getInstance().getTime());
            DateFormat df = new SimpleDateFormat("y/M/d");
            Date date = df.parse(timeStamp);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            
            XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            healthMeasure.setDate(xmlDate);
            
            
        }
        catch(Exception e){
            
        }
        if(result==null){
            result="you add a new measure good";
        }
        HealthMeasure hmeasure=storage.createHealthMeasure(healthMeasure);
        
        
        return result;
    }
    
    /////////////////////////////////////FOOD//////////////////////////////////////////
    
    
    
    @Override
    public List<Food> suggestFoodByCaloriesBound(String type, double calories){//OK\\
        
        Storage storage=getStorage();
        List<Food> listFood=storage.getAdapterFood(type);
        List<Food> listFilterFood= new ArrayList<Food>();
        
        for(Food ftemp:listFood){
           
            
            if(ftemp.getCalories()<=calories){
                
                listFilterFood.add(ftemp);
                
            }
            
        }
        
        return listFilterFood;
    }
    
    
    
    @Override
    public List<Food> suggestFoodByType(String type){//OK\\
        Storage storage=getStorage();
        List<Food> listFood=storage.getAdapterFood(type);
        
        return listFood;
    }
    ///////////////////////////////////GOAL//////////////////////////////////////////


    
    @Override
    public List<Goal> controlGoalHealth( HealthMeasure healthMeasure, long idUser ){
        
        Storage storage=getStorage();
       
        List<Goal> goalNotAchieved=storage.getGoalNotAchieved(idUser);
        List<Goal> goalselect=new ArrayList <Goal>();

        for(Goal goaltemp:goalNotAchieved){
            System.out.println("FOR to check goal not achieved");
            System.out.println("goal descript: "+goaltemp.getDescription());
            System.out.println("goal descript: "+healthMeasure.getType());
            
            
        	if(goaltemp.getDescription().equals(healthMeasure.getType())){
                System.out.println("found goal");



        		//+++mettere discriminante per goal da activity particolari//tipo perdere peso
                if (goaltemp.getDescription().equals("weight")){
                    
                    System.out.println("Weight measure control goal");
                    List<HealthMeasure> listHm= this.getRecentHealthMeasureByUser(idUser);
                    for(HealthMeasure hmtemp:listHm){
                        
                        if((hmtemp.getType().equals("weight"))&&(hmtemp.getValue()-healthMeasure.getValue()+ goaltemp.getProgress()>=goaltemp.getEndValue())){
                            //goal achieve
                            try{
                                
                                
                                String timeStamp = new SimpleDateFormat("y/M/d").format(Calendar.getInstance().getTime());
                                DateFormat df = new SimpleDateFormat("y/M/d");
                                Date date = df.parse(timeStamp);
                                GregorianCalendar cal = new GregorianCalendar();
                                cal.setTime(date);
                                
                                XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                                goaltemp.setEndAt(xmlDate);
                                
                                
                            }
                            catch(Exception e){
                                
                            }
                            
                            System.out.println("saving gooal update");
                            goaltemp.setProgress(goaltemp.getEndValue());
                            goaltemp.setIsAchieved(1);
                            goalselect.add(storage.updateGoal(goaltemp));

                        }
                        else{
                            
                             if((hmtemp.getType().equals("weight"))&&(hmtemp.getValue()-healthMeasure.getValue()+ goaltemp.getProgress()<goaltemp.getEndValue())){
                                   //goal not achieved upadte progress
                                   double progress=goaltemp.getProgress();
                                
                                   goaltemp.setProgress(progress+hmtemp.getValue()-healthMeasure.getValue());
                                   goalselect.add(storage.updateGoal(goaltemp));
                             }
                         }
                           
                     }
                    
                     return goalselect;
                 }
                           
                //gaolhealth generico
                else{
                     System.out.println("find goal for activity");
                     double currentProgress=goaltemp.getProgress()+healthMeasure.getValue();
                     
                     if((goaltemp.getEndValue()<=healthMeasure.getValue())||(currentProgress>=goaltemp.getEndValue())){

        			//completato
                            try{

                                String timeStamp = new SimpleDateFormat("y/M/d").format(Calendar.getInstance().getTime());
                                DateFormat df = new SimpleDateFormat("y/M/d");
                                Date date = df.parse(timeStamp);
                                GregorianCalendar cal = new GregorianCalendar();
                                cal.setTime(date);
						
                                XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                                goaltemp.setEndAt(xmlDate);

                       
                                }
                            catch(Exception e){
                        
                            }

                            System.out.println("saving gooal update");
                            goaltemp.setProgress(goaltemp.getEndValue());
                            goaltemp.setIsAchieved(1);
                            goalselect.add(storage.updateGoal(goaltemp));

                     }
        		
                     else{

                         //non completo fare update
                         //double currentProgress=goaltemp.getProgress();
                         goaltemp.setProgress(currentProgress);
                         goalselect.add(storage.updateGoal(goaltemp));
        		
                     }
                    
                    return goalselect;

                 }
            }
        }
        return goalselect;

       
    }
    
    @Override
    public List<Goal> controlGoalActivity( Activity activity, long idUser ){ //fix roba delle date 
        
        Storage storage=getStorage();
        System.out.println("Method controlGoalActivity");
       
        List<Activity> activityBase=storage.getActivityByType(activity.getType());
        List<Goal> goalNotAchieved=storage.getGoalNotAchieved(idUser);//quelli non scelti (123) non li consider0
        List<Goal> goalresult=new ArrayList<Goal>();

        System.out.println("num di goal disp: "+goalNotAchieved.size());
        
        for(Goal goaltemp:goalNotAchieved){
            
            if(activity.getType().equals(goaltemp.getDescription())){//match dell activity.type inserita con il goal.description
                
                System.out.println("find goal for activity");
                double currentProgress=goaltemp.getProgress()+activity.getValue();


                //caso in cui becco o supero il valore prefissato oppure aggiungendo il valore dell attività piu progress gia raggiunti arrivo al goal
                if((goaltemp.getEndValue()==activity.getValue())||(goaltemp.getEndValue()<activity.getValue())||(currentProgress>=goaltemp.getEndValue())){
                    
                    System.out.println("Well done");
                    
                    goaltemp.setIsAchieved(1);
                    goaltemp.setProgress(goaltemp.getEndValue());
                    
                    System.out.println("time in milli test: "+ System.currentTimeMillis());
                    
       
                
                    try{


                    	String timeStamp = new SimpleDateFormat("y/M/d").format(Calendar.getInstance().getTime());
						DateFormat df = new SimpleDateFormat("y/M/d");
						Date date = df.parse(timeStamp);
						GregorianCalendar cal = new GregorianCalendar();
						cal.setTime(date);
						
                        XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                        goaltemp.setEndAt(xmlDate);

                       
                    }
                    catch(Exception e){
                        
                    }
                    
                    System.out.println("saving gooal update");
                    goalresult.add(storage.updateGoal(goaltemp));//update goal setting current date and isachievde
              		//potrei creare un altro di questi goal con stessa description e value oldvalue+100


                    
                    
                }
                else{ //non ho raggiunnto il goal manco aggiungendo il value dell activity
                     
                     System.out.println("another step");
                     goaltemp.setProgress(currentProgress);
                     goalresult.add(storage.updateGoal(goaltemp));

                    
                }
                
                
            }
            
        }
        return goalresult;
    }
    
    

    
    
    
    @Override
    public List<Goal> toDoGoal( long idUser){//OK\\

        Storage storage=getStorage();
        List<Goal> retrievedGoal=storage.getGoalNotAchieved(idUser);
        List<Goal> finalGoal=new ArrayList<Goal> ();
        
        for (Goal g:retrievedGoal){
            System.out.println(""+g.getStartAt());
            
            XMLGregorianCalendar endAt=g.getEndAt();
            XMLGregorianCalendar today = null;
            
            
            try{

            GregorianCalendar cal = new GregorianCalendar();
            cal.setTimeInMillis(System.currentTimeMillis());
            today = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                
            }
            catch(Exception e){
                
            }
            
            //controllo dat adesso e se scaduto il goal non servira quando remove from db goal scaduti(se lo faccio)
            if(today.toGregorianCalendar().compareTo(endAt.toGregorianCalendar())>0){
                //tempo scaduto
                System.out.println("tempo scaduto");
                System.out.println("Activity name: "+g.getDescription());

            }
            else{
                
                System.out.println("ancora in tempo");
                System.out.println("Activity name: "+g.getDescription());
                finalGoal.add(g);
                
            }

            
        }
        
        
        return finalGoal;
    }
    
	public List<Goal> getGoalAchieved(long idUser){

		Storage storage=getStorage();
		List<Goal> goalAchieved=storage.getGoalAchieved(idUser);
		return goalAchieved;

	}


    
    //ogni volta che entra nella app

    @Override
    public List<Goal> failGoal( long idUser){//OK\\

    	 Storage storage=getStorage();
    	 List<Goal> retrievedGoal=storage.getGoalNotAchieved(idUser);
    	
    	List<Goal> finalGoal=new ArrayList<Goal> ();
        
        for (Goal g:retrievedGoal){
        	System.out.println("flaaaagggg11");
            System.out.println(""+g.getStartAt());
            System.out.println("flaaaagggg222");
            XMLGregorianCalendar endAt=g.getEndAt();
            XMLGregorianCalendar today = null;
            
            
            try{
                System.out.println("flaaaagggg333");
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTimeInMillis(System.currentTimeMillis());
                today = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                System.out.println("flaaaagggg4444");
                
            }
            catch(Exception e){
                
            }
            
            System.out.println("flaaaagggg555");
            //controllo dat adesso e se scaduto il goal
            if(today.toGregorianCalendar().compareTo(endAt.toGregorianCalendar())>0){
                //tempo scaduto
                System.out.println("tempo scaduto");
                System.out.println("Activity name: "+g.getDescription());
                finalGoal.add(g);
                //+++rimuovere dal db?????
                
            }
            else{
                
                System.out.println("ancora in tempo");
                System.out.println("Activity name: "+g.getDescription());
                
                
            }
            
            
        }
        
        
        return finalGoal;
    }
    
    

    @Override
    public Goal followGoal(long idUser, Goal goal){// campi necessari di goal  description, value 

        Storage storage=getStorage();
		//controllo che non sia gia in corsa un goal 
		int flag=0;
        List<Goal> followedGoal=storage.getGoalNotAchieved(idUser);
        for (Goal go:followedGoal){
        	if (go.getDescription().equals(goal.getDescription())){
        		flag=1;
        	}
        	else{
        		flag=0;
        	}




        }

        if(flag==0){
        
			        List<Goal> retrievedGoal=storage.getGoalNotAchieved(123);
			       
			        System.out.println("goalretrieved: "+retrievedGoal.size());
			        
			        for (Goal g:retrievedGoal){
			            
			            if(g.getDescription().equals(goal.getDescription())){
			                //match con il goal gia fatto
			                System.out.println("match found now preparing new db record");
			                
			                XMLGregorianCalendar today = null;
			                
			                XMLGregorianCalendar deadline = null;
			                
			                try{
			                    
			                    GregorianCalendar cal = new GregorianCalendar();
			                    cal.setTimeInMillis(System.currentTimeMillis());
			                  
			                    today = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			                    cal.add(Calendar.MONTH,1);//cal.add(Calendar.DAY_OF_MONTH, 1);//solo +1 giorno
			                    deadline=DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			                    
			                    
			                }
			                catch(Exception e){
			                    
			                }
			                
			                Goal newGoal=new Goal();
			                newGoal.setDescription(g.getDescription());
			                newGoal.setType(g.getType());
			                newGoal.setIsAchieved(0);
			                

			                
			                newGoal.setStartAt(today);
			                newGoal.setEndAt(deadline);
			                newGoal.setEndValue(goal.getEndValue());
			               
			                
			                User user=storage.getUserById(idUser);
			                newGoal.setIdUser(user);
			                System.out.println("save on db");
			                
			                return storage.createGoal(newGoal);
			                
			    
			            }
			            
			            System.out.println("no match");
			            
			        }
        
        
        			return null;

        }
        else{
        	return null;
        }
    }

    
    
    
    ///////////////////////////////////ACTIVITY//////////////////////////////////////////
    
    //inserire nel DB query
    @Override
    public List<Activity> getMyDoneActivity(long idUser ){
       
        Storage storage=getStorage();
        List<Activity> activity=storage.getActivityByIdUser(idUser);
        

        return activity;
    }
    
    
    @Override
    public Activity addMyActivity( Activity activity, long idUser ){
       
        Storage storage=getStorage();
        List<Activity> activityRetrieved=storage.getActivityByIdUser(123L);

        //per il calcolo delle calorie 
        for(Activity a:activityRetrieved){

        	if(a.getType().equals(activity.getType())){

        		activity.setCalories(activity.getDuration()*a.getCalories());
        		return storage.createActivity(activity);

        	}

        }
        
        return null;
    }

    //getRelatedActivity 
    @Override
    public Activity getRelatedActivityToHealthType( String healthMeasureType, long idUser ){
       
        Storage storage=getStorage();
        
        return null;
    }
    
    
    
    
    
    
    ///////////////////////////////////////////QUOTE///////////////////////////////////////////////
    
    @Override
    public String getQuote() { //ok
        
        
        Storage storage=getStorage();
        String quote=storage.getQuote();

        
        return quote;
        
    
    }
    
    
    
    
    
    /////////////handle///////////////////////////////////////
  
    public static Storage getStorage(){
       
        StorageService service= new StorageService();
        Storage storage=service.getStorageImplPort();
        return storage;
    }
   
    
}
