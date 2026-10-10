package com.kubi.profit.loss.analysis.api;

import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IAssetsProfitLossAnalysisService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/api/IAssetsProfitLossAnalysisService;", "", "createProfitLossAnalysisFragment", "Lcom/kubi/sdk/BaseFragment;", "Companion", "ProfitLossAnalysisApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IAssetsProfitLossAnalysisService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f40529a = Companion.f40530a;

    /* JADX INFO: compiled from: IAssetsProfitLossAnalysisService.kt */
    /* JADX INFO: loaded from: classes35.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/api/IAssetsProfitLossAnalysisService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/profit/loss/analysis/api/IAssetsProfitLossAnalysisService;", "ProfitLossAnalysisApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f40530a = new Companion();

        @NotNull
        public final IAssetsProfitLossAnalysisService get() {
            return (IAssetsProfitLossAnalysisService) Router.f46192a.m56192n(IAssetsProfitLossAnalysisService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    BaseFragment mo49938a();
}
