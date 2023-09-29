public class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    private НапитокСТемпературой[] drinks;
    
    public ГорячихНапитковАвтомат(НапитокСТемпературой... drinks) {
        this.drinks = drinks;
    }
    
    public void getProduct(int name, int volume, int temperature) {

        for(НапитокСТемпературой item: drinks) {
            if (item.getName().hashCode() == name && item.getVolume() == volume && item.getTemperature() == temperature) {
                item.result();
                return;
            }
        }

        System.out.println("Запрошенный напиток недоступен!");
    }
}
