import com.yun.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = {"classpath*:appcontext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    public void add(){
//        memberService.add(null);
        memberService.delete(1);
    }
}
