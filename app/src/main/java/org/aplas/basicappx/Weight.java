package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight(){
        this.gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public double getGram() {
        return gram;
    }

    public void setOunce(double ounce){
        this.gram = ounce * 28.3495231;
    }

    public double getOunce(){
        return this.gram * 0.035274;
    }

    public void setPound(double pound){
        this.gram = pound * 453.59237;
    }

    public double getPound(){
        return this.gram * 0.00220462;
    }

    public double convert(String oriUnit, String convUnit, double value){
        if (oriUnit.equals("Grm") && (convUnit.equals("Grm"))){
            return this.getGram();
        }
        if (oriUnit.equals("Grm") && (convUnit.equals("Onc"))){
            return this.getOunce();
        }
        if (oriUnit.equals("Grm") && (convUnit.equals("Pnd"))){
            return this.getPound();
        }
        if (oriUnit.equals("Onc") && (convUnit.equals("Grm"))){
            return this.getGram();
        }
        if (oriUnit.equals("Onc") && (convUnit.equals("Onc"))){
            return this.getOunce();
        }
        if (oriUnit.equals("Onc") && (convUnit.equals("Pnd"))){
            return this.getPound();
        }
        if (oriUnit.equals("Pnd") && (convUnit.equals("Grm"))){
            return this.getGram();
        }
        if (oriUnit.equals("Pnd") && (convUnit.equals("Onc"))){
            return this.getOunce();
        }
        if (oriUnit.equals("Pnd") && (convUnit.equals("Pnd"))){
            return this.getPound();
        }
        return value;
    }
}
