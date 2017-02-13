package project.kage.example.map;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapMain {

	public static void main(String[] args) {
		MapMain main = new MapMain();
		main.execute();
	}

	private void execute() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();

		map.put("注文ID", null);
		map.put("会社コード", null);
		map.put("顧客コード", null);
		map.put("注文日", null);
		map.put("コメント", null);
		map.put("注文金額", null);

		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(json);
	}

}
