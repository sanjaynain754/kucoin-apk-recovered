package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferencesEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006$"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "Landroid/os/Parcelable;", "seniorPosition", "", "stopProfitAndLoss", "seniorOrder", "twapOrder", "conditionalOrder", "indexPrice", "fundingRate", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSeniorPosition", "()Ljava/lang/Boolean;", "setSeniorPosition", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStopProfitAndLoss", "setStopProfitAndLoss", "getSeniorOrder", "setSeniorOrder", "getTwapOrder", "setTwapOrder", "getConditionalOrder", "setConditionalOrder", "getIndexPrice", "setIndexPrice", "getFundingRate", "setFundingRate", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreferencesEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PreferencesEntity> CREATOR = new C15819a();

    @Nullable
    private Boolean conditionalOrder;

    @Nullable
    private Boolean fundingRate;

    @Nullable
    private Boolean indexPrice;

    @Nullable
    private Boolean seniorOrder;

    @Nullable
    private Boolean seniorPosition;

    @Nullable
    private Boolean stopProfitAndLoss;

    @Nullable
    private Boolean twapOrder;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.PreferencesEntity$a */
    /* JADX INFO: compiled from: PreferencesEntity.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15819a implements Parcelable.Creator<PreferencesEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PreferencesEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf7 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PreferencesEntity(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PreferencesEntity[] newArray(int i11) {
            return new PreferencesEntity[i11];
        }
    }

    public PreferencesEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PreferencesEntity(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
        this.seniorPosition = bool;
        this.stopProfitAndLoss = bool2;
        this.seniorOrder = bool3;
        this.twapOrder = bool4;
        this.conditionalOrder = bool5;
        this.indexPrice = bool6;
        this.fundingRate = bool7;
    }

    @Nullable
    public final Boolean getConditionalOrder() {
        return this.conditionalOrder;
    }

    @Nullable
    public final Boolean getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final Boolean getIndexPrice() {
        return this.indexPrice;
    }

    @Nullable
    public final Boolean getSeniorOrder() {
        return this.seniorOrder;
    }

    @Nullable
    public final Boolean getSeniorPosition() {
        return this.seniorPosition;
    }

    @Nullable
    public final Boolean getStopProfitAndLoss() {
        return this.stopProfitAndLoss;
    }

    @Nullable
    public final Boolean getTwapOrder() {
        return this.twapOrder;
    }

    public final void setConditionalOrder(@Nullable Boolean bool) {
        this.conditionalOrder = bool;
    }

    public final void setFundingRate(@Nullable Boolean bool) {
        this.fundingRate = bool;
    }

    public final void setIndexPrice(@Nullable Boolean bool) {
        this.indexPrice = bool;
    }

    public final void setSeniorOrder(@Nullable Boolean bool) {
        this.seniorOrder = bool;
    }

    public final void setSeniorPosition(@Nullable Boolean bool) {
        this.seniorPosition = bool;
    }

    public final void setStopProfitAndLoss(@Nullable Boolean bool) {
        this.stopProfitAndLoss = bool;
    }

    public final void setTwapOrder(@Nullable Boolean bool) {
        this.twapOrder = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.seniorPosition;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.stopProfitAndLoss;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.seniorOrder;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.twapOrder;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.conditionalOrder;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.indexPrice;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.fundingRate;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool7.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ PreferencesEntity(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3, (i11 & 8) != 0 ? Boolean.TRUE : bool4, (i11 & 16) != 0 ? null : bool5, (i11 & 32) != 0 ? null : bool6, (i11 & 64) != 0 ? null : bool7);
    }
}
