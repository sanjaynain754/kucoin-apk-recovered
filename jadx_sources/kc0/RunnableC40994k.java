package kc0;

import com.google.common.math.LongMath;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencentcloudapi.cls.android.cls.Cls$LogGroup;
import com.tencentcloudapi.cls.android.producer.common.LogException;
import com.tencentcloudapi.cls.android.producer.http.comm.HttpMethod;
import com.tencentcloudapi.cls.android.producer.request.PutLogsRequest;
import com.tencentcloudapi.cls.android.producer.response.PutLogsResponse;
import hc0.C38168a;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import jc0.C40384b;
import lc0.C42169a;
import mc0.C42508b;
import oc0.C43016c;
import oc0.C43018e;

/* JADX INFO: renamed from: kc0.k */
/* JADX INFO: compiled from: SendProducerBatchTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC40994k implements Runnable {

    /* JADX INFO: renamed from: b */
    public final DelayedC40992i f91113b;

    /* JADX INFO: renamed from: c */
    public final C40384b f91114c;

    /* JADX INFO: renamed from: d */
    public final C40993j f91115d;

    /* JADX INFO: renamed from: e */
    public final BlockingQueue<DelayedC40992i> f91116e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<DelayedC40992i> f91117f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f91118g;

    /* JADX INFO: renamed from: i */
    public final PutLogsResponse m89819i(Map<String, String> map, Map<String, String> map2, byte[] bArr) throws LogException {
        map2.put("Content-Length", String.valueOf(bArr.length));
        try {
            map2.put("Authorization", C43018e.m94491c(this.f91114c.m88993k(), this.f91114c.m88994l(), HttpMethod.POST.toString(), "/structuredlog", map, map2, 300000L));
            map2.put("x-cls-compress-type", "lz4");
            map2.put("x-cls-add-source", "1");
            if (!this.f91114c.m88995m().isEmpty()) {
                map2.put("X-Cls-Token", this.f91114c.m88995m());
            }
            map2.put("User-Agent", "cls-android-sdk-1.0.3");
            URI uriM89816f = m89816f();
            byte[] bArrM94486a = C43016c.m94486a(bArr);
            C42508b c42508bM89811c = m89811c(uriM89816f, map, map2, bArrM94486a, bArrM94486a.length);
            map2.put("Content-Length", String.valueOf(bArrM94486a.length));
            try {
                PutLogsResponse putLogsResponseM92588b = C42169a.m92588b(c42508bM89811c);
                int iIntValue = putLogsResponseM92588b.GetHttpStatusCode().intValue();
                if (iIntValue == 200) {
                    return putLogsResponseM92588b;
                }
                if (iIntValue == 429) {
                    throw new LogException("SpeedQuotaExceed", "speed quota exceed");
                }
                if (iIntValue != 500) {
                    throw new LogException("BadResponse", putLogsResponseM92588b.GetAllHeaders().toString());
                }
                throw new LogException("InternalError", "internal server error");
            } catch (Exception e11) {
                throw new LogException("SendFailed", e11.getMessage());
            }
        } catch (UnsupportedEncodingException e12) {
            throw new LogException("EncodingException", e12.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m89820j(long j11) throws InterruptedException {
        long j12;
        PutLogsResponse putLogsResponseM89819i = null;
        try {
            PutLogsRequest putLogsRequestM89813b = m89813b(this.f91113b);
            Map<String, String> mapM89815e = m89815e();
            putLogsRequestM89813b.SetParam(TUIConstants.TUICommunity.TOPIC_ID, putLogsRequestM89813b.GetTopic());
            putLogsResponseM89819i = m89819i(putLogsRequestM89813b.GetAllParams(), mapM89815e, putLogsRequestM89813b.GetLogGroupBytes(this.f91114c.m88997o(), this.f91113b.m89797i()));
            j12 = j11;
            try {
                this.f91113b.m89789a(new C40984a(true, putLogsResponseM89819i.GetRequestId(), "", "", j12));
                this.f91116e.put(this.f91113b);
            } catch (Exception e11) {
                e = e11;
                Exception exc = e;
                this.f91113b.m89789a(m89812a(exc, j12, putLogsResponseM89819i != null ? putLogsResponseM89819i.GetRequestId() : ""));
                if (m89818h(exc)) {
                    this.f91117f.put(this.f91113b);
                    return;
                }
                this.f91113b.m89804p(System.currentTimeMillis() + m89814d());
                try {
                    this.f91115d.m89808c(this.f91113b);
                } catch (IllegalStateException unused) {
                    if (this.f91115d.m89807b()) {
                        this.f91117f.put(this.f91113b);
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
            j12 = j11;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C42508b m89811c(URI uri, Map<String, String> map, Map<String, String> map2, byte[] bArr, long j11) {
        C42508b c42508b = new C42508b();
        c42508b.m93217k(HttpMethod.POST);
        c42508b.m93216j(uri);
        c42508b.m93219m("/structuredlog");
        c42508b.m93218l(map);
        c42508b.m93211e(map2);
        c42508b.m93209c(bArr);
        c42508b.m93210d(j11);
        return c42508b;
    }

    /* JADX INFO: renamed from: a */
    public final C40984a m89812a(Exception exc, long j11, String str) {
        if (!(exc instanceof LogException)) {
            return new C40984a(false, "", "BadResponse", exc.getMessage(), j11);
        }
        LogException logException = (LogException) exc;
        return new C40984a(false, str, logException.GetErrorCode(), logException.GetErrorMessage(), j11);
    }

    /* JADX INFO: renamed from: d */
    public final long m89814d() {
        long jM88983a = this.f91114c.m88983a() * LongMath.pow(2L, this.f91113b.m89798j());
        if (jM88983a <= 0) {
            jM88983a = this.f91114c.m88991i();
        }
        return Math.min(jM88983a, this.f91114c.m88991i());
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m89815e() {
        HashMap map = new HashMap(3);
        map.put("Content-Length", "0");
        map.put("Content-Type", "application/x-protobuf");
        map.put("Host", this.f91114c.m88986d());
        return map;
    }

    /* JADX INFO: renamed from: f */
    public final URI m89816f() {
        try {
            return new URI(this.f91114c.m88987e() + this.f91114c.m88986d());
        } catch (URISyntaxException e11) {
            throw new IllegalArgumentException("EndpointInvalid", e11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m89817g(Exception exc) {
        if (!(exc instanceof LogException)) {
            return false;
        }
        LogException logException = (LogException) exc;
        return logException.GetErrorCode().equals("SendFailed") || logException.GetErrorCode().equals("SpeedQuotaExceed");
    }

    public RunnableC40994k(DelayedC40992i delayedC40992i, C40384b c40384b, C40993j c40993j, BlockingQueue<DelayedC40992i> blockingQueue, BlockingQueue<DelayedC40992i> blockingQueue2, AtomicInteger atomicInteger) {
        this.f91113b = delayedC40992i;
        this.f91114c = c40384b;
        this.f91115d = c40993j;
        this.f91116e = blockingQueue;
        this.f91117f = blockingQueue2;
        this.f91118g = atomicInteger;
    }

    /* JADX INFO: renamed from: b */
    public final PutLogsRequest m89813b(DelayedC40992i delayedC40992i) {
        List<C40989f> listM89795g = delayedC40992i.m89795g();
        Cls$LogGroup.C35857a c35857aNewBuilder = Cls$LogGroup.newBuilder();
        Iterator<C40989f> it = listM89795g.iterator();
        while (it.hasNext()) {
            c35857aNewBuilder.m79341a(it.next().f91093a);
        }
        return new PutLogsRequest(delayedC40992i.m89799k(), this.f91114c.m88997o(), "", c35857aNewBuilder);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m89818h(Exception exc) {
        if (!m89817g(exc) || this.f91115d.m89807b()) {
            return true;
        }
        if (this.f91113b.m89798j() >= this.f91114c.m88992j() && this.f91117f.size() <= this.f91118g.get() / 2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m89820j(System.currentTimeMillis());
        } catch (Throwable th2) {
            C38168a.m86124a("producer", C38168a.m86126c("Uncaught error in send producer batch task, topic_id=" + this.f91113b.m89799k() + ", e=%s", th2.getMessage()));
        }
    }
}
