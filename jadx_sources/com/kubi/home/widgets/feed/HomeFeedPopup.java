package com.kubi.home.widgets.feed;

import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.utils.C27017c;
import dj.C36719d;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.widgets.feed.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeFeedPopup.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\nR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/home/widgets/feed/HomeFeedPopup;", "", "<init>", "()V", "popupRef", "Ljava/lang/ref/WeakReference;", "Lcom/zyyoona7/popup/EasyPopup;", "showKey", "", "tryToShowFeedPopup", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dismissPopup", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedPopup.kt\ncom/kubi/home/widgets/feed/HomeFeedPopup\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,90:1\n136#2:91\n126#2,2:93\n254#3:92\n*S KotlinDebug\n*F\n+ 1 HomeFeedPopup.kt\ncom/kubi/home/widgets/feed/HomeFeedPopup\n*L\n47#1:91\n81#1:93,2\n55#1:92\n*E\n"})
public final class HomeFeedPopup {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeFeedPopup f26740a = new HomeFeedPopup();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static WeakReference<C43724b> f26741b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static String f26742c;

    /* JADX INFO: renamed from: b */
    public final void m31168b() {
        C43724b c43724b;
        f26742c = null;
        WeakReference<C43724b> weakReference = f26741b;
        if (weakReference != null && (c43724b = weakReference.get()) != null) {
            c43724b.m96331y();
        }
        f26741b = null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m31167d() {
        f26740a.m31168b();
    }

    /* JADX INFO: renamed from: c */
    public final void m31169c(@Nullable FragmentActivity fragmentActivity) {
        View viewFindViewById;
        BaseTextView baseTextView;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        C37201i c37201i = C37201i.f82500a;
        StorageId<Boolean> storageIdM83224m = c37201i.m83224m();
        if (storageIdM83224m == null) {
            m31168b();
            return;
        }
        if (Intrinsics.areEqual(f26742c, c37201i.m83226o())) {
            return;
        }
        if (C46392a.m102322d(storageIdM83224m, false)) {
            m31168b();
            return;
        }
        m31168b();
        View viewFindViewById2 = fragmentActivity.findViewById(R$id.home_feed_action_layout);
        if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0 && (viewFindViewById = viewFindViewById2.findViewById(R$id.home_feed_action)) != null && viewFindViewById.isAttachedToWindow()) {
            BubbleEasyPopup bubbleEasyPopup = new BubbleEasyPopup(fragmentActivity);
            bubbleEasyPopup.m96307Q(R$layout.home_feed_action_popup_layout).m96316Z(false).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.home.widgets.feed.g
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    HomeFeedPopup.m31167d();
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
            if (Intrinsics.areEqual(storageIdM83224m, C36719d.f79632a.m82258c()) && (baseTextView = (BaseTextView) bubbleEasyPopup.m96332z(R$id.home_feed_action_pop_hint_text)) != null) {
                baseTextView.setText(C27017c.f54310a.m66516f(R$string.home_feed_live_tips, new Object[0]));
            }
            bubbleEasyPopup.m55378m0(viewFindViewById, 1, 4, C43881b.m96650a(4), 0);
            f26741b = new WeakReference<>(bubbleEasyPopup);
            C46392a.m102328k(storageIdM83224m, true);
            f26742c = c37201i.m83226o();
        }
    }
}
