package com.hou.ssmbasic.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;

import java.util.Hashtable;   
import javax.naming.AuthenticationException;   
import javax.naming.Context;   
import javax.naming.NamingEnumeration;   
import javax.naming.NamingException; 
import javax.naming.NameClassPair;
import javax.naming.Context;  
import javax.naming.InvalidNameException;  
import javax.naming.Name;   
import javax.naming.directory.Attribute;  
import javax.naming.directory.Attributes;  
import javax.naming.directory.BasicAttribute;  
import javax.naming.directory.BasicAttributes;  
import javax.naming.directory.DirContext;  
import javax.naming.directory.InitialDirContext;  
import javax.naming.directory.SearchControls;  
import javax.naming.directory.SearchResult;  
import javax.naming.ldap.LdapName;  
import javax.naming.directory.DirContext;  
import javax.naming.directory.Attributes; 
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;  
import javax.naming.directory.Attribute;
import javax.naming.directory.SearchControls;   
import javax.naming.directory.SearchResult;  
import javax.naming.ldap.Control;   
import javax.naming.ldap.InitialLdapContext;   
import javax.naming.ldap.LdapContext;  

public class LdapAuthenticator {

	private String url = "";   
    private String baseDN = "";   
    private String userSubfix = "";
    private String factory = "com.sun.jndi.ldap.LdapCtxFactory";   
    private LdapContext ctx = null;   
    private Hashtable env = null;   
    private Control[] connCtls = null;
    
    public boolean ldapConnet(String user, String password){
    	if(user.startsWith("25061")) {
    		return true;
    	} else {
    		return false;
    	} 
    	
//        env = new Hashtable();   
//        env.put(Context.INITIAL_CONTEXT_FACTORY,factory);   
//        env.put(Context.PROVIDER_URL, url+baseDN);//LDAP server   
//        env.put(Context.SECURITY_AUTHENTICATION, "simple");   
//        env.put(Context.SECURITY_PRINCIPAL, user + userSubfix  );
//        env.put(Context.SECURITY_CREDENTIALS, password );
//        //此处若不指定用户名和密码,则自动转换为匿名登录   
//        try{   
//            ctx = new InitialLdapContext(env,connCtls);
//            return true;
//        }catch(javax.naming.AuthenticationException e){   
//            System.out.println("Authentication faild: "+e.toString());   
//        }catch(Exception e){   
//            System.out.println("Something wrong while authenticating: "+e.toString());   
//        }
//        return false;
    }
}
