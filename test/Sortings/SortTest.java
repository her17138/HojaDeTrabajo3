/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anahernandez
 */
public class SortTest {
    
    public SortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compareTo method, of class Sort.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = (int) 0;
        Sort instance = new Sort();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
        {
            fail("La prueba ha fallado.");
        }
    }

    /**
     * Test of gnomeSort method, of class Sort.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Integer[] theArray = {5,8,2,6,3};
        Sort instance = new Sort();
        Integer[] expResult = {2,3,5,6,8};
        Integer[] result = instance.gnomeSort(theArray);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!Arrays.equals(result, expResult))
        {
            String hilo ="";
            for (int i=0; i<result.length;i++)
            {
                hilo += String.valueOf(result[i]) + " ";
            }
            fail(hilo);
            
        }
    }
    /**
     * Test of mergeSort method, of class Sort.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Integer[] array = {9,5,2,6,3,1};
        Sort instance = new Sort();
        instance.mergeSort(array);
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.getMergedArray();
        if (!Arrays.equals(result, expResult))
        {
            String hilo ="";
            for (int i=0; i<result.length;i++)
            {
                hilo += String.valueOf(result[i]) + " ";
            }
            fail(hilo);
            
        }
    }

    /**
     * Test of getMergedArray method, of class Sort.
     */
    @Test
    public void testGetMergedArray() {
        System.out.println("getMergedArray");
        Sort instance = new Sort();
        Integer[] expResult = null;
        Integer[] result = instance.getMergedArray();
        assertArrayEquals(expResult, result);
        
    }
    
    /**
     * Test of quickSort method, of class Sort.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        Integer[] lista = {9,5,2,6,3,1};
        Sort instance = new Sort();
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.quickSort(lista);
        assertArrayEquals(expResult, result);
        if (!Arrays.equals(result, expResult))
        {
            String hilo ="";
            for (int i=0; i<result.length;i++)
            {
                hilo += String.valueOf(result[i]) + " ";
            }
            fail(hilo);
            
        }
    }

    /**
     * Test of procesoQuicksort method, of class Sort.
     */
    @Test
    public void testProcesoQuicksort() {
        System.out.println("procesoQuicksort");
        int a = 0;
        int b = 0;
        Sort instance = new Sort();
        instance.procesoQuicksort(a, b);
    }

    /**
     * Test of RadixSort method, of class Sort.
     */
    @Test
    public void testRadixSort() {
        System.out.println("RadixSort");
        Integer[] lista = {9,5,2,6,3,1};
        Sort instance = new Sort();
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.RadixSort(lista);
        assertArrayEquals(expResult, result);
        if (!Arrays.equals(result, expResult))
        {
            String hilo ="";
            for (int i=0; i<result.length;i++)
            {
                hilo += String.valueOf(result[i]) + " ";
            }
            fail(hilo);
            
        }
    }

    /**
     * Test of heapSort method, of class Sort.
     */
    @Test
    public void testHeapSort() {
        System.out.println("heapSort");
        Integer[] array = {9,5,2,6,3,1};
        int x = 0;
        int i = 0;
        Sort instance = new Sort();
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.heapSort(array, x, i);
        assertArrayEquals(expResult, result);
        if (!Arrays.equals(result, expResult))
        {
            String hilo ="";
            for (int k=0; k<result.length;k++)
            {
                hilo += String.valueOf(result[k]) + " ";
            }
            fail(hilo);
            
        }
    }
    
}
