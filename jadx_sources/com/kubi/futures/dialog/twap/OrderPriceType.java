package com.kubi.futures.dialog.twap;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.kumex.R$string;
import com.kubi.utils.C27017c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u0003J\"\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/OrderPriceType;", "Landroid/os/Parcelable;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTypeDescBy", "", "side", "getInputPanelTypeDesc", "isHedgeMode", "", "isOneWayTogether", "generateDesc", "tag", "Companion", "MarketPrice", "CustomPriceWithPercent", "CustomPriceWithValueDelta", "Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithPercent;", "Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithValueDelta;", "Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class OrderPriceType implements Parcelable {

    @NotNull
    public static final String TYPE_FIXED = "FIXED";

    @NotNull
    public static final String TYPE_PERCENT = "PERCENT";

    @Nullable
    private final String type;

    /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithPercent;", "Lcom/kubi/futures/dialog/twap/OrderPriceType;", "percent", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getPercent", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CustomPriceWithPercent extends OrderPriceType {

        @NotNull
        public static final Parcelable.Creator<CustomPriceWithPercent> CREATOR = new C13127a();

        @NotNull
        private final BigDecimal percent;

        /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.OrderPriceType$CustomPriceWithPercent$a */
        /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C13127a implements Parcelable.Creator<CustomPriceWithPercent> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomPriceWithPercent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomPriceWithPercent((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CustomPriceWithPercent[] newArray(int i11) {
                return new CustomPriceWithPercent[i11];
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
            return (other instanceof CustomPriceWithPercent) && Intrinsics.areEqual(this.percent, ((CustomPriceWithPercent) other).percent);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPriceWithPercent(@NotNull BigDecimal percent) {
            super(OrderPriceType.TYPE_PERCENT, null);
            Intrinsics.checkNotNullParameter(percent, "percent");
            this.percent = percent;
        }

        public static /* synthetic */ CustomPriceWithPercent copy$default(CustomPriceWithPercent customPriceWithPercent, BigDecimal bigDecimal, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bigDecimal = customPriceWithPercent.percent;
            }
            return customPriceWithPercent.copy(bigDecimal);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BigDecimal getPercent() {
            return this.percent;
        }

        @NotNull
        public final CustomPriceWithPercent copy(@NotNull BigDecimal percent) {
            Intrinsics.checkNotNullParameter(percent, "percent");
            return new CustomPriceWithPercent(percent);
        }

        @NotNull
        public final BigDecimal getPercent() {
            return this.percent;
        }

        public int hashCode() {
            return this.percent.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomPriceWithPercent(percent=" + this.percent + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.percent);
        }
    }

    /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithValueDelta;", "Lcom/kubi/futures/dialog/twap/OrderPriceType;", "valueDelta", "Ljava/math/BigDecimal;", "priceCurrency", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getValueDelta", "()Ljava/math/BigDecimal;", "getPriceCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CustomPriceWithValueDelta extends OrderPriceType {

        @NotNull
        public static final Parcelable.Creator<CustomPriceWithValueDelta> CREATOR = new C13128a();

        @NotNull
        private final String priceCurrency;

        @NotNull
        private final BigDecimal valueDelta;

        /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.OrderPriceType$CustomPriceWithValueDelta$a */
        /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C13128a implements Parcelable.Creator<CustomPriceWithValueDelta> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomPriceWithValueDelta createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomPriceWithValueDelta((BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CustomPriceWithValueDelta[] newArray(int i11) {
                return new CustomPriceWithValueDelta[i11];
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
            if (!(other instanceof CustomPriceWithValueDelta)) {
                return false;
            }
            CustomPriceWithValueDelta customPriceWithValueDelta = (CustomPriceWithValueDelta) other;
            return Intrinsics.areEqual(this.valueDelta, customPriceWithValueDelta.valueDelta) && Intrinsics.areEqual(this.priceCurrency, customPriceWithValueDelta.priceCurrency);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPriceWithValueDelta(@NotNull BigDecimal valueDelta, @NotNull String priceCurrency) {
            super(OrderPriceType.TYPE_FIXED, null);
            Intrinsics.checkNotNullParameter(valueDelta, "valueDelta");
            Intrinsics.checkNotNullParameter(priceCurrency, "priceCurrency");
            this.valueDelta = valueDelta;
            this.priceCurrency = priceCurrency;
        }

        public static /* synthetic */ CustomPriceWithValueDelta copy$default(CustomPriceWithValueDelta customPriceWithValueDelta, BigDecimal bigDecimal, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bigDecimal = customPriceWithValueDelta.valueDelta;
            }
            if ((i11 & 2) != 0) {
                str = customPriceWithValueDelta.priceCurrency;
            }
            return customPriceWithValueDelta.copy(bigDecimal, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BigDecimal getValueDelta() {
            return this.valueDelta;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPriceCurrency() {
            return this.priceCurrency;
        }

        @NotNull
        public final CustomPriceWithValueDelta copy(@NotNull BigDecimal valueDelta, @NotNull String priceCurrency) {
            Intrinsics.checkNotNullParameter(valueDelta, "valueDelta");
            Intrinsics.checkNotNullParameter(priceCurrency, "priceCurrency");
            return new CustomPriceWithValueDelta(valueDelta, priceCurrency);
        }

        @NotNull
        public final String getPriceCurrency() {
            return this.priceCurrency;
        }

        @NotNull
        public final BigDecimal getValueDelta() {
            return this.valueDelta;
        }

        public int hashCode() {
            return (this.valueDelta.hashCode() * 31) + this.priceCurrency.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomPriceWithValueDelta(valueDelta=" + this.valueDelta + ", priceCurrency=" + this.priceCurrency + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.valueDelta);
            dest.writeString(this.priceCurrency);
        }
    }

    /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;", "Lcom/kubi/futures/dialog/twap/OrderPriceType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class MarketPrice extends OrderPriceType {

        @NotNull
        public static final MarketPrice INSTANCE = new MarketPrice();

        @NotNull
        public static final Parcelable.Creator<MarketPrice> CREATOR = new C13129a();

        /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.OrderPriceType$MarketPrice$a */
        /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C13129a implements Parcelable.Creator<MarketPrice> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MarketPrice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarketPrice.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MarketPrice[] newArray(int i11) {
                return new MarketPrice[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private MarketPrice() {
            super(null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ OrderPriceType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private OrderPriceType(String str) {
        this.type = str;
    }

    private final CharSequence generateDesc(String tag) {
        if (this instanceof CustomPriceWithPercent) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27017c.f54310a.m66516f(R$string.bkumex_twap_custom_price_order, new Object[0]));
            sb2.append(tag);
            sb2.append(C42180b.m92642g(((CustomPriceWithPercent) this).getPercent(), null, null, 0, false, false, false, 31, null));
            return sb2;
        }
        if (!(this instanceof CustomPriceWithValueDelta)) {
            if (this instanceof MarketPrice) {
                return C27017c.f54310a.m66516f(R$string.bkumex_twap_market_price_order, new Object[0]);
            }
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C27017c.f54310a.m66516f(R$string.bkumex_twap_custom_price_order, new Object[0]));
        sb3.append(tag);
        CustomPriceWithValueDelta customPriceWithValueDelta = (CustomPriceWithValueDelta) this;
        sb3.append(customPriceWithValueDelta.getValueDelta().toPlainString());
        sb3.append(C33627eb.f69716f);
        sb3.append(customPriceWithValueDelta.getPriceCurrency());
        return sb3;
    }

    @Nullable
    public final CharSequence getInputPanelTypeDesc(boolean isHedgeMode, boolean isOneWayTogether, @NotNull String side) {
        String str;
        Intrinsics.checkNotNullParameter(side, "side");
        if (isHedgeMode || isOneWayTogether) {
            str = "±";
        } else {
            str = Intrinsics.areEqual(side, "buy") ? "+" : C33820nf.f71144W;
        }
        return generateDesc(str);
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final CharSequence getTypeDescBy(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return generateDesc(Intrinsics.areEqual(side, "buy") ? "+" : C33820nf.f71144W);
    }
}
