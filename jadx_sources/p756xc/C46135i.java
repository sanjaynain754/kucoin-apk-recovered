package p756xc;

import com.kubi.data.entity.SymbolInfoEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc.i */
/* JADX INFO: compiled from: TradeSymbolBalance.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\b"}, m90084d2 = {"createDefaultBalanceData", "Lcom/kubi/core/base/arch/api/data/BalanceData;", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "isQuote", "", "createDefaultTradeSymbolBalance", "Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46135i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BalanceData m101678a(@NotNull SymbolInfoEntity symbolInfoEntity, boolean z11) {
        Intrinsics.checkNotNullParameter(symbolInfoEntity, "symbolInfoEntity");
        return new BalanceData(z11 ? symbolInfoEntity.getQuoteCurrency() : symbolInfoEntity.getBaseCurrency(), z11 ? symbolInfoEntity.getQuoteCurrencyName() : symbolInfoEntity.getBaseCurrencyName(), null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TradeSymbolBalance m101679b(@NotNull SymbolInfoEntity symbolInfoEntity) {
        Intrinsics.checkNotNullParameter(symbolInfoEntity, "symbolInfoEntity");
        return new TradeSymbolBalance(new BalanceData(symbolInfoEntity.getBaseCurrency(), symbolInfoEntity.getBaseCurrencyName(), null, 4, null), new BalanceData(symbolInfoEntity.getQuoteCurrency(), symbolInfoEntity.getQuoteCurrencyName(), null, 4, null));
    }
}
