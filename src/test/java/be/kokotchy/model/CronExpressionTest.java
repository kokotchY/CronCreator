package be.kokotchy.model;

import junit.framework.TestCase;

public class CronExpressionTest extends TestCase {

	public void testCronExpressionEmpty() {
		assertEquals("", new CronExpression().getCronExpression());
	}

}
