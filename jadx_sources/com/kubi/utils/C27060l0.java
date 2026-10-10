package com.kubi.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: renamed from: com.kubi.utils.l0 */
/* JADX INFO: compiled from: QrCodeUtils.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27060l0 {

    /* JADX INFO: renamed from: a */
    public static final Map<DecodeHintType, Object> f54344a;

    /* JADX INFO: renamed from: b */
    public static int f54345b;

    /* JADX INFO: renamed from: a */
    public static Bitmap m66758a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            if (width == 0 || height == 0) {
                return null;
            }
            if (width2 != 0 && height2 != 0) {
                float f11 = ((width * 1.0f) / 5.0f) / width2;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.scale(f11, f11, width / 2, height / 2);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    canvas.drawRect((width / 2) - (width / 10), (height / 2) - (width / 10), (width / 2) + (width / 10), (height / 2) + (width / 10), paint);
                    canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (Paint) null);
                    canvas.save();
                    canvas.restore();
                    return bitmapCreateBitmap;
                } catch (Exception e11) {
                    e11.getStackTrace();
                    return null;
                }
            }
        }
        return bitmap;
    }

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        f54344a = enumMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.AZTEC);
        arrayList.add(BarcodeFormat.CODABAR);
        arrayList.add(BarcodeFormat.CODE_39);
        arrayList.add(BarcodeFormat.CODE_93);
        arrayList.add(BarcodeFormat.CODE_128);
        arrayList.add(BarcodeFormat.DATA_MATRIX);
        arrayList.add(BarcodeFormat.EAN_8);
        arrayList.add(BarcodeFormat.EAN_13);
        arrayList.add(BarcodeFormat.ITF);
        arrayList.add(BarcodeFormat.MAXICODE);
        arrayList.add(BarcodeFormat.PDF_417);
        BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
        arrayList.add(barcodeFormat);
        arrayList.add(BarcodeFormat.RSS_14);
        arrayList.add(BarcodeFormat.RSS_EXPANDED);
        arrayList.add(BarcodeFormat.UPC_A);
        arrayList.add(BarcodeFormat.UPC_E);
        arrayList.add(BarcodeFormat.UPC_EAN_EXTENSION);
        enumMap.put(DecodeHintType.TRY_HARDER, barcodeFormat);
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, arrayList);
        enumMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
        f54345b = 50;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m66759b(String str, int i11) {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
            hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            hashtable.put(EncodeHintType.MARGIN, 1);
            BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i11, i11, hashtable);
            int[] iArr = new int[i11 * i11];
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (bitMatrixEncode.get(i13, i12)) {
                        iArr[(i12 * i11) + i13] = -16777216;
                    } else {
                        iArr[(i12 * i11) + i13] = -1;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i11);
            return bitmapCreateBitmap;
        } catch (WriterException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m66760c(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i11 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i12 = options.outHeight / 400;
            if (i12 > 0) {
                i11 = i12;
            }
            options.inSampleSize = i11;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m66761d(Bitmap bitmap) {
        if (bitmap == null) {
            return "";
        }
        RGBLuminanceSource rGBLuminanceSource = null;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            RGBLuminanceSource rGBLuminanceSource2 = new RGBLuminanceSource(width, height, iArr);
            try {
                return new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource2)), f54344a).getText();
            } catch (Exception e11) {
                e = e11;
                rGBLuminanceSource = rGBLuminanceSource2;
                e.printStackTrace();
                if (rGBLuminanceSource != null) {
                    try {
                        return new MultiFormatReader().decode(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)), f54344a).getText();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return "";
                    }
                }
                return "";
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m66762e(String str) {
        return m66761d(m66760c(str));
    }
}
