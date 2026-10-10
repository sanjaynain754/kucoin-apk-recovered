package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/UserFavoritesItem;", "Landroid/os/Parcelable;", "type", "", SearchCategory$Companion.SPOT, "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", SearchCategory$Companion.FUTURES, "alpha", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "<init>", "(Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntityItem;Lcom/kubi/quotefacade/entity/MarketListEntityItem;Lcom/kubi/quotefacade/entity/AlphaItemEntity;)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSpot", "()Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "getFutures", "getAlpha", "()Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntityItem;Lcom/kubi/quotefacade/entity/MarketListEntityItem;Lcom/kubi/quotefacade/entity/AlphaItemEntity;)Lcom/kubi/quotefacade/entity/UserFavoritesItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserFavoritesItem implements Parcelable {
    public static final int TYPE_ALPHA = 3;
    public static final int TYPE_FUTURES = 2;
    public static final int TYPE_SPOT = 1;

    @Nullable
    private final AlphaItemEntity alpha;

    @Nullable
    private final MarketListEntityItem futures;

    @Nullable
    private final MarketListEntityItem spot;

    @Nullable
    private final Integer type;

    @NotNull
    public static final Parcelable.Creator<UserFavoritesItem> CREATOR = new C21917a();

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.UserFavoritesItem$a */
    /* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21917a implements Parcelable.Creator<UserFavoritesItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserFavoritesItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserFavoritesItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MarketListEntityItem) parcel.readParcelable(UserFavoritesItem.class.getClassLoader()), (MarketListEntityItem) parcel.readParcelable(UserFavoritesItem.class.getClassLoader()), parcel.readInt() != 0 ? AlphaItemEntity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserFavoritesItem[] newArray(int i11) {
            return new UserFavoritesItem[i11];
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
        if (!(other instanceof UserFavoritesItem)) {
            return false;
        }
        UserFavoritesItem userFavoritesItem = (UserFavoritesItem) other;
        return Intrinsics.areEqual(this.type, userFavoritesItem.type) && Intrinsics.areEqual(this.spot, userFavoritesItem.spot) && Intrinsics.areEqual(this.futures, userFavoritesItem.futures) && Intrinsics.areEqual(this.alpha, userFavoritesItem.alpha);
    }

    public static /* synthetic */ UserFavoritesItem copy$default(UserFavoritesItem userFavoritesItem, Integer num, MarketListEntityItem marketListEntityItem, MarketListEntityItem marketListEntityItem2, AlphaItemEntity alphaItemEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = userFavoritesItem.type;
        }
        if ((i11 & 2) != 0) {
            marketListEntityItem = userFavoritesItem.spot;
        }
        if ((i11 & 4) != 0) {
            marketListEntityItem2 = userFavoritesItem.futures;
        }
        if ((i11 & 8) != 0) {
            alphaItemEntity = userFavoritesItem.alpha;
        }
        return userFavoritesItem.copy(num, marketListEntityItem, marketListEntityItem2, alphaItemEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarketListEntityItem getSpot() {
        return this.spot;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarketListEntityItem getFutures() {
        return this.futures;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AlphaItemEntity getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final UserFavoritesItem copy(@Nullable Integer type, @Nullable MarketListEntityItem spot, @Nullable MarketListEntityItem futures, @Nullable AlphaItemEntity alpha) {
        return new UserFavoritesItem(type, spot, futures, alpha);
    }

    @Nullable
    public final AlphaItemEntity getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final MarketListEntityItem getFutures() {
        return this.futures;
    }

    @Nullable
    public final MarketListEntityItem getSpot() {
        return this.spot;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        MarketListEntityItem marketListEntityItem = this.spot;
        int iHashCode2 = (iHashCode + (marketListEntityItem == null ? 0 : marketListEntityItem.hashCode())) * 31;
        MarketListEntityItem marketListEntityItem2 = this.futures;
        int iHashCode3 = (iHashCode2 + (marketListEntityItem2 == null ? 0 : marketListEntityItem2.hashCode())) * 31;
        AlphaItemEntity alphaItemEntity = this.alpha;
        return iHashCode3 + (alphaItemEntity != null ? alphaItemEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserFavoritesItem(type=" + this.type + ", spot=" + this.spot + ", futures=" + this.futures + ", alpha=" + this.alpha + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.spot, flags);
        dest.writeParcelable(this.futures, flags);
        AlphaItemEntity alphaItemEntity = this.alpha;
        if (alphaItemEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alphaItemEntity.writeToParcel(dest, flags);
        }
    }

    public UserFavoritesItem(@Nullable Integer num, @Nullable MarketListEntityItem marketListEntityItem, @Nullable MarketListEntityItem marketListEntityItem2, @Nullable AlphaItemEntity alphaItemEntity) {
        this.type = num;
        this.spot = marketListEntityItem;
        this.futures = marketListEntityItem2;
        this.alpha = alphaItemEntity;
    }
}
