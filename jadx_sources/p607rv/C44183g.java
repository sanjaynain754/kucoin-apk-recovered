package p607rv;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.kubi.quotefacade.api.R$id;
import com.kubi.quotefacade.api.R$layout;
import com.kubi.quotefacade.api.R$string;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.utils.extensions.C27046k;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: rv.g */
/* JADX INFO: compiled from: KlineAiPopup.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\nJ$\u0010\u0016\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\nJF\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/utils/KlineAiPopup;", "", "<init>", "()V", "AI_AUTO_DISMISS_DELAY", "", "PRICE_ALERT_AUTO_DISMISS_DELAY", "SHOW_DELAY", "KLINE_AI_POP", "Lcom/kubi/utils/storage/StorageId;", "", "KLINE_PRICE_ALERT_POP", "popupRef", "Ljava/lang/ref/WeakReference;", "Lcom/zyyoona7/popup/EasyPopup;", "tryToShowAiPopup", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "forceShow", "tryToShowPriceAlertPopup", "tryToShowPopup", "showStorageId", "messageRes", "", "autoDismissDelay", "dismissPopup", "resetShowState", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineAiPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineAiPopup.kt\ncom/kubi/quotefacade/utils/KlineAiPopup\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,153:1\n136#2:154\n126#2,2:155\n126#2,2:157\n*S KotlinDebug\n*F\n+ 1 KlineAiPopup.kt\ncom/kubi/quotefacade/utils/KlineAiPopup\n*L\n82#1:154\n150#1:155,2\n129#1:157,2\n*E\n"})
public final class C44183g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44183g f97524a = new C44183g();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f97525b = new StorageId<>("kline_ai", "key_kline_ai_pop", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f97526c = new StorageId<>("kline_ai", "key_kline_price_alert_pop", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public static WeakReference<C43724b> f97527d;

    /* JADX INFO: renamed from: i */
    public static final void m97403i() {
        f97527d = null;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m97404j() {
        f97524a.m97408f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m97406l() {
        f97524a.m97408f();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m97407n(C44183g c44183g, Activity activity, View view, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c44183g.m97410m(activity, view, z11);
    }

    /* JADX INFO: renamed from: f */
    public final void m97408f() {
        C43724b c43724b;
        WeakReference<C43724b> weakReference = f97527d;
        if (weakReference != null && (c43724b = weakReference.get()) != null) {
            c43724b.m96331y();
        }
        f97527d = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m97409g(final Activity activity, final View view, final StorageId<Boolean> storageId, @StringRes final int i11, final long j11, boolean z11) {
        if (activity == null || view == null) {
            return;
        }
        if (z11 || !C46392a.m102322d(storageId, false)) {
            m97408f();
            C22912t.m54417o(view, new Runnable() { // from class: rv.b
                @Override // java.lang.Runnable
                public final void run() {
                    C44183g.m97402h(activity, view, i11, storageId, j11);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m97410m(@Nullable Activity activity, @Nullable View view, boolean z11) {
        m97409g(activity, view, f97526c, R$string.kc_guide_alert_tips, 5000L, z11);
    }

    /* JADX INFO: renamed from: h */
    public static final void m97402h(Activity activity, View view, int i11, StorageId storageId, long j11) {
        if (!activity.isFinishing() && !activity.isDestroyed() && view.isAttachedToWindow() && view.isShown()) {
            BubbleEasyPopup bubbleEasyPopup = new BubbleEasyPopup(activity);
            bubbleEasyPopup.m96307Q(R$layout.quote_popup_ai_tips).m96313W(false).m96315Y(new PopupWindow.OnDismissListener() { // from class: rv.c
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C44183g.m97403i();
                }
            }).m96322p();
            final BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) bubbleEasyPopup.m96332z(R$id.layoutBubble);
            TextView textView = (TextView) bubbleEasyPopup.m96332z(R$id.tvMsg);
            if (textView != null) {
                textView.setText(activity.getString(i11));
            }
            if (bubbleLinearLayout != null) {
                bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Up);
                bubbleLinearLayout.setArrowPosPolicy(BubbleStyle.ArrowPosPolicy.TargetCenter);
                bubbleLinearLayout.setArrowTo(view);
            }
            View viewM96332z = bubbleEasyPopup.m96332z(R$id.ivClose);
            if (viewM96332z != null) {
                C27046k.m66711z(viewM96332z, 0L, new Function0() { // from class: rv.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C44183g.m97404j();
                    }
                }, 1, null);
            }
            bubbleEasyPopup.m96320e0(view, 2, 0, 0, 0);
            if (bubbleLinearLayout != null) {
                bubbleLinearLayout.post(new Runnable() { // from class: rv.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C44183g.m97405k(bubbleLinearLayout);
                    }
                });
            }
            f97527d = new WeakReference<>(bubbleEasyPopup);
            C46392a.m102328k(storageId, true);
            C22912t.m54417o(view, new Runnable() { // from class: rv.f
                @Override // java.lang.Runnable
                public final void run() {
                    C44183g.m97406l();
                }
            }, j11);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m97405k(BubbleLinearLayout bubbleLinearLayout) {
        bubbleLinearLayout.m6999c();
    }
}
