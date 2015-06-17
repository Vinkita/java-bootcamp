package service;

public class CartServiceFactory {

	public static ICartService getLocalService() {
		return new CartServiceImp();
	}
	
	public static ICartService getWebService() {
		return new CartServiceProxy(new CartWebServiceClient());
	}
	
}
