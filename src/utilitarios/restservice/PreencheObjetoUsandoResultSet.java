package utilitarios.restservice;

import java.lang.reflect.Field;
import java.sql.ResultSet;

public class PreencheObjetoUsandoResultSet {

	public static Object devolveObjetoPreenchido(Class<?> classe, ResultSet resultSet) {

		Object objeto = null;

		try {
			objeto = classe.getConstructor().newInstance();

			for (Field atributo : classe.getDeclaredFields()) {

				atributo.setAccessible(true);

				if (!atributo.getName().contains("COLUMN")) {

					if (atributo.getType() == int.class) {

						atributo.setInt(objeto, resultSet.getInt(atributo.getName()));
					}
					else if (atributo.getType() == double.class) {

						atributo.setDouble(objeto, resultSet.getDouble(atributo.getName()));
					} 
					else {

						if (null == resultSet.getString(atributo.getName())) {

							atributo.set(objeto, "equals(null)");
						} 
						else {
							atributo.set(objeto, resultSet.getString(atributo.getName()));
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objeto;
	}
}
