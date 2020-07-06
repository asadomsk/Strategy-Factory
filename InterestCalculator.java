
public class InterestCalculator {

	private final InterestCalculationStrategyFactory f = new InterestCalculationStrategyFactory();

	public double calculateInterest(AccountTypes accountType, double accountBalance) {

		InterestCalculationStrategy is = f.getInterestCalculationStrategy(accountType);

            return is.calculateInterest(accountBalance);
	}
}
