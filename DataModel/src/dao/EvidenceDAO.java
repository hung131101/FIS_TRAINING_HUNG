package dao;

import core.Evidence;

import java.util.List;

public interface EvidenceDAO {
    Evidence addEvidence(Evidence evidence);

    Evidence findEvidenceById(Long evidenceId);

    List<Evidence> findAll();

    Evidence update(Evidence evidence);

    void remove(Long evidenceId);
}
