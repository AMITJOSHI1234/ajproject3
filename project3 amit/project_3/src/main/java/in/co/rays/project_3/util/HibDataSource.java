package in.co.rays.project_3.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate DataSource is provides the object of sessionfactory and session
 * 
 * @author Amit joshi 
 *
 */


public class HibDataSource {
	private static SessionFactory sessionFactory = null;
	
/** 
* give the instance of SessionFactory
* */
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}
	
	/** 
	 * give the instance of Session
	 */
       public static Session getSession() {
    	   Session session = getSessionFactory().openSession();
    	   return session;
       }
       
       /**
   	 * close the Session*/
       public static void closeSession(Session session) {
    	   if(session!=null) {
    		   session.close();
    	   }
       }

}
