package p672ur;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.socket.exception.NetworkException;
import com.kubi.network.socket.exception.RequestUnknownException;
import com.kubi.network.socket.utils.C19391g;
import com.kubi.network.socket.utils.C19393i;
import com.kubi.network.socket.utils.SuccessRateStats;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: ur.i */
/* JADX INFO: compiled from: RequestTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001b\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010&\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m90084d2 = {"Lur/i;", "Lur/g;", "", "linkType", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lcom/kubi/network/socket/utils/i;", "evaluator", "<init>", "(Ljava/lang/String;Lcom/kubi/network/api/model/NetworkRequest;Lcom/kubi/network/socket/utils/i;)V", "", "b", "()V", "c", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "f", "d", "m", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "n", "o", "k", "topic", "i", "(Ljava/lang/String;)Ljava/lang/String;", "j", "Ljava/lang/String;", "Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/socket/utils/i;", "", "J", "callStart", "callEnd", "requestStart", "g", "requestEnd", "Ljava/lang/StringBuffer;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/StringBuffer;", "callChain", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestTrack.kt\ncom/kubi/network/socket/track/SingleRequestTrack\n+ 2 IConnectTrack.kt\ncom/kubi/network/socket/track/IConnectTrackKt\n+ 3 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n84#2:254\n84#2:255\n84#2:256\n84#2:257\n84#2:258\n84#2:259\n52#3,33:260\n52#3,33:293\n52#3,33:354\n71#4,4:326\n71#4,4:388\n74#5,12:330\n74#5,12:342\n1#6:387\n*S KotlinDebug\n*F\n+ 1 RequestTrack.kt\ncom/kubi/network/socket/track/SingleRequestTrack\n*L\n72#1:254\n77#1:255\n83#1:256\n89#1:257\n94#1:258\n100#1:259\n108#1:260,33\n119#1:293,33\n216#1:354,33\n133#1:326,4\n203#1:388,4\n147#1:330,12\n151#1:342,12\n*E\n"})
public final class C45299i implements InterfaceC45297g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String linkType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C19393i evaluator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long callEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long requestStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long requestEnd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final StringBuffer callChain;

    /* JADX INFO: renamed from: i */
    public final String m100154i(String topic) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) topic, C33844oi.f71346o, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return null;
        }
        String strSubstring = topic.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: j */
    public final String m100155j(String topic) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) topic, C33844oi.f71346o, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return null;
        }
        String strSubstring = topic.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX INFO: renamed from: k */
    public final void m100156k() {
        Object objM103844constructorimpl;
        String message;
        String strM100154i;
        String strM100155j;
        boolean zStartsWith$default = false;
        try {
            Result.Companion companion = Result.INSTANCE;
            String path = this.request.getPath();
            if (path != null && (strM100154i = m100154i(path)) != null && (strM100155j = m100155j(path)) != null) {
                int size = StringsKt.split$default((CharSequence) strM100155j, new String[]{","}, false, 0, 6, (Object) null).size();
                if (size >= 200) {
                    m100151l(strM100154i, 0, size);
                } else if (size >= 150) {
                    m100151l(strM100154i, 1, size);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    if ((thM103847exceptionOrNullimpl instanceof UnknownHostException) || (thM103847exceptionOrNullimpl instanceof SocketException) || (thM103847exceptionOrNullimpl instanceof SocketTimeoutException) || (thM103847exceptionOrNullimpl instanceof SSLException) || (thM103847exceptionOrNullimpl instanceof SSLProtocolException) || (thM103847exceptionOrNullimpl instanceof SSLPeerUnverifiedException) || (thM103847exceptionOrNullimpl instanceof ConnectionShutdownException)) {
                        zStartsWith$default = true;
                    } else if (thM103847exceptionOrNullimpl instanceof SecurityException) {
                        String message2 = thM103847exceptionOrNullimpl.getMessage();
                        if (message2 != null) {
                            zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                        }
                    } else if ((thM103847exceptionOrNullimpl instanceof IOException) && (message = thM103847exceptionOrNullimpl.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"))) {
                        zStartsWith$default = true;
                    }
                    if (zStartsWith$default) {
                        C44128b.m97263g("RequestTrack", thM103847exceptionOrNullimpl);
                    } else {
                        C44170a.m97380b(thM103847exceptionOrNullimpl, "RequestTrack");
                    }
                }
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0043  */
    /* JADX INFO: renamed from: m */
    public final void m100157m() {
        String message;
        boolean zStartsWith$default = true;
        try {
            m100153q(this, null, 1, null);
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

    /* JADX INFO: renamed from: o */
    public final void m100159o(Throwable error) {
        int code;
        C45299i c45299i;
        if (error != null) {
            NetworkException requestUnknownException = error instanceof NetworkException ? (NetworkException) error : null;
            if (requestUnknownException == null) {
                requestUnknownException = new RequestUnknownException();
            }
            code = requestUnknownException.getCode();
        } else {
            code = 0;
        }
        long jM100135c = C45296f.m100135c(this.callEnd, this.callStart, 10000L);
        long jM100135c2 = C45296f.m100135c(this.requestEnd, this.requestStart, 10000L);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("link_type", this.linkType);
        if (this.request.getPath() != null) {
            eventParametersBuilderAcquire.m42393d("url", C27041f.m66668h(this.request.getPath()));
        }
        Map<String, Object> params = this.request.getParams();
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            eventParametersBuilderAcquire.m42393d(entry.getKey(), entry.getValue().toString());
        }
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, jM100135c);
        eventParametersBuilderAcquire.m42396g("duration1", jM100135c2);
        TechnologyEvent.m42388d("socket_request", eventParametersBuilderAcquire);
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_WS_REQUEST;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire2.m42391b("status_code", 0);
        eventParametersBuilderAcquire2.m42393d("link_type", this.linkType);
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire2);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire2);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
        }
        KunlunEventNameEnum kunlunEventNameEnum2 = KunlunEventNameEnum.FRONTEND_WS_REQUEST_COST_MILLISECONDS;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire3 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire3.m42391b("status_code", 0);
        eventParametersBuilderAcquire3.m42393d("link_type", this.linkType);
        eventParametersBuilderAcquire3.m42396g("total", jM100135c);
        eventParametersBuilderAcquire3.m42396g("request", jM100135c2);
        TechnologyEvent.C19216a c19216a2 = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c2 = c19216a2.m42399c(eventParametersBuilderAcquire3);
        Map<String, Number> mapM42398a2 = c19216a2.m42398a(eventParametersBuilderAcquire3);
        for (InterfaceC44169a interfaceC44169a2 : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a2.isEmpty()) {
                interfaceC44169a2.mo94079b(kunlunEventNameEnum2.getEventName(), mapM42399c2);
            } else {
                interfaceC44169a2.mo94078a(kunlunEventNameEnum2.getEventName(), mapM42398a2, mapM42399c2);
            }
        }
        if (code > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request ws_request_error: ");
            c45299i = this;
            sb2.append(m100152p(code, c45299i, jM100135c, jM100135c2, error));
            C44128b.m97261e("NetworkChain:Ws", sb2.toString());
        } else if (Random.INSTANCE.nextInt(100) == 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("request ws_request_success: ");
            c45299i = this;
            sb3.append(m100152p(code, c45299i, jM100135c, jM100135c2, error));
            C44128b.m97261e("NetworkChain:Ws", sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("request ws_request_success: ");
            c45299i = this;
            sb4.append(m100152p(code, c45299i, jM100135c, jM100135c2, error));
            C44128b.m97266j("NetworkChain:Ws", sb4.toString());
        }
        SuccessRateStats successRateStatsM43070a = c45299i.evaluator.m43070a(code == 0);
        if (successRateStatsM43070a != null) {
            C44128b.m97261e("NetworkChain:Ws", "request ws_request_success_rate: windowSuccessRate = " + successRateStatsM43070a.getWindowSuccessRate() + ", totalSuccessRate = " + successRateStatsM43070a.getTotalSuccessRate());
        }
    }

    public C45299i(@NotNull String linkType, @NotNull NetworkRequest request, @NotNull C19393i evaluator) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        this.linkType = linkType;
        this.request = request;
        this.evaluator = evaluator;
        this.callChain = new StringBuffer();
    }

    /* JADX INFO: renamed from: l */
    public static final void m100151l(String str, int i11, int i12) {
        C43847h.m96575d(KunlunTechEventEnum.CATE_NETWORK_WS_BODY_ILLEGAL, i11);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("path", str);
        eventParametersBuilderAcquire.m42396g("number1", i12);
        TechnologyEvent.m42388d("ws_body_illegal", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: p */
    public static final String m100152p(int i11, C45299i c45299i, long j11, long j12, Throwable th2) {
        String str = "code = " + i11 + ",path = " + c45299i.request.getPath() + ",networkType = " + C19391g.m43056b() + ",networkCarrier = " + C19391g.m43057c() + ",isProxy = " + C19391g.m43059l() + ",isVPN = " + C19391g.m43060m() + ",totalDuration = " + j11 + ",requestDuration = " + j12 + ",callChain = " + ((Object) c45299i.callChain);
        if (th2 == null) {
            return str;
        }
        return str + ", exception_type = " + th2.getClass().getCanonicalName() + ", exception_message = " + th2.getMessage();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m100153q(C45299i c45299i, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        c45299i.m100159o(th2);
    }

    @Override // p672ur.InterfaceC45297g
    /* JADX INFO: renamed from: a */
    public void mo100136a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.callEnd = System.currentTimeMillis();
        C45296f.m100133a(this.callChain, this.callStart, "callFail", true);
        m100158n(e11);
    }

    @Override // p672ur.InterfaceC45297g
    /* JADX INFO: renamed from: e */
    public void mo100140e(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.requestEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "requestEnd", false, 4, null);
    }

    @Override // p672ur.InterfaceC45297g
    /* JADX INFO: renamed from: b */
    public void mo100137b() {
        m100156k();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.callStart = jCurrentTimeMillis;
        C45296f.m100134b(this.callChain, jCurrentTimeMillis, "callStart", false, 4, null);
    }

    @Override // p672ur.InterfaceC45297g
    /* JADX INFO: renamed from: c */
    public void mo100138c() {
        this.callEnd = System.currentTimeMillis();
        C45296f.m100133a(this.callChain, this.callStart, "callEnd", true);
        m100157m();
    }

    @Override // p672ur.InterfaceC45297g
    /* JADX INFO: renamed from: d */
    public void mo100139d() {
        this.requestEnd = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "requestEnd", false, 4, null);
    }

    @Override // p672ur.InterfaceC45297g
    /* JADX INFO: renamed from: f */
    public void mo100141f() {
        this.requestStart = System.currentTimeMillis();
        C45296f.m100134b(this.callChain, this.callStart, "requestStart", false, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX INFO: renamed from: n */
    public final void m100158n(Throwable error) {
        String message;
        try {
            if (!Intrinsics.areEqual(error.getMessage(), "public channel not supported private topic") && C19391g.f36153a.m43062e()) {
                m100159o(error);
            }
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
            if (!zStartsWith$default) {
                C44170a.m97380b(th2, "NetworkChain:Ws");
            } else {
                C44128b.m97263g("NetworkChain:Ws", th2);
            }
        }
    }
}
