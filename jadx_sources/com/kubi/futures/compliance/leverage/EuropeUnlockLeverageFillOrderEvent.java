package com.kubi.futures.compliance.leverage;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.kumex.logic.constant.OrderTradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EuropeUnlockLeverageFillOrderEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", "Lcom/kubi/futures/compliance/leverage/IEuropeUnlockLeverageFillOrderEvent;", "Landroid/os/Parcelable;", "leverage", "Ljava/math/BigDecimal;", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "side", "", "openTrialSwitch", "", "openTPSLSwitch", "<init>", "(Ljava/math/BigDecimal;Lcom/kubi/kumex/logic/constant/OrderTradeType;Ljava/lang/String;ZZ)V", "getLeverage", "()Ljava/math/BigDecimal;", "getOrderType", "()Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getSide", "()Ljava/lang/String;", "getOpenTrialSwitch", "()Z", "getOpenTPSLSwitch", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeUnlockLeverageFillOrderEvent implements IEuropeUnlockLeverageFillOrderEvent, Parcelable {

    @NotNull
    public static final Parcelable.Creator<EuropeUnlockLeverageFillOrderEvent> CREATOR = new C12884a();

    @NotNull
    private final BigDecimal leverage;
    private final boolean openTPSLSwitch;
    private final boolean openTrialSwitch;

    @NotNull
    private final OrderTradeType orderType;

    @NotNull
    private final String side;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageFillOrderEvent$a */
    /* JADX INFO: compiled from: EuropeUnlockLeverageFillOrderEvent.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12884a implements Parcelable.Creator<EuropeUnlockLeverageFillOrderEvent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EuropeUnlockLeverageFillOrderEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            OrderTradeType orderTradeTypeValueOf = OrderTradeType.valueOf(parcel.readString());
            String string = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new EuropeUnlockLeverageFillOrderEvent(bigDecimal, orderTradeTypeValueOf, string, z11, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EuropeUnlockLeverageFillOrderEvent[] newArray(int i11) {
            return new EuropeUnlockLeverageFillOrderEvent[i11];
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
        if (!(other instanceof EuropeUnlockLeverageFillOrderEvent)) {
            return false;
        }
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEvent = (EuropeUnlockLeverageFillOrderEvent) other;
        return Intrinsics.areEqual(this.leverage, europeUnlockLeverageFillOrderEvent.leverage) && this.orderType == europeUnlockLeverageFillOrderEvent.orderType && Intrinsics.areEqual(this.side, europeUnlockLeverageFillOrderEvent.side) && this.openTrialSwitch == europeUnlockLeverageFillOrderEvent.openTrialSwitch && this.openTPSLSwitch == europeUnlockLeverageFillOrderEvent.openTPSLSwitch;
    }

    public EuropeUnlockLeverageFillOrderEvent(@NotNull BigDecimal leverage, @NotNull OrderTradeType orderType, @NotNull String side, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(side, "side");
        this.leverage = leverage;
        this.orderType = orderType;
        this.side = side;
        this.openTrialSwitch = z11;
        this.openTPSLSwitch = z12;
    }

    public static /* synthetic */ EuropeUnlockLeverageFillOrderEvent copy$default(EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEvent, BigDecimal bigDecimal, OrderTradeType orderTradeType, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = europeUnlockLeverageFillOrderEvent.leverage;
        }
        if ((i11 & 2) != 0) {
            orderTradeType = europeUnlockLeverageFillOrderEvent.orderType;
        }
        if ((i11 & 4) != 0) {
            str = europeUnlockLeverageFillOrderEvent.side;
        }
        if ((i11 & 8) != 0) {
            z11 = europeUnlockLeverageFillOrderEvent.openTrialSwitch;
        }
        if ((i11 & 16) != 0) {
            z12 = europeUnlockLeverageFillOrderEvent.openTPSLSwitch;
        }
        boolean z13 = z12;
        String str2 = str;
        return europeUnlockLeverageFillOrderEvent.copy(bigDecimal, orderTradeType, str2, z11, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderTradeType getOrderType() {
        return this.orderType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOpenTrialSwitch() {
        return this.openTrialSwitch;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOpenTPSLSwitch() {
        return this.openTPSLSwitch;
    }

    @NotNull
    public final EuropeUnlockLeverageFillOrderEvent copy(@NotNull BigDecimal leverage, @NotNull OrderTradeType orderType, @NotNull String side, boolean openTrialSwitch, boolean openTPSLSwitch) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(side, "side");
        return new EuropeUnlockLeverageFillOrderEvent(leverage, orderType, side, openTrialSwitch, openTPSLSwitch);
    }

    @NotNull
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    public final boolean getOpenTPSLSwitch() {
        return this.openTPSLSwitch;
    }

    public final boolean getOpenTrialSwitch() {
        return this.openTrialSwitch;
    }

    @NotNull
    public final OrderTradeType getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    public int hashCode() {
        return (((((((this.leverage.hashCode() * 31) + this.orderType.hashCode()) * 31) + this.side.hashCode()) * 31) + Boolean.hashCode(this.openTrialSwitch)) * 31) + Boolean.hashCode(this.openTPSLSwitch);
    }

    @NotNull
    public String toString() {
        return "EuropeUnlockLeverageFillOrderEvent(leverage=" + this.leverage + ", orderType=" + this.orderType + ", side=" + this.side + ", openTrialSwitch=" + this.openTrialSwitch + ", openTPSLSwitch=" + this.openTPSLSwitch + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.leverage);
        dest.writeString(this.orderType.name());
        dest.writeString(this.side);
        dest.writeInt(this.openTrialSwitch ? 1 : 0);
        dest.writeInt(this.openTPSLSwitch ? 1 : 0);
    }
}
