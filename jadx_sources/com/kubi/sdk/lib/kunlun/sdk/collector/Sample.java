package com.kubi.sdk.lib.kunlun.sdk.collector;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kunlun.sdk.collector.b, reason: from toString */
/* JADX INFO: compiled from: Sample.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;", "", "", "", "values", "", "", "labels", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Number;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class Sample {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Number> values;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, Object> labels;

    /* JADX WARN: Multi-variable type inference failed */
    public Sample() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sample)) {
            return false;
        }
        Sample sample = (Sample) other;
        return Intrinsics.areEqual(this.values, sample.values) && Intrinsics.areEqual(this.labels, sample.labels);
    }

    public Sample(@NotNull List<Number> values, @NotNull Map<String, ? extends Object> labels) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.values = values;
        this.labels = labels;
    }

    /* JADX INFO: renamed from: a */
    public final void m57140a(@NotNull Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.add(value);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m57141b() {
        return this.labels;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<Number> m57142c() {
        return this.values;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.labels.hashCode();
    }

    @NotNull
    public String toString() {
        return "Sample(values=" + this.values + ", labels=" + this.labels + ')';
    }

    public /* synthetic */ Sample(List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? new LinkedHashMap() : map);
    }
}
