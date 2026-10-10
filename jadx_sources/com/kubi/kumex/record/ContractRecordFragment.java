package com.kubi.kumex.record;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.history.PnlHistoryFragment;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment;
import com.kubi.kumex.record.done.DelegateRecordFragment;
import com.kubi.kumex.record.done.RnOrderHistoryFragment;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36861w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ContractRecordFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020 H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/record/ContractRecordFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentContractRecordBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentContractRecordBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "pageInfos", "", "Lcom/kubi/kumex/record/PageInfo;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindAdapter", "getDefaultCheckedIndex", "", "onBackPressed", "indexOf", "titleResId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractRecordFragment.kt\ncom/kubi/kumex/record/ContractRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n143#2,20:170\n1563#3:190\n1634#3,3:191\n1563#3:194\n1634#3,3:195\n1563#3:198\n1634#3,3:199\n*S KotlinDebug\n*F\n+ 1 ContractRecordFragment.kt\ncom/kubi/kumex/record/ContractRecordFragment\n*L\n46#1:170,20\n133#1:190\n133#1:191,3\n139#1:194\n139#1:195,3\n164#1:198\n164#1:199,3\n*E\n"})
public final class ContractRecordFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29887U = C45681e.m100799e(this, new Function1<ContractRecordFragment, C36861w1>() { // from class: com.kubi.kumex.record.ContractRecordFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36861w1 invoke(@NotNull ContractRecordFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36861w1.m82587a(fragment.requireView());
        }
    }, new Function1<C36861w1, Unit>() { // from class: com.kubi.kumex.record.ContractRecordFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36861w1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36861w1 c36861w1) {
            invoke(c36861w1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public boolean f29888V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public List<PageInfo> f29889W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f29886Y = {Reflection.property1(new PropertyReference1Impl(ContractRecordFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentContractRecordBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f29885X = new Companion(null);

    /* JADX INFO: compiled from: ContractRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/record/ContractRecordFragment$Companion;", "", "<init>", "()V", "TODO_DELEGATES", "", "PNL_HISTORY", "DELEGATION_RECORD", "TRADE_RECORD", "FUNDS_RECORD", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: m3 */
    private final int m35147m3(@StringRes int i11) {
        List<PageInfo> list = this.f29889W;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PageInfo) it.next()).getTitle());
        }
        return arrayList.indexOf(getString(i11));
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34289W() {
        return this.f29888V;
    }

    /* JADX INFO: renamed from: k3 */
    public final C36861w1 m35148k3() {
        return (C36861w1) this.f29887U.getValue(this, f29886Y[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_contract_record, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36861w1 c36861w1M35148k3 = m35148k3();
        if (c36861w1M35148k3 == null) {
            return;
        }
        int iM35149l3 = 0;
        getTitleBar().setTitle(getStringRes(R$string.kumex_record_history, new Object[0]));
        m35146j3();
        Bundle arguments = getArguments();
        String strM56285z = arguments != null ? RouteExKt.m56285z(arguments, "page", "") : null;
        if (strM56285z != null && strM56285z.length() != 0) {
            if (strM56285z != null) {
                switch (strM56285z.hashCode()) {
                    case -702327115:
                        if (strM56285z.equals("TradeRecord")) {
                            iM35149l3 = m35147m3(R$string.deal_detail);
                        }
                        break;
                    case -91306977:
                        if (strM56285z.equals("FundsRecord")) {
                            iM35149l3 = m35147m3(R$string.funds_record);
                        }
                        break;
                    case 260745672:
                        if (strM56285z.equals("TodoDelegates")) {
                            iM35149l3 = m35147m3(R$string.todo_delegation);
                        }
                        break;
                    case 491244473:
                        if (strM56285z.equals("DelegationRecord")) {
                            iM35149l3 = m35147m3(R$string.history_delegation);
                        }
                        break;
                    case 2043836070:
                        if (strM56285z.equals("PnlHistory")) {
                            iM35149l3 = m35147m3(R$string.pnl_history);
                        }
                        break;
                }
            }
        } else {
            iM35149l3 = m35149l3();
        }
        c36861w1M35148k3.f81279c.setCurrentItem(iM35149l3);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f29888V = z11;
    }

    /* JADX INFO: renamed from: j3 */
    private final void m35146j3() {
        Collection collectionEmptyList;
        List listEmptyList;
        List<PageInfo> list;
        List<PageInfo> list2;
        BaseFragment baseFragmentNewInstance;
        C36861w1 c36861w1M35148k3 = m35148k3();
        if (c36861w1M35148k3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f29889W = arrayList;
        arrayList.add(new PageInfo(getStringRes(R$string.todo_delegation, new Object[0]), TodoDelegateHistFragment.f29972Z.newInstance(getArguments())));
        List<PageInfo> list3 = this.f29889W;
        if (list3 != null) {
            String stringRes = getStringRes(R$string.history_delegation, new Object[0]);
            if (IUnifyAccountService.f53155a.get().mo64980D()) {
                baseFragmentNewInstance = RnOrderHistoryFragment.f30175V.newInstance(getArguments(), BrokerConfig.f19211a.m20201d().mo4515x());
            } else {
                baseFragmentNewInstance = DelegateRecordFragment.f30165c0.newInstance(getArguments());
            }
            list3.add(new PageInfo(stringRes, baseFragmentNewInstance));
        }
        List<PageInfo> list4 = this.f29889W;
        if (list4 != null) {
            list4.add(new PageInfo(getStringRes(R$string.pnl_history, new Object[0]), PnlHistoryFragment.f23085e0.newInstance(getArguments())));
        }
        List<PageInfo> list5 = this.f29889W;
        if (list5 != null) {
            list5.add(new PageInfo(getStringRes(R$string.deal_detail, new Object[0]), TradeRecordFragment.f29927e0.newInstance(getArguments())));
        }
        if (BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.CLASSIC && (list2 = this.f29889W) != null) {
            list2.add(new PageInfo(getStringRes(R$string.funds_record, new Object[0]), IAssetsCenterService.f16464a.get().mo15343h(getArguments())));
        }
        BaseFragment baseFragmentMo64984H = IUnifyAccountService.f53155a.get().mo64984H(getArguments());
        if (baseFragmentMo64984H != null && (list = this.f29889W) != null) {
            list.add(new PageInfo(baseFragmentMo64984H.getStringRes(R$string.unify_borrow_label, new Object[0]), baseFragmentMo64984H));
        }
        ArrayList arrayList2 = new ArrayList();
        List<PageInfo> list6 = this.f29889W;
        if (list6 != null) {
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it = list6.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(((PageInfo) it.next()).getFragment());
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        arrayList2.addAll(collectionEmptyList);
        c36861w1M35148k3.f81279c.setOffscreenPageLimit(arrayList2.size() - 1);
        RtlViewPager rtlViewPager = c36861w1M35148k3.f81279c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        List<PageInfo> list7 = this.f29889W;
        if (list7 != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator<T> it2 = list7.iterator();
            while (it2.hasNext()) {
                listEmptyList.add(((PageInfo) it2.next()).getTitle());
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        rtlViewPager.setAdapter(new C27103z(childFragmentManager, arrayList2, listEmptyList));
        c36861w1M35148k3.f81278b.setNeedBold(true);
        c36861w1M35148k3.f81278b.setViewPager(c36861w1M35148k3.f81279c);
    }

    /* JADX INFO: renamed from: l3 */
    public final int m35149l3() {
        Integer numValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56226Q(arguments, "type", 0));
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        if (iM66650j != 0) {
            if (iM66650j != 1) {
                if (iM66650j != 2) {
                    return m35147m3(R$string.pnl_history);
                }
                return m35147m3(R$string.deal_detail);
            }
            return m35147m3(R$string.history_delegation);
        }
        return m35147m3(R$string.pnl_history);
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
            return false;
        }
        return false;
    }
}
