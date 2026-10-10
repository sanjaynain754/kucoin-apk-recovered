package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.fiat.withdraw.capitual.ParamsResult;
import com.kubi.utils.extensions.C27041f;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ$\u0010#\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010%J$\u0010&\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010'J$\u0010(\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010'J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u00100\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\fHÆ\u0003J\u0087\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\fHÆ\u0001J\u0006\u00102\u001a\u000203J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000203HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000203R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R:\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006@"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatBindCapitualAccount;", "Landroid/os/Parcelable;", "channelId", "", FirebaseAnalytics.Param.CURRENCY, "accountName", "iban", "discription", "bankName", "bic", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getChannelId", "()Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getAccountName", "setAccountName", "getIban", "setIban", "getDiscription", "setDiscription", "getBankName", "setBankName", "getBic", "setBic", "getExtra", "()Ljava/util/HashMap;", "setExtra", "(Ljava/util/HashMap;)V", "bindPixCPFAccount", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult$PixCPFParamsResult;", "bindPixBankAccount", "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult$PixTedParamsResult;", "bindTedAccount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatBindCapitualAccount implements Parcelable {

    @NotNull
    private static final String ACCOUNT_PIX = "PIX";

    @NotNull
    private static final String ACCOUNT_TED = "TED";

    @NotNull
    private static final String PIX_BANK = "bankaccount";

    @NotNull
    private static final String PIX_CPF = "cpf";

    @Nullable
    private String accountName;

    @Nullable
    private String bankName;

    @Nullable
    private String bic;

    @Nullable
    private String channelId;

    @Nullable
    private String currency;

    @Nullable
    private String discription;

    @Nullable
    private HashMap<String, String> extra;

    @Nullable
    private String iban;

    @NotNull
    public static final Parcelable.Creator<FiatBindCapitualAccount> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatBindCapitualAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBindCapitualAccount createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i11 = parcel.readInt();
                HashMap map2 = new HashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                map = map2;
            }
            return new FiatBindCapitualAccount(string, string2, string3, string4, string5, string6, string7, map);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBindCapitualAccount[] newArray(int i11) {
            return new FiatBindCapitualAccount[i11];
        }
    }

    public FiatBindCapitualAccount() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatBindCapitualAccount)) {
            return false;
        }
        FiatBindCapitualAccount fiatBindCapitualAccount = (FiatBindCapitualAccount) other;
        return Intrinsics.areEqual(this.channelId, fiatBindCapitualAccount.channelId) && Intrinsics.areEqual(this.currency, fiatBindCapitualAccount.currency) && Intrinsics.areEqual(this.accountName, fiatBindCapitualAccount.accountName) && Intrinsics.areEqual(this.iban, fiatBindCapitualAccount.iban) && Intrinsics.areEqual(this.discription, fiatBindCapitualAccount.discription) && Intrinsics.areEqual(this.bankName, fiatBindCapitualAccount.bankName) && Intrinsics.areEqual(this.bic, fiatBindCapitualAccount.bic) && Intrinsics.areEqual(this.extra, fiatBindCapitualAccount.extra);
    }

    public FiatBindCapitualAccount(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable HashMap<String, String> map) {
        this.channelId = str;
        this.currency = str2;
        this.accountName = str3;
        this.iban = str4;
        this.discription = str5;
        this.bankName = str6;
        this.bic = str7;
        this.extra = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatBindCapitualAccount copy$default(FiatBindCapitualAccount fiatBindCapitualAccount, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatBindCapitualAccount.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatBindCapitualAccount.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatBindCapitualAccount.accountName;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatBindCapitualAccount.iban;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatBindCapitualAccount.discription;
        }
        if ((i11 & 32) != 0) {
            str6 = fiatBindCapitualAccount.bankName;
        }
        if ((i11 & 64) != 0) {
            str7 = fiatBindCapitualAccount.bic;
        }
        if ((i11 & 128) != 0) {
            map = fiatBindCapitualAccount.extra;
        }
        String str8 = str7;
        HashMap map2 = map;
        String str9 = str5;
        String str10 = str6;
        return fiatBindCapitualAccount.copy(str, str2, str3, str4, str9, str10, str8, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIban() {
        return this.iban;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    @Nullable
    public final HashMap<String, String> component8() {
        return this.extra;
    }

    @NotNull
    public final FiatBindCapitualAccount copy(@Nullable String channelId, @Nullable String currency, @Nullable String accountName, @Nullable String iban, @Nullable String discription, @Nullable String bankName, @Nullable String bic, @Nullable HashMap<String, String> extra) {
        return new FiatBindCapitualAccount(channelId, currency, accountName, iban, discription, bankName, bic, extra);
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getBic() {
        return this.bic;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    public final HashMap<String, String> getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getIban() {
        return this.iban;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iban;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discription;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bic;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        HashMap<String, String> map = this.extra;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final void setAccountName(@Nullable String str) {
        this.accountName = str;
    }

    public final void setBankName(@Nullable String str) {
        this.bankName = str;
    }

    public final void setBic(@Nullable String str) {
        this.bic = str;
    }

    public final void setChannelId(@Nullable String str) {
        this.channelId = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setDiscription(@Nullable String str) {
        this.discription = str;
    }

    public final void setExtra(@Nullable HashMap<String, String> map) {
        this.extra = map;
    }

    public final void setIban(@Nullable String str) {
        this.iban = str;
    }

    @NotNull
    public String toString() {
        return "FiatBindCapitualAccount(channelId=" + this.channelId + ", currency=" + this.currency + ", accountName=" + this.accountName + ", iban=" + this.iban + ", discription=" + this.discription + ", bankName=" + this.bankName + ", bic=" + this.bic + ", extra=" + this.extra + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.currency);
        dest.writeString(this.accountName);
        dest.writeString(this.iban);
        dest.writeString(this.discription);
        dest.writeString(this.bankName);
        dest.writeString(this.bic);
        HashMap<String, String> map = this.extra;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    @NotNull
    public final FiatBindCapitualAccount bindPixBankAccount(@Nullable String str, @Nullable String str2, @Nullable ParamsResult.b bVar) {
        String accountName;
        String account;
        String bankNo;
        String shortName;
        String discription;
        String branch;
        String cpf;
        FiatCapitualBank bankInfo;
        this.channelId = C27041f.m66668h(str);
        this.currency = C27041f.m66668h(str2);
        String string = null;
        if (bVar != null) {
            accountName = bVar.getAccountName();
        } else {
            accountName = null;
        }
        this.accountName = C27041f.m66668h(accountName);
        if (bVar != null) {
            account = bVar.getAccount();
        } else {
            account = null;
        }
        this.iban = C27041f.m66668h(account);
        if (bVar != null) {
            bankNo = bVar.getBankNo();
        } else {
            bankNo = null;
        }
        this.bic = C27041f.m66668h(bankNo);
        if (bVar != null && (bankInfo = bVar.getBankInfo()) != null) {
            shortName = bankInfo.getShortName();
        } else {
            shortName = null;
        }
        this.bankName = C27041f.m66668h(shortName);
        if (bVar != null) {
            discription = bVar.getDiscription();
        } else {
            discription = null;
        }
        this.discription = C27041f.m66668h(discription);
        HashMap<String, String> map = this.extra;
        if (map != null) {
            if (bVar != null) {
                cpf = bVar.getCpf();
            } else {
                cpf = null;
            }
            map.put("cpf", C27041f.m66668h(cpf));
        }
        HashMap<String, String> map2 = this.extra;
        if (map2 != null) {
            if (bVar != null) {
                branch = bVar.getBranch();
            } else {
                branch = null;
            }
            map2.put("branch", C27041f.m66668h(branch));
        }
        HashMap<String, String> map3 = this.extra;
        if (map3 != null) {
            map3.put("accountType", "PIX");
        }
        HashMap<String, String> map4 = this.extra;
        if (map4 != null) {
            map4.put("keyType", "bankaccount");
        }
        HashMap<String, String> map5 = this.extra;
        if (map5 != null) {
            if (bVar != null) {
                string = Boolean.valueOf(bVar.mo44663a()).toString();
            }
            map5.put("isSavings", C27041f.m66668h(string));
        }
        return this;
    }

    @NotNull
    public final FiatBindCapitualAccount bindPixCPFAccount(@Nullable String str, @Nullable String str2, @Nullable ParamsResult.a aVar) {
        String pixKey;
        this.channelId = C27041f.m66668h(str);
        this.currency = C27041f.m66668h(str2);
        String discription = null;
        if (aVar != null) {
            pixKey = aVar.getPixKey();
        } else {
            pixKey = null;
        }
        this.iban = C27041f.m66668h(pixKey);
        if (aVar != null) {
            discription = aVar.getDiscription();
        }
        this.discription = C27041f.m66668h(discription);
        HashMap<String, String> map = this.extra;
        if (map != null) {
            map.put("accountType", "PIX");
        }
        HashMap<String, String> map2 = this.extra;
        if (map2 != null) {
            map2.put("keyType", "cpf");
        }
        return this;
    }

    @NotNull
    public final FiatBindCapitualAccount bindTedAccount(@Nullable String str, @Nullable String str2, @Nullable ParamsResult.b bVar) {
        String accountName;
        String account;
        String bankNo;
        String shortName;
        String discription;
        String branch;
        String cpf;
        FiatCapitualBank bankInfo;
        this.channelId = C27041f.m66668h(str);
        this.currency = C27041f.m66668h(str2);
        String string = null;
        if (bVar != null) {
            accountName = bVar.getAccountName();
        } else {
            accountName = null;
        }
        this.accountName = C27041f.m66668h(accountName);
        if (bVar != null) {
            account = bVar.getAccount();
        } else {
            account = null;
        }
        this.iban = C27041f.m66668h(account);
        if (bVar != null) {
            bankNo = bVar.getBankNo();
        } else {
            bankNo = null;
        }
        this.bic = C27041f.m66668h(bankNo);
        if (bVar != null && (bankInfo = bVar.getBankInfo()) != null) {
            shortName = bankInfo.getShortName();
        } else {
            shortName = null;
        }
        this.bankName = C27041f.m66668h(shortName);
        if (bVar != null) {
            discription = bVar.getDiscription();
        } else {
            discription = null;
        }
        this.discription = C27041f.m66668h(discription);
        HashMap<String, String> map = this.extra;
        if (map != null) {
            if (bVar != null) {
                cpf = bVar.getCpf();
            } else {
                cpf = null;
            }
            map.put("cpf", C27041f.m66668h(cpf));
        }
        HashMap<String, String> map2 = this.extra;
        if (map2 != null) {
            if (bVar != null) {
                branch = bVar.getBranch();
            } else {
                branch = null;
            }
            map2.put("branch", C27041f.m66668h(branch));
        }
        HashMap<String, String> map3 = this.extra;
        if (map3 != null) {
            map3.put("accountType", "TED");
        }
        HashMap<String, String> map4 = this.extra;
        if (map4 != null) {
            if (bVar != null) {
                string = Boolean.valueOf(bVar.mo44663a()).toString();
            }
            map4.put("isSavings", C27041f.m66668h(string));
        }
        return this;
    }

    public /* synthetic */ FiatBindCapitualAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? new HashMap() : map);
    }
}
