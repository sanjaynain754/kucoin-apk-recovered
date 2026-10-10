package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0010\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawChainChargeEntity;", "Landroid/os/Parcelable;", "chainEntity", "Lcom/kubi/assets/entity/MultiChainEntity;", "fee", "Ljava/math/BigDecimal;", "needShowLowerCharge", "", "needShowPause", "needShowMissMatch", "needShowFree", "needShowCustomLabel", "vipFee", "code", "", FirebaseAnalytics.Param.CURRENCY, "isInner", "hasTax", "<init>", "(Lcom/kubi/assets/entity/MultiChainEntity;Ljava/math/BigDecimal;ZZZZZLjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getChainEntity", "()Lcom/kubi/assets/entity/MultiChainEntity;", "getFee", "()Ljava/math/BigDecimal;", "getNeedShowLowerCharge", "()Z", "setNeedShowLowerCharge", "(Z)V", "getNeedShowPause", "setNeedShowPause", "getNeedShowMissMatch", "setNeedShowMissMatch", "getNeedShowFree", "setNeedShowFree", "getNeedShowCustomLabel", "setNeedShowCustomLabel", "getVipFee", "getCode", "()Ljava/lang/String;", "getCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasTax", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawChainChargeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawChainChargeEntity> CREATOR = new Creator();

    @NotNull
    private final MultiChainEntity chainEntity;

    @Nullable
    private final String code;

    @Nullable
    private final String currency;

    @NotNull
    private final BigDecimal fee;

    @Nullable
    private final Boolean hasTax;

    @Nullable
    private final Boolean isInner;
    private boolean needShowCustomLabel;
    private boolean needShowFree;
    private boolean needShowLowerCharge;
    private boolean needShowMissMatch;
    private boolean needShowPause;

    @NotNull
    private final BigDecimal vipFee;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawChainChargeEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawChainChargeEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MultiChainEntity multiChainEntityCreateFromParcel = MultiChainEntity.CREATOR.createFromParcel(parcel);
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z11);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WithdrawChainChargeEntity(multiChainEntityCreateFromParcel, bigDecimal, z11, z12, z12, z12, z12, bigDecimal2, string, string2, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawChainChargeEntity[] newArray(int i11) {
            return new WithdrawChainChargeEntity[i11];
        }
    }

    public WithdrawChainChargeEntity(@NotNull MultiChainEntity chainEntity, @NotNull BigDecimal fee, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull BigDecimal vipFee, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(chainEntity, "chainEntity");
        Intrinsics.checkNotNullParameter(fee, "fee");
        Intrinsics.checkNotNullParameter(vipFee, "vipFee");
        this.chainEntity = chainEntity;
        this.fee = fee;
        this.needShowLowerCharge = z11;
        this.needShowPause = z12;
        this.needShowMissMatch = z13;
        this.needShowFree = z14;
        this.needShowCustomLabel = z15;
        this.vipFee = vipFee;
        this.code = str;
        this.currency = str2;
        this.isInner = bool;
        this.hasTax = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final MultiChainEntity getChainEntity() {
        return this.chainEntity;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final Boolean getHasTax() {
        return this.hasTax;
    }

    public final boolean getNeedShowCustomLabel() {
        return this.needShowCustomLabel;
    }

    public final boolean getNeedShowFree() {
        return this.needShowFree;
    }

    public final boolean getNeedShowLowerCharge() {
        return this.needShowLowerCharge;
    }

    public final boolean getNeedShowMissMatch() {
        return this.needShowMissMatch;
    }

    public final boolean getNeedShowPause() {
        return this.needShowPause;
    }

    @NotNull
    public final BigDecimal getVipFee() {
        return this.vipFee;
    }

    @Nullable
    /* JADX INFO: renamed from: isInner, reason: from getter */
    public final Boolean getIsInner() {
        return this.isInner;
    }

    public final void setNeedShowCustomLabel(boolean z11) {
        this.needShowCustomLabel = z11;
    }

    public final void setNeedShowFree(boolean z11) {
        this.needShowFree = z11;
    }

    public final void setNeedShowLowerCharge(boolean z11) {
        this.needShowLowerCharge = z11;
    }

    public final void setNeedShowMissMatch(boolean z11) {
        this.needShowMissMatch = z11;
    }

    public final void setNeedShowPause(boolean z11) {
        this.needShowPause = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.chainEntity.writeToParcel(dest, flags);
        dest.writeSerializable(this.fee);
        dest.writeInt(this.needShowLowerCharge ? 1 : 0);
        dest.writeInt(this.needShowPause ? 1 : 0);
        dest.writeInt(this.needShowMissMatch ? 1 : 0);
        dest.writeInt(this.needShowFree ? 1 : 0);
        dest.writeInt(this.needShowCustomLabel ? 1 : 0);
        dest.writeSerializable(this.vipFee);
        dest.writeString(this.code);
        dest.writeString(this.currency);
        Boolean bool = this.isInner;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasTax;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ WithdrawChainChargeEntity(MultiChainEntity multiChainEntity, BigDecimal bigDecimal, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, BigDecimal bigDecimal2, String str, String str2, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiChainEntity, bigDecimal, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? false : z14, (i11 & 64) != 0 ? false : z15, bigDecimal2, str, str2, bool, bool2);
    }
}
