package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\n2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m90084d2 = {"Landroidx/datastore/core/FileStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "checkNotClosed", "()V", "createParentDirectories", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Ljava/io/File;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lrg0/a;", "transactionMutex", "Lrg0/a;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n38#2,23:209\n38#2,23:240\n120#3,8:232\n129#3:263\n1#4:264\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n100#1:209,23\n117#1:240,23\n114#1:232,8\n114#1:263\n*E\n"})
public final class FileStorageConnection<T> implements StorageConnection<T> {

    @NotNull
    private final java.util.concurrent.atomic.AtomicBoolean closed;

    @NotNull
    private final InterProcessCoordinator coordinator;

    @NotNull
    private final File file;

    @NotNull
    private final Function0<Unit> onClose;

    @NotNull
    private final Serializer<T> serializer;

    @NotNull
    private final InterfaceC44082a transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$readScope$1 */
    /* JADX INFO: compiled from: FileStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.FileStorageConnection", m90122f = "FileStorage.kt", m90123i = {0, 0, 0}, m90124l = {101}, m90125m = "readScope", m90126n = {"this", "$this$use$iv", "lock"}, m90127s = {"L$0", "L$1", "Z$0"})
    public static final class C23321<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23321(FileStorageConnection<T> fileStorageConnection, Continuation<? super C23321> continuation) {
            super(continuation);
            this.this$0 = fileStorageConnection;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$writeScope$1 */
    /* JADX INFO: compiled from: FileStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.FileStorageConnection", m90122f = "FileStorage.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {InterfaceC33568bf.f69245q, 118}, m90125m = "writeScope", m90126n = {"this", "block", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C23331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23331(FileStorageConnection<T> fileStorageConnection, Continuation<? super C23331> continuation) {
            super(continuation);
            this.this$0 = fileStorageConnection;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(@NotNull File file, @NotNull Serializer<T> serializer, @NotNull InterProcessCoordinator coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = C44087f.m97144b(false, 1, null);
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    @NotNull
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.datastore.core.StorageConnection
    @Nullable
    public <R> Object readScope(@NotNull Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) throws Throwable {
        ?? c23321;
        Throwable th2;
        Closeable closeable;
        ?? r11;
        ?? r12;
        if (continuation instanceof C23321) {
            C23321 c23322 = (C23321) continuation;
            int i11 = c23322.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23322.label = i11 - Integer.MIN_VALUE;
                c23321 = c23322;
            } else {
                c23321 = new C23321(this, continuation);
            }
        } else {
            c23321 = new C23321(this, continuation);
        }
        Object obj = c23321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23321.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) c23321.Z$0;
                closeable = (Closeable) c23321.L$1;
                c23321 = (FileStorageConnection) c23321.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    r12 = c23321;
                    r11 = function3;
                    try {
                        closeable.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r11 != 0) {
                        InterfaceC44082a.a.m97142b(r12.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        closeable.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.addSuppressed(th2, th5);
                    }
                    throw th2;
                }
            }
            ResultKt.throwOnFailure(obj);
            checkNotClosed();
            boolean zM97141a = InterfaceC44082a.a.m97141a(this.transactionMutex, null, 1, null);
            try {
                FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                try {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zM97141a);
                    c23321.L$0 = this;
                    c23321.L$1 = fileReadScope;
                    c23321.Z$0 = zM97141a;
                    c23321.label = 1;
                    Object objInvoke = function3.invoke(fileReadScope, boolBoxBoolean, c23321);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    r11 = zM97141a;
                    r12 = this;
                    closeable = fileReadScope;
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r11 != 0) {
                        InterfaceC44082a.a.m97142b(r12.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    function3 = zM97141a;
                    c23321 = this;
                    closeable = fileReadScope;
                    closeable.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                function3 = zM97141a;
                c23321 = this;
                if (function3 != 0) {
                    InterfaceC44082a.a.m97142b(c23321.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (function3 != 0) {
                InterfaceC44082a.a.m97142b(c23321.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, rg0.a] */
    @Override // androidx.datastore.core.StorageConnection
    @Nullable
    public Object writeScope(@NotNull Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws IOException {
        C23331 c23331;
        File file;
        FileStorageConnection<T> fileStorageConnection;
        InterfaceC44082a interfaceC44082a;
        FileWriteScope fileWriteScope;
        Throwable th2;
        Closeable closeable;
        File file2;
        FileStorageConnection<T> fileStorageConnection2;
        if (continuation instanceof C23331) {
            c23331 = (C23331) continuation;
            int i11 = c23331.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23331.label = i11 - Integer.MIN_VALUE;
            } else {
                c23331 = new C23331(this, continuation);
            }
        } else {
            c23331 = new C23331(this, continuation);
        }
        Object obj = c23331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = c23331.label;
        try {
            try {
                try {
                    try {
                        if (r11 == 0) {
                            ResultKt.throwOnFailure(obj);
                            checkNotClosed();
                            createParentDirectories(this.file);
                            InterfaceC44082a interfaceC44082a2 = this.transactionMutex;
                            c23331.L$0 = this;
                            c23331.L$1 = function2;
                            c23331.L$2 = interfaceC44082a2;
                            c23331.label = 1;
                            if (interfaceC44082a2.mo91344d(null, c23331) != coroutine_suspended) {
                                fileStorageConnection = this;
                                interfaceC44082a = interfaceC44082a2;
                            }
                            return coroutine_suspended;
                        }
                        if (r11 != 1) {
                            if (r11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable = (Closeable) c23331.L$3;
                            File file3 = (File) c23331.L$2;
                            interfaceC44082a = (InterfaceC44082a) c23331.L$1;
                            fileStorageConnection2 = (FileStorageConnection) c23331.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                file2 = file3;
                                Unit unit = Unit.INSTANCE;
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !FileMoves_androidKt.atomicMoveTo(file2, fileStorageConnection2.file)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit2 = Unit.INSTANCE;
                                interfaceC44082a.mo91345e(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    closeable.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt.addSuppressed(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) c23331.L$2;
                        Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function3 = (Function2) c23331.L$1;
                        fileStorageConnection = (FileStorageConnection) c23331.L$0;
                        ResultKt.throwOnFailure(obj);
                        interfaceC44082a = interfaceC44082a3;
                        function2 = function3;
                        c23331.L$0 = fileStorageConnection;
                        c23331.L$1 = interfaceC44082a;
                        c23331.L$2 = file;
                        c23331.L$3 = fileWriteScope;
                        c23331.label = 2;
                        if (function2.invoke(fileWriteScope, c23331) != coroutine_suspended) {
                            file2 = file;
                            fileStorageConnection2 = fileStorageConnection;
                            closeable = fileWriteScope;
                            Unit unit3 = Unit.INSTANCE;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            Unit unit4 = Unit.INSTANCE;
                            interfaceC44082a.mo91345e(null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th2 = th6;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th2;
                    }
                    fileWriteScope = new FileWriteScope(file, fileStorageConnection.serializer);
                } catch (IOException e11) {
                    e = e11;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(fileStorageConnection.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                r11.mo91345e(null);
                throw th7;
            }
        } catch (IOException e12) {
            e = e12;
            file = coroutine_suspended;
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
