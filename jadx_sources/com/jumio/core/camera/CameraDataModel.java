package com.jumio.core.camera;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.core.model.StaticModel;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/camera/CameraDataModel;", "Lcom/jumio/core/model/StaticModel;", "Ljava/io/Serializable;", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/core/camera/CameraStatistics;", "session", "<init>", "(Lcom/jumio/core/camera/CameraStatistics;Lcom/jumio/core/camera/CameraStatistics;)V", "getFrame", "()Lcom/jumio/core/camera/CameraStatistics;", "getSession", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CameraDataModel implements StaticModel, Serializable {

    /* JADX INFO: renamed from: a */
    public final CameraStatistics f13721a;

    /* JADX INFO: renamed from: b */
    public final CameraStatistics f13722b;

    public CameraDataModel(@NotNull CameraStatistics frame, @NotNull CameraStatistics session) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f13721a = frame;
        this.f13722b = session;
    }

    @NotNull
    /* JADX INFO: renamed from: getFrame, reason: from getter */
    public final CameraStatistics getF13721a() {
        return this.f13721a;
    }

    @NotNull
    /* JADX INFO: renamed from: getSession, reason: from getter */
    public final CameraStatistics getF13722b() {
        return this.f13722b;
    }
}
