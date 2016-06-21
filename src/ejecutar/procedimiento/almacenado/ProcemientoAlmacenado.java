package ejecutar.procedimiento.almacenado;

public class ProcemientoAlmacenado {

/**
 * 
	
create or replace PROCEDURE getDBUSERCursor(
	   p_username IN VARCHAR2,
	   c_dbuser OUT SYS_REFCURSOR)
IS
BEGIN

  OPEN c_dbuser FOR
  SELECT p_username username, 'string' tipo, sysdate fecha  FROM dual UNION 
  SELECT p_username || 2 username, 'string2' tipo, sysdate fecha  FROM dual UNION 
  SELECT p_username || 3 username, 'string3' tipo, sysdate fecha  FROM dual  ;
  
  --SELECT 'fasd ' username, 'string' tipo, sysdate fecha  FROM dual;

END;


*/
	
	
}
