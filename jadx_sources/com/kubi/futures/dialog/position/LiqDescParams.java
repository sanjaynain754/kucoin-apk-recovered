package com.kubi.futures.dialog.position;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiqDescDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/dialog/position/LiqDescParams;", "Landroid/os/Parcelable;", "isCross", "", "positionId", "", "symbol", "positionSide", "isTrialFunds", "markPriceText", "liquidationPriceText", "observePosition", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "()Z", "getPositionId", "()Ljava/lang/String;", "getSymbol", "getPositionSide", "getMarkPriceText", "getLiquidationPriceText", "getObservePosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiqDescParams implements Parcelable {
    private final boolean isCross;
    private final boolean isTrialFunds;

    @Nullable
    private final String liquidationPriceText;

    @Nullable
    private final String markPriceText;
    private final boolean observePosition;

    @Nullable
    private final String positionId;

    @Nullable
    private final String positionSide;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LiqDescParams> CREATOR = new C13112a();

    /* JADX INFO: compiled from: LiqDescDialog.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;", "", "<init>", "()V", "from", "Lcom/kubi/futures/dialog/position/LiqDescParams;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "appendPriceCurrency", "", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m25343a(String str, ContractEntity contractEntity) {
            String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
            String strM66669i = C27041f.m66669i(str, strM66516f);
            return Intrinsics.areEqual(strM66669i, strM66516f) ? strM66669i : C42828b.m93906g(strM66669i, C37567b.m84619i(contractEntity), true, false, 4, null);
        }

        @NotNull
        public final LiqDescParams from(@NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(position, "position");
            ContractEntity contractEntityM84661b = C37569d.m84661b(position);
            return new LiqDescParams(C37569d.m84649A(position), position.getId(), position.getSymbol(), position.getPositionSide(), position.isTrialFunds(), m25343a(C37569d.m84669j(position, contractEntityM84661b), contractEntityM84661b), m25343a(C37569d.m84664e(position, contractEntityM84661b), contractEntityM84661b), true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.position.LiqDescParams$a */
    /* JADX INFO: compiled from: LiqDescDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13112a implements Parcelable.Creator<LiqDescParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiqDescParams createFromParcel(Parcel parcel) {
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string = parcel.readString();
            boolean z13 = z11;
            String string2 = parcel.readString();
            boolean z14 = z13;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z14 = z12;
            }
            String string4 = parcel.readString();
            boolean z15 = z14;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                z15 = false;
            }
            return new LiqDescParams(z12, string, string2, string3, z14, string4, string5, z15);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LiqDescParams[] newArray(int i11) {
            return new LiqDescParams[i11];
        }
    }

    public LiqDescParams(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z12, @Nullable String str4, @Nullable String str5, boolean z13) {
        this.isCross = z11;
        this.positionId = str;
        this.symbol = str2;
        this.positionSide = str3;
        this.isTrialFunds = z12;
        this.markPriceText = str4;
        this.liquidationPriceText = str5;
        this.observePosition = z13;
    }

    public static /* synthetic */ LiqDescParams copy$default(LiqDescParams liqDescParams, boolean z11, String str, String str2, String str3, boolean z12, String str4, String str5, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = liqDescParams.isCross;
        }
        if ((i11 & 2) != 0) {
            str = liqDescParams.positionId;
        }
        if ((i11 & 4) != 0) {
            str2 = liqDescParams.symbol;
        }
        if ((i11 & 8) != 0) {
            str3 = liqDescParams.positionSide;
        }
        if ((i11 & 16) != 0) {
            z12 = liqDescParams.isTrialFunds;
        }
        if ((i11 & 32) != 0) {
            str4 = liqDescParams.markPriceText;
        }
        if ((i11 & 64) != 0) {
            str5 = liqDescParams.liquidationPriceText;
        }
        if ((i11 & 128) != 0) {
            z13 = liqDescParams.observePosition;
        }
        String str6 = str5;
        boolean z14 = z13;
        boolean z15 = z12;
        String str7 = str4;
        return liqDescParams.copy(z11, str, str2, str3, z15, str7, str6, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiqDescParams)) {
            return false;
        }
        LiqDescParams liqDescParams = (LiqDescParams) other;
        return this.isCross == liqDescParams.isCross && Intrinsics.areEqual(this.positionId, liqDescParams.positionId) && Intrinsics.areEqual(this.symbol, liqDescParams.symbol) && Intrinsics.areEqual(this.positionSide, liqDescParams.positionSide) && this.isTrialFunds == liqDescParams.isTrialFunds && Intrinsics.areEqual(this.markPriceText, liqDescParams.markPriceText) && Intrinsics.areEqual(this.liquidationPriceText, liqDescParams.liquidationPriceText) && this.observePosition == liqDescParams.observePosition;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsCross() {
        return this.isCross;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarkPriceText() {
        return this.markPriceText;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLiquidationPriceText() {
        return this.liquidationPriceText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getObservePosition() {
        return this.observePosition;
    }

    @NotNull
    public final LiqDescParams copy(boolean isCross, @Nullable String positionId, @Nullable String symbol, @Nullable String positionSide, boolean isTrialFunds, @Nullable String markPriceText, @Nullable String liquidationPriceText, boolean observePosition) {
        return new LiqDescParams(isCross, positionId, symbol, positionSide, isTrialFunds, markPriceText, liquidationPriceText, observePosition);
    }

    @Nullable
    public final String getLiquidationPriceText() {
        return this.liquidationPriceText;
    }

    @Nullable
    public final String getMarkPriceText() {
        return this.markPriceText;
    }

    public final boolean getObservePosition() {
        return this.observePosition;
    }

    @Nullable
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCross) * 31;
        String str = this.positionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.positionSide;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str4 = this.markPriceText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.liquidationPriceText;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.observePosition);
    }

    public final boolean isCross() {
        return this.isCross;
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    @NotNull
    public String toString() {
        return "LiqDescParams(isCross=" + this.isCross + ", positionId=" + this.positionId + ", symbol=" + this.symbol + ", positionSide=" + this.positionSide + ", isTrialFunds=" + this.isTrialFunds + ", markPriceText=" + this.markPriceText + ", liquidationPriceText=" + this.liquidationPriceText + ", observePosition=" + this.observePosition + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isCross ? 1 : 0);
        dest.writeString(this.positionId);
        dest.writeString(this.symbol);
        dest.writeString(this.positionSide);
        dest.writeInt(this.isTrialFunds ? 1 : 0);
        dest.writeString(this.markPriceText);
        dest.writeString(this.liquidationPriceText);
        dest.writeInt(this.observePosition ? 1 : 0);
    }

    public /* synthetic */ LiqDescParams(boolean z11, String str, String str2, String str3, boolean z12, String str4, String str5, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? false : z13);
    }
}
