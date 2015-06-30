
package test.codemodel;

import java.sql.Timestamp;


/**
 * 通帳入出金明細のDTO
 * 
 */
public class AcCmRdBookData {

    /**
     * 会社ＩＤ
     * 
     */
    private long corpId;
    /**
     * 口座ＩＤ
     * 
     */
    private long bankaccountId;
    /**
     * 対象日付
     * 
     */
    private Timestamp ioDate;
    /**
     * 明細番号
     * 
     */
    private long dtlNo;
    /**
     * 表示番号
     * 
     */
    private long viewNo;
    /**
     * 入出金区分
     * 
     */
    private int ioDiv;
    /**
     * 前残
     * 
     */
    private double lastBalance;
    /**
     * 取引額
     * 
     */
    private double amount;
    /**
     * 入金額
     * 
     */
    private double dAmount;
    /**
     * 出金額
     * 
     */
    private double cAmount;
    /**
     * 残高
     * 
     */
    private double balance;
    /**
     * 国コード
     * 
     */
    private String nationCode;
    /**
     * 銀行コード
     * 
     */
    private String bankCode;
    /**
     * 銀行名称
     * 
     */
    private String bankName;
    /**
     * 支店コード
     * 
     */
    private String branchCode;
    /**
     * 支店名称
     * 
     */
    private String branchName;
    /**
     * 口座用途コード
     * 
     */
    private String accountUseCode;
    /**
     * 口座用途名称
     * 
     */
    private String accountUseName;
    /**
     * 口座識別コード
     * 
     */
    private String bankIdCode;
    /**
     * 口座識別名称
     * 
     */
    private String bankIdName;
    /**
     * 口座種別
     * 
     */
    private long accountType;
    /**
     * 口座番号
     * 
     */
    private String accountNum;
    /**
     * 口座名義人（カナ）
     * 
     */
    private String accountName;
    /**
     * 通貨区分
     * 
     */
    private int currencyDiv;
    /**
     * 通貨コード
     * 
     */
    private String currencyCode;
    /**
     * 通貨名称
     * 
     */
    private String currencyName;
    /**
     * 通貨記号
     * 
     */
    private String currencyMark;
    /**
     * 通貨桁
     * 
     */
    private int decimalCount;
    /**
     * 資金移動区分
     * 
     */
    private int fndTransDiv;
    /**
     * 取引先ＩＤ
     * 
     */
    private long rdCustomerId;
    /**
     * 取引先コード
     * 
     */
    private String rdCustomerCode;
    /**
     * 取引先名称
     * 
     */
    private String rdCustomerName;
    /**
     * 相手自社口座-会社ＩＤ
     * 
     */
    private long pCorpId;
    /**
     * 相手自社口座-口座ＩＤ
     * 
     */
    private long pBankaccountId;
    /**
     * 相手自社口座-対象日付
     * 
     */
    private Timestamp pIoDate;
    /**
     * 相手自社口座-明細番号
     * 
     */
    private long pDtlNo;
    /**
     * 口座管理責任部門ＩＤ
     * 
     */
    private long dSectionId;
    /**
     * 口座管理責任部門コード
     * 
     */
    private String dSectionCode;
    /**
     * 口座管理責任部門名称
     * 
     */
    private String dSectionName;
    /**
     * 負担部門ＩＤ
     * 
     */
    private long sectionId;
    /**
     * 負担部門コード
     * 
     */
    private String sectionCode;
    /**
     * 負担部門名称
     * 
     */
    private String sectionName;
    /**
     * 事業所ＩＤ
     * 
     */
    private long bssecId;
    /**
     * 事業所コード
     * 
     */
    private String bssecCode;
    /**
     * 事業所名称
     * 
     */
    private String bssecName;
    /**
     * 請求書番号
     * 
     */
    private String demandNo;
    /**
     * 取引区分
     * 
     */
    private int dealDiv;
    /**
     * うち他店券金額
     * 
     */
    private double outAmount;
    /**
     * 交換提示日
     * 
     */
    private Timestamp exDateFmt;
    /**
     * 不渡返還日
     * 
     */
    private Timestamp noexDateFmt;
    /**
     * 手形・小切手区分
     * 
     */
    private int checkDiv;
    /**
     * 手形・小切手番号
     * 
     */
    private String checkNo;
    /**
     * 僚店番号
     * 
     */
    private String dealBranchCode;
    /**
     * 振込依頼人コード
     * 
     */
    private String clientCode;
    /**
     * 振込依頼人名
     * 
     */
    private String clientName;
    /**
     * 仕向銀行名
     * 
     */
    private String leadBankName;
    /**
     * 仕向店名
     * 
     */
    private String leadBranchName;
    /**
     * 摘要内容
     * 
     */
    private String memo;
    /**
     * 摘要内容(修正後)
     * 
     */
    private String formalMemo;
    /**
     * ＥＤＩ情報
     * 
     */
    private String ediInfo;
    /**
     * 備考
     * 
     */
    private String memoText;
    /**
     * 仮想口座支店コード
     * 
     */
    private String virtualbranchCode;
    /**
     * 仮想口座番号
     * 
     */
    private String virtualaccountNum;
    /**
     * 取引番号
     * 
     */
    private String dealingId;
    /**
     * 明細区分
     * 
     */
    private int dtlCondDiv;
    /**
     * 記帳元区分
     * 
     */
    private int enterDiv;
    /**
     * 連携元キー
     * 
     */
    private long originKey;
    /**
     * 勘定日
     * 
     */
    private Timestamp acDate;
    /**
     * 記帳処理日付
     * 
     */
    private Timestamp enterProcDate;
    /**
     * 記帳処理No
     * 
     */
    private long enterProcNo;
    /**
     * 記帳処理区分
     * 
     */
    private int enterProcDiv;
    /**
     * 記帳承認ＩＤ
     * 
     */
    private long enterAppId;
    /**
     * 記帳承認ステータス
     * 
     */
    private long enterAppStatus;
    /**
     * 入出金伝票作成承認ＩＤ
     * 
     */
    private long ioslipAppId;
    /**
     * 入出金伝票作成承認ステータス
     * 
     */
    private long ioslipAppStatus;
    /**
     * 振替伝票作成承認ＩＤ
     * 
     */
    private long transslipAppId;
    /**
     * 振替伝票作成承認ステータス
     * 
     */
    private long transslipAppStatus;
    /**
     * メンテナンス区分
     * 
     */
    private int mntDiv;
    /**
     * 入出金種別特定ステータス
     * 
     */
    private int apportStatus;
    /**
     * 入出金種別コード
     * 
     */
    private String rdKindCode;
    /**
     * 入出金種別名称
     * 
     */
    private String rdKindName;
    /**
     * 業務対象区分
     * 
     */
    private int busDiv;
    /**
     * 消費税額
     * 
     */
    private double taxAmount;
    /**
     * 消費税額(基準通貨換算額)
     * 
     */
    private double excTaxAmount;
    /**
     * 振込手数料額
     * 
     */
    private double feeAmount;
    /**
     * 振込手数料額(基準通貨換算額)
     * 
     */
    private double excFeeAmount;
    /**
     * 振込手数料額(消費税)
     * 
     */
    private double feeTaxAmount;
    /**
     * 振込手数料額(消費税)(基準通貨換算額)
     * 
     */
    private double excFeeTaxAmount;
    /**
     * 源泉税額(国税+地方税)
     * 
     */
    private double sTaxAmount;
    /**
     * 源泉税額(国税+地方税)(基準通貨換算額)
     * 
     */
    private double excSTaxAmount;
    /**
     * 源泉税額(国税)
     * 
     */
    private double sTaxnAmount;
    /**
     * 源泉税額(国税)(基準通貨換算額)
     * 
     */
    private double excSTaxnAmount;
    /**
     * 源泉税額(地方税)
     * 
     */
    private double sTaxcAmount;
    /**
     * 源泉税額(地方税)(基準通貨換算額)
     * 
     */
    private double excSTaxcAmount;
    /**
     * 基準通貨換算額
     * 
     */
    private double excAmount;
    /**
     * 為替レート区分
     * 
     */
    private int fRateDiv;
    /**
     * 為替レートタイプコード
     * 
     */
    private String ratetypeCode;
    /**
     * 為替予約レートタイプコード
     * 
     */
    private String fraRatetypeCode;
    /**
     * 為替予約管理番号
     * 
     */
    private long fraNo;
    /**
     * 為替レート入力区分
     * 
     */
    private int fRateInputDiv;
    /**
     * 換算方法区分
     * 
     */
    private int exchangeDiv;
    /**
     * 為替レート値
     * 
     */
    private double fRateValue;
    /**
     * 換算ステータス
     * 
     */
    private int excStatus;
    /**
     * 名寄せ処理ステータス
     * 
     */
    private int identStatus;
    /**
     * 入出金伝票作成ステータス
     * 
     */
    private int ioslipMakeStatus;
    /**
     * 入出金伝票連携ステータス
     * 
     */
    private int ioslipRelStatus;
    /**
     * 入出金照合ステータス
     * 
     */
    private int collationStatus;
    /**
     * 振替伝票作成ステータス
     * 
     */
    private int transslipMakeStatus;
    /**
     * 振替伝票連携ステータス
     * 
     */
    private int transslipRelStatus;
    /**
     * 収支実績作成ステータス
     * 
     */
    private int fndActStatus;
    /**
     * 他部門確認依頼ステータス（入出金伝票）
     * 
     */
    private int ioslipReqStatus;
    /**
     * 確認部門ＩＤ（入出金伝票）
     * 
     */
    private long ioslipReqSectionId;
    /**
     * 確認部門コード
     * 
     */
    private String ioslipReqSectionCode;
    /**
     * 確認部門名称
     * 
     */
    private String ioslipReqSectionName;
    /**
     * 確認依頼コメント
     * 
     */
    private String ioslipReqMemo;
    /**
     * 他部門確認依頼ステータス（入出金照合）
     * 
     */
    private int collationReqStatus;
    /**
     * 確認部門ＩＤ（入出金照合）
     * 
     */
    private long collationReqSectionId;
    /**
     * 関係者メール通知ステータス
     * 
     */
    private int mailSendStatus;
    /**
     * 資金配置連携ステータス
     * 
     */
    private int fndDisposeRelStatus;
    /**
     * プーリング連携ステータス
     * 
     */
    private int cmsPolRelStatus;
    /**
     * CBM入金消込連携ステータス
     * 
     */
    private int cbmClearingRelStatus;
    /**
     * 業務完了ステータス
     * 
     */
    private int finishStatus;
    /**
     * 予備コード1
     * 
     */
    private String extraCode1;
    /**
     * 予備コード2
     * 
     */
    private String extraCode2;
    /**
     * 予備コード3
     * 
     */
    private String extraCode3;
    /**
     * 予備コード4
     * 
     */
    private String extraCode4;
    /**
     * 予備コード5
     * 
     */
    private String extraCode5;
    /**
     * 予備金額1
     * 
     */
    private double extraAmount1;
    /**
     * 予備金額2
     * 
     */
    private double extraAmount2;
    /**
     * 予備金額3
     * 
     */
    private double extraAmount3;
    /**
     * 予備金額4
     * 
     */
    private double extraAmount4;
    /**
     * 予備金額5
     * 
     */
    private double extraAmount5;
    /**
     * 予備区分1
     * 
     */
    private long extraDiv1;
    /**
     * 予備区分2
     * 
     */
    private long extraDiv2;
    /**
     * 予備区分3
     * 
     */
    private long extraDiv3;
    /**
     * 予備区分4
     * 
     */
    private long extraDiv4;
    /**
     * 予備区分5
     * 
     */
    private long extraDiv5;
    /**
     * 予備日付1
     * 
     */
    private Timestamp extraDate1;
    /**
     * 予備日付2
     * 
     */
    private Timestamp extraDate2;
    /**
     * 予備日付3
     * 
     */
    private Timestamp extraDate3;
    /**
     * 予備日付4
     * 
     */
    private Timestamp extraDate4;
    /**
     * 予備日付5
     * 
     */
    private Timestamp extraDate5;
    /**
     * 予備テキスト1
     * 
     */
    private String extraText1;
    /**
     * 予備テキスト2
     * 
     */
    private String extraText2;
    /**
     * 予備テキスト3
     * 
     */
    private String extraText3;
    /**
     * 予備テキスト4
     * 
     */
    private String extraText4;
    /**
     * 予備テキスト5
     * 
     */
    private String extraText5;
    /**
     * 新規登録ユーザーＩＤ
     * 
     */
    private String inputUserId;
    /**
     * 新規登録日時
     * 
     */
    private Timestamp inputDatetime;
    /**
     * 最終更新ユーザーＩＤ
     * 
     */
    private String lastupdateUserId;
    /**
     * 最終更新日時
     * 
     */
    private Timestamp lastupdateDatetime;
    /**
     * 状態フラグ
     * 
     */
    private long recStatus;

    /**
     * コンストラクタ
     * 
     */
    public AcCmRdBookData() {
    }

    /**
     * 会社ＩＤ取得
     * 
     * @return
     *     会社ＩＤ
     */
    public long getCorpId() {
        return corpId;
    }

    /**
     * 会社ＩＤ設定
     * 
     * @param corpId
     */
    public void setCorpId(long corpId) {
        this.corpId = corpId;
    }

    /**
     * 口座ＩＤ取得
     * 
     * @return
     *     口座ＩＤ
     */
    public long getBankaccountId() {
        return bankaccountId;
    }

    /**
     * 口座ＩＤ設定
     * 
     * @param bankaccountId
     */
    public void setBankaccountId(long bankaccountId) {
        this.bankaccountId = bankaccountId;
    }

    /**
     * 対象日付取得
     * 
     * @return
     *     対象日付
     */
    public Timestamp getIoDate() {
        return ioDate;
    }

    /**
     * 対象日付設定
     * 
     * @param ioDate
     */
    public void setIoDate(Timestamp ioDate) {
        this.ioDate = ioDate;
    }

    /**
     * 明細番号取得
     * 
     * @return
     *     明細番号
     */
    public long getDtlNo() {
        return dtlNo;
    }

    /**
     * 明細番号設定
     * 
     * @param dtlNo
     */
    public void setDtlNo(long dtlNo) {
        this.dtlNo = dtlNo;
    }

    /**
     * 表示番号取得
     * 
     * @return
     *     表示番号
     */
    public long getViewNo() {
        return viewNo;
    }

    /**
     * 表示番号設定
     * 
     * @param viewNo
     */
    public void setViewNo(long viewNo) {
        this.viewNo = viewNo;
    }

    /**
     * 入出金区分取得
     * 
     * @return
     *     入出金区分
     */
    public int getIoDiv() {
        return ioDiv;
    }

    /**
     * 入出金区分設定
     * 
     * @param ioDiv
     */
    public void setIoDiv(int ioDiv) {
        this.ioDiv = ioDiv;
    }

    /**
     * 前残取得
     * 
     * @return
     *     前残
     */
    public double getLastBalance() {
        return lastBalance;
    }

    /**
     * 前残設定
     * 
     * @param lastBalance
     */
    public void setLastBalance(double lastBalance) {
        this.lastBalance = lastBalance;
    }

    /**
     * 取引額取得
     * 
     * @return
     *     取引額
     */
    public double getAmount() {
        return amount;
    }

    /**
     * 取引額設定
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * 入金額取得
     * 
     * @return
     *     入金額
     */
    public double getDAmount() {
        return dAmount;
    }

    /**
     * 入金額設定
     * 
     * @param dAmount
     */
    public void setDAmount(double dAmount) {
        this.dAmount = dAmount;
    }

    /**
     * 出金額取得
     * 
     * @return
     *     出金額
     */
    public double getCAmount() {
        return cAmount;
    }

    /**
     * 出金額設定
     * 
     * @param cAmount
     */
    public void setCAmount(double cAmount) {
        this.cAmount = cAmount;
    }

    /**
     * 残高取得
     * 
     * @return
     *     残高
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 残高設定
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 国コード取得
     * 
     * @return
     *     国コード
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * 国コード設定
     * 
     * @param nationCode
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    /**
     * 銀行コード取得
     * 
     * @return
     *     銀行コード
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 銀行コード設定
     * 
     * @param bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 銀行名称取得
     * 
     * @return
     *     銀行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 銀行名称設定
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 支店コード取得
     * 
     * @return
     *     支店コード
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * 支店コード設定
     * 
     * @param branchCode
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * 支店名称取得
     * 
     * @return
     *     支店名称
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 支店名称設定
     * 
     * @param branchName
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * 口座用途コード取得
     * 
     * @return
     *     口座用途コード
     */
    public String getAccountUseCode() {
        return accountUseCode;
    }

    /**
     * 口座用途コード設定
     * 
     * @param accountUseCode
     */
    public void setAccountUseCode(String accountUseCode) {
        this.accountUseCode = accountUseCode;
    }

    /**
     * 口座用途名称取得
     * 
     * @return
     *     口座用途名称
     */
    public String getAccountUseName() {
        return accountUseName;
    }

    /**
     * 口座用途名称設定
     * 
     * @param accountUseName
     */
    public void setAccountUseName(String accountUseName) {
        this.accountUseName = accountUseName;
    }

    /**
     * 口座識別コード取得
     * 
     * @return
     *     口座識別コード
     */
    public String getBankIdCode() {
        return bankIdCode;
    }

    /**
     * 口座識別コード設定
     * 
     * @param bankIdCode
     */
    public void setBankIdCode(String bankIdCode) {
        this.bankIdCode = bankIdCode;
    }

    /**
     * 口座識別名称取得
     * 
     * @return
     *     口座識別名称
     */
    public String getBankIdName() {
        return bankIdName;
    }

    /**
     * 口座識別名称設定
     * 
     * @param bankIdName
     */
    public void setBankIdName(String bankIdName) {
        this.bankIdName = bankIdName;
    }

    /**
     * 口座種別取得
     * 
     * @return
     *     口座種別
     */
    public long getAccountType() {
        return accountType;
    }

    /**
     * 口座種別設定
     * 
     * @param accountType
     */
    public void setAccountType(long accountType) {
        this.accountType = accountType;
    }

    /**
     * 口座番号取得
     * 
     * @return
     *     口座番号
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * 口座番号設定
     * 
     * @param accountNum
     */
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    /**
     * 口座名義人（カナ）取得
     * 
     * @return
     *     口座名義人（カナ）
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 口座名義人（カナ）設定
     * 
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 通貨区分取得
     * 
     * @return
     *     通貨区分
     */
    public int getCurrencyDiv() {
        return currencyDiv;
    }

    /**
     * 通貨区分設定
     * 
     * @param currencyDiv
     */
    public void setCurrencyDiv(int currencyDiv) {
        this.currencyDiv = currencyDiv;
    }

    /**
     * 通貨コード取得
     * 
     * @return
     *     通貨コード
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 通貨コード設定
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 通貨名称取得
     * 
     * @return
     *     通貨名称
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 通貨名称設定
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * 通貨記号取得
     * 
     * @return
     *     通貨記号
     */
    public String getCurrencyMark() {
        return currencyMark;
    }

    /**
     * 通貨記号設定
     * 
     * @param currencyMark
     */
    public void setCurrencyMark(String currencyMark) {
        this.currencyMark = currencyMark;
    }

    /**
     * 通貨桁取得
     * 
     * @return
     *     通貨桁
     */
    public int getDecimalCount() {
        return decimalCount;
    }

    /**
     * 通貨桁設定
     * 
     * @param decimalCount
     */
    public void setDecimalCount(int decimalCount) {
        this.decimalCount = decimalCount;
    }

    /**
     * 資金移動区分取得
     * 
     * @return
     *     資金移動区分
     */
    public int getFndTransDiv() {
        return fndTransDiv;
    }

    /**
     * 資金移動区分設定
     * 
     * @param fndTransDiv
     */
    public void setFndTransDiv(int fndTransDiv) {
        this.fndTransDiv = fndTransDiv;
    }

    /**
     * 取引先ＩＤ取得
     * 
     * @return
     *     取引先ＩＤ
     */
    public long getRdCustomerId() {
        return rdCustomerId;
    }

    /**
     * 取引先ＩＤ設定
     * 
     * @param rdCustomerId
     */
    public void setRdCustomerId(long rdCustomerId) {
        this.rdCustomerId = rdCustomerId;
    }

    /**
     * 取引先コード取得
     * 
     * @return
     *     取引先コード
     */
    public String getRdCustomerCode() {
        return rdCustomerCode;
    }

    /**
     * 取引先コード設定
     * 
     * @param rdCustomerCode
     */
    public void setRdCustomerCode(String rdCustomerCode) {
        this.rdCustomerCode = rdCustomerCode;
    }

    /**
     * 取引先名称取得
     * 
     * @return
     *     取引先名称
     */
    public String getRdCustomerName() {
        return rdCustomerName;
    }

    /**
     * 取引先名称設定
     * 
     * @param rdCustomerName
     */
    public void setRdCustomerName(String rdCustomerName) {
        this.rdCustomerName = rdCustomerName;
    }

    /**
     * 相手自社口座-会社ＩＤ取得
     * 
     * @return
     *     相手自社口座-会社ＩＤ
     */
    public long getPCorpId() {
        return pCorpId;
    }

    /**
     * 相手自社口座-会社ＩＤ設定
     * 
     * @param pCorpId
     */
    public void setPCorpId(long pCorpId) {
        this.pCorpId = pCorpId;
    }

    /**
     * 相手自社口座-口座ＩＤ取得
     * 
     * @return
     *     相手自社口座-口座ＩＤ
     */
    public long getPBankaccountId() {
        return pBankaccountId;
    }

    /**
     * 相手自社口座-口座ＩＤ設定
     * 
     * @param pBankaccountId
     */
    public void setPBankaccountId(long pBankaccountId) {
        this.pBankaccountId = pBankaccountId;
    }

    /**
     * 相手自社口座-対象日付取得
     * 
     * @return
     *     相手自社口座-対象日付
     */
    public Timestamp getPIoDate() {
        return pIoDate;
    }

    /**
     * 相手自社口座-対象日付設定
     * 
     * @param pIoDate
     */
    public void setPIoDate(Timestamp pIoDate) {
        this.pIoDate = pIoDate;
    }

    /**
     * 相手自社口座-明細番号取得
     * 
     * @return
     *     相手自社口座-明細番号
     */
    public long getPDtlNo() {
        return pDtlNo;
    }

    /**
     * 相手自社口座-明細番号設定
     * 
     * @param pDtlNo
     */
    public void setPDtlNo(long pDtlNo) {
        this.pDtlNo = pDtlNo;
    }

    /**
     * 口座管理責任部門ＩＤ取得
     * 
     * @return
     *     口座管理責任部門ＩＤ
     */
    public long getDSectionId() {
        return dSectionId;
    }

    /**
     * 口座管理責任部門ＩＤ設定
     * 
     * @param dSectionId
     */
    public void setDSectionId(long dSectionId) {
        this.dSectionId = dSectionId;
    }

    /**
     * 口座管理責任部門コード取得
     * 
     * @return
     *     口座管理責任部門コード
     */
    public String getDSectionCode() {
        return dSectionCode;
    }

    /**
     * 口座管理責任部門コード設定
     * 
     * @param dSectionCode
     */
    public void setDSectionCode(String dSectionCode) {
        this.dSectionCode = dSectionCode;
    }

    /**
     * 口座管理責任部門名称取得
     * 
     * @return
     *     口座管理責任部門名称
     */
    public String getDSectionName() {
        return dSectionName;
    }

    /**
     * 口座管理責任部門名称設定
     * 
     * @param dSectionName
     */
    public void setDSectionName(String dSectionName) {
        this.dSectionName = dSectionName;
    }

    /**
     * 負担部門ＩＤ取得
     * 
     * @return
     *     負担部門ＩＤ
     */
    public long getSectionId() {
        return sectionId;
    }

    /**
     * 負担部門ＩＤ設定
     * 
     * @param sectionId
     */
    public void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 負担部門コード取得
     * 
     * @return
     *     負担部門コード
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * 負担部門コード設定
     * 
     * @param sectionCode
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /**
     * 負担部門名称取得
     * 
     * @return
     *     負担部門名称
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * 負担部門名称設定
     * 
     * @param sectionName
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * 事業所ＩＤ取得
     * 
     * @return
     *     事業所ＩＤ
     */
    public long getBssecId() {
        return bssecId;
    }

    /**
     * 事業所ＩＤ設定
     * 
     * @param bssecId
     */
    public void setBssecId(long bssecId) {
        this.bssecId = bssecId;
    }

    /**
     * 事業所コード取得
     * 
     * @return
     *     事業所コード
     */
    public String getBssecCode() {
        return bssecCode;
    }

    /**
     * 事業所コード設定
     * 
     * @param bssecCode
     */
    public void setBssecCode(String bssecCode) {
        this.bssecCode = bssecCode;
    }

    /**
     * 事業所名称取得
     * 
     * @return
     *     事業所名称
     */
    public String getBssecName() {
        return bssecName;
    }

    /**
     * 事業所名称設定
     * 
     * @param bssecName
     */
    public void setBssecName(String bssecName) {
        this.bssecName = bssecName;
    }

    /**
     * 請求書番号取得
     * 
     * @return
     *     請求書番号
     */
    public String getDemandNo() {
        return demandNo;
    }

    /**
     * 請求書番号設定
     * 
     * @param demandNo
     */
    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }

    /**
     * 取引区分取得
     * 
     * @return
     *     取引区分
     */
    public int getDealDiv() {
        return dealDiv;
    }

    /**
     * 取引区分設定
     * 
     * @param dealDiv
     */
    public void setDealDiv(int dealDiv) {
        this.dealDiv = dealDiv;
    }

    /**
     * うち他店券金額取得
     * 
     * @return
     *     うち他店券金額
     */
    public double getOutAmount() {
        return outAmount;
    }

    /**
     * うち他店券金額設定
     * 
     * @param outAmount
     */
    public void setOutAmount(double outAmount) {
        this.outAmount = outAmount;
    }

    /**
     * 交換提示日取得
     * 
     * @return
     *     交換提示日
     */
    public Timestamp getExDateFmt() {
        return exDateFmt;
    }

    /**
     * 交換提示日設定
     * 
     * @param exDateFmt
     */
    public void setExDateFmt(Timestamp exDateFmt) {
        this.exDateFmt = exDateFmt;
    }

    /**
     * 不渡返還日取得
     * 
     * @return
     *     不渡返還日
     */
    public Timestamp getNoexDateFmt() {
        return noexDateFmt;
    }

    /**
     * 不渡返還日設定
     * 
     * @param noexDateFmt
     */
    public void setNoexDateFmt(Timestamp noexDateFmt) {
        this.noexDateFmt = noexDateFmt;
    }

    /**
     * 手形・小切手区分取得
     * 
     * @return
     *     手形・小切手区分
     */
    public int getCheckDiv() {
        return checkDiv;
    }

    /**
     * 手形・小切手区分設定
     * 
     * @param checkDiv
     */
    public void setCheckDiv(int checkDiv) {
        this.checkDiv = checkDiv;
    }

    /**
     * 手形・小切手番号取得
     * 
     * @return
     *     手形・小切手番号
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * 手形・小切手番号設定
     * 
     * @param checkNo
     */
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    /**
     * 僚店番号取得
     * 
     * @return
     *     僚店番号
     */
    public String getDealBranchCode() {
        return dealBranchCode;
    }

    /**
     * 僚店番号設定
     * 
     * @param dealBranchCode
     */
    public void setDealBranchCode(String dealBranchCode) {
        this.dealBranchCode = dealBranchCode;
    }

    /**
     * 振込依頼人コード取得
     * 
     * @return
     *     振込依頼人コード
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * 振込依頼人コード設定
     * 
     * @param clientCode
     */
    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    /**
     * 振込依頼人名取得
     * 
     * @return
     *     振込依頼人名
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 振込依頼人名設定
     * 
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * 仕向銀行名取得
     * 
     * @return
     *     仕向銀行名
     */
    public String getLeadBankName() {
        return leadBankName;
    }

    /**
     * 仕向銀行名設定
     * 
     * @param leadBankName
     */
    public void setLeadBankName(String leadBankName) {
        this.leadBankName = leadBankName;
    }

    /**
     * 仕向店名取得
     * 
     * @return
     *     仕向店名
     */
    public String getLeadBranchName() {
        return leadBranchName;
    }

    /**
     * 仕向店名設定
     * 
     * @param leadBranchName
     */
    public void setLeadBranchName(String leadBranchName) {
        this.leadBranchName = leadBranchName;
    }

    /**
     * 摘要内容取得
     * 
     * @return
     *     摘要内容
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 摘要内容設定
     * 
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 摘要内容(修正後)取得
     * 
     * @return
     *     摘要内容(修正後)
     */
    public String getFormalMemo() {
        return formalMemo;
    }

    /**
     * 摘要内容(修正後)設定
     * 
     * @param formalMemo
     */
    public void setFormalMemo(String formalMemo) {
        this.formalMemo = formalMemo;
    }

    /**
     * ＥＤＩ情報取得
     * 
     * @return
     *     ＥＤＩ情報
     */
    public String getEdiInfo() {
        return ediInfo;
    }

    /**
     * ＥＤＩ情報設定
     * 
     * @param ediInfo
     */
    public void setEdiInfo(String ediInfo) {
        this.ediInfo = ediInfo;
    }

    /**
     * 備考取得
     * 
     * @return
     *     備考
     */
    public String getMemoText() {
        return memoText;
    }

    /**
     * 備考設定
     * 
     * @param memoText
     */
    public void setMemoText(String memoText) {
        this.memoText = memoText;
    }

    /**
     * 仮想口座支店コード取得
     * 
     * @return
     *     仮想口座支店コード
     */
    public String getVirtualbranchCode() {
        return virtualbranchCode;
    }

    /**
     * 仮想口座支店コード設定
     * 
     * @param virtualbranchCode
     */
    public void setVirtualbranchCode(String virtualbranchCode) {
        this.virtualbranchCode = virtualbranchCode;
    }

    /**
     * 仮想口座番号取得
     * 
     * @return
     *     仮想口座番号
     */
    public String getVirtualaccountNum() {
        return virtualaccountNum;
    }

    /**
     * 仮想口座番号設定
     * 
     * @param virtualaccountNum
     */
    public void setVirtualaccountNum(String virtualaccountNum) {
        this.virtualaccountNum = virtualaccountNum;
    }

    /**
     * 取引番号取得
     * 
     * @return
     *     取引番号
     */
    public String getDealingId() {
        return dealingId;
    }

    /**
     * 取引番号設定
     * 
     * @param dealingId
     */
    public void setDealingId(String dealingId) {
        this.dealingId = dealingId;
    }

    /**
     * 明細区分取得
     * 
     * @return
     *     明細区分
     */
    public int getDtlCondDiv() {
        return dtlCondDiv;
    }

    /**
     * 明細区分設定
     * 
     * @param dtlCondDiv
     */
    public void setDtlCondDiv(int dtlCondDiv) {
        this.dtlCondDiv = dtlCondDiv;
    }

    /**
     * 記帳元区分取得
     * 
     * @return
     *     記帳元区分
     */
    public int getEnterDiv() {
        return enterDiv;
    }

    /**
     * 記帳元区分設定
     * 
     * @param enterDiv
     */
    public void setEnterDiv(int enterDiv) {
        this.enterDiv = enterDiv;
    }

    /**
     * 連携元キー取得
     * 
     * @return
     *     連携元キー
     */
    public long getOriginKey() {
        return originKey;
    }

    /**
     * 連携元キー設定
     * 
     * @param originKey
     */
    public void setOriginKey(long originKey) {
        this.originKey = originKey;
    }

    /**
     * 勘定日取得
     * 
     * @return
     *     勘定日
     */
    public Timestamp getAcDate() {
        return acDate;
    }

    /**
     * 勘定日設定
     * 
     * @param acDate
     */
    public void setAcDate(Timestamp acDate) {
        this.acDate = acDate;
    }

    /**
     * 記帳処理日付取得
     * 
     * @return
     *     記帳処理日付
     */
    public Timestamp getEnterProcDate() {
        return enterProcDate;
    }

    /**
     * 記帳処理日付設定
     * 
     * @param enterProcDate
     */
    public void setEnterProcDate(Timestamp enterProcDate) {
        this.enterProcDate = enterProcDate;
    }

    /**
     * 記帳処理No取得
     * 
     * @return
     *     記帳処理No
     */
    public long getEnterProcNo() {
        return enterProcNo;
    }

    /**
     * 記帳処理No設定
     * 
     * @param enterProcNo
     */
    public void setEnterProcNo(long enterProcNo) {
        this.enterProcNo = enterProcNo;
    }

    /**
     * 記帳処理区分取得
     * 
     * @return
     *     記帳処理区分
     */
    public int getEnterProcDiv() {
        return enterProcDiv;
    }

    /**
     * 記帳処理区分設定
     * 
     * @param enterProcDiv
     */
    public void setEnterProcDiv(int enterProcDiv) {
        this.enterProcDiv = enterProcDiv;
    }

    /**
     * 記帳承認ＩＤ取得
     * 
     * @return
     *     記帳承認ＩＤ
     */
    public long getEnterAppId() {
        return enterAppId;
    }

    /**
     * 記帳承認ＩＤ設定
     * 
     * @param enterAppId
     */
    public void setEnterAppId(long enterAppId) {
        this.enterAppId = enterAppId;
    }

    /**
     * 記帳承認ステータス取得
     * 
     * @return
     *     記帳承認ステータス
     */
    public long getEnterAppStatus() {
        return enterAppStatus;
    }

    /**
     * 記帳承認ステータス設定
     * 
     * @param enterAppStatus
     */
    public void setEnterAppStatus(long enterAppStatus) {
        this.enterAppStatus = enterAppStatus;
    }

    /**
     * 入出金伝票作成承認ＩＤ取得
     * 
     * @return
     *     入出金伝票作成承認ＩＤ
     */
    public long getIoslipAppId() {
        return ioslipAppId;
    }

    /**
     * 入出金伝票作成承認ＩＤ設定
     * 
     * @param ioslipAppId
     */
    public void setIoslipAppId(long ioslipAppId) {
        this.ioslipAppId = ioslipAppId;
    }

    /**
     * 入出金伝票作成承認ステータス取得
     * 
     * @return
     *     入出金伝票作成承認ステータス
     */
    public long getIoslipAppStatus() {
        return ioslipAppStatus;
    }

    /**
     * 入出金伝票作成承認ステータス設定
     * 
     * @param ioslipAppStatus
     */
    public void setIoslipAppStatus(long ioslipAppStatus) {
        this.ioslipAppStatus = ioslipAppStatus;
    }

    /**
     * 振替伝票作成承認ＩＤ取得
     * 
     * @return
     *     振替伝票作成承認ＩＤ
     */
    public long getTransslipAppId() {
        return transslipAppId;
    }

    /**
     * 振替伝票作成承認ＩＤ設定
     * 
     * @param transslipAppId
     */
    public void setTransslipAppId(long transslipAppId) {
        this.transslipAppId = transslipAppId;
    }

    /**
     * 振替伝票作成承認ステータス取得
     * 
     * @return
     *     振替伝票作成承認ステータス
     */
    public long getTransslipAppStatus() {
        return transslipAppStatus;
    }

    /**
     * 振替伝票作成承認ステータス設定
     * 
     * @param transslipAppStatus
     */
    public void setTransslipAppStatus(long transslipAppStatus) {
        this.transslipAppStatus = transslipAppStatus;
    }

    /**
     * メンテナンス区分取得
     * 
     * @return
     *     メンテナンス区分
     */
    public int getMntDiv() {
        return mntDiv;
    }

    /**
     * メンテナンス区分設定
     * 
     * @param mntDiv
     */
    public void setMntDiv(int mntDiv) {
        this.mntDiv = mntDiv;
    }

    /**
     * 入出金種別特定ステータス取得
     * 
     * @return
     *     入出金種別特定ステータス
     */
    public int getApportStatus() {
        return apportStatus;
    }

    /**
     * 入出金種別特定ステータス設定
     * 
     * @param apportStatus
     */
    public void setApportStatus(int apportStatus) {
        this.apportStatus = apportStatus;
    }

    /**
     * 入出金種別コード取得
     * 
     * @return
     *     入出金種別コード
     */
    public String getRdKindCode() {
        return rdKindCode;
    }

    /**
     * 入出金種別コード設定
     * 
     * @param rdKindCode
     */
    public void setRdKindCode(String rdKindCode) {
        this.rdKindCode = rdKindCode;
    }

    /**
     * 入出金種別名称取得
     * 
     * @return
     *     入出金種別名称
     */
    public String getRdKindName() {
        return rdKindName;
    }

    /**
     * 入出金種別名称設定
     * 
     * @param rdKindName
     */
    public void setRdKindName(String rdKindName) {
        this.rdKindName = rdKindName;
    }

    /**
     * 業務対象区分取得
     * 
     * @return
     *     業務対象区分
     */
    public int getBusDiv() {
        return busDiv;
    }

    /**
     * 業務対象区分設定
     * 
     * @param busDiv
     */
    public void setBusDiv(int busDiv) {
        this.busDiv = busDiv;
    }

    /**
     * 消費税額取得
     * 
     * @return
     *     消費税額
     */
    public double getTaxAmount() {
        return taxAmount;
    }

    /**
     * 消費税額設定
     * 
     * @param taxAmount
     */
    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * 消費税額(基準通貨換算額)取得
     * 
     * @return
     *     消費税額(基準通貨換算額)
     */
    public double getExcTaxAmount() {
        return excTaxAmount;
    }

    /**
     * 消費税額(基準通貨換算額)設定
     * 
     * @param excTaxAmount
     */
    public void setExcTaxAmount(double excTaxAmount) {
        this.excTaxAmount = excTaxAmount;
    }

    /**
     * 振込手数料額取得
     * 
     * @return
     *     振込手数料額
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * 振込手数料額設定
     * 
     * @param feeAmount
     */
    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * 振込手数料額(基準通貨換算額)取得
     * 
     * @return
     *     振込手数料額(基準通貨換算額)
     */
    public double getExcFeeAmount() {
        return excFeeAmount;
    }

    /**
     * 振込手数料額(基準通貨換算額)設定
     * 
     * @param excFeeAmount
     */
    public void setExcFeeAmount(double excFeeAmount) {
        this.excFeeAmount = excFeeAmount;
    }

    /**
     * 振込手数料額(消費税)取得
     * 
     * @return
     *     振込手数料額(消費税)
     */
    public double getFeeTaxAmount() {
        return feeTaxAmount;
    }

    /**
     * 振込手数料額(消費税)設定
     * 
     * @param feeTaxAmount
     */
    public void setFeeTaxAmount(double feeTaxAmount) {
        this.feeTaxAmount = feeTaxAmount;
    }

    /**
     * 振込手数料額(消費税)(基準通貨換算額)取得
     * 
     * @return
     *     振込手数料額(消費税)(基準通貨換算額)
     */
    public double getExcFeeTaxAmount() {
        return excFeeTaxAmount;
    }

    /**
     * 振込手数料額(消費税)(基準通貨換算額)設定
     * 
     * @param excFeeTaxAmount
     */
    public void setExcFeeTaxAmount(double excFeeTaxAmount) {
        this.excFeeTaxAmount = excFeeTaxAmount;
    }

    /**
     * 源泉税額(国税+地方税)取得
     * 
     * @return
     *     源泉税額(国税+地方税)
     */
    public double getSTaxAmount() {
        return sTaxAmount;
    }

    /**
     * 源泉税額(国税+地方税)設定
     * 
     * @param sTaxAmount
     */
    public void setSTaxAmount(double sTaxAmount) {
        this.sTaxAmount = sTaxAmount;
    }

    /**
     * 源泉税額(国税+地方税)(基準通貨換算額)取得
     * 
     * @return
     *     源泉税額(国税+地方税)(基準通貨換算額)
     */
    public double getExcSTaxAmount() {
        return excSTaxAmount;
    }

    /**
     * 源泉税額(国税+地方税)(基準通貨換算額)設定
     * 
     * @param excSTaxAmount
     */
    public void setExcSTaxAmount(double excSTaxAmount) {
        this.excSTaxAmount = excSTaxAmount;
    }

    /**
     * 源泉税額(国税)取得
     * 
     * @return
     *     源泉税額(国税)
     */
    public double getSTaxnAmount() {
        return sTaxnAmount;
    }

    /**
     * 源泉税額(国税)設定
     * 
     * @param sTaxnAmount
     */
    public void setSTaxnAmount(double sTaxnAmount) {
        this.sTaxnAmount = sTaxnAmount;
    }

    /**
     * 源泉税額(国税)(基準通貨換算額)取得
     * 
     * @return
     *     源泉税額(国税)(基準通貨換算額)
     */
    public double getExcSTaxnAmount() {
        return excSTaxnAmount;
    }

    /**
     * 源泉税額(国税)(基準通貨換算額)設定
     * 
     * @param excSTaxnAmount
     */
    public void setExcSTaxnAmount(double excSTaxnAmount) {
        this.excSTaxnAmount = excSTaxnAmount;
    }

    /**
     * 源泉税額(地方税)取得
     * 
     * @return
     *     源泉税額(地方税)
     */
    public double getSTaxcAmount() {
        return sTaxcAmount;
    }

    /**
     * 源泉税額(地方税)設定
     * 
     * @param sTaxcAmount
     */
    public void setSTaxcAmount(double sTaxcAmount) {
        this.sTaxcAmount = sTaxcAmount;
    }

    /**
     * 源泉税額(地方税)(基準通貨換算額)取得
     * 
     * @return
     *     源泉税額(地方税)(基準通貨換算額)
     */
    public double getExcSTaxcAmount() {
        return excSTaxcAmount;
    }

    /**
     * 源泉税額(地方税)(基準通貨換算額)設定
     * 
     * @param excSTaxcAmount
     */
    public void setExcSTaxcAmount(double excSTaxcAmount) {
        this.excSTaxcAmount = excSTaxcAmount;
    }

    /**
     * 基準通貨換算額取得
     * 
     * @return
     *     基準通貨換算額
     */
    public double getExcAmount() {
        return excAmount;
    }

    /**
     * 基準通貨換算額設定
     * 
     * @param excAmount
     */
    public void setExcAmount(double excAmount) {
        this.excAmount = excAmount;
    }

    /**
     * 為替レート区分取得
     * 
     * @return
     *     為替レート区分
     */
    public int getFRateDiv() {
        return fRateDiv;
    }

    /**
     * 為替レート区分設定
     * 
     * @param fRateDiv
     */
    public void setFRateDiv(int fRateDiv) {
        this.fRateDiv = fRateDiv;
    }

    /**
     * 為替レートタイプコード取得
     * 
     * @return
     *     為替レートタイプコード
     */
    public String getRatetypeCode() {
        return ratetypeCode;
    }

    /**
     * 為替レートタイプコード設定
     * 
     * @param ratetypeCode
     */
    public void setRatetypeCode(String ratetypeCode) {
        this.ratetypeCode = ratetypeCode;
    }

    /**
     * 為替予約レートタイプコード取得
     * 
     * @return
     *     為替予約レートタイプコード
     */
    public String getFraRatetypeCode() {
        return fraRatetypeCode;
    }

    /**
     * 為替予約レートタイプコード設定
     * 
     * @param fraRatetypeCode
     */
    public void setFraRatetypeCode(String fraRatetypeCode) {
        this.fraRatetypeCode = fraRatetypeCode;
    }

    /**
     * 為替予約管理番号取得
     * 
     * @return
     *     為替予約管理番号
     */
    public long getFraNo() {
        return fraNo;
    }

    /**
     * 為替予約管理番号設定
     * 
     * @param fraNo
     */
    public void setFraNo(long fraNo) {
        this.fraNo = fraNo;
    }

    /**
     * 為替レート入力区分取得
     * 
     * @return
     *     為替レート入力区分
     */
    public int getFRateInputDiv() {
        return fRateInputDiv;
    }

    /**
     * 為替レート入力区分設定
     * 
     * @param fRateInputDiv
     */
    public void setFRateInputDiv(int fRateInputDiv) {
        this.fRateInputDiv = fRateInputDiv;
    }

    /**
     * 換算方法区分取得
     * 
     * @return
     *     換算方法区分
     */
    public int getExchangeDiv() {
        return exchangeDiv;
    }

    /**
     * 換算方法区分設定
     * 
     * @param exchangeDiv
     */
    public void setExchangeDiv(int exchangeDiv) {
        this.exchangeDiv = exchangeDiv;
    }

    /**
     * 為替レート値取得
     * 
     * @return
     *     為替レート値
     */
    public double getFRateValue() {
        return fRateValue;
    }

    /**
     * 為替レート値設定
     * 
     * @param fRateValue
     */
    public void setFRateValue(double fRateValue) {
        this.fRateValue = fRateValue;
    }

    /**
     * 換算ステータス取得
     * 
     * @return
     *     換算ステータス
     */
    public int getExcStatus() {
        return excStatus;
    }

    /**
     * 換算ステータス設定
     * 
     * @param excStatus
     */
    public void setExcStatus(int excStatus) {
        this.excStatus = excStatus;
    }

    /**
     * 名寄せ処理ステータス取得
     * 
     * @return
     *     名寄せ処理ステータス
     */
    public int getIdentStatus() {
        return identStatus;
    }

    /**
     * 名寄せ処理ステータス設定
     * 
     * @param identStatus
     */
    public void setIdentStatus(int identStatus) {
        this.identStatus = identStatus;
    }

    /**
     * 入出金伝票作成ステータス取得
     * 
     * @return
     *     入出金伝票作成ステータス
     */
    public int getIoslipMakeStatus() {
        return ioslipMakeStatus;
    }

    /**
     * 入出金伝票作成ステータス設定
     * 
     * @param ioslipMakeStatus
     */
    public void setIoslipMakeStatus(int ioslipMakeStatus) {
        this.ioslipMakeStatus = ioslipMakeStatus;
    }

    /**
     * 入出金伝票連携ステータス取得
     * 
     * @return
     *     入出金伝票連携ステータス
     */
    public int getIoslipRelStatus() {
        return ioslipRelStatus;
    }

    /**
     * 入出金伝票連携ステータス設定
     * 
     * @param ioslipRelStatus
     */
    public void setIoslipRelStatus(int ioslipRelStatus) {
        this.ioslipRelStatus = ioslipRelStatus;
    }

    /**
     * 入出金照合ステータス取得
     * 
     * @return
     *     入出金照合ステータス
     */
    public int getCollationStatus() {
        return collationStatus;
    }

    /**
     * 入出金照合ステータス設定
     * 
     * @param collationStatus
     */
    public void setCollationStatus(int collationStatus) {
        this.collationStatus = collationStatus;
    }

    /**
     * 振替伝票作成ステータス取得
     * 
     * @return
     *     振替伝票作成ステータス
     */
    public int getTransslipMakeStatus() {
        return transslipMakeStatus;
    }

    /**
     * 振替伝票作成ステータス設定
     * 
     * @param transslipMakeStatus
     */
    public void setTransslipMakeStatus(int transslipMakeStatus) {
        this.transslipMakeStatus = transslipMakeStatus;
    }

    /**
     * 振替伝票連携ステータス取得
     * 
     * @return
     *     振替伝票連携ステータス
     */
    public int getTransslipRelStatus() {
        return transslipRelStatus;
    }

    /**
     * 振替伝票連携ステータス設定
     * 
     * @param transslipRelStatus
     */
    public void setTransslipRelStatus(int transslipRelStatus) {
        this.transslipRelStatus = transslipRelStatus;
    }

    /**
     * 収支実績作成ステータス取得
     * 
     * @return
     *     収支実績作成ステータス
     */
    public int getFndActStatus() {
        return fndActStatus;
    }

    /**
     * 収支実績作成ステータス設定
     * 
     * @param fndActStatus
     */
    public void setFndActStatus(int fndActStatus) {
        this.fndActStatus = fndActStatus;
    }

    /**
     * 他部門確認依頼ステータス（入出金伝票）取得
     * 
     * @return
     *     他部門確認依頼ステータス（入出金伝票）
     */
    public int getIoslipReqStatus() {
        return ioslipReqStatus;
    }

    /**
     * 他部門確認依頼ステータス（入出金伝票）設定
     * 
     * @param ioslipReqStatus
     */
    public void setIoslipReqStatus(int ioslipReqStatus) {
        this.ioslipReqStatus = ioslipReqStatus;
    }

    /**
     * 確認部門ＩＤ（入出金伝票）取得
     * 
     * @return
     *     確認部門ＩＤ（入出金伝票）
     */
    public long getIoslipReqSectionId() {
        return ioslipReqSectionId;
    }

    /**
     * 確認部門ＩＤ（入出金伝票）設定
     * 
     * @param ioslipReqSectionId
     */
    public void setIoslipReqSectionId(long ioslipReqSectionId) {
        this.ioslipReqSectionId = ioslipReqSectionId;
    }

    /**
     * 確認部門コード取得
     * 
     * @return
     *     確認部門コード
     */
    public String getIoslipReqSectionCode() {
        return ioslipReqSectionCode;
    }

    /**
     * 確認部門コード設定
     * 
     * @param ioslipReqSectionCode
     */
    public void setIoslipReqSectionCode(String ioslipReqSectionCode) {
        this.ioslipReqSectionCode = ioslipReqSectionCode;
    }

    /**
     * 確認部門名称取得
     * 
     * @return
     *     確認部門名称
     */
    public String getIoslipReqSectionName() {
        return ioslipReqSectionName;
    }

    /**
     * 確認部門名称設定
     * 
     * @param ioslipReqSectionName
     */
    public void setIoslipReqSectionName(String ioslipReqSectionName) {
        this.ioslipReqSectionName = ioslipReqSectionName;
    }

    /**
     * 確認依頼コメント取得
     * 
     * @return
     *     確認依頼コメント
     */
    public String getIoslipReqMemo() {
        return ioslipReqMemo;
    }

    /**
     * 確認依頼コメント設定
     * 
     * @param ioslipReqMemo
     */
    public void setIoslipReqMemo(String ioslipReqMemo) {
        this.ioslipReqMemo = ioslipReqMemo;
    }

    /**
     * 他部門確認依頼ステータス（入出金照合）取得
     * 
     * @return
     *     他部門確認依頼ステータス（入出金照合）
     */
    public int getCollationReqStatus() {
        return collationReqStatus;
    }

    /**
     * 他部門確認依頼ステータス（入出金照合）設定
     * 
     * @param collationReqStatus
     */
    public void setCollationReqStatus(int collationReqStatus) {
        this.collationReqStatus = collationReqStatus;
    }

    /**
     * 確認部門ＩＤ（入出金照合）取得
     * 
     * @return
     *     確認部門ＩＤ（入出金照合）
     */
    public long getCollationReqSectionId() {
        return collationReqSectionId;
    }

    /**
     * 確認部門ＩＤ（入出金照合）設定
     * 
     * @param collationReqSectionId
     */
    public void setCollationReqSectionId(long collationReqSectionId) {
        this.collationReqSectionId = collationReqSectionId;
    }

    /**
     * 関係者メール通知ステータス取得
     * 
     * @return
     *     関係者メール通知ステータス
     */
    public int getMailSendStatus() {
        return mailSendStatus;
    }

    /**
     * 関係者メール通知ステータス設定
     * 
     * @param mailSendStatus
     */
    public void setMailSendStatus(int mailSendStatus) {
        this.mailSendStatus = mailSendStatus;
    }

    /**
     * 資金配置連携ステータス取得
     * 
     * @return
     *     資金配置連携ステータス
     */
    public int getFndDisposeRelStatus() {
        return fndDisposeRelStatus;
    }

    /**
     * 資金配置連携ステータス設定
     * 
     * @param fndDisposeRelStatus
     */
    public void setFndDisposeRelStatus(int fndDisposeRelStatus) {
        this.fndDisposeRelStatus = fndDisposeRelStatus;
    }

    /**
     * プーリング連携ステータス取得
     * 
     * @return
     *     プーリング連携ステータス
     */
    public int getCmsPolRelStatus() {
        return cmsPolRelStatus;
    }

    /**
     * プーリング連携ステータス設定
     * 
     * @param cmsPolRelStatus
     */
    public void setCmsPolRelStatus(int cmsPolRelStatus) {
        this.cmsPolRelStatus = cmsPolRelStatus;
    }

    /**
     * CBM入金消込連携ステータス取得
     * 
     * @return
     *     CBM入金消込連携ステータス
     */
    public int getCbmClearingRelStatus() {
        return cbmClearingRelStatus;
    }

    /**
     * CBM入金消込連携ステータス設定
     * 
     * @param cbmClearingRelStatus
     */
    public void setCbmClearingRelStatus(int cbmClearingRelStatus) {
        this.cbmClearingRelStatus = cbmClearingRelStatus;
    }

    /**
     * 業務完了ステータス取得
     * 
     * @return
     *     業務完了ステータス
     */
    public int getFinishStatus() {
        return finishStatus;
    }

    /**
     * 業務完了ステータス設定
     * 
     * @param finishStatus
     */
    public void setFinishStatus(int finishStatus) {
        this.finishStatus = finishStatus;
    }

    /**
     * 予備コード1取得
     * 
     * @return
     *     予備コード1
     */
    public String getExtraCode1() {
        return extraCode1;
    }

    /**
     * 予備コード1設定
     * 
     * @param extraCode1
     */
    public void setExtraCode1(String extraCode1) {
        this.extraCode1 = extraCode1;
    }

    /**
     * 予備コード2取得
     * 
     * @return
     *     予備コード2
     */
    public String getExtraCode2() {
        return extraCode2;
    }

    /**
     * 予備コード2設定
     * 
     * @param extraCode2
     */
    public void setExtraCode2(String extraCode2) {
        this.extraCode2 = extraCode2;
    }

    /**
     * 予備コード3取得
     * 
     * @return
     *     予備コード3
     */
    public String getExtraCode3() {
        return extraCode3;
    }

    /**
     * 予備コード3設定
     * 
     * @param extraCode3
     */
    public void setExtraCode3(String extraCode3) {
        this.extraCode3 = extraCode3;
    }

    /**
     * 予備コード4取得
     * 
     * @return
     *     予備コード4
     */
    public String getExtraCode4() {
        return extraCode4;
    }

    /**
     * 予備コード4設定
     * 
     * @param extraCode4
     */
    public void setExtraCode4(String extraCode4) {
        this.extraCode4 = extraCode4;
    }

    /**
     * 予備コード5取得
     * 
     * @return
     *     予備コード5
     */
    public String getExtraCode5() {
        return extraCode5;
    }

    /**
     * 予備コード5設定
     * 
     * @param extraCode5
     */
    public void setExtraCode5(String extraCode5) {
        this.extraCode5 = extraCode5;
    }

    /**
     * 予備金額1取得
     * 
     * @return
     *     予備金額1
     */
    public double getExtraAmount1() {
        return extraAmount1;
    }

    /**
     * 予備金額1設定
     * 
     * @param extraAmount1
     */
    public void setExtraAmount1(double extraAmount1) {
        this.extraAmount1 = extraAmount1;
    }

    /**
     * 予備金額2取得
     * 
     * @return
     *     予備金額2
     */
    public double getExtraAmount2() {
        return extraAmount2;
    }

    /**
     * 予備金額2設定
     * 
     * @param extraAmount2
     */
    public void setExtraAmount2(double extraAmount2) {
        this.extraAmount2 = extraAmount2;
    }

    /**
     * 予備金額3取得
     * 
     * @return
     *     予備金額3
     */
    public double getExtraAmount3() {
        return extraAmount3;
    }

    /**
     * 予備金額3設定
     * 
     * @param extraAmount3
     */
    public void setExtraAmount3(double extraAmount3) {
        this.extraAmount3 = extraAmount3;
    }

    /**
     * 予備金額4取得
     * 
     * @return
     *     予備金額4
     */
    public double getExtraAmount4() {
        return extraAmount4;
    }

    /**
     * 予備金額4設定
     * 
     * @param extraAmount4
     */
    public void setExtraAmount4(double extraAmount4) {
        this.extraAmount4 = extraAmount4;
    }

    /**
     * 予備金額5取得
     * 
     * @return
     *     予備金額5
     */
    public double getExtraAmount5() {
        return extraAmount5;
    }

    /**
     * 予備金額5設定
     * 
     * @param extraAmount5
     */
    public void setExtraAmount5(double extraAmount5) {
        this.extraAmount5 = extraAmount5;
    }

    /**
     * 予備区分1取得
     * 
     * @return
     *     予備区分1
     */
    public long getExtraDiv1() {
        return extraDiv1;
    }

    /**
     * 予備区分1設定
     * 
     * @param extraDiv1
     */
    public void setExtraDiv1(long extraDiv1) {
        this.extraDiv1 = extraDiv1;
    }

    /**
     * 予備区分2取得
     * 
     * @return
     *     予備区分2
     */
    public long getExtraDiv2() {
        return extraDiv2;
    }

    /**
     * 予備区分2設定
     * 
     * @param extraDiv2
     */
    public void setExtraDiv2(long extraDiv2) {
        this.extraDiv2 = extraDiv2;
    }

    /**
     * 予備区分3取得
     * 
     * @return
     *     予備区分3
     */
    public long getExtraDiv3() {
        return extraDiv3;
    }

    /**
     * 予備区分3設定
     * 
     * @param extraDiv3
     */
    public void setExtraDiv3(long extraDiv3) {
        this.extraDiv3 = extraDiv3;
    }

    /**
     * 予備区分4取得
     * 
     * @return
     *     予備区分4
     */
    public long getExtraDiv4() {
        return extraDiv4;
    }

    /**
     * 予備区分4設定
     * 
     * @param extraDiv4
     */
    public void setExtraDiv4(long extraDiv4) {
        this.extraDiv4 = extraDiv4;
    }

    /**
     * 予備区分5取得
     * 
     * @return
     *     予備区分5
     */
    public long getExtraDiv5() {
        return extraDiv5;
    }

    /**
     * 予備区分5設定
     * 
     * @param extraDiv5
     */
    public void setExtraDiv5(long extraDiv5) {
        this.extraDiv5 = extraDiv5;
    }

    /**
     * 予備日付1取得
     * 
     * @return
     *     予備日付1
     */
    public Timestamp getExtraDate1() {
        return extraDate1;
    }

    /**
     * 予備日付1設定
     * 
     * @param extraDate1
     */
    public void setExtraDate1(Timestamp extraDate1) {
        this.extraDate1 = extraDate1;
    }

    /**
     * 予備日付2取得
     * 
     * @return
     *     予備日付2
     */
    public Timestamp getExtraDate2() {
        return extraDate2;
    }

    /**
     * 予備日付2設定
     * 
     * @param extraDate2
     */
    public void setExtraDate2(Timestamp extraDate2) {
        this.extraDate2 = extraDate2;
    }

    /**
     * 予備日付3取得
     * 
     * @return
     *     予備日付3
     */
    public Timestamp getExtraDate3() {
        return extraDate3;
    }

    /**
     * 予備日付3設定
     * 
     * @param extraDate3
     */
    public void setExtraDate3(Timestamp extraDate3) {
        this.extraDate3 = extraDate3;
    }

    /**
     * 予備日付4取得
     * 
     * @return
     *     予備日付4
     */
    public Timestamp getExtraDate4() {
        return extraDate4;
    }

    /**
     * 予備日付4設定
     * 
     * @param extraDate4
     */
    public void setExtraDate4(Timestamp extraDate4) {
        this.extraDate4 = extraDate4;
    }

    /**
     * 予備日付5取得
     * 
     * @return
     *     予備日付5
     */
    public Timestamp getExtraDate5() {
        return extraDate5;
    }

    /**
     * 予備日付5設定
     * 
     * @param extraDate5
     */
    public void setExtraDate5(Timestamp extraDate5) {
        this.extraDate5 = extraDate5;
    }

    /**
     * 予備テキスト1取得
     * 
     * @return
     *     予備テキスト1
     */
    public String getExtraText1() {
        return extraText1;
    }

    /**
     * 予備テキスト1設定
     * 
     * @param extraText1
     */
    public void setExtraText1(String extraText1) {
        this.extraText1 = extraText1;
    }

    /**
     * 予備テキスト2取得
     * 
     * @return
     *     予備テキスト2
     */
    public String getExtraText2() {
        return extraText2;
    }

    /**
     * 予備テキスト2設定
     * 
     * @param extraText2
     */
    public void setExtraText2(String extraText2) {
        this.extraText2 = extraText2;
    }

    /**
     * 予備テキスト3取得
     * 
     * @return
     *     予備テキスト3
     */
    public String getExtraText3() {
        return extraText3;
    }

    /**
     * 予備テキスト3設定
     * 
     * @param extraText3
     */
    public void setExtraText3(String extraText3) {
        this.extraText3 = extraText3;
    }

    /**
     * 予備テキスト4取得
     * 
     * @return
     *     予備テキスト4
     */
    public String getExtraText4() {
        return extraText4;
    }

    /**
     * 予備テキスト4設定
     * 
     * @param extraText4
     */
    public void setExtraText4(String extraText4) {
        this.extraText4 = extraText4;
    }

    /**
     * 予備テキスト5取得
     * 
     * @return
     *     予備テキスト5
     */
    public String getExtraText5() {
        return extraText5;
    }

    /**
     * 予備テキスト5設定
     * 
     * @param extraText5
     */
    public void setExtraText5(String extraText5) {
        this.extraText5 = extraText5;
    }

    /**
     * 新規登録ユーザーＩＤ取得
     * 
     * @return
     *     新規登録ユーザーＩＤ
     */
    public String getInputUserId() {
        return inputUserId;
    }

    /**
     * 新規登録ユーザーＩＤ設定
     * 
     * @param inputUserId
     */
    public void setInputUserId(String inputUserId) {
        this.inputUserId = inputUserId;
    }

    /**
     * 新規登録日時取得
     * 
     * @return
     *     新規登録日時
     */
    public Timestamp getInputDatetime() {
        return inputDatetime;
    }

    /**
     * 新規登録日時設定
     * 
     * @param inputDatetime
     */
    public void setInputDatetime(Timestamp inputDatetime) {
        this.inputDatetime = inputDatetime;
    }

    /**
     * 最終更新ユーザーＩＤ取得
     * 
     * @return
     *     最終更新ユーザーＩＤ
     */
    public String getLastupdateUserId() {
        return lastupdateUserId;
    }

    /**
     * 最終更新ユーザーＩＤ設定
     * 
     * @param lastupdateUserId
     */
    public void setLastupdateUserId(String lastupdateUserId) {
        this.lastupdateUserId = lastupdateUserId;
    }

    /**
     * 最終更新日時取得
     * 
     * @return
     *     最終更新日時
     */
    public Timestamp getLastupdateDatetime() {
        return lastupdateDatetime;
    }

    /**
     * 最終更新日時設定
     * 
     * @param lastupdateDatetime
     */
    public void setLastupdateDatetime(Timestamp lastupdateDatetime) {
        this.lastupdateDatetime = lastupdateDatetime;
    }

    /**
     * 状態フラグ取得
     * 
     * @return
     *     状態フラグ
     */
    public long getRecStatus() {
        return recStatus;
    }

    /**
     * 状態フラグ設定
     * 
     * @param recStatus
     */
    public void setRecStatus(long recStatus) {
        this.recStatus = recStatus;
    }

}
