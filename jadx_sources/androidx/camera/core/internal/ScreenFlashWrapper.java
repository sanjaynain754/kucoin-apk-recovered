package androidx.camera.core.internal;

import androidx.annotation.GuardedBy;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScreenFlashWrapper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0006\u0010\u0014\u001a\u00020\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper;", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "screenFlash", "<init>", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "lock", "Ljava/lang/Object;", "isClearScreenFlashPending", "", "pendingListener", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "apply", "", "expirationTimeMillis", "", "screenFlashListener", "clear", "getBaseScreenFlash", "completePendingScreenFlashListener", "completePendingScreenFlashClear", "completePendingTasks", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "ScreenFlashWrapper";

    @GuardedBy("lock")
    private boolean isClearScreenFlashPending;

    @NotNull
    private final Object lock;

    @GuardedBy("lock")
    @Nullable
    private ImageCapture.ScreenFlashListener pendingListener;

    @Nullable
    private final ImageCapture.ScreenFlash screenFlash;

    /* JADX INFO: compiled from: ScreenFlashWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper$Companion;", "", "<init>", "()V", "TAG", "", "from", "Landroidx/camera/core/internal/ScreenFlashWrapper;", "screenFlash", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ScreenFlashWrapper from(@Nullable ImageCapture.ScreenFlash screenFlash) {
            return new ScreenFlashWrapper(screenFlash, null);
        }
    }

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, DefaultConstructorMarker defaultConstructorMarker) {
        this(screenFlash);
    }

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(ScreenFlashWrapper screenFlashWrapper) {
        synchronized (screenFlashWrapper.lock) {
            try {
                if (screenFlashWrapper.pendingListener == null) {
                    Logger.m1872w(TAG, "apply: pendingListener is null!");
                }
                screenFlashWrapper.completePendingScreenFlashListener();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void completePendingScreenFlashClear() {
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                    if (screenFlash != null) {
                        screenFlash.clear();
                    } else {
                        Logger.m1868e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    Logger.m1872w(TAG, "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            try {
                ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
                if (screenFlashListener != null) {
                    screenFlashListener.onCompleted();
                }
                this.pendingListener = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final ScreenFlashWrapper from(@Nullable ImageCapture.ScreenFlash screenFlash) {
        return INSTANCE.from(screenFlash);
    }

    @Nullable
    /* JADX INFO: renamed from: getBaseScreenFlash, reason: from getter */
    public final ImageCapture.ScreenFlash getScreenFlash() {
        return this.screenFlash;
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long expirationTimeMillis, @NotNull ImageCapture.ScreenFlashListener screenFlashListener) {
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            Unit unit = Unit.INSTANCE;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(expirationTimeMillis, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.c
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$2(this.f1734a);
                }
            });
        } else {
            Logger.m1868e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }
}
