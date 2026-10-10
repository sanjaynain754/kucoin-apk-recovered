package com.kubi.applet;

import androidx.fragment.app.FragmentActivity;
import com.kubi.sdk.applet.KCBaseProtocol;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.mode.AppMode;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: AppletService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.applet.AppletService$handleBack$1", m90122f = "AppletService.kt", m90123i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {538, 90, 91}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "url", "savedForwardUrl", "matchUrl", "$i$f$withLock", "$i$a$-withLock$default-AppletService$handleBack$1$1", "$this$withLock_u24default$iv", "url", "savedForwardUrl", "matchUrl", "$i$f$withLock", "$i$a$-withLock$default-AppletService$handleBack$1$1"}, m90127s = {"L$0", "I$0", "L$0", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nAppletService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppletService.kt\ncom/kubi/applet/AppletService$handleBack$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,532:1\n116#2,11:533\n*S KotlinDebug\n*F\n+ 1 AppletService.kt\ncom/kubi/applet/AppletService$handleBack$1\n*L\n74#1:533,11\n*E\n"})
public final class AppletService$handleBack$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function0<Unit> $backAction;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ AppletService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppletService$handleBack$1(AppletService appletService, FragmentActivity fragmentActivity, Function0<Unit> function0, Continuation<? super AppletService$handleBack$1> continuation) {
        super(2, continuation);
        this.this$0 = appletService;
        this.$activity = fragmentActivity;
        this.$backAction = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppletService$handleBack$1(this.this$0, this.$activity, this.$backAction, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppletService$handleBack$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012c A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:52:0x0124, B:54:0x012c, B:24:0x00a6, B:26:0x00ac, B:28:0x00b4, B:30:0x00b8, B:32:0x00c0, B:37:0x00d0, B:39:0x00e0, B:41:0x00e6, B:43:0x00ef, B:48:0x00f9), top: B:70:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x015f  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppletService appletService;
        FragmentActivity fragmentActivity;
        final Function0<Unit> function0;
        InterfaceC44082a interfaceC44082a;
        int i11;
        String strM15073p;
        String str;
        Object objM15059A;
        FragmentActivity fragmentActivity2;
        String str2;
        AppletService appletService2;
        Function0 function1;
        InterfaceC44082a interfaceC44082a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        InterfaceC44082a interfaceC44082a3 = null;
        int i13 = 0;
        try {
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC44082a interfaceC44082a4 = this.this$0.f16205c;
                    AppletService appletService3 = this.this$0;
                    FragmentActivity fragmentActivity3 = this.$activity;
                    Function0<Unit> function2 = this.$backAction;
                    this.L$0 = interfaceC44082a4;
                    this.L$1 = appletService3;
                    this.L$2 = fragmentActivity3;
                    this.L$3 = function2;
                    this.I$0 = 0;
                    this.label = 1;
                    if (interfaceC44082a4.mo91344d(null, this) != coroutine_suspended) {
                        appletService = appletService3;
                        fragmentActivity = fragmentActivity3;
                        function0 = function2;
                        interfaceC44082a = interfaceC44082a4;
                        i11 = 0;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        i13 = this.I$1;
                        i11 = this.I$0;
                        String str3 = (String) this.L$6;
                        strM15073p = (String) this.L$5;
                        str2 = (String) this.L$4;
                        function0 = (Function0) this.L$3;
                        FragmentActivity fragmentActivity4 = (FragmentActivity) this.L$2;
                        AppletService appletService4 = (AppletService) this.L$1;
                        InterfaceC44082a interfaceC44082a5 = (InterfaceC44082a) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            fragmentActivity2 = fragmentActivity4;
                            interfaceC44082a = interfaceC44082a5;
                            appletService2 = appletService4;
                            str = str3;
                            objM15059A = obj;
                            if (((Boolean) objM15059A).booleanValue()) {
                                String str4 = strM15073p;
                                function1 = new Function0() { // from class: com.kubi.applet.j
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AppletService$handleBack$1.m15084f(function0);
                                    }
                                };
                                this.L$0 = interfaceC44082a;
                                this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(str4);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(str);
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.I$0 = i11;
                                this.I$1 = i13;
                                this.label = 3;
                                if (AppletService.m15047J(appletService2, fragmentActivity2, str, false, function1, this, 4, null) != coroutine_suspended) {
                                    interfaceC44082a2 = interfaceC44082a;
                                }
                                return coroutine_suspended;
                            }
                            InterfaceC44082a interfaceC44082a6 = interfaceC44082a;
                            function0.invoke();
                            Unit unit = Unit.INSTANCE;
                            interfaceC44082a6.mo91345e(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC44082a3 = interfaceC44082a5;
                            interfaceC44082a3.mo91345e(null);
                            throw th;
                        }
                    }
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    interfaceC44082a2.mo91345e(null);
                    return unit2;
                }
                i11 = this.I$0;
                Function0<Unit> function3 = (Function0) this.L$3;
                fragmentActivity = (FragmentActivity) this.L$2;
                AppletService appletService5 = (AppletService) this.L$1;
                interfaceC44082a = (InterfaceC44082a) this.L$0;
                ResultKt.throwOnFailure(obj);
                appletService = appletService5;
                function0 = function3;
                if (appletService.m15074q() && !AppMode.INSTANCE.isLiteMode() && (fragmentActivity instanceof KCMiniAppBaseProtocol)) {
                    BackPressInterceptor backPressInterceptor = BackPressInterceptor.f16310a;
                    if (backPressInterceptor.m15087c(fragmentActivity)) {
                        backPressInterceptor.m15085a(fragmentActivity);
                        function0.invoke();
                        Unit unit3 = Unit.INSTANCE;
                        interfaceC44082a.mo91345e(null);
                        return unit3;
                    }
                    String strUrl = ((KCBaseProtocol) fragmentActivity).url();
                    if (((KCMiniAppBaseProtocol) fragmentActivity).supportAddHome() && strUrl.length() > 0) {
                        backPressInterceptor.m15088d(fragmentActivity);
                        strM15073p = appletService.m15073p(fragmentActivity);
                        str = (strM15073p == null || strM15073p.length() == 0) ? strUrl : strM15073p;
                        this.L$0 = interfaceC44082a;
                        this.L$1 = appletService;
                        this.L$2 = fragmentActivity;
                        this.L$3 = function0;
                        this.L$4 = SpillingKt.nullOutSpilledVariable(strUrl);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(strM15073p);
                        this.L$6 = str;
                        this.I$0 = i11;
                        this.I$1 = 0;
                        this.label = 2;
                        objM15059A = appletService.m15059A(str, "", this);
                        if (objM15059A != coroutine_suspended) {
                            AppletService appletService6 = appletService;
                            fragmentActivity2 = fragmentActivity;
                            str2 = strUrl;
                            appletService2 = appletService6;
                            if (((Boolean) objM15059A).booleanValue()) {
                                String str5 = strM15073p;
                                function1 = new Function0() { // from class: com.kubi.applet.j
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AppletService$handleBack$1.m15084f(function0);
                                    }
                                };
                                this.L$0 = interfaceC44082a;
                                this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(str5);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(str);
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.I$0 = i11;
                                this.I$1 = i13;
                                this.label = 3;
                                if (AppletService.m15047J(appletService2, fragmentActivity2, str, false, function1, this, 4, null) != coroutine_suspended) {
                                    interfaceC44082a2 = interfaceC44082a;
                                    Unit unit4 = Unit.INSTANCE;
                                    interfaceC44082a2.mo91345e(null);
                                    return unit4;
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                InterfaceC44082a interfaceC44082a7 = interfaceC44082a;
                function0.invoke();
                Unit unit5 = Unit.INSTANCE;
                interfaceC44082a7.mo91345e(null);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                interfaceC44082a3 = interfaceC44082a;
                interfaceC44082a3.mo91345e(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m15084f(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
