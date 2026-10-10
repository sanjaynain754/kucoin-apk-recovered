package com.kubi.host.service;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;

/* JADX INFO: renamed from: com.kubi.host.service.a */
/* JADX INFO: compiled from: IHostService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\bJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0004J\u0019\u0010!\u001a\u00020 2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0004¨\u0006$"}, m90084d2 = {"Lcom/kubi/host/service/a;", "", "", "f", "()Ljava/lang/String;", "k", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/util/List;", "m", "url", "r", "(Ljava/lang/String;)Ljava/lang/String;", "g", "x", "", CmcdData.Factory.STREAM_TYPE_LIVE, "()Ljava/util/Map;", "b", CmcdData.Factory.STREAMING_FORMAT_SS, "e", "d", "u", "t", "n", "j", "o", "v", "c", "w", "q", "p", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", "i", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC15188a {
    /* JADX INFO: renamed from: a */
    boolean m31417a(@Nullable String url);

    @NotNull
    /* JADX INFO: renamed from: b */
    String m31418b();

    @NotNull
    /* JADX INFO: renamed from: c */
    String m31419c();

    @NotNull
    /* JADX INFO: renamed from: d */
    String m31420d();

    @NotNull
    /* JADX INFO: renamed from: e */
    String m31421e();

    @NotNull
    /* JADX INFO: renamed from: f */
    String m31422f();

    @NotNull
    /* JADX INFO: renamed from: g */
    String m31423g(@NotNull String url);

    @NotNull
    /* JADX INFO: renamed from: h */
    List<String> m31424h();

    @NotNull
    /* JADX INFO: renamed from: i */
    String m31425i();

    @NotNull
    /* JADX INFO: renamed from: j */
    String m31426j();

    @NotNull
    /* JADX INFO: renamed from: k */
    String m31427k();

    @NotNull
    /* JADX INFO: renamed from: l */
    Map<String, String> m31428l();

    @NotNull
    /* JADX INFO: renamed from: m */
    String m31429m();

    @NotNull
    /* JADX INFO: renamed from: n */
    String m31430n();

    @NotNull
    /* JADX INFO: renamed from: o */
    String m31431o();

    @NotNull
    /* JADX INFO: renamed from: p */
    String m31432p();

    @NotNull
    /* JADX INFO: renamed from: q */
    String m31433q();

    @NotNull
    /* JADX INFO: renamed from: r */
    String m31434r(@NotNull String url);

    @NotNull
    /* JADX INFO: renamed from: s */
    List<String> m31435s();

    @NotNull
    /* JADX INFO: renamed from: t */
    String m31436t();

    @NotNull
    /* JADX INFO: renamed from: u */
    String m31437u();

    @NotNull
    /* JADX INFO: renamed from: v */
    String m31438v();

    @Deprecated(level = DeprecationLevel.WARNING, message = "此接口已经废弃，请根据情况使用 getAssetsUrl 替换，详细见文档https://wiki.kupotech.com/pages/viewpage.action?pageId=116730566", replaceWith = @ReplaceWith(expression = "getAssetsUrl()", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: w */
    String m31439w();

    @NotNull
    /* JADX INFO: renamed from: x */
    List<String> m31440x();
}
