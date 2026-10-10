package com.kubi.futures.trade.welfare;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.C4609a;
import bi.C4615g;
import bm.FuturesWelfareAsset;
import bm.InterfaceC4633f;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.dialog.FutureBonusGetDialog;
import com.kubi.futures.trade.welfare.vm.C14428d;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesSectionEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.market.tradingArea.ChildSection;
import com.kubi.kumex.service.KuMexDepend;
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
import dm.C36827q3;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p729wl.C45875l0;
import p801yl.C46527h0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: WelfareTrialListFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u001e\u0010%\u001a\u00020\u001f2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00130'H\u0002J\u001e\u0010(\u001a\u00020\u001f2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010)0'H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0013H\u0002J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0015H\u0002J\b\u00102\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\u0018\u00104\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u00105\u001a\u000206H\u0002J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u0015H\u0002J\u001a\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020)2\b\b\u0002\u00101\u001a\u00020\u0015H\u0002J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u0002060=2\u0006\u0010;\u001a\u00020)2\u0006\u00101\u001a\u00020\u0015H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/WelfareTrialListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentWelfareListBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentWelfareListBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "childSection", "Lcom/kubi/kumex/market/tradingArea/ChildSection;", "activateTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "sectionId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "handleReplaceTrial", "isReplace", "", "handleActivateTrial", "pair", "Lkotlin/Pair;", "handleFetchAllTrialCallback", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "showReplaceTrialDialog", "trial", "setSection", "activateNum", "", "availableNum", "handleSectionItemClick", "id", "showEmpty", "showContent", "handleItemClick", "futuresWelfareType", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "handleWithdrawClick", "showConfirmWithdrawDialog", "code", "bindData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "filterById", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareTrialListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareTrialListFragment.kt\ncom/kubi/futures/trade/welfare/WelfareTrialListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n147#2,16:354\n76#3,7:370\n295#4,2:377\n1869#4,2:379\n*S KotlinDebug\n*F\n+ 1 WelfareTrialListFragment.kt\ncom/kubi/futures/trade/welfare/WelfareTrialListFragment\n*L\n50#1:354,16\n95#1:370,7\n328#1:377,2\n334#1:379,2\n*E\n"})
public final class WelfareTrialListFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f24528Z = {Reflection.property1(new PropertyReference1Impl(WelfareTrialListFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentWelfareListBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @Nullable
    public ChildSection f24531W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public FuturesWelfareTrialItemEntity f24532X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f24529U = C45681e.m100799e(this, new Function1<WelfareTrialListFragment, C36827q3>() { // from class: com.kubi.futures.trade.welfare.WelfareTrialListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36827q3 invoke(@NotNull WelfareTrialListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36827q3.m82516a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36827q3, Unit>() { // from class: com.kubi.futures.trade.welfare.WelfareTrialListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36827q3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36827q3 c36827q3) {
            invoke(c36827q3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f24530V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.a2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareTrialListFragment.m28268W3(this.f24539b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f24533Y = "0";

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.WelfareTrialListFragment$a */
    /* JADX INFO: compiled from: WelfareTrialListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14189a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24534b;

        public C14189a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24534b = function;
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
            return this.f24534b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24534b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public final FuturesTrialViewModel m28249A3() {
        return (FuturesTrialViewModel) this.f24530V.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m28258M3(WelfareTrialListFragment welfareTrialListFragment, View itemView, int i11, InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        welfareTrialListFragment.m28251E3(itemView, futuresWelfareType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m28259N3(WelfareTrialListFragment welfareTrialListFragment, View itemView, int i11, InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        welfareTrialListFragment.m28253H3(itemView, futuresWelfareType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m28262Q3(WelfareTrialListFragment welfareTrialListFragment, String s11, int i11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        welfareTrialListFragment.m28252G3(s11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    private final void m28263R3(final String str) {
        C43852m.m96591c("B11FuturesBonus", "withdrawButton", null, null, 12, null);
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.kumex_welfare_trial_withdraw_desc).m54167X4(R$string.kumex_welfare_trial_withdraw_dialog_title).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.g2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                WelfareTrialListFragment.m28264S3(dialogInterface, i11);
            }
        }).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.h2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                WelfareTrialListFragment.m28265T3(this.f24829b, str, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "showConfirmWithdrawDialog");
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m28266U3() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101358z0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m28283x3(WelfareTrialListFragment welfareTrialListFragment, FuturesWelfareTrialEntity futuresWelfareTrialEntity, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "0";
        }
        welfareTrialListFragment.m28282w3(futuresWelfareTrialEntity, str);
    }

    /* JADX INFO: renamed from: y3 */
    private final List<InterfaceC4633f> m28284y3(FuturesWelfareTrialEntity futuresWelfareTrialEntity, String str) {
        ArrayList arrayList = new ArrayList();
        List<FuturesWelfareTrialItemEntity> items = futuresWelfareTrialEntity.getItems();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = null;
        Object obj = null;
        if (items != null) {
            for (Object obj2 : items) {
                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2 = (FuturesWelfareTrialItemEntity) obj2;
                if (Intrinsics.areEqual(futuresWelfareTrialItemEntity2.getStatus(), "ACTIVATE_FINISHED") && !C27092t0.m66897b(futuresWelfareTrialItemEntity2.getPrizeType())) {
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

    /* JADX INFO: renamed from: F3 */
    public final void m28287F3(boolean z11) {
        if (!KuMexDepend.f30378a.m35906h()) {
            InterfaceC37752d.a.m85123b(C37304a.f82764a, "B11FuturesBonus", Boolean.TRUE, null, null, null, null, 60, null);
            return;
        }
        if (!z11 || this.f24532X == null) {
            this.f24532X = null;
            return;
        }
        FuturesTrialViewModel futuresTrialViewModelM28249A3 = m28249A3();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = this.f24532X;
        String code = futuresWelfareTrialItemEntity != null ? futuresWelfareTrialItemEntity.getCode() : null;
        if (code == null) {
            code = "";
        }
        futuresTrialViewModelM28249A3.m28759f(code, true);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_welfare_list, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36827q3 c36827q3M28288z3 = m28288z3();
        if (c36827q3M28288z3 == null) {
            return;
        }
        c36827q3M28288z3.f80905b.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerView recyclerView = c36827q3M28288z3.f80905b;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recyclerView.setAdapter(new FuturesWelfareAdapter(childFragmentManager, false, new Function3() { // from class: com.kubi.futures.trade.welfare.d2
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return WelfareTrialListFragment.m28258M3(this.f24671b, (View) obj, ((Integer) obj2).intValue(), (InterfaceC4633f) obj3);
            }
        }, new Function3() { // from class: com.kubi.futures.trade.welfare.e2
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return WelfareTrialListFragment.m28259N3(this.f24786b, (View) obj, ((Integer) obj2).intValue(), (InterfaceC4633f) obj3);
            }
        }, 2, null));
        m28254I3();
        m28249A3().m28763o();
        m28249A3().m28768u().observe(getViewLifecycleOwner(), new C14189a(new Function1() { // from class: com.kubi.futures.trade.welfare.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareTrialListFragment.m28260O3(this.f24823b, (Pair) obj);
            }
        }));
        String name = C4609a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C12573b.f21598a.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, false, new C14190x921c7a88(name, null, this));
    }

    /* JADX INFO: renamed from: z3 */
    public final C36827q3 m28288z3() {
        return (C36827q3) this.f24529U.getValue(this, f24528Z[0]);
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m28250D3(WelfareTrialListFragment welfareTrialListFragment, View view) {
        welfareTrialListFragment.m28249A3().m28763o();
    }

    /* JADX INFO: renamed from: E3 */
    private final void m28251E3(View view, InterfaceC4633f interfaceC4633f) {
        if (view.getId() == R$id.action && (interfaceC4633f instanceof FuturesWelfareTrialItemEntity)) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) interfaceC4633f;
            if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "SEND_FINISHED")) {
                C43852m.m96591c("B11FuturesBonus", "bonusCardActivate", null, null, 12, null);
                this.f24532X = futuresWelfareTrialItemEntity;
                FuturesTrialViewModel futuresTrialViewModelM28249A3 = m28249A3();
                String code = futuresWelfareTrialItemEntity.getCode();
                if (code == null) {
                    code = "";
                }
                FuturesTrialViewModel.m28751g(futuresTrialViewModelM28249A3, code, false, 2, null);
                return;
            }
            if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "ACTIVATE_FINISHED")) {
                m28249A3().m28757C(futuresWelfareTrialItemEntity.getContractList());
            }
        }
    }

    /* JADX INFO: renamed from: G3 */
    private final void m28252G3(String str) {
        FuturesWelfareTrialEntity second;
        Pair<Boolean, FuturesWelfareTrialEntity> value = m28249A3().m28768u().getValue();
        if (value != null && (second = value.getSecond()) != null && !Intrinsics.areEqual(str, this.f24533Y)) {
            this.f24533Y = str;
            m28282w3(second, str);
        }
    }

    /* JADX INFO: renamed from: H3 */
    private final void m28253H3(View view, InterfaceC4633f interfaceC4633f) {
        if (view.getId() == R$id.withdraw && (interfaceC4633f instanceof FuturesWelfareAsset)) {
            m28263R3(C27041f.m66668h(((FuturesWelfareAsset) interfaceC4633f).getEntity().getCode()));
        }
    }

    /* JADX INFO: renamed from: I3 */
    private final void m28254I3() {
        m28249A3().m28766s().observe(getViewLifecycleOwner(), new C14189a(new Function1() { // from class: com.kubi.futures.trade.welfare.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareTrialListFragment.m28255J3(this.f24866b, (Pair) obj);
            }
        }));
        m28249A3().m28772y().observe(getViewLifecycleOwner(), new C14189a(new Function1() { // from class: com.kubi.futures.trade.welfare.j2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareTrialListFragment.m28256K3(this.f24870b, (Boolean) obj);
            }
        }));
        m28249A3().m28756B().observe(getViewLifecycleOwner(), new C14189a(new Function1() { // from class: com.kubi.futures.trade.welfare.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareTrialListFragment.m28257L3(this.f24874b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m28255J3(WelfareTrialListFragment welfareTrialListFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        welfareTrialListFragment.m28285B3(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m28256K3(WelfareTrialListFragment welfareTrialListFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        welfareTrialListFragment.m28287F3(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m28257L3(WelfareTrialListFragment welfareTrialListFragment, Boolean bool) {
        welfareTrialListFragment.m28249A3().m28763o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m28260O3(WelfareTrialListFragment welfareTrialListFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        welfareTrialListFragment.m28286C3(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    private final void m28261P3(int i11, int i12) {
        C36827q3 c36827q3M28288z3 = m28288z3();
        if (c36827q3M28288z3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new QuotesSectionEntity(true, getStringRes(R$string.all_stub, Integer.valueOf(i11 + i12)), "0"));
        arrayList.add(new QuotesSectionEntity(false, getStringRes(R$string.kumex_welfare_bonus_active, Integer.valueOf(i11)), "1"));
        arrayList.add(new QuotesSectionEntity(false, getStringRes(R$string.kumex_welfare_bonus_available, Integer.valueOf(i12)), "2"));
        ChildSection childSection = new ChildSection();
        RecyclerView section = c36827q3M28288z3.f80906c;
        Intrinsics.checkNotNullExpressionValue(section, "section");
        this.f24531W = childSection.m34621f(section).m34619d(new Function2() { // from class: com.kubi.futures.trade.welfare.b2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WelfareTrialListFragment.m28262Q3(this.f24662b, (String) obj, ((Integer) obj2).intValue());
            }
        }).m34620e(C27029c.m66603f(this, 10), C27029c.m66603f(this, 10)).m34616a(arrayList);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m28264S3(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m28265T3(WelfareTrialListFragment welfareTrialListFragment, String str, DialogInterface dialogInterface, int i11) {
        welfareTrialListFragment.m28249A3().m28758D(str);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: V3 */
    private final void m28267V3(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
            FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog = new FuturesTradeProUnavailableDialog();
            futuresTradeProUnavailableDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity)));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            futuresTradeProUnavailableDialog.show(childFragmentManager, "FuturesTradeProUnavailableDialog");
            return;
        }
        FuturesReplaceTrialDialog futuresReplaceTrialDialog = new FuturesReplaceTrialDialog();
        futuresReplaceTrialDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity)));
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        futuresReplaceTrialDialog.show(childFragmentManager2, "FuturesReplaceTrialDialog");
    }

    /* JADX INFO: renamed from: W3 */
    public static final FuturesTrialViewModel m28268W3(WelfareTrialListFragment welfareTrialListFragment) {
        return C14428d.m28809a(welfareTrialListFragment);
    }

    private final void showContent() {
        C36827q3 c36827q3M28288z3 = m28288z3();
        if (c36827q3M28288z3 == null) {
            return;
        }
        LinearLayoutCompat root = c36827q3M28288z3.f80907d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.m66577h(root);
        RecyclerView recyclerView = c36827q3M28288z3.f80905b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66685H(recyclerView);
    }

    private final void showEmpty() {
        C36827q3 c36827q3M28288z3 = m28288z3();
        if (c36827q3M28288z3 == null) {
            return;
        }
        LinearLayoutCompat root = c36827q3M28288z3.f80907d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C27046k.m66685H(root);
        RecyclerView recyclerView = c36827q3M28288z3.f80905b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66703r(recyclerView);
        KcPrimaryButton tvConfirm = c36827q3M28288z3.f80907d.f81341b;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareTrialListFragment.m28266U3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w3 */
    private final void m28282w3(FuturesWelfareTrialEntity futuresWelfareTrialEntity, String str) {
        C36827q3 c36827q3M28288z3 = m28288z3();
        if (c36827q3M28288z3 == null) {
            return;
        }
        List<InterfaceC4633f> listM28284y3 = m28284y3(futuresWelfareTrialEntity, str);
        if (listM28284y3.isEmpty()) {
            showEmpty();
            return;
        }
        showContent();
        RecyclerView.Adapter adapter = c36827q3M28288z3.f80905b.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareAdapter");
        ((FuturesWelfareAdapter) adapter).m28634J(listM28284y3);
    }

    /* JADX INFO: renamed from: B3 */
    public final void m28285B3(Pair<Boolean, FuturesWelfareTrialItemEntity> pair) {
        if (pair.getSecond() != null) {
            FuturesWelfareTrialItemEntity second = pair.getSecond();
            Intrinsics.checkNotNull(second);
            m28267V3(second);
        }
        if (pair.getFirst().booleanValue()) {
            FuturesTrialViewModel.m28754q(m28249A3(), 0, 0, 3, null);
            m28249A3().m28763o();
            String name = C4615g.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            C12572a.m23695d(name, new C4615g(C46527h0.f104291a.m102677L(), false), 0L, 4, null);
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = this.f24532X;
            if (futuresWelfareTrialItemEntity != null) {
                FutureBonusGetDialog.Companion companion = FutureBonusGetDialog.f22772j;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                companion.show(fragmentActivityRequireActivity, futuresWelfareTrialItemEntity);
            }
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final void m28286C3(Pair<Boolean, FuturesWelfareTrialEntity> pair) {
        if (pair.getFirst().booleanValue()) {
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
            return;
        }
        if (pair.getSecond() != null) {
            showContentView();
            FuturesWelfareTrialEntity second = pair.getSecond();
            if (second != null) {
                m28261P3(second.getActivateNum(), second.getAvailableNum());
                m28283x3(this, second, null, 2, null);
                return;
            }
            return;
        }
        BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WelfareTrialListFragment.m28250D3(this.f24877b, view);
            }
        }, 3, (Object) null);
    }
}
