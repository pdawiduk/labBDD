package edu.iis.mto.bdd.trains.cucumber.steps;

/**
 * Created by pawelek on 06.07.16.
 */
import cucumber.api.PendingException;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.StringBufferConverter;

public class TestEstimatingSteps {

    @Zakładając("^że chcę się dostać z \"([^\"]*)\" do \"([^\"]*)\"$")
    public void givenIWantGetTo(String from, String to) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @I("^następny pociąg odjeżdża o (\\d+):(\\d+) na linii \"([^\"]*)\"$")
    public void andTheNextTrainLeavesOnLine(int timeHr, int timeMin, String line) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Gdy("^zapytam o godzinę przyjazdu$")
    public void whenIAskForArrivingTime() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (\\d+):(\\d+)$")
    public void thenIShouldGetEstimatedArrivingTime(int timeHr, int timeMin) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}