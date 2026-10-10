package androidx.autofill.inline.common;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.autofill.inline.UiVersions;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 30)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class SlicedContent implements UiVersions.Content {
    static final Uri INLINE_SLICE_URI = Uri.parse("inline.slice");

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected final Slice mSlice;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract PendingIntent getAttributionIntent();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract boolean isValid();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class Builder<T extends SlicedContent> {

        @NonNull
        protected final Slice.Builder mSliceBuilder;

        @NonNull
        public abstract T build();

        public Builder(@NonNull String str) {
            C0607e.m1594a();
            this.mSliceBuilder = C0606d.m1593a(SlicedContent.INLINE_SLICE_URI, C0605c.m1592a(str, 1));
        }
    }

    @Override // androidx.autofill.inline.UiVersions.Content
    @NonNull
    public final Slice getSlice() {
        return this.mSlice;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SlicedContent(@NonNull Slice slice) {
        this.mSlice = slice;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getVersion(@NonNull Slice slice) {
        return slice.getSpec().getType();
    }
}
