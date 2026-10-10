package com.tencent.bugly.common.looper;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.common.looper.FrameManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33549ah;
import com.tencent.bugly.proguard.C33723j2;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, m90084d2 = {"Lcom/tencent/bugly/common/looper/FrameManager;", "Landroid/view/Choreographer$FrameCallback;", "", "checkAndStart", "checkAndStop", "Lcom/tencent/bugly/common/looper/IFrame;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "register", "unRegister", "", "isInitSuccess", "init", "", "frameTimeNanos", "doFrame", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "callbackList", "Ljava/util/HashSet;", "Lcom/tencent/bugly/proguard/j2;", "choreographer", "Lcom/tencent/bugly/proguard/j2;", "isStart", "Z", "isInit", "<init>", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
@SuppressLint({"NewApi"})
public final class FrameManager implements Choreographer.FrameCallback {

    @NotNull
    private static final String TAG = "RMonitor_looper_FrameManager";

    @NotNull
    private final HashSet<IFrame> callbackList = new HashSet<>();

    @Nullable
    private C33723j2 choreographer;
    private boolean isInit;
    private boolean isStart;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FrameManager frameManager = new FrameManager();

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/tencent/bugly/common/looper/FrameManager$Companion;", "", "()V", "TAG", "", "frameManager", "Lcom/tencent/bugly/common/looper/FrameManager;", "handler", "Landroid/os/Handler;", "clearForTest", "", "getFrameManagerForUnitTest", "init", "isInit", "", "isStart", "register", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/tencent/bugly/common/looper/IFrame;", "unRegister", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: register$lambda-2, reason: not valid java name */
        public static final void m103806register$lambda2(IFrame listener) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            FrameManager.frameManager.register(listener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: unRegister$lambda-3, reason: not valid java name */
        public static final void m103807unRegister$lambda3(IFrame listener) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            FrameManager.frameManager.unRegister(listener);
        }

        public final void register(@NotNull final IFrame listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (C33549ah.m72371a(Looper.getMainLooper())) {
                FrameManager.frameManager.register(listener);
            } else {
                FrameManager.handler.post(new Runnable() { // from class: bc0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameManager.Companion.m103806register$lambda2(listener);
                    }
                });
            }
        }

        public final void unRegister(@NotNull final IFrame listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (C33549ah.m72371a(Looper.getMainLooper())) {
                FrameManager.frameManager.unRegister(listener);
            } else {
                FrameManager.handler.post(new Runnable() { // from class: bc0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameManager.Companion.m103807unRegister$lambda3(listener);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: clearForTest$lambda-0, reason: not valid java name */
        public static final void m103804clearForTest$lambda0() {
            FrameManager.frameManager.callbackList.clear();
            FrameManager.frameManager.checkAndStop();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
        public static final void m103805init$lambda1() {
            FrameManager.frameManager.init();
        }

        public final void clearForTest() {
            if (C33549ah.m72371a(Looper.getMainLooper())) {
                FrameManager.frameManager.callbackList.clear();
                FrameManager.frameManager.checkAndStop();
            } else {
                FrameManager.handler.post(new Runnable() { // from class: bc0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameManager.Companion.m103804clearForTest$lambda0();
                    }
                });
            }
        }

        @NotNull
        public final FrameManager getFrameManagerForUnitTest() {
            return FrameManager.frameManager;
        }

        public final void init() {
            if (C33549ah.m72371a(Looper.getMainLooper())) {
                FrameManager.frameManager.init();
            } else {
                FrameManager.handler.post(new Runnable() { // from class: bc0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameManager.Companion.m103805init$lambda1();
                    }
                });
            }
        }

        public final boolean isInit() {
            return FrameManager.frameManager.isInit;
        }

        public final boolean isStart() {
            return FrameManager.frameManager.isStart;
        }
    }

    private final void checkAndStart() {
        if (this.isStart || this.callbackList.size() == 0) {
            return;
        }
        if (!this.isInit) {
            init();
        }
        C33723j2 c33723j2 = this.choreographer;
        if (c33723j2 != null) {
            this.isStart = true;
            c33723j2.m73457a(this);
            Logger.INSTANCE.mo77130d(TAG, "checkAndStart");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndStop() {
        if (!this.isStart || this.callbackList.size() > 0) {
            return;
        }
        this.isStart = false;
        C33723j2 c33723j2 = this.choreographer;
        if (c33723j2 != null) {
            c33723j2.m73459b(this);
        }
        Logger.INSTANCE.mo77130d(TAG, "checkAndStop");
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        C33723j2 c33723j2;
        for (IFrame iFrame : this.callbackList) {
            if (iFrame.isOpen()) {
                iFrame.doFrame(frameTimeNanos);
            }
        }
        if (!this.isStart || (c33723j2 = this.choreographer) == null) {
            return;
        }
        c33723j2.m73457a(this);
    }

    public final void init() {
        if (this.isInit) {
            return;
        }
        if (AndroidVersion.INSTANCE.isOverJellyBean()) {
            try {
                this.choreographer = new C33723j2();
                Logger.INSTANCE.mo77132i(TAG, "init choreographer success.");
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(TAG, "init choreographer error.", th2);
            }
        } else {
            Logger.INSTANCE.mo77132i(TAG, "init choreographer build version is low.");
        }
        this.isInit = true;
    }

    public final boolean isInitSuccess() {
        return this.choreographer != null;
    }

    public final void register(@NotNull IFrame listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callbackList.add(listener);
        checkAndStart();
    }

    public final void unRegister(@NotNull IFrame listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callbackList.remove(listener);
        checkAndStop();
    }
}
