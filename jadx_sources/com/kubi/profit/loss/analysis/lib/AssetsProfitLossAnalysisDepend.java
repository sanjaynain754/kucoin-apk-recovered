package com.kubi.profit.loss.analysis.lib;

import com.kubi.assets.api.IAssetsCenterService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisDepend.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisDepend;", "", "<init>", "()V", "userService", "Lcom/kubi/user/api/IUserService;", "assetService", "Lcom/kubi/assets/api/IAssetsCenterService;", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetsProfitLossAnalysisDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetsProfitLossAnalysisDepend f40740a = new AssetsProfitLossAnalysisDepend();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IAssetsCenterService m50062a() {
        return IAssetsCenterService.f16464a.get();
    }
}
