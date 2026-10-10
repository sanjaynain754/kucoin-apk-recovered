package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$GroupRequest, reason: from toString */
/* JADX INFO: compiled from: UtaCancelOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$GroupRequest;", "Lcom/kubi/core/base/arch/api/IRequest;", "Landroid/os/Parcelable;", "tradeType", "", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getSymbol", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GroupRequest implements InterfaceC45789a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupRequest> CREATOR = new C26937a();

    @Nullable
    private final String symbol;

    @NotNull
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$GroupRequest$a */
    /* JADX INFO: compiled from: UtaCancelOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26937a implements Parcelable.Creator<GroupRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GroupRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupRequest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GroupRequest[] newArray(int i11) {
            return new GroupRequest[i11];
        }
    }

    public GroupRequest(@NotNull String tradeType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        this.tradeType = tradeType;
        this.symbol = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupRequest)) {
            return false;
        }
        GroupRequest groupRequest = (GroupRequest) other;
        return Intrinsics.areEqual(this.tradeType, groupRequest.tradeType) && Intrinsics.areEqual(this.symbol, groupRequest.symbol);
    }

    public static /* synthetic */ GroupRequest copy$default(GroupRequest groupRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = groupRequest.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = groupRequest.symbol;
        }
        return groupRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final GroupRequest copy(@NotNull String tradeType, @Nullable String symbol) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        return new GroupRequest(tradeType, symbol);
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        int iHashCode = this.tradeType.hashCode() * 31;
        String str = this.symbol;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "GroupRequest(tradeType=" + this.tradeType + ", symbol=" + this.symbol + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.symbol);
    }

    public /* synthetic */ GroupRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "SPOT" : str, str2);
    }
}
