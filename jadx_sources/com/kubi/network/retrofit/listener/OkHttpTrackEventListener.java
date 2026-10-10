package com.kubi.network.retrofit.listener;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.Pools;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.retrofit.exception.DataNullException;
import com.kubi.network.retrofit.utils.ApiMonitor;
import com.kubi.network.retrofit.utils.C19332d;
import com.kubi.network.retrofit.utils.C19335g;
import com.kubi.network.retrofit.utils.SuccessRateStats;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunNetworkPathEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p511or.C43174a;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import pr.C43529b;
import ro.C44128b;

/* JADX INFO: compiled from: OkHttpTrackEventListener.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002tuB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\bJ!\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J9\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\bJ\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\bJ\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\rJ\u0017\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\bJ\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\bJ\u001f\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b>\u00106J\u001f\u0010?\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010\rJ\u0017\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010\bJ!\u0010D\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u000e2\b\b\u0002\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bF\u0010<J#\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010I\u001a\u00060Gj\u0002`HH\u0002¢\u0006\u0004\bJ\u0010KJ5\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\u0010\b\u0002\u0010I\u001a\n\u0018\u00010Gj\u0004\u0018\u0001`HH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020P2\u000e\u0010I\u001a\n\u0018\u00010Gj\u0004\u0018\u0001`HH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020P2\u0006\u0010U\u001a\u00020PH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020P2\u0006\u0010U\u001a\u00020PH\u0002¢\u0006\u0004\bX\u0010WJ\u0019\u0010Y\u001a\u00020P2\b\u0010U\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u000203H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u000203H\u0002¢\u0006\u0004\b]\u0010\\J\u000f\u0010^\u001a\u00020\u0006H\u0002¢\u0006\u0004\b^\u0010\u0003J\u001f\u0010a\u001a\u0002032\u0006\u0010_\u001a\u0002032\u0006\u0010`\u001a\u000203H\u0002¢\u0006\u0004\ba\u0010bR\u0016\u0010\u0007\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\t\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010\u0010\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010\u0015\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010dR\u0016\u0010\u001b\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010dR\u0016\u0010$\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010dR\u0016\u0010h\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010dR\u0016\u0010i\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010dR\u0016\u0010j\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010dR\u0016\u0010k\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010dR\u0018\u0010m\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010lR\u0018\u0010n\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010lR\u0016\u0010q\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010r¨\u0006v"}, m90084d2 = {"Lcom/kubi/network/retrofit/listener/OkHttpTrackEventListener;", "Lokhttp3/EventListener;", "<init>", "()V", "Lokhttp3/Call;", "call", "", "callStart", "(Lokhttp3/Call;)V", "callEnd", "Ljava/io/IOException;", "ioe", "callFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "", "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "canceled", "callName", "", "isEnd", "j", "(Ljava/lang/String;Z)V", "w", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "x", "(Lokhttp3/Call;Ljava/lang/Exception;)V", "y", "(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/Exception;)V", "u", "(Lokhttp3/Request;)V", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lokhttp3/Response;)Ljava/lang/Integer;", "o", "(Ljava/lang/Exception;)I", "code", "r", "(I)I", "p", "q", "(Ljava/lang/Integer;)I", "m", "()J", "n", "t", "end", "start", CmcdData.Factory.STREAM_TYPE_LIVE, "(JJ)J", "g", "J", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "k", "requestStart", "requestEnd", "responseStart", "responseEnd", "Ljava/lang/Long;", "requestBodySize", "responseBodySize", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuffer;", "callChain", "Ljava/lang/String;", "rayId", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpTrackEventListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpTrackEventListener.kt\ncom/kubi/network/retrofit/listener/OkHttpTrackEventListener\n+ 2 NetCoreRetrofitIssue.kt\ncom/kubi/network/retrofit/exception/NetCoreRetrofitIssueKt\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,568:1\n564#1:569\n564#1:570\n564#1:571\n564#1:572\n564#1:573\n564#1:574\n564#1:575\n564#1:576\n564#1:577\n564#1:578\n564#1:579\n564#1:580\n564#1:581\n564#1:582\n564#1:583\n564#1:584\n566#1:732\n64#2,34:585\n64#2,34:619\n64#2,34:698\n71#3,2:653\n73#3,2:656\n71#3,4:694\n71#3,4:733\n1#4:655\n74#5,12:658\n74#5,12:670\n74#5,12:682\n*S KotlinDebug\n*F\n+ 1 OkHttpTrackEventListener.kt\ncom/kubi/network/retrofit/listener/OkHttpTrackEventListener\n*L\n115#1:569\n129#1:570\n139#1:571\n145#1:572\n150#1:573\n155#1:574\n173#1:575\n184#1:576\n197#1:577\n202#1:578\n212#1:579\n218#1:580\n223#1:581\n237#1:582\n243#1:583\n252#1:584\n561#1:732\n262#1:585,34\n282#1:619,34\n457#1:698,34\n305#1:653,2\n305#1:656,2\n362#1:694,4\n424#1:733,4\n338#1:658,12\n342#1:670,12\n357#1:682,12\n*E\n"})
public final class OkHttpTrackEventListener extends EventListener {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Pools.SynchronizedPool<EventListener> f35951v = new Pools.SynchronizedPool<>(64);

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final C19335g f35952w = new C19335g(0, 1, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long callEnd;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long dnsStart;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long dnsEnd;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long connectStart;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public long connectEnd;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long requestStart;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long requestEnd;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public long responseStart;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long responseEnd;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Long requestBodySize;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Long responseBodySize;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public StringBuffer callChain = new StringBuffer();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public String rayId;

    /* JADX INFO: compiled from: OkHttpTrackEventListener.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m90084d2 = {"Lcom/kubi/network/retrofit/listener/OkHttpTrackEventListener$Companion;", "", "<init>", "()V", "Lokhttp3/EventListener;", "acquire", "()Lokhttp3/EventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokhttp3/EventListener;)V", "", "BIZ_ERROR", "I", "CONNECT_ERROR", "DEFAULT_SUCCESS", "HOST_ERROR", "JSON_ERROR", "", "MAX_DURATION", "J", "POOL_SIZE", "SOCKET_ERROR", "SSL_ERROR", "SSL_HANDSHAKE_ERROR", "SSL_PROTOCOL_ERROR", "", "TAG", "Ljava/lang/String;", "TIMEOUT_ERROR", "UNKNOWN_ERROR", "Lcom/kubi/network/retrofit/utils/g;", "evaluator", "Lcom/kubi/network/retrofit/utils/g;", "Landroidx/core/util/Pools$SynchronizedPool;", "pool", "Landroidx/core/util/Pools$SynchronizedPool;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final void m42817a(EventListener listener) {
            try {
                if (OkHttpTrackEventListener.f35951v.release(listener)) {
                    return;
                }
                C44128b.m97270n("NetworkChain:Http", "recycle is full");
            } catch (Exception e11) {
                C44128b.m97263g("NetworkChain:Http", e11);
            }
        }

        @NotNull
        public final EventListener acquire() {
            EventListener eventListener = (EventListener) OkHttpTrackEventListener.f35951v.acquire();
            if (eventListener == null) {
                return new OkHttpTrackEventListener();
            }
            return eventListener;
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.retrofit.listener.OkHttpTrackEventListener$a */
    /* JADX INFO: compiled from: OkHttpTrackEventListener.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/network/retrofit/listener/OkHttpTrackEventListener$a;", "Lokhttp3/EventListener$Factory;", "<init>", "()V", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19328a implements EventListener.Factory {
        @Override // okhttp3.EventListener.Factory
        @NotNull
        public EventListener create(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return OkHttpTrackEventListener.INSTANCE.acquire();
        }
    }

    /* JADX INFO: renamed from: z */
    public static final String m42802z(String str, int i11, HttpUrl httpUrl, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, OkHttpTrackEventListener okHttpTrackEventListener, Exception exc) {
        String str2 = "method = " + str + ",code = " + i11 + ",host = " + httpUrl.host() + ",path = " + httpUrl.encodedPath() + ", networkType = " + C19332d.m42837a() + ",networkCarrier = " + C19332d.m42838b() + ",isProxy = " + C19332d.m42840f() + ",isVPN = " + C19332d.m42841g() + ",duration = " + j11 + ",dnsDuration = " + j12 + ",connectDuration = " + j13 + ",serverDuration = " + j14 + ",requestDuration = " + j15 + ",responseDuration = " + j16 + ",clientRequestDuration = " + j17 + ",clientResponseDuration = " + j18 + ",callChain = " + ((Object) okHttpTrackEventListener.callChain);
        if (exc != null) {
            str2 = str2 + ", exception_type = " + exc.getClass().getCanonicalName() + ", exception_message = " + exc.getMessage();
        }
        String str3 = okHttpTrackEventListener.rayId;
        if (str3 == null) {
            return str2;
        }
        return str2 + ", rayId = " + str3;
    }

    /* JADX INFO: renamed from: s */
    public final Integer m42811s(Response response) {
        int iOptInt;
        if (response == null) {
            return null;
        }
        if (!response.isSuccessful()) {
            return Integer.valueOf(response.code());
        }
        try {
            ResponseBody responseBodyBody = response.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            iOptInt = TextUtils.isEmpty(strString) ? 200 : new JSONObject(strString).optInt("code", 200);
        } catch (JSONException unused) {
            iOptInt = 1004;
        } catch (Throwable th2) {
            boolean zStartsWith$default = true;
            if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof SSLException) && !(th2 instanceof ConnectionShutdownException)) {
                if (th2 instanceof SecurityException) {
                    String message = th2.getMessage();
                    zStartsWith$default = message != null ? StringsKt.startsWith$default(message, "Package android does not belong to", false, 2, (Object) null) : false;
                } else if (th2 instanceof IOException) {
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("OkHttpTrackEventListener", th2);
            } else {
                C43174a.m94787c(th2, "OkHttpTrackEventListener");
            }
        }
        return Integer.valueOf(-(iOptInt >= 0 ? iOptInt : 200));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0053  */
    /* JADX INFO: renamed from: w */
    public final void m42814w(Call call, Response response) {
        try {
            m42792A(this, call, response, null, 4, null);
            m42812t();
        } catch (Throwable th2) {
            try {
                boolean zStartsWith$default = true;
                if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof SSLException) && !(th2 instanceof ConnectionShutdownException)) {
                    if (th2 instanceof SecurityException) {
                        String message = th2.getMessage();
                        if (message != null) {
                            zStartsWith$default = StringsKt.startsWith$default(message, "Package android does not belong to", false, 2, (Object) null);
                        } else {
                            zStartsWith$default = false;
                        }
                    } else if (th2 instanceof IOException) {
                        String message2 = th2.getMessage();
                        if (message2 == null || (!StringsKt.startsWith$default(message2, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "Software caused connection abort", false, 2, (Object) null) && !message2.equals("closed"))) {
                            zStartsWith$default = false;
                        }
                    } else if (!(th2 instanceof DataNullException)) {
                        zStartsWith$default = false;
                    }
                }
                if (zStartsWith$default) {
                    C44128b.m97263g("NetworkChain:Http", th2);
                } else {
                    C43174a.m94787c(th2, "NetworkChain:Http");
                }
            } finally {
                m42812t();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m42792A(OkHttpTrackEventListener okHttpTrackEventListener, Call call, Response response, Exception exc, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            response = null;
        }
        if ((i11 & 4) != 0) {
            exc = null;
        }
        okHttpTrackEventListener.m42816y(call, response, exc);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m42800k(OkHttpTrackEventListener okHttpTrackEventListener, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        okHttpTrackEventListener.m42803j(str, z11);
    }

    /* JADX INFO: renamed from: v */
    public static final void m42801v(Request request, int i11, int i12) {
        C43847h.m96575d(KunlunTechEventEnum.CATE_NETWORK_HTTP_BODY_ILLEGAL, i11);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("host", request.url().host());
        eventParametersBuilderAcquire.m42393d("path", request.url().encodedPath());
        eventParametersBuilderAcquire.m42396g("number1", i12);
        TechnologyEvent.m42388d("http_body_illegal", eventParametersBuilderAcquire);
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (this.callStart == 0) {
            m42812t();
            return;
        }
        Response response = C43529b.f96063a.m95793b().get();
        if (response == null) {
            m42812t();
            return;
        }
        this.callEnd = System.currentTimeMillis();
        m42803j("callEnd", true);
        m42814w(call, response);
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        if (this.callStart == 0) {
            m42812t();
            return;
        }
        this.callEnd = System.currentTimeMillis();
        m42803j("callFailed", true);
        m42815x(call, ioe);
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.callStart = System.currentTimeMillis();
        m42800k(this, "callStart", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void canceled(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m42800k(this, "canceled", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.connectEnd = System.currentTimeMillis();
        m42800k(this, "connectEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        this.connectEnd = System.currentTimeMillis();
        m42800k(this, "connectFailed", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.connectStart = System.currentTimeMillis();
        m42800k(this, "connectStart", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        m42800k(this, "connectionAcquired", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        m42800k(this, "connectionReleased", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        this.dnsEnd = System.currentTimeMillis();
        m42800k(this, "dnsEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        this.dnsStart = System.currentTimeMillis();
        m42800k(this, "dnsStart", false, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m42803j(String callName, boolean isEnd) {
        this.callChain.append(callName + '[' + (System.currentTimeMillis() - this.callStart) + ']');
        if (isEnd) {
            return;
        }
        this.callChain.append("->");
    }

    /* JADX INFO: renamed from: l */
    public final long m42804l(long end, long start) {
        if (start == 0 || end == 0) {
            return 0L;
        }
        return Math.max(0L, Math.min(180000L, end - start));
    }

    /* JADX INFO: renamed from: m */
    public final long m42805m() {
        long j11 = this.dnsStart;
        if (j11 != 0) {
            return j11;
        }
        long j12 = this.requestStart;
        if (j12 != 0) {
            return j12;
        }
        long j13 = this.responseStart;
        return j13 != 0 ? j13 : this.callEnd;
    }

    /* JADX INFO: renamed from: n */
    public final long m42806n() {
        long j11 = this.responseEnd;
        return j11 != 0 ? j11 : this.callEnd;
    }

    /* JADX INFO: renamed from: o */
    public final int m42807o(Exception error) {
        if (error instanceof UnknownHostException) {
            return 1003;
        }
        if (error instanceof SocketTimeoutException) {
            return 1001;
        }
        if (error instanceof ConnectException) {
            return 1005;
        }
        if (error instanceof SocketException) {
            return 1002;
        }
        if (error instanceof SSLHandshakeException) {
            return 1006;
        }
        if (error instanceof SSLProtocolException) {
            return 1007;
        }
        return error instanceof SSLException ? 1000 : 999;
    }

    /* JADX INFO: renamed from: p */
    public final int m42808p(int code) {
        if (code < 0) {
            return 200;
        }
        return code;
    }

    /* JADX INFO: renamed from: q */
    public final int m42809q(Integer code) {
        return Math.abs(code != null ? code.intValue() : 999);
    }

    /* JADX INFO: renamed from: r */
    public final int m42810r(int code) {
        if (code < -1000) {
            return -998;
        }
        return code;
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.requestEnd = System.currentTimeMillis();
        this.requestBodySize = Long.valueOf(byteCount);
        m42800k(this, "requestBodyEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m42800k(this, "requestBodyStart", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        this.requestEnd = System.currentTimeMillis();
        m42800k(this, "requestFailed", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        this.requestEnd = System.currentTimeMillis();
        m42800k(this, "requestHeadersEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.requestStart = System.currentTimeMillis();
        m42800k(this, "requestHeadersStart", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.responseEnd = System.currentTimeMillis();
        this.responseBodySize = Long.valueOf(byteCount);
        m42800k(this, "responseBodyEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m42800k(this, "responseBodyStart", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        this.responseEnd = System.currentTimeMillis();
        m42800k(this, "responseFailed", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.rayId = response.headers().get("cf-ray");
        m42800k(this, "responseHeadersEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.responseStart = System.currentTimeMillis();
        m42800k(this, "responseHeadersStart", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        m42800k(this, "secureConnectEnd", false, 2, null);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m42800k(this, "secureConnectStart", false, 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m42812t() {
        this.callStart = 0L;
        this.callEnd = 0L;
        this.dnsStart = 0L;
        this.dnsEnd = 0L;
        this.connectStart = 0L;
        this.connectEnd = 0L;
        this.requestStart = 0L;
        this.requestEnd = 0L;
        this.responseStart = 0L;
        this.responseEnd = 0L;
        this.requestBodySize = null;
        this.responseBodySize = null;
        this.callChain.setLength(0);
        this.rayId = null;
        INSTANCE.m42817a(this);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x040c  */
    /* JADX WARN: Code duplicated, block: B:73:0x040f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0416  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0416, please report this as an issue */
    /* JADX INFO: renamed from: y */
    public final void m42816y(Call call, Response response, Exception error) {
        String strM42818a;
        int i11;
        Request request;
        int i12;
        boolean z11;
        OkHttpTrackEventListener okHttpTrackEventListener;
        String str;
        boolean z12;
        SuccessRateStats successRateStatsM42850a;
        KunlunEventNameEnum kunlunEventNameEnum;
        Request request2 = C43529b.f96063a.m95792a().get();
        if (request2 == null) {
            request2 = call.request();
        }
        Integer numM42811s = m42811s(response);
        int iIntValue = numM42811s != null ? numM42811s.intValue() : m42807o(error);
        String strMethod = request2.method();
        HttpUrl httpUrlUrl = request2.url();
        KunlunNetworkPathEnum matchEnum = KunlunNetworkPathEnum.INSTANCE.getMatchEnum(httpUrlUrl.encodedPath());
        if (matchEnum == null || (strM42818a = matchEnum.getPath()) == null) {
            strM42818a = ApiMonitor.m42818a(httpUrlUrl.encodedPath());
        }
        long jM42804l = m42804l(this.callEnd, this.callStart);
        long jM42804l2 = m42804l(this.dnsEnd, this.dnsStart);
        long jM42804l3 = m42804l(this.connectEnd, this.connectStart);
        long jM42804l4 = m42804l(this.responseStart, this.requestEnd);
        String str2 = strM42818a;
        long jM42804l5 = m42804l(this.requestEnd, this.requestStart);
        long jM42804l6 = m42804l(this.responseEnd, this.responseStart);
        long jM42804l7 = m42804l(m42805m(), this.callStart);
        long jM42804l8 = m42804l(this.callEnd, m42806n());
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
        Request request3 = request2;
        eventParametersBuilderAcquire.m42393d("type", strMethod);
        eventParametersBuilderAcquire.m42391b("code", iIntValue);
        eventParametersBuilderAcquire.m42393d("host", httpUrlUrl.host());
        eventParametersBuilderAcquire.m42393d("path", httpUrlUrl.encodedPath());
        eventParametersBuilderAcquire.m42393d("url", httpUrlUrl.host() + httpUrlUrl.encodedPath());
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, jM42804l);
        eventParametersBuilderAcquire.m42396g("duration1", jM42804l2);
        eventParametersBuilderAcquire.m42396g("duration2", jM42804l3);
        eventParametersBuilderAcquire.m42396g("duration3", jM42804l4);
        eventParametersBuilderAcquire.m42396g("duration4", jM42804l5);
        eventParametersBuilderAcquire.m42396g("duration5", jM42804l6);
        long j11 = jM42804l7;
        eventParametersBuilderAcquire.m42396g("duration6", j11);
        eventParametersBuilderAcquire.m42396g("duration7", jM42804l8);
        if (this.requestBodySize != null && jM42804l5 > 0) {
            Long l11 = this.requestBodySize;
            Intrinsics.checkNotNull(l11);
            eventParametersBuilderAcquire.m42396g("number1", l11.longValue());
            Long l12 = this.requestBodySize;
            Intrinsics.checkNotNull(l12);
            eventParametersBuilderAcquire.m42396g("number2", ((long) 1000) * (l12.longValue() / jM42804l5));
        }
        if (this.responseBodySize != null && jM42804l6 > 0) {
            Long l13 = this.responseBodySize;
            Intrinsics.checkNotNull(l13);
            eventParametersBuilderAcquire.m42396g("number3", l13.longValue());
            Long l14 = this.responseBodySize;
            Intrinsics.checkNotNull(l14);
            eventParametersBuilderAcquire.m42396g("number4", ((long) 1000) * (l14.longValue() / jM42804l6));
        }
        if (error != null) {
            eventParametersBuilderAcquire.m42393d("error_message", "class = " + error.getClass().getCanonicalName() + ", message = " + error.getMessage());
        }
        String str3 = this.rayId;
        if (str3 != null) {
            eventParametersBuilderAcquire.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, str3);
        }
        TechnologyEvent.m42388d("http_client_interface", eventParametersBuilderAcquire);
        KunlunEventNameEnum kunlunEventNameEnum2 = KunlunEventNameEnum.FRONTEND_REQUEST_API_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
        eventParametersBuilderAcquire2.m42393d("domain", httpUrlUrl.host());
        int i13 = iIntValue;
        eventParametersBuilderAcquire2.m42391b("status_code", m42810r(i13));
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire2);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire2);
        Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator();
        while (it.hasNext()) {
            Iterator<InterfaceC44169a> it2 = it;
            InterfaceC44169a next = it.next();
            if (mapM42398a.isEmpty()) {
                next.mo94079b(kunlunEventNameEnum2.getEventName(), mapM42399c);
            } else {
                next.mo94078a(kunlunEventNameEnum2.getEventName(), mapM42398a, mapM42399c);
            }
            it = it2;
            j11 = j11;
        }
        long j12 = j11;
        KunlunEventNameEnum kunlunEventNameEnum3 = KunlunEventNameEnum.FRONTEND_REQUEST_API_COST_MILLISECONDS;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire3 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire3.m42393d("domain", httpUrlUrl.host());
        eventParametersBuilderAcquire3.m42391b("status_code", m42808p(i13));
        if (str2 != null) {
            eventParametersBuilderAcquire3.m42393d("path", str2);
        }
        eventParametersBuilderAcquire3.m42396g("total", jM42804l);
        eventParametersBuilderAcquire3.m42396g("connect", jM42804l3);
        eventParametersBuilderAcquire3.m42396g("dns", jM42804l2);
        eventParametersBuilderAcquire3.m42396g("server", jM42804l4);
        eventParametersBuilderAcquire3.m42396g("request", jM42804l5);
        eventParametersBuilderAcquire3.m42396g("response", jM42804l6);
        eventParametersBuilderAcquire3.m42396g("request_handle", j12);
        eventParametersBuilderAcquire3.m42396g("response_handle", jM42804l8);
        TechnologyEvent.C19216a c19216a2 = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c2 = c19216a2.m42399c(eventParametersBuilderAcquire3);
        Map<String, Number> mapM42398a2 = c19216a2.m42398a(eventParametersBuilderAcquire3);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a2.isEmpty()) {
                kunlunEventNameEnum = kunlunEventNameEnum3;
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c2);
            } else {
                kunlunEventNameEnum = kunlunEventNameEnum3;
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a2, mapM42399c2);
            }
            kunlunEventNameEnum3 = kunlunEventNameEnum;
        }
        if (str2 != null) {
            KunlunEventNameEnum kunlunEventNameEnum4 = KunlunEventNameEnum.FRONTEND_REQUEST_PATH_COUNT;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire4 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire4.m42391b("status_code", m42809q(Integer.valueOf(i13)));
            eventParametersBuilderAcquire4.m42393d("path", str2);
            TechnologyEvent.C19216a c19216a3 = TechnologyEvent.C19216a.f35485a;
            Map<String, Object> mapM42399c3 = c19216a3.m42399c(eventParametersBuilderAcquire4);
            Map<String, Number> mapM42398a3 = c19216a3.m42398a(eventParametersBuilderAcquire4);
            for (InterfaceC44169a interfaceC44169a2 : C43848i.f96913a.m96586e().mo32841c()) {
                if (mapM42398a3.isEmpty()) {
                    interfaceC44169a2.mo94079b(kunlunEventNameEnum4.getEventName(), mapM42399c3);
                } else {
                    interfaceC44169a2.mo94078a(kunlunEventNameEnum4.getEventName(), mapM42398a3, mapM42399c3);
                }
            }
        } else {
            TechnologyEvent technologyEvent2 = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire5 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire5.m42391b("code", i13);
            eventParametersBuilderAcquire5.m42393d("host", httpUrlUrl.host());
            eventParametersBuilderAcquire5.m42393d("path", httpUrlUrl.encodedPath());
            TechnologyEvent.m42388d("http_path_match_fail", eventParametersBuilderAcquire5);
        }
        if (i13 <= 0) {
            i11 = i13;
            request = request3;
            if (jM42804l > 10000) {
                str = "NetworkChain:Http";
                C44128b.m97261e(str, "request slow: " + m42802z(strMethod, i11, httpUrlUrl, jM42804l, jM42804l2, jM42804l3, jM42804l4, jM42804l5, jM42804l6, j12, jM42804l8, this, error));
            } else {
                i12 = i11;
                if (Random.INSTANCE.nextInt(100) == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("request success: ");
                    z11 = true;
                    sb2.append(m42802z(strMethod, i12, httpUrlUrl, jM42804l, jM42804l2, jM42804l3, jM42804l4, jM42804l5, jM42804l6, j12, jM42804l8, this, error));
                    C44128b.m97261e("NetworkChain:Http", sb2.toString());
                    str = "NetworkChain:Http";
                    okHttpTrackEventListener = this;
                } else {
                    z11 = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("request success: ");
                    okHttpTrackEventListener = this;
                    sb3.append(m42802z(strMethod, i12, httpUrlUrl, jM42804l, jM42804l2, jM42804l3, jM42804l4, jM42804l5, jM42804l6, j12, jM42804l8, this, error));
                    str = "NetworkChain:Http";
                    C44128b.m97266j(str, sb3.toString());
                }
            }
            C19335g c19335g = f35952w;
            if (i12 < 0) {
                z12 = z11;
            } else {
                z12 = false;
            }
            successRateStatsM42850a = c19335g.m42850a(z12);
            if (successRateStatsM42850a != null) {
                C44128b.m97261e(str, "request success_rate: windowSuccessRate = " + successRateStatsM42850a.getWindowSuccessRate() + ", totalSuccessRate = " + successRateStatsM42850a.getTotalSuccessRate());
            }
            okHttpTrackEventListener.m42813u(request);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("request error: ");
        request = request3;
        i11 = i13;
        sb4.append(m42802z(strMethod, i11, httpUrlUrl, jM42804l, jM42804l2, jM42804l3, jM42804l4, jM42804l5, jM42804l6, j12, jM42804l8, this, error));
        str = "NetworkChain:Http";
        C44128b.m97261e(str, sb4.toString());
        z11 = true;
        i12 = i11;
        okHttpTrackEventListener = this;
        C19335g c19335g2 = f35952w;
        if (i12 < 0) {
            z12 = z11;
        } else {
            z12 = false;
        }
        successRateStatsM42850a = c19335g2.m42850a(z12);
        if (successRateStatsM42850a != null) {
            C44128b.m97261e(str, "request success_rate: windowSuccessRate = " + successRateStatsM42850a.getWindowSuccessRate() + ", totalSuccessRate = " + successRateStatsM42850a.getTotalSuccessRate());
        }
        okHttpTrackEventListener.m42813u(request);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX INFO: renamed from: u */
    public final void m42813u(Request request) {
        int length;
        if (Intrinsics.areEqual(request.method(), "GET")) {
            String strQuery = request.url().query();
            if (strQuery != null) {
                byte[] bytes = strQuery.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes != null) {
                    length = bytes.length;
                } else {
                    length = 0;
                }
            } else {
                length = 0;
            }
            if (length >= 1024) {
                m42801v(request, 0, length);
            } else if (length >= 800) {
                m42801v(request, 1, length);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0067  */
    /* JADX INFO: renamed from: x */
    public final void m42815x(Call call, Exception error) {
        try {
            if (call.getCanceled()) {
                m42812t();
            } else if (!C19332d.m42839c()) {
                m42812t();
            } else {
                m42792A(this, call, null, error, 2, null);
                m42812t();
            }
        } catch (Throwable th2) {
            try {
                boolean zStartsWith$default = true;
                if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof SSLException) && !(th2 instanceof ConnectionShutdownException)) {
                    if (th2 instanceof SecurityException) {
                        String message = th2.getMessage();
                        if (message != null) {
                            zStartsWith$default = StringsKt.startsWith$default(message, "Package android does not belong to", false, 2, (Object) null);
                        } else {
                            zStartsWith$default = false;
                        }
                    } else if (th2 instanceof IOException) {
                        String message2 = th2.getMessage();
                        if (message2 == null || (!StringsKt.startsWith$default(message2, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message2, "Software caused connection abort", false, 2, (Object) null) && !message2.equals("closed"))) {
                            zStartsWith$default = false;
                        }
                    } else if (!(th2 instanceof DataNullException)) {
                        zStartsWith$default = false;
                    }
                }
                if (!zStartsWith$default) {
                    C43174a.m94787c(th2, "NetworkChain:Http");
                } else {
                    C44128b.m97263g("NetworkChain:Http", th2);
                }
            } finally {
                m42812t();
            }
        }
    }
}
