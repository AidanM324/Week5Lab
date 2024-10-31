package ie.atu.week5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //   private ConfirmationServiceClient confirmationServiceClient;
    //   private RegistrationServiceClient registrationServiceClient;
    private final AcknowledgeService acknowledgeService;

    @Autowired
    public UserController(AcknowledgeService acknowledgeService){
        this.AcknowledgeService = acknowledgeService;
    }

    @PostMapping("confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userDetails){
        return acknowledgeService.askMessage(userDetails);
    }

}
