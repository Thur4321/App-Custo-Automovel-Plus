package custoautomovelplus;

public class AutoPlus extends InfoAuto {

    private boolean gps, bluetooth, sensorEstacionamento, cadeirinhaBebe;

    public AutoPlus(boolean gps, boolean bluetooth, boolean sensorEstacionamento, boolean cadeirinhaBebe, String marca, String modelo, String cor, String combustível, float custo, int ano) {
        super(marca, modelo, cor, combustível, custo, ano);
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.sensorEstacionamento = sensorEstacionamento;
        this.cadeirinhaBebe = cadeirinhaBebe;
    }

    public AutoPlus(boolean gps, boolean bluetooth, boolean sensorEstacionamento, boolean cadeirinhaBebe, String marca, String modelo, String cor, String combustível, float custo) {
        super(marca, modelo, cor, combustível, custo);
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.sensorEstacionamento = sensorEstacionamento;
        this.cadeirinhaBebe = cadeirinhaBebe;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isSensorEstacionamento() {
        return sensorEstacionamento;
    }

    public void setSensorEstacionamento(boolean sensorEstacionamento) {
        this.sensorEstacionamento = sensorEstacionamento;
    }

    public boolean isCadeirinhaBebe() {
        return cadeirinhaBebe;
    }

    public void setCadeirinhaBebe(boolean cadeirinhaBebe) {
        this.cadeirinhaBebe = cadeirinhaBebe;
    }

    public String gps() {
        String GPS = "";
        if (gps) {
            GPS = "Sim";
        } else {
            GPS = "Não";
        }
        return GPS;
    }

    public String bluetooth() {
        String Bluetooth = "";
        if (bluetooth) {
            Bluetooth = "Sim";
        } else {
            Bluetooth = "Não";
        }
        return Bluetooth;
    }

    public String sensor() {
        String Sensor = "";
        if (sensorEstacionamento) {
            Sensor = "Sim";
        } else {
            Sensor = "Não";
        }
        return Sensor;
    }

    public String cadeirinha() {
        String Cadeirinha = "";
        if (cadeirinhaBebe) {
            Cadeirinha = "Sim";
        } else {
            Cadeirinha = "Não";
        }
        return Cadeirinha;
    }
    
    @Override
    public double qtoCusta() {
        double parcial = super.qtoCusta();
        if (gps) {
            parcial += 780;
        }
        if (bluetooth) {
            parcial += 450;
        }
        if (sensorEstacionamento) {
            parcial += 1180;
        }
        if (cadeirinhaBebe) {
            parcial += 380;
        }
        return parcial;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\nGPS: " + gps()
                + "\nBluetooth: " + bluetooth()
                + "\nSensor de estacionamento: " + sensor()
                + "\nCadeirinha de bebê: " + cadeirinha();
    }

}
