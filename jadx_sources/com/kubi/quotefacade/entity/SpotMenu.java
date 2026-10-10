package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMenuEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/SpotMenu;", "Landroid/os/Parcelable;", "expiredAt", "", "batch", "enabled", "", "level1", "", "Lcom/kubi/quotefacade/entity/SpotLevel1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getExpiredAt", "()Ljava/lang/String;", "getBatch", "getEnabled", "()Z", "getLevel1", "()Ljava/util/List;", "equals", "other", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotMenu implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpotMenu> CREATOR = new C21913a();

    @Nullable
    private final String batch;
    private final boolean enabled;

    @Nullable
    private final String expiredAt;

    @Nullable
    private final List<SpotLevel1> level1;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.SpotMenu$a */
    /* JADX INFO: compiled from: MarketMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21913a implements Parcelable.Creator<SpotMenu> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpotMenu createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(SpotLevel1.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SpotMenu(string, string2, z11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpotMenu[] newArray(int i11) {
            return new SpotMenu[i11];
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
        if (!(other instanceof SpotMenu)) {
            return false;
        }
        SpotMenu spotMenu = (SpotMenu) other;
        return Intrinsics.areEqual(this.level1, spotMenu.level1) && this.enabled == spotMenu.enabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotMenu copy$default(SpotMenu spotMenu, String str, String str2, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = spotMenu.expiredAt;
        }
        if ((i11 & 2) != 0) {
            str2 = spotMenu.batch;
        }
        if ((i11 & 4) != 0) {
            z11 = spotMenu.enabled;
        }
        if ((i11 & 8) != 0) {
            list = spotMenu.level1;
        }
        return spotMenu.copy(str, str2, z11, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBatch() {
        return this.batch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<SpotLevel1> component4() {
        return this.level1;
    }

    @NotNull
    public final SpotMenu copy(@Nullable String expiredAt, @Nullable String batch, boolean enabled, @Nullable List<SpotLevel1> level1) {
        return new SpotMenu(expiredAt, batch, enabled, level1);
    }

    @Nullable
    public final String getBatch() {
        return this.batch;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    @Nullable
    public final List<SpotLevel1> getLevel1() {
        return this.level1;
    }

    public int hashCode() {
        String str = this.expiredAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.batch;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31;
        List<SpotLevel1> list = this.level1;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotMenu(expiredAt=" + this.expiredAt + ", batch=" + this.batch + ", enabled=" + this.enabled + ", level1=" + this.level1 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.expiredAt);
        dest.writeString(this.batch);
        dest.writeInt(this.enabled ? 1 : 0);
        List<SpotLevel1> list = this.level1;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<SpotLevel1> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public SpotMenu(@Nullable String str, @Nullable String str2, boolean z11, @Nullable List<SpotLevel1> list) {
        this.expiredAt = str;
        this.batch = str2;
        this.enabled = z11;
        this.level1 = list;
    }
}
