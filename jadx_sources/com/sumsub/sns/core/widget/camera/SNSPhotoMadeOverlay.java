package com.sumsub.sns.core.widget.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\b\u0010\u0011\u001a\u00020\fH\u0014R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pendingCallback", "Lkotlin/Function0;", "", "isFlashing", "", "flash", "onEnd", "onDetachedFromWindow", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSPhotoMadeOverlay extends View {
    private boolean isFlashing;

    @Nullable
    private Function0<Unit> pendingCallback;

    @JvmOverloads
    public SNSPhotoMadeOverlay(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSPhotoMadeOverlay(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void flash(@Nullable Function0<Unit> onEnd) {
        if (this.isFlashing) {
            return;
        }
        this.isFlashing = true;
        this.pendingCallback = onEnd;
        setVisibility(4);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sumsub.sns.core.widget.camera.SNSPhotoMadeOverlay$flash$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.this$0.setVisibility(8);
                this.this$0.isFlashing = false;
                Function0 function0 = this.this$0.pendingCallback;
                if (function0 != null) {
                    function0.invoke();
                }
                this.this$0.pendingCallback = null;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                this.this$0.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public /* synthetic */ SNSPhotoMadeOverlay(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        this.isFlashing = false;
        this.pendingCallback = null;
    }

    @JvmOverloads
    public SNSPhotoMadeOverlay(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setVisibility(8);
        setBackgroundColor(-1);
    }
}
