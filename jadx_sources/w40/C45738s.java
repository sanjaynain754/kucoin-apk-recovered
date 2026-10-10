package w40;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.FuturesGridRunningItemModel;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import l50.C42081m;
import o50.C42973g;
import o50.C42974h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: w40.s */
/* JADX INFO: compiled from: StopReasonItemBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/futures/runningList/binding/StopReasonItemBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "d", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "generateReturnBalance", "Landroid/text/SpannableString;", "model", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "clickShowDetail", "btradingBotKitFuturesGirdStopReasonLayoutBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFuturesGirdStopReasonLayoutBinding;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStopReasonItemBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopReasonItemBinding.kt\ncom/kubi/tradingbotkit/business/futures/runningList/binding/StopReasonItemBinding\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1869#2,2:144\n*S KotlinDebug\n*F\n+ 1 StopReasonItemBinding.kt\ncom/kubi/tradingbotkit/business/futures/runningList/binding/StopReasonItemBinding\n*L\n80#1:144,2\n*E\n"})
public final class C45738s {
    /* JADX INFO: renamed from: d */
    public static final Unit m100962d(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m100963g(C42081m c42081m, AppCompatTextView appCompatTextView, FuturesGridRunningItemModel futuresGridRunningItemModel) {
        Group groupDetail = c42081m.f93042c;
        Intrinsics.checkNotNullExpressionValue(groupDetail, "groupDetail");
        if (groupDetail.getVisibility() == 0) {
            c42081m.f93049j.setMaxLines(1);
            C27014a1.m66504d(appCompatTextView, R$drawable.ic2_arrow_down_20, GravityCompat.END);
            ViewExtKt.m66577h(groupDetail);
        } else {
            C27014a1.m66504d(appCompatTextView, R$drawable.ic2_arrow_up_20, GravityCompat.END);
            c42081m.f93049j.setMaxLines(2);
            ViewExtKt.m66594y(groupDetail);
            c42081m.f93054o.setVisibility(futuresGridRunningItemModel.getTotalInvestVisible());
            c42081m.f93053n.setVisibility(futuresGridRunningItemModel.getTotalInvestVisible());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m100964c(@NotNull final RecyclerView.ViewHolder holder, @NotNull final FuturesGridRunningItemModel d11, @Nullable final ItemCallBack<FuturesGridRunningItemModel> itemCallBack) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(d11, "d");
        C42081m c42081mM92315a = C42081m.m92315a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42081mM92315a, "bind(...)");
        c42081mM92315a.f93052m.setText(d11.getSymbolName());
        TextView ivStrategyType = c42081mM92315a.f93045f;
        Intrinsics.checkNotNullExpressionValue(ivStrategyType, "ivStrategyType");
        m100965e(ivStrategyType, C27039d.m66650j(d11.getDirectionBgColor()));
        c42081mM92315a.f93045f.setText(d11.getDirection());
        c42081mM92315a.f93045f.setVisibility(d11.getDirectionVisible());
        c42081mM92315a.f93047h.setBackground(C22890g.m54288m(C27039d.m66650j(d11.getLeverageBgColor()), 0.0f, 2, null));
        c42081mM92315a.f93047h.setText(d11.getLeverage());
        c42081mM92315a.f93047h.setVisibility(d11.getLeverageVisible());
        c42081mM92315a.f93047h.setTextColor(C27039d.m66650j(d11.getLeverageTextColor()));
        c42081mM92315a.f93053n.setText(d11.getTotalInvest());
        c42081mM92315a.f93055p.setText(d11.getTotalProfit());
        c42081mM92315a.f93056q.setText(d11.getTotalProfitRate());
        c42081mM92315a.f93048i.setText(d11.getStopReason());
        c42081mM92315a.f93051l.setText(d11.getStopPriceText());
        c42081mM92315a.f93050k.setText(d11.getStopPriceNumber());
        c42081mM92315a.f93049j.setText(m100967h(d11));
        m100966f(c42081mM92315a, d11);
        AppCompatImageView ivClose = c42081mM92315a.f93044e;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtKt.m66575f(ivClose, new Function1() { // from class: w40.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45738s.m100962d(itemCallBack, holder, d11, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m100966f(final C42081m c42081m, final FuturesGridRunningItemModel futuresGridRunningItemModel) {
        final AppCompatTextView tvDetailText = c42081m.f93046g;
        Intrinsics.checkNotNullExpressionValue(tvDetailText, "tvDetailText");
        C27046k.m66711z(tvDetailText, 0L, new Function0() { // from class: w40.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45738s.m100963g(c42081m, tvDetailText, futuresGridRunningItemModel);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: h */
    public final SpannableString m100967h(FuturesGridRunningItemModel futuresGridRunningItemModel) {
        CharSequence charSequenceA;
        String strM92640e;
        StringBuilder sb2 = new StringBuilder();
        List<FuturesGridRunningItemModel.Transfer> transfers = futuresGridRunningItemModel.getTransfers();
        if (transfers != null) {
            for (FuturesGridRunningItemModel.Transfer transfer : transfers) {
                String currency = transfer.getCurrency();
                if (currency != null) {
                    if (sb2.length() > 0) {
                        sb2.append("、");
                    }
                    BigDecimal size = transfer.getSize();
                    if (size == null || (strM92640e = C42180b.m92640e(size, null, C27039d.m66651k(futuresGridRunningItemModel.getProfitPrecision(), 8), false, false, false, 0, null, 125, null)) == null || (charSequenceA = t0.a(strM92640e, currency)) == null) {
                        charSequenceA = "";
                    }
                    sb2.append(charSequenceA);
                }
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C27017c c27017c = C27017c.f54310a;
        return C42973g.m94370c(t0.a(t0.a(C42974h.m94378g(c27017c.m66513b(), R$string.kc_tb_grid_back_to, null, 2, null), C42974h.m94378g(c27017c.m66513b(), R$string.trade_account, null, 2, null)), C42974h.m94372a(string)).toString(), string, c27017c.m66512a(R$color.primary));
    }

    /* JADX INFO: renamed from: e */
    public final void m100965e(View view, int i11) {
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }
}
