package com.kubi.p072ad.service;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashHockSPI$checkAd$1$5", m90122f = "SplashHockSPI.kt", m90123i = {0, 0, 1, 1}, m90124l = {132, 133}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "i", "$this$flow", "i"}, m90127s = {"L$0", "J$1", "L$0", "J$1"})
public final class SplashHockSPI$checkAd$1$5 extends SuspendLambda implements Function2<InterfaceC41635f<? super Long>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplashHockSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashHockSPI$checkAd$1$5(long j11, SplashHockSPI splashHockSPI, Continuation<? super SplashHockSPI$checkAd$1$5> continuation) {
        super(2, continuation);
        this.$duration = j11;
        this.this$0 = splashHockSPI;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashHockSPI$checkAd$1$5 splashHockSPI$checkAd$1$5 = new SplashHockSPI$checkAd$1$5(this.$duration, this.this$0, continuation);
        splashHockSPI$checkAd$1$5.L$0 = obj;
        return splashHockSPI$checkAd$1$5;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super Long> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((SplashHockSPI$checkAd$1$5) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (1 <= r7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r9 = (-1) + r7;
        r11 = r13.this$0.f14943d;
        r13.L$0 = r0;
        r13.J$0 = r9;
        r13.J$1 = r7;
        r13.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(r11, r13) != r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (1 > r7) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:19:0x005f). Please report as a decompilation issue!!! */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j11;
        InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            j11 = this.$duration;
        } else {
            if (i11 == 1) {
                j11 = this.J$1;
                long j12 = this.J$0;
                ResultKt.throwOnFailure(obj);
                Long lBoxLong = Boxing.boxLong(j11);
                this.L$0 = interfaceC41635f;
                this.J$0 = j12;
                this.J$1 = j11;
                this.label = 2;
                if (interfaceC41635f.emit(lBoxLong, this) != coroutine_suspended) {
                    j11 = j12;
                }
                return coroutine_suspended;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
