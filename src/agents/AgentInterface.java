package agents;

/*
The AgentInterface class defines the agent interface.
An instance of this class envelopes an agent and provides access to it via a well-defined interface.
It is also the primary conduit for communication between agents.
An AgentInterface instance is the only handle an agent gets to the other agents executing on a given host.
 */

public interface AgentInterface {

    void identifyNeighbours();
    void move();
    void reproduce();
    void hunt();
    void die();
}
