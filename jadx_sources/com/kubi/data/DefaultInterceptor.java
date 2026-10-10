package com.kubi.data;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.data.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DataInitPlugins.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/data/DefaultInterceptor;", "Lcom/kubi/data/IInterceptor;", "<init>", "()V", "intercept", "", "symbol", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultInterceptor implements IInterceptor {
    @Override // com.kubi.data.IInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Integer mo23682a(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Integer num = C41016c.f91250g.get(symbol);
        if (num == null) {
            if (StringsKt.contains$default((CharSequence) symbol, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbol);
                if (symbolInfoEntityM85601B != null) {
                    Integer numValueOf = Integer.valueOf(symbolInfoEntityM85601B.getPriceIncrementPrecision());
                    HashMap<String, Integer> precisionMap = C41016c.f91250g;
                    Intrinsics.checkNotNullExpressionValue(precisionMap, "precisionMap");
                    precisionMap.put(symbol, Integer.valueOf(symbolInfoEntityM85601B.getPriceIncrementPrecision()));
                    return numValueOf;
                }
                return num;
            }
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(symbol);
            if (coinInfoEntityM85613u != null) {
                Integer numValueOf2 = Integer.valueOf(coinInfoEntityM85613u.getPrecision());
                HashMap<String, Integer> precisionMap2 = C41016c.f91250g;
                Intrinsics.checkNotNullExpressionValue(precisionMap2, "precisionMap");
                precisionMap2.put(symbol, Integer.valueOf(coinInfoEntityM85613u.getPrecision()));
                return numValueOf2;
            }
            return num;
        }
        return num;
    }
}
