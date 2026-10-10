package w40;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.model.FuturesGridRunningItemModel;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import l50.C42083n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w40.b */
/* JADX INFO: compiled from: FailedItemBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/futures/runningList/binding/FailedItemBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "d", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45721b {
    /* JADX INFO: renamed from: c */
    public static final Unit m100922c(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m100923b(@NotNull final RecyclerView.ViewHolder holder, @NotNull final FuturesGridRunningItemModel d11, @Nullable final ItemCallBack<FuturesGridRunningItemModel> itemCallBack) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(d11, "d");
        C42083n c42083nM92319a = C42083n.m92319a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42083nM92319a, "bind(...)");
        c42083nM92319a.f93075k.setText(d11.getSymbolName());
        c42083nM92319a.f93070f.setText(d11.getDirection());
        c42083nM92319a.f93070f.setVisibility(d11.getDirectionVisible());
        TextView ivStrategyType = c42083nM92319a.f93070f;
        Intrinsics.checkNotNullExpressionValue(ivStrategyType, "ivStrategyType");
        m100924d(ivStrategyType, C27039d.m66650j(d11.getDirectionBgColor()));
        c42083nM92319a.f93072h.setBackground(C22890g.m54288m(C27039d.m66650j(d11.getLeverageBgColor()), 0.0f, 2, null));
        c42083nM92319a.f93072h.setText(d11.getLeverage());
        c42083nM92319a.f93072h.setVisibility(d11.getLeverageVisible());
        c42083nM92319a.f93072h.setTextColor(C27039d.m66650j(d11.getLeverageTextColor()));
        c42083nM92319a.f93074j.setText(d11.getStopReason());
        if (Intrinsics.areEqual(d11.getRunningStatus(), "TRANSFER_FAIL") || Intrinsics.areEqual(d11.getRunningStatus(), "START_FAILED")) {
            TextView tvStartFailedReasonText = c42083nM92319a.f93073i;
            Intrinsics.checkNotNullExpressionValue(tvStartFailedReasonText, "tvStartFailedReasonText");
            ViewExtKt.m66577h(tvStartFailedReasonText);
        } else {
            c42083nM92319a.f93073i.setText(d11.getStopReasonDetail());
            TextView tvStartFailedReasonText2 = c42083nM92319a.f93073i;
            Intrinsics.checkNotNullExpressionValue(tvStartFailedReasonText2, "tvStartFailedReasonText");
            ViewExtKt.m66594y(tvStartFailedReasonText2);
        }
        AppCompatImageView ivClose = c42083nM92319a.f93069e;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtKt.m66575f(ivClose, new Function1() { // from class: w40.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45721b.m100922c(itemCallBack, holder, d11, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m100924d(View view, int i11) {
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }
}
