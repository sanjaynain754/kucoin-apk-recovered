package com.tencent.thumbplayer.tcmedia.p164g.p166b;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.imsdk.BaseConstants;
import com.tencent.thumbplayer.tcmedia.p164g.C35357a;
import com.tencent.thumbplayer.tcmedia.p164g.p165a.InterfaceC35358a;
import com.tencent.thumbplayer.tcmedia.p164g.p169e.p170a.C35374a;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35376a;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35381c;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35382d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.f */
/* JADX INFO: loaded from: classes64.dex */
public abstract class AbstractC35366f implements InterfaceC35363c {

    /* JADX INFO: renamed from: i */
    private static final Map<Surface, AbstractC35366f> f76091i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: A */
    private int f76092A;

    /* JADX INFO: renamed from: B */
    private C35374a f76093B;

    /* JADX INFO: renamed from: a */
    public b f76094a = b.Started;

    /* JADX INFO: renamed from: b */
    public boolean f76095b;

    /* JADX INFO: renamed from: c */
    public boolean f76096c;

    /* JADX INFO: renamed from: d */
    public boolean f76097d;

    /* JADX INFO: renamed from: e */
    public final C35365e f76098e;

    /* JADX INFO: renamed from: f */
    protected Surface f76099f;

    /* JADX INFO: renamed from: g */
    protected final C35362b f76100g;

    /* JADX INFO: renamed from: h */
    protected final String f76101h;

    /* JADX INFO: renamed from: j */
    private final String f76102j;

    /* JADX INFO: renamed from: k */
    private final C35376a.a f76103k;

    /* JADX INFO: renamed from: l */
    private final HashSet<Integer> f76104l;

    /* JADX INFO: renamed from: m */
    private final ArrayList<Long> f76105m;

    /* JADX INFO: renamed from: n */
    private final Set<SurfaceTexture> f76106n;

    /* JADX INFO: renamed from: o */
    private final int[] f76107o;

    /* JADX INFO: renamed from: p */
    private final MediaCodec f76108p;

    /* JADX INFO: renamed from: q */
    private boolean f76109q;

    /* JADX INFO: renamed from: r */
    private a f76110r;

    /* JADX INFO: renamed from: s */
    private MediaCodecInfo.CodecCapabilities f76111s;

    /* JADX INFO: renamed from: t */
    private long f76112t;

    /* JADX INFO: renamed from: u */
    private InterfaceC35358a f76113u;

    /* JADX INFO: renamed from: v */
    private boolean f76114v;

    /* JADX INFO: renamed from: w */
    private C35376a.b f76115w;

    /* JADX INFO: renamed from: x */
    private boolean f76116x;

    /* JADX INFO: renamed from: y */
    private boolean f76117y;

    /* JADX INFO: renamed from: z */
    private boolean f76118z;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.f$a */
    public enum a {
        Uninitialized,
        Configured,
        Error,
        Flushed,
        Running,
        EndOfStream,
        Released
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.f$b */
    public enum b {
        Started,
        DequeueIn,
        QueueIn,
        DequeueOut,
        ReleaseOut
    }

    /* JADX INFO: renamed from: d */
    private int m78275d(Surface surface) {
        if (surface == null) {
            return BaseConstants.ERR_SVR_GROUP_API_NAME_ERROR;
        }
        if (surface.isValid()) {
            return 0;
        }
        return BaseConstants.ERR_SVR_GROUP_INVALID_PARAMETERS;
    }

    /* JADX INFO: renamed from: q */
    private void m78279q() {
        this.f76118z = false;
        this.f76092A = 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public int mo78238a(long j11) {
        if (m78276n()) {
            C35380b.m78337d(this.f76102j, "ignore call method dequeueInputBuffer for isNotMyThread");
            return -1;
        }
        int i11 = 0;
        String str = null;
        try {
            int iDequeueInputBuffer = this.f76108p.dequeueInputBuffer(j11);
            if (C35380b.m78332a()) {
                str = this + ", dequeueInputBuffer state:" + this.f76110r + " decodeState:" + this.f76094a + " , result=" + iDequeueInputBuffer;
                C35380b.m78329a(this.f76102j, str);
            }
            this.f76094a = b.DequeueIn;
            this.f76110r = a.Running;
            m78263a(0, iDequeueInputBuffer);
            return iDequeueInputBuffer;
        } catch (Throwable th2) {
            if (th2 instanceof IllegalStateException) {
                i11 = 40000;
            } else if (th2 instanceof IllegalArgumentException) {
                i11 = 40001;
            }
            m78264a(i11, str, th2);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract C35376a.b mo78237a(C35365e c35365e);

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: b */
    public C35376a.b mo78246b(C35365e c35365e) {
        C35376a.b bVarMo78237a = mo78237a(c35365e);
        this.f76115w = bVarMo78237a;
        return bVarMo78237a;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.f$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f76120a;

        static {
            int[] iArr = new int[C35376a.b.values().length];
            f76120a = iArr;
            try {
                iArr[C35376a.b.KEEP_CODEC_RESULT_NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76120a[C35376a.b.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76120a[C35376a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f76120a[C35376a.b.KEEP_CODEC_RESULT_YES_WITH_FLUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m78277o() {
        if (this.f76093B != null) {
            return;
        }
        C35374a c35374a = new C35374a(1, 1);
        this.f76093B = c35374a;
        m78266a(c35374a.m78309d(), true, true);
    }

    /* JADX INFO: renamed from: r */
    private void m78280r() {
        int[] iArr = this.f76107o;
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public int mo78239a(MediaCodec.BufferInfo bufferInfo, long j11) {
        int i11;
        if (m78276n()) {
            C35380b.m78337d(this.f76102j, "ignore call method dequeueOutputBuffer for isNotMyThread");
            return -1;
        }
        String str = null;
        try {
            int iDequeueOutputBuffer = this.f76108p.dequeueOutputBuffer(bufferInfo, j11);
            if (C35380b.m78332a()) {
                str = this + ", dequeueOutputBuffer outIndex:" + iDequeueOutputBuffer;
                if (this instanceof C35367g) {
                    C35380b.m78329a(this.f76102j, str);
                }
            }
            this.f76104l.add(Integer.valueOf(iDequeueOutputBuffer));
            this.f76094a = b.DequeueOut;
            m78263a(1, iDequeueOutputBuffer);
            return iDequeueOutputBuffer;
        } catch (Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                i11 = 60001;
            } else {
                i11 = th2 instanceof IllegalStateException ? 60000 : 0;
            }
            m78264a(i11, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: c */
    public void mo78248c() {
        m78279q();
        if (C35357a.m78192c()) {
            if (this.f76110r == a.Running) {
                try {
                    mo78250e();
                } catch (IllegalStateException e11) {
                    C35380b.m78335b(this.f76102j, "flush failed in prepareToReUse", e11);
                }
            }
        } else if (this.f76110r != a.Flushed) {
            mo78250e();
        }
        this.f76114v = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: d */
    public void mo78249d() {
        int i11;
        a aVar = this.f76110r;
        a aVar2 = a.Configured;
        if (aVar != aVar2) {
            C35380b.m78334b(this.f76102j, "start ignore:" + this.f76110r);
            return;
        }
        String str = null;
        try {
            if (C35380b.m78332a()) {
                str = this + ", start state:" + this.f76110r;
                C35380b.m78334b(this.f76102j, str);
            }
            if (this.f76110r == aVar2) {
                this.f76108p.start();
                this.f76110r = a.Running;
            }
        } catch (Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                i11 = BaseConstants.ERR_SVR_MSG_PKG_PARSE_FAILED;
            } else {
                i11 = th2 instanceof IllegalStateException ? AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH : 0;
            }
            m78264a(i11, str, th2);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC35358a m78281h() {
        return this.f76113u;
    }

    /* JADX INFO: renamed from: k */
    public void m78284k() {
        this.f76092A++;
    }

    /* JADX INFO: renamed from: l */
    public boolean m78285l() {
        return this.f76092A >= 3;
    }

    /* JADX INFO: renamed from: m */
    public String m78286m() {
        return this.f76101h;
    }

    public String toString() {
        return super.toString() + " mReleaseCalled:" + this.f76109q + " isRecycled:" + this.f76095b;
    }

    public AbstractC35366f(MediaCodec mediaCodec, C35365e c35365e) {
        boolean z11;
        boolean z12;
        String str = "ReuseCodecWrapper[" + hashCode() + "]";
        this.f76102j = str;
        this.f76104l = new HashSet<>();
        this.f76105m = new ArrayList<>();
        this.f76106n = new LinkedHashSet();
        this.f76107o = new int[2];
        this.f76110r = a.Uninitialized;
        this.f76115w = C35376a.b.KEEP_CODEC_RESULT_NO;
        boolean z13 = false;
        this.f76117y = false;
        this.f76118z = false;
        this.f76092A = 0;
        this.f76108p = mediaCodec;
        this.f76098e = c35365e;
        this.f76100g = new C35362b(c35365e.f76085g, c35365e.f76086h, c35365e.f76087i);
        String strM78342a = C35381c.m78342a(mediaCodec);
        this.f76101h = strM78342a;
        this.f76103k = C35376a.m78315a(strM78342a);
        if (Build.VERSION.SDK_INT == 29 && c35365e.f76082d != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C35380b.m78334b(str, "canCallGetCodecInfo:".concat(String.valueOf(z11)));
        if (z11) {
            this.f76111s = mediaCodec.getCodecInfo().getCapabilitiesForType(c35365e.f76088j);
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f76111s;
        if (codecCapabilities != null && C35381c.m78345a(codecCapabilities)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f76096c = z12;
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f76111s;
        if (codecCapabilities2 != null && C35381c.m78347b(codecCapabilities2)) {
            z13 = true;
        }
        this.f76097d = z13;
    }

    /* JADX INFO: renamed from: c */
    private final void m78273c(int i11, int i12, int i13, long j11, int i14) {
        this.f76108p.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    /* JADX INFO: renamed from: n */
    private boolean m78276n() {
        if (Thread.currentThread().getId() != this.f76112t) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private void m78278p() {
        if (C35380b.m78332a()) {
            C35380b.m78334b(this.f76102j, this + "unBindingBackupSurface");
        }
        C35374a c35374a = this.f76093B;
        if (c35374a != null) {
            c35374a.m78307b();
        }
        this.f76093B = null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public MediaCodec mo78240a() {
        return this.f76108p;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: b */
    public void mo78247b() {
        long id2 = Thread.currentThread().getId();
        if (this.f76105m.contains(Long.valueOf(id2))) {
            return;
        }
        this.f76112t = id2;
        this.f76105m.add(Long.valueOf(id2));
        if (this.f76105m.size() > 100) {
            this.f76105m.remove(0);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: e */
    public void mo78250e() {
        int i11;
        if (m78276n()) {
            C35380b.m78337d(this.f76102j, "call method flush for isNotMyThread...");
        }
        String str = null;
        try {
            if (C35380b.m78332a()) {
                str = this + ", flush state:" + this.f76110r;
                C35380b.m78334b(this.f76102j, str);
            }
            this.f76108p.flush();
            this.f76110r = a.Flushed;
        } catch (Throwable th2) {
            if (!(th2 instanceof MediaCodec.CodecException)) {
                if (th2 instanceof IllegalStateException) {
                    i11 = 90000;
                } else {
                    i11 = 0;
                }
            } else {
                i11 = BaseConstants.ERR_SVR_MSG_JSON_PARSE_FAILED;
            }
            m78264a(i11, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: f */
    public void mo78251f() {
        if (C35380b.m78332a()) {
            C35380b.m78334b(this.f76102j, this + ", stop");
        }
        if (!mo78283j()) {
            if (C35380b.m78332a()) {
                C35380b.m78334b(this.f76102j, this + ", codec real stop");
            }
            try {
                this.f76108p.stop();
                this.f76110r = a.Uninitialized;
            } catch (IllegalStateException e11) {
                this.f76110r = a.Uninitialized;
                C35380b.m78335b(this.f76102j, "stop failed", e11);
                throw e11;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: g */
    public void mo78252g() {
        if (C35380b.m78332a()) {
            C35380b.m78334b(this.f76102j, this + " call release mHoldBufferOutIndex:" + this.f76104l + " mReleaseCalled:" + this.f76109q + " stack:" + Log.getStackTraceString(new Throwable()));
        }
        this.f76109q = true;
        this.f76116x = false;
        if (mo78283j()) {
            try {
                mo78250e();
            } catch (IllegalStateException e11) {
                C35380b.m78335b(this.f76102j, "flush failed for not in the Executing state.", e11);
            }
            m78277o();
            C35357a.m78185a().m78198b(this);
            return;
        }
        if (C35380b.m78332a()) {
            C35380b.m78337d(this.f76102j, "Don't not keep the codec, release it ..., mErrorHappened:" + this.f76117y);
        }
        C35357a.m78185a().m78194a(this);
        m78282i();
        this.f76110r = a.Released;
    }

    /* JADX INFO: renamed from: i */
    public final void m78282i() {
        if (C35380b.m78332a()) {
            C35380b.m78334b(this.f76102j, this + ", recycle isRecycled:" + this.f76095b + "  mSurfaceMap.size:" + f76091i.size() + "...... stack:" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f76095b) {
            C35380b.m78337d(this.f76102j, "ignore recycle for has isRecycled is true.");
            return;
        }
        this.f76116x = false;
        this.f76095b = true;
        C35382d.m78350a(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        AbstractC35366f.this.f76108p.stop();
                        AbstractC35366f.this.f76108p.release();
                    } catch (Throwable th2) {
                        AbstractC35366f.this.f76108p.release();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    C35380b.m78330a(AbstractC35366f.this.f76102j, "recycle codec ignore error,", th3);
                }
                if (AbstractC35366f.this.f76113u != null) {
                    AbstractC35366f.this.f76113u.onRealRelease();
                }
            }
        });
        this.f76110r = a.Uninitialized;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo78283j() {
        if (C35357a.m78192c()) {
            if (this.f76117y || !C35357a.m78185a().m78200e() || !C35357a.m78185a().m78201f()) {
                return false;
            }
            return true;
        }
        if (this.f76117y || !C35357a.m78185a().m78200e()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final void m78268b(int i11, int i12, int i13, long j11, int i14) {
        int i15 = AnonymousClass2.f76120a[this.f76115w.ordinal()];
        if (i15 == 1) {
            C35380b.m78337d(this.f76102j, "queueInputBufferForAdaptation error for KEEP_CODEC_RESULT_NO");
        } else if (i15 == 2) {
            m78273c(i11, i12, i13, j11, i14);
        } else {
            if (i15 != 3) {
                return;
            }
            this.f76108p.queueInputBuffer(i11, i12, i13, j11, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m78274c(Surface surface) {
        m78266a(surface, true, false);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC35363c m78261a(MediaCodec mediaCodec, String str, C35365e c35365e) {
        return C35381c.m78346a(str) ? new C35367g(mediaCodec, c35365e) : new C35361a(mediaCodec, c35365e);
    }

    /* JADX INFO: renamed from: b */
    private void m78269b(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        int i12;
        String str = null;
        try {
            if (C35380b.m78332a()) {
                str = this + ", realConfigure mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i11 + " state:" + this.f76110r + " mHasConfigureCalled：" + this.f76116x;
                C35380b.m78334b(this.f76102j, str);
            }
            this.f76108p.configure(mediaFormat, surface, mediaCrypto, i11);
            m78270b(surface);
            this.f76110r = a.Configured;
        } catch (Throwable th2) {
            String str2 = str;
            if (th2 instanceof IllegalStateException) {
                i12 = 10000;
            } else {
                i12 = th2 instanceof MediaCodec.CryptoException ? 10001 : 0;
            }
            m78265a(i12, str2, th2, true, surface);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78262a(int i11) {
        if (i11 < 40000) {
            C35380b.m78338e(this.f76102j, this + "    releaseCodecWhenError, errorCode:" + i11);
            mo78252g();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m78270b(Surface surface) {
        if (C35380b.m78332a()) {
            C35380b.m78336c(this.f76102j, this + ", oldSurface:" + this.f76099f + " CodecWrapperSetSurface surface:" + surface);
        }
        this.f76099f = surface;
    }

    /* JADX INFO: renamed from: a */
    private void m78263a(int i11, int i12) {
        int i13;
        if (this.f76118z || !m78271b(i11, i12)) {
            return;
        }
        this.f76118z = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(", trackDecodeApi state:");
        sb2.append(this.f76110r);
        sb2.append("  surfaceState:");
        Surface surface = this.f76099f;
        sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        String string = sb2.toString();
        if (i11 == 0) {
            i13 = 40002;
        } else if (i11 != 1) {
            return;
        } else {
            i13 = BaseConstants.ERR_SVR_COMM_INVALID_HTTP_URL;
        }
        m78264a(i13, string, (Throwable) null);
    }

    /* JADX INFO: renamed from: b */
    private boolean m78271b(int i11, int i12) {
        if (i12 != -1) {
            this.f76107o[i11] = 0;
            return false;
        }
        int[] iArr = this.f76107o;
        int i13 = iArr[i11] + 1;
        iArr[i11] = i13;
        return i13 > 100;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public void mo78241a(int i11, int i12, int i13, long j11, int i14) throws Throwable {
        String str;
        int i15;
        AbstractC35366f abstractC35366f;
        if (m78276n()) {
            C35380b.m78337d(this.f76102j, "ignore call method queueInputBuffer for isNotMyThread");
            return;
        }
        if (C35380b.m78332a()) {
            str = this + ", queueInputBuffer index:" + i11 + " offset:" + i12 + " size:" + i13 + " presentationTimeUs:" + j11 + " flags:" + i14 + " state:" + this.f76110r + " decodeState:" + this.f76094a;
            C35380b.m78329a(this.f76102j, str);
        } else {
            str = null;
        }
        String str2 = str;
        try {
            if (this.f76114v) {
                m78268b(i11, i12, i13, j11, i14);
                abstractC35366f = this;
            } else {
                abstractC35366f = this;
                try {
                    abstractC35366f.f76108p.queueInputBuffer(i11, i12, i13, j11, i14);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    if (th3 instanceof MediaCodec.CodecException) {
                        i15 = BaseConstants.ERR_SVR_CONV_ACCOUNT_NOT_FOUND;
                    } else if (th3 instanceof IllegalStateException) {
                        i15 = 50000;
                    } else {
                        i15 = th3 instanceof MediaCodec.CryptoException ? BaseConstants.ERR_SVR_CONV_INVALID_PARAMETERS : 0;
                    }
                    m78264a(i15, str2, th3);
                    throw th3;
                }
            }
            abstractC35366f.f76094a = b.QueueIn;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78264a(int i11, String str, Throwable th2) {
        m78265a(i11, str, th2, false, this.f76099f);
    }

    /* JADX INFO: renamed from: a */
    private void m78265a(int i11, String str, Throwable th2, boolean z11, Surface surface) {
        int iM78275d;
        this.f76117y = true;
        String str2 = str + " handleCoreAPIException exception:" + (th2 == null ? "" : th2.getLocalizedMessage());
        if (z11 && (iM78275d = m78275d(surface)) != 0) {
            i11 = iM78275d;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i11);
            jSONObject.put("exceptionMsg", str2);
            InterfaceC35358a interfaceC35358a = this.f76113u;
            if (interfaceC35358a != null) {
                interfaceC35358a.onReuseCodecAPIException(jSONObject.toString(), th2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        C35380b.m78335b(this.f76102j, "hasReused:" + this.f76114v + "    errorCode:" + i11 + ", " + str2, th2);
        m78262a(i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public void mo78242a(int i11, boolean z11) {
        String str;
        int i12;
        if (m78276n()) {
            C35380b.m78337d(this.f76102j, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        if (C35380b.m78332a()) {
            str = this + ", releaseOutputBuffer render:" + z11;
            C35380b.m78329a(this.f76102j, str);
        } else {
            str = null;
        }
        try {
            this.f76104l.remove(Integer.valueOf(i11));
            this.f76108p.releaseOutputBuffer(i11, z11);
        } catch (Throwable th2) {
            if (this.f76110r != a.Flushed) {
                C35380b.m78330a(this.f76102j, this + ", releaseOutputBuffer failed, ignore e:", th2);
            }
            if (th2 instanceof MediaCodec.CodecException) {
                i12 = BaseConstants.ERR_SVR_ACCOUNT_USERSIG_EMPTY;
            } else {
                i12 = th2 instanceof IllegalStateException ? BaseConstants.ERR_SVR_ACCOUNT_USERSIG_EXPIRED : 0;
            }
            m78264a(i12, str, th2);
        }
        this.f76094a = b.ReleaseOut;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public void mo78243a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        if (m78276n()) {
            C35380b.m78337d(this.f76102j, "ignore call method configure for isNotMyThread");
            return;
        }
        this.f76116x = true;
        this.f76109q = false;
        if (this.f76110r == a.Uninitialized) {
            m78269b(mediaFormat, surface, mediaCrypto, i11);
        } else if (surface != null) {
            m78280r();
            m78274c(surface);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public void mo78244a(Surface surface) {
        m78266a(surface, false, false);
    }

    /* JADX INFO: renamed from: a */
    private void m78266a(Surface surface, boolean z11, boolean z12) {
        String str;
        int i11;
        if (this.f76099f == surface) {
            C35380b.m78337d(this.f76102j, this + ", innerSetOutputSurface error surface:" + surface + " is same, stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        if (C35380b.m78332a()) {
            str = this + " configure, call innerSetOutputSurface surface:" + surface + "  decodeState:" + this.f76094a + " callByInner:" + z11;
            C35380b.m78334b(this.f76102j, str);
        } else {
            str = null;
        }
        String str2 = str;
        try {
            m78270b(surface);
            this.f76108p.setOutputSurface(surface);
            if (z12) {
                return;
            }
            m78278p();
        } catch (Throwable th2) {
            if (th2 instanceof IllegalStateException) {
                i11 = 30000;
            } else {
                i11 = th2 instanceof IllegalArgumentException ? BaseConstants.ERR_SVR_FRIENDSHIP_INVALID_PARAMETERS : 0;
            }
            m78265a(i11, str2, th2, true, surface);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public void mo78245a(InterfaceC35358a interfaceC35358a) {
        this.f76113u = interfaceC35358a;
    }
}
