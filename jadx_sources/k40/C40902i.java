package k40;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import l50.C42094t;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: k40.i */
/* JADX INFO: compiled from: AssetRunningItemBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/adapter/AssetRunningItemBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "model", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "setAnimation", "btradingBotKitItemBotAssetsRunningBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitItemBotAssetsRunningBinding;", "setSplit", "setTopMargin", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40902i {
    /* JADX INFO: renamed from: j */
    public static final Unit m89582j() {
        C42899b.m94073c(new Function1() { // from class: k40.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40902i.m89583k((FragmentActivity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m89583k(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54146C4(R$drawable.ic2_close_withcircle_24).m54153J4(R$string.kc_robot_jishu_tip1).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: k40.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40902i.m89584l(dialogInterface, i11);
            }
        }).m54172c5(it.getSupportFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m89585m() {
        C42899b.m94073c(new Function1() { // from class: k40.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40902i.m89586n((FragmentActivity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m89586n(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54146C4(R$drawable.ic2_close_withcircle_24).m54153J4(R$string.kc_robot_jishu_tip2).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: k40.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40902i.m89587o(dialogInterface, i11);
            }
        }).m54172c5(it.getSupportFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m89588p() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m89589q() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m89590i(@NotNull RecyclerView.ViewHolder holder, @NotNull BotAssetsTotalItemModel model) {
        CharSequence totalProfitShow;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        C42094t c42094tM92343a = C42094t.m92343a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42094tM92343a, "bind(...)");
        c42094tM92343a.f93269j.setText(model.getName());
        c42094tM92343a.f93267h.setText(model.getTotalAssetsShow());
        ShowHideTextView showHideTextView = c42094tM92343a.f93272m;
        if (model.getIsNewAipVersion()) {
            C27096v0 totalProfitShow2 = model.getTotalProfitShow();
            totalProfitShow = totalProfitShow2 != null ? StringsKt.removeSuffix(totalProfitShow2, " / ") : null;
        } else {
            totalProfitShow = model.getTotalProfitShow();
        }
        showHideTextView.setText(totalProfitShow);
        c42094tM92343a.f93270k.setText(model.getTodayProfitsShow());
        c42094tM92343a.f93268i.setText(model.getTotalAssetsText());
        c42094tM92343a.f93271l.setText(model.getTodayTotalProfitsText());
        m89593t(c42094tM92343a, model);
        m89592s(model, c42094tM92343a);
        m89591r(c42094tM92343a);
        ShowHideTextView.m54778d(holder.itemView, model.getHideNumber());
        if (!model.getIsNewAipVersion()) {
            BaseTextView spotAipPnlTips = c42094tM92343a.f93266g;
            Intrinsics.checkNotNullExpressionValue(spotAipPnlTips, "spotAipPnlTips");
            ViewExtKt.m66577h(spotAipPnlTips);
            ShowHideTextView tvTodayProfitNumber = c42094tM92343a.f93270k;
            Intrinsics.checkNotNullExpressionValue(tvTodayProfitNumber, "tvTodayProfitNumber");
            ViewExtKt.m66594y(tvTodayProfitNumber);
            c42094tM92343a.f93268i.setNeedDash(false);
            c42094tM92343a.f93271l.setNeedDash(false);
            DashTextView tvAssetsText = c42094tM92343a.f93268i;
            Intrinsics.checkNotNullExpressionValue(tvAssetsText, "tvAssetsText");
            C27046k.m66711z(tvAssetsText, 0L, new Function0() { // from class: k40.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C40902i.m89588p();
                }
            }, 1, null);
            DashTextView tvTodayProfitText = c42094tM92343a.f93271l;
            Intrinsics.checkNotNullExpressionValue(tvTodayProfitText, "tvTodayProfitText");
            C27046k.m66711z(tvTodayProfitText, 0L, new Function0() { // from class: k40.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C40902i.m89589q();
                }
            }, 1, null);
            return;
        }
        ShowHideTextView tvTodayProfitNumber2 = c42094tM92343a.f93270k;
        Intrinsics.checkNotNullExpressionValue(tvTodayProfitNumber2, "tvTodayProfitNumber");
        ViewExtKt.m66577h(tvTodayProfitNumber2);
        c42094tM92343a.f93268i.setNeedDash(true);
        c42094tM92343a.f93271l.setNeedDash(true);
        DashTextView tvAssetsText2 = c42094tM92343a.f93268i;
        Intrinsics.checkNotNullExpressionValue(tvAssetsText2, "tvAssetsText");
        C27046k.m66711z(tvAssetsText2, 0L, new Function0() { // from class: k40.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40902i.m89582j();
            }
        }, 1, null);
        DashTextView tvTodayProfitText2 = c42094tM92343a.f93271l;
        Intrinsics.checkNotNullExpressionValue(tvTodayProfitText2, "tvTodayProfitText");
        C27046k.m66711z(tvTodayProfitText2, 0L, new Function0() { // from class: k40.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40902i.m89585m();
            }
        }, 1, null);
        String newAipVersionTip = model.getNewAipVersionTip();
        if (newAipVersionTip == null || newAipVersionTip.length() == 0) {
            BaseTextView spotAipPnlTips2 = c42094tM92343a.f93266g;
            Intrinsics.checkNotNullExpressionValue(spotAipPnlTips2, "spotAipPnlTips");
            ViewExtKt.m66577h(spotAipPnlTips2);
            return;
        }
        c42094tM92343a.f93266g.setText("* " + model.getNewAipVersionTip());
        BaseTextView spotAipPnlTips3 = c42094tM92343a.f93266g;
        Intrinsics.checkNotNullExpressionValue(spotAipPnlTips3, "spotAipPnlTips");
        ViewExtKt.m66594y(spotAipPnlTips3);
    }

    /* JADX INFO: renamed from: r */
    public final void m89591r(C42094t c42094t) {
        LottieAnimationView lottieView = c42094t.f93263d;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        lottieView.cancelAnimation();
        lottieView.setAnimation("bot_asset_running.json");
        lottieView.playAnimation();
    }

    /* JADX INFO: renamed from: t */
    public final void m89593t(C42094t c42094t, BotAssetsTotalItemModel botAssetsTotalItemModel) {
        ViewGroup.LayoutParams layoutParams = c42094t.f93263d.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (botAssetsTotalItemModel.getFirstItem()) {
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            }
        } else if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) C27025c.m66565c(C27017c.f54310a.m66513b(), 12);
        }
        c42094t.f93263d.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: s */
    public final void m89592s(BotAssetsTotalItemModel botAssetsTotalItemModel, C42094t c42094t) {
        if (botAssetsTotalItemModel.getLastItem()) {
            View splitView = c42094t.f93265f;
            Intrinsics.checkNotNullExpressionValue(splitView, "splitView");
            ViewExtKt.m66577h(splitView);
            View fakeDivider = c42094t.f93261b;
            Intrinsics.checkNotNullExpressionValue(fakeDivider, "fakeDivider");
            ViewExtKt.m66594y(fakeDivider);
            return;
        }
        View splitView2 = c42094t.f93265f;
        Intrinsics.checkNotNullExpressionValue(splitView2, "splitView");
        ViewExtKt.m66594y(splitView2);
        View fakeDivider2 = c42094t.f93261b;
        Intrinsics.checkNotNullExpressionValue(fakeDivider2, "fakeDivider");
        ViewExtKt.m66577h(fakeDivider2);
    }

    /* JADX INFO: renamed from: l */
    public static final void m89584l(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: o */
    public static final void m89587o(DialogInterface dialogInterface, int i11) {
    }
}
