package com.kubi.httpdns.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.system.ErrnoException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.network.NetworkServiceImpl;
import com.tencent.qcloud.tuicore.TUIConstants;
import dk.C36724a;
import fk.InterfaceC37559a;
import fk.InterfaceC37560b;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p345ik.C38653a;
import p345ik.C38654b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NetworkServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/kubi/httpdns/network/NetworkServiceImpl;", "Lfk/b;", "Landroid/content/BroadcastReceiver;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;)V", "Lfk/a;", TUIConstants.TUIChat.CALL_BACK, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfk/a;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "c", "()V", "b", "Lcom/kubi/httpdns/HttpDnsConfig;", "", "Ljava/lang/String;", "lastNetworkType", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "callFlag", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/util/concurrent/CopyOnWriteArrayList;", "callbacks", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkServiceImpl.kt\ncom/kubi/httpdns/network/NetworkServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n*L\n1#1,69:1\n1855#2,2:70\n36#3,14:72\n*S KotlinDebug\n*F\n+ 1 NetworkServiceImpl.kt\ncom/kubi/httpdns/network/NetworkServiceImpl\n*L\n43#1:70,2\n62#1:72,14\n*E\n"})
public final class NetworkServiceImpl extends BroadcastReceiver implements InterfaceC37560b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String lastNetworkType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean callFlag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC37559a> callbacks;

    public NetworkServiceImpl(@NotNull HttpDnsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.lastNetworkType = C38653a.f86655a.m87376b(config.getContext());
        this.callFlag = new AtomicBoolean(false);
        this.callbacks = new CopyOnWriteArrayList<>();
        Context context = config.getContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Unit unit = Unit.INSTANCE;
        context.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: d */
    public static final void m31475d(NetworkServiceImpl this$0, Intent intent) {
        String action;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.callFlag.compareAndSet(false, true)) {
            if (intent != null) {
                try {
                    action = intent.getAction();
                } catch (Throwable th2) {
                    try {
                        if ((th2 instanceof SocketException) || (th2 instanceof NoServerException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ErrnoException)) {
                            C44128b.m97263g("NetworkServiceImpl", th2);
                        } else {
                            C36724a.m82299b(th2, "NetworkServiceImpl");
                        }
                        return;
                    } finally {
                        this$0.callFlag.set(false);
                    }
                }
            } else {
                action = null;
            }
            if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action)) {
                String strM87376b = C38653a.f86655a.m87376b(this$0.config.getContext());
                if (!Intrinsics.areEqual(strM87376b, C38654b.f86659a.m87383d()) && !Intrinsics.areEqual(strM87376b, this$0.lastNetworkType)) {
                    this$0.lastNetworkType = strM87376b;
                    this$0.m31477c();
                }
            }
            this$0.callFlag.set(false);
        }
    }

    @Override // fk.InterfaceC37560b
    /* JADX INFO: renamed from: a */
    public void mo31476a(@NotNull InterfaceC37559a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    /* JADX INFO: renamed from: c */
    public final void m31477c() {
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((InterfaceC37559a) it.next()).mo5301b();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable final Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C42917g.m94137c().execute(new Runnable() { // from class: fk.c
            @Override // java.lang.Runnable
            public final void run() {
                NetworkServiceImpl.m31475d(this.f83515b, intent);
            }
        });
    }
}
