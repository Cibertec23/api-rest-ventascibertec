package pe.edu.cibertec.apirestventascibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apirestventascibertec.model.bd.Supplier;

@Repository
public interface SupplierRepository
        extends JpaRepository<Supplier, Integer>
{
}
