package vn.edu.fit.iuh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.fit.iuh.daos.AddressDAO;
import vn.edu.fit.iuh.daos.SkillDAO;
import vn.edu.fit.iuh.enities.Adress;
import vn.edu.fit.iuh.enities.Skill;
import vn.edu.fit.iuh.enums.SkillType;

import java.util.List;
import java.util.UUID;

@SpringBootTest
class AddressDaoTest {
    @Autowired
private AddressDAO addressDAO;

    @Test
    void insert() {
       Adress a=new Adress();
       a.setId(UUID.randomUUID());
       a.setStreet("Luong Ngoc Quyen");
       a.setCity("Ho Chi Minh");
       a.setCountry(1);
       a.setNumber("0367483370");
       a.setZipcode("1111");
       addressDAO.insert(a);
    }
    @Test
    void getAll(){
       List<Adress> list= addressDAO.getAll();
       list.forEach(p-> System.out.println(p));
    }
    @Test
    void getById(){
        Adress a=addressDAO.getById(UUID.fromString("5ad37bb5-ff2c-4d5a-b672-00284aabcdf3"));
        System.out.println(a);
    }

}
