package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/entity/FastBankPaymentModel;", "Landroid/os/Parcelable;", "issuingBank", "", "bindingCardNumber", "cardInFos", "", "Lcom/kubi/otc/entity/CardInfoModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getIssuingBank", "()Ljava/lang/String;", "setIssuingBank", "(Ljava/lang/String;)V", "getBindingCardNumber", "setBindingCardNumber", "getCardInFos", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastBankPaymentModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastBankPaymentModel> CREATOR = new Creator();

    @Nullable
    private String bindingCardNumber;

    @Nullable
    private final List<CardInfoModel> cardInFos;

    @Nullable
    private String issuingBank;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastBankPaymentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastBankPaymentModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(CardInfoModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FastBankPaymentModel(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastBankPaymentModel[] newArray(int i11) {
            return new FastBankPaymentModel[i11];
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
        if (!(other instanceof FastBankPaymentModel)) {
            return false;
        }
        FastBankPaymentModel fastBankPaymentModel = (FastBankPaymentModel) other;
        return Intrinsics.areEqual(this.issuingBank, fastBankPaymentModel.issuingBank) && Intrinsics.areEqual(this.bindingCardNumber, fastBankPaymentModel.bindingCardNumber) && Intrinsics.areEqual(this.cardInFos, fastBankPaymentModel.cardInFos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FastBankPaymentModel copy$default(FastBankPaymentModel fastBankPaymentModel, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastBankPaymentModel.issuingBank;
        }
        if ((i11 & 2) != 0) {
            str2 = fastBankPaymentModel.bindingCardNumber;
        }
        if ((i11 & 4) != 0) {
            list = fastBankPaymentModel.cardInFos;
        }
        return fastBankPaymentModel.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuingBank() {
        return this.issuingBank;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindingCardNumber() {
        return this.bindingCardNumber;
    }

    @Nullable
    public final List<CardInfoModel> component3() {
        return this.cardInFos;
    }

    @NotNull
    public final FastBankPaymentModel copy(@Nullable String issuingBank, @Nullable String bindingCardNumber, @Nullable List<CardInfoModel> cardInFos) {
        return new FastBankPaymentModel(issuingBank, bindingCardNumber, cardInFos);
    }

    @Nullable
    public final String getBindingCardNumber() {
        return this.bindingCardNumber;
    }

    @Nullable
    public final List<CardInfoModel> getCardInFos() {
        return this.cardInFos;
    }

    @Nullable
    public final String getIssuingBank() {
        return this.issuingBank;
    }

    public int hashCode() {
        String str = this.issuingBank;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bindingCardNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CardInfoModel> list = this.cardInFos;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setBindingCardNumber(@Nullable String str) {
        this.bindingCardNumber = str;
    }

    public final void setIssuingBank(@Nullable String str) {
        this.issuingBank = str;
    }

    @NotNull
    public String toString() {
        return "FastBankPaymentModel(issuingBank=" + this.issuingBank + ", bindingCardNumber=" + this.bindingCardNumber + ", cardInFos=" + this.cardInFos + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.issuingBank);
        dest.writeString(this.bindingCardNumber);
        List<CardInfoModel> list = this.cardInFos;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<CardInfoModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public FastBankPaymentModel(@Nullable String str, @Nullable String str2, @Nullable List<CardInfoModel> list) {
        this.issuingBank = str;
        this.bindingCardNumber = str2;
        this.cardInFos = list;
    }
}
