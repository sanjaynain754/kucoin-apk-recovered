package com.kubi.p072ad.service;

import android.widget.TextView;
import com.kubi.app.p073ad.R$string;
import com.kubi.sdk.BaseActivity;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashHockSPI$checkAd$1$7", m90122f = "SplashHockSPI.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SplashHockSPI$checkAd$1$7 extends SuspendLambda implements Function2<InterfaceC41635f<? super Long>, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ long $duration;
    int label;
    final /* synthetic */ SplashHockSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashHockSPI$checkAd$1$7(SplashHockSPI splashHockSPI, BaseActivity baseActivity, long j11, Continuation<? super SplashHockSPI$checkAd$1$7> continuation) {
        super(2, continuation);
        this.this$0 = splashHockSPI;
        this.$activity = baseActivity;
        this.$duration = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashHockSPI$checkAd$1$7(this.this$0, this.$activity, this.$duration, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super Long> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((SplashHockSPI$checkAd$1$7) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TextView textView = this.this$0.f14941b;
            if (textView != null) {
                BaseActivity baseActivity = this.$activity;
                int i11 = R$string.skip_stub;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.$duration);
                sb2.append('S');
                textView.setText(baseActivity.getString(i11, sb2.toString()));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
