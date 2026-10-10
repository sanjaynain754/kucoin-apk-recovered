package p479nw;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: nw.c */
/* JADX INFO: compiled from: Frame.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0012"}, m90084d2 = {"toRect", "Landroid/graphics/Rect;", "Lcom/kubi/resources/widget/chart/data/Frame;", "toRectF", "Landroid/graphics/RectF;", "withPaddings", "paddings", "Lcom/kubi/resources/widget/chart/data/Paddings;", "toLinearGradient", "Landroid/graphics/LinearGradient;", "data", "Lcom/kubi/resources/widget/chart/data/LinearGradientData;", "contains", "", "x", "", "y", "Lcom/kubi/resources/widget/chart/data/PointFrame;", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frame.kt\ncom/kubi/resources/widget/chart/data/FrameKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,58:1\n337#2:59\n*S KotlinDebug\n*F\n+ 1 Frame.kt\ncom/kubi/resources/widget/chart/data/FrameKt\n*L\n24#1:59\n*E\n"})
public final class C42890c {
    /* JADX INFO: renamed from: a */
    public static final boolean m94048a(@NotNull PointFrame pointFrame, float f11, float f12) {
        Intrinsics.checkNotNullParameter(pointFrame, "<this>");
        C44128b.m97259c("chart", "x " + f11 + " y " + f12 + "->>>" + pointFrame);
        return f11 <= pointFrame.getFrame().getRight() && f11 >= pointFrame.getFrame().getLeft();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final LinearGradient m94049b(@NotNull Frame frame, @NotNull LinearGradientData data) {
        Intrinsics.checkNotNullParameter(frame, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        return new LinearGradient(frame.getLeft(), frame.getTop(), frame.getLeft(), frame.getBottom(), data.getStartColor(), data.getEndColor(), Shader.TileMode.MIRROR);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Frame m94050c(@NotNull Frame frame, @NotNull Paddings paddings) {
        Intrinsics.checkNotNullParameter(frame, "<this>");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new Frame(frame.getLeft() + paddings.getLeft(), frame.getTop() + paddings.getTop(), frame.getRight() - paddings.getRight(), frame.getBottom() - paddings.getBottom());
    }
}
