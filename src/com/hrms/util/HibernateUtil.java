/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrms.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Masrat
 */
@SuppressWarnings("deprecation")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public HibernateUtil() {
    }
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
        	System.out.println("---------home----------------");    
            sessionFactory = new Configuration().configure().buildSessionFactory();
          
    
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    
    public static final ThreadLocal session = new ThreadLocal();

    public static Session currentSession() throws HibernateException {
      Session s = (Session) session.get();
      // Open a new Session, if this thread has none yet
      if (s == null) {
        s = sessionFactory.openSession();
        // Store it in the ThreadLocal variable
        session.set(s);
      }
      return s;
    }

    public static void closeSession() throws HibernateException {
      Session s = (Session) session.get();
      if (s != null)
        s.close();
      session.set(null);
    }
  }


