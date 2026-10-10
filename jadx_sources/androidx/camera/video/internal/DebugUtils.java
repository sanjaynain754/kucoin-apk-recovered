package androidx.camera.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.Api28Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.core.util.Preconditions;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public final class DebugUtils {
    private static final String AUDIO_CAPS_PREFIX = "[AudioCaps] ";
    private static final String CODEC_CAPS_PREFIX = "[CodecCaps] ";
    private static final String ENCODER_CAPS_PREFIX = "[EncoderCaps] ";
    private static final String TAG = "DebugUtils";
    private static final String VIDEO_CAPS_PREFIX = "[VideoCaps] ";

    public static String dumpCodecCapabilities(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            Preconditions.checkArgument(capabilitiesForType != null);
            dumpCodecCapabilities(sb2, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            logToString(sb2, "[" + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb2.toString();
    }

    public static String byteBufferToHex(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int iPosition = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return bytesToHexString(bArr);
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            sb2.append(String.format("%02X ", Byte.valueOf(b11)));
        }
        return sb2.toString().trim();
    }

    private static void dumpAudioCapabilities(StringBuilder sb2, MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        logToString(sb2, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        logToString(sb2, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            logToString(sb2, "[AudioCaps] getMinInputChannelCount = " + Api31Impl.getMinInputChannelCount(audioCapabilities));
            logToString(sb2, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(Api31Impl.getInputChannelCountRanges(audioCapabilities)));
        }
        logToString(sb2, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        logToString(sb2, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            logToString(sb2, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb2, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    private static void dumpEncoderCapabilities(StringBuilder sb2, MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        logToString(sb2, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            logToString(sb2, "[EncoderCaps] getQualityRange = " + Api28Impl.getQualityRange(encoderCapabilities));
        }
        try {
            logToString(sb2, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb2, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    public static String dumpMediaCodecListForFormat(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        logToString(sb2, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z11 = true;
                try {
                    Preconditions.checkArgument(string != null);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z11 = false;
                    }
                    Preconditions.checkArgument(z11);
                    logToString(sb2, "[Start] [" + mediaCodecInfo.getName() + "]");
                    dumpCodecCapabilities(sb2, capabilitiesForType, mediaFormat);
                    logToString(sb2, "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    logToString(sb2, "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        logToString(sb2, "[End] Dump MediaCodecList");
        String string2 = sb2.toString();
        stringToLog(string2);
        return string2;
    }

    private static void dumpVideoCapabilities(StringBuilder sb2, MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z11;
        logToString(sb2, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        logToString(sb2, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        logToString(sb2, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i11 = 0;
        boolean z12 = true;
        try {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
            Preconditions.checkArgument(integer > 0 && integer2 > 0);
            z11 = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb2, "[VideoCaps] mediaFormat does not contain valid width and height");
            integer = 0;
            integer2 = 0;
            z11 = false;
        }
        if (z11) {
            try {
                logToString(sb2, "[VideoCaps] getSupportedHeightsFor " + integer + " = " + videoCapabilities.getSupportedHeightsFor(integer));
            } catch (IllegalArgumentException unused2) {
                logToString(sb2, "[VideoCaps] could not getSupportedHeightsFor " + integer);
            }
            try {
                logToString(sb2, "[VideoCaps] getSupportedWidthsFor " + integer2 + " = " + videoCapabilities.getSupportedWidthsFor(integer2));
            } catch (IllegalArgumentException unused3) {
                logToString(sb2, "[VideoCaps] could not getSupportedWidthsFor " + integer2);
            }
            logToString(sb2, "[VideoCaps] isSizeSupported for " + integer + "x" + integer2 + " = " + videoCapabilities.isSizeSupported(integer, integer2));
        }
        logToString(sb2, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer3 = mediaFormat.getInteger("frame-rate");
            if (integer3 <= 0) {
                z12 = false;
            }
            Preconditions.checkArgument(z12);
            i11 = integer3;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            logToString(sb2, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z11) {
            logToString(sb2, "[VideoCaps] getSupportedFrameRatesFor " + integer + "x" + integer2 + " = " + videoCapabilities.getSupportedFrameRatesFor(integer, integer2));
        }
        if (!z11 || i11 <= 0) {
            return;
        }
        logToString(sb2, "[VideoCaps] areSizeAndRateSupported for " + integer + "x" + integer2 + ", " + i11 + " = " + videoCapabilities.areSizeAndRateSupported(integer, integer2, i11));
    }

    private static String formatInterval(long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j11);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j11 - timeUnit2.toMillis(hours));
        long millis = j11 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j11 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static String getCsdHex(MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append(EncoderConfig.KEY_CSD_0);
        sb2.append(" = ");
        sb2.append(byteBufferToHex(mediaFormat.getByteBuffer(EncoderConfig.KEY_CSD_0)));
        if (mediaFormat.containsKey(EncoderConfig.KEY_CSD_1)) {
            sb2.append(", ");
            sb2.append(EncoderConfig.KEY_CSD_1);
            sb2.append(" = ");
            sb2.append(byteBufferToHex(mediaFormat.getByteBuffer(EncoderConfig.KEY_CSD_1)));
        }
        if (mediaFormat.containsKey(EncoderConfig.KEY_CSD_2)) {
            sb2.append(", ");
            sb2.append(EncoderConfig.KEY_CSD_2);
            sb2.append(" = ");
            sb2.append(byteBufferToHex(mediaFormat.getByteBuffer(EncoderConfig.KEY_CSD_2)));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public static String readableBufferInfo(MediaCodec.BufferInfo bufferInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dump BufferInfo: " + bufferInfo.toString() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("\toffset: " + bufferInfo.offset + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("\tsize: " + bufferInfo.size + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\tflag: ");
        sb3.append(bufferInfo.flags);
        sb2.append(sb3.toString());
        ArrayList arrayList = new ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" (");
            sb2.append(TextUtils.join(" | ", arrayList));
            sb2.append(")");
        }
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("\tpresentationTime: " + bufferInfo.presentationTimeUs + " (" + readableUs(bufferInfo.presentationTimeUs) + ")\n");
        return sb2.toString();
    }

    public static String readableUs(long j11) {
        return readableMs(TimeUnit.MICROSECONDS.toMillis(j11));
    }

    private static void stringToLog(String str) {
        if (Logger.isInfoEnabled(TAG)) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                Logger.m1870i(TAG, scanner.nextLine());
            }
        }
    }

    private static String toString(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        return codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }

    private DebugUtils() {
    }

    private static void logToString(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public static String readableMs(long j11) {
        return formatInterval(j11);
    }

    private static void dumpCodecCapabilities(StringBuilder sb2, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        try {
            logToString(sb2, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            logToString(sb2, "[CodecCaps] isFormatSupported=false");
        }
        logToString(sb2, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb3 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(toString(codecProfileLevel));
            }
            sb3.append(TextUtils.join(", ", arrayList));
            sb3.append("]");
            logToString(sb2, "[CodecCaps] profileLevels = " + ((Object) sb3));
        }
        if (codecCapabilities.colorFormats != null) {
            logToString(sb2, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            dumpVideoCapabilities(sb2, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            dumpAudioCapabilities(sb2, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            dumpEncoderCapabilities(sb2, encoderCapabilities, mediaFormat);
        }
    }
}
