package isde.sde.soap;
import introsde.*;
import introsde.User;


import java.util.List;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBException;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import java.util.Date;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Business {
    
 
    
    ////////////////////////////////BUSINESS METHODsS///////////////////////////////////
    
    ///////////////////////////////////////////USER////////////////////////////////
    
    @WebMethod(operationName = "login")
    @WebResult(name = "user")
    public User login(@WebParam(name = "userName") String userName,
                               @WebParam(name = "password") String password );
    

    
    @WebMethod(operationName = "createUser")
    @WebResult(name = "user")
    public User createUser(@WebParam(name = "userIn") User user);
    
    
    @WebMethod(operationName = "updateUser")
    @WebResult(name = "user")
    public User updateUser(@WebParam(name = "userIn") User user);

    
    
    
    //////////////////////////////////HEALTHMEASURE/////////////////////////////////
    
    
    @WebMethod(operationName = "getRecentHealthMeasureByUser")
    @WebResult(name = "healthMeasures")
    public List<HealthMeasure> getRecentHealthMeasureByUser(@WebParam(name = "idUser") Long idUser );
    
    
    @WebMethod(operationName = "getHistoryOfAllHealthMeasureByUser")
    @WebResult(name = "healthMeasures")
    public List<HealthMeasure> getHistoryOfAllHealthMeasureByUser(@WebParam(name = "idUser") Long idUser );
    

    
    @WebMethod(operationName = "addHealthMeasure")
    public String addHealthMeasure(@WebParam(name = "idUser") Long idUser,@WebParam(name = "healthMeasureIn") HealthMeasure healthMeasure );
    
   /////////////////////////////////////FOOD//////////////////////////////////////////
   
    @WebMethod(operationName="suggestFoodByCaloriesBound")
    @WebResult(name="foods")
    public List<Food> suggestFoodByCaloriesBound(@WebParam(name = "type") String type, @WebParam(name = "calories") double calories);

    
    @WebMethod(operationName="suggestFoodByType")
    @WebResult(name="foods")
    public List<Food> suggestFoodByType(@WebParam(name = "type") String type);
    
   //vedere se aggiungere
    
    
    ///////////////////////////////////GOAL//////////////////////////////////////////

    @WebMethod(operationName="toDoGoal")
    @WebResult(name="goals")
    public List<Goal> toDoGoal(@WebParam(name = "idUser") long idUser);

    @WebMethod(operationName="getGoalAchieved")
    @WebResult(name="goals")
    public List<Goal> getGoalAchieved(@WebParam(name = "idUser") long idUser);
    
    
    
    
    @WebMethod(operationName="failGoal")
    @WebResult(name="goals")
    public List<Goal> failGoal(@WebParam(name = "idUser") long idUser);

    
    
    @WebMethod(operationName="followGoal")
    @WebResult(name="goal")
    public Goal followGoal(@WebParam(name = "idUser") long idUser, @WebParam(name = "goalIn") Goal goal);
    
    

    
    @WebMethod(operationName = "controlGoalHealth")
    @WebResult(name = "goals")
    public List<Goal> controlGoalHealth(@WebParam(name = "healthMeasure") HealthMeasure healthMeasure, @WebParam(name = "idUser") long idUser );
    
    
    @WebMethod(operationName = "controlGoalActivity")
    @WebResult(name = "goals")
    public List<Goal> controlGoalActivity(@WebParam(name = "activity") Activity activity, @WebParam(name = "idUser") long idUser );
    
    
    ///////////////////////////////////ACTIVITY//////////////////////////////////////////
    
 
    
    
    @WebMethod(operationName = "getMyDoneActivity")
    @WebResult(name = "activities")
    public List<Activity> getMyDoneActivity(@WebParam(name = "idUser") long idUser );
    

    
    @WebMethod(operationName = "addMyActivity")
    @WebResult(name = "activity")
    public Activity addMyActivity(@WebParam(name = "activityIn") Activity activity, @WebParam(name = "idUser") long idUser );
    
    @WebMethod(operationName = "getRelatedActivityToHealthType")
    @WebResult(name = "activity")
    public Activity getRelatedActivityToHealthType( @WebParam(name = "healthMeasureType") String healthMeasureTypeWebParam, @WebParam(name = "idUser") long idUser  );
    

    
     
     //////////////////////////////////////QUOTE/////////////////////////////////////
    

    @WebMethod(operationName="getQuote")
    public String getQuote();

   
}
