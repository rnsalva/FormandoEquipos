package io;

import java.util.HashMap;

public class Formar {

	String []vec;
	int cantLetras;
	
	public Formar(String[] vec, int cantLetras) {
		this.vec = vec;
		this.cantLetras = cantLetras;
	}

	public String[] resolver (){
	
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		int i = 0;
		
		while(i < this.vec.length){
			for(int j = 1; j <= this.cantLetras; j++){
				if(hMap.containsKey(this.vec[i].substring(0, j)))
					hMap.put(this.vec[i].substring(0, j), hMap.get(this.vec[i].substring(0, j)) + 1);
				else
					hMap.put(this.vec[i].substring(0, j), 1);
				}
			i++;
		}
		
		//hMap.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		
		int afinidad = 0;
		String respEquipo = "";
		for (String key : hMap.keySet()) {
		    int afinity = (int)Math.pow(key.length(),2) * hMap.get(key);
		    if(afinity > afinidad){
		    	afinidad = afinity;
		    	respEquipo = key;
		    }
		}
		System.out.println(Integer.toString(afinidad) + " " + respEquipo);
		return new String[]{Integer.toString(afinidad),respEquipo};
	}
	
}