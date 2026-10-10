package p725wh;

import com.kubi.futures.data.welfare.IWelfareService;
import com.kubi.kumex.data.market.model.DistributionPageEntity;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: wh.b */
/* JADX INFO: compiled from: WelfareService.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0097\u0001J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/data/welfare/WelfareService;", "Lcom/kubi/futures/data/welfare/IWelfareService;", "Lcom/kubi/futures/data/welfare/IWelfareApi;", "api", "<init>", "(Lcom/kubi/futures/data/welfare/IWelfareApi;)V", "()V", "fetchDistributionRetention", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "code", "", "fetchTrialOrderPopup", "Lcom/kubi/kumex/data/market/model/DistributionPageEntity;", "currentPage", "", "pageSize", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45832b implements IWelfareService, InterfaceC45831a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC45831a f103311a;

    public C45832b(@NotNull InterfaceC45831a api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f103311a = api;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C45832b() {
        Object objCreate = C42597a.m93391g().create(InterfaceC45831a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC45831a) objCreate);
    }

    @Override // p725wh.InterfaceC45831a
    @GET("v1/trial/order/pop-up-window")
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41634e<DistributionPageEntity> mo101248a(@NotNull @Query("code") String code, @Query("currentPage") int i11, @Query("pageSize") int i12) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f103311a.mo101248a(code, i11, i12);
    }

    @Override // p725wh.InterfaceC45831a
    @GET("v1/trial/getTrialRewardRetentionPopUpWindow")
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<DistributionRetentionEntity> mo101249b(@NotNull @Query("code") String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f103311a.mo101249b(code);
    }
}
