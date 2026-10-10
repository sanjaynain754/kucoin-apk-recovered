package androidx.webkit.internal;

import androidx.media3.common.MimeTypes;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.constants.ConstantsKt;
import java.net.URLConnection;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
class MimeUtil {
    private static String guessHardcodedMime(String str) {
        byte b11 = 1;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 3315:
                b11 = !lowerCase.equals("gz") ? (byte) -1 : (byte) 0;
                break;
            case 3401:
                if (!lowerCase.equals("js")) {
                    b11 = -1;
                }
                break;
            case 97669:
                b11 = !lowerCase.equals("bmp") ? (byte) -1 : (byte) 2;
                break;
            case 98819:
                b11 = !lowerCase.equals("css") ? (byte) -1 : (byte) 3;
                break;
            case 102340:
                b11 = !lowerCase.equals("gif") ? (byte) -1 : (byte) 4;
                break;
            case 103649:
                b11 = !lowerCase.equals("htm") ? (byte) -1 : (byte) 5;
                break;
            case 104085:
                b11 = !lowerCase.equals("ico") ? (byte) -1 : (byte) 6;
                break;
            case 105441:
                b11 = !lowerCase.equals("jpg") ? (byte) -1 : (byte) 7;
                break;
            case 106458:
                b11 = !lowerCase.equals("m4a") ? (byte) -1 : (byte) 8;
                break;
            case 106479:
                b11 = !lowerCase.equals("m4v") ? (byte) -1 : (byte) 9;
                break;
            case 108089:
                b11 = !lowerCase.equals("mht") ? (byte) -1 : (byte) 10;
                break;
            case 108150:
                b11 = !lowerCase.equals("mjs") ? (byte) -1 : (byte) 11;
                break;
            case 108272:
                b11 = !lowerCase.equals("mp3") ? (byte) -1 : (byte) 12;
                break;
            case 108273:
                b11 = !lowerCase.equals("mp4") ? (byte) -1 : (byte) 13;
                break;
            case 108324:
                b11 = !lowerCase.equals("mpg") ? (byte) -1 : (byte) 14;
                break;
            case 109961:
                b11 = !lowerCase.equals("oga") ? (byte) -1 : (byte) 15;
                break;
            case 109967:
                b11 = !lowerCase.equals("ogg") ? (byte) -1 : (byte) 16;
                break;
            case 109973:
                b11 = !lowerCase.equals("ogm") ? (byte) -1 : (byte) 17;
                break;
            case 109982:
                b11 = !lowerCase.equals("ogv") ? (byte) -1 : (byte) 18;
                break;
            case 110834:
                b11 = !lowerCase.equals("pdf") ? (byte) -1 : (byte) 19;
                break;
            case 111030:
                b11 = !lowerCase.equals("pjp") ? (byte) -1 : (byte) 20;
                break;
            case 111145:
                b11 = !lowerCase.equals("png") ? (byte) -1 : (byte) 21;
                break;
            case 114276:
                b11 = !lowerCase.equals("svg") ? (byte) -1 : (byte) 22;
                break;
            case 114791:
                b11 = !lowerCase.equals("tgz") ? (byte) -1 : (byte) 23;
                break;
            case 114833:
                b11 = !lowerCase.equals("tif") ? (byte) -1 : (byte) 24;
                break;
            case 117484:
                b11 = !lowerCase.equals("wav") ? (byte) -1 : (byte) 25;
                break;
            case 118660:
                b11 = !lowerCase.equals("xht") ? (byte) -1 : (byte) 26;
                break;
            case 118807:
                b11 = !lowerCase.equals("xml") ? (byte) -1 : (byte) 27;
                break;
            case 120609:
                b11 = !lowerCase.equals("zip") ? (byte) -1 : (byte) 28;
                break;
            case 3000872:
                b11 = !lowerCase.equals("apng") ? (byte) -1 : (byte) 29;
                break;
            case 3145576:
                b11 = !lowerCase.equals("flac") ? (byte) -1 : (byte) 30;
                break;
            case 3213227:
                b11 = !lowerCase.equals("html") ? (byte) -1 : (byte) 31;
                break;
            case 3259225:
                b11 = !lowerCase.equals("jfif") ? (byte) -1 : (byte) 32;
                break;
            case 3268712:
                b11 = !lowerCase.equals("jpeg") ? (byte) -1 : BuiltinOptions.ExpOptions;
                break;
            case 3271912:
                b11 = !lowerCase.equals(JPushConstants.Analysis.KEY_JSON) ? (byte) -1 : BuiltinOptions.TopKV2Options;
                break;
            case 3358085:
                b11 = !lowerCase.equals("mpeg") ? (byte) -1 : BuiltinOptions.SplitOptions;
                break;
            case 3418175:
                b11 = !lowerCase.equals("opus") ? (byte) -1 : BuiltinOptions.LogSoftmaxOptions;
                break;
            case 3529614:
                b11 = !lowerCase.equals("shtm") ? (byte) -1 : BuiltinOptions.CastOptions;
                break;
            case 3542678:
                b11 = !lowerCase.equals("svgz") ? (byte) -1 : BuiltinOptions.DequantizeOptions;
                break;
            case 3559925:
                b11 = !lowerCase.equals("tiff") ? (byte) -1 : BuiltinOptions.MaximumMinimumOptions;
                break;
            case 3642020:
                b11 = !lowerCase.equals("wasm") ? (byte) -1 : BuiltinOptions.ArgMaxOptions;
                break;
            case 3645337:
                b11 = !lowerCase.equals("webm") ? (byte) -1 : BuiltinOptions.LessOptions;
                break;
            case 3645340:
                b11 = !lowerCase.equals("webp") ? (byte) -1 : BuiltinOptions.NegOptions;
                break;
            case 3655064:
                b11 = !lowerCase.equals("woff") ? (byte) -1 : BuiltinOptions.PadV2Options;
                break;
            case 3678569:
                b11 = !lowerCase.equals("xhtm") ? (byte) -1 : BuiltinOptions.GreaterOptions;
                break;
            case 96488848:
                b11 = !lowerCase.equals("ehtml") ? (byte) -1 : BuiltinOptions.GreaterEqualOptions;
                break;
            case 103877016:
                b11 = !lowerCase.equals("mhtml") ? (byte) -1 : (byte) 46;
                break;
            case 106703064:
                b11 = !lowerCase.equals("pjpeg") ? (byte) -1 : BuiltinOptions.SelectOptions;
                break;
            case 109418142:
                b11 = !lowerCase.equals("shtml") ? (byte) -1 : BuiltinOptions.SliceOptions;
                break;
            case 114035747:
                b11 = !lowerCase.equals("xhtml") ? (byte) -1 : BuiltinOptions.TransposeConvOptions;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
            case 23:
                return "application/gzip";
            case 1:
            case 11:
                return "text/javascript";
            case 2:
                return MimeTypes.IMAGE_BMP;
            case 3:
                return "text/css";
            case 4:
                return "image/gif";
            case 5:
            case 31:
            case 37:
            case 45:
            case 48:
                return "text/html";
            case 6:
                return "image/x-icon";
            case 7:
            case 20:
            case 32:
            case 33:
            case 47:
                return "image/jpeg";
            case 8:
                return "audio/x-m4a";
            case 9:
            case 13:
                return MimeTypes.VIDEO_MP4;
            case 10:
            case 46:
                return "multipart/related";
            case 12:
                return MimeTypes.AUDIO_MPEG;
            case 14:
            case 35:
                return MimeTypes.VIDEO_MPEG;
            case 15:
            case 16:
            case 36:
                return MimeTypes.AUDIO_OGG;
            case 17:
            case 18:
                return MimeTypes.VIDEO_OGG;
            case 19:
                return ConstantsKt.MIME_TYPE_PDF;
            case 21:
                return "image/png";
            case 22:
            case 38:
                return "image/svg+xml";
            case 24:
            case 39:
                return "image/tiff";
            case 25:
                return MimeTypes.AUDIO_WAV;
            case 26:
            case 44:
            case 49:
                return "application/xhtml+xml";
            case 27:
                return "text/xml";
            case 28:
                return "application/zip";
            case 29:
                return "image/apng";
            case 30:
                return MimeTypes.AUDIO_FLAC;
            case 34:
                return "application/json";
            case 40:
                return "application/wasm";
            case 41:
                return MimeTypes.VIDEO_WEBM;
            case 42:
                return "image/webp";
            case 43:
                return "application/font-woff";
            default:
                return null;
        }
    }

    public static String getMimeFromFileName(String str) {
        if (str == null) {
            return null;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName != null ? strGuessContentTypeFromName : guessHardcodedMime(str);
    }
}
