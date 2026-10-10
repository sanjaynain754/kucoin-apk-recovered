package com.facebook.fresco.vito.options;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoundingOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\t\u0010\u0017¨\u0006\""}, m90084d2 = {"Lcom/facebook/fresco/vito/options/RoundingOptions;", "", "", "isCircular", "", "cornerRadius", "", "cornerRadii", "isAntiAliased", "isForceRoundAtDecode", "<init>", "(ZF[FZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "()Z", "b", "F", "d", "()F", "c", "[F", "()[F", "e", "f", "Companion", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class RoundingOptions {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final RoundingOptions f8625g = new RoundingOptions(true, 0.0f, null, false, false);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final RoundingOptions f8626h = new RoundingOptions(true, 0.0f, null, true, false);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isCircular;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float cornerRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final float[] cornerRadii;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isAntiAliased;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean isForceRoundAtDecode;

    /* JADX INFO: compiled from: RoundingOptions.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J(\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0007J\u001a\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/RoundingOptions$Companion;", "", "<init>", "()V", "CORNER_RADIUS_UNSET", "", "AS_CIRCLE", "Lcom/facebook/fresco/vito/options/RoundingOptions;", "getAS_CIRCLE", "()Lcom/facebook/fresco/vito/options/RoundingOptions;", "AS_CIRCLE_ANTI_ALIASING", "getAS_CIRCLE_ANTI_ALIASING", "asCircle", "antiAliasing", "", "forceRoundAtDecode", "forCornerRadiusPx", "cornerRadiusPx", "forCornerRadii", "topLeft", "topRight", "bottomRight", "bottomLeft", "cornerRadii", "", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RoundingOptions asCircle() {
            return getAS_CIRCLE();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final RoundingOptions forCornerRadii(@NotNull float[] cornerRadii) {
            Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
            return forCornerRadii$default(this, cornerRadii, false, 2, null);
        }

        public Companion() {
        }

        public static /* synthetic */ RoundingOptions forCornerRadii$default(Companion companion, float[] fArr, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return companion.forCornerRadii(fArr, z11);
        }

        @JvmStatic
        @NotNull
        public final RoundingOptions asCircle(boolean antiAliasing) {
            return antiAliasing ? getAS_CIRCLE_ANTI_ALIASING() : getAS_CIRCLE();
        }

        @JvmStatic
        @NotNull
        public final RoundingOptions forCornerRadii(float topLeft, float topRight, float bottomRight, float bottomLeft) {
            return new RoundingOptions(false, 0.0f, new float[]{topLeft, topLeft, topRight, topRight, bottomRight, bottomRight, bottomLeft, bottomLeft}, false, false);
        }

        @JvmStatic
        @NotNull
        public final RoundingOptions forCornerRadiusPx(float cornerRadiusPx) {
            return new RoundingOptions(false, cornerRadiusPx, null, false, false);
        }

        @JvmStatic
        @NotNull
        public final RoundingOptions asCircle(boolean antiAliasing, boolean forceRoundAtDecode) {
            return new RoundingOptions(true, 0.0f, null, antiAliasing, forceRoundAtDecode);
        }

        @NotNull
        public final RoundingOptions getAS_CIRCLE() {
            return RoundingOptions.f8625g;
        }

        @NotNull
        public final RoundingOptions getAS_CIRCLE_ANTI_ALIASING() {
            return RoundingOptions.f8626h;
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final RoundingOptions forCornerRadii(@NotNull float[] cornerRadii, boolean antiAliasing) {
            Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
            return new RoundingOptions(false, 0.0f, cornerRadii, antiAliasing, false);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RoundingOptions.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.facebook.fresco.vito.options.RoundingOptions");
        RoundingOptions roundingOptions = (RoundingOptions) other;
        return this.isCircular == roundingOptions.isCircular && this.cornerRadius == roundingOptions.cornerRadius && Arrays.equals(this.cornerRadii, roundingOptions.cornerRadii) && this.isAntiAliased == roundingOptions.isAntiAliased && this.isForceRoundAtDecode == roundingOptions.isForceRoundAtDecode;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final float[] getCornerRadii() {
        return this.cornerRadii;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isCircular) * 31) + Float.hashCode(this.cornerRadius)) * 31) + Arrays.hashCode(this.cornerRadii)) * 31) + Boolean.hashCode(this.isAntiAliased)) * 31) + Boolean.hashCode(this.isForceRoundAtDecode);
    }

    @NotNull
    public String toString() {
        return "RoundingOptions(isCircular=" + this.isCircular + ", cornerRadius=" + this.cornerRadius + ", cornerRadii=" + Arrays.toString(this.cornerRadii) + ", isAntiAliased=" + this.isAntiAliased + ", isForceRoundAtDecode=" + this.isForceRoundAtDecode + ")";
    }

    public RoundingOptions(boolean z11, float f11, @Nullable float[] fArr, boolean z12, boolean z13) {
        this.isCircular = z11;
        this.cornerRadius = f11;
        this.cornerRadii = fArr;
        this.isAntiAliased = z12;
        this.isForceRoundAtDecode = z13;
    }
}
