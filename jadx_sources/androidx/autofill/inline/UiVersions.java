package androidx.autofill.inline;

import android.app.slice.Slice;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 30)
public final class UiVersions {
    public static final String INLINE_UI_VERSION_1 = "androidx.autofill.inline.ui.version:v1";
    private static final Set<String> UI_VERSIONS = new HashSet(Arrays.asList(INLINE_UI_VERSION_1));

    public interface Content {
        @NonNull
        Slice getSlice();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface InlineUiVersion {
    }

    public interface Style {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        Bundle getBundle();

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        String getVersion();
    }

    public static final class StylesBuilder {
        private final List<Style> mStyles = new ArrayList();

        @NonNull
        public Bundle build() {
            if (this.mStyles.isEmpty()) {
                throw new IllegalStateException("Please put at least one style in the builder");
            }
            Bundle bundle = new Bundle();
            VersionUtils.writeStylesToBundle(this.mStyles, bundle);
            return bundle;
        }

        @NonNull
        public StylesBuilder addStyle(@NonNull Style style) {
            if (VersionUtils.isVersionSupported(style.getVersion())) {
                this.mStyles.add(style);
                return this;
            }
            throw new IllegalArgumentException("Unsupported style version: " + style.getVersion());
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Set<String> getUiVersions() {
        return UI_VERSIONS;
    }

    @NonNull
    public static StylesBuilder newStylesBuilder() {
        return new StylesBuilder();
    }

    private UiVersions() {
    }

    @NonNull
    public static List<String> getVersions(@NonNull Bundle bundle) {
        return VersionUtils.getSupportedVersions(bundle);
    }
}
