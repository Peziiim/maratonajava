package maratonajavadevdojo.colecoes.domain;

import static sun.security.util.KnownOIDs.SerialNumber;

public class Celular {
private String serialNumber;
private String branch;

    public Celular(String serialNumber, String branch) {
        this.serialNumber = serialNumber;
        this.branch = branch;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        if(this == obj){return true;}
        if(this.getClass() != obj.getClass()){return false;}
        Celular celular = (Celular) obj;
        return serialNumber != null && serialNumber.equals(celular.serialNumber);
    }

    @Override
    public int hashCode() {
       return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
