// ORM class for table 'RTL_CUSTOMER_ACCOUNTS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Mar 31 02:52:39 EDT 2017
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RTL_CUSTOMER_ACCOUNTS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer CA_INTERNAL_CUST_ID;
  public Integer get_CA_INTERNAL_CUST_ID() {
    return CA_INTERNAL_CUST_ID;
  }
  public void set_CA_INTERNAL_CUST_ID(Integer CA_INTERNAL_CUST_ID) {
    this.CA_INTERNAL_CUST_ID = CA_INTERNAL_CUST_ID;
  }
  public RTL_CUSTOMER_ACCOUNTS with_CA_INTERNAL_CUST_ID(Integer CA_INTERNAL_CUST_ID) {
    this.CA_INTERNAL_CUST_ID = CA_INTERNAL_CUST_ID;
    return this;
  }
  private Integer CA_ACCT_ID;
  public Integer get_CA_ACCT_ID() {
    return CA_ACCT_ID;
  }
  public void set_CA_ACCT_ID(Integer CA_ACCT_ID) {
    this.CA_ACCT_ID = CA_ACCT_ID;
  }
  public RTL_CUSTOMER_ACCOUNTS with_CA_ACCT_ID(Integer CA_ACCT_ID) {
    this.CA_ACCT_ID = CA_ACCT_ID;
    return this;
  }
  private String CA_TYPE_CD;
  public String get_CA_TYPE_CD() {
    return CA_TYPE_CD;
  }
  public void set_CA_TYPE_CD(String CA_TYPE_CD) {
    this.CA_TYPE_CD = CA_TYPE_CD;
  }
  public RTL_CUSTOMER_ACCOUNTS with_CA_TYPE_CD(String CA_TYPE_CD) {
    this.CA_TYPE_CD = CA_TYPE_CD;
    return this;
  }
  private java.sql.Timestamp CA_CREATED_DT;
  public java.sql.Timestamp get_CA_CREATED_DT() {
    return CA_CREATED_DT;
  }
  public void set_CA_CREATED_DT(java.sql.Timestamp CA_CREATED_DT) {
    this.CA_CREATED_DT = CA_CREATED_DT;
  }
  public RTL_CUSTOMER_ACCOUNTS with_CA_CREATED_DT(java.sql.Timestamp CA_CREATED_DT) {
    this.CA_CREATED_DT = CA_CREATED_DT;
    return this;
  }
  private java.sql.Timestamp CA_END_DT;
  public java.sql.Timestamp get_CA_END_DT() {
    return CA_END_DT;
  }
  public void set_CA_END_DT(java.sql.Timestamp CA_END_DT) {
    this.CA_END_DT = CA_END_DT;
  }
  public RTL_CUSTOMER_ACCOUNTS with_CA_END_DT(java.sql.Timestamp CA_END_DT) {
    this.CA_END_DT = CA_END_DT;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RTL_CUSTOMER_ACCOUNTS)) {
      return false;
    }
    RTL_CUSTOMER_ACCOUNTS that = (RTL_CUSTOMER_ACCOUNTS) o;
    boolean equal = true;
    equal = equal && (this.CA_INTERNAL_CUST_ID == null ? that.CA_INTERNAL_CUST_ID == null : this.CA_INTERNAL_CUST_ID.equals(that.CA_INTERNAL_CUST_ID));
    equal = equal && (this.CA_ACCT_ID == null ? that.CA_ACCT_ID == null : this.CA_ACCT_ID.equals(that.CA_ACCT_ID));
    equal = equal && (this.CA_TYPE_CD == null ? that.CA_TYPE_CD == null : this.CA_TYPE_CD.equals(that.CA_TYPE_CD));
    equal = equal && (this.CA_CREATED_DT == null ? that.CA_CREATED_DT == null : this.CA_CREATED_DT.equals(that.CA_CREATED_DT));
    equal = equal && (this.CA_END_DT == null ? that.CA_END_DT == null : this.CA_END_DT.equals(that.CA_END_DT));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RTL_CUSTOMER_ACCOUNTS)) {
      return false;
    }
    RTL_CUSTOMER_ACCOUNTS that = (RTL_CUSTOMER_ACCOUNTS) o;
    boolean equal = true;
    equal = equal && (this.CA_INTERNAL_CUST_ID == null ? that.CA_INTERNAL_CUST_ID == null : this.CA_INTERNAL_CUST_ID.equals(that.CA_INTERNAL_CUST_ID));
    equal = equal && (this.CA_ACCT_ID == null ? that.CA_ACCT_ID == null : this.CA_ACCT_ID.equals(that.CA_ACCT_ID));
    equal = equal && (this.CA_TYPE_CD == null ? that.CA_TYPE_CD == null : this.CA_TYPE_CD.equals(that.CA_TYPE_CD));
    equal = equal && (this.CA_CREATED_DT == null ? that.CA_CREATED_DT == null : this.CA_CREATED_DT.equals(that.CA_CREATED_DT));
    equal = equal && (this.CA_END_DT == null ? that.CA_END_DT == null : this.CA_END_DT.equals(that.CA_END_DT));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CA_INTERNAL_CUST_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CA_ACCT_ID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.CA_TYPE_CD = JdbcWritableBridge.readString(3, __dbResults);
    this.CA_CREATED_DT = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.CA_END_DT = JdbcWritableBridge.readTimestamp(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CA_INTERNAL_CUST_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CA_ACCT_ID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.CA_TYPE_CD = JdbcWritableBridge.readString(3, __dbResults);
    this.CA_CREATED_DT = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.CA_END_DT = JdbcWritableBridge.readTimestamp(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CA_INTERNAL_CUST_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CA_ACCT_ID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CA_TYPE_CD, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CA_CREATED_DT, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CA_END_DT, 5 + __off, 93, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CA_INTERNAL_CUST_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CA_ACCT_ID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CA_TYPE_CD, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CA_CREATED_DT, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CA_END_DT, 5 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CA_INTERNAL_CUST_ID = null;
    } else {
    this.CA_INTERNAL_CUST_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CA_ACCT_ID = null;
    } else {
    this.CA_ACCT_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CA_TYPE_CD = null;
    } else {
    this.CA_TYPE_CD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CA_CREATED_DT = null;
    } else {
    this.CA_CREATED_DT = new Timestamp(__dataIn.readLong());
    this.CA_CREATED_DT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CA_END_DT = null;
    } else {
    this.CA_END_DT = new Timestamp(__dataIn.readLong());
    this.CA_END_DT.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CA_INTERNAL_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CA_INTERNAL_CUST_ID);
    }
    if (null == this.CA_ACCT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CA_ACCT_ID);
    }
    if (null == this.CA_TYPE_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CA_TYPE_CD);
    }
    if (null == this.CA_CREATED_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CA_CREATED_DT.getTime());
    __dataOut.writeInt(this.CA_CREATED_DT.getNanos());
    }
    if (null == this.CA_END_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CA_END_DT.getTime());
    __dataOut.writeInt(this.CA_END_DT.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CA_INTERNAL_CUST_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CA_INTERNAL_CUST_ID);
    }
    if (null == this.CA_ACCT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CA_ACCT_ID);
    }
    if (null == this.CA_TYPE_CD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CA_TYPE_CD);
    }
    if (null == this.CA_CREATED_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CA_CREATED_DT.getTime());
    __dataOut.writeInt(this.CA_CREATED_DT.getNanos());
    }
    if (null == this.CA_END_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CA_END_DT.getTime());
    __dataOut.writeInt(this.CA_END_DT.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CA_INTERNAL_CUST_ID==null?"null":"" + CA_INTERNAL_CUST_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_ACCT_ID==null?"null":"" + CA_ACCT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_TYPE_CD==null?"null":CA_TYPE_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_CREATED_DT==null?"null":"" + CA_CREATED_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_END_DT==null?"null":"" + CA_END_DT, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CA_INTERNAL_CUST_ID==null?"null":"" + CA_INTERNAL_CUST_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_ACCT_ID==null?"null":"" + CA_ACCT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_TYPE_CD==null?"null":CA_TYPE_CD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_CREATED_DT==null?"null":"" + CA_CREATED_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CA_END_DT==null?"null":"" + CA_END_DT, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_INTERNAL_CUST_ID = null; } else {
      this.CA_INTERNAL_CUST_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_ACCT_ID = null; } else {
      this.CA_ACCT_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CA_TYPE_CD = null; } else {
      this.CA_TYPE_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_CREATED_DT = null; } else {
      this.CA_CREATED_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_END_DT = null; } else {
      this.CA_END_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_INTERNAL_CUST_ID = null; } else {
      this.CA_INTERNAL_CUST_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_ACCT_ID = null; } else {
      this.CA_ACCT_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CA_TYPE_CD = null; } else {
      this.CA_TYPE_CD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_CREATED_DT = null; } else {
      this.CA_CREATED_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CA_END_DT = null; } else {
      this.CA_END_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    RTL_CUSTOMER_ACCOUNTS o = (RTL_CUSTOMER_ACCOUNTS) super.clone();
    o.CA_CREATED_DT = (o.CA_CREATED_DT != null) ? (java.sql.Timestamp) o.CA_CREATED_DT.clone() : null;
    o.CA_END_DT = (o.CA_END_DT != null) ? (java.sql.Timestamp) o.CA_END_DT.clone() : null;
    return o;
  }

  public void clone0(RTL_CUSTOMER_ACCOUNTS o) throws CloneNotSupportedException {
    o.CA_CREATED_DT = (o.CA_CREATED_DT != null) ? (java.sql.Timestamp) o.CA_CREATED_DT.clone() : null;
    o.CA_END_DT = (o.CA_END_DT != null) ? (java.sql.Timestamp) o.CA_END_DT.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CA_INTERNAL_CUST_ID", this.CA_INTERNAL_CUST_ID);
    __sqoop$field_map.put("CA_ACCT_ID", this.CA_ACCT_ID);
    __sqoop$field_map.put("CA_TYPE_CD", this.CA_TYPE_CD);
    __sqoop$field_map.put("CA_CREATED_DT", this.CA_CREATED_DT);
    __sqoop$field_map.put("CA_END_DT", this.CA_END_DT);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CA_INTERNAL_CUST_ID", this.CA_INTERNAL_CUST_ID);
    __sqoop$field_map.put("CA_ACCT_ID", this.CA_ACCT_ID);
    __sqoop$field_map.put("CA_TYPE_CD", this.CA_TYPE_CD);
    __sqoop$field_map.put("CA_CREATED_DT", this.CA_CREATED_DT);
    __sqoop$field_map.put("CA_END_DT", this.CA_END_DT);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CA_INTERNAL_CUST_ID".equals(__fieldName)) {
      this.CA_INTERNAL_CUST_ID = (Integer) __fieldVal;
    }
    else    if ("CA_ACCT_ID".equals(__fieldName)) {
      this.CA_ACCT_ID = (Integer) __fieldVal;
    }
    else    if ("CA_TYPE_CD".equals(__fieldName)) {
      this.CA_TYPE_CD = (String) __fieldVal;
    }
    else    if ("CA_CREATED_DT".equals(__fieldName)) {
      this.CA_CREATED_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("CA_END_DT".equals(__fieldName)) {
      this.CA_END_DT = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("CA_INTERNAL_CUST_ID".equals(__fieldName)) {
      this.CA_INTERNAL_CUST_ID = (Integer) __fieldVal;
      return true;
    }
    else    if ("CA_ACCT_ID".equals(__fieldName)) {
      this.CA_ACCT_ID = (Integer) __fieldVal;
      return true;
    }
    else    if ("CA_TYPE_CD".equals(__fieldName)) {
      this.CA_TYPE_CD = (String) __fieldVal;
      return true;
    }
    else    if ("CA_CREATED_DT".equals(__fieldName)) {
      this.CA_CREATED_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("CA_END_DT".equals(__fieldName)) {
      this.CA_END_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
