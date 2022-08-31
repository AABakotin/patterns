package builder;

public class Director {

    IndusrtialBuilder builder;

    public void setBuilder(IndusrtialBuilder builder) {
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
        IndustrialUnit industrialUnit = builder.getIndustrialUnit();
        return industrialUnit;
    }

}
