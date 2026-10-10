package com.kubi.httpdns.track;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.cache.HostRecord;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import p234ek.C37208f;
import p290gk.C37969b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IInterpretTrack.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0002%\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u0016J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\f¨\u0006&"}, m90084d2 = {"Lcom/kubi/httpdns/track/IInterpretTrack;", "", "", "b", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "Lcom/kubi/httpdns/cache/HostRecord;", "record", "m", "(Lcom/kubi/httpdns/cache/HostRecord;)V", "g", "d", "Lek/f;", "response", "k", "(Lek/f;)V", "", "name", "r", "(Ljava/lang/String;)V", "p", "j", CmcdData.Factory.STREAM_TYPE_LIVE, "n", "Lgk/b;", DbParams.KEY_CHANNEL_RESULT, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lgk/b;)V", "ip", "o", "q", "i", "f", CmcdData.Factory.STREAMING_FORMAT_SS, "Companion", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface IInterpretTrack {

    /* JADX INFO: compiled from: IInterpretTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/httpdns/track/IInterpretTrack$Companion;", "", "()V", "TAG", "", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String TAG = "IInterpretTrack";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f27204a = new Companion();
    }

    /* JADX INFO: renamed from: com.kubi.httpdns.track.IInterpretTrack$a */
    /* JADX INFO: compiled from: IInterpretTrack.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/httpdns/track/IInterpretTrack$a;", "", "", "host", "Lcom/kubi/httpdns/track/IInterpretTrack;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lcom/kubi/httpdns/track/IInterpretTrack;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC15205a {
        @NotNull
        /* JADX INFO: renamed from: a */
        IInterpretTrack mo31504a(@NotNull String host);
    }

    /* JADX INFO: renamed from: a */
    void mo31486a(@NotNull Throwable e11);

    /* JADX INFO: renamed from: b */
    void mo31487b();

    /* JADX INFO: renamed from: d */
    void mo31488d(@NotNull Throwable e11);

    /* JADX INFO: renamed from: e */
    void mo31489e(@NotNull Throwable e11);

    /* JADX INFO: renamed from: f */
    void mo31490f();

    /* JADX INFO: renamed from: g */
    void mo31491g();

    /* JADX INFO: renamed from: h */
    void mo31492h(@NotNull C37969b result);

    /* JADX INFO: renamed from: i */
    void mo31493i();

    /* JADX INFO: renamed from: j */
    void mo31494j();

    /* JADX INFO: renamed from: k */
    void mo31495k(@NotNull C37208f response);

    /* JADX INFO: renamed from: l */
    void mo31496l();

    /* JADX INFO: renamed from: m */
    void mo31497m(@NotNull HostRecord record);

    /* JADX INFO: renamed from: n */
    void mo31498n(@NotNull Throwable e11);

    /* JADX INFO: renamed from: o */
    void mo31499o(@NotNull String ip2);

    /* JADX INFO: renamed from: p */
    void mo31500p(@NotNull Throwable e11);

    /* JADX INFO: renamed from: q */
    void mo31501q(@NotNull Throwable e11);

    /* JADX INFO: renamed from: r */
    void mo31502r(@NotNull String name);

    /* JADX INFO: renamed from: s */
    void mo31503s(@NotNull HostRecord record);
}
