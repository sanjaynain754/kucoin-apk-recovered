package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TriggerDirection;", "Landroid/os/Parcelable;", "param", "", "getParam", "()Ljava/lang/String;", "UP", "DOWN", "Lcom/kubi/core/base/order/data/TriggerDirection$DOWN;", "Lcom/kubi/core/base/order/data/TriggerDirection$UP;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TriggerDirection extends Parcelable {

    /* JADX INFO: compiled from: CommonData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TriggerDirection$DOWN;", "Lcom/kubi/core/base/order/data/TriggerDirection;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DOWN implements TriggerDirection {

        @NotNull
        public static final DOWN INSTANCE = new DOWN();

        @NotNull
        public static final Parcelable.Creator<DOWN> CREATOR = new C11621a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TriggerDirection$DOWN$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11621a implements Parcelable.Creator<DOWN> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DOWN createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DOWN.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DOWN[] newArray(int i11) {
                return new DOWN[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof DOWN);
        }

        @Override // com.kubi.core.base.order.data.TriggerDirection
        @NotNull
        public String getParam() {
            return "DOWN";
        }

        @NotNull
        public String toString() {
            return "DOWN";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DOWN() {
        }

        public int hashCode() {
            return 346213795;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.base.order.data.TriggerDirection$UP */
    /* JADX INFO: compiled from: CommonData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/base/order/data/TriggerDirection$UP;", "Lcom/kubi/core/base/order/data/TriggerDirection;", "<init>", "()V", "param", "", "getParam", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C11622UP implements TriggerDirection {

        @NotNull
        public static final C11622UP INSTANCE = new C11622UP();

        @NotNull
        public static final Parcelable.Creator<C11622UP> CREATOR = new a();

        /* JADX INFO: renamed from: com.kubi.core.base.order.data.TriggerDirection$UP$a */
        /* JADX INFO: compiled from: CommonData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements Parcelable.Creator<C11622UP> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11622UP createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return C11622UP.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C11622UP[] newArray(int i11) {
                return new C11622UP[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C11622UP);
        }

        @Override // com.kubi.core.base.order.data.TriggerDirection
        @NotNull
        public String getParam() {
            return "UP";
        }

        @NotNull
        public String toString() {
            return "UP";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private C11622UP() {
        }

        public int hashCode() {
            return -741537828;
        }
    }

    @NotNull
    String getParam();
}
