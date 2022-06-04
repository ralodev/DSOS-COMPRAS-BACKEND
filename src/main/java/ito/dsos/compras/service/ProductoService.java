package ito.dsos.compras.service;

import ito.dsos.compras.model.ProductoModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductoService {

    public void createProducto(ProductoModel producto);

    public void save(ProductoModel nuevoProducto);

    public void delete(Integer id);

    public void update(ProductoModel productoUpdate, Integer id);

    public Optional<ProductoModel> getById(Integer id);

    public List<ProductoModel> getAll();

    public void vender(Integer id, Integer cantidad);

}

