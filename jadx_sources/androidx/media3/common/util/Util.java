package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.autofill.HintConstants;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.Player;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.p021ts.PsExtractor;
import androidx.media3.extractor.p021ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.p069io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.errorprone.annotations.InlineMe;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.C34052z4;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import org.tensorflow.lite.schema.BuiltinOperator;

/* JADX INFO: loaded from: classes34.dex */
public final class Util {
    private static final int[] CRC16_BYTES_MSBF;
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;

    @UnstableApi
    public static final String DEVICE;

    @UnstableApi
    public static final String DEVICE_DEBUG_INFO;

    @UnstableApi
    public static final byte[] EMPTY_BYTE_ARRAY;

    @UnstableApi
    public static final long[] EMPTY_LONG_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_PATH_PATTERN;

    @UnstableApi
    public static final String MANUFACTURER;

    @UnstableApi
    public static final String MODEL;

    @UnstableApi
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoLegacyTagReplacements;

    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    @UnstableApi
    public static int binarySearchCeil(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int iBinarySearch = Arrays.binarySearch(iArr, i11);
        if (iBinarySearch < 0) {
            i13 = ~iBinarySearch;
        } else {
            while (true) {
                i12 = iBinarySearch + 1;
                if (i12 >= iArr.length || iArr[i12] != i11) {
                    break;
                }
                iBinarySearch = i12;
            }
            i13 = z11 ? iBinarySearch : i12;
        }
        return z12 ? Math.min(iArr.length - 1, i13) : i13;
    }

    @UnstableApi
    public static int binarySearchFloor(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int iBinarySearch = Arrays.binarySearch(iArr, i11);
        if (iBinarySearch < 0) {
            i13 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i12 = iBinarySearch - 1;
                if (i12 < 0 || iArr[i12] != i11) {
                    break;
                }
                iBinarySearch = i12;
            }
            i13 = z11 ? iBinarySearch : i12;
        }
        return z12 ? Math.max(0, i13) : i13;
    }

    @UnstableApi
    public static int ceilDivide(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    @UnstableApi
    public static int constrainValue(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    @UnstableApi
    public static boolean contains(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static <T> boolean contentEquals(@Nullable SparseArray<T> sparseArray, @Nullable SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                return false;
            }
        }
        return true;
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    @UnstableApi
    public static long durationUsToSampleCount(long j11, int i11) {
        return scaleLargeValue(j11, i11, 1000000L, RoundingMode.UP);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    @UnstableApi
    @Deprecated
    public static int getAudioContentTypeForStreamType(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 5 || i11 == 8) ? 4 : 2;
        }
        return 1;
    }

    @UnstableApi
    public static int getAudioUsageForStreamType(int i11) {
        if (i11 == 0) {
            return 2;
        }
        if (i11 == 1) {
            return 13;
        }
        if (i11 == 2) {
            return 6;
        }
        int i12 = 4;
        if (i11 != 4) {
            i12 = 5;
            if (i11 != 5) {
                return i11 != 8 ? 1 : 3;
            }
        }
        return i12;
    }

    @UnstableApi
    public static int getByteDepth(int i11) {
        if (i11 != 2) {
            if (i11 == 3) {
                return 1;
            }
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    @UnstableApi
    public static int getErrorCodeForMediaDrmErrorCode(int i11) {
        if (i11 == 2 || i11 == 4) {
            return 6005;
        }
        if (i11 == 10) {
            return 6004;
        }
        if (i11 == 7) {
            return 6005;
        }
        if (i11 == 8) {
            return 6003;
        }
        switch (i11) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i11) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    @UnstableApi
    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String str) {
        String[] strArrSplit;
        int length;
        int i11 = 0;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z11 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            i11 = Integer.parseInt((String) Assertions.checkNotNull(str2));
            if (z11) {
                return -i11;
            }
        } catch (NumberFormatException unused) {
        }
        return i11;
    }

    @UnstableApi
    public static Format getPcmFormat(int i11, int i12, int i13) {
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(i12).setSampleRate(i13).setPcmEncoding(i11).build();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean handlePlayButtonAction(@Nullable Player player) {
        boolean z11 = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState != 1 || !player.isCommandAvailable(2)) {
            if (playbackState == 4 && player.isCommandAvailable(4)) {
                player.seekToDefaultPosition();
            }
            if (player.isCommandAvailable(1)) {
                return z11;
            }
            player.play();
            return true;
        }
        player.prepare();
        z11 = true;
        if (player.isCommandAvailable(1)) {
            return z11;
        }
        player.play();
        return true;
    }

    public static boolean handlePlayPauseButtonAction(@Nullable Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(Uri uri, @Nullable String str) {
        return TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    private static boolean isAppSpecificStorageFileUri(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String canonicalPath3 = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            return canonicalPath3 != null && canonicalPath.startsWith(canonicalPath3);
        } catch (IOException unused) {
            return false;
        }
    }

    @UnstableApi
    public static boolean isEncodingLinearPcm(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    @UnstableApi
    public static int linearSearch(int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @UnstableApi
    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return fromUtf8Bytes(ByteStreams.toByteArray(inputStreamOpen));
        } finally {
            closeQuietly(inputStreamOpen);
        }
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i11 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i11 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i11])) {
                return strArr[i11 + 1] + str.substring(strArr[i11].length());
            }
            i11 += 2;
        }
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                ImmutableList<MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i11 = 0; i11 < immutableList.size(); i11++) {
                    if (maybeRequestReadStoragePermission(activity, immutableList.get(i11).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t11) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t11;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i11) {
        Assertions.checkArgument(i11 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i11, int i12) {
        Assertions.checkArgument(i11 >= 0);
        Assertions.checkArgument(i12 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i11, i12);
    }

    @UnstableApi
    public static long sampleCountToDurationUs(long j11, int i11) {
        return scaleLargeValue(j11, 1000000L, i11, RoundingMode.DOWN);
    }

    public static boolean shouldShowPlayButton(@Nullable Player player) {
        return shouldShowPlayButton(player, true);
    }

    @UnstableApi
    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    @UnstableApi
    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    @UnstableApi
    public static long sum(long... jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        return j11;
    }

    @UnstableApi
    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return ByteStreams.toByteArray(inputStream);
    }

    @UnstableApi
    public static long toUnsignedLong(int i11) {
        return ((long) i11) & KeyboardMap.kValueMask;
    }

    @RequiresApi(29)
    public static class Api29 {
        private Api29() {
        }

        public static void startForeground(Service service, int i11, Notification notification, int i12, String str) {
            try {
                service.startForeground(i11, notification, i12);
            } catch (RuntimeException e11) {
                Log.m2957e(Util.TAG, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e11;
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        SDK_INT = i11;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i11;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", TUIThemeManager.LANGUAGE_ZH_CN, "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", TPDownloadProxyEnum.USER_MAC, "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, InterfaceC33568bf.f69245q, 209, 196, TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, BuiltinOperator.RIGHT_SHIFT, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, BuiltinOperator.RANDOM_UNIFORM, BuiltinOperator.UNSORTED_SEGMENT_MIN, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, BuiltinOperator.UNSORTED_SEGMENT_SUM, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, TPPixelFormat.TP_PIX_FMT_MEDIACODEC, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT, 197, 204, 203, 230, 225, 232, 239, 250, ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, TPCodecParamers.TP_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    @UnstableApi
    public static long addWithOverflowDefault(long j11, long j12, long j13) {
        long j14 = j11 + j12;
        return ((j11 ^ j14) & (j12 ^ j14)) < 0 ? j13 : j14;
    }

    @UnstableApi
    public static long ceilDivide(long j11, long j12) {
        return ((j11 + j12) - 1) / j12;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i11 = 0; i11 < mediaItem.localConfiguration.subtitleConfigurations.size(); i11++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i11).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @UnstableApi
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @UnstableApi
    public static int compareLong(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    @UnstableApi
    public static long constrainValue(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    @UnstableApi
    public static <T> int contentHashCode(SparseArray<T> sparseArray) {
        if (SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
        }
        return iKeyAt;
    }

    @UnstableApi
    public static int crc16(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            int i14 = UnsignedBytes.toInt(bArr[i11]);
            i13 = crc16UpdateFourBits(i14 & 15, crc16UpdateFourBits(i14 >> 4, i13));
            i11++;
        }
        return i13;
    }

    private static int crc16UpdateFourBits(int i11, int i12) {
        return (CRC16_BYTES_MSBF[(i11 ^ ((i12 >> 12) & 255)) & 255] ^ ((i12 << 4) & 65535)) & 65535;
    }

    @UnstableApi
    public static int crc32(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = CRC32_BYTES_MSBF[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
            i11++;
        }
        return i13;
    }

    @UnstableApi
    public static int crc8(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = CRC8_BYTES_MSBF[i13 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i13;
    }

    @UnstableApi
    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Thread m2971d(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Thread m2972e(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @UnstableApi
    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr, int i11, int i12) {
        return new String(bArr, i11, i12, StandardCharsets.UTF_8);
    }

    @UnstableApi
    public static int generateAudioSessionIdV21(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int i11) {
        if (i11 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (i11 == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (i11 != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    @UnstableApi
    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i11) {
        if (i11 == 20) {
            return 30;
        }
        if (i11 == 22) {
            return 31;
        }
        if (i11 == 30) {
            return 34;
        }
        switch (i11) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i11) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @UnstableApi
    public static AudioFormat getAudioFormat(int i11, int i12, int i13) {
        return new AudioFormat.Builder().setSampleRate(i11).setChannelMask(i12).setEncoding(i13).build();
    }

    @SuppressLint({"InlinedApi"})
    @UnstableApi
    public static int getAudioTrackChannelConfig(int i11) {
        if (i11 == 10) {
            return SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i11 == 12) {
            return 743676;
        }
        if (i11 == 24) {
            return SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i11) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    @UnstableApi
    public static String getAuxiliaryTrackTypeString(int i11) {
        if (i11 == 0) {
            return "undefined";
        }
        if (i11 == 1) {
            return "original";
        }
        if (i11 == 2) {
            return "depth-linear";
        }
        if (i11 == 3) {
            return "depth-inverse";
        }
        if (i11 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    @UnstableApi
    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    @UnstableApi
    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    @UnstableApi
    public static Locale getDefaultDisplayLocale() {
        return SDK_INT >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    @UnstableApi
    public static String getFormatSupportString(int i11) {
        if (i11 == 0) {
            return OtcAd.KYC_NO;
        }
        if (i11 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i11 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i11 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i11 == 4) {
            return OtcAd.KYC_YES;
        }
        throw new IllegalStateException();
    }

    @UnstableApi
    public static long getMediaDurationForPlayoutDuration(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 * ((double) f11));
    }

    @UnstableApi
    public static int getPcmEncoding(int i11) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 2;
        }
        if (i11 != 24) {
            return i11 != 32 ? 0 : 22;
        }
        return 21;
    }

    @UnstableApi
    public static long getPlayoutDurationForMediaDuration(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 / ((double) f11));
    }

    @UnstableApi
    public static List<String> getRoleFlagStrings(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i11 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i11 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i11 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i11 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i11 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i11 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i11 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i11 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i11 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i11 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i11 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i11 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i11 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i11 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    @UnstableApi
    public static List<String> getSelectionFlagStrings(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i11 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @UnstableApi
    public static int getStreamTypeForAudioUsage(int i11) {
        if (i11 == 13) {
            return 1;
        }
        switch (i11) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    @Nullable
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e11) {
            Log.m2958e(TAG, "Failed to read system property " + str, e11);
            return null;
        }
    }

    @UnstableApi
    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    @UnstableApi
    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static boolean handlePauseButtonAction(@Nullable Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    @UnstableApi
    public static boolean handlePlayPauseButtonAction(@Nullable Player player, boolean z11) {
        return shouldShowPlayButton(player, z11) ? handlePlayButtonAction(player) : handlePauseButtonAction(player);
    }

    @UnstableApi
    public static String intToStringMaxRadix(int i11) {
        return Integer.toString(i11, 36);
    }

    @UnstableApi
    public static boolean isAutomotive(Context context) {
        return SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @UnstableApi
    public static boolean isEncodingHighResolutionPcm(int i11) {
        return i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    @UnstableApi
    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        int i11 = SDK_INT;
        if (i11 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i11 == 30) {
            String str = MODEL;
            if (Ascii.equalsIgnoreCase(str, "moto g(20)") || Ascii.equalsIgnoreCase(str, "rmx3231")) {
                return true;
            }
        }
        return i11 == 34 && Ascii.equalsIgnoreCase(MODEL, "sm-x200");
    }

    @UnstableApi
    public static boolean isLinebreak(int i11) {
        return i11 == 10 || i11 == 13;
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean isReadStoragePermissionRequestNeeded(Activity activity, Uri uri) {
        if (SDK_INT < 23) {
            return false;
        }
        if (isLocalFileUri(uri)) {
            return !isAppSpecificStorageFileUri(activity, uri);
        }
        return isMediaStoreExternalContentUri(uri);
    }

    @UnstableApi
    public static boolean isRunningOnEmulator() {
        String lowerCase = Ascii.toLowerCase(DEVICE);
        return lowerCase.contains(C34052z4.f72600l) || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic");
    }

    @UnstableApi
    public static <T> void moveItems(List<T> list, int i11, int i12, int i13) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i14 = (i12 - i11) - 1; i14 >= 0; i14--) {
            arrayDeque.addFirst(list.remove(i11 + i14));
        }
        list.addAll(Math.min(i13, list.size()), arrayDeque);
    }

    @UnstableApi
    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.p
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.m2972e(str, runnable);
            }
        });
    }

    @UnstableApi
    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.r
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.m2971d(str, runnable);
            }
        });
    }

    @UnstableApi
    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C2711C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = splitAtFirst(lowerCase, C33820nf.f71144W)[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || TUIThemeManager.LANGUAGE_ZH_CN.equals(str2)) ? maybeReplaceLegacyLanguageTags(lowerCase) : lowerCase;
    }

    @UnstableApi
    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i11 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i11 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (C33820nf.f71144W.equals(matcher.group(11))) {
                i11 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i11 != 0 ? timeInMillis - (((long) i11) * 60000) : timeInMillis;
    }

    @UnstableApi
    public static long parseXsDuration(String str) {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d11 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d12 = d11 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d13 = d12 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d14 = d13 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d15 = d14 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j11 = (long) ((d15 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j11 : j11;
    }

    @Nullable
    @UnstableApi
    public static Intent registerReceiverNotExported(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return SDK_INT < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    @UnstableApi
    public static <T> void removeRange(List<T> list, int i11, int i12) {
        if (i11 < 0 || i12 > list.size() || i11 > i12) {
            throw new IllegalArgumentException();
        }
        if (i11 != i12) {
            list.subList(i11, i12).clear();
        }
    }

    @RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    @RequiresApi(api = 33)
    private static boolean requestReadMediaPermissions(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    @UnstableApi
    public static long scaleLargeTimestamp(long j11, long j12, long j13) {
        return scaleLargeValue(j11, j12, j13, RoundingMode.DOWN);
    }

    @UnstableApi
    public static long[] scaleLargeTimestamps(List<Long> list, long j11, long j12) {
        return scaleLargeValues(list, j11, j12, RoundingMode.DOWN);
    }

    @UnstableApi
    public static void scaleLargeTimestampsInPlace(long[] jArr, long j11, long j12) {
        scaleLargeValuesInPlace(jArr, j11, j12, RoundingMode.DOWN);
    }

    @UnstableApi
    public static long scaleLargeValue(long j11, long j12, long j13, RoundingMode roundingMode) {
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        if (j13 >= j12 && j13 % j12 == 0) {
            return LongMath.divide(j11, LongMath.divide(j13, j12, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j13 < j12 && j12 % j13 == 0) {
            return LongMath.saturatedMultiply(j11, LongMath.divide(j12, j13, RoundingMode.UNNECESSARY));
        }
        if (j13 < j11 || j13 % j11 != 0) {
            return (j13 >= j11 || j11 % j13 != 0) ? scaleLargeValueFallback(j11, j12, j13, roundingMode) : LongMath.saturatedMultiply(j12, LongMath.divide(j11, j13, RoundingMode.UNNECESSARY));
        }
        return LongMath.divide(j12, LongMath.divide(j13, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    @UnstableApi
    public static long[] scaleLargeValues(List<Long> list, long j11, long j12, RoundingMode roundingMode) {
        long j13 = j11;
        long j14 = j12;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j13 != 0) {
            int i11 = 0;
            if (j14 >= j13 && j14 % j13 == 0) {
                long jDivide = LongMath.divide(j14, j13, RoundingMode.UNNECESSARY);
                while (i11 < size) {
                    jArr[i11] = LongMath.divide(list.get(i11).longValue(), jDivide, roundingMode2);
                    i11++;
                }
            } else if (j14 >= j13 || j13 % j14 != 0) {
                int i12 = 0;
                while (i12 < size) {
                    long jLongValue = list.get(i12).longValue();
                    if (jLongValue != 0) {
                        if (j14 >= jLongValue && j14 % jLongValue == 0) {
                            jArr[i12] = LongMath.divide(j13, LongMath.divide(j14, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j14 >= jLongValue || jLongValue % j14 != 0) {
                            jArr[i12] = scaleLargeValueFallback(jLongValue, j13, j14, roundingMode2);
                        } else {
                            jArr[i12] = LongMath.saturatedMultiply(j13, LongMath.divide(jLongValue, j14, RoundingMode.UNNECESSARY));
                        }
                    }
                    i12++;
                    j13 = j11;
                    j14 = j12;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jDivide2 = LongMath.divide(j13, j14, RoundingMode.UNNECESSARY);
                while (i11 < size) {
                    jArr[i11] = LongMath.saturatedMultiply(list.get(i11).longValue(), jDivide2);
                    i11++;
                }
            }
        }
        return jArr;
    }

    @UnstableApi
    public static void scaleLargeValuesInPlace(long[] jArr, long j11, long j12, RoundingMode roundingMode) {
        if (j11 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i11 = 0;
        if (j12 >= j11 && j12 % j11 == 0) {
            long jDivide = LongMath.divide(j12, j11, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = LongMath.divide(jArr[i11], jDivide, roundingMode);
                i11++;
            }
            return;
        }
        if (j12 < j11 && j11 % j12 == 0) {
            long jDivide2 = LongMath.divide(j11, j12, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = LongMath.saturatedMultiply(jArr[i11], jDivide2);
                i11++;
            }
            return;
        }
        for (int i12 = 0; i12 < jArr.length; i12++) {
            long j13 = jArr[i12];
            if (j13 != 0) {
                if (j12 >= j13 && j12 % j13 == 0) {
                    jArr[i12] = LongMath.divide(j11, LongMath.divide(j12, j13, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j12 >= j13 || j13 % j12 != 0) {
                    jArr[i12] = scaleLargeValueFallback(j13, j11, j12, roundingMode);
                } else {
                    jArr[i12] = LongMath.saturatedMultiply(j11, LongMath.divide(j13, j12, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    @UnstableApi
    public static void setForegroundServiceNotification(Service service, int i11, Notification notification, int i12, String str) {
        if (SDK_INT >= 29) {
            Api29.startForeground(service, i11, notification, i12, str);
        } else {
            service.startForeground(i11, notification);
        }
    }

    private static boolean shouldEscapeCharacter(char c11) {
        return c11 == '\"' || c11 == '%' || c11 == '*' || c11 == '/' || c11 == ':' || c11 == '<' || c11 == '\\' || c11 == '|' || c11 == '>' || c11 == '?';
    }

    @UnstableApi
    public static boolean shouldShowPlayButton(@Nullable Player player, boolean z11) {
        return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4 || (z11 && player.getPlaybackSuppressionReason() != 0);
    }

    @Nullable
    @UnstableApi
    public static ComponentName startForegroundService(Context context, Intent intent) {
        return SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    @UnstableApi
    public static long subtractWithOverflowDefault(long j11, long j12, long j13) {
        long j14 = j11 - j12;
        return ((j11 ^ j14) & (j12 ^ j11)) < 0 ? j13 : j14;
    }

    @UnstableApi
    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i11 = 0;
        for (int i12 : iArr) {
            bArr[i11] = (byte) (i12 >> 24);
            bArr[i11 + 1] = (byte) (i12 >> 16);
            int i13 = i11 + 3;
            bArr[i11 + 2] = (byte) (i12 >> 8);
            i11 += 4;
            bArr[i13] = (byte) i12;
        }
        return bArr;
    }

    @UnstableApi
    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i11] & 15, 16));
        }
        return sb2.toString();
    }

    private Util() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2968a(SettableFuture settableFuture, Runnable runnable, Object obj) {
        try {
            if (!settableFuture.isCancelled()) {
                runnable.run();
                settableFuture.set(obj);
            }
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }

    @InlineMe(imports = {"java.util.Objects"}, replacement = "Objects.equals(o1, o2)")
    @UnstableApi
    @Deprecated
    public static boolean areEqual(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2969b(SettableFuture settableFuture, ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2970c(ListenableFuture listenableFuture, SettableFuture settableFuture, AsyncFunction asyncFunction) {
        try {
            try {
                settableFuture.setFuture(asyncFunction.apply(Futures.getDone(listenableFuture)));
            } catch (Throwable th2) {
                settableFuture.setException(th2);
            }
        } catch (Error e11) {
            e = e11;
            settableFuture.setException(e);
        } catch (CancellationException unused) {
            settableFuture.cancel(false);
        } catch (RuntimeException e12) {
            e = e12;
            settableFuture.setException(e);
        } catch (ExecutionException e13) {
            e = e13;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            settableFuture.setException(e);
        }
    }

    @UnstableApi
    public static float constrainValue(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    @UnstableApi
    public static <T> boolean contains(SparseArray<T> sparseArray, int i11) {
        return sparseArray.indexOfKey(i11) >= 0;
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i11 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i11 < strArr.length) {
                map.put(strArr[i11], strArr[i11 + 1]);
                i11 += 2;
            } else {
                return map;
            }
        }
    }

    @UnstableApi
    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    @UnstableApi
    public static File createTempDirectory(Context context, String str) throws IOException {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    @UnstableApi
    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    @UnstableApi
    public static String escapeFileName(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (shouldEscapeCharacter(str.charAt(i13))) {
                i12++;
            }
        }
        if (i12 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i12 * 2) + length);
        while (i12 > 0) {
            int i14 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (shouldEscapeCharacter(cCharAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(cCharAt));
                i12--;
            } else {
                sb2.append(cCharAt);
            }
            i11 = i14;
        }
        if (i11 < length) {
            sb2.append((CharSequence) str, i11, length);
        }
        return sb2.toString();
    }

    @UnstableApi
    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            Matcher matcher = ISM_PATH_PATTERN.matcher(path);
            if (matcher.matches() && matcher.group(1) == null) {
                return Uri.withAppendedPath(uri, "Manifest");
            }
            return uri;
        }
        return uri;
    }

    @UnstableApi
    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean zIsPlayingAd = player.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean zHasNextMediaItem = player.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean zIsEmpty = player.getCurrentTimeline().isEmpty();
        Player.Commands.Builder builderAddIf = new Player.Commands.Builder().addAll(commands).addIf(4, !zIsPlayingAd);
        boolean z17 = false;
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z11 = true;
        } else {
            z11 = false;
        }
        Player.Commands.Builder builderAddIf2 = builderAddIf.addIf(5, z11);
        if (zHasPreviousMediaItem && !zIsPlayingAd) {
            z12 = true;
        } else {
            z12 = false;
        }
        Player.Commands.Builder builderAddIf3 = builderAddIf2.addIf(6, z12);
        if (!zIsEmpty && ((zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd)) {
            z13 = true;
        } else {
            z13 = false;
        }
        Player.Commands.Builder builderAddIf4 = builderAddIf3.addIf(7, z13);
        if (zHasNextMediaItem && !zIsPlayingAd) {
            z14 = true;
        } else {
            z14 = false;
        }
        Player.Commands.Builder builderAddIf5 = builderAddIf4.addIf(8, z14);
        if (!zIsEmpty && ((zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd)) {
            z15 = true;
        } else {
            z15 = false;
        }
        Player.Commands.Builder builderAddIf6 = builderAddIf5.addIf(9, z15).addIf(10, !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z16 = true;
        } else {
            z16 = false;
        }
        Player.Commands.Builder builderAddIf7 = builderAddIf6.addIf(11, z16);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z17 = true;
        }
        return builderAddIf7.addIf(12, z17).build();
    }

    @UnstableApi
    public static int getBigEndianInt(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.getInt(i11);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i12;
        }
        return Integer.reverseBytes(i12);
    }

    @UnstableApi
    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
        }
        return bArr;
    }

    @UnstableApi
    public static int getCodecCountOfType(@Nullable String str, int i11) {
        int i12 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i11 == MimeTypes.getTrackTypeOfCodec(str2)) {
                i12++;
            }
        }
        return i12;
    }

    @Nullable
    @UnstableApi
    public static String getCodecsOfType(@Nullable String str, int i11) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i11 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() <= 0) {
            return null;
        }
        return sb2.toString();
    }

    @UnstableApi
    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return looperMyLooper;
        }
        return Looper.getMainLooper();
    }

    @RequiresApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    @UnstableApi
    public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i11) {
        return resources.getDrawable(i11, context.getTheme());
    }

    @Nullable
    public static UUID getDrmUuid(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "playready":
                return C2711C.PLAYREADY_UUID;
            case "widevine":
                return C2711C.WIDEVINE_UUID;
            case "clearkey":
                return C2711C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    @UnstableApi
    public static int getIntegerCodeForString(String str) {
        boolean z11;
        int length = str.length();
        if (length <= 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        int iCharAt = 0;
        for (int i11 = 0; i11 < length; i11++) {
            iCharAt = (iCharAt << 8) | str.charAt(i11);
        }
        return iCharAt;
    }

    @UnstableApi
    public static String getLocaleLanguageTag(Locale locale) {
        return locale.toLanguageTag();
    }

    @UnstableApi
    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        if (isFrameDropAllowedOnSurfaceInput(context)) {
            return 1;
        }
        return 5;
    }

    @UnstableApi
    public static int getPcmFrameSize(int i11, int i12) {
        return getByteDepth(i11) * i12;
    }

    @UnstableApi
    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i11 = 0; i11 < systemLocales.length; i11++) {
            systemLocales[i11] = normalizeLanguageCode(systemLocales[i11]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (SDK_INT >= 24) {
            return getSystemLocalesV24(configuration);
        }
        return new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @RequiresApi(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    @UnstableApi
    public static String getTrackTypeString(int i11) {
        switch (i11) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i11 >= 10000) {
                    return "custom (" + i11 + ")";
                }
                return "?";
        }
    }

    @UnstableApi
    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + MediaLibraryInfo.VERSION_SLASHY;
    }

    @UnstableApi
    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(parsableByteArray2.getData(), iInflate, parsableByteArray2.capacity() - iInflate);
                if (inflater.finished()) {
                    parsableByteArray2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    @UnstableApi
    public static boolean isBitmapFactorySupportedMimeType(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                if (SDK_INT >= 34) {
                    return true;
                }
                return false;
            case "image/heic":
            case "image/heif":
                if (SDK_INT >= 26) {
                    return true;
                }
                return false;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @UnstableApi
    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            return false;
        }
        return true;
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        if (!"external".equals(str) && !"external_primary".equals(str)) {
            return false;
        }
        return true;
    }

    @RequiresApi(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
        if ("http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()))) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static boolean isWear(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    @UnstableApi
    public static int linearSearch(long[] jArr, long j11) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            if (jArr[i11] == j11) {
                return i11;
            }
        }
        return -1;
    }

    @UnstableApi
    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            long jMax = Long.MIN_VALUE;
            for (int i11 = 0; i11 < sparseLongArray.size(); i11++) {
                jMax = Math.max(jMax, sparseLongArray.valueAt(i11));
            }
            return jMax;
        }
        throw new NoSuchElementException();
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    @UnstableApi
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < sparseLongArray.size(); i11++) {
                jMin = Math.min(jMin, sparseLongArray.valueAt(i11));
            }
            return jMin;
        }
        throw new NoSuchElementException();
    }

    @UnstableApi
    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        boolean z11;
        if (list.size() == tArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        list.toArray(tArr);
    }

    @UnstableApi
    public static boolean postOrRun(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    @UnstableApi
    public static <T> ListenableFuture<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t11) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        postOrRun(handler, new Runnable() { // from class: androidx.media3.common.util.q
            @Override // java.lang.Runnable
            public final void run() {
                Util.m2968a(settableFutureCreate, runnable, t11);
            }
        });
        return settableFutureCreate;
    }

    @UnstableApi
    public static boolean readBoolean(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    private static long scaleLargeValueFallback(long j11, long j12, long j13, RoundingMode roundingMode) {
        long jSaturatedMultiply = LongMath.saturatedMultiply(j11, j12);
        if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
            return LongMath.divide(jSaturatedMultiply, j13, roundingMode);
        }
        long jGcd = LongMath.gcd(Math.abs(j12), Math.abs(j13));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jDivide = LongMath.divide(j12, jGcd, roundingMode2);
        long jDivide2 = LongMath.divide(j13, jGcd, roundingMode2);
        long jGcd2 = LongMath.gcd(Math.abs(j11), Math.abs(jDivide2));
        long jDivide3 = LongMath.divide(j11, jGcd2, roundingMode2);
        long jDivide4 = LongMath.divide(jDivide2, jGcd2, roundingMode2);
        long jSaturatedMultiply2 = LongMath.saturatedMultiply(jDivide3, jDivide);
        if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
            return LongMath.divide(jSaturatedMultiply2, jDivide4, roundingMode);
        }
        double d11 = jDivide3 * (jDivide / jDivide4);
        if (d11 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d11 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return DoubleMath.roundToLong(d11, roundingMode);
    }

    @UnstableApi
    public static void sneakyThrow(Throwable th2) throws Throwable {
        sneakyThrowInternal(th2);
    }

    @UnstableApi
    public static String[] splitCodecs(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return split(str.trim(), "(\\s*,\\s*)");
    }

    @UnstableApi
    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static long toLong(int i11, int i12) {
        return toUnsignedLong(i12) | (toUnsignedLong(i11) << 32);
    }

    @UnstableApi
    public static <T, U> ListenableFuture<T> transformFutureAsync(final ListenableFuture<U> listenableFuture, final AsyncFunction<U, T> asyncFunction) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.media3.common.util.n
            @Override // java.lang.Runnable
            public final void run() {
                Util.m2969b(settableFutureCreate, listenableFuture);
            }
        }, MoreExecutors.directExecutor());
        listenableFuture.addListener(new Runnable() { // from class: androidx.media3.common.util.o
            @Override // java.lang.Runnable
            public final void run() {
                Util.m2970c(listenableFuture, settableFutureCreate, asyncFunction);
            }
        }, MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    @Nullable
    @UnstableApi
    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '%') {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        int i13 = length - (i11 * 2);
        StringBuilder sb2 = new StringBuilder(i13);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i11 > 0 && matcher.find()) {
            char c11 = (char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c11);
            iEnd = matcher.end();
            i11--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i13) {
            return null;
        }
        return sb2.toString();
    }

    @UnstableApi
    public static void writeBoolean(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }

    @UnstableApi
    public static int binarySearchCeil(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(jArr, j11);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= jArr.length || jArr[i11] != j11) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.min(jArr.length - 1, i12) : i12;
    }

    @UnstableApi
    public static int binarySearchFloor(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(jArr, j11);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j11) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    public static int inferContentType(Uri uri) {
        int iInferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iInferContentTypeForExtension;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher((CharSequence) Assertions.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
                return 0;
            }
            if (strGroup.contains(ISM_HLS_FORMAT_EXTENSION)) {
                return 2;
            }
        }
        return 1;
    }

    @UnstableApi
    public static long getNowUnixTimeMs(long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return android.os.SystemClock.elapsedRealtime() + j11;
    }

    @UnstableApi
    public static String getStringForTime(StringBuilder sb2, Formatter formatter, long j11) {
        String str;
        if (j11 == C2711C.TIME_UNSET) {
            j11 = 0;
        }
        if (j11 < 0) {
            str = C33820nf.f71144W;
        } else {
            str = "";
        }
        long jAbs = (Math.abs(j11) + 500) / 1000;
        long j12 = jAbs % 60;
        long j13 = (jAbs / 60) % 60;
        long j14 = jAbs / C33978va.f72340i;
        sb2.setLength(0);
        if (j14 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    @UnstableApi
    public static long msToUs(long j11) {
        if (j11 != C2711C.TIME_UNSET && j11 != Long.MIN_VALUE) {
            return j11 * 1000;
        }
        return j11;
    }

    @UnstableApi
    public static long usToMs(long j11) {
        if (j11 != C2711C.TIME_UNSET && j11 != Long.MIN_VALUE) {
            return j11 / 1000;
        }
        return j11;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Collections.binarySearch(list, t11);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= size || list.get(i11).compareTo(t11) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.min(list.size() - 1, i12) : i12;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Collections.binarySearch(list, t11);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || list.get(i11).compareTo(t11) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    @UnstableApi
    public static Format getPcmFormat(AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (i11 > 0 && i12 > 0) {
                            return new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.m2957e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (SDK_INT >= 23) {
            getDisplaySizeV23(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    private static boolean maybeRequestReadStoragePermission(Activity activity, Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    @UnstableApi
    public static byte[] toByteArray(float f11) {
        return Ints.toByteArray(Float.floatToIntBits(f11));
    }

    @UnstableApi
    public static int binarySearchFloor(LongArray longArray, long j11, boolean z11, boolean z12) {
        int i11;
        int size = longArray.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            if (longArray.get(i13) < j11) {
                i12 = i13 + 1;
            } else {
                size = i13 - 1;
            }
        }
        if (z11 && (i11 = size + 1) < longArray.size() && longArray.get(i11) == j11) {
            return i11;
        }
        if (z12 && size == -1) {
            return 0;
        }
        return size;
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }

    @UnstableApi
    public static <T> T castNonNull(@Nullable T t11) {
        return t11;
    }

    @UnstableApi
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th2) throws Throwable {
        throw th2;
    }
}
