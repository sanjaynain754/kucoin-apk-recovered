package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/unify/entity/UtaActiveOrdersCountDataResponse;", "Landroid/os/Parcelable;", "activeOrderCount", "", "activeAdvancedOrderCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getActiveOrderCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActiveAdvancedOrderCount", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/unify/entity/UtaActiveOrdersCountDataResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UtaActiveOrdersCountDataResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UtaActiveOrdersCountDataResponse> CREATOR = new C26524a();

    @Nullable
    private final Integer activeAdvancedOrderCount;

    @Nullable
    private final Integer activeOrderCount;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UtaActiveOrdersCountDataResponse$a */
    /* JADX INFO: compiled from: FuturesEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26524a implements Parcelable.Creator<UtaActiveOrdersCountDataResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UtaActiveOrdersCountDataResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UtaActiveOrdersCountDataResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UtaActiveOrdersCountDataResponse[] newArray(int i11) {
            return new UtaActiveOrdersCountDataResponse[i11];
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
        if (!(other instanceof UtaActiveOrdersCountDataResponse)) {
            return false;
        }
        UtaActiveOrdersCountDataResponse utaActiveOrdersCountDataResponse = (UtaActiveOrdersCountDataResponse) other;
        return Intrinsics.areEqual(this.activeOrderCount, utaActiveOrdersCountDataResponse.activeOrderCount) && Intrinsics.areEqual(this.activeAdvancedOrderCount, utaActiveOrdersCountDataResponse.activeAdvancedOrderCount);
    }

    public static /* synthetic */ UtaActiveOrdersCountDataResponse copy$default(UtaActiveOrdersCountDataResponse utaActiveOrdersCountDataResponse, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = utaActiveOrdersCountDataResponse.activeOrderCount;
        }
        if ((i11 & 2) != 0) {
            num2 = utaActiveOrdersCountDataResponse.activeAdvancedOrderCount;
        }
        return utaActiveOrdersCountDataResponse.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getActiveOrderCount() {
        return this.activeOrderCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getActiveAdvancedOrderCount() {
        return this.activeAdvancedOrderCount;
    }

    @NotNull
    public final UtaActiveOrdersCountDataResponse copy(@Nullable Integer activeOrderCount, @Nullable Integer activeAdvancedOrderCount) {
        return new UtaActiveOrdersCountDataResponse(activeOrderCount, activeAdvancedOrderCount);
    }

    @Nullable
    public final Integer getActiveAdvancedOrderCount() {
        return this.activeAdvancedOrderCount;
    }

    @Nullable
    public final Integer getActiveOrderCount() {
        return this.activeOrderCount;
    }

    public int hashCode() {
        Integer num = this.activeOrderCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.activeAdvancedOrderCount;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtaActiveOrdersCountDataResponse(activeOrderCount=" + this.activeOrderCount + ", activeAdvancedOrderCount=" + this.activeAdvancedOrderCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.activeOrderCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.activeAdvancedOrderCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public UtaActiveOrdersCountDataResponse(@Nullable Integer num, @Nullable Integer num2) {
        this.activeOrderCount = num;
        this.activeAdvancedOrderCount = num2;
    }
}
