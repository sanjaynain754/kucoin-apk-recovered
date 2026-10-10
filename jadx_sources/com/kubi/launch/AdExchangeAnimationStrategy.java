package com.kubi.launch;

import android.view.ViewStub;
import com.kubi.app.facade.R$id;
import com.kubi.sdk.util.StartupTrace;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/AdExchangeAnimationStrategy;", "Lcom/kubi/launch/AnimationStrategy;", "skip", "", "<init>", "(Z)V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/AdExchangeAnimationStrategy\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n57#2:316\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/AdExchangeAnimationStrategy\n*L\n140#1:315\n158#1:316\n*E\n"})
public final class AdExchangeAnimationStrategy implements AnimationStrategy {

    /* JADX INFO: renamed from: a */
    public final boolean f31775a;

    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (r2.mo37418a(r13, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
    
        if (r3.mo37418a(r13, r0) == r1) goto L40;
     */
    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        AdExchangeAnimationStrategy$showAnimation$1 adExchangeAnimationStrategy$showAnimation$1;
        ViewStub viewStub;
        Object objM91049g;
        Pair pair;
        if (continuation instanceof AdExchangeAnimationStrategy$showAnimation$1) {
            adExchangeAnimationStrategy$showAnimation$1 = (AdExchangeAnimationStrategy$showAnimation$1) continuation;
            int i11 = adExchangeAnimationStrategy$showAnimation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                adExchangeAnimationStrategy$showAnimation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                adExchangeAnimationStrategy$showAnimation$1 = new AdExchangeAnimationStrategy$showAnimation$1(this, continuation);
            }
        } else {
            adExchangeAnimationStrategy$showAnimation$1 = new AdExchangeAnimationStrategy$showAnimation$1(this, continuation);
        }
        Object obj = adExchangeAnimationStrategy$showAnimation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = adExchangeAnimationStrategy$showAnimation$1.label;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z11 = false;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            viewStub = (ViewStub) launcherContext.getF31802a().findViewById(R$id.stubSplash);
            if (viewStub == null) {
                launcherContext.getF31807f().m37507h(10);
                if (!this.f31775a) {
                    ExchangeAnimationStrategy exchangeAnimationStrategy = new ExchangeAnimationStrategy(z11, i13, defaultConstructorMarker);
                    adExchangeAnimationStrategy$showAnimation$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext);
                    adExchangeAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(viewStub);
                    adExchangeAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(launcherContext);
                    adExchangeAnimationStrategy$showAnimation$1.L$3 = SpillingKt.nullOutSpilledVariable(exchangeAnimationStrategy);
                    adExchangeAnimationStrategy$showAnimation$1.I$0 = 0;
                    adExchangeAnimationStrategy$showAnimation$1.label = 1;
                }
                return Unit.INSTANCE;
            }
            CoroutineContext coroutineContext = launcherContext.m37487f().getF26335b();
            AdExchangeAnimationStrategy$showAnimation$adResult$1 adExchangeAnimationStrategy$showAnimation$adResult$1 = new AdExchangeAnimationStrategy$showAnimation$adResult$1(launcherContext, viewStub, null);
            adExchangeAnimationStrategy$showAnimation$1.L$0 = launcherContext;
            adExchangeAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(viewStub);
            adExchangeAnimationStrategy$showAnimation$1.label = 2;
            objM91049g = C41686h.m91049g(coroutineContext, adExchangeAnimationStrategy$showAnimation$adResult$1, adExchangeAnimationStrategy$showAnimation$1);
            if (objM91049g != coroutine_suspended) {
                pair = (Pair) objM91049g;
                StartupTrace.f48194a.m58459s(((Boolean) pair.getFirst()).booleanValue());
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    if (((CharSequence) pair.getSecond()).length() > 0) {
                        launcherContext.m37494n((String) pair.getSecond());
                    }
                    launcherContext.getF31807f().m37507h(20);
                } else if (!this.f31775a) {
                    launcherContext.getF31807f().m37507h(10);
                    C43840a.m96550d("checkAdAsync=none", "AnimationStrategy");
                    ExchangeAnimationStrategy exchangeAnimationStrategy2 = new ExchangeAnimationStrategy(z11, i13, defaultConstructorMarker);
                    adExchangeAnimationStrategy$showAnimation$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext);
                    adExchangeAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(viewStub);
                    adExchangeAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(pair);
                    adExchangeAnimationStrategy$showAnimation$1.L$3 = SpillingKt.nullOutSpilledVariable(launcherContext);
                    adExchangeAnimationStrategy$showAnimation$1.L$4 = SpillingKt.nullOutSpilledVariable(exchangeAnimationStrategy2);
                    adExchangeAnimationStrategy$showAnimation$1.I$0 = 0;
                    adExchangeAnimationStrategy$showAnimation$1.label = 3;
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        if (i12 == 2) {
            ViewStub viewStub2 = (ViewStub) adExchangeAnimationStrategy$showAnimation$1.L$1;
            LauncherContext launcherContext2 = (LauncherContext) adExchangeAnimationStrategy$showAnimation$1.L$0;
            ResultKt.throwOnFailure(obj);
            viewStub = viewStub2;
            launcherContext = launcherContext2;
            objM91049g = obj;
            pair = (Pair) objM91049g;
            StartupTrace.f48194a.m58459s(((Boolean) pair.getFirst()).booleanValue());
            if (((Boolean) pair.getFirst()).booleanValue()) {
                if (((CharSequence) pair.getSecond()).length() > 0) {
                    launcherContext.m37494n((String) pair.getSecond());
                }
                launcherContext.getF31807f().m37507h(20);
            } else if (!this.f31775a) {
                launcherContext.getF31807f().m37507h(10);
                C43840a.m96550d("checkAdAsync=none", "AnimationStrategy");
                ExchangeAnimationStrategy exchangeAnimationStrategy3 = new ExchangeAnimationStrategy(z11, i13, defaultConstructorMarker);
                adExchangeAnimationStrategy$showAnimation$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext);
                adExchangeAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(viewStub);
                adExchangeAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(pair);
                adExchangeAnimationStrategy$showAnimation$1.L$3 = SpillingKt.nullOutSpilledVariable(launcherContext);
                adExchangeAnimationStrategy$showAnimation$1.L$4 = SpillingKt.nullOutSpilledVariable(exchangeAnimationStrategy3);
                adExchangeAnimationStrategy$showAnimation$1.I$0 = 0;
                adExchangeAnimationStrategy$showAnimation$1.label = 3;
            }
            return Unit.INSTANCE;
        }
        if (i12 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }

    public AdExchangeAnimationStrategy(boolean z11) {
        this.f31775a = z11;
    }
}
