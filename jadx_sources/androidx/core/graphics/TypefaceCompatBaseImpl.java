package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final String TAG = "TypefaceCompatBaseImpl";

    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies = new ConcurrentHashMap<>();

    /* JADX INFO: loaded from: classes23.dex */
    public interface StyleExtractor<T> {
        int getWeight(T t11);

        boolean isItalic(T t11);
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i11) {
        return (FontResourcesParserCompat.FontFileResourceEntry) findBestFont(fontFamilyFilesResourceEntry.getEntries(), i11, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    private static <T> T findBestFont(T[] tArr, int i11, StyleExtractor<T> styleExtractor) {
        return (T) findBestFont(tArr, (i11 & 1) == 0 ? 400 : 700, (i11 & 2) != 0, styleExtractor);
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i11) {
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntryFindBestEntry = findBestEntry(fontFamilyFilesResourceEntry, i11);
        if (fontFileResourceEntryFindBestEntry == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, fontFileResourceEntryFindBestEntry.getResourceId(), fontFileResourceEntryFindBestEntry.getFileName(), 0, i11);
        addFontFamily(typefaceCreateFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return typefaceCreateFromResourcesFontFile;
    }

    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i11) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(findBestInfo(fontInfoArr, i11).getUri());
            try {
                Typeface typefaceCreateFromInputStream = createFromInputStream(context, inputStreamOpenInputStream);
                TypefaceCompatUtil.closeQuietly(inputStreamOpenInputStream);
                return typefaceCreateFromInputStream;
            } catch (IOException unused) {
                TypefaceCompatUtil.closeQuietly(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                TypefaceCompatUtil.closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i11, boolean z11) {
        return (FontResourcesParserCompat.FontFileResourceEntry) findBestFont(fontFamilyFilesResourceEntry.getEntries(), i11, z11, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.3
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    private static <T> T findBestFont(T[] tArr, int i11, boolean z11, StyleExtractor<T> styleExtractor) {
        T t11 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t12 : tArr) {
            int iAbs = (Math.abs(styleExtractor.getWeight(t12) - i11) * 2) + (styleExtractor.isItalic(t12) == z11 ? 0 : 1);
            if (t11 == null || i12 > iAbs) {
                t11 = t12;
                i12 = iAbs;
            }
        }
        return t11;
    }

    private static long getUniqueKey(@Nullable Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e11) {
            Log.e(TAG, "Could not retrieve font from family.", e11);
            return 0L;
        } catch (NoSuchFieldException e12) {
            Log.e(TAG, "Could not retrieve font from family.", e12);
            return 0L;
        }
    }

    @Nullable
    @RequiresApi(29)
    public Typeface createFromFontInfoWithFallback(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull List<FontsContractCompat.FontInfo[]> list, int i11) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i11) {
        return (FontsContractCompat.FontInfo) findBestFont(fontInfoArr, i11, new StyleExtractor<FontsContractCompat.FontInfo>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.1
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public int getWeight(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean isItalic(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.isItalic();
            }
        });
    }

    private void addFontFamily(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey != 0) {
            this.mFontFamilies.put(Long.valueOf(uniqueKey), fontFamilyFilesResourceEntry);
        }
    }

    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.copyToFile(tempFile, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(tempFile.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i11, String str, int i12) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.copyToFile(tempFile, resources, i11)) {
                return null;
            }
            return Typeface.createFromFile(tempFile.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    @NonNull
    public Typeface createWeightStyle(@NonNull Context context, @NonNull Typeface typeface, int i11, boolean z11) {
        Typeface typefaceCreateWeightStyle;
        try {
            typefaceCreateWeightStyle = WeightTypefaceApi14.createWeightStyle(this, context, typeface, i11, z11);
        } catch (RuntimeException unused) {
            typefaceCreateWeightStyle = null;
        }
        if (typefaceCreateWeightStyle != null) {
            return typefaceCreateWeightStyle;
        }
        return typeface;
    }

    @Nullable
    public FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(Typeface typeface) {
        long uniqueKey = getUniqueKey(typeface);
        if (uniqueKey == 0) {
            return null;
        }
        return this.mFontFamilies.get(Long.valueOf(uniqueKey));
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i11, boolean z11) {
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntryFindBestEntry = findBestEntry(fontFamilyFilesResourceEntry, i11, z11);
        if (fontFileResourceEntryFindBestEntry == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, fontFileResourceEntryFindBestEntry.getResourceId(), fontFileResourceEntryFindBestEntry.getFileName(), 0, 0);
        addFontFamily(typefaceCreateFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return typefaceCreateFromResourcesFontFile;
    }
}
