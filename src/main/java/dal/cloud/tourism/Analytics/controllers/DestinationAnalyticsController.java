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

import dal.cloud.tourism.Analytics.repository.DestinationAnalyticsRepository;
import dal.cloud.tourism.Analytics.repository.JourneyAnalyticsRepository;

@RestController
@RequestMapping("destinationStats")
public class DestinationAnalyticsController {

	@Autowired
	DestinationAnalyticsRepository destinationAnalyticsRepository;

	@RequestMapping("/journeysForAllDestinations")
	public List<Object> getJourneysForAllDestinations() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getJourneyStatsForAllDestinations();
		return list;
	}
	
	@RequestMapping("/journeysForAllDestinationsByMonth")
	public List<Object> getJourneysForAllDestinationsByMonth() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getJourneyStatsForAllDestinationsByMonth();
		return list;
	}
	
	@RequestMapping("/journeysForAllDestinationsByYear")
	public List<Object> getJourneysForAllDestinationsByYear() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getJourneyStatsForAllDestinationsByYear();
		return list;
	}
	
	@RequestMapping("/crowdForAllDestinations")
	public List<Object> getCrowdStatsForAllDestinations() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getCrowdStatsForAllDestinations();
		return list;
	}
	
	@RequestMapping("/crowdForAllDestinationsByMonth")
	public List<Object> getCrowdStatsForAllDestinationsByMonth() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getCrowdStatsForAllDestinationsByMonth();
		return list;
	}
	
	@RequestMapping("/crowdForAllDestinationsByYear")
	public List<Object> getCrowdStatsForAllDestinationsByYear() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getCrowdStatsForAllDestinationsByYear();
		return list;
	}
	
	@RequestMapping("/journeysByDestinationId")
	public List<Object> getJourneysByDestinationId(@RequestParam("destinationId") int destinationId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getJourneysbyDestinationId(destinationId);
		return list;
	}
	
	@RequestMapping("/crowdByDestinationId")
	public List<Object> getCrowdStatsByDestinationId(@RequestParam("destinationId") int destinationId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = destinationAnalyticsRepository.getCrowdStatsbyDestinationId(destinationId);
		return list;
	}
}
