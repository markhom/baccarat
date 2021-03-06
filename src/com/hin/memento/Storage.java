package com.hin.memento;

/**
 * Storage类是存储备忘录的类，持有Memento类的实例，负责保存好备忘录
 * @author Administrator
 *
 */
public class Storage {  
    
    private Memento memento;  
      
    public Storage(Memento memento) {  
        this.memento = memento;  
    }  
  
    public Memento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(Memento memento) {  
        this.memento = memento;  
    }  
} 