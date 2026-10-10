package com.kubi.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.m */
/* JADX INFO: compiled from: Restful.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\tB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u001a\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR+\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/restful/m;", "", "", "", "methods", "", ReportDataTable.COLUMN_PARAMS, "<init>", "([Ljava/lang/annotation/Annotation;Ljava/util/Map;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Ljava/lang/annotation/Annotation;", "()[Ljava/lang/annotation/Annotation;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class C23197m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Annotation[] methods;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<Annotation[], Object> params;

    /* JADX INFO: renamed from: com.kubi.restful.m$a */
    /* JADX INFO: compiled from: Restful.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR*\u0010\u0013\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/restful/m$a;", "", "<init>", "()V", "", "", "annotation", "b", "([Ljava/lang/annotation/Annotation;)Lcom/kubi/restful/m$a;", "param", "c", "([Ljava/lang/annotation/Annotation;Ljava/lang/Object;)Lcom/kubi/restful/m$a;", "Lcom/kubi/restful/m;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/restful/m;", "[Ljava/lang/annotation/Annotation;", "methods", "", "Ljava/util/Map;", ReportDataTable.COLUMN_PARAMS, "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public Annotation[] methods;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public Map<Annotation[], Object> params = new LinkedHashMap();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C23197m m55661a() {
            return new C23197m(this.methods, this.params);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m55662b(@NotNull Annotation[] annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.methods = annotation;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m55663c(@NotNull Annotation[] annotation, @Nullable Object param) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.params.put(annotation, param);
            return this;
        }
    }

    public C23197m(@Nullable Annotation[] annotationArr, @NotNull Map<Annotation[], ? extends Object> params) {
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
    public final Map<Annotation[], Object> m55660b() {
        return this.params;
    }
}
