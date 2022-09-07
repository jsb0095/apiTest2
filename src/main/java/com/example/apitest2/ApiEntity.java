import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ApiTable")
public class ApiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String memberId;
    String memberPw;
    String memberPwc;
    String memberEmail;
    String memberName;
    String memberAddress1;
    String memberAddress2;
    String memberAddress3;
    String memberAddress4;
    String memberBirthday;
    String memberGender;
    String memberPhone;
}
