package com.kubi.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Restful.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0016B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00028\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/restful/ServiceMethod;", "Resp", "Return", "", "Lcom/kubi/restful/RequestFactory;", "factory", "Lcom/kubi/restful/c;", "callAdapter", "Lcom/kubi/restful/u;", "returnAdapter", "<init>", "(Lcom/kubi/restful/RequestFactory;Lcom/kubi/restful/c;Lcom/kubi/restful/u;)V", "", "args", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/kubi/restful/RequestFactory;", "b", "Lcom/kubi/restful/c;", "c", "Lcom/kubi/restful/u;", "d", "Companion", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class ServiceMethod<Resp, Return> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final RequestFactory factory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC23187c<Resp> callAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC23205u<Resp, Return> returnAdapter;

    /* JADX INFO: compiled from: Restful.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/restful/ServiceMethod$Companion;", "", "<init>", "()V", "Resp", "Return", "Lcom/kubi/restful/n;", "restful", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "Lcom/kubi/restful/ServiceMethod;", "create", "(Lcom/kubi/restful/n;Ljava/lang/reflect/Method;)Lcom/kubi/restful/ServiceMethod;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <Resp, Return> ServiceMethod<Resp, Return> create(@NotNull C23198n restful, @NotNull Method method) {
            Intrinsics.checkNotNullParameter(restful, "restful");
            Intrinsics.checkNotNullParameter(method, "method");
            return new ServiceMethod<>(RequestFactory.INSTANCE.create(method), restful.getCallFactory().create(), restful.getReturnFactory().create());
        }
    }

    public ServiceMethod(@NotNull RequestFactory factory, @NotNull InterfaceC23187c<Resp> callAdapter, @NotNull InterfaceC23205u<Resp, Return> returnAdapter) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(callAdapter, "callAdapter");
        Intrinsics.checkNotNullParameter(returnAdapter, "returnAdapter");
        this.factory = factory;
        this.callAdapter = callAdapter;
        this.returnAdapter = returnAdapter;
    }

    /* JADX INFO: renamed from: a */
    public final Return m55647a(@NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        InterfaceC23186b<Resp> interfaceC23186bMo55655a = this.callAdapter.mo55655a(this.factory.m55637a(args));
        Class<?> resultType = this.factory.m55638b();
        InterfaceC23205u<Resp, Return> interfaceC23205u = this.returnAdapter;
        Intrinsics.checkNotNullExpressionValue(resultType, "resultType");
        return interfaceC23205u.mo55679a(interfaceC23186bMo55655a, resultType);
    }
}
