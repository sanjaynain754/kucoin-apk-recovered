package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.tencent.bugly.proguard.C33820nf;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    public static String buildRangeRequestHeader(long j11, long j12) {
        if (j11 == 0 && j12 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j11);
        sb2.append(C33820nf.f71144W);
        if (j12 != -1) {
            sb2.append((j11 + j12) - 1);
        }
        return sb2.toString();
    }

    private HttpUtil() {
    }

    public static long getContentLength(@Nullable String str, @Nullable String str2) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            try {
                j11 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.m2957e(TAG, "Unexpected Content-Length [" + str + "]");
                j11 = -1;
            }
        } else {
            j11 = -1;
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j12 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) - Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)))) + 1;
                    if (j11 < 0) {
                        return j12;
                    }
                    if (j11 != j12) {
                        Log.m2961w(TAG, "Inconsistent headers [" + str + "] [" + str2 + "]");
                        return Math.max(j11, j12);
                    }
                    return j11;
                } catch (NumberFormatException unused2) {
                    Log.m2957e(TAG, "Unexpected Content-Range [" + str2 + "]");
                    return j11;
                }
            }
            return j11;
        }
        return j11;
    }

    public static long getDocumentSize(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
    }
}
