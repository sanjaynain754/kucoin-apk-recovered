package com.kubi.kumex.record.currentDelegate;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import cm.CancelAllOrderParams;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.currentDelegate.viewModel.FiltersInfo;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.PageEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44081i;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedDelegateHistFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J0\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/AdvancedDelegateHistFragment;", "Lcom/kubi/kumex/record/currentDelegate/AbsActiveDelegateHistFragment;", "<init>", "()V", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "fetchOrders", "assetType", "", "symbol", "currentPage", "", "fetchOppositeAssetTypeOrdersNum", "lastPageOrdersFetcher", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "curLastPage", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onOrderEmpty", "isOrdersEmpty", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdvancedDelegateHistFragment extends AbsActiveDelegateHistFragment {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f29968a0 = new Companion(null);

    /* JADX INFO: compiled from: AdvancedDelegateHistFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/AdvancedDelegateHistFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/record/currentDelegate/AdvancedDelegateHistFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AdvancedDelegateHistFragment newInstance() {
            return new AdvancedDelegateHistFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.AdvancedDelegateHistFragment$a */
    /* JADX INFO: compiled from: AdvancedDelegateHistFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16561a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29969b;

        public C16561a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29969b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29969b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29969b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m35372p4(final AdvancedDelegateHistFragment advancedDelegateHistFragment, Boolean bool) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(0).m54167X4(R$string.onekey_cancel_all);
        Context context = advancedDelegateHistFragment.getContext();
        alertDialogFragmentHelperM54167X4.m54156M4(context != null ? C17054k0.m36533g(context) : null).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.record.currentDelegate.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AdvancedDelegateHistFragment.m35373q4(this.f30156b, dialogInterface, i11);
            }
        }).m54172c5(advancedDelegateHistFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m35374r4(AdvancedDelegateHistFragment advancedDelegateHistFragment) {
        MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4497J(new CancelAllOrderParams(advancedDelegateHistFragment.m35359G3(), advancedDelegateHistFragment.m35358F3(), null, Boolean.TRUE, 4, null));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment
    /* JADX INFO: renamed from: D3 */
    public void mo35356D3(@NotNull String assetType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        m35361I3().m35541L(assetType, str, new Function0() { // from class: com.kubi.kumex.record.currentDelegate.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedDelegateHistFragment.m35371o4(this.f30062b);
            }
        });
    }

    @Override // com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment
    /* JADX INFO: renamed from: E3 */
    public void mo35357E3(@NotNull String assetType, @Nullable String str, long j11) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        m35361I3().m35542M(assetType, str, j11);
    }

    @Override // com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment
    @Nullable
    /* JADX INFO: renamed from: f4 */
    public Object mo35364f4(long j11, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super PageEntity<OrderEntity>> continuation) {
        InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
        HashMap map = new HashMap();
        map.put("status", "active");
        map.put("currentPage", String.valueOf(j11));
        map.put("pageSize", "50");
        map.put("fundsType", str);
        if (str2 != null && str2.length() != 0) {
            map.put("symbol", str2);
        }
        return interfaceC44081iM20260s.mo4504g(map);
    }

    @Override // com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m35362J3().m35579r().observe(getViewLifecycleOwner(), new C16561a(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedDelegateHistFragment.m35372p4(this.f30064b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public static final String m35371o4(AdvancedDelegateHistFragment advancedDelegateHistFragment) {
        String fundsType;
        FiltersInfo value = advancedDelegateHistFragment.m35362J3().m35577p().getValue();
        if (value != null && (fundsType = value.getFundsType()) != null) {
            return fundsType;
        }
        return OrderAssetType.SelfFunds.getTypeName();
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m35373q4(final AdvancedDelegateHistFragment advancedDelegateHistFragment, DialogInterface dialogInterface, int i11) {
        advancedDelegateHistFragment.m35361I3().m35560e0(new Function0() { // from class: com.kubi.kumex.record.currentDelegate.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedDelegateHistFragment.m35374r4(this.f30157b);
            }
        });
    }

    @Override // com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment
    /* JADX INFO: renamed from: h4 */
    public void mo35365h4(boolean z11) {
        m35362J3().m35572A(z11);
    }
}
