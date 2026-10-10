package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.JsonAdapter;
import com.kubi.utils.BooleanTypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AvailableTradeAreaEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\rHÆ\u0003Jt\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\rHÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\tJ\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R.\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006<"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "Landroid/os/Parcelable;", "id", "", "displayName", "name", "hotMark", "", "sort", "", "tradingName", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDisplayName", "setDisplayName", "getName", "setName", "getHotMark", "()Ljava/lang/Boolean;", "setHotMark", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSort", "()Ljava/lang/Integer;", "setSort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTradingName", "setTradingName", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvailableTradeAreaEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AvailableTradeAreaEntity> CREATOR = new C15776a();

    @Nullable
    private ArrayList<AvailableTradeAreaEntity> children;

    @Nullable
    private String displayName;

    @JsonAdapter(BooleanTypeAdapter.class)
    @Nullable
    private Boolean hotMark;

    @Nullable
    private String id;

    @Nullable
    private String name;

    @Nullable
    private Integer sort;

    @Nullable
    private String tradingName;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.AvailableTradeAreaEntity$a */
    /* JADX INFO: compiled from: AvailableTradeAreaEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15776a implements Parcelable.Creator<AvailableTradeAreaEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvailableTradeAreaEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(AvailableTradeAreaEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new AvailableTradeAreaEntity(string, string2, string3, boolValueOf, numValueOf, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AvailableTradeAreaEntity[] newArray(int i11) {
            return new AvailableTradeAreaEntity[i11];
        }
    }

    public AvailableTradeAreaEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableTradeAreaEntity)) {
            return false;
        }
        AvailableTradeAreaEntity availableTradeAreaEntity = (AvailableTradeAreaEntity) other;
        return Intrinsics.areEqual(this.id, availableTradeAreaEntity.id) && Intrinsics.areEqual(this.displayName, availableTradeAreaEntity.displayName) && Intrinsics.areEqual(this.name, availableTradeAreaEntity.name) && Intrinsics.areEqual(this.hotMark, availableTradeAreaEntity.hotMark) && Intrinsics.areEqual(this.sort, availableTradeAreaEntity.sort) && Intrinsics.areEqual(this.tradingName, availableTradeAreaEntity.tradingName) && Intrinsics.areEqual(this.children, availableTradeAreaEntity.children);
    }

    public AvailableTradeAreaEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str4, @Nullable ArrayList<AvailableTradeAreaEntity> arrayList) {
        this.id = str;
        this.displayName = str2;
        this.name = str3;
        this.hotMark = bool;
        this.sort = num;
        this.tradingName = str4;
        this.children = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableTradeAreaEntity copy$default(AvailableTradeAreaEntity availableTradeAreaEntity, String str, String str2, String str3, Boolean bool, Integer num, String str4, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = availableTradeAreaEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = availableTradeAreaEntity.displayName;
        }
        if ((i11 & 4) != 0) {
            str3 = availableTradeAreaEntity.name;
        }
        if ((i11 & 8) != 0) {
            bool = availableTradeAreaEntity.hotMark;
        }
        if ((i11 & 16) != 0) {
            num = availableTradeAreaEntity.sort;
        }
        if ((i11 & 32) != 0) {
            str4 = availableTradeAreaEntity.tradingName;
        }
        if ((i11 & 64) != 0) {
            arrayList = availableTradeAreaEntity.children;
        }
        String str5 = str4;
        ArrayList arrayList2 = arrayList;
        Integer num2 = num;
        String str6 = str3;
        return availableTradeAreaEntity.copy(str, str2, str6, bool, num2, str5, arrayList2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHotMark() {
        return this.hotMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradingName() {
        return this.tradingName;
    }

    @Nullable
    public final ArrayList<AvailableTradeAreaEntity> component7() {
        return this.children;
    }

    @NotNull
    public final AvailableTradeAreaEntity copy(@Nullable String id2, @Nullable String displayName, @Nullable String name, @Nullable Boolean hotMark, @Nullable Integer sort, @Nullable String tradingName, @Nullable ArrayList<AvailableTradeAreaEntity> children) {
        return new AvailableTradeAreaEntity(id2, displayName, name, hotMark, sort, tradingName, children);
    }

    @Nullable
    public final ArrayList<AvailableTradeAreaEntity> getChildren() {
        return this.children;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final Boolean getHotMark() {
        return this.hotMark;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final String getTradingName() {
        return this.tradingName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hotMark;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.sort;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.tradingName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<AvailableTradeAreaEntity> arrayList = this.children;
        return iHashCode6 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setChildren(@Nullable ArrayList<AvailableTradeAreaEntity> arrayList) {
        this.children = arrayList;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setHotMark(@Nullable Boolean bool) {
        this.hotMark = bool;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSort(@Nullable Integer num) {
        this.sort = num;
    }

    public final void setTradingName(@Nullable String str) {
        this.tradingName = str;
    }

    @NotNull
    public String toString() {
        return "AvailableTradeAreaEntity(id=" + this.id + ", displayName=" + this.displayName + ", name=" + this.name + ", hotMark=" + this.hotMark + ", sort=" + this.sort + ", tradingName=" + this.tradingName + ", children=" + this.children + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.displayName);
        dest.writeString(this.name);
        Boolean bool = this.hotMark;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.sort;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.tradingName);
        ArrayList<AvailableTradeAreaEntity> arrayList = this.children;
        if (arrayList == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(arrayList.size());
        Iterator<AvailableTradeAreaEntity> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AvailableTradeAreaEntity(String str, String str2, String str3, Boolean bool, Integer num, String str4, ArrayList arrayList, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : arrayList);
    }
}
