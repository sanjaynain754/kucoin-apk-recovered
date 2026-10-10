package com.kubi.network.restful;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33590cg;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import kr.InterfaceC41974b;
import kr.InterfaceC41976d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377jr.C40466b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.network.restful.b */
/* JADX INFO: compiled from: KCNetwork.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/network/restful/b;", "", "Lkr/b;", "adapterFactory", "Lkr/d;", "converterFactory", "<init>", "(Lkr/b;Lkr/d;)V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", NotificationCompat.CATEGORY_SERVICE, "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "Lcom/kubi/network/restful/ServiceMethod;", "f", "(Ljava/lang/reflect/Method;)Lcom/kubi/network/restful/ServiceMethod;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkr/b;", "d", "()Lkr/b;", "Lkr/d;", "e", "()Lkr/d;", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", C33590cg.f69440j, "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCNetwork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCNetwork.kt\ncom/kubi/network/restful/KCNetwork\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n*S KotlinDebug\n*F\n+ 1 KCNetwork.kt\ncom/kubi/network/restful/KCNetwork\n*L\n25#1:139\n*E\n"})
public final class C19321b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41974b adapterFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41976d converterFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Method, ServiceMethod<?, ?, ?>> cache;

    /* JADX INFO: renamed from: com.kubi.network.restful.b$a */
    /* JADX INFO: compiled from: KCNetwork.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/restful/b$a;", "", "<init>", "()V", "Lkr/d;", "converterFactory", "c", "(Lkr/d;)Lcom/kubi/network/restful/b$a;", "Lkr/b;", "returnFactory", "b", "(Lkr/b;)Lcom/kubi/network/restful/b$a;", "Lcom/kubi/network/restful/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/network/restful/b;", "Lkr/b;", "callAdapterFactory", "Lkr/d;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public InterfaceC41974b callAdapterFactory;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public InterfaceC41976d converterFactory = new C40466b();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C19321b m42776a() {
            InterfaceC41974b interfaceC41974b = this.callAdapterFactory;
            Intrinsics.checkNotNull(interfaceC41974b);
            return new C19321b(interfaceC41974b, this.converterFactory);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m42777b(@NotNull InterfaceC41974b returnFactory) {
            Intrinsics.checkNotNullParameter(returnFactory, "returnFactory");
            this.callAdapterFactory = returnFactory;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m42778c(@NotNull InterfaceC41976d converterFactory) {
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            this.converterFactory = converterFactory;
            return this;
        }
    }

    public C19321b(@NotNull InterfaceC41974b adapterFactory, @NotNull InterfaceC41976d converterFactory) {
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        this.adapterFactory = adapterFactory;
        this.converterFactory = converterFactory;
        this.cache = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: c */
    public static final Object m42771c(C19321b this$0, Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(method, "method");
        ServiceMethod<?, ?, ?> serviceMethodM42775f = this$0.m42775f(method);
        if (objArr == null) {
            objArr = new Object[0];
        }
        return serviceMethodM42775f.m42769b(objArr);
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m42772b(@NotNull Class<T> service) {
        Intrinsics.checkNotNullParameter(service, "service");
        return (T) Proxy.newProxyInstance(service.getClassLoader(), new Class[]{service}, new InvocationHandler() { // from class: com.kubi.network.restful.a
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return C19321b.m42771c(this.f35925a, obj, method, objArr);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC41974b getAdapterFactory() {
        return this.adapterFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC41976d getConverterFactory() {
        return this.converterFactory;
    }

    /* JADX INFO: renamed from: f */
    public final ServiceMethod<?, ?, ?> m42775f(Method method) {
        ServiceMethod<Object, Object, Object> serviceMethodCreate;
        ServiceMethod<?, ?, ?> serviceMethod = this.cache.get(method);
        if (serviceMethod != null) {
            return serviceMethod;
        }
        synchronized (this.cache) {
            try {
                serviceMethodCreate = this.cache.get(method);
                if (serviceMethodCreate == null) {
                    serviceMethodCreate = ServiceMethod.INSTANCE.create(this, method);
                    ConcurrentHashMap<Method, ServiceMethod<?, ?, ?>> concurrentHashMap = this.cache;
                    Intrinsics.checkNotNull(serviceMethodCreate);
                    concurrentHashMap.put(method, serviceMethodCreate);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceMethodCreate;
    }
}
