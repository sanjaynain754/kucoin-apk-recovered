package com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.TimedText;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.tencent.imsdk.BaseConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b.C35240c;
import com.tencent.thumbplayer.tcmedia.api.TPAudioAttributes;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p150a.C35228c;
import com.tencent.thumbplayer.tcmedia.p160e.C35351a;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e */
/* JADX INFO: loaded from: classes62.dex */
public class C35236e implements InterfaceC35237b {

    /* JADX INFO: renamed from: A */
    private C35241c.l f75549A;

    /* JADX INFO: renamed from: B */
    private C35241c.m f75550B;

    /* JADX INFO: renamed from: C */
    private volatile MediaPlayer f75551C;

    /* JADX INFO: renamed from: D */
    private d f75552D;

    /* JADX INFO: renamed from: E */
    private C35228c f75553E;

    /* JADX INFO: renamed from: F */
    private Object f75554F;

    /* JADX INFO: renamed from: J */
    private a f75558J;

    /* JADX INFO: renamed from: Q */
    private volatile e f75565Q;

    /* JADX INFO: renamed from: R */
    private volatile e f75566R;

    /* JADX INFO: renamed from: a */
    private C35351a f75575a;

    /* JADX INFO: renamed from: af */
    private InterfaceC35232a f75581af;

    /* JADX INFO: renamed from: b */
    private Context f75585b;

    /* JADX INFO: renamed from: f */
    private String f75589f;

    /* JADX INFO: renamed from: g */
    private FileDescriptor f75590g;

    /* JADX INFO: renamed from: h */
    private AssetFileDescriptor f75591h;

    /* JADX INFO: renamed from: l */
    private Map<String, String> f75595l;

    /* JADX INFO: renamed from: u */
    private C35241c.i f75604u;

    /* JADX INFO: renamed from: v */
    private C35241c.c f75605v;

    /* JADX INFO: renamed from: w */
    private C35241c.h f75606w;

    /* JADX INFO: renamed from: x */
    private C35241c.f f75607x;

    /* JADX INFO: renamed from: y */
    private C35241c.j f75608y;

    /* JADX INFO: renamed from: z */
    private C35241c.p f75609z;

    /* JADX INFO: renamed from: c */
    private boolean f75586c = false;

    /* JADX INFO: renamed from: d */
    private long f75587d = 0;

    /* JADX INFO: renamed from: e */
    private long f75588e = 0;

    /* JADX INFO: renamed from: i */
    private boolean f75592i = false;

    /* JADX INFO: renamed from: j */
    private float f75593j = 1.0f;

    /* JADX INFO: renamed from: k */
    private float f75594k = 1.0f;

    /* JADX INFO: renamed from: m */
    private int f75596m = 0;

    /* JADX INFO: renamed from: n */
    private long f75597n = -1;

    /* JADX INFO: renamed from: o */
    private boolean f75598o = false;

    /* JADX INFO: renamed from: p */
    private long f75599p = -1;

    /* JADX INFO: renamed from: q */
    private int f75600q = -1;

    /* JADX INFO: renamed from: r */
    private int f75601r = -1;

    /* JADX INFO: renamed from: s */
    private TPAudioAttributes f75602s = null;

    /* JADX INFO: renamed from: t */
    private boolean f75603t = true;

    /* JADX INFO: renamed from: G */
    private Future<?> f75555G = null;

    /* JADX INFO: renamed from: H */
    private final Object f75556H = new Object();

    /* JADX INFO: renamed from: I */
    private long f75557I = AbstractC28073M0.DEFAULT_TIMEOUT;

    /* JADX INFO: renamed from: K */
    private final Object f75559K = new Object();

    /* JADX INFO: renamed from: L */
    private int f75560L = 3;

    /* JADX INFO: renamed from: M */
    private int f75561M = 30;

    /* JADX INFO: renamed from: N */
    private final Object f75562N = new Object();

    /* JADX INFO: renamed from: O */
    private Future<?> f75563O = null;

    /* JADX INFO: renamed from: P */
    private boolean f75564P = false;

    /* JADX INFO: renamed from: S */
    private boolean f75567S = false;

    /* JADX INFO: renamed from: T */
    private long f75568T = 0;

    /* JADX INFO: renamed from: U */
    private long f75569U = -1;

    /* JADX INFO: renamed from: V */
    private int f75570V = 0;

    /* JADX INFO: renamed from: W */
    private int f75571W = 0;

    /* JADX INFO: renamed from: X */
    private volatile boolean f75572X = false;

    /* JADX INFO: renamed from: Y */
    private int f75573Y = 0;

    /* JADX INFO: renamed from: Z */
    private int f75574Z = -1;

    /* JADX INFO: renamed from: aa */
    private int f75576aa = 0;

    /* JADX INFO: renamed from: ab */
    private int f75577ab = -1;

    /* JADX INFO: renamed from: ac */
    private int f75578ac = -1;

    /* JADX INFO: renamed from: ad */
    private List<b> f75579ad = new ArrayList();

    /* JADX INFO: renamed from: ae */
    private List<b> f75580ae = new ArrayList();

    /* JADX INFO: renamed from: ag */
    private long f75582ag = 0;

    /* JADX INFO: renamed from: ah */
    private f f75583ah = null;

    /* JADX INFO: renamed from: ai */
    private MediaPlayer.OnTimedTextListener f75584ai = new MediaPlayer.OnTimedTextListener() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.8
        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            if (C35236e.this.f75549A != null) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = timedText != null ? timedText.getText() : "";
                tPSubtitleData.trackIndex = C35236e.this.f75574Z;
                tPSubtitleData.startPositionMs = C35236e.this.mo77473o();
                C35236e.this.f75549A.mo77487a(tPSubtitleData);
            }
        }
    };

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        boolean f75619a;

        /* JADX INFO: renamed from: b */
        Future<?> f75620b;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public TPTrackInfo f75621a;

        /* JADX INFO: renamed from: b */
        public String f75622b;

        /* JADX INFO: renamed from: c */
        public List<TPOptionalParam> f75623c;

        /* JADX INFO: renamed from: d */
        public Map<String, String> f75624d;

        private b() {
            this.f75622b = "";
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$c */
    public static class c implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        private Handler f75625a;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                this.f75625a.handleMessage(message);
                return true;
            } catch (Exception e11) {
                TPLogUtil.m78797e("TPSystemMediaPlayer", "mediaPlayerExceptionHook, HookCallback, " + Log.getStackTraceString(e11));
                return true;
            }
        }

        public c(Handler handler) {
            this.f75625a = handler;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$d */
    public class d implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private d() {
        }

        /* JADX INFO: renamed from: a */
        private int m77557a(int i11) {
            return C35236e.this.f75601r > 0 ? C35236e.this.f75601r : i11;
        }

        /* JADX INFO: renamed from: b */
        private int m77558b(int i11) {
            return C35236e.this.f75600q > 0 ? C35236e.this.f75600q : i11;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (C35236e.this.f75598o) {
                C35236e.this.f75575a.m78142d("onCompletion, unknown err.");
                return;
            }
            C35236e.this.f75575a.m78141c("onCompletion.");
            C35236e.this.f75566R = e.COMPLETE;
            C35236e.this.m77496C();
            C35241c.c cVar = C35236e.this.f75605v;
            if (cVar != null) {
                cVar.mo77490b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            int i13;
            if (C35236e.this.f75565Q != e.COMPLETE && C35236e.this.f75565Q != e.STOPPED && C35236e.this.f75565Q != e.RELEASE && C35236e.this.f75565Q != e.IDLE) {
                e eVar = C35236e.this.f75565Q;
                e eVar2 = e.ERROR;
                if (eVar != eVar2) {
                    C35236e.this.f75575a.m78141c("onError, what: " + i11 + ", extra: " + i12);
                    C35236e.this.m77493A();
                    C35236e.this.m77496C();
                    C35236e.this.f75565Q = eVar2;
                    if (i12 == -1010 || i12 == -1007) {
                        i13 = 2000;
                    } else if (i12 != -110) {
                        switch (i12) {
                            case TUIConstants.TUICalling.ERROR_REQUEST_AUDIO_FOCUS_FAILED /* -1005 */:
                            case -1004:
                            case -1003:
                                i13 = 2001;
                                break;
                            default:
                                if (i11 != 1 && i11 == 100) {
                                    i13 = 2001;
                                } else {
                                    i13 = 2000;
                                }
                                break;
                        }
                    } else {
                        i13 = 2001;
                    }
                    C35236e.this.m77525e();
                    C35241c.f fVar = C35236e.this.f75607x;
                    if (fVar != null) {
                        fVar.mo77483a(i13, C35236e.m77532g(i11), i12, 0L);
                    }
                    return true;
                }
            }
            C35236e.this.f75575a.m78141c("onError, illegal state:" + C35236e.this.f75565Q + ", what:" + i11 + ", extra:" + i12);
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
            int i13;
            C35236e.this.f75575a.m78141c("mediaplayer, onInfo. what:" + i11 + ", extra:" + i12);
            if (i11 != 3) {
                if (i11 == 801) {
                    C35236e.this.f75564P = true;
                } else if (i11 == 701) {
                    i13 = 200;
                } else if (i11 == 702) {
                    i13 = 201;
                }
                i13 = -1;
            } else {
                i13 = 106;
            }
            if (i13 != -1) {
                if (200 == i13 || 201 == i13) {
                    if (!C35236e.this.m77500G()) {
                        C35236e c35236e = C35236e.this;
                        if (200 == i13) {
                            c35236e.f75572X = true;
                            C35236e.this.m77498E();
                        } else {
                            c35236e.f75572X = false;
                            C35236e.this.m77499F();
                        }
                        if (C35236e.this.f75606w != null) {
                            C35236e.this.f75606w.mo77484a(i13, 0L, 0L, null);
                        }
                    }
                } else if (C35236e.this.f75606w != null) {
                    C35236e.this.f75606w.mo77484a(106, 0L, 0L, null);
                }
            }
            if (i13 == 106) {
                int iM77557a = m77557a(mediaPlayer.getVideoWidth());
                int iM77558b = m77558b(mediaPlayer.getVideoHeight());
                if ((iM77558b != C35236e.this.f75571W || iM77557a != C35236e.this.f75570V) && iM77558b > 0 && iM77557a > 0) {
                    C35236e.this.f75571W = iM77558b;
                    C35236e.this.f75570V = iM77557a;
                    if (C35236e.this.f75609z != null) {
                        C35236e.this.f75609z.mo77485a(C35236e.this.f75570V, C35236e.this.f75571W);
                    }
                }
            }
            return true;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (C35236e.this.f75565Q != e.PREPARING) {
                C35236e.this.f75575a.m78141c("onPrepared() is called in a wrong situation, mState = " + C35236e.this.f75565Q);
                return;
            }
            C35236e.this.f75566R = e.PREPARED;
            long duration = C35236e.this.f75551C.getDuration();
            if (duration <= 0) {
                C35236e.this.f75564P = true;
            }
            C35236e.this.f75575a.m78141c("onPrepared() , mStartPositionMs=" + C35236e.this.f75596m + ", duration:" + duration + ", mIsLive:" + C35236e.this.f75598o);
            C35236e.this.m77493A();
            C35236e.this.m77550w();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (C35236e.this.f75551C == null) {
                return;
            }
            C35236e.this.f75575a.m78141c("onSeekComplete().");
            e eVar = C35236e.this.f75565Q;
            e eVar2 = e.STARTED;
            if (eVar == eVar2 && C35236e.this.f75566R == e.COMPLETE) {
                C35236e.this.f75565Q = eVar2;
                C35236e.this.f75566R = eVar2;
                C35236e.this.f75551C.start();
            }
            if (e.PREPARED == C35236e.this.f75565Q || C35236e.this.f75608y == null) {
                return;
            }
            C35236e.this.f75608y.mo77491c();
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i11, int i12) {
            if (i11 == 0 || i12 == 0) {
                C35236e.this.f75575a.m78143e("onVideoSizeChanged() size error, width:" + i11 + " height:" + i12);
                return;
            }
            int iM77557a = m77557a(i11);
            int iM77558b = m77558b(i12);
            try {
                if (iM77557a != C35236e.this.f75570V || iM77558b != C35236e.this.f75571W) {
                    if (iM77558b > 0 && iM77557a > 0) {
                        C35236e.this.f75609z.mo77485a(iM77557a, iM77558b);
                    }
                }
            } catch (Exception e11) {
                C35236e.this.f75575a.m78142d(e11.toString());
            }
            C35236e.this.f75570V = iM77557a;
            C35236e.this.f75571W = iM77558b;
            C35236e.this.f75575a.m78141c("onVideoSizeChanged(), width:" + iM77557a + " height:" + iM77558b);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i11) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$e */
    public enum e {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR,
        RELEASE
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        int f75638a;

        /* JADX INFO: renamed from: b */
        long f75639b;

        /* JADX INFO: renamed from: c */
        long f75640c;

        /* JADX INFO: renamed from: d */
        int f75641d;

        /* JADX INFO: renamed from: e */
        int f75642e;

        /* JADX INFO: renamed from: f */
        int f75643f;

        /* JADX INFO: renamed from: g */
        String f75644g;

        /* JADX INFO: renamed from: h */
        e f75645h;

        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public synchronized void m77496C() {
        synchronized (this.f75559K) {
            try {
                a aVar = this.f75558J;
                if (aVar != null) {
                    aVar.f75619a = true;
                    Future<?> future = aVar.f75620b;
                    if (future != null) {
                        future.cancel(true);
                    }
                    this.f75558J.f75620b = null;
                    this.f75558J = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m77497D() {
        long jMo77473o = mo77473o();
        long j11 = this.f75569U;
        this.f75569U = jMo77473o;
        if (this.f75565Q != e.STARTED) {
            if (this.f75565Q == e.PAUSED && this.f75572X) {
                this.f75575a.m78141c("checkBuffingEvent, pause state and send end buffering");
                this.f75572X = false;
                this.f75573Y = 0;
                C35241c.h hVar = this.f75606w;
                if (hVar != null) {
                    hVar.mo77484a(201, 0L, 0L, null);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f75586c) {
            long j12 = this.f75588e;
            if (j12 > 0 && jMo77473o >= j12 && !this.f75564P) {
                this.f75575a.m78141c("checkBuffingEvent, loopback skip end, curPosition:" + jMo77473o + ", mLoopStartPositionMs:" + this.f75587d);
                this.f75551C.seekTo((int) this.f75587d);
            }
        } else if (this.f75597n > 0 && jMo77473o >= mo77472n() - this.f75597n) {
            this.f75575a.m78141c("checkBuffingEvent, skip end, mBaseDuration: " + this.f75568T + ", curPosition:" + jMo77473o + ", mSkipEndMilsec:" + this.f75597n);
            this.f75565Q = e.COMPLETE;
            m77525e();
            m77496C();
            C35241c.c cVar = this.f75605v;
            if (cVar != null) {
                cVar.mo77490b();
                return;
            }
            return;
        }
        if (jMo77473o != j11) {
            this.f75582ag++;
        }
        if (jMo77473o != j11 || jMo77473o <= 0) {
            if (this.f75572X) {
                this.f75575a.m78141c("checkBuffingEvent, position change, send end buffering");
                C35241c.h hVar2 = this.f75606w;
                if (hVar2 != null) {
                    hVar2.mo77484a(201, jMo77473o, this.f75568T, Long.valueOf(this.f75582ag));
                }
            }
            this.f75572X = false;
            this.f75573Y = 0;
            return;
        }
        int i11 = this.f75573Y + 1;
        this.f75573Y = i11;
        if (i11 >= this.f75560L && !this.f75572X) {
            this.f75572X = true;
            this.f75575a.m78141c("checkBuffingEvent, position no change,send start buffering");
            C35241c.h hVar3 = this.f75606w;
            if (hVar3 != null) {
                hVar3.mo77484a(200, jMo77473o, this.f75568T, Long.valueOf(this.f75582ag));
            }
        }
        if (this.f75573Y >= this.f75561M) {
            this.f75575a.m78143e("checkBuffingEvent post error");
            this.f75565Q = e.ERROR;
            m77525e();
            this.f75572X = false;
            m77496C();
            C35241c.f fVar = this.f75607x;
            if (fVar != null) {
                fVar.mo77483a(2001, m77532g(PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING), 0L, 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public synchronized void m77499F() {
        synchronized (this.f75562N) {
            try {
                Future<?> future = this.f75563O;
                if (future != null) {
                    future.cancel(true);
                    this.f75563O = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private int m77528f(int i11) {
        if (2 == i11) {
            return 2;
        }
        if (1 == i11) {
            return 1;
        }
        return 4 == i11 ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static int m77532g(int i11) {
        long j11 = i11;
        long j12 = i11 < 0 ? 10000000 - j11 : 10000000 + j11;
        if (j12 >= 2147483647L) {
            j12 = 2147483647L;
        }
        return (int) j12;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public TPDynamicStatisticParams mo77462c(boolean z11) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: h */
    public void mo77466h() {
        m77552x();
        this.f75575a.m78141c("prepareAsync ");
        e eVar = e.PREPARING;
        this.f75565Q = eVar;
        this.f75566R = eVar;
        this.f75551C.prepareAsync();
        m77556z();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: j */
    public synchronized void mo77468j() {
        try {
            this.f75575a.m78141c("pause ");
            if (this.f75567S) {
                f fVar = this.f75583ah;
                if (fVar != null) {
                    fVar.f75645h = e.PAUSED;
                }
                this.f75575a.m78142d("system player is busy.");
                return;
            }
            InterfaceC35232a interfaceC35232a = this.f75581af;
            if (interfaceC35232a != null) {
                interfaceC35232a.mo77374c();
            }
            this.f75551C.pause();
            e eVar = e.PAUSED;
            this.f75565Q = eVar;
            this.f75566R = eVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: k */
    public synchronized void mo77469k() {
        this.f75575a.m78141c("stop ");
        m77493A();
        m77496C();
        m77499F();
        this.f75565Q = e.STOPPED;
        m77519c();
        this.f75576aa = 0;
        this.f75577ab = -1;
        this.f75583ah = null;
        this.f75574Z = -1;
        this.f75578ac = -1;
        this.f75581af.mo77375d();
        this.f75582ag = 0L;
        this.f75575a.m78141c("stop over.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: l */
    public synchronized void mo77470l() {
        this.f75575a.m78141c("reset ");
        e eVar = e.IDLE;
        this.f75565Q = eVar;
        this.f75566R = eVar;
        this.f75581af.mo77376e();
        this.f75551C.reset();
        this.f75596m = 0;
        this.f75597n = -1L;
        this.f75598o = false;
        this.f75599p = -1L;
        this.f75600q = -1;
        this.f75601r = -1;
        this.f75602s = null;
        m77493A();
        m77496C();
        m77499F();
        this.f75575a.m78141c("reset over.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: o */
    public long mo77473o() {
        int currentPosition;
        if (this.f75598o) {
            return 0L;
        }
        if (!this.f75567S && this.f75565Q != e.ERROR) {
            if (this.f75565Q != e.IDLE && this.f75565Q != e.INITIALIZED && this.f75565Q != e.PREPARING && this.f75565Q != e.STOPPED && this.f75565Q != e.PREPARED) {
                currentPosition = this.f75551C.getCurrentPosition();
            }
            return currentPosition;
        }
        long j11 = this.f75569U;
        if (j11 != -1) {
            return j11;
        }
        currentPosition = this.f75596m;
        return currentPosition;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: p */
    public long mo77474p() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: q */
    public int mo77475q() {
        this.f75575a.m78141c("getVideoWidth, width:" + this.f75570V);
        return this.f75570V;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: r */
    public int mo77476r() {
        this.f75575a.m78141c("getVideoHeight, height:" + this.f75571W);
        return this.f75571W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public synchronized void m77493A() {
        synchronized (this.f75556H) {
            try {
                Future<?> future = this.f75555G;
                if (future != null) {
                    future.cancel(true);
                    this.f75555G = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private void m77495B() {
        synchronized (this.f75559K) {
            try {
                if (!m77500G()) {
                    this.f75575a.m78141c("startCheckBufferingTimer, forbidden check buffer by position");
                } else if (this.f75558J == null) {
                    final a aVar = new a();
                    this.f75558J = aVar;
                    aVar.f75619a = false;
                    aVar.f75620b = C35435o.m78917a().m78925e().schedule(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.6
                        @Override // java.lang.Runnable
                        public void run() {
                            while (!aVar.f75619a) {
                                C35236e.this.m77497D();
                                try {
                                    Thread.sleep(400L);
                                } catch (InterruptedException e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                    }, 0L, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m77498E() {
        synchronized (this.f75562N) {
            try {
                if (this.f75563O == null) {
                    this.f75563O = C35435o.m78917a().m78925e().schedule(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.7
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C35236e.this.f75565Q == e.PAUSED || !C35236e.this.f75572X) {
                                return;
                            }
                            C35236e.this.f75575a.m78143e("startCheckBufferTimeOutByInfo, buffer last too long");
                            C35236e.this.f75565Q = e.ERROR;
                            C35236e.this.m77525e();
                            C35236e.this.f75572X = false;
                            C35236e.this.m77499F();
                            C35241c.f fVar = C35236e.this.f75607x;
                            if (fVar != null) {
                                fVar.mo77483a(2001, C35236e.m77532g(PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING), 0L, 0L);
                            }
                        }
                    }, this.f75561M * 400, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public boolean m77500G() {
        if (this.f75598o) {
            return false;
        }
        return this.f75603t;
    }

    /* JADX INFO: renamed from: a */
    private MediaPlayer m77502a() {
        C35233b c35233b = new C35233b();
        c35233b.setOnPreparedListener(this.f75552D);
        c35233b.setOnCompletionListener(this.f75552D);
        c35233b.setOnErrorListener(this.f75552D);
        c35233b.setOnInfoListener(this.f75552D);
        c35233b.setOnBufferingUpdateListener(this.f75552D);
        c35233b.setOnSeekCompleteListener(this.f75552D);
        c35233b.setOnVideoSizeChangedListener(this.f75552D);
        c35233b.setOnTimedTextListener(this.f75584ai);
        return c35233b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m77525e() {
        m77554y();
        m77519c();
        m77522d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public synchronized void m77550w() {
        try {
            f fVar = this.f75583ah;
            this.f75575a.m78141c("playerResetEnd, actionInfo:" + fVar + ", mSuspend:" + this.f75567S);
            if (fVar == null || !this.f75567S) {
                if (this.f75596m > 0 && !this.f75564P) {
                    this.f75575a.m78141c("onPrepared(), and seekto:" + this.f75596m);
                    try {
                        this.f75551C.seekTo(this.f75596m);
                    } catch (Exception e11) {
                        this.f75575a.m78137a(e11);
                    }
                }
                this.f75565Q = e.PREPARED;
                C35241c.i iVar = this.f75604u;
                if (iVar != null) {
                    iVar.mo77482a();
                }
                return;
            }
            C35241c.h hVar = this.f75606w;
            int i11 = fVar.f75638a == 1 ? 3 : 4;
            if (hVar != null) {
                hVar.mo77484a(i11, 1000L, 0L, Long.valueOf(fVar.f75639b));
            }
            if (fVar.f75642e > 0) {
                this.f75551C.selectTrack(fVar.f75642e);
            }
            if (fVar.f75643f > 0) {
                this.f75551C.selectTrack(fVar.f75643f);
            }
            if (fVar.f75640c > 0 && !this.f75564P) {
                this.f75575a.m78141c("playerResetEnd, onPrepared(), and seek to:" + fVar.f75640c);
                try {
                    this.f75551C.seekTo((int) fVar.f75640c);
                } catch (Exception e12) {
                    this.f75575a.m78137a(e12);
                }
            }
            this.f75575a.m78141c("playerResetEnd, restore state:" + fVar.f75645h);
            e eVar = fVar.f75645h;
            if (eVar == e.IDLE || eVar == e.INITIALIZED || eVar == e.PREPARING) {
                this.f75565Q = e.PREPARED;
                C35241c.i iVar2 = this.f75604u;
                if (iVar2 != null) {
                    iVar2.mo77482a();
                }
            } else if (eVar == e.PREPARED || eVar == e.PAUSED) {
                this.f75565Q = eVar;
            } else {
                e eVar2 = e.STARTED;
                if (eVar == eVar2) {
                    this.f75575a.m78141c("playerResetEnd,  MediaPlayer.start().");
                    this.f75551C.start();
                    this.f75565Q = fVar.f75645h;
                    this.f75566R = eVar2;
                    m77495B();
                } else {
                    this.f75575a.m78143e("illegal state, state:" + fVar.f75645h);
                    this.f75565Q = e.ERROR;
                    m77525e();
                    C35241c.f fVar2 = this.f75607x;
                    if (fVar2 != null) {
                        fVar2.mo77483a(2000, m77532g(BaseConstants.ERR_SVR_SSO_A2_DOWN_INVALID), 0L, 0L);
                    }
                }
            }
            this.f75567S = false;
            this.f75583ah = null;
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX INFO: renamed from: x */
    private void m77552x() {
        m77508a(this.f75602s);
    }

    /* JADX INFO: renamed from: y */
    private void m77554y() {
        this.f75551C.setOnPreparedListener(null);
        this.f75551C.setOnCompletionListener(null);
        this.f75551C.setOnErrorListener(null);
        this.f75551C.setOnInfoListener(null);
        this.f75551C.setOnBufferingUpdateListener(null);
        this.f75551C.setOnSeekCompleteListener(null);
        this.f75551C.setOnVideoSizeChangedListener(null);
    }

    /* JADX INFO: renamed from: z */
    private void m77556z() {
        this.f75575a.m78141c("startCheckPrepareTimeoutTimer");
        synchronized (this.f75556H) {
            try {
                if (this.f75555G == null) {
                    this.f75555G = C35435o.m78917a().m78925e().schedule(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C35236e.this.f75565Q == e.PREPARING) {
                                C35236e.this.f75575a.m78143e("startCheckPrepareTimeoutTimer, post error");
                                C35236e.this.f75565Q = e.ERROR;
                                C35236e.this.m77525e();
                                C35236e.this.m77493A();
                                C35241c.f fVar = C35236e.this.f75607x;
                                if (fVar != null) {
                                    fVar.mo77483a(2001, C35236e.m77532g(PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING), 0L, 0L);
                                }
                            }
                        }
                    }, this.f75557I, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public long mo77458b(int i11) {
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: g */
    public void mo77465g() throws IOException {
        if (this.f75566R == e.COMPLETE) {
            this.f75575a.m78142d("call prepare() on mMediaPlayerState==COMPLETE");
            return;
        }
        m77552x();
        this.f75575a.m78141c("prepare ");
        e eVar = e.PREPARING;
        this.f75565Q = eVar;
        this.f75566R = eVar;
        this.f75551C.prepare();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: i */
    public void mo77467i() {
        C35351a c35351a;
        String str;
        this.f75575a.m78141c("start ");
        if (this.f75567S) {
            f fVar = this.f75583ah;
            if (fVar != null) {
                fVar.f75645h = e.STARTED;
            }
            c35351a = this.f75575a;
            str = "system player is busy.";
        } else {
            if (this.f75565Q == e.PREPARED || this.f75565Q == e.PAUSED) {
                InterfaceC35232a interfaceC35232a = this.f75581af;
                if (interfaceC35232a != null) {
                    interfaceC35232a.mo77373b();
                }
                this.f75551C.start();
                e eVar = e.STARTED;
                this.f75565Q = eVar;
                this.f75566R = eVar;
                float f11 = this.f75594k;
                if (f11 != 1.0d) {
                    mo77459b(f11);
                }
                m77495B();
                return;
            }
            c35351a = this.f75575a;
            str = "start(), illegal state, state:" + this.f75565Q;
        }
        c35351a.m78142d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: m */
    public synchronized void mo77471m() {
        this.f75575a.m78141c("release ");
        this.f75581af.mo77377f();
        m77493A();
        m77496C();
        m77499F();
        this.f75565Q = e.RELEASE;
        m77525e();
        this.f75604u = null;
        this.f75605v = null;
        this.f75606w = null;
        this.f75607x = null;
        this.f75608y = null;
        this.f75609z = null;
        this.f75549A = null;
        this.f75554F = null;
        this.f75575a.m78141c("release over.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: n */
    public long mo77472n() {
        if (this.f75598o) {
            return 0L;
        }
        if (this.f75567S) {
            return this.f75568T;
        }
        if (this.f75565Q != e.PREPARED && this.f75565Q != e.STARTED && this.f75565Q != e.PAUSED) {
            return -1L;
        }
        if (this.f75568T <= 0) {
            this.f75568T = this.f75551C.getDuration();
        }
        long j11 = this.f75599p;
        if (j11 > 0) {
            long j12 = this.f75568T;
            if (j12 <= 0) {
                this.f75568T = j11;
            } else {
                long jAbs = Math.abs(j11 - j12) * 100;
                long j13 = this.f75599p;
                if (jAbs / j13 > 1) {
                    this.f75568T = j13;
                }
            }
        }
        return this.f75568T;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: s */
    public TPTrackInfo[] mo77477s() {
        MediaPlayer.TrackInfo[] trackInfo;
        if ((this.f75565Q == e.PREPARED || this.f75565Q == e.STARTED || this.f75565Q == e.PAUSED) && TPSystemInfo.SDK_INT > 16) {
            try {
                trackInfo = this.f75551C.getTrackInfo();
            } catch (Exception unused) {
                this.f75575a.m78143e("getTrackInfo, android getTrackInfo crash");
                trackInfo = null;
            }
        } else {
            trackInfo = null;
        }
        int i11 = 0;
        if (trackInfo == null && this.f75579ad.isEmpty() && this.f75580ae.isEmpty()) {
            return new TPTrackInfo[0];
        }
        TPTrackInfo[] tPTrackInfoArr = new TPTrackInfo[this.f75579ad.size() + this.f75580ae.size() + (trackInfo == null ? 0 : trackInfo.length)];
        Iterator<b> it = this.f75579ad.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            tPTrackInfoArr[i12] = it.next().f75621a;
            i12++;
        }
        Iterator<b> it2 = this.f75580ae.iterator();
        while (it2.hasNext()) {
            tPTrackInfoArr[i12] = it2.next().f75621a;
            i12++;
        }
        if (trackInfo != null && trackInfo.length > 0) {
            int length = trackInfo.length;
            while (i11 < length) {
                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i11];
                TPTrackInfo tPTrackInfo = new TPTrackInfo();
                tPTrackInfo.name = trackInfo2.getLanguage();
                tPTrackInfo.trackType = m77528f(trackInfo2.getTrackType());
                this.f75575a.m78141c("getTrackInfo index:" + i12 + ", type:" + tPTrackInfo.trackType + ", isselcted:" + tPTrackInfo.isSelected + ", name:" + tPTrackInfo.name);
                tPTrackInfoArr[i12] = tPTrackInfo;
                i11++;
                i12++;
            }
        }
        return tPTrackInfoArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: t */
    public TPProgramInfo[] mo77478t() {
        return new TPProgramInfo[0];
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: u */
    public long[] mo77479u() {
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: v */
    public TPGeneralPlayFlowParams mo77480v() {
        return null;
    }

    public C35236e(Context context, C35352b c35352b) {
        this.f75575a = new C35351a(c35352b, "TPSystemMediaPlayer");
        this.f75585b = context;
        this.f75552D = new d();
        b bVar = new b();
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        bVar.f75621a = tPTrackInfo;
        tPTrackInfo.isSelected = true;
        tPTrackInfo.name = "audio_1";
        this.f75579ad.add(bVar);
        m77514b();
        C35234c c35234c = new C35234c();
        this.f75581af = c35234c;
        c35234c.mo77367a(new InterfaceC35232a.a() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.1
            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.a
            /* JADX INFO: renamed from: a */
            public void mo77378a(InterfaceC35232a.e eVar) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = eVar.f75512a;
                C35241c.l lVar = C35236e.this.f75549A;
                if (lVar != null) {
                    lVar.mo77487a(tPSubtitleData);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.a
            /* JADX INFO: renamed from: a */
            public void mo77379a(TPSubtitleFrame tPSubtitleFrame) {
                TPSubtitleFrameBuffer tPSubtitleFrameBufferM77616a = C35240c.m77616a(tPSubtitleFrame);
                C35241c.m mVar = C35236e.this.f75550B;
                if (mVar != null) {
                    mVar.mo77636a(tPSubtitleFrameBufferM77616a);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.a
            /* JADX INFO: renamed from: a */
            public void mo77380a(String str) {
                C35236e.this.f75575a.m78141c("onSubtitleNote, ".concat(String.valueOf(str)));
                C35241c.h hVar = C35236e.this.f75606w;
                if (hVar != null) {
                    hVar.mo77484a(506, 0L, 0L, str);
                }
            }
        });
        this.f75581af.mo77370a(new InterfaceC35232a.d() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.2
            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.d
            /* JADX INFO: renamed from: a */
            public long mo77384a() {
                if (C35236e.this.f75565Q == e.PAUSED || C35236e.this.f75565Q == e.STARTED) {
                    return C35236e.this.mo77473o();
                }
                return -1L;
            }
        });
        this.f75581af.mo77369a(new InterfaceC35232a.c() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.3
            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.c
            /* JADX INFO: renamed from: a */
            public void mo77382a(int i11, long j11) {
                if (C35236e.this.f75606w != null) {
                    C35236e.this.f75606w.mo77484a(4, 2000L, C35236e.m77532g(i11), Long.valueOf(j11));
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.c
            /* JADX INFO: renamed from: a */
            public void mo77383a(long j11) {
                if (C35236e.this.f75565Q == e.STARTED) {
                    C35236e.this.f75581af.mo77373b();
                }
                if (C35236e.this.f75606w != null) {
                    C35236e.this.f75606w.mo77484a(4, 1000L, 0L, Long.valueOf(j11));
                }
            }
        });
        this.f75581af.mo77368a(new InterfaceC35232a.b() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.4
            @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a.b
            /* JADX INFO: renamed from: a */
            public void mo77381a(int i11, int i12) {
                if (C35236e.this.f75606w != null) {
                    C35236e.this.f75606w.mo77484a(254, i11, i12, null);
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private void m77522d() {
        if (m77516b(this.f75566R)) {
            this.f75566R = e.RELEASE;
            this.f75575a.m78141c("MediaPlayer release.");
            this.f75551C.release();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m77526e(int i11) {
        if (i11 <= 0) {
            return;
        }
        b bVar = this.f75579ad.get(i11);
        C35241c.h hVar = this.f75606w;
        if (hVar != null) {
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new TPPlayerMsg.TPAudioTrackInfo();
            tPAudioTrackInfo.audioTrackUrl = bVar.f75622b;
            tPAudioTrackInfo.paramData = bVar.f75623c;
            this.f75575a.m78141c("handleDataSource, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            hVar.mo77484a(1011, 0L, 0L, tPAudioTrackInfo);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private void m77530f() {
        MediaPlayer mediaPlayer;
        float f11;
        float f12;
        m77493A();
        m77496C();
        m77499F();
        m77525e();
        this.f75551C = new C35233b();
        this.f75551C.setOnPreparedListener(this.f75552D);
        this.f75551C.setOnCompletionListener(this.f75552D);
        this.f75551C.setOnErrorListener(this.f75552D);
        this.f75551C.setOnInfoListener(this.f75552D);
        this.f75551C.setOnBufferingUpdateListener(this.f75552D);
        this.f75551C.setOnSeekCompleteListener(this.f75552D);
        this.f75551C.setOnVideoSizeChangedListener(this.f75552D);
        this.f75551C.setOnTimedTextListener(this.f75584ai);
        if (!this.f75592i) {
            if (this.f75593j != 1.0f) {
                mediaPlayer = this.f75551C;
                f11 = this.f75593j;
            }
            f12 = this.f75594k;
            if (f12 != 1.0d) {
                mo77459b(f12);
            }
            if (this.f75586c) {
                this.f75551C.setLooping(this.f75586c);
            }
        }
        mediaPlayer = this.f75551C;
        f11 = 0.0f;
        mediaPlayer.setVolume(f11, f11);
        f12 = this.f75594k;
        if (f12 != 1.0d) {
            mo77459b(f12);
        }
        if (this.f75586c) {
            this.f75551C.setLooping(this.f75586c);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public String mo77463c(int i11) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m77519c() {
        if (m77509a(this.f75566R)) {
            this.f75566R = e.STOPPED;
            this.f75575a.m78141c("MediaPlayer stop.");
            this.f75551C.stop();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m77523d(int i11, long j11) {
        f fVar = new f();
        fVar.f75639b = j11;
        fVar.f75641d = i11;
        fVar.f75638a = 2;
        fVar.f75644g = this.f75589f;
        m77507a(fVar);
    }

    /* JADX INFO: renamed from: e */
    private void m77527e(int i11, long j11) {
        this.f75581af.mo77376e();
        b bVar = this.f75580ae.get(i11);
        this.f75581af.mo77372a(bVar.f75622b, bVar.f75624d, j11);
        this.f75581af.mo77365a();
    }

    /* JADX INFO: renamed from: f */
    private void m77531f(int i11, long j11) {
        this.f75575a.m78141c("deselectSubTrack, trackIndex:" + i11 + ", opaque:" + j11);
        this.f75581af.mo77376e();
    }

    /* JADX INFO: renamed from: b */
    private void m77514b() {
        this.f75551C = m77502a();
        e eVar = e.IDLE;
        this.f75565Q = eVar;
        this.f75566R = eVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77422a(float f11) {
        this.f75575a.m78141c("setAudioGainRatio, : ".concat(String.valueOf(f11)));
        this.f75593j = f11;
        try {
            if (this.f75551C != null) {
                MediaPlayer mediaPlayer = this.f75551C;
                float f12 = this.f75593j;
                mediaPlayer.setVolume(f12, f12);
            }
        } catch (IllegalStateException e11) {
            this.f75575a.m78141c("setAudioGainRatio ex : " + e11.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public void mo77464c(int i11, long j11) {
        this.f75575a.m78143e("selectProgram, android mediaplayer not support");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77423a(int i11) {
        this.f75575a.m78141c("seekTo, position: ".concat(String.valueOf(i11)));
        if (this.f75564P) {
            this.f75575a.m78141c("current media is not seekable, ignore");
            return;
        }
        if (!this.f75567S) {
            if (this.f75566R == e.COMPLETE) {
                this.f75565Q = e.STARTED;
            }
            this.f75551C.seekTo(i11);
        } else {
            f fVar = this.f75583ah;
            if (fVar != null) {
                fVar.f75640c = i11;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77459b(float f11) {
        this.f75575a.m78141c("setPlaySpeedRatio, : ".concat(String.valueOf(f11)));
        this.f75594k = f11;
        this.f75575a.m78141c("setPlaySpeedRatio play speed:".concat(String.valueOf(f11)));
        try {
            PlaybackParams playbackParams = this.f75551C.getPlaybackParams();
            if (playbackParams.getSpeed() != f11) {
                playbackParams.setSpeed(f11);
                this.f75551C.setPlaybackParams(playbackParams);
            }
        } catch (Exception e11) {
            this.f75575a.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77424a(int i11, @TPCommonEnum.TPSeekMode int i12) {
        this.f75575a.m78141c("seekTo, position: " + i11 + ", mode: " + i12);
        if (this.f75564P) {
            this.f75575a.m78141c("current media is not seekable, ignore");
            return;
        }
        if (!this.f75567S) {
            m77506a(this.f75551C, i11, i12);
            return;
        }
        f fVar = this.f75583ah;
        if (fVar != null) {
            fVar.f75640c = i11;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77460b(int i11, long j11) {
        this.f75575a.m78141c("deselectTrack, trackID ".concat(String.valueOf(i11)));
        int size = this.f75579ad.size();
        int size2 = this.f75580ae.size();
        if (i11 < size || i11 >= size2 + size) {
            this.f75551C.deselectTrack(i11);
            return;
        }
        int i12 = i11 - size;
        try {
            m77531f(i12, j11);
        } catch (Exception e11) {
            this.f75575a.m78137a(e11);
        }
        this.f75580ae.get(i12).f75621a.isSelected = false;
        this.f75577ab = -1;
    }

    /* JADX INFO: renamed from: b */
    private void m77515b(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this.f75551C.setDataSource(assetFileDescriptor);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77425a(int i11, long j11) {
        MediaPlayer.TrackInfo[] trackInfo;
        int i12;
        int iM77532g;
        Long lValueOf;
        int i13;
        long j12;
        long j13;
        int i14;
        this.f75575a.m78141c("selectTrack, trackID:" + i11 + ", opaque:" + j11);
        int size = this.f75579ad.size();
        int size2 = this.f75580ae.size();
        this.f75579ad.size();
        C35241c.h hVar = this.f75606w;
        if (i11 >= 0 && i11 < size) {
            try {
                m77523d(i11, j11);
                this.f75579ad.get(this.f75576aa).f75621a.isSelected = false;
                this.f75579ad.get(i11).f75621a.isSelected = true;
                this.f75576aa = i11;
                return;
            } catch (Exception e11) {
                this.f75575a.m78137a(e11);
                if (hVar == null) {
                    return;
                } else {
                    iM77532g = m77532g(BaseConstants.ERR_SVR_SSO_VCODE);
                }
            }
        } else if (i11 < size || i11 >= size + size2) {
            int i15 = i11 - (size + size2);
            if (this.f75565Q == e.PREPARED || this.f75565Q == e.STARTED || this.f75565Q == e.PAUSED) {
                try {
                    trackInfo = this.f75551C.getTrackInfo();
                } catch (Exception unused) {
                    this.f75575a.m78143e("getTrackInfo, android getTrackInfo crash");
                    trackInfo = null;
                }
                if (trackInfo != null && trackInfo.length > i15) {
                    MediaPlayer.TrackInfo trackInfo2 = trackInfo[i15];
                    if (trackInfo2.getTrackType() == 2) {
                        this.f75578ac = i15;
                    } else if (trackInfo2.getTrackType() == 4) {
                        this.f75574Z = i15;
                    } else if (hVar == null) {
                        return;
                    } else {
                        i12 = BaseConstants.ERR_SVR_SSO_A2_UP_INVALID;
                    }
                    this.f75551C.selectTrack(i15);
                    if (hVar != null) {
                        lValueOf = Long.valueOf(j11);
                        i13 = 4;
                        j12 = 1000;
                        j13 = 0;
                        hVar.mo77484a(i13, j12, j13, lValueOf);
                    }
                    return;
                }
                if (hVar == null) {
                    return;
                } else {
                    i12 = -10002;
                }
                iM77532g = m77532g(i12);
            } else {
                this.f75575a.m78143e("selectTrack, illegal state:" + this.f75565Q);
                return;
            }
        } else {
            int i16 = i11 - size;
            try {
                m77527e(i16, j11);
            } catch (Exception e12) {
                this.f75575a.m78137a(e12);
                if (hVar != null) {
                    hVar.mo77484a(4, 2000L, m77532g(BaseConstants.ERR_SVR_SSO_VCODE), Long.valueOf(j11));
                }
                i14 = this.f75577ab;
                if (i14 >= 0) {
                    this.f75580ae.get(i14).f75621a.isSelected = false;
                }
                this.f75580ae.get(i16).f75621a.isSelected = true;
                this.f75577ab = i11;
                return;
            }
            i14 = this.f75577ab;
            if (i14 >= 0 && i14 < size2) {
                this.f75580ae.get(i14).f75621a.isSelected = false;
            }
            this.f75580ae.get(i16).f75621a.isSelected = true;
            this.f75577ab = i11;
            return;
        }
        j13 = iM77532g;
        lValueOf = Long.valueOf(j11);
        i13 = 4;
        j12 = 2000;
        hVar.mo77484a(i13, j12, j13, lValueOf);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77426a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor == null) {
            this.f75575a.m78141c("setDataSource afd is null ");
            throw new IllegalArgumentException("afd is null");
        }
        this.f75575a.m78141c("setDataSource afd， afd: " + assetFileDescriptor.toString());
        this.f75591h = assetFileDescriptor;
        m77515b(assetFileDescriptor);
        this.f75553E = new C35228c(assetFileDescriptor);
        e eVar = e.INITIALIZED;
        this.f75565Q = eVar;
        this.f75566R = eVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77461b(boolean z11) {
        this.f75575a.m78141c("setLoopback, : ".concat(String.valueOf(z11)));
        this.f75586c = z11;
        this.f75551C.setLooping(z11);
    }

    /* JADX INFO: renamed from: a */
    private void m77505a(MediaPlayer mediaPlayer) {
        try {
            Field declaredField = MediaPlayer.class.getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get(mediaPlayer);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            if (((Handler.Callback) declaredField2.get(handler)) == null) {
                declaredField2.set(handler, new c(handler));
            }
        } catch (Exception e11) {
            this.f75575a.m78143e("mediaPlayerExceptionHook, " + Log.getStackTraceString(e11));
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m77516b(e eVar) {
        return eVar != e.RELEASE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX INFO: renamed from: a */
    private void m77506a(MediaPlayer mediaPlayer, int i11, @TPCommonEnum.TPSeekMode int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 26) {
            this.f75575a.m78141c("os ver is too low, current sdk int:" + i13 + ", is less than 26, use seekTo(int positionMs) instead");
            mediaPlayer.seekTo(i11);
            return;
        }
        int i14 = 1;
        if (i12 == 1) {
            i14 = 0;
        } else if (i12 != 2) {
            if (i12 == 3) {
                i14 = 2;
            } else {
                i14 = 0;
            }
        }
        try {
            mediaPlayer.seekTo(i11, i14);
        } catch (Exception e11) {
            this.f75575a.m78137a(e11);
            try {
                if (this.f75566R == e.COMPLETE) {
                    this.f75565Q = e.STARTED;
                }
                mediaPlayer.seekTo(i11);
            } catch (Exception e12) {
                this.f75575a.m78137a(e12);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77427a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor == null) {
            this.f75575a.m78141c("setDataSource pfd is null ");
            throw new IllegalArgumentException("pfd is null");
        }
        this.f75575a.m78141c("setDataSource pfd， pfd: " + parcelFileDescriptor.toString());
        this.f75590g = parcelFileDescriptor.getFileDescriptor();
        this.f75551C.setDataSource(parcelFileDescriptor.getFileDescriptor());
        this.f75553E = new C35228c(parcelFileDescriptor.getFileDescriptor());
        e eVar = e.INITIALIZED;
        this.f75565Q = eVar;
        this.f75566R = eVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77428a(Surface surface) {
        this.f75575a.m78141c("setSurface, surface: ".concat(String.valueOf(surface)));
        this.f75554F = surface;
        this.f75551C.setSurface(surface);
        this.f75575a.m78141c("setSurface over, surface: ".concat(String.valueOf(surface)));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77429a(SurfaceHolder surfaceHolder) {
        this.f75575a.m78141c("setSurfaceHolder, sh: ".concat(String.valueOf(surfaceHolder)));
        this.f75554F = surfaceHolder;
        this.f75551C.setDisplay(surfaceHolder);
        this.f75575a.m78141c("setSurfaceHolder over, sh: ".concat(String.valueOf(surfaceHolder)));
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m77507a(f fVar) {
        int i11;
        try {
            String str = fVar.f75644g;
            fVar.f75640c = mo77473o();
            fVar.f75645h = this.f75565Q;
            fVar.f75642e = this.f75578ac;
            fVar.f75643f = this.f75574Z;
            this.f75575a.m78141c("playerResetStart, pos:" + fVar.f75640c + ", state:" + fVar.f75645h);
            this.f75567S = true;
            m77530f();
            this.f75566R = e.IDLE;
            if (this.f75590g != null) {
                this.f75551C.setDataSource(this.f75590g);
            } else {
                AssetFileDescriptor assetFileDescriptor = this.f75591h;
                if (assetFileDescriptor != null) {
                    m77515b(assetFileDescriptor);
                } else {
                    m77526e(fVar.f75641d);
                    Map<String, String> map = this.f75595l;
                    if (map == null || map.isEmpty()) {
                        this.f75551C.setDataSource(str);
                    } else {
                        this.f75551C.setDataSource(this.f75585b, Uri.parse(str), this.f75595l);
                    }
                }
            }
            this.f75566R = e.INITIALIZED;
            Object obj = this.f75554F;
            if (obj == null) {
                this.f75551C.setDisplay(null);
            } else if (obj instanceof SurfaceHolder) {
                this.f75551C.setDisplay((SurfaceHolder) this.f75554F);
            } else if (obj instanceof Surface) {
                this.f75551C.setSurface((Surface) this.f75554F);
            }
            f fVar2 = this.f75583ah;
            if (fVar2 != null && (i11 = fVar2.f75638a) != fVar.f75638a) {
                C35241c.h hVar = this.f75606w;
                int i12 = i11 == 1 ? 3 : 4;
                if (hVar != null) {
                    hVar.mo77484a(i12, fVar2.f75639b, 0L, null);
                }
                fVar.f75645h = fVar2.f75645h;
                fVar.f75640c = fVar2.f75640c;
            }
            this.f75583ah = fVar;
            e eVar = fVar.f75645h;
            if (eVar == e.PREPARING || eVar == e.PREPARED || eVar == e.STARTED || eVar == e.PAUSED) {
                mo77466h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77430a(C35241c.a aVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77431a(C35241c.b bVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77432a(C35241c.c cVar) {
        this.f75605v = cVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77433a(C35241c.d dVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77434a(C35241c.e eVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77435a(C35241c.f fVar) {
        this.f75607x = fVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77436a(C35241c.g gVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77437a(C35241c.h hVar) {
        this.f75606w = hVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77438a(C35241c.i iVar) {
        this.f75604u = iVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77439a(C35241c.j jVar) {
        this.f75608y = jVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77440a(C35241c.l lVar) {
        this.f75549A = lVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77441a(C35241c.m mVar) {
        this.f75550B = mVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77442a(C35241c.n nVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77443a(C35241c.o oVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77444a(C35241c.p pVar) {
        this.f75609z = pVar;
    }

    /* JADX INFO: renamed from: a */
    private void m77508a(TPAudioAttributes tPAudioAttributes) {
        if (tPAudioAttributes == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f75551C.setAudioAttributes(this.f75602s.toAndroidMediaAudioAttributes());
        this.f75575a.m78141c("set audio attributes into MediaPlayer, API:" + i11 + ">=21, " + this.f75602s.toString());
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77445a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        if (this.f75553E == null) {
            tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.UNMATCHED_STATE);
            return;
        }
        TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
        tPImageGeneratorParams.width = tPCaptureParams.width;
        tPImageGeneratorParams.height = tPCaptureParams.height;
        tPImageGeneratorParams.format = tPCaptureParams.format;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
        this.f75553E.mo77350a(mo77473o(), tPImageGeneratorParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77446a(TPOptionalParam tPOptionalParam) {
        int key = tPOptionalParam.getKey();
        if (key == 1) {
            this.f75599p = tPOptionalParam.getParamLong().value;
            return;
        }
        if (key == 2) {
            this.f75601r = (int) tPOptionalParam.getParamLong().value;
            this.f75575a.m78141c("setPlayerOptionalParam, video width:" + this.f75601r);
            return;
        }
        if (key == 3) {
            this.f75600q = (int) tPOptionalParam.getParamLong().value;
            this.f75575a.m78141c("setPlayerOptionalParam, video height:" + this.f75600q);
            return;
        }
        if (key == 4) {
            this.f75598o = tPOptionalParam.getParamBoolean().value;
            this.f75564P = true;
            this.f75575a.m78141c("setPlayerOptionalParam, is live:" + this.f75598o);
            return;
        }
        if (key == 5) {
            this.f75603t = tPOptionalParam.getParamBoolean().value;
            return;
        }
        if (key == 7) {
            this.f75560L = (int) (tPOptionalParam.getParamLong().value / 400);
            this.f75575a.m78141c("setPlayerOptionalParam, on buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
            return;
        }
        if (key == 100) {
            this.f75596m = (int) tPOptionalParam.getParamLong().value;
            this.f75575a.m78141c("setPlayerOptionalParam, start position:" + this.f75596m);
            return;
        }
        if (key == 107) {
            this.f75561M = (int) ((tPOptionalParam.getParamLong().value + 400) / 400);
            this.f75575a.m78141c("setPlayerOptionalParam, buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
            return;
        }
        if (key == 128) {
            this.f75557I = tPOptionalParam.getParamLong().value;
            this.f75575a.m78141c("setPlayerOptionalParam, prepare timeout:" + this.f75557I + "(ms)");
            return;
        }
        if (key == 414) {
            this.f75602s = (TPAudioAttributes) tPOptionalParam.getParamObject().objectValue;
            this.f75575a.m78141c("setPlayerOptionalParam, " + this.f75602s.toString());
            return;
        }
        if (key == 450) {
            int i11 = (int) tPOptionalParam.getParamLong().value;
            InterfaceC35232a interfaceC35232a = this.f75581af;
            if (interfaceC35232a != null) {
                interfaceC35232a.mo77366a(i11);
            }
            TPLogUtil.m78800i("TPSystemMediaPlayer", "setPlayerOptionalParam, subtitle type:" + tPOptionalParam.getParamLong().value);
            return;
        }
        if (key == 500) {
            this.f75597n = tPOptionalParam.getParamLong().value;
            this.f75575a.m78141c("setPlayerOptionalParam, skip end position:" + this.f75597n);
            return;
        }
        if (key != 507) {
            return;
        }
        TPSubtitleRenderModel tPSubtitleRenderModel = (TPSubtitleRenderModel) tPOptionalParam.getParamObject().objectValue;
        InterfaceC35232a interfaceC35232a2 = this.f75581af;
        if (interfaceC35232a2 != null) {
            interfaceC35232a2.mo77371a(tPSubtitleRenderModel);
        }
        TPLogUtil.m78800i("TPSystemMediaPlayer", "setPlayerOptionalParam, subtitle render model");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77447a(ITPMediaAsset iTPMediaAsset) {
        throw new IllegalArgumentException("setDataSource by asset, android mediaplayer not support");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77448a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77449a(C35352b c35352b) {
        this.f75575a.m78136a(new C35352b(c35352b, "TPSystemMediaPlayer"));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77450a(String str) {
        this.f75575a.m78141c("setAudioNormalizeVolumeParams not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77451a(String str, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        this.f75575a.m78141c("switchDefinition, defUrl: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            this.f75575a.m78141c("switchDefinition, defUrl is null");
            return;
        }
        this.f75589f = str;
        f fVar = new f();
        fVar.f75639b = j11;
        fVar.f75641d = this.f75576aa;
        fVar.f75638a = 1;
        fVar.f75644g = str;
        try {
            m77507a(fVar);
        } catch (Exception unused) {
            throw new IllegalStateException("playerResetStart");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77452a(String str, Map<String, String> map) throws IOException {
        this.f75575a.m78141c("setDataSource httpHeader, url: ".concat(String.valueOf(str)));
        this.f75589f = str;
        this.f75595l = map;
        this.f75551C.setDataSource(this.f75585b, Uri.parse(str), this.f75595l);
        this.f75553E = new C35228c(str);
        e eVar = e.INITIALIZED;
        this.f75565Q = eVar;
        this.f75566R = eVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77453a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        this.f75575a.m78141c("switchDefinition, defUrl: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            this.f75575a.m78141c("switchDefinition, defUrl is null");
            return;
        }
        this.f75589f = str;
        f fVar = new f();
        fVar.f75639b = j11;
        fVar.f75641d = this.f75576aa;
        fVar.f75638a = 1;
        fVar.f75644g = str;
        try {
            m77507a(fVar);
        } catch (Exception unused) {
            throw new IllegalStateException("playerResetStart");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77454a(String str, Map<String, String> map, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            this.f75575a.m78143e("addSubtitleSource, illegal argument.");
            return;
        }
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = str3;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.trackType = 3;
        b bVar = new b();
        bVar.f75621a = tPTrackInfo;
        bVar.f75622b = str;
        bVar.f75624d = map;
        this.f75575a.m78141c("addSubtitleSource, name:" + tPTrackInfo.name + ", url:" + str3);
        this.f75580ae.add(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77455a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f75575a.m78143e("addAudioTrackSource, illegal argument.");
            return;
        }
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = str2;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.trackType = 2;
        b bVar = new b();
        bVar.f75621a = tPTrackInfo;
        bVar.f75622b = str;
        bVar.f75624d = map;
        bVar.f75623c = list;
        this.f75575a.m78141c("addAudioTrackSource, name:" + tPTrackInfo.name + ", url:" + str2);
        this.f75579ad.add(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77456a(boolean z11) {
        C35351a c35351a;
        String str;
        this.f75575a.m78141c("setOutputMute, : ".concat(String.valueOf(z11)));
        this.f75592i = z11;
        try {
            if (z11) {
                this.f75551C.setVolume(0.0f, 0.0f);
                c35351a = this.f75575a;
                str = "setOutputMute, true";
            } else {
                MediaPlayer mediaPlayer = this.f75551C;
                float f11 = this.f75593j;
                mediaPlayer.setVolume(f11, f11);
                c35351a = this.f75575a;
                str = "setOutputMute, false, mAudioGain: " + this.f75593j;
            }
            c35351a.m78141c(str);
        } catch (Exception e11) {
            this.f75575a.m78141c("setOutputMute, Exception: " + e11.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77457a(boolean z11, long j11, long j12) {
        this.f75575a.m78141c("setLoopback, : " + z11 + ", loopStart: " + j11 + ", loopEnd: " + j12);
        if (j11 >= 0) {
            long j13 = this.f75568T;
            if (j11 <= j13 && j12 <= j13) {
                this.f75586c = z11;
                this.f75587d = j11;
                this.f75588e = j12;
                this.f75551C.setLooping(z11);
                return;
            }
        }
        throw new IllegalArgumentException("position error, must more than 0 and less than duration");
    }

    /* JADX INFO: renamed from: a */
    private boolean m77509a(e eVar) {
        return eVar == e.PREPARED || eVar == e.STARTED || eVar == e.PAUSED;
    }
}
