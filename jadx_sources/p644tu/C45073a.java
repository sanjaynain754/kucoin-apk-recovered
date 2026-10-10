package p644tu;

import com.kubi.profit.loss.analysis.api.IAssetsProfitLossAnalysisService;
import com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: tu.a */
/* JADX INFO: compiled from: AssetsAssetsProfitLossAnalysisService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/service/AssetsAssetsProfitLossAnalysisService;", "Lcom/kubi/profit/loss/analysis/api/IAssetsProfitLossAnalysisService;", "<init>", "()V", "createProfitLossAnalysisFragment", "Lcom/kubi/sdk/BaseFragment;", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45073a implements IAssetsProfitLossAnalysisService {
    @Override // com.kubi.profit.loss.analysis.api.IAssetsProfitLossAnalysisService
    @NotNull
    /* JADX INFO: renamed from: a */
    public BaseFragment mo49938a() {
        return new AssetsProfitLossAnalysisFragment();
    }
}
