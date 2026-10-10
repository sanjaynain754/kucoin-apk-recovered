package com.kubi.launch;

import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38058b;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/launch/BizControlAnimationStrategy;", "Lcom/kubi/launch/AnimationStrategy;", "<init>", "()V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/BizControlAnimationStrategy\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n57#2:316\n57#2:317\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/BizControlAnimationStrategy\n*L\n170#1:315\n176#1:316\n185#1:317\n*E\n"})
public final class BizControlAnimationStrategy implements AnimationStrategy {
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
    
        if (r2.mo37418a(r9, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
    
        if (r10.mo37418a(r9, r0) == r1) goto L36;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00e3, please report this as an issue */
    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        BizControlAnimationStrategy$showAnimation$1 bizControlAnimationStrategy$showAnimation$1;
        BizControlConfigState bizControlConfigStateM85935g;
        if (continuation instanceof BizControlAnimationStrategy$showAnimation$1) {
            bizControlAnimationStrategy$showAnimation$1 = (BizControlAnimationStrategy$showAnimation$1) continuation;
            int i11 = bizControlAnimationStrategy$showAnimation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bizControlAnimationStrategy$showAnimation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bizControlAnimationStrategy$showAnimation$1 = new BizControlAnimationStrategy$showAnimation$1(this, continuation);
            }
        } else {
            bizControlAnimationStrategy$showAnimation$1 = new BizControlAnimationStrategy$showAnimation$1(this, continuation);
        }
        Object obj = bizControlAnimationStrategy$showAnimation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bizControlAnimationStrategy$showAnimation$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                launcherContext = (LauncherContext) bizControlAnimationStrategy$showAnimation$1.L$0;
                ResultKt.throwOnFailure(obj);
                bizControlConfigStateM85935g = C38058b.f85672a.m85935g();
                if (bizControlConfigStateM85935g == BizControlConfigState.SUCCESS) {
                    launcherContext.getF31807f().m37507h(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY);
                    C43840a.m96552g("BizControlManager state=" + bizControlConfigStateM85935g, "AnimationStrategy");
                    return Unit.INSTANCE;
                }
                launcherContext.getF31807f().m37507h(3000);
                AdExchangeAnimationStrategy adExchangeAnimationStrategy = new AdExchangeAnimationStrategy(true);
                bizControlAnimationStrategy$showAnimation$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext);
                bizControlAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(bizControlConfigStateM85935g);
                bizControlAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(launcherContext);
                bizControlAnimationStrategy$showAnimation$1.L$3 = SpillingKt.nullOutSpilledVariable(adExchangeAnimationStrategy);
                bizControlAnimationStrategy$showAnimation$1.I$0 = 0;
                bizControlAnimationStrategy$showAnimation$1.label = 2;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C38058b c38058b = C38058b.f85672a;
        if (c38058b.m85935g() == BizControlConfigState.SUCCESS || !c38058b.m85937i()) {
            launcherContext.getF31807f().m37507h(1000);
            AdExchangeAnimationStrategy adExchangeAnimationStrategy2 = new AdExchangeAnimationStrategy(false);
            bizControlAnimationStrategy$showAnimation$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext);
            bizControlAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(launcherContext);
            bizControlAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(adExchangeAnimationStrategy2);
            bizControlAnimationStrategy$showAnimation$1.I$0 = 0;
            bizControlAnimationStrategy$showAnimation$1.label = 3;
        } else {
            launcherContext.getF31807f().m37507h(2000);
            ExchangeAnimationStrategy exchangeAnimationStrategy = new ExchangeAnimationStrategy(true);
            bizControlAnimationStrategy$showAnimation$1.L$0 = launcherContext;
            bizControlAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(launcherContext);
            bizControlAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(exchangeAnimationStrategy);
            bizControlAnimationStrategy$showAnimation$1.I$0 = 0;
            bizControlAnimationStrategy$showAnimation$1.label = 1;
            if (exchangeAnimationStrategy.mo37418a(launcherContext, bizControlAnimationStrategy$showAnimation$1) != coroutine_suspended) {
                bizControlConfigStateM85935g = C38058b.f85672a.m85935g();
                if (bizControlConfigStateM85935g == BizControlConfigState.SUCCESS) {
                    launcherContext.getF31807f().m37507h(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY);
                    C43840a.m96552g("BizControlManager state=" + bizControlConfigStateM85935g, "AnimationStrategy");
                    return Unit.INSTANCE;
                }
                launcherContext.getF31807f().m37507h(3000);
                AdExchangeAnimationStrategy adExchangeAnimationStrategy3 = new AdExchangeAnimationStrategy(true);
                bizControlAnimationStrategy$showAnimation$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext);
                bizControlAnimationStrategy$showAnimation$1.L$1 = SpillingKt.nullOutSpilledVariable(bizControlConfigStateM85935g);
                bizControlAnimationStrategy$showAnimation$1.L$2 = SpillingKt.nullOutSpilledVariable(launcherContext);
                bizControlAnimationStrategy$showAnimation$1.L$3 = SpillingKt.nullOutSpilledVariable(adExchangeAnimationStrategy3);
                bizControlAnimationStrategy$showAnimation$1.I$0 = 0;
                bizControlAnimationStrategy$showAnimation$1.label = 2;
            }
        }
        return coroutine_suspended;
    }
}
