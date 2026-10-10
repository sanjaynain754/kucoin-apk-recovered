package qg0;

import androidx.concurrent.futures.C1481a;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.util.concurrent.C8585f0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qg0.k */
/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004038\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002058\u0002X\u0082\u0004¨\u00069"}, m90084d2 = {"Lqg0/k;", "", "<init>", "()V", "Lqg0/g;", "task", "b", "(Lqg0/g;)Lqg0/g;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Lqg0/g;", "", "onlyBlocking", "o", "(Z)Lqg0/g;", "index", "q", "(IZ)Lqg0/g;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "Lqg0/c;", "queue", "n", "(Lqg0/c;)Z", "m", "()Lqg0/g;", "", "c", "(Lqg0/g;)V", "k", "fair", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lqg0/g;Z)Lqg0/g;", "r", CmcdData.Factory.STREAM_TYPE_LIVE, "globalQueue", "j", "(Lqg0/c;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
public final class C43740k {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f96698b = AtomicReferenceFieldUpdater.newUpdater(C43740k.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f96699c = AtomicIntegerFieldUpdater.newUpdater(C43740k.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f96700d = AtomicIntegerFieldUpdater.newUpdater(C43740k.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f96701e = AtomicIntegerFieldUpdater.newUpdater(C43740k.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReferenceArray<AbstractRunnableC43736g> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    /* JADX INFO: renamed from: l */
    public final AbstractRunnableC43736g m96358l() {
        return m96361o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final long m96364r(int stealingMode, @NotNull Ref.ObjectRef<AbstractRunnableC43736g> stolenTaskRef) {
        AbstractRunnableC43736g abstractRunnableC43736gM96362p;
        T t11;
        AbstractRunnableC43736g abstractRunnableC43736gM96359m;
        if (stealingMode == 3) {
            abstractRunnableC43736gM96359m = m96359m();
        } else {
            abstractRunnableC43736gM96362p = m96362p(stealingMode);
        }
        if (t11 == 0) {
            t11 = abstractRunnableC43736gM96362p;
            t11 = abstractRunnableC43736gM96359m;
            return m96365s(stealingMode, stolenTaskRef);
        }
        t11 = abstractRunnableC43736gM96362p;
        t11 = abstractRunnableC43736gM96359m;
        stolenTaskRef.element = t11;
        return -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC43736g m96351a(@NotNull AbstractRunnableC43736g task, boolean fair) {
        if (fair) {
            return m96352b(task);
        }
        AbstractRunnableC43736g abstractRunnableC43736g = (AbstractRunnableC43736g) f96698b.getAndSet(this, task);
        if (abstractRunnableC43736g == null) {
            return null;
        }
        return m96352b(abstractRunnableC43736g);
    }

    /* JADX INFO: renamed from: c */
    public final void m96353c(AbstractRunnableC43736g abstractRunnableC43736g) {
        if (abstractRunnableC43736g == null || !abstractRunnableC43736g.taskContext) {
            return;
        }
        f96701e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractRunnableC43736g m96363q(int index, boolean onlyBlocking) {
        int i11 = index & 127;
        AbstractRunnableC43736g abstractRunnableC43736g = this.buffer.get(i11);
        if (abstractRunnableC43736g == null || abstractRunnableC43736g.taskContext != onlyBlocking || !C8585f0.m13695a(this.buffer, i11, abstractRunnableC43736g, null)) {
            return null;
        }
        if (onlyBlocking) {
            f96701e.decrementAndGet(this);
        }
        return abstractRunnableC43736g;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC43736g m96352b(AbstractRunnableC43736g task) {
        if (m96354e() == 127) {
            return task;
        }
        if (task.taskContext) {
            f96701e.incrementAndGet(this);
        }
        int i11 = f96699c.get(this) & 127;
        while (this.buffer.get(i11) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i11, task);
        f96699c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final int m96354e() {
        return f96699c.get(this) - f96700d.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final int m96355i() {
        if (f96698b.get(this) != null) {
            return m96354e() + 1;
        }
        return m96354e();
    }

    /* JADX INFO: renamed from: j */
    public final void m96356j(@NotNull C43732c globalQueue) {
        AbstractRunnableC43736g abstractRunnableC43736g = (AbstractRunnableC43736g) f96698b.getAndSet(this, null);
        if (abstractRunnableC43736g != null) {
            globalQueue.m94626a(abstractRunnableC43736g);
        }
        while (m96360n(globalQueue)) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final AbstractRunnableC43736g m96357k() {
        AbstractRunnableC43736g abstractRunnableC43736g = (AbstractRunnableC43736g) f96698b.getAndSet(this, null);
        if (abstractRunnableC43736g == null) {
            return m96359m();
        }
        return abstractRunnableC43736g;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractRunnableC43736g m96359m() {
        AbstractRunnableC43736g andSet;
        while (true) {
            int i11 = f96700d.get(this);
            if (i11 - f96699c.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (f96700d.compareAndSet(this, i11, i11 + 1) && (andSet = this.buffer.getAndSet(i12, null)) != null) {
                m96353c(andSet);
                return andSet;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m96360n(C43732c queue) {
        AbstractRunnableC43736g abstractRunnableC43736gM96359m = m96359m();
        if (abstractRunnableC43736gM96359m == null) {
            return false;
        }
        queue.m94626a(abstractRunnableC43736gM96359m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractRunnableC43736g m96361o(boolean onlyBlocking) {
        AbstractRunnableC43736g abstractRunnableC43736g;
        do {
            abstractRunnableC43736g = (AbstractRunnableC43736g) f96698b.get(this);
            if (abstractRunnableC43736g == null || abstractRunnableC43736g.taskContext != onlyBlocking) {
                int i11 = f96700d.get(this);
                int i12 = f96699c.get(this);
                while (i11 != i12) {
                    if (onlyBlocking && f96701e.get(this) == 0) {
                        return null;
                    }
                    i12--;
                    AbstractRunnableC43736g abstractRunnableC43736gM96363q = m96363q(i12, onlyBlocking);
                    if (abstractRunnableC43736gM96363q != null) {
                        return abstractRunnableC43736gM96363q;
                    }
                }
                return null;
            }
        } while (!C1481a.m2260a(f96698b, this, abstractRunnableC43736g, null));
        return abstractRunnableC43736g;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractRunnableC43736g m96362p(int stealingMode) {
        int i11 = f96700d.get(this);
        int i12 = f96699c.get(this);
        boolean z11 = true;
        if (stealingMode != 1) {
            z11 = false;
        }
        while (i11 != i12) {
            if (z11 && f96701e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC43736g abstractRunnableC43736gM96363q = m96363q(i11, z11);
            if (abstractRunnableC43736gM96363q == null) {
                i11 = i13;
            } else {
                return abstractRunnableC43736gM96363q;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, qg0.g] */
    /* JADX INFO: renamed from: s */
    public final long m96365s(int stealingMode, Ref.ObjectRef<AbstractRunnableC43736g> stolenTaskRef) {
        ?? r11;
        int i11;
        do {
            r11 = (AbstractRunnableC43736g) f96698b.get(this);
            if (r11 == 0) {
                return -2L;
            }
            if (r11.taskContext) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            if ((i11 & stealingMode) == 0) {
                return -2L;
            }
            long jMo96341a = C43738i.f96696f.mo96341a() - r11.submissionTime;
            long j11 = C43738i.f96692b;
            if (jMo96341a < j11) {
                return j11 - jMo96341a;
            }
        } while (!C1481a.m2260a(f96698b, this, r11, null));
        stolenTaskRef.element = r11;
        return -1L;
    }
}
