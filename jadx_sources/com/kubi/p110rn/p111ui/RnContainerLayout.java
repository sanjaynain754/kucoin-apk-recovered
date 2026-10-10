package com.kubi.p110rn.p111ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnContainerLayout.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/ui/RnContainerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onTouchDownListener", "Lkotlin/Function0;", "", "getOnTouchDownListener", "()Lkotlin/jvm/functions/Function0;", "setOnTouchDownListener", "(Lkotlin/jvm/functions/Function0;)V", "onTouchUpListener", "getOnTouchUpListener", "setOnTouchUpListener", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnContainerLayout extends FrameLayout {
    private static final boolean DEBUG = true;

    @NotNull
    private static final String TAG = "RnContainerLayout";

    @Nullable
    private Function0<Unit> onTouchDownListener;

    @Nullable
    private Function0<Unit> onTouchUpListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RnContainerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RnContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int action = ev2.getAction();
        if (action == 0) {
            Log.d(TAG, "dispatchTouchEvent: ACTION_DOWN at (" + ev2.getX() + ", " + ev2.getY() + ')');
            Function0<Unit> function0 = this.onTouchDownListener;
            if (function0 != null) {
                function0.invoke();
            }
            Log.d(TAG, "BottomSheet 拖拽已禁用");
        } else if (action == 1) {
            Log.d(TAG, "dispatchTouchEvent: ACTION_UP at (" + ev2.getX() + ", " + ev2.getY() + ')');
            Function0<Unit> function1 = this.onTouchUpListener;
            if (function1 != null) {
                function1.invoke();
            }
            Log.d(TAG, "BottomSheet 拖拽已恢复");
        } else if (action == 2) {
            Log.v(TAG, "dispatchTouchEvent: ACTION_MOVE at (" + ev2.getX() + ", " + ev2.getY() + ')');
        } else if (action == 3) {
            Log.d(TAG, "dispatchTouchEvent: ACTION_CANCEL");
            Function0<Unit> function2 = this.onTouchUpListener;
            if (function2 != null) {
                function2.invoke();
            }
            Log.d(TAG, "BottomSheet 拖拽已恢复");
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Nullable
    public final Function0<Unit> getOnTouchDownListener() {
        return this.onTouchDownListener;
    }

    @Nullable
    public final Function0<Unit> getOnTouchUpListener() {
        return this.onTouchUpListener;
    }

    public final void setOnTouchDownListener(@Nullable Function0<Unit> function0) {
        this.onTouchDownListener = function0;
    }

    public final void setOnTouchUpListener(@Nullable Function0<Unit> function0) {
        this.onTouchUpListener = function0;
    }

    public /* synthetic */ RnContainerLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RnContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
