package androidx.media3.exoplayer.mediacodec;

import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    @RequiresApi(29)
    public static final class Api29 {
        private static int evaluateH264RequiredSupport(boolean z11) {
            List supportedPerformancePoints;
            try {
                Format formatBuild = new Format.Builder().setSampleMimeType("video/avc").build();
                if (formatBuild.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, formatBuild, z11, false);
                    for (int i11 = 0; i11 < decoderInfosSoftMatch.size(); i11++) {
                        if (decoderInfosSoftMatch.get(i11).capabilities != null && decoderInfosSoftMatch.get(i11).capabilities.getVideoCapabilities() != null && (supportedPerformancePoints = decoderInfosSoftMatch.get(i11).capabilities.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            C3236p.m3343a();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, C3235o.m3342a(1280, 720, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int evaluatePerformancePointCoverage(List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (C3233m.m3340a(list.get(i11)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            if (Util.SDK_INT >= 35) {
                return false;
            }
            int iEvaluateH264RequiredSupport = evaluateH264RequiredSupport(false);
            int iEvaluateH264RequiredSupport2 = evaluateH264RequiredSupport(true);
            if (iEvaluateH264RequiredSupport == 0) {
                return true;
            }
            if (iEvaluateH264RequiredSupport2 == 0) {
                return iEvaluateH264RequiredSupport != 2;
            }
            return (iEvaluateH264RequiredSupport == 2 && iEvaluateH264RequiredSupport2 == 2) ? false : true;
        }

        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            C3236p.m3343a();
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, C3235o.m3342a(i11, i12, (int) d11));
            if (iEvaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }
    }

    public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        if (Util.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i11, i12, d11);
        }
        return 0;
    }

    private MediaCodecPerformancePointCoverageProvider() {
    }
}
