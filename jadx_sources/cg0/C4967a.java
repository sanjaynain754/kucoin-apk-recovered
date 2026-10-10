package cg0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import org.jetbrains.annotations.NotNull;
import p710w1.InterfaceC45686d;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cg0.a */
/* JADX INFO: compiled from: BlurUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/BlurUtils;", "", "<init>", "()V", "SAMPLING", "", "blur", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "radius", "", "bitmap", "fastBlur", "sentBitmap", "canReuseInBitmap", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4967a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4967a f5548a = new C4967a();

    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bitmap m5260a(@NotNull Context context, @NotNull InterfaceC45686d pool, @NotNull Bitmap toTransform, int i11) throws Throwable {
        ?? r11;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap bitmapMo100813d = pool.mo100813d((int) (toTransform.getWidth() / 10.0f), (int) (toTransform.getHeight() / 10.0f), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapMo100813d, "get(...)");
        bitmapMo100813d.setDensity(toTransform.getDensity());
        Canvas canvas = new Canvas(bitmapMo100813d);
        canvas.scale(0.1f, 0.1f);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(toTransform, 0.0f, 0.0f, paint);
        RenderScript renderScript = null;
        scriptIntrinsicBlurCreate = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        renderScript = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapMo100813d, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setRadius(i11);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmapMo100813d);
                        RenderScript.releaseAllContexts();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                        return bitmapMo100813d;
                    } catch (Exception e11) {
                        e = e11;
                        ScriptIntrinsicBlur scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        r11 = scriptIntrinsicBlur;
                        try {
                            e.printStackTrace();
                            m5261b(bitmapMo100813d, i11, true);
                            if (renderScript != null) {
                                RenderScript.releaseAllContexts();
                            }
                            if (allocationCreateFromBitmap != null) {
                                allocationCreateFromBitmap.destroy();
                            }
                            if (allocationCreateTyped != null) {
                                allocationCreateTyped.destroy();
                            }
                            if (r11 != 0) {
                                r11.destroy();
                            }
                            return bitmapMo100813d;
                        } catch (Throwable th2) {
                            th = th2;
                            if (renderScript != null) {
                                RenderScript.releaseAllContexts();
                            }
                            if (allocationCreateFromBitmap != null) {
                                allocationCreateFromBitmap.destroy();
                            }
                            if (allocationCreateTyped != null) {
                                allocationCreateTyped.destroy();
                            }
                            if (r11 != 0) {
                                r11.destroy();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ScriptIntrinsicBlur scriptIntrinsicBlur2 = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        r11 = scriptIntrinsicBlur2;
                        if (renderScript != null) {
                            RenderScript.releaseAllContexts();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (r11 != 0) {
                            r11.destroy();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    r11 = allocationCreateTyped;
                    e.printStackTrace();
                    m5261b(bitmapMo100813d, i11, true);
                    if (renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (r11 != 0) {
                        r11.destroy();
                    }
                    return bitmapMo100813d;
                } catch (Throwable th4) {
                    th = th4;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    r11 = allocationCreateTyped;
                    if (renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (r11 != 0) {
                        r11.destroy();
                    }
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            } catch (Throwable th5) {
                th = th5;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Exception e14) {
            e = e14;
            r11 = 0;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        } catch (Throwable th6) {
            th = th6;
            r11 = 0;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Bitmap m5261b(@NotNull Bitmap sentBitmap, int i11, boolean z11) {
        Bitmap bitmapCopy;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(sentBitmap, "sentBitmap");
        if (z11) {
            bitmapCopy = sentBitmap;
        } else {
            Bitmap.Config config = sentBitmap.getConfig();
            Intrinsics.checkNotNull(config);
            bitmapCopy = sentBitmap.copy(config, true);
        }
        if (i11 < 1) {
            return sentBitmap;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i23 = width * height;
        int[] iArr = new int[i23];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i24 = width - 1;
        int i25 = height - 1;
        int i26 = i11 + i11;
        int i27 = i26 + 1;
        int[] iArr2 = new int[i23];
        int[] iArr3 = new int[i23];
        int[] iArr4 = new int[i23];
        int[] iArr5 = new int[Math.max(width, height)];
        int i28 = (i26 + 2) >> 1;
        int i29 = i28 * i28;
        int i31 = i29 * 256;
        int[] iArr6 = new int[i31];
        for (int i32 = 0; i32 < i31; i32++) {
            iArr6[i32] = i32 / i29;
        }
        int[][] iArr7 = new int[i27][];
        for (int i33 = 0; i33 < i27; i33++) {
            iArr7[i33] = new int[3];
        }
        int i34 = i11 + 1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        while (i35 < height) {
            int[] iArr8 = iArr4;
            int i38 = -i11;
            int[] iArr9 = iArr6;
            Bitmap bitmap = bitmapCopy;
            int i39 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            if (i38 <= i11) {
                while (true) {
                    int i49 = iArr[i36 + Math.min(i24, Math.max(i38, 0))];
                    int[] iArr10 = iArr7[i38 + i11];
                    iArr10[0] = (i49 & 16711680) >> 16;
                    iArr10[1] = (i49 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                    iArr10[2] = i49 & 255;
                    int iAbs = i34 - Math.abs(i38);
                    int i51 = iArr10[0];
                    i48 += i51 * iAbs;
                    int i52 = iArr10[1];
                    i39 += i52 * iAbs;
                    int i53 = iArr10[2];
                    i41 += iAbs * i53;
                    if (i38 > 0) {
                        i45 += i51;
                        i46 += i52;
                        i47 += i53;
                    } else {
                        i42 += i51;
                        i43 += i52;
                        i44 += i53;
                    }
                    if (i38 == i11) {
                        break;
                    }
                    i38++;
                }
            }
            int i54 = i11;
            int i55 = 0;
            while (i55 < width) {
                iArr2[i36] = iArr9[i48];
                iArr3[i36] = iArr9[i39];
                iArr8[i36] = iArr9[i41];
                int i56 = i48 - i42;
                int i57 = i39 - i43;
                int i58 = i41 - i44;
                int[] iArr11 = iArr7[((i54 - i11) + i27) % i27];
                int i59 = i42 - iArr11[0];
                int i61 = i43 - iArr11[1];
                int i62 = i44 - iArr11[2];
                if (i35 == 0) {
                    i22 = i55;
                    iArr5[i22] = Math.min(i55 + i11 + 1, i24);
                } else {
                    i22 = i55;
                }
                int i63 = iArr[i37 + iArr5[i22]];
                int i64 = (i63 & 16711680) >> 16;
                iArr11[0] = i64;
                int i65 = (i63 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr11[1] = i65;
                int i66 = i63 & 255;
                iArr11[2] = i66;
                int i67 = i45 + i64;
                int i68 = i46 + i65;
                int i69 = i47 + i66;
                i48 = i56 + i67;
                i39 = i57 + i68;
                i41 = i58 + i69;
                i54 = (i54 + 1) % i27;
                int[] iArr12 = iArr7[i54 % i27];
                int i71 = iArr12[0];
                i42 = i59 + i71;
                int i72 = iArr12[1];
                i43 = i61 + i72;
                int i73 = iArr12[2];
                i44 = i62 + i73;
                i45 = i67 - i71;
                i46 = i68 - i72;
                i47 = i69 - i73;
                i36++;
                i55 = i22 + 1;
            }
            i37 += width;
            i35++;
            iArr4 = iArr8;
            iArr6 = iArr9;
            bitmapCopy = bitmap;
        }
        int[] iArr13 = iArr4;
        int[] iArr14 = iArr6;
        Bitmap bitmap2 = bitmapCopy;
        int i74 = 0;
        while (i74 < width) {
            int i75 = -i11;
            int i76 = i75 * width;
            int i77 = i74;
            if (i75 <= i11) {
                int i78 = i76;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i21 = 0;
                while (true) {
                    int iMax = Math.max(0, i78) + i77;
                    int[] iArr15 = iArr7[i75 + i11];
                    iArr15[0] = iArr2[iMax];
                    iArr15[1] = iArr3[iMax];
                    iArr15[2] = iArr13[iMax];
                    int iAbs2 = i34 - Math.abs(i75);
                    i19 += iArr2[iMax] * iAbs2;
                    i21 += iArr3[iMax] * iAbs2;
                    i12 += iArr13[iMax] * iAbs2;
                    if (i75 > 0) {
                        i16 += iArr15[0];
                        i17 += iArr15[1];
                        i18 += iArr15[2];
                    } else {
                        i13 += iArr15[0];
                        i14 += iArr15[1];
                        i15 += iArr15[2];
                    }
                    if (i75 < i25) {
                        i78 += width;
                    }
                    if (i75 == i11) {
                        break;
                    }
                    i75++;
                }
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i21 = 0;
            }
            int i79 = i11;
            int i81 = i77;
            for (int i82 = 0; i82 < height; i82++) {
                iArr[i81] = (iArr[i81] & ViewCompat.MEASURED_STATE_MASK) | (iArr14[i19] << 16) | (iArr14[i21] << 8) | iArr14[i12];
                int i83 = i19 - i13;
                int i84 = i21 - i14;
                int i85 = i12 - i15;
                int[] iArr16 = iArr7[((i79 - i11) + i27) % i27];
                int i86 = i13 - iArr16[0];
                int i87 = i14 - iArr16[1];
                int i88 = i15 - iArr16[2];
                int i89 = i81;
                if (i77 == 0) {
                    iArr5[i82] = Math.min(i82 + i34, i25) * width;
                }
                int i91 = i77 + iArr5[i82];
                int i92 = iArr2[i91];
                iArr16[0] = i92;
                int i93 = iArr3[i91];
                iArr16[1] = i93;
                int i94 = iArr13[i91];
                iArr16[2] = i94;
                int i95 = i16 + i92;
                int i96 = i17 + i93;
                int i97 = i18 + i94;
                i19 = i83 + i95;
                i21 = i84 + i96;
                i12 = i85 + i97;
                i79 = (i79 + 1) % i27;
                int[] iArr17 = iArr7[i79];
                int i98 = iArr17[0];
                i13 = i86 + i98;
                int i99 = iArr17[1];
                i14 = i87 + i99;
                int i100 = iArr17[2];
                i15 = i88 + i100;
                i16 = i95 - i98;
                i17 = i96 - i99;
                i18 = i97 - i100;
                i81 = i89 + width;
            }
            i74 = i77 + 1;
        }
        bitmap2.setPixels(iArr, 0, width, 0, 0, width, height);
        Intrinsics.checkNotNull(bitmap2);
        return bitmap2;
    }
}
