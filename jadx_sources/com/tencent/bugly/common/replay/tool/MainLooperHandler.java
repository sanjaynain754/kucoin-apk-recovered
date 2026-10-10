package com.tencent.bugly.common.replay.tool;

import android.os.Handler;
import android.os.Looper;
import com.tencent.bugly.common.replay.tool.MainLooperHandler;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;", "", InterfaceC33617e1.f69652a, "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "post", "", "runnable", "Lkotlin/Function0;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class MainLooperHandler {

    @NotNull
    private final Handler handler;

    /* JADX WARN: Multi-variable type inference failed */
    public MainLooperHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MainLooperHandler(@NotNull Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.handler = new Handler(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: post$lambda-0, reason: not valid java name */
    public static final void m103818post$lambda0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    public final void post(@NotNull final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.handler.post(new Runnable() { // from class: cc0.c
            @Override // java.lang.Runnable
            public final void run() {
                MainLooperHandler.m103818post$lambda0(runnable);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MainLooperHandler(Looper looper, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
        }
        this(looper);
    }
}
