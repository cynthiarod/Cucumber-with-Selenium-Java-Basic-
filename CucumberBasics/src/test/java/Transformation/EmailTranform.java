package Transformation;
import io.cucumber.cucumberexpressions.Transformer;

public class EmailTranform implements Transformer<String> {

    @Override
    public String transform(String userName){
        return userName.concat("@ea.com");
    }
}
