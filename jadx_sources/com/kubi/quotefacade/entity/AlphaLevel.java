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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaMenuEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\bJ\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014¨\u0006-"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaLevel;", "Landroid/os/Parcelable;", "category", "", "networks", "", "Lcom/kubi/quotefacade/entity/AlphaNetworks;", "count", "", "dataEnabled", "", "enabled", "last48HourPublishedCount", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZZLjava/lang/Integer;)V", "getCategory", "()Ljava/lang/String;", "getNetworks", "()Ljava/util/List;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDataEnabled", "()Z", "getEnabled", "getLast48HourPublishedCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZZLjava/lang/Integer;)Lcom/kubi/quotefacade/entity/AlphaLevel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaLevel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaLevel> CREATOR = new C21864a();

    @NotNull
    private final String category;

    @Nullable
    private final Integer count;
    private final boolean dataEnabled;
    private final boolean enabled;

    @Nullable
    private final Integer last48HourPublishedCount;

    @Nullable
    private final List<AlphaNetworks> networks;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaLevel$a */
    /* JADX INFO: compiled from: AlphaMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21864a implements Parcelable.Creator<AlphaLevel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaLevel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(AlphaNetworks.CREATOR.createFromParcel(parcel));
                }
            }
            return new AlphaLevel(string, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaLevel[] newArray(int i11) {
            return new AlphaLevel[i11];
        }
    }

    public AlphaLevel(@NotNull String category, @Nullable List<AlphaNetworks> list, @Nullable Integer num, boolean z11, boolean z12, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        this.networks = list;
        this.count = num;
        this.dataEnabled = z11;
        this.enabled = z12;
        this.last48HourPublishedCount = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaLevel)) {
            return false;
        }
        AlphaLevel alphaLevel = (AlphaLevel) other;
        return Intrinsics.areEqual(this.category, alphaLevel.category) && Intrinsics.areEqual(this.networks, alphaLevel.networks) && Intrinsics.areEqual(this.count, alphaLevel.count) && this.dataEnabled == alphaLevel.dataEnabled && this.enabled == alphaLevel.enabled && Intrinsics.areEqual(this.last48HourPublishedCount, alphaLevel.last48HourPublishedCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaLevel copy$default(AlphaLevel alphaLevel, String str, List list, Integer num, boolean z11, boolean z12, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alphaLevel.category;
        }
        if ((i11 & 2) != 0) {
            list = alphaLevel.networks;
        }
        if ((i11 & 4) != 0) {
            num = alphaLevel.count;
        }
        if ((i11 & 8) != 0) {
            z11 = alphaLevel.dataEnabled;
        }
        if ((i11 & 16) != 0) {
            z12 = alphaLevel.enabled;
        }
        if ((i11 & 32) != 0) {
            num2 = alphaLevel.last48HourPublishedCount;
        }
        boolean z13 = z12;
        Integer num3 = num2;
        return alphaLevel.copy(str, list, num, z11, z13, num3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final List<AlphaNetworks> component2() {
        return this.networks;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDataEnabled() {
        return this.dataEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getLast48HourPublishedCount() {
        return this.last48HourPublishedCount;
    }

    @NotNull
    public final AlphaLevel copy(@NotNull String category, @Nullable List<AlphaNetworks> networks, @Nullable Integer count, boolean dataEnabled, boolean enabled, @Nullable Integer last48HourPublishedCount) {
        Intrinsics.checkNotNullParameter(category, "category");
        return new AlphaLevel(category, networks, count, dataEnabled, enabled, last48HourPublishedCount);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    public final boolean getDataEnabled() {
        return this.dataEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Integer getLast48HourPublishedCount() {
        return this.last48HourPublishedCount;
    }

    @Nullable
    public final List<AlphaNetworks> getNetworks() {
        return this.networks;
    }

    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        List<AlphaNetworks> list = this.networks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.dataEnabled)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Integer num2 = this.last48HourPublishedCount;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlphaLevel(category=" + this.category + ", networks=" + this.networks + ", count=" + this.count + ", dataEnabled=" + this.dataEnabled + ", enabled=" + this.enabled + ", last48HourPublishedCount=" + this.last48HourPublishedCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.category);
        List<AlphaNetworks> list = this.networks;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AlphaNetworks> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Integer num = this.count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.dataEnabled ? 1 : 0);
        dest.writeInt(this.enabled ? 1 : 0);
        Integer num2 = this.last48HourPublishedCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ AlphaLevel(String str, List list, Integer num, boolean z11, boolean z12, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i11 & 4) != 0 ? null : num, z11, z12, (i11 & 32) != 0 ? null : num2);
    }
}
