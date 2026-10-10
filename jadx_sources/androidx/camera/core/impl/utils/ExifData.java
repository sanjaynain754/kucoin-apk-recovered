package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.Preconditions;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33844oi;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.p505ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes23.dex */
public class ExifData {
    private static final String COMPONENTS_CONFIGURATION_YCBCR;
    private static final boolean DEBUG = false;
    static final ExifTag[] EXIF_POINTER_TAGS;
    static final ExifTag[][] EXIF_TAGS;
    private static final ExifTag[] IFD_EXIF_TAGS;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final String TAG = "ExifData";
    static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final HashSet<String> sTagSetForCompatibility;
    private final List<Map<String, ExifAttribute>> mAttributes;
    private final ByteOrder mByteOrder;

    public static final class Builder {
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        final List<Map<String, ExifAttribute>> mAttributes = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public Map<String, ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new HashMap();
            }
        });
        private final ByteOrder mByteOrder;
        private static final Pattern GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final List<HashMap<String, ExifTag>> sExifTagMapsForWriting = Collections.list(new Enumeration<HashMap<String, ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> map = new HashMap<>();
                for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    map.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return map;
            }
        });

        public Builder removeAttribute(String str) {
            setAttributeInternal(str, null, this.mAttributes);
            return this;
        }

        public Builder setExposureTimeNanos(long j11) {
            return setAttribute(ExifInterface.TAG_EXPOSURE_TIME, String.valueOf(j11 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public Builder setIso(int i11) {
            return setAttribute(ExifInterface.TAG_SENSITIVITY_TYPE, String.valueOf(3)).setAttribute(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, String.valueOf(Math.min(65535, i11)));
        }

        private static Pair<Integer, Integer> guessDataFormat(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strArrSplit[0]);
                if (((Integer) pairGuessDataFormat.first).intValue() == 2) {
                    return pairGuessDataFormat;
                }
                for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                    Pair<Integer, Integer> pairGuessDataFormat2 = guessDataFormat(strArrSplit[i11]);
                    int iIntValue = (((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.first) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.first)) ? ((Integer) pairGuessDataFormat.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairGuessDataFormat.second).intValue() == -1 || !(((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.second) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.second))) ? -1 : ((Integer) pairGuessDataFormat.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairGuessDataFormat;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j11 = Long.parseLong(str);
                        if (j11 < 0 || j11 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return j11 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j12 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j13 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j12 >= 0 && j13 >= 0) {
                        if (j12 <= 2147483647L && j13 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Switch 'out' block B:44:0x0146 for B:65:0x0195 already processed. Defaulting to fallback option. */
        private void setAttributeInternal(String str, String str2, List<Map<String, ExifAttribute>> list) {
            int i11;
            int i12;
            Builder builder = this;
            String str3 = str;
            String strReplaceAll = str2;
            if ((ExifInterface.TAG_DATETIME.equals(str3) || ExifInterface.TAG_DATETIME_ORIGINAL.equals(str3) || ExifInterface.TAG_DATETIME_DIGITIZED.equals(str3)) && strReplaceAll != null) {
                boolean zFind = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
                boolean zFind2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Logger.m1872w(ExifData.TAG, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll(C33820nf.f71144W, C33844oi.f71346o);
                }
            }
            if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str3)) {
                str3 = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
            }
            String str4 = str3;
            int i13 = 2;
            int i14 = 1;
            if (strReplaceAll != null && ExifData.sTagSetForCompatibility.contains(str4)) {
                if (str4.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                    Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        Logger.m1872w(ExifData.TAG, "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(1))) + "/1," + Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(2))) + "/1," + Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new LongRational(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e11) {
                        Logger.m1873w(ExifData.TAG, "Invalid value for " + str4 + " : " + strReplaceAll, e11);
                        return;
                    }
                }
            }
            int i15 = 0;
            while (i15 < ExifData.EXIF_TAGS.length) {
                ExifTag exifTag = sExifTagMapsForWriting.get(i15).get(str4);
                if (exifTag == null) {
                    i11 = i14;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strReplaceAll);
                        int i16 = -1;
                        if (exifTag.primaryFormat == ((Integer) pairGuessDataFormat.first).intValue() || exifTag.primaryFormat == ((Integer) pairGuessDataFormat.second).intValue()) {
                            i12 = exifTag.primaryFormat;
                        } else {
                            int i17 = exifTag.secondaryFormat;
                            if (i17 == -1 || !(i17 == ((Integer) pairGuessDataFormat.first).intValue() || exifTag.secondaryFormat == ((Integer) pairGuessDataFormat.second).intValue())) {
                                i12 = exifTag.primaryFormat;
                                if (i12 == i14 || i12 == 7 || i12 == i13) {
                                }
                            } else {
                                i12 = exifTag.secondaryFormat;
                            }
                        }
                        String str5 = "/";
                        switch (i12) {
                            case 1:
                                i11 = i14;
                                list.get(i15).put(str4, ExifAttribute.createByte(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                i11 = i14;
                                list.get(i15).put(str4, ExifAttribute.createString(strReplaceAll));
                                continue;
                            case 3:
                                i11 = i14;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                                    iArr[i18] = Integer.parseInt(strArrSplit[i18]);
                                }
                                list.get(i15).put(str4, ExifAttribute.createUShort(iArr, builder.mByteOrder));
                                continue;
                            case 4:
                                i11 = i14;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i19 = 0; i19 < strArrSplit2.length; i19++) {
                                    jArr[i19] = Long.parseLong(strArrSplit2[i19]);
                                }
                                list.get(i15).put(str4, ExifAttribute.createULong(jArr, builder.mByteOrder));
                                continue;
                            case 5:
                                i11 = i14;
                                int i21 = -1;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                LongRational[] longRationalArr = new LongRational[strArrSplit3.length];
                                int i22 = 0;
                                while (i22 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i22].split("/", i21);
                                    longRationalArr[i22] = new LongRational((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i11]));
                                    i22++;
                                    i21 = -1;
                                }
                                builder = this;
                                list.get(i15).put(str4, ExifAttribute.createURational(longRationalArr, builder.mByteOrder));
                                continue;
                            case 9:
                                i11 = i14;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i23 = 0; i23 < strArrSplit5.length; i23++) {
                                    iArr2[i23] = Integer.parseInt(strArrSplit5[i23]);
                                }
                                list.get(i15).put(str4, ExifAttribute.createSLong(iArr2, builder.mByteOrder));
                                continue;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                LongRational[] longRationalArr2 = new LongRational[strArrSplit6.length];
                                int i24 = 0;
                                while (i24 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i24].split(str5, i16);
                                    int i25 = i14;
                                    longRationalArr2[i24] = new LongRational((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i25]));
                                    i24++;
                                    i14 = i25;
                                    str5 = str5;
                                    i16 = -1;
                                }
                                i11 = i14;
                                list.get(i15).put(str4, ExifAttribute.createSRational(longRationalArr2, builder.mByteOrder));
                                continue;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i26 = 0; i26 < strArrSplit8.length; i26++) {
                                    dArr[i26] = Double.parseDouble(strArrSplit8[i26]);
                                }
                                list.get(i15).put(str4, ExifAttribute.createDouble(dArr, builder.mByteOrder));
                                break;
                        }
                    } else {
                        list.get(i15).remove(str4);
                    }
                    i11 = i14;
                }
                i15++;
                i14 = i11;
                i13 = 2;
            }
        }

        public ExifData build() {
            ArrayList list = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final Enumeration<Map<String, ExifAttribute>> mMapEnumeration;

                {
                    this.mMapEnumeration = Collections.enumeration(Builder.this.mAttributes);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public Map<String, ExifAttribute> nextElement() {
                    return new HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_EXPOSURE_PROGRAM, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_EXIF_VERSION, "0230", list);
                setAttributeIfMissing(ExifInterface.TAG_COMPONENTS_CONFIGURATION, ExifData.COMPONENTS_CONFIGURATION_YCBCR, list);
                setAttributeIfMissing(ExifInterface.TAG_METERING_MODE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                setAttributeIfMissing(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, String.valueOf(2), list);
                setAttributeIfMissing(ExifInterface.TAG_FILE_SOURCE, String.valueOf(3), list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_TYPE, String.valueOf(1), list);
                setAttributeIfMissing(ExifInterface.TAG_CUSTOM_RENDERED, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_CAPTURE_TYPE, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_CONTRAST, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SATURATION, String.valueOf(0), list);
                setAttributeIfMissing(ExifInterface.TAG_SHARPNESS, String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new ExifData(this.mByteOrder, list);
        }

        public Builder setAttribute(String str, String str2) {
            setAttributeInternal(str, str2, this.mAttributes);
            return this;
        }

        public Builder setFlashState(CameraCaptureMetaData.FlashState flashState) {
            int i11;
            if (flashState == CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i12 = C10451.f1695x649fcb98[flashState.ordinal()];
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 2) {
                i11 = 32;
            } else {
                if (i12 != 3) {
                    Logger.m1872w(ExifData.TAG, "Unknown flash state: " + flashState);
                    return this;
                }
                i11 = 1;
            }
            if ((i11 & 1) == 1) {
                setAttribute(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(4));
            }
            return setAttribute(ExifInterface.TAG_FLASH, String.valueOf(i11));
        }

        public Builder setFocalLength(float f11) {
            return setAttribute(ExifInterface.TAG_FOCAL_LENGTH, new LongRational((long) (f11 * 1000.0f), 1000L).toString());
        }

        public Builder setImageHeight(int i11) {
            return setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i11));
        }

        public Builder setImageWidth(int i11) {
            return setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i11));
        }

        public Builder setLensFNumber(float f11) {
            return setAttribute(ExifInterface.TAG_F_NUMBER, String.valueOf(f11));
        }

        public Builder setOrientationDegrees(int i11) {
            int i12;
            if (i11 == 0) {
                i12 = 1;
            } else if (i11 == 90) {
                i12 = 6;
            } else if (i11 == 180) {
                i12 = 3;
            } else if (i11 != 270) {
                Logger.m1872w(ExifData.TAG, "Unexpected orientation value: " + i11 + ". Must be one of 0, 90, 180, 270.");
                i12 = 0;
            } else {
                i12 = 8;
            }
            return setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i12));
        }

        public Builder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        private void setAttributeIfMissing(String str, String str2, List<Map<String, ExifAttribute>> list) {
            Iterator<Map<String, ExifAttribute>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, list);
        }

        public Builder setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode) {
            String strValueOf;
            int iOrdinal = whiteBalanceMode.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    strValueOf = null;
                } else {
                    strValueOf = String.valueOf(1);
                }
            } else {
                strValueOf = String.valueOf(0);
            }
            return setAttribute(ExifInterface.TAG_WHITE_BALANCE, strValueOf);
        }
    }

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$1 */
    public static /* synthetic */ class C10451 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState */
        static final /* synthetic */ int[] f1695x649fcb98;

        static {
            int[] iArr = new int[CameraCaptureMetaData.FlashState.values().length];
            f1695x649fcb98 = iArr;
            try {
                iArr[CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1695x649fcb98[CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1695x649fcb98[CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(ExifInterface.TAG_MAKE, 271, 2), new ExifTag(ExifInterface.TAG_MODEL, 272, 2), new ExifTag(ExifInterface.TAG_ORIENTATION, 274, 3), new ExifTag(ExifInterface.TAG_X_RESOLUTION, 282, 5), new ExifTag(ExifInterface.TAG_Y_RESOLUTION, 283, 5), new ExifTag(ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(ExifInterface.TAG_SOFTWARE, 305, 2), new ExifTag(ExifInterface.TAG_DATETIME, 306, 2), new ExifTag(ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4)};
        IFD_TIFF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new ExifTag(ExifInterface.TAG_F_NUMBER, 33437, 5), new ExifTag(ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new ExifTag(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new ExifTag(ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new ExifTag(ExifInterface.TAG_EXIF_VERSION, 36864, 2), new ExifTag(ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new ExifTag(ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new ExifTag(ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new ExifTag(ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new ExifTag(ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new ExifTag(ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new ExifTag(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new ExifTag(ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new ExifTag(ExifInterface.TAG_METERING_MODE, 37383, 3), new ExifTag(ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(ExifInterface.TAG_FLASH, 37385, 3), new ExifTag(ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new ExifTag(ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new ExifTag(ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new ExifTag(ExifInterface.TAG_COLOR_SPACE, 40961, 3), new ExifTag(ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new ExifTag(ExifInterface.TAG_SENSING_METHOD, 41495, 3), new ExifTag(ExifInterface.TAG_FILE_SOURCE, 41728, 7), new ExifTag(ExifInterface.TAG_SCENE_TYPE, 41729, 7), new ExifTag(ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new ExifTag(ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new ExifTag(ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new ExifTag(ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new ExifTag(ExifInterface.TAG_CONTRAST, 41992, 3), new ExifTag(ExifInterface.TAG_SATURATION, 41993, 3), new ExifTag(ExifInterface.TAG_SHARPNESS, 41994, 3)};
        IFD_EXIF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new ExifTag(ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new ExifTag(ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new ExifTag(ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new ExifTag(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        IFD_GPS_TAGS = exifTagArr3;
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4)};
        ExifTag[] exifTagArr4 = {new ExifTag(ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        sTagSetForCompatibility = new HashSet<>(Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_GPS_TIMESTAMP));
        COMPONENTS_CONFIGURATION_YCBCR = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public static Builder builderForDevice() {
        return new Builder(ByteOrder.BIG_ENDIAN).setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(1)).setAttribute(ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_RESOLUTION_UNIT, String.valueOf(2)).setAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING, String.valueOf(1)).setAttribute(ExifInterface.TAG_MAKE, Build.MANUFACTURER).setAttribute(ExifInterface.TAG_MODEL, Build.MODEL);
    }

    private ExifAttribute getExifAttribute(String str) {
        if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i11 = 0; i11 < EXIF_TAGS.length; i11++) {
            ExifAttribute exifAttribute = this.mAttributes.get(i11).get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public Map<String, ExifAttribute> getAttributes(int i11) {
        Preconditions.checkArgumentInRange(i11, 0, EXIF_TAGS.length, "Invalid IFD index: " + i11 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.mAttributes.get(i11);
    }

    public ByteOrder getByteOrder() {
        return this.mByteOrder;
    }

    public ExifData(ByteOrder byteOrder, List<Map<String, ExifAttribute>> list) {
        boolean z11;
        if (list.size() == EXIF_TAGS.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Malformed attributes list. Number of IFDs mismatch.");
        this.mByteOrder = byteOrder;
        this.mAttributes = list;
    }

    public static ExifData create(ImageProxy imageProxy, int i11) {
        Builder builderBuilderForDevice = builderForDevice();
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builderBuilderForDevice);
        }
        builderBuilderForDevice.setOrientationDegrees(i11);
        return builderBuilderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    public String getAttribute(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mByteOrder);
            }
            if (str.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                int i11 = exifAttribute.format;
                if (i11 != 5 && i11 != 10) {
                    Logger.m1872w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                LongRational[] longRationalArr = (LongRational[]) exifAttribute.getValue(this.mByteOrder);
                if (longRationalArr != null && longRationalArr.length == 3) {
                    return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (longRationalArr[0].getNumerator() / longRationalArr[0].getDenominator())), Integer.valueOf((int) (longRationalArr[1].getNumerator() / longRationalArr[1].getDenominator())), Integer.valueOf((int) (longRationalArr[2].getNumerator() / longRationalArr[2].getDenominator())));
                }
                Logger.m1872w(TAG, "Invalid GPS Timestamp array. array=" + Arrays.toString(longRationalArr));
                return null;
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
