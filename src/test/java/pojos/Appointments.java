package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Appointments {

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String startDate;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private String description;
    private Physician physician;
    private Patient patient;

    public Appointments(String createdBy, String createdDate, Integer id, String startDate, String endDate, String status, String anamnesis, String treatment, String diagnosis, String prescription, String description, Physician physician, Patient patient) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
        this.physician = physician;
        this.patient = patient;
    }

    public Appointments() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", description='" + description + '\'' +
                ", physician=" + physician +
                ", patient=" + patient +
                '}';
    }
}
