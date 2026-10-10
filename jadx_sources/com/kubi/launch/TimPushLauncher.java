package com.kubi.launch;

import android.content.Intent;
import com.kubi.sdk.timpush.TimPushService;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/launch/TimPushLauncher;", "Lcom/kubi/launch/Launcher;", "<init>", "()V", "match", "", "context", "Lcom/kubi/launch/LauncherContext;", InterfaceC33617e1.f69659h, "", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TimPushLauncher extends Launcher {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f31782a = new Companion(null);

    /* JADX INFO: compiled from: Launcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/launch/TimPushLauncher$Companion;", "", "<init>", "()V", "ACTION_TIM_URI_LAUNCHER", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.launch.ILauncher
    /* JADX INFO: renamed from: a */
    public boolean mo37437a(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Intrinsics.areEqual(context.m37486e().getAction(), "com.kubi.action.TIM_URI_LAUNCHER");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (m37479c(r2, r6, r0) == r1) goto L22;
     */
    @Override // com.kubi.launch.ILauncher
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo37438b(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        TimPushLauncher$launch$1 timPushLauncher$launch$1;
        LauncherContext launcherContext2;
        if (continuation instanceof TimPushLauncher$launch$1) {
            timPushLauncher$launch$1 = (TimPushLauncher$launch$1) continuation;
            int i11 = timPushLauncher$launch$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                timPushLauncher$launch$1.label = i11 - Integer.MIN_VALUE;
            } else {
                timPushLauncher$launch$1 = new TimPushLauncher$launch$1(this, continuation);
            }
        } else {
            timPushLauncher$launch$1 = new TimPushLauncher$launch$1(this, continuation);
        }
        Object objM58244b = timPushLauncher$launch$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = timPushLauncher$launch$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                launcherContext = (LauncherContext) timPushLauncher$launch$1.L$1;
                launcherContext2 = (LauncherContext) timPushLauncher$launch$1.L$0;
                ResultKt.throwOnFailure(objM58244b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM58244b);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM58244b);
        TimPushService timPushService = TimPushService.f48090a;
        Intent intentM37486e = launcherContext.m37486e();
        timPushLauncher$launch$1.L$0 = launcherContext;
        timPushLauncher$launch$1.L$1 = launcherContext;
        timPushLauncher$launch$1.label = 1;
        objM58244b = timPushService.m58244b(intentM37486e, timPushLauncher$launch$1);
        if (objM58244b != coroutine_suspended) {
            launcherContext2 = launcherContext;
        }
        return coroutine_suspended;
        launcherContext.m37494n((String) objM58244b);
        launcherContext2.getF31807f().m37506g(10);
        launcherContext2.m37488g().put("biz_source", "timpush");
        AnimationStrategy switchAnimationStrategy = new SwitchAnimationStrategy();
        timPushLauncher$launch$1.L$0 = SpillingKt.nullOutSpilledVariable(launcherContext2);
        timPushLauncher$launch$1.L$1 = null;
        timPushLauncher$launch$1.label = 2;
    }
}
