package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0014J\u001c\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J0\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002H#0&¢\u0006\u0002\b'H\u0002¢\u0006\u0002\u0010(R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006)"}, m90084d2 = {"Lcom/kubi/resources/widget/AutoTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxSize", "", "getMaxSize", "()I", "setMaxSize", "(I)V", "minSize", "getMinSize", "setMinSize", "adjustWidth", "", "getAdjustWidth", "()Z", "setAdjustWidth", "(Z)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "calculateSize", "width", "use", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/res/TypedArray;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AutoTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public int f43712b;

    /* JADX INFO: renamed from: c */
    public int f43713c;

    /* JADX INFO: renamed from: d */
    public boolean f43714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTextView(@NotNull final Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43712b = (int) getTextSize();
        int[] iArr = R$styleable.AutoTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f43713c = ((Number) m54441g(typedArrayObtainStyledAttributes, new Function1() { // from class: com.kubi.resources.widget.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AutoTextView.m54439f(context, (TypedArray) obj));
            }
        })).intValue();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        this.f43714d = ((Boolean) m54441g(typedArrayObtainStyledAttributes2, new Function1() { // from class: com.kubi.resources.widget.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AutoTextView.m54438d((TypedArray) obj));
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m54438d(TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        return use.getBoolean(R$styleable.AutoTextView_adjustWidth, false);
    }

    /* JADX INFO: renamed from: f */
    public static final int m54439f(Context context, TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        return use.getDimensionPixelSize(R$styleable.AutoTextView_minSize, (int) C27025c.m66565c(context, 10));
    }

    /* JADX INFO: renamed from: e */
    public final int m54440e(int i11) {
        int i12 = this.f43712b;
        int i13 = this.f43713c;
        if (i13 <= i12) {
            while (true) {
                getPaint().setTextSize(i12);
                if (getPaint().measureText(getText().toString()) <= i11) {
                    return i12;
                }
                if (i12 != i13) {
                    i12--;
                }
            }
        }
        return this.f43713c;
    }

    /* JADX INFO: renamed from: getAdjustWidth, reason: from getter */
    public final boolean getF43714d() {
        return this.f43714d;
    }

    /* JADX INFO: renamed from: getMaxSize, reason: from getter */
    public final int getF43712b() {
        return this.f43712b;
    }

    /* JADX INFO: renamed from: getMinSize, reason: from getter */
    public final int getF43713c() {
        return this.f43713c;
    }

    public final void setAdjustWidth(boolean z11) {
        this.f43714d = z11;
    }

    public final void setMaxSize(int i11) {
        this.f43712b = i11;
    }

    public final void setMinSize(int i11) {
        this.f43713c = i11;
    }

    /* JADX INFO: renamed from: g */
    public final <T> T m54441g(TypedArray typedArray, Function1<? super TypedArray, ? extends T> function1) {
        try {
            return function1.invoke(typedArray);
        } finally {
            typedArray.recycle();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 0) {
            setTextSize(0, m54440e(View.MeasureSpec.getSize(widthMeasureSpec)));
        } else {
            setTextSize(0, this.f43712b);
        }
        if (this.f43714d && View.MeasureSpec.getMode(widthMeasureSpec) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec), Integer.MIN_VALUE), heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        super.setText(text, type);
        requestLayout();
    }
}
