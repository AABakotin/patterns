package builder;

public class Director {

    IndustrialBuilder builder;

    public void setBuilder(IndustrialBuilder builder) {
        this.builder = builder;
    }
    IndustrialUnit buildIndustrialUnit(){
        builder.createIndustrial();
        builder.buildName();
        builder.buildPressure();
        builder.buildTemperature();
        builder.buildVoltage();
        builder.buildSupplierName();
        builder.buildOperatingStatus();
        return builder.getIndustrialUnit();
    }

}
