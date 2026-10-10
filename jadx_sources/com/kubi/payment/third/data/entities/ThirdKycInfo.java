package com.kubi.payment.third.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdKyc.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JB\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "Landroid/os/Parcelable;", "exist", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "extraParams", "", "", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V", "getExist", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItems", "()Ljava/util/List;", "getExtraParams", "()Ljava/util/Map;", "setExtraParams", "(Ljava/util/Map;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdKycInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThirdKycInfo> CREATOR = new C21388a();

    @Nullable
    private final Boolean exist;

    @NotNull
    private Map<String, String> extraParams;

    @Nullable
    private final List<ThirdKycItem> items;

    /* JADX INFO: renamed from: com.kubi.payment.third.data.entities.ThirdKycInfo$a */
    /* JADX INFO: compiled from: ThirdKyc.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21388a implements Parcelable.Creator<ThirdKycInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ThirdKycInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(ThirdKycItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new ThirdKycInfo(boolValueOf, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThirdKycInfo[] newArray(int i11) {
            return new ThirdKycInfo[i11];
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
        if (!(other instanceof ThirdKycInfo)) {
            return false;
        }
        ThirdKycInfo thirdKycInfo = (ThirdKycInfo) other;
        return Intrinsics.areEqual(this.exist, thirdKycInfo.exist) && Intrinsics.areEqual(this.items, thirdKycInfo.items) && Intrinsics.areEqual(this.extraParams, thirdKycInfo.extraParams);
    }

    public ThirdKycInfo(@Nullable Boolean bool, @Nullable List<ThirdKycItem> list, @NotNull Map<String, String> extraParams) {
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        this.exist = bool;
        this.items = list;
        this.extraParams = extraParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirdKycInfo copy$default(ThirdKycInfo thirdKycInfo, Boolean bool, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = thirdKycInfo.exist;
        }
        if ((i11 & 2) != 0) {
            list = thirdKycInfo.items;
        }
        if ((i11 & 4) != 0) {
            map = thirdKycInfo.extraParams;
        }
        return thirdKycInfo.copy(bool, list, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getExist() {
        return this.exist;
    }

    @Nullable
    public final List<ThirdKycItem> component2() {
        return this.items;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.extraParams;
    }

    @NotNull
    public final ThirdKycInfo copy(@Nullable Boolean exist, @Nullable List<ThirdKycItem> items, @NotNull Map<String, String> extraParams) {
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        return new ThirdKycInfo(exist, items, extraParams);
    }

    @Nullable
    public final Boolean getExist() {
        return this.exist;
    }

    @NotNull
    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    @Nullable
    public final List<ThirdKycItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        Boolean bool = this.exist;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<ThirdKycItem> list = this.items;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.extraParams.hashCode();
    }

    public final void setExtraParams(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extraParams = map;
    }

    @NotNull
    public String toString() {
        return "ThirdKycInfo(exist=" + this.exist + ", items=" + this.items + ", extraParams=" + this.extraParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.exist;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<ThirdKycItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ThirdKycItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Map<String, String> map = this.extraParams;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}
