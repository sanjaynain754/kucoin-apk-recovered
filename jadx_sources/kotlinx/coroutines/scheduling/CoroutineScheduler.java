package kotlinx.coroutines.scheduling;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C41553c;
import kotlinx.coroutines.C41717o0;
import og0.C43045a0;
import og0.C43079v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import qg0.AbstractRunnableC43736g;
import qg0.C43732c;
import qg0.C43738i;
import qg0.C43740k;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0003U\u000fVB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010IR\u001e\u0010N\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000L8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010MR\u0011\u0010O\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bO\u0010\u001fR\u000b\u0010Q\u001a\u00020P8\u0002X\u0082\u0004R\u000b\u0010R\u001a\u00020P8\u0002X\u0082\u0004R\u000b\u0010T\u001a\u00020S8\u0002X\u0082\u0004¨\u0006W"}, m90084d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lqg0/g;", "task", "", "b", "(Lqg0/g;)Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;", "p", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;", "worker", "o", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;)I", "stateSnapshot", "", "x", "(J)V", "state", ExifInterface.LONGITUDE_EAST, "(J)Z", "L", "()Z", "g", "()I", "fair", "C", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;Lqg0/g;Z)Lqg0/g;", "i", "oldIndex", "newIndex", "u", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;II)V", "q", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "w", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "j", "(Ljava/lang/Runnable;ZZ)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Runnable;Z)Lqg0/g;", "z", "toString", "()Ljava/lang/String;", "v", "(Lqg0/g;)V", "I", "c", "d", "J", "e", "Ljava/lang/String;", "Lqg0/c;", "f", "Lqg0/c;", "globalCpuQueue", "globalBlockingQueue", "Log0/v;", "Log0/v;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Companion", "WorkerState", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1041:1\n286#1:1044\n284#1:1045\n284#1:1046\n286#1:1047\n281#1:1050\n282#1,5:1051\n292#1:1057\n284#1:1058\n285#1:1059\n284#1:1062\n285#1:1063\n281#1:1064\n289#1:1065\n284#1:1066\n284#1:1069\n285#1:1070\n286#1:1071\n77#2:1042\n77#2:1056\n77#2:1067\n1#3:1043\n29#4:1048\n29#4:1060\n16#5:1049\n16#5:1061\n619#6:1068\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1044\n289#1:1045\n290#1:1046\n299#1:1047\n348#1:1050\n377#1:1051,5\n400#1:1057\n444#1:1058\n445#1:1059\n481#1:1062\n482#1:1063\n488#1:1064\n497#1:1065\n497#1:1066\n578#1:1069\n579#1:1070\n580#1:1071\n120#1:1042\n397#1:1056\n514#1:1067\n348#1:1048\n477#1:1060\n348#1:1049\n477#1:1061\n521#1:1068\n*E\n"})
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f91795j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f91796k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91797l = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final C43045a0 f91798m = new C43045a0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int corePoolSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final int maxPoolSize;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C43732c globalCpuQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C43732c globalBlockingQueue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C43079v<C41744b> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f91807c = EnumEntriesKt.enumEntries(m91241a());

        @NotNull
        public static EnumEntries<WorkerState> getEntries() {
            return f91807c;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0015J\u0011\u0010$\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010!J\u001d\u0010'\u001a\u0004\u0018\u00010\u00132\n\u0010&\u001a\u00060\u0004j\u0002`%H\u0002¢\u0006\u0004\b'\u0010(R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00101\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R\u0016\u00106\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00108R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00108R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010*R\u0016\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\b\u0010F\u001a\u00020E8\u0006¨\u0006G"}, m90084d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$b;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "", "index", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "", "r", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "", "run", "()V", "upperBound", "j", "(I)I", "mayHaveLocalTasks", "Lqg0/g;", "e", "(Z)Lqg0/g;", "p", "()Z", "m", "q", "i", "task", "b", "(Lqg0/g;)V", "k", "t", "d", "()Lqg0/g;", "scanLocalQueue", "c", CmcdData.Factory.STREAM_TYPE_LIVE, "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", CmcdData.Factory.STREAMING_FORMAT_SS, "(I)Lqg0/g;", "indexInArray", "I", "f", "()I", "n", "(I)V", "Lqg0/k;", "Lqg0/k;", "localQueue", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTask", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", CmcdData.Factory.STREAMING_FORMAT_HLS, "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1041:1\n298#2,2:1042\n286#2:1044\n300#2,4:1045\n305#2:1049\n295#2,2:1050\n295#2,2:1055\n281#2:1059\n290#2:1060\n284#2:1061\n281#2:1062\n1#3:1052\n77#4:1053\n77#4:1054\n29#5:1057\n16#6:1058\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n684#1:1042,2\n684#1:1044\n684#1:1045,4\n699#1:1049\n773#1:1050,2\n821#1:1055,2\n872#1:1059\n898#1:1060\n898#1:1061\n971#1:1062\n812#1:1053\n815#1:1054\n868#1:1057\n868#1:1058\n*E\n"})
    public final class C41744b extends Thread {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f91808j = AtomicIntegerFieldUpdater.newUpdater(C41744b.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final C43740k localQueue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Ref.ObjectRef<AbstractRunnableC43736g> stolenTask;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public WorkerState state;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public long terminationDeadline;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long minDelayUntilStealableTaskNs;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public int rngState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C41744b() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new C43740k();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f91798m;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: l */
        public final AbstractRunnableC43736g m91253l() {
            if (m91251j(2) == 0) {
                AbstractRunnableC43736g abstractRunnableC43736gM94629e = CoroutineScheduler.this.globalCpuQueue.m94629e();
                return abstractRunnableC43736gM94629e != null ? abstractRunnableC43736gM94629e : CoroutineScheduler.this.globalBlockingQueue.m94629e();
            }
            AbstractRunnableC43736g abstractRunnableC43736gM94629e2 = CoroutineScheduler.this.globalBlockingQueue.m94629e();
            return abstractRunnableC43736gM94629e2 != null ? abstractRunnableC43736gM94629e2 : CoroutineScheduler.this.globalCpuQueue.m94629e();
        }

        /* JADX INFO: renamed from: m */
        public final void m91254m() {
            loop0: while (true) {
                boolean z11 = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.state == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    AbstractRunnableC43736g abstractRunnableC43736gM91247e = m91247e(this.mayHaveLocalTasks);
                    if (abstractRunnableC43736gM91247e != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        m91244b(abstractRunnableC43736gM91247e);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        m91258q();
                    } else {
                        if (z11) {
                            m91259r(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z11 = true;
                    }
                }
            }
            m91259r(WorkerState.TERMINATED);
        }

        /* JADX INFO: renamed from: b */
        public final void m91244b(AbstractRunnableC43736g task) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
            if (!task.taskContext) {
                CoroutineScheduler.this.m91237v(task);
                return;
            }
            if (m91259r(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.m91240z();
            }
            CoroutineScheduler.this.m91237v(task);
            CoroutineScheduler.m91222l().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        /* JADX INFO: renamed from: c */
        public final AbstractRunnableC43736g m91245c(boolean scanLocalQueue) {
            AbstractRunnableC43736g abstractRunnableC43736gM91253l;
            AbstractRunnableC43736g abstractRunnableC43736gM91253l2;
            if (scanLocalQueue) {
                boolean z11 = m91251j(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z11 && (abstractRunnableC43736gM91253l2 = m91253l()) != null) {
                    return abstractRunnableC43736gM91253l2;
                }
                AbstractRunnableC43736g abstractRunnableC43736gM96357k = this.localQueue.m96357k();
                if (abstractRunnableC43736gM96357k != null) {
                    return abstractRunnableC43736gM96357k;
                }
                if (!z11 && (abstractRunnableC43736gM91253l = m91253l()) != null) {
                    return abstractRunnableC43736gM91253l;
                }
            } else {
                AbstractRunnableC43736g abstractRunnableC43736gM91253l3 = m91253l();
                if (abstractRunnableC43736gM91253l3 != null) {
                    return abstractRunnableC43736gM91253l3;
                }
            }
            return m91260s(3);
        }

        /* JADX INFO: renamed from: d */
        public final AbstractRunnableC43736g m91246d() {
            AbstractRunnableC43736g abstractRunnableC43736gM96358l = this.localQueue.m96358l();
            if (abstractRunnableC43736gM96358l != null) {
                return abstractRunnableC43736gM96358l;
            }
            AbstractRunnableC43736g abstractRunnableC43736gM94629e = CoroutineScheduler.this.globalBlockingQueue.m94629e();
            return abstractRunnableC43736gM94629e == null ? m91260s(1) : abstractRunnableC43736gM94629e;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m91250i() {
            return this.nextParkedWorker != CoroutineScheduler.f91798m;
        }

        /* JADX INFO: renamed from: j */
        public final int m91251j(int upperBound) {
            int i11 = this.rngState;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.rngState = i14;
            int i15 = upperBound - 1;
            return (i15 & upperBound) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % upperBound;
        }

        /* JADX INFO: renamed from: k */
        public final void m91252k() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                m91261t();
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m91255n(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i11 == 0 ? "TERMINATED" : String.valueOf(i11));
            setName(sb2.toString());
            this.indexInArray = i11;
        }

        /* JADX INFO: renamed from: o */
        public final void m91256o(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m91257p() {
            long j11;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM91222l = CoroutineScheduler.m91222l();
            do {
                j11 = atomicLongFieldUpdaterM91222l.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j11) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.m91222l().compareAndSet(coroutineScheduler, j11, j11 - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m91259r(@NotNull WorkerState newState) {
            WorkerState workerState = this.state;
            boolean z11 = workerState == WorkerState.CPU_ACQUIRED;
            if (z11) {
                CoroutineScheduler.m91222l().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z11;
        }

        /* JADX INFO: renamed from: s */
        public final AbstractRunnableC43736g m91260s(int stealingMode) {
            int i11 = (int) (CoroutineScheduler.m91222l().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iM91251j = m91251j(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iM91251j++;
                if (iM91251j > i11) {
                    iM91251j = 1;
                }
                C41744b c41744bM94640b = coroutineScheduler.workers.m94640b(iM91251j);
                if (c41744bM94640b != null && c41744bM94640b != this) {
                    long jM96364r = c41744bM94640b.localQueue.m96364r(stealingMode, this.stolenTask);
                    if (jM96364r == -1) {
                        Ref.ObjectRef<AbstractRunnableC43736g> objectRef = this.stolenTask;
                        AbstractRunnableC43736g abstractRunnableC43736g = objectRef.element;
                        objectRef.element = null;
                        return abstractRunnableC43736g;
                    }
                    if (jM96364r > 0) {
                        jMin = Math.min(jMin, jM96364r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        /* JADX INFO: renamed from: t */
        public final void m91261t() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.m91222l().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                        return;
                    }
                    if (f91808j.compareAndSet(this, -1, 1)) {
                        int i11 = this.indexInArray;
                        m91255n(0);
                        coroutineScheduler.m91236u(this, i11, 0);
                        int andDecrement = (int) (CoroutineScheduler.m91222l().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i11) {
                            C41744b c41744bM94640b = coroutineScheduler.workers.m94640b(andDecrement);
                            Intrinsics.checkNotNull(c41744bM94640b);
                            C41744b c41744b = c41744bM94640b;
                            coroutineScheduler.workers.m94641c(i11, c41744b);
                            c41744b.m91255n(i11);
                            coroutineScheduler.m91236u(c41744b, andDecrement, i11);
                        }
                        coroutineScheduler.workers.m94641c(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.state = WorkerState.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final AbstractRunnableC43736g m91247e(boolean mayHaveLocalTasks) {
            if (m91257p()) {
                return m91245c(mayHaveLocalTasks);
            }
            return m91246d();
        }

        /* JADX INFO: renamed from: q */
        public final void m91258q() {
            if (!m91250i()) {
                CoroutineScheduler.this.m91235q(this);
                return;
            }
            f91808j.set(this, -1);
            while (m91250i() && f91808j.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                m91259r(WorkerState.PARKING);
                Thread.interrupted();
                m91252k();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m91254m();
        }

        public C41744b(CoroutineScheduler coroutineScheduler, int i11) {
            this();
            m91255n(i11);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        m91221k(this, command, false, false, 6, null);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class C41743a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m91219J(CoroutineScheduler coroutineScheduler, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = f91796k.get(coroutineScheduler);
        }
        return coroutineScheduler.m91226E(j11);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m91221k(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        coroutineScheduler.m91232j(runnable, z11, z12);
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater m91222l() {
        return f91796k;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractRunnableC43736g m91225C(C41744b c41744b, AbstractRunnableC43736g abstractRunnableC43736g, boolean z11) {
        WorkerState workerState;
        if (c41744b == null || (workerState = c41744b.state) == WorkerState.TERMINATED) {
            return abstractRunnableC43736g;
        }
        if (!abstractRunnableC43736g.taskContext && workerState == WorkerState.BLOCKING) {
            return abstractRunnableC43736g;
        }
        c41744b.mayHaveLocalTasks = true;
        return c41744b.localQueue.m96351a(abstractRunnableC43736g, z11);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m91228b(AbstractRunnableC43736g task) {
        return task.taskContext ? this.globalBlockingQueue.m94626a(task) : this.globalCpuQueue.m94626a(task);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m91238w(10000L);
    }

    /* JADX INFO: renamed from: g */
    public final int m91229g() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j11 = f91796k.get(this);
                int i11 = (int) (j11 & 2097151);
                int iCoerceAtLeast = RangesKt.coerceAtLeast(i11 - ((int) ((j11 & 4398044413952L) >> 21)), 0);
                if (iCoerceAtLeast >= this.corePoolSize) {
                    return 0;
                }
                if (i11 >= this.maxPoolSize) {
                    return 0;
                }
                int i12 = ((int) (m91222l().get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.workers.m94640b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C41744b c41744b = new C41744b(this, i12);
                this.workers.m94641c(i12, c41744b);
                if (i12 != ((int) (2097151 & f91796k.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = iCoerceAtLeast + 1;
                c41744b.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final AbstractRunnableC43736g m91230h(@NotNull Runnable block, boolean taskContext) {
        long jMo96341a = C43738i.f96696f.mo96341a();
        if (!(block instanceof AbstractRunnableC43736g)) {
            return C43738i.m96345b(block, jMo96341a, taskContext);
        }
        AbstractRunnableC43736g abstractRunnableC43736g = (AbstractRunnableC43736g) block;
        abstractRunnableC43736g.submissionTime = jMo96341a;
        abstractRunnableC43736g.taskContext = taskContext;
        return abstractRunnableC43736g;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM94639a = this.workers.m94639a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < iM94639a; i16++) {
            C41744b c41744bM94640b = this.workers.m94640b(i16);
            if (c41744bM94640b != null) {
                int iM96355i = c41744bM94640b.localQueue.m96355i();
                int i17 = C41743a.$EnumSwitchMapping$0[c41744bM94640b.state.ordinal()];
                if (i17 == 1) {
                    i13++;
                } else if (i17 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM96355i);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iM96355i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i14++;
                    if (iM96355i > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iM96355i);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15++;
                }
            }
        }
        long j11 = f91796k.get(this);
        return this.schedulerName + '@' + C41717o0.m91175b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i11 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.m94628c() + ", global blocking queue size = " + this.globalBlockingQueue.m94628c() + ", Control State {created workers= " + ((int) (2097151 & j11)) + ", blocking tasks = " + ((int) ((4398044413952L & j11) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j11) >> 42))) + "}]";
    }

    public CoroutineScheduler(int i11, int i12, long j11, @NotNull String str) {
        this.corePoolSize = i11;
        this.maxPoolSize = i12;
        this.idleWorkerKeepAliveNs = j11;
        this.schedulerName = str;
        if (i11 >= 1) {
            if (i12 >= i11) {
                if (i12 <= 2097150) {
                    if (j11 > 0) {
                        this.globalCpuQueue = new C43732c();
                        this.globalBlockingQueue = new C43732c();
                        this.workers = new C43079v<>((i11 + 1) * 2);
                        this.controlState$volatile = ((long) i11) << 42;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j11 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i12 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i12 + " should be greater than or equals to core pool size " + i11).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i11 + " should be at least 1").toString());
    }

    /* JADX INFO: renamed from: E */
    public final boolean m91226E(long state) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iM91229g = m91229g();
            if (iM91229g == 1 && this.corePoolSize > 1) {
                m91229g();
            }
            if (iM91229g > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m91227L() {
        C41744b c41744bM91234p;
        do {
            c41744bM91234p = m91234p();
            if (c41744bM91234p == null) {
                return false;
            }
        } while (!C41744b.f91808j.compareAndSet(c41744bM91234p, -1, 0));
        LockSupport.unpark(c41744bM91234p);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final C41744b m91231i() {
        C41744b c41744b;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C41744b) {
            c41744b = (C41744b) threadCurrentThread;
        } else {
            c41744b = null;
        }
        if (c41744b == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return c41744b;
    }

    public final boolean isTerminated() {
        if (f91797l.get(this) == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m91232j(@NotNull Runnable block, boolean taskContext, boolean fair) {
        long jAddAndGet;
        C41553c.m90497a();
        AbstractRunnableC43736g abstractRunnableC43736gM91230h = m91230h(block, taskContext);
        boolean z11 = abstractRunnableC43736gM91230h.taskContext;
        if (z11) {
            jAddAndGet = f91796k.addAndGet(this, 2097152L);
        } else {
            jAddAndGet = 0;
        }
        AbstractRunnableC43736g abstractRunnableC43736gM91225C = m91225C(m91231i(), abstractRunnableC43736gM91230h, fair);
        if (abstractRunnableC43736gM91225C != null && !m91228b(abstractRunnableC43736gM91225C)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z11) {
            m91239x(jAddAndGet);
        } else {
            m91240z();
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m91233o(C41744b worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f91798m) {
            if (nextParkedWorker == null) {
                return 0;
            }
            C41744b c41744b = (C41744b) nextParkedWorker;
            int indexInArray = c41744b.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = c41744b.getNextParkedWorker();
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public final C41744b m91234p() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91795j;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            C41744b c41744bM94640b = this.workers.m94640b((int) (2097151 & j11));
            if (c41744bM94640b == null) {
                return null;
            }
            long j12 = (2097152 + j11) & (-2097152);
            int iM91233o = m91233o(c41744bM94640b);
            if (iM91233o >= 0 && f91795j.compareAndSet(this, j11, ((long) iM91233o) | j12)) {
                c41744bM94640b.m91256o(f91798m);
                return c41744bM94640b;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m91235q(@NotNull C41744b worker) {
        long j11;
        int indexInArray;
        if (worker.getNextParkedWorker() == f91798m) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f91795j;
            do {
                j11 = atomicLongFieldUpdater.get(this);
                indexInArray = worker.getIndexInArray();
                worker.m91256o(this.workers.m94640b((int) (2097151 & j11)));
            } while (!f91795j.compareAndSet(this, j11, ((2097152 + j11) & (-2097152)) | ((long) indexInArray)));
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final void m91236u(@NotNull C41744b worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91795j;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            int iM91233o = (int) (2097151 & j11);
            long j12 = (2097152 + j11) & (-2097152);
            if (iM91233o == oldIndex) {
                if (newIndex == 0) {
                    iM91233o = m91233o(worker);
                } else {
                    iM91233o = newIndex;
                }
            }
            if (iM91233o >= 0) {
                if (f91795j.compareAndSet(this, j11, j12 | ((long) iM91233o))) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m91237v(@NotNull AbstractRunnableC43736g task) {
        try {
            task.run();
            C41553c.m90497a();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                C41553c.m90497a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX INFO: renamed from: w */
    public final void m91238w(long timeout) throws InterruptedException {
        int i11;
        AbstractRunnableC43736g abstractRunnableC43736gM94629e;
        if (!f91797l.compareAndSet(this, 0, 1)) {
            return;
        }
        C41744b c41744bM91231i = m91231i();
        synchronized (this.workers) {
            i11 = (int) (m91222l().get(this) & 2097151);
        }
        if (1 <= i11) {
            int i12 = 1;
            while (true) {
                C41744b c41744bM94640b = this.workers.m94640b(i12);
                Intrinsics.checkNotNull(c41744bM94640b);
                C41744b c41744b = c41744bM94640b;
                if (c41744b != c41744bM91231i) {
                    while (c41744b.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(c41744b);
                        c41744b.join(timeout);
                    }
                    c41744b.localQueue.m96356j(this.globalBlockingQueue);
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.globalBlockingQueue.m94627b();
        this.globalCpuQueue.m94627b();
        while (true) {
            if (c41744bM91231i != null) {
                abstractRunnableC43736gM94629e = c41744bM91231i.m91247e(true);
                if (abstractRunnableC43736gM94629e == null) {
                    abstractRunnableC43736gM94629e = this.globalCpuQueue.m94629e();
                    if (abstractRunnableC43736gM94629e == null) {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                abstractRunnableC43736gM94629e = this.globalCpuQueue.m94629e();
                if (abstractRunnableC43736gM94629e == null && (abstractRunnableC43736gM94629e = this.globalBlockingQueue.m94629e()) == null) {
                    break;
                }
            }
            m91237v(abstractRunnableC43736gM94629e);
        }
        if (c41744bM91231i != null) {
            c41744bM91231i.m91259r(WorkerState.TERMINATED);
        }
        f91795j.set(this, 0L);
        f91796k.set(this, 0L);
    }

    /* JADX INFO: renamed from: x */
    public final void m91239x(long stateSnapshot) {
        if (m91227L() || m91226E(stateSnapshot)) {
            return;
        }
        m91227L();
    }

    /* JADX INFO: renamed from: z */
    public final void m91240z() {
        if (m91227L() || m91219J(this, 0L, 1, null)) {
            return;
        }
        m91227L();
    }
}
