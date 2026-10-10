package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int AVIF = 21;
    public static final int BMP = 19;
    private static final String EXTENSION_AAC = ".aac";
    private static final String EXTENSION_AC3 = ".ac3";
    private static final String EXTENSION_AC4 = ".ac4";
    private static final String EXTENSION_ADTS = ".adts";
    private static final String EXTENSION_AMR = ".amr";
    private static final String EXTENSION_AVI = ".avi";
    private static final String EXTENSION_AVIF = ".avif";
    private static final String EXTENSION_BMP = ".bmp";
    private static final String EXTENSION_DIB = ".dib";
    private static final String EXTENSION_EC3 = ".ec3";
    private static final String EXTENSION_FLAC = ".flac";
    private static final String EXTENSION_FLV = ".flv";
    private static final String EXTENSION_HEIC = ".heic";
    private static final String EXTENSION_HEIF = ".heif";
    private static final String EXTENSION_JPEG = ".jpeg";
    private static final String EXTENSION_JPG = ".jpg";
    private static final String EXTENSION_M2P = ".m2p";
    private static final String EXTENSION_MID = ".mid";
    private static final String EXTENSION_MIDI = ".midi";
    private static final String EXTENSION_MP3 = ".mp3";
    private static final String EXTENSION_MP4 = ".mp4";
    private static final String EXTENSION_MPEG = ".mpeg";
    private static final String EXTENSION_MPG = ".mpg";
    private static final String EXTENSION_OPUS = ".opus";
    private static final String EXTENSION_PNG = ".png";
    private static final String EXTENSION_PREFIX_CMF = ".cmf";
    private static final String EXTENSION_PREFIX_M4 = ".m4";
    private static final String EXTENSION_PREFIX_MK = ".mk";
    private static final String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final String EXTENSION_PREFIX_OG = ".og";
    private static final String EXTENSION_PREFIX_TS = ".ts";
    private static final String EXTENSION_PS = ".ps";
    private static final String EXTENSION_SMF = ".smf";
    private static final String EXTENSION_TS = ".ts";
    private static final String EXTENSION_VTT = ".vtt";
    private static final String EXTENSION_WAV = ".wav";
    private static final String EXTENSION_WAVE = ".wave";
    private static final String EXTENSION_WEBM = ".webm";
    private static final String EXTENSION_WEBP = ".webp";
    private static final String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;

    @VisibleForTesting
    static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int HEIF = 20;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PNG = 17;

    /* JADX INFO: renamed from: PS */
    public static final int f2786PS = 10;

    /* JADX INFO: renamed from: TS */
    public static final int f2787TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBP = 18;
    public static final int WEBVTT = 13;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0226 A[PHI: r23
      0x0226: PHI (r23v32 int) = 
      (r23v1 int)
      (r23v2 int)
      (r23v3 int)
      (r23v4 int)
      (r23v5 int)
      (r23v6 int)
      (r23v7 int)
      (r23v8 int)
      (r23v9 int)
      (r23v10 int)
      (r23v11 int)
      (r23v12 int)
      (r23v13 int)
      (r23v14 int)
      (r23v15 int)
      (r23v16 int)
      (r23v17 int)
      (r23v18 int)
      (r23v19 int)
      (r23v20 int)
      (r23v21 int)
      (r23v22 int)
      (r23v23 int)
      (r23v24 int)
      (r23v25 int)
      (r23v26 int)
      (r23v27 int)
      (r23v28 int)
      (r23v29 int)
      (r23v30 int)
      (r23v31 int)
      (r23v33 int)
     binds: [B:133:0x0224, B:129:0x0216, B:125:0x0208, B:121:0x01f9, B:117:0x01ea, B:113:0x01dc, B:109:0x01cf, B:105:0x01c0, B:101:0x01b1, B:97:0x01a2, B:93:0x0193, B:89:0x0184, B:85:0x0174, B:81:0x0164, B:77:0x0155, B:73:0x0146, B:69:0x0137, B:65:0x0128, B:61:0x0118, B:57:0x0109, B:53:0x00f9, B:49:0x00e9, B:45:0x00d9, B:41:0x00c9, B:37:0x00b9, B:33:0x00a8, B:29:0x0098, B:25:0x0088, B:21:0x0078, B:17:0x0068, B:13:0x0058, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    public static int inferFileTypeFromMimeType(@Nullable String str) {
        int i11;
        byte b11;
        if (str == null) {
            return -1;
        }
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(str);
        strNormalizeMimeType.getClass();
        switch (strNormalizeMimeType.hashCode()) {
            case -2123537834:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    b11 = -1;
                } else {
                    b11 = 0;
                }
                break;
            case -1662384011:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_PS)) {
                    b11 = -1;
                } else {
                    b11 = 1;
                }
                break;
            case -1662384007:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_MP2T)) {
                    b11 = -1;
                } else {
                    b11 = 2;
                }
                break;
            case -1662095187:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_WEBM)) {
                    b11 = -1;
                } else {
                    b11 = 3;
                }
                break;
            case -1606874997:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AMR_WB)) {
                    b11 = -1;
                } else {
                    b11 = 4;
                }
                break;
            case -1487656890:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_AVIF)) {
                    b11 = -1;
                } else {
                    b11 = 5;
                }
                break;
            case -1487464693:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_HEIC)) {
                    b11 = -1;
                } else {
                    b11 = 6;
                }
                break;
            case -1487464690:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_HEIF)) {
                    b11 = -1;
                } else {
                    b11 = 7;
                }
                break;
            case -1487394660:
                i11 = 20;
                if (!strNormalizeMimeType.equals("image/jpeg")) {
                    b11 = -1;
                } else {
                    b11 = 8;
                }
                break;
            case -1487018032:
                i11 = 20;
                if (!strNormalizeMimeType.equals("image/webp")) {
                    b11 = -1;
                } else {
                    b11 = 9;
                }
                break;
            case -1248337486:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.APPLICATION_MP4)) {
                    b11 = -1;
                } else {
                    b11 = 10;
                }
                break;
            case -1079884372:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_AVI)) {
                    b11 = -1;
                } else {
                    b11 = 11;
                }
                break;
            case -1004728940:
                i11 = 20;
                if (!strNormalizeMimeType.equals("text/vtt")) {
                    b11 = -1;
                } else {
                    b11 = 12;
                }
                break;
            case -879272239:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_BMP)) {
                    b11 = -1;
                } else {
                    b11 = 13;
                }
                break;
            case -879258763:
                i11 = 20;
                if (!strNormalizeMimeType.equals("image/png")) {
                    b11 = -1;
                } else {
                    b11 = 14;
                }
                break;
            case -387023398:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MATROSKA)) {
                    b11 = -1;
                } else {
                    b11 = 15;
                }
                break;
            case -43467528:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.APPLICATION_WEBM)) {
                    b11 = -1;
                } else {
                    b11 = 16;
                }
                break;
            case 13915911:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_FLV)) {
                    b11 = -1;
                } else {
                    b11 = 17;
                }
                break;
            case 187078296:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AC3)) {
                    b11 = -1;
                } else {
                    b11 = 18;
                }
                break;
            case 187078297:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AC4)) {
                    b11 = -1;
                } else {
                    b11 = 19;
                }
                break;
            case 187078669:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AMR)) {
                    b11 = -1;
                } else {
                    b11 = 20;
                }
                break;
            case 187090232:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MP4)) {
                    b11 = -1;
                } else {
                    b11 = 21;
                }
                break;
            case 187091926:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_OGG)) {
                    b11 = -1;
                } else {
                    b11 = 22;
                }
                break;
            case 187099443:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_WAV)) {
                    b11 = -1;
                } else {
                    b11 = 23;
                }
                break;
            case 1331848029:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_MP4)) {
                    b11 = -1;
                } else {
                    b11 = 24;
                }
                break;
            case 1503095341:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AMR_NB)) {
                    b11 = -1;
                } else {
                    b11 = 25;
                }
                break;
            case 1504578661:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_E_AC3)) {
                    b11 = -1;
                } else {
                    b11 = 26;
                }
                break;
            case 1504619009:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_FLAC)) {
                    b11 = -1;
                } else {
                    b11 = 27;
                }
                break;
            case 1504824762:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MIDI)) {
                    b11 = -1;
                } else {
                    b11 = 28;
                }
                break;
            case 1504831518:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MPEG)) {
                    b11 = -1;
                } else {
                    b11 = 29;
                }
                break;
            case 1505118770:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_WEBM)) {
                    b11 = -1;
                } else {
                    b11 = 30;
                }
                break;
            case 2039520277:
                i11 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_MATROSKA)) {
                    b11 = -1;
                } else {
                    b11 = 31;
                }
                break;
            default:
                b11 = -1;
                i11 = 20;
                break;
        }
        switch (b11) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return i11;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    private FileTypes() {
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(EXTENSION_AC3) && !lastPathSegment.endsWith(EXTENSION_EC3)) {
            if (lastPathSegment.endsWith(EXTENSION_AC4)) {
                return 1;
            }
            if (!lastPathSegment.endsWith(EXTENSION_ADTS) && !lastPathSegment.endsWith(EXTENSION_AAC)) {
                if (lastPathSegment.endsWith(EXTENSION_AMR)) {
                    return 3;
                }
                if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
                    return 4;
                }
                if (lastPathSegment.endsWith(EXTENSION_FLV)) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(EXTENSION_MID) && !lastPathSegment.endsWith(EXTENSION_MIDI) && !lastPathSegment.endsWith(EXTENSION_SMF)) {
                    if (!lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(EXTENSION_WEBM)) {
                        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(EXTENSION_OPUS)) {
                                if (!lastPathSegment.endsWith(EXTENSION_PS) && !lastPathSegment.endsWith(EXTENSION_MPEG) && !lastPathSegment.endsWith(EXTENSION_MPG) && !lastPathSegment.endsWith(EXTENSION_M2P)) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(EXTENSION_WAV) && !lastPathSegment.endsWith(EXTENSION_WAVE)) {
                                            if (!lastPathSegment.endsWith(EXTENSION_VTT) && !lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
                                                if (!lastPathSegment.endsWith(EXTENSION_JPG) && !lastPathSegment.endsWith(EXTENSION_JPEG)) {
                                                    if (lastPathSegment.endsWith(EXTENSION_AVI)) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(EXTENSION_PNG)) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(EXTENSION_WEBP)) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(EXTENSION_BMP) && !lastPathSegment.endsWith(EXTENSION_DIB)) {
                                                        if (!lastPathSegment.endsWith(EXTENSION_HEIC) && !lastPathSegment.endsWith(EXTENSION_HEIF)) {
                                                            if (!lastPathSegment.endsWith(EXTENSION_AVIF)) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}
