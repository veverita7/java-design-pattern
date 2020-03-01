package facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/** HTML 파일을 작성하는 클래스 */
public class HtmlWriter {
  private Writer writer;

  /** Writer를 받아 생성한다. */
  public HtmlWriter(Writer writer) {
    this.writer = writer;
  }

  /** 제목을 출력한다. */
  public void title(String title) throws IOException {
    writer.write("<html>");
    writer.write("<head>");
    writer.write("<title>" + title + "</title>");
    writer.write("</head>");
    writer.write("<body>\n");
    writer.write("<h1>" + title + "</h1>\n");
  }

  /** 단락을 출력한다. */
  public void paragraph(String msg) throws IOException {
    writer.write("<p>" + msg + "</p>\n");
  }

  /** 링크를 출력한다. */
  public void link(String href, String caption) throws IOException {
    paragraph("<a href=\"" + href + "\">" + caption + "</a>");
  }

  /** 메일주소를 출력한다. */
  public void mailto(String mailaddr, String username) throws IOException {
    link("mailto:" + mailaddr, username);
  }

  /** 문서 작성을 종료한다. */
  public void close() throws IOException {
    writer.write("</body>");
    writer.write("</html>");
    writer.close();
  }
}
