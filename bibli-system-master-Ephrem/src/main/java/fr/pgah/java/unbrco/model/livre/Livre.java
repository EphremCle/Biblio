package fr.pgah.java.unbrco.model.livre;

import fr.pgah.java.unbrco.model.bibliotheque.Bibliotheque;

public class Livre {

  private String titre;
  private String auteur;
  private GenreLivre genre;
  private int annee;
  private int edition;
  private Bibliotheque bibliothequeMere;
  private boolean estSorti;

  public Livre(String titre, String auteur, GenreLivre genre, int annee, int ed) {
    this.titre = titre;
    this.auteur = auteur;
    this.genre = genre;
    this.annee = annee;
    this.edition = ed;
  }

  public String getTitre() {
    return this.titre;
  }

  public String getAuteur() {
    return this.auteur;
  }

  public GenreLivre getGenre() {
    return this.genre;
  }

  public int getAnnee() {
    return this.annee;
  }

  public int getEdition() {
    return this.edition;
  }

  public Bibliotheque getBibliothequeMere() {
    return this.bibliothequeMere;
  }

  public void setBibliothequeMere(Bibliotheque home) {

    this.bibliothequeMere = bibliothequeMere;
    
  }

  // MODIFIE : this
  // EFFETS : enregistre le fait que le livre est revenu
  public void enregistrerRetour() {
    if (estSorti == true) {
      estSorti = false;
    }
  }

  // RENVOIE : vrai si le livre est sorti
  public boolean estSorti() {
    if (estSorti == true) {
      return true;
    } else {
    return false;
    }
    
  }

  // MODIFIE : this
  // EFFETS : enregistre le fait que le livre est sorti
  public void enregistrerSortie() {
  }
}
