package main;

import java.sql.SQLException;
import java.util.List;

import dao.Impl.RegionDaoImpl;
import model.Region;
import service.RegionService;
import service.Impl.RegionServiceImpl;
import util.APIUtil.RegionAPI;

public class RegionServiceTest {
	
	public static void main(String[] args) {
		
		RegionService regionService = new RegionServiceImpl();
		try {
			regionService.listRegion().stream().forEach(System.out::println);;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
