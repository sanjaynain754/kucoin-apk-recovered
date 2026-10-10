package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.u2 */
/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, m90084d2 = {"Lkotlinx/coroutines/u2;", "Lkotlinx/coroutines/a2;", "<init>", "()V", "Lkotlinx/coroutines/x1;", "job", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lkotlinx/coroutines/x1;)V", "x", "", "cause", "v", "(Ljava/lang/Throwable;)V", "", "state", "", "z", "(I)Ljava/lang/Void;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "f", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/b1;", "g", "Lkotlinx/coroutines/b1;", "cancelHandle", "", "u", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41764u2 extends AbstractC41542a2 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91868h = AtomicIntegerFieldUpdater.newUpdater(C41764u2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Thread targetThread = Thread.currentThread();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC41550b1 cancelHandle;

    /* JADX INFO: renamed from: A */
    public final void m91361A(@NotNull InterfaceC41775x1 job) {
        int i11;
        this.cancelHandle = JobKt__JobKt.m90372p(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91868h;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2 || i11 == 3) {
                    return;
                }
                m91363z(i11);
                throw new KotlinNothingValueException();
            }
        } while (!f91868h.compareAndSet(this, i11, 0));
    }

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: u */
    public boolean mo90449u() {
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final Void m91363z(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: v */
    public void mo90450v(@Nullable Throwable cause) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91868h;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    m91363z(i11);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f91868h.compareAndSet(this, i11, 2));
        this.targetThread.interrupt();
        f91868h.set(this, 3);
    }

    /* JADX INFO: renamed from: x */
    public final void m91362x() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91868h;
        while (true) {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m91363z(i11);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f91868h.compareAndSet(this, i11, 1)) {
                InterfaceC41550b1 interfaceC41550b1 = this.cancelHandle;
                if (interfaceC41550b1 != null) {
                    interfaceC41550b1.dispose();
                    return;
                }
                return;
            }
        }
    }
}
