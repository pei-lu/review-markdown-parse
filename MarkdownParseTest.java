import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testfiles() throws IOException {
        ArrayList<String> testfile1 = new ArrayList<>();
        testfile1.add("https://something.com");
        testfile1.add("some-page.html");
        String testfilemd = MarkdownParse.converter("test-file.md");
        assertEquals(testfile1, MarkdownParse.getLinks(testfilemd));
    }

    // @Test
    // public void testCharacterAfter() throws IOException {
    //     ArrayList<String> CharacterAfter = new ArrayList<>();
    //     CharacterAfter.add("google.com");
    //     String CharacterAfterTest = MarkdownParse.converter("CharacterAfter.md");
    //     assertEquals(CharacterAfter, MarkdownParse.getLinks(CharacterAfterTest));
    // }

    // @Test
    // public void testInBetween() throws IOException {
    //     ArrayList<String> InBetween = new ArrayList<>();
    //     InBetween.add("hi.com");
    //     InBetween.add("hi.com");
    //     String InBetweenTest = MarkdownParse.converter("InBetween.md");
    //     assertEquals(InBetween, MarkdownParse.getLinks(InBetweenTest));
    // }

    // @Test
    // public void testImage() throws IOException {
    //     ArrayList<String> Image = new ArrayList<>();
    //     Image.add("link.com");
    //     Image.add("thiswebsite.com");
    //     String ImageTest = MarkdownParse.converter("Image.md");
    //     assertEquals(Image, MarkdownParse.getLinks(ImageTest));
    // }

    // @Test
    // public void testImageDistinction() throws IOException {
    //     ArrayList<String> Image = new ArrayList<>();
    //     Image.add("a-link.html");
    //     String ImageTest = MarkdownParse.converter("image-distinction.md");
    //     assertEquals(Image, MarkdownParse.getLinks(ImageTest));
    // }

    @Test
    public void testSnippet1() throws IOException {
        ArrayList<String> SnippetExpected = new ArrayList<>();
        SnippetExpected.add("`google.com");
        SnippetExpected.add("google.com");
        SnippetExpected.add("ucsd.edu");
        String SnippetActual = MarkdownParse.converter("Snippet1.md");
        assertEquals(SnippetExpected, MarkdownParse.getLinks(SnippetActual));
    }

    @Test
    public void testSnippet2() throws IOException {
        ArrayList<String> SnippetExpected = new ArrayList<>();
        SnippetExpected.add("b.com");
        SnippetExpected.add("a.com(())");
        SnippetExpected.add("example.com");
        String SnippetActual = MarkdownParse.converter("Snippet1.md");
        assertEquals(SnippetExpected, MarkdownParse.getLinks(SnippetActual));
    }

    @Test 
    void testSnippet3() throws IOException {
        ArrayList<String> SnippetExpected = new ArrayList<>();
        SnippetExpected.add("https://ucsd-cse15l-w22.github.io/");
        String SnippetActual = MarkdownParse.converter("Snippet1.md");
        assertEquals(SnippetExpected, MarkdownParse.getLinks(SnippetActual));
    }

    // @Test
    // public void testInfiniteLoop() throws IOException {
    //     ArrayList<String> Infin
    // }
}
