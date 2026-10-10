package p007a5;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: a5.f */
/* JADX INFO: compiled from: CircularList.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"La5/f;", "", "", "size", "<init>", "(I)V", "from", "target", SessionDescription.ATTR_LENGTH, "", "c", "(III)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "", "d", "(II)Ljava/util/List;", "I", "b", "()I", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCircularList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularList.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/CircularList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1#2:31\n1557#3:32\n1628#3,3:33\n*S KotlinDebug\n*F\n+ 1 CircularList.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/CircularList\n*L\n28#1:32\n28#1:33,3\n*E\n"})
public final class C0129f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: c */
    public final boolean m594c(int from, int target, int length) {
        int iM592a = m592a(length + from);
        if (from < iM592a) {
            return from <= target && target <= iM592a;
        }
        return (from <= target && target <= this.size) || (target >= 0 && target <= iM592a);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Integer> m595d(int from, int length) {
        IntRange intRangeUntil = RangesKt.until(0, length);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(m592a(((IntIterator) it).nextInt() + from)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final int m592a(int target) {
        int i11 = target % this.size;
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11 + this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public C0129f(int i11) {
        this.size = i11;
    }
}
