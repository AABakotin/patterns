package builder;

public abstract class IndusrtialBuilder {

    IndustrialUnit industrialUnit;

    void createIndustrial() {
        industrialUnit = new IndustrialUnit();

    }

    abstract void buildName();
    abstract void buildTemperature();
    abstract void buildPressure();
    abstract void buildVoltage();
    abstract void buildSupplierName();
    abstract void buildOperatingStatus();

    public IndustrialUnit getIndustrialUnit() {
        return industrialUnit;
    }
}
