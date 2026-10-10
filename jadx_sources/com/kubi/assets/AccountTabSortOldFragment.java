package com.kubi.assets;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.Profile;
import com.blankj.utilcode.util.C5271g0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.view.tab.AssetTabSortHelper;
import com.kubi.assets.view.tab.C11296e;
import com.kubi.event.api.C12572a;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43852m;
import p637ta.C44731b2;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AccountTabSortOldFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0002J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0015J\b\u0010*\u001a\u00020#H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/AccountTabSortOldFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewmodel", "Lcom/kubi/assets/AssetTabSortViewModel;", "getViewmodel", "()Lcom/kubi/assets/AssetTabSortViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/assets/databinding/AssetTabSortFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetTabSortFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "assetAdapter", "Lcom/kubi/assets/AssetSortPreviewAdapter;", "isDragging", "", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "initObservers", "setupDragAndDrop", "clickTrack", "sortType", "onDestroy", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTabSortOldFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortOldFragment.kt\ncom/kubi/assets/AccountTabSortOldFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,222:1\n106#2,15:223\n147#3,16:238\n*S KotlinDebug\n*F\n+ 1 AccountTabSortOldFragment.kt\ncom/kubi/assets/AccountTabSortOldFragment\n*L\n61#1:223,15\n62#1:238,16\n*E\n"})
public final class AccountTabSortOldFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f16314U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f16315V;

    /* JADX INFO: renamed from: W */
    public AssetSortPreviewAdapter f16316W;

    /* JADX INFO: renamed from: X */
    public boolean f16317X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public String f16318Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f16313a0 = {Reflection.property1(new PropertyReference1Impl(AccountTabSortOldFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetTabSortFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f16312Z = new Companion(null);

    /* JADX INFO: compiled from: AccountTabSortOldFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/AccountTabSortOldFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "ACCOUNT_SORT_CHANGE_EVENT", "launchPage", "", "context", "Landroid/content/Context;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m15112b(Context context, FragmentActivity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.startActivity(new Intent(it, (Class<?>) BaseFragmentActivity.class).putExtra("fragment", AccountTabSortOldFragment.class.getName()).putExtra("title", context.getString(R$string.kc_assets_account_sort_title)));
            return Unit.INSTANCE;
        }

        public final void launchPage(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C42899b.m94073c(new Function1() { // from class: com.kubi.assets.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountTabSortOldFragment.Companion.m15112b(context, (FragmentActivity) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AccountTabSortOldFragment$a */
    /* JADX INFO: compiled from: AccountTabSortOldFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9444a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f16319b;

        public C9444a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f16319b = function;
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
            return this.f16319b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f16319b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AccountTabSortOldFragment$b */
    /* JADX INFO: compiled from: AccountTabSortOldFragment.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/assets/AccountTabSortOldFragment$setupDragAndDrop$callback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "onSelectedChanged", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAccountTabSortOldFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortOldFragment.kt\ncom/kubi/assets/AccountTabSortOldFragment$setupDragAndDrop$callback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,222:1\n1563#2:223\n1634#2,3:224\n172#3,2:227\n*S KotlinDebug\n*F\n+ 1 AccountTabSortOldFragment.kt\ncom/kubi/assets/AccountTabSortOldFragment$setupDragAndDrop$callback$1\n*L\n176#1:223\n176#1:224,3\n202#1:227,2\n*E\n"})
    public static final class C9445b extends ItemDragAndSwipeCallback {
        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            if (actionState != 0) {
                if (actionState == 2) {
                    AssetsLog.Common.m15236i("拖动开始");
                    AccountTabSortOldFragment.this.f16317X = true;
                }
            } else if (AccountTabSortOldFragment.this.f16317X) {
                AssetsLog.Common.m15236i("拖动停止");
                AccountTabSortOldFragment.this.f16317X = false;
                AssetTabSortHelper assetTabSortHelper = AssetTabSortHelper.f19161a;
                if (C11296e.m20096c(assetTabSortHelper.m20071n())) {
                    AssetSortPreviewAdapter assetSortPreviewAdapter = AccountTabSortOldFragment.this.f16316W;
                    if (assetSortPreviewAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
                        assetSortPreviewAdapter = null;
                    }
                    List<AccountSortIndexItem> listM15150i = assetSortPreviewAdapter.m15150i();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15150i, 10));
                    Iterator<T> it = listM15150i.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AccountSortIndexItem) it.next()).getF16605a());
                    }
                    assetTabSortHelper.m20075r("MANUAL", arrayList);
                    AccountTabSortOldFragment.this.m15109v3().m15175F("MANUAL", true);
                }
            }
            if (actionState != 0) {
                View view = viewHolder != null ? viewHolder.itemView : null;
                C5271g0.a aVar = new C5271g0.a();
                aVar.m6216g(ContextCompat.getColor(BaseApplication.INSTANCE.get(), R$color.c_cover4));
                aVar.m6218i(C5275i0.m6236a(4.0f));
                C5271g0.m6208a(view, aVar);
            }
            super.onSelectedChanged(viewHolder, actionState);
        }

        public C9445b(AssetSortPreviewAdapter assetSortPreviewAdapter) {
            super(assetSortPreviewAdapter);
        }

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            viewHolder.itemView.setBackgroundColor(0);
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setPadding(0, 0, 0, 0);
            super.clearView(recyclerView, viewHolder);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m15089A3(AccountTabSortOldFragment accountTabSortOldFragment) {
        accountTabSortOldFragment.m15107t3(Profile.DEFAULT_PROFILE_NAME);
        AssetTabSortViewModel.m15164G(accountTabSortOldFragment.m15109v3(), "DEFAULT", false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m15090B3(AccountTabSortOldFragment accountTabSortOldFragment) {
        accountTabSortOldFragment.m15107t3(TypedValues.Custom.NAME);
        AssetTabSortViewModel.m15164G(accountTabSortOldFragment.m15109v3(), "MANUAL", false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m15091C3(AccountTabSortOldFragment accountTabSortOldFragment) {
        accountTabSortOldFragment.m15107t3("valueDescending");
        AssetTabSortViewModel.m15164G(accountTabSortOldFragment.m15109v3(), "VALUE_DESC", false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m15092D3(AccountTabSortOldFragment accountTabSortOldFragment, boolean z11, String type, List orderItems) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(orderItems, "orderItems");
        accountTabSortOldFragment.showContentView();
        if (!z11) {
            BaseFragment.showFailView$default(accountTabSortOldFragment, 0, 0, (View.OnClickListener) null, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m15103x3(AccountTabSortOldFragment accountTabSortOldFragment, List list) {
        AssetSortPreviewAdapter assetSortPreviewAdapter = accountTabSortOldFragment.f16316W;
        if (assetSortPreviewAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
            assetSortPreviewAdapter = null;
        }
        Intrinsics.checkNotNull(list);
        assetSortPreviewAdapter.m15151j(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m15106E3() {
        AssetSortPreviewAdapter assetSortPreviewAdapter = this.f16316W;
        AssetSortPreviewAdapter assetSortPreviewAdapter2 = null;
        if (assetSortPreviewAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
            assetSortPreviewAdapter = null;
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C9445b(assetSortPreviewAdapter));
        C44731b2 c44731b2M15108u3 = m15108u3();
        itemTouchHelper.attachToRecyclerView(c44731b2M15108u3 != null ? c44731b2M15108u3.f99613b : null);
        AssetSortPreviewAdapter assetSortPreviewAdapter3 = this.f16316W;
        if (assetSortPreviewAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
        } else {
            assetSortPreviewAdapter2 = assetSortPreviewAdapter3;
        }
        assetSortPreviewAdapter2.enableDragItem(itemTouchHelper, R$id.ivDragIcon, true);
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF18762X() {
        return this.f16318Y;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_tab_sort_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15105z3();
        m15110w3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m15109v3().m15180z(new Function3() { // from class: com.kubi.assets.c
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AccountTabSortOldFragment.m15092D3(this.f16842b, ((Boolean) obj).booleanValue(), (String) obj2, (List) obj3);
            }
        });
        Intent intent = new Intent();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f16318Y = str;
    }

    /* JADX INFO: renamed from: t3 */
    public final void m15107t3(@NotNull String sortType) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        C43852m.m96590b("B1functionSortSetPage", "functionSort", "1", TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("after_click_element_value", sortType));
    }

    /* JADX INFO: renamed from: u3 */
    public final C44731b2 m15108u3() {
        return (C44731b2) this.f16315V.getValue(this, f16313a0[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final AssetTabSortViewModel m15109v3() {
        return (AssetTabSortViewModel) this.f16314U.getValue();
    }

    public AccountTabSortOldFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewModels$default$2
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
        this.f16314U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AssetTabSortViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewModels$default$5
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
        this.f16315V = C45681e.m100799e(this, new Function1<AccountTabSortOldFragment, C44731b2>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44731b2 invoke(@NotNull AccountTabSortOldFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44731b2.m98972a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C44731b2, Unit>() { // from class: com.kubi.assets.AccountTabSortOldFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C44731b2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44731b2 c44731b2) {
                invoke(c44731b2);
                return Unit.INSTANCE;
            }
        });
        this.f16318Y = "B1functionSortSetPage";
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX INFO: renamed from: y3 */
    public static final Unit m15104y3(AccountTabSortOldFragment accountTabSortOldFragment, String str) {
        AssetSortPreviewAdapter assetSortPreviewAdapter;
        C44731b2 c44731b2M15108u3 = accountTabSortOldFragment.m15108u3();
        if (c44731b2M15108u3 != null) {
            c44731b2M15108u3.f99614c.f99670d.setChecked(false);
            c44731b2M15108u3.f99614c.f99668b.setChecked(false);
            c44731b2M15108u3.f99614c.f99672f.setChecked(false);
            BaseTextView tvDragFlag = c44731b2M15108u3.f99615d;
            Intrinsics.checkNotNullExpressionValue(tvDragFlag, "tvDragFlag");
            Intrinsics.checkNotNull(str);
            AssetExKt.m15138z(tvDragFlag, C11296e.m20096c(str));
            int iHashCode = str.hashCode();
            if (iHashCode != -2032180703) {
                if (iHashCode != -2028086330) {
                    if (iHashCode == -1737473857 && str.equals("VALUE_DESC")) {
                        c44731b2M15108u3.f99614c.f99672f.setChecked(true);
                    }
                } else if (str.equals("MANUAL")) {
                    c44731b2M15108u3.f99614c.f99668b.setChecked(true);
                }
            } else if (str.equals("DEFAULT")) {
                c44731b2M15108u3.f99614c.f99670d.setChecked(true);
            }
        }
        if (str != null) {
            int iHashCode2 = str.hashCode();
            AssetSortPreviewAdapter assetSortPreviewAdapter2 = null;
            if (iHashCode2 != -2032180703) {
                if (iHashCode2 != -2028086330) {
                    if (iHashCode2 == -1737473857 && str.equals("VALUE_DESC")) {
                        assetSortPreviewAdapter = accountTabSortOldFragment.f16316W;
                        if (assetSortPreviewAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
                        } else {
                            assetSortPreviewAdapter2 = assetSortPreviewAdapter;
                        }
                        assetSortPreviewAdapter2.m15149h(false);
                    }
                } else if (str.equals("MANUAL")) {
                    AssetSortPreviewAdapter assetSortPreviewAdapter3 = accountTabSortOldFragment.f16316W;
                    if (assetSortPreviewAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
                    } else {
                        assetSortPreviewAdapter2 = assetSortPreviewAdapter3;
                    }
                    assetSortPreviewAdapter2.m15149h(true);
                }
            } else if (str.equals("DEFAULT")) {
                assetSortPreviewAdapter = accountTabSortOldFragment.f16316W;
                if (assetSortPreviewAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
                } else {
                    assetSortPreviewAdapter2 = assetSortPreviewAdapter;
                }
                assetSortPreviewAdapter2.m15149h(false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    private final void m15105z3() {
        C44731b2 c44731b2M15108u3 = m15108u3();
        if (c44731b2M15108u3 != null) {
            c44731b2M15108u3.f99614c.f99670d.setClickable(false);
            c44731b2M15108u3.f99614c.f99668b.setClickable(false);
            c44731b2M15108u3.f99614c.f99672f.setClickable(false);
            LinearLayout defaultOrderLayout = c44731b2M15108u3.f99614c.f99671e;
            Intrinsics.checkNotNullExpressionValue(defaultOrderLayout, "defaultOrderLayout");
            C27046k.m66711z(defaultOrderLayout, 0L, new Function0() { // from class: com.kubi.assets.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabSortOldFragment.m15089A3(this.f16846b);
                }
            }, 1, null);
            LinearLayout customOrderLayout = c44731b2M15108u3.f99614c.f99669c;
            Intrinsics.checkNotNullExpressionValue(customOrderLayout, "customOrderLayout");
            C27046k.m66711z(customOrderLayout, 0L, new Function0() { // from class: com.kubi.assets.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabSortOldFragment.m15090B3(this.f17228b);
                }
            }, 1, null);
            LinearLayout valueOrderLayout = c44731b2M15108u3.f99614c.f99673g;
            Intrinsics.checkNotNullExpressionValue(valueOrderLayout, "valueOrderLayout");
            C27046k.m66711z(valueOrderLayout, 0L, new Function0() { // from class: com.kubi.assets.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabSortOldFragment.m15091C3(this.f17327b);
                }
            }, 1, null);
            AssetSortPreviewAdapter assetSortPreviewAdapter = null;
            this.f16316W = new AssetSortPreviewAdapter(null, 1, null);
            RecyclerView recyclerView = c44731b2M15108u3.f99613b;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            AssetSortPreviewAdapter assetSortPreviewAdapter2 = this.f16316W;
            if (assetSortPreviewAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("assetAdapter");
            } else {
                assetSortPreviewAdapter = assetSortPreviewAdapter2;
            }
            recyclerView.setAdapter(assetSortPreviewAdapter);
            m15106E3();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C12572a.m23695d("ACCOUNT_SORT_CHANGE_EVENT", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: w3 */
    public final void m15110w3() {
        m15109v3().m15179y().observe(getViewLifecycleOwner(), new C9444a(new Function1() { // from class: com.kubi.assets.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortOldFragment.m15104y3(this.f17601b, (String) obj);
            }
        }));
        m15109v3().m15177w().observe(getViewLifecycleOwner(), new C9444a(new Function1() { // from class: com.kubi.assets.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortOldFragment.m15103x3(this.f17605b, (List) obj);
            }
        }));
    }
}
