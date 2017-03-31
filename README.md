# SqltoHive
     CREATE TABLE actor
    ROW FORMAT SERDE
    'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
    STORED AS INPUTFORMAT
    'org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat'
    OUTPUTFORMAT
    'org.apache.hadoop.hive.ql.io.avro.AvroContainerOutputFormat'
    TBLPROPERTIES ('avro.schema.url'='hdfs:///user/d3990782-dev/actor.avsc');
    
    
    LOAD DATA INPATH '/user/d3990782-dev/part-*.avro' OVERWRITE INTO TABLE actor;
refer : https://dwbi.org/etl/bigdata/192-sqoop-import-from-mysql
    
