package p596rh;

import com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.sdk.PageEntity1;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sh.EuropeComplianceSymbolDocEntity;
import sh.EuropeUnlockLeverageBonusEntity;

/* JADX INFO: renamed from: rh.b */
/* JADX INFO: compiled from: IComplianceApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J*\u0010\u0007\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\t0\u0003H'J:\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u000e\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H§@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/IComplianceApi;", "", "fetchEuropeComplianceDoc", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceSymbolDocEntity;", "symbol", "", "fetchEuropeLegalLang", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchEuropeComplianceDocs", "Lcom/kubi/sdk/PageEntity1;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "documentType", "currentPage", "", "pageSize", "fetchEuropeUnlockLeverageLevel", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchEuropeUnlockLeverageLevelTasks", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "fetchEuropeUnlockLeverageTrial", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageBonusEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44094b {
    @GET("v1/km/academy/task-status")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo97158a(@NotNull Continuation<? super List<EuropeUnlockLeverageLevelTaskEntity>> continuation) throws Throwable;

    @GET("v1/km/contract/legal-langs")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<HashMap<String, String>> mo97159b() throws Throwable;

    @GET("v1/km/academy/level")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo97160c(@NotNull Continuation<? super EuropeUnlockLeverageLevelEntity> continuation) throws Throwable;

    @GET("v1/km/academy/task-coupon-claim")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<EuropeUnlockLeverageBonusEntity> mo97161d() throws Throwable;

    @GET("v1/km/contract/compliance-doc")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<EuropeComplianceSymbolDocEntity> mo97162e(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/km/contract/compliance-docs")
    @NotNull
    /* JADX INFO: renamed from: f */
    PageEntity1<EuropeComplianceDocsEntity> mo97163f(@Nullable @Query("docType") String str, @Nullable @Query("key") String str2, @Query("currentPage") int i11, @Query("pageSize") int i12) throws Throwable;
}
