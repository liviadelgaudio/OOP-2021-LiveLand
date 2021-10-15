package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.jfree.chart.JFreeChart;
import org.junit.Test;

import controller.EnvironmentControllerImpl;
import model.analysis.FairDatasetFactory;
import model.analysis.ProfitDatasetFactory;

public class AnalysisDatasetTest {
	
	private EnvironmentControllerImpl envController = new EnvironmentControllerImpl();
	private FairDatasetFactory fairDataset = new FairDatasetFactory(this.envController);
	private ProfitDatasetFactory profitDataset = new ProfitDatasetFactory(this.envController);
	
	
	@Test
	public void AnalysisDatasetCreation() {
		assertNotNull("The fair dataset has been correctly created", this.fairDataset.createPhonyDataset());
		assertNotNull("The profit dataset has been correctly created", this.profitDataset.createPhonyDataset());
		assertNotEquals("fair dataset different from profit dataset", this.fairDataset.createPhonyDataset(),
				this.profitDataset.createPhonyDataset());
		
	}
	
	@Test
	public void AnalysisChartCreation() {
		JFreeChart fairChart1 = this.fairDataset.createPhonyChart();
		JFreeChart fairChart2 = this.fairDataset.createPhonyChart();
		JFreeChart profitChart = this.profitDataset.createPhonyChart();
		assertNotNull("Fair chart correctly created", fairChart1);
		assertNotNull("Profit chart correctly created", profitChart);
		assertEquals("Fair chart 1 equals fair chart 2", fairChart1, fairChart2);
		assertNotEquals("Fair chart not equal to profit chart", fairChart1, profitChart);
		
	}
	

}
