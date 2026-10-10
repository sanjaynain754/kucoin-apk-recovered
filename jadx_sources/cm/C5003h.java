package cm;

import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.h */
/* JADX INFO: compiled from: CrossLeverageEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m90084d2 = {"deepCopy", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "asCrossLeverage", "Ljava/math/BigDecimal;", "KumexApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C5003h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m5397a(@Nullable BigDecimal bigDecimal) {
        return bigDecimal == null ? new BigDecimal(3) : bigDecimal;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final SymbolsCrossLeverage m5398b(@NotNull SymbolsCrossLeverage symbolsCrossLeverage) {
        Intrinsics.checkNotNullParameter(symbolsCrossLeverage, "<this>");
        SymbolsCrossLeverage symbolsCrossLeverage2 = new SymbolsCrossLeverage();
        for (Map.Entry<String, CrossLeverageEntity> entry : symbolsCrossLeverage.entrySet()) {
            symbolsCrossLeverage2.put(entry.getKey(), CrossLeverageEntity.copy$default(entry.getValue(), null, 1, null));
        }
        return symbolsCrossLeverage2;
    }
}
