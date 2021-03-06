/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class TableColumnDefinitionVector extends java.util.AbstractList<TableColumnDefinition> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TableColumnDefinitionVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TableColumnDefinitionVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_TableColumnDefinitionVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TableColumnDefinitionVector(TableColumnDefinition[] initialElements) {
    this();
    reserve(initialElements.length);

    for (TableColumnDefinition element : initialElements) {
      add(element);
    }
  }

  public TableColumnDefinitionVector(Iterable<TableColumnDefinition> initialElements) {
    this();
    for (TableColumnDefinition element : initialElements) {
      add(element);
    }
  }

  public TableColumnDefinition get(int index) {
    return doGet(index);
  }

  public TableColumnDefinition set(int index, TableColumnDefinition e) {
    return doSet(index, e);
  }

  public boolean add(TableColumnDefinition e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, TableColumnDefinition e) {
    modCount++;
    doAdd(index, e);
  }

  public TableColumnDefinition remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public TableColumnDefinitionVector() {
    this(AdaptiveCardObjectModelJNI.new_TableColumnDefinitionVector__SWIG_0(), true);
  }

  public TableColumnDefinitionVector(TableColumnDefinitionVector other) {
    this(AdaptiveCardObjectModelJNI.new_TableColumnDefinitionVector__SWIG_1(TableColumnDefinitionVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_clear(swigCPtr, this);
  }

  public TableColumnDefinitionVector(int count, TableColumnDefinition value) {
    this(AdaptiveCardObjectModelJNI.new_TableColumnDefinitionVector__SWIG_2(count, TableColumnDefinition.getCPtr(value), value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doSize(swigCPtr, this);
  }

  private void doAdd(TableColumnDefinition x) {
    AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doAdd__SWIG_0(swigCPtr, this, TableColumnDefinition.getCPtr(x), x);
  }

  private void doAdd(int index, TableColumnDefinition x) {
    AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doAdd__SWIG_1(swigCPtr, this, index, TableColumnDefinition.getCPtr(x), x);
  }

  private TableColumnDefinition doRemove(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new TableColumnDefinition(cPtr, true);
  }

  private TableColumnDefinition doGet(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new TableColumnDefinition(cPtr, true);
  }

  private TableColumnDefinition doSet(int index, TableColumnDefinition val) {
    long cPtr = AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doSet(swigCPtr, this, index, TableColumnDefinition.getCPtr(val), val);
    return (cPtr == 0) ? null : new TableColumnDefinition(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.TableColumnDefinitionVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
