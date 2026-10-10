package com.kubi.launch;

import com.tencent.bugly.proguard.InterfaceC33617e1;
import kotlinx.coroutines.C41713n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.C45280q;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/OneLinkLauncher;", "Lcom/kubi/launch/Launcher;", "<init>", "()V", "match", "", "context", "Lcom/kubi/launch/LauncherContext;", InterfaceC33617e1.f69659h, "", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OneLinkLauncher extends Launcher {
    @Override // com.kubi.launch.ILauncher
    /* JADX INFO: renamed from: a */
    public boolean mo37437a(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C45280q.f101804a.m100075m().mo14808a(context.m37486e());
    }

    @Override // com.kubi.launch.ILauncher
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo37438b(@NotNull LauncherContext launcherContext, @NotNull Continuation<? super Unit> continuation) {
        Object objM91130f = C41713n0.m91130f(new OneLinkLauncher$launch$2(launcherContext, this, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }
}
