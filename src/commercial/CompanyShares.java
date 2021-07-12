package commercial;

public class CompanyShares 
{
	String stockSymbol;
	int numOfCompanyShares;
	double sharePrice;
	public String getStockSymbol() 
	{
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) 
	{
		this.stockSymbol = stockSymbol;
	}
	public int getNumOfCompanyShares() 
	{
		return numOfCompanyShares;
	}
	public void setNumOfCompanyShares(int numOfCompanyShares) 
	{
		this.numOfCompanyShares = numOfCompanyShares;
	}
	public double getSharePrice() 
	{
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) 
	{
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() 
	{
		return "CompanyShares [stockSymbol=" + stockSymbol + ", numOfCompanyShares=" + numOfCompanyShares
				+ ", sharePrice=" + sharePrice + "]";
	}
	
	
}

