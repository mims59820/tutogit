import java.util.List;

import com.wha.springmvc.model.CompteDecouvert;
import com.wha.springmvc.model.Compteremun;

public interface ICompteremun {

	public void addCompteremun(Compteremun c);
	public List<Compteremun> listCompteremun();
	public void deleteCompteremun(Long id);
	public void updateCompteremun(Compteremun c);
	
}
