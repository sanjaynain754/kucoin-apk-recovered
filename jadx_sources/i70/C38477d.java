package i70;

import android.text.TextUtils;
import com.kubi.host.HostManager;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.exception.UserCenterException;
import com.kubi.utils.extensions.C27041f;
import d70.C36638a;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: i70.d */
/* JADX INFO: compiled from: RouteUserCenterInterceptor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/user/interceptor/ReferralCodeInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "TAG", "", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteUserCenterInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteUserCenterInterceptor.kt\ncom/kubi/user/interceptor/ReferralCodeInterceptor\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,283:1\n57#2,8:284\n*S KotlinDebug\n*F\n+ 1 RouteUserCenterInterceptor.kt\ncom/kubi/user/interceptor/ReferralCodeInterceptor\n*L\n71#1:284,8\n*E\n"})
public final class C38477d implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f86417a = "ReferralCodeInterceptor";

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        C44128b.m97266j(this.f86417a, "ReferralCodeInterceptor intercept uri: " + postcard.getUri() + "  queryParameterNames: " + postcard.getUri().getQueryParameterNames());
        try {
            if (postcard.getUri().getQueryParameterNames().contains("rCode") || postcard.getUri().getQueryParameterNames().contains("rcode")) {
                if (HostManager.a.a(postcard.getUri().toString())) {
                    LoginInfoConfig loginInfoConfig = LoginInfoConfig.a;
                    if (TextUtils.isEmpty(postcard.getUri().getQueryParameter("rcode"))) {
                        queryParameter = postcard.getUri().getQueryParameter("rCode");
                    } else {
                        queryParameter = postcard.getUri().getQueryParameter("rcode");
                    }
                    loginInfoConfig.n0(C27041f.m66668h(queryParameter));
                }
            }
            if (postcard.getUri().getQueryParameterNames().contains("utm_campaign") && HostManager.a.a(postcard.getUri().toString())) {
                LoginInfoConfig loginInfoConfig2 = LoginInfoConfig.a;
                String queryParameter2 = postcard.getUri().getQueryParameter("utm_campaign");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                loginInfoConfig2.o0(queryParameter2);
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                if (!C36638a.m81972c(e11)) {
                    C36638a.m81973d(e11, "ReferralCodeInterceptor");
                } else {
                    C43846g.m96568c(new UserCenterException(e11, "ReferralCodeInterceptor", true, null, 8, null), null, 2, null);
                }
            }
        }
        return chain.mo103413a(postcard);
    }
}
