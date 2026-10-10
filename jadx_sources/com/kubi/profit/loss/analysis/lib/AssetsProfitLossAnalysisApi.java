package com.kubi.profit.loss.analysis.lib;

import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisApi.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisApi;", "", "getNewPointByRange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;", "rangeV2", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AssetsProfitLossAnalysisApi {
    @GET("v1/asset/trend")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<ProfitLossAnalysisApiResponse> m50061i(@NotNull @Query("rangeV2") String str);
}
