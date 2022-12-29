public class SmartPhoneBuilder {
    SmartPhone mSmartPhone;
    public SmartPhoneBuilder(String marca) {
        mSmartPhone = new SmartPhone();
        mSmartPhone.setMarca(marca);
    }
    public SmartPhoneBuilder setModelo(String modelo){
        mSmartPhone.setModelo(modelo);
        return this;
    }
    public SmartPhoneBuilder setSistema(String sistema) {
        mSmartPhone.setSistema(sistema);
        return this;
    }
    public SmartPhoneBuilder setPantalla(Double pantalla) {
        mSmartPhone.setPantalla(pantalla);
        return this;
    }
    public SmartPhoneBuilder setPeso(Double peso) {
        mSmartPhone.setPeso(peso);
        return this;
    }
    public SmartPhoneBuilder setColor(String color) {
        mSmartPhone.setColor(color);
        return this;
    }
    public SmartPhoneBuilder setCamaraMpx(Double camaraMpx) {
        mSmartPhone.setCamaraMpx(camaraMpx);
        return this;
    }
    public SmartPhoneBuilder setRed(String red) {
        mSmartPhone.setRed(red);
        return this;
    }
    public SmartPhoneBuilder setOperador(String operador) {
        mSmartPhone.setOperador(operador);
        return this;
    }

    public SmartPhone build() {
        return mSmartPhone;
    }
}
