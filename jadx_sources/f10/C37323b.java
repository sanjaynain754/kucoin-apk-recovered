package f10;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.helper.C24308d;
import com.kubi.sdk.web.util.C24335h;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f10.b */
/* JADX INFO: compiled from: SsgDownloadTime.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lf10/b;", "", "<init>", "()V", "", "url", "", "downloadTime", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;J)V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;)J", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "ssgDownloadTimeMap", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37323b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37323b f82838a = new C37323b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Long> ssgDownloadTimeMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m83893a(@NotNull String url, long downloadTime) {
        String strM58702a;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uriM58889h = C24335h.f48569a.m58889h(url);
        if (uriM58889h == null || (strM58702a = C24308d.m58702a(uriM58889h)) == null) {
            return;
        }
        ssgDownloadTimeMap.put(strM58702a, Long.valueOf(downloadTime));
    }

    /* JADX INFO: renamed from: b */
    public final long m83894b(@Nullable Uri uri) {
        String strM58702a;
        if (uri == null || (strM58702a = C24308d.m58702a(uri)) == null || strM58702a.length() == 0) {
            return 0L;
        }
        Long l11 = ssgDownloadTimeMap.get(strM58702a);
        if (l11 == null) {
            l11 = 0L;
        }
        return l11.longValue();
    }
}
