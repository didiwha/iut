--set datestyle to european;

-- COMMODITE : idCom,nbplaces,description
insert into COMMODITE values ('C2I ',2,'Cabine sans Sanitaires-2 pers');
insert into COMMODITE values ('C2E ',2,'Cabine sans Sanitaires-2 pers-Hublot');
insert into COMMODITE values ('C4I ',4,'Cabine sans Sanitaires-4 pers');
insert into COMMODITE values ('C4E ',4,'Cabine sans Sanitaires-4 pers-Hublot');
insert into COMMODITE values ('CS2I',2,'Cabine avec Sanitaires-2 pers');
insert into COMMODITE values ('CS2E',2,'Cabine avec Sanitaires-2 pers-Hublot');
insert into COMMODITE values ('CS4I',4,'Cabine avec Sanitaires-4 pers');
insert into COMMODITE values ('CS4E',4,'Cabine avec Sanitaires-4 pers-Hublot');
insert into COMMODITE values ('CONF',1,'Fauteuil confort : salon ou cabine');
insert into COMMODITE values ('C2Lx',2,'Cabine luxe-2 pers-Hublot');

-- CAT_VEHICULE : idCat,libelle,
insert into CAT_VEHICULE values ('V','voiture');
insert into CAT_VEHICULE values ('A','autocar');
insert into CAT_VEHICULE values ('C', 'camping-car');
insert into CAT_VEHICULE values ('F', 'fourgon');
insert into CAT_VEHICULE values ('M', 'moto');
insert into CAT_VEHICULE values ('S', 'side-car et quad');

-- NAVIRE : nomnavire,modele,nbplacesmax,nomcompagnie
insert into NAVIRE values('CORSE','paquebot' ,2282,'SNCM');
insert into NAVIRE values('ALISO','NGV' ,566,'SNCM');
insert into NAVIRE values('PAOLI', 'cargo',550,'SNCM');
insert into NAVIRE values('NAPOLEON','paquebot',2462,'SNCM');
insert into NAVIRE values('SARDINIA','NGV' ,535,'Corsica');

-- ACCEPTE : nomnavire,idCat,nbCat,prixcat
insert into ACCEPTE values('CORSE', 'V', 400,50);
insert into ACCEPTE values('CORSE', 'A', 20,100);
insert into ACCEPTE values('CORSE', 'C', 20,100);
insert into ACCEPTE values('CORSE', 'F', 50,100);
insert into ACCEPTE values('CORSE', 'M', 100,40);
insert into ACCEPTE values('CORSE', 'S', 20,40);

insert into ACCEPTE values('ALISO', 'V', 150,60);

insert into ACCEPTE values('PAOLI', 'V', 100,60);
insert into ACCEPTE values('PAOLI', 'A', 5,100);
insert into ACCEPTE values('PAOLI', 'C', 5,80);
insert into ACCEPTE values('PAOLI', 'F', 5,80);
insert into ACCEPTE values('PAOLI', 'M', 20,70);
insert into ACCEPTE values('PAOLI', 'S', 10,40);

insert into ACCEPTE values('SARDINIA', 'V', 150,60);



-- PROPOSE : nomnavire,idCom,nbcom,prixcom
insert into PROPOSE values('CORSE','CS2I',200,60);
insert into PROPOSE values('CORSE','CS2E',200,80);
insert into PROPOSE values('CORSE','CS4I',100,100);
insert into PROPOSE values('CORSE','CS4E',100,120);
insert into PROPOSE values('CORSE','CONF',600, 50);
insert into PROPOSE values('CORSE','C2Lx',41,200);

insert into PROPOSE values('ALISO','CONF',566, 50);

insert into PROPOSE values('PAOLI','C2E ',100,50);
insert into PROPOSE values('PAOLI','C4E ',50, 70);

insert into PROPOSE values('NAPOLEON','C4I ',50,70);
insert into PROPOSE values('NAPOLEON','C4E ',50,80);
insert into PROPOSE values('NAPOLEON','CS4I',50,90);
insert into PROPOSE values('NAPOLEON','CS4E',50,100);
insert into PROPOSE values('NAPOLEON','CONF',862,30);



-- PORT : nomport,taxe, zone, nbPlacesMax
insert into PORT values ('marseille', 15, 'Continent', 2500);
insert into PORT values ('nice', 10, 'Continent', 2000);
insert into PORT values ('bastia', 10, 'Corse', 1000);
insert into PORT values ('ajaccio', 15, 'Corse', 1000);
insert into PORT values ('bonifaccio', 30, 'Corse', 500);


-- TRAJET : idTrajet, dateHeureDep, dateHeureArr, prixbase,nomportDep,nomportArr,nomnavire
insert into TRAJET values('MAC01','01/07/16 07:00','01/07/16 19:00',50,'marseille','ajaccio','CORSE');
insert into TRAJET values('NBP01','01/07/16 07:00','01/07/16 16:00',50,'nice','bastia','PAOLI');
insert into TRAJET values('MBN01','01/07/16 18:00','02/07/16 08:00',50,'marseille','bonifaccio','NAPOLEON');
insert into TRAJET values('MAS01','01/07/16 18:30','02/07/16 23:30',50,'marseille','ajaccio','SARDINIA');
insert into TRAJET values('AMC02','02/07/16 10:00','02/07/16 23:00',50,'ajaccio','marseille','CORSE');
insert into TRAJET values('BMP01','01/07/16 20:00','02/07/16 06:00',50,'bastia','marseille','PAOLI');
insert into TRAJET values('ABS01','01/07/16 10:00','01/07/16 15:00',50,'ajaccio','marseille','SARDINIA');
    




