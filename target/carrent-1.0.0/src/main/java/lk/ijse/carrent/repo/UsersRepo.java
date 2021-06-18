package lk.ijse.carrent.repo;


import lk.ijse.carrent.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,String> {
}
