package edu.ib.networktechnologies.Controllers;
import edu.ib.networktechnologies.LoginForm;
import edu.ib.networktechnologies.security.IncorrectPasswordException;
import edu.ib.networktechnologies.security.UserNotFoundException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.beans.factory.annotation.Value; import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; import org.springframework.web.server.ResponseStatusException;
import java.time.Instant; import java.util.Date;
@RestController
public class LoginController { @Value("${jwt.token}")
private String key;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public LoginController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder; }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginForm loginForm) {
        String encodedPasswordFromDB = passwordEncoder.encode("password");
        if (!loginForm.getLogin().equals("username")) {
            throw new UserNotFoundException(loginForm.getLogin()); }
        boolean isPasswordValid = passwordEncoder.matches(loginForm.getPassword(), encodedPasswordFromDB);
        if (isPasswordValid) {
            String token = Jwts.builder()
                    .setIssuedAt(Date.from(Instant.now())) .claim("id", "userId")
                    .claim("role", "USER") .signWith(SignatureAlgorithm.HS256, key) .compact();
            return new ResponseEntity<>(token, HttpStatus.OK); } else {
            throw new IncorrectPasswordException(loginForm.getLogin()); }
    } }