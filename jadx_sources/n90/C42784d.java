package n90;

import android.opengl.EGL14;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: n90.d */
/* JADX INFO: compiled from: egl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0019\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016\"\u001a\u0010\u001b\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u001a\u0010\u001d\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u001a\u0010\u001f\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016\"\u001a\u0010\"\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u001a\u0010$\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b\r\u0010\u0016\"\u001a\u0010&\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u001a\u0010(\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u001a\u0010*\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u001a\u0010+\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u001a\u0010-\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b\u0007\u0010\u0016\"\u001a\u0010/\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b.\u0010\u0014\u001a\u0004\b\u0001\u0010\u0016\"\u001a\u00101\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b,\u0010\u0016\"\u001a\u00103\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b2\u0010\u0014\u001a\u0004\b.\u0010\u0016\"\u001a\u00105\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b4\u0010\u0014\u001a\u0004\b%\u0010\u0016\"\u001a\u00107\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b6\u0010\u0014\u001a\u0004\b)\u0010\u0016¨\u00068"}, m90084d2 = {"Ln90/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ln90/b;", "f", "()Ln90/b;", "EGL_NO_CONTEXT", "Ln90/c;", "b", "Ln90/c;", "g", "()Ln90/c;", "EGL_NO_DISPLAY", "Ln90/e;", "c", "Ln90/e;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ln90/e;", "EGL_NO_SURFACE", "", "d", "I", "n", "()I", "EGL_SUCCESS", "e", "EGL_NONE", "getEGL_WIDTH", "EGL_WIDTH", "getEGL_HEIGHT", "EGL_HEIGHT", "getEGL_READ", "EGL_READ", "i", "getEGL_DRAW", "EGL_DRAW", "j", "EGL_CONTEXT_CLIENT_VERSION", "k", "EGL_OPENGL_ES2_BIT", CmcdData.Factory.STREAM_TYPE_LIVE, "EGL_OPENGL_ES3_BIT_KHR", "m", "EGL_RED_SIZE", "EGL_GREEN_SIZE", "o", "EGL_BLUE_SIZE", "p", "EGL_ALPHA_SIZE", "q", "EGL_SURFACE_TYPE", "r", "EGL_WINDOW_BIT", CmcdData.Factory.STREAMING_FORMAT_SS, "EGL_PBUFFER_BIT", "t", "EGL_RENDERABLE_TYPE", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C42784d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EglContext f94729a = new EglContext(EGL14.EGL_NO_CONTEXT);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final EglDisplay f94730b = new EglDisplay(EGL14.EGL_NO_DISPLAY);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final EglSurface f94731c = new EglSurface(EGL14.EGL_NO_SURFACE);

    /* JADX INFO: renamed from: d */
    public static final int f94732d = 12288;

    /* JADX INFO: renamed from: e */
    public static final int f94733e = 12344;

    /* JADX INFO: renamed from: f */
    public static final int f94734f = 12375;

    /* JADX INFO: renamed from: g */
    public static final int f94735g = 12374;

    /* JADX INFO: renamed from: h */
    public static final int f94736h = 12378;

    /* JADX INFO: renamed from: i */
    public static final int f94737i = 12377;

    /* JADX INFO: renamed from: j */
    public static final int f94738j = 12440;

    /* JADX INFO: renamed from: k */
    public static final int f94739k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f94740l = 64;

    /* JADX INFO: renamed from: m */
    public static final int f94741m = 12324;

    /* JADX INFO: renamed from: n */
    public static final int f94742n = 12323;

    /* JADX INFO: renamed from: o */
    public static final int f94743o = 12322;

    /* JADX INFO: renamed from: p */
    public static final int f94744p = 12321;

    /* JADX INFO: renamed from: q */
    public static final int f94745q = 12339;

    /* JADX INFO: renamed from: r */
    public static final int f94746r = 4;

    /* JADX INFO: renamed from: s */
    public static final int f94747s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f94748t = 12352;

    /* JADX INFO: renamed from: a */
    public static final int m93737a() {
        return f94744p;
    }

    /* JADX INFO: renamed from: b */
    public static final int m93738b() {
        return f94743o;
    }

    /* JADX INFO: renamed from: c */
    public static final int m93739c() {
        return f94738j;
    }

    /* JADX INFO: renamed from: d */
    public static final int m93740d() {
        return f94742n;
    }

    /* JADX INFO: renamed from: e */
    public static final int m93741e() {
        return f94733e;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final EglContext m93742f() {
        return f94729a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final EglDisplay m93743g() {
        return f94730b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final EglSurface m93744h() {
        return f94731c;
    }

    /* JADX INFO: renamed from: i */
    public static final int m93745i() {
        return f94739k;
    }

    /* JADX INFO: renamed from: j */
    public static final int m93746j() {
        return f94740l;
    }

    /* JADX INFO: renamed from: k */
    public static final int m93747k() {
        return f94747s;
    }

    /* JADX INFO: renamed from: l */
    public static final int m93748l() {
        return f94741m;
    }

    /* JADX INFO: renamed from: m */
    public static final int m93749m() {
        return f94748t;
    }

    /* JADX INFO: renamed from: n */
    public static final int m93750n() {
        return f94732d;
    }

    /* JADX INFO: renamed from: o */
    public static final int m93751o() {
        return f94745q;
    }

    /* JADX INFO: renamed from: p */
    public static final int m93752p() {
        return f94746r;
    }
}
