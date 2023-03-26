package com.java.exercices.core;

public class Voiture {
    private String marque;
    private String modele;
    private String couleur;
    private double prixLocationJournalier;
    private boolean automatique;
    private double consommationCarburant;

    public Voiture(String marque, String modele, String couleur, double prixLocationJournalier, boolean automatique, double consommationCarburant) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.prixLocationJournalier = prixLocationJournalier;
        this.automatique = automatique;
        this.consommationCarburant = consommationCarburant;
    }

    @Override
    public String toString() {
        return "{" +
            " marque='" + getMarque() + "'" +
            ", modele='" + getModele() + "'" +
            ", couleur='" + getCouleur() + "'" +
            ", prixLocationJournalier='" + getPrixLocationJournalier() + "'" +
            ", automatique='" + isAutomatique() + "'" +
            ", consommationCarburant='" + getConsommationCarburant() + "'" +
            "}";
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrixLocationJournalier() {
        return this.prixLocationJournalier;
    }

    public void setPrixLocationJournalier(double prixLocationJournalier) {
        this.prixLocationJournalier = prixLocationJournalier;
    }

    public boolean isAutomatique() {
        return this.automatique;
    }

    public boolean getAutomatique() {
        return this.automatique;
    }

    public void setAutomatique(boolean automatique) {
        this.automatique = automatique;
    }

    public double getConsommationCarburant() {
        return this.consommationCarburant;
    }

    public void setConsommationCarburant(double consommationCarburant) {
        this.consommationCarburant = consommationCarburant;
    }

}
