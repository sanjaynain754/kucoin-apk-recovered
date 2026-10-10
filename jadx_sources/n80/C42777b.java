package n80;

import com.kubi.router.utils.RouteExKt;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: n80.b */
/* JADX INFO: compiled from: RouteWelfareInterceptor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/welfare/interceptor/RouteWelfareInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "needLoginList", "", "", "getNeedLoginList", "()Ljava/util/List;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42777b implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<String> f94722a = CollectionsKt.listOf((Object[]) new String[]{"welfare/encourage/record", "welfare/invite", "welfare/other", "welfare/rules"});

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String strM56216G = RouteExKt.m56216G(chain.getPostcard().getUri());
        C44128b.m97259c("RouteWelfareInterceptor", "uri = " + chain.getPostcard().getUri());
        if (UserInfo.a.n() || !this.f94722a.contains(strM56216G)) {
            return chain.mo103413a(chain.getPostcard());
        }
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: n80.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42777b.m93733c(chain);
            }
        }, 1, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Unit m93733c(InterfaceC46935a interfaceC46935a) {
        interfaceC46935a.mo103413a(interfaceC46935a.getPostcard());
        return Unit.INSTANCE;
    }
}
