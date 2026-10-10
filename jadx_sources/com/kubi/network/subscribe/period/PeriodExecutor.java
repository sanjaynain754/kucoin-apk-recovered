package com.kubi.network.subscribe.period;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.socket.utils.C19388d;
import com.kubi.network.socket.utils.C19391g;
import er.InterfaceC37236a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p807yr.C46558a;
import p841zr.InterfaceC46910a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PeriodExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001!B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006\""}, m90084d2 = {"Lcom/kubi/network/subscribe/period/PeriodExecutor;", "Landroid/os/HandlerThread;", "Lzr/a;", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "Ler/a;", "socketClient", "onetimeExecutor", "<init>", "(Ler/a;Lzr/a;)V", "", "start", "()V", "request", "d", "(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V", "c", "f", "", "e", "(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)I", "b", "Ler/a;", "Lzr/a;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "count", "Lyr/a;", "Lyr/a;", "heartbeatQueue", "", "Ljava/util/List;", "executeQueue", "g", "Companion", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPeriodExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodExecutor.kt\ncom/kubi/network/subscribe/period/PeriodExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n766#2:94\n857#2,2:95\n766#2:97\n857#2,2:98\n1855#2,2:100\n*S KotlinDebug\n*F\n+ 1 PeriodExecutor.kt\ncom/kubi/network/subscribe/period/PeriodExecutor\n*L\n72#1:94\n72#1:95,2\n74#1:97\n74#1:98,2\n76#1:100,2\n*E\n"})
public final class PeriodExecutor extends HandlerThread implements InterfaceC46910a<PeriodRequest> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a socketClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46910a<PeriodRequest> onetimeExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger count;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C46558a heartbeatQueue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<PeriodRequest> executeQueue;

    /* JADX INFO: renamed from: com.kubi.network.subscribe.period.PeriodExecutor$a */
    /* JADX INFO: compiled from: PeriodExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/kubi/network/subscribe/period/PeriodExecutor$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "(Landroid/os/Message;)V", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class HandlerC19395a extends Handler {
        public HandlerC19395a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 1) {
                PeriodExecutor.this.m43089f();
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodExecutor(@NotNull InterfaceC37236a socketClient, @NotNull InterfaceC46910a<PeriodRequest> onetimeExecutor) {
        super("PeriodExecutor");
        Intrinsics.checkNotNullParameter(socketClient, "socketClient");
        Intrinsics.checkNotNullParameter(onetimeExecutor, "onetimeExecutor");
        this.socketClient = socketClient;
        this.onetimeExecutor = onetimeExecutor;
        this.count = new AtomicInteger();
        this.heartbeatQueue = new C46558a();
        this.executeQueue = new ArrayList();
        start();
    }

    /* JADX INFO: renamed from: c */
    public final void m43086c() {
        synchronized (this.heartbeatQueue) {
            this.heartbeatQueue.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p841zr.InterfaceC46910a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo43081a(@NotNull PeriodRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (this.heartbeatQueue) {
            this.heartbeatQueue.m102708a(request);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m43088e(PeriodRequest periodRequest) {
        return Intrinsics.areEqual(this.socketClient.mo42858c(), "connected") ? periodRequest.getConnectedPeriod() : periodRequest.getDisconnectPeriod();
    }

    /* JADX INFO: renamed from: f */
    public final void m43089f() {
        if (C19391g.f36153a.m43065h()) {
            if (this.count.compareAndSet(Integer.MAX_VALUE, 0)) {
                C44128b.m97266j("CATEGORY_SOCKET", "Socket轮训计数重置");
            } else {
                this.count.incrementAndGet();
            }
            synchronized (this.heartbeatQueue) {
                this.executeQueue.clear();
                CollectionsKt.addAll(this.executeQueue, this.heartbeatQueue);
            }
            boolean zM43053b = C19388d.f36150a.m43053b();
            List<PeriodRequest> list = this.executeQueue;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.count.get() % m43088e((PeriodRequest) obj) == 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                PeriodRequest periodRequest = (PeriodRequest) obj2;
                if (zM43053b || periodRequest.getSupportBackground()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.onetimeExecutor.mo43081a((PeriodRequest) it.next());
            }
        }
    }

    @Override // java.lang.Thread
    public void start() {
        super.start();
        new HandlerC19395a(getLooper()).sendEmptyMessageDelayed(1, 1000L);
    }
}
