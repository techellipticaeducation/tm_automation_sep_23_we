package objects;

public class TestCase {
	int testCaseId;
	String testCaseName;
	String testCreatedBy;
	String PreReq;
	TestStep[] allTestSteps;
}

class TestStep {
	int seq;
	String testStepDesciption;
	String testStepData;
	String testStepExpected;
	String testStepActual;
}

class TestSuite{
	String suiteName;
	String suiteType;
	TestCase[] allTestCases;

}