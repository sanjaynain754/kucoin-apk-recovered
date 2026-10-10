package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: og0.d */
/* JADX INFO: compiled from: Concurrent.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"D\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u00008@@@X\u0080\u000e¢\u0006\u0012\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "b", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V", "getValue$annotations", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43050d {
    /* JADX INFO: renamed from: a */
    public static final <T> T m94562a(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public static final <T> void m94563b(@NotNull AtomicReference<T> atomicReference, T t11) {
        atomicReference.set(t11);
    }
}
