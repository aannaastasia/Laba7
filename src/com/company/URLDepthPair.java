package com.company;

//Класс для хранения ссылки и ее глубины
public class URLDepthPair {
    private String url;
    private int depth;
    private int visited;
    public URLDepthPair(String URL, int dep) {
        url = URL;
        depth=dep;
        visited=1;
    }
    //Возвращает объект класса типа URL(полный путь до сайта)
    public String getURL() {
        return url;
    }
    //Возвращает глубину сайта, относительно сайта введёного пользователем.
    public int getDepth() {
        return depth;
    }
    public void incrementVisited() {
        visited++;
    }
    //Возвращает строку состаящую из адреса сайта и его глубины.
    public String toString() {
        return "<URL href=\"" + url + "\" visited=\"" + visited + "\" depth=\"" + depth + "\" \\>";
    }
}