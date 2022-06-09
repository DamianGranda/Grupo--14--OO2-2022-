package sistema.integrador.oo2.services.implementation;

import java.util.ArrayList;   
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.UserRole;
import sistema.integrador.oo2.repositories.IUserRepository;




@Service("userService")
public class UserService implements UserDetailsService {

	@Autowired
	@Qualifier("userRepository")
	private IUserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		sistema.integrador.oo2.entities.User user = userRepository.findByUsernameAndFetchUserRoleEagerly(username);
		return buildUser(user, buildGrantedAuthorities(user.getRole()));
	}
	
	private User buildUser(sistema.integrador.oo2.entities.User user, List<GrantedAuthority> grantedAuthorities) {
		return new User(user.getUsername(), user.getPassword(), user.isEnabled(),
						true, true, true, //accountNonExpired, credentialsNonExpired, accountNonLocked,
						grantedAuthorities);
	}
	
	private List<GrantedAuthority> buildGrantedAuthorities(UserRole userRole1) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		
		grantedAuthorities.add(new SimpleGrantedAuthority(userRole1.getRole()));
		
		return new ArrayList<GrantedAuthority>(grantedAuthorities);
	}
}
