package com.kubi.home.main;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import kotlinx.coroutines.InterfaceC41709m0;
import p058cj.C4988a;
import p830zf.InterfaceC46824t;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$checkOnceAlert$2", m90122f = "HomeVM.kt", m90123i = {0, 0, 1, 1}, m90124l = {95, 103}, m90125m = "invokeSuspend", m90126n = {"$i$f$flavorTrue", "$i$a$-flavorTrue-HomeVM$checkOnceAlert$2$2", "$i$f$flavorTrue", "$i$a$-flavorTrue-HomeVM$checkOnceAlert$2$4"}, m90127s = {"I$0", "I$1", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nHomeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM$checkOnceAlert$2\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,292:1\n33#2:293\n17#2,2:294\n34#2,3:296\n33#2:299\n17#2,2:300\n34#2,3:302\n33#2:305\n17#2,2:306\n34#2,3:308\n*S KotlinDebug\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM$checkOnceAlert$2\n*L\n93#1:293\n93#1:294,2\n93#1:296,3\n101#1:299\n101#1:300,2\n101#1:302,3\n109#1:305\n109#1:306,2\n109#1:308,3\n*E\n"})
public final class HomeVM$checkOnceAlert$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $queryFreeDialog;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ HomeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVM$checkOnceAlert$2(HomeVM homeVM, Function0<Unit> function0, Continuation<? super HomeVM$checkOnceAlert$2> continuation) {
        super(2, continuation);
        this.this$0 = homeVM;
        this.$queryFreeDialog = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVM$checkOnceAlert$2(this.this$0, this.$queryFreeDialog, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeVM$checkOnceAlert$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r8 == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zM103156c;
        HomeVM homeVM;
        Object objM56186h;
        boolean zM103155b;
        Function0<Unit> function0;
        Object objM56186h2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean zM103154a = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C14635p0.f25787a.set(false);
                return Unit.INSTANCE;
            }
            function0 = this.$queryFreeDialog;
            objM56186h2 = Router.f46192a.m56186h(InterfaceC46824t.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h2 != null) {
                zM103154a = ((InterfaceC46824t) objM56186h2).m103154a();
            }
            if (zM103154a && function0 != null) {
                function0.invoke();
            }
            C14635p0.f25787a.set(false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C4988a.m5286a("checkOnceAlert start, isChecking=" + C14635p0.f25787a.get(), "HomeVM");
        if (C14635p0.f25787a.compareAndSet(false, true)) {
            HomeVM homeVM2 = this.this$0;
            Object objM56186h3 = Router.f46192a.m56186h(InterfaceC46824t.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h3 != null) {
                zM103156c = ((InterfaceC46824t) objM56186h3).m103156c();
            } else {
                zM103156c = true;
            }
            if (zM103156c) {
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = homeVM2.m29381D(this);
            } else {
                homeVM = this.this$0;
                objM56186h = Router.f46192a.m56186h(InterfaceC46824t.class, SiteInfoManager.f47913a.m58109c());
                if (objM56186h != null) {
                    zM103155b = ((InterfaceC46824t) objM56186h).m103155b();
                } else {
                    zM103155b = true;
                }
                if (zM103155b) {
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 2;
                    obj = homeVM.m29388x(this);
                }
                function0 = this.$queryFreeDialog;
                objM56186h2 = Router.f46192a.m56186h(InterfaceC46824t.class, SiteInfoManager.f47913a.m58109c());
                if (objM56186h2 != null) {
                    zM103154a = ((InterfaceC46824t) objM56186h2).m103154a();
                }
                if (zM103154a) {
                    function0.invoke();
                }
                C14635p0.f25787a.set(false);
            }
            return coroutine_suspended;
        }
        C4988a.m5286a("checkOnceAlert doing, isChecking=" + C14635p0.f25787a.get(), "HomeVM");
        return Unit.INSTANCE;
        if (((Boolean) obj).booleanValue()) {
            C14635p0.f25787a.set(false);
            return Unit.INSTANCE;
        }
        homeVM = this.this$0;
        objM56186h = Router.f46192a.m56186h(InterfaceC46824t.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zM103155b = ((InterfaceC46824t) objM56186h).m103155b();
        } else {
            zM103155b = true;
        }
        if (zM103155b) {
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 2;
            obj = homeVM.m29388x(this);
        }
        function0 = this.$queryFreeDialog;
        objM56186h2 = Router.f46192a.m56186h(InterfaceC46824t.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h2 != null) {
            zM103154a = ((InterfaceC46824t) objM56186h2).m103154a();
        }
        if (zM103154a) {
            function0.invoke();
        }
        C14635p0.f25787a.set(false);
        return Unit.INSTANCE;
    }
}
