package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.AbstractC43081x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: og0.y */
/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0010"}, m90084d2 = {"Log0/y;", "Log0/x;", ExifInterface.LATITUDE_SOUTH, "", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/lang/Object;)Z", "isClosed", "b", "(Ljava/lang/Object;)Log0/x;", "getSegment$annotations", "()V", "segment", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@JvmInline
public final class C43082y<S extends AbstractC43081x<S>> {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final S m94647b(Object obj) {
        if (obj != C43046b.f95234a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m94648c(Object obj) {
        if (obj == C43046b.f95234a) {
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static <S extends AbstractC43081x<S>> Object m94646a(@Nullable Object obj) {
        return obj;
    }
}
