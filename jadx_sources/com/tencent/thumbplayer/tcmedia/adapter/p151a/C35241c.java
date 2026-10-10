package com.tencent.thumbplayer.tcmedia.adapter.p151a;

import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35241c {

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo77486a(TPAudioFrameBuffer tPAudioFrameBuffer);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        TPPostProcessFrameBuffer mo77489b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$c */
    public interface c {
        /* JADX INFO: renamed from: b */
        void mo77490b();
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        TPRemoteSdpInfo mo77631a(String str, int i11);

        /* JADX INFO: renamed from: d */
        void mo77632d();
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo77633a(TPPlayerDetailInfo tPPlayerDetailInfo);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo77483a(@TPCommonEnum.TPErrorType int i11, int i12, long j11, long j12);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo77634a(TPDrmInfo tPDrmInfo);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo77484a(int i11, long j11, long j12, Object obj);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo77482a();
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$j */
    public interface j {
        /* JADX INFO: renamed from: c */
        void mo77491c();
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$k */
    public interface k {
        /* JADX INFO: renamed from: b */
        void mo77635b(int i11, int i12);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$l */
    public interface l {
        /* JADX INFO: renamed from: a */
        void mo77487a(TPSubtitleData tPSubtitleData);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$m */
    public interface m {
        /* JADX INFO: renamed from: a */
        void mo77636a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$n */
    public interface n {
        /* JADX INFO: renamed from: a */
        void mo77488a(TPVideoFrameBuffer tPVideoFrameBuffer);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$o */
    public interface o {
        /* JADX INFO: renamed from: a */
        TPPostProcessFrameBuffer mo77481a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.c$p */
    public interface p {
        /* JADX INFO: renamed from: a */
        void mo77485a(long j11, long j12);
    }
}
