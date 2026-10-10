package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0014*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\f/B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R%\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00130)8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010-8\u0002X\u0082\u0004¨\u00060"}, m90084d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", ExifInterface.LONGITUDE_EAST, "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "d", "()Z", "element", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)I", "m", "()Ljava/lang/Object;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "index", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "oldHead", "newHead", "n", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "k", "()J", "state", "c", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "b", "I", "Z", "mask", "j", "isEmpty", "g", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "Companion", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
public final class LockFreeTaskQueueCore<E> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91742f = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f91743g = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final C43045a0 f91744h = new C43045a0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean singleConsumer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int mask;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f91748d;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJR\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000e*\u00020\u000426\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00010\u000fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u0014\u0010+\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u0014\u0010,\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001a¨\u0006-"}, m90084d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "<init>", "()V", "", "other", "wo", "(JJ)J", "", "newHead", "updateHead", "(JI)J", "newTail", "updateTail", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TtmlNode.TAG_HEAD, "tail", "block", "withState", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "addFailReason", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Log0/a0;", "REMOVE_FROZEN", "Log0/a0;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: wo */
        public final long m91100wo(long j11, long j12) {
            return j11 & (~j12);
        }

        public Companion() {
        }

        public final int addFailReason(long j11) {
            return (j11 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long updateHead(long j11, int i11) {
            return m91100wo(j11, 1073741823L) | ((long) i11);
        }

        public final <T> T withState(long j11, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (1073741823 & j11)), Integer.valueOf((int) ((j11 & 1152921503533105152L) >> 30)));
        }

        public final long updateTail(long j11, int i11) {
            return m91100wo(j11, 1152921503533105152L) | (((long) i11) << 30);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeTaskQueueCore$a */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$a;", "", "", "index", "<init>", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41695a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final int index;

        public C41695a(int i11) {
            this.index = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final LockFreeTaskQueueCore<E> m91089b(long state) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i11 = (int) (1073741823 & state);
        int i12 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i13 = this.mask;
            if ((i11 & i13) == (i13 & i12)) {
                f91743g.set(lockFreeTaskQueueCore, INSTANCE.m91100wo(state, 1152921504606846976L));
                return lockFreeTaskQueueCore;
            }
            Object c41695a = getF91748d().get(this.mask & i11);
            if (c41695a == null) {
                c41695a = new C41695a(i11);
            }
            lockFreeTaskQueueCore.getF91748d().set(lockFreeTaskQueueCore.mask & i11, c41695a);
            i11++;
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF91748d() {
        return this.f91748d;
    }

    public LockFreeTaskQueueCore(int i11, boolean z11) {
        this.capacity = i11;
        this.singleConsumer = z11;
        int i12 = i11 - 1;
        this.mask = i12;
        this.f91748d = new AtomicReferenceArray(i11);
        if (i12 <= 1073741823) {
            if ((i11 & i12) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: a */
    public final int m91088a(@NotNull E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91743g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j11) != 0) {
                return INSTANCE.addFailReason(j11);
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.mask;
            if (((i12 + 2) & i13) == (i11 & i13)) {
                return 1;
            }
            if (!this.singleConsumer && getF91748d().get(i12 & i13) != null) {
                int i14 = this.capacity;
                if (i14 < 1024 || ((i12 - i11) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            } else if (f91743g.compareAndSet(this, j11, INSTANCE.updateTail(j11, (i12 + 1) & 1073741823))) {
                getF91748d().set(i12 & i13, element);
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreM91092e = this;
                while ((f91743g.get(lockFreeTaskQueueCoreM91092e) & 1152921504606846976L) != 0 && (lockFreeTaskQueueCoreM91092e = lockFreeTaskQueueCoreM91092e.m91097l().m91092e(i12, element)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final LockFreeTaskQueueCore<E> m91090c(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91742f;
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            C1481a.m2260a(f91742f, this, null, m91089b(state));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m91091d() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91743g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, 2305843009213693952L | j11));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final LockFreeTaskQueueCore<E> m91092e(int index, E element) {
        Object obj = getF91748d().get(this.mask & index);
        if ((obj instanceof C41695a) && ((C41695a) obj).index == index) {
            getF91748d().set(index & this.mask, element);
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m91094g() {
        long j11 = f91743g.get(this);
        return (((int) ((j11 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j11))) & 1073741823;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91095j() {
        long j11 = f91743g.get(this);
        if (((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final long m91096k() {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91743g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 1152921504606846976L) != 0) {
                return j11;
            }
            j12 = 1152921504606846976L | j11;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        return j12;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LockFreeTaskQueueCore<E> m91097l() {
        return m91090c(m91096k());
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m91098m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91743g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j11) != 0) {
                return f91744h;
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = this.mask;
            if ((((int) ((1152921503533105152L & j11) >> 30)) & i12) == (i12 & i11)) {
                return null;
            }
            Object obj = getF91748d().get(this.mask & i11);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof C41695a) {
                    return null;
                }
                int i13 = (i11 + 1) & 1073741823;
                if (f91743g.compareAndSet(this, j11, INSTANCE.updateHead(j11, i13))) {
                    getF91748d().set(this.mask & i11, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreM91099n = this;
                    do {
                        lockFreeTaskQueueCoreM91099n = lockFreeTaskQueueCoreM91099n.m91099n(i11, i13);
                    } while (lockFreeTaskQueueCoreM91099n != null);
                    return obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final LockFreeTaskQueueCore<E> m91099n(int oldHead, int newHead) {
        long j11;
        int i11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91743g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            i11 = (int) (1073741823 & j11);
            if ((1152921504606846976L & j11) != 0) {
                return m91097l();
            }
        } while (!f91743g.compareAndSet(this, j11, INSTANCE.updateHead(j11, newHead)));
        getF91748d().set(this.mask & i11, null);
        return null;
    }
}
