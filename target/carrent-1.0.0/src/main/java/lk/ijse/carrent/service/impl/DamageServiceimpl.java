package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.DamageDTO;
import lk.ijse.carrent.service.DamageService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional

public class DamageServiceimpl implements DamageService {
    @Override
    public void addDamage(DamageDTO dto) {

    }

    @Override
    public void deleteDamage(String id) {

    }

    @Override
    public DamageDTO searchDamage(String id) {
        return null;
    }

    @Override
    public ArrayList<DamageDTO> getAllDamage() {
        return null;
    }

    @Override
    public void updateDamage(DamageDTO dto) {

    }
}
