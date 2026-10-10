package com.kubi.assets.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.view.s0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HideIMEUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/view/HideIMEUtil;", "", "<init>", "()V", "wrap", "", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "contentParent", "Landroid/view/ViewGroup;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HideIMEUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HideIMEUtil f19152a = new HideIMEUtil();

    /* JADX INFO: renamed from: b */
    public final void m20049b(@Nullable Fragment fragment) {
        View view;
        ViewParent parent = (fragment == null || (view = fragment.getView()) == null) ? null : view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            m20048a(viewGroup);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20048a(@NotNull ViewGroup contentParent) {
        Intrinsics.checkNotNullParameter(contentParent, "contentParent");
        View childAt = contentParent.getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        AutoHideIMEFrameLayout autoHideIMEFrameLayout = new AutoHideIMEFrameLayout(childAt.getContext());
        if (childAt instanceof ViewGroup) {
            ((ViewGroup) childAt).addView(autoHideIMEFrameLayout, new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }
}
