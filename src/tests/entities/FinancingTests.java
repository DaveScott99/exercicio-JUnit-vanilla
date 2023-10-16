package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void constructorShouldCreateFinancingWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.createFinance(100000.0, 2000.0, 80);
		
		// assert
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	
	};
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FinancingFactory.createFinance(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmoutShouldUpdateValueWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.createFinance(90000.0, 2000.0, 80);
		
		// action
		financing.setTotalAmount(80000.0);
		
		// assert
		Assertions.assertEquals(80000.0, financing.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			// arrange
			Financing financing = FinancingFactory.createFinance(90000.0, 2000.0, 80);
			
			// action
			financing.setTotalAmount(200000.0);
		});
	
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.createFinance(90000.0, 2000.0, 80);
		
		// action
		financing.setIncome(2500.0);
		
		// assert
		Assertions.assertEquals(2500.0, financing.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidData() {
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing financing = FinancingFactory.createFinance(90000.0, 2000.0, 80);
			
			// action
			financing.setIncome(1000.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateMonthsWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.createFinance(90000.0, 2000.0, 80);
		
		// action
		financing.setMonths(90);
		
		// assert
		Assertions.assertEquals(90, financing.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidData() {
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			// arrange
			Financing financing = FinancingFactory.createFinance(90000.0, 2000.0, 80);
			
			// action
			financing.setMonths(50);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		// arrange
		double expectedValue = 16000.0;
		Financing financing = FinancingFactory.createFinance(80000.0, 2000.0, 80);
		
		// assert
		Assertions.assertEquals(expectedValue, financing.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		// arrange
		double expectedValue = 800.0;
		Financing financing = FinancingFactory.createFinance(80000.0, 2000.0, 80);

		// assert
		Assertions.assertEquals(expectedValue, financing.quota());

	}
}
