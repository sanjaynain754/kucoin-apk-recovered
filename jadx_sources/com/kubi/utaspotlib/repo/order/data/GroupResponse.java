package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$GroupResponse, reason: from toString */
/* JADX INFO: compiled from: UtaCancelOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$GroupResponse;", "Lcom/kubi/core/base/arch/api/IResponse;", "Landroid/os/Parcelable;", "tradeType", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$RespOrderItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTradeType", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GroupResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupResponse> CREATOR = new C26938a();

    @Nullable
    private final List<RespOrderItem> items;

    @Nullable
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$GroupResponse$a */
    /* JADX INFO: compiled from: UtaCancelOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26938a implements Parcelable.Creator<GroupResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GroupResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : RespOrderItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GroupResponse(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GroupResponse[] newArray(int i11) {
            return new GroupResponse[i11];
        }
    }

    public GroupResponse(@Nullable String str, @Nullable List<RespOrderItem> list) {
        this.tradeType = str;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupResponse)) {
            return false;
        }
        GroupResponse groupResponse = (GroupResponse) other;
        return Intrinsics.areEqual(this.tradeType, groupResponse.tradeType) && Intrinsics.areEqual(this.items, groupResponse.items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupResponse copy$default(GroupResponse groupResponse, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = groupResponse.tradeType;
        }
        if ((i11 & 2) != 0) {
            list = groupResponse.items;
        }
        return groupResponse.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    public final List<RespOrderItem> component2() {
        return this.items;
    }

    @NotNull
    public final GroupResponse copy(@Nullable String tradeType, @Nullable List<RespOrderItem> items) {
        return new GroupResponse(tradeType, items);
    }

    @Nullable
    public final List<RespOrderItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.tradeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RespOrderItem> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GroupResponse(tradeType=" + this.tradeType + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        List<RespOrderItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        for (RespOrderItem respOrderItem : list) {
            if (respOrderItem == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                respOrderItem.writeToParcel(dest, flags);
            }
        }
    }

    public /* synthetic */ GroupResponse(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : list);
    }
}
