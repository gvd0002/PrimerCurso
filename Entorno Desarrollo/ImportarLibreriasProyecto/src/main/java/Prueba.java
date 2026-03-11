import org.json.*;

public class Prueba {
    static void main() {
        JSONObject persona = new JSONObject();

        persona.put("nombre", "Gonzalo");
        persona.put("edad", 21);
        persona.put("activo", true);
        persona.put("salario", 4000.00);

        String json = persona.toString();
        System.out.println(json);

        String jsonPretty = persona.toString(4);
        System.out.println(jsonPretty);

    }

}
