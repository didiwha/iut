create table NAVIRE(
nomNavire varchar(15),
modele varchar(15) ,
nbPlacesMax numeric (4),
nomCompagnie varchar(15),
primary key(nomNavire));

create table COMMODITE(
idCom char(4),
nbPlaces numeric(1),
description text constraint c_descr check(description in('Cabine sans Sanitaires-2 pers','Cabine sans Sanitaires-2 pers-Hublot','Cabine sans Sanitaires-4 pers','Cabine sans Sanitaires-4 pers-Hublot','Cabine avec Sanitaires-2 pers','Cabine avec Sanitaires-2 pers-Hublot','Cabine avec Sanitaires-4 pers','Cabine avec Sanitaires-4 pers-Hublot','Fauteuil confort : salon ou cabine','Cabine luxe-2 pers-Hublot')),
primary key(idCom));

create table PROPOSE
(nomNavire varchar(15),
idCom char(4),
nbCom numeric(3),
prixCom numeric(3),
primary key(nomNavire,idCom),
foreign key(nomNavire) references NAVIRE(nomNavire),
foreign key(idCom) references COMMODITE(idCom));

create table CAT_VEHICULE(
idCat char(1) constraint c_cat check(idCat in('V','A','C','F','M','S')),
libelle varchar(16) constraint c_lib check(libelle in('voiture','autocar','camping-car','fourgon','moto','side-car et quad')),
primary key(idCat));

create table ACCEPTE(
nomNavire varchar(15),
idCat char(1),
nbCat numeric(3),
prixCat numeric(3),
primary key(nomNavire,idCat),
foreign key(nomNavire) references NAVIRE(nomNavire),
foreign key(idCat) references CAT_VEHICULE(idCat));

create table PORT(
nomPort varchar(15),
taxe numeric(2),
zone varchar(15),
nbMaxPass numeric(4),
primary key(nomPort));

create table TRAJET (
idTrajet char(5),
dateHeureDep timestamp,
dateHeureArr timestamp constraint c_dep check(dateHeureDep<dateHeureArr),
prixBase numeric(3),
nomPortDep varchar(15),
nomPortArr varchar(15) constraint c_parr check(nomPortArr!=nomPortDep),
nomNavire varchar(15),
primary key(idTrajet),
foreign key(nomNavire) references NAVIRE(nomNavire),
foreign key(nomPortDep) references PORT(nomPort),
foreign key(nomPortArr) references PORT(nomPort));