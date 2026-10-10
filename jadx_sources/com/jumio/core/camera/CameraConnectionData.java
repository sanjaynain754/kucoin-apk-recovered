package com.jumio.core.camera;

import com.google.firebase.perf.util.Constants;
import com.jumio.core.ServiceLocator;
import com.jumio.core.camera.CameraConnectionData;
import java.io.Serializable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/jumio/core/camera/CameraConnectionData;", "Ljava/io/Serializable;", "data", "", "", "<init>", "([Ljava/lang/String;)V", "getData", "()[Ljava/lang/String;", "[Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "component1", "copy", "([Ljava/lang/String;)Lcom/jumio/core/camera/CameraConnectionData;", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CameraConnectionData implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String[] f13720a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/camera/CameraConnectionData$Companion;", "", "<init>", "()V", "get", "Lcom/jumio/core/camera/CameraConnectionData;", Constants.ENABLE_DISABLE, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final CameraConnectionInterface m14504a() {
            return new DefaultCameraConnection();
        }

        @Nullable
        public final CameraConnectionData get(boolean isEnabled) {
            if (isEnabled) {
                return ((CameraConnectionInterface) ServiceLocator.INSTANCE.getServiceImplementation(CameraConnectionInterface.class, new Function0() { // from class: j9.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraConnectionData.Companion.m14504a();
                    }
                })).get();
            }
            return null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraConnectionData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CameraConnectionData(@NotNull String[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13720a = data;
    }

    public static /* synthetic */ CameraConnectionData copy$default(CameraConnectionData cameraConnectionData, String[] strArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = cameraConnectionData.f13720a;
        }
        return cameraConnectionData.copy(strArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String[] getF13720a() {
        return this.f13720a;
    }

    @NotNull
    public final CameraConnectionData copy(@NotNull String[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new CameraConnectionData(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CameraConnectionData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.jumio.core.camera.CameraConnectionData");
        return Arrays.equals(this.f13720a, ((CameraConnectionData) other).f13720a);
    }

    @NotNull
    public final String[] getData() {
        return this.f13720a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13720a);
    }

    @NotNull
    public String toString() {
        return "CameraConnectionData(data=" + Arrays.toString(this.f13720a) + ')';
    }

    public /* synthetic */ CameraConnectionData(String[] strArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new String[0] : strArr);
    }
}
