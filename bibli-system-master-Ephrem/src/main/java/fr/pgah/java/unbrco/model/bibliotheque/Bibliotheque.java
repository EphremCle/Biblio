package fr.pgah.java.unbrco.model.bibliotheque;

import java.util.List;
import fr.pgah.java.unbrco.model.livre.Livre;

public class Bibliotheque {

  private Bibliothecaire gerant;
  private String nom;
  private List<Bibliotheque> branches;
  private List<Livre> livresReference;
  private List<Livre> livresRomans;
  private List<Livre> livresBiographie;
  private List<Livre> livresManuels;
  private List<Livre> livreCuisine;

  public Bibliotheque(String nom, Bibliothecaire gerant) {
    
    this.nom = nom;
    this.gerant = gerant;
    
  }

  public String getNom() {
    return this.nom;
  }

  public Bibliothecaire getGerant() {
    return this.gerant;
  }

  // PREREQUIS : livre != null
  // MODIFIE : this
  // EFFETS : stocke livre dans la collection appropriée de cet objet
  public void enregistrerLivre(Livre livre) {
  }

  // PREREQUIS : livre != null
  // RENVOIE : vrai si livre est dans le catalogue de cette bibliothèque
  // (qu'il soit actuellement emprunté ou non)
  public boolean estDansCatalogue(Livre livre) {

    if (livre != null) {

      switch (livre.getGenre()) {
        case REFERENCE:
          return chercherLivre(livresReference, livre);

        case ROMAN:
          return chercherLivre(livresRomans, livre);

        case BIBLIOGRAPHIE:
          return chercherLivre(livresBiographie, livre);

        case MANUEL:
          return chercherLivre(livresManuels, livre);

        case CUISINE:
          return chercherLivre(livreCuisine, livre);

        default:
          return false;
      }

    }
    return false;

  }

  private boolean chercherLivre(List<Livre> livres, Livre livre) {

    for (Livre livreL : livres) {

      if (livreL.equals(livre)) {
        return true;
      }

    }

    return false;
  }

  // PREREQUIS: livre != null
  // RENVOIE : vrai si livre est disponible à l'emprunt
  public boolean peutEtreEmprunte(Livre livre) {
    return true;
  }

  // PREREQUIS : livre != null
  // RENVOIE : vrai si livre est dans le catalogue de cette bibliotheque
  // ou dans celui de l'un de ses branches
  public boolean estDansCatalogueEtendu(Livre livre) {
    return false;
  }

  // PREREQUIS : livre != null
  // MODIFIE : this
  // EFFETS : enregistre le fait que livre est maintenant emprunté (si possible)
  // RENVOIE : vrai si l'opération est un succès
  public boolean enregistrerSortie(Livre livre) {
    return false;
  }

  // PREREQUIS : livre != null
  // MODIFIE : this
  // EFFETS : enregistre le fait que livre est revenu (si possible)
  // RENVOIE : vrai si l'opération est un succès
  public boolean enregistrerRetour(Livre livre) {
    if (livre != null) {

      if (livre.estSorti()) {
        return false;
      }

      livre.enregistrerRetour();
      return true;
      

    }
    return false;

  }

  // PREREQUIS : gerant != null
  // MODIFIE : this
  // EFFETS : set le nouveau gérant
  // RENVOIE : vrai si l'opération est un succès
  public boolean engagerGerant(Bibliothecaire bibliothecaire) {

    if (bibliothecaire != null) {
      this.gerant = bibliothecaire;
      return true;
    }
    return false;
  }


  // EFFETS : affiche le catalogue de cette bibliothèque
  // (toutes les informations de chaque livre)
  public void afficherCatalogue() {
  }
}
