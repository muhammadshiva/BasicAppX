package org.aplas.basicappx;

public class Distance {

    private double meter;

    public Distance(){
        this.meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double getMeter() {
        return meter;
    }

    public void setInch(double inch) {
        this.meter = inch / 39.3701;
    }

    public double getInch() {
        return this.meter * 39.3701;
    }

    public void setMile(double mile) {
        this.meter = mile / 0.000621371;
    }

    public double getMile() {
        return this.meter * 0.000621371;
    }

    public void setFoot(double foot) {
        this.meter = foot / 3.28084;
    }

    public double getFoot() {
        return this.meter * 3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value){
        if (oriUnit.equals("Mtr") && (convUnit.equals("Mtr"))){
            return this.getMeter();
        }
        if (oriUnit.equals("Mtr") && (convUnit.equals("Inc"))){
            return this.getInch();
        }
        if (oriUnit.equals("Mtr") && (convUnit.equals("Mil"))){
            return this.getMile();
        }
        if (oriUnit.equals("Mtr") && (convUnit.equals("Ft"))){
            return this.getFoot();
        }
        if (oriUnit.equals("Inc") && (convUnit.equals("Mtr"))){
            return this.getMeter();
        }
        if (oriUnit.equals("Inc") && (convUnit.equals("Inc"))){
            return this.getInch();
        }
        if (oriUnit.equals("Inc") && (convUnit.equals("Mil"))){
            return this.getMile();
        }
        if (oriUnit.equals("Inc") && (convUnit.equals("Ft"))){
            return this.getFoot();
        }
        if (oriUnit.equals("Mil") && (convUnit.equals("Mtr"))){
            return this.getMeter();
        }
        if (oriUnit.equals("Mil") && (convUnit.equals("Inc"))){
            return this.getInch();
        }
        if (oriUnit.equals("Mil") && (convUnit.equals("Mil"))){
            return this.getMile();
        }
        if (oriUnit.equals("Mil") && (convUnit.equals("Ft"))){
            return this.getFoot();
        }
        if (oriUnit.equals("Ft") && (convUnit.equals("Mtr"))){
            return this.getMeter();
        }
        if (oriUnit.equals("Ft") && (convUnit.equals("Inc"))){
            return this.getInch();
        }
        if (oriUnit.equals("Ft") && (convUnit.equals("Mil"))){
            return this.getMile();
        }
        if (oriUnit.equals("Ft") && (convUnit.equals("Ft"))){
            return this.getFoot();
        }
        return value;
    }
}
