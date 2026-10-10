package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CouponDetailEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0007\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "Landroid/os/Parcelable;", "faceValue", "Ljava/math/BigDecimal;", "deductionRatio", "deductedAmount", "remainAmount", "isEmpty", "", "liquidationPrice", "isShowConfirmDelegationDialog", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Z)V", "getFaceValue", "()Ljava/math/BigDecimal;", "setFaceValue", "(Ljava/math/BigDecimal;)V", "getDeductionRatio", "setDeductionRatio", "getDeductedAmount", "setDeductedAmount", "getRemainAmount", "setRemainAmount", "()Ljava/lang/Boolean;", "setEmpty", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLiquidationPrice", "setLiquidationPrice", "()Z", "setShowConfirmDelegationDialog", "(Z)V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponDetailEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CouponDetailEntity> CREATOR = new C15833a();

    @Nullable
    private BigDecimal deductedAmount;

    @Nullable
    private BigDecimal deductionRatio;

    @Nullable
    private BigDecimal faceValue;

    @Nullable
    private Boolean isEmpty;
    private boolean isShowConfirmDelegationDialog;

    @Nullable
    private BigDecimal liquidationPrice;

    @Nullable
    private BigDecimal remainAmount;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.CouponDetailEntity$a */
    /* JADX INFO: compiled from: CouponDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15833a implements Parcelable.Creator<CouponDetailEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponDetailEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            BigDecimal bigDecimal;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z11 = true;
                bigDecimal = bigDecimal6;
            } else {
                bigDecimal = bigDecimal6;
                z11 = false;
            }
            return new CouponDetailEntity(bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, boolValueOf, bigDecimal, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponDetailEntity[] newArray(int i11) {
            return new CouponDetailEntity[i11];
        }
    }

    public CouponDetailEntity() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CouponDetailEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal5, boolean z11) {
        this.faceValue = bigDecimal;
        this.deductionRatio = bigDecimal2;
        this.deductedAmount = bigDecimal3;
        this.remainAmount = bigDecimal4;
        this.isEmpty = bool;
        this.liquidationPrice = bigDecimal5;
        this.isShowConfirmDelegationDialog = z11;
    }

    @Nullable
    public final BigDecimal getDeductedAmount() {
        return this.deductedAmount;
    }

    @Nullable
    public final BigDecimal getDeductionRatio() {
        return this.deductionRatio;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final BigDecimal getRemainAmount() {
        return this.remainAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: isEmpty, reason: from getter */
    public final Boolean getIsEmpty() {
        return this.isEmpty;
    }

    /* JADX INFO: renamed from: isShowConfirmDelegationDialog, reason: from getter */
    public final boolean getIsShowConfirmDelegationDialog() {
        return this.isShowConfirmDelegationDialog;
    }

    public final void setDeductedAmount(@Nullable BigDecimal bigDecimal) {
        this.deductedAmount = bigDecimal;
    }

    public final void setDeductionRatio(@Nullable BigDecimal bigDecimal) {
        this.deductionRatio = bigDecimal;
    }

    public final void setEmpty(@Nullable Boolean bool) {
        this.isEmpty = bool;
    }

    public final void setFaceValue(@Nullable BigDecimal bigDecimal) {
        this.faceValue = bigDecimal;
    }

    public final void setLiquidationPrice(@Nullable BigDecimal bigDecimal) {
        this.liquidationPrice = bigDecimal;
    }

    public final void setRemainAmount(@Nullable BigDecimal bigDecimal) {
        this.remainAmount = bigDecimal;
    }

    public final void setShowConfirmDelegationDialog(boolean z11) {
        this.isShowConfirmDelegationDialog = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.faceValue);
        dest.writeSerializable(this.deductionRatio);
        dest.writeSerializable(this.deductedAmount);
        dest.writeSerializable(this.remainAmount);
        Boolean bool = this.isEmpty;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeSerializable(this.liquidationPrice);
        dest.writeInt(this.isShowConfirmDelegationDialog ? 1 : 0);
    }

    public /* synthetic */ CouponDetailEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Boolean bool, BigDecimal bigDecimal5, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3, (i11 & 8) != 0 ? null : bigDecimal4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : bigDecimal5, (i11 & 64) != 0 ? true : z11);
    }
}
