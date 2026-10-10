package g50;

import com.kubi.data.entity.SymbolInfoEntity;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g50.a */
/* JADX INFO: compiled from: StrategyListItemMapper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, m90084d2 = {"getBaseIncrementPrecision", "", "symbolString", "", "getPriceIncrementPrecision", "getQuoteIncrementPrecision", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37815a {
    /* JADX INFO: renamed from: a */
    public static final int m85332a(@NotNull String symbolString) {
        Intrinsics.checkNotNullParameter(symbolString, "symbolString");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbolString);
        if (symbolInfoEntityM85601B != null) {
            return symbolInfoEntityM85601B.getBaseIncrementPrecision();
        }
        return 8;
    }

    /* JADX INFO: renamed from: b */
    public static final int m85333b(@NotNull String symbolString) {
        Intrinsics.checkNotNullParameter(symbolString, "symbolString");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbolString);
        if (symbolInfoEntityM85601B != null) {
            return symbolInfoEntityM85601B.getQuoteIncrementPrecision();
        }
        return 8;
    }
}
