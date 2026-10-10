package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.math.MathKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28385B0 {
    /* JADX INFO: renamed from: a */
    public static final Bitmap m69275a(String str, int i11, int i12) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i13 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Pair pairM90091to = TuplesKt.m90091to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pairM90091to.component1()).intValue();
        int iIntValue2 = ((Number) pairM90091to.component2()).intValue();
        if (iIntValue > i12 || iIntValue2 > i11) {
            int i14 = iIntValue / 2;
            int i15 = iIntValue2 / 2;
            while (i14 / i13 >= i12 && i15 / i13 >= i11) {
                i13 *= 2;
            }
        }
        options.inSampleSize = i13;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m69274a(File file, int i11, int i12) {
        int iRoundToInt;
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(file, 268435456));
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i12);
            if (pageOpenPage.getWidth() < pageOpenPage.getHeight()) {
                iRoundToInt = MathKt.roundToInt((pageOpenPage.getWidth() / pageOpenPage.getHeight()) * i11);
            } else {
                iRoundToInt = i11;
            }
            if (pageOpenPage.getHeight() < pageOpenPage.getWidth()) {
                i11 = MathKt.roundToInt((pageOpenPage.getHeight() / pageOpenPage.getWidth()) * i11);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, i11, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(-1);
            pageOpenPage.render(bitmapCreateBitmap, new Rect(0, 0, iRoundToInt, i11), null, 1);
            pageOpenPage.close();
            pdfRenderer.close();
            return bitmapCreateBitmap;
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(file);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, e11);
            return null;
        }
    }
}
