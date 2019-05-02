package com.revature.models;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Model class for storing client data.
 */
@Entity
@Table(name = "client")
public class Client {

    /** The client id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int clientId;

    /** The client name. */
    @Column(name = "client_name")
    private String clientName;

    /**
     * Instantiates a new client.
     */
    public Client() {
    }

    /**
     * Instantiates a new client.
     *
     * @param clientId the client id
     * @param clientName the client name
     */
    public Client(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    /**
     * Gets the client id.
     *
     * @return the client id
     */
    public int getClientId() {
        return this.clientId;
    }

    /**
     * Sets the client id.
     *
     * @param clientId the new client id
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets the client name.
     *
     * @return the client name
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * Sets the client name.
     *
     * @param clientName the new client name
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Client id.
     *
     * @param clientId the client id
     * @return the client
     */
    public Client clientId(int clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client name.
     *
     * @param clientName the client name
     * @return the client
     */
    public Client clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
	 * Checks equivalence of two objects.
	 * 
	 * @param obj The object to test equivalence against
	 */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(clientName, client.clientName);
    }

    /**
	 * Generates object hash code.
	 */
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName);
    }

    /**
	 * Prints object in string format.
	 */
    @Override
    public String toString() {
        return "{" +
            " clientId='" + getClientId() + "'" +
            ", clientName='" + getClientName() + "'" +
            "}";
    }
}