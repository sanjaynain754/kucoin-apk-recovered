package androidx.savedstate;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateReader.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, m90084d2 = {"keyOrValueNotFoundError", "", "key", "", "savedstate_release"}, m90085k = 5, m90086mv = {2, 0, 0}, m90088xi = 48, m90089xs = "androidx/savedstate/SavedStateReaderKt")
final /* synthetic */ class SavedStateReaderKt__SavedStateReaderKt {
    @PublishedApi
    @NotNull
    public static final Void keyOrValueNotFoundError(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
