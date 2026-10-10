package p756xc;

import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import o30.InterfaceC42953a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc.a, reason: from toString */
/* JADX INFO: compiled from: TradeSymbolBalance.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/data/BalanceData;", "Lcom/kubi/tradebase/entity/IBalance;", AppsFlyerProperties.CURRENCY_CODE, "", "currencyName", "availableBalance", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCurrencyCode", "()Ljava/lang/String;", "getCurrencyName", "getAvailableBalance", "()Ljava/math/BigDecimal;", "getAvailableBalanceCompat", "getBalanceCurrency", "getBalanceCurrencyName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BalanceData implements InterfaceC42953a {

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String currencyCode;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String currencyName;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final BigDecimal availableBalance;

    public BalanceData() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceData)) {
            return false;
        }
        BalanceData balanceData = (BalanceData) other;
        return Intrinsics.areEqual(this.currencyCode, balanceData.currencyCode) && Intrinsics.areEqual(this.currencyName, balanceData.currencyName) && Intrinsics.areEqual(this.availableBalance, balanceData.availableBalance);
    }

    public BalanceData(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal) {
        this.currencyCode = str;
        this.currencyName = str2;
        this.availableBalance = bigDecimal;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public BigDecimal m101662b() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    public int hashCode() {
        String str = this.currencyCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.availableBalance;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BalanceData(currencyCode=" + this.currencyCode + ", currencyName=" + this.currencyName + ", availableBalance=" + this.availableBalance + ')';
    }

    public /* synthetic */ BalanceData(String str, String str2, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal);
    }
}
