# Sales Analysis MapReduce

## 📊 Analyse de données de ventes avec Hadoop MapReduce

Projet Java MapReduce pour l'analyse de données de ventes retail. 
Calcul des quantités totales vendues par produit à partir de fichiers de transactions.

## 📈 Exemple de traitement

### Données d'entrée :
| Date       | Heure | Magasin | Produit | Quantité |
|------------|-------|---------|---------|----------|
| 28/11/2024 | 14:30 | MG      | Lait    | 2        |
| 28/11/2024 | 15:00 | MG      | Lait    | 2        |
| 28/11/2024 | 15:10 | MG      | Pain    | 1        |
| 28/11/2024 | 15:30 | MG      | Lait    | 2        |
| 28/11/2024 | 16:00 | MG      | Pain    | 1        |

### Résultats de sortie :
| Produit | Quantité Totale |
|---------|-----------------|
| Lait    | 6               |
| Pain    | 2               |
## 🚀 Fonctionnalités

- Traitement de fichiers de transactions de ventes
- Calcul des quantités vendues par produit
- Architecture MapReduce scalable
- Prêt pour le déploiement sur cluster Hadoop

## 🛠️ Technologies

- **Java 8**
- **Hadoop 3.3.6**
- **MapReduce**
- **Maven**
- **HDFS**
