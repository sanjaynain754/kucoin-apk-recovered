package rw;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.InterfaceC42325g;
import p479nw.Label;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: rw.c */
/* JADX INFO: compiled from: AxisLabels.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/plugin/AxisLabels;", "Lcom/kubi/resources/widget/chart/Labels;", "<init>", "()V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "xLabels", "", "Lcom/kubi/resources/widget/chart/data/Label;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAxisLabels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AxisLabels.kt\ncom/kubi/resources/widget/chart/plugin/AxisLabels\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1869#2,2:21\n*S KotlinDebug\n*F\n+ 1 AxisLabels.kt\ncom/kubi/resources/widget/chart/plugin/AxisLabels\n*L\n10#1:21,2\n*E\n"})
public final class C44186c implements InterfaceC42325g {
    @Override // p439lw.InterfaceC42325g
    /* JADX INFO: renamed from: a */
    public void mo92867a(@Nullable Canvas canvas, @NotNull Paint paint, @NotNull List<Label> xLabels) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(xLabels, "xLabels");
        for (Label label : xLabels) {
            if (canvas != null) {
                canvas.drawText(label.getLabel(), label.getScreenPositionX(), label.getScreenPositionY(), paint);
            }
        }
    }
}
