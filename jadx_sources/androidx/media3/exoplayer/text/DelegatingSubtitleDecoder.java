package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;

/* JADX INFO: loaded from: classes34.dex */
final class DelegatingSubtitleDecoder extends SimpleSubtitleDecoder {
    private final SubtitleParser subtitleParser;

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i11, boolean z11) {
        if (z11) {
            this.subtitleParser.reset();
        }
        return this.subtitleParser.parseToLegacySubtitle(bArr, 0, i11);
    }

    public DelegatingSubtitleDecoder(String str, SubtitleParser subtitleParser) {
        super(str);
        this.subtitleParser = subtitleParser;
    }
}
