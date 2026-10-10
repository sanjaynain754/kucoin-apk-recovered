package com.kubi.mine.lib.p101ui;

import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.mine.R$layout;
import com.kubi.resources.widget.BubbleEasyPopup;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p538pq.C43525e;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: MultiAccountSwitchPop.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/MultiAccountSwitchPop;", "", "<init>", "()V", "popupRef", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/resources/widget/BubbleEasyPopup;", "autoDismissJob", "Lkotlinx/coroutines/Job;", "showPop", "", "context", "Landroidx/fragment/app/FragmentActivity;", "anchorView", "Landroid/view/View;", "dismissPopup", "shouldShowPop", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiAccountSwitchPop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAccountSwitchPop.kt\ncom/kubi/mine/lib/ui/MultiAccountSwitchPop\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,98:1\n135#2,2:99\n126#2,2:101\n135#2,2:103\n*S KotlinDebug\n*F\n+ 1 MultiAccountSwitchPop.kt\ncom/kubi/mine/lib/ui/MultiAccountSwitchPop\n*L\n41#1:99,2\n79#1:101,2\n94#1:103,2\n*E\n"})
public final class MultiAccountSwitchPop {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MultiAccountSwitchPop f35225a = new MultiAccountSwitchPop();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static WeakReference<BubbleEasyPopup> f35226b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static InterfaceC41775x1 f35227c;

    /* JADX INFO: renamed from: a */
    public final void m42160a() {
        BubbleEasyPopup bubbleEasyPopup;
        C46392a.m102328k(C43525e.f96060a.m95788b(), true);
        try {
            InterfaceC41775x1 interfaceC41775x1 = f35227c;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
        } catch (Exception unused) {
        }
        f35227c = null;
        WeakReference<BubbleEasyPopup> weakReference = f35226b;
        if (weakReference != null && (bubbleEasyPopup = weakReference.get()) != null) {
            bubbleEasyPopup.m96331y();
        }
        f35226b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m42161b(@Nullable FragmentActivity fragmentActivity, @NotNull View anchorView) {
        BubbleEasyPopup bubbleEasyPopup;
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        WeakReference<BubbleEasyPopup> weakReference = f35226b;
        if ((weakReference == null || (bubbleEasyPopup = weakReference.get()) == null || !bubbleEasyPopup.m96299I()) && !C46392a.m102322d(C43525e.f96060a.m95788b(), false)) {
            InterfaceC41775x1 interfaceC41775x1 = f35227c;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            BubbleEasyPopup bubbleEasyPopup2 = new BubbleEasyPopup(fragmentActivity);
            bubbleEasyPopup2.m96307Q(R$layout.bmine_multi_account_switch_popup_layout).m96316Z(false).m96322p();
            PopupWindow popupWindowM96293B = bubbleEasyPopup2.m96293B();
            if (popupWindowM96293B != null) {
                popupWindowM96293B.setTouchable(true);
                popupWindowM96293B.setOutsideTouchable(false);
                popupWindowM96293B.setFocusable(false);
                popupWindowM96293B.setBackgroundDrawable(null);
            }
            bubbleEasyPopup2.m55378m0(anchorView, 2, 4, C43881b.m96650a(8), C43881b.m96650a(-10));
            f35227c = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new MultiAccountSwitchPop$showPop$2(null), 3, null);
            f35226b = new WeakReference<>(bubbleEasyPopup2);
        }
    }
}
