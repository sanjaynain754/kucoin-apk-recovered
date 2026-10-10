package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AiParameterEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006&"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/AiParameterEntity;", "Landroid/os/Parcelable;", "<init>", "()V", "diff", "Ljava/math/BigDecimal;", "getDiff", "()Ljava/math/BigDecimal;", "setDiff", "(Ljava/math/BigDecimal;)V", "feeRatio", "getFeeRatio", "setFeeRatio", "gridNum", "getGridNum", "setGridNum", "gridProfitLowerRatio", "getGridProfitLowerRatio", "setGridProfitLowerRatio", "gridProfitRatio", "getGridProfitRatio", "setGridProfitRatio", "gridProfitUpperRatio", "getGridProfitUpperRatio", "setGridProfitUpperRatio", "lowerLimit", "getLowerLimit", "setLowerLimit", "upperLimit", "getUpperLimit", "setUpperLimit", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AiParameterEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AiParameterEntity> CREATOR = new C26211a();

    @Nullable
    private BigDecimal diff;

    @Nullable
    private BigDecimal feeRatio;

    @Nullable
    private BigDecimal gridNum;

    @Nullable
    private BigDecimal gridProfitLowerRatio;

    @Nullable
    private BigDecimal gridProfitRatio;

    @Nullable
    private BigDecimal gridProfitUpperRatio;

    @Nullable
    private BigDecimal lowerLimit;

    @Nullable
    private BigDecimal upperLimit;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.AiParameterEntity$a */
    /* JADX INFO: compiled from: AiParameterEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26211a implements Parcelable.Creator<AiParameterEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AiParameterEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new AiParameterEntity();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AiParameterEntity[] newArray(int i11) {
            return new AiParameterEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final BigDecimal getDiff() {
        return this.diff;
    }

    @Nullable
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    public final BigDecimal getGridNum() {
        return this.gridNum;
    }

    @Nullable
    public final BigDecimal getGridProfitLowerRatio() {
        return this.gridProfitLowerRatio;
    }

    @Nullable
    public final BigDecimal getGridProfitRatio() {
        return this.gridProfitRatio;
    }

    @Nullable
    public final BigDecimal getGridProfitUpperRatio() {
        return this.gridProfitUpperRatio;
    }

    @Nullable
    public final BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    @Nullable
    public final BigDecimal getUpperLimit() {
        return this.upperLimit;
    }

    public final void setDiff(@Nullable BigDecimal bigDecimal) {
        this.diff = bigDecimal;
    }

    public final void setFeeRatio(@Nullable BigDecimal bigDecimal) {
        this.feeRatio = bigDecimal;
    }

    public final void setGridNum(@Nullable BigDecimal bigDecimal) {
        this.gridNum = bigDecimal;
    }

    public final void setGridProfitLowerRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitLowerRatio = bigDecimal;
    }

    public final void setGridProfitRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitRatio = bigDecimal;
    }

    public final void setGridProfitUpperRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitUpperRatio = bigDecimal;
    }

    public final void setLowerLimit(@Nullable BigDecimal bigDecimal) {
        this.lowerLimit = bigDecimal;
    }

    public final void setUpperLimit(@Nullable BigDecimal bigDecimal) {
        this.upperLimit = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public AiParameterEntity() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.diff = bigDecimal;
        this.feeRatio = bigDecimal;
        this.gridNum = bigDecimal;
        this.gridProfitLowerRatio = bigDecimal;
        this.gridProfitRatio = bigDecimal;
        this.gridProfitUpperRatio = bigDecimal;
        this.lowerLimit = bigDecimal;
        this.upperLimit = bigDecimal;
    }
}
