package androidx.media3.extractor.text.webvtt;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.tencent.bugly.proguard.C33844oi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class WebvttParserUtil {
    private static final Pattern COMMENT = Pattern.compile("^NOTE([ \t].*)?$");
    private static final String WEBVTT_HEADER = "WEBVTT";

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, "\\.");
        long j11 = 0;
        for (String str2 : Util.split(strArrSplitAtFirst[0], C33844oi.f71346o)) {
            j11 = (j11 * 60) + Long.parseLong(str2);
        }
        long j12 = j11 * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j12 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j12 * 1000;
    }

    private WebvttParserUtil() {
    }

    @Nullable
    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
        String line;
        while (true) {
            String line2 = parsableByteArray.readLine();
            if (line2 != null) {
                if (COMMENT.matcher(line2).matches()) {
                    do {
                        line = parsableByteArray.readLine();
                        if (line == null) {
                            break;
                        }
                    } while (!line.isEmpty());
                } else {
                    Matcher matcher = WebvttCueParser.CUE_HEADER_PATTERN.matcher(line2);
                    if (matcher.matches()) {
                        return matcher;
                    }
                }
            } else {
                return null;
            }
        }
    }

    public static boolean isWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        String line = parsableByteArray.readLine();
        if (line != null && line.startsWith(WEBVTT_HEADER)) {
            return true;
        }
        return false;
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) throws ParserException {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }
}
