package klaseak;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class XMLSortu {

    public static void sortuXML(String fitxategia) {
        try {
            // Obtener langiles desde el CSV usando BDLangile
            List<Langile> langiles = BDLangile.getLangilesFromCSV();

            // Crear el documento XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            // Nodo raíz
            Element root = doc.createElement("Langileak");
            doc.appendChild(root);

            // Agregar langiles al XML
            for (Langile langile : langiles) {
                Element langileElement = doc.createElement("Langile");

                Element id = doc.createElement("ID");
                id.appendChild(doc.createTextNode(String.valueOf(langile.getId())));
                langileElement.appendChild(id);

                Element izena = doc.createElement("Izena");
                izena.appendChild(doc.createTextNode(langile.getIzena()));
                langileElement.appendChild(izena);

                Element abizenak = doc.createElement("Abizenak");
                abizenak.appendChild(doc.createTextNode(langile.getAbizenak()));
                langileElement.appendChild(abizenak);

                Element emaila = doc.createElement("Emaila");
                emaila.appendChild(doc.createTextNode(langile.getEmaila()));
                langileElement.appendChild(emaila);

                Element telefonoa = doc.createElement("Telefonoa");
                telefonoa.appendChild(doc.createTextNode(langile.getTelefonoa()));
                langileElement.appendChild(telefonoa);

                Element kontratazioData = doc.createElement("KontratazioData");
                String formattedDate = langile.getKontratazioData().format(DateTimeFormatter.ISO_LOCAL_DATE);
                kontratazioData.appendChild(doc.createTextNode(formattedDate));
                langileElement.appendChild(kontratazioData);

                Element idNagusia = doc.createElement("IDNagusia");
                idNagusia.appendChild(doc.createTextNode(String.valueOf(langile.getIdNagusia())));
                langileElement.appendChild(idNagusia);

                root.appendChild(langileElement);
            }

            // Guardar el documento XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(fitxategia));
            transformer.transform(source, result);

            System.out.println("XML sortua: " + fitxategia);

        } catch (Exception e) {
            System.out.println("Errorea XML sortzean: " + e.getMessage());
        }
    }
}
