package p549q5;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: q5.b */
/* JADX INFO: compiled from: BoundedLinkedHashSet.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lq5/b;", ExifInterface.LONGITUDE_EAST, "", "", "maxSize", "<init>", "(I)V", "o", "", "b", "(Ljava/lang/Object;)Z", "key", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "linkedHashSet", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43613b<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<E> linkedHashSet;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m95972a(E key) {
        try {
            if (this.linkedHashSet.size() == this.maxSize) {
                LinkedHashSet<E> linkedHashSet = this.linkedHashSet;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.linkedHashSet.remove(key);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.linkedHashSet.add(key);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m95973b(E o11) {
        return this.linkedHashSet.contains(o11);
    }

    public C43613b(int i11) {
        this.maxSize = i11;
        this.linkedHashSet = new LinkedHashSet<>(i11);
    }
}
