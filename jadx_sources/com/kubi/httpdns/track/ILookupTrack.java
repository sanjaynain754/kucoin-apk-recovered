package com.kubi.httpdns.track;

import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.net.InetAddress;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ILookupTrack.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u001d\u0010\u0016\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/httpdns/track/ILookupTrack;", "", "", "b", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "", "Ljava/net/InetAddress;", DbParams.KEY_CHANNEL_RESULT, "", "fromSystem", "f", "(Ljava/util/List;Z)V", "i", "Lck/a;", "g", "(Lck/a;)V", "d", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;)V", "Companion", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface ILookupTrack {

    /* JADX INFO: compiled from: ILookupTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/httpdns/track/ILookupTrack$Companion;", "", "()V", "TAG", "", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String TAG = "ILookupTrack";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f27205a = new Companion();
    }

    /* JADX INFO: renamed from: com.kubi.httpdns.track.ILookupTrack$a */
    /* JADX INFO: compiled from: ILookupTrack.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/httpdns/track/ILookupTrack$a;", "", "", "host", "Lcom/kubi/httpdns/track/ILookupTrack;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lcom/kubi/httpdns/track/ILookupTrack;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC15206a {
        @NotNull
        /* JADX INFO: renamed from: a */
        ILookupTrack mo31514a(@NotNull String host);
    }

    /* JADX INFO: renamed from: a */
    void mo31505a(@NotNull Throwable e11);

    /* JADX INFO: renamed from: b */
    void mo31506b();

    /* JADX INFO: renamed from: c */
    void mo31507c(@NotNull Throwable e11);

    /* JADX INFO: renamed from: d */
    void mo31508d();

    /* JADX INFO: renamed from: e */
    void mo31509e();

    /* JADX INFO: renamed from: f */
    void mo31510f(@NotNull List<? extends InetAddress> result, boolean fromSystem);

    /* JADX INFO: renamed from: g */
    void mo31511g(@NotNull C4989a result);

    /* JADX INFO: renamed from: h */
    void mo31512h(@NotNull List<? extends InetAddress> result);

    /* JADX INFO: renamed from: i */
    void mo31513i(@NotNull Throwable e11);
}
