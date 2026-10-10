package com.kubi.widget.web.cookie;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: GrayCookieHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.GrayCookieHelper$updatedGray$2", m90122f = "GrayCookieHelper.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {145, 46}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-GrayCookieHelper$updatedGray$2$1"}, m90127s = {"L$0", "I$0", "L$0", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nGrayCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrayCookieHelper.kt\ncom/kubi/widget/web/cookie/GrayCookieHelper$updatedGray$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,139:1\n116#2,11:140\n*S KotlinDebug\n*F\n+ 1 GrayCookieHelper.kt\ncom/kubi/widget/web/cookie/GrayCookieHelper$updatedGray$2\n*L\n44#1:140,11\n*E\n"})
public final class GrayCookieHelper$updatedGray$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $force;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrayCookieHelper$updatedGray$2(boolean z11, Continuation<? super GrayCookieHelper$updatedGray$2> continuation) {
        super(2, continuation);
        this.$force = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GrayCookieHelper$updatedGray$2(this.$force, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GrayCookieHelper$updatedGray$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r3.m67106e(r7) == r0) goto L25;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC44082a interfaceC44082a;
        int i11;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            interfaceC44082a2.mo91345e(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC44082a2.mo91345e(null);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = interfaceC44082a3;
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.$force) {
                    GrayCookieHelper.f55063b.set(false);
                }
                interfaceC44082a = GrayCookieHelper.f55064c;
                this.L$0 = interfaceC44082a;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                    i11 = 0;
                }
                return coroutine_suspended;
            }
            if (!GrayCookieHelper.f55063b.get()) {
                GrayCookieHelper grayCookieHelper = GrayCookieHelper.f55062a;
                this.L$0 = interfaceC44082a;
                this.I$0 = i11;
                this.I$1 = 0;
                this.label = 2;
            }
            interfaceC44082a2 = interfaceC44082a;
            Unit unit2 = Unit.INSTANCE;
            interfaceC44082a2.mo91345e(null);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            interfaceC44082a2 = interfaceC44082a;
            th2 = th4;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }
}
