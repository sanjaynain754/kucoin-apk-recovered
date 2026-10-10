package com.facebook.imagepipeline.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.p059BV.LinearGradient.LinearGradientManager;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p190d4.C36610a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: RotationOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/RotationOptions;", "", "", "rotation", "", "deferUntilRendered", "<init>", "(IZ)V", "j", "()Z", "i", "f", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "forcedAngle", "c", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRotationOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotationOptions.kt\ncom/facebook/imagepipeline/common/RotationOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class RotationOptions {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final RotationOptions f8899d = new RotationOptions(-1, false);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final RotationOptions f8900e = new RotationOptions(-2, false);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final RotationOptions f8901f = new RotationOptions(-1, true);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int rotation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean deferUntilRendered;

    /* JADX INFO: compiled from: RotationOptions.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\b\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/RotationOptions$Companion;", "", "<init>", "()V", "NO_ROTATION", "", "ROTATE_90", "ROTATE_180", "ROTATE_270", "USE_EXIF_ROTATION_ANGLE", "DISABLE_ROTATION", "ROTATION_OPTIONS_AUTO_ROTATE", "Lcom/facebook/imagepipeline/common/RotationOptions;", "ROTATION_OPTIONS_DISABLE_ROTATION", "ROTATION_OPTIONS_ROTATE_AT_RENDER_TIME", "autoRotate", "disableRotation", "autoRotateAtRenderTime", "forceRotation", LinearGradientManager.PROP_ANGLE, "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final RotationOptions forceRotation(int angle) {
            return new RotationOptions(angle, false, null);
        }

        @JvmStatic
        @NotNull
        public final RotationOptions autoRotate() {
            return RotationOptions.f8899d;
        }

        @JvmStatic
        @NotNull
        public final RotationOptions autoRotateAtRenderTime() {
            return RotationOptions.f8901f;
        }

        @JvmStatic
        @NotNull
        public final RotationOptions disableRotation() {
            return RotationOptions.f8900e;
        }
    }

    public /* synthetic */ RotationOptions(int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) other;
        return this.rotation == rotationOptions.rotation && this.deferUntilRendered == rotationOptions.deferUntilRendered;
    }

    public RotationOptions(int i11, boolean z11) {
        this.rotation = i11;
        this.deferUntilRendered = z11;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final RotationOptions m9190d() {
        return INSTANCE.autoRotate();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final RotationOptions m9191e() {
        return INSTANCE.autoRotateAtRenderTime();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final RotationOptions m9192g() {
        return INSTANCE.disableRotation();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDeferUntilRendered() {
        return this.deferUntilRendered;
    }

    public int hashCode() {
        return C36610a.m81929b(Integer.valueOf(this.rotation), Boolean.valueOf(this.deferUntilRendered));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9195i() {
        return this.rotation != -2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9196j() {
        return this.rotation == -1;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.rotation), Boolean.valueOf(this.deferUntilRendered)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final int m9194h() {
        if (!m9196j()) {
            return this.rotation;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }
}
