package com.kubi.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RestfulCallFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006&"}, m90084d2 = {"Lcom/kubi/restful/RestfulCall;", "Resp", "Lcom/kubi/restful/b;", "Lcom/kubi/restful/r;", "request", "<init>", "(Lcom/kubi/restful/r;)V", "execute", "()Ljava/lang/Object;", "Lcom/kubi/restful/e;", TUIConstants.TUIChat.CALL_BACK, "", "e", "(Lcom/kubi/restful/e;)V", "b", "c", "()V", "d", "()Lcom/kubi/restful/RestfulCall;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "canceled", "executed", "Ljava/lang/reflect/Type;", "Lkotlin/Lazy;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/reflect/Type;", "type", "", "f", "()Ljava/lang/String;", "key", "Lcom/kubi/restful/a;", "g", "()Lcom/kubi/restful/a;", "proxy", "Lcom/kubi/restful/r;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class RestfulCall<Resp> implements InterfaceC23186b<Resp> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile boolean executed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Lazy type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy key;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy proxy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final C23202r request;

    /* JADX INFO: renamed from: c */
    public void m55641c() {
        this.canceled = true;
    }

    public RestfulCall(@NotNull C23202r request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.type = LazyKt.lazy(new Function0<Type>() { // from class: com.kubi.restful.RestfulCall$type$2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Type invoke() {
                return this.this$0.request.m55677d();
            }
        });
        this.key = LazyKt.lazy(new Function0<String>() { // from class: com.kubi.restful.RestfulCall$key$2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.request.m55675b();
            }
        });
        this.proxy = LazyKt.lazy(new Function0<AbstractC23185a>() { // from class: com.kubi.restful.RestfulCall$proxy$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final AbstractC23185a invoke() {
                return this.this$0.request.m55676c();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m55640b(@NotNull InterfaceC23189e<Resp> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.mo55657b(execute());
        } catch (Throwable th2) {
            callback.mo55656a(th2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public RestfulCall<Resp> m55642d() {
        return new RestfulCall<>(this.request);
    }

    /* JADX INFO: renamed from: e */
    public void m55643e(@NotNull InterfaceC23189e<Resp> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            Unit unit = Unit.INSTANCE;
        }
        m55640b(callback);
    }

    @Override // com.kubi.restful.InterfaceC23186b
    public Resp execute() {
        if (this.canceled) {
            throw new RuntimeException("任务被取消");
        }
        Annotation annotationM55674a = this.request.m55674a();
        if (annotationM55674a instanceof InterfaceC23192h) {
            return (Resp) Boolean.valueOf(m55645g().m55649b(this.request.m55675b(), this.request.m55678e()));
        }
        if (annotationM55674a instanceof InterfaceC23191g) {
            return (Resp) Boolean.valueOf(m55645g().m55648a(this.request.m55675b()));
        }
        if (annotationM55674a instanceof InterfaceC23194j) {
            return (Resp) m55645g().m55651d(this.request.m55675b(), ((InterfaceC23194j) annotationM55674a).m103799default(), m55646h());
        }
        throw new RuntimeException("不支持的操作类型");
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m55644f() {
        return (String) this.key.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final AbstractC23185a m55645g() {
        return (AbstractC23185a) this.proxy.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final Type m55646h() {
        return (Type) this.type.getValue();
    }
}
