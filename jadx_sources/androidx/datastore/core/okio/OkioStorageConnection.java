package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.ReadScope;
import androidx.datastore.core.StorageConnection;
import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import okio.FileSystem;
import okio.Path;
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

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\f2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, m90084d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "checkNotClosed", "()V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Lokio/FileSystem;", "Lokio/Path;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/jvm/functions/Function0;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "Lrg0/a;", "transactionMutex", "Lrg0/a;", "datastore-core-okio"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n38#2,23:231\n38#2,23:262\n120#3,8:254\n129#3:285\n1#4:286\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:231,23\n136#1:262,23\n129#1:254,8\n129#1:285\n*E\n"})
public final class OkioStorageConnection<T> implements StorageConnection<T> {

    @NotNull
    private final AtomicBoolean closed;

    @NotNull
    private final InterProcessCoordinator coordinator;

    @NotNull
    private final FileSystem fileSystem;

    @NotNull
    private final Function0<Unit> onClose;

    @NotNull
    private final Path path;

    @NotNull
    private final OkioSerializer<T> serializer;

    @NotNull
    private final InterfaceC44082a transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1 */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.okio.OkioStorageConnection", m90122f = "OkioStorage.kt", m90123i = {0, 0, 0}, m90124l = {113}, m90125m = "readScope", m90126n = {"this", "$this$use$iv", "lock"}, m90127s = {"L$0", "L$1", "Z$0"})
    public static final class C23551<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23551(OkioStorageConnection<T> okioStorageConnection, Continuation<? super C23551> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.okio.OkioStorageConnection", m90122f = "OkioStorage.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1}, m90124l = {236, 137}, m90125m = "writeScope", m90126n = {"this", "block", "parentDir", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C23561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23561(OkioStorageConnection<T> okioStorageConnection, Continuation<? super C23561> continuation) {
            super(continuation);
            this.this$0 = okioStorageConnection;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(@NotNull FileSystem fileSystem, @NotNull Path path, @NotNull OkioSerializer<T> serializer, @NotNull InterProcessCoordinator coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
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

    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:31:0x007d, B:40:0x008e, B:39:0x008b, B:36:0x0086), top: B:54:0x0022, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.datastore.core.StorageConnection
    @Nullable
    public <R> Object readScope(@NotNull Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) throws Throwable {
        ?? c23551;
        Throwable th2;
        Closeable closeable;
        ?? r11;
        ?? r12;
        if (continuation instanceof C23551) {
            C23551 c23552 = (C23551) continuation;
            int i11 = c23552.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23552.label = i11 - Integer.MIN_VALUE;
                c23551 = c23552;
            } else {
                c23551 = new C23551(this, continuation);
            }
        } else {
            c23551 = new C23551(this, continuation);
        }
        Object obj = c23551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23551.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) c23551.Z$0;
                closeable = (Closeable) c23551.L$1;
                c23551 = (OkioStorageConnection) c23551.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    r12 = c23551;
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
                OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zM97141a);
                    c23551.L$0 = this;
                    c23551.L$1 = okioReadScope;
                    c23551.Z$0 = zM97141a;
                    c23551.label = 1;
                    Object objInvoke = function3.invoke(okioReadScope, boolBoxBoolean, c23551);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    r11 = zM97141a;
                    r12 = this;
                    closeable = okioReadScope;
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
                    c23551 = this;
                    closeable = okioReadScope;
                    closeable.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                function3 = zM97141a;
                c23551 = this;
                if (function3 != 0) {
                    InterfaceC44082a.a.m97142b(c23551.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (function3 != 0) {
                InterfaceC44082a.a.m97142b(c23551.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r10v19, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r10v23, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, okio.Path] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r5v4, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.datastore.core.okio.OkioStorageConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.core.StorageConnection
    @Nullable
    public Object writeScope(@NotNull Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C23561 c23561;
        ?? r11;
        ?? r12;
        ?? Resolve;
        Path pathParent;
        OkioWriteScope okioWriteScope;
        Throwable th2;
        Closeable closeable;
        ?? r13;
        ?? r14;
        ?? r15;
        if (continuation instanceof C23561) {
            c23561 = (C23561) continuation;
            int i11 = c23561.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23561.label = i11 - Integer.MIN_VALUE;
            } else {
                c23561 = new C23561(this, continuation);
            }
        } else {
            c23561 = new C23561(this, continuation);
        }
        Object obj = c23561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r16 = c23561.label;
        try {
            try {
                try {
                    try {
                        try {
                            if (r16 == 0) {
                                ResultKt.throwOnFailure(obj);
                                checkNotClosed();
                                pathParent = this.path.parent();
                                if (pathParent == null) {
                                    throw new IllegalStateException("must have a parent path");
                                }
                                this.fileSystem.createDirectories(pathParent, false);
                                InterfaceC44082a interfaceC44082a = this.transactionMutex;
                                c23561.L$0 = this;
                                c23561.L$1 = function2;
                                c23561.L$2 = pathParent;
                                c23561.L$3 = interfaceC44082a;
                                c23561.label = 1;
                                if (interfaceC44082a.mo91344d(null, c23561) != coroutine_suspended) {
                                    r12 = this;
                                    r11 = interfaceC44082a;
                                }
                                return coroutine_suspended;
                            }
                            if (r16 != 1) {
                                if (r16 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                closeable = (Closeable) c23561.L$3;
                                Path path = (Path) c23561.L$2;
                                InterfaceC44082a interfaceC44082a2 = (InterfaceC44082a) c23561.L$1;
                                OkioStorageConnection okioStorageConnection = (OkioStorageConnection) c23561.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    r14 = okioStorageConnection;
                                    r13 = path;
                                    r15 = interfaceC44082a2;
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
                                    if (r14.fileSystem.exists(r13)) {
                                        r14.fileSystem.atomicMove(r13, r14.path);
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    r15.mo91345e(null);
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
                            InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) c23561.L$3;
                            pathParent = (Path) c23561.L$2;
                            Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function3 = (Function2) c23561.L$1;
                            OkioStorageConnection okioStorageConnection2 = (OkioStorageConnection) c23561.L$0;
                            ResultKt.throwOnFailure(obj);
                            r11 = interfaceC44082a3;
                            function2 = function3;
                            r12 = okioStorageConnection2;
                            c23561.L$0 = r12;
                            c23561.L$1 = r11;
                            c23561.L$2 = Resolve;
                            c23561.L$3 = okioWriteScope;
                            c23561.label = 2;
                            if (function2.invoke(okioWriteScope, c23561) != coroutine_suspended) {
                                r13 = Resolve;
                                closeable = okioWriteScope;
                                r14 = r12;
                                r15 = r11;
                                Unit unit3 = Unit.INSTANCE;
                                closeable.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r14.fileSystem.exists(r13)) {
                                    r14.fileSystem.atomicMove(r13, r14.path);
                                }
                                Unit unit4 = Unit.INSTANCE;
                                r15.mo91345e(null);
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th6) {
                            th2 = th6;
                            closeable = okioWriteScope;
                            closeable.close();
                            throw th2;
                        }
                        r12.fileSystem.delete(Resolve, false);
                        okioWriteScope = new OkioWriteScope(r12.fileSystem, Resolve, r12.serializer);
                    } catch (IOException e11) {
                        e = e11;
                        if (r12.fileSystem.exists(Resolve)) {
                            try {
                                r12.fileSystem.delete(Resolve);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    Resolve = pathParent.resolve(r12.path.name() + ".tmp");
                } catch (Throwable th7) {
                    th = th7;
                    r11.mo91345e(null);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                r12 = c23561;
                r11 = r16;
                Resolve = coroutine_suspended;
            }
        } catch (Throwable th8) {
            th = th8;
            r11 = r16;
            r11.mo91345e(null);
            throw th;
        }
    }
}
