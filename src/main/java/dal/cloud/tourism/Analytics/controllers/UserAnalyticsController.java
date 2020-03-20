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
import dal.cloud.tourism.Analytics.repository.UserAnalyticsRepository;

@RestController
@RequestMapping("userStats")
public class UserAnalyticsController {

	@Autowired
	UserAnalyticsRepository userAnalyticsRepository;

	@RequestMapping("/bookingCount")
	public List<Object> getBookingCount(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getBookingCount(userId);
		return list;
	}
	
	@RequestMapping("/bookingByMonth")
	public List<Object> getBookingsCountByMonth(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getBookingCountByMonth(userId);
		return list;
	}
	
	@RequestMapping("/bookingByYear")
	public List<Object> getBookingsCountByYear(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getBookingCountByYear(userId);
		return list;
	}
	
	@RequestMapping("/destinationsCount")
	public List<Object> getDestinationsCount(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getDestinationsCount(userId);
		return list;
	}
	
	@RequestMapping("/destinationsByMonth")
	public List<Object> getDestinationsCountByMonth(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getDestinationsCountByMonth(userId);
		return list;
	}
	
	@RequestMapping("/destinationsByYear")
	public List<Object> getDestinationsCountByYear(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getDestinationsCountByYear(userId);
		return list;
	}
	
	@RequestMapping("/moneySpent")
	public List<Object> getMoneySpent(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getMoneySpent(userId);
		return list;
	}
	
	@RequestMapping("/moneySpentByMonth")
	public List<Object> getMoneySpentByMonth(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getMoneySpentByMonth(userId);
		return list;
	}
	
	@RequestMapping("/moneySpentByYear")
	public List<Object> getMoneySpentByYear(@RequestParam("userId") String userId) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		List<Object> list = new ArrayList<Object>();
		list = userAnalyticsRepository.getMoneySpentByYear(userId);
		return list;
	}
}
