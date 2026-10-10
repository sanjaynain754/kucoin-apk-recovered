package in;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.api.IUserService;
import gn.InterfaceC37975b;
import hn.C38234d;
import il.C38661c;
import org.jetbrains.annotations.NotNull;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: in.a */
/* JADX INFO: compiled from: KycHomeInterceptor.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kyc/interceptor/KycHomeInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycHomeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycHomeInterceptor.kt\ncom/kubi/kyc/interceptor/KycHomeInterceptor\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,43:1\n17#2,2:44\n*S KotlinDebug\n*F\n+ 1 KycHomeInterceptor.kt\ncom/kubi/kyc/interceptor/KycHomeInterceptor\n*L\n30#1:44,2\n*E\n"})
public final class C38687a extends C38661c {
    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!IUserService.a.get().c()) {
            return super.mo4304b(chain);
        }
        C38234d c38234d = C38234d.f85931a;
        if (c38234d.m86315i()) {
            return Router.f46192a.m56184f("krn/router?biz=platformKyc&entry=main&component=kyc&needLogin=true").m4048k();
        }
        Router router = Router.f46192a;
        Object objM56186h = router.m56186h(InterfaceC37975b.class, SiteInfoManager.f47913a.m58109c());
        return ((objM56186h != null ? ((InterfaceC37975b) objM56186h).mo4569a() : false) && c38234d.m86314h()) ? router.m56184f("krn/router?biz=kyc&entry=main&component=kucoin_kyc_rn&needLogin=true").m4048k() : chain.mo103413a(chain.getPostcard());
    }
}
