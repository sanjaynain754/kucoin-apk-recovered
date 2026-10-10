package com.kubi.home.router;

import com.kubi.host.HostManager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.api.IUserService;
import dj.C36719d;
import java.util.Map;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: RouterNavigationInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/router/RouterNavigationInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RouterNavigationInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f26191a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public static String f26192b;

    /* JADX INFO: compiled from: RouterNavigationInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/router/RouterNavigationInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_JUMP_URL", "payJumpUrl", "updateKuCoinPayLink", "", "jumpUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJumpUrl", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRouterNavigationInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterNavigationInterceptor.kt\ncom/kubi/home/router/RouterNavigationInterceptor$Companion\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,68:1\n32#2:69\n*S KotlinDebug\n*F\n+ 1 RouterNavigationInterceptor.kt\ncom/kubi/home/router/RouterNavigationInterceptor$Companion\n*L\n44#1:69\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            if (kotlinx.coroutines.C41686h.m91049g(r8, r2, r0) == r1) goto L26;
         */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object updateKuCoinPayLink(@Nullable String str, @NotNull Continuation<? super Unit> continuation) {
            RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1 routerNavigationInterceptor$Companion$updateKuCoinPayLink$1;
            if (continuation instanceof RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1) {
                routerNavigationInterceptor$Companion$updateKuCoinPayLink$1 = (RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1) continuation;
                int i11 = routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    routerNavigationInterceptor$Companion$updateKuCoinPayLink$1 = new RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1(this, continuation);
                }
            } else {
                routerNavigationInterceptor$Companion$updateKuCoinPayLink$1 = new RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1(this, continuation);
            }
            Object obj = routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.label;
            if (i12 != 0) {
                if (i12 == 1) {
                    str = (String) routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97259c("RouterNavigationInterceptor", " [updateKuCoinPayLink] jumpUrl:" + str);
            if (str == null || str.length() == 0) {
                return Unit.INSTANCE;
            }
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            RouterNavigationInterceptor$Companion$updateKuCoinPayLink$2 routerNavigationInterceptor$Companion$updateKuCoinPayLink$2 = new RouterNavigationInterceptor$Companion$updateKuCoinPayLink$2(str, null);
            routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.L$0 = str;
            routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.label = 1;
            if (C41686h.m91049g(abstractC41697j0M91392b, routerNavigationInterceptor$Companion$updateKuCoinPayLink$2, routerNavigationInterceptor$Companion$updateKuCoinPayLink$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            RouterNavigationInterceptor$Companion$updateKuCoinPayLink$3 routerNavigationInterceptor$Companion$updateKuCoinPayLink$3 = new RouterNavigationInterceptor$Companion$updateKuCoinPayLink$3(str, null);
            routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            routerNavigationInterceptor$Companion$updateKuCoinPayLink$1.label = 2;
        }

        /* JADX INFO: renamed from: a */
        public final String m30210a() {
            String str = RouterNavigationInterceptor.f26192b;
            if (str == null || str.length() == 0) {
                RouterNavigationInterceptor.f26192b = C46392a.m102326h(C36719d.f79632a.m82266k(), "");
            }
            String str2 = RouterNavigationInterceptor.f26192b;
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return HostManager.a.m() + "/pay/user?appNeedLang=true&loading=2&needLogin=true&transparentTitle=true";
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m30209e() {
        String strM30210a = f26191a.m30210a();
        C44128b.m97259c("RouterNavigationInterceptor", "[intercept] url:" + strM30210a);
        RouteExKt.m56217H(strM30210a);
        return Unit.INSTANCE;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String strM56216G = RouteExKt.m56216G(chain.getPostcard().getUri());
        C44128b.m97259c("RouterNavigationInterceptor", "[intercept] action:" + strM56216G);
        if (Intrinsics.areEqual("home/userPay", strM56216G)) {
            IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.home.router.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterNavigationInterceptor.m30209e();
                }
            }, 1, (Object) null);
        }
        return true;
    }
}
