package map.service;

import map.model.Park;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public interface IParkService {

    boolean validateUserId(String id, Map<String, Park> map);

    boolean validatePassword(String id, String pw, Map<String, Park> map);
}
