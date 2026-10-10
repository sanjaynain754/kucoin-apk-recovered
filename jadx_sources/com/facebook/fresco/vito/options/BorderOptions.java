package com.facebook.fresco.vito.options;

import androidx.annotation.ColorInt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BorderOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/BorderOptions;", "", "", "color", "", "width", ViewProps.PADDING, "", "scaleDownInsideBorders", "<init>", "(IFFZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "F", "c", "d", "Z", "e", "Companion", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class BorderOptions {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @ColorInt
    @JvmField
    public final int color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @JvmField
    public final float width;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @JvmField
    public final float padding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @JvmField
    public final boolean scaleDownInsideBorders;

    /* JADX INFO: compiled from: BorderOptions.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/BorderOptions$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/fresco/vito/options/BorderOptions;", "color", "", "width", "", ViewProps.PADDING, "scaleDownInsideBorders", "", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final BorderOptions create(@ColorInt int i11, float f11) {
            return create$default(this, i11, f11, 0.0f, false, 12, null);
        }

        public Companion() {
        }

        public static /* synthetic */ BorderOptions create$default(Companion companion, int i11, float f11, float f12, boolean z11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                f12 = 0.0f;
            }
            if ((i12 & 8) != 0) {
                z11 = false;
            }
            return companion.create(i11, f11, f12, z11);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final BorderOptions create(@ColorInt int i11, float f11, float f12) {
            return create$default(this, i11, f11, f12, false, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final BorderOptions create(@ColorInt int color, float width, float padding, boolean scaleDownInsideBorders) {
            return new BorderOptions(color, width, padding, scaleDownInsideBorders);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BorderOptions.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.facebook.fresco.vito.options.BorderOptions");
        BorderOptions borderOptions = (BorderOptions) other;
        return this.color == borderOptions.color && this.width == borderOptions.width && this.padding == borderOptions.padding && this.scaleDownInsideBorders == borderOptions.scaleDownInsideBorders;
    }

    public int hashCode() {
        return (((((this.color * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.padding)) * 31) + Boolean.hashCode(this.scaleDownInsideBorders);
    }

    @NotNull
    public String toString() {
        return "BorderOptions(color=" + this.color + ", width=" + this.width + ", padding=" + this.padding + ", scaleDownInsideBorders=" + this.scaleDownInsideBorders + ")";
    }

    public BorderOptions(@ColorInt int i11, float f11, float f12, boolean z11) {
        this.color = i11;
        this.width = f11;
        this.padding = f12;
        this.scaleDownInsideBorders = z11;
    }
}
