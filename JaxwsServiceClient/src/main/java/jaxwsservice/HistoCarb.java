/**
 * HistoCarb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public class HistoCarb  implements java.io.Serializable {
    private jaxwsservice.Carburant carburant;

    private java.lang.String date;

    private float prix;

    private jaxwsservice.Station station;

    public HistoCarb() {
    }

    public HistoCarb(
           jaxwsservice.Carburant carburant,
           java.lang.String date,
           float prix,
           jaxwsservice.Station station) {
           this.carburant = carburant;
           this.date = date;
           this.prix = prix;
           this.station = station;
    }


    /**
     * Gets the carburant value for this HistoCarb.
     * 
     * @return carburant
     */
    public jaxwsservice.Carburant getCarburant() {
        return carburant;
    }


    /**
     * Sets the carburant value for this HistoCarb.
     * 
     * @param carburant
     */
    public void setCarburant(jaxwsservice.Carburant carburant) {
        this.carburant = carburant;
    }


    /**
     * Gets the date value for this HistoCarb.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this HistoCarb.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the prix value for this HistoCarb.
     * 
     * @return prix
     */
    public float getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this HistoCarb.
     * 
     * @param prix
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }


    /**
     * Gets the station value for this HistoCarb.
     * 
     * @return station
     */
    public jaxwsservice.Station getStation() {
        return station;
    }


    /**
     * Sets the station value for this HistoCarb.
     * 
     * @param station
     */
    public void setStation(jaxwsservice.Station station) {
        this.station = station;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoCarb)) return false;
        HistoCarb other = (HistoCarb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carburant==null && other.getCarburant()==null) || 
             (this.carburant!=null &&
              this.carburant.equals(other.getCarburant()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.prix == other.getPrix() &&
            ((this.station==null && other.getStation()==null) || 
             (this.station!=null &&
              this.station.equals(other.getStation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCarburant() != null) {
            _hashCode += getCarburant().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += new Float(getPrix()).hashCode();
        if (getStation() != null) {
            _hashCode += getStation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoCarb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jaxwsservice/", "histoCarb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carburant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carburant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jaxwsservice/", "carburant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("station");
        elemField.setXmlName(new javax.xml.namespace.QName("", "station"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jaxwsservice/", "station"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
