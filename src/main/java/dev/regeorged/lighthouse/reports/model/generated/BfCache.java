package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class BfCache{

	@JsonProperty("score")
	private Integer score;

	@JsonProperty("description")
	private String description;

	@JsonProperty("guidanceLevel")
	private Integer guidanceLevel;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("scoreDisplayMode")
	private String scoreDisplayMode;

	public void setScore(Integer score){
		this.score = score;
	}

	public Integer getScore(){
		return score;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setGuidanceLevel(Integer guidanceLevel){
		this.guidanceLevel = guidanceLevel;
	}

	public Integer getGuidanceLevel(){
		return guidanceLevel;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setScoreDisplayMode(String scoreDisplayMode){
		this.scoreDisplayMode = scoreDisplayMode;
	}

	public String getScoreDisplayMode(){
		return scoreDisplayMode;
	}

	@Override
 	public String toString(){
		return 
			"BfCache{" + 
			"score = '" + score + '\'' + 
			",description = '" + description + '\'' + 
			",guidanceLevel = '" + guidanceLevel + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",scoreDisplayMode = '" + scoreDisplayMode + '\'' + 
			"}";
		}
}