package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes34.dex */
final class StreamFormatChunk implements AviChunk {
    private static final String TAG = "StreamFormatChunk";
    public final Format format;

    @Nullable
    private static String getMimeTypeFromTag(int i11) {
        if (i11 == 1) {
            return MimeTypes.AUDIO_RAW;
        }
        if (i11 == 85) {
            return MimeTypes.AUDIO_MPEG;
        }
        if (i11 == 255) {
            return "audio/mp4a-latm";
        }
        if (i11 == 8192) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i11 != 8193) {
            return null;
        }
        return MimeTypes.AUDIO_DTS;
    }

    @Nullable
    private static AviChunk parseBitmapInfoHeader(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        String mimeTypeFromCompression = getMimeTypeFromCompression(littleEndianInt3);
        if (mimeTypeFromCompression != null) {
            Format.Builder builder = new Format.Builder();
            builder.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
            return new StreamFormatChunk(builder.build());
        }
        Log.m2961w(TAG, "Ignoring track with unsupported compression " + littleEndianInt3);
        return null;
    }

    @Nullable
    public static AviChunk parseFrom(int i11, ParsableByteArray parsableByteArray) {
        if (i11 == 2) {
            return parseBitmapInfoHeader(parsableByteArray);
        }
        if (i11 == 1) {
            return parseWaveFormatEx(parsableByteArray);
        }
        Log.m2961w(TAG, "Ignoring strf box for unsupported track type: " + Util.getTrackTypeString(i11));
        return null;
    }

    public StreamFormatChunk(Format format) {
        this.format = format;
    }

    @Nullable
    private static String getMimeTypeFromCompression(int i11) {
        switch (i11) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return MimeTypes.VIDEO_MP42;
            case 859066445:
                return MimeTypes.VIDEO_MP43;
            case 1196444237:
            case 1735420525:
                return MimeTypes.VIDEO_MJPEG;
            default:
                return null;
        }
    }

    @Nullable
    private static AviChunk parseWaveFormatEx(ParsableByteArray parsableByteArray) {
        int littleEndianUnsignedShort;
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        String mimeTypeFromTag = getMimeTypeFromTag(littleEndianUnsignedShort2);
        if (mimeTypeFromTag == null) {
            Log.m2961w(TAG, "Ignoring track with unsupported format tag " + littleEndianUnsignedShort2);
            return null;
        }
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = Util.getPcmEncoding(parsableByteArray.readLittleEndianUnsignedShort());
        if (parsableByteArray.bytesLeft() > 0) {
            littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        } else {
            littleEndianUnsignedShort = 0;
        }
        byte[] bArr = new byte[littleEndianUnsignedShort];
        parsableByteArray.readBytes(bArr, 0, littleEndianUnsignedShort);
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(mimeTypeFromTag).setChannelCount(littleEndianUnsignedShort3).setSampleRate(littleEndianInt);
        if (MimeTypes.AUDIO_RAW.equals(mimeTypeFromTag) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if ("audio/mp4a-latm".equals(mimeTypeFromTag) && littleEndianUnsignedShort > 0) {
            builder.setInitializationData(ImmutableList.m13440of(bArr));
        }
        return new StreamFormatChunk(builder.build());
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return AviExtractor.FOURCC_strf;
    }
}
