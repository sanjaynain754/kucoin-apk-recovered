package com.kubi.tradebase.marketamount;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: compiled from: MarketAmountUnitStore.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\u00020\u0005*\u00020\u0007H\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MmkvMarketAmountUnitPreferences;", "Lcom/kubi/tradebase/marketamount/MarketAmountUnitPreferences;", "<init>", "()V", "read", "", "side", "Lcom/kubi/tradebase/marketamount/MarketAmountSide;", "write", "", "unit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "key", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MmkvMarketAmountUnitPreferences implements MarketAmountUnitPreferences {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f51564a = new Companion(null);

    /* JADX INFO: compiled from: MarketAmountUnitStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MmkvMarketAmountUnitPreferences$Companion;", "", "<init>", "()V", "CATEGORY", "", "BUY_KEY", "SELL_KEY", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.marketamount.MmkvMarketAmountUnitPreferences$a */
    /* JADX INFO: compiled from: MarketAmountUnitStore.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25890a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketAmountSide.values().length];
            try {
                iArr[MarketAmountSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketAmountSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.kubi.tradebase.marketamount.MarketAmountUnitPreferences
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo63228a(@NotNull MarketAmountSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return C46396e.m102351h("trade", m63230c(side), "");
    }

    @Override // com.kubi.tradebase.marketamount.MarketAmountUnitPreferences
    /* JADX INFO: renamed from: b */
    public void mo63229b(@NotNull MarketAmountSide side, @NotNull MarketAmountUnit unit) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unit, "unit");
        C46396e.m102358o("trade", m63230c(side), unit.name());
    }

    /* JADX INFO: renamed from: c */
    public final String m63230c(MarketAmountSide marketAmountSide) {
        int i11 = C25890a.$EnumSwitchMapping$0[marketAmountSide.ordinal()];
        if (i11 == 1) {
            return "market_amount_unit_buy";
        }
        if (i11 == 2) {
            return "market_amount_unit_sell";
        }
        throw new NoWhenBranchMatchedException();
    }
}
