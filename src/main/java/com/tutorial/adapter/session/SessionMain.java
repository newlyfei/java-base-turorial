package com.tutorial.adapter.session;

import com.tutorial.adapter.session.impl.MapSession;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

public class SessionMain {
    private ServletContext context;

    public ServletContext getContext() {
        return context;
    }

    public void setContext(ServletContext context) {
        this.context = context;
    }

    public void execute(){
        Session session=new MapSession();

        HttpSession httpSession=new HttpSessionAdapter<>(session,this.context);

        //重新交给javax.servlet
        new HttpSessionEvent(httpSession);
    }
}
