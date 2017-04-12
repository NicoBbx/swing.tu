package org.bbx.swing.tu;

import static org.junit.Assert.*;

import java.awt.Component;
import javax.swing.JLabel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Controller.class)
// Disable UIManager error
@PowerMockIgnore("javax.swing.*")
public class ViewTest {

	private View testedView;
	@Mock
	private Controller mockController;
	
	private static final String VALUE1 = "the value";
	private static final String VALUE2 = "another value";
	
	
	@Before
	public void setUp() throws Exception {
        PowerMockito.mockStatic(Controller.class);
        Mockito.when(Controller.getInstance()).thenReturn(mockController);
	}

	@Test
	public void test1() {
		Mockito.when(mockController.getValue()).thenReturn(VALUE1);
		
		testedView = new View();
		final Component item = testedView.getComponent(0);
		assertTrue(item instanceof JLabel);
		assertEquals(VALUE1, ((JLabel)item).getText());
	}
	
	@Test
	public void test2() {
		Mockito.when(mockController.getValue()).thenReturn(VALUE2);
		
		testedView = new View();
		final Component item = testedView.getComponent(0);
		assertTrue(item instanceof JLabel);
		assertEquals(VALUE2, ((JLabel)item).getText());
	}
}
