package x00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.config.WebConfig;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: x00.c */
/* JADX INFO: compiled from: WebDevConfig.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\f"}, m90084d2 = {"Lx00/c;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "b", "Z", "isOpenMonitor", "c", "isAllowDisableUrl", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45978c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45978c f103427a = new C45978c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isOpenMonitor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isAllowDisableUrl;

    /* JADX INFO: renamed from: a */
    public final boolean m101431a() {
        return isAllowDisableUrl && WebConfig.f48355a.m58592c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m101432b() {
        return isOpenMonitor && WebConfig.f48355a.m58592c();
    }
}
