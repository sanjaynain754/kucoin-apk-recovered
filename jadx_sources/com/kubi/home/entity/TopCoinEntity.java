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
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0011J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/entity/TopCoinEntity;", "Landroid/os/Parcelable;", "klineMetadata", "Lcom/kubi/home/entity/TopCoinInfoEntity;", "rate", "", "<init>", "(Lcom/kubi/home/entity/TopCoinInfoEntity;Ljava/lang/String;)V", "getKlineMetadata", "()Lcom/kubi/home/entity/TopCoinInfoEntity;", "getRate", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "component1", "component2", "copy", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TopCoinEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopCoinEntity> CREATOR = new C14557a();

    @Nullable
    private final TopCoinInfoEntity klineMetadata;

    @Nullable
    private final String rate;

    /* JADX INFO: renamed from: com.kubi.home.entity.TopCoinEntity$a */
    /* JADX INFO: compiled from: MoodInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14557a implements Parcelable.Creator<TopCoinEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TopCoinEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopCoinEntity(parcel.readInt() == 0 ? null : TopCoinInfoEntity.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TopCoinEntity[] newArray(int i11) {
            return new TopCoinEntity[i11];
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
        if (!Intrinsics.areEqual(TopCoinEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.home.entity.TopCoinEntity");
        TopCoinEntity topCoinEntity = (TopCoinEntity) other;
        return Intrinsics.areEqual(this.klineMetadata, topCoinEntity.klineMetadata) && Intrinsics.areEqual(this.rate, topCoinEntity.rate);
    }

    public static /* synthetic */ TopCoinEntity copy$default(TopCoinEntity topCoinEntity, TopCoinInfoEntity topCoinInfoEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            topCoinInfoEntity = topCoinEntity.klineMetadata;
        }
        if ((i11 & 2) != 0) {
            str = topCoinEntity.rate;
        }
        return topCoinEntity.copy(topCoinInfoEntity, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TopCoinInfoEntity getKlineMetadata() {
        return this.klineMetadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    @NotNull
    public final TopCoinEntity copy(@Nullable TopCoinInfoEntity klineMetadata, @Nullable String rate) {
        return new TopCoinEntity(klineMetadata, rate);
    }

    @Nullable
    public final TopCoinInfoEntity getKlineMetadata() {
        return this.klineMetadata;
    }

    @Nullable
    public final String getRate() {
        return this.rate;
    }

    public int hashCode() {
        TopCoinInfoEntity topCoinInfoEntity = this.klineMetadata;
        int iHashCode = (topCoinInfoEntity != null ? topCoinInfoEntity.hashCode() : 0) * 31;
        String str = this.rate;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopCoinEntity(klineMetadata=" + this.klineMetadata + ", rate=" + this.rate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TopCoinInfoEntity topCoinInfoEntity = this.klineMetadata;
        if (topCoinInfoEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            topCoinInfoEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.rate);
    }

    public TopCoinEntity(@Nullable TopCoinInfoEntity topCoinInfoEntity, @Nullable String str) {
        this.klineMetadata = topCoinInfoEntity;
        this.rate = str;
    }
}
