package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.tradecorebiz.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TradeSide;", "Landroid/os/Parcelable;", "param", "", "getParam", "()Ljava/lang/String;", "displayResStr", "", "getDisplayResStr", "()I", "BUY", "SELL", "Lcom/kubi/core/base/order/data/TradeSide$BUY;", "Lcom/kubi/core/base/order/data/TradeSide$SELL;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TradeSide extends Parcelable {

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TradeSide$BUY;", "Lcom/kubi/core/base/order/data/TradeSide;", "<init>", "()V", "displayResStr", "", "getDisplayResStr", "()I", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BUY implements TradeSide {

        @NotNull
        public static final BUY INSTANCE = new BUY();

        @NotNull
        public static final Parcelable.Creator<BUY> CREATOR = new C11619a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TradeSide$BUY$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11619a implements Parcelable.Creator<BUY> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BUY createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BUY.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BUY[] newArray(int i11) {
                return new BUY[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof BUY);
        }

        @Override // com.kubi.core.base.order.data.TradeSide
        public int getDisplayResStr() {
            return R$string.buy;
        }

        @Override // com.kubi.core.base.order.data.TradeSide
        @NotNull
        public String getParam() {
            return "BUY";
        }

        @NotNull
        public String toString() {
            return "BUY";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private BUY() {
        }

        public int hashCode() {
            return 1266391277;
        }
    }

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TradeSide$SELL;", "Lcom/kubi/core/base/order/data/TradeSide;", "<init>", "()V", "displayResStr", "", "getDisplayResStr", "()I", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SELL implements TradeSide {

        @NotNull
        public static final SELL INSTANCE = new SELL();

        @NotNull
        public static final Parcelable.Creator<SELL> CREATOR = new C11620a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TradeSide$SELL$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11620a implements Parcelable.Creator<SELL> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SELL createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELL.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SELL[] newArray(int i11) {
                return new SELL[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SELL);
        }

        @Override // com.kubi.core.base.order.data.TradeSide
        public int getDisplayResStr() {
            return R$string.sell;
        }

        @Override // com.kubi.core.base.order.data.TradeSide
        @NotNull
        public String getParam() {
            return "SELL";
        }

        @NotNull
        public String toString() {
            return "SELL";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SELL() {
        }

        public int hashCode() {
            return 603914667;
        }
    }

    int getDisplayResStr();

    @NotNull
    String getParam();
}
