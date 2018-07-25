package service;

import dao.AutoWiringDAO;

public class AutoWiringService {

	private AutoWiringDAO autoWiringDAO;

	public AutoWiringDAO getAutoWiringDAO() {
		return autoWiringDAO;
	}

	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word){
		this.autoWiringDAO.say(word);
	}
}
