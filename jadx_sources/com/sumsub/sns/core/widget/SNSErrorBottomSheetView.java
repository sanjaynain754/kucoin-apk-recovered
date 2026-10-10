package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016JN\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010#J\u0006\u0010%\u001a\u00020\u001fR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", "bottomSheet", "text", "Landroid/widget/TextView;", "primaryButton", "Landroid/widget/Button;", "secondaryButton", "value", "", "dismissOnTouchOutside", "getDismissOnTouchOutside", "()Z", "setDismissOnTouchOutside", "(Z)V", "showCallback", "Ljava/lang/Runnable;", "onDetachedFromWindow", "", TIMPushProvider.f75062n, "", "onPrimaryButtonClicked", "Lkotlin/Function0;", "onSecondaryButtonClicked", TIMPushProvider.f75063o, "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSErrorBottomSheetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSErrorBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSErrorBottomSheetView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,129:1\n93#2,2:130\n298#2,2:132\n96#2,10:134\n256#2,2:144\n*S KotlinDebug\n*F\n+ 1 SNSErrorBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSErrorBottomSheetView\n*L\n86#1:130,2\n88#1:132,2\n86#1:134,10\n116#1:144,2\n*E\n"})
public final class SNSErrorBottomSheetView extends CoordinatorLayout {

    @NotNull
    private final ColorDrawable backgroundDrawable;

    @Nullable
    private BottomSheetBehavior<View> behavior;

    @NotNull
    private final View bottomSheet;
    private boolean dismissOnTouchOutside;

    @Nullable
    private final Button primaryButton;

    @Nullable
    private final Button secondaryButton;

    @NotNull
    private final Runnable showCallback;

    @Nullable
    private final TextView text;

    @JvmOverloads
    public SNSErrorBottomSheetView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSErrorBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_dismissOnTouchOutside_$lambda$0(boolean z11, SNSErrorBottomSheetView sNSErrorBottomSheetView, View view) {
        if (z11) {
            sNSErrorBottomSheetView.hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(SNSErrorBottomSheetView sNSErrorBottomSheetView, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = null;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = null;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = null;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        sNSErrorBottomSheetView.show(charSequence, charSequence2, charSequence3, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$6(Function0 function0, SNSErrorBottomSheetView sNSErrorBottomSheetView, View view) {
        if (function0 != null) {
            function0.invoke();
        }
        sNSErrorBottomSheetView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$7(Function0 function0, SNSErrorBottomSheetView sNSErrorBottomSheetView, View view) {
        if (function0 != null) {
            function0.invoke();
        }
        sNSErrorBottomSheetView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCallback$lambda$1(SNSErrorBottomSheetView sNSErrorBottomSheetView) {
        BottomSheetBehavior<View> bottomSheetBehavior = sNSErrorBottomSheetView.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
    }

    public final boolean getDismissOnTouchOutside() {
        return this.dismissOnTouchOutside;
    }

    public final void hide() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
    }

    public final void setDismissOnTouchOutside(final boolean z11) {
        this.dismissOnTouchOutside = z11;
        setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SNSErrorBottomSheetView._set_dismissOnTouchOutside_$lambda$0(z11, this, view);
            }
        });
    }

    public final void show(@Nullable CharSequence text, @Nullable CharSequence primaryButton, @Nullable CharSequence secondaryButton, @Nullable final Function0<Unit> onPrimaryButtonClicked, @Nullable final Function0<Unit> onSecondaryButtonClicked) {
        TextView textView = this.text;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, text);
        }
        Button button = this.primaryButton;
        if (button != null) {
            AbstractC28458h.m69341a(button, primaryButton);
        }
        Button button2 = this.secondaryButton;
        if (button2 != null) {
            AbstractC28458h.m69341a(button2, secondaryButton);
        }
        Button button3 = this.primaryButton;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SNSErrorBottomSheetView.show$lambda$6(onPrimaryButtonClicked, this, view);
                }
            });
        }
        Button button4 = this.secondaryButton;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SNSErrorBottomSheetView.show$lambda$7(onSecondaryButtonClicked, this, view);
                }
            });
        }
        setVisibility(0);
        postDelayed(this.showCallback, 250L);
    }

    public /* synthetic */ SNSErrorBottomSheetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_BottomSheetViewStyle : i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.showCallback);
    }

    @JvmOverloads
    public SNSErrorBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(R.color.black));
        this.backgroundDrawable = colorDrawable;
        this.dismissOnTouchOutside = true;
        this.showCallback = new Runnable() { // from class: com.sumsub.sns.core.widget.x
            @Override // java.lang.Runnable
            public final void run() {
                SNSErrorBottomSheetView.showCallback$lambda$1(this.f57617b);
            }
        };
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.sns_layout_error_bottom_sheet, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R$id.sns_bottom_sheet);
        this.bottomSheet = viewFindViewById;
        this.text = (TextView) viewInflate.findViewById(R$id.sns_text);
        this.primaryButton = (Button) viewInflate.findViewById(R$id.sns_primary_button);
        this.secondaryButton = (Button) viewInflate.findViewById(R$id.sns_secondary_button);
        ((ImageView) viewInflate.findViewById(R$id.sns_start_icon)).setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.WARNING_OUTLINE.getImageName()));
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
        bottomSheetBehaviorFrom.setHideable(true);
        bottomSheetBehaviorFrom.setDraggable(true);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.sumsub.sns.core.widget.SNSErrorBottomSheetView$3$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float slideOffset) {
                this.this$0.backgroundDrawable.setAlpha((int) ((slideOffset + 1.0f) * 128));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int newState) {
                this.this$0.setVisibility(newState == 5 ? 8 : 0);
            }
        });
        this.behavior = bottomSheetBehaviorFrom;
        setDismissOnTouchOutside(true);
        if (isAttachedToWindow()) {
            BottomSheetBehavior bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(5);
            }
            setVisibility(8);
            return;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sumsub.sns.core.widget.SNSErrorBottomSheetView$special$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                this.removeOnAttachStateChangeListener(this);
                BottomSheetBehavior bottomSheetBehavior2 = this.behavior;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(5);
                }
                this.setVisibility(8);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
            }
        });
    }
}
