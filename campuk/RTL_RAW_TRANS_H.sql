Create Table RTL_RAW_TRANS_H(RTH_ACCT_ID int,
RTH_PERIOD_ID int,
RTH_APP_SOURCE_CD varchar(6),
RTH_ORIG_SOURCE_CD varchar(6),
RTH_RC_CD varchar(10),
RTH_VALUE_DT timestamp,
RTH_POST_DT timestamp,
RTH_TRAN_CD varchar(6),
RTH_TRAN_TYPE varchar(4),
RTH_CONV_TRAN_AMT int,
RTH_CONV_CASH_AMT int,
RTH_REF_NO varchar(30),
RTH_BR_ATM_NO varchar(10),
RTH_TELLER_ATM_NO varchar(10),
RTH_CHECK_NO int,
RTH_NO_OF_CHECKS int,
RTH_DC_IND varchar(1),
RTH_ORIG_TRAN_AMT int,
RTH_ORIG_CASH_AMT int,
RTH_CURRENCY_CD varchar(3),
RTH_EXCHANGE_RT int,
RTH_OVERSEAS_IND varchar(1),
RTH_BEN_ACCT_NO varchar(34),
RTH_BEN_ACCT_NAME varchar(50),
RTH_TRAN_DESC varchar(70),
RTH_ORG_FLAG varchar(1),
RTH_ORG varchar(210),
RTH_ORG_BNK_FLAG varchar(1),
RTH_ORG_BNK varchar(210),
RTH_SND_BNK_FLAG varchar(1),
RTH_SND_BNK varchar(210),
RTH_BEN_BNK_FLAG varchar(1),
RTH_BEN_BNK varchar(210),
RTH_BEN_FLAG varchar(1),
RTH_BEN varchar(210),
RTH_IBK_FLAG varchar(1),
RTH_IBK varchar(210),
RTH_TRI_FLAG varchar(1),
RTH_TRI varchar(210),
RTH_SENDER_CORR_FLAG varchar(1),
RTH_SENDER_CORR varchar(210),
RTH_RECEIVER_CORR_FLAG varchar(1),
RTH_RECEIVER_CORR varchar(210),
RTH_PAYMENT_TYPE varchar(8),
RTH_BANK_TO_BANK varchar(1),
RTH_PAYMENT_DTLS varchar(1000),
RTH_SQLLOADER_ID timestamp,
RTH_FILE_TYPE varchar(1),
RTH_RUN_NO varchar(3),
RTH_UNIQUE_CD int,
RTH_SENDING_BNK_CTRY_CD varchar(2),
RTH_ORIGINATING_BNK_CTRY_CD varchar(2),
RTH_BENEFICIARY_CTRY_CD varchar(2),
RTH_BENEFICIARY_BNK_CTRY_CD varchar(2),
RTH_ORIG_CTRY_CD varchar(2),
RTH_I_BNK_CTRY_CD varchar(2),
RTH_PARTITION_DRIVER_ID int,
RTH_WEEKNUM_IN_MONTH int,
RTH_BEN_BNK_CITY varchar(60),
RTH_BEN_BNK_POSTAL_CD varchar(20),
RTH_BEN_BNK_STATE varchar(20),
RTH_BEN_CITY varchar(60),
RTH_BEN_POSTAL_CD varchar(20),
RTH_BEN_STATE varchar(20),
RTH_I_BNK_CITY varchar(60),
RTH_I_BNK_POSTAL_CD varchar(20),
RTH_I_BNK_STATE varchar(20),
RTH_ORG_BNK_CITY varchar(60),
RTH_ORG_BNK_POSTAL_CD varchar(20),
RTH_ORG_BNK_STATE varchar(20),
RTH_ORG_CITY varchar(60),
RTH_ORG_POSTAL_CD varchar(20),
RTH_ORG_STATE varchar(20),
RTH_PAYMENT_DTLS_CITY varchar(60),
RTH_PAYMENT_DTLS_CTRY_CD varchar(2),
RTH_PAYMENT_DTLS_POPULATED CHAR(1),
RTH_PAYMENT_DTLS_POSTAL_CD varchar(20),
RTH_PAYMENT_DTLS_STATE varchar(20),
RTH_RECEIVER_CORR_CITY varchar(60),
RTH_RECEIVER_CORR_CTRY_CD varchar(2),
RTH_RECEIVER_CORR_POSTAL_CD varchar(20),
RTH_RECEIVER_CORR_STATE varchar(20),
RTH_SENDER_CORR_CITY varchar(60),
RTH_SENDER_CORR_CTRY_CD varchar(2),
RTH_SENDER_CORR_POSTAL_CD varchar(20),
RTH_SENDER_CORR_STATE varchar(20),
RTH_SND_BNK_CITY varchar(60),
RTH_SND_BNK_POSTAL_CD varchar(20),
RTH_SND_BNK_STATE varchar(20),
RTH_TRI_CITY varchar(60),
RTH_TRI_CTRY_CD varchar(2),
RTH_TRI_POSTAL_CD varchar(20),
RTH_TRI_STATE varchar(20),
RTH_SENDER_REF_NO varchar(20),
RTH_RELATED_REF_NO varchar(20),
RTH_CHIPFED_REF_NO varchar(75),
RTH_AVAILABLE1 varchar(30),
RTH_AVAILABLE2 varchar(30),
RTH_AVAILABLE3 varchar(30),
RTH_NUM_AVAILABLE1 int,
RTH_NUM_AVAILABLE2 int,
RTH_NUM_AVAILABLE3 int,
RTH_PRIMARY_FLAG varchar(1),
RTH_ORG_CNTR_PARTY_ID int,
RTH_BEN_CNTR_PARTY_ID int,
RTH_PATTERN_ID int,
Primary KEY (RTH_ACCT_ID)
);