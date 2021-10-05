package bo.edu.ucb.country.country;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRestRepositort extends PagingAndSortingRepository<Country, Integer> {

    // List<Task> findAll();
    List<Country> findByTitle(@Param("country") String country);
}