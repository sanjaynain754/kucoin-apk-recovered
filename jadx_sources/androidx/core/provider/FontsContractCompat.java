package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.C1100n;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final List<FontInfo[]> mFonts;
        private final int mStatusCode;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public FontFamilyResult(int i11, @Nullable FontInfo[] fontInfoArr) {
            this.mStatusCode = i11;
            this.mFonts = Collections.singletonList(fontInfoArr);
        }

        public static FontFamilyResult create(int i11, @Nullable FontInfo[] fontInfoArr) {
            return new FontFamilyResult(i11, fontInfoArr);
        }

        public static FontFamilyResult create(int i11, @Nullable List<FontInfo[]> list) {
            return new FontFamilyResult(i11, list);
        }

        public FontInfo[] getFonts() {
            return this.mFonts.get(0);
        }

        @NonNull
        public List<FontInfo[]> getFontsWithFallbacks() {
            return this.mFonts;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        public boolean hasFallback() {
            return this.mFonts.size() > 1;
        }

        public FontFamilyResult(int i11, @NonNull List<FontInfo[]> list) {
            this.mStatusCode = i11;
            this.mFonts = list;
        }
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        public static FontInfo create(@NonNull Uri uri, @IntRange(from = 0) int i11, @IntRange(from = 1, m1553to = 1000) int i12, boolean z11, int i13) {
            return new FontInfo(uri, i11, i12, z11, i13);
        }

        public int getResultCode() {
            return this.mResultCode;
        }

        @IntRange(from = 0)
        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        @NonNull
        public Uri getUri() {
            return this.mUri;
        }

        @IntRange(from = 1, m1553to = 1000)
        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public FontInfo(@NonNull Uri uri, @IntRange(from = 0) int i11, @IntRange(from = 1, m1553to = 1000) int i12, boolean z11, int i13) {
            this.mUri = (Uri) Preconditions.checkNotNull(uri);
            this.mTtcIndex = i11;
            this.mWeight = i12;
            this.mItalic = z11;
            this.mResultCode = i13;
        }
    }

    @Nullable
    public static Typeface buildTypeface(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface getFontSync(Context context, FontRequest fontRequest, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z11, int i11, int i12) {
        TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = new TypefaceCompat.ResourcesCallbackAdapter(fontCallback);
        return requestFont(context, (List<FontRequest>) C1100n.m2002a(new Object[]{fontRequest}), i12, z11, i11, ResourcesCompat.FontCallback.getHandler(handler), resourcesCallbackAdapter);
    }

    @Deprecated
    public static void requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback);
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), C1100n.m2002a(new Object[]{fontRequest}), 0, RequestExecutor.createHandlerExecutor(handler), callbackWrapper);
    }

    public static void requestFontWithFallbackChain(@NonNull Context context, @NonNull List<FontRequest> list, int i11, @Nullable Executor executor, @NonNull Executor executor2, @NonNull FontRequestCallback fontRequestCallback) {
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), list, i11, executor, new CallbackWrapper(fontRequestCallback, executor2));
    }

    private FontsContractCompat() {
    }

    @NonNull
    public static FontFamilyResult fetchFonts(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        return FontProvider.getFontFamilyResult(context, C1100n.m2002a(new Object[]{fontRequest}), cancellationSignal);
    }

    @VisibleForTesting
    @Deprecated
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        return FontProvider.getProvider(packageManager, fontRequest, resources);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        return TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void resetCache() {
        FontRequestWorker.resetTypefaceCache();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static void resetTypefaceCache() {
        FontRequestWorker.resetTypefaceCache();
    }

    public static void requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, int i11, @Nullable Executor executor, @NonNull Executor executor2, @NonNull FontRequestCallback fontRequestCallback) {
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), C1100n.m2002a(new Object[]{fontRequest}), i11, executor, new CallbackWrapper(fontRequestCallback, executor2));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface requestFont(@NonNull Context context, @NonNull List<FontRequest> list, int i11, boolean z11, @IntRange(from = 0) int i12, @NonNull Handler handler, @NonNull FontRequestCallback fontRequestCallback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, RequestExecutor.createHandlerExecutor(handler));
        if (z11) {
            if (list.size() <= 1) {
                return FontRequestWorker.requestFontSync(context, list.get(0), callbackWrapper, i11, i12);
            }
            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
        }
        return FontRequestWorker.requestFontAsync(context, list, i11, null, callbackWrapper);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, int i11, boolean z11, @IntRange(from = 0) int i12, @NonNull Handler handler, @NonNull FontRequestCallback fontRequestCallback) {
        return requestFont(context, (List<FontRequest>) C1100n.m2002a(new Object[]{fontRequest}), i11, z11, i12, handler, fontRequestCallback);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int RESULT_OK = 0;
        static final int RESULT_SUCCESS = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i11) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }
}
