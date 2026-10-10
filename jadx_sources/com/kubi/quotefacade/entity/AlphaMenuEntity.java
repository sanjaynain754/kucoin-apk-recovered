package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaMenuEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaMenuEntity;", "Landroid/os/Parcelable;", "highlightsMenu", "Lcom/kubi/quotefacade/entity/TabMenuEntity;", "chainAreaMenu", "<init>", "(Lcom/kubi/quotefacade/entity/TabMenuEntity;Lcom/kubi/quotefacade/entity/TabMenuEntity;)V", "getHighlightsMenu", "()Lcom/kubi/quotefacade/entity/TabMenuEntity;", "getChainAreaMenu", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaMenuEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaMenuEntity> CREATOR = new C21867a();

    @Nullable
    private final TabMenuEntity chainAreaMenu;

    @Nullable
    private final TabMenuEntity highlightsMenu;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaMenuEntity$a */
    /* JADX INFO: compiled from: AlphaMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21867a implements Parcelable.Creator<AlphaMenuEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaMenuEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaMenuEntity(parcel.readInt() == 0 ? null : TabMenuEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TabMenuEntity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaMenuEntity[] newArray(int i11) {
            return new AlphaMenuEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlphaMenuEntity() {
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
        if (!(other instanceof AlphaMenuEntity)) {
            return false;
        }
        AlphaMenuEntity alphaMenuEntity = (AlphaMenuEntity) other;
        return Intrinsics.areEqual(this.highlightsMenu, alphaMenuEntity.highlightsMenu) && Intrinsics.areEqual(this.chainAreaMenu, alphaMenuEntity.chainAreaMenu);
    }

    public AlphaMenuEntity(@Nullable TabMenuEntity tabMenuEntity, @Nullable TabMenuEntity tabMenuEntity2) {
        this.highlightsMenu = tabMenuEntity;
        this.chainAreaMenu = tabMenuEntity2;
    }

    public static /* synthetic */ AlphaMenuEntity copy$default(AlphaMenuEntity alphaMenuEntity, TabMenuEntity tabMenuEntity, TabMenuEntity tabMenuEntity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tabMenuEntity = alphaMenuEntity.highlightsMenu;
        }
        if ((i11 & 2) != 0) {
            tabMenuEntity2 = alphaMenuEntity.chainAreaMenu;
        }
        return alphaMenuEntity.copy(tabMenuEntity, tabMenuEntity2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TabMenuEntity getHighlightsMenu() {
        return this.highlightsMenu;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TabMenuEntity getChainAreaMenu() {
        return this.chainAreaMenu;
    }

    @NotNull
    public final AlphaMenuEntity copy(@Nullable TabMenuEntity highlightsMenu, @Nullable TabMenuEntity chainAreaMenu) {
        return new AlphaMenuEntity(highlightsMenu, chainAreaMenu);
    }

    @Nullable
    public final TabMenuEntity getChainAreaMenu() {
        return this.chainAreaMenu;
    }

    @Nullable
    public final TabMenuEntity getHighlightsMenu() {
        return this.highlightsMenu;
    }

    public int hashCode() {
        TabMenuEntity tabMenuEntity = this.highlightsMenu;
        int iHashCode = (tabMenuEntity == null ? 0 : tabMenuEntity.hashCode()) * 31;
        TabMenuEntity tabMenuEntity2 = this.chainAreaMenu;
        return iHashCode + (tabMenuEntity2 != null ? tabMenuEntity2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlphaMenuEntity(highlightsMenu=" + this.highlightsMenu + ", chainAreaMenu=" + this.chainAreaMenu + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TabMenuEntity tabMenuEntity = this.highlightsMenu;
        if (tabMenuEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tabMenuEntity.writeToParcel(dest, flags);
        }
        TabMenuEntity tabMenuEntity2 = this.chainAreaMenu;
        if (tabMenuEntity2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tabMenuEntity2.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AlphaMenuEntity(TabMenuEntity tabMenuEntity, TabMenuEntity tabMenuEntity2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : tabMenuEntity, (i11 & 2) != 0 ? null : tabMenuEntity2);
    }
}
