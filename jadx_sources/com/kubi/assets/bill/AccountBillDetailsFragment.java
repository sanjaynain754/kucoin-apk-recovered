package com.kubi.assets.bill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.C9459a;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.data.coin.AccountType;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44752e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AccountBillDetailsFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R7\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillDetailsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetAccountBillFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetAccountBillFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tabItems", "Ljava/util/LinkedHashMap;", "", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/LinkedHashMap;", "getTabItems", "()Ljava/util/LinkedHashMap;", "tabItems$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillDetailsFragment.kt\ncom/kubi/assets/bill/AccountBillDetailsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n147#2,16:121\n1563#3:137\n1634#3,3:138\n*S KotlinDebug\n*F\n+ 1 AccountBillDetailsFragment.kt\ncom/kubi/assets/bill/AccountBillDetailsFragment\n*L\n34#1:121,16\n111#1:137\n111#1:138,3\n*E\n"})
public final class AccountBillDetailsFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f16639W = {Reflection.property1(new PropertyReference1Impl(AccountBillDetailsFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetAccountBillFragmentBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f16640U = C45681e.m100799e(this, new Function1<AccountBillDetailsFragment, C44752e>() { // from class: com.kubi.assets.bill.AccountBillDetailsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44752e invoke(@NotNull AccountBillDetailsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44752e.m99018a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44752e, Unit>() { // from class: com.kubi.assets.bill.AccountBillDetailsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44752e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44752e c44752e) {
            invoke(c44752e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f16641V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountBillDetailsFragment.m15560n3(this.f16827b);
        }
    });

    /* JADX INFO: renamed from: n3 */
    public static final LinkedHashMap m15560n3(AccountBillDetailsFragment accountBillDetailsFragment) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AssetExKt.m15129q()) {
            linkedHashMap.put(accountBillDetailsFragment.getString(R$string.save_account), AccountBillCommonFragment.f16624a0.create("MAIN", "MAIN"));
            return linkedHashMap;
        }
        String string = accountBillDetailsFragment.getString(R$string.save_account);
        AccountBillCommonFragment.Companion companion = AccountBillCommonFragment.f16624a0;
        linkedHashMap.put(string, companion.create("MAIN", "MAIN"));
        linkedHashMap.put(accountBillDetailsFragment.getString(R$string.trade_account), companion.create("TRADE", "TRADE"));
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            linkedHashMap.put(accountBillDetailsFragment.getString(R$string.margin_whole_account), companion.create("MARGIN", "MARGIN"));
            linkedHashMap.put(accountBillDetailsFragment.getString(R$string.margin_single_account), companion.create(SharedPositionInfo.MARGIN_MODE_ISOLATED, SharedPositionInfo.MARGIN_MODE_ISOLATED));
        }
        if (C9459a.m15238a()) {
            linkedHashMap.put(accountBillDetailsFragment.getString(R$string.contract_account), AccountBillFutureFragment.Companion.create$default(AccountBillFutureFragment.f16648a0, "CONTRACT", null, null, 4, null));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Option)) {
            linkedHashMap.put(accountBillDetailsFragment.getString(R$string.kc_options_account), companion.create("OPTION", "OPTION"));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
            linkedHashMap.put(accountBillDetailsFragment.getString(AccountType.FINANCE.getStrRes()), AccountBillFinanceFragment.f16642a0.create("FINANCE", null));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.CLOUD_MINING)) {
            linkedHashMap.put(accountBillDetailsFragment.getString(R$string.kc_account_name_mining), companion.create("MINING", "MINING"));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k3 */
    public final C44752e m15561k3() {
        return (C44752e) this.f16640U.getValue(this, f16639W[0]);
    }

    /* JADX INFO: renamed from: l3 */
    public final LinkedHashMap<String, Fragment> m15562l3() {
        return (LinkedHashMap) this.f16641V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_account_bill_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: m3 */
    private final void m15559m3() {
        C44752e c44752eM15561k3 = m15561k3();
        if (c44752eM15561k3 != null) {
            if (m15562l3().size() <= 1) {
                c44752eM15561k3.f99789c.setVisibility(8);
            } else {
                c44752eM15561k3.f99789c.setVisibility(0);
            }
            Set<String> setKeySet = m15562l3().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            List mutableList = CollectionsKt.toMutableList((Collection) setKeySet);
            Collection<Fragment> collectionValues = m15562l3().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add((Fragment) it.next());
            }
            ArrayList arrayList2 = (ArrayList) CollectionsKt.toCollection(arrayList, new ArrayList());
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            c44752eM15561k3.f99788b.setAdapter(new C27103z(childFragmentManager, arrayList2, mutableList));
            c44752eM15561k3.f99788b.setOffscreenPageLimit(m15562l3().size());
            c44752eM15561k3.f99789c.setNeedBold(true);
            c44752eM15561k3.f99789c.setViewPager(c44752eM15561k3.f99788b);
            c44752eM15561k3.f99789c.m55291w();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TitleBar titleBar = getTitleBar();
        String string = getString(R$string.kc_asset_acount_detail);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        titleBar.setTitleIfEmpty(string);
        m15559m3();
    }
}
