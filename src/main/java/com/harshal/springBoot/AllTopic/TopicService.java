package com.harshal.springBoot.AllTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {


	private List<TopicEntity> AllTopic= new ArrayList<>(
			Arrays.asList(
					new TopicEntity("spring","boot","description"),
					new TopicEntity("linux", "OS", "awsome"),
					new TopicEntity("python","language","description")
					));

	public List<TopicEntity> getAllTopic(){
		return AllTopic;

	}

	public TopicEntity getTopicID(String id){
		return AllTopic.stream().filter(t -> t.getName().equals(id)).findFirst().get();

	} 

	public void addTopic(TopicEntity topicEntity) {
		// TODO Auto-generated method stub
		AllTopic.add(topicEntity);

	}

	public void deleteTopic(String id ,TopicEntity topicEntity) {
		// TODO Auto-generated method stub
		AllTopic.removeIf(t -> t.getName().equals(id));

	}

	public void updateTopic(String id,TopicEntity topicEntity) {
		// TODO Auto-generated method stub
		for(int i=0; i < AllTopic.size(); i++){
			TopicEntity t = AllTopic.get(i);
			if(t.getName().equals(id)){
				AllTopic.set(i, topicEntity);
				return;
			}
		}
		
	}
}
