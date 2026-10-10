package og0;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: og0.o */
/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00150\u00138\u0002X\u0082\u0004¨\u0006\u0017"}, m90084d2 = {"Log0/o;", "", ExifInterface.LONGITUDE_EAST, "", "singleConsumer", "<init>", "(Z)V", "", "b", "()V", "element", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class C43072o<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f95271a = AtomicReferenceFieldUpdater.newUpdater(C43072o.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C43072o(boolean z11) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, z11);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94626a(@NotNull E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95271a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int iM91088a = lockFreeTaskQueueCore.m91088a(element);
            if (iM91088a == 0) {
                return true;
            }
            if (iM91088a != 1) {
                if (iM91088a == 2) {
                    return false;
                }
            } else {
                C1481a.m2260a(f95271a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m91097l());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m94627b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95271a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore.m91091d()) {
                return;
            } else {
                C1481a.m2260a(f95271a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m91097l());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m94628c() {
        return ((LockFreeTaskQueueCore) f95271a.get(this)).m91094g();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final E m94629e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95271a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            E e11 = (E) lockFreeTaskQueueCore.m91098m();
            if (e11 != LockFreeTaskQueueCore.f91744h) {
                return e11;
            }
            C1481a.m2260a(f95271a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m91097l());
        }
    }
}
