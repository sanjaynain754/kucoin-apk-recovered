package com.kubi.monitor.metrics.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.monitor.metrics.util.a */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/monitor/metrics/util/a;", "", "<init>", "()V", "", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)I", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19236a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19236a f35593a = new C19236a();

    /* JADX INFO: renamed from: a */
    public final int m42498a(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }
}
