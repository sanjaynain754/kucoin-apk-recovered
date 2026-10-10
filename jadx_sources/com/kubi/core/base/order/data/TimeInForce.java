package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TimeInForce;", "Landroid/os/Parcelable;", "param", "", "getParam", "()Ljava/lang/String;", "GTC", "GTT", AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC, "Lcom/kubi/core/base/order/data/TimeInForce$FOK;", "Lcom/kubi/core/base/order/data/TimeInForce$GTC;", "Lcom/kubi/core/base/order/data/TimeInForce$GTT;", "Lcom/kubi/core/base/order/data/TimeInForce$IOC;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TimeInForce extends Parcelable {

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TimeInForce$FOK;", "Lcom/kubi/core/base/order/data/TimeInForce;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FOK implements TimeInForce {

        @NotNull
        public static final FOK INSTANCE = new FOK();

        @NotNull
        public static final Parcelable.Creator<FOK> CREATOR = new C11615a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TimeInForce$FOK$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11615a implements Parcelable.Creator<FOK> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FOK createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FOK.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FOK[] newArray(int i11) {
                return new FOK[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FOK);
        }

        @Override // com.kubi.core.base.order.data.TimeInForce
        @NotNull
        public String getParam() {
            return AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK;
        }

        @NotNull
        public String toString() {
            return AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private FOK() {
        }

        public int hashCode() {
            return 1477257735;
        }
    }

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TimeInForce$GTC;", "Lcom/kubi/core/base/order/data/TimeInForce;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GTC implements TimeInForce {

        @NotNull
        public static final GTC INSTANCE = new GTC();

        @NotNull
        public static final Parcelable.Creator<GTC> CREATOR = new C11616a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TimeInForce$GTC$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11616a implements Parcelable.Creator<GTC> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GTC createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GTC.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GTC[] newArray(int i11) {
                return new GTC[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof GTC);
        }

        @Override // com.kubi.core.base.order.data.TimeInForce
        @NotNull
        public String getParam() {
            return "GTC";
        }

        @NotNull
        public String toString() {
            return "GTC";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private GTC() {
        }

        public int hashCode() {
            return 1477258843;
        }
    }

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TimeInForce$GTT;", "Lcom/kubi/core/base/order/data/TimeInForce;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GTT implements TimeInForce {

        @NotNull
        public static final GTT INSTANCE = new GTT();

        @NotNull
        public static final Parcelable.Creator<GTT> CREATOR = new C11617a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TimeInForce$GTT$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11617a implements Parcelable.Creator<GTT> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GTT createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GTT.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GTT[] newArray(int i11) {
                return new GTT[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof GTT);
        }

        @Override // com.kubi.core.base.order.data.TimeInForce
        @NotNull
        public String getParam() {
            return "GTT";
        }

        @NotNull
        public String toString() {
            return "GTT";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private GTT() {
        }

        public int hashCode() {
            return 1477258860;
        }
    }

    /* JADX INFO: compiled from: CommonData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TimeInForce$IOC;", "Lcom/kubi/core/base/order/data/TimeInForce;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class IOC implements TimeInForce {

        @NotNull
        public static final IOC INSTANCE = new IOC();

        @NotNull
        public static final Parcelable.Creator<IOC> CREATOR = new C11618a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TimeInForce$IOC$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11618a implements Parcelable.Creator<IOC> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IOC createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IOC.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IOC[] newArray(int i11) {
                return new IOC[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof IOC);
        }

        @Override // com.kubi.core.base.order.data.TimeInForce
        @NotNull
        public String getParam() {
            return AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC;
        }

        @NotNull
        public String toString() {
            return AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private IOC() {
        }

        public int hashCode() {
            return 1477260610;
        }
    }

    @NotNull
    String getParam();
}
