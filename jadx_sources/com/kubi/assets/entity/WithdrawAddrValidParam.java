package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.withdraw.address.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrValidParam;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "address", "", "Lcom/kubi/assets/entity/WithdrawAddrValid;", "type", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getAddress", "()Ljava/util/List;", "setAddress", "(Ljava/util/List;)V", "getType", "setType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrValidParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrValidParam> CREATOR = new Creator();

    @Nullable
    private List<WithdrawAddrValid> address;

    @Nullable
    private String currency;

    @NotNull
    private String type;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrValidParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValidParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(WithdrawAddrValid.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WithdrawAddrValidParam(string, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValidParam[] newArray(int i11) {
            return new WithdrawAddrValidParam[i11];
        }
    }

    public WithdrawAddrValidParam(@Nullable String str, @Nullable List<WithdrawAddrValid> list, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.currency = str;
        this.address = list;
        this.type = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawAddrValidParam)) {
            return false;
        }
        WithdrawAddrValidParam withdrawAddrValidParam = (WithdrawAddrValidParam) other;
        return Intrinsics.areEqual(this.currency, withdrawAddrValidParam.currency) && Intrinsics.areEqual(this.address, withdrawAddrValidParam.address) && Intrinsics.areEqual(this.type, withdrawAddrValidParam.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddrValidParam copy$default(WithdrawAddrValidParam withdrawAddrValidParam, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawAddrValidParam.currency;
        }
        if ((i11 & 2) != 0) {
            list = withdrawAddrValidParam.address;
        }
        if ((i11 & 4) != 0) {
            str2 = withdrawAddrValidParam.type;
        }
        return withdrawAddrValidParam.copy(str, list, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<WithdrawAddrValid> component2() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final List<WithdrawAddrValid> getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<WithdrawAddrValid> list = this.address;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public final void setAddress(@Nullable List<WithdrawAddrValid> list) {
        this.address = list;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrValidParam(currency=" + this.currency + ", address=" + this.address + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        List<WithdrawAddrValid> list = this.address;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<WithdrawAddrValid> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.type);
    }

    @NotNull
    public final WithdrawAddrValidParam copy(@Nullable String currency, @Nullable List<WithdrawAddrValid> address, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WithdrawAddrValidParam(currency, address, type);
    }

    public /* synthetic */ WithdrawAddrValidParam(String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i11 & 4) != 0 ? c.a() : str2);
    }
}
