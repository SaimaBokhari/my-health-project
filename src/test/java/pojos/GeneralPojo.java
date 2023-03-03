package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralPojo {
    private String createdBy;
    private String createdDate;
    private String id;
    private String startDate;
    private String endDate;
    private String status;
    private Object anamnesis;
    private Object treatment;
    private Object diagnosis;
    private Object prescription;
    private Object description;
    private Object physician;
    private PatientPojo patient;
    private ArrayList<Object> ctests;

    public GeneralPojo() {
    }

    public GeneralPojo(String createdBy, String createdDate, String id, String endDate, String startDate, String status, Object anamnesis, Object treatment, Object diagnosis, Object prescription, Object description, Object physician, PatientPojo patient, ArrayList<Object> ctests) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
        this.physician = physician;
        this.patient = patient;
        this.ctests = ctests;
    }

    @Override
    public String toString() {
        return "GeneralPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis=" + anamnesis +
                ", treatment=" + treatment +
                ", diagnosis=" + diagnosis +
                ", prescription=" + prescription +
                ", description=" + description +
                ", physician=" + physician +
                ", patient=" + patient +
                ", ctests=" + ctests +
                '}';
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(Object anamnesis) {
        this.anamnesis = anamnesis;
    }

    public Object getTreatment() {
        return treatment;
    }

    public void setTreatment(Object treatment) {
        this.treatment = treatment;
    }

    public Object getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Object diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Object getPrescription() {
        return prescription;
    }

    public void setPrescription(Object prescription) {
        this.prescription = prescription;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getPhysician() {
        return physician;
    }

    public void setPhysician(Object physician) {
        this.physician = physician;
    }

    public PatientPojo getPatient() {
        return patient;
    }

    public void setPatient(PatientPojo patient) {
        this.patient = patient;
    }

    public ArrayList<Object> getCtests() {
        return ctests;
    }

    public void setCtests(ArrayList<Object> ctests) {
        this.ctests = ctests;
    }
}