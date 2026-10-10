package com.kubi.launch;

import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.StartupMinorTraceUtils;
import com.kubi.utils.DataMapUtil;
import kotlinx.coroutines.InterfaceC41709m0;
import p668un.C45280q;
import p668un.InterfaceC45268e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Reflection;
import ro.C44128b;

/* JADX INFO: compiled from: LauncherManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.LauncherManager$afterStart$2", m90122f = "LauncherManager.kt", m90123i = {0, 1, 1, 2, 2}, m90124l = {134, 139, 144}, m90125m = "invokeSuspend", m90126n = {"agreeProtocol", "launcher", "agreeProtocol", "launcher", "agreeProtocol"}, m90127s = {"Z$0", "L$0", "Z$0", "L$0", "Z$0"})
public final class LauncherManager$afterStart$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LauncherContext $context;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ LauncherManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LauncherManager$afterStart$2(LauncherContext launcherContext, LauncherManager launcherManager, Continuation<? super LauncherManager$afterStart$2> continuation) {
        super(2, continuation);
        this.$context = launcherContext;
        this.this$0 = launcherManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LauncherManager$afterStart$2(this.$context, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LauncherManager$afterStart$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ae A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:8:0x0015, B:15:0x002b, B:32:0x00ae, B:33:0x00b5, B:18:0x0032, B:25:0x005d, B:27:0x0065, B:36:0x00ca, B:21:0x0039), top: B:41:0x0009 }] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if (r9.m37433n(r4, r8) == r0) goto L35;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        ILauncher iLauncher;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        z11 = this.Z$0;
                        iLauncher = (ILauncher) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (z11) {
                            StartupMinorTraceUtils.f48182a.m58419b("agree_protocol");
                        }
                        LauncherManager launcherManager = this.this$0;
                        LauncherContext launcherContext = this.$context;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(iLauncher);
                        this.Z$0 = z11;
                        this.label = 3;
                    }
                } else {
                    z11 = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                }
                LauncherReport.f31812a.m37497b(this.$context);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            boolean zM66370a = DataMapUtil.f54245a.m66370a("AGREE_PROTOCOL", false);
            InterfaceC45268e interfaceC45268eM100077o = C45280q.f101804a.m100077o();
            BaseActivity f31802a = this.$context.getF31802a();
            this.Z$0 = zM66370a;
            this.label = 1;
            Object objMo14654a = interfaceC45268eM100077o.mo14654a(f31802a, this);
            if (objMo14654a != coroutine_suspended) {
                z11 = zM66370a;
                obj = objMo14654a;
            }
            return coroutine_suspended;
            if (((Boolean) obj).booleanValue()) {
                this.$context.getF31807f().m37505f(1);
                ILauncher iLauncherM37434p = this.this$0.m37434p(this.$context);
                C44128b.m97266j("SplashActivity", "from type " + Reflection.getOrCreateKotlinClass(iLauncherM37434p.getClass()).getSimpleName());
                LauncherContext launcherContext2 = this.$context;
                this.L$0 = SpillingKt.nullOutSpilledVariable(iLauncherM37434p);
                this.Z$0 = z11;
                this.label = 2;
                if (iLauncherM37434p.mo37438b(launcherContext2, this) != coroutine_suspended) {
                    iLauncher = iLauncherM37434p;
                    if (z11) {
                        StartupMinorTraceUtils.f48182a.m58419b("agree_protocol");
                    }
                    LauncherManager launcherManager2 = this.this$0;
                    LauncherContext launcherContext3 = this.$context;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(iLauncher);
                    this.Z$0 = z11;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            this.$context.getF31807f().m37505f(2);
            this.$context.getF31802a().finish();
            LauncherReport.f31812a.m37497b(this.$context);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            LauncherReport.f31812a.m37497b(this.$context);
            throw th2;
        }
    }
}
