package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    private void commitBytesRead(int i11) {
        if (i11 != -1) {
            this.position += (long) i11;
        }
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i11, boolean z11) throws IOException {
        ensureSpaceForPeek(i11);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i11) {
            int i12 = i11;
            boolean z12 = z11;
            fromUpstream = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i12, fromUpstream, z12);
            if (fromUpstream == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + fromUpstream;
            i11 = i12;
            z11 = z12;
        }
        this.peekBufferPosition += i11;
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        if (!advancePeekPosition(i12, z11)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i12, bArr, i11, i12);
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i11, i12);
        while (fromPeekBuffer < i12 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i11, i12, fromPeekBuffer, z11);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i11, boolean z11) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i11);
        while (iSkipFromPeekBuffer < i11 && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.scratchSpace, -iSkipFromPeekBuffer, Math.min(i11, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z11);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    static {
        MediaLibraryInfo.registerModule("media3.extractor");
    }

    private void ensureSpaceForPeek(int i11) {
        int i12 = this.peekBufferPosition + i11;
        byte[] bArr = this.peekBuffer;
        if (i12 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i12, i12 + 524288));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i11, int i12) {
        int i13 = this.peekBufferLength;
        if (i13 == 0) {
            return 0;
        }
        int iMin = Math.min(i13, i12);
        System.arraycopy(this.peekBuffer, 0, bArr, i11, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int skipFromPeekBuffer(int i11) {
        int iMin = Math.min(this.peekBufferLength, i11);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i11) {
        int i12 = this.peekBufferLength - i11;
        this.peekBufferLength = i12;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i12 < bArr.length - 524288 ? new byte[65536 + i12] : bArr;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.peekBuffer = bArr2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + ((long) this.peekBufferPosition);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // androidx.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j11, E e11) throws Throwable {
        Assertions.checkArgument(j11 >= 0);
        this.position = j11;
        throw e11;
    }

    public DefaultExtractorInput(DataReader dataReader, long j11, long j12) {
        this.dataReader = dataReader;
        this.position = j11;
        this.streamLength = j12;
    }

    private int readFromUpstream(byte[] bArr, int i11, int i12, int i13, boolean z11) throws IOException {
        if (!Thread.interrupted()) {
            int i14 = this.dataReader.read(bArr, i11 + i13, i12 - i13);
            if (i14 == -1) {
                if (i13 == 0 && z11) {
                    return -1;
                }
                throw new EOFException();
            }
            return i13 + i14;
        }
        throw new InterruptedIOException();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i11, int i12) throws IOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        ensureSpaceForPeek(i12);
        int i13 = this.peekBufferLength;
        int i14 = this.peekBufferPosition;
        int i15 = i13 - i14;
        if (i15 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.readFromUpstream(this.peekBuffer, i14, i12, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i12, i15);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i11, iMin);
        defaultExtractorInput.peekBufferPosition += iMin;
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i11, int i12) throws IOException {
        peekFully(bArr, i11, i12, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i11, i12);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i11, i12, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i11) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i11);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i11, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i11, int i12) throws IOException {
        readFully(bArr, i11, i12, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i11) throws IOException {
        skipFully(i11, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i11) throws IOException {
        advancePeekPosition(i11, false);
    }
}
