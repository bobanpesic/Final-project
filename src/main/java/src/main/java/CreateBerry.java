package src.main.java;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class CreateBerry {

	private static String link = "https://pokeapi.co/api/v2/berry/";
	
	public static int totalNumber() {
		int totalNumber = 1;
		try {
			URL request = new URL(link);
			String response = IOUtils.toString(request.openStream(), "UTF-8");
			JSONObject json = new JSONObject(response);
			totalNumber = json.getInt("count");
			return totalNumber;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalNumber;
	}

	public static String berryName(int id) {
		String name = "";
		try {
			URL request = new URL(link + id + "/");
			String response = IOUtils.toString(request.openStream(), "UTF-8");
			JSONObject json = new JSONObject(response);
			name = json.get("name").toString();
			return name;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	public static int berrySize(int id) {
		int size = 1;
		try {
			URL request = new URL(link + id + "/");
			String response = IOUtils.toString(request.openStream(), "UTF-8");
			JSONObject json = new JSONObject(response);
			size = Integer.valueOf(json.get("size").toString());
			return size;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return size;
	}

	public static int growthTime(int id) {
		int time = 1;
		try {
			URL request = new URL(link + id + "/");
			String response = IOUtils.toString(request.openStream(), "UTF-8");
			JSONObject json = new JSONObject(response);
			time = Integer.valueOf(json.get("growth_time").toString());
			return time;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}
	
	
}
