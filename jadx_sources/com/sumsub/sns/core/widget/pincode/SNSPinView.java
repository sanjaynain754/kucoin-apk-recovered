package com.sumsub.sns.core.widget.pincode;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 u2\u00020\u0001:\u0004vwuxB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J/\u0010,\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0014¢\u0006\u0004\b6\u0010&J\u0017\u00107\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b7\u0010\u0014J\u000f\u00109\u001a\u000208H\u0014¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\u000eJ\u000f\u0010=\u001a\u00020\fH\u0014¢\u0006\u0004\b=\u0010\u0010J\u000f\u0010>\u001a\u00020\fH\u0014¢\u0006\u0004\b>\u0010\u0010J\u000f\u0010?\u001a\u00020\u0015H\u0016¢\u0006\u0004\b?\u0010\u0017R\u001c\u0010A\u001a\b\u0018\u00010@R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010D\u001a\u0004\bV\u0010\u0017\"\u0004\bW\u0010\u001dR$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010J\u001a\u0004\ba\u0010b\"\u0004\bc\u0010\u000eR*\u0010e\u001a\u00020\u00152\u0006\u0010d\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010D\u001a\u0004\be\u0010\u0017\"\u0004\bf\u0010\u001dR(\u0010l\u001a\u0004\u0018\u00010g2\b\u0010d\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR(\u0010o\u001a\u0004\u0018\u00010g2\b\u0010d\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR(\u0010t\u001a\u0004\u0018\u00010\u001f2\b\u0010d\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010s¨\u0006y"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "Landroid/widget/EditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "maxLength", "", "setMaxLength", "(I)V", "moveSelectionToEnd", "()V", "Landroid/graphics/Canvas;", "canvas", "drawPinView", "(Landroid/graphics/Canvas;)V", "", "shouldBlink", "()Z", "makeBlink", "suspendBlink", "resumeBlink", "showCursor", "invalidateCursor", "(Z)V", "disableSelectionMenu", "", "radius", "setCornerSize", "(F)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "text", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "selStart", "selEnd", "onSelectionChanged", "onDraw", "Landroid/text/method/MovementMethod;", "getDefaultMovementMethod", "()Landroid/text/method/MovementMethod;", "screenState", "onScreenStateChanged", "onAttachedToWindow", "onDetachedFromWindow", "isSuggestionsEnabled", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;", "mBlink", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;", "isCursorVisible", "Z", "drawCursor", "Landroid/graphics/drawable/Drawable;", "cursorDrawable", "Landroid/graphics/drawable/Drawable;", "itemSpacing", "I", "itemPadding", "rect", "Landroid/graphics/Rect;", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "shapeAppearance", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "itemBackground", "getItemBackground", "()Landroid/graphics/drawable/Drawable;", "setItemBackground", "(Landroid/graphics/drawable/Drawable;)V", "isPassword", "setPassword", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "onTextCompleteListener", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "getOnTextCompleteListener", "()Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "setOnTextCompleteListener", "(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V", "count", "itemCount", "getItemCount", "()I", "setItemCount", "value", "isError", "setError", "Landroid/content/res/ColorStateList;", "getBoxBackgroundColor", "()Landroid/content/res/ColorStateList;", "setBoxBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "boxBackgroundColor", "getBoxStrokeColor", "setBoxStrokeColor", "boxStrokeColor", "getBoxStrokeWidth", "()Ljava/lang/Float;", "setBoxStrokeWidth", "(Ljava/lang/Float;)V", "boxStrokeWidth", "Companion", "Blink", "DefaultActionModeCallback", "OnTextCompleteListener", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"AppCompatCustomView"})
@SourceDebugExtension({"SMAP\nSNSPinView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPinView.kt\ncom/sumsub/sns/core/widget/pincode/SNSPinView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 4 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n233#2,3:459\n37#3:462\n37#3:463\n54#4:464\n54#4:465\n1#5:466\n*S KotlinDebug\n*F\n+ 1 SNSPinView.kt\ncom/sumsub/sns/core/widget/pincode/SNSPinView\n*L\n101#1:459,3\n140#1:462\n144#1:463\n148#1:464\n152#1:465\n*E\n"})
public final class SNSPinView extends EditText {

    @Nullable
    private Drawable cursorDrawable;
    private boolean drawCursor;
    private boolean isCursorVisible;
    private boolean isError;
    private boolean isPassword;

    @Nullable
    private Drawable itemBackground;
    private int itemCount;
    private int itemPadding;
    private int itemSpacing;

    @Nullable
    private Blink mBlink;

    @Nullable
    private OnTextCompleteListener onTextCompleteListener;

    @NotNull
    private final Rect rect;

    @NotNull
    private final ShapeAppearanceModel shapeAppearance;

    @NotNull
    private static final InputFilter[] NO_FILTERS = new InputFilter[0];

    @NotNull
    private static final int[] INIT_STATE = {R$attr.sns_stateInit};

    @NotNull
    private static final int[] ERROR_STATE = {R$attr.sns_stateRejected};

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;", "Ljava/lang/Runnable;", "<init>", "(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;)V", "mCancelled", "", "run", "", "cancel", "uncancel", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class Blink implements Runnable {
        private boolean mCancelled;

        public final void uncancel() {
            this.mCancelled = false;
        }

        public Blink() {
        }

        public final void cancel() {
            if (this.mCancelled) {
                return;
            }
            SNSPinView.this.removeCallbacks(this);
            this.mCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mCancelled) {
                return;
            }
            SNSPinView.this.removeCallbacks(this);
            if (SNSPinView.this.shouldBlink()) {
                SNSPinView sNSPinView = SNSPinView.this;
                sNSPinView.invalidateCursor(!sNSPinView.drawCursor);
                SNSPinView.this.postDelayed(this, 500L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;", "", "onTextComplete", "", "enteredText", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface OnTextCompleteListener {
        boolean onTextComplete(@NotNull String enteredText);
    }

    @JvmOverloads
    public SNSPinView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    @JvmOverloads
    public SNSPinView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void disableSelectionMenu() {
        setCustomSelectionActionModeCallback(new DefaultActionModeCallback());
        if (Build.VERSION.SDK_INT >= 26) {
            setCustomInsertionActionModeCallback(new DefaultActionModeCallback() { // from class: com.sumsub.sns.core.widget.pincode.SNSPinView.disableSelectionMenu.1
                @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.DefaultActionModeCallback, android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                    menu.removeItem(R.id.autofill);
                    return true;
                }
            });
        }
    }

    private final void drawPinView(Canvas canvas) {
        boolean z11;
        Drawable drawable;
        Editable text = getText();
        boolean z12 = false;
        int length = text != null ? text.length() : 0;
        int iCoerceAtLeast = RangesKt.coerceAtLeast((getHeight() - getPaddingTop()) - getPaddingBottom(), 0);
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i11 = this.itemCount;
        int iCoerceIn = RangesKt.coerceIn((width - ((i11 - 1) * this.itemSpacing)) / i11, 0, iCoerceAtLeast);
        int paddingStart = getPaddingStart();
        int width2 = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i12 = this.itemCount;
        boolean z13 = true;
        int i13 = (((width2 - (iCoerceIn * i12)) - ((i12 - 1) * this.itemSpacing)) / 2) + paddingStart;
        int height = ((((getHeight() - iCoerceAtLeast) - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int i14 = this.itemCount;
        int i15 = 0;
        while (i15 < i14) {
            boolean z14 = (isFocused() && length == i15) ? z13 : z12;
            int i16 = ((this.itemSpacing + iCoerceIn) * i15) + i13;
            int i17 = i16 + iCoerceIn;
            Drawable drawable2 = this.itemBackground;
            if (drawable2 != null) {
                drawable2.setState(this.isError ? ERROR_STATE : INIT_STATE);
                drawable2.setBounds(i16, height, i17, height + iCoerceAtLeast);
                canvas.save();
                drawable2.draw(canvas);
                canvas.restore();
            }
            if (z14 && this.drawCursor && (drawable = this.cursorDrawable) != null) {
                int intrinsicWidth = (((i17 - i16) - drawable.getIntrinsicWidth()) / 2) + i16;
                int textSize = ((iCoerceAtLeast - ((int) getTextSize())) / 2) + height;
                drawable.setBounds(intrinsicWidth, textSize, drawable.getIntrinsicWidth() + intrinsicWidth, ((int) getTextSize()) + textSize);
                canvas.save();
                drawable.draw(canvas);
                canvas.restore();
            }
            Editable text2 = getText();
            if (i15 >= (text2 != null ? text2.length() : 0)) {
                z13 = true;
                z11 = false;
            } else if (this.isPassword) {
                float f11 = i17 - i16;
                getPaint().setColor(getCurrentTextColor());
                canvas.drawCircle((f11 / 2.0f) + i16, (height + iCoerceAtLeast) - (iCoerceAtLeast / 2.0f), f11 / 9.0f, getPaint());
                z13 = true;
                z11 = false;
            } else {
                String string = getText().subSequence(i15, i15 + 1).toString();
                z13 = true;
                z11 = false;
                getPaint().getTextBounds(string, 0, 1, this.rect);
                float fWidth = (((i17 - i16) - this.rect.width()) / 2.0f) + i16;
                float fHeight = (height + iCoerceAtLeast) - ((iCoerceAtLeast - this.rect.height()) / 2.0f);
                getPaint().setColor(getCurrentTextColor());
                canvas.drawText(string, fWidth, fHeight, getPaint());
            }
            i15++;
            z12 = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateCursor(boolean showCursor) {
        if (this.drawCursor != showCursor) {
            this.drawCursor = showCursor;
            invalidate();
        }
    }

    private final void resumeBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.uncancel();
            makeBlink();
        }
    }

    private final void setMaxLength(int maxLength) {
        setFilters(maxLength >= 0 ? new InputFilter[]{new InputFilter.LengthFilter(maxLength)} : NO_FILTERS);
    }

    private final void suspendBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.cancel();
            invalidateCursor(false);
        }
    }

    @Nullable
    public final ColorStateList getBoxBackgroundColor() {
        Drawable drawable = this.itemBackground;
        MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
        if (materialShapeDrawable != null) {
            return materialShapeDrawable.getFillColor();
        }
        return null;
    }

    @Nullable
    public final ColorStateList getBoxStrokeColor() {
        Drawable drawable = this.itemBackground;
        MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
        if (materialShapeDrawable != null) {
            return materialShapeDrawable.getStrokeColor();
        }
        return null;
    }

    @Nullable
    public final Float getBoxStrokeWidth() {
        Drawable drawable = this.itemBackground;
        MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
        if (materialShapeDrawable != null) {
            return Float.valueOf(materialShapeDrawable.getStrokeWidth());
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    @NotNull
    public MovementMethod getDefaultMovementMethod() {
        return DefaultMovementMethod.INSTANCE;
    }

    @Nullable
    public final Drawable getItemBackground() {
        return this.itemBackground;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    @Nullable
    public final OnTextCompleteListener getOnTextCompleteListener() {
        return this.onTextCompleteListener;
    }

    public final void setBoxBackgroundColor(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.itemBackground;
        MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(colorStateList);
        }
    }

    public final void setBoxStrokeColor(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.itemBackground;
        MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStrokeColor(colorStateList);
        }
    }

    public final void setBoxStrokeWidth(@Nullable Float f11) {
        if (f11 != null) {
            float fFloatValue = f11.floatValue();
            Drawable drawable = this.itemBackground;
            MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setStrokeWidth(fFloatValue);
            }
        }
    }

    public final void setCornerSize(float radius) {
        Drawable drawable = this.itemBackground;
        MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setCornerSize(radius);
        }
    }

    public final void setError(boolean z11) {
        this.isError = z11;
        invalidate();
    }

    public final void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
    }

    public final void setItemCount(int i11) {
        this.itemCount = i11;
        setMaxLength(i11);
        requestLayout();
    }

    public final void setOnTextCompleteListener(@Nullable OnTextCompleteListener onTextCompleteListener) {
        this.onTextCompleteListener = onTextCompleteListener;
    }

    public final void setPassword(boolean z11) {
        this.isPassword = z11;
    }

    @JvmOverloads
    public SNSPinView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    private final void makeBlink() {
        if (shouldBlink()) {
            if (this.mBlink == null) {
                this.mBlink = new Blink();
            }
            removeCallbacks(this.mBlink);
            this.drawCursor = false;
            postDelayed(this.mBlink, 500L);
            return;
        }
        Blink blink = this.mBlink;
        if (blink != null) {
            removeCallbacks(blink);
        }
    }

    private final void moveSelectionToEnd() {
        int length;
        Editable text = getText();
        if (text != null) {
            length = text.length();
        } else {
            length = 0;
        }
        setSelection(length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldBlink() {
        if (isCursorVisible() && isFocused()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeBlink();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        suspendBlink();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.save();
        drawPinView(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused) {
            moveSelectionToEnd();
            makeBlink();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getPaint().getTextBounds("8", 0, 1, this.rect);
        int iHeight = this.rect.height() + this.itemPadding;
        int i11 = this.itemPadding;
        int iWidth = this.rect.width() + i11 + this.itemPadding;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iHeight + i11;
        int paddingStart = getPaddingStart();
        int i12 = this.itemCount;
        setMeasuredDimension(View.resolveSizeAndState(((i12 - 1) * this.itemSpacing) + (iWidth * i12) + paddingStart, widthMeasureSpec, 0), View.resolveSizeAndState(paddingBottom, heightMeasureSpec, 0));
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int screenState) {
        super.onScreenStateChanged(screenState);
        if (screenState != 0) {
            if (screenState != 1) {
                return;
            }
            resumeBlink();
            return;
        }
        suspendBlink();
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        Editable text = getText();
        if (text != null && selEnd == text.length()) {
            return;
        }
        moveSelectionToEnd();
    }

    @Override // android.widget.TextView
    public void onTextChanged(@NotNull CharSequence text, int start, int lengthBefore, int lengthAfter) {
        boolean zOnTextComplete;
        if (start != text.length()) {
            moveSelectionToEnd();
        }
        makeBlink();
        if (text.length() == this.itemCount) {
            OnTextCompleteListener onTextCompleteListener = this.onTextCompleteListener;
            if (onTextCompleteListener != null) {
                zOnTextComplete = onTextCompleteListener.onTextComplete(text.toString());
            } else {
                zOnTextComplete = false;
            }
            if (zOnTextComplete) {
                ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
    }

    public /* synthetic */ SNSPinView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_pinViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSPinView : i12);
    }

    @JvmOverloads
    public SNSPinView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Float fM69171a;
        Float fM69171a2;
        Integer numM69172a;
        Integer numM69172a2;
        super(context, attributeSet, i11, i12);
        setLayoutDirection(0);
        this.rect = new Rect();
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build();
        this.shapeAppearance = shapeAppearanceModelBuild;
        this.itemBackground = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        this.itemCount = 6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSPinView, i11, i12);
        int i13 = R$styleable.SNSPinView_android_itemBackground;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.itemBackground = typedArrayObtainStyledAttributes.getDrawable(i13);
        } else {
            int i14 = R$styleable.SNSPinView_boxBackgroundColor;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                Drawable drawable = this.itemBackground;
                MaterialShapeDrawable materialShapeDrawable = drawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable : null;
                if (materialShapeDrawable != null) {
                    materialShapeDrawable.setFillColor(typedArrayObtainStyledAttributes.getColorStateList(i14));
                }
            }
            int i15 = R$styleable.SNSPinView_boxStrokeColor;
            if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                Drawable drawable2 = this.itemBackground;
                MaterialShapeDrawable materialShapeDrawable2 = drawable2 instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable2 : null;
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.setStrokeColor(typedArrayObtainStyledAttributes.getColorStateList(i15));
                }
            }
            int i16 = R$styleable.SNSPinView_sns_boxStrokeWidth;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                Drawable drawable3 = this.itemBackground;
                MaterialShapeDrawable materialShapeDrawable3 = drawable3 instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) drawable3 : null;
                if (materialShapeDrawable3 != null) {
                    materialShapeDrawable3.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(i16, 0.0f));
                }
            }
        }
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSPinView_sns_itemSpacing, getResources().getDimensionPixelSize(R$dimen.sns_pin_view_item_spacing));
        this.itemPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSPinView_sns_itemPadding, getResources().getDimensionPixelSize(R$dimen.sns_pin_view_item_padding));
        this.isCursorVisible = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SNSPinView_android_cursorVisible, true);
        this.cursorDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SNSPinView_sns_cursorDrawable);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        setTransformationMethod(null);
        disableSelectionMenu();
        setMaxLength(6);
        AbstractC28234b.m69176a(this, SNSTypographyElement.HEADLINE1, SNSColorElement.FIELD_CONTENT);
        SNSColorElement sNSColorElement = SNSColorElement.FIELD_BACKGROUND;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null && (numM69172a2 = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            setBoxBackgroundColor(ColorStateList.valueOf(numM69172a2.intValue()));
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.FIELD_BORDER;
        C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
        if (c28966pM69169a2 != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a2, sNSColorElement2, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            setBoxStrokeColor(ColorStateList.valueOf(numM69172a.intValue()));
        }
        SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_CORNER_RADIUS;
        C28966p c28966pM69169a3 = AbstractC28233a.m69169a();
        if (c28966pM69169a3 != null && (fM69171a2 = AbstractC28233a.m69171a(c28966pM69169a3, sNSMetricElement)) != null) {
            setCornerSize(fM69171a2.floatValue());
        }
        SNSMetricElement sNSMetricElement2 = SNSMetricElement.FIELD_BORDER_WIDTH;
        C28966p c28966pM69169a4 = AbstractC28233a.m69169a();
        if (c28966pM69169a4 == null || (fM69171a = AbstractC28233a.m69171a(c28966pM69169a4, sNSMetricElement2)) == null) {
            return;
        }
        setBoxStrokeWidth(Float.valueOf(fM69171a.floatValue()));
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/pincode/SNSPinView$DefaultActionModeCallback;", "Landroid/view/ActionMode$Callback;", "<init>", "()V", "onCreateActionMode", "", "mode", "Landroid/view/ActionMode;", "menu", "Landroid/view/Menu;", "onPrepareActionMode", "onActionItemClicked", "item", "Landroid/view/MenuItem;", "onDestroyActionMode", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static class DefaultActionModeCallback implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(@NotNull ActionMode mode, @NotNull MenuItem item) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(@NotNull ActionMode mode, @NotNull Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(@NotNull ActionMode mode, @NotNull Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(@NotNull ActionMode mode) {
        }
    }
}
