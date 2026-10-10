package m20;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.kubi.resources.C22890g;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.TSOActivePricePrefix;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m20.q */
/* JADX INFO: compiled from: DelegationListTSOItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegationList/DelegationListTSOItemView;", "Lcom/kubi/spot/business/delegation/delegationList/DelegationListBaseItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "delegationListFragment", "Lcom/kubi/sdk/BaseFragment;", "isShowActivated", "", "appendActivePriceSuffix", "Lcom/kubi/utils/StyledText;", "content", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42417q extends C42401a {
    @Override // m20.C42401a, m20.InterfaceC42418r
    /* JADX INFO: renamed from: a */
    public void mo93102a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, @NotNull BaseFragment delegationListFragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationListFragment, "delegationListFragment");
        super.mo93102a(helper, item, delegationListFragment);
        helper.setGone(R$id.tv_limit_price_label, true);
        helper.setGone(R$id.tv_limit_price, true);
        helper.setGone(R$id.view_dash, true);
        helper.setText(R$id.tv_trigger_price_label, delegationListFragment.getString(R$string.trailing_stop_act_price));
        String str = TSOActivePricePrefix.f50074a.m60968a(item) + item.getPriceFormatterStr(item.getStopPrice());
        CharSequence charSequenceM93105c = str;
        if (m93106d(item)) {
            charSequenceM93105c = m93105c(str, delegationListFragment, item);
        }
        helper.setText(R$id.tv_trigger_price, charSequenceM93105c);
        helper.setText(R$id.tv_delegation_price_label, delegationListFragment.getString(R$string.trailing_stop_trailing_delta));
        int i11 = R$id.tv_delegation_price;
        BigDecimal pop = item.getPop();
        helper.setText(i11, C42180b.m92649n(pop != null ? C42180b.m92642g(pop, null, null, 0, false, false, false, 63, null) : null));
    }

    /* JADX INFO: renamed from: c */
    public final C27096v0 m93105c(String str, BaseFragment baseFragment, DelegationEntity delegationEntity) {
        Integer numValueOf;
        Context context = baseFragment.getContext();
        if (context != null) {
            numValueOf = Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(delegationEntity.getSide(), "buy")));
        } else {
            numValueOf = null;
        }
        int iM66651k = C27039d.m66651k(numValueOf, baseFragment.getColorRes(R$color.c_text));
        C27096v0 c27096v0M66903c = new C27096v0().m66903c(str + '(' + C27017c.f54310a.m66516f(R$string.trailing_stop_activated, new Object[0]) + ')', new ForegroundColorSpan(iM66651k));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
        return c27096v0M66903c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93106d(DelegationEntity delegationEntity) {
        String upperCase;
        String status = delegationEntity.getStatus();
        if (status != null) {
            upperCase = status.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return Intrinsics.areEqual(upperCase, "ACTIVE");
    }
}
