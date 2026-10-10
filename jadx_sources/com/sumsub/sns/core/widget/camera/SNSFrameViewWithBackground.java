package com.sumsub.sns.core.widget.camera;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001DB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u00108\u001a\u000209H\u0002J(\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0007H\u0014J\u0010\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\u000eH\u0014J\u0010\u0010A\u001a\u0002092\u0006\u0010@\u001a\u00020\u000eH\u0002J\b\u0010B\u001a\u0004\u0018\u00010\u0018J\u0010\u0010C\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001e\u0010/\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020.@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b0\u00101R$\u00102\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010-\"\u0004\b4\u00105R\u001e\u00106\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b7\u0010*¨\u0006E"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "canvasBitmap", "Landroid/graphics/Bitmap;", "drawCanvas", "Landroid/graphics/Canvas;", "canvasPaint", "Landroid/graphics/Paint;", "value", "Landroid/util/SizeF;", "frameSize", "getFrameSize", "()Landroid/util/SizeF;", "setFrameSize", "(Landroid/util/SizeF;)V", "Landroid/graphics/RectF;", "frameRect", "getFrameRect", "()Landroid/graphics/RectF;", "setFrameRect", "(Landroid/graphics/RectF;)V", "Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;", "state", "getState", "()Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;", "setState", "(Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;)V", "rectPaint", "strokedRectPaint", "borderRect", "", "stateFrameWidth", "setStateFrameWidth", "(F)V", "stateFrameColor", "getStateFrameColor", "()I", "Landroid/content/res/ColorStateList;", "stateFrameColors", "setStateFrameColors", "(Landroid/content/res/ColorStateList;)V", "frameBackgroundColor", "getFrameBackgroundColor", "setFrameBackgroundColor", "(I)V", "stateFrameRadius", "setStateFrameRadius", "applyCustomThemeColors", "", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onDraw", "canvas", "drawWithCanvas", "updateFrameRect", "updateBorderRect", "State", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSFrameViewWithBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFrameViewWithBackground.kt\ncom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n233#2,3:244\n1#3:247\n*S KotlinDebug\n*F\n+ 1 SNSFrameViewWithBackground.kt\ncom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground\n*L\n105#1:244,3\n*E\n"})
public final class SNSFrameViewWithBackground extends View {

    @NotNull
    private RectF borderRect;

    @Nullable
    private Bitmap canvasBitmap;

    @NotNull
    private final Paint canvasPaint;

    @Nullable
    private Canvas drawCanvas;
    private int frameBackgroundColor;

    @Nullable
    private RectF frameRect;

    @Nullable
    private SizeF frameSize;

    @NotNull
    private final Paint rectPaint;

    @Nullable
    private State state;

    @NotNull
    private ColorStateList stateFrameColors;
    private float stateFrameRadius;
    private float stateFrameWidth;

    @NotNull
    private final Paint strokedRectPaint;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "RED", "YELLOW", "GREEN", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum State {
        DEFAULT,
        RED,
        YELLOW,
        GREEN;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    @JvmOverloads
    public SNSFrameViewWithBackground(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public final void setFrameSize(@Nullable SizeF sizeF) {
        setFrameRect(null);
        this.frameSize = sizeF;
        invalidate();
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.YELLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmOverloads
    public SNSFrameViewWithBackground(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void applyCustomThemeColors() {
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WARNING);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_statePending}, -65281);
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_SUCCESS);
        int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281);
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_CRITICAL;
        Integer numM69174a3 = AbstractC28234b.m69174a(this, sNSColorElement);
        int iIntValue3 = numM69174a3 != null ? numM69174a3.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateRejected}, -65281);
        Integer numM69174a4 = AbstractC28234b.m69174a(this, sNSColorElement);
        setStateFrameColors(new ColorStateList(new int[][]{new int[]{R$attr.sns_statePending}, new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[]{R$attr.sns_stateInit}}, new int[]{iIntValue, iIntValue2, iIntValue3, numM69174a4 != null ? numM69174a4.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateInit}, -65281)}));
    }

    private final void drawWithCanvas(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        RectF rectFUpdateFrameRect = this.frameRect;
        if (rectFUpdateFrameRect == null && (rectFUpdateFrameRect = updateFrameRect()) == null) {
            return;
        }
        canvas.drawColor(this.frameBackgroundColor);
        float f11 = this.stateFrameRadius;
        canvas.drawRoundRect(rectFUpdateFrameRect, f11, f11, this.rectPaint);
        RectF rectF = this.borderRect;
        float f12 = this.stateFrameRadius;
        canvas.drawRoundRect(rectF, f12, f12, this.strokedRectPaint);
    }

    private final int getStateFrameColor() {
        int[] iArr;
        State state = this.state;
        int i11 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            iArr = new int[]{R$attr.sns_statePending};
        } else if (i11 != 2) {
            iArr = i11 != 3 ? new int[]{R$attr.sns_stateInit} : new int[]{R$attr.sns_stateRejected};
        } else {
            iArr = new int[]{R$attr.sns_stateApproved};
        }
        int colorForState = this.stateFrameColors.getColorForState(iArr, -65281);
        return Color.rgb(Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState));
    }

    private final void setFrameBackgroundColor(int i11) {
        this.frameBackgroundColor = i11;
        invalidate();
    }

    private final void setFrameRect(RectF rectF) {
        this.frameRect = rectF;
        if (rectF != null) {
            updateBorderRect(rectF);
        }
    }

    private final void setStateFrameColors(ColorStateList colorStateList) {
        this.stateFrameColors = colorStateList;
        invalidate();
    }

    private final void setStateFrameRadius(float f11) {
        this.stateFrameRadius = f11;
        invalidate();
    }

    private final void setStateFrameWidth(float f11) {
        this.stateFrameWidth = f11;
        this.strokedRectPaint.setStrokeWidth(f11);
        invalidate();
    }

    private final void updateBorderRect(RectF frameRect) {
        float f11 = frameRect.left;
        float f12 = this.stateFrameWidth;
        this.borderRect = new RectF(f11 - f12, frameRect.top - f12, frameRect.right + f12, frameRect.bottom + f12);
    }

    public final int getFrameBackgroundColor() {
        return this.frameBackgroundColor;
    }

    @Nullable
    public final RectF getFrameRect() {
        return this.frameRect;
    }

    @Nullable
    public final SizeF getFrameSize() {
        return this.frameSize;
    }

    @Nullable
    public final State getState() {
        return this.state;
    }

    public final void setState(@Nullable State state) {
        this.state = state;
        RectF rectF = this.frameRect;
        if (rectF != null) {
            updateBorderRect(rectF);
            this.strokedRectPaint.setColor(getStateFrameColor());
        }
        invalidate();
    }

    @JvmOverloads
    public SNSFrameViewWithBackground(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        Bitmap bitmap = this.canvasBitmap;
        if (bitmap == null || (canvas2 = this.drawCanvas) == null) {
            return;
        }
        drawWithCanvas(canvas2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.canvasPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        Bitmap bitmap;
        super.onSizeChanged(w11, h11, oldw, oldh);
        Bitmap bitmap2 = this.canvasBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.canvasBitmap) != null) {
            bitmap.recycle();
        }
        if (w11 > 0 && h11 > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w11, h11, Bitmap.Config.ARGB_8888);
            this.drawCanvas = new Canvas(bitmapCreateBitmap);
            this.canvasBitmap = bitmapCreateBitmap;
        } else {
            this.canvasBitmap = null;
            this.drawCanvas = null;
        }
    }

    @Nullable
    public final RectF updateFrameRect() {
        SizeF sizeF;
        if (getWidth() == 0 || getHeight() == 0 || (sizeF = this.frameSize) == null) {
            return null;
        }
        float f11 = 2;
        float width = (getWidth() - sizeF.getWidth()) / f11;
        float height = (getHeight() - sizeF.getHeight()) / f11;
        RectF rectF = new RectF(width, height, sizeF.getWidth() + width, sizeF.getHeight() + height);
        setFrameRect(rectF);
        return rectF;
    }

    public /* synthetic */ SNSFrameViewWithBackground(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.snsFrameViewWithBackgroundStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSFrameViewWithBackground : i12);
    }

    @JvmOverloads
    public SNSFrameViewWithBackground(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.canvasPaint = new Paint(4);
        Paint paint = new Paint();
        this.rectPaint = paint;
        Paint paint2 = new Paint();
        this.strokedRectPaint = paint2;
        this.borderRect = new RectF();
        this.stateFrameColors = ColorStateList.valueOf(-65281);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFrameViewWithBackground, i11, i12);
        int i13 = R$styleable.SNSFrameViewWithBackground_sns_stateFrameColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setStateFrameColors(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSFrameViewWithBackground_sns_stateFrameRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setStateFrameRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, getResources().getDimensionPixelSize(R$dimen.sns_state_frame_radius)));
        }
        int i15 = R$styleable.SNSFrameViewWithBackground_sns_stateFrameWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setStateFrameWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width)));
        }
        int i16 = R$styleable.SNSFrameViewWithBackground_sns_frameBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setFrameBackgroundColor(typedArrayObtainStyledAttributes.getColor(i16, ContextCompat.getColor(context, R$color.sns_cameraBackgroundOverlay)));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        applyCustomThemeColors();
        Float fM69170a = AbstractC28233a.m69170a(SNSMetricElement.DOCUMENT_FRAME_BORDER_WIDTH);
        if (fM69170a != null) {
            setStateFrameWidth(fM69170a.floatValue());
        }
        Float fM69170a2 = AbstractC28233a.m69170a(SNSMetricElement.DOCUMENT_FRAME_CORNER_RADIUS);
        if (fM69170a2 != null) {
            setStateFrameRadius(fM69170a2.floatValue());
        }
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CAMERA_BACKGROUND_OVERLAY);
        if (numM69174a != null) {
            setFrameBackgroundColor(numM69174a.intValue());
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setDither(true);
        paint.setColor(0);
        paint2.setColor(getStateFrameColor());
        paint2.setStyle(Paint.Style.STROKE);
        Resources resources = context.getResources();
        int i17 = R$dimen.sns_frame_stroke_interval;
        paint2.setPathEffect(new DashPathEffect(new float[]{resources.getDimensionPixelSize(i17), context.getResources().getDimensionPixelSize(i17)}, 0.0f));
    }
}
