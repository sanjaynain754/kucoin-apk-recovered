package com.kubi.margin.delegation;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.margin.R$array;
import com.kubi.margin.delegation.borrowing.MarginDelegationBorrowingFragment;
import com.kubi.margin.delegation.interest.MarginDelegationInterestFragment;
import com.kubi.margin.delegation.liquidation.MarginDelegationLiquidationFragment;
import com.kubi.margin.delegation.repayment.MarginDelegationRepaymentFragment;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.DelegationFragment;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspot.api.IUtaSpotService;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t20.C44645i0;

/* JADX INFO: compiled from: MarginDelegationFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginDelegationFragment;", "Lcom/kubi/spot/business/delegation/DelegationFragment;", "<init>", "()V", "addOtherFragment", "", "trackPosition", ViewProps.POSITION, "", "getFragmentTitles", "", "", "shouldShowUnifyRecordTab", "", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationFragment.kt\ncom/kubi/margin/delegation/MarginDelegationFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class MarginDelegationFragment extends DelegationFragment {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f32834e0 = new Companion(null);

    /* JADX INFO: compiled from: MarginDelegationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginDelegationFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/delegation/MarginDelegationFragment;", "bundle", "Landroid/os/Bundle;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginDelegationFragment newInstance(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            MarginDelegationFragment marginDelegationFragment = new MarginDelegationFragment();
            marginDelegationFragment.setArguments(bundle);
            return marginDelegationFragment;
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final boolean m38090O3() {
        return IUnifyAccountService.f53155a.get().mo64991e() && Intrinsics.areEqual(m60596B3(), "MARGIN_TRADE");
    }

    @Override // com.kubi.spot.business.delegation.DelegationFragment
    /* JADX INFO: renamed from: L3 */
    public void mo38089L3(int i11) {
        String str;
        switch (i11) {
            case 0:
                str = "openOrders";
                break;
            case 1:
                str = "stopOrders";
                break;
            case 2:
                str = "orderHistory";
                break;
            case 3:
                str = "orderBorrow";
                break;
            case 4:
                str = "orderRepay";
                break;
            case 5:
                str = "interestRecord";
                break;
            case 6:
                str = "liquidation";
                break;
            case 7:
                str = "unifyRecord";
                break;
            default:
                str = null;
                break;
        }
        String str2 = str;
        if (str2 != null) {
            C43852m.m96591c("B4TradeHistory", str2, "1", null, 8, null);
        }
    }

    @Override // com.kubi.spot.business.delegation.DelegationFragment
    /* JADX INFO: renamed from: t3 */
    public void mo38091t3() {
        int i11;
        BaseFragment baseFragmentM60597C3;
        String strM56284y;
        RtlViewPager rtlViewPager;
        RtlViewPager rtlViewPager2;
        View view;
        ConstraintLayout constraintLayout;
        SlidingTabLayout slidingTabLayout;
        if (Intrinsics.areEqual(m60596B3(), "MARGIN_TRADE")) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                strM56284y = RouteExKt.m56284y(arguments, "positionType");
            } else {
                strM56284y = null;
            }
            if (!Intrinsics.areEqual(strM56284y, "isolated")) {
                getTabFragments().clear();
                getTabFragments().add(IUtaSpotService.f54014a.get().mo65990c(m60604z3(), m60602x3(), m60596B3()));
                C44645i0 c44645i0M60600u3 = m60600u3();
                if (c44645i0M60600u3 != null && (slidingTabLayout = c44645i0M60600u3.f99131c) != null) {
                    ViewExtKt.m66577h(slidingTabLayout);
                }
                C44645i0 c44645i0M60600u4 = m60600u3();
                if (c44645i0M60600u4 != null && (constraintLayout = c44645i0M60600u4.f99133e) != null) {
                    ViewExtKt.m66577h(constraintLayout);
                }
                C44645i0 c44645i0M60600u5 = m60600u3();
                if (c44645i0M60600u5 != null && (view = c44645i0M60600u5.f99134f) != null) {
                    ViewExtKt.m66577h(view);
                }
                C44645i0 c44645i0M60600u6 = m60600u3();
                if (c44645i0M60600u6 != null && (rtlViewPager2 = c44645i0M60600u6.f99132d) != null) {
                    rtlViewPager2.setCurrentItem(0);
                }
                C44645i0 c44645i0M60600u7 = m60600u3();
                if (c44645i0M60600u7 != null && (rtlViewPager = c44645i0M60600u7.f99132d) != null) {
                    rtlViewPager.setScroll(false);
                    return;
                }
                return;
            }
        }
        getTabFragments().add(MarginDelegationBorrowingFragment.f32850j0.newInstance(i11));
        getTabFragments().add(MarginDelegationRepaymentFragment.f32991j0.newInstance(i11));
        getTabFragments().add(MarginDelegationInterestFragment.f32913j0.newInstance(i11));
        getTabFragments().add(MarginDelegationLiquidationFragment.f32945k0.newInstance(i11));
        if (m38090O3() && (baseFragmentM60597C3 = m60597C3()) != null) {
            getTabFragments().add(baseFragmentM60597C3);
        }
    }

    @Override // com.kubi.spot.business.delegation.DelegationFragment
    @NotNull
    /* JADX INFO: renamed from: v3 */
    public List<CharSequence> mo38092v3() {
        String[] stringArray = getResources().getStringArray(R$array.margin_delegation_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        List<CharSequence> mutableList = ArraysKt.toMutableList(stringArray);
        if (m38090O3() && m60597C3() != null) {
            mutableList.add(getString(R$string.unify_borrow_label));
        }
        return mutableList;
    }
}
