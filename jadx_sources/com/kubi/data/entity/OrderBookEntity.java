package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderBookEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JK\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, m90084d2 = {"Lcom/kubi/data/entity/OrderBookEntity;", "Landroid/os/Parcelable;", "symbol", "", JPushConstants.Operation.KEY_SEQUENCE, "", "bids", "", "", "asks", "timestamp", "<init>", "(Ljava/lang/String;JLjava/util/List;Ljava/util/List;J)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getSequence", "()J", "setSequence", "(J)V", "getBids", "()Ljava/util/List;", "setBids", "(Ljava/util/List;)V", "getAsks", "setAsks", "getTimestamp", "setTimestamp", "clear", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderBookEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderBookEntity> CREATOR = new Creator();

    @Nullable
    private List<double[]> asks;

    @Nullable
    private List<double[]> bids;
    private long sequence;

    @NotNull
    private String symbol;
    private long timestamp;

    /* JADX INFO: compiled from: OrderBookEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderBookEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderBookEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            long j11 = parcel.readLong();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.createDoubleArray());
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.createDoubleArray());
                }
            }
            return new OrderBookEntity(string, j11, arrayList, arrayList2, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderBookEntity[] newArray(int i11) {
            return new OrderBookEntity[i11];
        }
    }

    public OrderBookEntity() {
        this(null, 0L, null, null, 0L, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderBookEntity)) {
            return false;
        }
        OrderBookEntity orderBookEntity = (OrderBookEntity) other;
        return Intrinsics.areEqual(this.symbol, orderBookEntity.symbol) && this.sequence == orderBookEntity.sequence && Intrinsics.areEqual(this.bids, orderBookEntity.bids) && Intrinsics.areEqual(this.asks, orderBookEntity.asks) && this.timestamp == orderBookEntity.timestamp;
    }

    public OrderBookEntity(@NotNull String symbol, long j11, @Nullable List<double[]> list, @Nullable List<double[]> list2, long j12) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.sequence = j11;
        this.bids = list;
        this.asks = list2;
        this.timestamp = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderBookEntity copy$default(OrderBookEntity orderBookEntity, String str, long j11, List list, List list2, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderBookEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            j11 = orderBookEntity.sequence;
        }
        if ((i11 & 4) != 0) {
            list = orderBookEntity.bids;
        }
        if ((i11 & 8) != 0) {
            list2 = orderBookEntity.asks;
        }
        if ((i11 & 16) != 0) {
            j12 = orderBookEntity.timestamp;
        }
        return orderBookEntity.copy(str, j11, list, list2, j12);
    }

    public final void clear(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.sequence = 0L;
        List<double[]> list = this.bids;
        if (list != null) {
            list.clear();
        }
        List<double[]> list2 = this.asks;
        if (list2 != null) {
            list2.clear();
        }
        this.timestamp = 0L;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final List<double[]> component3() {
        return this.bids;
    }

    @Nullable
    public final List<double[]> component4() {
        return this.asks;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final OrderBookEntity copy(@NotNull String symbol, long sequence, @Nullable List<double[]> bids, @Nullable List<double[]> asks, long timestamp) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new OrderBookEntity(symbol, sequence, bids, asks, timestamp);
    }

    @Nullable
    public final List<double[]> getAsks() {
        return this.asks;
    }

    @Nullable
    public final List<double[]> getBids() {
        return this.bids;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + Long.hashCode(this.sequence)) * 31;
        List<double[]> list = this.bids;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<double[]> list2 = this.asks;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    public final void setAsks(@Nullable List<double[]> list) {
        this.asks = list;
    }

    public final void setBids(@Nullable List<double[]> list) {
        this.bids = list;
    }

    public final void setSequence(long j11) {
        this.sequence = j11;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    @NotNull
    public String toString() {
        return "OrderBookEntity(symbol=" + this.symbol + ", sequence=" + this.sequence + ", bids=" + this.bids + ", asks=" + this.asks + ", timestamp=" + this.timestamp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeLong(this.sequence);
        List<double[]> list = this.bids;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<double[]> it = list.iterator();
            while (it.hasNext()) {
                dest.writeDoubleArray(it.next());
            }
        }
        List<double[]> list2 = this.asks;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<double[]> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeDoubleArray(it2.next());
            }
        }
        dest.writeLong(this.timestamp);
    }

    public /* synthetic */ OrderBookEntity(String str, long j11, List list, List list2, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? new ArrayList() : list, (i11 & 8) != 0 ? new ArrayList() : list2, (i11 & 16) != 0 ? 0L : j12);
    }
}
