package p318hp;

import android.annotation.SuppressLint;
import android.view.View;
import com.kubi.margin.R$id;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.margin.view.LeverGiftView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hp.a */
/* JADX INFO: compiled from: LeverBadgeHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/margin/helper/LeverBadgeHelper;", "", "<init>", "()V", "giftView", "Lcom/kubi/margin/view/LeverGiftView;", "getGiftView", "()Lcom/kubi/margin/view/LeverGiftView;", "setGiftView", "(Lcom/kubi/margin/view/LeverGiftView;)V", "checkBadge", "", "fragment", "Lcom/kubi/margin/trade/BaseMarginFragment;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38236a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38236a f85935a = new C38236a();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static LeverGiftView f85936b;

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: a */
    public final void m86316a(@NotNull BaseMarginFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment.isShowing()) {
            LeverGiftView leverGiftView = f85936b;
            if (!C27025c.m66566d(leverGiftView != null ? Boolean.valueOf(leverGiftView.m40687i("interest")) : null)) {
                LeverGiftView leverGiftView2 = f85936b;
                if (!C27025c.m66566d(leverGiftView2 != null ? Boolean.valueOf(leverGiftView2.m40687i("bonus")) : null)) {
                    View viewFindViewById = fragment.findViewById(R$id.viewBadge);
                    if (viewFindViewById != null) {
                        C27046k.m66703r(viewFindViewById);
                        return;
                    }
                    return;
                }
            }
            View viewFindViewById2 = fragment.findViewById(R$id.viewBadge);
            if (viewFindViewById2 != null) {
                ViewExtKt.m66594y(viewFindViewById2);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final LeverGiftView m86317b() {
        return f85936b;
    }

    /* JADX INFO: renamed from: c */
    public final void m86318c(@Nullable LeverGiftView leverGiftView) {
        f85936b = leverGiftView;
    }
}
