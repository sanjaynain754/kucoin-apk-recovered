package com.kubi.resources.widget.bingoogolapple.bgabanner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.b */
/* JADX INFO: compiled from: BGABannerUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class C22986b {
    /* JADX INFO: renamed from: a */
    public static int m54950a(BitmapFactory.Options options, int i11, int i12) {
        int i13 = 1;
        if (i11 != 0 && i12 != 0) {
            int i14 = options.outHeight;
            int i15 = options.outWidth;
            if (i14 <= i12 && i15 <= i11) {
                return 1;
            }
            int i16 = i14 / 2;
            int i17 = i15 / 2;
            while (i16 / i13 >= i12 && i17 / i13 >= i11) {
                i13 *= 2;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m54956g(Collection collection, Collection... collectionArr) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        for (Collection collection2 : collectionArr) {
            if (collection2 == null || collection2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m54958i(int i11, Collection collection) {
        return m54957h(collection, new Collection[0]) && i11 < collection.size();
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.b$a */
    /* JADX INFO: compiled from: BGABannerUtil.java */
    public static class a<S extends Throwable> extends Pair<Bitmap, S> {
        public a(@Nullable Bitmap bitmap, @Nullable S s11) {
            super(bitmap, s11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: c */
    public static a<Throwable> m54952c(@NonNull Context context, int i11, int i12, int i13) throws Throwable {
        a<Throwable> aVar;
        InputStream inputStreamOpenRawResource;
        a<Throwable> aVar2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.RGB_565;
        ?? r11 = 0;
        try {
            try {
                try {
                    if (i12 == 0 && i13 == 0) {
                        options.inPreferredConfig = config;
                        inputStreamOpenRawResource = context.getResources().openRawResource(i11);
                        aVar2 = new a<>(BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options), null);
                        inputStreamOpenRawResource.close();
                    } else {
                        options.inJustDecodeBounds = true;
                        options.inPreferredConfig = config;
                        InputStream inputStreamOpenRawResource2 = context.getResources().openRawResource(i11);
                        try {
                            BitmapFactory.decodeStream(inputStreamOpenRawResource2, null, options);
                            inputStreamOpenRawResource2.reset();
                            inputStreamOpenRawResource2.close();
                            int i14 = options.outWidth;
                            int i15 = options.outHeight;
                            int iM54954e = m54954e(i12, i13, i14, i15);
                            int iM54954e2 = m54954e(i13, i12, i15, i14);
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = m54950a(options, iM54954e, iM54954e2);
                            options.inPreferredConfig = config;
                            inputStreamOpenRawResource = context.getResources().openRawResource(i11);
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options);
                            inputStreamOpenRawResource.close();
                            if (bitmapDecodeStream == null || (bitmapDecodeStream.getWidth() <= iM54954e && bitmapDecodeStream.getHeight() <= iM54954e2)) {
                                aVar2 = new a<>(bitmapDecodeStream, null);
                            } else {
                                a<Throwable> aVar3 = new a<>(Bitmap.createScaledBitmap(bitmapDecodeStream, iM54954e, iM54954e2, true), null);
                                bitmapDecodeStream.recycle();
                                aVar2 = aVar3;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            context = inputStreamOpenRawResource2;
                            C44128b.m97264h(e);
                            aVar = new a<>(null, e);
                            if (context != 0) {
                                try {
                                    context.close();
                                } catch (IOException e12) {
                                    e = e12;
                                    C44128b.m97264h(e);
                                    return aVar;
                                }
                            }
                            return aVar;
                        } catch (OutOfMemoryError e13) {
                            e = e13;
                            context = inputStreamOpenRawResource2;
                            C44128b.m97264h(e);
                            aVar = new a<>(null, e);
                            if (context != 0) {
                                try {
                                    context.close();
                                } catch (IOException e14) {
                                    e = e14;
                                    C44128b.m97264h(e);
                                    return aVar;
                                }
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = inputStreamOpenRawResource2;
                            if (r11 != 0) {
                                try {
                                    r11.close();
                                } catch (IOException e15) {
                                    C44128b.m97264h(e15);
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException e16) {
                        C44128b.m97264h(e16);
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    th = th3;
                    r11 = context;
                }
            } catch (Exception e17) {
                e = e17;
            } catch (OutOfMemoryError e18) {
                e = e18;
            }
        } catch (Exception e19) {
            e = e19;
            context = 0;
        } catch (OutOfMemoryError e21) {
            e = e21;
            context = 0;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ImageView m54953d(Context context, @DrawableRes int i11, C22987c c22987c, ImageView.ScaleType scaleType) {
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(m54955f(context, i11, c22987c.m54962b(), c22987c.m54961a(), c22987c.m54964d(), c22987c.m54963c()));
        imageView.setClickable(true);
        imageView.setScaleType(scaleType);
        return imageView;
    }

    /* JADX INFO: renamed from: e */
    public static int m54954e(int i11, int i12, int i13, int i14) {
        if (i11 == 0 && i12 == 0) {
            return i13;
        }
        if (i11 == 0) {
            return (int) (((double) i13) * (((double) i12) / ((double) i14)));
        }
        if (i12 == 0) {
            return i11;
        }
        double d11 = ((double) i14) / ((double) i13);
        double d12 = i12;
        return ((double) i11) * d11 > d12 ? (int) (d12 / d11) : i11;
    }

    /* JADX INFO: renamed from: j */
    public static void m54959j(List<? extends View> list) {
        if (list == null) {
            return;
        }
        for (View view : list) {
            view.setVisibility(0);
            ViewCompat.setAlpha(view, 1.0f);
            ViewCompat.setPivotX(view, view.getMeasuredWidth() * 0.5f);
            ViewCompat.setPivotY(view, view.getMeasuredHeight() * 0.5f);
            ViewCompat.setTranslationX(view, 0.0f);
            ViewCompat.setTranslationY(view, 0.0f);
            ViewCompat.setScaleX(view, 1.0f);
            ViewCompat.setScaleY(view, 1.0f);
            ViewCompat.setRotationX(view, 0.0f);
            ViewCompat.setRotationY(view, 0.0f);
            ViewCompat.setRotation(view, 0.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m54951b(Context context, float f11) {
        return (int) TypedValue.applyDimension(1, f11, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static Bitmap m54955f(@NonNull Context context, int i11, int i12, int i13, float f11, float f12) throws Throwable {
        a<Throwable> aVarM54952c;
        do {
            aVarM54952c = m54952c(context, i11, i12, i13);
            if (aVarM54952c != null && aVarM54952c.first != 0) {
                break;
            }
            i12 /= 2;
            i13 /= 2;
            if (aVarM54952c == null || !(aVarM54952c.second instanceof OutOfMemoryError) || i12 <= f11) {
                break;
            }
        } while (i13 > f12);
        if (aVarM54952c == null) {
            return null;
        }
        return (Bitmap) aVarM54952c.first;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m54957h(Collection collection, Collection... collectionArr) {
        return !m54956g(collection, collectionArr);
    }

    /* JADX INFO: renamed from: k */
    public static int m54960k(Context context, float f11) {
        return (int) TypedValue.applyDimension(2, f11, context.getResources().getDisplayMetrics());
    }
}
