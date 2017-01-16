/**
 * Created by nedwaldie on 1/11/17.
 */
public class RandomName {


    public String randomAdjective(String[] adjective) {
        int randAdjective = (int )(Math.random() * adjective.length);
        return adjective[randAdjective];
    }

    public String randomNoun(String[] noun) {
        int randNoun = (int )(Math.random() * noun.length);
        return noun[randNoun];
    }


}
