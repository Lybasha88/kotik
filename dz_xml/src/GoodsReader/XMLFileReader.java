package GoodsReader;

import model.Good;

public class XMLFileReader extends Reader {

    private String fullPath;

    public XMLFileReader(String fullPath) {
        super();
        this.fullPath = fullPath;
    }



    @Override
    public Good readInfo(int id) {
        Good good = null;
        SAXParserFactory spfac = SAXParserFactory.newInstance();
        SAXParser sp;
        EmployeeSAXParser handler = null;
        try {
            sp = spfac.newSAXParser();
            handler = new EmployeeSAXParser();
            sp.parse(new File(fullPath), handler);
            good = handler.getEmployeeById(id);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Parsing fails: " + e.getMessage());
        }
        return good;
    }
}
