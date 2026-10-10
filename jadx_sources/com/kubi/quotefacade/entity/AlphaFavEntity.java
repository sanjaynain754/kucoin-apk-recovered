package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaFavEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaFavEntity;", "Lcom/kubi/data/entity/TradeItemBean;", "itemEntity", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "<init>", "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;)V", "getItemEntity", "()Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "equals", "", "other", "", "hashCode", "", "component1", "copy", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaFavEntity extends TradeItemBean {

    @NotNull
    public static final Parcelable.Creator<AlphaFavEntity> CREATOR = new C21862a();

    @NotNull
    private final AlphaItemEntity itemEntity;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaFavEntity$a */
    /* JADX INFO: compiled from: AlphaFavEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21862a implements Parcelable.Creator<AlphaFavEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaFavEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaFavEntity(AlphaItemEntity.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaFavEntity[] newArray(int i11) {
            return new AlphaFavEntity[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaFavEntity(@NotNull AlphaItemEntity itemEntity) {
        super(itemEntity.getUniqueCode());
        Intrinsics.checkNotNullParameter(itemEntity, "itemEntity");
        this.itemEntity = itemEntity;
    }

    public static /* synthetic */ AlphaFavEntity copy$default(AlphaFavEntity alphaFavEntity, AlphaItemEntity alphaItemEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            alphaItemEntity = alphaFavEntity.itemEntity;
        }
        return alphaFavEntity.copy(alphaItemEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AlphaItemEntity getItemEntity() {
        return this.itemEntity;
    }

    @NotNull
    public final AlphaFavEntity copy(@NotNull AlphaItemEntity itemEntity) {
        Intrinsics.checkNotNullParameter(itemEntity, "itemEntity");
        return new AlphaFavEntity(itemEntity);
    }

    @Override // com.kubi.data.entity.TradeItemBean
    public boolean equals(@Nullable Object other) {
        if (other instanceof AlphaFavEntity) {
            return Intrinsics.areEqual(((AlphaFavEntity) other).itemEntity, this.itemEntity);
        }
        return this == other;
    }

    @NotNull
    public final AlphaItemEntity getItemEntity() {
        return this.itemEntity;
    }

    public int hashCode() {
        return this.itemEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlphaFavEntity(itemEntity=" + this.itemEntity + ')';
    }

    @Override // com.kubi.data.entity.TradeItemBean, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.itemEntity.writeToParcel(dest, flags);
    }
}
