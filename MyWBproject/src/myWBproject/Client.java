 package myWBproject; 
public class Client {
    private String nomEntreprise;
    private String numeroIFU;
    private String numeroRCCM;
    private String adresseEntreprise;
    private String codeAPE;

    // Constructor
    public Client(String nomEntreprise, String numeroIFU, String numeroRCCM, String adresseEntreprise, String codeAPE) {
        this.nomEntreprise = nomEntreprise;
        this.numeroIFU = numeroIFU;
        this.numeroRCCM = numeroRCCM;
        this.adresseEntreprise = adresseEntreprise;
        this.codeAPE = codeAPE;
    }

    // Getters and setters
    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNumeroIFU() {
        return numeroIFU;
    }

    public void setNumeroIFU(String numeroIFU) {
        this.numeroIFU = numeroIFU;
    }

    public String getNumeroRCCM() {
        return numeroRCCM;
    }

    public void setNumeroRCCM(String numeroRCCM) {
        this.numeroRCCM = numeroRCCM;
    }

    public String getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(String adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    public String getCodeAPE() {
        return codeAPE;
    }

    public void setCodeAPE(String codeAPE) {
        this.codeAPE = codeAPE;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Client{" +
                "nomEntreprise='" + nomEntreprise + '\'' +
                ", numeroIFU='" + numeroIFU + '\'' +
                ", numeroRCCM='" + numeroRCCM + '\'' +
                ", adresseEntreprise='" + adresseEntreprise + '\'' +
                ", codeAPE='" + codeAPE + '\'' +
                '}';
    }
}
