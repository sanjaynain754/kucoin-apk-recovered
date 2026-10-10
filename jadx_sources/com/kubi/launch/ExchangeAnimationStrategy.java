package com.kubi.launch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p668un.C45280q;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.launch.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/ExchangeAnimationStrategy;", "Lcom/kubi/launch/AnimationStrategy;", "speedUp", "", "<init>", "(Z)V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/ExchangeAnimationStrategy\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n57#2:316\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/ExchangeAnimationStrategy\n*L\n119#1:315\n124#1:316\n*E\n"})
public final class ExchangeAnimationStrategy implements AnimationStrategy {

    /* JADX INFO: renamed from: a */
    public final boolean f31787a;

    public ExchangeAnimationStrategy(boolean z11) {
        this.f31787a = z11;
    }

    public /* synthetic */ ExchangeAnimationStrategy(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }

    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        if (!launcherContext.m37485d()) {
            launcherContext.getF31807f().m37507h(1);
            Object objMo37418a = new DefaultAnimation(this.f31787a).mo37418a(launcherContext, continuation);
            if (objMo37418a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objMo37418a;
            }
            return Unit.INSTANCE;
        }
        C45280q c45280q = C45280q.f101804a;
        if (c45280q.m100079q().mo66959b() && c45280q.m100079q().mo66958a()) {
            launcherContext.getF31807f().m37507h(3);
            launcherContext.m37493m(true);
            C43840a.m96552g("当前不是交易所 显示动画+清理栈", "AnimationStrategy");
            Object objMo37418a2 = new WalletTransitionAnimation(false).mo37418a(launcherContext, continuation);
            if (objMo37418a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objMo37418a2;
            }
            return Unit.INSTANCE;
        }
        launcherContext.getF31807f().m37507h(2);
        return Unit.INSTANCE;
    }
}
