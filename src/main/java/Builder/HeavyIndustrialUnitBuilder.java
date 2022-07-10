package Builder;

public class HeavyIndustrialUnitBuilder extends IndusrtialBuilder {


    @Override
    void buildName() {
        industrialUnit.setName("Heavy Industry");
    }

    @Override
    void buildTemperature() {
        industrialUnit.setTemperature(200.0f);
    }

    @Override
    void buildPressure() {
        industrialUnit.setPressure(1000);
    }

    @Override
    void buildVoltage() {
        industrialUnit.setVoltage(380);
    }

    @Override
    void buildSupplierName() {
        industrialUnit.setSupplierName("Second Supplier");
    }

    @Override
    void buildOperatingStatus() {
        industrialUnit.setOpratingStatus(OpratingStatus.OPERATING);
    }

    @Override
    public IndustrialUnit getIndustrialUnit() {
        return super.getIndustrialUnit();
    }
}
