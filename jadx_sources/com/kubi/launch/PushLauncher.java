package com.kubi.launch;

import android.content.Intent;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p830zf.InterfaceC46801h0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.launch.w, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/PushLauncher;", "Lcom/kubi/launch/Launcher;", "<init>", "()V", "match", "", "context", "Lcom/kubi/launch/LauncherContext;", InterfaceC33617e1.f69659h, "", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Launcher.kt\ncom/kubi/launch/PushLauncher\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,273:1\n17#2,2:274\n*S KotlinDebug\n*F\n+ 1 Launcher.kt\ncom/kubi/launch/PushLauncher\n*L\n178#1:274,2\n*E\n"})
public final class PushLauncher extends Launcher {
    @Override // com.kubi.launch.ILauncher
    /* JADX INFO: renamed from: a */
    public boolean mo37437a(@NotNull LauncherContext context) {
        String strM103134e;
        Intrinsics.checkNotNullParameter(context, "context");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46801h0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strM103134e = ((InterfaceC46801h0) objM56186h).m103134e()) == null) {
            strM103134e = "com.kubi.kucoin.URI_LAUNCHER";
        }
        Intent intentM37486e = context.m37486e();
        return StringsKt.equals$default(intentM37486e.getAction(), strM103134e, false, 2, null) || StringsKt.equals$default(intentM37486e.getAction(), "action_uri_jpush", false, 2, null);
    }

    @Override // com.kubi.launch.ILauncher
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo37438b(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        launcherContext.m37494n(UriJumpHelper.f31783a.m37439a(launcherContext.getF31802a()));
        launcherContext.getF31807f().m37506g(2);
        launcherContext.m37488g().put("biz_source", "push");
        Object objM37479c = m37479c(launcherContext, new SwitchAnimationStrategy(), continuation);
        return objM37479c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM37479c : Unit.INSTANCE;
    }
}
