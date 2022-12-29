public class SmartWatchBuilder {
    SmartWatch mSmartWatch;
    public SmartWatchBuilder(String marca) {
        mSmartWatch = new SmartWatch();
        mSmartWatch.setMarca(marca);
    }
    public SmartWatchBuilder setModelo(String modelo){
        mSmartWatch.setModelo(modelo);
        return this;
    }
    public SmartWatchBuilder setSistema(String sistema) {
        mSmartWatch.setSistema(sistema);
        return this;
    }
    public SmartWatchBuilder setPantalla(Double pantalla) {
        mSmartWatch.setPantalla(pantalla);
        return this;
    }
    public SmartWatchBuilder setPeso(Double peso) {
        mSmartWatch.setPeso(peso);
        return this;
    }
    public SmartWatchBuilder setColor(String color) {
        mSmartWatch.setColor(color);
        return this;
    }
    public SmartWatchBuilder setCorrea(String correa) {
        mSmartWatch.setCorrea(correa);
        return this;
    }
    public SmartWatchBuilder setConectividad(String conectividad) {
        mSmartWatch.setConectividad(conectividad);
        return this;
    }

    public SmartWatch build() {
        return mSmartWatch;
    }
}
