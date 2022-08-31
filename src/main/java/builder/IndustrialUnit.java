package builder;

public class IndustrialUnit {

private String Name;
private float Temperature;
private double Pressure;
private int Voltage;
private String SupplierName;
private OpratingStatus opratingStatus;

    public void setName(String name) {
        Name = name;
    }

    public void setTemperature(float temperature) {
        Temperature = temperature;
    }

    public void setPressure(double pressure) {
        Pressure = pressure;
    }

    public void setVoltage(int voltage) {
        Voltage = voltage;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
    }

    public void setOpratingStatus(OpratingStatus opratingStatus) {
        this.opratingStatus = opratingStatus;
    }

    @Override
    public String toString() {
        return "IndustrialUnit{" +
                "Name='" + Name + '\'' +
                ", Temperature=" + Temperature +
                ", Pressure=" + Pressure +
                ", Voltage=" + Voltage +
                ", SupplierName='" + SupplierName + '\'' +
                ", opratingStatus=" + opratingStatus +
                '}';
    }
}
