package jumio.core;

import com.jumio.core.processor.ProcessorImage;
import java.util.Comparator;
import p852kotlin.comparisons.ComparisonsKt;

/* JADX INFO: renamed from: jumio.core.U2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40603U2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((ProcessorImage.TiltedImage) obj).getTiltRange().getMaxAngle()), Integer.valueOf(((ProcessorImage.TiltedImage) obj2).getTiltRange().getMaxAngle()));
    }
}
