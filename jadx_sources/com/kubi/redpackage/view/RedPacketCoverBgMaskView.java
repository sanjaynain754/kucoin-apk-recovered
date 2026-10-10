package com.kubi.redpackage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RedPacketCoverBgMaskView.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/redpackage/view/RedPacketCoverBgMaskView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "circleCenter", "Landroid/graphics/Point;", "radius", "", "onSizeChanged", "", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedPacketCoverBgMaskView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPacketCoverBgMaskView.kt\ncom/kubi/redpackage/view/RedPacketCoverBgMaskView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class RedPacketCoverBgMaskView extends AppCompatImageView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f43390b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public Point f43391c;

    /* JADX INFO: renamed from: d */
    public float f43392d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedPacketCoverBgMaskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedPacketCoverBgMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        try {
            Result.Companion companion = Result.INSTANCE;
            canvas2 = canvas;
            try {
                int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                Point point = this.f43391c;
                canvas2.drawCircle(point.x, point.y, this.f43392d, this.f43390b);
                canvas2.restoreToCount(iSaveLayer);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            super.onDraw(canvas2);
        }
    }

    public /* synthetic */ RedPacketCoverBgMaskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        int height = getHeight();
        int width = getWidth();
        int i11 = width * 2;
        this.f43392d = i11;
        Point point = this.f43391c;
        point.x = width / 2;
        point.y = height - i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedPacketCoverBgMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f43390b = paint;
        this.f43391c = new Point();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#99000000"));
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
    }
}
