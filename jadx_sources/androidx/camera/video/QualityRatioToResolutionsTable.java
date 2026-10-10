package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import com.google.auto.value.AutoValue;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
class QualityRatioToResolutionsTable {
    private static final Map<Integer, Rational> sAspectRatioMap;
    private static final Map<Quality, Range<Integer>> sQualityRangeMap;
    private final Map<QualityRatio, List<Size>> mTable = new HashMap();

    @AutoValue
    public static abstract class QualityRatio {
        public abstract int getAspectRatio();

        public abstract Quality getQuality();

        /* JADX INFO: renamed from: of */
        public static QualityRatio m2111of(Quality quality, int i11) {
            return new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality, i11);
        }
    }

    static {
        HashMap map = new HashMap();
        sQualityRangeMap = map;
        map.put(Quality.UHD, Range.create(2160, 4319));
        map.put(Quality.FHD, Range.create(Integer.valueOf(TXVodDownloadDataSource.QUALITY_1080P), 1439));
        map.put(Quality.f1930HD, Range.create(720, 1079));
        map.put(Quality.f1931SD, Range.create(241, Integer.valueOf(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD)));
        HashMap map2 = new HashMap();
        sAspectRatioMap = map2;
        map2.put(0, AspectRatioUtil.ASPECT_RATIO_4_3);
        map2.put(1, AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    private static Integer findMappedAspectRatio(Size size) {
        for (Map.Entry<Integer, Rational> entry : sAspectRatioMap.entrySet()) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, entry.getValue(), SizeUtil.RESOLUTION_QVGA)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static Quality findMappedQuality(Size size) {
        for (Map.Entry<Quality, Range<Integer>> entry : sQualityRangeMap.entrySet()) {
            if (entry.getValue().contains(Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    private List<Size> getQualityRatioRow(Quality quality, int i11) {
        return this.mTable.get(QualityRatio.m2111of(quality, i11));
    }

    private void sortQualityRatioRow(Map<Quality, Size> map) {
        for (Map.Entry<QualityRatio, List<Size>> entry : this.mTable.entrySet()) {
            Size size = map.get(entry.getKey().getQuality());
            if (size != null) {
                final int area = SizeUtil.getArea(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: androidx.camera.video.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return QualityRatioToResolutionsTable.m2110a(area, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }

    public QualityRatioToResolutionsTable(List<Size> list, Map<Quality, Size> map) {
        for (Quality quality : sQualityRangeMap.keySet()) {
            this.mTable.put(QualityRatio.m2111of(quality, -1), new ArrayList());
            Iterator<Integer> it = sAspectRatioMap.keySet().iterator();
            while (it.hasNext()) {
                this.mTable.put(QualityRatio.m2111of(quality, it.next().intValue()), new ArrayList());
            }
        }
        addProfileSizesToTable(map);
        addResolutionsToTable(list);
        sortQualityRatioRow(map);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m2110a(int i11, Size size, Size size2) {
        return Math.abs(SizeUtil.getArea(size) - i11) - Math.abs(SizeUtil.getArea(size2) - i11);
    }

    private void addProfileSizesToTable(Map<Quality, Size> map) {
        for (Map.Entry<Quality, Size> entry : map.entrySet()) {
            List<Size> qualityRatioRow = getQualityRatioRow(entry.getKey(), -1);
            Objects.requireNonNull(qualityRatioRow);
            qualityRatioRow.add(entry.getValue());
        }
    }

    private void addResolutionsToTable(List<Size> list) {
        Integer numFindMappedAspectRatio;
        for (Size size : list) {
            Quality qualityFindMappedQuality = findMappedQuality(size);
            if (qualityFindMappedQuality != null && (numFindMappedAspectRatio = findMappedAspectRatio(size)) != null) {
                List<Size> qualityRatioRow = getQualityRatioRow(qualityFindMappedQuality, numFindMappedAspectRatio.intValue());
                Objects.requireNonNull(qualityRatioRow);
                qualityRatioRow.add(size);
            }
        }
    }

    public List<Size> getResolutions(Quality quality, int i11) {
        List<Size> qualityRatioRow = getQualityRatioRow(quality, i11);
        if (qualityRatioRow != null) {
            return new ArrayList(qualityRatioRow);
        }
        return new ArrayList(0);
    }
}
