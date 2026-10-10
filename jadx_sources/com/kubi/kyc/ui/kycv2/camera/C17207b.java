package com.kubi.kyc.ui.kycv2.camera;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.b */
/* JADX INFO: compiled from: ClipOutPathView.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, m90084d2 = {"doOnLaidOut", "", "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "KycLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17207b {

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.b$a */
    /* JADX INFO: compiled from: ClipOutPathView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kyc/ui/kycv2/camera/ClipOutPathViewKt$doOnLaidOut$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f31487b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0<Unit> f31488c;

        public a(View view, Function0<Unit> function0) {
            this.f31487b = view;
            this.f31488c = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f31487b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f31488c.invoke();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m37258a(@NotNull View view, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (view.isAttachedToWindow() && ViewCompat.isLaidOut(view)) {
            action.invoke();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, action));
        }
    }
}
