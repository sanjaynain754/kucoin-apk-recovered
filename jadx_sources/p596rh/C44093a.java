package p596rh;

import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.sdk.PageEntity1;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sh.EuropeComplianceSymbolDocEntity;
import sh.EuropeUnlockLeverageBonusEntity;

/* JADX INFO: renamed from: rh.a */
/* JADX INFO: compiled from: ComplianceServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0097\u0001J+\u0010\u0013\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0014j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\u00150\u0011H\u0097\u0001J\u000e\u0010\u0016\u001a\u00020\u0017H\u0097A¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0097A¢\u0006\u0002\u0010\u0018J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011H\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/ComplianceServiceImpl;", "Lcom/kubi/futures/data/compliance/IComplianceService;", "Lcom/kubi/futures/data/compliance/IComplianceApi;", "complianceApi", "<init>", "(Lcom/kubi/futures/data/compliance/IComplianceApi;)V", "()V", "fetchEuropeComplianceDocs", "Lcom/kubi/sdk/PageEntity1;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "documentType", "", "symbol", "currentPage", "", "pageSize", "fetchEuropeComplianceDoc", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceSymbolDocEntity;", "fetchEuropeLegalLang", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchEuropeUnlockLeverageLevel", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchEuropeUnlockLeverageLevelTasks", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "fetchEuropeUnlockLeverageTrial", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageBonusEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44093a implements IComplianceService, InterfaceC44094b {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC44094b f97345b;

    public C44093a(@NotNull InterfaceC44094b complianceApi) {
        Intrinsics.checkNotNullParameter(complianceApi, "complianceApi");
        this.f97345b = complianceApi;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C44093a() {
        Object objCreate = C42597a.m93388d().create(InterfaceC44094b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC44094b) objCreate);
    }

    @Override // p596rh.InterfaceC44094b
    @GET("v1/km/academy/task-status")
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo97158a(@NotNull Continuation<? super List<EuropeUnlockLeverageLevelTaskEntity>> continuation) {
        return this.f97345b.mo97158a(continuation);
    }

    @Override // p596rh.InterfaceC44094b
    @GET("v1/km/contract/legal-langs")
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<HashMap<String, String>> mo97159b() {
        return this.f97345b.mo97159b();
    }

    @Override // p596rh.InterfaceC44094b
    @GET("v1/km/academy/level")
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo97160c(@NotNull Continuation<? super EuropeUnlockLeverageLevelEntity> continuation) {
        return this.f97345b.mo97160c(continuation);
    }

    @Override // p596rh.InterfaceC44094b
    @GET("v1/km/academy/task-coupon-claim")
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC41634e<EuropeUnlockLeverageBonusEntity> mo97161d() {
        return this.f97345b.mo97161d();
    }

    @Override // p596rh.InterfaceC44094b
    @GET("v1/km/contract/compliance-doc")
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC41634e<EuropeComplianceSymbolDocEntity> mo97162e(@NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f97345b.mo97162e(symbol);
    }

    @Override // p596rh.InterfaceC44094b
    @NotNull
    /* JADX INFO: renamed from: f */
    public PageEntity1<EuropeComplianceDocsEntity> mo97163f(@Nullable String str, @Nullable String str2, int i11, int i12) {
        return ((InterfaceC44094b) C42597a.m93391g().create(InterfaceC44094b.class)).mo97163f(str, str2, i11, i12);
    }
}
