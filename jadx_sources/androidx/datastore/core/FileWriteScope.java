package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Landroidx/datastore/core/FileWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.FileWriteScope$writeData$1 */
    /* JADX INFO: compiled from: FileStorage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.FileWriteScope", m90122f = "FileStorage.kt", m90123i = {0}, m90124l = {201}, m90125m = "writeData", m90126n = {"stream"}, m90127s = {"L$1"})
    public static final class C23341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23341(FileWriteScope<T> fileWriteScope, Continuation<? super C23341> continuation) {
            super(continuation);
            this.this$0 = fileWriteScope;
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
    public FileWriteScope(@NotNull File file, @NotNull Serializer<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    @Nullable
    public Object writeData(T t11, @NotNull Continuation<? super Unit> continuation) {
        C23341 c23341;
        java.io.Closeable closeable;
        FileOutputStream fileOutputStream;
        if (continuation instanceof C23341) {
            c23341 = (C23341) continuation;
            int i11 = c23341.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23341.label = i11 - Integer.MIN_VALUE;
            } else {
                c23341 = new C23341(this, continuation);
            }
        } else {
            c23341 = new C23341(this, continuation);
        }
        Object obj = c23341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23341.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            checkNotClosed();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getFile());
            try {
                Serializer<T> serializer = getSerializer();
                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream2);
                c23341.L$0 = fileOutputStream2;
                c23341.L$1 = fileOutputStream2;
                c23341.label = 1;
                if (serializer.writeTo(t11, uncloseableOutputStream, c23341) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) c23341.L$1;
            closeable = (java.io.Closeable) c23341.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    p852kotlin.p407io.CloseableKt.closeFinally(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.INSTANCE;
        p852kotlin.p407io.CloseableKt.closeFinally(closeable, null);
        return Unit.INSTANCE;
    }
}
