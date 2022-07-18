
package com.exam.exam.serviceImpl;


import com.exam.exam.entity.Categoria;
import com.exam.exam.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class CategoriaService implements Operaciones<Categoria>{
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria create(Categoria t) {
        return categoriaRepository.save(t);
        
    }

    @Override
    public Categoria update(Categoria t) {
        return categoriaRepository.save(t);
    }

    @Override
    public void delete(int id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria read(int id) {
        return categoriaRepository.findById(id).get();
    }

    @Override
    public List<Categoria> readAll() {
       return categoriaRepository.findAll();
    }
    
}
