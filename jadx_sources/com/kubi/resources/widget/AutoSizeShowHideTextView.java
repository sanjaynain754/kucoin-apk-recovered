package com.kubi.resources.widget;

import android.annotation.SuppressLint;
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

/* JADX INFO: compiled from: AutoSizeShowHideTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0014J\u001c\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002J0\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0019*\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u00190\u001c¢\u0006\u0002\b\u001dH\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/resources/widget/AutoSizeShowHideTextView;", "Lcom/kubi/resources/widget/ShowHideTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxSize", "", "minSize", "adjustWidth", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "calculateSize", "width", "use", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/res/TypedArray;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CustomViewStyleable"})
public final class AutoSizeShowHideTextView extends ShowHideTextView {

    /* JADX INFO: renamed from: d */
    public int f43709d;

    /* JADX INFO: renamed from: e */
    public int f43710e;

    /* JADX INFO: renamed from: f */
    public boolean f43711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSizeShowHideTextView(@NotNull final Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43709d = (int) getTextSize();
        int[] iArr = R$styleable.AutoTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f43710e = ((Number) m54435j(typedArrayObtainStyledAttributes, new Function1() { // from class: com.kubi.resources.widget.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AutoSizeShowHideTextView.m54434i(context, (TypedArray) obj));
            }
        })).intValue();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        this.f43711f = ((Boolean) m54435j(typedArrayObtainStyledAttributes2, new Function1() { // from class: com.kubi.resources.widget.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AutoSizeShowHideTextView.m54432g((TypedArray) obj));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final boolean m54432g(TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        return use.getBoolean(R$styleable.AutoTextView_adjustWidth, false);
    }

    /* JADX INFO: renamed from: h */
    private final int m54433h(int i11) {
        int i12 = this.f43709d;
        int i13 = this.f43710e;
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
        return this.f43710e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final int m54434i(Context context, TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        return use.getDimensionPixelSize(R$styleable.AutoTextView_minSize, (int) C27025c.m66565c(context, 10));
    }

    /* JADX INFO: renamed from: j */
    private final <T> T m54435j(TypedArray typedArray, Function1<? super TypedArray, ? extends T> function1) {
        try {
            return function1.invoke(typedArray);
        } finally {
            typedArray.recycle();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 0) {
            setTextSize(0, m54433h(View.MeasureSpec.getSize(widthMeasureSpec)));
        } else {
            setTextSize(0, this.f43709d);
        }
        if (this.f43711f && View.MeasureSpec.getMode(widthMeasureSpec) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec), Integer.MIN_VALUE), heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.kubi.resources.widget.ShowHideTextView, com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        super.setText(text, type);
        requestLayout();
    }
}
