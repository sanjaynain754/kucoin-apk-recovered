package com.kubi.p110rn.p111ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: RnDebugInfoView.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/rn/ui/RnDebugInfoView;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "bizBundlePath", "", "baseBundlePath", "button", "Landroid/widget/TextView;", "lp", "Landroid/widget/FrameLayout$LayoutParams;", "dragStartX", "", "dragStartY", "initMarginTop", "", "initMarginRight", "isDragging", "", "attach", "", "update", "bizPath", "basePath", "detach", "showDialog", "dp", "value", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class RnDebugInfoView {

    @NotNull
    private final Activity activity;

    @Nullable
    private String baseBundlePath;

    @NotNull
    private String bizBundlePath;

    @NotNull
    private final TextView button;
    private float dragStartX;
    private float dragStartY;
    private int initMarginRight;
    private int initMarginTop;
    private boolean isDragging;

    @NotNull
    private final FrameLayout.LayoutParams lp;

    /* JADX INFO: renamed from: dp */
    private final int m56139dp(int value) {
        return (int) ((value * this.activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public RnDebugInfoView(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.bizBundlePath = "加载中…";
        TextView textView = new TextView(activity);
        textView.setText("Info");
        textView.setTextSize(9.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(m56139dp(8), m56139dp(6), m56139dp(8), m56139dp(6));
        textView.setBackgroundColor(Color.parseColor("#CC1565C0"));
        textView.setAllCaps(false);
        textView.setElevation(m56139dp(6));
        this.button = textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m56139dp(52), m56139dp(44));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = m56139dp(120);
        layoutParams.rightMargin = m56139dp(4);
        this.lp = layoutParams;
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.rn.ui.m
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return RnDebugInfoView._init_$lambda$2(this.f46143b, view, motionEvent);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.rn.ui.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46144b.showDialog();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attach$lambda$5(RnDebugInfoView rnDebugInfoView, View view) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (rnDebugInfoView.button.getParent() == null) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    viewGroup.addView(rnDebugInfoView.button, rnDebugInfoView.lp);
                }
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detach$lambda$7(RnDebugInfoView rnDebugInfoView) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewParent parent = rnDebugInfoView.button.getParent();
            Unit unit = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(rnDebugInfoView.button);
                unit = Unit.INSTANCE;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog() {
        FragmentManager supportFragmentManager;
        Activity activity = this.activity;
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
            return;
        }
        String str = this.baseBundlePath;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("业务 Bundle\n");
        sb2.append(this.bizBundlePath);
        if (str != null && str.length() != 0) {
            sb2.append("\n\n基础包 (krnbase)\n");
            sb2.append(str);
        }
        BottomSheetDialogHelper.m58980j0(BottomSheetDialogHelper.f48599a, "RN Bundle 调试信息", 0, sb2.toString(), "关闭", null, 18, null).show(supportFragmentManager, "rn_debug_info");
    }

    public final void attach() {
        final View decorView = this.activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.post(new Runnable() { // from class: com.kubi.rn.ui.o
            @Override // java.lang.Runnable
            public final void run() {
                RnDebugInfoView.attach$lambda$5(this.f46145b, decorView);
            }
        });
    }

    public final void detach() {
        View decorView = this.activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.post(new Runnable() { // from class: com.kubi.rn.ui.p
            @Override // java.lang.Runnable
            public final void run() {
                RnDebugInfoView.detach$lambda$7(this.f46147b);
            }
        });
    }

    public final void update(@Nullable String bizPath, @Nullable String basePath) {
        if (bizPath == null) {
            bizPath = "N/A";
        }
        this.bizBundlePath = bizPath;
        this.baseBundlePath = basePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(RnDebugInfoView rnDebugInfoView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                int rawX = (int) (motionEvent.getRawX() - rnDebugInfoView.dragStartX);
                int rawY = (int) (motionEvent.getRawY() - rnDebugInfoView.dragStartY);
                if (!rnDebugInfoView.isDragging && (Math.abs(rawX) > 5 || Math.abs(rawY) > 5)) {
                    rnDebugInfoView.isDragging = true;
                }
                if (rnDebugInfoView.isDragging) {
                    rnDebugInfoView.lp.topMargin = RangesKt.coerceAtLeast(rnDebugInfoView.initMarginTop + rawY, 0);
                    rnDebugInfoView.lp.rightMargin = RangesKt.coerceAtLeast(rnDebugInfoView.initMarginRight - rawX, 0);
                    rnDebugInfoView.button.setLayoutParams(rnDebugInfoView.lp);
                }
                return rnDebugInfoView.isDragging;
            }
            boolean z11 = rnDebugInfoView.isDragging;
            rnDebugInfoView.isDragging = false;
            return z11;
        }
        rnDebugInfoView.dragStartX = motionEvent.getRawX();
        rnDebugInfoView.dragStartY = motionEvent.getRawY();
        FrameLayout.LayoutParams layoutParams = rnDebugInfoView.lp;
        rnDebugInfoView.initMarginTop = layoutParams.topMargin;
        rnDebugInfoView.initMarginRight = layoutParams.rightMargin;
        rnDebugInfoView.isDragging = false;
        return false;
    }
}
