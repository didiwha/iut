--Pour chaque trajet arrivant ou repartant d’un port, le nombre de places sur le navire concerné ne doit pas être supérieur au nombre de passagers que les infrastructures du port peuvent supporter

create or replace function f_capacite returns trigger
as $$
declare nb Navire.nbPlacesMax%TYPE,nbPlaceD Port.nbMAXPass%TYPE,nbPlaceA Port.nbMAXPass%TYPE;  
begin
	select nbPlacesMax
	into nb
	from Navire
	where nomNavire=new.nomNavire;
	
	select nbMaxPass
	into nbPlaceD
	from Port
	where nomPort=new.nomPortDep;
	
	select nbMaxPass
	into nbPlaceA
	from Port
	where nomPort=new.nomPortArr;
	
	if(nb>nbPlaceD or nb>nbPlaceA)
	then
		raise exception 'Le navire ne peut pas être accueilli pas ce port';
	end if;
	return NULL;
end;
$$ language 'plpgsql';

create trigger t_capacite
before update or insert on Trajet
for each statement
execute procedure f_capacite;