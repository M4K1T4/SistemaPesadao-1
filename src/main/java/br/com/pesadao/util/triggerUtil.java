package br.com.pesadao.util;

import br.com.pesadao.dao.TriggerDao;

public class triggerUtil {
	
	public static void main(String[] args) {
		TriggerDao triggerDao = new TriggerDao();
		
		triggerDao.todasAsTriggersNecessarias();
	}

}
