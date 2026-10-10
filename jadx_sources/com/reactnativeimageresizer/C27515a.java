package com.reactnativeimageresizer;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.proguard.C33978va;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: com.reactnativeimageresizer.a */
/* JADX INFO: compiled from: ImageResizer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27515a {

    /* JADX INFO: renamed from: a */
    public static final String[] f55903a = {ExifInterface.TAG_APERTURE_VALUE, ExifInterface.TAG_MAX_APERTURE_VALUE, ExifInterface.TAG_METERING_MODE, ExifInterface.TAG_ARTIST, ExifInterface.TAG_BITS_PER_SAMPLE, ExifInterface.TAG_COMPRESSION, ExifInterface.TAG_BODY_SERIAL_NUMBER, ExifInterface.TAG_BRIGHTNESS_VALUE, ExifInterface.TAG_CONTRAST, "CameraOwnerName", ExifInterface.TAG_COLOR_SPACE, ExifInterface.TAG_COPYRIGHT, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_DATETIME_ORIGINAL, ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, ExifInterface.TAG_DIGITAL_ZOOM_RATIO, ExifInterface.TAG_EXIF_VERSION, ExifInterface.TAG_EXPOSURE_BIAS_VALUE, ExifInterface.TAG_EXPOSURE_INDEX, ExifInterface.TAG_EXPOSURE_MODE, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_EXPOSURE_PROGRAM, ExifInterface.TAG_FLASH, ExifInterface.TAG_FLASH_ENERGY, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, ExifInterface.TAG_PLANAR_CONFIGURATION, ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_GAIN_CONTROL, ExifInterface.TAG_GAMMA, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_AREA_INFORMATION, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_DOP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_DEST_BEARING, ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.TAG_GPS_DEST_DISTANCE, ExifInterface.TAG_GPS_DEST_DISTANCE_REF, ExifInterface.TAG_GPS_DEST_LATITUDE, ExifInterface.TAG_GPS_DEST_LATITUDE_REF, ExifInterface.TAG_GPS_DEST_LONGITUDE, ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, ExifInterface.TAG_GPS_DIFFERENTIAL, ExifInterface.TAG_GPS_IMG_DIRECTION, ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.TAG_GPS_MAP_DATUM, ExifInterface.TAG_GPS_MEASURE_MODE, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_SATELLITES, ExifInterface.TAG_GPS_SPEED, ExifInterface.TAG_GPS_SPEED_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_GPS_TRACK, ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.TAG_GPS_VERSION_ID, ExifInterface.TAG_IMAGE_DESCRIPTION, ExifInterface.TAG_IMAGE_UNIQUE_ID, ExifInterface.TAG_ISO_SPEED, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, ExifInterface.TAG_LENS_MAKE, ExifInterface.TAG_LENS_MODEL, ExifInterface.TAG_LENS_SERIAL_NUMBER, ExifInterface.TAG_LENS_SPECIFICATION, ExifInterface.TAG_LIGHT_SOURCE, ExifInterface.TAG_MAKE, ExifInterface.TAG_MAKER_NOTE, ExifInterface.TAG_MODEL, ExifInterface.TAG_SATURATION, ExifInterface.TAG_SHARPNESS, ExifInterface.TAG_SHUTTER_SPEED_VALUE, ExifInterface.TAG_SOFTWARE, ExifInterface.TAG_SUBJECT_DISTANCE, ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, ExifInterface.TAG_SUBJECT_LOCATION, ExifInterface.TAG_USER_COMMENT, ExifInterface.TAG_WHITE_BALANCE};

    /* JADX INFO: renamed from: j */
    public static Bitmap m68157j(Uri uri, int i11, int i12) throws Throwable {
        InputStream inputStream = null;
        Bitmap bitmapDecodeByteArray = null;
        inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
                httpURLConnection.connect();
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int i13 = inputStream2.read(bArr, 0, 1024);
                                if (i13 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i13);
                            } catch (Throwable th2) {
                                byteArrayOutputStream.close();
                                throw th2;
                            }
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                        options.inSampleSize = m68148a(options, i11, i12);
                        options.inJustDecodeBounds = false;
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    } catch (Exception e11) {
                        e = e11;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        throw new IOException("Error fetching remote image file.");
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                        return bitmapDecodeByteArray;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                return bitmapDecodeByteArray;
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m68158k(Bitmap bitmap, int i11, int i12, String str, boolean z11) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i12 > 0 && i11 > 0) {
            if (!str.equals("stretch")) {
                float f11 = width;
                float f12 = i11 / f11;
                float f13 = height;
                float f14 = i12 / f13;
                float fMax = str.equals("cover") ? Math.max(f12, f14) : Math.min(f12, f14);
                if (z11) {
                    fMax = Math.min(fMax, 1.0f);
                }
                int iRound = Math.round(f11 * fMax);
                i12 = Math.round(f13 * fMax);
                i11 = iRound;
            } else if (z11) {
                i11 = Math.min(width, i11);
                i12 = Math.min(height, i12);
            }
            try {
                return Bitmap.createScaledBitmap(bitmap, i11, i12, true);
            } catch (OutOfMemoryError unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static int m68148a(BitmapFactory.Options options, int i11, int i12) {
        int i13 = options.outHeight;
        int i14 = options.outWidth;
        int i15 = 1;
        if (i13 <= i12 && i14 <= i11) {
            return 1;
        }
        int i16 = i13 / 2;
        int i17 = i14 / 2;
        while (i16 / i15 >= i12 && i17 / i15 >= i11) {
            i15 *= 2;
        }
        return i15;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x002d, B:19:0x0033, B:21:0x003b, B:24:0x0041, B:25:0x0044), top: B:30:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x002d, B:19:0x0033, B:21:0x003b, B:24:0x0041, B:25:0x0044), top: B:30:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0041 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static boolean m68149b(Context context, Uri uri, String str) throws Throwable {
        ExifInterface exifInterface;
        int i11;
        String attribute;
        ExifInterface exifInterface2 = null;
        try {
            File fileM68151d = m68151d(context, uri);
            if (!fileM68151d.exists()) {
                return false;
            }
            exifInterface = new ExifInterface(fileM68151d.getAbsolutePath());
            try {
                exifInterface2 = new ExifInterface(str);
            } catch (Exception e11) {
                e = e11;
                Log.e("ImageResizer::copyExif", "EXIF read failed", e);
            }
            if (exifInterface != null && exifInterface2 != null) {
                try {
                    for (String str2 : f55903a) {
                        attribute = exifInterface.getAttribute(str2);
                        if (attribute != null) {
                            exifInterface2.setAttribute(str2, attribute);
                        }
                    }
                    exifInterface2.saveAttributes();
                    return true;
                } catch (Exception e12) {
                    Log.e("ImageResizer::copyExif", "EXIF copy failed", e12);
                }
            }
            return false;
        } catch (Exception e13) {
            e = e13;
            exifInterface = null;
        }
        Log.e("ImageResizer::copyExif", "EXIF read failed", e);
        if (exifInterface != null) {
            while (i11 < r8) {
                attribute = exifInterface.getAttribute(str2);
                if (attribute != null) {
                    exifInterface2.setAttribute(str2, attribute);
                }
            }
            exifInterface2.saveAttributes();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static File m68151d(Context context, Uri uri) {
        File file = new File(uri.getPath());
        if (!file.exists()) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                cursorQuery.moveToFirst();
                File file2 = new File(cursorQuery.getString(columnIndexOrThrow));
                cursorQuery.close();
                return file2;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                cursorQuery.close();
                throw th2;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: f */
    public static Matrix m68153f(ExifInterface exifInterface) {
        Matrix matrix = new Matrix();
        switch (exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 0)) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(270.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(270.0f);
                break;
        }
        return matrix;
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m68156i(Context context, Uri uri, int i11, int i12) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m68154g(context, uri, options);
        options.inSampleSize = m68148a(options, i11, i12);
        options.inJustDecodeBounds = false;
        return m68154g(context, uri, options);
    }

    /* JADX INFO: renamed from: m */
    public static File m68160m(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat, int i11) throws IOException {
        if (bitmap == null) {
            throw new IOException("The bitmap couldn't be resized");
        }
        File file2 = new File(file, str + C33978va.f72339h + compressFormat.name());
        if (!file2.createNewFile()) {
            throw new IOException("The file already exists");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i11, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(byteArray);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file2;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m68150c(Context context, Uri uri, int i11, int i12, int i13, int i14, String str, boolean z11) throws Throwable {
        Bitmap bitmapM68156i;
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.equalsIgnoreCase("file") && !scheme.equalsIgnoreCase("content")) {
            if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                if (scheme.equalsIgnoreCase("data")) {
                    bitmapM68156i = m68155h(uri);
                } else {
                    bitmapM68156i = null;
                }
            } else {
                bitmapM68156i = m68157j(uri, i11, i12);
            }
        } else {
            bitmapM68156i = m68156i(context, uri, i11, i12);
        }
        if (bitmapM68156i != null) {
            Bitmap bitmapM68159l = m68159l(bitmapM68156i, m68152e(context, uri), i14);
            if (bitmapM68159l != null) {
                if (bitmapM68159l != bitmapM68156i) {
                    bitmapM68156i.recycle();
                }
                Bitmap bitmapM68158k = m68158k(bitmapM68159l, i11, i12, str, z11);
                if (bitmapM68158k != null) {
                    if (bitmapM68158k != bitmapM68159l) {
                        bitmapM68159l.recycle();
                    }
                    return bitmapM68158k;
                }
                throw new IOException("Unable to resize image. Most likely due to not enough memory.");
            }
            throw new IOException("Unable to rotate image. Most likely due to not enough memory.");
        }
        throw new IOException("Unable to load source image from path");
    }

    /* JADX INFO: renamed from: e */
    public static Matrix m68152e(Context context, Uri uri) {
        try {
            return m68153f(new ExifInterface(context.getContentResolver().openInputStream(uri)));
        } catch (Exception unused) {
            return new Matrix();
        }
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m68154g(Context context, Uri uri, BitmapFactory.Options options) throws IOException {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equalsIgnoreCase("content")) {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            inputStreamOpenInputStream.close();
            return bitmapDecodeStream;
        }
        try {
            return BitmapFactory.decodeFile(uri.getPath(), options);
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new IOException("Error decoding image file");
        }
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m68155h(Uri uri) {
        boolean z11;
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int iIndexOf = schemeSpecificPart.indexOf(44);
        if (iIndexOf != -1) {
            String lowerCase = schemeSpecificPart.substring(0, iIndexOf).replace('\\', '/').toLowerCase();
            boolean zStartsWith = lowerCase.startsWith("image/jpeg");
            if (!zStartsWith && lowerCase.startsWith("image/png")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (zStartsWith || z11) {
                byte[] bArrDecode = Base64.decode(schemeSpecificPart.substring(iIndexOf + 1), 0);
                return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m68159l(Bitmap bitmap, Matrix matrix, float f11) {
        matrix.postRotate(f11);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
