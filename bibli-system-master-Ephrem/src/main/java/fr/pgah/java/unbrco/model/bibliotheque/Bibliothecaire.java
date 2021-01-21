package fr.pgah.java.unbrco.model.bibliotheque;

import fr.pgah.java.unbrco.model.livre.Livre;

public class Bibliothecaire {
  private String nom;
  private int age;
  private Bibliotheque bibliotheque;
  private Livre livreFavori;

  public Bibliothecaire(String nom, int age, Bibliotheque bibli, Livre favori) {
    this.nom = nom;
    this.age = age;
    this.bibliotheque = bibli;
    this.livreFavori = favori;
  }

  public String getNom() {
    return nom;
  }

  public int getAge() {
    return this.age;
  }

  public Bibliotheque getBibliotheque() {
    return this.bibliotheque;
  }

  public Livre getLivreFavori() {
    return this.livreFavori;
  }

  // PREREQUIS : bibli != null
  // MODIFIE : this
  // EFFETS : changement d'affectation du bibliothécaire comme gérant
  // de la bibliothèque bibli.
  // RENVOIE : vrai si une réaffectation a été effectuée
  public boolean changerDeBibliotheque(Bibliotheque bibli) {

    


    return false;
  }
}
