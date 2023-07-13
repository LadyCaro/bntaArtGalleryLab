import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Tarek", 200);
        gallery = new Gallery("Le Louvre");
    }


    @Test
    public void testGetName(){
        assertThat(customer.getName()).isEqualTo("Tarek");
    }

    @Test
    public void testSetName(){
        customer.setName("Carolina");
        assertThat(customer.getName()).isEqualTo("Carolina");
    }

    @Test
    public void testGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(200);
    }

    @Test
    public void testSetWallet(){
        customer.setWallet(400);
        assertThat(customer.getWallet()).isEqualTo(400);
    }

    @Test
    public void testBuyArtwork(){
//        subtract money from wallet
//        Add money to gallery till
        
    }

//    @Test
//    public void testReduceAmountInWallet(){
//
//    }

}
