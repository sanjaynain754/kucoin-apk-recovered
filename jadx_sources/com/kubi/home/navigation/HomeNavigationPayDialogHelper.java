package com.kubi.home.navigation;

import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.kubi.home.R$layout;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.utils.storage.StorageType;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.navigation.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeNavigationPayDialogHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/navigation/HomeNavigationPayDialogHelper;", "", "<init>", "()V", "HOME_NAVIGATION_PAY_DIALOG", "Lcom/kubi/utils/storage/StorageId;", "", "getHOME_NAVIGATION_PAY_DIALOG", "()Lcom/kubi/utils/storage/StorageId;", "popupRef", "Ljava/lang/ref/WeakReference;", "Lcom/zyyoona7/popup/EasyPopup;", "showKucoinPayGuide", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "target", "Landroid/view/View;", "hidePopup", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeNavigationPayDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeNavigationPayDialogHelper.kt\ncom/kubi/home/navigation/HomeNavigationPayDialogHelper\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageIdKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,62:1\n67#2:63\n136#3:64\n126#3,2:65\n*S KotlinDebug\n*F\n+ 1 HomeNavigationPayDialogHelper.kt\ncom/kubi/home/navigation/HomeNavigationPayDialogHelper\n*L\n26#1:63\n33#1:64\n55#1:65,2\n*E\n"})
public final class HomeNavigationPayDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeNavigationPayDialogHelper f25899a = new HomeNavigationPayDialogHelper();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static WeakReference<C43724b> f25900b;

    /* JADX INFO: renamed from: e */
    public static final void m29696e() {
        f25900b = null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m29697b() {
        return new StorageId<>("flutter_kc.home", "_showKucoinPayBubbleKey", StorageType.Shared, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m29698c() {
        C43724b c43724b;
        WeakReference<C43724b> weakReference = f25900b;
        if (weakReference != null && (c43724b = weakReference.get()) != null) {
            c43724b.m96331y();
        }
        f25900b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m29699d(@NotNull FragmentActivity activity, @NotNull View target) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(target, "target");
        if (C46392a.m102322d(m29697b(), false) || activity.isFinishing() || activity.isDestroyed() || !target.isAttachedToWindow()) {
            return;
        }
        BubbleEasyPopup bubbleEasyPopup = new BubbleEasyPopup(activity);
        bubbleEasyPopup.m96307Q(R$layout.home_navigation_pay_dialog).m96316Z(false).m96314X(false).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.home.navigation.a
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                HomeNavigationPayDialogHelper.m29696e();
            }
        }).m96322p();
        PopupWindow popupWindowM96293B = bubbleEasyPopup.m96293B();
        if (popupWindowM96293B != null) {
            popupWindowM96293B.setTouchable(false);
        }
        PopupWindow popupWindowM96293B2 = bubbleEasyPopup.m96293B();
        if (popupWindowM96293B2 != null) {
            popupWindowM96293B2.setOutsideTouchable(false);
        }
        bubbleEasyPopup.m55378m0(target, 2, 4, C43881b.m96650a(2), -C43881b.m96650a(8));
        f25900b = new WeakReference<>(bubbleEasyPopup);
        C46392a.m102328k(m29697b(), true);
    }
}
