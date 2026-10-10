package com.jumio.core.camera;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33675gh;
import java.io.Serializable;
import jumio.core.AbstractC40637b0;
import jumio.core.AbstractC40653e0;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003JQ\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014¨\u00064"}, m90084d2 = {"Lcom/jumio/core/camera/CameraStatistics;", "Ljava/io/Serializable;", "id", "", "timestamp", "", Constants.ScionAnalytics.PARAM_LABEL, "", JPushConstants.Operation.KEY_SEQUENCE, "", "count", "start_time", C33675gh.f70010p, "<init>", "(IJLjava/lang/String;ZIJJ)V", "getId", "()I", "setId", "(I)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getSequence", "()Z", "setSequence", "(Z)V", "getCount", "setCount", "getStart_time", "setStart_time", "getEnd_time", "setEnd_time", TypedValues.TransitionType.S_DURATION, "getDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CameraStatistics implements Serializable {

    /* JADX INFO: renamed from: a */
    public int f13729a;

    /* JADX INFO: renamed from: b */
    public long f13730b;

    /* JADX INFO: renamed from: c */
    public String f13731c;

    /* JADX INFO: renamed from: d */
    public boolean f13732d;

    /* JADX INFO: renamed from: e */
    public int f13733e;

    /* JADX INFO: renamed from: f */
    public long f13734f;

    /* JADX INFO: renamed from: g */
    public long f13735g;

    public CameraStatistics() {
        this(0, 0L, null, false, 0, 0L, 0L, 127, null);
    }

    public static /* synthetic */ CameraStatistics copy$default(CameraStatistics cameraStatistics, int i11, long j11, String str, boolean z11, int i12, long j12, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = cameraStatistics.f13729a;
        }
        if ((i13 & 2) != 0) {
            j11 = cameraStatistics.f13730b;
        }
        if ((i13 & 4) != 0) {
            str = cameraStatistics.f13731c;
        }
        if ((i13 & 8) != 0) {
            z11 = cameraStatistics.f13732d;
        }
        if ((i13 & 16) != 0) {
            i12 = cameraStatistics.f13733e;
        }
        if ((i13 & 32) != 0) {
            j12 = cameraStatistics.f13734f;
        }
        if ((i13 & 64) != 0) {
            j13 = cameraStatistics.f13735g;
        }
        long j14 = j13;
        int i14 = i12;
        String str2 = str;
        return cameraStatistics.copy(i11, j11, str2, z11, i14, j12, j14);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraStatistics)) {
            return false;
        }
        CameraStatistics cameraStatistics = (CameraStatistics) other;
        return this.f13729a == cameraStatistics.f13729a && this.f13730b == cameraStatistics.f13730b && Intrinsics.areEqual(this.f13731c, cameraStatistics.f13731c) && this.f13732d == cameraStatistics.f13732d && this.f13733e == cameraStatistics.f13733e && this.f13734f == cameraStatistics.f13734f && this.f13735g == cameraStatistics.f13735g;
    }

    public CameraStatistics(int i11, long j11, @Nullable String str, boolean z11, int i12, long j12, long j13) {
        this.f13729a = i11;
        this.f13730b = j11;
        this.f13731c = str;
        this.f13732d = z11;
        this.f13733e = i12;
        this.f13734f = j12;
        this.f13735g = j13;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF13729a() {
        return this.f13729a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF13730b() {
        return this.f13730b;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF13731c() {
        return this.f13731c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getF13732d() {
        return this.f13732d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getF13733e() {
        return this.f13733e;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getF13734f() {
        return this.f13734f;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getF13735g() {
        return this.f13735g;
    }

    @NotNull
    public final CameraStatistics copy(int id2, long timestamp, @Nullable String label, boolean sequence, int count, long start_time, long end_time) {
        return new CameraStatistics(id2, timestamp, label, sequence, count, start_time, end_time);
    }

    public final int getCount() {
        return this.f13733e;
    }

    public final long getDuration() {
        long j11 = this.f13734f;
        if (j11 == 0) {
            return 0L;
        }
        long j12 = this.f13735g;
        return j12 == 0 ? this.f13730b - j11 : j12 - j11;
    }

    public final long getEnd_time() {
        return this.f13735g;
    }

    public final int getId() {
        return this.f13729a;
    }

    @Nullable
    public final String getLabel() {
        return this.f13731c;
    }

    public final boolean getSequence() {
        return this.f13732d;
    }

    public final long getStart_time() {
        return this.f13734f;
    }

    public final long getTimestamp() {
        return this.f13730b;
    }

    public int hashCode() {
        int iM89269a = AbstractC40749x1.m89269a(this.f13730b, Integer.hashCode(this.f13729a) * 31, 31);
        String str = this.f13731c;
        return Long.hashCode(this.f13735g) + AbstractC40749x1.m89269a(this.f13734f, AbstractC40653e0.m89252a(this.f13733e, AbstractC40637b0.m89251a(this.f13732d, (iM89269a + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    public final void setCount(int i11) {
        this.f13733e = i11;
    }

    public final void setEnd_time(long j11) {
        this.f13735g = j11;
    }

    public final void setId(int i11) {
        this.f13729a = i11;
    }

    public final void setLabel(@Nullable String str) {
        this.f13731c = str;
    }

    public final void setSequence(boolean z11) {
        this.f13732d = z11;
    }

    public final void setStart_time(long j11) {
        this.f13734f = j11;
    }

    public final void setTimestamp(long j11) {
        this.f13730b = j11;
    }

    @NotNull
    public String toString() {
        return "CameraStatistics(id=" + this.f13729a + ", timestamp=" + this.f13730b + ", label=" + this.f13731c + ", sequence=" + this.f13732d + ", count=" + this.f13733e + ", start_time=" + this.f13734f + ", end_time=" + this.f13735g + ')';
    }

    public /* synthetic */ CameraStatistics(int i11, long j11, String str, boolean z11, int i12, long j12, long j13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0L : j11, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? 0L : j12, (i13 & 64) != 0 ? 0L : j13);
    }
}
