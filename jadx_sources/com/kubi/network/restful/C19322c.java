package com.kubi.network.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.restful.c */
/* JADX INFO: compiled from: KCNetwork.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000bB?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012&\u0010\b\u001a\"\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR7\u0010\b\u001a\"\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/network/restful/c;", "", "", "", "methods", "", "Lkotlin/Pair;", "Ljava/lang/reflect/Type;", ReportDataTable.COLUMN_PARAMS, "<init>", "([Ljava/lang/annotation/Annotation;Ljava/util/Map;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Ljava/lang/annotation/Annotation;", "()[Ljava/lang/annotation/Annotation;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19322c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Annotation[] methods;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<Pair<Annotation[], Type>, Object> params;

    /* JADX INFO: renamed from: com.kubi.network.restful.c$a */
    /* JADX INFO: compiled from: KCNetwork.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\f\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R6\u0010\u0015\u001a\"\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/network/restful/c$a;", "", "<init>", "()V", "", "", "annotation", "b", "([Ljava/lang/annotation/Annotation;)Lcom/kubi/network/restful/c$a;", "Lkotlin/Pair;", "Ljava/lang/reflect/Type;", "param", "c", "(Lkotlin/Pair;Ljava/lang/Object;)Lcom/kubi/network/restful/c$a;", "Lcom/kubi/network/restful/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/network/restful/c;", "[Ljava/lang/annotation/Annotation;", "methods", "", "Ljava/util/Map;", ReportDataTable.COLUMN_PARAMS, "paramTypes", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Annotation[] methods;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Map<Pair<Annotation[], Type>, Object> params = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public Map<Type, Object> paramTypes = new LinkedHashMap();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C19322c m42781a() {
            return new C19322c(this.methods, this.params);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m42782b(@NotNull Annotation[] annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.methods = annotation;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m42783c(@NotNull Pair<Annotation[], ? extends Type> annotation, @Nullable Object param) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.params.put(annotation, param);
            return this;
        }
    }

    public C19322c(@Nullable Annotation[] annotationArr, @NotNull Map<Pair<Annotation[], Type>, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.methods = annotationArr;
        this.params = params;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Annotation[] getMethods() {
        return this.methods;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<Pair<Annotation[], Type>, Object> m42780b() {
        return this.params;
    }
}
