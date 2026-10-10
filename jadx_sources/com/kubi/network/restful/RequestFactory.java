package com.kubi.network.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCNetwork.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR<\u0010\u0012\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00100\u0010 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011Rx\u0010\u0015\u001ad\u0012*\u0012(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00100\u0010 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\n0\n \u0007*2\u0012,\b\u0001\u0012(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00100\u0010 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\n0\n\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R<\u0010\u0018\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/network/restful/RequestFactory;", "", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/reflect/Type;", "", "array", "Lcom/kubi/network/restful/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Ljava/lang/Object;)Lcom/kubi/network/restful/c;", "Ljava/lang/reflect/Method;", "", "[Ljava/lang/annotation/Annotation;", "methods", "c", "[[Ljava/lang/annotation/Annotation;", ReportDataTable.COLUMN_PARAMS, "d", "[Ljava/lang/reflect/Type;", "paramTypes", "e", "Companion", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RequestFactory {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Method method;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Annotation[] methods;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Annotation[][] params;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Type[] paramTypes;

    /* JADX INFO: compiled from: KCNetwork.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/network/restful/RequestFactory$Companion;", "", "()V", "create", "Lcom/kubi/network/restful/RequestFactory;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
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
        this.paramTypes = method.getGenericParameterTypes();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C19322c m42766a(@NotNull Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        C19322c.a aVar = new C19322c.a();
        Annotation[] methods = this.methods;
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        aVar.m42782b(methods);
        int length = array.length;
        for (int i11 = 0; i11 < length; i11++) {
            aVar.m42783c(TuplesKt.m90091to(this.params[i11], this.paramTypes[i11]), array[i11]);
        }
        return aVar.m42781a();
    }

    /* JADX INFO: renamed from: b */
    public final Type m42767b() {
        return this.method.getGenericReturnType();
    }
}
