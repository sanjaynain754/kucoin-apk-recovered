package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: og0.v */
/* JADX INFO: compiled from: ResizableAtomicArray.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Log0/v;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "initialLength", "<init>", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "index", "b", "(I)Ljava/lang/Object;", "value", "", "c", "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43079v<T> {

    @NotNull
    private volatile AtomicReferenceArray<T> array;

    /* JADX INFO: renamed from: a */
    public final int m94639a() {
        return this.array.length();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m94640b(int index) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (index < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(index);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m94641c(int index, @Nullable T value) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (index < length) {
            atomicReferenceArray.set(index, value);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(RangesKt.coerceAtLeast(index + 1, length * 2));
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(index, value);
        this.array = atomicReferenceArray2;
    }

    public C43079v(int i11) {
        this.array = new AtomicReferenceArray<>(i11);
    }
}
