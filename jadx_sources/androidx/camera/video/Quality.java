package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class Quality {
    public static final Quality FHD;

    /* JADX INFO: renamed from: HD */
    public static final Quality f1930HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int QUALITY_SOURCE_HIGH_SPEED = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int QUALITY_SOURCE_REGULAR = 1;

    /* JADX INFO: renamed from: SD */
    public static final Quality f1931SD;
    public static final Quality UHD;

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        public abstract int getHighSpeedValue();

        public abstract String getName();

        public int getQualityValue(int i11) {
            if (i11 == 1) {
                return getValue();
            }
            if (i11 == 2) {
                return getHighSpeedValue();
            }
            throw new AssertionError("Unknown quality source: " + i11);
        }

        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();

        /* JADX INFO: renamed from: of */
        public static ConstantQuality m2109of(int i11, int i12, String str, List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i11, i12, str, list);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface QualitySource {
    }

    static {
        ConstantQuality constantQualityM2109of = ConstantQuality.m2109of(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, TXVodDownloadDataSource.QUALITY_480P), new Size(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P))));
        f1931SD = constantQualityM2109of;
        ConstantQuality constantQualityM2109of2 = ConstantQuality.m2109of(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f1930HD = constantQualityM2109of2;
        ConstantQuality constantQualityM2109of3 = ConstantQuality.m2109of(6, 2004, "FHD", Collections.singletonList(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P)));
        FHD = constantQualityM2109of3;
        ConstantQuality constantQualityM2109of4 = ConstantQuality.m2109of(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM2109of4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityM2109of5 = ConstantQuality.m2109of(0, 2000, "LOWEST", list);
        LOWEST = constantQualityM2109of5;
        ConstantQuality constantQualityM2109of6 = ConstantQuality.m2109of(1, 2001, "HIGHEST", list);
        HIGHEST = constantQualityM2109of6;
        NONE = ConstantQuality.m2109of(-1, -1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityM2109of5, constantQualityM2109of6, constantQualityM2109of, constantQualityM2109of2, constantQualityM2109of3, constantQualityM2109of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM2109of4, constantQualityM2109of3, constantQualityM2109of2, constantQualityM2109of);
    }

    private Quality() {
    }

    public static boolean containsQuality(Quality quality) {
        return QUALITIES.contains(quality);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }
}
