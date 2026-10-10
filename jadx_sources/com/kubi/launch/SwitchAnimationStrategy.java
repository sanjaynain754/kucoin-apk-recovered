package com.kubi.launch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.C45280q;
import p668un.InterfaceC45271h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.launch.a0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/launch/SwitchAnimationStrategy;", "Lcom/kubi/launch/AnimationStrategy;", "<init>", "()V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/SwitchAnimationStrategy\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n57#2:316\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/SwitchAnimationStrategy\n*L\n274#1:315\n280#1:316\n*E\n"})
public final class SwitchAnimationStrategy implements AnimationStrategy {
    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        boolean zMo66959b;
        String f31803b = launcherContext.getF31803b();
        InterfaceC45271h interfaceC45271hM100079q = C45280q.f101804a.m100079q();
        if (f31803b != null && f31803b.length() != 0) {
            zMo66959b = interfaceC45271hM100079q.mo66962e(f31803b);
        } else {
            zMo66959b = interfaceC45271hM100079q.mo66959b();
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 1;
        boolean z11 = false;
        if (zMo66959b) {
            launcherContext.getF31807f().m37507h(200);
            Object objMo37418a = new WalletAnimationStrategy(z11, i11, defaultConstructorMarker).mo37418a(launcherContext, continuation);
            if (objMo37418a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objMo37418a;
            }
            return Unit.INSTANCE;
        }
        launcherContext.getF31807f().m37507h(100);
        Object objMo37418a2 = new ExchangeAnimationStrategy(z11, i11, defaultConstructorMarker).mo37418a(launcherContext, continuation);
        if (objMo37418a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objMo37418a2;
        }
        return Unit.INSTANCE;
    }
}
