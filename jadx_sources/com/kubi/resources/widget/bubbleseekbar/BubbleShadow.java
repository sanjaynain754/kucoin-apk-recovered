package com.kubi.resources.widget.bubbleseekbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BubbleShadow.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\tH\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/bubbleseekbar/BubbleShadow;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ViewProps.ON_LAYOUT, "", "changed", "", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "updatePadding", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBubbleShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleShadow.kt\ncom/kubi/resources/widget/bubbleseekbar/BubbleShadow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class BubbleShadow extends FrameLayout {
    /* JADX INFO: renamed from: a */
    public final void m54987a() {
        KeyEvent.Callback childAt = getChildAt(0);
        BubbleStyle bubbleStyle = childAt instanceof BubbleStyle ? (BubbleStyle) childAt : null;
        if (bubbleStyle == null) {
            return;
        }
        Rect rect = new Rect();
        getBackground().getPadding(rect);
        BubbleStyle.ArrowDirection arrowDirection = bubbleStyle.getArrowDirection();
        int i11 = arrowDirection == null ? -1 : C23001a.$EnumSwitchMapping$0[arrowDirection.ordinal()];
        if (i11 == 1) {
            setPadding(rect.left - ((int) bubbleStyle.getArrowHeight()), rect.top, rect.right, rect.bottom);
            return;
        }
        if (i11 == 2) {
            setPadding(rect.left, rect.top - ((int) bubbleStyle.getArrowHeight()), rect.right, rect.bottom);
            return;
        }
        if (i11 == 3) {
            setPadding(rect.left, rect.top, rect.right - ((int) bubbleStyle.getArrowHeight()), rect.bottom);
        } else if (i11 != 4) {
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            setPadding(rect.left, rect.top, rect.right, rect.bottom - ((int) bubbleStyle.getArrowHeight()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleShadow$a */
    /* JADX INFO: compiled from: BubbleShadow.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C23001a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BubbleStyle.ArrowDirection.values().length];
            try {
                iArr[BubbleStyle.ArrowDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BubbleStyle.ArrowDirection.Up.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BubbleStyle.ArrowDirection.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BubbleStyle.ArrowDirection.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleShadow(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m54987a();
    }
}
