package ee;

import com.kubi.margin.api.IMarginService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ee.a */
/* JADX INFO: compiled from: TradeCoreDepend.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/service/TradeCoreDepend;", "", "<init>", "()V", "getUserService", "Lcom/kubi/user/api/IUserService;", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getAssetsCenterService", "Lcom/kubi/assets/api/IAssetsCenterService;", "getQuoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "getOperationService", "Lcom/kubi/operation/api/IOperationService;", "getUnifyAccountService", "Lcom/kubi/unify/api/IUnifyAccountService;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37136a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37136a f82407a = new C37136a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IMarginService m83062a() {
        return IMarginService.f32724a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IUnifyAccountService m83063b() {
        return IUnifyAccountService.f53155a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IUserService m83064c() {
        return IUserService.a.get();
    }
}
