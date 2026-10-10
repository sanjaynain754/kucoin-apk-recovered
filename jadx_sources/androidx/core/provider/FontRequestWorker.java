package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.C1100n;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import androidx.tracing.Trace;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes23.dex */
class FontRequestWorker {
    static final LruCache<String, Typeface> sTypefaceCache = new LruCache<>(16);
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
    static final Object LOCK = new Object();

    @GuardedBy("LOCK")
    static final SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> PENDING_REPLIES = new SimpleArrayMap<>();

    public static final class TypefaceResult {
        final int mResult;
        final Typeface mTypeface;

        public TypefaceResult(int i11) {
            this.mTypeface = null;
            this.mResult = i11;
        }

        @SuppressLint({"WrongConstant"})
        public boolean isSuccess() {
            return this.mResult == 0;
        }

        @SuppressLint({"WrongConstant"})
        public TypefaceResult(@NonNull Typeface typeface) {
            this.mTypeface = typeface;
            this.mResult = 0;
        }
    }

    private static String createCacheId(@NonNull List<FontRequest> list, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < list.size(); i12++) {
            sb2.append(list.get(i12).getId());
            sb2.append(C33820nf.f71144W);
            sb2.append(i11);
            if (i12 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @NonNull
    public static TypefaceResult getFontSync(@NonNull String str, @NonNull Context context, @NonNull List<FontRequest> list, int i11) {
        Trace.beginSection("getFontSync");
        try {
            LruCache<String, Typeface> lruCache = sTypefaceCache;
            Typeface typeface = lruCache.get(str);
            if (typeface != null) {
                TypefaceResult typefaceResult = new TypefaceResult(typeface);
                Trace.endSection();
                return typefaceResult;
            }
            try {
                FontsContractCompat.FontFamilyResult fontFamilyResult = FontProvider.getFontFamilyResult(context, list, null);
                int fontFamilyResultStatus = getFontFamilyResultStatus(fontFamilyResult);
                if (fontFamilyResultStatus != 0) {
                    TypefaceResult typefaceResult2 = new TypefaceResult(fontFamilyResultStatus);
                    Trace.endSection();
                    return typefaceResult2;
                }
                Typeface typefaceCreateFromFontInfo = (!fontFamilyResult.hasFallback() || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.createFromFontInfo(context, null, fontFamilyResult.getFonts(), i11) : TypefaceCompat.createFromFontInfoWithFallback(context, null, fontFamilyResult.getFontsWithFallbacks(), i11);
                if (typefaceCreateFromFontInfo == null) {
                    TypefaceResult typefaceResult3 = new TypefaceResult(-3);
                    Trace.endSection();
                    return typefaceResult3;
                }
                lruCache.put(str, typefaceCreateFromFontInfo);
                TypefaceResult typefaceResult4 = new TypefaceResult(typefaceCreateFromFontInfo);
                Trace.endSection();
                return typefaceResult4;
            } catch (PackageManager.NameNotFoundException unused) {
                TypefaceResult typefaceResult5 = new TypefaceResult(-1);
                Trace.endSection();
                return typefaceResult5;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static void resetTypefaceCache() {
        sTypefaceCache.evictAll();
    }

    private FontRequestWorker() {
    }

    @SuppressLint({"WrongConstant"})
    private static int getFontFamilyResultStatus(@NonNull FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i11 = 1;
        if (fontFamilyResult.getStatusCode() != 0) {
            if (fontFamilyResult.getStatusCode() != 1) {
                return -3;
            }
            return -2;
        }
        FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
        if (fonts != null && fonts.length != 0) {
            i11 = 0;
            for (FontsContractCompat.FontInfo fontInfo : fonts) {
                int resultCode = fontInfo.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i11;
    }

    public static Typeface requestFontAsync(@NonNull final Context context, @NonNull final List<FontRequest> list, final int i11, @Nullable Executor executor, @NonNull final CallbackWrapper callbackWrapper) {
        final String strCreateCacheId = createCacheId(list, i11);
        Typeface typeface = sTypefaceCache.get(strCreateCacheId);
        if (typeface != null) {
            callbackWrapper.onTypefaceResult(new TypefaceResult(typeface));
            return typeface;
        }
        Consumer<TypefaceResult> consumer = new Consumer<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public void accept(TypefaceResult typefaceResult) {
                if (typefaceResult == null) {
                    typefaceResult = new TypefaceResult(-3);
                }
                callbackWrapper.onTypefaceResult(typefaceResult);
            }
        };
        synchronized (LOCK) {
            try {
                SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> simpleArrayMap = PENDING_REPLIES;
                ArrayList<Consumer<TypefaceResult>> arrayList = simpleArrayMap.get(strCreateCacheId);
                if (arrayList != null) {
                    arrayList.add(consumer);
                    return null;
                }
                ArrayList<Consumer<TypefaceResult>> arrayList2 = new ArrayList<>();
                arrayList2.add(consumer);
                simpleArrayMap.put(strCreateCacheId, arrayList2);
                Callable<TypefaceResult> callable = new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public TypefaceResult call() {
                        try {
                            return FontRequestWorker.getFontSync(strCreateCacheId, context, list, i11);
                        } catch (Throwable unused) {
                            return new TypefaceResult(-3);
                        }
                    }
                };
                if (executor == null) {
                    executor = DEFAULT_EXECUTOR_SERVICE;
                }
                RequestExecutor.execute(executor, callable, new Consumer<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                    @Override // androidx.core.util.Consumer
                    public void accept(TypefaceResult typefaceResult) {
                        synchronized (FontRequestWorker.LOCK) {
                            try {
                                SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> simpleArrayMap2 = FontRequestWorker.PENDING_REPLIES;
                                ArrayList<Consumer<TypefaceResult>> arrayList3 = simpleArrayMap2.get(strCreateCacheId);
                                if (arrayList3 == null) {
                                    return;
                                }
                                simpleArrayMap2.remove(strCreateCacheId);
                                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                    arrayList3.get(i12).accept(typefaceResult);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface requestFontSync(@NonNull final Context context, @NonNull final FontRequest fontRequest, @NonNull CallbackWrapper callbackWrapper, final int i11, int i12) {
        final String strCreateCacheId = createCacheId(C1100n.m2002a(new Object[]{fontRequest}), i11);
        Typeface typeface = sTypefaceCache.get(strCreateCacheId);
        if (typeface != null) {
            callbackWrapper.onTypefaceResult(new TypefaceResult(typeface));
            return typeface;
        }
        if (i12 == -1) {
            TypefaceResult fontSync = getFontSync(strCreateCacheId, context, C1100n.m2002a(new Object[]{fontRequest}), i11);
            callbackWrapper.onTypefaceResult(fontSync);
            return fontSync.mTypeface;
        }
        try {
            TypefaceResult typefaceResult = (TypefaceResult) RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public TypefaceResult call() {
                    return FontRequestWorker.getFontSync(strCreateCacheId, context, C1100n.m2002a(new Object[]{fontRequest}), i11);
                }
            }, i12);
            callbackWrapper.onTypefaceResult(typefaceResult);
            return typefaceResult.mTypeface;
        } catch (InterruptedException unused) {
            callbackWrapper.onTypefaceResult(new TypefaceResult(-3));
            return null;
        }
    }
}
