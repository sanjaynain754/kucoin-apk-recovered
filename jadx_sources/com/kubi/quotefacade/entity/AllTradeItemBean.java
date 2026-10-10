package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FutureTradeItemBean.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006("}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "Lcom/kubi/data/entity/TradeItemBean;", "collectType", "", "timestamp", "", "alphaMarks", "", "", "<init>", "(IJLjava/util/List;)V", "getCollectType", "()I", "setCollectType", "(I)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getAlphaMarks", "()Ljava/util/List;", "setAlphaMarks", "(Ljava/util/List;)V", "isFuture", "", "isShowAlphaOnDo", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AllTradeItemBean extends TradeItemBean {

    @NotNull
    public static final Parcelable.Creator<AllTradeItemBean> CREATOR = new C21861a();

    @Nullable
    private List<String> alphaMarks;
    private int collectType;
    private long timestamp;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AllTradeItemBean$a */
    /* JADX INFO: compiled from: FutureTradeItemBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21861a implements Parcelable.Creator<AllTradeItemBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AllTradeItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllTradeItemBean(parcel.readInt(), parcel.readLong(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AllTradeItemBean[] newArray(int i11) {
            return new AllTradeItemBean[i11];
        }
    }

    public AllTradeItemBean() {
        this(0, 0L, null, 7, null);
    }

    @Override // com.kubi.data.entity.TradeItemBean
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllTradeItemBean)) {
            return false;
        }
        AllTradeItemBean allTradeItemBean = (AllTradeItemBean) other;
        return this.collectType == allTradeItemBean.collectType && this.timestamp == allTradeItemBean.timestamp && Intrinsics.areEqual(this.alphaMarks, allTradeItemBean.alphaMarks);
    }

    public /* synthetic */ AllTradeItemBean(int i11, long j11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllTradeItemBean copy$default(AllTradeItemBean allTradeItemBean, int i11, long j11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = allTradeItemBean.collectType;
        }
        if ((i12 & 2) != 0) {
            j11 = allTradeItemBean.timestamp;
        }
        if ((i12 & 4) != 0) {
            list = allTradeItemBean.alphaMarks;
        }
        return allTradeItemBean.copy(i11, j11, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCollectType() {
        return this.collectType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final List<String> component3() {
        return this.alphaMarks;
    }

    @NotNull
    public final AllTradeItemBean copy(int collectType, long timestamp, @Nullable List<String> alphaMarks) {
        return new AllTradeItemBean(collectType, timestamp, alphaMarks);
    }

    @Nullable
    public final List<String> getAlphaMarks() {
        return this.alphaMarks;
    }

    public final int getCollectType() {
        return this.collectType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.collectType) * 31) + Long.hashCode(this.timestamp)) * 31;
        List<String> list = this.alphaMarks;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean isFuture() {
        return this.collectType == 2;
    }

    public final boolean isShowAlphaOnDo() {
        List<String> list = this.alphaMarks;
        return list != null && list.contains("Ondo");
    }

    public final void setAlphaMarks(@Nullable List<String> list) {
        this.alphaMarks = list;
    }

    public final void setCollectType(int i11) {
        this.collectType = i11;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    @NotNull
    public String toString() {
        return "AllTradeItemBean(collectType=" + this.collectType + ", timestamp=" + this.timestamp + ", alphaMarks=" + this.alphaMarks + ')';
    }

    @Override // com.kubi.data.entity.TradeItemBean, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.collectType);
        dest.writeLong(this.timestamp);
        dest.writeStringList(this.alphaMarks);
    }

    public AllTradeItemBean(int i11, long j11, @Nullable List<String> list) {
        this.collectType = i11;
        this.timestamp = j11;
        this.alphaMarks = list;
    }
}
