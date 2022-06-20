/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ito.dsos.compras.implement;

import ito.dsos.compras.model.ModeloModel;
import ito.dsos.compras.repository.ModeloRepository;
import ito.dsos.compras.service.ModeloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Oscar
 */
@Service
public class ModeloServiceImplement implements ModeloService {
    private final Log LOG = LogFactory.getLog(ModeloService.class);

    @Autowired
    private ModeloRepository modeloRepository;

    public ModeloServiceImplement(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public void createModelo(ModeloModel modelo) {
        modeloRepository.save(modelo);
    }

    @Override
    public void save(ModeloModel nuevoModelo) {
        modeloRepository.save(nuevoModelo);
    }

    @Override
    public void delete(Integer id) {
        modeloRepository.deleteById(id);
    }

    @Override
    public void update(ModeloModel modeloUpdate, Integer id) {
        ModeloModel modeloModel = modeloRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("El modelo no existe"));
        modeloModel.setNombreModelo(modeloUpdate.getNombreModelo());
        modeloRepository.save(modeloModel);
    }

    @Override
    public Optional<ModeloModel> getById(Integer id) {
        return modeloRepository.findById(id);
    }

    @Override
    public List<ModeloModel> getAll() {
        return modeloRepository.findAll();
    }
}
