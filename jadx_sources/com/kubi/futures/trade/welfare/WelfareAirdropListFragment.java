package com.kubi.futures.trade.welfare;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.C4609a;
import bm.FuturesWelfareAsset;
import bm.InterfaceC4633f;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog;
import com.kubi.futures.trade.welfare.airdrop.AirdropReplaceDialog;
import com.kubi.futures.trade.welfare.vm.C14428d;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesSectionEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.market.tradingArea.ChildSection;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36843t1;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p729wl.C45875l0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: WelfareAirdropListFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\u001e\u0010\"\u001a\u00020\u001f2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&0$H\u0002J\u001a\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u0015H\u0002J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0015H\u0002J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0015H\u0002J\u0018\u00102\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u00103\u001a\u00020,H\u0002J\u0018\u00104\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u00103\u001a\u00020,H\u0002J\u001c\u00105\u001a\u00020\u001f2\b\u00106\u001a\u0004\u0018\u00010\u00132\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0010\u00109\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0013H\u0002J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020%H\u0002J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u0015H\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020\u001fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/WelfareAirdropListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentAirdropListBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentAirdropListBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "childSection", "Lcom/kubi/kumex/market/tradingArea/ChildSection;", "activateAirdropEntity", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "sectionId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "handleFetchAllAirdropCallback", "pair", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "bindData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "id", "filterById", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "setSection", "activateNum", "", "availableNum", "handleSectionItemClick", "handleItemClick", "futuresWelfareType", "handleWithdrawClick", "handleAirdropActive", "trial", "airdropBonus", "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "showReplaceTrialDialog", "handleReplaceAirdrop", "isReplace", "showConfirmWithdrawDialog", "code", "showEmpty", "showContent", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareAirdropListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareAirdropListFragment.kt\ncom/kubi/futures/trade/welfare/WelfareAirdropListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,361:1\n147#2,16:362\n76#3,7:378\n295#4,2:385\n1869#4,2:387\n*S KotlinDebug\n*F\n+ 1 WelfareAirdropListFragment.kt\ncom/kubi/futures/trade/welfare/WelfareAirdropListFragment\n*L\n51#1:362,16\n114#1:378,7\n164#1:385,2\n170#1:387,2\n*E\n"})
public final class WelfareAirdropListFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f24517Z = {Reflection.property1(new PropertyReference1Impl(WelfareAirdropListFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentAirdropListBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @Nullable
    public ChildSection f24520W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public FuturesWelfareTrialItemEntity f24521X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f24518U = C45681e.m100799e(this, new Function1<WelfareAirdropListFragment, C36843t1>() { // from class: com.kubi.futures.trade.welfare.WelfareAirdropListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36843t1 invoke(@NotNull WelfareAirdropListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36843t1.m82551a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36843t1, Unit>() { // from class: com.kubi.futures.trade.welfare.WelfareAirdropListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36843t1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36843t1 c36843t1) {
            invoke(c36843t1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f24519V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.o1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareAirdropListFragment.m28209Y3(this.f24885b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f24522Y = "0";

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.WelfareAirdropListFragment$a */
    /* JADX INFO: compiled from: WelfareAirdropListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14184a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24523b;

        public C14184a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24523b = function;
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
            return this.f24523b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24523b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m28229G3(boolean z11) {
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity;
        if (z11 && (futuresWelfareTrialItemEntity = this.f24521X) != null) {
            if (C27092t0.m66897b(futuresWelfareTrialItemEntity != null ? futuresWelfareTrialItemEntity.getPrizeType() : null)) {
                FuturesTrialViewModel futuresTrialViewModelM28195B3 = m28195B3();
                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2 = this.f24521X;
                String code = futuresWelfareTrialItemEntity2 != null ? futuresWelfareTrialItemEntity2.getCode() : null;
                if (code == null) {
                    code = "";
                }
                futuresTrialViewModelM28195B3.m28760h(code, true);
                return;
            }
        }
        this.f24521X = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public final FuturesTrialViewModel m28195B3() {
        return (FuturesTrialViewModel) this.f24519V.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m28203P3(WelfareAirdropListFragment welfareAirdropListFragment, View itemView, int i11, InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        welfareAirdropListFragment.m28228F3(itemView, futuresWelfareType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m28204Q3(WelfareAirdropListFragment welfareAirdropListFragment, View itemView, int i11, InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        welfareAirdropListFragment.m28231I3(itemView, futuresWelfareType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m28205S3(WelfareAirdropListFragment welfareAirdropListFragment, String s11, int i11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        welfareAirdropListFragment.m28230H3(s11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m28208W3() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101358z0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ void m28224y3(WelfareAirdropListFragment welfareAirdropListFragment, FuturesWelfareTrialEntity futuresWelfareTrialEntity, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "0";
        }
        welfareAirdropListFragment.m28235x3(futuresWelfareTrialEntity, str);
    }

    /* JADX INFO: renamed from: A3 */
    public final C36843t1 m28225A3() {
        return (C36843t1) this.f24518U.getValue(this, f24517Z[0]);
    }

    /* JADX INFO: renamed from: C3 */
    public final void m28226C3(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, AirdropBonusEntity airdropBonusEntity) {
        if (futuresWelfareTrialItemEntity != null) {
            m28234X3(futuresWelfareTrialItemEntity);
            return;
        }
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2 = this.f24521X;
        AirDropBonusDialog.Companion companion = AirDropBonusDialog.f24540w0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, airdropBonusEntity, futuresWelfareTrialItemEntity2 != null ? futuresWelfareTrialItemEntity2.getCode() : null);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m28228F3(View view, InterfaceC4633f interfaceC4633f) {
        String str;
        String str2;
        if (view.getId() == R$id.action && (interfaceC4633f instanceof FuturesWelfareTrialItemEntity)) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) interfaceC4633f;
            if (C27092t0.m66897b(futuresWelfareTrialItemEntity.getPrizeType())) {
                String status = futuresWelfareTrialItemEntity.getStatus();
                if (Intrinsics.areEqual(status, "SEND_FINISHED")) {
                    this.f24521X = futuresWelfareTrialItemEntity;
                    FuturesTrialViewModel futuresTrialViewModelM28195B3 = m28195B3();
                    String code = futuresWelfareTrialItemEntity.getCode();
                    if (code == null) {
                        code = "";
                    }
                    FuturesTrialViewModel.m28752i(futuresTrialViewModelM28195B3, code, false, 2, null);
                    return;
                }
                if (Intrinsics.areEqual(status, "ACTIVATE_FINISHED")) {
                    List<String> contractList = futuresWelfareTrialItemEntity.getContractList();
                    if (contractList == null || (str2 = (String) CollectionsKt.firstOrNull((List) contractList)) == null) {
                        List<String> supportedContracts = futuresWelfareTrialItemEntity.getSupportedContracts();
                        str = supportedContracts != null ? (String) CollectionsKt.firstOrNull((List) supportedContracts) : null;
                    } else {
                        str = str2;
                    }
                    if (str == null || str.length() == 0) {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, str, null, null, null, null, null, null, null, null, 510, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m28233T3(final String str) {
        C43852m.m96591c("B11FuturesBonus", "withdrawButton", null, null, 12, null);
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.kumex_welfare_trial_withdraw_desc).m54167X4(R$string.kumex_welfare_trial_withdraw_dialog_title).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.p1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                WelfareAirdropListFragment.m28206U3(dialogInterface, i11);
            }
        }).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.q1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                WelfareAirdropListFragment.m28207V3(this.f24891b, str, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "showConfirmWithdrawDialog");
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_airdrop_list, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36843t1 c36843t1M28225A3 = m28225A3();
        if (c36843t1M28225A3 == null) {
            return;
        }
        c36843t1M28225A3.f81066c.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerView recyclerView = c36843t1M28225A3.f81066c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recyclerView.setAdapter(new FuturesWelfareAdapter(childFragmentManager, false, new Function3() { // from class: com.kubi.futures.trade.welfare.j1
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return WelfareAirdropListFragment.m28203P3(this.f24869b, (View) obj, ((Integer) obj2).intValue(), (InterfaceC4633f) obj3);
            }
        }, new Function3() { // from class: com.kubi.futures.trade.welfare.n1
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return WelfareAirdropListFragment.m28204Q3(this.f24881b, (View) obj, ((Integer) obj2).intValue(), (InterfaceC4633f) obj3);
            }
        }, 2, null));
        m28197J3();
        m28195B3().m28762n();
    }

    /* JADX INFO: renamed from: z3 */
    public final List<InterfaceC4633f> m28236z3(FuturesWelfareTrialEntity futuresWelfareTrialEntity, String str) {
        ArrayList arrayList = new ArrayList();
        List<FuturesWelfareTrialItemEntity> items = futuresWelfareTrialEntity.getItems();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = null;
        Object obj = null;
        if (items != null) {
            for (Object obj2 : items) {
                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2 = (FuturesWelfareTrialItemEntity) obj2;
                if (Intrinsics.areEqual(futuresWelfareTrialItemEntity2.getStatus(), "ACTIVATE_FINISHED") && C27092t0.m66897b(futuresWelfareTrialItemEntity2.getPrizeType())) {
                    obj = obj2;
                    break;
                }
            }
            futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) obj;
        }
        if (futuresWelfareTrialItemEntity != null) {
            arrayList.add(new FuturesWelfareAsset(futuresWelfareTrialItemEntity));
        }
        List<FuturesWelfareTrialItemEntity> items2 = futuresWelfareTrialEntity.getItems();
        if (items2 != null) {
            for (FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity3 : items2) {
                if (Intrinsics.areEqual(str, "0")) {
                    arrayList.add(futuresWelfareTrialItemEntity3);
                } else if (Intrinsics.areEqual(str, "1")) {
                    if (Intrinsics.areEqual(futuresWelfareTrialItemEntity3.getStatus(), "SEND_FINISHED")) {
                        arrayList.add(futuresWelfareTrialItemEntity3);
                    }
                } else if (Intrinsics.areEqual(futuresWelfareTrialItemEntity3.getStatus(), "ACTIVATE_FINISHED")) {
                    arrayList.add(futuresWelfareTrialItemEntity3);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m28196E3(WelfareAirdropListFragment welfareAirdropListFragment, View view) {
        welfareAirdropListFragment.m28195B3().m28762n();
    }

    /* JADX INFO: renamed from: J3 */
    private final void m28197J3() {
        m28195B3().m28767t().observe(getViewLifecycleOwner(), new C14184a(new Function1() { // from class: com.kubi.futures.trade.welfare.r1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareAirdropListFragment.m28198K3(this.f24895b, (Pair) obj);
            }
        }));
        m28195B3().m28765r().observe(getViewLifecycleOwner(), new C14184a(new Function1() { // from class: com.kubi.futures.trade.welfare.s1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareAirdropListFragment.m28199L3(this.f24898b, (Pair) obj);
            }
        }));
        m28195B3().m28771x().observe(getViewLifecycleOwner(), new C14184a(new Function1() { // from class: com.kubi.futures.trade.welfare.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareAirdropListFragment.m28200M3(this.f24901b, (Boolean) obj);
            }
        }));
        m28195B3().m28756B().observe(getViewLifecycleOwner(), new C14184a(new Function1() { // from class: com.kubi.futures.trade.welfare.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareAirdropListFragment.m28201N3(this.f24906b, (Boolean) obj);
            }
        }));
        m28195B3().m28766s().observe(getViewLifecycleOwner(), new C14184a(new Function1() { // from class: com.kubi.futures.trade.welfare.v1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareAirdropListFragment.m28202O3(this.f24909b, (Pair) obj);
            }
        }));
        String name = C4609a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C12573b.f21598a.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, false, new C14185x13907ff1(name, null, this));
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m28198K3(WelfareAirdropListFragment welfareAirdropListFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        welfareAirdropListFragment.m28227D3(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m28199L3(WelfareAirdropListFragment welfareAirdropListFragment, Pair pair) {
        welfareAirdropListFragment.m28226C3((FuturesWelfareTrialItemEntity) pair.getFirst(), (AirdropBonusEntity) pair.getSecond());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m28200M3(WelfareAirdropListFragment welfareAirdropListFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        welfareAirdropListFragment.m28229G3(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m28201N3(WelfareAirdropListFragment welfareAirdropListFragment, Boolean bool) {
        welfareAirdropListFragment.m28195B3().m28762n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m28202O3(WelfareAirdropListFragment welfareAirdropListFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            welfareAirdropListFragment.m28195B3().m28762n();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m28206U3(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m28207V3(WelfareAirdropListFragment welfareAirdropListFragment, String str, DialogInterface dialogInterface, int i11) {
        welfareAirdropListFragment.m28195B3().m28758D(str);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: Y3 */
    public static final FuturesTrialViewModel m28209Y3(WelfareAirdropListFragment welfareAirdropListFragment) {
        return C14428d.m28809a(welfareAirdropListFragment);
    }

    private final void showContent() {
        C36843t1 c36843t1M28225A3 = m28225A3();
        if (c36843t1M28225A3 == null) {
            return;
        }
        LinearLayoutCompat root = c36843t1M28225A3.f81065b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.m66577h(root);
        RecyclerView airdropRecyclerView = c36843t1M28225A3.f81066c;
        Intrinsics.checkNotNullExpressionValue(airdropRecyclerView, "airdropRecyclerView");
        C27046k.m66685H(airdropRecyclerView);
    }

    private final void showEmpty() {
        C36843t1 c36843t1M28225A3 = m28225A3();
        if (c36843t1M28225A3 == null) {
            return;
        }
        LinearLayoutCompat root = c36843t1M28225A3.f81065b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C27046k.m66685H(root);
        RecyclerView airdropRecyclerView = c36843t1M28225A3.f81066c;
        Intrinsics.checkNotNullExpressionValue(airdropRecyclerView, "airdropRecyclerView");
        C27046k.m66703r(airdropRecyclerView);
        KcPrimaryButton tvConfirm = c36843t1M28225A3.f81065b.f81341b;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.l1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareAirdropListFragment.m28208W3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: D3 */
    public final void m28227D3(Pair<Boolean, FuturesWelfareTrialEntity> pair) {
        if (pair.getFirst().booleanValue()) {
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
            return;
        }
        if (pair.getSecond() != null) {
            showContentView();
            FuturesWelfareTrialEntity second = pair.getSecond();
            if (second != null) {
                m28232R3(second.getActivateNum(), second.getAvailableNum());
                m28224y3(this, second, null, 2, null);
                return;
            }
            return;
        }
        BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WelfareAirdropListFragment.m28196E3(this.f24873b, view);
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m28230H3(String str) {
        FuturesWelfareTrialEntity second;
        Pair<Boolean, FuturesWelfareTrialEntity> value = m28195B3().m28767t().getValue();
        if (value != null && (second = value.getSecond()) != null && !Intrinsics.areEqual(str, this.f24522Y)) {
            this.f24522Y = str;
            m28235x3(second, str);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m28231I3(View view, InterfaceC4633f interfaceC4633f) {
        if (view.getId() == R$id.withdraw && (interfaceC4633f instanceof FuturesWelfareAsset)) {
            C43852m.m96591c("B6futures", "AirDropPositionWithdrawButton", null, null, 12, null);
            m28233T3(C27041f.m66668h(((FuturesWelfareAsset) interfaceC4633f).getEntity().getCode()));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m28232R3(int i11, int i12) {
        C36843t1 c36843t1M28225A3 = m28225A3();
        if (c36843t1M28225A3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new QuotesSectionEntity(true, getStringRes(R$string.all_stub, Integer.valueOf(i11 + i12)), "0"));
        arrayList.add(new QuotesSectionEntity(false, getStringRes(R$string.kumex_welfare_bonus_active, Integer.valueOf(i11)), "1"));
        arrayList.add(new QuotesSectionEntity(false, getStringRes(R$string.kumex_welfare_bonus_available, Integer.valueOf(i12)), "2"));
        ChildSection childSection = new ChildSection();
        RecyclerView airdropSection = c36843t1M28225A3.f81067d;
        Intrinsics.checkNotNullExpressionValue(airdropSection, "airdropSection");
        this.f24520W = childSection.m34621f(airdropSection).m34619d(new Function2() { // from class: com.kubi.futures.trade.welfare.m1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WelfareAirdropListFragment.m28205S3(this.f24880b, (String) obj, ((Integer) obj2).intValue());
            }
        }).m34620e(C27029c.m66603f(this, 10), C27029c.m66603f(this, 10)).m34616a(arrayList);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m28234X3(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
            FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog = new FuturesTradeProUnavailableDialog();
            futuresTradeProUnavailableDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity)));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            futuresTradeProUnavailableDialog.show(childFragmentManager, "FuturesTradeProUnavailableDialog");
            return;
        }
        AirdropReplaceDialog airdropReplaceDialog = new AirdropReplaceDialog();
        airdropReplaceDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity)));
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        airdropReplaceDialog.show(childFragmentManager2, "FuturesReplaceTrialDialog");
    }

    /* JADX INFO: renamed from: x3 */
    public final void m28235x3(FuturesWelfareTrialEntity futuresWelfareTrialEntity, String str) {
        C36843t1 c36843t1M28225A3 = m28225A3();
        if (c36843t1M28225A3 == null) {
            return;
        }
        List<InterfaceC4633f> listM28236z3 = m28236z3(futuresWelfareTrialEntity, str);
        if (listM28236z3.isEmpty()) {
            showEmpty();
            return;
        }
        showContent();
        RecyclerView.Adapter adapter = c36843t1M28225A3.f81066c.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareAdapter");
        ((FuturesWelfareAdapter) adapter).m28634J(listM28236z3);
    }
}
