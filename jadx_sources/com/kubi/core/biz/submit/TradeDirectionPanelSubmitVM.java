package com.kubi.core.biz.submit;

import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.data.entity.SymbolInfoEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.c1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeDirectionPanelSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiIntent;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;", "repoManager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "initState", "getInitState", "()Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;", "isSupportEtfTrade", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeDirectionPanelSubmitVM extends AbsTradeBaseBizVM<Object, TradeDirectionPanelSubmitContract$UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final AbstractC46753c f20692X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeDirectionPanelSubmitVM(@NotNull AbstractC46753c repoManager) {
        super(repoManager);
        Intrinsics.checkNotNullParameter(repoManager, "repoManager");
        this.f20692X = repoManager;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public TradeDirectionPanelSubmitContract$UiState getInitState() {
        return TradeDirectionPanelSubmitContract$UiState.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22527r(@Nullable SymbolInfoEntity symbolInfoEntity) {
        return this.f20692X.mo96892a().mo22543g() && symbolInfoEntity != null && symbolInfoEntity.isEtfSymbol();
    }
}
