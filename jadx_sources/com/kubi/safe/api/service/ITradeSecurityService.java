package com.kubi.safe.api.service;

import androidx.fragment.app.Fragment;
import com.kubi.router.core.Router;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p244ey.InterfaceC37277b;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ITradeSecurityService.kt */
/* JADX INFO: loaded from: classes40.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\bg\u0018\u0000  2\u00020\u0001:\u0001 Jä\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001e\b\u0002\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u001623\u0010\u0017\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u0013H&¢\u0006\u0002\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/safe/api/service/ITradeSecurityService;", "", "verify", "", DropFrameTable.COLUMN_SCENE, "Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;", "fragment", "Landroidx/fragment/app/Fragment;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dataString", "", "loadingHost", "Lcom/kubi/safe/api/tradesecurity/TradeLoadingHost;", "needProceedLoading", "", "allowRetry", "ignorePwd", "onBeforeCheck", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onForgetPassword", "Lkotlin/Function0;", "onProceed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "validationToken", "onCancelled", "onFailed", "", "(Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;Landroidx/fragment/app/Fragment;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/kubi/safe/api/tradesecurity/TradeLoadingHost;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Companion", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeSecurityService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f46326a = Companion.f46327a;

    /* JADX INFO: compiled from: ITradeSecurityService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/safe/api/service/ITradeSecurityService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/safe/api/service/ITradeSecurityService;", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f46327a = new Companion();

        @NotNull
        public final ITradeSecurityService get() {
            return (ITradeSecurityService) Router.f46192a.m56192n(ITradeSecurityService.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m56325b(ITradeSecurityService iTradeSecurityService, TradeSecurityScene tradeSecurityScene, Fragment fragment, InterfaceC41709m0 interfaceC41709m0, String str, InterfaceC37277b interfaceC37277b, boolean z11, boolean z12, boolean z13, Function1 function1, Function0 function0, Function2 function2, Function0 function3, Function1 function4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verify");
        }
        iTradeSecurityService.m56331e(tradeSecurityScene, fragment, interfaceC41709m0, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? null : interfaceC37277b, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? true : z12, (i11 & 128) != 0 ? false : z13, (i11 & 256) != 0 ? new ITradeSecurityService$verify$1(null) : function1, (i11 & 512) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ITradeSecurityService.m56328f();
            }
        } : function0, function2, (i11 & 2048) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ITradeSecurityService.m56330h();
            }
        } : function3, (i11 & 4096) != 0 ? new Function1() { // from class: com.kubi.safe.api.service.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ITradeSecurityService.m56324a((Throwable) obj2);
            }
        } : function4);
    }

    /* JADX INFO: renamed from: e */
    void m56331e(@NotNull TradeSecurityScene tradeSecurityScene, @NotNull Fragment fragment, @NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull String str, @Nullable InterfaceC37277b interfaceC37277b, boolean z11, boolean z12, boolean z13, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Function0<Unit> function0, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function0<Unit> function3, @NotNull Function1<? super Throwable, Unit> function4);

    /* JADX INFO: renamed from: a */
    static Unit m56324a(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    static Unit m56328f() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    static Unit m56330h() {
        return Unit.INSTANCE;
    }
}
