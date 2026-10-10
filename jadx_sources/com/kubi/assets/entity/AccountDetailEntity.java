package com.kubi.assets.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.assets.R$color;
import com.kubi.assets.R$string;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AccountDetailEntity implements Parcelable {
    public static final Parcelable.Creator<AccountDetailEntity> CREATOR = new Parcelable.Creator<AccountDetailEntity>() { // from class: com.kubi.assets.entity.AccountDetailEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountDetailEntity createFromParcel(Parcel parcel) {
            return new AccountDetailEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountDetailEntity[] newArray(int i11) {
            return new AccountDetailEntity[i11];
        }
    };
    public static final String FLASH_TRADE = "FLASH_TRADE";
    private double amount;
    private String bizType;
    private String bizTypeName;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    private String code;
    private String coinName;
    private String currencyName;
    private String direction;
    private Map<String, String> directionMap;
    private double fee;
    public boolean isTrade;
    private String remark;
    private double tax;
    private long tradeDate;

    public AccountDetailEntity() {
        this.isTrade = false;
        this.directionMap = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setCoinName(String str) {
        this.coinName = str;
    }

    private Map<String, String> getDirectionMap(Context context) {
        if (this.directionMap == null) {
            this.directionMap = getOtcDirectionTypeMap(context);
        }
        return this.directionMap;
    }

    public static LinkedHashMap<String, String> getOtcDirectionTypeMap(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("IN", context.getString(R$string.in_account));
        linkedHashMap.put("OUT", context.getString(R$string.out_account));
        return linkedHashMap;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getBizType() {
        return this.bizType;
    }

    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public String getBizTypeNameString() {
        return this.bizTypeName;
    }

    public String getCode() {
        return this.code;
    }

    public String getCoinName() {
        return this.coinName;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getFee() {
        return new BigDecimal(String.valueOf(this.fee)).toPlainString();
    }

    public String getRemark() {
        return this.remark;
    }

    public String getTax() {
        return new BigDecimal(String.valueOf(this.tax)).toPlainString();
    }

    public long getTradeDate() {
        return this.tradeDate;
    }

    public boolean isTrade() {
        return this.isTrade;
    }

    public void setAmount(double d11) {
        this.amount = d11;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public void setBizTypeName(String str) {
        this.bizTypeName = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public AccountDetailEntity setCoinName(String str, String str2) {
        this.coinName = str;
        this.code = str2;
        return this;
    }

    public void setCurrencyName(String str) {
        this.currencyName = str;
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public void setFee(double d11) {
        this.fee = d11;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setTax(double d11) {
        this.tax = d11;
    }

    public void setTrade(boolean z11) {
        this.isTrade = z11;
    }

    public void setTradeDate(long j11) {
        this.tradeDate = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.isTrade ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.bizType);
        parcel.writeString(this.bizTypeName);
        parcel.writeString(this.direction);
        parcel.writeDouble(this.fee);
        parcel.writeDouble(this.tax);
        parcel.writeString(this.remark);
        parcel.writeLong(this.tradeDate);
        parcel.writeString(this.coinName);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.code);
        Map<String, String> map = this.directionMap;
        if (map != null) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : this.directionMap.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public int getDirectionColor(Context context) {
        int i11;
        if (getDirection().equals("IN")) {
            i11 = R$color.brandGreen;
        } else {
            i11 = R$color.c_text;
        }
        return ContextCompat.getColor(context, i11);
    }

    public String getDirectionString(Context context) {
        return getDirectionMap(context).get(getDirection());
    }

    public String getDirectionSymbol() {
        if (getDirection().equals("IN")) {
            return "+";
        }
        return C33820nf.f71144W;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z11;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isTrade = z11;
        this.amount = parcel.readDouble();
        this.bizType = parcel.readString();
        this.bizTypeName = parcel.readString();
        this.direction = parcel.readString();
        this.fee = parcel.readDouble();
        this.tax = parcel.readDouble();
        this.remark = parcel.readString();
        this.tradeDate = parcel.readLong();
        this.coinName = parcel.readString();
        this.currencyName = parcel.readString();
        this.code = parcel.readString();
        int i11 = parcel.readInt();
        this.directionMap = new HashMap(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.directionMap.put(parcel.readString(), parcel.readString());
        }
    }

    public AccountDetailEntity(Parcel parcel) {
        this.isTrade = false;
        this.directionMap = null;
        this.isTrade = parcel.readByte() != 0;
        this.amount = parcel.readDouble();
        this.bizType = parcel.readString();
        this.bizTypeName = parcel.readString();
        this.direction = parcel.readString();
        this.fee = parcel.readDouble();
        this.tax = parcel.readDouble();
        this.remark = parcel.readString();
        this.tradeDate = parcel.readLong();
        this.coinName = parcel.readString();
        this.currencyName = parcel.readString();
        this.code = parcel.readString();
        int i11 = parcel.readInt();
        if (i11 > 0) {
            this.directionMap = new HashMap(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                this.directionMap.put(parcel.readString(), parcel.readString());
            }
        }
    }
}
