package com.kubi.homern.widgets.homeeditorautoscroll;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.C5771R;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KCHomeEditorAutoScrollCoordinatorView.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u000206H\u0014J\u0010\u00108\u001a\u0002062\u0006\u00109\u001a\u00020.H\u0016J\n\u0010:\u001a\u0004\u0018\u000100H\u0002J\n\u0010;\u001a\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010<\u001a\u0004\u0018\u00010\u0014*\u00020\u0001H\u0002J\u0012\u0010=\u001a\u0004\u0018\u0001002\u0006\u0010>\u001a\u00020\u0001H\u0002J\b\u0010?\u001a\u000206H\u0002J\b\u0010@\u001a\u000206H\u0002J\b\u0010A\u001a\u000206H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010)\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u000e\u0010,\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/homern/widgets/homeeditorautoscroll/KCHomeEditorAutoScrollCoordinatorView;", "Landroid/view/View;", "Landroid/view/Choreographer$FrameCallback;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "value", "", "coordinatorEnabled", "getCoordinatorEnabled", "()Z", "setCoordinatorEnabled", "(Z)V", "", "bindingVersion", "getBindingVersion", "()I", "setBindingVersion", "(I)V", "", "scrollViewNativeID", "getScrollViewNativeID", "()Ljava/lang/String;", "setScrollViewNativeID", "(Ljava/lang/String;)V", "dragViewNativeID", "getDragViewNativeID", "setDragViewNativeID", "topEdgeActivationDistanceDp", "", "getTopEdgeActivationDistanceDp", "()F", "setTopEdgeActivationDistanceDp", "(F)V", "bottomEdgeActivationDistanceDp", "getBottomEdgeActivationDistanceDp", "setBottomEdgeActivationDistanceDp", "bottomOcclusionHeightDp", "getBottomOcclusionHeightDp", "setBottomOcclusionHeightDp", "maximumScrollSpeedDp", "getMaximumScrollSpeedDp", "setMaximumScrollSpeedDp", "framePosted", "lastFrameNanos", "", "scrollView", "Landroid/widget/ScrollView;", "draggingView", "scrollLocation", "", "dragLocation", "onAttachedToWindow", "", "onDetachedFromWindow", "doFrame", "frameTimeNanos", "resolveScrollView", "resolveDraggingView", "nativeId", "findDescendantScrollView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateFrameLoop", "postNextFrame", "stopFrameLoop", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHomeEditorAutoScrollCoordinatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHomeEditorAutoScrollCoordinatorView.kt\ncom/kubi/homern/widgets/homeeditorautoscroll/KCHomeEditorAutoScrollCoordinatorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
public final class KCHomeEditorAutoScrollCoordinatorView extends View implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f26979p = new Companion(null);

    /* JADX INFO: renamed from: b */
    public boolean f26980b;

    /* JADX INFO: renamed from: c */
    public int f26981c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f26982d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public String f26983e;

    /* JADX INFO: renamed from: f */
    public float f26984f;

    /* JADX INFO: renamed from: g */
    public float f26985g;

    /* JADX INFO: renamed from: h */
    public float f26986h;

    /* JADX INFO: renamed from: i */
    public float f26987i;

    /* JADX INFO: renamed from: j */
    public boolean f26988j;

    /* JADX INFO: renamed from: k */
    public long f26989k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ScrollView f26990l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public View f26991m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final int[] f26992n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final int[] f26993o;

    /* JADX INFO: compiled from: KCHomeEditorAutoScrollCoordinatorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/homern/widgets/homeeditorautoscroll/KCHomeEditorAutoScrollCoordinatorView$Companion;", "", "<init>", "()V", "NANOS_PER_SECOND", "", "DEFAULT_FRAME_ELAPSED_SECONDS", "MAX_FRAME_ELAPSED_SECONDS", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        int i11;
        this.f26988j = false;
        if (this.f26980b && isAttachedToWindow()) {
            ScrollView scrollViewM31297e = m31297e();
            View viewM31296d = m31296d();
            if (scrollViewM31297e != null && viewM31296d != null && viewM31296d.isAttachedToWindow()) {
                scrollViewM31297e.getLocationOnScreen(this.f26992n);
                viewM31296d.getLocationOnScreen(this.f26993o);
                float f11 = getResources().getDisplayMetrics().density;
                int i12 = this.f26992n[1];
                float f12 = i12;
                float height = (i12 + scrollViewM31297e.getHeight()) - (Math.max(0.0f, this.f26986h) * f11);
                int i13 = this.f26993o[1];
                float f13 = i13;
                float height2 = i13 + viewM31296d.getHeight();
                if (f13 <= f12 + (Math.max(0.0f, this.f26984f) * f11)) {
                    i11 = -1;
                } else {
                    i11 = height2 >= height - (Math.max(0.0f, this.f26985g) * f11) ? 1 : 0;
                }
                if (i11 != 0) {
                    long j11 = this.f26989k;
                    float fMin = j11 > 0 ? Math.min(0.033333335f, (frameTimeNanos - j11) / 1.0E9f) : 0.016666668f;
                    View childAt = scrollViewM31297e.getChildAt(0);
                    int iMin = Math.min(Math.max(0, (childAt != null ? childAt.getHeight() : 0) - scrollViewM31297e.getHeight()), Math.max(0, scrollViewM31297e.getScrollY() + (i11 * Math.max(1, (int) (RangesKt.coerceAtLeast(this.f26987i, 0.0f) * f11 * fMin)))));
                    if (iMin != scrollViewM31297e.getScrollY()) {
                        scrollViewM31297e.scrollTo(scrollViewM31297e.getScrollX(), iMin);
                    }
                }
            }
            this.f26989k = frameTimeNanos;
            m31295c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHomeEditorAutoScrollCoordinatorView(@NotNull ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26982d = "";
        this.f26983e = "";
        this.f26985g = 24.0f;
        this.f26986h = 100.0f;
        this.f26987i = 600.0f;
        this.f26992n = new int[2];
        this.f26993o = new int[2];
        setVisibility(4);
        setClickable(false);
    }

    /* JADX INFO: renamed from: a */
    public final ScrollView m31293a(View view) {
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            ScrollView scrollViewM31293a = m31293a(childAt);
            if (scrollViewM31293a != null) {
                return scrollViewM31293a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m31294b(View view) {
        Object tag = view.getTag(C5771R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m31295c() {
        if (this.f26988j) {
            return;
        }
        this.f26988j = true;
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: d */
    public final View m31296d() {
        if (this.f26983e.length() == 0) {
            return null;
        }
        View view = this.f26991m;
        if (view != null && view.isAttachedToWindow() && Intrinsics.areEqual(m31294b(view), this.f26983e)) {
            return view;
        }
        this.f26991m = null;
        View rootView = getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        View viewFindView = ReactFindViewUtil.findView(rootView, this.f26983e);
        if (viewFindView == null) {
            return null;
        }
        this.f26991m = viewFindView;
        return viewFindView;
    }

    /* JADX INFO: renamed from: e */
    public final ScrollView m31297e() {
        ScrollView scrollView = this.f26990l;
        if (scrollView != null && scrollView.isAttachedToWindow()) {
            return scrollView;
        }
        if (this.f26982d.length() == 0) {
            return null;
        }
        View rootView = getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        View viewFindView = ReactFindViewUtil.findView(rootView, this.f26982d);
        if (viewFindView == null) {
            return null;
        }
        ScrollView scrollViewM31293a = viewFindView instanceof ScrollView ? (ScrollView) viewFindView : null;
        if (scrollViewM31293a == null) {
            scrollViewM31293a = m31293a(viewFindView);
        }
        if (scrollViewM31293a == null) {
            return null;
        }
        this.f26990l = scrollViewM31293a;
        return scrollViewM31293a;
    }

    /* JADX INFO: renamed from: f */
    public final void m31298f() {
        if (this.f26988j) {
            Choreographer.getInstance().removeFrameCallback(this);
        }
        this.f26988j = false;
        this.f26989k = 0L;
    }

    /* JADX INFO: renamed from: g */
    public final void m31299g() {
        if (this.f26980b && isAttachedToWindow()) {
            m31295c();
        } else {
            m31298f();
        }
    }

    /* JADX INFO: renamed from: getBindingVersion, reason: from getter */
    public final int getF26981c() {
        return this.f26981c;
    }

    /* JADX INFO: renamed from: getBottomEdgeActivationDistanceDp, reason: from getter */
    public final float getF26985g() {
        return this.f26985g;
    }

    /* JADX INFO: renamed from: getBottomOcclusionHeightDp, reason: from getter */
    public final float getF26986h() {
        return this.f26986h;
    }

    /* JADX INFO: renamed from: getCoordinatorEnabled, reason: from getter */
    public final boolean getF26980b() {
        return this.f26980b;
    }

    @NotNull
    /* JADX INFO: renamed from: getDragViewNativeID, reason: from getter */
    public final String getF26983e() {
        return this.f26983e;
    }

    /* JADX INFO: renamed from: getMaximumScrollSpeedDp, reason: from getter */
    public final float getF26987i() {
        return this.f26987i;
    }

    @NotNull
    /* JADX INFO: renamed from: getScrollViewNativeID, reason: from getter */
    public final String getF26982d() {
        return this.f26982d;
    }

    /* JADX INFO: renamed from: getTopEdgeActivationDistanceDp, reason: from getter */
    public final float getF26984f() {
        return this.f26984f;
    }

    public final void setBindingVersion(int i11) {
        if (this.f26981c == i11) {
            return;
        }
        this.f26981c = i11;
        this.f26990l = null;
        this.f26991m = null;
    }

    public final void setBottomEdgeActivationDistanceDp(float f11) {
        this.f26985g = f11;
    }

    public final void setBottomOcclusionHeightDp(float f11) {
        this.f26986h = f11;
    }

    public final void setCoordinatorEnabled(boolean z11) {
        if (this.f26980b == z11) {
            return;
        }
        this.f26980b = z11;
        this.f26991m = null;
        m31299g();
    }

    public final void setDragViewNativeID(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.f26983e, value)) {
            return;
        }
        this.f26983e = value;
        this.f26991m = null;
    }

    public final void setMaximumScrollSpeedDp(float f11) {
        this.f26987i = f11;
    }

    public final void setScrollViewNativeID(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.f26982d, value)) {
            return;
        }
        this.f26982d = value;
        this.f26990l = null;
    }

    public final void setTopEdgeActivationDistanceDp(float f11) {
        this.f26984f = f11;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m31299g();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m31298f();
        this.f26990l = null;
        this.f26991m = null;
        super.onDetachedFromWindow();
    }
}
