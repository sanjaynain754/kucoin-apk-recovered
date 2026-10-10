package com.kubi.launch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.kubi.launch.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/launch/Launcher;", "Lcom/kubi/launch/ILauncher;", "<init>", "()V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "animationStrategy", "Lcom/kubi/launch/AnimationStrategy;", "showAnimation$LAppFacade_googleRelease", "(Lcom/kubi/launch/LauncherContext;Lcom/kubi/launch/AnimationStrategy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class Launcher implements ILauncher {
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m37479c(@NotNull LauncherContext launcherContext, @NotNull AnimationStrategy animationStrategy, @NotNull Continuation<? super Unit> continuation) {
        Object objMo37418a = animationStrategy.mo37418a(launcherContext, continuation);
        if (objMo37418a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objMo37418a;
        }
        return Unit.INSTANCE;
    }
}
