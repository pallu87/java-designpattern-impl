package com.java.app;

import java.util.regex.Pattern;

import com.java.app.abstract_factory.AbstractFactoryPattern;
import com.java.app.adapter.AdapterPattern;
import com.java.app.bridge.BridgePattern;
import com.java.app.builder.BuilderPattern;
import com.java.app.chain_of_responsibility.ChainOfResponsibilityPattern;
import com.java.app.command.CommandPattern;
import com.java.app.composite.CompositePattern;
import com.java.app.decorator.DecoratorPattern;
import com.java.app.facade.FacadePattern;
import com.java.app.factory.FactoryPattern;
import com.java.app.flyweight.FlyweightPattern;
import com.java.app.iterator.IteratorPattern;
import com.java.app.mediator.MediatorPattern;
import com.java.app.memento.MementoPattern;
import com.java.app.observer.ObserverPattern;
import com.java.app.prototype.PrototypePattern;
import com.java.app.proxy.ProxyPattern;
import com.java.app.singleton.SingletonPattern;
import com.java.app.state.StatePattern;
import com.java.app.strategy.StrategyPattern;
import com.java.app.template.TemplatePattern;
import com.java.app.visitor.VisitorPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Java Design Pattern Implementations" );
        System.out.println( "===================================" );

        // Design Pattern to execute.
        // DESIGNPATTERN pattern = DESIGNPATTERN.DECORATOR;

        // DesignPattern pattern = new DecoratorPattern();
        // DesignPattern pattern = new FactoryPattern();
        // DesignPattern pattern = new StrategyPattern();
        // DesignPattern pattern = new BuilderPattern();
        // DesignPattern pattern = new PrototypePattern();
        // DesignPattern pattern = new AbstractFactoryPattern();
        // DesignPattern pattern = new SingletonPattern();
        // DesignPattern pattern = new ChainOfResponsibilityPattern();
        // DesignPattern pattern = new CommandPattern();
        // DesignPattern pattern = new MementoPattern();
        // DesignPattern pattern = new ObserverPattern();
        // DesignPattern pattern = new VisitorPattern();
        // DesignPattern pattern = new CompositePattern();
        // DesignPattern pattern = new MediatorPattern();
        // DesignPattern pattern = new StatePattern();
        // DesignPattern pattern = new FlyweightPattern();
        // DesignPattern pattern = new ProxyPattern();
        // DesignPattern pattern = new BridgePattern();
        // DesignPattern pattern = new TemplatePattern();
        // DesignPattern pattern = new AdapterPattern();
        // DesignPattern pattern = new FacadePattern();
        DesignPattern pattern = new IteratorPattern();


        pattern.run();

    }
}
