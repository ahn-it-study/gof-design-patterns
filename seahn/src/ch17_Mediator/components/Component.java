package ch17_Mediator.components;

import ch17_Mediator.mediator.Mediator;

/**
 * Common component interface
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
