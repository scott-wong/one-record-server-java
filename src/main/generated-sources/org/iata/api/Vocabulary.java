
package org.iata.api;

import org.semanticweb.owlapi.model.IRI;


/**
 * This class was generated by OWL2Java 0.16.4
 * 
 */
public class Vocabulary {

    public final static String ONTOLOGY_IRI_onerecord_dot_iata_dot_org_generated = "https://onerecord.iata.org-generated";
    public final static String ONTOLOGY_IRI_ = "https://onerecord.iata.org/";
    public final static String s_c_Thing = "http://www.w3.org/2002/07/owl#Thing";
    public final static IRI c_Thing = IRI.create(s_c_Thing);
    /**
     * Audit trail of a Logistics Object
     * 
     */
    public final static String s_c_AuditTrail = "https://onerecord.iata.org/AuditTrail";
    public final static IRI c_AuditTrail = IRI.create(s_c_AuditTrail);
    public final static String s_c_Branch = "https://onerecord.iata.org/Branch";
    public final static IRI c_Branch = IRI.create(s_c_Branch);
    /**
     * Change Request for the audit trail
     * 
     */
    public final static String s_c_ChangeRequest = "https://onerecord.iata.org/ChangeRequest";
    public final static IRI c_ChangeRequest = IRI.create(s_c_ChangeRequest);
    public final static String s_c_Company = "https://onerecord.iata.org/Company";
    public final static IRI c_Company = IRI.create(s_c_Company);
    /**
     * Company information in the Internet of Logistics
     * 
     */
    public final static String s_c_CompanyInformation = "https://onerecord.iata.org/CompanyInformation";
    public final static IRI c_CompanyInformation = IRI.create(s_c_CompanyInformation);
    /**
     * Delegation Request to 3rd parties
     * 
     */
    public final static String s_c_DelegationRequest = "https://onerecord.iata.org/DelegationRequest";
    public final static IRI c_DelegationRequest = IRI.create(s_c_DelegationRequest);
    /**
     * Error details
     * 
     */
    public final static String s_c_Details = "https://onerecord.iata.org/Details";
    public final static IRI c_Details = IRI.create(s_c_Details);
    /**
     * Error model
     * 
     */
    public final static String s_c_Error = "https://onerecord.iata.org/Error";
    public final static IRI c_Error = IRI.create(s_c_Error);
    /**
     * Reference to a Logistics Object
     * 
     */
    public final static String s_c_LogisticsObjectRef = "https://onerecord.iata.org/LogisticsObjectRef";
    public final static IRI c_LogisticsObjectRef = IRI.create(s_c_LogisticsObjectRef);
    /**
     * Version of a Logistics Object
     * 
     */
    public final static String s_c_Memento = "https://onerecord.iata.org/Memento";
    public final static IRI c_Memento = IRI.create(s_c_Memento);
    /**
     * Memento entry from the time map
     * 
     */
    public final static String s_c_MementoEntry = "https://onerecord.iata.org/MementoEntry";
    public final static IRI c_MementoEntry = IRI.create(s_c_MementoEntry);
    /**
     * Memento list model
     * 
     */
    public final static String s_c_MementoList = "https://onerecord.iata.org/MementoList";
    public final static IRI c_MementoList = IRI.create(s_c_MementoList);
    /**
     * Memento list model
     * 
     */
    public final static String s_c_Mementos = "https://onerecord.iata.org/Mementos";
    public final static IRI c_Mementos = IRI.create(s_c_Mementos);
    /**
     * Notification sent by the publisher to the subscriber
     * 
     */
    public final static String s_c_Notification = "https://onerecord.iata.org/Notification";
    public final static IRI c_Notification = IRI.create(s_c_Notification);
    /**
     * Operation Request contained in the PATCH body
     * 
     */
    public final static String s_c_Operation = "https://onerecord.iata.org/Operation";
    public final static IRI c_Operation = IRI.create(s_c_Operation);
    /**
     * Object to modify in the PATCH request
     * 
     */
    public final static String s_c_OperationObject = "https://onerecord.iata.org/OperationObject";
    public final static IRI c_OperationObject = IRI.create(s_c_OperationObject);
    /**
     * PATCH Request body containing updates on a Logistics Object
     * 
     */
    public final static String s_c_PatchRequest = "https://onerecord.iata.org/PatchRequest";
    public final static IRI c_PatchRequest = IRI.create(s_c_PatchRequest);
    /**
     * Subscription information sent to the publisher
     * 
     */
    public final static String s_c_Subscription = "https://onerecord.iata.org/Subscription";
    public final static IRI c_Subscription = IRI.create(s_c_Subscription);
    /**
     * Timemap of a Logistics Object containing mementos and timegate URI
     * 
     */
    public final static String s_c_Timemap = "https://onerecord.iata.org/Timemap";
    public final static IRI c_Timemap = IRI.create(s_c_Timemap);
    /**
     * List of change requests that were sent as PATCH on for a Logitstics Object
     * 
     */
    public final static String s_p_changeRequest = "https://onerecord.iata.org/AuditTrail#changeRequest";
    public final static IRI p_changeRequest = IRI.create(s_p_changeRequest);
    /**
     * Non mandatory error details
     * 
     */
    public final static String s_p_error = "https://onerecord.iata.org/AuditTrail#error";
    public final static IRI p_error = IRI.create(s_p_error);
    /**
     * Initial content of the Logistics Object at the creation moment, represented via a Memento
     * 
     */
    public final static String s_p_loInitialSnapshot = "https://onerecord.iata.org/AuditTrail#loInitialSnapshot";
    public final static IRI p_loInitialSnapshot = IRI.create(s_p_loInitialSnapshot);
    /**
     * Logistics Object Reference for which the audit trail applies
     * 
     */
    public final static String s_p_logisticsObjectRef = "https://onerecord.iata.org/AuditTrail#logisticsObjectRef";
    public final static IRI p_logisticsObjectRef = IRI.create(s_p_logisticsObjectRef);
    /**
     * PATCH body of a change request sent for a specific Logistics Object
     * 
     */
    public final static String s_p_patchRequest = "https://onerecord.iata.org/ChangeRequest#patchRequest";
    public final static IRI p_patchRequest = IRI.create(s_p_patchRequest);
    /**
     * The party that has requested the change request
     * 
     */
    public final static String s_p_requestingParty = "https://onerecord.iata.org/ChangeRequest#requestingParty";
    public final static IRI p_requestingParty = IRI.create(s_p_requestingParty);
    /**
     * Company details
     * 
     */
    public final static String s_p_company = "https://onerecord.iata.org/CompanyInformation#company";
    public final static IRI p_company = IRI.create(s_p_company);
    /**
     * Non mandatory error details
     * 
     */
    public final static String s_p_error_A = "https://onerecord.iata.org/CompanyInformation#error";
    public final static IRI p_error_A = IRI.create(s_p_error_A);
    /**
     * Identifier of the logistics object to which the access is requested
     * 
     */
    public final static String s_p_targetLogisticsObject = "https://onerecord.iata.org/DelegationRequest#targetLogisticsObject";
    public final static IRI p_targetLogisticsObject = IRI.create(s_p_targetLogisticsObject);
    /**
     * Error details
     * 
     */
    public final static String s_p_details = "https://onerecord.iata.org/Error#details";
    public final static IRI p_details = IRI.create(s_p_details);
    /**
     * Link to the memento
     * 
     */
    public final static String s_p_memento = "https://onerecord.iata.org/MementoEntry#memento";
    public final static IRI p_memento = IRI.create(s_p_memento);
    /**
     * List of mementos of a Logistics Object
     * 
     */
    public final static String s_p_mementoEntry = "https://onerecord.iata.org/MementoList#mementoEntry";
    public final static IRI p_mementoEntry = IRI.create(s_p_mementoEntry);
    /**
     * List of mementos of a Logistics Object
     * 
     */
    public final static String s_p_list = "https://onerecord.iata.org/Mementos#list";
    public final static IRI p_list = IRI.create(s_p_list);
    /**
     * Logistics Object reference for which the notification is sent
     * 
     */
    public final static String s_p_logisticsObjectRef_A = "https://onerecord.iata.org/Notification#logisticsObjectRef";
    public final static IRI p_logisticsObjectRef_A = IRI.create(s_p_logisticsObjectRef_A);
    /**
     * PATCH object to modify
     * 
     */
    public final static String s_p_o = "https://onerecord.iata.org/Operation#o";
    public final static IRI p_o = IRI.create(s_p_o);
    /**
     * Reference of the Logistics Object to which the change request is applied to
     * 
     */
    public final static String s_p_logisticsObjectRef_A_A = "https://onerecord.iata.org/PatchRequest#logisticsObjectRef";
    public final static IRI p_logisticsObjectRef_A_A = IRI.create(s_p_logisticsObjectRef_A_A);
    /**
     * List of operations to apply as PATCH on a Logistics Object
     * 
     */
    public final static String s_p_operations = "https://onerecord.iata.org/PatchRequest#operations";
    public final static IRI p_operations = IRI.create(s_p_operations);
    /**
     * Non mandatory error details
     * 
     */
    public final static String s_p_error_A_A = "https://onerecord.iata.org/Subscription#error";
    public final static IRI p_error_A_A = IRI.create(s_p_error_A_A);
    /**
     * List of mementos of a Logistics Object
     * 
     */
    public final static String s_p_mementos = "https://onerecord.iata.org/Timemap#mementos";
    public final static IRI p_mementos = IRI.create(s_p_mementos);
    /**
     * Company which sent the change request
     * 
     */
    public final static String s_p_companyId = "https://onerecord.iata.org/ChangeRequest#companyId";
    public final static IRI p_companyId = IRI.create(s_p_companyId);
    /**
     * ACCEPTED or REJECTED
     * 
     */
    public final static String s_p_status = "https://onerecord.iata.org/ChangeRequest#status";
    public final static IRI p_status = IRI.create(s_p_status);
    /**
     * Timestamp of the change request
     * 
     */
    public final static String s_p_timestamp = "https://onerecord.iata.org/ChangeRequest#timestamp";
    public final static IRI p_timestamp = IRI.create(s_p_timestamp);
    /**
     * Company Id, for example airline code.
     * 
     */
    public final static String s_p_companyId_A = "https://onerecord.iata.org/CompanyInformation#companyId";
    public final static IRI p_companyId_A = IRI.create(s_p_companyId_A);
    /**
     * Endpoint of the company in the Internet of Logistics
     * 
     */
    public final static String s_p_serverEndpoint = "https://onerecord.iata.org/CompanyInformation#serverEndpoint";
    public final static IRI p_serverEndpoint = IRI.create(s_p_serverEndpoint);
    /**
     * Supported content types of the server
     * 
     */
    public final static String s_p_supportedContentTypes = "https://onerecord.iata.org/CompanyInformation#supportedContentTypes";
    public final static IRI p_supportedContentTypes = IRI.create(s_p_supportedContentTypes);
    /**
     * Supported logistics object types on the server
     * 
     */
    public final static String s_p_supportedLogisticsObjects = "https://onerecord.iata.org/CompanyInformation#supportedLogisticsObjects";
    public final static IRI p_supportedLogisticsObjects = IRI.create(s_p_supportedLogisticsObjects);
    /**
     * REVOKE or DELEGATE
     * 
     */
    public final static String s_p_action = "https://onerecord.iata.org/DelegationRequest#action";
    public final static IRI p_action = IRI.create(s_p_action);
    /**
     * GET or PATCH
     * 
     */
    public final static String s_p_operations_A = "https://onerecord.iata.org/DelegationRequest#operations";
    public final static IRI p_operations_A = IRI.create(s_p_operations_A);
    /**
     * Party that receives the delegated rights
     * 
     */
    public final static String s_p_targetCompany = "https://onerecord.iata.org/DelegationRequest#targetCompany";
    public final static IRI p_targetCompany = IRI.create(s_p_targetCompany);
    /**
     * Field of the object for which the error applies
     * 
     */
    public final static String s_p_attribute = "https://onerecord.iata.org/Details#attribute";
    public final static IRI p_attribute = IRI.create(s_p_attribute);
    /**
     * Error code
     * 
     */
    public final static String s_p_code = "https://onerecord.iata.org/Details#code";
    public final static IRI p_code = IRI.create(s_p_code);
    /**
     * Message of the error
     * 
     */
    public final static String s_p_message = "https://onerecord.iata.org/Details#message";
    public final static IRI p_message = IRI.create(s_p_message);
    /**
     * Object for which the error applies
     * 
     */
    public final static String s_p_resource = "https://onerecord.iata.org/Details#resource";
    public final static IRI p_resource = IRI.create(s_p_resource);
    /**
     * Brief description of the error
     * 
     */
    public final static String s_p_title = "https://onerecord.iata.org/Error#title";
    public final static IRI p_title = IRI.create(s_p_title);
    /**
     * Id of the reference Logistics Object
     * 
     */
    public final static String s_p_logisticsObjectId = "https://onerecord.iata.org/LogisticsObjectRef#logisticsObjectId";
    public final static IRI p_logisticsObjectId = IRI.create(s_p_logisticsObjectId);
    /**
     * Type of the reference Logistics Object
     * 
     */
    public final static String s_p_logisticsObjectType = "https://onerecord.iata.org/LogisticsObjectRef#logisticsObjectType";
    public final static IRI p_logisticsObjectType = IRI.create(s_p_logisticsObjectType);
    /**
     * Date and time of the memento creation
     * 
     */
    public final static String s_p_created = "https://onerecord.iata.org/Memento#created";
    public final static IRI p_created = IRI.create(s_p_created);
    /**
     * Name of the memento creator
     * 
     */
    public final static String s_p_createdBy = "https://onerecord.iata.org/Memento#createdBy";
    public final static IRI p_createdBy = IRI.create(s_p_createdBy);
    /**
     * Label of the memento
     * 
     */
    public final static String s_p_label = "https://onerecord.iata.org/Memento#label";
    public final static IRI p_label = IRI.create(s_p_label);
    /**
     * First version of the Logistics Object
     * 
     */
    public final static String s_p_original = "https://onerecord.iata.org/Memento#original";
    public final static IRI p_original = IRI.create(s_p_original);
    /**
     * Creation date of the memento
     * 
     */
    public final static String s_p_datetime = "https://onerecord.iata.org/MementoEntry#datetime";
    public final static IRI p_datetime = IRI.create(s_p_datetime);
    /**
     * Non mandatory label of the memento
     * 
     */
    public final static String s_p_label_A = "https://onerecord.iata.org/MementoEntry#label";
    public final static IRI p_label_A = IRI.create(s_p_label_A);
    /**
     * First memento of the Logistics Object
     * 
     */
    public final static String s_p_firstMemento = "https://onerecord.iata.org/Mementos#firstMemento";
    public final static IRI p_firstMemento = IRI.create(s_p_firstMemento);
    /**
     * Last memento of the Logistics Object
     * 
     */
    public final static String s_p_lastMemento = "https://onerecord.iata.org/Mementos#lastMemento";
    public final static IRI p_lastMemento = IRI.create(s_p_lastMemento);
    /**
     * OBJECT_CREATED or OBJECT_UPDATED
     * 
     */
    public final static String s_p_eventType = "https://onerecord.iata.org/Notification#eventType";
    public final static IRI p_eventType = IRI.create(s_p_eventType);
    /**
     * Type of Logistics Object
     * 
     */
    public final static String s_p_topic = "https://onerecord.iata.org/Notification#topic";
    public final static IRI p_topic = IRI.create(s_p_topic);
    /**
     * Operation objects must have exactly one op (operation) member; this value indicates which operation is to be performed. The value must be one of add or del; all other values result in an error
     * 
     */
    public final static String s_p_op = "https://onerecord.iata.org/Operation#op";
    public final static IRI p_op = IRI.create(s_p_op);
    /**
     * Operations objects must have exactly one p, predicate, member. The value of this member must be an IRI
     * 
     */
    public final static String s_p_p = "https://onerecord.iata.org/Operation#p";
    public final static IRI p_p = IRI.create(s_p_p);
    /**
     * Data type of the field to update
     * 
     */
    public final static String s_p_datatype = "https://onerecord.iata.org/OperationObject#datatype";
    public final static IRI p_datatype = IRI.create(s_p_datatype);
    /**
     * Value to update
     * 
     */
    public final static String s_p_value = "https://onerecord.iata.org/OperationObject#value";
    public final static IRI p_value = IRI.create(s_p_value);
    /**
     * Reason for the change (optional)
     * 
     */
    public final static String s_p_description = "https://onerecord.iata.org/PatchRequest#description";
    public final static IRI p_description = IRI.create(s_p_description);
    /**
     * The company identifier of the entity that is requesting the change request
     * 
     */
    public final static String s_p_requestorCompanyIdentifier = "https://onerecord.iata.org/PatchRequest#requestorCompanyIdentifier";
    public final static IRI p_requestorCompanyIdentifier = IRI.create(s_p_requestorCompanyIdentifier);
    /**
     * Revision number of the Logistics Object
     * 
     */
    public final static String s_p_revision = "https://onerecord.iata.org/PatchRequest#revision";
    public final static IRI p_revision = IRI.create(s_p_revision);
    /**
     * Duration of the period to cache the subscription information in seconds
     * 
     */
    public final static String s_p_cacheFor = "https://onerecord.iata.org/Subscription#cacheFor";
    public final static IRI p_cacheFor = IRI.create(s_p_cacheFor);
    /**
     * Callback URL of the Client Subscription API where the subscriber receives Logistics Objects
     * 
     */
    public final static String s_p_callbackUrl = "https://onerecord.iata.org/Subscription#callbackUrl";
    public final static IRI p_callbackUrl = IRI.create(s_p_callbackUrl);
    /**
     * Content type that the subscriber wants to receive in the notifications
     * 
     */
    public final static String s_p_contentType = "https://onerecord.iata.org/Subscription#contentType";
    public final static IRI p_contentType = IRI.create(s_p_contentType);
    /**
     * The company identifier from the Internet of Logistics of my company.
     * 
     */
    public final static String s_p_myCompanyIdentifier = "https://onerecord.iata.org/Subscription#myCompanyIdentifier";
    public final static IRI p_myCompanyIdentifier = IRI.create(s_p_myCompanyIdentifier);
    /**
     * Either a secret or API Key that ensures that only companies with this subscription information can POST to the subscriber callback endpoint
     * 
     */
    public final static String s_p_secret = "https://onerecord.iata.org/Subscription#secret";
    public final static IRI p_secret = IRI.create(s_p_secret);
    /**
     * Flag specifying if the publisher should send the whole logistics object or not in the notification object
     * 
     */
    public final static String s_p_sendLogisticsObjectBody = "https://onerecord.iata.org/Subscription#sendLogisticsObjectBody";
    public final static IRI p_sendLogisticsObjectBody = IRI.create(s_p_sendLogisticsObjectBody);
    /**
     * Flag specifying if the subscriber wants to receive updates for a Logistics Object
     * 
     */
    public final static String s_p_subscribeToStatusUpdates = "https://onerecord.iata.org/Subscription#subscribeToStatusUpdates";
    public final static IRI p_subscribeToStatusUpdates = IRI.create(s_p_subscribeToStatusUpdates);
    /**
     * Company Identifier of the company the subscriber wants to subscribe to (delegation scenario).
     * 
     */
    public final static String s_p_subscribedTo = "https://onerecord.iata.org/Subscription#subscribedTo";
    public final static IRI p_subscribedTo = IRI.create(s_p_subscribedTo);
    /**
     * The Logistics Object type to which the subscriber wants subscribe to
     * 
     */
    public final static String s_p_topic_A = "https://onerecord.iata.org/Subscription#topic";
    public final static IRI p_topic_A = IRI.create(s_p_topic_A);
    /**
     * Link to the initial version of the Logistics Object
     * 
     */
    public final static String s_p_original_A = "https://onerecord.iata.org/Timemap#original";
    public final static IRI p_original_A = IRI.create(s_p_original_A);
    /**
     * Link to the time gate of the Logistics Object, if applicable
     * 
     */
    public final static String s_p_timegate = "https://onerecord.iata.org/Timemap#timegate";
    public final static IRI p_timegate = IRI.create(s_p_timegate);
    public final static String s_p_description_A = "http://purl.org/dc/elements/1.1/description";
    public final static IRI p_description_A = IRI.create(s_p_description_A);
    public final static String s_p_title_A = "http://purl.org/dc/elements/1.1/title";
    public final static IRI p_title_A = IRI.create(s_p_title_A);
    public final static String s_p_comment = "http://www.w3.org/2000/01/rdf-schema#comment";
    public final static IRI p_comment = IRI.create(s_p_comment);
    public final static String s_p_label_A_A = "http://www.w3.org/2000/01/rdf-schema#label";
    public final static IRI p_label_A_A = IRI.create(s_p_label_A_A);

}
