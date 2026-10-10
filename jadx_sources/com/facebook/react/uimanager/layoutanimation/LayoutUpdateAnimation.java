package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutUpdateAnimation.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0006J7\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0002\b\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/react/uimanager/layoutanimation/LayoutUpdateAnimation;", "Lcom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation;", "<init>", "()V", "isValid", "", "isValid$ReactAndroid_release", "createAnimationImpl", "Landroid/view/animation/Animation;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "x", "", "y", "width", "height", "createAnimationImpl$ReactAndroid_release", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LayoutUpdateAnimation extends AbstractLayoutAnimation {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final boolean USE_TRANSLATE_ANIMATION = false;

    /* JADX INFO: compiled from: LayoutUpdateAnimation.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/uimanager/layoutanimation/LayoutUpdateAnimation$Companion;", "", "<init>", "()V", "USE_TRANSLATE_ANIMATION", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    /* JADX INFO: renamed from: isValid$ReactAndroid_release, reason: merged with bridge method [inline-methods] */
    public boolean isValid() {
        return this.mDurationMs > 0;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    @Nullable
    /* JADX INFO: renamed from: createAnimationImpl$ReactAndroid_release, reason: merged with bridge method [inline-methods] */
    public Animation createAnimationImpl(@NotNull View view, int x11, int y11, int width, int height) {
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z12 = true;
        if (((int) view.getX()) == x11 && ((int) view.getY()) == y11) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (view.getWidth() == width && view.getHeight() == height) {
            z12 = false;
        }
        if (!z11 && !z12) {
            return null;
        }
        return new PositionAndSizeAnimation(view, x11, y11, width, height);
    }
}
