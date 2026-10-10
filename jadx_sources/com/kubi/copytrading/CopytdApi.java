package com.kubi.copytrading;

import com.kubi.copytrading.entity.CopyTradingContractEntity;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.copytrading.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CopytdApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0003H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH'J \u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0011H'J\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0003\u0010\u0014\u001a\u00020\fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/CopytdApi;", "", "fetchCopyTradingSubAccount", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/copytrading/entity/LeadUserEntity;", "fetchCopyTradingPositions", "fetchAllSymbolSupportCopyTrading", "Lcom/kubi/copytrading/entity/CopyTradingContractEntity;", "fetchFeatureAvailable", "", "featureType", "", "subUid", "fetchTrialFeatureAvailable", "submitSymbolConfig", "request", "", "fetchSymbolConfig1", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "time", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CopytdApi {
    @Nullable
    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/kumex/user-contracts-config")
    /* JADX INFO: renamed from: a */
    Object m20824a(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/copyTrading/exchange/kumex/user-contracts-config")
    @NotNull
    /* JADX INFO: renamed from: b */
    Map<String, SymbolConfig> m20825b(@Header("Cache-Time") @NotNull String str) throws Throwable;

    @GET("v1/copyTrading/exchange/feature/available")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<Boolean> m20826e(@NotNull @Query("featureType") String str, @Header("X-SUB-UID") @NotNull String str2) throws Throwable;

    @GET("v1/copyTrading/copyHomePage/positions/current")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<List<Object>> m20827f();

    @GET("v1/copyTrading/futures/contracts")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<List<CopyTradingContractEntity>> m20828g();

    @GET("v1/copyTrading/leadTraders/active")
    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<List<LeadUserEntity>> m20829h();
}
