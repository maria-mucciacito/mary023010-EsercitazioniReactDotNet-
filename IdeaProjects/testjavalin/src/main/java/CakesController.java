import io.javalin.http.Context;

public class CakesController {
    public static String[] cakes = {"cioccolato","carote"};
    public CakesController(){}


    public static void getAllCakes( Context context) {
        //context.result(Arrays.toString(cakes));
        context.json(cakes);

    }
}
