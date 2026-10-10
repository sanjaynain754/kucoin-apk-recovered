package com.jumio.commons.camera;

import jumio.core.AbstractC40637b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/jumio/commons/camera/MeteringMode;", "", "af", "", "ae", "awb", "<init>", "(ZZZ)V", "getAf", "()Z", "getAe", "getAwb", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MeteringMode {

    /* JADX INFO: renamed from: a */
    public final boolean f13554a;

    /* JADX INFO: renamed from: b */
    public final boolean f13555b;

    /* JADX INFO: renamed from: c */
    public final boolean f13556c;

    public MeteringMode() {
        this(false, false, false, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeteringMode)) {
            return false;
        }
        MeteringMode meteringMode = (MeteringMode) other;
        return this.f13554a == meteringMode.f13554a && this.f13555b == meteringMode.f13555b && this.f13556c == meteringMode.f13556c;
    }

    public MeteringMode(boolean z11, boolean z12, boolean z13) {
        this.f13554a = z11;
        this.f13555b = z12;
        this.f13556c = z13;
    }

    public static /* synthetic */ MeteringMode copy$default(MeteringMode meteringMode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = meteringMode.f13554a;
        }
        if ((i11 & 2) != 0) {
            z12 = meteringMode.f13555b;
        }
        if ((i11 & 4) != 0) {
            z13 = meteringMode.f13556c;
        }
        return meteringMode.copy(z11, z12, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getF13554a() {
        return this.f13554a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getF13555b() {
        return this.f13555b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getF13556c() {
        return this.f13556c;
    }

    @NotNull
    public final MeteringMode copy(boolean af2, boolean ae2, boolean awb) {
        return new MeteringMode(af2, ae2, awb);
    }

    public final boolean getAe() {
        return this.f13555b;
    }

    public final boolean getAf() {
        return this.f13554a;
    }

    public final boolean getAwb() {
        return this.f13556c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f13556c) + AbstractC40637b0.m89251a(this.f13555b, Boolean.hashCode(this.f13554a) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "MeteringMode(af=" + this.f13554a + ", ae=" + this.f13555b + ", awb=" + this.f13556c + ')';
    }

    public /* synthetic */ MeteringMode(boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13);
    }
}
