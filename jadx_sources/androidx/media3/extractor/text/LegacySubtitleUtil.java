package androidx.media3.extractor.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class LegacySubtitleUtil {
    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        boolean z11;
        int startIndex = getStartIndex(subtitle, outputOptions.startTimeUs);
        if (outputOptions.startTimeUs == C2711C.TIME_UNSET || startIndex >= subtitle.getEventTimeCount()) {
            z11 = false;
        } else {
            List<Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (cues.isEmpty()) {
                z11 = false;
            } else {
                long j11 = outputOptions.startTimeUs;
                if (j11 < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j11, eventTime - j11));
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        }
        for (int i11 = startIndex; i11 < subtitle.getEventTimeCount(); i11++) {
            outputSubtitleEvent(subtitle, i11, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z11) {
                startIndex--;
            }
            for (int i12 = 0; i12 < startIndex; i12++) {
                outputSubtitleEvent(subtitle, i12, consumer);
            }
            if (z11) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }

    private LegacySubtitleUtil() {
    }

    private static void outputSubtitleEvent(Subtitle subtitle, int i11, Consumer<CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i11);
        List<Cue> cues = subtitle.getCues(eventTime);
        if (!cues.isEmpty()) {
            if (i11 != subtitle.getEventTimeCount() - 1) {
                long eventTime2 = subtitle.getEventTime(i11 + 1) - subtitle.getEventTime(i11);
                if (eventTime2 > 0) {
                    consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static int getStartIndex(Subtitle subtitle, long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j11);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = subtitle.getEventTimeCount();
        }
        if (nextEventTimeIndex > 0 && subtitle.getEventTime(nextEventTimeIndex - 1) == j11) {
            return nextEventTimeIndex - 1;
        }
        return nextEventTimeIndex;
    }
}
