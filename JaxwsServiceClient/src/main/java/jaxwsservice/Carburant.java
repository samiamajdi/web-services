/**
 * Carburant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public class Carburant  implements java.io.Serializable {
    private java.lang.Long id_carb;

    private java.lang.String nom;

    private java.lang.String description;

    private jaxwsservice.HistoCarb[] histocarb;

    public Carburant() {
    }

    public Carburant(
           java.lang.Long id_carb,
           java.lang.String nom,
           java.lang.String description,
           jaxwsservice.HistoCarb[] histocarb) {
           this.id_carb = id_carb;
           this.nom = nom;
           this.description = description;
           this.histocarb = histocarb;
    }


    /**
     * Gets the id_carb value for this Carburant.
     * 
     * @return id_carb
     */
    public java.lang.Long getId_carb() {
        return id_carb;
    }


    /**
     * Sets the id_carb value for this Carburant.
     * 
     * @param id_carb
     */
    public void setId_carb(java.lang.Long id_carb) {
        this.id_carb = id_carb;
    }


    /**
     * Gets the nom value for this Carburant.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Carburant.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the description value for this Carburant.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Carburant.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the histocarb value for this Carburant.
     * 
     * @return histocarb
     */
    public jaxwsservice.HistoCarb[] getHistocarb() {
        return histocarb;
    }


    /**
     * Sets the histocarb value for this Carburant.
     * 
     * @param histocarb
     */
    public void setHistocarb(jaxwsservice.HistoCarb[] histocarb) {
        this.histocarb = histocarb;
    }

    public jaxwsservice.HistoCarb getHistocarb(int i) {
        return this.histocarb[i];
    }

    public void setHistocarb(int i, jaxwsservice.HistoCarb _value) {
        this.histocarb[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Carburant)) return false;
        Carburant other = (Carburant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id_carb==null && other.getId_carb()==null) || 
             (this.id_carb!=null &&
              this.id_carb.equals(other.getId_carb()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.histocarb==null && other.getHistocarb()==null) || 
             (this.histocarb!=null &&
              java.util.Arrays.equals(this.histocarb, other.getHistocarb())));
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
        if (getId_carb() != null) {
            _hashCode += getId_carb().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHistocarb() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistocarb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistocarb(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Carburant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jaxwsservice/", "carburant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_carb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_carb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histocarb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "histocarb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jaxwsservice/", "histoCarb"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
