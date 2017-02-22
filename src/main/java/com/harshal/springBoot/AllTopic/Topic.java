package com.harshal.springBoot.AllTopic;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getTopic")
	public List<TopicEntity>geTopicEntities(){
		return topicService.getAllTopic();

	}
	
	@RequestMapping("/getTopic/{id}")
	public TopicEntity getTopic(@PathVariable String id){
		return topicService.getTopicID(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/getTopic")
	public void addTopic(@RequestBody TopicEntity topicEntity){
		topicService.addTopic(topicEntity);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/getTopic/{id}")
	public void updateTopic(@RequestBody TopicEntity topicEntity, @PathVariable String id){
		topicService.updateTopic(id,topicEntity);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/getTopic/{id}")
	public void deleteTopic(@RequestBody TopicEntity topicEntity, @PathVariable String id){
		topicService.deleteTopic(id,topicEntity);
	}

}
