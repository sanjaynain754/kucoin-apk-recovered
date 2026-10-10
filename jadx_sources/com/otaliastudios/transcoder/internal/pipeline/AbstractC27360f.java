package com.otaliastudios.transcoder.internal.pipeline;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.f */
/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/f;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "Lcom/otaliastudios/transcoder/internal/pipeline/f$d;", "Lcom/otaliastudios/transcoder/internal/pipeline/f$c;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC27360f<T> {

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.f$a */
    /* JADX INFO: compiled from: State.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/f$a;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a<T> extends b<T> {
        @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f.b
        @NotNull
        public String toString() {
            return "State.Eos(" + m68053a() + ')';
        }

        public a(T t11) {
            super(t11);
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.f$b */
    /* JADX INFO: compiled from: State.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "()Ljava/lang/Object;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static class b<T> extends AbstractC27360f<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final T value;

        public b(T t11) {
            super(null);
            this.value = t11;
        }

        /* JADX INFO: renamed from: a */
        public final T m68053a() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return "State.Ok(" + this.value + ')';
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.f$c */
    /* JADX INFO: compiled from: State.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/f$c;", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class c extends AbstractC27360f {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f55759a = new c();

        public c() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "State.Retry";
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.f$d */
    /* JADX INFO: compiled from: State.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/f$d;", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class d extends AbstractC27360f {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f55760a = new d();

        public d() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "State.Wait";
        }
    }

    public /* synthetic */ AbstractC27360f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC27360f() {
    }
}
