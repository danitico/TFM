import ca.pfv.spmf.algorithms.sequential_rules.cmrules.AlgoCMRules;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;

public class CMRules {
    public static void main(String[] args) throws Exception{
        AlgoCMRules algorithm = new AlgoCMRules();

        algorithm.runAlgorithm("/home/daniel/Desktop/TFM/src/data/data.spmf", "/home/daniel/Desktop/TFM/src/data/example", 0.2, 0.8);

        algorithm.printStats();
    }

    private static String fileToPath(String filename) throws UnsupportedEncodingException {
        URL url = CMRules.class.getResource(filename);
        return java.net.URLDecoder.decode(url.getPath(), Charset.defaultCharset());
    }
}
