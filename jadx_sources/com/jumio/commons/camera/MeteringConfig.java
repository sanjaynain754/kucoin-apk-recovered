package com.jumio.commons.camera;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/commons/camera/MeteringConfig;", "", "meteringPoint", "Lcom/jumio/commons/camera/MeteringPoint;", "meteringMode", "Lcom/jumio/commons/camera/MeteringMode;", "<init>", "(Lcom/jumio/commons/camera/MeteringPoint;Lcom/jumio/commons/camera/MeteringMode;)V", "getMeteringPoint", "()Lcom/jumio/commons/camera/MeteringPoint;", "getMeteringMode", "()Lcom/jumio/commons/camera/MeteringMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MeteringConfig {

    /* JADX INFO: renamed from: a */
    public final MeteringPoint f13550a;

    /* JADX INFO: renamed from: b */
    public final MeteringMode f13551b;

    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/jumio/commons/camera/MeteringConfig$Builder;", "", "<init>", "()V", "meteringPoint", "Lcom/jumio/commons/camera/MeteringPoint;", "meteringMode", "Lcom/jumio/commons/camera/MeteringMode;", "point", "x", "", "y", "width", "height", "mode", "af", "", "ae", "awb", "build", "Lcom/jumio/commons/camera/MeteringConfig;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMeteringMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeteringMode.kt\ncom/jumio/commons/camera/MeteringConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public MeteringPoint f13552a;

        /* JADX INFO: renamed from: b */
        public MeteringMode f13553b = new MeteringMode(false, false, false, 7, null);

        @NotNull
        public final Builder mode(boolean af2, boolean ae2, boolean awb) {
            this.f13553b = new MeteringMode(af2, ae2, awb);
            return this;
        }

        @NotNull
        public final Builder point(float x11, float y11, float width, float height) {
            this.f13552a = new MeteringPoint(x11, y11, width, height);
            return this;
        }

        public static /* synthetic */ Builder mode$default(Builder builder, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            if ((i11 & 4) != 0) {
                z13 = false;
            }
            return builder.mode(z11, z12, z13);
        }

        @NotNull
        public final MeteringConfig build() {
            MeteringPoint meteringPoint = this.f13552a;
            if (meteringPoint != null) {
                return new MeteringConfig(meteringPoint, this.f13553b);
            }
            throw new IllegalArgumentException("meteringPoint is required");
        }

        @NotNull
        public final Builder mode(@NotNull MeteringMode meteringMode) {
            Intrinsics.checkNotNullParameter(meteringMode, "meteringMode");
            this.f13553b = meteringMode;
            return this;
        }

        @NotNull
        public final Builder point(@NotNull MeteringPoint meteringPoint) {
            Intrinsics.checkNotNullParameter(meteringPoint, "meteringPoint");
            this.f13552a = meteringPoint;
            return this;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeteringConfig)) {
            return false;
        }
        MeteringConfig meteringConfig = (MeteringConfig) other;
        return Intrinsics.areEqual(this.f13550a, meteringConfig.f13550a) && Intrinsics.areEqual(this.f13551b, meteringConfig.f13551b);
    }

    public MeteringConfig(@NotNull MeteringPoint meteringPoint, @NotNull MeteringMode meteringMode) {
        Intrinsics.checkNotNullParameter(meteringPoint, "meteringPoint");
        Intrinsics.checkNotNullParameter(meteringMode, "meteringMode");
        this.f13550a = meteringPoint;
        this.f13551b = meteringMode;
    }

    public static /* synthetic */ MeteringConfig copy$default(MeteringConfig meteringConfig, MeteringPoint meteringPoint, MeteringMode meteringMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            meteringPoint = meteringConfig.f13550a;
        }
        if ((i11 & 2) != 0) {
            meteringMode = meteringConfig.f13551b;
        }
        return meteringConfig.copy(meteringPoint, meteringMode);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MeteringPoint getF13550a() {
        return this.f13550a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MeteringMode getF13551b() {
        return this.f13551b;
    }

    @NotNull
    public final MeteringConfig copy(@NotNull MeteringPoint meteringPoint, @NotNull MeteringMode meteringMode) {
        Intrinsics.checkNotNullParameter(meteringPoint, "meteringPoint");
        Intrinsics.checkNotNullParameter(meteringMode, "meteringMode");
        return new MeteringConfig(meteringPoint, meteringMode);
    }

    @NotNull
    public final MeteringMode getMeteringMode() {
        return this.f13551b;
    }

    @NotNull
    public final MeteringPoint getMeteringPoint() {
        return this.f13550a;
    }

    public int hashCode() {
        return this.f13551b.hashCode() + (this.f13550a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MeteringConfig(meteringPoint=" + this.f13550a + ", meteringMode=" + this.f13551b + ')';
    }
}
