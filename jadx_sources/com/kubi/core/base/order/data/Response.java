package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.base.order.data.ActiveOrdersData$ListData$Response, reason: from toString */
/* JADX INFO: compiled from: ActiveOrdersData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m90084d2 = {"Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Response;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/arch/api/IResponse;", "currentPage", "", "pageSize", "totalNum", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getTotalNum", "getTotalPage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Response;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Response implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Response> CREATOR = new C11597a();

    @Nullable
    private final Integer currentPage;

    @Nullable
    private final List<OrderItem> items;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Integer totalNum;

    @Nullable
    private final Integer totalPage;

    /* JADX INFO: renamed from: com.kubi.core.base.order.data.ActiveOrdersData$ListData$Response$a */
    /* JADX INFO: compiled from: ActiveOrdersData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11597a implements Parcelable.Creator<Response> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(OrderItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new Response(numValueOf, numValueOf2, numValueOf3, numValueOf4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Response[] newArray(int i11) {
            return new Response[i11];
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
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return Intrinsics.areEqual(this.currentPage, response.currentPage) && Intrinsics.areEqual(this.pageSize, response.pageSize) && Intrinsics.areEqual(this.totalNum, response.totalNum) && Intrinsics.areEqual(this.totalPage, response.totalPage) && Intrinsics.areEqual(this.items, response.items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, Integer num, Integer num2, Integer num3, Integer num4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = response.currentPage;
        }
        if ((i11 & 2) != 0) {
            num2 = response.pageSize;
        }
        if ((i11 & 4) != 0) {
            num3 = response.totalNum;
        }
        if ((i11 & 8) != 0) {
            num4 = response.totalPage;
        }
        if ((i11 & 16) != 0) {
            list = response.items;
        }
        List list2 = list;
        Integer num5 = num3;
        return response.copy(num, num2, num5, num4, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final List<OrderItem> component5() {
        return this.items;
    }

    @NotNull
    public final Response copy(@Nullable Integer currentPage, @Nullable Integer pageSize, @Nullable Integer totalNum, @Nullable Integer totalPage, @Nullable List<OrderItem> items) {
        return new Response(currentPage, pageSize, totalNum, totalPage, items);
    }

    @Nullable
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<OrderItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        Integer num = this.currentPage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageSize;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalNum;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalPage;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<OrderItem> list = this.items;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Response(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.currentPage;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.pageSize;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.totalNum;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.totalPage;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        List<OrderItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<OrderItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public Response(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<OrderItem> list) {
        this.currentPage = num;
        this.pageSize = num2;
        this.totalNum = num3;
        this.totalPage = num4;
        this.items = list;
    }
}
