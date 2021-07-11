package test;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvCheck implements ExecutionCondition  {

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext arg0) {
		// TODO Auto-generated method stub
		
		
		// String env = "dev";
		String env = "qa";
		
		if ("dev".equalsIgnoreCase(env)) {
			return ConditionEvaluationResult
					.disabled("Test disabled on dev enviroment");
		}
		
		return ConditionEvaluationResult.enabled("Test enabled on QA environment");
		
	

	}
	
	

}
