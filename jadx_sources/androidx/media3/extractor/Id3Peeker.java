package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import java.io.EOFException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Id3Peeker {
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    @Nullable
    public Metadata peekId3Data(ExtractorInput extractorInput, @Nullable Id3Decoder.FramePredicate framePredicate) throws Throwable {
        Metadata metadataDecode = null;
        int i11 = 0;
        while (true) {
            try {
                extractorInput.peekFully(this.scratch.getData(), 0, 10);
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.scratch.skipBytes(3);
                int synchSafeInt = this.scratch.readSynchSafeInt();
                int i12 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(this.scratch.getData(), 0, bArr, 0, 10);
                    extractorInput.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new Id3Decoder(framePredicate).decode(bArr, i12);
                } else {
                    extractorInput.advancePeekPosition(synchSafeInt);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i11);
        return metadataDecode;
    }
}
