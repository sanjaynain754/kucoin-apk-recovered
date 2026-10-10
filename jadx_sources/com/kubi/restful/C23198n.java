package com.kubi.restful;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33590cg;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.n */
/* JADX INFO: compiled from: Restful.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/restful/n;", "", "Lcom/kubi/restful/d;", "callFactory", "Lcom/kubi/restful/v;", "returnFactory", "<init>", "(Lcom/kubi/restful/d;Lcom/kubi/restful/v;)V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", NotificationCompat.CATEGORY_SERVICE, "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "Lcom/kubi/restful/ServiceMethod;", "e", "(Ljava/lang/reflect/Method;)Lcom/kubi/restful/ServiceMethod;", "Ljava/util/concurrent/ConcurrentHashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/ConcurrentHashMap;", C33590cg.f69440j, "Lcom/kubi/restful/d;", "c", "()Lcom/kubi/restful/d;", "Lcom/kubi/restful/v;", "d", "()Lcom/kubi/restful/v;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class C23198n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ConcurrentHashMap<Method, ServiceMethod<?, ?>> cache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC23188d callFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC23206v returnFactory;

    /* JADX INFO: renamed from: com.kubi.restful.n$a */
    /* JADX INFO: compiled from: Restful.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/restful/n$a;", "", "<init>", "()V", "Lcom/kubi/restful/n;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/restful/n;", "Lcom/kubi/restful/d;", "Lcom/kubi/restful/d;", "callFactory", "Lcom/kubi/restful/v;", "b", "Lcom/kubi/restful/v;", "returnFactory", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public InterfaceC23188d callFactory;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public InterfaceC23206v returnFactory;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C23198n m55669a() {
            if (this.callFactory == null) {
                this.callFactory = new C23200p();
            }
            if (this.returnFactory == null) {
                this.returnFactory = new C23204t();
            }
            InterfaceC23188d interfaceC23188d = this.callFactory;
            Intrinsics.checkNotNull(interfaceC23188d);
            InterfaceC23206v interfaceC23206v = this.returnFactory;
            Intrinsics.checkNotNull(interfaceC23206v);
            return new C23198n(interfaceC23188d, interfaceC23206v);
        }
    }

    /* JADX INFO: renamed from: com.kubi.restful.n$b */
    /* JADX INFO: compiled from: Restful.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, m90084d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous parameter 0>", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {1, 4, 2})
    public static final class b implements InvocationHandler {
        public b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            C23198n c23198n = C23198n.this;
            Intrinsics.checkNotNullExpressionValue(method, "method");
            ServiceMethod serviceMethodM55668e = c23198n.m55668e(method);
            if (objArr == null) {
                objArr = new Object[0];
            }
            return serviceMethodM55668e.m55647a(objArr);
        }
    }

    public C23198n(@NotNull InterfaceC23188d callFactory, @NotNull InterfaceC23206v returnFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(returnFactory, "returnFactory");
        this.callFactory = callFactory;
        this.returnFactory = returnFactory;
        this.cache = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m55665b(@NotNull Class<T> service) {
        Intrinsics.checkNotNullParameter(service, "service");
        return (T) Proxy.newProxyInstance(service.getClassLoader(), new Class[]{service}, new b());
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC23188d getCallFactory() {
        return this.callFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC23206v getReturnFactory() {
        return this.returnFactory;
    }

    /* JADX INFO: renamed from: e */
    public final ServiceMethod<?, ?> m55668e(Method method) {
        ServiceMethod<?, ?> serviceMethodCreate;
        ServiceMethod<?, ?> serviceMethod = this.cache.get(method);
        if (serviceMethod != null) {
            return serviceMethod;
        }
        synchronized (this.cache) {
            try {
                serviceMethodCreate = this.cache.get(method);
                if (serviceMethodCreate == null) {
                    serviceMethodCreate = ServiceMethod.INSTANCE.create(this, method);
                    ConcurrentHashMap<Method, ServiceMethod<?, ?>> concurrentHashMap = this.cache;
                    Intrinsics.checkNotNull(serviceMethodCreate);
                    concurrentHashMap.put(method, serviceMethodCreate);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNull(serviceMethodCreate);
        return serviceMethodCreate;
    }
}
