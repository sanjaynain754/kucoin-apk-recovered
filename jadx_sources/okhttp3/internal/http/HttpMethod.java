package okhttp3.internal.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m90084d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", FirebaseAnalytics.Param.METHOD, "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class HttpMethod {

    @NotNull
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    @JvmStatic
    public static final boolean permitsRequestBody(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method, "GET") && !Intrinsics.areEqual(method, "HEAD")) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean requiresRequestBody(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method, "POST") && !Intrinsics.areEqual(method, "PUT") && !Intrinsics.areEqual(method, "PATCH") && !Intrinsics.areEqual(method, "PROPPATCH") && !Intrinsics.areEqual(method, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method, "POST") && !Intrinsics.areEqual(method, "PATCH") && !Intrinsics.areEqual(method, "PUT") && !Intrinsics.areEqual(method, "DELETE") && !Intrinsics.areEqual(method, "MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
