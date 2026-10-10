package androidx.media3.exoplayer.rtsp;

import androidx.media3.common.C2711C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class RtspSessionTiming {
    private static final long LIVE_START_TIME = 0;
    private static final String START_TIMING_NTP_FORMAT = "npt=%.3f-";
    public final long startTimeMs;
    public final long stopTimeMs;
    public static final RtspSessionTiming DEFAULT = new RtspSessionTiming(0, C2711C.TIME_UNSET);
    private static final Pattern NPT_RANGE_PATTERN = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    public static String getOffsetStartTimeTiming(long j11) {
        return Util.formatInvariant(START_TIMING_NTP_FORMAT, Double.valueOf(j11 / 1000.0d));
    }

    public static RtspSessionTiming parseTiming(String str) throws ParserException {
        long j11;
        Matcher matcher = NPT_RANGE_PATTERN.matcher(str);
        RtspMessageUtil.checkManifestExpression(matcher.matches(), str);
        String strGroup = matcher.group(1);
        RtspMessageUtil.checkManifestExpression(strGroup != null, str);
        long j12 = ((String) Util.castNonNull(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j11 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                RtspMessageUtil.checkManifestExpression(j11 >= j12, str);
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedManifest(strGroup2, e11);
            }
        } else {
            j11 = C2711C.TIME_UNSET;
        }
        return new RtspSessionTiming(j12, j11);
    }

    public long getDurationMs() {
        return this.stopTimeMs - this.startTimeMs;
    }

    public boolean isLive() {
        return this.stopTimeMs == C2711C.TIME_UNSET;
    }

    private RtspSessionTiming(long j11, long j12) {
        this.startTimeMs = j11;
        this.stopTimeMs = j12;
    }
}
