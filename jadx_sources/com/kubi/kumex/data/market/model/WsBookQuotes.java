package com.kubi.kumex.data.market.model;

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

/* JADX INFO: compiled from: WsBookQuotes.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0013\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/WsBookQuotes;", "Landroid/os/Parcelable;", "bids", "", "", "asks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBids", "()Ljava/util/List;", "setBids", "(Ljava/util/List;)V", "getAsks", "setAsks", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsBookQuotes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsBookQuotes> CREATOR = new C15788a();

    @NotNull
    private List<double[]> asks;

    @NotNull
    private List<double[]> bids;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.WsBookQuotes$a */
    /* JADX INFO: compiled from: WsBookQuotes.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15788a implements Parcelable.Creator<WsBookQuotes> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WsBookQuotes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.createDoubleArray());
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(parcel.createDoubleArray());
            }
            return new WsBookQuotes(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WsBookQuotes[] newArray(int i11) {
            return new WsBookQuotes[i11];
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
        if (!(other instanceof WsBookQuotes)) {
            return false;
        }
        WsBookQuotes wsBookQuotes = (WsBookQuotes) other;
        return Intrinsics.areEqual(this.bids, wsBookQuotes.bids) && Intrinsics.areEqual(this.asks, wsBookQuotes.asks);
    }

    public WsBookQuotes(@NotNull List<double[]> bids, @NotNull List<double[]> asks) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        this.bids = bids;
        this.asks = asks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsBookQuotes copy$default(WsBookQuotes wsBookQuotes, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wsBookQuotes.bids;
        }
        if ((i11 & 2) != 0) {
            list2 = wsBookQuotes.asks;
        }
        return wsBookQuotes.copy(list, list2);
    }

    @NotNull
    public final List<double[]> component1() {
        return this.bids;
    }

    @NotNull
    public final List<double[]> component2() {
        return this.asks;
    }

    @NotNull
    public final WsBookQuotes copy(@NotNull List<double[]> bids, @NotNull List<double[]> asks) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        return new WsBookQuotes(bids, asks);
    }

    @NotNull
    public final List<double[]> getAsks() {
        return this.asks;
    }

    @NotNull
    public final List<double[]> getBids() {
        return this.bids;
    }

    public int hashCode() {
        return (this.bids.hashCode() * 31) + this.asks.hashCode();
    }

    public final void setAsks(@NotNull List<double[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.asks = list;
    }

    public final void setBids(@NotNull List<double[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.bids = list;
    }

    @NotNull
    public String toString() {
        return "WsBookQuotes(bids=" + this.bids + ", asks=" + this.asks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<double[]> list = this.bids;
        dest.writeInt(list.size());
        Iterator<double[]> it = list.iterator();
        while (it.hasNext()) {
            dest.writeDoubleArray(it.next());
        }
        List<double[]> list2 = this.asks;
        dest.writeInt(list2.size());
        Iterator<double[]> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeDoubleArray(it2.next());
        }
    }
}
