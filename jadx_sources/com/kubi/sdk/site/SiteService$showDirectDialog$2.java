package com.kubi.sdk.site;

import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$showDirectDialog$2", m90122f = "SiteService.kt", m90123i = {0, 0}, m90124l = {572}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$i$f$suspendCancellableCoroutine"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nSiteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService$showDirectDialog$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,571:1\n426#2,11:572\n*S KotlinDebug\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService$showDirectDialog$2\n*L\n314#1:572,11\n*E\n"})
public final class SiteService$showDirectDialog$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $targetSiteType;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteService$showDirectDialog$2(String str, Continuation<? super SiteService$showDirectDialog$2> continuation) {
        super(2, continuation);
        this.$targetSiteType = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SiteService$showDirectDialog$2 siteService$showDirectDialog$2 = new SiteService$showDirectDialog$2(this.$targetSiteType, continuation);
        siteService$showDirectDialog$2.L$0 = obj;
        return siteService$showDirectDialog$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$showDirectDialog$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$targetSiteType;
        this.L$0 = interfaceC41709m0;
        this.L$1 = str;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        C42899b.m94073c(new SiteService$showDirectDialog$2$1$1(str, c41716o, interfaceC41709m0));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return objM91171w == coroutine_suspended ? coroutine_suspended : objM91171w;
    }
}
