package com.kubi.core.base.quote;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p756xc.Request;
import p756xc.SymbolConfigResponse;
import p756xc.SymbolQuoteResponse;
import p793yc.InterfaceC46460b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.base.quote.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeSymbolQuoteDataRepo.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/quote/ITradeSymbolQuoteDataRepo;", "", "symbolQuoteHandler", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$Request;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$SymbolQuoteResponse;", "getSymbolQuoteHandler", "()Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "symbolConfigHandler", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$SymbolConfigResponse;", "getSymbolConfigHandler", "startSubQuoteSnapshotFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "symbol", "", "startSubMaintenanceStatusFlow", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeSymbolQuoteDataRepo {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC46460b<Request, SymbolConfigResponse> mo21125a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<WsMarketSnapshotEntity> mo21126b(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC46460b<Request, SymbolQuoteResponse> mo21127c();

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<Boolean> mo21128d(@NotNull BaseFragment baseFragment, @NotNull String str);
}
