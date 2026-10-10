package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes23.dex */
public class UriMatcherCompat {
    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull final UriMatcher uriMatcher) {
        return new Predicate() { // from class: androidx.core.content.w
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return UriMatcherCompat.m2306a(uriMatcher, (Uri) obj);
            }
        };
    }

    private UriMatcherCompat() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2306a(UriMatcher uriMatcher, Uri uri) {
        if (uriMatcher.match(uri) != -1) {
            return true;
        }
        return false;
    }
}
