package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006a4.AbstractC0110a;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p617s5.C44347s;

/* JADX INFO: renamed from: com.facebook.imagepipeline.request.a */
/* JADX INFO: compiled from: BasePostprocessor.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5741a implements InterfaceC5742b {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;
    private static Method sCopyBitmap;

    @Override // com.facebook.imagepipeline.request.InterfaceC5742b
    public InterfaceC43595a getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (!C44347s.m97812a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (sCopyBitmap == null) {
                int i11 = Bitmaps.f9171a;
                sCopyBitmap = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            sCopyBitmap.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e14);
        }
    }

    @Override // com.facebook.imagepipeline.request.InterfaceC5742b
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.request.InterfaceC5742b
    public AbstractC0110a<Bitmap> process(Bitmap bitmap, AbstractC43387c abstractC43387c) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        AbstractC0110a<Bitmap> abstractC0110aMo95559d = abstractC43387c.mo95559d(width, height, config);
        try {
            process(abstractC0110aMo95559d.m565l(), bitmap);
            return abstractC0110aMo95559d.clone();
        } finally {
            AbstractC0110a.m555j(abstractC0110aMo95559d);
        }
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }
}
