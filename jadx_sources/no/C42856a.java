package no;

import com.kubi.margin.api.IMarginService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: no.a */
/* JADX INFO: compiled from: LoanDepend.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/loan/service/LoanDepend;", "", "<init>", "()V", "getUserService", "Lcom/kubi/user/api/IUserService;", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getUnifyAccountService", "Lcom/kubi/unify/api/IUnifyAccountService;", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42856a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42856a f94921a = new C42856a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IMarginService m93998a() {
        return IMarginService.f32724a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IUnifyAccountService m93999b() {
        return IUnifyAccountService.f53155a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IUserService m94000c() {
        return IUserService.a.get();
    }
}
