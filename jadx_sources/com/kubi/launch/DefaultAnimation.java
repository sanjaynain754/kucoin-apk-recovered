package com.kubi.launch;

import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.launch.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/DefaultAnimation;", "Lcom/kubi/launch/AnimationStrategy;", "speedUp", "", "<init>", "(Z)V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/DefaultAnimation\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/DefaultAnimation\n*L\n67#1:315\n*E\n"})
public final class DefaultAnimation implements AnimationStrategy {

    /* JADX INFO: renamed from: a */
    public final boolean f31785a;

    public DefaultAnimation(boolean z11) {
        this.f31785a = z11;
    }

    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        int iM37444d = C17351c.m37444d();
        if (iM37444d > 0) {
            ViewExtKt.m66577h(launcherContext.m37491j());
            Object objMo37418a = new LottieAnimation(iM37444d, this.f31785a).mo37418a(launcherContext, continuation);
            if (objMo37418a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objMo37418a;
            }
            return Unit.INSTANCE;
        }
        ViewExtKt.m66594y(launcherContext.m37491j());
        return Unit.INSTANCE;
    }
}
