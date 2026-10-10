package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawConfirmEntity;", "Landroid/os/Parcelable;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "chainName", "address", "memo", "remark", JAnalysisConstants.Account.KEY_ACCOUNT, "memoName", "phrases", "", "Lcom/kubi/assets/entity/Phrases;", "receivedAmount", "fee", "hasTax", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getChainName", "getAddress", "getMemo", "getRemark", "getAccount", "getMemoName", "getPhrases", "()Ljava/util/List;", "getReceivedAmount", "getFee", "getHasTax", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawConfirmEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawConfirmEntity> CREATOR = new Creator();

    @Nullable
    private final String account;

    @Nullable
    private final String address;

    @Nullable
    private final String amount;

    @Nullable
    private final String chainName;

    @Nullable
    private final String currency;

    @Nullable
    private final String fee;
    private final boolean hasTax;

    @Nullable
    private final String memo;

    @Nullable
    private final String memoName;

    @Nullable
    private final List<Phrases> phrases;

    @Nullable
    private final String receivedAmount;

    @Nullable
    private final String remark;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawConfirmEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawConfirmEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Phrases.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawConfirmEntity(string, string2, string3, string4, string5, string6, string7, string8, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawConfirmEntity[] newArray(int i11) {
            return new WithdrawConfirmEntity[i11];
        }
    }

    public WithdrawConfirmEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable List<Phrases> list, @Nullable String str9, @Nullable String str10, boolean z11) {
        this.amount = str;
        this.currency = str2;
        this.chainName = str3;
        this.address = str4;
        this.memo = str5;
        this.remark = str6;
        this.account = str7;
        this.memoName = str8;
        this.phrases = list;
        this.receivedAmount = str9;
        this.fee = str10;
        this.hasTax = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    public final boolean getHasTax() {
        return this.hasTax;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getMemoName() {
        return this.memoName;
    }

    @Nullable
    public final List<Phrases> getPhrases() {
        return this.phrases;
    }

    @Nullable
    public final String getReceivedAmount() {
        return this.receivedAmount;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.currency);
        dest.writeString(this.chainName);
        dest.writeString(this.address);
        dest.writeString(this.memo);
        dest.writeString(this.remark);
        dest.writeString(this.account);
        dest.writeString(this.memoName);
        List<Phrases> list = this.phrases;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Phrases> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.receivedAmount);
        dest.writeString(this.fee);
        dest.writeInt(this.hasTax ? 1 : 0);
    }

    public /* synthetic */ WithdrawConfirmEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3, str4, (i11 & 16) != 0 ? "" : str5, str6, str7, str8, list, str9, str10, (i11 & 2048) != 0 ? false : z11);
    }
}
