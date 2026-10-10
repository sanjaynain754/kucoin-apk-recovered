package mp;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.loan.api.ILoanService;
import com.kubi.otc.api.IOtcService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: mp.a */
/* JADX INFO: compiled from: MarginDepend.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/service/MarginDepend;", "", "<init>", "()V", "getUserService", "Lcom/kubi/user/api/IUserService;", "getLoanService", "Lcom/kubi/loan/api/ILoanService;", "getSpotService", "Lcom/kubi/spot/api/ISpotService;", "getKuMexService", "Lcom/kubi/kumex/api/IKuMexService;", "getOtcService", "Lcom/kubi/otc/api/IOtcService;", "getAssetsCenterService", "Lcom/kubi/assets/api/IAssetsCenterService;", "getQuoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42579a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42579a f94275a = new C42579a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IAssetsCenterService m93341a() {
        return IAssetsCenterService.f16464a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IKuMexService m93342b() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ILoanService m93343c() {
        return ILoanService.f32363a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IOtcService m93344d() {
        return IOtcService.f37164a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IQuoteFacadeService m93345e() {
        return IQuoteFacadeService.f41383a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ISpotService m93346f() {
        return ISpotService.f49646a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final IUserService m93347g() {
        return IUserService.a.get();
    }
}
