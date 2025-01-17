package misc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import control.Brain;

public class ServoTest {
	
	public static void main(String[] args) throws Exception{
		String subscript = Brain.getRoot() + "/WEB-INF/scripts/"+ EnvUtils.getEnvName()+ "/servo.sh";
		ProcessMaster p = new ProcessMaster(subscript);
				JsonObject json = new JsonObject();
				json.addProperty("angle", 270);
				json.addProperty("servonum", 0);
				JsonElement elem = p.sendobject(json);
				Thread.sleep(5000);
				json.addProperty("angle", 0);
				System.out.println(elem);
				p.sendobject(json);
				Thread.sleep(5000);

	}

}
