package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.kubi.otc.entity.OtcAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/data/OrderLevelType;", "Landroid/os/Parcelable;", "param", "", "getParam", "()Ljava/lang/String;", ReactProgressBarViewManager.DEFAULT_STYLE, "Advanced", "Lcom/kubi/core/base/order/data/OrderLevelType$Advanced;", "Lcom/kubi/core/base/order/data/OrderLevelType$Normal;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface OrderLevelType extends Parcelable {

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/OrderLevelType$Advanced;", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Advanced implements OrderLevelType {

        @NotNull
        public static final Advanced INSTANCE = new Advanced();

        @NotNull
        public static final Parcelable.Creator<Advanced> CREATOR = new C11613a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.OrderLevelType$Advanced$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11613a implements Parcelable.Creator<Advanced> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Advanced createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Advanced.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Advanced[] newArray(int i11) {
                return new Advanced[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Advanced);
        }

        @Override // com.kubi.core.base.order.data.OrderLevelType
        @NotNull
        public String getParam() {
            return "ADVANCED";
        }

        @NotNull
        public String toString() {
            return "Advanced";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Advanced() {
        }

        public int hashCode() {
            return 571191514;
        }
    }

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/OrderLevelType$Normal;", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Normal implements OrderLevelType {

        @NotNull
        public static final Normal INSTANCE = new Normal();

        @NotNull
        public static final Parcelable.Creator<Normal> CREATOR = new C11614a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.OrderLevelType$Normal$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11614a implements Parcelable.Creator<Normal> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Normal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Normal.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Normal[] newArray(int i11) {
                return new Normal[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Normal);
        }

        @Override // com.kubi.core.base.order.data.OrderLevelType
        @NotNull
        public String getParam() {
            return OtcAd.STATUS_NORMAL;
        }

        @NotNull
        public String toString() {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Normal() {
        }

        public int hashCode() {
            return -430582881;
        }
    }

    @NotNull
    String getParam();
}
