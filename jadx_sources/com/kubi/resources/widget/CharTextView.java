package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.res.R$styleable;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CharTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0014J\b\u0010\u0012\u001a\u00020\tH\u0002J0\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u00140\u0017¢\u0006\u0002\b\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/resources/widget/CharTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "limitSize", "", "getLimitSize", "()I", "setLimitSize", "(I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "calculateWidth", "use", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/res/TypedArray;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CharTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public int f43741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.CharTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f43741b = ((Number) m54472e(typedArrayObtainStyledAttributes, new Function1() { // from class: com.kubi.resources.widget.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(CharTextView.m54471d((TypedArray) obj));
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: d */
    public static final int m54471d(TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        return use.getInteger(R$styleable.CharTextView_limitSize, 6);
    }

    /* JADX INFO: renamed from: c */
    public final int m54473c() {
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = this.f43741b;
        for (int i12 = 0; i12 < i11; i12++) {
            stringBuffer.append("8");
        }
        return (int) getPaint().measureText(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: getLimitSize, reason: from getter */
    public final int getF43741b() {
        return this.f43741b;
    }

    public final void setLimitSize(int i11) {
        this.f43741b = i11;
    }

    /* JADX INFO: renamed from: e */
    private final <T> T m54472e(TypedArray typedArray, Function1<? super TypedArray, ? extends T> function1) {
        try {
            return function1.invoke(typedArray);
        } finally {
            typedArray.recycle();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int iM54473c = m54473c();
        if (mode == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iM54473c, 1073741824), heightMeasureSpec);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(iM54473c, View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824), heightMeasureSpec);
        }
    }
}
