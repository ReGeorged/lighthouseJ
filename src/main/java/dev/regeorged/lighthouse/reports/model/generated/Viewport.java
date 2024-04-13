package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Viewport{

	@JsonProperty("score")
	private Integer score;

	@JsonProperty("warnings")
	private List<Object> warnings;

	@JsonProperty("description")
	private String description;

	@JsonProperty("details")
	private Details details;

	@JsonProperty("guidanceLevel")
	private Integer guidanceLevel;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("scoreDisplayMode")
	private String scoreDisplayMode;

	@JsonProperty("metricSavings")
	private MetricSavings metricSavings;

	public void setScore(Integer score){
		this.score = score;
	}

	public Integer getScore(){
		return score;
	}

	public void setWarnings(List<Object> warnings){
		this.warnings = warnings;
	}

	public List<Object> getWarnings(){
		return warnings;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDetails(Details details){
		this.details = details;
	}

	public Details getDetails(){
		return details;
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

	public void setMetricSavings(MetricSavings metricSavings){
		this.metricSavings = metricSavings;
	}

	public MetricSavings getMetricSavings(){
		return metricSavings;
	}

	@Override
 	public String toString(){
		return 
			"Viewport{" + 
			"score = '" + score + '\'' + 
			",warnings = '" + warnings + '\'' + 
			",description = '" + description + '\'' + 
			",details = '" + details + '\'' + 
			",guidanceLevel = '" + guidanceLevel + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",scoreDisplayMode = '" + scoreDisplayMode + '\'' + 
			",metricSavings = '" + metricSavings + '\'' + 
			"}";
		}
}