package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMenuEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "Landroid/os/Parcelable;", "spotMenu", "Lcom/kubi/quotefacade/entity/SpotMenu;", "futureMenu", "Lcom/kubi/quotefacade/entity/FutureMenu;", "etfMenu", "Lcom/kubi/quotefacade/entity/EtfMenu;", "<init>", "(Lcom/kubi/quotefacade/entity/SpotMenu;Lcom/kubi/quotefacade/entity/FutureMenu;Lcom/kubi/quotefacade/entity/EtfMenu;)V", "getSpotMenu", "()Lcom/kubi/quotefacade/entity/SpotMenu;", "getFutureMenu", "()Lcom/kubi/quotefacade/entity/FutureMenu;", "getEtfMenu", "()Lcom/kubi/quotefacade/entity/EtfMenu;", "setEtfMenu", "(Lcom/kubi/quotefacade/entity/EtfMenu;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketMenuEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketMenuEntity> CREATOR = new C21903a();

    @Nullable
    private EtfMenu etfMenu;

    @Nullable
    private final FutureMenu futureMenu;

    @Nullable
    private final SpotMenu spotMenu;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.MarketMenuEntity$a */
    /* JADX INFO: compiled from: MarketMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21903a implements Parcelable.Creator<MarketMenuEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketMenuEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketMenuEntity(parcel.readInt() == 0 ? null : SpotMenu.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FutureMenu.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EtfMenu.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketMenuEntity[] newArray(int i11) {
            return new MarketMenuEntity[i11];
        }
    }

    public MarketMenuEntity() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketMenuEntity)) {
            return false;
        }
        MarketMenuEntity marketMenuEntity = (MarketMenuEntity) other;
        return Intrinsics.areEqual(this.spotMenu, marketMenuEntity.spotMenu) && Intrinsics.areEqual(this.futureMenu, marketMenuEntity.futureMenu) && Intrinsics.areEqual(this.etfMenu, marketMenuEntity.etfMenu);
    }

    public MarketMenuEntity(@Nullable SpotMenu spotMenu, @Nullable FutureMenu futureMenu, @Nullable EtfMenu etfMenu) {
        this.spotMenu = spotMenu;
        this.futureMenu = futureMenu;
        this.etfMenu = etfMenu;
    }

    public static /* synthetic */ MarketMenuEntity copy$default(MarketMenuEntity marketMenuEntity, SpotMenu spotMenu, FutureMenu futureMenu, EtfMenu etfMenu, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            spotMenu = marketMenuEntity.spotMenu;
        }
        if ((i11 & 2) != 0) {
            futureMenu = marketMenuEntity.futureMenu;
        }
        if ((i11 & 4) != 0) {
            etfMenu = marketMenuEntity.etfMenu;
        }
        return marketMenuEntity.copy(spotMenu, futureMenu, etfMenu);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SpotMenu getSpotMenu() {
        return this.spotMenu;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FutureMenu getFutureMenu() {
        return this.futureMenu;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EtfMenu getEtfMenu() {
        return this.etfMenu;
    }

    @NotNull
    public final MarketMenuEntity copy(@Nullable SpotMenu spotMenu, @Nullable FutureMenu futureMenu, @Nullable EtfMenu etfMenu) {
        return new MarketMenuEntity(spotMenu, futureMenu, etfMenu);
    }

    @Nullable
    public final EtfMenu getEtfMenu() {
        return this.etfMenu;
    }

    @Nullable
    public final FutureMenu getFutureMenu() {
        return this.futureMenu;
    }

    @Nullable
    public final SpotMenu getSpotMenu() {
        return this.spotMenu;
    }

    public int hashCode() {
        SpotMenu spotMenu = this.spotMenu;
        int iHashCode = (spotMenu == null ? 0 : spotMenu.hashCode()) * 31;
        FutureMenu futureMenu = this.futureMenu;
        int iHashCode2 = (iHashCode + (futureMenu == null ? 0 : futureMenu.hashCode())) * 31;
        EtfMenu etfMenu = this.etfMenu;
        return iHashCode2 + (etfMenu != null ? etfMenu.hashCode() : 0);
    }

    public final void setEtfMenu(@Nullable EtfMenu etfMenu) {
        this.etfMenu = etfMenu;
    }

    @NotNull
    public String toString() {
        return "MarketMenuEntity(spotMenu=" + this.spotMenu + ", futureMenu=" + this.futureMenu + ", etfMenu=" + this.etfMenu + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        SpotMenu spotMenu = this.spotMenu;
        if (spotMenu == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            spotMenu.writeToParcel(dest, flags);
        }
        FutureMenu futureMenu = this.futureMenu;
        if (futureMenu == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            futureMenu.writeToParcel(dest, flags);
        }
        EtfMenu etfMenu = this.etfMenu;
        if (etfMenu == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            etfMenu.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MarketMenuEntity(SpotMenu spotMenu, FutureMenu futureMenu, EtfMenu etfMenu, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : spotMenu, (i11 & 2) != 0 ? null : futureMenu, (i11 & 4) != 0 ? null : etfMenu);
    }
}
