package com.facebook.imagepipeline.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p190d4.C36610a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: ResizeOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/ResizeOptions;", "", "", "width", "height", "", "maxBitmapDimension", "roundUpFraction", "<init>", "(IIFF)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "c", "F", "d", "e", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ResizeOptions {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final float maxBitmapDimension;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public final float roundUpFraction;

    /* JADX INFO: compiled from: ResizeOptions.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/ResizeOptions$Companion;", "", "<init>", "()V", "DEFAULT_ROUNDUP_FRACTION", "", "forDimensions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "width", "", "height", "forSquareSize", "size", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final ResizeOptions forDimensions(int width, int height) {
            if (width <= 0 || height <= 0) {
                return null;
            }
            return new ResizeOptions(width, height, 0.0f, 0.0f, 12, null);
        }

        @JvmStatic
        @Nullable
        public final ResizeOptions forSquareSize(int size) {
            if (size <= 0) {
                return null;
            }
            return new ResizeOptions(size, size, 0.0f, 0.0f, 12, null);
        }
    }

    @JvmOverloads
    public ResizeOptions(int i11, int i12, float f11, float f12) {
        this.width = i11;
        this.height = i12;
        this.maxBitmapDimension = f11;
        this.roundUpFraction = f12;
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i12 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) other;
        return this.width == resizeOptions.width && this.height == resizeOptions.height;
    }

    public int hashCode() {
        return C36610a.m81928a(this.width, this.height);
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public /* synthetic */ ResizeOptions(int i11, int i12, float f11, float f12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i13 & 4) != 0 ? 2048.0f : f11, (i13 & 8) != 0 ? 0.6666667f : f12);
    }
}
