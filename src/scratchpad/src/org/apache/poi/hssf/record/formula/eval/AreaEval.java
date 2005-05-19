/*
 * Created on May 8, 2005
 *
 */
package org.apache.poi.hssf.record.formula.eval;

/**
 * @author Amol S. Deshmukh &lt; amolweb at ya hoo dot com &gt;
 *  
 */
public interface AreaEval extends ValueEval {

    /**
     * returns the 0-based index of the first row in
     * this area.
     * @return
     */
    public int getFirstRow();

    /**
     * returns the 0-based index of the last row in
     * this area.
     * @return
     */
    public int getLastRow();

    /**
     * returns the 0-based index of the first col in
     * this area.
     * @return
     */
    public short getFirstColumn();

    /**
     * returns the 0-based index of the last col in
     * this area.
     * @return
     */
    public short getLastColumn();
    
    /**
     * returns true if the Area's start and end row indexes
     * are same. This result of this method should agree
     * with getFirstRow() == getLastRow().
     * @return
     */
    public boolean isRow();
    
    /**
     * returns true if the Area's start and end col indexes
     * are same. This result of this method should agree
     * with getFirstColumn() == getLastColumn().
     * @return
     */
    public boolean isColumn();

    /**
     * The array of values  in this area. Although the area
     * maybe 1D (ie. isRow() or isColumn() returns true) or 2D
     * the returned array is 1D.
     * @return
     */
    public ValueEval[] getValues();

    /**
     * returns the ValueEval from the values array at the specified 
     * row and col index. The specified indexes should be absolute indexes
     * in the sheet and not relative indexes within the area. Also,
     * if contains(row, col) evaluates to true, a null value will
     * bre returned.
     * @param row
     * @param col
     * @return
     */
    public ValueEval getValueAt(int row, short col);
    
    /**
     * returns true if the cell at row and col specified 
     * as absolute indexes in the sheet is contained in 
     * this area.
     * @param row
     * @param col
     * @return
     */
    public boolean contains(int row, short col);
    
    /**
     * returns true if the specified col is in range
     * @param col
     * @return
     */
    public boolean containsColumn(short col);
    
    /**
     * returns true if the specified row is in range
     * @param row
     * @return
     */
    public boolean containsRow(int row);
}
