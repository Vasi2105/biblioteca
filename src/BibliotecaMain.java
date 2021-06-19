import dao.AutorDao;
import dao.CartiDao;
import dao.ClientiDao;
import model.Autor;
import model.Carti;
import model.Clienti;

import java.util.Date;
import java.util.List;

public class BibliotecaMain {

    public static void main(String[] args) {
        AutorDao autorDao = new AutorDao();

        Autor autor = autorDao.findById(1);

        System.out.println(autor);

        Autor autor1 = new Autor();
        autor1.setNume("Danjo");
        autor1.setPrenume("Imbatabilul");
        //autorDao.save(autor1);

        List<Autor> autors = autorDao.getAll();
        System.out.println(autors);

        autorDao.deleteById(15);

        // CARTI



        CartiDao cartiDao = new CartiDao();
        Carti carti = cartiDao.findById(2);
        System.out.println(carti);

        Carti carti1=new Carti();
        carti1.setId(24);
        carti1.setDenumire("La mare");
        carti1.setAnAparitie(new Date());

        // carti.Dao.save(carti1);
        System.out.println(carti1);




        //Clienti


        ClientiDao clientiDao = new ClientiDao();
        Clienti clienti = clientiDao.findById(5);
        System.out.println(clienti);

        Clienti clienti1 = new Clienti();
        clienti1.setNume("Dan");
        clienti1.setPrenume("Ardelean");
        clienti1.setTelefon("0742292281");
        clienti1.setEmail("danarde@hotmail.com");
        clienti1.setAdresa("Str.1 Aprilie, nr.69");
        //clientiDao.save(clienti1);


        List<Clienti> clientis = clientiDao.getAll();
        System.out.println(clientis);

        clientiDao.deleteById(8);


        List<Carti> cartiList = cartiDao.findAll();
        System.out.println(cartiList);




    }


}
