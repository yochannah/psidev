/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: MzData.java,v 1.7 2003/11/14 16:49:30 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * The "peak list" is really processed data from an experiment.
 * There can bemultiple acquisitions, which might be related via a
 * separation, or just in sequence from an automated run.
 *
 * @version $Revision: 1.7 $ $Date: 2003/11/14 16:49:30 $
 */
public class MzData implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version
     */
    private java.lang.String _version = "1.00";

    /**
     * Each data set starts with a description section. Each
     * acquisition given in the 'raw' section has an entry in the
     * description section. This allows the desc section to be read
     * and then used to find specific entries in the raw section.
     */
    private org.psi.ms.model.Desc _desc;

    /**
     * List of acquisitions.
     * This is the actual peak list data. All that is stored here
     * is the actual data, all descriptive information is in the
     * desc section.
     */
    private org.psi.ms.model.AcquisitionList _acquisitionList;



    //----------------/
    //- Constructors -/
    //----------------/

    public MzData() {
        super();
        setVersion("1.00");

        // For simplicity all these "default" values of MzData are set in the constructor
        Desc desc = new Desc();
        setDesc(desc);
        Admin admin = new Admin();
        desc.setAdmin(admin);

        // Todo: this information must be provided by the user
        admin.setSampleName("");
        Person contact = new Person();
        contact.setName("Kai Runte");
        contact.setInstitution("EMBL Outstation - EBI");
        admin.setContact(contact);

        // Todo: this information must be provided by the user
        InstrumentCommonSettings instrument = new InstrumentCommonSettings();
        instrument.setInstName("unknown");
        Source source = new Source();
        source.setType(Source.Type.OTHER);
        instrument.setSource(source);
        Analyzer analyzer = new Analyzer();
        analyzer.setType(Analyzer.Type.OTHER);
        float unknown = -1;
        analyzer.setResolution(unknown);
        analyzer.setAccuracy(unknown);
        instrument.setAnalyzer(analyzer);
        Detector detector = new Detector();
        detector.setType(Detector.Type.OTHER);
        instrument.setDetector(detector);
        desc.setInstrument(instrument);

        Test test = new Test();
        desc.setTest(test);

        ProcessingMethod processingMethod = new ProcessingMethod();
        test.setProcessingMethod(processingMethod);

        processingMethod.setPeakProcessing("?");
    } //-- org.psi.ms.model.MzData()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'. The field 'desc' has the
     * following description: Each data set starts with a
     * description section. Each acquisition given in the 'raw'
     * section has an entry in the description section. This allows
     * the desc section to be read and then used to find specific
     * entries in the raw section.
     *
     * @return the value of field 'desc'.
     */
    public org.psi.ms.model.Desc getDesc() {
        return this._desc;
    } //-- org.psi.ms.model.Desc getDesc()

    /**
     * Returns the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     *
     * @return the value of field 'acquisitionList'.
     */
    public org.psi.ms.model.AcquisitionList getAcquisitionList() {
        if (_acquisitionList == null)
            _acquisitionList = new AcquisitionList();
        return this._acquisitionList;
    } //-- org.psi.ms.model.AcquisitionList getAcquisitionList()

    /**
     * Returns the value of field 'version'.
     *
     * @return the value of field 'version'.
     */
    public java.lang.String getVersion() {
        return this._version;
    } //-- java.lang.String getVersion()

    /**
     * Sets the value of field 'desc'. The field 'desc' has the
     * following description: Each data set starts with a
     * description section. Each acquisition given in the 'raw'
     * section has an entry in the description section. This allows
     * the desc section to be read and then used to find specific
     * entries in the raw section.
     *
     * @param desc the value of field 'desc'.
     */
    public void setDesc(org.psi.ms.model.Desc desc) {
        this._desc = desc;
    } //-- void setDesc(org.psi.ms.model.Desc)

    /**
     * Sets the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     *
     * @param acquisitionList the value of field 'acquisitionList'.
     */
    public void setAcquisitionList(org.psi.ms.model.AcquisitionList acquisitionList) {
        this._acquisitionList = acquisitionList;
    } //-- void setAcquisitionList(org.psi.ms.model.AcquisitionList)

    /**
     * Sets the value of field 'version'.
     *
     * @param version the value of field 'version'.
     */
    public void setVersion(java.lang.String version) {
        this._version = version;
    } //-- void setVersion(java.lang.String)

}
