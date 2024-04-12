public class ContextClass{
	StrategyClass strategyClass;
	public ContextClass(StrategyClass strategyClass){
		this.strategyClass = strategyClass;
	}
	
	public void setStrategy(StrategyClass strategyClass){
		this.strategyClass = strategyClass;
	}
	
	public void encode(String input) {
        strategyClass.encode(input);
    }
}