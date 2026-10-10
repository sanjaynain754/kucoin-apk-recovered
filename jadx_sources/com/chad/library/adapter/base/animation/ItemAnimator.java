package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ItemAnimator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/animation/ItemAnimator;", "", "animator", "Landroid/animation/Animator;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface ItemAnimator {
    @NotNull
    Animator animator(@NotNull View view);
}
