package dal.cloud.tourism.Analytics.controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dal.cloud.tourism.Analytics.repository.JourneyAnalyticsRepository;

@RestController
@RequestMapping("journeyStats")
public class JourneyAnalyticsController {

	@Autowired
	JourneyAnalyticsRepository journeyAnalyticsRepository;

	@RequestMapping("/crowdForAllJourneys")
	public List<Object> getCrowdStatsForAllJourneys() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = journeyAnalyticsRepository.getCrowdStatsForAllJourneys();
		return list;
	}
	
	@RequestMapping("/crowdByJourneyId")
	public List<Object> getCrowdStatsByJourneyId(@RequestParam("journeyId") int journeyId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = journeyAnalyticsRepository.getJourneyCrowdStatsbyJourneyId(journeyId);
		return list;
	}
	
	@RequestMapping("/crowdByDate")
	public List<Object> getCrowdStatsByDate(@RequestParam("date") String date) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = journeyAnalyticsRepository.getJourneyCrowdStatsbyDate(date);
		return list;
	}
}
