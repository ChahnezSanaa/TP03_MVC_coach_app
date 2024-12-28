# Application Android de Calcul d'Indice de Masse Grasse (IMG)

Cette application Android simple permet de calculer l'Indice de Masse Grasse (IMG), aussi appelé taux de graisse corporelle. L'application prend en compte le poids, la taille, l'âge et le genre de l'utilisateur pour effectuer le calcul. Elle offre également des options de persistance des données à travers Serialize et SQLite.

## Fonctionnalités

*   **Interface de Calcul d'IMG :**
    *   **Saisie des données :** Permet à l'utilisateur de saisir son poids (en kg), sa taille (en cm), son âge (en années) et son genre (homme/femme) via des champs de texte et des sélecteurs appropriés.
    *   **Calcul de l'IMG :** Effectue le calcul de l'IMG en utilisant une formule appropriée (défini dans le code).
    *   **Affichage du résultat :** Affiche le résultat de l'IMG à l'utilisateur dans un TextView ou un élément d'interface similaire, avec une interprétation possible (par exemple, "Faible", "Normal", "Elevé").

*   **Persistance des Données :**
    *   **Serialize :** Utilise les Serialize d'Android pour enregistrer les informations de l'utilisateur (données saisies et résultats) de manière simple et rapide afin de les récupérer lors des prochaines utilisations de l'application.
    *   **SQLite :** Utilise une base de données SQLite pour enregistrer et récupérer les informations de l'utilisateur, offrant une option de stockage plus structurée, persistante et évolutive.
         * Les données sont stockés dans une table `user_data` avec les colonnes suivantes : `id` (entier, clé primaire), `weight` (réel), `height` (réel), `age` (entier), `gender` (texte), `img` (réel) et `date_time` (texte).

## Comment utiliser l'application

1.  **Télécharger l'application** :
    Vous pouvez installer l'application directement depuis le Play Store (si publiée) ou en utilisant le fichier APK fourni (pour des tests ou des versions développeur).
2.  **Saisir vos données** :
    Utilisez l'interface pour saisir votre poids, taille, âge et genre dans les champs appropriés.
3.  **Calculer l'IMG** :
    Cliquez sur le bouton prévu à cet effet pour lancer le calcul de l'IMG.
4.  **Consulter le résultat** :
    Le résultat du calcul (votre IMG) s'affichera à l'écran.
5.  **Persistance des données :** les données saisies et calculées sont automatiquement sauvegardées de deux façons pour une utilisation ultérieure :
    *   Via **Serialize** pour une persistence simple.
    *   Via **SQLite** pour une persistence plus structurée et évolutive.


