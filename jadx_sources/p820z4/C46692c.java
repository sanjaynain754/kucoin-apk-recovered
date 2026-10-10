package p820z4;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: z4.c */
/* JADX INFO: compiled from: FpsCompressorInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u00020\f*\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lz4/c;", "", "", "maxFpsLimit", "<init>", "(I)V", "durationMs", "frameCount", "targetFps", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(III)Ljava/util/Map;", "", "b", "(I)F", "I", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFpsCompressorInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FpsCompressorInfo.kt\ncom/facebook/fresco/animation/bitmap/preparation/loadframe/FpsCompressorInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,113:1\n1279#2,2:114\n1293#2,4:116\n216#3,2:120\n*S KotlinDebug\n*F\n+ 1 FpsCompressorInfo.kt\ncom/facebook/fresco/animation/bitmap/preparation/loadframe/FpsCompressorInfo\n*L\n44#1:114,2\n44#1:116,4\n67#1:120,2\n*E\n"})
public final class C46692c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxFpsLimit;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<Integer, Integer> m102929a(int durationMs, int frameCount, int targetFps) {
        float fCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(targetFps, 1), this.maxFpsLimit) * m102930b(durationMs), 0.0f);
        float f11 = frameCount;
        float fCoerceAtMost = f11 / RangesKt.coerceAtMost(fCoerceAtLeast, f11);
        int i11 = 0;
        IntRange intRangeUntil = RangesKt.until(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10)), 16));
        for (Integer num : intRangeUntil) {
            int iIntValue = num.intValue();
            if (((int) (iIntValue % fCoerceAtMost)) == 0) {
                i11 = iIntValue;
            }
            linkedHashMap.put(num, Integer.valueOf(i11));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final float m102930b(int i11) {
        return i11 / 1000.0f;
    }

    public C46692c(int i11) {
        this.maxFpsLimit = i11;
    }
}
