package com.kubi.core.biz.notice;

import com.kubi.spot.api.ISpotCommonService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.notice.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolRiskStore.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/core/biz/notice/SymbolRiskStore;", "", "<init>", "()V", "markShow", "", "symbol", "", "allowShow", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolRiskStore {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SymbolRiskStore f20559a = new SymbolRiskStore();

    /* JADX INFO: renamed from: a */
    public final boolean m22055a(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Object objMo59966j = ISpotCommonService.f49644a.get().mo59966j(symbol);
        Boolean bool = objMo59966j instanceof Boolean ? (Boolean) objMo59966j : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m22056b(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ISpotCommonService.f49644a.get().mo59963g(symbol, Boolean.FALSE);
    }
}
