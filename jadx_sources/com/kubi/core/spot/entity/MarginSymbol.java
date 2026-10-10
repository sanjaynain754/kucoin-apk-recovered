package com.kubi.core.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.SymbolInfoEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsSymbolInfoEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/core/spot/entity/MarginSymbol;", "Landroid/os/Parcelable;", "value", "", "Lcom/kubi/data/entity/SymbolInfoEntity;", "groupKey", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getValue", "()Ljava/util/List;", "getGroupKey", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginSymbol implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginSymbol> CREATOR = new C12427a();

    @Nullable
    private final String groupKey;

    @Nullable
    private final List<SymbolInfoEntity> value;

    /* JADX INFO: renamed from: com.kubi.core.spot.entity.MarginSymbol$a */
    /* JADX INFO: compiled from: WsSymbolInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12427a implements Parcelable.Creator<MarginSymbol> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginSymbol createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(MarginSymbol.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new MarginSymbol(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginSymbol[] newArray(int i11) {
            return new MarginSymbol[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarginSymbol(@Nullable List<? extends SymbolInfoEntity> list, @Nullable String str) {
        this.value = list;
        this.groupKey = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginSymbol)) {
            return false;
        }
        MarginSymbol marginSymbol = (MarginSymbol) other;
        return Intrinsics.areEqual(this.value, marginSymbol.value) && Intrinsics.areEqual(this.groupKey, marginSymbol.groupKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginSymbol copy$default(MarginSymbol marginSymbol, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marginSymbol.value;
        }
        if ((i11 & 2) != 0) {
            str = marginSymbol.groupKey;
        }
        return marginSymbol.copy(list, str);
    }

    @Nullable
    public final List<SymbolInfoEntity> component1() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    @NotNull
    public final MarginSymbol copy(@Nullable List<? extends SymbolInfoEntity> value, @Nullable String groupKey) {
        return new MarginSymbol(value, groupKey);
    }

    @Nullable
    public final String getGroupKey() {
        return this.groupKey;
    }

    @Nullable
    public final List<SymbolInfoEntity> getValue() {
        return this.value;
    }

    public int hashCode() {
        List<SymbolInfoEntity> list = this.value;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.groupKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginSymbol(value=" + this.value + ", groupKey=" + this.groupKey + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<SymbolInfoEntity> list = this.value;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<SymbolInfoEntity> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeString(this.groupKey);
    }

    public /* synthetic */ MarginSymbol(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list, str);
    }
}
