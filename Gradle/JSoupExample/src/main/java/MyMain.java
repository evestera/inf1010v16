import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MyMain {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("http://www.vg.no").get();

        System.out.println("====== " + doc.title() + " ======");

        Elements titles = doc.select(".article-content");

        for (Element e : titles) {
            System.out.println(e.text());
        }
    }
}
