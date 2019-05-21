package tr.edu.deu.ceng.coffie.entity.checkmethod;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.exceptions.PayException;

public interface CheckMethod {
	void check(BigDecimal amount) throws PayException;
}
