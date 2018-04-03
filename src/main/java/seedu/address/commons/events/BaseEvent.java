package seedu.address.commons.events;

/**
 * The base class for all listevent classes.
 */
public abstract class BaseEvent {

    /**
     * All Events should have a clear unambiguous custom toString message so that feedback message creation
     * stays consistent and reusable.
     *
     * For example, the listevent manager post method will call any posted listevent's toString and print it in
     * the console.
     */
    public abstract String toString();

}
