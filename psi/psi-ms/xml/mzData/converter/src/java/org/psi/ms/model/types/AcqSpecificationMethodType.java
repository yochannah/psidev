/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqSpecificationMethodType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
 */

package org.psi.ms.model.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AcqSpecificationMethodType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class AcqSpecificationMethodType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The sum type
     */
    public static final int SUM_TYPE = 0;

    /**
     * The instance of the sum type
     */
    public static final AcqSpecificationMethodType SUM = new AcqSpecificationMethodType(SUM_TYPE, "sum");

    /**
     * The average type
     */
    public static final int AVERAGE_TYPE = 1;

    /**
     * The instance of the average type
     */
    public static final AcqSpecificationMethodType AVERAGE = new AcqSpecificationMethodType(AVERAGE_TYPE, "average");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private AcqSpecificationMethodType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.AcqSpecificationMethodType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of AcqSpecificationMethodType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * AcqSpecificationMethodType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("sum", SUM);
        members.put("average", AVERAGE);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * AcqSpecificationMethodType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new AcqSpecificationMethodType based
     * on the given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.AcqSpecificationMethodType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AcqSpecificationMethodType";
            throw new IllegalArgumentException(err);
        }
        return (AcqSpecificationMethodType) obj;
    } //-- org.psi.ms.model.types.AcqSpecificationMethodType valueOf(java.lang.String) 

}