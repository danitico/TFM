import ca.pfv.spmf.algorithms.sequential_rules.topseqrules_and_tns.AlgoTopSeqRules;
import ca.pfv.spmf.input.sequence_database_array_integers.SequenceDatabase;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

public class Topseq {
    public static void main(String[] args) throws IOException {
        AlgoTopSeqRules algorithm = new AlgoTopSeqRules();

        SequenceDatabase sequenceDatabase = new SequenceDatabase();
        sequenceDatabase.loadFile(fileToPath("data/data.spmf"));
        sequenceDatabase.printDatabaseStats();

        algorithm.runAlgorithm(2, sequenceDatabase, 0.9);
        algorithm.printStats();
    }

    private static String fileToPath(String filename) throws UnsupportedEncodingException {
        URL url = Topseq.class.getResource(filename);
        return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
    }
}
