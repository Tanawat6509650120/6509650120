package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

    // TC1
    public void testCreateNewEmptyStack() {
        Stack s1 = new Stack();
        assertTrue(s1.isEmpty());
    }

    // TC2
    public void testPushElmToTop() {
        Stack s1 = new Stack();
        assertFalse(s1.isFull());
        if (!s1.isFull()) {
            try {
                s1.push(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Object topElm = s1.top();
            assertEquals(10, topElm);
        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }

    // TC3
    public void testPushSameType() {
        Stack s1 = new Stack();
        try {
            s1.push(1);
            s1.push(2);
        } catch (Exception e) {
            fail("Did not expect an exception, but it was thrown.");
        }
    }

    // TC4
    public void testPushDifferentType() {
        Stack s1 = new Stack();
        try {
            s1.push(1);
            s1.push('c');
            fail("Expected an exception, but none was thrown.");
        } catch (Exception e) {
            assertEquals("All elements in the stack must be the same type.", e.getMessage());
        }
    }

    // TC5
    public void testPop() {
        Stack s1 = new Stack();
        try {
            s1.push(1);
            s1.push(2);
            Object topElm = s1.pop();
            assertEquals(2, topElm);
            assertEquals(1, s1.top());
        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
