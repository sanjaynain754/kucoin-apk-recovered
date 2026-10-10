package com.kubi.network.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kr.InterfaceC41974b;
import kr.InterfaceC41975c;
import kr.InterfaceC41976d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCNetwork.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000 \u0016*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/network/restful/ServiceMethod;", "", "ResponseIn", "ResponseOut", "ResponseStream", "Lcom/kubi/network/restful/RequestFactory;", "factory", "Lkr/b;", "adapterFactory", "Lkr/d;", "converterFactory", "<init>", "(Lcom/kubi/network/restful/RequestFactory;Lkr/b;Lkr/d;)V", "", "args", "b", "([Ljava/lang/Object;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/network/restful/RequestFactory;", "Lkr/b;", "c", "Lkr/d;", "d", "Companion", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ServiceMethod<ResponseIn, ResponseOut, ResponseStream> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RequestFactory factory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41974b adapterFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41976d converterFactory;

    /* JADX INFO: compiled from: KCNetwork.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/network/restful/ServiceMethod$Companion;", "", "<init>", "()V", "Lcom/kubi/network/restful/b;", "restful", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "Lcom/kubi/network/restful/ServiceMethod;", "create", "(Lcom/kubi/network/restful/b;Ljava/lang/reflect/Method;)Lcom/kubi/network/restful/ServiceMethod;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ServiceMethod<Object, Object, Object> create(@NotNull C19321b restful, @NotNull Method method) {
            Intrinsics.checkNotNullParameter(restful, "restful");
            Intrinsics.checkNotNullParameter(method, "method");
            return new ServiceMethod<>(RequestFactory.INSTANCE.create(method), restful.getAdapterFactory(), restful.getConverterFactory());
        }
    }

    public ServiceMethod(@NotNull RequestFactory factory, @NotNull InterfaceC41974b adapterFactory, @NotNull InterfaceC41976d converterFactory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        this.factory = factory;
        this.adapterFactory = adapterFactory;
        this.converterFactory = converterFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Object m42769b(@NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        final C19322c c19322cM42766a = this.factory.m42766a(args);
        Type returnType = this.factory.m42767b();
        InterfaceC41974b interfaceC41974b = this.adapterFactory;
        Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
        return interfaceC41974b.mo85874a(returnType, new Function1<Type, InterfaceC41975c<ResponseIn, ResponseOut>>(this) { // from class: com.kubi.network.restful.ServiceMethod$invoke$callAdapter$1
            final /* synthetic */ ServiceMethod<ResponseIn, ResponseOut, ResponseStream> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final InterfaceC41975c<ResponseIn, ResponseOut> invoke(@NotNull Type it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.converterFactory.mo85877a(c19322cM42766a, it);
            }
        }).mo85873a(c19322cM42766a);
    }
}
