
package introsde;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetQuote_QNAME = new QName("http://soap.sde.isde/", "getQuote");
    private final static QName _GetMyDoneActivityResponse_QNAME = new QName("http://soap.sde.isde/", "getMyDoneActivityResponse");
    private final static QName _ControlGoalHealthResponse_QNAME = new QName("http://soap.sde.isde/", "controlGoalHealthResponse");
    private final static QName _GetQuoteResponse_QNAME = new QName("http://soap.sde.isde/", "getQuoteResponse");
    private final static QName _Login_QNAME = new QName("http://soap.sde.isde/", "login");
    private final static QName _FollowGoal_QNAME = new QName("http://soap.sde.isde/", "followGoal");
    private final static QName _FailGoalResponse_QNAME = new QName("http://soap.sde.isde/", "failGoalResponse");
    private final static QName _GetGoalAchievedResponse_QNAME = new QName("http://soap.sde.isde/", "getGoalAchievedResponse");
    private final static QName _AddHealthMeasureResponse_QNAME = new QName("http://soap.sde.isde/", "addHealthMeasureResponse");
    private final static QName _AddMyActivityResponse_QNAME = new QName("http://soap.sde.isde/", "addMyActivityResponse");
    private final static QName _GetHistoryOfAllHealthMeasureByUserResponse_QNAME = new QName("http://soap.sde.isde/", "getHistoryOfAllHealthMeasureByUserResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://soap.sde.isde/", "updateUserResponse");
    private final static QName _ToDoGoalResponse_QNAME = new QName("http://soap.sde.isde/", "toDoGoalResponse");
    private final static QName _AddHealthMeasure_QNAME = new QName("http://soap.sde.isde/", "addHealthMeasure");
    private final static QName _GetHistoryOfAllHealthMeasureByUser_QNAME = new QName("http://soap.sde.isde/", "getHistoryOfAllHealthMeasureByUser");
    private final static QName _ControlGoalActivity_QNAME = new QName("http://soap.sde.isde/", "controlGoalActivity");
    private final static QName _AddMyActivity_QNAME = new QName("http://soap.sde.isde/", "addMyActivity");
    private final static QName _SuggestFoodByTypeResponse_QNAME = new QName("http://soap.sde.isde/", "suggestFoodByTypeResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://soap.sde.isde/", "updateUser");
    private final static QName _FollowGoalResponse_QNAME = new QName("http://soap.sde.isde/", "followGoalResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://soap.sde.isde/", "loginResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://soap.sde.isde/", "createUserResponse");
    private final static QName _FailGoal_QNAME = new QName("http://soap.sde.isde/", "failGoal");
    private final static QName _ControlGoalHealth_QNAME = new QName("http://soap.sde.isde/", "controlGoalHealth");
    private final static QName _CreateUser_QNAME = new QName("http://soap.sde.isde/", "createUser");
    private final static QName _ToDoGoal_QNAME = new QName("http://soap.sde.isde/", "toDoGoal");
    private final static QName _ControlGoalActivityResponse_QNAME = new QName("http://soap.sde.isde/", "controlGoalActivityResponse");
    private final static QName _GetRecentHealthMeasureByUserResponse_QNAME = new QName("http://soap.sde.isde/", "getRecentHealthMeasureByUserResponse");
    private final static QName _SuggestFoodByCaloriesBound_QNAME = new QName("http://soap.sde.isde/", "suggestFoodByCaloriesBound");
    private final static QName _GetRelatedActivityToHealthType_QNAME = new QName("http://soap.sde.isde/", "getRelatedActivityToHealthType");
    private final static QName _SuggestFoodByType_QNAME = new QName("http://soap.sde.isde/", "suggestFoodByType");
    private final static QName _GetGoalAchieved_QNAME = new QName("http://soap.sde.isde/", "getGoalAchieved");
    private final static QName _GetRecentHealthMeasureByUser_QNAME = new QName("http://soap.sde.isde/", "getRecentHealthMeasureByUser");
    private final static QName _GetMyDoneActivity_QNAME = new QName("http://soap.sde.isde/", "getMyDoneActivity");
    private final static QName _GetRelatedActivityToHealthTypeResponse_QNAME = new QName("http://soap.sde.isde/", "getRelatedActivityToHealthTypeResponse");
    private final static QName _SuggestFoodByCaloriesBoundResponse_QNAME = new QName("http://soap.sde.isde/", "suggestFoodByCaloriesBoundResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FailGoalResponse }
     * 
     */
    public FailGoalResponse createFailGoalResponse() {
        return new FailGoalResponse();
    }

    /**
     * Create an instance of {@link FollowGoal }
     * 
     */
    public FollowGoal createFollowGoal() {
        return new FollowGoal();
    }

    /**
     * Create an instance of {@link GetGoalAchievedResponse }
     * 
     */
    public GetGoalAchievedResponse createGetGoalAchievedResponse() {
        return new GetGoalAchievedResponse();
    }

    /**
     * Create an instance of {@link AddHealthMeasureResponse }
     * 
     */
    public AddHealthMeasureResponse createAddHealthMeasureResponse() {
        return new AddHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link GetMyDoneActivityResponse }
     * 
     */
    public GetMyDoneActivityResponse createGetMyDoneActivityResponse() {
        return new GetMyDoneActivityResponse();
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ControlGoalHealthResponse }
     * 
     */
    public ControlGoalHealthResponse createControlGoalHealthResponse() {
        return new ControlGoalHealthResponse();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link GetHistoryOfAllHealthMeasureByUser }
     * 
     */
    public GetHistoryOfAllHealthMeasureByUser createGetHistoryOfAllHealthMeasureByUser() {
        return new GetHistoryOfAllHealthMeasureByUser();
    }

    /**
     * Create an instance of {@link AddHealthMeasure }
     * 
     */
    public AddHealthMeasure createAddHealthMeasure() {
        return new AddHealthMeasure();
    }

    /**
     * Create an instance of {@link ControlGoalActivity }
     * 
     */
    public ControlGoalActivity createControlGoalActivity() {
        return new ControlGoalActivity();
    }

    /**
     * Create an instance of {@link AddMyActivityResponse }
     * 
     */
    public AddMyActivityResponse createAddMyActivityResponse() {
        return new AddMyActivityResponse();
    }

    /**
     * Create an instance of {@link GetHistoryOfAllHealthMeasureByUserResponse }
     * 
     */
    public GetHistoryOfAllHealthMeasureByUserResponse createGetHistoryOfAllHealthMeasureByUserResponse() {
        return new GetHistoryOfAllHealthMeasureByUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link ToDoGoalResponse }
     * 
     */
    public ToDoGoalResponse createToDoGoalResponse() {
        return new ToDoGoalResponse();
    }

    /**
     * Create an instance of {@link FollowGoalResponse }
     * 
     */
    public FollowGoalResponse createFollowGoalResponse() {
        return new FollowGoalResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link FailGoal }
     * 
     */
    public FailGoal createFailGoal() {
        return new FailGoal();
    }

    /**
     * Create an instance of {@link ControlGoalHealth }
     * 
     */
    public ControlGoalHealth createControlGoalHealth() {
        return new ControlGoalHealth();
    }

    /**
     * Create an instance of {@link AddMyActivity }
     * 
     */
    public AddMyActivity createAddMyActivity() {
        return new AddMyActivity();
    }

    /**
     * Create an instance of {@link SuggestFoodByTypeResponse }
     * 
     */
    public SuggestFoodByTypeResponse createSuggestFoodByTypeResponse() {
        return new SuggestFoodByTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetGoalAchieved }
     * 
     */
    public GetGoalAchieved createGetGoalAchieved() {
        return new GetGoalAchieved();
    }

    /**
     * Create an instance of {@link GetRecentHealthMeasureByUser }
     * 
     */
    public GetRecentHealthMeasureByUser createGetRecentHealthMeasureByUser() {
        return new GetRecentHealthMeasureByUser();
    }

    /**
     * Create an instance of {@link GetMyDoneActivity }
     * 
     */
    public GetMyDoneActivity createGetMyDoneActivity() {
        return new GetMyDoneActivity();
    }

    /**
     * Create an instance of {@link SuggestFoodByType }
     * 
     */
    public SuggestFoodByType createSuggestFoodByType() {
        return new SuggestFoodByType();
    }

    /**
     * Create an instance of {@link SuggestFoodByCaloriesBoundResponse }
     * 
     */
    public SuggestFoodByCaloriesBoundResponse createSuggestFoodByCaloriesBoundResponse() {
        return new SuggestFoodByCaloriesBoundResponse();
    }

    /**
     * Create an instance of {@link GetRelatedActivityToHealthTypeResponse }
     * 
     */
    public GetRelatedActivityToHealthTypeResponse createGetRelatedActivityToHealthTypeResponse() {
        return new GetRelatedActivityToHealthTypeResponse();
    }

    /**
     * Create an instance of {@link ControlGoalActivityResponse }
     * 
     */
    public ControlGoalActivityResponse createControlGoalActivityResponse() {
        return new ControlGoalActivityResponse();
    }

    /**
     * Create an instance of {@link GetRecentHealthMeasureByUserResponse }
     * 
     */
    public GetRecentHealthMeasureByUserResponse createGetRecentHealthMeasureByUserResponse() {
        return new GetRecentHealthMeasureByUserResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link ToDoGoal }
     * 
     */
    public ToDoGoal createToDoGoal() {
        return new ToDoGoal();
    }

    /**
     * Create an instance of {@link SuggestFoodByCaloriesBound }
     * 
     */
    public SuggestFoodByCaloriesBound createSuggestFoodByCaloriesBound() {
        return new SuggestFoodByCaloriesBound();
    }

    /**
     * Create an instance of {@link GetRelatedActivityToHealthType }
     * 
     */
    public GetRelatedActivityToHealthType createGetRelatedActivityToHealthType() {
        return new GetRelatedActivityToHealthType();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link HealthMeasure }
     * 
     */
    public HealthMeasure createHealthMeasure() {
        return new HealthMeasure();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Food }
     * 
     */
    public Food createFood() {
        return new Food();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getQuote")
    public JAXBElement<GetQuote> createGetQuote(GetQuote value) {
        return new JAXBElement<GetQuote>(_GetQuote_QNAME, GetQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyDoneActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getMyDoneActivityResponse")
    public JAXBElement<GetMyDoneActivityResponse> createGetMyDoneActivityResponse(GetMyDoneActivityResponse value) {
        return new JAXBElement<GetMyDoneActivityResponse>(_GetMyDoneActivityResponse_QNAME, GetMyDoneActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlGoalHealthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "controlGoalHealthResponse")
    public JAXBElement<ControlGoalHealthResponse> createControlGoalHealthResponse(ControlGoalHealthResponse value) {
        return new JAXBElement<ControlGoalHealthResponse>(_ControlGoalHealthResponse_QNAME, ControlGoalHealthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getQuoteResponse")
    public JAXBElement<GetQuoteResponse> createGetQuoteResponse(GetQuoteResponse value) {
        return new JAXBElement<GetQuoteResponse>(_GetQuoteResponse_QNAME, GetQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "followGoal")
    public JAXBElement<FollowGoal> createFollowGoal(FollowGoal value) {
        return new JAXBElement<FollowGoal>(_FollowGoal_QNAME, FollowGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "failGoalResponse")
    public JAXBElement<FailGoalResponse> createFailGoalResponse(FailGoalResponse value) {
        return new JAXBElement<FailGoalResponse>(_FailGoalResponse_QNAME, FailGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalAchievedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getGoalAchievedResponse")
    public JAXBElement<GetGoalAchievedResponse> createGetGoalAchievedResponse(GetGoalAchievedResponse value) {
        return new JAXBElement<GetGoalAchievedResponse>(_GetGoalAchievedResponse_QNAME, GetGoalAchievedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "addHealthMeasureResponse")
    public JAXBElement<AddHealthMeasureResponse> createAddHealthMeasureResponse(AddHealthMeasureResponse value) {
        return new JAXBElement<AddHealthMeasureResponse>(_AddHealthMeasureResponse_QNAME, AddHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMyActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "addMyActivityResponse")
    public JAXBElement<AddMyActivityResponse> createAddMyActivityResponse(AddMyActivityResponse value) {
        return new JAXBElement<AddMyActivityResponse>(_AddMyActivityResponse_QNAME, AddMyActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryOfAllHealthMeasureByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getHistoryOfAllHealthMeasureByUserResponse")
    public JAXBElement<GetHistoryOfAllHealthMeasureByUserResponse> createGetHistoryOfAllHealthMeasureByUserResponse(GetHistoryOfAllHealthMeasureByUserResponse value) {
        return new JAXBElement<GetHistoryOfAllHealthMeasureByUserResponse>(_GetHistoryOfAllHealthMeasureByUserResponse_QNAME, GetHistoryOfAllHealthMeasureByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToDoGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "toDoGoalResponse")
    public JAXBElement<ToDoGoalResponse> createToDoGoalResponse(ToDoGoalResponse value) {
        return new JAXBElement<ToDoGoalResponse>(_ToDoGoalResponse_QNAME, ToDoGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "addHealthMeasure")
    public JAXBElement<AddHealthMeasure> createAddHealthMeasure(AddHealthMeasure value) {
        return new JAXBElement<AddHealthMeasure>(_AddHealthMeasure_QNAME, AddHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryOfAllHealthMeasureByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getHistoryOfAllHealthMeasureByUser")
    public JAXBElement<GetHistoryOfAllHealthMeasureByUser> createGetHistoryOfAllHealthMeasureByUser(GetHistoryOfAllHealthMeasureByUser value) {
        return new JAXBElement<GetHistoryOfAllHealthMeasureByUser>(_GetHistoryOfAllHealthMeasureByUser_QNAME, GetHistoryOfAllHealthMeasureByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlGoalActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "controlGoalActivity")
    public JAXBElement<ControlGoalActivity> createControlGoalActivity(ControlGoalActivity value) {
        return new JAXBElement<ControlGoalActivity>(_ControlGoalActivity_QNAME, ControlGoalActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMyActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "addMyActivity")
    public JAXBElement<AddMyActivity> createAddMyActivity(AddMyActivity value) {
        return new JAXBElement<AddMyActivity>(_AddMyActivity_QNAME, AddMyActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestFoodByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "suggestFoodByTypeResponse")
    public JAXBElement<SuggestFoodByTypeResponse> createSuggestFoodByTypeResponse(SuggestFoodByTypeResponse value) {
        return new JAXBElement<SuggestFoodByTypeResponse>(_SuggestFoodByTypeResponse_QNAME, SuggestFoodByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "followGoalResponse")
    public JAXBElement<FollowGoalResponse> createFollowGoalResponse(FollowGoalResponse value) {
        return new JAXBElement<FollowGoalResponse>(_FollowGoalResponse_QNAME, FollowGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "failGoal")
    public JAXBElement<FailGoal> createFailGoal(FailGoal value) {
        return new JAXBElement<FailGoal>(_FailGoal_QNAME, FailGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlGoalHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "controlGoalHealth")
    public JAXBElement<ControlGoalHealth> createControlGoalHealth(ControlGoalHealth value) {
        return new JAXBElement<ControlGoalHealth>(_ControlGoalHealth_QNAME, ControlGoalHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToDoGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "toDoGoal")
    public JAXBElement<ToDoGoal> createToDoGoal(ToDoGoal value) {
        return new JAXBElement<ToDoGoal>(_ToDoGoal_QNAME, ToDoGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlGoalActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "controlGoalActivityResponse")
    public JAXBElement<ControlGoalActivityResponse> createControlGoalActivityResponse(ControlGoalActivityResponse value) {
        return new JAXBElement<ControlGoalActivityResponse>(_ControlGoalActivityResponse_QNAME, ControlGoalActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecentHealthMeasureByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getRecentHealthMeasureByUserResponse")
    public JAXBElement<GetRecentHealthMeasureByUserResponse> createGetRecentHealthMeasureByUserResponse(GetRecentHealthMeasureByUserResponse value) {
        return new JAXBElement<GetRecentHealthMeasureByUserResponse>(_GetRecentHealthMeasureByUserResponse_QNAME, GetRecentHealthMeasureByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestFoodByCaloriesBound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "suggestFoodByCaloriesBound")
    public JAXBElement<SuggestFoodByCaloriesBound> createSuggestFoodByCaloriesBound(SuggestFoodByCaloriesBound value) {
        return new JAXBElement<SuggestFoodByCaloriesBound>(_SuggestFoodByCaloriesBound_QNAME, SuggestFoodByCaloriesBound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedActivityToHealthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getRelatedActivityToHealthType")
    public JAXBElement<GetRelatedActivityToHealthType> createGetRelatedActivityToHealthType(GetRelatedActivityToHealthType value) {
        return new JAXBElement<GetRelatedActivityToHealthType>(_GetRelatedActivityToHealthType_QNAME, GetRelatedActivityToHealthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestFoodByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "suggestFoodByType")
    public JAXBElement<SuggestFoodByType> createSuggestFoodByType(SuggestFoodByType value) {
        return new JAXBElement<SuggestFoodByType>(_SuggestFoodByType_QNAME, SuggestFoodByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalAchieved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getGoalAchieved")
    public JAXBElement<GetGoalAchieved> createGetGoalAchieved(GetGoalAchieved value) {
        return new JAXBElement<GetGoalAchieved>(_GetGoalAchieved_QNAME, GetGoalAchieved.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecentHealthMeasureByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getRecentHealthMeasureByUser")
    public JAXBElement<GetRecentHealthMeasureByUser> createGetRecentHealthMeasureByUser(GetRecentHealthMeasureByUser value) {
        return new JAXBElement<GetRecentHealthMeasureByUser>(_GetRecentHealthMeasureByUser_QNAME, GetRecentHealthMeasureByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyDoneActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getMyDoneActivity")
    public JAXBElement<GetMyDoneActivity> createGetMyDoneActivity(GetMyDoneActivity value) {
        return new JAXBElement<GetMyDoneActivity>(_GetMyDoneActivity_QNAME, GetMyDoneActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedActivityToHealthTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "getRelatedActivityToHealthTypeResponse")
    public JAXBElement<GetRelatedActivityToHealthTypeResponse> createGetRelatedActivityToHealthTypeResponse(GetRelatedActivityToHealthTypeResponse value) {
        return new JAXBElement<GetRelatedActivityToHealthTypeResponse>(_GetRelatedActivityToHealthTypeResponse_QNAME, GetRelatedActivityToHealthTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestFoodByCaloriesBoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sde.isde/", name = "suggestFoodByCaloriesBoundResponse")
    public JAXBElement<SuggestFoodByCaloriesBoundResponse> createSuggestFoodByCaloriesBoundResponse(SuggestFoodByCaloriesBoundResponse value) {
        return new JAXBElement<SuggestFoodByCaloriesBoundResponse>(_SuggestFoodByCaloriesBoundResponse_QNAME, SuggestFoodByCaloriesBoundResponse.class, null, value);
    }

}
