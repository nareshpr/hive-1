/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetOpenTxnsRequest implements org.apache.thrift.TBase<GetOpenTxnsRequest, GetOpenTxnsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetOpenTxnsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetOpenTxnsRequest");

  private static final org.apache.thrift.protocol.TField EXCLUDE_TXN_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("excludeTxnTypes", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetOpenTxnsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetOpenTxnsRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<TxnType> excludeTxnTypes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXCLUDE_TXN_TYPES((short)1, "excludeTxnTypes");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXCLUDE_TXN_TYPES
          return EXCLUDE_TXN_TYPES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.EXCLUDE_TXN_TYPES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXCLUDE_TXN_TYPES, new org.apache.thrift.meta_data.FieldMetaData("excludeTxnTypes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TxnType.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetOpenTxnsRequest.class, metaDataMap);
  }

  public GetOpenTxnsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetOpenTxnsRequest(GetOpenTxnsRequest other) {
    if (other.isSetExcludeTxnTypes()) {
      java.util.List<TxnType> __this__excludeTxnTypes = new java.util.ArrayList<TxnType>(other.excludeTxnTypes.size());
      for (TxnType other_element : other.excludeTxnTypes) {
        __this__excludeTxnTypes.add(other_element);
      }
      this.excludeTxnTypes = __this__excludeTxnTypes;
    }
  }

  public GetOpenTxnsRequest deepCopy() {
    return new GetOpenTxnsRequest(this);
  }

  @Override
  public void clear() {
    this.excludeTxnTypes = null;
  }

  public int getExcludeTxnTypesSize() {
    return (this.excludeTxnTypes == null) ? 0 : this.excludeTxnTypes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TxnType> getExcludeTxnTypesIterator() {
    return (this.excludeTxnTypes == null) ? null : this.excludeTxnTypes.iterator();
  }

  public void addToExcludeTxnTypes(TxnType elem) {
    if (this.excludeTxnTypes == null) {
      this.excludeTxnTypes = new java.util.ArrayList<TxnType>();
    }
    this.excludeTxnTypes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TxnType> getExcludeTxnTypes() {
    return this.excludeTxnTypes;
  }

  public void setExcludeTxnTypes(@org.apache.thrift.annotation.Nullable java.util.List<TxnType> excludeTxnTypes) {
    this.excludeTxnTypes = excludeTxnTypes;
  }

  public void unsetExcludeTxnTypes() {
    this.excludeTxnTypes = null;
  }

  /** Returns true if field excludeTxnTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetExcludeTxnTypes() {
    return this.excludeTxnTypes != null;
  }

  public void setExcludeTxnTypesIsSet(boolean value) {
    if (!value) {
      this.excludeTxnTypes = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXCLUDE_TXN_TYPES:
      if (value == null) {
        unsetExcludeTxnTypes();
      } else {
        setExcludeTxnTypes((java.util.List<TxnType>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXCLUDE_TXN_TYPES:
      return getExcludeTxnTypes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXCLUDE_TXN_TYPES:
      return isSetExcludeTxnTypes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetOpenTxnsRequest)
      return this.equals((GetOpenTxnsRequest)that);
    return false;
  }

  public boolean equals(GetOpenTxnsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_excludeTxnTypes = true && this.isSetExcludeTxnTypes();
    boolean that_present_excludeTxnTypes = true && that.isSetExcludeTxnTypes();
    if (this_present_excludeTxnTypes || that_present_excludeTxnTypes) {
      if (!(this_present_excludeTxnTypes && that_present_excludeTxnTypes))
        return false;
      if (!this.excludeTxnTypes.equals(that.excludeTxnTypes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetExcludeTxnTypes()) ? 131071 : 524287);
    if (isSetExcludeTxnTypes())
      hashCode = hashCode * 8191 + excludeTxnTypes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetOpenTxnsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetExcludeTxnTypes(), other.isSetExcludeTxnTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExcludeTxnTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.excludeTxnTypes, other.excludeTxnTypes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOpenTxnsRequest(");
    boolean first = true;

    if (isSetExcludeTxnTypes()) {
      sb.append("excludeTxnTypes:");
      if (this.excludeTxnTypes == null) {
        sb.append("null");
      } else {
        sb.append(this.excludeTxnTypes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetOpenTxnsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetOpenTxnsRequestStandardScheme getScheme() {
      return new GetOpenTxnsRequestStandardScheme();
    }
  }

  private static class GetOpenTxnsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetOpenTxnsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetOpenTxnsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXCLUDE_TXN_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1592 = iprot.readListBegin();
                struct.excludeTxnTypes = new java.util.ArrayList<TxnType>(_list1592.size);
                @org.apache.thrift.annotation.Nullable TxnType _elem1593;
                for (int _i1594 = 0; _i1594 < _list1592.size; ++_i1594)
                {
                  _elem1593 = org.apache.hadoop.hive.metastore.api.TxnType.findByValue(iprot.readI32());
                  if (_elem1593 != null)
                  {
                    struct.excludeTxnTypes.add(_elem1593);
                  }
                }
                iprot.readListEnd();
              }
              struct.setExcludeTxnTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetOpenTxnsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.excludeTxnTypes != null) {
        if (struct.isSetExcludeTxnTypes()) {
          oprot.writeFieldBegin(EXCLUDE_TXN_TYPES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.excludeTxnTypes.size()));
            for (TxnType _iter1595 : struct.excludeTxnTypes)
            {
              oprot.writeI32(_iter1595.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetOpenTxnsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetOpenTxnsRequestTupleScheme getScheme() {
      return new GetOpenTxnsRequestTupleScheme();
    }
  }

  private static class GetOpenTxnsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetOpenTxnsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetOpenTxnsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetExcludeTxnTypes()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExcludeTxnTypes()) {
        {
          oprot.writeI32(struct.excludeTxnTypes.size());
          for (TxnType _iter1596 : struct.excludeTxnTypes)
          {
            oprot.writeI32(_iter1596.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetOpenTxnsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list1597 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.excludeTxnTypes = new java.util.ArrayList<TxnType>(_list1597.size);
          @org.apache.thrift.annotation.Nullable TxnType _elem1598;
          for (int _i1599 = 0; _i1599 < _list1597.size; ++_i1599)
          {
            _elem1598 = org.apache.hadoop.hive.metastore.api.TxnType.findByValue(iprot.readI32());
            if (_elem1598 != null)
            {
              struct.excludeTxnTypes.add(_elem1598);
            }
          }
        }
        struct.setExcludeTxnTypesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

