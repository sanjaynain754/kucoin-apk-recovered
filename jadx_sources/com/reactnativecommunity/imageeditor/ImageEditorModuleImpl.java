package com.reactnativecommunity.imageeditor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ImageEditorModuleImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ[\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\f\"\u0004\b\u0000\u0010\t2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJi\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\fH\u0002¢\u0006\u0004\b%\u0010&Jy\u0010-\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\fH\u0002¢\u0006\u0004\b-\u0010.JA\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0010\u001a\u00020\u000b2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\fH\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m90084d2 = {"Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "n", "()V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "map", "p", "(Ljava/util/HashMap;)Ljava/util/HashMap;", "uri", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "j", "Ljava/io/File;", "directory", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/io/File;)V", "Landroid/graphics/BitmapFactory$Options;", "outOptions", "", "x", "y", "width", "height", "headers", "Landroid/graphics/Bitmap;", "m", "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIILjava/util/HashMap;)Landroid/graphics/Bitmap;", "xPos", "yPos", "rectWidth", "rectHeight", "outputWidth", "outputHeight", "k", "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIIIILjava/util/HashMap;)Landroid/graphics/Bitmap;", "Ljava/io/InputStream;", "o", "(Ljava/lang/String;Ljava/util/HashMap;)Ljava/io/InputStream;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lkotlinx/coroutines/m0;", "b", "Lkotlinx/coroutines/m0;", "moduleCoroutineScope", "c", "Companion", "react-native-community_image-editor_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageEditorModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditorModuleImpl.kt\ncom/reactnativecommunity/imageeditor/ImageEditorModuleImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,672:1\n503#2,7:673\n1#3:680\n216#4,2:681\n*S KotlinDebug\n*F\n+ 1 ImageEditorModuleImpl.kt\ncom/reactnativecommunity/imageeditor/ImageEditorModuleImpl\n*L\n96#1:673,7\n357#1:681,2\n*E\n"})
public final class ImageEditorModuleImpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<String> f55862d = CollectionsKt.listOf((Object[]) new String[]{"file", "content", "android.resource"});

    /* JADX INFO: renamed from: e */
    @SuppressLint({"InlinedApi"})
    @NotNull
    public static final String[] f55863e = {ExifInterface.TAG_APERTURE_VALUE, ExifInterface.TAG_MAX_APERTURE_VALUE, ExifInterface.TAG_METERING_MODE, ExifInterface.TAG_ARTIST, ExifInterface.TAG_BITS_PER_SAMPLE, ExifInterface.TAG_COMPRESSION, ExifInterface.TAG_BODY_SERIAL_NUMBER, ExifInterface.TAG_BRIGHTNESS_VALUE, ExifInterface.TAG_CONTRAST, "CameraOwnerName", ExifInterface.TAG_COLOR_SPACE, ExifInterface.TAG_COPYRIGHT, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_DATETIME_ORIGINAL, ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, ExifInterface.TAG_DIGITAL_ZOOM_RATIO, ExifInterface.TAG_EXIF_VERSION, ExifInterface.TAG_EXPOSURE_BIAS_VALUE, ExifInterface.TAG_EXPOSURE_INDEX, ExifInterface.TAG_EXPOSURE_MODE, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_EXPOSURE_PROGRAM, ExifInterface.TAG_FLASH, ExifInterface.TAG_FLASH_ENERGY, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, ExifInterface.TAG_PLANAR_CONFIGURATION, ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_GAIN_CONTROL, ExifInterface.TAG_GAMMA, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_AREA_INFORMATION, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_DOP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_DEST_BEARING, ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.TAG_GPS_DEST_DISTANCE, ExifInterface.TAG_GPS_DEST_DISTANCE_REF, ExifInterface.TAG_GPS_DEST_LATITUDE, ExifInterface.TAG_GPS_DEST_LATITUDE_REF, ExifInterface.TAG_GPS_DEST_LONGITUDE, ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, ExifInterface.TAG_GPS_DIFFERENTIAL, ExifInterface.TAG_GPS_IMG_DIRECTION, ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.TAG_GPS_MAP_DATUM, ExifInterface.TAG_GPS_MEASURE_MODE, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_SATELLITES, ExifInterface.TAG_GPS_SPEED, ExifInterface.TAG_GPS_SPEED_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_GPS_TRACK, ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.TAG_GPS_VERSION_ID, ExifInterface.TAG_IMAGE_DESCRIPTION, ExifInterface.TAG_IMAGE_UNIQUE_ID, ExifInterface.TAG_ISO_SPEED, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, ExifInterface.TAG_LENS_MAKE, ExifInterface.TAG_LENS_MODEL, ExifInterface.TAG_LENS_SERIAL_NUMBER, ExifInterface.TAG_LENS_SPECIFICATION, ExifInterface.TAG_LIGHT_SOURCE, ExifInterface.TAG_MAKE, ExifInterface.TAG_MAKER_NOTE, ExifInterface.TAG_MODEL, ExifInterface.TAG_ORIENTATION, ExifInterface.TAG_SATURATION, ExifInterface.TAG_SHARPNESS, ExifInterface.TAG_SHUTTER_SPEED_VALUE, ExifInterface.TAG_SOFTWARE, ExifInterface.TAG_SUBJECT_DISTANCE, ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, ExifInterface.TAG_SUBJECT_LOCATION, ExifInterface.TAG_USER_COMMENT, ExifInterface.TAG_WHITE_BALANCE};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 moduleCoroutineScope;

    /* JADX INFO: compiled from: ImageEditorModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b1\u00102J/\u00107\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010:R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, m90084d2 = {"Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;", "", "<init>", "()V", "Ljava/io/File;", "resizedImage", "Landroid/graphics/Bitmap;", "image", "", "mimeType", "", "includeBase64", "Lcom/facebook/react/bridge/WritableMap;", "j", "(Ljava/io/File;Landroid/graphics/Bitmap;Ljava/lang/String;Z)Lcom/facebook/react/bridge/WritableMap;", "file", "c", "(Ljava/io/File;)Ljava/lang/String;", "Landroid/graphics/BitmapFactory$Options;", "outOptions", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "i", "(Landroid/content/Context;Landroid/net/Uri;)I", "oldImage", "newFile", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;)V", "g", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/File;", "k", "(Ljava/lang/String;)Z", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/graphics/Bitmap$CompressFormat;", "d", "(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;", "cropped", "tempFile", "compressQuality", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/io/File;I)V", "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "width", "height", Snapshot.TARGET_WIDTH, Snapshot.TARGET_HEIGHT, "e", "(IIII)I", "NAME", "Ljava/lang/String;", "", "LOCAL_URI_PREFIXES", "Ljava/util/List;", "TEMP_FILE_PREFIX", "", "EXIF_ATTRIBUTES", "[Ljava/lang/String;", "react-native-community_image-editor_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nImageEditorModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditorModuleImpl.kt\ncom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,672:1\n1#2:673\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public final int m68127e(int width, int height, int targetWidth, int targetHeight) {
            int i11 = 1;
            if (height <= targetHeight && width <= targetWidth) {
                return 1;
            }
            int i12 = height / 2;
            int i13 = width / 2;
            while (i13 / i11 >= targetWidth && i12 / i11 >= targetHeight) {
                i11 *= 2;
            }
            return i11;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public final String m68125c(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        /* JADX INFO: renamed from: d */
        public final Bitmap.CompressFormat m68126d(String mimeType) {
            Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
            if (Intrinsics.areEqual(mimeType, "image/png")) {
                return Bitmap.CompressFormat.PNG;
            }
            return Intrinsics.areEqual(mimeType, "image/webp") ? compressFormat : Bitmap.CompressFormat.JPEG;
        }

        /* JADX INFO: renamed from: f */
        public final String m68128f(String mimeType) {
            if (Intrinsics.areEqual(mimeType, "image/png")) {
                return ".png";
            }
            return Intrinsics.areEqual(mimeType, "image/webp") ? ".webp" : ".jpg";
        }

        /* JADX WARN: Code duplicated, block: B:22:0x003c  */
        /* JADX INFO: renamed from: h */
        public final String m68130h(BitmapFactory.Options outOptions, String format) {
            String str;
            if (format == null) {
                str = outOptions.outMimeType;
            } else {
                int iHashCode = format.hashCode();
                if (iHashCode != 111145) {
                    if (iHashCode != 3268712) {
                        if (iHashCode == 3645340 && format.equals("webp")) {
                            str = "image/webp";
                        } else {
                            str = outOptions.outMimeType;
                        }
                    } else if (format.equals("jpeg")) {
                        str = "image/jpeg";
                    } else {
                        str = outOptions.outMimeType;
                    }
                } else if (format.equals("png")) {
                    str = "image/png";
                } else {
                    str = outOptions.outMimeType;
                }
            }
            return (str == null || str.length() == 0) ? "image/jpeg" : str;
        }

        /* JADX INFO: renamed from: l */
        public final void m68134l(Bitmap cropped, String mimeType, File tempFile, int compressQuality) throws IOException {
            FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            try {
                cropped.compress(ImageEditorModuleImpl.INSTANCE.m68126d(mimeType), compressQuality, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m68123a(Context context, Uri oldImage, File newFile) throws Throwable {
            File fileM68129g = m68129g(context, oldImage);
            if (fileM68129g == null) {
                C45999a.m101488I(ReactConstants.TAG, "Couldn't get real path for uri: " + oldImage);
                return;
            }
            ExifInterface exifInterface = new ExifInterface(fileM68129g.getAbsolutePath());
            ExifInterface exifInterface2 = new ExifInterface(newFile.getAbsolutePath());
            for (String str : ImageEditorModuleImpl.f55863e) {
                String attribute = exifInterface.getAttribute(str);
                if (attribute != null) {
                    exifInterface2.setAttribute(str, attribute);
                }
            }
            exifInterface2.saveAttributes();
        }

        /* JADX INFO: renamed from: b */
        public final File m68124b(Context context, String mimeType) throws IOException {
            File externalCacheDir = context.getExternalCacheDir();
            File cacheDir = context.getCacheDir();
            if (externalCacheDir == null && cacheDir == null) {
                throw new IOException("No cache directory available");
            }
            if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
                externalCacheDir = cacheDir;
            }
            File fileCreateTempFile = File.createTempFile("ReactNative_cropped_image_", m68128f(mimeType), externalCacheDir);
            Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
            return fileCreateTempFile;
        }

        /* JADX INFO: renamed from: g */
        public final File m68129g(Context context, Uri uri) {
            Cursor cursorQuery;
            if (Intrinsics.areEqual(uri.getScheme(), "file")) {
                String path = uri.getPath();
                if (path == null) {
                    return null;
                }
                return new File(path);
            }
            if (Intrinsics.areEqual(uri.getScheme(), "content") && (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(0);
                        if (!TextUtils.isEmpty(string)) {
                            File file = new File(string);
                            CloseableKt.closeFinally(cursorQuery, null);
                            return file;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public final int m68131i(Context context, Uri uri) {
            File fileM68129g = m68129g(context, uri);
            if (fileM68129g == null) {
                return 0;
            }
            int attributeInt = new ExifInterface(fileM68129g.getAbsolutePath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        }

        /* JADX INFO: renamed from: j */
        public final WritableMap m68132j(File resizedImage, Bitmap image, String mimeType, boolean includeBase64) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("path", resizedImage.getAbsolutePath());
            writableMapCreateMap.putString("uri", Uri.fromFile(resizedImage).toString());
            writableMapCreateMap.putString("name", resizedImage.getName());
            writableMapCreateMap.putInt("size", (int) resizedImage.length());
            writableMapCreateMap.putInt("width", image.getWidth());
            writableMapCreateMap.putInt("height", image.getHeight());
            writableMapCreateMap.putString("type", mimeType);
            if (includeBase64) {
                writableMapCreateMap.putString("base64", m68125c(resizedImage));
            }
            Intrinsics.checkNotNull(writableMapCreateMap);
            return writableMapCreateMap;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m68133k(String uri) {
            Iterator it = ImageEditorModuleImpl.f55862d.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(uri, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final InputStream m68121o(String uri, HashMap<String, Object> headers) {
        if (StringsKt.startsWith$default(uri, "data:", false, 2, (Object) null)) {
            String strSubstring = uri.substring(StringsKt.indexOf$default((CharSequence) uri, ",", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new ByteArrayInputStream(Base64.decode(strSubstring, 0));
        }
        if (INSTANCE.m68133k(uri)) {
            return this.reactContext.getContentResolver().openInputStream(Uri.parse(uri));
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri).openConnection());
        if (headers != null) {
            for (Map.Entry<String, Object> entry : headers.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    uRLConnection.setRequestProperty(key, (String) value);
                }
            }
        }
        return uRLConnection.getInputStream();
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final <V> HashMap<String, Object> m68122p(@Nullable HashMap<String, V> map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, V> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m68115h(File directory) {
        File[] fileArrListFiles = directory.listFiles(new FilenameFilter() { // from class: com.reactnativecommunity.imageeditor.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ImageEditorModuleImpl.m68114i(file, str);
            }
        });
        if (fileArrListFiles != null) {
            Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m68116j() {
        C41696j.m91104d(this.moduleCoroutineScope, null, null, new ImageEditorModuleImpl$cleanTask$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final Bitmap m68117k(BitmapFactory.Options outOptions, String uri, int xPos, int yPos, int rectWidth, int rectHeight, int outputWidth, int outputHeight, HashMap<String, Object> headers) {
        Pair pairM90091to;
        C38115a.m86047c(outOptions);
        InputStream inputStreamM68121o = m68121o(uri, headers);
        if (inputStreamM68121o == null) {
            return null;
        }
        try {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = Build.VERSION.SDK_INT >= 31 ? BitmapRegionDecoder.newInstance(inputStreamM68121o) : BitmapRegionDecoder.newInstance(inputStreamM68121o, false);
            if (bitmapRegionDecoderNewInstance == null) {
                throw new Error("Could not create bitmap decoder. Uri: " + uri);
            }
            Companion companion = INSTANCE;
            ReactApplicationContext reactApplicationContext = this.reactContext;
            Uri uri2 = Uri.parse(uri);
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            int iM68131i = companion.m68131i(reactApplicationContext, uri2);
            if (iM68131i == 90) {
                pairM90091to = TuplesKt.m90091to(Integer.valueOf(yPos), Integer.valueOf((bitmapRegionDecoderNewInstance.getHeight() - rectWidth) - xPos));
            } else if (iM68131i != 180) {
                pairM90091to = iM68131i != 270 ? TuplesKt.m90091to(Integer.valueOf(xPos), Integer.valueOf(yPos)) : TuplesKt.m90091to(Integer.valueOf((bitmapRegionDecoderNewInstance.getWidth() - rectHeight) - yPos), Integer.valueOf(xPos));
            } else {
                pairM90091to = TuplesKt.m90091to(Integer.valueOf((bitmapRegionDecoderNewInstance.getWidth() - rectWidth) - xPos), Integer.valueOf((bitmapRegionDecoderNewInstance.getHeight() - rectHeight) - yPos));
            }
            int iIntValue = ((Number) pairM90091to.component1()).intValue();
            int iIntValue2 = ((Number) pairM90091to.component2()).intValue();
            Pair pairM90091to2 = (iM68131i == 90 || iM68131i == 270) ? TuplesKt.m90091to(Integer.valueOf(rectHeight), Integer.valueOf(rectWidth)) : TuplesKt.m90091to(Integer.valueOf(rectWidth), Integer.valueOf(rectHeight));
            int iIntValue3 = ((Number) pairM90091to2.component1()).intValue();
            int iIntValue4 = ((Number) pairM90091to2.component2()).intValue();
            Pair pairM90091to3 = (iM68131i == 90 || iM68131i == 270) ? TuplesKt.m90091to(Integer.valueOf(outputHeight), Integer.valueOf(outputWidth)) : TuplesKt.m90091to(Integer.valueOf(outputWidth), Integer.valueOf(outputHeight));
            int iIntValue5 = ((Number) pairM90091to3.component1()).intValue();
            int iIntValue6 = ((Number) pairM90091to3.component2()).intValue();
            float f11 = iIntValue3;
            float f12 = iIntValue4;
            float f13 = iIntValue5;
            float f14 = iIntValue6;
            float f15 = f13 / f14;
            boolean z11 = f11 / f12 > f15;
            float f16 = z11 ? f12 * f15 : f11;
            float f17 = z11 ? f12 : f11 / f15;
            float f18 = z11 ? iIntValue + ((f11 - f16) / 2) : iIntValue;
            float f19 = z11 ? iIntValue2 : iIntValue2 + ((f12 - f17) / 2);
            float f21 = z11 ? f14 / f12 : f13 / f11;
            int iM68127e = companion.m68127e(iIntValue3, iIntValue4, iIntValue5, iIntValue6);
            outOptions.inSampleSize = iM68127e;
            int iRoundToInt = MathKt.roundToInt(f18 / iM68127e);
            int iRoundToInt2 = MathKt.roundToInt(f19 / outOptions.inSampleSize);
            int iRoundToInt3 = MathKt.roundToInt(f16 / outOptions.inSampleSize);
            int iRoundToInt4 = MathKt.roundToInt(f17 / outOptions.inSampleSize);
            float f22 = f21 * outOptions.inSampleSize;
            Matrix matrix = new Matrix();
            matrix.setScale(f22, f22);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapRegionDecoderNewInstance.decodeRegion(new Rect(0, 0, bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight()), outOptions), iRoundToInt, iRoundToInt2, iRoundToInt3, iRoundToInt4, matrix, true);
            CloseableKt.closeFinally(inputStreamM68121o, null);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(inputStreamM68121o, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m68118l(@Nullable String uri, @NotNull ReadableMap options, @NotNull Promise promise) {
        HashMap<String, Object> mapM68122p;
        int i11;
        int i12;
        Pair pair;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            mapM68122p = m68122p(map != null ? map.toHashMap() : null);
        } else {
            mapM68122p = null;
        }
        String string = options.hasKey(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT) ? options.getString(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT) : null;
        ReadableMap map2 = options.hasKey(TypedValues.CycleType.S_WAVE_OFFSET) ? options.getMap(TypedValues.CycleType.S_WAVE_OFFSET) : null;
        ReadableMap map3 = options.hasKey("size") ? options.getMap("size") : null;
        boolean z11 = options.hasKey("includeBase64") ? options.getBoolean("includeBase64") : false;
        if (options.hasKey(C33757kf.f70665k)) {
            i11 = 0;
            i12 = (int) (options.getDouble(C33757kf.f70665k) * ((double) 100));
        } else {
            i11 = 0;
            i12 = 90;
        }
        int i13 = i12;
        if (map2 == null || map3 == null || !map2.hasKey("x") || !map2.hasKey("y") || !map3.hasKey("width") || !map3.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        }
        if (uri == null || uri.length() == 0) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        }
        if (i13 > 100 || i13 < 0) {
            promise.reject(new JSApplicationIllegalArgumentException("quality must be a number between 0 and 1"));
            return;
        }
        int i14 = i11;
        int i15 = (int) map2.getDouble("x");
        int i16 = (int) map2.getDouble("y");
        int i17 = (int) map3.getDouble("width");
        int i18 = (int) map3.getDouble("height");
        if (options.hasKey("displaySize")) {
            ReadableMap map4 = options.getMap("displaySize");
            Intrinsics.checkNotNull(map4);
            pair = new Pair(Integer.valueOf((int) map4.getDouble("width")), Integer.valueOf((int) map4.getDouble("height")));
        } else {
            pair = new Pair(Integer.valueOf(i14), Integer.valueOf(i14));
        }
        C41696j.m91104d(this.moduleCoroutineScope, null, null, new ImageEditorModuleImpl$cropImage$1(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue(), this, uri, i15, i16, i17, i18, mapM68122p, string, i13, promise, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m68120n() {
        if (C41713n0.m91132h(this.moduleCoroutineScope)) {
            C41713n0.m91129e(this.moduleCoroutineScope, null, 1, null);
        }
        m68116j();
    }

    public ImageEditorModuleImpl(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.moduleCoroutineScope = C41713n0.m91125a(C41782z0.m91391a());
        m68116j();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m68114i(File file, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "ReactNative_cropped_image_", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: m */
    public final Bitmap m68119m(BitmapFactory.Options outOptions, String uri, int x11, int y11, int width, int height, HashMap<String, Object> headers) {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        Pair pairM90091to;
        Pair pairM90091to2;
        InputStream inputStreamM68121o = m68121o(uri, headers);
        if (inputStreamM68121o == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamM68121o);
            } else {
                bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamM68121o, false);
            }
            if (bitmapRegionDecoderNewInstance != null) {
                int height2 = bitmapRegionDecoderNewInstance.getHeight();
                int width2 = bitmapRegionDecoderNewInstance.getWidth();
                Companion companion = INSTANCE;
                ReactApplicationContext reactApplicationContext = this.reactContext;
                Uri uri2 = Uri.parse(uri);
                Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                int iM68131i = companion.m68131i(reactApplicationContext, uri2);
                if (iM68131i != 90) {
                    if (iM68131i != 180) {
                        if (iM68131i != 270) {
                            pairM90091to = TuplesKt.m90091to(Integer.valueOf(x11), Integer.valueOf(y11));
                        } else {
                            pairM90091to = TuplesKt.m90091to(Integer.valueOf((width2 - height) - y11), Integer.valueOf(x11));
                        }
                    } else {
                        pairM90091to = TuplesKt.m90091to(Integer.valueOf((width2 - width) - x11), Integer.valueOf((height2 - height) - y11));
                    }
                } else {
                    pairM90091to = TuplesKt.m90091to(Integer.valueOf(y11), Integer.valueOf((height2 - width) - x11));
                }
                int iIntValue = ((Number) pairM90091to.component1()).intValue();
                int iIntValue2 = ((Number) pairM90091to.component2()).intValue();
                if (iM68131i != 90 && iM68131i != 270) {
                    pairM90091to2 = TuplesKt.m90091to(Integer.valueOf(width + iIntValue), Integer.valueOf(height + iIntValue2));
                } else {
                    pairM90091to2 = TuplesKt.m90091to(Integer.valueOf(height + iIntValue), Integer.valueOf(width + iIntValue2));
                }
                try {
                    Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(new Rect(iIntValue, iIntValue2, ((Number) pairM90091to2.component1()).intValue(), ((Number) pairM90091to2.component2()).intValue()), outOptions);
                    bitmapRegionDecoderNewInstance.recycle();
                    CloseableKt.closeFinally(inputStreamM68121o, null);
                    return bitmapDecodeRegion;
                } catch (Throwable th2) {
                    bitmapRegionDecoderNewInstance.recycle();
                    throw th2;
                }
            }
            throw new Error("Could not create bitmap decoder. Uri: " + uri);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(inputStreamM68121o, th3);
                throw th4;
            }
        }
    }
}
