package commercial;

import java.util.Scanner;

public class StockMain 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		StockAccount stockAccount = new StockAccount();
		
		System.out.println("Enter the number of company shares to be added :");
		int noOfCompanyShares = scanner.nextInt();
		
		for (int index = 0; index < noOfCompanyShares; index++) 
		{
			CompanyShares companyShares = new CompanyShares();
			System.out.println("Enter the stock Symbol");
			companyShares.setStockSymbol(scanner.next());
			System.out.println("Enter the number of shares");
			companyShares.setNumOfCompanyShares(scanner.nextInt());
			stockAccount.addCompanyShares(companyShares);
			System.out.println("Enter the share price :");
			companyShares.setSharePrice(scanner.nextDouble());
			stockAccount.addCompanyShares(companyShares);
		}
		
		System.out.println("Enter the company Symbol to buy:");
		String companySymbol = scanner.next();
		System.out.println("Enter the number of shares to buy for that company :");
		int noOfShares = scanner.nextInt();
		stockAccount.buy(noOfShares, companySymbol);
		
		System.out.println("\nEnter the company Symbol to sell:");
		companySymbol = scanner.next();
		System.out.println("Enter the number of sell:");
		noOfShares = scanner.nextInt();
		stockAccount.sell(noOfShares, companySymbol);
		scanner.close();
		stockAccount.printReport();
	}
}
