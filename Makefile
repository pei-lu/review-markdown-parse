MarkdownParse.class : MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class : MarkdownParse.class MarkdownParseTest.java
	javac MarkdownParseTest.java

test: MarkdownParseTest.class