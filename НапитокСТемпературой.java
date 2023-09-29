public class НапитокСТемпературой extends ГорячийНапиток {
    private int temperature;
    
    public НапитокСТемпературой(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void result() {
        System.out.println("Выдан " + getName() + " объемом " + getVolume() + " мл. Температура: " + temperature + "°C");
    }
}
