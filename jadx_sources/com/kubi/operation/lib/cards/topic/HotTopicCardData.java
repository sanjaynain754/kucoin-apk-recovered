package com.kubi.operation.lib.cards.topic;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.operation.lib.entity.CoinTopicEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HotTopicCardData.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/topic/HotTopicCardData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "Lcom/kubi/operation/lib/entity/CoinTopicEntity;", "<init>", "(Lcom/kubi/operation/lib/entity/CoinTopicEntity;)V", "getData", "()Lcom/kubi/operation/lib/entity/CoinTopicEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HotTopicCardData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<HotTopicCardData> CREATOR = new C19474a();

    @Nullable
    private final CoinTopicEntity data;

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.topic.HotTopicCardData$a */
    /* JADX INFO: compiled from: HotTopicCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19474a implements Parcelable.Creator<HotTopicCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HotTopicCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotTopicCardData(parcel.readInt() == 0 ? null : CoinTopicEntity.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HotTopicCardData[] newArray(int i11) {
            return new HotTopicCardData[i11];
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HotTopicCardData) && Intrinsics.areEqual(this.data, ((HotTopicCardData) other).data);
    }

    public HotTopicCardData(@Nullable CoinTopicEntity coinTopicEntity) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        this.data = coinTopicEntity;
    }

    public static /* synthetic */ HotTopicCardData copy$default(HotTopicCardData hotTopicCardData, CoinTopicEntity coinTopicEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coinTopicEntity = hotTopicCardData.data;
        }
        return hotTopicCardData.copy(coinTopicEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoinTopicEntity getData() {
        return this.data;
    }

    @NotNull
    public final HotTopicCardData copy(@Nullable CoinTopicEntity data) {
        return new HotTopicCardData(data);
    }

    @Nullable
    public final CoinTopicEntity getData() {
        return this.data;
    }

    public int hashCode() {
        CoinTopicEntity coinTopicEntity = this.data;
        if (coinTopicEntity == null) {
            return 0;
        }
        return coinTopicEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "HotTopicCardData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CoinTopicEntity coinTopicEntity = this.data;
        if (coinTopicEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            coinTopicEntity.writeToParcel(dest, flags);
        }
    }
}
