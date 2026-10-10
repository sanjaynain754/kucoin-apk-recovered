package com.kubi.sdk.web.jsapi;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.util.C24329b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: JsEventQueue.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsEventQueue;", "Lcom/kubi/sdk/web/jsapi/d;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "", "isClosed", "()Z", "Lcom/kubi/sdk/web/jsapi/JsEventObj;", "eventObj", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/web/jsapi/JsEventObj;)V", "d", "c", "()V", "b", "e", "Lcom/kubi/sdk/web/core/WebBridge;", "getBridge", "()Lcom/kubi/sdk/web/core/WebBridge;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBlocking", "closed", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue;", "queue", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsEventQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsEventQueue.kt\ncom/kubi/sdk/web/jsapi/JsEventQueue\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,106:1\n85#2,4:107\n85#2,4:111\n*S KotlinDebug\n*F\n+ 1 JsEventQueue.kt\ncom/kubi/sdk/web/jsapi/JsEventQueue\n*L\n92#1:107,4\n103#1:111,4\n*E\n"})
public final class JsEventQueue implements InterfaceC24319d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebBridge bridge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isBlocking;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<JsEventObj> queue;

    public JsEventQueue(@NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
        this.isBlocking = new AtomicBoolean(true);
        this.closed = new AtomicBoolean(false);
        this.queue = new LinkedBlockingQueue<>();
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24319d
    /* JADX INFO: renamed from: a */
    public void mo58657a(@NotNull JsEventObj eventObj) {
        Intrinsics.checkNotNullParameter(eventObj, "eventObj");
        if (isClosed()) {
            C24329b.f48558a.m58864d("JsEventQueue", "JsEventQueue postEvent block~ [" + this.closed.get() + ']');
            return;
        }
        if (this.isBlocking.get()) {
            C43840a.m96550d("addQueue " + eventObj, "JsEventQueue");
            this.queue.add(eventObj);
            return;
        }
        C43840a.m96550d("realPostEvent " + eventObj, "JsEventQueue");
        C44128b.m97259c("JsEventQueue", "realPost " + eventObj);
        m58764e(eventObj);
    }

    /* JADX INFO: renamed from: b */
    public final void m58761b() {
        this.closed.set(true);
        int size = this.queue.size();
        this.queue.clear();
        if (size != 0) {
            C43846g.m96568c(new WebCoreMessage("cacheEvent not empty", "JsEventQueue", false, 4, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58763d(@NotNull JsEventObj eventObj) {
        Intrinsics.checkNotNullParameter(eventObj, "eventObj");
        if (isClosed()) {
            C24329b.f48558a.m58864d("JsEventQueue", "JsEventQueue postCallback block~ [" + this.closed.get() + ']');
            return;
        }
        C44128b.m97259c("JsEventQueue", "postCallback " + eventObj);
        m58764e(eventObj);
        m58762c();
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24319d
    public boolean isClosed() {
        return this.closed.get() || this.bridge.isClosed();
    }

    /* JADX INFO: renamed from: c */
    public final void m58762c() {
        if (isClosed()) {
            C24329b.f48558a.m58864d("JsEventQueue", "JsEventQueue pass block~ [" + this.closed.get() + ']');
            return;
        }
        C43840a.m96550d("pass", "JsEventQueue");
        if (this.isBlocking.getAndSet(false)) {
            C44128b.m97259c("JsEventQueue", "onPass");
            while (!isClosed() && this.queue.size() > 0) {
                try {
                    JsEventObj jsEventObjPoll = this.queue.poll();
                    if (jsEventObjPoll != null) {
                        C43840a.m96550d("pollQueue " + jsEventObjPoll, "JsEventQueue");
                        m58764e(jsEventObjPoll);
                    }
                } catch (Exception unused) {
                    C43846g.m96568c(new WebCoreMessage("cacheEvent pass error", "JsEventQueue", false, 4, null), null, 2, null);
                    this.queue.clear();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58764e(JsEventObj eventObj) {
        if (!isClosed() && this.bridge.m58663k()) {
            eventObj.m58760c(this.bridge.getWebView());
            return;
        }
        C24329b.f48558a.m58864d("JsEventQueue", "JsEventQueue realPostEvent block~ [" + this.closed.get() + ']');
    }
}
