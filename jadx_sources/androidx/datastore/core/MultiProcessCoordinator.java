package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102$\b\u0004\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0082H¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0096@¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010$R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u001b\u0010;\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b7\u00108*\u0004\b9\u0010:¨\u0006="}, m90084d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/io/File;", "file", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "", "suffix", "fileWithSuffix", "(Ljava/lang/String;)Ljava/io/File;", "", "createIfNotExists", "(Ljava/io/File;)V", "createParentDirectories", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Landroidx/datastore/core/SharedCounter;", "Lkotlin/coroutines/Continuation;", "", "block", "withLazyCounter", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryLock", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lkotlinx/coroutines/flow/e;", "updateNotifications", "Lkotlinx/coroutines/flow/e;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/e;", "LOCK_SUFFIX", "Ljava/lang/String;", "VERSION_SUFFIX", "LOCK_ERROR_MESSAGE", "Lrg0/a;", "inMemoryMutex", "Lrg0/a;", "lockFile$delegate", "Lkotlin/Lazy;", "getLockFile", "lockFile", "Lkotlin/Lazy;", "lazySharedCounter", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "sharedCounter", "Companion", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,205:1\n159#1,8:226\n159#1,8:234\n120#2,10:206\n32#3,10:216\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n99#1:226,8\n106#1:234,8\n43#1:206,10\n60#1:216,10\n*E\n"})
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;

    @NotNull
    private final String LOCK_ERROR_MESSAGE;

    @NotNull
    private final String LOCK_SUFFIX;

    @NotNull
    private final String VERSION_SUFFIX;

    @NotNull
    private final CoroutineContext context;

    @NotNull
    private final File file;

    @NotNull
    private final InterfaceC44082a inMemoryMutex;

    @NotNull
    private final Lazy<SharedCounter> lazySharedCounter;

    /* JADX INFO: renamed from: lockFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockFile;

    @NotNull
    private final InterfaceC41634e<Unit> updateNotifications;

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "()V", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            r2 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            r15.L$0 = r14;
            r15.J$0 = r5;
            r15.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (kotlinx.coroutines.DelayKt.m90350b(r5, r15) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getExclusiveFileLockWithRetryIfDeadlock(FileOutputStream fileOutputStream, Continuation<? super FileLock> continuation) throws IOException {
            C2335xe413854a c2335xe413854a;
            long j11;
            C2335xe413854a c2335xe413854a2;
            if (continuation instanceof C2335xe413854a) {
                c2335xe413854a = (C2335xe413854a) continuation;
                int i11 = c2335xe413854a.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c2335xe413854a.label = i11 - Integer.MIN_VALUE;
                } else {
                    c2335xe413854a = new C2335xe413854a(this, continuation);
                }
            } else {
                c2335xe413854a = new C2335xe413854a(this, continuation);
            }
            Object obj = c2335xe413854a.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = c2335xe413854a.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                j11 = MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
                c2335xe413854a2 = c2335xe413854a;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = c2335xe413854a.J$0;
                fileOutputStream = (FileOutputStream) c2335xe413854a.L$0;
                ResultKt.throwOnFailure(obj);
                c2335xe413854a2 = c2335xe413854a;
                j11 *= (long) 2;
            }
            if (j11 <= MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                Intrinsics.checkNotNullExpressionValue(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock;
            }
            FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
            Intrinsics.checkNotNullExpressionValue(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
            return fileLockLock2;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1 */
    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.MultiProcessCoordinator", m90122f = "MultiProcessCoordinator.android.kt", m90123i = {0, 0, 0, 1, 1, 2, 2}, m90124l = {211, 47, 48}, m90125m = "lock", m90126n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    public static final class C23381<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C23381(Continuation<? super C23381> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1 */
    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.MultiProcessCoordinator", m90122f = "MultiProcessCoordinator.android.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {62, 87}, m90125m = "tryLock", m90126n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, m90127s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    public static final class C23391<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C23391(Continuation<? super C23391> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2 */
    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", m90122f = "MultiProcessCoordinator.android.kt", m90123i = {}, m90124l = {163}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n*L\n1#1,205:1\n*E\n"})
    public static final class C23402<T> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<SharedCounter, Continuation<? super T>, Object> $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23402(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, MultiProcessCoordinator multiProcessCoordinator, Continuation<? super C23402> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23402(this.$block, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super T> continuation) {
            return ((C23402) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function2<SharedCounter, Continuation<? super T>, Object> function2 = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = function2.invoke(sharedCounter, this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
    }

    public MultiProcessCoordinator(@NotNull CoroutineContext context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = C44087f.m97144b(false, 1, null);
        this.lockFile = LazyKt.lazy(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
                this.this$0.createIfNotExists(fileFileWithSuffix);
                return fileFileWithSuffix;
            }
        });
        this.lazySharedCounter = LazyKt.lazy(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final SharedCounter invoke() {
                SharedCounter.Companion companion = SharedCounter.INSTANCE;
                companion.loadLib();
                final MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                return companion.create$datastore_core_release(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p852kotlin.jvm.functions.Function0
                    @NotNull
                    public final File invoke() throws IOException {
                        MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                        File fileFileWithSuffix = multiProcessCoordinator2.fileWithSuffix(multiProcessCoordinator2.VERSION_SUFFIX);
                        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
                        return fileFileWithSuffix;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        CoroutineContext coroutineContext = this.context;
        C23402 c23402 = new C23402(function2, this, null);
        InlineMarker.mark(0);
        Object objM91049g = C41686h.m91049g(coroutineContext, c23402, continuation);
        InlineMarker.mark(1);
        return objM91049g;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @NotNull
    public InterfaceC41634e<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object getVersion(@NotNull Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(getSharedCounter().getValue()) : C41686h.m91049g(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object incrementAndGetVersion(@NotNull Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(getSharedCounter().incrementAndGetValue()) : C41686h.m91049g(this.context, new C2336xb55e9682(this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [rg0.a] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public <T> Object lock(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) throws Throwable {
        C23381 c23381;
        MultiProcessCoordinator multiProcessCoordinator;
        FileOutputStream fileOutputStream;
        Throwable th2;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        java.io.Closeable closeable;
        ?? r11;
        ?? r12;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        java.io.Closeable closeable2;
        ?? r13;
        ?? r14;
        if (continuation instanceof C23381) {
            c23381 = (C23381) continuation;
            int i11 = c23381.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23381.label = i11 - Integer.MIN_VALUE;
            } else {
                c23381 = new C23381(continuation);
            }
        } else {
            c23381 = new C23381(continuation);
        }
        ?? r15 = c23381.result;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23381.label;
        try {
            try {
                try {
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(r15);
                        InterfaceC44082a interfaceC44082a = this.inMemoryMutex;
                        c23381.L$0 = this;
                        c23381.L$1 = function1;
                        c23381.L$2 = interfaceC44082a;
                        c23381.label = 1;
                        if (interfaceC44082a.mo91344d(null, c23381) != coroutine_suspended) {
                            multiProcessCoordinator = this;
                            r15 = interfaceC44082a;
                        }
                        return coroutine_suspended;
                    }
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) c23381.L$2;
                            closeable2 = (java.io.Closeable) c23381.L$1;
                            InterfaceC44082a interfaceC44082a2 = (InterfaceC44082a) c23381.L$0;
                            try {
                                ResultKt.throwOnFailure(r15);
                                r14 = interfaceC44082a2;
                                r13 = r15;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    p852kotlin.p407io.CloseableKt.closeFinally(closeable2, null);
                                    r14.mo91345e(null);
                                    return r13;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r15 = r14;
                                    r15.mo91345e(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (java.io.Closeable) c23381.L$2;
                        r11 = (InterfaceC44082a) c23381.L$1;
                        function2 = (Function1) c23381.L$0;
                        try {
                            ResultKt.throwOnFailure(r15);
                            r11 = r11;
                            r12 = r15;
                            fileLock2 = (FileLock) r12;
                            try {
                                c23381.L$0 = r11;
                                c23381.L$1 = closeable;
                                c23381.L$2 = fileLock2;
                                c23381.label = 3;
                                objInvoke = function2.invoke(c23381);
                                if (objInvoke != coroutine_suspended) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r13 = objInvoke;
                                    r14 = r11;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    p852kotlin.p407io.CloseableKt.closeFinally(closeable2, null);
                                    r14.mo91345e(null);
                                    return r13;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) c23381.L$2;
                    Function1<? super Continuation<? super T>, ? extends Object> function3 = (Function1) c23381.L$1;
                    multiProcessCoordinator = (MultiProcessCoordinator) c23381.L$0;
                    ResultKt.throwOnFailure(r15);
                    r15 = interfaceC44082a3;
                    function1 = function3;
                    Companion companion = INSTANCE;
                    c23381.L$0 = function1;
                    c23381.L$1 = r15;
                    c23381.L$2 = fileOutputStream;
                    c23381.label = 2;
                    Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, c23381);
                    if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                        function2 = function1;
                        closeable = fileOutputStream;
                        r11 = r15;
                        r12 = exclusiveFileLockWithRetryIfDeadlock;
                        fileLock2 = (FileLock) r12;
                        c23381.L$0 = r11;
                        c23381.L$1 = closeable;
                        c23381.L$2 = fileLock2;
                        c23381.label = 3;
                        objInvoke = function2.invoke(c23381);
                        if (objInvoke != coroutine_suspended) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r13 = objInvoke;
                            r14 = r11;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            p852kotlin.p407io.CloseableKt.closeFinally(closeable2, null);
                            r14.mo91345e(null);
                            return r13;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                fileOutputStream = new FileOutputStream(multiProcessCoordinator.getLockFile());
            } catch (Throwable th8) {
                th = th8;
                r15.mo91345e(null);
                throw th;
            }
        } catch (Throwable th9) {
            r15 = c23381;
            try {
                throw th9;
            } catch (Throwable th10) {
                p852kotlin.p407io.CloseableKt.closeFinally(coroutine_suspended, th9);
                throw th10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public <T> Object tryLock(@NotNull Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        ?? c23391;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        InterfaceC44082a interfaceC44082a;
        boolean z11;
        java.io.Closeable closeable;
        InterfaceC44082a interfaceC44082a2;
        boolean z12;
        ?? r11 = function2;
        if (continuation instanceof C23391) {
            C23391 c23392 = (C23391) continuation;
            int i11 = c23392.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23392.label = i11 - Integer.MIN_VALUE;
                c23391 = c23392;
            } else {
                c23391 = new C23391(continuation);
            }
        } else {
            c23391 = new C23391(continuation);
        }
        Object objInvoke = c23391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = c23391.label;
        try {
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        z12 = c23391.Z$0;
                        interfaceC44082a2 = (InterfaceC44082a) c23391.L$0;
                        ResultKt.throwOnFailure(objInvoke);
                        if (z12) {
                            interfaceC44082a2.mo91345e(null);
                        }
                        return objInvoke;
                    }
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = c23391.Z$0;
                    fileLock = (FileLock) c23391.L$2;
                    closeable = (java.io.Closeable) c23391.L$1;
                    interfaceC44082a = (InterfaceC44082a) c23391.L$0;
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        p852kotlin.p407io.CloseableKt.closeFinally(closeable, null);
                        if (z11) {
                            interfaceC44082a.mo91345e(null);
                        }
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(objInvoke);
                InterfaceC44082a interfaceC44082a3 = this.inMemoryMutex;
                boolean zMo91342a = interfaceC44082a3.mo91342a(null);
                try {
                    if (zMo91342a) {
                        FileInputStream fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e11) {
                            String message2 = e11.getMessage();
                            if ((message2 == null || !StringsKt.startsWith$default(message2, this.LOCK_ERROR_MESSAGE, false, 2, (Object) null)) && ((message = e11.getMessage()) == null || !StringsKt.startsWith$default(message, DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null))) {
                                throw e11;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolBoxBoolean = Boxing.boxBoolean(fileLockTryLock != null);
                            c23391.L$0 = interfaceC44082a3;
                            c23391.L$1 = fileInputStream;
                            c23391.L$2 = fileLockTryLock;
                            c23391.Z$0 = zMo91342a;
                            c23391.label = 2;
                            objInvoke = r11.invoke(boolBoxBoolean, c23391);
                            if (objInvoke != coroutine_suspended) {
                                interfaceC44082a = interfaceC44082a3;
                                z11 = zMo91342a;
                                closeable = fileInputStream;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                p852kotlin.p407io.CloseableKt.closeFinally(closeable, null);
                                if (z11) {
                                    interfaceC44082a.mo91345e(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                        c23391.L$0 = interfaceC44082a3;
                        c23391.Z$0 = zMo91342a;
                        c23391.label = 1;
                        objInvoke = r11.invoke(boolBoxBoolean2, c23391);
                        if (objInvoke != coroutine_suspended) {
                            interfaceC44082a2 = interfaceC44082a3;
                            z12 = zMo91342a;
                            if (z12) {
                                interfaceC44082a2.mo91345e(null);
                            }
                            return objInvoke;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    c23391 = interfaceC44082a3;
                    r11 = zMo91342a;
                    if (r11 != 0) {
                        c23391.mo91345e(null);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            ?? r13 = c23391;
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    p852kotlin.p407io.CloseableKt.closeFinally(r12, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r11 = r11;
                    c23391 = r13;
                    if (r11 != 0) {
                        c23391.mo91345e(null);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }
}
