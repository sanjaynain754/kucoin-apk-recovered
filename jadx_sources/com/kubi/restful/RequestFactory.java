package com.kubi.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Restful.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0012\u0012\u0002\b\u0003 \u0007*\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eR<\u0010\u0011\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010Rx\u0010\u0013\u001ad\u0012*\u0012(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\n0\n \u0007*2\u0012,\b\u0001\u0012(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\n0\n\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/restful/RequestFactory;", "", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/Class;", "", "array", "Lcom/kubi/restful/m;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Ljava/lang/Object;)Lcom/kubi/restful/m;", "", "[Ljava/lang/annotation/Annotation;", "methods", "[[Ljava/lang/annotation/Annotation;", ReportDataTable.COLUMN_PARAMS, "c", "Ljava/lang/reflect/Method;", "d", "Companion", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class RequestFactory {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Annotation[] methods;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Annotation[][] params;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Method method;

    /* JADX INFO: compiled from: Restful.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/restful/RequestFactory$Companion;", "", "()V", "create", "Lcom/kubi/restful/RequestFactory;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RequestFactory create(@NotNull Method method) {
            Intrinsics.checkNotNullParameter(method, "method");
            return new RequestFactory(method);
        }
    }

    public RequestFactory(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.method = method;
        this.methods = method.getAnnotations();
        this.params = method.getParameterAnnotations();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C23197m m55637a(@NotNull Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        C23197m.a aVar = new C23197m.a();
        Annotation[] methods = this.methods;
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        aVar.m55662b(methods);
        int length = array.length;
        for (int i11 = 0; i11 < length; i11++) {
            Annotation[] annotationArr = this.params[i11];
            Intrinsics.checkNotNullExpressionValue(annotationArr, "params[index]");
            aVar.m55663c(annotationArr, array[i11]);
        }
        return aVar.m55661a();
    }

    /* JADX INFO: renamed from: b */
    public final Class<?> m55638b() {
        return this.method.getReturnType();
    }
}
