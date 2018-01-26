package utilitarios.android;

import java.lang.reflect.Field;
import android.database.Cursor;

public class PreencheObjetoUsandoCursor {

	public static Object devolveObjetoPreenchido(Class<?> classe, Cursor cursor) {

		Object objeto = null;

		try {
			objeto = classe.getConstructor().newInstance();

			for (Field atributo : classe.getDeclaredFields()) {

				atributo.setAccessible(true);

				if (!atributo.getName().contains("COLUMN")) {

					if (atributo.getType() == int.class) {

						atributo.setInt(objeto, cursor.getInt(cursor.getColumnIndex(atributo.getName())));
					} 
					else if (atributo.getType() == double.class) {

						atributo.setDouble(objeto, cursor.getDouble(cursor.getColumnIndex(atributo.getName())));
					} 				
					else {
						atributo.set(objeto, cursor.getString(cursor.getColumnIndex(atributo.getName())));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objeto;
	}
	
}
