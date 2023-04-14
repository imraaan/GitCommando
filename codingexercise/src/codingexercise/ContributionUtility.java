package codingexercise;

import java.util.ArrayList;
import java.util.List;

public class ContributionUtility {
	private List<Contribution> contributions;
	public ContributionUtility() {
		contributions = new ArrayList();
	}
	public void addContribution(Contribution contribution) {
		if(contribution!= null && contribution.isValid()) {
			contributions.add(contribution);
		}
	}
	public void updateContribution(String date,Contribution newContribution) {
		for(Contribution contribution : contributions) {
			if(Contribution.getDate().equals(date) && newContribution.isValid()) {
				//contribution.setAmount(newContribution)
				
			}
		}
	}
}
