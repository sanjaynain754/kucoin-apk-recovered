package n90;

import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.work.Data;
import p852kotlin.Metadata;
import p852kotlin.UInt;

/* JADX INFO: renamed from: n90.f */
/* JADX INFO: compiled from: gl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0007\n\u0002\b\u0018\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\t\u001a\u00020\u00068\u0000X\u0081\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\f\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001d\u0010\u0012\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0004\"\u001d\u0010\u0014\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001d\u0010\u0017\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u001d\u0010\u0019\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u001d\u0010\u001c\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0004\"\u001d\u0010\u001f\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0004\"\u001d\u0010!\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b\u001a\u0010\u0004\"\u001d\u0010#\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u001d\u0010%\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u001d\u0010'\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\u0002\u001a\u0004\b \u0010\u0004\"\u001d\u0010(\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b$\u0010\u0004\"\u001d\u0010)\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b&\u0010\u0004\"\u001a\u0010+\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u001a\u00100\u001a\u00020,8\u0000X\u0080D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0015\u0010/\"\u001a\u00102\u001a\u00020,8\u0000X\u0080D¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b\u0010\u0010/\"\u001d\u00105\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u001d\u00108\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u001d\u0010;\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u001d\u0010=\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001d\u0010?\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b>\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001d\u0010A\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b@\u0010\u0002\u001a\u0004\b*\u0010\u0004\"\u001d\u0010C\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\b\r\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, m90084d2 = {"", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "p", "()I", "GL_TRUE", "Lkotlin/UInt;", "b", "getGL_SHADER_STORAGE_BUFFER", "GL_SHADER_STORAGE_BUFFER", "c", "getGL_VIEWPORT", "GL_VIEWPORT", "d", CmcdData.Factory.STREAMING_FORMAT_HLS, "GL_NO_ERROR", "e", "getGL_UNSIGNED_BYTE", "GL_UNSIGNED_BYTE", "f", "GL_FLOAT", "g", "getGL_RGBA", "GL_RGBA", "getGL_TRIANGLES", "GL_TRIANGLES", "i", "getGL_TRIANGLE_FAN", "GL_TRIANGLE_FAN", "j", "o", "GL_TRIANGLE_STRIP", "k", "GL_TEXTURE0", CmcdData.Factory.STREAM_TYPE_LIVE, "GL_TEXTURE_EXTERNAL_OES", "m", "GL_TEXTURE_MIN_FILTER", "n", "GL_TEXTURE_MAG_FILTER", "GL_TEXTURE_WRAP_S", "GL_TEXTURE_WRAP_T", "q", "GL_CLAMP_TO_EDGE", "", "r", "F", "()F", "GL_NEAREST", CmcdData.Factory.STREAMING_FORMAT_SS, "GL_LINEAR", "t", "getGL_FRAMEBUFFER", "GL_FRAMEBUFFER", "u", "getGL_FRAMEBUFFER_COMPLETE", "GL_FRAMEBUFFER_COMPLETE", "v", "getGL_COLOR_ATTACHMENT0", "GL_COLOR_ATTACHMENT0", "w", "GL_COMPILE_STATUS", "x", "GL_LINK_STATUS", "y", "GL_VERTEX_SHADER", "z", "GL_FRAGMENT_SHADER", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C42786f {

    /* JADX INFO: renamed from: a */
    public static final int f94750a = 1;

    /* JADX INFO: renamed from: d */
    public static final int f94753d = 0;

    /* JADX INFO: renamed from: b */
    @RequiresApi(21)
    public static final int f94751b = UInt.m103939constructorimpl(37074);

    /* JADX INFO: renamed from: c */
    public static final int f94752c = 2978;

    /* JADX INFO: renamed from: e */
    public static final int f94754e = UInt.m103939constructorimpl(5121);

    /* JADX INFO: renamed from: f */
    public static final int f94755f = UInt.m103939constructorimpl(5126);

    /* JADX INFO: renamed from: g */
    public static final int f94756g = UInt.m103939constructorimpl(6408);

    /* JADX INFO: renamed from: h */
    public static final int f94757h = UInt.m103939constructorimpl(4);

    /* JADX INFO: renamed from: i */
    public static final int f94758i = UInt.m103939constructorimpl(6);

    /* JADX INFO: renamed from: j */
    public static final int f94759j = UInt.m103939constructorimpl(5);

    /* JADX INFO: renamed from: k */
    public static final int f94760k = UInt.m103939constructorimpl(33984);

    /* JADX INFO: renamed from: l */
    public static final int f94761l = UInt.m103939constructorimpl(36197);

    /* JADX INFO: renamed from: m */
    public static final int f94762m = UInt.m103939constructorimpl(10241);

    /* JADX INFO: renamed from: n */
    public static final int f94763n = UInt.m103939constructorimpl(Data.MAX_DATA_BYTES);

    /* JADX INFO: renamed from: o */
    public static final int f94764o = UInt.m103939constructorimpl(10242);

    /* JADX INFO: renamed from: p */
    public static final int f94765p = UInt.m103939constructorimpl(10243);

    /* JADX INFO: renamed from: q */
    public static final int f94766q = 33071;

    /* JADX INFO: renamed from: r */
    public static final float f94767r = 9728.0f;

    /* JADX INFO: renamed from: s */
    public static final float f94768s = 9729.0f;

    /* JADX INFO: renamed from: t */
    public static final int f94769t = UInt.m103939constructorimpl(36160);

    /* JADX INFO: renamed from: u */
    public static final int f94770u = UInt.m103939constructorimpl(36053);

    /* JADX INFO: renamed from: v */
    public static final int f94771v = UInt.m103939constructorimpl(36064);

    /* JADX INFO: renamed from: w */
    public static final int f94772w = UInt.m103939constructorimpl(35713);

    /* JADX INFO: renamed from: x */
    public static final int f94773x = UInt.m103939constructorimpl(35714);

    /* JADX INFO: renamed from: y */
    public static final int f94774y = UInt.m103939constructorimpl(35633);

    /* JADX INFO: renamed from: z */
    public static final int f94775z = UInt.m103939constructorimpl(35632);

    /* JADX INFO: renamed from: a */
    public static final int m93754a() {
        return f94766q;
    }

    /* JADX INFO: renamed from: b */
    public static final int m93755b() {
        return f94772w;
    }

    /* JADX INFO: renamed from: c */
    public static final int m93756c() {
        return f94755f;
    }

    /* JADX INFO: renamed from: d */
    public static final int m93757d() {
        return f94775z;
    }

    /* JADX INFO: renamed from: e */
    public static final float m93758e() {
        return f94768s;
    }

    /* JADX INFO: renamed from: f */
    public static final int m93759f() {
        return f94773x;
    }

    /* JADX INFO: renamed from: g */
    public static final float m93760g() {
        return f94767r;
    }

    /* JADX INFO: renamed from: h */
    public static final int m93761h() {
        return f94753d;
    }

    /* JADX INFO: renamed from: i */
    public static final int m93762i() {
        return f94760k;
    }

    /* JADX INFO: renamed from: j */
    public static final int m93763j() {
        return f94761l;
    }

    /* JADX INFO: renamed from: k */
    public static final int m93764k() {
        return f94763n;
    }

    /* JADX INFO: renamed from: l */
    public static final int m93765l() {
        return f94762m;
    }

    /* JADX INFO: renamed from: m */
    public static final int m93766m() {
        return f94764o;
    }

    /* JADX INFO: renamed from: n */
    public static final int m93767n() {
        return f94765p;
    }

    /* JADX INFO: renamed from: o */
    public static final int m93768o() {
        return f94759j;
    }

    /* JADX INFO: renamed from: p */
    public static final int m93769p() {
        return f94750a;
    }

    /* JADX INFO: renamed from: q */
    public static final int m93770q() {
        return f94774y;
    }
}
