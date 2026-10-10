package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m90084d2 = {"Landroidx/datastore/core/FileReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFile", "()Ljava/io/File;", "getSerializer", "()Landroidx/datastore/core/Serializer;", "checkNotClosed", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public class FileReadScope<T> implements ReadScope<T> {

    @NotNull
    private final java.util.concurrent.atomic.AtomicBoolean closed;

    @NotNull
    private final File file;

    @NotNull
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileReadScope$readData$1 */
    /* JADX INFO: compiled from: FileStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.FileReadScope", m90122f = "FileStorage.kt", m90123i = {0}, m90124l = {169, 178}, m90125m = "readData$suspendImpl", m90126n = {"$this"}, m90127s = {"L$0"})
    public static final class C23291<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23291(FileReadScope<T> fileReadScope, Continuation<? super C23291> continuation) {
            super(continuation);
            this.this$0 = fileReadScope;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public FileReadScope(@NotNull File file, @NotNull Serializer<T> serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v21 */
    public static /* synthetic */ <T> Object readData$suspendImpl(FileReadScope<T> fileReadScope, Continuation<? super T> continuation) {
        C23291 c23291;
        Throwable th2;
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        Throwable th3;
        if (continuation instanceof C23291) {
            c23291 = (C23291) continuation;
            int i11 = c23291.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23291.label = i11 - Integer.MIN_VALUE;
            } else {
                c23291 = new C23291(fileReadScope, continuation);
            }
        } else {
            c23291 = new C23291(fileReadScope, continuation);
        }
        Object obj = c23291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = c23291.label;
        try {
            if (r11 != 0) {
                if (r11 == 1) {
                    closeable2 = (java.io.Closeable) c23291.L$1;
                    r11 = (FileReadScope) c23291.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        p852kotlin.p407io.CloseableKt.closeFinally(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            p852kotlin.p407io.CloseableKt.closeFinally(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) c23291.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    p852kotlin.p407io.CloseableKt.closeFinally(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        p852kotlin.p407io.CloseableKt.closeFinally(closeable, th2);
                        throw th7;
                    }
                }
            }
            ResultKt.throwOnFailure(obj);
            fileReadScope.checkNotClosed();
            try {
                FileInputStream fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    Serializer<T> serializer = ((FileReadScope) fileReadScope).serializer;
                    c23291.L$0 = fileReadScope;
                    c23291.L$1 = fileInputStream;
                    c23291.label = 1;
                    Object from = serializer.readFrom(fileInputStream, c23291);
                    if (from != coroutine_suspended) {
                        closeable2 = fileInputStream;
                        obj = from;
                        p852kotlin.p407io.CloseableKt.closeFinally(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    r11 = fileReadScope;
                    closeable2 = fileInputStream;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (!((FileReadScope) fileReadScope).file.exists()) {
                    return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    Serializer<T> serializer2 = ((FileReadScope) fileReadScope).serializer;
                    c23291.L$0 = fileInputStream2;
                    c23291.L$1 = null;
                    c23291.label = 2;
                    Object from2 = serializer2.readFrom(fileInputStream2, c23291);
                    if (from2 != coroutine_suspended) {
                        obj = from2;
                        closeable = fileInputStream2;
                        p852kotlin.p407io.CloseableKt.closeFinally(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream2;
                    throw th2;
                }
            }
            return coroutine_suspended;
        } catch (FileNotFoundException unused2) {
            fileReadScope = (FileReadScope<T>) r11;
        }
    }

    public final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    @Nullable
    public Object readData(@NotNull Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
