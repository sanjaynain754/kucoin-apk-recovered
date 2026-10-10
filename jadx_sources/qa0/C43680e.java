package qa0;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qa0.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C43680e {
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Uri m96140a(@NotNull String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(uriString)");
        return uri;
    }
}
