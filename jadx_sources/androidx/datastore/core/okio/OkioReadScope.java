package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.FileNotFoundException;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0004J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "getFileSystem", "()Lokio/FileSystem;", "getPath", "()Lokio/Path;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "checkClose", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:233\n60#2,10:239\n57#2,2:249\n71#2,2:251\n66#2:253\n52#2,5:255\n60#2,10:261\n57#2,2:271\n71#2,2:273\n67#3:232\n68#3:238\n67#3:254\n68#3:260\n1#4:275\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n177#1:231\n177#1:233,5\n177#1:239,10\n177#1:249,2\n177#1:251,2\n187#1:253\n187#1:255,5\n187#1:261,10\n187#1:271,2\n187#1:273,2\n177#1:232\n177#1:238\n187#1:254\n187#1:260\n*E\n"})
public class OkioReadScope<T> implements ReadScope<T> {

    @NotNull
    private final AtomicBoolean closed;

    @NotNull
    private final FileSystem fileSystem;

    @NotNull
    private final Path path;

    @NotNull
    private final OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1 */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.okio.OkioReadScope", m90122f = "OkioStorage.kt", m90123i = {0, 0, 1}, m90124l = {180, 187}, m90125m = "readData$suspendImpl", m90126n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, m90127s = {"L$0", "L$1", "L$0"})
    public static final class C23521<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23521(OkioReadScope<T> okioReadScope, Continuation<? super C23521> continuation) {
            super(continuation);
            this.this$0 = okioReadScope;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(@NotNull FileSystem fileSystem, @NotNull Path path, @NotNull OkioSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090 A[Catch: FileNotFoundException -> 0x008a, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0094 A[Catch: FileNotFoundException -> 0x008a, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* synthetic */ <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, Continuation<? super T> continuation) throws Throwable {
        C23521 c23521;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        Throwable th2;
        BufferedSource bufferedSourceBuffer;
        Throwable th3;
        Closeable closeable2;
        Object from;
        Throwable th4;
        if (continuation instanceof C23521) {
            c23521 = (C23521) continuation;
            int i11 = c23521.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23521.label = i11 - Integer.MIN_VALUE;
            } else {
                c23521 = new C23521(okioReadScope, continuation);
            }
        } else {
            c23521 = new C23521(okioReadScope, continuation);
        }
        Object obj = c23521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23521.label;
        Throwable th5 = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            okioReadScope.checkClose();
            try {
                BufferedSource bufferedSourceBuffer2 = Okio.buffer(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                try {
                    OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                    c23521.L$0 = okioReadScope;
                    c23521.L$1 = bufferedSourceBuffer2;
                    c23521.label = 1;
                    Object from2 = okioSerializer.readFrom(bufferedSourceBuffer2, c23521);
                    if (from2 != coroutine_suspended) {
                        closeable = bufferedSourceBuffer2;
                        obj = from2;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th4 = null;
                        if (th4 == null) {
                            throw th4;
                        }
                        Intrinsics.checkNotNull(obj);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    okioReadScope2 = okioReadScope;
                    closeable = bufferedSourceBuffer2;
                    th2 = th6;
                    if (closeable != null) {
                        closeable.close();
                    }
                    th4 = th2;
                    obj = null;
                }
            } catch (FileNotFoundException unused) {
                if (((OkioReadScope) okioReadScope).fileSystem.exists(((OkioReadScope) okioReadScope).path)) {
                    return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                }
                bufferedSourceBuffer = Okio.buffer(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                c23521.L$0 = bufferedSourceBuffer;
                c23521.L$1 = null;
                c23521.label = 2;
                from = okioSerializer2.readFrom(bufferedSourceBuffer, c23521);
                if (from != coroutine_suspended) {
                    obj = from;
                    closeable2 = bufferedSourceBuffer;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    if (th5 != null) {
                        throw th5;
                    }
                    Intrinsics.checkNotNull(obj);
                    return obj;
                }
            }
        } else {
            if (i12 == 1) {
                closeable = (Closeable) c23521.L$1;
                okioReadScope2 = (OkioReadScope) c23521.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th7) {
                            th4 = th7;
                        }
                    }
                    th4 = null;
                } catch (Throwable th8) {
                    th2 = th8;
                    if (closeable != null) {
                        try {
                            try {
                                closeable.close();
                            } catch (Throwable th9) {
                                ExceptionsKt.addSuppressed(th2, th9);
                            }
                        } catch (FileNotFoundException unused2) {
                            okioReadScope = okioReadScope2;
                            if (((OkioReadScope) okioReadScope).fileSystem.exists(((OkioReadScope) okioReadScope).path)) {
                                return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                            }
                            bufferedSourceBuffer = Okio.buffer(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                            try {
                                OkioSerializer<T> okioSerializer3 = ((OkioReadScope) okioReadScope).serializer;
                                c23521.L$0 = bufferedSourceBuffer;
                                c23521.L$1 = null;
                                c23521.label = 2;
                                from = okioSerializer3.readFrom(bufferedSourceBuffer, c23521);
                                if (from != coroutine_suspended) {
                                    obj = from;
                                    closeable2 = bufferedSourceBuffer;
                                    if (closeable2 != null) {
                                        closeable2.close();
                                    }
                                    if (th5 != null) {
                                        throw th5;
                                    }
                                    Intrinsics.checkNotNull(obj);
                                    return obj;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th10) {
                                th3 = th10;
                                closeable2 = bufferedSourceBuffer;
                                if (closeable2 != null) {
                                    closeable2.close();
                                }
                                th5 = th3;
                                obj = null;
                            }
                        }
                    }
                    th4 = th2;
                    obj = null;
                }
                if (th4 == null) {
                    throw th4;
                }
                Intrinsics.checkNotNull(obj);
                return obj;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) c23521.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th11) {
                        th5 = th11;
                    }
                }
            } catch (Throwable th12) {
                th3 = th12;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th13) {
                        ExceptionsKt.addSuppressed(th3, th13);
                    }
                }
                th5 = th3;
                obj = null;
            }
        }
        if (th5 != null) {
            throw th5;
        }
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    public final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    @NotNull
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    @NotNull
    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    @Nullable
    public Object readData(@NotNull Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
