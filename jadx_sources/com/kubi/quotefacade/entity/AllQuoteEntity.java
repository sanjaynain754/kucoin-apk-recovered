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
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u0003J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00065"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AllQuoteEntity;", "Landroid/os/Parcelable;", "order", "", "collectType", SearchCategory$Companion.SPOT, "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "contract", "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;", "etf", "alpha", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;Lcom/kubi/quotefacade/entity/FutureQuoteEntity;Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;Lcom/kubi/quotefacade/entity/AlphaItemEntity;)V", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCollectType", "getSpot", "()Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "setSpot", "(Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;)V", "getContract", "()Lcom/kubi/quotefacade/entity/FutureQuoteEntity;", "setContract", "(Lcom/kubi/quotefacade/entity/FutureQuoteEntity;)V", "getEtf", "setEtf", "getAlpha", "()Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "setAlpha", "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;Lcom/kubi/quotefacade/entity/FutureQuoteEntity;Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;Lcom/kubi/quotefacade/entity/AlphaItemEntity;)Lcom/kubi/quotefacade/entity/AllQuoteEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AllQuoteEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AllQuoteEntity> CREATOR = new C21860a();

    @Nullable
    private AlphaItemEntity alpha;

    @Nullable
    private final Integer collectType;

    @Nullable
    private FutureQuoteEntity contract;

    @Nullable
    private FavMarketQuoteEntity etf;

    @Nullable
    private final Integer order;

    @Nullable
    private FavMarketQuoteEntity spot;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AllQuoteEntity$a */
    /* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21860a implements Parcelable.Creator<AllQuoteEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AllQuoteEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllQuoteEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : FavMarketQuoteEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FutureQuoteEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FavMarketQuoteEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AlphaItemEntity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AllQuoteEntity[] newArray(int i11) {
            return new AllQuoteEntity[i11];
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
        if (!(other instanceof AllQuoteEntity)) {
            return false;
        }
        AllQuoteEntity allQuoteEntity = (AllQuoteEntity) other;
        return Intrinsics.areEqual(this.order, allQuoteEntity.order) && Intrinsics.areEqual(this.collectType, allQuoteEntity.collectType) && Intrinsics.areEqual(this.spot, allQuoteEntity.spot) && Intrinsics.areEqual(this.contract, allQuoteEntity.contract) && Intrinsics.areEqual(this.etf, allQuoteEntity.etf) && Intrinsics.areEqual(this.alpha, allQuoteEntity.alpha);
    }

    public static /* synthetic */ AllQuoteEntity copy$default(AllQuoteEntity allQuoteEntity, Integer num, Integer num2, FavMarketQuoteEntity favMarketQuoteEntity, FutureQuoteEntity futureQuoteEntity, FavMarketQuoteEntity favMarketQuoteEntity2, AlphaItemEntity alphaItemEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = allQuoteEntity.order;
        }
        if ((i11 & 2) != 0) {
            num2 = allQuoteEntity.collectType;
        }
        if ((i11 & 4) != 0) {
            favMarketQuoteEntity = allQuoteEntity.spot;
        }
        if ((i11 & 8) != 0) {
            futureQuoteEntity = allQuoteEntity.contract;
        }
        if ((i11 & 16) != 0) {
            favMarketQuoteEntity2 = allQuoteEntity.etf;
        }
        if ((i11 & 32) != 0) {
            alphaItemEntity = allQuoteEntity.alpha;
        }
        FavMarketQuoteEntity favMarketQuoteEntity3 = favMarketQuoteEntity2;
        AlphaItemEntity alphaItemEntity2 = alphaItemEntity;
        return allQuoteEntity.copy(num, num2, favMarketQuoteEntity, futureQuoteEntity, favMarketQuoteEntity3, alphaItemEntity2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FavMarketQuoteEntity getSpot() {
        return this.spot;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FutureQuoteEntity getContract() {
        return this.contract;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FavMarketQuoteEntity getEtf() {
        return this.etf;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AlphaItemEntity getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final AllQuoteEntity copy(@Nullable Integer order, @Nullable Integer collectType, @Nullable FavMarketQuoteEntity spot, @Nullable FutureQuoteEntity contract, @Nullable FavMarketQuoteEntity etf, @Nullable AlphaItemEntity alpha) {
        return new AllQuoteEntity(order, collectType, spot, contract, etf, alpha);
    }

    @Nullable
    public final AlphaItemEntity getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    public final FutureQuoteEntity getContract() {
        return this.contract;
    }

    @Nullable
    public final FavMarketQuoteEntity getEtf() {
        return this.etf;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    public final FavMarketQuoteEntity getSpot() {
        return this.spot;
    }

    public int hashCode() {
        Integer num = this.order;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.collectType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        FavMarketQuoteEntity favMarketQuoteEntity = this.spot;
        int iHashCode3 = (iHashCode2 + (favMarketQuoteEntity == null ? 0 : favMarketQuoteEntity.hashCode())) * 31;
        FutureQuoteEntity futureQuoteEntity = this.contract;
        int iHashCode4 = (iHashCode3 + (futureQuoteEntity == null ? 0 : futureQuoteEntity.hashCode())) * 31;
        FavMarketQuoteEntity favMarketQuoteEntity2 = this.etf;
        int iHashCode5 = (iHashCode4 + (favMarketQuoteEntity2 == null ? 0 : favMarketQuoteEntity2.hashCode())) * 31;
        AlphaItemEntity alphaItemEntity = this.alpha;
        return iHashCode5 + (alphaItemEntity != null ? alphaItemEntity.hashCode() : 0);
    }

    public final void setAlpha(@Nullable AlphaItemEntity alphaItemEntity) {
        this.alpha = alphaItemEntity;
    }

    public final void setContract(@Nullable FutureQuoteEntity futureQuoteEntity) {
        this.contract = futureQuoteEntity;
    }

    public final void setEtf(@Nullable FavMarketQuoteEntity favMarketQuoteEntity) {
        this.etf = favMarketQuoteEntity;
    }

    public final void setSpot(@Nullable FavMarketQuoteEntity favMarketQuoteEntity) {
        this.spot = favMarketQuoteEntity;
    }

    @NotNull
    public String toString() {
        return "AllQuoteEntity(order=" + this.order + ", collectType=" + this.collectType + ", spot=" + this.spot + ", contract=" + this.contract + ", etf=" + this.etf + ", alpha=" + this.alpha + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.order;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.collectType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        FavMarketQuoteEntity favMarketQuoteEntity = this.spot;
        if (favMarketQuoteEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            favMarketQuoteEntity.writeToParcel(dest, flags);
        }
        FutureQuoteEntity futureQuoteEntity = this.contract;
        if (futureQuoteEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            futureQuoteEntity.writeToParcel(dest, flags);
        }
        FavMarketQuoteEntity favMarketQuoteEntity2 = this.etf;
        if (favMarketQuoteEntity2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            favMarketQuoteEntity2.writeToParcel(dest, flags);
        }
        AlphaItemEntity alphaItemEntity = this.alpha;
        if (alphaItemEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alphaItemEntity.writeToParcel(dest, flags);
        }
    }

    public AllQuoteEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable FavMarketQuoteEntity favMarketQuoteEntity, @Nullable FutureQuoteEntity futureQuoteEntity, @Nullable FavMarketQuoteEntity favMarketQuoteEntity2, @Nullable AlphaItemEntity alphaItemEntity) {
        this.order = num;
        this.collectType = num2;
        this.spot = favMarketQuoteEntity;
        this.contract = futureQuoteEntity;
        this.etf = favMarketQuoteEntity2;
        this.alpha = alphaItemEntity;
    }
}
