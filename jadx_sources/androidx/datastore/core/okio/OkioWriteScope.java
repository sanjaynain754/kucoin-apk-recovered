package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:232\n66#2:237\n52#2,21:238\n60#2,10:259\n57#2,2:269\n71#2,2:271\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n214#1:231\n214#1:232,5\n215#1:237\n215#1:238,21\n214#1:259,10\n214#1:269,2\n214#1:271,2\n*E\n"})
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1 */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.okio.OkioWriteScope", m90122f = "OkioStorage.kt", m90123i = {0, 0, 0}, m90124l = {216}, m90125m = "writeData", m90126n = {"$this$use$iv", "handle", "$this$use$iv"}, m90127s = {"L$0", "L$1", "L$2"})
    public static final class C23571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23571(OkioWriteScope<T> okioWriteScope, Continuation<? super C23571> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(@NotNull FileSystem fileSystem, @NotNull Path path, @NotNull OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioWriteScope$writeData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.datastore.core.okio.OkioSerializer] */
    @Override // androidx.datastore.core.WriteScope
    @Nullable
    public Object writeData(T t11, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ?? c23571;
        ?? OpenReadWrite;
        Unit unit;
        Throwable th2;
        Closeable closeable;
        ?? r11;
        Throwable th3;
        Unit unit2;
        if (continuation instanceof C23571) {
            C23571 c23572 = (C23571) continuation;
            int i11 = c23572.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23572.label = i11 - Integer.MIN_VALUE;
                c23571 = c23572;
            } else {
                c23571 = new C23571(this, continuation);
            }
        } else {
            c23571 = new C23571(this, continuation);
        }
        Object obj = c23571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23571.label;
        Throwable th4 = null;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                checkClose();
                OpenReadWrite = getFileSystem().openReadWrite(getPath());
                try {
                    BufferedSink bufferedSinkBuffer = Okio.buffer(FileHandle.sink$default(OpenReadWrite, 0L, 1, null));
                    try {
                        OkioSerializer<T> serializer = getSerializer();
                        c23571.L$0 = OpenReadWrite;
                        c23571.L$1 = OpenReadWrite;
                        c23571.L$2 = bufferedSinkBuffer;
                        c23571.label = 1;
                        if (serializer.writeTo(t11, bufferedSinkBuffer, c23571) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ?? r12 = OpenReadWrite;
                        r11 = r12;
                        closeable = bufferedSinkBuffer;
                        c23571 = r12;
                    } catch (Throwable th5) {
                        c23571 = OpenReadWrite;
                        th2 = th5;
                        closeable = bufferedSinkBuffer;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th3 = th2;
                        unit2 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (OpenReadWrite != 0) {
                        try {
                            OpenReadWrite.close();
                        } catch (Throwable th7) {
                            ExceptionsKt.addSuppressed(th, th7);
                        }
                    }
                    th4 = th;
                    unit = null;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) c23571.L$2;
                FileHandle fileHandle = (FileHandle) c23571.L$1;
                c23571 = (Closeable) c23571.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c23571 = c23571;
                    r11 = fileHandle;
                } catch (Throwable th8) {
                    th2 = th8;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th9) {
                            ExceptionsKt.addSuppressed(th2, th9);
                        }
                    }
                    th3 = th2;
                    unit2 = null;
                }
            }
            r11.flush();
            unit2 = Unit.INSTANCE;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th10) {
                    th3 = th10;
                }
            }
            th3 = null;
            if (th3 != null) {
                throw th3;
            }
            Intrinsics.checkNotNull(unit2);
            unit = Unit.INSTANCE;
            if (c23571 != 0) {
                try {
                    c23571.close();
                } catch (Throwable th11) {
                    th4 = th11;
                }
            }
            if (th4 != null) {
                throw th4;
            }
            Intrinsics.checkNotNull(unit);
            return Unit.INSTANCE;
        } catch (Throwable th12) {
            th = th12;
            OpenReadWrite = c23571;
        }
    }
}
