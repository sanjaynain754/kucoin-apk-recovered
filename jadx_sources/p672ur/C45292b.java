package p672ur;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.network.socket.exception.ConnectUnknownException;
import com.kubi.network.socket.model.TokenEntity;
import com.kubi.network.socket.utils.C19388d;
import com.kubi.network.socket.utils.C19391g;
import com.kubi.network.socket.utils.C19393i;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: ur.b */
/* JADX INFO: compiled from: ConnectTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J'\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0016\u0010)\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R\u0016\u0010+\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010,\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0016\u0010-\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00109¨\u0006;"}, m90084d2 = {"Lur/b;", "Lur/e;", "", "linkType", "<init>", "(Ljava/lang/String;)V", "", "b", "()V", "c", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "k", "", "e", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Throwable;)V", "d", CmcdData.Factory.STREAMING_FORMAT_HLS, "j", "Lcom/kubi/network/socket/model/TokenEntity;", InterfaceC33826o0.f71244p, "f", "(Lcom/kubi/network/socket/model/TokenEntity;)V", "i", "v", "connectUrl", "q", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "r", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "p", "o", "Ljava/lang/String;", "", "J", "callStart", "callEnd", "flowCount", "flowStart", "flowEnd", "tokenStart", "tokenEnd", "connectStart", "connectEnd", "", "Z", "callFore", "Ljava/lang/StringBuffer;", "m", "Ljava/lang/StringBuffer;", "callChain", "n", "Ljava/lang/Throwable;", "failExcept", "Lcom/kubi/network/socket/utils/i;", "Lcom/kubi/network/socket/utils/i;", "evaluator", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConnectTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectTrack.kt\ncom/kubi/network/socket/track/ConnectTrack\n+ 2 IConnectTrack.kt\ncom/kubi/network/socket/track/IConnectTrackKt\n+ 3 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 6 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,244:1\n84#2:245\n84#2:246\n84#2:247\n84#2:248\n84#2:249\n84#2:250\n84#2:251\n84#2:252\n84#2:253\n84#2:254\n84#2:255\n84#2:256\n52#3,33:257\n52#3,33:290\n1#4:323\n71#5,4:324\n74#6,12:328\n74#6,12:340\n*S KotlinDebug\n*F\n+ 1 ConnectTrack.kt\ncom/kubi/network/socket/track/ConnectTrack\n*L\n52#1:245\n57#1:246\n63#1:247\n71#1:248\n76#1:249\n83#1:250\n89#1:251\n94#1:252\n99#1:253\n105#1:254\n110#1:255\n115#1:256\n129#1:257,33\n140#1:290,33\n158#1:324,4\n171#1:328,12\n176#1:340,12\n*E\n"})
public final class C45292b implements InterfaceC45295e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String linkType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long callEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long flowCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long flowStart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long flowEnd;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long tokenStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long tokenEnd;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long connectStart;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long connectEnd;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String connectUrl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public volatile boolean callFore;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final StringBuffer callChain;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Throwable failExcept;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C19393i evaluator;

    public C45292b(@NotNull String linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        this.linkType = linkType;
        this.connectUrl = "";
        this.callFore = true;
        this.callChain = new StringBuffer();
        this.evaluator = new C19393i(10L);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0043  */
    /* JADX INFO: renamed from: q */
    public final void m100127q(String connectUrl) {
        String message;
        try {
            m100112u(this, connectUrl, null, 2, null);
        } catch (Throwable th2) {
            boolean zStartsWith$default = true;
            if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof ConnectionShutdownException)) {
                if (th2 instanceof SecurityException) {
                    String message2 = th2.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    } else {
                        zStartsWith$default = false;
                    }
                } else if (!(th2 instanceof IOException) || (message = th2.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                    zStartsWith$default = false;
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("NetworkChain:Ws", th2);
            } else {
                C44170a.m97380b(th2, "NetworkChain:Ws");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004f  */
    /* JADX INFO: renamed from: r */
    public final void m100128r(Throwable error) {
        String message;
        boolean zStartsWith$default = true;
        try {
            if (this.callFore && C19391g.f36153a.m43062e()) {
                m100112u(this, null, error, 1, null);
            }
        } catch (Throwable th2) {
            if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof ConnectionShutdownException)) {
                if (th2 instanceof SecurityException) {
                    String message2 = th2.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    } else {
                        zStartsWith$default = false;
                    }
                } else if (!(th2 instanceof IOException) || (message = th2.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                    zStartsWith$default = false;
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("NetworkChain:Ws", th2);
            } else {
                C44170a.m97380b(th2, "NetworkChain:Ws");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long m100109m(C45292b c45292b) {
        return c45292b.flowCount;
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ String m100110n(C45292b c45292b) {
        return c45292b.linkType;
    }

    /* JADX INFO: renamed from: t */
    public static final String m100111t(int i11, String str, String str2, C45292b c45292b, long j11, long j12, long j13, long j14, Throwable th2) {
        String str3 = "code = " + i11 + ",host = " + str + ",path = " + str2 + ",networkType = " + C19391g.m43056b() + ",networkCarrier = " + C19391g.m43057c() + ",isProxy = " + C19391g.m43059l() + ",isVPN = " + C19391g.m43060m() + ",retryCount = " + c45292b.flowCount + ",totalDuration = " + j11 + ",flowDuration = " + j12 + ",tokenDuration = " + j13 + ",connectDuration = " + j14 + ",callChain = " + ((Object) c45292b.callChain);
        if (th2 == null) {
            return str3;
        }
        return str3 + ", exception_type = " + th2.getClass().getCanonicalName() + ", exception_message = " + th2.getMessage();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m100112u(C45292b c45292b, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        c45292b.m100129s(str, th2);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: e */
    public void mo100117e(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.connectEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "connectFail", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: f */
    public void mo100118f(@NotNull TokenEntity token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.connectUrl = token.getWsUrl();
        this.connectStart = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "connectStart", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: j */
    public void mo100122j(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.tokenEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "tokenFail", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: l */
    public void mo100124l(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.failExcept = e11;
        this.flowEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "flowFail", false, 4, null);
        m100130v();
    }

    /* JADX INFO: renamed from: o */
    public final void m100125o() {
        this.callStart = 0L;
        this.callEnd = 0L;
        this.flowCount = 0L;
        this.callChain.setLength(0);
        this.callFore = true;
        m100126p();
    }

    /* JADX INFO: renamed from: p */
    public final void m100126p() {
        this.flowStart = 0L;
        this.flowEnd = 0L;
        this.tokenStart = 0L;
        this.tokenEnd = 0L;
        this.connectStart = 0L;
        this.connectEnd = 0L;
        this.connectUrl = "";
        this.failExcept = null;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v30 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v33 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: s */
    public final void m100129s(java.lang.String r22, java.lang.Throwable r23) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p672ur.C45292b.m100129s(java.lang.String, java.lang.Throwable):void");
    }

    /* JADX INFO: renamed from: v */
    public final void m100130v() {
        if (this.callFore) {
            this.callFore = C19388d.f36150a.m43053b();
        }
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: a */
    public void mo100113a() {
        m100126p();
        this.flowCount++;
        this.flowStart = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "flowStart", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: b */
    public void mo100114b() {
        m100125o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.callStart = jCurrentTimeMillis;
        C45296f.m100134b(this.callChain, jCurrentTimeMillis, "callStart", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: c */
    public void mo100115c() {
        this.callEnd = System.currentTimeMillis();
        C45296f.m100133a(this.callChain, this.callStart, "callEnd", true);
        m100127q(this.connectUrl);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: d */
    public void mo100116d() {
        this.tokenStart = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "tokenStart", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: g */
    public void mo100119g() {
        this.callEnd = System.currentTimeMillis();
        C45296f.m100133a(this.callChain, this.callStart, "callFail", true);
        Throwable connectUnknownException = this.failExcept;
        if (connectUnknownException == null) {
            connectUnknownException = new ConnectUnknownException();
        }
        m100128r(connectUnknownException);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: h */
    public void mo100120h() {
        this.tokenEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "tokenEnd", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: i */
    public void mo100121i() {
        this.connectEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "connectEnd", false, 4, null);
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: k */
    public void mo100123k() {
        this.flowEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "flowEnd", false, 4, null);
        m100130v();
    }

    public /* synthetic */ C45292b(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "push" : str);
    }
}
