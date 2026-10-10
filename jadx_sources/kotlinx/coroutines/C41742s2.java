package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.ThreadLocal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.s2 */
/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/r2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/r2;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n263#1:286\n1#2:287\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n284#1:286\n*E\n"})
public final class C41742s2 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41731r2<T> m91218a(@NotNull ThreadLocal<T> threadLocal, T t11) {
        return new ThreadLocal(t11, threadLocal);
    }
}
