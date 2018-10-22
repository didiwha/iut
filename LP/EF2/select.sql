--Question 1
--Liste des navires de la compagnie SNCM possédant plus de 1000 places.*/
/*
Select nomNavire
from Navire
where nbPlacesMax>1000;

--Question 2
--Dates et heures de départ des ferrys du modèle NGV au départ de Marseille.
Select dateHeureDep
from Navire natural join trajet
where modele="NGV" and nomPortDep="marseille";

--Question 3
--Nombre de véhicules acceptés sur chaque navire (quelle que soit la catégorie).
Select nomNavire,sum(nbCat)
from Accepte
group by nomNavire;*/

--Question 4
--Ports des zones Corse ou Continent au départ desquels plus de 2 trajets sont proposés.
Select distinct nomPort
from Port P join Trajet T on nomPort=nomPortDep
where (zone="Corse" or zone="Continent") 
and nomPort in( Select nomPortDep 
	from Trajet
	group by nomPortDep
	having count(nomPortDep)>2);

--Question 5	
--Trajets de Nice à Bastia sur des navires qui proposent à la fois des commodités de type C2E et C4E. 


