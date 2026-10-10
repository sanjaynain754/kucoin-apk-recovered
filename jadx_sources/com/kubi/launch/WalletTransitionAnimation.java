package com.kubi.launch;

import android.view.ViewStub;
import com.kubi.app.facade.R$id;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.C45280q;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.kubi.launch.e0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/WalletTransitionAnimation;", "Lcom/kubi/launch/AnimationStrategy;", "toWallet", "", "<init>", "(Z)V", "showAnimation", "", "context", "Lcom/kubi/launch/LauncherContext;", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WalletTransitionAnimation implements AnimationStrategy {

    /* JADX INFO: renamed from: a */
    public final boolean f31788a;

    public WalletTransitionAnimation(boolean z11) {
        this.f31788a = z11;
    }

    @Override // com.kubi.launch.AnimationStrategy
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo37418a(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        ViewStub viewStub = (ViewStub) launcherContext.getF31802a().findViewById(R$id.stubSplash);
        if (viewStub == null) {
            return Unit.INSTANCE;
        }
        Object objMo66965h = C45280q.f101804a.m100079q().mo66965h(launcherContext.getF31802a(), viewStub, this.f31788a, continuation);
        if (objMo66965h == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objMo66965h;
        }
        return Unit.INSTANCE;
    }
}
