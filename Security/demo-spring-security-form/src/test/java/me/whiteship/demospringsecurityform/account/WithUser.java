package me.whiteship.demospringsecurityform.account;

import org.springframework.security.test.context.support.WithMockUser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(username = "jiyeon", roles = "ADMIN")
public @interface WithUser {

}
