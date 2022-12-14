/**
 * Station.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public class Station  implements java.io.Serializable {
    private java.lang.Long id_stat;

    private java.lang.String nom;

    private java.lang.String ville;

    private java.lang.String adresse;

    private jaxwsservice.HistoCarb[] histoCarb;

    public Station() {
    }

    public Station(
           java.lang.Long id_stat,
           java.lang.String nom,
           java.lang.String ville,
           java.lang.String adresse,
           jaxwsservice.HistoCarb[] histoCarb) {
           this.id_stat = id_stat;
           this.nom = nom;
           this.ville = ville;
           this.adresse = adresse;
           this.histoCarb = histoCarb;
    }


    /**
     * Gets the id_stat value for this Station.
     * 
     * @return id_stat
     */
    public java.lang.Long getId_stat() {
        return id_stat;
    }


    /**
     * Sets the id_stat value for this Station.
     * 
     * @param id_stat
     */
    public void setId_stat(java.lang.Long id_stat) {
        this.id_stat = id_stat;
    }


    /**
     * Gets the nom value for this Station.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Station.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the ville value for this Station.
     * 
     * @return ville
     */
    public java.lang.String getVille() {
        return ville;
    }


    /**
     * Sets the ville value for this Station.
     * 
     * @param ville
     */
    public void setVille(java.lang.String ville) {
        this.ville = ville;
    }


    /**
     * Gets the adresse value for this Station.
     * 
     * @return adresse
     */
    public java.lang.String getAdresse() {
        return adresse;
    }


    /**
     * Sets the adresse value for this Station.
     * 
     * @param adresse
     */
    public void setAdresse(java.lang.String adresse) {
        this.adresse = adresse;
    }


    /**
     * Gets the histoCarb value for this Station.
     * 
     * @return histoCarb
     */
    public jaxwsservice.HistoCarb[] getHistoCarb() {
        return histoCarb;
    }


    /**
     * Sets the histoCarb value for this Station.
     * 
     * @param histoCarb
     */
    public void setHistoCarb(jaxwsservice.HistoCarb[] histoCarb) {
        this.histoCarb = histoCarb;
    }

    public jaxwsservice.HistoCarb getHistoCarb(int i) {
        return this.histoCarb[i];
    }

    public void setHistoCarb(int i, jaxwsservice.HistoCarb _value) {
        this.histoCarb[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Station)) return false;
        Station other = (Station) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id_stat==null && other.getId_stat()==null) || 
             (this.id_stat!=null &&
              this.id_stat.equals(other.getId_stat()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.ville==null && other.getVille()==null) || 
             (this.ville!=null &&
              this.ville.equals(other.getVille()))) &&
            ((this.adresse==null && other.getAdresse()==null) || 
             (this.adresse!=null &&
              this.adresse.equals(other.getAdresse()))) &&
            ((this.histoCarb==null && other.getHistoCarb()==null) || 
             (this.histoCarb!=null &&
              java.util.Arrays.equals(this.histoCarb, other.getHistoCarb())));
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
        if (getId_stat() != null) {
            _hashCode += getId_stat().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getVille() != null) {
            _hashCode += getVille().hashCode();
        }
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
        }
        if (getHistoCarb() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoCarb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoCarb(), i);
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
        new org.apache.axis.description.TypeDesc(Station.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jaxwsservice/", "station"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_stat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_stat"));
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
        elemField.setFieldName("ville");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ville"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histoCarb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "histoCarb"));
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
