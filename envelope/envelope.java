/**
 * Encapsulates information comming from WS to be updated in big data.
 * All required data is included within the bigfiniteEnvelope. The calculated CRC is a generated key associated to the incoming message 
 * and the publicPGPkey (if it exists), ensuring the message authenticity for future requests of this information.
 * Valid uom for the element that has been uploaded its latest value is the valid one for this element. 
 * When any property is changed in the element definition, timestamp and comments are associated to the element. 
 * When an element's property is modified (e.g. uom), previous property value is archived (never replaced or deleted) and the new one is active.
 * The argument IDUser is included in the API Call (in the body message) when data value is required or data has been sent from an user session. 
 * This API is called after password acceptance. Only IDCustomer, IDElement and message are required fields
 *
 */
 
 package bigfinite.envelope;
 
 public class envelope
 {
   /** Properties */
   protected int     idMsg;
   protected int     idCustomer;
   protected int     idElement;
   protected int     idUser;
   protected String  IPSource;
   protected String  publicPGPKey;
   protected String  message;
   protected String  result;
   protected String  crc;
   protected String  timestamp;
   protected String  customTimestamp;
   protected String  forcedTimestamp;
   protected String  value;
   protected String  geolocation;   
   protected boolean isSuspicious;
   
   /**
   IDMsg, IDCustomer, IDElement, IDUser, IPSource, publicPGPKey, message, result, crc, timestamp, customTimestamp, value, geolocation, forcedTimestamp, isSuspicious
       init
       {
           timestamp       = now()
           IDMsg           = getIdFromIncomingMsg()
           IDUser          = getIDUserFromIncomingMsg()
           IPSource        = getIPFromHTTPCall()
           value           = getValueFromIncomingMsg()
           forcedTimestamp = getForcedTimestampFromIncomingMsg()
           geolocation     = getGeolocationFromIncomingMsg()
           customTimestamp = getCustomTimestampFromIncomingMsg()
           crc             = calculateCRC(message, publicPGPKey)         
           isSuspicious    = investigateIfDataIsSuspicious()
       }
  */
 }