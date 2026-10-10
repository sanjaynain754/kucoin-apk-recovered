package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public interface TrustedWebActivityDisplayMode {
    public static final String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";

    public static class DefaultMode implements TrustedWebActivityDisplayMode {

        /* JADX INFO: renamed from: ID */
        private static final int f1218ID = 0;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 0);
            return bundle;
        }
    }

    public static class ImmersiveMode implements TrustedWebActivityDisplayMode {

        /* JADX INFO: renamed from: ID */
        private static final int f1219ID = 1;
        public static final String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public static final String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";
        private final boolean mIsSticky;
        private final int mLayoutInDisplayCutoutMode;

        @NonNull
        public static TrustedWebActivityDisplayMode fromBundle(@NonNull Bundle bundle) {
            return new ImmersiveMode(bundle.getBoolean(KEY_STICKY), bundle.getInt(KEY_CUTOUT_MODE));
        }

        public boolean isSticky() {
            return this.mIsSticky;
        }

        public int layoutInDisplayCutoutMode() {
            return this.mLayoutInDisplayCutoutMode;
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 1);
            bundle.putBoolean(KEY_STICKY, this.mIsSticky);
            bundle.putInt(KEY_CUTOUT_MODE, this.mLayoutInDisplayCutoutMode);
            return bundle;
        }

        public ImmersiveMode(boolean z11, int i11) {
            this.mIsSticky = z11;
            this.mLayoutInDisplayCutoutMode = i11;
        }
    }

    @NonNull
    Bundle toBundle();

    @NonNull
    static TrustedWebActivityDisplayMode fromBundle(@NonNull Bundle bundle) {
        return bundle.getInt(KEY_ID) != 1 ? new DefaultMode() : ImmersiveMode.fromBundle(bundle);
    }
}
