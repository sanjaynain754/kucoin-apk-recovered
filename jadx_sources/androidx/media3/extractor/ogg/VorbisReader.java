package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
final class VorbisReader extends StreamReader {

    @Nullable
    private VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;

    @Nullable
    private VorbisUtil.VorbisIdHeader vorbisIdHeader;

    @Nullable
    private VorbisSetup vorbisSetup;

    @VisibleForTesting
    public static int readBits(byte b11, int i11, int i12) {
        return (b11 >> i12) & (255 >>> (8 - i11));
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        try {
            return VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    public static final class VorbisSetup {
        public final VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final VorbisUtil.VorbisIdHeader idHeader;
        public final VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i11) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i11;
        }
    }

    private static int decodeBlockSize(byte b11, VorbisSetup vorbisSetup) {
        return !vorbisSetup.modes[readBits(b11, vorbisSetup.iLogModes, 1)].blockFlag ? vorbisSetup.idHeader.blockSize0 : vorbisSetup.idHeader.blockSize1;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j11, StreamReader.SetupData setupData) throws IOException {
        if (this.vorbisSetup != null) {
            Assertions.checkNotNull(setupData.format);
            return false;
        }
        VorbisSetup setupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = setupHeaders;
        if (setupHeaders == null) {
            return true;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader = setupHeaders.idHeader;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(setupHeaders.setupHeaderData);
        setupData.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_VORBIS).setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).setMetadata(VorbisUtil.parseVorbisComments(ImmutableList.copyOf(setupHeaders.commentHeader.comments))).build();
        return true;
    }

    @Nullable
    @VisibleForTesting
    public VorbisSetup readSetupHeaders(ParsableByteArray parsableByteArray) throws IOException {
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader == null) {
            this.vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        VorbisUtil.CommentHeader commentHeader = this.commentHeader;
        if (commentHeader == null) {
            this.commentHeader = VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        VorbisUtil.Mode[] vorbisModes = VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels);
        return new VorbisSetup(vorbisIdHeader, commentHeader, bArr, vorbisModes, VorbisUtil.iLog(vorbisModes.length - 1));
    }

    @VisibleForTesting
    public static void appendNumberOfSamples(ParsableByteArray parsableByteArray, long j11) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j11 & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j11 >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j11 >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j11 >>> 24) & 255);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public void onSeekEnd(long j11) {
        boolean z11;
        super.onSeekEnd(j11);
        int i11 = 0;
        if (j11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.seenFirstAudioPacket = z11;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader != null) {
            i11 = vorbisIdHeader.blockSize0;
        }
        this.previousPacketBlockSize = i11;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray parsableByteArray) {
        int i11 = 0;
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iDecodeBlockSize = decodeBlockSize(parsableByteArray.getData()[0], (VorbisSetup) Assertions.checkStateNotNull(this.vorbisSetup));
        if (this.seenFirstAudioPacket) {
            i11 = (this.previousPacketBlockSize + iDecodeBlockSize) / 4;
        }
        long j11 = i11;
        appendNumberOfSamples(parsableByteArray, j11);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = iDecodeBlockSize;
        return j11;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public void reset(boolean z11) {
        super.reset(z11);
        if (z11) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }
}
