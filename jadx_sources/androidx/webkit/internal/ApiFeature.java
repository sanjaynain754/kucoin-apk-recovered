package androidx.webkit.internal;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import eh0.C37184a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {
    private static final Set<ApiFeature> sValues = new HashSet();
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiFeature$O */
    public static class C4165O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 26;
        }

        public C4165O(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    public static class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 27;
        }

        public O_MR1(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiFeature$P */
    public static class C4166P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 28;
        }

        public C4166P(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiFeature$Q */
    public static class C4167Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 29;
        }

        public C4167Q(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiFeature$T */
    public static class C4168T extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 33;
        }

        public C4168T(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    public abstract boolean isSupportedByFramework();

    public static class LAZY_HOLDER {
        static final Set<String> WEBVIEW_APK_FEATURES = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));

        private LAZY_HOLDER() {
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiFeature$M */
    public static class C4163M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        public C4163M(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiFeature$N */
    public static class C4164N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        public C4164N(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    public static class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }

        public NoFramework(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    @NonNull
    @VisibleForTesting
    public static Set<String> getWebViewApkFeaturesForTesting() {
        return LAZY_HOLDER.WEBVIEW_APK_FEATURES;
    }

    @NonNull
    public static Set<ApiFeature> values() {
        return Collections.unmodifiableSet(sValues);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    @NonNull
    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    @ChecksSdkIntAtLeast(api = 21)
    public boolean isSupportedByWebView() {
        return C37184a.m83172b(LAZY_HOLDER.WEBVIEW_APK_FEATURES, this.mInternalFeatureValue);
    }

    public ApiFeature(@NonNull String str, @NonNull String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        if (!isSupportedByFramework() && !isSupportedByWebView()) {
            return false;
        }
        return true;
    }
}
