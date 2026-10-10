package com.kubi.home.newcoin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.home.entity.RecommendNewCoinEntity;
import com.kubi.kucoin.home.cards.BaseCardData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewCoinData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/newcoin/NewCoinData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "Lcom/kubi/home/entity/RecommendNewCoinEntity;", "<init>", "(Lcom/kubi/home/entity/RecommendNewCoinEntity;)V", "getData", "()Lcom/kubi/home/entity/RecommendNewCoinEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewCoinData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<NewCoinData> CREATOR = new C14729a();

    @Nullable
    private final RecommendNewCoinEntity data;

    /* JADX INFO: renamed from: com.kubi.home.newcoin.NewCoinData$a */
    /* JADX INFO: compiled from: NewCoinData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14729a implements Parcelable.Creator<NewCoinData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NewCoinData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewCoinData(parcel.readInt() == 0 ? null : RecommendNewCoinEntity.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NewCoinData[] newArray(int i11) {
            return new NewCoinData[i11];
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewCoinData) && Intrinsics.areEqual(this.data, ((NewCoinData) other).data);
    }

    public NewCoinData(@Nullable RecommendNewCoinEntity recommendNewCoinEntity) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        this.data = recommendNewCoinEntity;
    }

    public static /* synthetic */ NewCoinData copy$default(NewCoinData newCoinData, RecommendNewCoinEntity recommendNewCoinEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            recommendNewCoinEntity = newCoinData.data;
        }
        return newCoinData.copy(recommendNewCoinEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecommendNewCoinEntity getData() {
        return this.data;
    }

    @NotNull
    public final NewCoinData copy(@Nullable RecommendNewCoinEntity data) {
        return new NewCoinData(data);
    }

    @Nullable
    public final RecommendNewCoinEntity getData() {
        return this.data;
    }

    public int hashCode() {
        RecommendNewCoinEntity recommendNewCoinEntity = this.data;
        if (recommendNewCoinEntity == null) {
            return 0;
        }
        return recommendNewCoinEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "NewCoinData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RecommendNewCoinEntity recommendNewCoinEntity = this.data;
        if (recommendNewCoinEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recommendNewCoinEntity.writeToParcel(dest, flags);
        }
    }
}
