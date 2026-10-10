package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\f2\b\b\u0001\u0010+\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020!J\u0006\u0010-\u001a\u00020!J\u0006\u0010.\u001a\u00020\u0016R.\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR=\u0010\u001c\u001a%\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001dj\u0004\u0018\u0001`\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "behavior", "getBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", "bottomSheet", "content", "Landroid/view/ViewGroup;", "hideRequested", "", "dismissOnTouchOutside", "getDismissOnTouchOutside", "()Z", "setDismissOnTouchOutside", "(Z)V", "stateCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isVisible", "", "Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetViewStateCallback;", "getStateCallback", "()Lkotlin/jvm/functions/Function1;", "setStateCallback", "(Lkotlin/jvm/functions/Function1;)V", "showCallback", "Ljava/lang/Runnable;", "onDetachedFromWindow", "inflate", TtmlNode.TAG_LAYOUT, TIMPushProvider.f75062n, TIMPushProvider.f75063o, "isHidden", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSCommonBottomSheetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCommonBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSCommonBottomSheetView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,126:1\n93#2,2:127\n298#2,2:129\n96#2,10:131\n256#2,2:141\n*S KotlinDebug\n*F\n+ 1 SNSCommonBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSCommonBottomSheetView\n*L\n92#1:127,2\n94#1:129,2\n92#1:131,10\n109#1:141,2\n*E\n"})
public final class SNSCommonBottomSheetView extends CoordinatorLayout {

    @NotNull
    private final ColorDrawable backgroundDrawable;

    @Nullable
    private BottomSheetBehavior<View> behavior;

    @Nullable
    private final View bottomSheet;

    @Nullable
    private final ViewGroup content;
    private boolean dismissOnTouchOutside;
    private boolean hideRequested;

    @NotNull
    private final Runnable showCallback;

    @Nullable
    private Function1<? super Boolean, Unit> stateCallback;

    @JvmOverloads
    public SNSCommonBottomSheetView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public final void hide() {
        this.hideRequested = true;
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
    }

    public final void show() {
        setVisibility(0);
        this.hideRequested = false;
        postDelayed(this.showCallback, 250L);
    }

    @JvmOverloads
    public SNSCommonBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_dismissOnTouchOutside_$lambda$0(boolean z11, SNSCommonBottomSheetView sNSCommonBottomSheetView, View view) {
        if (z11) {
            sNSCommonBottomSheetView.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCallback$lambda$1(SNSCommonBottomSheetView sNSCommonBottomSheetView) {
        if (sNSCommonBottomSheetView.hideRequested) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, "SNSCommonBottomSheetView", "skipped delayed show", null, 4, null);
            return;
        }
        BottomSheetBehavior<View> bottomSheetBehavior = sNSCommonBottomSheetView.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
    }

    @Nullable
    public final BottomSheetBehavior<View> getBehavior() {
        return this.behavior;
    }

    public final boolean getDismissOnTouchOutside() {
        return this.dismissOnTouchOutside;
    }

    @Nullable
    public final Function1<Boolean, Unit> getStateCallback() {
        return this.stateCallback;
    }

    @NotNull
    public final View inflate(@LayoutRes int layout) {
        ViewGroup viewGroup = this.content;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        return LayoutInflater.from(getContext()).inflate(layout, this.content, true);
    }

    public final boolean isHidden() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        return bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5;
    }

    public final void setDismissOnTouchOutside(final boolean z11) {
        this.dismissOnTouchOutside = z11;
        setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SNSCommonBottomSheetView._set_dismissOnTouchOutside_$lambda$0(z11, this, view);
            }
        });
    }

    public final void setStateCallback(@Nullable Function1<? super Boolean, Unit> function1) {
        this.stateCallback = function1;
    }

    public /* synthetic */ SNSCommonBottomSheetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_BottomSheetViewStyle : i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.showCallback);
    }

    @JvmOverloads
    public SNSCommonBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(R.color.black));
        this.backgroundDrawable = colorDrawable;
        this.dismissOnTouchOutside = true;
        this.showCallback = new Runnable() { // from class: com.sumsub.sns.core.widget.k
            @Override // java.lang.Runnable
            public final void run() {
                SNSCommonBottomSheetView.showCallback$lambda$1(this.f57592b);
            }
        };
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.sns_layout_common_bottom_sheet, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R$id.sns_bottom_sheet);
        this.bottomSheet = viewFindViewById;
        this.content = (ViewGroup) viewInflate.findViewById(R$id.sns_content);
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
        bottomSheetBehaviorFrom.setHideable(true);
        bottomSheetBehaviorFrom.setDraggable(true);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.sumsub.sns.core.widget.SNSCommonBottomSheetView$3$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float slideOffset) {
                this.this$0.backgroundDrawable.setAlpha((int) ((Math.min(slideOffset, 0.0f) + 1.0f) * 128));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int newState) {
                Function1<Boolean, Unit> stateCallback;
                this.this$0.setVisibility(newState == 5 ? 8 : 0);
                if (newState != 3) {
                    if (newState == 5 && (stateCallback = this.this$0.getStateCallback()) != null) {
                        stateCallback.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                Function1<Boolean, Unit> stateCallback2 = this.this$0.getStateCallback();
                if (stateCallback2 != null) {
                    stateCallback2.invoke(Boolean.TRUE);
                }
            }
        });
        this.behavior = bottomSheetBehaviorFrom;
        setDismissOnTouchOutside(true);
        if (isAttachedToWindow()) {
            BottomSheetBehavior<View> behavior = getBehavior();
            if (behavior != null) {
                behavior.setState(5);
            }
            setVisibility(8);
            return;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sumsub.sns.core.widget.SNSCommonBottomSheetView$special$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                this.removeOnAttachStateChangeListener(this);
                BottomSheetBehavior<View> behavior2 = this.getBehavior();
                if (behavior2 != null) {
                    behavior2.setState(5);
                }
                this.setVisibility(8);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
            }
        });
    }
}
