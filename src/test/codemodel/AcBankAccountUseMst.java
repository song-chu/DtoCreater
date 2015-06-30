
package test.codemodel;

import java.sql.Timestamp;


/**
 * 口座用途設定のDTO
 * 
 */
public class AcBankAccountUseMst {

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
     * 入出金利用区分
     * 
     */
    private int ioUseDiv;
    /**
     * 備考
     * 
     */
    private String memoText;
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
    public AcBankAccountUseMst() {
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
     * 入出金利用区分取得
     * 
     * @return
     *     入出金利用区分
     */
    public int getIoUseDiv() {
        return ioUseDiv;
    }

    /**
     * 入出金利用区分設定
     * 
     * @param ioUseDiv
     */
    public void setIoUseDiv(int ioUseDiv) {
        this.ioUseDiv = ioUseDiv;
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
