package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MexCurrencyIconUrlEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/MexCurrencyIconUrlEntity;", "Landroid/os/Parcelable;", "symbol", "", "imgUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getImgUrl", "setImgUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MexCurrencyIconUrlEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MexCurrencyIconUrlEntity> CREATOR = new C15781a();

    @Nullable
    private String imgUrl;

    @Nullable
    private String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.MexCurrencyIconUrlEntity$a */
    /* JADX INFO: compiled from: MexCurrencyIconUrlEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15781a implements Parcelable.Creator<MexCurrencyIconUrlEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MexCurrencyIconUrlEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MexCurrencyIconUrlEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MexCurrencyIconUrlEntity[] newArray(int i11) {
            return new MexCurrencyIconUrlEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MexCurrencyIconUrlEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MexCurrencyIconUrlEntity)) {
            return false;
        }
        MexCurrencyIconUrlEntity mexCurrencyIconUrlEntity = (MexCurrencyIconUrlEntity) other;
        return Intrinsics.areEqual(this.symbol, mexCurrencyIconUrlEntity.symbol) && Intrinsics.areEqual(this.imgUrl, mexCurrencyIconUrlEntity.imgUrl);
    }

    public MexCurrencyIconUrlEntity(@Nullable String str, @Nullable String str2) {
        this.symbol = str;
        this.imgUrl = str2;
    }

    public static /* synthetic */ MexCurrencyIconUrlEntity copy$default(MexCurrencyIconUrlEntity mexCurrencyIconUrlEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mexCurrencyIconUrlEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = mexCurrencyIconUrlEntity.imgUrl;
        }
        return mexCurrencyIconUrlEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final MexCurrencyIconUrlEntity copy(@Nullable String symbol, @Nullable String imgUrl) {
        return new MexCurrencyIconUrlEntity(symbol, imgUrl);
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imgUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "MexCurrencyIconUrlEntity(symbol=" + this.symbol + ", imgUrl=" + this.imgUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.imgUrl);
    }

    public /* synthetic */ MexCurrencyIconUrlEntity(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
