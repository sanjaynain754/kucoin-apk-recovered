package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ForwardingExtractorInput;

/* JADX INFO: loaded from: classes34.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {
    private final long startOffset;

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j11, E e11) throws Throwable {
        super.setRetryPosition(j11 + this.startOffset, e11);
    }

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j11) {
        boolean z11;
        super(extractorInput);
        if (extractorInput.getPosition() >= j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        this.startOffset = j11;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.startOffset;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.startOffset;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.startOffset;
    }
}
