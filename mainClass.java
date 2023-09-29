public class mainClass {
    public static void main(String[] args) {
        НапитокСТемпературой tea = new НапитокСТемпературой("Чай", 200, 80);
        НапитокСТемпературой coffee = new НапитокСТемпературой("Кофе", 150, 90);
        НапитокСТемпературой hotChocolate = new НапитокСТемпературой("Горячий шоколад", 250, 70);
        
        ГорячихНапитковАвтомат vendAutomat = new ГорячихНапитковАвтомат(tea, coffee, hotChocolate);
        
        vendAutomat.getProduct("Чай".hashCode(), 200, 80);
        vendAutomat.getProduct("Кофе".hashCode(), 150, 90);
        vendAutomat.getProduct("Горячий шоколад".hashCode(), 250, 70);
        vendAutomat.getProduct("Какао".hashCode(), 250, 70);
    }
}
