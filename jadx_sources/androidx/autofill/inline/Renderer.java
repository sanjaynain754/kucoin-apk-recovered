package androidx.autofill.inline;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.autofill.inline.common.SlicedContent;
import androidx.autofill.inline.p019v1.InlineSuggestionUi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 30)
public final class Renderer {
    private static final String TAG = "Renderer";

    @NonNull
    public static Bundle getSupportedInlineUiVersionsAsBundle() {
        Bundle bundle = new Bundle();
        VersionUtils.writeSupportedVersions(bundle);
        return bundle;
    }

    private Renderer() {
    }

    @Nullable
    public static PendingIntent getAttributionIntent(@NonNull Slice slice) {
        String version = SlicedContent.getVersion(slice);
        if (!VersionUtils.isVersionSupported(version)) {
            Log.w(TAG, "Content version unsupported.");
            return null;
        }
        version.getClass();
        if (!version.equals(UiVersions.INLINE_UI_VERSION_1)) {
            Log.w(TAG, "Renderer does not support the content version: " + version);
            return null;
        }
        InlineSuggestionUi.Content contentFromSlice = InlineSuggestionUi.fromSlice(slice);
        if (contentFromSlice == null) {
            return null;
        }
        return InlineSuggestionUi.getAttributionIntent(contentFromSlice);
    }

    @Nullable
    public static View render(@NonNull Context context, @NonNull Slice slice, @NonNull Bundle bundle) {
        String version = SlicedContent.getVersion(slice);
        if (!VersionUtils.isVersionSupported(version)) {
            Log.w(TAG, "Content version unsupported.");
            return null;
        }
        Bundle styleByVersion = VersionUtils.readStyleByVersion(bundle, version);
        if (styleByVersion == null) {
            Log.w(TAG, "Cannot find a style with the same version as the slice.");
            return null;
        }
        version.getClass();
        if (!version.equals(UiVersions.INLINE_UI_VERSION_1)) {
            Log.w(TAG, "Renderer does not support the style/content version: " + version);
            return null;
        }
        InlineSuggestionUi.Style styleFromBundle = InlineSuggestionUi.fromBundle(styleByVersion);
        InlineSuggestionUi.Content contentFromSlice = InlineSuggestionUi.fromSlice(slice);
        if (styleFromBundle == null || slice == null) {
            return null;
        }
        return InlineSuggestionUi.render(context, contentFromSlice, styleFromBundle);
    }
}
