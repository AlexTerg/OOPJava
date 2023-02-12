package HomeWorks.HomeWork_6;

public class Specifications {
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;

    public Specifications(Integer ram, Integer hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }


    public Integer getRam() {
        return this.ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return this.hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "{" +
            " ram='" + getRam() + "'" +
            ", hdd='" + getHdd() + "'" +
            ", os='" + getOs() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }
}

