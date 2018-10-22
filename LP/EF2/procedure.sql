--Une fonction nbTrajetSem qui renvoie le nombre de trajets qui partent d’un port donné durant une semaine à partir d’une date donnée.

create or replace function nbTrajetSem
(in port Trajet.nomPortDep%TYPE,in varDate Trajet.dateHeureDep%TYPE) returns numeric (3)
as $$ declare nb numeric(3);
begin
	select count(*)
		into nb
	from Trajet
	where varDate + interval'1 week';
	return nb;
end;
$$ language 'plpgsql';

--Une procédure ObligationSP qui affiche un message d’erreur si les obligations de service public ne sont pas respectées durant la semaine qui suit une date donnée. Pour simplifier, on supposera que les obligations sont les suivantes : 3 départs de Marseille et 2 départs de Nice par semaine