package androidx.media3.extractor.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface SubtitleParser {

    public interface Factory {
        public static final Factory UNSUPPORTED = new Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(Format format) {
                return false;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public SubtitleParser create(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    public static class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(C2711C.TIME_UNSET, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j11) {
            return new OutputOptions(j11, true);
        }

        public static OutputOptions onlyCuesAfter(long j11) {
            return new OutputOptions(j11, false);
        }

        private OutputOptions(long j11, boolean z11) {
            this.startTimeUs = j11;
            this.outputAllCues = z11;
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i11, int i12, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    default void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default Subtitle parseToLegacySubtitle(byte[] bArr, int i11, int i12) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        OutputOptions outputOptions = OutputOptions.ALL;
        Objects.requireNonNull(builder);
        parse(bArr, i11, i12, outputOptions, new Consumer() { // from class: androidx.media3.extractor.text.d
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                builder.add((CuesWithTiming) obj);
            }
        });
        return new CuesWithTimingSubtitle(builder.build());
    }

    default void reset() {
    }
}
