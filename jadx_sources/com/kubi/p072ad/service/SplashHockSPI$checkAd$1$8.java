package com.kubi.p072ad.service;

import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.startup.StartupDispatcher;
import com.kubi.utils.extensions.C27023a;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashHockSPI$checkAd$1$8", m90122f = "SplashHockSPI.kt", m90123i = {0}, m90124l = {156}, m90125m = "invokeSuspend", m90126n = {"taskState"}, m90127s = {"I$0"})
public final class SplashHockSPI$checkAd$1$8 extends SuspendLambda implements Function3<InterfaceC41635f<? super Long>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ ResAdEntity $ad;
    final /* synthetic */ ImageView $ivAd;
    final /* synthetic */ Function1<Pair<Boolean, String>, Unit> $onFinish;
    int I$0;
    int label;
    final /* synthetic */ SplashHockSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplashHockSPI$checkAd$1$8(SplashHockSPI splashHockSPI, ImageView imageView, Function1<? super Pair<Boolean, String>, Unit> function1, BaseActivity baseActivity, ResAdEntity resAdEntity, Continuation<? super SplashHockSPI$checkAd$1$8> continuation) {
        super(3, continuation);
        this.this$0 = splashHockSPI;
        this.$ivAd = imageView;
        this.$onFinish = function1;
        this.$activity = baseActivity;
        this.$ad = resAdEntity;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super Long> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return new SplashHockSPI$checkAd$1$8(this.this$0, this.$ivAd, this.$onFinish, this.$activity, this.$ad, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            int state = StartupDispatcher.INSTANCE.getState();
            if (!this.this$0.f14942c) {
                JSONObject jSONObject = new JSONObject();
                ResAdEntity resAdEntity = this.$ad;
                jSONObject.put("postTitle", resAdEntity.getTitle());
                jSONObject.put("optionKey", resAdEntity.getLanguage());
                jSONObject.put("url", resAdEntity.getUrl());
                jSONObject.put("clickPosition", "auto");
                jSONObject.put("state", state);
                jSONObject.put("norm_version", "1");
                Unit unit = Unit.INSTANCE;
                C27023a.m66555b("BTsplashPage", "startupAds", null, jSONObject, 4, null);
            }
            TextView textView = this.this$0.f14941b;
            if (textView != null) {
                textView.setEnabled(false);
            }
            ImageView imageView = this.$ivAd;
            if (imageView != null) {
                imageView.setEnabled(false);
            }
            this.$onFinish.invoke(new Pair<>(Boxing.boxBoolean(true), ""));
            if (!this.this$0.f14942c) {
                long j11 = this.this$0.f14943d;
                this.I$0 = state;
                this.label = 1;
                if (DelayKt.m90350b(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        this.this$0.m14691l(this.$activity);
        return Unit.INSTANCE;
    }
}
