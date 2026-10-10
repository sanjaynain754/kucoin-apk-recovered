package com.kubi.assets.bill;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AccountBillBaseFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH&J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 J\u001c\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 J\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 J\u0006\u0010(\u001a\u00020\u001bJ\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020\u001bJ\u0006\u0010+\u001a\u00020\u001bJ\u0006\u0010,\u001a\u00020\u001bJ\u0012\u0010-\u001a\u00020\u001b*\u00020.2\u0006\u0010/\u001a\u000200R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\r¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillBaseFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/assets/bill/AccountBillCommonViewModel;", "getViewModel", "()Lcom/kubi/assets/bill/AccountBillCommonViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "accountType", "", "getAccountType", "()Ljava/lang/String;", "accountType$delegate", "requestBizType", "getRequestBizType", "requestBizType$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "resetFilterIcon", "", "jumpToItemDetailFragment", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Landroid/os/Parcelable;", "convertToAccountDetailState", "Lcom/kubi/assets/bill/AccountBillListState;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "state", "", "convertToFundsRecordEntityState", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "convertToFinanceListState", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "showSearchCoinDialog", "showFilterTimeDialog", "showBizTypeDialog", "showFutureBizTypeDialog", "showSelectSideDialog", "rotateIcon", "Landroid/widget/TextView;", "isUp", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillBaseFragment.kt\ncom/kubi/assets/bill/AccountBillBaseFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n106#2,15:307\n1740#3,3:322\n1563#3:325\n1634#3,3:326\n1740#3,3:329\n1563#3:332\n1634#3,3:333\n1740#3,3:336\n1563#3:339\n1634#3,3:340\n*S KotlinDebug\n*F\n+ 1 AccountBillBaseFragment.kt\ncom/kubi/assets/bill/AccountBillBaseFragment\n*L\n38#1:307,15\n95#1:322,3\n97#1:325\n97#1:326,3\n111#1:329,3\n113#1:332\n113#1:333,3\n127#1:336,3\n129#1:339\n129#1:340,3\n*E\n"})
public abstract class AccountBillBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f16617X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f16618U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f16619V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f16620W;

    /* JADX INFO: compiled from: AccountBillBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillBaseFragment$Companion;", "", "<init>", "()V", "KEY_ACCOUNT_TYPE", "", "KEY_REQUEST_BIZ_TYPE", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: F3 */
    public abstract void mo15498F3();

    /* JADX INFO: renamed from: I3 */
    public static final void m15469I3(final AccountBillBaseFragment accountBillBaseFragment, ArrayList arrayList) {
        BizTypeDialogFragment.Companion companion = BizTypeDialogFragment.f16681v0;
        String strM15495B3 = accountBillBaseFragment.m15495B3();
        if (strM15495B3 == null) {
            strM15495B3 = "MAIN";
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = companion.newInstance(strM15495B3, arrayList).m15710w4(new Function1() { // from class: com.kubi.assets.bill.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountBillBaseFragment.m15470J3(this.f16784b, (String) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillBaseFragment.m15471K3(this.f16740b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = accountBillBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "BizTypeDialogFragment");
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m15470J3(AccountBillBaseFragment accountBillBaseFragment, String bizType) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        C44128b.m97259c(accountBillBaseFragment.getTAG(), "bizType: " + bizType);
        accountBillBaseFragment.m15496C3().m15554I(AccountBillFilterModel.m15820b(accountBillBaseFragment.m15496C3().m15555x().getValue(), null, bizType, null, null, null, null, null, 125, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m15472M3(AccountBillBaseFragment accountBillBaseFragment, String str) {
        if (str != null) {
            AccountBillCommonViewModel accountBillCommonViewModelM15496C3 = accountBillBaseFragment.m15496C3();
            AccountBillFilterModel value = accountBillBaseFragment.m15496C3().m15555x().getValue();
            if (Intrinsics.areEqual(str, "ALL")) {
                str = null;
            }
            accountBillCommonViewModelM15496C3.m15554I(AccountBillFilterModel.m15820b(value, null, null, str, null, null, null, null, 123, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m15474P3(AccountBillBaseFragment accountBillBaseFragment, String fundsType, String bizType) {
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        accountBillBaseFragment.m15496C3().m15554I(AccountBillFilterModel.m15820b(accountBillBaseFragment.m15496C3().m15555x().getValue(), null, bizType, null, null, null, fundsType, null, 93, null));
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final String m15494A3() {
        return (String) this.f16619V.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: B3 */
    public final String m15495B3() {
        return (String) this.f16620W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: C3 */
    public final AccountBillCommonViewModel m15496C3() {
        return (AccountBillCommonViewModel) this.f16618U.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final void m15497D3(@NotNull Parcelable entity) {
        Context context;
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (entity instanceof AccountDetailEntity) {
            Context context2 = getContext();
            if (context2 != null) {
                BaseActivity.INSTANCE.launch(context2, AccountBillTradeItemDetailFragment.class, new C27051h().m66721e("data", entity).m66717a());
                return;
            }
            return;
        }
        if (entity instanceof FundsRecordEntity) {
            Context context3 = getContext();
            if (context3 != null) {
                BaseActivity.INSTANCE.launch(context3, AccountBillFutureItemDetailFragment.class, new C27051h().m66721e("data", entity).m66717a());
                return;
            }
            return;
        }
        if (!(entity instanceof FinanceBillItemEntity) || (context = getContext()) == null) {
            return;
        }
        BaseActivity.INSTANCE.launch(context, AccountBillFinanceItemDetailFragment.class, new C27051h().m66721e("data", entity).m66717a());
    }

    /* JADX INFO: renamed from: G3 */
    public final void m15499G3(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (z11) {
            C27046k.m66694i(textView, R$drawable.ic_triangle_top_12, 0, 0, 6, null);
        } else {
            C27046k.m66694i(textView, R$drawable.ic_triangle_bottom_12, 0, 0, 6, null);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m15502O3() {
        FutureRecordFilterDialogFragment.Companion companion = FutureRecordFilterDialogFragment.f16709w0;
        String fundsType = m15496C3().m15555x().getValue().getFundsType();
        if (fundsType == null) {
            fundsType = "selfFunds";
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = companion.newInstance(fundsType, C27041f.m66668h(m15496C3().m15555x().getValue().getBizType())).m15786x4(new Function2() { // from class: com.kubi.assets.bill.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountBillBaseFragment.m15474P3(this.f16745b, (String) obj, (String) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillBaseFragment.m15475Q3(this.f16748b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "FutureBizTypeDialog");
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_account_bill_common_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final AccountBillListState<AccountDetailEntity> m15505x3(@NotNull AccountBillListState<Object> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<Object> listM15817d = state.m15817d();
        if (listM15817d == null || !listM15817d.isEmpty()) {
            Iterator<T> it = listM15817d.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof AccountDetailEntity)) {
                    return null;
                }
            }
        }
        List<Object> listM15817d2 = state.m15817d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15817d2, 10));
        for (Object obj : listM15817d2) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.assets.entity.AccountDetailEntity");
            arrayList.add((AccountDetailEntity) obj);
        }
        return new AccountBillListState<>(arrayList, state.getTotal(), state.getHasMore(), state.getCurrentPage());
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final AccountBillListState<FinanceBillItemEntity> m15506y3(@NotNull AccountBillListState<Object> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<Object> listM15817d = state.m15817d();
        if (listM15817d == null || !listM15817d.isEmpty()) {
            Iterator<T> it = listM15817d.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof FinanceBillItemEntity)) {
                    return null;
                }
            }
        }
        List<Object> listM15817d2 = state.m15817d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15817d2, 10));
        for (Object obj : listM15817d2) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.assets.entity.FinanceBillItemEntity");
            arrayList.add((FinanceBillItemEntity) obj);
        }
        return new AccountBillListState<>(arrayList, state.getTotal(), state.getHasMore(), state.getCurrentPage());
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final AccountBillListState<FundsRecordEntity> m15507z3(@NotNull AccountBillListState<Object> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<Object> listM15817d = state.m15817d();
        if (listM15817d == null || !listM15817d.isEmpty()) {
            Iterator<T> it = listM15817d.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof FundsRecordEntity)) {
                    return null;
                }
            }
        }
        List<Object> listM15817d2 = state.m15817d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15817d2, 10));
        for (Object obj : listM15817d2) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.kumex.entity.FundsRecordEntity");
            arrayList.add((FundsRecordEntity) obj);
        }
        return new AccountBillListState<>(arrayList, state.getTotal(), state.getHasMore(), state.getCurrentPage());
    }

    public AccountBillBaseFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.bill.AccountBillBaseFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.bill.AccountBillBaseFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f16618U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AccountBillCommonViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.bill.AccountBillBaseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.bill.AccountBillBaseFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.bill.AccountBillBaseFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f16619V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountBillBaseFragment.m15493w3(this.f16736b);
            }
        });
        this.f16620W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountBillBaseFragment.m15468E3(this.f16751b);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public static final String m15468E3(AccountBillBaseFragment accountBillBaseFragment) {
        Bundle arguments = accountBillBaseFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("requestBizType");
        }
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m15471K3(AccountBillBaseFragment accountBillBaseFragment, DialogInterface dialogInterface) {
        accountBillBaseFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m15473N3(AccountBillBaseFragment accountBillBaseFragment, DialogInterface dialogInterface) {
        accountBillBaseFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m15475Q3(AccountBillBaseFragment accountBillBaseFragment, DialogInterface dialogInterface) {
        accountBillBaseFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m15476S3(AccountBillBaseFragment accountBillBaseFragment, String str) {
        accountBillBaseFragment.m15496C3().m15554I(AccountBillFilterModel.m15820b(accountBillBaseFragment.m15496C3().m15555x().getValue(), str, null, null, null, null, null, null, 126, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m15477T3(AccountBillBaseFragment accountBillBaseFragment, DialogInterface dialogInterface) {
        accountBillBaseFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m15478V3(AccountBillBaseFragment accountBillBaseFragment, String str) {
        AccountBillCommonViewModel accountBillCommonViewModelM15496C3 = accountBillBaseFragment.m15496C3();
        AccountBillFilterModel value = accountBillBaseFragment.m15496C3().m15555x().getValue();
        if (Intrinsics.areEqual(str, "ALL")) {
            str = null;
        }
        accountBillCommonViewModelM15496C3.m15554I(AccountBillFilterModel.m15820b(value, null, null, null, str, null, null, null, 119, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m15479W3(AccountBillBaseFragment accountBillBaseFragment, DialogInterface dialogInterface) {
        accountBillBaseFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: w3 */
    public static final String m15493w3(AccountBillBaseFragment accountBillBaseFragment) {
        Bundle arguments = accountBillBaseFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("accountType");
        }
        return null;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m15500H3() throws Exception {
        String bizType = m15496C3().m15555x().getValue().getBizType();
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ParcelizePair("bizType", C27041f.m66668h(bizType)));
        BizTypeFilterHelper bizTypeFilterHelper = BizTypeFilterHelper.f16688a;
        String strM15495B3 = m15495B3();
        if (strM15495B3 == null) {
            strM15495B3 = "MAIN";
        }
        bizTypeFilterHelper.m15716e(strM15495B3, new Action() { // from class: com.kubi.assets.bill.j
            @Override // io.reactivex.functions.Action
            public final void run() {
                AccountBillBaseFragment.m15469I3(this.f16768b, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final void m15501L3() {
        boolean z11;
        String time = m15496C3().m15555x().getValue().getTime();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String string = getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (time != null && time.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        listCreateListBuilder.add(new FilterOptionItem("ALL", string, z11));
        String string2 = getString(R$string.one_day);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        listCreateListBuilder.add(new FilterOptionItem("ONE_DAY", string2, Intrinsics.areEqual(time, "ONE_DAY")));
        String string3 = getString(R$string.one_month);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        listCreateListBuilder.add(new FilterOptionItem("ONE_MONTH", string3, Intrinsics.areEqual(time, "ONE_MONTH")));
        String string4 = getString(R$string.three_month);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        listCreateListBuilder.add(new FilterOptionItem("THREE_MONTH", string4, Intrinsics.areEqual(time, "THREE_MONTH")));
        if (!Intrinsics.areEqual(m15494A3(), "CONTRACT")) {
            String string5 = getString(R$string.one_year);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            listCreateListBuilder.add(new FilterOptionItem("ONE_YEAR", string5, Intrinsics.areEqual(time, "ONE_YEAR")));
        }
        List<FilterOptionItem> listBuild = CollectionsKt.build(listCreateListBuilder);
        FilterOptionDialog.Companion companion = FilterOptionDialog.f16691u0;
        String string6 = getString(R$string.time);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        BaseDialogFragment baseDialogFragmentM54192r3 = companion.create(string6, listBuild).m15736u4(new Function1() { // from class: com.kubi.assets.bill.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountBillBaseFragment.m15472M3(this.f16779b, (String) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillBaseFragment.m15473N3(this.f16782b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "select_time_dialog");
    }

    /* JADX INFO: renamed from: R3 */
    public final void m15503R3() {
        BaseDialogFragment baseDialogFragmentM54192r3 = AccountBillSearchCoinDialog.f16656A0.create(m15496C3().m15555x().getValue().getCurrency(), m15494A3()).m15674G4(new Function1() { // from class: com.kubi.assets.bill.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountBillBaseFragment.m15476S3(this.f16755b, (String) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.i
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillBaseFragment.m15477T3(this.f16761b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "search_coin_dialog");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m15504U3() {
        boolean z11;
        String direction = m15496C3().m15555x().getValue().getDirection();
        FilterOptionDialog.Companion companion = FilterOptionDialog.f16691u0;
        String string = getString(R$string.direction);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (direction != null && direction.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        FilterOptionItem filterOptionItem = new FilterOptionItem("ALL", string2, z11);
        String string3 = getString(R$string.in_account);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FilterOptionItem filterOptionItem2 = new FilterOptionItem("IN", string3, Intrinsics.areEqual(direction, "IN"));
        String string4 = getString(R$string.out_account);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        BaseDialogFragment baseDialogFragmentM54192r3 = companion.create(string, CollectionsKt.listOf((Object[]) new FilterOptionItem[]{filterOptionItem, filterOptionItem2, new FilterOptionItem("OUT", string4, Intrinsics.areEqual(direction, "OUT"))})).m15736u4(new Function1() { // from class: com.kubi.assets.bill.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountBillBaseFragment.m15478V3(this.f16773b, (String) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillBaseFragment.m15479W3(this.f16776b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "select_side_dialog");
    }
}
