package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41701k0;
import kotlinx.coroutines.C41725q0;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41758t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.k */
/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010.\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004¨\u00067"}, m90084d2 = {"Log0/k;", "Lkotlinx/coroutines/j0;", "Lkotlinx/coroutines/t0;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lkotlinx/coroutines/j0;ILjava/lang/String;)V", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lkotlinx/coroutines/m;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/m;)V", "Lkotlinx/coroutines/b1;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/b1;", "", "Q", "()Z", "P", "()Ljava/lang/Runnable;", "c", "Lkotlinx/coroutines/j0;", "d", "I", "e", "Ljava/lang/String;", "Log0/o;", "f", "Log0/o;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "g", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n62#1,18:155\n62#1,18:173\n29#2:191\n29#2:193\n16#3:192\n16#3:194\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:155,18\n51#1:173,18\n85#1:191\n98#1:193\n85#1:192\n98#1:194\n*E\n"})
public final class C43064k extends AbstractC41697j0 implements InterfaceC41758t0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f95255h = AtomicIntegerFieldUpdater.newUpdater(C43064k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41758t0 f95256b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC41697j0 dispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int parallelism;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C43072o<Runnable> queue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: og0.k$a */
    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Log0/k$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Log0/k;Ljava/lang/Runnable;)V", "", "run", "()V", "b", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n29#2:155\n16#3:156\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n*L\n139#1:155\n139#1:156\n*E\n"})
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Runnable currentTask;

        @Override // java.lang.Runnable
        public void run() {
            int i11 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th2) {
                    C41701k0.m91111a(EmptyCoroutineContext.INSTANCE, th2);
                }
                try {
                    Runnable runnableM94604P = C43064k.this.m94604P();
                    if (runnableM94604P == null) {
                        return;
                    }
                    this.currentTask = runnableM94604P;
                    i11++;
                    if (i11 >= 16 && C43060i.m94594d(C43064k.this.dispatcher, C43064k.this)) {
                        C43060i.m94593c(C43064k.this.dispatcher, C43064k.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = C43064k.this.workerAllocationLock;
                    C43064k c43064k = C43064k.this;
                    synchronized (obj) {
                        C43064k.m94601O().decrementAndGet(c43064k);
                        throw th3;
                    }
                }
            }
        }

        public a(Runnable runnable) {
            this.currentTask = runnable;
        }
    }

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m94601O() {
        return f95255h;
    }

    /* JADX INFO: renamed from: P */
    public final Runnable m94604P() {
        while (true) {
            Runnable runnableM94629e = this.queue.m94629e();
            if (runnableM94629e != null) {
                return runnableM94629e;
            }
            synchronized (this.workerAllocationLock) {
                f95255h.decrementAndGet(this);
                if (this.queue.m94628c() == 0) {
                    return null;
                }
                f95255h.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m94605Q() {
        synchronized (this.workerAllocationLock) {
            if (f95255h.get(this) >= this.parallelism) {
                return false;
            }
            f95255h.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM94604P;
        this.queue.m94626a(block);
        if (f95255h.get(this) >= this.parallelism || !m94605Q() || (runnableM94604P = m94604P()) == null) {
            return;
        }
        try {
            C43060i.m94593c(this.dispatcher, this, new a(runnableM94604P));
        } catch (Throwable th2) {
            f95255h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM94604P;
        this.queue.m94626a(block);
        if (f95255h.get(this) >= this.parallelism || !m94605Q() || (runnableM94604P = m94604P()) == null) {
            return;
        }
        try {
            this.dispatcher.dispatchYield(this, new a(runnableM94604P));
        } catch (Throwable th2) {
            f95255h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f95256b.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull InterfaceC41708m<? super Unit> continuation) {
        this.f95256b.scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43064k(@NotNull AbstractC41697j0 abstractC41697j0, int i11, @Nullable String str) {
        InterfaceC41758t0 interfaceC41758t0;
        if (abstractC41697j0 instanceof InterfaceC41758t0) {
            interfaceC41758t0 = (InterfaceC41758t0) abstractC41697j0;
        } else {
            interfaceC41758t0 = null;
        }
        this.f95256b = interfaceC41758t0 == null ? C41725q0.m91189a() : interfaceC41758t0;
        this.dispatcher = abstractC41697j0;
        this.parallelism = i11;
        this.name = str;
        this.queue = new C43072o<>(false);
        this.workerAllocationLock = new Object();
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        C43066l.m94607a(parallelism);
        if (parallelism >= this.parallelism) {
            return C43066l.m94608b(this, name);
        }
        return super.limitedParallelism(parallelism, name);
    }
}
