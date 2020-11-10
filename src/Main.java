public class Main {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String root = "https://www.google.com";
        crawler.discoverWeb(root);
    }
}
