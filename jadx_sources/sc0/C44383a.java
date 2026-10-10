package sc0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: sc0.a */
/* JADX INFO: compiled from: BlurUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C44383a {
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: a */
    public static Bitmap m97887a(Context context, Bitmap bitmap, int i11) throws Throwable {
        ?? r11;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        RenderScript renderScript = null;
        scriptIntrinsicBlurCreate = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        renderScript = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setRadius(i11);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                        RenderScript.releaseAllContexts();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                        return bitmap;
                    } catch (Exception e11) {
                        e = e11;
                        ScriptIntrinsicBlur scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        r11 = scriptIntrinsicBlur;
                        try {
                            e.printStackTrace();
                            m97889c(bitmap, i11, true);
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
                            return bitmap;
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
                    m97889c(bitmap, i11, true);
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
                    return bitmap;
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

    /* JADX INFO: renamed from: c */
    public static Bitmap m97889c(Bitmap bitmap, int i11, boolean z11) {
        int i12;
        int i13 = i11;
        Bitmap bitmapCopy = z11 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i13 < 1) {
            return bitmap;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i15 = width - 1;
        int i16 = height - 1;
        int i17 = i13 + i13;
        int i18 = i17 + 1;
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[Math.max(width, height)];
        int i19 = (i17 + 2) >> 1;
        int i21 = i19 * i19;
        int i22 = i21 * 256;
        int[] iArr6 = new int[i22];
        int i23 = 0;
        for (int i24 = 0; i24 < i22; i24++) {
            iArr6[i24] = i24 / i21;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
        int i25 = i13 + 1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < height) {
            int[] iArr8 = iArr4;
            int i29 = -i13;
            int i31 = i23;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            int i38 = i37;
            int i39 = i38;
            while (i29 <= i13) {
                int[] iArr9 = iArr6;
                Bitmap bitmap2 = bitmapCopy;
                int i41 = i23;
                int i42 = iArr[i27 + Math.min(i15, Math.max(i29, i41))];
                int[] iArr10 = iArr7[i29 + i13];
                iArr10[i41] = (i42 & 16711680) >> 16;
                iArr10[1] = (i42 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i42 & 255;
                int iAbs = i25 - Math.abs(i29);
                int i43 = iArr10[i41];
                i39 += i43 * iAbs;
                int i44 = iArr10[1];
                i31 += i44 * iAbs;
                int i45 = iArr10[2];
                i32 += iAbs * i45;
                if (i29 > 0) {
                    i36 += i43;
                    i37 += i44;
                    i38 += i45;
                } else {
                    i33 += i43;
                    i34 += i44;
                    i35 += i45;
                }
                i29++;
                iArr6 = iArr9;
                bitmapCopy = bitmap2;
                i23 = 0;
            }
            int[] iArr11 = iArr6;
            Bitmap bitmap3 = bitmapCopy;
            int i46 = i13;
            int i47 = 0;
            while (i47 < width) {
                iArr2[i27] = iArr11[i39];
                iArr3[i27] = iArr11[i31];
                iArr8[i27] = iArr11[i32];
                int i48 = i39 - i33;
                int i49 = i31 - i34;
                int i51 = i32 - i35;
                int[] iArr12 = iArr7[((i46 - i13) + i18) % i18];
                int i52 = i33 - iArr12[0];
                int i53 = i34 - iArr12[1];
                int i54 = i35 - iArr12[2];
                if (i26 == 0) {
                    i12 = i47;
                    iArr5[i12] = Math.min(i47 + i13 + 1, i15);
                } else {
                    i12 = i47;
                }
                int i55 = iArr[i28 + iArr5[i12]];
                int i56 = (i55 & 16711680) >> 16;
                iArr12[0] = i56;
                int i57 = (i55 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[1] = i57;
                int i58 = i55 & 255;
                iArr12[2] = i58;
                int i59 = i36 + i56;
                int i61 = i37 + i57;
                int i62 = i38 + i58;
                i39 = i48 + i59;
                i31 = i49 + i61;
                i32 = i51 + i62;
                i46 = (i46 + 1) % i18;
                int[] iArr13 = iArr7[i46 % i18];
                int i63 = iArr13[0];
                i33 = i52 + i63;
                int i64 = iArr13[1];
                i34 = i53 + i64;
                int i65 = iArr13[2];
                i35 = i54 + i65;
                i36 = i59 - i63;
                i37 = i61 - i64;
                i38 = i62 - i65;
                i27++;
                i47 = i12 + 1;
            }
            i28 += width;
            i26++;
            iArr4 = iArr8;
            iArr6 = iArr11;
            bitmapCopy = bitmap3;
            i23 = 0;
        }
        int[] iArr14 = iArr4;
        int[] iArr15 = iArr6;
        Bitmap bitmap4 = bitmapCopy;
        int i66 = 0;
        while (i66 < width) {
            int i67 = -i13;
            int i68 = i66;
            int i69 = i67 * width;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            int i79 = 0;
            while (i67 <= i13) {
                int iMax = Math.max(0, i69) + i68;
                int[] iArr16 = iArr7[i67 + i11];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr14[iMax];
                int iAbs2 = i25 - Math.abs(i67);
                i79 += iArr2[iMax] * iAbs2;
                i71 += iArr3[iMax] * iAbs2;
                i72 += iArr14[iMax] * iAbs2;
                if (i67 > 0) {
                    i76 += iArr16[0];
                    i77 += iArr16[1];
                    i78 += iArr16[2];
                } else {
                    i73 += iArr16[0];
                    i74 += iArr16[1];
                    i75 += iArr16[2];
                }
                if (i67 < i16) {
                    i69 += width;
                }
                i67++;
                i13 = i11;
            }
            int i81 = i79;
            int i82 = i68;
            int i83 = i11;
            for (int i84 = 0; i84 < height; i84++) {
                iArr[i82] = (iArr[i82] & ViewCompat.MEASURED_STATE_MASK) | (iArr15[i81] << 16) | (iArr15[i71] << 8) | iArr15[i72];
                int i85 = i81 - i73;
                int i86 = i71 - i74;
                int i87 = i72 - i75;
                int[] iArr17 = iArr7[((i83 - i11) + i18) % i18];
                int i88 = i73 - iArr17[0];
                int i89 = i74 - iArr17[1];
                int i91 = i75 - iArr17[2];
                if (i68 == 0) {
                    iArr5[i84] = Math.min(i84 + i25, i16) * width;
                }
                int i92 = i68 + iArr5[i84];
                int i93 = iArr2[i92];
                iArr17[0] = i93;
                int i94 = iArr3[i92];
                iArr17[1] = i94;
                int i95 = iArr14[i92];
                iArr17[2] = i95;
                int i96 = i76 + i93;
                int i97 = i77 + i94;
                int i98 = i78 + i95;
                i81 = i85 + i96;
                i71 = i86 + i97;
                i72 = i87 + i98;
                i83 = (i83 + 1) % i18;
                int[] iArr18 = iArr7[i83];
                int i99 = iArr18[0];
                i73 = i88 + i99;
                int i100 = iArr18[1];
                i74 = i89 + i100;
                int i101 = iArr18[2];
                i75 = i91 + i101;
                i76 = i96 - i99;
                i77 = i97 - i100;
                i78 = i98 - i101;
                i82 += width;
            }
            i66 = i68 + 1;
            i13 = i11;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: b */
    public static Bitmap m97888b(Context context, @NonNull InterfaceC45686d interfaceC45686d, Bitmap bitmap, int i11) throws Throwable {
        ?? r11;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d((int) (bitmap.getWidth() / 10.0f), (int) (bitmap.getHeight() / 10.0f), Bitmap.Config.ARGB_8888);
        bitmapMo100813d.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(bitmapMo100813d);
        canvas.scale(0.1f, 0.1f);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
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
                            m97889c(bitmapMo100813d, i11, true);
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
                    m97889c(bitmapMo100813d, i11, true);
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
}
