package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JW\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m90084d2 = {"Lcom/kubi/otc/entity/FastFeeModel;", "Landroid/os/Parcelable;", "fee", "", "feeMsg", "fixedFee", "maxFee", "minFee", "feeMsgList", "", "Lcom/kubi/otc/entity/MultiFee;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFee", "()Ljava/lang/String;", "setFee", "(Ljava/lang/String;)V", "getFeeMsg", "setFeeMsg", "getFixedFee", "getMaxFee", "setMaxFee", "getMinFee", "setMinFee", "getFeeMsgList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastFeeModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastFeeModel> CREATOR = new Creator();

    @Nullable
    private String fee;

    @Nullable
    private String feeMsg;

    @SerializedName("feeMsgList")
    @Nullable
    private final List<MultiFee> feeMsgList;

    @Nullable
    private final String fixedFee;

    @Nullable
    private String maxFee;

    @Nullable
    private String minFee;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastFeeModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastFeeModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(MultiFee.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FastFeeModel(string, string2, string3, string4, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastFeeModel[] newArray(int i11) {
            return new FastFeeModel[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastFeeModel)) {
            return false;
        }
        FastFeeModel fastFeeModel = (FastFeeModel) other;
        return Intrinsics.areEqual(this.fee, fastFeeModel.fee) && Intrinsics.areEqual(this.feeMsg, fastFeeModel.feeMsg) && Intrinsics.areEqual(this.fixedFee, fastFeeModel.fixedFee) && Intrinsics.areEqual(this.maxFee, fastFeeModel.maxFee) && Intrinsics.areEqual(this.minFee, fastFeeModel.minFee) && Intrinsics.areEqual(this.feeMsgList, fastFeeModel.feeMsgList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FastFeeModel copy$default(FastFeeModel fastFeeModel, String str, String str2, String str3, String str4, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastFeeModel.fee;
        }
        if ((i11 & 2) != 0) {
            str2 = fastFeeModel.feeMsg;
        }
        if ((i11 & 4) != 0) {
            str3 = fastFeeModel.fixedFee;
        }
        if ((i11 & 8) != 0) {
            str4 = fastFeeModel.maxFee;
        }
        if ((i11 & 16) != 0) {
            str5 = fastFeeModel.minFee;
        }
        if ((i11 & 32) != 0) {
            list = fastFeeModel.feeMsgList;
        }
        String str6 = str5;
        List list2 = list;
        return fastFeeModel.copy(str, str2, str3, str4, str6, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFixedFee() {
        return this.fixedFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinFee() {
        return this.minFee;
    }

    @Nullable
    public final List<MultiFee> component6() {
        return this.feeMsgList;
    }

    @NotNull
    public final FastFeeModel copy(@Nullable String fee, @Nullable String feeMsg, @Nullable String fixedFee, @Nullable String maxFee, @Nullable String minFee, @Nullable List<MultiFee> feeMsgList) {
        return new FastFeeModel(fee, feeMsg, fixedFee, maxFee, minFee, feeMsgList);
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    public final List<MultiFee> getFeeMsgList() {
        return this.feeMsgList;
    }

    @Nullable
    public final String getFixedFee() {
        return this.fixedFee;
    }

    @Nullable
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    public final String getMinFee() {
        return this.minFee;
    }

    public int hashCode() {
        String str = this.fee;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feeMsg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fixedFee;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxFee;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minFee;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<MultiFee> list = this.feeMsgList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final void setFee(@Nullable String str) {
        this.fee = str;
    }

    public final void setFeeMsg(@Nullable String str) {
        this.feeMsg = str;
    }

    public final void setMaxFee(@Nullable String str) {
        this.maxFee = str;
    }

    public final void setMinFee(@Nullable String str) {
        this.minFee = str;
    }

    @NotNull
    public String toString() {
        return "FastFeeModel(fee=" + this.fee + ", feeMsg=" + this.feeMsg + ", fixedFee=" + this.fixedFee + ", maxFee=" + this.maxFee + ", minFee=" + this.minFee + ", feeMsgList=" + this.feeMsgList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fee);
        dest.writeString(this.feeMsg);
        dest.writeString(this.fixedFee);
        dest.writeString(this.maxFee);
        dest.writeString(this.minFee);
        List<MultiFee> list = this.feeMsgList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<MultiFee> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public FastFeeModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<MultiFee> list) {
        this.fee = str;
        this.feeMsg = str2;
        this.fixedFee = str3;
        this.maxFee = str4;
        this.minFee = str5;
        this.feeMsgList = list;
    }
}
