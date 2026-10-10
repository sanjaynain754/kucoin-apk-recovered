package com.kubi.p072ad.service;

import android.widget.TextView;
import com.kubi.app.p073ad.R$string;
import com.kubi.sdk.BaseActivity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashHockSPI$checkAd$1$6", m90122f = "SplashHockSPI.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SplashHockSPI$checkAd$1$6 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ SplashHockSPI this$0;

    public final Object invoke(long j11, Continuation<? super Unit> continuation) {
        return ((SplashHockSPI$checkAd$1$6) create(Long.valueOf(j11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashHockSPI$checkAd$1$6(SplashHockSPI splashHockSPI, BaseActivity baseActivity, Continuation<? super SplashHockSPI$checkAd$1$6> continuation) {
        super(2, continuation);
        this.this$0 = splashHockSPI;
        this.$activity = baseActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashHockSPI$checkAd$1$6 splashHockSPI$checkAd$1$6 = new SplashHockSPI$checkAd$1$6(this.this$0, this.$activity, continuation);
        splashHockSPI$checkAd$1$6.J$0 = ((Number) obj).longValue();
        return splashHockSPI$checkAd$1$6;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l11, Continuation<? super Unit> continuation) {
        return invoke(l11.longValue(), continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j11 = this.J$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97259c("StartupDispatcher", "SplashActivity flow emit " + j11);
        TextView textView = this.this$0.f14941b;
        if (textView != null) {
            BaseActivity baseActivity = this.$activity;
            int i11 = R$string.skip_stub;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j11);
            sb2.append('S');
            textView.setText(baseActivity.getString(i11, sb2.toString()));
        }
        return Unit.INSTANCE;
    }
}
