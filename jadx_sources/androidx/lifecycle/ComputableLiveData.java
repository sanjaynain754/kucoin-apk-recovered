package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComputableLiveData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\r\u0010\u001c\u001a\u00028\u0000H%¢\u0006\u0002\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0017¨\u0006\u001e"}, m90084d2 = {"Landroidx/lifecycle/ComputableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/util/concurrent/Executor;)V", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "_liveData", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata_release", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "()V", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "invalidate", "", "compute", "()Ljava/lang/Object;", "lifecycle-livedata_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ComputableLiveData<T> {

    @NotNull
    private final LiveData<T> _liveData;

    @NotNull
    private final AtomicBoolean computing;

    @NotNull
    private final Executor executor;

    @NotNull
    private final AtomicBoolean invalid;

    @JvmField
    @NotNull
    public final Runnable invalidationRunnable;

    @NotNull
    private final LiveData<T> liveData;

    @JvmField
    @NotNull
    public final Runnable refreshRunnable;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @WorkerThread
    public abstract T compute();

    @JvmOverloads
    public ComputableLiveData(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.a
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(this.f2757b);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.b
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(this.f2758b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        do {
            boolean z11 = false;
            if (computableLiveData.computing.compareAndSet(false, true)) {
                Object objCompute = null;
                boolean z12 = false;
                while (computableLiveData.invalid.compareAndSet(true, false)) {
                    try {
                        objCompute = computableLiveData.compute();
                        z12 = true;
                    } catch (Throwable th2) {
                        computableLiveData.computing.set(false);
                        throw th2;
                    }
                }
                if (z12) {
                    computableLiveData.getLiveData().postValue(objCompute);
                }
                computableLiveData.computing.set(false);
                z11 = z12;
            }
            if (!z11) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    @NotNull
    /* JADX INFO: renamed from: getComputing$lifecycle_livedata_release, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @NotNull
    /* JADX INFO: renamed from: getExecutor$lifecycle_livedata_release, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    /* JADX INFO: renamed from: getInvalid$lifecycle_livedata_release, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @NotNull
    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData computableLiveData) {
        boolean zHasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    public /* synthetic */ ComputableLiveData(Executor executor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ArchTaskExecutor.getIOThreadExecutor() : executor);
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }
}
