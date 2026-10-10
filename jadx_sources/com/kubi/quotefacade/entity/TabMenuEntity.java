package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33590cg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaMenuEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/TabMenuEntity;", "Landroid/os/Parcelable;", "expiredAt", "", "batch", "level1", "", "Lcom/kubi/quotefacade/entity/AlphaLevel;", "dataEnabled", "", "enabled", C33590cg.f69441k, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZ)V", "getExpiredAt", "()Ljava/lang/String;", "getBatch", "getLevel1", "()Ljava/util/List;", "getDataEnabled", "()Z", "getEnabled", "getExpired", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabMenuEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TabMenuEntity> CREATOR = new C21914a();

    @Nullable
    private final String batch;
    private final boolean dataEnabled;
    private final boolean enabled;
    private final boolean expired;

    @Nullable
    private final String expiredAt;

    @Nullable
    private final List<AlphaLevel> level1;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.TabMenuEntity$a */
    /* JADX INFO: compiled from: AlphaMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21914a implements Parcelable.Creator<TabMenuEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TabMenuEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(AlphaLevel.CREATOR.createFromParcel(parcel));
                }
            }
            boolean z11 = true;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new TabMenuEntity(string, string2, arrayList, z11, parcel.readInt() != 0, parcel.readInt() != 0 ? z11 : false);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TabMenuEntity[] newArray(int i11) {
            return new TabMenuEntity[i11];
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
        if (!(other instanceof TabMenuEntity)) {
            return false;
        }
        TabMenuEntity tabMenuEntity = (TabMenuEntity) other;
        return Intrinsics.areEqual(this.expiredAt, tabMenuEntity.expiredAt) && Intrinsics.areEqual(this.batch, tabMenuEntity.batch) && Intrinsics.areEqual(this.level1, tabMenuEntity.level1) && this.dataEnabled == tabMenuEntity.dataEnabled && this.enabled == tabMenuEntity.enabled && this.expired == tabMenuEntity.expired;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabMenuEntity copy$default(TabMenuEntity tabMenuEntity, String str, String str2, List list, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabMenuEntity.expiredAt;
        }
        if ((i11 & 2) != 0) {
            str2 = tabMenuEntity.batch;
        }
        if ((i11 & 4) != 0) {
            list = tabMenuEntity.level1;
        }
        if ((i11 & 8) != 0) {
            z11 = tabMenuEntity.dataEnabled;
        }
        if ((i11 & 16) != 0) {
            z12 = tabMenuEntity.enabled;
        }
        if ((i11 & 32) != 0) {
            z13 = tabMenuEntity.expired;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return tabMenuEntity.copy(str, str2, list, z11, z14, z15);
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

    @Nullable
    public final List<AlphaLevel> component3() {
        return this.level1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDataEnabled() {
        return this.dataEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    @NotNull
    public final TabMenuEntity copy(@Nullable String expiredAt, @Nullable String batch, @Nullable List<AlphaLevel> level1, boolean dataEnabled, boolean enabled, boolean expired) {
        return new TabMenuEntity(expiredAt, batch, level1, dataEnabled, enabled, expired);
    }

    @Nullable
    public final String getBatch() {
        return this.batch;
    }

    public final boolean getDataEnabled() {
        return this.dataEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    @Nullable
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    @Nullable
    public final List<AlphaLevel> getLevel1() {
        return this.level1;
    }

    public int hashCode() {
        String str = this.expiredAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.batch;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AlphaLevel> list = this.level1;
        return ((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.dataEnabled)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.expired);
    }

    @NotNull
    public String toString() {
        return "TabMenuEntity(expiredAt=" + this.expiredAt + ", batch=" + this.batch + ", level1=" + this.level1 + ", dataEnabled=" + this.dataEnabled + ", enabled=" + this.enabled + ", expired=" + this.expired + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.expiredAt);
        dest.writeString(this.batch);
        List<AlphaLevel> list = this.level1;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AlphaLevel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.dataEnabled ? 1 : 0);
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeInt(this.expired ? 1 : 0);
    }

    public TabMenuEntity(@Nullable String str, @Nullable String str2, @Nullable List<AlphaLevel> list, boolean z11, boolean z12, boolean z13) {
        this.expiredAt = str;
        this.batch = str2;
        this.level1 = list;
        this.dataEnabled = z11;
        this.enabled = z12;
        this.expired = z13;
    }
}
