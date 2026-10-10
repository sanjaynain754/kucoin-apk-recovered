package com.kubi.flutter.network.socket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.flutter.network.channel.NetworkChannel;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.utils.C19318d;
import com.kubi.network.api.subscribe.utils.ChannelUtilsKt;
import er.InterfaceC37236a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p263fg.C37463l;
import p263fg.InterfaceC37458g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.network.socket.l */
/* JADX INFO: compiled from: SocketKCClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R4\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/kubi/flutter/network/socket/l;", "Lcom/kubi/flutter/network/socket/a;", "", "channelName", "Lfg/g;", "Lfg/l;", "channelCodec", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "channelProxy", "<init>", "(Ljava/lang/String;Lfg/g;Lcom/kubi/flutter/network/channel/NetworkChannel;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onDetachedFromEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "", "arguments", "k", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "j", "Ljava/lang/String;", "Lfg/g;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/kubi/flutter/network/channel/NetworkChannel;", "Ljava/util/HashMap;", "Lio/reactivex/disposables/Disposable;", "Lkotlin/collections/HashMap;", "m", "Ljava/util/HashMap;", "requestCache", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketKCClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketKCClient.kt\ncom/kubi/flutter/network/socket/SocketKCClient\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,86:1\n216#2,2:87\n*S KotlinDebug\n*F\n+ 1 SocketKCClient.kt\ncom/kubi/flutter/network/socket/SocketKCClient\n*L\n30#1:87,2\n*E\n"})
public final class C12627l extends AbstractC12616a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37458g<C37463l> channelCodec;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final NetworkChannel channelProxy;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Disposable> requestCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12627l(@NotNull String channelName, @NotNull InterfaceC37458g<C37463l> channelCodec, @NotNull NetworkChannel channelProxy) {
        super(channelName, channelProxy);
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelCodec, "channelCodec");
        Intrinsics.checkNotNullParameter(channelProxy, "channelProxy");
        this.channelName = channelName;
        this.channelCodec = channelCodec;
        this.channelProxy = channelProxy;
        this.requestCache = new HashMap<>();
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m23865u(C19318d c19318d, SubscribeMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSocketMessage()) {
            return c19318d.m42761a(it.getTopic());
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m23866v(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m23867w(C12627l c12627l, C37463l c37463l, SubscribeMessage subscribeMessage) {
        c12627l.m23800f("message", c12627l.channelCodec.mo84253b(new NetworkMessage<>(c37463l.getId(), subscribeMessage)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m23869y(C12627l c12627l, C37463l c37463l, Throwable th2) {
        c12627l.m23800f("message", c12627l.channelCodec.mo84253b(new NetworkMessage<>(c37463l.getId(), new SubscribeMessage(c37463l.getId(), null, null, null, null, th2, System.currentTimeMillis(), 30, null))));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.flutter.network.socket.AbstractC12616a
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo23831i(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        Disposable disposableRemove;
        if (!(obj instanceof String)) {
            throw new RuntimeException("arguments must be String");
        }
        synchronized (this.requestCache) {
            disposableRemove = this.requestCache.remove((String) obj);
        }
        if (disposableRemove != null) {
            disposableRemove.dispose();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    @Override // com.kubi.flutter.network.socket.AbstractC12616a
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo23832k(@Nullable Object obj, @NotNull Continuation<Object> continuation) {
        Observable<SubscribeMessage> observableM42742f;
        Observable<SubscribeMessage> observableM42742f2;
        InterfaceC37458g<C37463l> interfaceC37458g = this.channelCodec;
        if (obj == null) {
            throw new NullPointerException("arguments is null");
        }
        final C37463l c37463l = (C37463l) interfaceC37458g.mo84252a(obj);
        if (c37463l.getFilter()) {
            final C19318d c19318d = new C19318d(c37463l.getRequest().getTopic());
            InterfaceC37236a networkClient = getNetworkClient();
            if (networkClient == null || (observableM42742f2 = ChannelUtilsKt.m42742f(networkClient, c37463l.getRequest())) == null) {
                observableM42742f = null;
            } else {
                final Function1 function1 = new Function1() { // from class: com.kubi.flutter.network.socket.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(C12627l.m23865u(c19318d, (SubscribeMessage) obj2));
                    }
                };
                observableM42742f = observableM42742f2.filter(new Predicate() { // from class: com.kubi.flutter.network.socket.g
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Object obj2) {
                        return C12627l.m23866v(function1, obj2);
                    }
                });
            }
        } else {
            InterfaceC37236a networkClient2 = getNetworkClient();
            if (networkClient2 != null) {
                observableM42742f = ChannelUtilsKt.m42742f(networkClient2, c37463l.getRequest());
            } else {
                observableM42742f = null;
            }
        }
        if (observableM42742f != null) {
            final Function1 function2 = new Function1() { // from class: com.kubi.flutter.network.socket.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12627l.m23867w(this.f22044b, c37463l, (SubscribeMessage) obj2);
                }
            };
            Consumer<? super SubscribeMessage> consumer = new Consumer() { // from class: com.kubi.flutter.network.socket.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    C12627l.m23868x(function2, obj2);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.flutter.network.socket.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12627l.m23869y(this.f22047b, c37463l, (Throwable) obj2);
                }
            };
            Disposable disposableSubscribe = observableM42742f.subscribe(consumer, new Consumer() { // from class: com.kubi.flutter.network.socket.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    C12627l.m23870z(function3, obj2);
                }
            });
            if (disposableSubscribe != null) {
                synchronized (this.requestCache) {
                    this.requestCache.put(c37463l.getId(), disposableSubscribe);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return this.channelCodec.mo84254c(NetworkResponse.Companion.success$default(NetworkResponse.INSTANCE, null, 1, null));
    }

    @Override // com.kubi.flutter.network.socket.AbstractC12616a, com.kubi.flutter.network.channel.BaseNetworkClient, com.kubi.flutter.network.channel.InterfaceC12605c
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.onDetachedFromEngine(binding);
        synchronized (this.requestCache) {
            try {
                Iterator<Map.Entry<String, Disposable>> it = this.requestCache.entrySet().iterator();
                while (it.hasNext()) {
                    Disposable value = it.next().getValue();
                    if (value != null) {
                        value.dispose();
                    }
                }
                this.requestCache.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m23868x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final void m23870z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
