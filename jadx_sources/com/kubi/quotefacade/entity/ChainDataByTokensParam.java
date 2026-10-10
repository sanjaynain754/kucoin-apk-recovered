package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavSimpleParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainDataByTokensParam;", "Landroid/os/Parcelable;", "tokenChains", "", "", "orderByRange", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTokenChains", "()Ljava/util/List;", "setTokenChains", "(Ljava/util/List;)V", "getOrderByRange", "()Ljava/lang/String;", "setOrderByRange", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainDataByTokensParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChainDataByTokensParam> CREATOR = new C21874a();

    @NotNull
    private String orderByRange;

    @NotNull
    private List<String> tokenChains;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.ChainDataByTokensParam$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21874a implements Parcelable.Creator<ChainDataByTokensParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainDataByTokensParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChainDataByTokensParam(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainDataByTokensParam[] newArray(int i11) {
            return new ChainDataByTokensParam[i11];
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
        if (!(other instanceof ChainDataByTokensParam)) {
            return false;
        }
        ChainDataByTokensParam chainDataByTokensParam = (ChainDataByTokensParam) other;
        return Intrinsics.areEqual(this.tokenChains, chainDataByTokensParam.tokenChains) && Intrinsics.areEqual(this.orderByRange, chainDataByTokensParam.orderByRange);
    }

    public ChainDataByTokensParam(@NotNull List<String> tokenChains, @NotNull String orderByRange) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        Intrinsics.checkNotNullParameter(orderByRange, "orderByRange");
        this.tokenChains = tokenChains;
        this.orderByRange = orderByRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainDataByTokensParam copy$default(ChainDataByTokensParam chainDataByTokensParam, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = chainDataByTokensParam.tokenChains;
        }
        if ((i11 & 2) != 0) {
            str = chainDataByTokensParam.orderByRange;
        }
        return chainDataByTokensParam.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.tokenChains;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderByRange() {
        return this.orderByRange;
    }

    @NotNull
    public final ChainDataByTokensParam copy(@NotNull List<String> tokenChains, @NotNull String orderByRange) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        Intrinsics.checkNotNullParameter(orderByRange, "orderByRange");
        return new ChainDataByTokensParam(tokenChains, orderByRange);
    }

    @NotNull
    public final String getOrderByRange() {
        return this.orderByRange;
    }

    @NotNull
    public final List<String> getTokenChains() {
        return this.tokenChains;
    }

    public int hashCode() {
        return (this.tokenChains.hashCode() * 31) + this.orderByRange.hashCode();
    }

    public final void setOrderByRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderByRange = str;
    }

    public final void setTokenChains(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tokenChains = list;
    }

    @NotNull
    public String toString() {
        return "ChainDataByTokensParam(tokenChains=" + this.tokenChains + ", orderByRange=" + this.orderByRange + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.tokenChains);
        dest.writeString(this.orderByRange);
    }
}
