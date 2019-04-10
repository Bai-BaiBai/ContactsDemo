package contacts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 使用Spring Data JPA自动生成数据库操作代码
 * @author Bai
 *
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
	
}
