package com.kubi.utils;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RotateXYAnimation.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/kubi/utils/RotateXYAnimation;", "Landroid/view/animation/Animation;", "", "direction", "<init>", "(I)V", "width", "height", "parentWidth", "parentHeight", "", "initialize", "(IIII)V", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "b", "I", "c", "F", "centerX", "d", "centerY", "Landroid/graphics/Camera;", "e", "Lkotlin/Lazy;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Landroid/graphics/Camera;", "camera", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RotateXYAnimation extends Animation {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int direction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float centerX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float centerY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy camera;

    public RotateXYAnimation() {
        this(0, 1, null);
    }

    public RotateXYAnimation(int i11) {
        this.direction = i11;
        this.camera = LazyKt.lazy(new Function0<Camera>() { // from class: com.kubi.utils.RotateXYAnimation$camera$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Camera invoke() {
                return new Camera();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final Camera m66410a() {
        return (Camera) this.camera.getValue();
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float interpolatedTime, @Nullable Transformation t11) {
        Matrix matrix;
        super.applyTransformation(interpolatedTime, t11);
        if (t11 != null) {
            matrix = t11.getMatrix();
        } else {
            matrix = null;
        }
        m66410a().save();
        if (this.direction == 0) {
            m66410a().rotateX(TXVodDownloadDataSource.QUALITY_360P * interpolatedTime);
        } else {
            m66410a().rotateY(TXVodDownloadDataSource.QUALITY_360P * interpolatedTime);
        }
        m66410a().getMatrix(matrix);
        if (matrix != null) {
            matrix.preTranslate(-this.centerX, -this.centerY);
        }
        if (matrix != null) {
            matrix.postTranslate(this.centerX, this.centerY);
        }
        m66410a().restore();
    }

    @Override // android.view.animation.Animation
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        this.centerX = width / 2.0f;
        this.centerY = height / 2.0f;
    }

    public /* synthetic */ RotateXYAnimation(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11);
    }
}
