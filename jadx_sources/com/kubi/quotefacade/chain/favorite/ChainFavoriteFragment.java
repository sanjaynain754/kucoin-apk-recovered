package com.kubi.quotefacade.chain.favorite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4665f;
import bv.C4681m0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.adapter.ChainFavItemListAdapter;
import com.kubi.quotefacade.chain.ChainContainerViewModel;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.exception.QuoteMessage;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.quotefacade.helper.ChainSortHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p402kf.C41016c;
import p569qq.C43846g;
import p778xy.C46338a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: ChainFavoriteFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002STB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020/2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020/H\u0016J\b\u00108\u001a\u00020/H\u0016J\b\u00109\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0014J\b\u0010=\u001a\u00020/H\u0002J\u0016\u0010>\u001a\u00020/2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\b\u0010B\u001a\u00020/H\u0002J\b\u0010C\u001a\u00020/H\u0002J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020&H\u0002J\b\u0010F\u001a\u00020/H\u0003J\b\u0010G\u001a\u00020/H\u0007J\n\u0010H\u001a\u0004\u0018\u00010#H\u0002J\u0018\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0010\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020 H\u0002J\b\u0010O\u001a\u00020/H\u0002J\u0010\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020AH\u0007J\u001a\u0010R\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010A2\u0006\u0010L\u001a\u00020\u0013H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\"\u0010\r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIState;", "<init>", "()V", "onActionClickListener", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$OnActionClickListener;", "viewModel", "Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "getViewModel", "()Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChainFavoriteBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChainFavoriteBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/quotefacade/adapter/ChainFavItemListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/adapter/ChainFavItemListAdapter;", "adapter$delegate", "scrolling", "", "bufferNotify", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "firstShow", "chainSortType", "", "getChainSortType", "()Ljava/lang/String;", "setChainSortType", "(Ljava/lang/String;)V", "timeChoose", "mSortHelper", "Lcom/kubi/quotefacade/helper/ChainSortHelper;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onDetach", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "initEvent", "controlDataRefresh", "itemList", "", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "initSortTagText", "initSortView", "updateSafelySortView", "sort", "initRecyclerView", "popFavoriteActionWindowTest", "popFavoriteActionWindow", "initPopView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", ViewProps.POSITION, "showPageEmptyView", "showNoData", "handleItemClick", "dealCollectActionTest", "chain", "dealCollectAction", "Companion", "OnActionClickListener", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainFavoriteFragment.kt\ncom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n147#2,16:433\n54#3,2:449\n81#4,2:451\n76#4,7:453\n1#5:460\n*S KotlinDebug\n*F\n+ 1 ChainFavoriteFragment.kt\ncom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment\n*L\n87#1:433,16\n127#1:449,2\n169#1:451,2\n179#1:453,7\n*E\n"})
public final class ChainFavoriteFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: U */
    @Nullable
    public InterfaceC21751a f41491U;

    /* JADX INFO: renamed from: Y */
    public boolean f41495Y;

    /* JADX INFO: renamed from: Z */
    public boolean f41496Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public C43724b f41497a0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public ChainSortHelper f41501e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f41490g0 = {Reflection.property1(new PropertyReference1Impl(ChainFavoriteFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChainFavoriteBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f41489f0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f41492V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.chain.favorite.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChainFavoriteFragment.m50766D4(this.f41525b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f41493W = C45681e.m100799e(this, new Function1<ChainFavoriteFragment, C4665f>() { // from class: com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4665f invoke(@NotNull ChainFavoriteFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4665f.m4642a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4665f, Unit>() { // from class: com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4665f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4665f c4665f) {
            invoke(c4665f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f41494X = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.chain.favorite.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChainFavoriteFragment.m50782T3(this.f41526b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    public boolean f41498b0 = true;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public String f41499c0 = ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public String f41500d0 = TimeSelectedEnum.TIME_24_HOURS.getConstTimeTag();

    /* JADX INFO: compiled from: ChainFavoriteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$Companion;", "", "<init>", "()V", "REFRESH_CHAIN_FAVOR_PAGE", "", "PAGE_ID", "newInstance", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ChainFavoriteFragment newInstance() {
            return new ChainFavoriteFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment$a */
    /* JADX INFO: compiled from: ChainFavoriteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$OnActionClickListener;", "", "onActionClick", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC21751a {
        /* JADX INFO: renamed from: H1 */
        void mo50732H1();
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment$b */
    /* JADX INFO: compiled from: ChainFavoriteFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21752b implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: b */
        public static final C21752b f41502b = new C21752b();

        /* JADX INFO: renamed from: a */
        public final void m50831a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(str2, "<unused var>");
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            m50831a(str, str2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment$c */
    /* JADX INFO: compiled from: ChainFavoriteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$initRecyclerView$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21753c extends RecyclerView.OnScrollListener {
        public C21753c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C43724b c43724bM50815x4;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                C46338a.m102151a(((OldBaseFragment) ChainFavoriteFragment.this).mContext).m6638z();
            } else if (newState == 1 || newState == 2) {
                C46338a.m102151a(((OldBaseFragment) ChainFavoriteFragment.this).mContext).m6637y();
            }
            ChainFavoriteFragment.this.f41495Y = newState != 0;
            if (!ChainFavoriteFragment.this.f41495Y && ChainFavoriteFragment.this.f41496Z) {
                ChainFavoriteFragment.this.m50823W3().notifyDataSetChanged();
                ChainFavoriteFragment.this.f41496Z = false;
            }
            C43724b c43724bM50815x5 = ChainFavoriteFragment.this.m50815x4();
            if (c43724bM50815x5 == null || !c43724bM50815x5.m96299I() || (c43724bM50815x4 = ChainFavoriteFragment.this.m50815x4()) == null) {
                return;
            }
            c43724bM50815x4.m96331y();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment$d */
    /* JADX INFO: compiled from: ChainFavoriteFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21754d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f41504b;

        public C21754d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f41504b = function;
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
            return this.f41504b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41504b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m50763B4(ChainFavoriteFragment chainFavoriteFragment) {
        InterfaceC21751a interfaceC21751a = chainFavoriteFragment.f41491U;
        if (interfaceC21751a != null) {
            interfaceC21751a.mo50732H1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final ChainContainerViewModel m50766D4(ChainFavoriteFragment chainFavoriteFragment) {
        return (ChainContainerViewModel) new ViewModelProvider(chainFavoriteFragment).get(ChainContainerViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static final ChainFavItemListAdapter m50782T3(ChainFavoriteFragment chainFavoriteFragment) {
        return new ChainFavItemListAdapter(chainFavoriteFragment.f41499c0, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m50788h4(ChainFavoriteFragment chainFavoriteFragment, ChainItemEntity chainItemEntity, int i11, View view) throws JSONException {
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53025e().c()) {
            chainFavoriteFragment.sendIntent(new ChainFavoriteContract$UIIntent.CollectOrCancelChain(chainItemEntity, i11));
        } else if (TextUtils.isEmpty(bQuoteFacadeDepend.m53025e().d()) || !com.kubi.user.config.a.b()) {
            chainFavoriteFragment.m50822V3(chainItemEntity, i11);
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.chain.favorite.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChainFavoriteFragment.m50789i4();
                }
            }), 1, (Object) null);
        }
        C43724b c43724bM50815x4 = chainFavoriteFragment.m50815x4();
        if (c43724bM50815x4 != null) {
            c43724bM50815x4.m96331y();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m50789i4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m50803r4(final ChainFavoriteFragment chainFavoriteFragment) {
        ChainSortHelper chainSortHelper = chainFavoriteFragment.f41501e0;
        if (chainSortHelper != null) {
            chainSortHelper.m52085t(new Function2() { // from class: com.kubi.quotefacade.chain.favorite.k
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChainFavoriteFragment.m50805s4(this.f41519b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m50805s4(ChainFavoriteFragment chainFavoriteFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        chainFavoriteFragment.m50826Z3().m50760z(sortName, sortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m50807t4(final ChainFavoriteFragment chainFavoriteFragment) {
        ChainSortHelper chainSortHelper = chainFavoriteFragment.f41501e0;
        if (chainSortHelper != null) {
            chainSortHelper.m52087v(new Function2() { // from class: com.kubi.quotefacade.chain.favorite.l
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChainFavoriteFragment.m50809u4(this.f41520b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m50809u4(ChainFavoriteFragment chainFavoriteFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        chainFavoriteFragment.m50826Z3().m50760z(sortName, sortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m50811v4(final ChainFavoriteFragment chainFavoriteFragment) {
        ChainSortHelper chainSortHelper = chainFavoriteFragment.f41501e0;
        if (chainSortHelper != null) {
            chainSortHelper.m52086u(new Function2() { // from class: com.kubi.quotefacade.chain.favorite.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChainFavoriteFragment.m50813w4(this.f41515b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m50813w4(ChainFavoriteFragment chainFavoriteFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        chainFavoriteFragment.m50826Z3().m50760z(sortName, sortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m50822V3(ChainItemEntity chainItemEntity, int i11) throws JSONException {
        if (chainItemEntity != null) {
            ChainFavCacheManager.f41922a.m51773g(chainItemEntity);
            ToastCompat.m66441G(this.mContext.getString(R$string.cancel_favor_ok), new Object[0]);
            m50826Z3().m50757t(chainItemEntity);
            List<ChainItemEntity> data = m50823W3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            if (!data.isEmpty() && m50823W3().getData().size() > i11) {
                m50823W3().remove(i11);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("symbol", chainItemEntity.getSymbol());
            jSONObject.put(InterfaceC33826o0.f71244p, chainItemEntity.getToken());
            jSONObject.put("return", "0");
            Unit unit = Unit.INSTANCE;
            C27023a.m66554a("B8FavoritesCoins", "Favorites", "1", jSONObject);
            if (m50823W3().getData().isEmpty()) {
                m50819A4(true);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final ChainFavItemListAdapter m50823W3() {
        return (ChainFavItemListAdapter) this.f41494X.getValue();
    }

    /* JADX INFO: renamed from: X3 */
    public final C4665f m50824X3() {
        return (C4665f) this.f41493W.getValue(this, f41490g0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: Y3, reason: from getter */
    public final String getF41499c0() {
        return this.f41499c0;
    }

    /* JADX INFO: renamed from: Z3 */
    public final ChainContainerViewModel m50826Z3() {
        return (ChainContainerViewModel) this.f41492V.getValue();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m50827c4() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "refresh_chain_favor_page".length();
        }
        C12572a.m23692a(this, false, new ChainFavoriteFragment$initEvent$$inlined$bindFlowEvent$1("refresh_chain_favor_page", null, this));
        if (c12573b.m23696a()) {
            "chain_filter_data_back_favorite".length();
        }
        C12572a.m23692a(this, false, new ChainFavoriteFragment$initEvent$$inlined$bindFlowEvent$default$1("chain_filter_data_back_favorite", null, this));
        m50826Z3().m50755r().observe(getViewLifecycleOwner(), new C21754d(new Function1() { // from class: com.kubi.quotefacade.chain.favorite.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainFavoriteFragment.m50785d4(this.f41527b, (List) obj);
            }
        }));
        m50826Z3().m50756s().observe(getViewLifecycleOwner(), new C21754d(new Function1() { // from class: com.kubi.quotefacade.chain.favorite.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainFavoriteFragment.m50786e4(this.f41528b, (Boolean) obj);
            }
        }));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C21757a) {
            C21757a c21757a = (C21757a) singleEvent;
            if (c21757a.m50834a() != null) {
                m50822V3(c21757a.m50834a().getFirst(), c21757a.m50834a().getSecond().intValue());
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_chain_favorite;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ChainFavoriteViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        try {
            ActivityResultCaller parentFragment = getParentFragment();
            this.f41491U = parentFragment instanceof InterfaceC21751a ? (InterfaceC21751a) parentFragment : null;
        } catch (Exception unused) {
            String tag = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
            C43846g.m96568c(new QuoteMessage(tag, context + " must implement OnActionClickListener", false, 4, null), null, 2, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m50801q4();
        m50829p4();
        m50790j4();
        m50827c4();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m50830z4(@Nullable String str) {
        this.f41499c0 = str;
    }

    /* JADX INFO: renamed from: a4 */
    private final void m50783a4() {
        m50823W3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.chain.favorite.g
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                ChainFavoriteFragment.m50784b4(this.f41513a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m50784b4(ChainFavoriteFragment chainFavoriteFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        String kcChain;
        String token;
        if (!C27014a1.m66501a(view) && i11 >= 0 && i11 <= chainFavoriteFragment.m50823W3().getData().size() - 1) {
            ChainItemEntity chainItemEntity = chainFavoriteFragment.m50823W3().getData().get(i11);
            if (chainItemEntity != null && (kcChain = chainItemEntity.getKcChain()) != null && (token = chainItemEntity.getToken()) != null) {
                String strValueOf = String.valueOf(i11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("symbol", chainItemEntity.getSymbol());
                jSONObject.put(InterfaceC33826o0.f71244p, chainItemEntity.getToken());
                Unit unit = Unit.INSTANCE;
                C27023a.m66554a("B8FavoritesCoins", "Coin", strValueOf, jSONObject);
                QuoteExKt.m51859j(token, kcChain, 0L, 4, null);
                return;
            }
            return;
        }
        C44128b.m97266j(chainFavoriteFragment.getTAG(), "position: " + i11 + "，size: " + chainFavoriteFragment.m50823W3().getData().size());
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m50785d4(ChainFavoriteFragment chainFavoriteFragment, List list) {
        if (list.isEmpty()) {
            chainFavoriteFragment.m50819A4(true);
            chainFavoriteFragment.m50821U3(CollectionsKt.emptyList());
        } else {
            chainFavoriteFragment.m50819A4(false);
            Intrinsics.checkNotNull(list);
            chainFavoriteFragment.m50821U3(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m50786e4(final ChainFavoriteFragment chainFavoriteFragment, Boolean bool) {
        if (bool.booleanValue()) {
            chainFavoriteFragment.m50823W3().replaceData(CollectionsKt.emptyList());
            BaseFragment.showFailView$default(chainFavoriteFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.chain.favorite.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChainFavoriteFragment.m50787f4(this.f41514b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m50787f4(ChainFavoriteFragment chainFavoriteFragment, View view) {
        chainFavoriteFragment.m50826Z3().m50753p(chainFavoriteFragment.f41500d0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: j4 */
    private final void m50790j4() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        C4665f c4665fM50824X3 = m50824X3();
        if (c4665fM50824X3 != null && (recyclerView5 = c4665fM50824X3.f4316c) != null) {
            recyclerView5.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
        if (m50823W3().m50185l()) {
            ChainFavItemListAdapter chainFavItemListAdapterM50823W3 = m50823W3();
            C4665f c4665fM50824X4 = m50824X3();
            if (c4665fM50824X4 != null) {
                recyclerView4 = c4665fM50824X4.f4316c;
            } else {
                recyclerView4 = null;
            }
            chainFavItemListAdapterM50823W3.bindToRecyclerView(recyclerView4);
        }
        C4665f c4665fM50824X5 = m50824X3();
        if (c4665fM50824X5 != null && (recyclerView3 = c4665fM50824X5.f4316c) != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        C4665f c4665fM50824X6 = m50824X3();
        if (c4665fM50824X6 != null && (recyclerView2 = c4665fM50824X6.f4316c) != null) {
            recyclerView2.setHasFixedSize(true);
        }
        m50783a4();
        m50823W3().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.chain.favorite.m
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return ChainFavoriteFragment.m50791k4(this.f41521a, baseQuickAdapter, view, i11);
            }
        });
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.chain.favorite.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainFavoriteFragment.m50792l4(this.f41522b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.chain.favorite.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChainFavoriteFragment.m50794m4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.chain.favorite.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainFavoriteFragment.m50796n4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.chain.favorite.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChainFavoriteFragment.m50798o4(function2, obj);
            }
        }));
        C4665f c4665fM50824X7 = m50824X3();
        if (c4665fM50824X7 != null && (recyclerView = c4665fM50824X7.f4316c) != null) {
            recyclerView.addOnScrollListener(new C21753c());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static final boolean m50791k4(ChainFavoriteFragment chainFavoriteFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (chainFavoriteFragment.getView() != null && chainFavoriteFragment.isShowing()) {
            C43724b c43724bM50815x4 = chainFavoriteFragment.m50815x4();
            if (c43724bM50815x4 != null) {
                chainFavoriteFragment.m50828g4(new BaseViewHolder(c43724bM50815x4.m96292A()), i11);
                c43724bM50815x4.m96320e0(view, 1, 0, 0, 0);
            }
            chainFavoriteFragment.m50823W3().m50186m(i11);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m50792l4(ChainFavoriteFragment chainFavoriteFragment, Boolean bool) {
        chainFavoriteFragment.m50823W3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public static final void m50794m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public static final Unit m50796n4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public static final void m50798o4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q4 */
    private final void m50801q4() {
        C4665f c4665fM50824X3 = m50824X3();
        if (c4665fM50824X3 == null) {
            return;
        }
        FrameLayout frameLayout = c4665fM50824X3.f4319f.f4454k;
        Intrinsics.checkNotNull(frameLayout);
        this.f41501e0 = new ChainSortHelper(frameLayout);
        c4665fM50824X3.f4319f.f4449f.setImageResource(0);
        LinearLayout llAmount = c4665fM50824X3.f4319f.f4452i;
        Intrinsics.checkNotNullExpressionValue(llAmount, "llAmount");
        C27046k.m66710y(llAmount, 500L, new Function0() { // from class: com.kubi.quotefacade.chain.favorite.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainFavoriteFragment.m50803r4(this.f41509b);
            }
        });
        LinearLayout flPrice = c4665fM50824X3.f4319f.f4446c;
        Intrinsics.checkNotNullExpressionValue(flPrice, "flPrice");
        C27046k.m66710y(flPrice, 500L, new Function0() { // from class: com.kubi.quotefacade.chain.favorite.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainFavoriteFragment.m50807t4(this.f41510b);
            }
        });
        FrameLayout flChangeRate = c4665fM50824X3.f4319f.f4445b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        C27046k.m66710y(flChangeRate, 500L, new Function0() { // from class: com.kubi.quotefacade.chain.favorite.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainFavoriteFragment.m50811v4(this.f41511b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public final C43724b m50815x4() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (this.f41497a0 == null) {
            this.f41497a0 = new BubbleEasyPopup(context).m96307Q(R$layout.popwindow_layout_favriote_action).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.chain.favorite.f
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ChainFavoriteFragment.m50817y4(this.f41512b);
                }
            }).m96316Z(true).m96322p();
        }
        return this.f41497a0;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m50817y4(ChainFavoriteFragment chainFavoriteFragment) {
        chainFavoriteFragment.m50823W3().m50186m(-1);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m50819A4(boolean z11) {
        showContentView();
        if (z11) {
            C4665f c4665fM50824X3 = m50824X3();
            if (c4665fM50824X3 != null) {
                c4665fM50824X3.f4315b.setVisibility(0);
                c4665fM50824X3.f4319f.f4454k.setVisibility(8);
                c4665fM50824X3.f4316c.setVisibility(8);
                KcPrimaryButton tvAction = c4665fM50824X3.f4317d;
                Intrinsics.checkNotNullExpressionValue(tvAction, "tvAction");
                C27046k.m66711z(tvAction, 0L, new Function0() { // from class: com.kubi.quotefacade.chain.favorite.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChainFavoriteFragment.m50763B4(this.f41508b);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        C4665f c4665fM50824X4 = m50824X3();
        if (c4665fM50824X4 != null) {
            c4665fM50824X4.f4315b.setVisibility(8);
            c4665fM50824X4.f4319f.f4454k.setVisibility(0);
            c4665fM50824X4.f4316c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m50820C4(String str) {
        C4665f c4665fM50824X3 = m50824X3();
        if (c4665fM50824X3 == null) {
            return;
        }
        if (Intrinsics.areEqual(str, ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY.getConstSortType())) {
            c4665fM50824X3.f4319f.f4448e.setVisibility(8);
            c4665fM50824X3.f4319f.f4445b.setEnabled(false);
        } else {
            c4665fM50824X3.f4319f.f4448e.setVisibility(0);
            c4665fM50824X3.f4319f.f4445b.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m50821U3(List<ChainItemEntity> list) {
        if (list.isEmpty() || !this.f41495Y) {
            m50823W3().replaceData(list);
        } else {
            this.f41496Z = true;
        }
        m50826Z3().m50752A(this.f41500d0);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m50828g4(BaseViewHolder baseViewHolder, final int i11) {
        final ChainItemEntity item = m50823W3().getItem(i11);
        baseViewHolder.setGone(R$id.llPin, false).setGone(R$id.llReminder, false);
        ((ImageView) baseViewHolder.getView(R$id.ivFavor)).setImageResource(R$mipmap.ic_favor);
        baseViewHolder.setOnClickListener(R$id.llFavor, new View.OnClickListener() { // from class: com.kubi.quotefacade.chain.favorite.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                ChainFavoriteFragment.m50788h4(this.f41516b, item, i11, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f41491U = null;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m50826Z3().m50758v();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (this.f41498b0) {
            this.f41498b0 = false;
            showLoading();
        }
        m50826Z3().m50753p(this.f41500d0);
        C27023a.m66557d("B8FavoritesCoins", "Tab", null, null, 12, null);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m50829p4() {
        C4681m0 c4681m0;
        BaseTextView baseTextView;
        int resourceId;
        C4665f c4665fM50824X3 = m50824X3();
        if (c4665fM50824X3 != null && (c4681m0 = c4665fM50824X3.f4319f) != null && (baseTextView = c4681m0.f4458o) != null) {
            ChainSortItemEnum.Companion companion = ChainSortItemEnum.INSTANCE;
            String constSortType = this.f41499c0;
            if (constSortType == null) {
                constSortType = ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType();
            }
            ChainSortItemEnum chainSortItemEnumFindEnumBySortType = companion.findEnumBySortType(constSortType);
            if (chainSortItemEnumFindEnumBySortType != null) {
                resourceId = chainSortItemEnumFindEnumBySortType.getResourceId();
            } else {
                resourceId = R$string.quote_chain_filter_change;
            }
            baseTextView.setText(getString(resourceId));
        }
    }
}
