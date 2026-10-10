package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MoodInfoEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u000fJ\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/entity/TopCoinInfoEntity;", "Landroid/os/Parcelable;", "crypto", "", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCrypto", "()Ljava/lang/String;", "getSymbol", "equals", "", "other", "", "hashCode", "", "component1", "component2", "copy", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TopCoinInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopCoinInfoEntity> CREATOR = new C14558a();

    @Nullable
    private final String crypto;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.home.entity.TopCoinInfoEntity$a */
    /* JADX INFO: compiled from: MoodInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14558a implements Parcelable.Creator<TopCoinInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TopCoinInfoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopCoinInfoEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TopCoinInfoEntity[] newArray(int i11) {
            return new TopCoinInfoEntity[i11];
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
        if (!Intrinsics.areEqual(TopCoinInfoEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.home.entity.TopCoinInfoEntity");
        TopCoinInfoEntity topCoinInfoEntity = (TopCoinInfoEntity) other;
        return Intrinsics.areEqual(this.crypto, topCoinInfoEntity.crypto) && Intrinsics.areEqual(this.symbol, topCoinInfoEntity.symbol);
    }

    public static /* synthetic */ TopCoinInfoEntity copy$default(TopCoinInfoEntity topCoinInfoEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = topCoinInfoEntity.crypto;
        }
        if ((i11 & 2) != 0) {
            str2 = topCoinInfoEntity.symbol;
        }
        return topCoinInfoEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final TopCoinInfoEntity copy(@Nullable String crypto, @Nullable String symbol) {
        return new TopCoinInfoEntity(crypto, symbol);
    }

    @Nullable
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.crypto;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.symbol;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopCoinInfoEntity(crypto=" + this.crypto + ", symbol=" + this.symbol + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.crypto);
        dest.writeString(this.symbol);
    }

    public TopCoinInfoEntity(@Nullable String str, @Nullable String str2) {
        this.crypto = str;
        this.symbol = str2;
    }
}
