package klaseak;

import java.io.File;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLSortu {

    public static void generarXML(String archivo) {
        try {
            // Kargatu erabiltzaileak datu-basetik
            Map<String, String> erabiltzaileak = BDErabiltzaile.erabiltzaileakKargatu();

            // Sortu DocumentBuilder instantzia berri bat XML sortzeko
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();  // Sortu XML berri bat

            // Sortu erro-elementua <Erabiltzaileak>
            Element root = doc.createElement("Erabiltzaileak");
            doc.appendChild(root);

            // Itera ezazu erabiltzaileen gainean eta gehitu XMLra
            for (Map.Entry<String, String> entry : erabiltzaileak.entrySet()) {
                // Sortu <Erabiltzaile> elementu bat erabiltzaile bakoitzarentzat
                Element izenaElement = doc.createElement("Erabiltzaile");

                // Sortu <Izena> azpielementua
                Element izena = doc.createElement("Izena");
                izena.appendChild(doc.createTextNode(entry.getKey()));  // Gehitu erabiltzaile-izena
                izenaElement.appendChild(izena);

                // Sortu azpielementua <Pasahitza>
                Element pasahitza = doc.createElement("Pasahitza");
                pasahitza.appendChild(doc.createTextNode(entry.getValue()));  // Gehitu pasahitza
                izenaElement.appendChild(pasahitza);

                // Gehitu erabiltzailea erro elementura
                root.appendChild(izenaElement);
            }

            // Gorde XML dokumentua fitxategi batean
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);  // XML-rako datu-iturria
            StreamResult result = new StreamResult(new File(archivo));  // Fitxategian emaitza
            transformer.transform(source, result);  // Idatzi XML fitxategia

            System.out.println("XML sortuta.");
        } catch (Exception e) {
            System.out.println("Errorea XML sortzerakoan: " + e.getMessage());
        }
        
        
        /*Langile Bersioa
         * public static void generarXML(String archivo) {
	        try {
	            // Kargatu langileak datu-basetik edo iturri batetik
	            Map<Integer, Langile> langileak = BDLangile.langileakKargatu(); // Kargatu langileen datuak zure datu-basetik

	            // Sortu DocumentBuilder instantzia berri bat XML sortzeko
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document doc = builder.newDocument();  // Sortu XML dokumentu berri bat

	            // Sortu erro-elementua <Langileak>
	            Element root = doc.createElement("Langileak");
	            doc.appendChild(root);

	            // Itera ezazu langileak eta gehitu XMLra
	            for (Langile langile : langileak.values()) {
	                // Sortu <Langile> elementu bat langile bakoitzarentzat
	                Element langileElement = doc.createElement("Langile");

	                // Sortu langilearen azpi-elementuak
	                Element langileMota = doc.createElement("LangileMota");
	                langileMota.appendChild(doc.createTextNode(langile.getLangileMota()));  // Langile Mota
	                langileElement.appendChild(langileMota);

	                Element id = doc.createElement("ID");
	                id.appendChild(doc.createTextNode(String.valueOf(langile.getId())));  // Langilearen IDa
	                langileElement.appendChild(id);

	                Element izenaAbizenak = doc.createElement("IzenaAbizenak");
	                izenaAbizenak.appendChild(doc.createTextNode(langile.getIzenaAbizenak()));  // Izen osoa
	                langileElement.appendChild(izenaAbizenak);

	                Element email = doc.createElement("Email");
	                email.appendChild(doc.createTextNode(langile.getEmail()));  // Posta elektronikoa
	                langileElement.appendChild(email);

	                Element telefonoa = doc.createElement("Telefonoa");
	                telefono.appendChild(doc.createTextNode(langile.getTelefonoa()));  // Telefonoa
	                langileElement.appendChild(telefonoa);

	                Element data = doc.createElement("Data");
	                data.appendChild(doc.createTextNode(langile.getData()));  // Data
	                langileElement.appendChild(data);

	                // Langile motari buruzko informazio espezifikoa
	                if ("Administrativo".equals(langile.getLangileMota())) {
	                    Element lanPostua = doc.createElement("LanPostua");
	                    lanPostua.appendChild(doc.createTextNode(langile.getLanPostua()));  // Postua
	                    langileElement.appendChild(lanPostua);
	                }

	                Element erabiltzaileEgiaztagiria = doc.createElement("ErabiltzaileEgiaztagiria");
	                erabiltzaileEgiaztagiria.appendChild(doc.createTextNode(langile.getErabiltzaileEgiaztagiria()));  // Erabiltzaileen egiaztapena
	                langileElement.appendChild(erabiltzaileEgiaztagiria);

	                // Gehitu langilea erro-elementuari
	                root.appendChild(langileElement);
	            }

	            // Gorde XML dokumentua fitxategi batean
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource source = new DOMSource(doc);  // XML-rako datu-iturria
	            StreamResult result = new StreamResult(new File(archivo));  // Fitxategian emaitza
	            transformer.transform(source, result);  // Idatzi XML fitxategia

	            System.out.println("XML behar bezala sortu da.");
	        } catch (Exception e) {
	            System.out.println("Errore bat gertatu da XML sortzean: " + e.getMessage());
	        }
	    }
	    */
         
    }
}

