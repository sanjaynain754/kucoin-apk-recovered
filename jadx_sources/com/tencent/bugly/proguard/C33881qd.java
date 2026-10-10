package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.traffic.custom.CustomTrafficStatistic;
import com.tencent.bugly.traffic.custom.SocketInfo;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLException;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.qd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33881qd extends EventListener {

    /* JADX INFO: renamed from: c */
    public static final String f71565c = "Okhttp3EventListener";

    /* JADX INFO: renamed from: e */
    public static String f71567e;

    /* JADX INFO: renamed from: a */
    public EventListener f71569a;

    /* JADX INFO: renamed from: b */
    public boolean f71570b;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap<String, String> f71566d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap<Call, SocketInfo> f71568f = new ConcurrentHashMap<>();

    public C33881qd(EventListener eventListener) {
        this.f71570b = false;
        this.f71569a = eventListener;
    }

    /* JADX INFO: renamed from: a */
    public final SocketInfo m74686a(Call call, boolean z11) {
        ConcurrentHashMap<Call, SocketInfo> concurrentHashMap = f71568f;
        SocketInfo socketInfo = concurrentHashMap.get(call);
        if (socketInfo != null || !z11) {
            return socketInfo;
        }
        SocketInfo socketInfo2 = new SocketInfo();
        concurrentHashMap.put(call, socketInfo2);
        return socketInfo2;
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        SocketInfo socketInfoM74686a;
        super.callEnd(call);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.isEnd = true;
            socketInfoM74686a.hasSaved = true;
            m74689a(call);
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.callEnd(call);
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        SocketInfo socketInfoM74686a;
        super.callFailed(call, iOException);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            m74688a(iOException, socketInfoM74686a);
            m74689a(call);
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.callFailed(call, iOException);
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        super.callStart(call);
        boolean z11 = ConfigProxy.INSTANCE.getConfig().m77072c("traffic_detail").config.f70122g;
        this.f71570b = z11;
        if (z11) {
            try {
                SocketInfo socketInfoM74686a = m74686a(call, true);
                NetworkWatcher networkWatcher = NetworkWatcher.INSTANCE;
                if (networkWatcher.isWifiAvailable()) {
                    socketInfoM74686a.networkType = 1;
                } else if (networkWatcher.isNetAvailable()) {
                    socketInfoM74686a.networkType = 2;
                } else {
                    socketInfoM74686a.networkType = 3;
                }
                if (LifecycleCallback.INSTANCE.isCurrentForeground()) {
                    socketInfoM74686a.frontState = 1;
                } else {
                    socketInfoM74686a.frontState = 2;
                }
                socketInfoM74686a.type = "custom";
                socketInfoM74686a.pageId = C33657g.m73094e();
                socketInfoM74686a.startTimeStamp = System.currentTimeMillis();
                socketInfoM74686a.method = call.request().method();
                socketInfoM74686a.url = call.request().url().getUrl();
                socketInfoM74686a.protocol = call.request().url().url().getProtocol();
                socketInfoM74686a.ssl = call.request().isHttps();
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77134w(f71565c, "callStart failed, " + th2.getMessage());
            }
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.callStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        if (this.f71570b) {
            boolean z11 = false;
            SocketInfo socketInfoM74686a = m74686a(call, false);
            if (socketInfoM74686a != null) {
                socketInfoM74686a.connEnd = System.currentTimeMillis();
                if (proxy.address() != null) {
                    z11 = true;
                }
                socketInfoM74686a.isProxy = z11;
                try {
                    if (inetSocketAddress.getAddress() != null) {
                        socketInfoM74686a.port = inetSocketAddress.getPort();
                        socketInfoM74686a.f72680ip = inetSocketAddress.getAddress().getHostAddress();
                        String hostName = inetSocketAddress.getHostName();
                        socketInfoM74686a.host = hostName;
                        f71566d.put(hostName, socketInfoM74686a.f72680ip);
                    }
                } catch (Throwable unused) {
                    Logger.INSTANCE.mo77134w(f71565c, "get inetSocket info failed from connectEnd");
                }
            }
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        SocketInfo socketInfoM74686a;
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            if (socketInfoM74686a.sslConnStart != 0 && socketInfoM74686a.sslConnEnd == 0) {
                socketInfoM74686a.sslConnEnd = System.currentTimeMillis();
            }
            if (socketInfoM74686a.connStart != 0 && socketInfoM74686a.connEnd == 0) {
                socketInfoM74686a.connEnd = System.currentTimeMillis();
            }
            try {
                if (inetSocketAddress.getAddress() != null) {
                    socketInfoM74686a.port = inetSocketAddress.getPort();
                    socketInfoM74686a.f72680ip = inetSocketAddress.getAddress().getHostAddress();
                    String hostName = inetSocketAddress.getHostName();
                    socketInfoM74686a.host = hostName;
                    f71566d.put(hostName, socketInfoM74686a.f72680ip);
                }
            } catch (Throwable unused) {
                Logger.INSTANCE.mo77134w(f71565c, "get inetSocket info failed from connectFailed");
            }
            m74688a(iOException, socketInfoM74686a);
            m74689a(call);
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        SocketInfo socketInfoM74686a;
        super.connectStart(call, inetSocketAddress, proxy);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.connStart = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.connectStart(call, inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        SocketInfo socketInfoM74686a;
        super.connectionAcquired(call, connection);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            if (socketInfoM74686a.dnsStart == 0) {
                socketInfoM74686a.isDnsCache = true;
            } else {
                socketInfoM74686a.isDnsCache = false;
            }
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.connectionAcquired(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        super.connectionReleased(call, connection);
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.connectionReleased(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
        SocketInfo socketInfoM74686a;
        super.dnsEnd(call, str, list);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.dnsEnd = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.dnsEnd(call, str, list);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String str) {
        SocketInfo socketInfoM74686a;
        super.dnsStart(call, str);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.dnsStart = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.dnsStart(call, str);
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long j11) {
        SocketInfo socketInfoM74686a;
        super.requestBodyEnd(call, j11);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.reqEnd = System.currentTimeMillis();
            socketInfoM74686a.sendBytes += j11;
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.requestBodyEnd(call, j11);
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        SocketInfo socketInfoM74686a;
        super.requestBodyStart(call);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null && socketInfoM74686a.reqStart == 0) {
            socketInfoM74686a.reqStart = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.requestBodyStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        SocketInfo socketInfoM74686a;
        super.requestHeadersEnd(call, request);
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.requestHeadersEnd(call, request);
        }
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.reqEnd = System.currentTimeMillis();
            String strHeader = request.header("User-Agent");
            String str = f71567e;
            if (str == null || strHeader == null || strHeader.contains(str)) {
                try {
                    socketInfoM74686a.sendBytes += request.headers().byteCount();
                    socketInfoM74686a.url = request.url().getUrl();
                    m74685a(request.headers(), socketInfoM74686a.requestHeaders, socketInfoM74686a);
                } catch (Exception e11) {
                    Logger.INSTANCE.mo77134w(f71565c, "parse header failed, " + e11);
                }
            }
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        SocketInfo socketInfoM74686a;
        super.requestHeadersStart(call);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.reqStart = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.requestHeadersStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long j11) {
        SocketInfo socketInfoM74686a;
        super.responseBodyEnd(call, j11);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.receivedBytes += j11;
            socketInfoM74686a.respEnd = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.responseBodyEnd(call, j11);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        super.responseBodyStart(call);
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.responseBodyStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        super.responseHeadersEnd(call, response);
        if (this.f71570b) {
            try {
                SocketInfo socketInfoM74686a = m74686a(call, false);
                if (socketInfoM74686a != null) {
                    socketInfoM74686a.statusCode = response.code();
                    socketInfoM74686a.receivedBytes += response.headers().byteCount();
                    m74685a(response.headers(), socketInfoM74686a.responseHeaders, null);
                }
            } catch (Exception e11) {
                Logger.INSTANCE.mo77134w(f71565c, "responseHeadersEnd may be failed, " + e11);
            }
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.responseHeadersEnd(call, response);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        SocketInfo socketInfoM74686a;
        super.responseHeadersStart(call);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            socketInfoM74686a.respStart = jCurrentTimeMillis;
            socketInfoM74686a.firstPacketPeriod = jCurrentTimeMillis - socketInfoM74686a.reqEnd;
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.responseHeadersStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        SocketInfo socketInfoM74686a;
        super.secureConnectEnd(call, handshake);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.sslConnEnd = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.secureConnectEnd(call, handshake);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        SocketInfo socketInfoM74686a;
        super.secureConnectStart(call);
        if (this.f71570b && (socketInfoM74686a = m74686a(call, false)) != null) {
            socketInfoM74686a.sslConnStart = System.currentTimeMillis();
        }
        EventListener eventListener = this.f71569a;
        if (eventListener != null) {
            eventListener.secureConnectStart(call);
        }
    }

    public C33881qd() {
        this.f71569a = null;
        this.f71570b = false;
    }

    /* JADX INFO: renamed from: a */
    public static void m74685a(Headers headers, Map<String, String> map, SocketInfo socketInfo) {
        if (socketInfo != null) {
            if (socketInfo.requestHeaders.containsKey("content-encoding") && "gzip".equalsIgnoreCase(socketInfo.requestHeaders.get("content-encoding"))) {
                socketInfo.gzip = true;
            }
            if (socketInfo.requestHeaders.containsKey("transfer-encoding") && "chunked".equalsIgnoreCase(socketInfo.requestHeaders.get("transfer-encoding"))) {
                socketInfo.chunked = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74688a(Exception exc, SocketInfo socketInfo) {
        if (exc instanceof IOException) {
            if (m74690a(exc)) {
                socketInfo.errorCode = C33975v7.f72336i;
                socketInfo.statusCode = C33975v7.f72336i;
                return;
            }
            String message = exc.getMessage();
            if (message != null && message.contains("ftruncate failed: ENOENT (No such file or directory)")) {
                socketInfo.errorCode = C33975v7.f72337j;
                socketInfo.statusCode = C33975v7.f72337j;
                return;
            }
        }
        if (exc instanceof UnknownHostException) {
            socketInfo.errorCode = 901;
            socketInfo.statusCode = 901;
            return;
        }
        if (exc instanceof SocketTimeoutException) {
            socketInfo.errorCode = 903;
            socketInfo.statusCode = 903;
            return;
        }
        if (exc instanceof ConnectException) {
            socketInfo.errorCode = 902;
            socketInfo.statusCode = 902;
        } else if (exc instanceof MalformedURLException) {
            socketInfo.errorCode = 900;
            socketInfo.statusCode = 900;
        } else if (exc instanceof SSLException) {
            socketInfo.errorCode = C33975v7.f72335h;
            socketInfo.statusCode = C33975v7.f72335h;
        } else {
            socketInfo.errorCode = -1;
            socketInfo.statusCode = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74690a(Exception exc) {
        if (exc == null) {
            return false;
        }
        try {
            return (exc instanceof SocketException) && exc.getMessage().contains("recvfrom failed: ECONNRESET (Connection reset by peer)");
        } catch (Exception e11) {
            Logger.INSTANCE.exception(f71565c, "isSocketECONNRESET error", e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74689a(Call call) {
        if (this.f71570b) {
            SocketInfo socketInfoM74686a = m74686a(call, false);
            if (socketInfoM74686a != null) {
                m74687a(socketInfoM74686a);
                CustomTrafficStatistic.getInstance().addHttpToQueue(socketInfoM74686a);
            }
            f71568f.remove(call);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74687a(SocketInfo socketInfo) {
        socketInfo.threadId = Thread.currentThread().getId();
        socketInfo.endTimeStamp = System.currentTimeMillis();
        if (TextUtils.isEmpty(socketInfo.host) && TextUtils.isEmpty(socketInfo.url)) {
            try {
                String host = new URL(socketInfo.url).getHost();
                socketInfo.host = host;
                socketInfo.f72680ip = f71566d.get(host);
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77134w(f71565c, "fill socket has failed, ", th2.getMessage());
            }
        }
    }
}
