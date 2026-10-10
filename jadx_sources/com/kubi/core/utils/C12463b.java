package com.kubi.core.utils;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.utils.b */
/* JADX INFO: compiled from: SymbolInfoExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0004"}, m90084d2 = {"quotePrecision", "", "Lcom/kubi/data/entity/SymbolInfoEntity;", "basePrecision", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12463b {
    /* JADX INFO: renamed from: a */
    public static final int m23403a(@Nullable SymbolInfoEntity symbolInfoEntity) {
        String quoteIncrement;
        BigDecimal bigDecimalM66535e;
        Integer numValueOf = null;
        if (symbolInfoEntity != null && (quoteIncrement = symbolInfoEntity.getQuoteIncrement()) != null && (bigDecimalM66535e = DowngradeExKt.m66535e(quoteIncrement, null, 1, null)) != null) {
            numValueOf = Integer.valueOf(bigDecimalM66535e.scale());
        }
        return C27039d.m66651k(numValueOf, 8);
    }
}
