package icu.samnyan.aqua.sega.ongeki.dao.userdata;

import icu.samnyan.aqua.sega.ongeki.model.userdata.UserData;
import icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author samnyan (privateamusement@protonmail.com)
 */
@Repository("OngekiUserGeneralDataRepository")
public interface UserGeneralDataRepository extends JpaRepository<UserGeneralData, Long> {

    Optional<UserGeneralData> findByUserAndPropertyKey(UserData user, String key);

    Optional<UserGeneralData> findByUser_Card_ExtIdAndPropertyKey(int aimeId, String key);

}
