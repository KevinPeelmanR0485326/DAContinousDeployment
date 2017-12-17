
package model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "score",
    "content",
    "author"
})
public class Review {

	@JsonProperty("code")
    private String code = "code";
	
    @JsonProperty("score")
    private Integer score = 10;
    
    @JsonProperty("content")
    private String content = "content";
    
    @JsonProperty("author")
    private String author = "author";
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Review(String code, String score, String content, String author) {
		setCode(code);
		setScore(Integer.parseInt(score));
		setContent(content);
		setAuthor(author);
	}
	@JsonProperty("code")
    public String getCode() {
        return code;
    }
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("score")
    public int getScore() {
        return score;
    }
    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("score", score).append("content", content).append("author", author).toString();
    }
}
