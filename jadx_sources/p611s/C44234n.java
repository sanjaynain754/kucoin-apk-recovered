package p611s;

import ai.advance.sdk.global.iqa.lib.JNI;
import ai.advance.sdk.global.iqa.lib.data.CropParams;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.YuvImage;
import android.util.Base64;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p387k.C40826a;
import p387k.C40833h;

/* JADX INFO: renamed from: s.n */
/* JADX INFO: loaded from: classes23.dex */
public class C44234n {
    /* JADX INFO: renamed from: d */
    public static byte[] m97535d(String str) throws Throwable {
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = fileInputStream.read(bArr);
                            if (i11 == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                fileInputStream.close();
                                byteArrayOutputStream.close();
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr, 0, i11);
                        }
                    } catch (Exception unused) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                                throw th2;
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th2;
                        }
                        byteArrayOutputStream.close();
                        throw th2;
                    }
                } catch (Exception unused3) {
                    byteArrayOutputStream = null;
                } catch (Throwable th4) {
                    th2 = th4;
                    byteArrayOutputStream = null;
                }
            } catch (IOException unused4) {
                return null;
            }
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th5) {
            th2 = th5;
            byteArrayOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m97537f(byte[] bArr, int i11, CropParams cropParams, boolean z11, boolean z12, int i12) {
        if (bArr == null || cropParams == null) {
            return null;
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, cropParams.previewWidth, cropParams.previewHeight, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(cropParams.cropRect, JNI.getCompressQuality(), byteArrayOutputStream);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = Math.min(cropParams.previewHeight, cropParams.previewWidth) / i11;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapM89318d = C40826a.m89318d(byteArrayOutputStream, options);
        Matrix matrix = new Matrix();
        float fMin = i11 / Math.min(bitmapM89318d.getWidth(), bitmapM89318d.getHeight());
        matrix.setScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM89318d, 0, 0, bitmapM89318d.getWidth(), bitmapM89318d.getHeight(), matrix, true);
        if (bitmapCreateBitmap != bitmapM89318d) {
            bitmapM89318d.recycle();
        }
        return m97532a(bitmapCreateBitmap, z11, z12, i12);
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m97532a(Bitmap bitmap, boolean z11, boolean z12, int i11) {
        int i12 = z12 ? i11 - 180 : i11;
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        if (i12 != 0) {
            matrix.setRotate(i12);
        }
        if (z12) {
            if (z11) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (!z11) {
                matrix.setScale(-1.0f, 1.0f);
            }
            if (!z11 && i11 == 180) {
                matrix.postScale(-1.0f, -1.0f);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static String m97533b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    /* JADX INFO: renamed from: c */
    public static C44209c m97534c(String str, String str2) {
        C44209c c44209c = new C44209c();
        c44209c.f97591l = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c44209c.f97581b = (float) jSONObject.optDouble("area", 0.0d);
            c44209c.f97582c = jSONObject.optBoolean("card_not_exists", false);
            c44209c.f97587h = (float) jSONObject.optDouble("quality_score", 0.0d);
            c44209c.f97583d = jSONObject.optBoolean("is_blur", false);
            c44209c.f97584e = jSONObject.optBoolean("is_edge_cross", false);
            c44209c.f97585f = jSONObject.optBoolean("is_area_too_small", false);
            c44209c.f97586g = jSONObject.optBoolean("is_poor_quality", false);
            if (str2 != null && (str2.contains("TH") || str2.contains("PH"))) {
                c44209c.f97588i = jSONObject.optBoolean("is_card_occluded", false);
                c44209c.f97603x = (float) jSONObject.optDouble("occlusion_score", 0.0d);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bbox");
            if (jSONObjectOptJSONObject != null) {
                c44209c.f97594o = (float) jSONObjectOptJSONObject.optDouble("left", 0.0d);
                c44209c.f97596q = (float) jSONObjectOptJSONObject.optDouble(ViewProps.TOP, 0.0d);
                c44209c.f97595p = (float) jSONObjectOptJSONObject.optDouble("right", 0.0d);
                c44209c.f97597r = (float) jSONObjectOptJSONObject.optDouble(ViewProps.BOTTOM, 0.0d);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("model_values");
            c44209c.f97580a = jSONObjectOptJSONObject2;
            c44209c.f97599t = (float) jSONObjectOptJSONObject2.optDouble("min_gap_ratio");
            c44209c.f97598s = (float) c44209c.f97580a.optDouble("area");
            c44209c.f97600u = (float) c44209c.f97580a.optDouble("exposure_score");
            c44209c.f97601v = (float) c44209c.f97580a.optDouble("blur_score");
            c44209c.f97602w = (float) c44209c.f97580a.optDouble("dim_score");
            c44209c.f97589j = jSONObject.optBoolean("is_card_glossy", false);
            c44209c.f97604y = (float) c44209c.f97580a.optDouble("glossy_score", 0.0d);
            c44209c.f97590k = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            if (!c44209c.f97582c) {
                jSONObject2.put("bbox", jSONObjectOptJSONObject);
                jSONObject2.put("modelValues", c44209c.f97580a);
            }
            c44209c.f97592m = jSONObject2;
            return c44209c;
        } catch (JSONException e11) {
            C40833h.m89363g("JSON parse error：" + e11);
            return c44209c;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m97536e(Context context) {
        if (!(context instanceof Activity)) {
            return -1;
        }
        Activity activity = (Activity) context;
        int requestedOrientation = activity.getRequestedOrientation();
        if (requestedOrientation == 0 || requestedOrientation == 1) {
            return requestedOrientation;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 0;
    }
}
