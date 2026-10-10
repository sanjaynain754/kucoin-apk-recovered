package com.kubi.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33556b3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.r */
/* JADX INFO: compiled from: RestfulCallFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/restful/r;", "", "Lcom/kubi/restful/m;", "request", "<init>", "(Lcom/kubi/restful/m;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/restful/m;", "getRequest", "()Lcom/kubi/restful/m;", "", "()Ljava/lang/annotation/Annotation;", C33556b3.f69058j2, "", "b", "()Ljava/lang/String;", "key", "e", "()Ljava/lang/Object;", "value", "Ljava/lang/reflect/Type;", "d", "()Ljava/lang/reflect/Type;", "type", "Lcom/kubi/restful/a;", "c", "()Lcom/kubi/restful/a;", "proxy", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class C23202r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C23197m request;

    public C23202r(@NotNull C23197m request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Annotation m55674a() {
        if (this.request.getMethods() != null) {
            Annotation[] methods = this.request.getMethods();
            Intrinsics.checkNotNull(methods);
            for (Annotation annotation : methods) {
                if (annotation instanceof InterfaceC23192h) {
                    return annotation;
                }
                if (annotation instanceof InterfaceC23191g) {
                    return annotation;
                }
                if (annotation instanceof InterfaceC23194j) {
                    return annotation;
                }
            }
        }
        throw new RuntimeException("没有找到RInsert/RDelete/RQuery注解");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AbstractC23185a m55676c() {
        for (Map.Entry<Annotation[], Object> entry : this.request.m55660b().entrySet()) {
            Annotation[] key = entry.getKey();
            Object value = entry.getValue();
            for (Annotation annotation : key) {
                if (annotation instanceof InterfaceC23193i) {
                    if (value != null) {
                        return (AbstractC23185a) value;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.kubi.restful.BaseProxy");
                }
            }
        }
        throw new RuntimeException("没有找到RProxy注解");
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Type m55677d() {
        for (Map.Entry<Annotation[], Object> entry : this.request.m55660b().entrySet()) {
            Annotation[] key = entry.getKey();
            Object value = entry.getValue();
            for (Annotation annotation : key) {
                if (annotation instanceof InterfaceC23195k) {
                    if (value != null) {
                        return (Type) value;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Type");
                }
            }
        }
        throw new RuntimeException("没有找到SpType注解");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Object m55678e() {
        for (Map.Entry<Annotation[], Object> entry : this.request.m55660b().entrySet()) {
            Annotation[] key = entry.getKey();
            Object value = entry.getValue();
            for (Annotation annotation : key) {
                if (annotation instanceof InterfaceC23196l) {
                    Intrinsics.checkNotNull(value);
                    return value;
                }
            }
        }
        throw new RuntimeException("没有找到RValue注解");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m55675b() {
        Annotation annotationM55674a = m55674a();
        if (annotationM55674a instanceof InterfaceC23192h) {
            return ((InterfaceC23192h) annotationM55674a).key();
        }
        if (annotationM55674a instanceof InterfaceC23191g) {
            return ((InterfaceC23191g) annotationM55674a).key();
        }
        if (annotationM55674a instanceof InterfaceC23194j) {
            return ((InterfaceC23194j) annotationM55674a).key();
        }
        throw new RuntimeException("没有找到RInsert/RDelete/RQuery注解");
    }
}
