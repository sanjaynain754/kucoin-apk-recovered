package com.kubi.p072ad.service;

import android.view.ViewStub;
import com.kubi.sdk.BaseActivity;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Pair;", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashHockSPI$checkAdAsync$2", m90122f = "SplashHockSPI.kt", m90123i = {0}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {"$this$callbackFlow"}, m90127s = {"L$0"})
public final class SplashHockSPI$checkAdAsync$2 extends SuspendLambda implements Function2<InterfaceC41574m<? super Pair<? extends Boolean, ? extends String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ ViewStub $stubSplash;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplashHockSPI this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41574m<? super Pair<? extends Boolean, ? extends String>> interfaceC41574m, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41574m<? super Pair<Boolean, String>>) interfaceC41574m, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashHockSPI$checkAdAsync$2(SplashHockSPI splashHockSPI, BaseActivity baseActivity, ViewStub viewStub, Continuation<? super SplashHockSPI$checkAdAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = splashHockSPI;
        this.$activity = baseActivity;
        this.$stubSplash = viewStub;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m14695h() {
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashHockSPI$checkAdAsync$2 splashHockSPI$checkAdAsync$2 = new SplashHockSPI$checkAdAsync$2(this.this$0, this.$activity, this.$stubSplash, continuation);
        splashHockSPI$checkAdAsync$2.L$0 = obj;
        return splashHockSPI$checkAdAsync$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41574m<? super Pair<Boolean, String>> interfaceC41574m, Continuation<? super Unit> continuation) {
        return ((SplashHockSPI$checkAdAsync$2) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m14690i(this.$activity, this.$stubSplash, new Function1() { // from class: com.kubi.ad.service.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SplashHockSPI$checkAdAsync$2.m14694g(interfaceC41574m, (Pair) obj2);
                }
            });
            Function0 function0 = new Function0() { // from class: com.kubi.ad.service.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SplashHockSPI$checkAdAsync$2.m14695h();
                }
            };
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
            this.label = 1;
            if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m14694g(InterfaceC41574m interfaceC41574m, Pair pair) {
        interfaceC41574m.mo90594e(pair);
        return Unit.INSTANCE;
    }
}
