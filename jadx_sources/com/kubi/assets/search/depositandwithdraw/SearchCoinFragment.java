package com.kubi.assets.search.depositandwithdraw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.assets.exception.AssetsException;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.HideIMEUtil;
import com.kubi.assets.view.stickydecoration.StickyDecoration;
import com.kubi.assets.withdraw.WithdrawFragment;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kucoin.view.IndexBar;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import e60.C37084b;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import lb.ViewTreeObserverOnGlobalLayoutListenerC42150e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p208dr.InterfaceC36952a;
import p453mb.InterfaceC42501b;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p637ta.C44779h2;
import p637ta.C44879v0;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SearchCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010$\u001a\u00020\u000eH\u0014J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\u001c\u0010-\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J \u00105\u001a\u00020&2\u000e\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u0006\u00109\u001a\u000201H\u0002J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020\u0014H\u0002J\u000e\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u000201J\b\u0010>\u001a\u00020&H\u0002J\b\u0010?\u001a\u00020&H\u0002J\b\u0010@\u001a\u00020\u0014H\u0002J\u0010\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020CH\u0014J\b\u0010D\u001a\u00020&H\u0014J\b\u0010E\u001a\u00020&H\u0002J\n\u0010F\u001a\u0004\u0018\u00010GH\u0014J\b\u0010L\u001a\u00020&H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b!\u0010\"R\u000e\u00109\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040I8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UIState;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVM;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentSearchCoinBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentSearchCoinBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromType", "", "getFromType", "()I", "fromType$delegate", "Lkotlin/Lazy;", "isAdd", "", "()Z", "isAdd$delegate", "keyboardChangeListener", "Lcom/kubi/assets/utils/KeyboardChangeListener;", "decoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getDecoration", "()Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "setDecoration", "(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "mCoinListAdapter", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;", "getMCoinListAdapter", "()Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;", "mCoinListAdapter$delegate", "getLayout", "initView", "", "setPageId", "handleExposeNotFromInclude", "initSearchView", "listenKeyboardVisible", "startSearchFilter", "cancelSearchFilter", "handleCoinListItemClick", "item", "Lcom/kubi/data/entity/CoinInfoEntity;", "blockId", "", "initCoinListUI", "listenSideBar", "getCoinList", "refreshAdapterData", DbParams.KEY_CHANNEL_RESULT, "", "Lcom/kubi/assets/entity/SearchCoinEntity;", "filterText", "initHeaderSelectionUI", "needHeader", "searchFilter", "key", "showSideBar", "hideSideBar", "cancelSearch", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "handleAction", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "onDestroy", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinFragment.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 6 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,491:1\n147#2,16:492\n1#3:508\n44#4,2:509\n93#5,4:511\n93#5,4:515\n106#6:519\n78#6,22:520\n*S KotlinDebug\n*F\n+ 1 SearchCoinFragment.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinFragment\n*L\n78#1:492,16\n214#1:509,2\n410#1:511,4\n413#1:515,4\n166#1:519\n166#1:520,22\n*E\n"})
public final class SearchCoinFragment extends BaseStateFragment<SearchCoinContract$UiIntent, UIState, SearchCoinVM> {

    /* JADX INFO: renamed from: X */
    @Nullable
    public ViewTreeObserverOnGlobalLayoutListenerC42150e f18584X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public RecyclerView.ItemDecoration f18585Y;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f18580c0 = {Reflection.property1(new PropertyReference1Impl(SearchCoinFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentSearchCoinBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f18579b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18581U = C45681e.m100799e(this, new Function1<SearchCoinFragment, C44879v0>() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44879v0 invoke(@NotNull SearchCoinFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44879v0.m99282a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44879v0, Unit>() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44879v0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44879v0 c44879v0) {
            invoke(c44879v0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18582V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(SearchCoinFragment.m18948L3(this.f18645b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18583W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SearchCoinFragment.m18962l4(this.f18604b));
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f18586Z = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m18968p4(this.f18607b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f18587a0 = "";

    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$a */
    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/assets/search/depositandwithdraw/SearchCoinFragment$initHeaderSelectionUI$groupListener$1", "Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;", "getGroupView", "Landroid/view/View;", ViewProps.POSITION, "", "getGroupName", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10840a implements InterfaceC42501b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f18589b;

        public C10840a(boolean z11) {
            this.f18589b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p453mb.InterfaceC42501b
        /* JADX INFO: renamed from: a */
        public String mo19003a(int i11) {
            CoinInfoEntity coinEntity;
            String currency;
            SearchCoinEntity searchCoinEntity = (SearchCoinEntity) SearchCoinFragment.this.m18987P3().getItem(i11);
            if (searchCoinEntity == null || (coinEntity = searchCoinEntity.getCoinEntity()) == null || (currency = coinEntity.getCurrency()) == null) {
                return null;
            }
            String strValueOf = String.valueOf(StringsKt.first(currency));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                return upperCase.toString();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p453mb.InterfaceC42501b
        /* JADX INFO: renamed from: b */
        public View mo19004b(int i11) {
            CoinInfoEntity coinEntity;
            String currency;
            String string = null;
            View viewInflate = LayoutInflater.from(SearchCoinFragment.this.requireContext()).inflate(R$layout.kucoin_view_sticky_header, (ViewGroup) null, true);
            SearchCoinFragment searchCoinFragment = SearchCoinFragment.this;
            boolean z11 = this.f18589b;
            TextView textView = (TextView) viewInflate.findViewById(R$id.f16366tv);
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = z11 ? 5 : 3;
                }
                SearchCoinEntity searchCoinEntity = (SearchCoinEntity) searchCoinFragment.m18987P3().getItem(i11);
                if (searchCoinEntity != null && (coinEntity = searchCoinEntity.getCoinEntity()) != null && (currency = coinEntity.getCurrency()) != null) {
                    String strValueOf = String.valueOf(StringsKt.first(currency));
                    Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (upperCase != null) {
                        string = upperCase.toString();
                    }
                }
                textView.setText(string);
            }
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$b */
    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/assets/search/depositandwithdraw/SearchCoinFragment$listenSideBar$1", "Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;", "onIndexChange", "", "index", "", "text", "", "onMotionEventEnd", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10841b implements IndexBar.InterfaceC15757a {
        public C10841b() {
        }

        @Override // com.kubi.kucoin.view.IndexBar.InterfaceC15757a
        /* JADX INFO: renamed from: a */
        public void mo19005a(int i11, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            C44128b.m97259c("new_search", "onIndexChange:" + text);
            if (text.length() == 0) {
                return;
            }
            SearchCoinFragment searchCoinFragment = SearchCoinFragment.this;
            searchCoinFragment.sendIntent(new SearchCoinContract$UiIntent.GetPositionForSection(searchCoinFragment.m18987P3().getData(), text));
        }

        @Override // com.kubi.kucoin.view.IndexBar.InterfaceC15757a
        /* JADX INFO: renamed from: b */
        public void mo19006b() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$bindState$2 */
    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/CoinInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$bindState$2", m90122f = "SearchCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C108432 extends SuspendLambda implements Function2<CoinInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CoinInfoEntity coinInfoEntity, Continuation<? super Unit> continuation) {
            return ((C108432) create(coinInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C108432(Continuation<? super C108432> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C108432 c108432 = SearchCoinFragment.this.new C108432(continuation);
            c108432.L$0 = obj;
            return c108432;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SearchCoinFragment.m18955Y3(SearchCoinFragment.this, coinInfoEntity, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$bindState$4 */
    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/SearchCoinEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$bindState$4", m90122f = "SearchCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C108454 extends SuspendLambda implements Function2<List<? extends SearchCoinEntity>, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SearchCoinEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SearchCoinEntity>) list, continuation);
        }

        public C108454(Continuation<? super C108454> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchCoinFragment.this.new C108454(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SearchCoinEntity> list, Continuation<? super Unit> continuation) {
            return ((C108454) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SearchCoinFragment.this.m18988Q3();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$bindState$6 */
    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.SearchCoinFragment$bindState$6", m90122f = "SearchCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C108476 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C108476) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C108476(Continuation<? super C108476> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C108476 c108476 = SearchCoinFragment.this.new C108476(continuation);
            c108476.I$0 = ((Number) obj).intValue();
            return c108476;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            int i11 = this.I$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (i11 != -1) {
                C44879v0 c44879v0M18984M3 = SearchCoinFragment.this.m18984M3();
                RecyclerView.LayoutManager layoutManager = (c44879v0M18984M3 == null || (recyclerView = c44879v0M18984M3.f100984b) == null) ? null : recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i11 + 1, 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static final String m18949R3(SearchCoinEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CoinInfoEntity coinEntity = it.getCoinEntity();
        return C27041f.m66668h(coinEntity != null ? coinEntity.getCurrency() : null);
    }

    /* JADX INFO: renamed from: S3 */
    public static final String m18950S3(SearchCoinEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CoinInfoEntity coinEntity = it.getCoinEntity();
        return C27041f.m66668h(coinEntity != null ? coinEntity.getName() : null);
    }

    /* JADX INFO: renamed from: T3 */
    public static final BigDecimal m18951T3(SearchCoinEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* JADX INFO: renamed from: U3 */
    public static final String m18952U3(SearchCoinEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CoinInfoEntity coinEntity = it.getCoinEntity();
        return C27041f.m66668h(coinEntity != null ? coinEntity.getCurrency() : null);
    }

    /* JADX INFO: renamed from: V3 */
    public static final String m18953V3(SearchCoinEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CoinInfoEntity coinEntity = it.getCoinEntity();
        return C27041f.m66668h(coinEntity != null ? coinEntity.getName() : null);
    }

    /* JADX INFO: renamed from: W3 */
    public static final BigDecimal m18954W3(SearchCoinEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m18955Y3(SearchCoinFragment searchCoinFragment, CoinInfoEntity coinInfoEntity, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "allDepositCoinList";
        }
        searchCoinFragment.m18989X3(coinInfoEntity, str);
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m18956e4(Ref.BooleanRef booleanRef, SearchCoinFragment searchCoinFragment, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        if (booleanRef.element) {
            String string = charSequence.toString();
            int length = string.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.compare((int) string.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            searchCoinFragment.m18999u4(string.subSequence(i11, length + 1).toString());
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m18958g4(Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        C44128b.m97263g("SearchCoinFragment", e11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m18960i4(SearchCoinFragment searchCoinFragment) {
        C43852m.m96591c("B1deposit", "cancel", "1", null, 8, null);
        if (!searchCoinFragment.m18982J3()) {
            searchCoinFragment.preformBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m18961j4(View view, boolean z11) {
        if (z11) {
            C43852m.m96591c("B1deposit", "searchButton", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final SearchCoinListAdapter m18968p4(final SearchCoinFragment searchCoinFragment) {
        final SearchCoinListAdapter searchCoinListAdapter = new SearchCoinListAdapter(searchCoinFragment.m18986O3(), null, new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchCoinFragment.m18970q4(this.f18638b);
            }
        }, new Function2() { // from class: com.kubi.assets.search.depositandwithdraw.r
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SearchCoinFragment.m18972r4(this.f18642b, (CoinInfoEntity) obj, (String) obj2);
            }
        }, 2, null);
        searchCoinListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.search.depositandwithdraw.s
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchCoinFragment.m18974s4(searchCoinListAdapter, searchCoinFragment, baseQuickAdapter, view, i11);
            }
        });
        return searchCoinListAdapter;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m18970q4(SearchCoinFragment searchCoinFragment) {
        searchCoinFragment.sendIntent(SearchCoinContract$UiIntent.RemoveHistoryList.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m18972r4(SearchCoinFragment searchCoinFragment, CoinInfoEntity coinInfoEntity, String blockid) {
        Intrinsics.checkNotNullParameter(coinInfoEntity, "coinInfoEntity");
        Intrinsics.checkNotNullParameter(blockid, "blockid");
        searchCoinFragment.m18989X3(coinInfoEntity, blockid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final boolean m18983K3() {
        Object objM103844constructorimpl;
        Unit unit;
        if (!SearchCoinVM.f18597Z.getSEARCH_MODE()) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                KeyboardUtils.m6033e(activity);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "hideSoftInput", false, null, 8, null), null, 2, null);
        }
        sendIntent(new SearchCoinContract$UiIntent.StartSearchMode(false));
        return true;
    }

    /* JADX INFO: renamed from: M3 */
    public final C44879v0 m18984M3() {
        return (C44879v0) this.f18581U.getValue(this, f18580c0[0]);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m18985N3() {
        sendIntent(SearchCoinContract$UiIntent.GetCacheData.INSTANCE);
    }

    /* JADX INFO: renamed from: O3 */
    public final int m18986O3() {
        return ((Number) this.f18582V.getValue()).intValue();
    }

    /* JADX INFO: renamed from: P3 */
    public final SearchCoinListAdapter m18987P3() {
        return (SearchCoinListAdapter) this.f18586Z.getValue();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m18989X3(CoinInfoEntity coinInfoEntity, String str) {
        CoinInfoEntity coinInfoEntity2;
        if (coinInfoEntity != null) {
            String pageId = getF34288V();
            if (pageId == null) {
                pageId = "B1withdrawCoinList";
            }
            C43852m.m96590b(pageId, str, "1", TuplesKt.m90091to("after_page_id", "B1depositpage"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("coin", C27041f.m66668h(coinInfoEntity.getCurrency())));
            String pageId2 = getF34288V();
            String strM96601m = C43852m.m96601m(pageId2 != null ? pageId2 : "B1withdrawCoinList", str, "1");
            Bundle arguments = getArguments();
            String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "page") : null;
            if (strM56284y == null || strM56284y.length() == 0) {
                coinInfoEntity2 = coinInfoEntity;
                Intent intent = new Intent();
                intent.putExtra("type", 1);
                intent.putExtra(CoinInfoEntity.class.getName(), coinInfoEntity2);
                intent.putExtra("spm", strM96601m);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
            } else {
                Context context = getContext();
                if (context == null) {
                    coinInfoEntity2 = coinInfoEntity;
                } else if (AssetRemoteConfig.f18903a.m19577t()) {
                    AssetsHelper assetsHelper = AssetsHelper.f18684a;
                    String code = coinInfoEntity.getCode();
                    Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                    Bundle arguments2 = getArguments();
                    assetsHelper.m19172q(code, C27041f.m66668h(arguments2 != null ? RouteExKt.m56284y(arguments2, "address") : null), strM96601m);
                    coinInfoEntity2 = coinInfoEntity;
                } else {
                    WithdrawFragment.Companion companion = WithdrawFragment.a0;
                    String code2 = coinInfoEntity.getCode();
                    Intrinsics.checkNotNullExpressionValue(code2, "getCode(...)");
                    Bundle arguments3 = getArguments();
                    String strM56284y2 = arguments3 != null ? RouteExKt.m56284y(arguments3, "address") : null;
                    Bundle arguments4 = getArguments();
                    coinInfoEntity2 = coinInfoEntity;
                    companion.startWithdrawFragment(context, code2, strM56284y2, arguments4 != null ? RouteExKt.m56284y(arguments4, "platFrom") : null, strM96601m, coinInfoEntity2);
                }
            }
            String currency = coinInfoEntity2.getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
            sendIntent(new SearchCoinContract$UiIntent.AddHistoryIntent(currency));
            preformBackPressed();
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m18993c4(boolean z11) {
        if (this.f18585Y == null) {
            View view = getView();
            this.f18585Y = StickyDecoration.Builder.f19157b.init(new C10840a(view != null ? AssetExKt.m15128p(view) : false)).m20055b(C5275i0.m6236a(27.0f)).getF19158a();
        }
        C44879v0 c44879v0M18984M3 = m18984M3();
        if (c44879v0M18984M3 != null) {
            if (c44879v0M18984M3.f100984b.getItemDecorationCount() > 0) {
                c44879v0M18984M3.f100984b.removeItemDecorationAt(0);
            }
            if (z11) {
                RecyclerView recyclerView = c44879v0M18984M3.f100984b;
                RecyclerView.ItemDecoration itemDecoration = this.f18585Y;
                if (itemDecoration == null) {
                    return;
                }
                recyclerView.addItemDecoration(itemDecoration);
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        IndexBar indexBar;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C10855c) {
            m18987P3().notifyDataSetChanged();
        }
        if (singleEvent instanceof C10853b) {
            C10853b c10853b = (C10853b) singleEvent;
            C44879v0 c44879v0M18984M3 = m18984M3();
            if (c44879v0M18984M3 == null || (indexBar = c44879v0M18984M3.f100986d) == null) {
                return;
            }
            indexBar.setSourceDataList(c10853b.m19064a());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_search_coin;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<SearchCoinVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SearchCoinVM.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m18995k4() {
        return ((Boolean) this.f18583W.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m18996m4() {
        ViewTreeObserverOnGlobalLayoutListenerC42150e viewTreeObserverOnGlobalLayoutListenerC42150e = new ViewTreeObserverOnGlobalLayoutListenerC42150e(getActivity());
        this.f18584X = viewTreeObserverOnGlobalLayoutListenerC42150e;
        viewTreeObserverOnGlobalLayoutListenerC42150e.m92494d(new ViewTreeObserverOnGlobalLayoutListenerC42150e.a() { // from class: com.kubi.assets.search.depositandwithdraw.j
            @Override // lb.ViewTreeObserverOnGlobalLayoutListenerC42150e.a
            /* JADX INFO: renamed from: a */
            public final void mo19065a(boolean z11, int i11) {
                SearchCoinFragment.m18965n4(this.f18628a, z11, i11);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final void m18999u4(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.mContext == null || !isResumed()) {
            return;
        }
        this.f18587a0 = key;
        sendIntent(new SearchCoinContract$UiIntent.SearchCoinIntent(key));
    }

    /* JADX INFO: renamed from: w4 */
    public final void m19001w4() {
        sendIntent(SearchCoinContract$UiIntent.GetHeaderIndexList.INSTANCE);
    }

    /* JADX INFO: renamed from: L3 */
    public static final int m18948L3(SearchCoinFragment searchCoinFragment) {
        Integer numValueOf;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("from", 0));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m18957f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m18959h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static final boolean m18962l4(SearchCoinFragment searchCoinFragment) {
        Boolean boolValueOf;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m18965n4(SearchCoinFragment searchCoinFragment, boolean z11, int i11) {
        IndexBar indexBar;
        if (searchCoinFragment.isShowing()) {
            if (z11) {
                searchCoinFragment.m19002x4();
            }
            C44879v0 c44879v0M18984M3 = searchCoinFragment.m18984M3();
            if (c44879v0M18984M3 != null && (indexBar = c44879v0M18984M3.f100986d) != null) {
                indexBar.setVisibleByKeyBoardVisible(z11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public static final void m18974s4(SearchCoinListAdapter searchCoinListAdapter, SearchCoinFragment searchCoinFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String str;
        CoinInfoEntity coinEntity;
        Collection data = searchCoinListAdapter.getData();
        if (data != null && !data.isEmpty()) {
            List<T> data2 = searchCoinListAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
            SearchCoinEntity searchCoinEntity = (SearchCoinEntity) CollectionsKt.lastOrNull((List) data2);
            if (searchCoinEntity != null && searchCoinEntity.getType() == 3) {
                str = "myWithdrawAssets";
            } else {
                str = "allDepositCoinList";
            }
        } else {
            str = "allDepositCoinList";
        }
        SearchCoinEntity searchCoinEntity2 = (SearchCoinEntity) searchCoinListAdapter.getItem(i11);
        if (searchCoinEntity2 != null) {
            coinEntity = searchCoinEntity2.getCoinEntity();
        } else {
            coinEntity = null;
        }
        searchCoinFragment.m18989X3(coinEntity, str);
    }

    /* JADX INFO: renamed from: J3 */
    public final boolean m18982J3() {
        return m18983K3();
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m18988Q3() {
        int action = getState().getAction();
        List<SearchCoinEntity> listM83009d = null;
        boolean z11 = false;
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (getState().getNeedHeader() && this.f18587a0.length() == 0) {
                z11 = true;
            }
            m18993c4(z11);
            List<SearchCoinEntity> coinList = getState().getCoinList();
            if (coinList != null) {
                listM83009d = C37084b.m83009d(coinList, this.f18587a0, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m18952U3((SearchCoinEntity) obj);
                    }
                }, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.x
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m18953V3((SearchCoinEntity) obj);
                    }
                }, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.y
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m18954W3((SearchCoinEntity) obj);
                    }
                });
            }
            m18998t4(listM83009d, this.f18587a0);
            if (getState().getType() == 2 && this.f18587a0.length() == 0) {
                m19001w4();
                return;
            } else {
                m18991a4();
                return;
            }
        }
        if (getState().getNeedHeader() && this.f18587a0.length() == 0) {
            z11 = true;
        }
        m18993c4(z11);
        List<SearchCoinEntity> coinList2 = getState().getCoinList();
        if (coinList2 != null) {
            listM83009d = C37084b.m83009d(coinList2, this.f18587a0, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinFragment.m18949R3((SearchCoinEntity) obj);
                }
            }, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinFragment.m18950S3((SearchCoinEntity) obj);
                }
            }, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinFragment.m18951T3((SearchCoinEntity) obj);
                }
            });
        }
        m18998t4(listM83009d, this.f18587a0);
        if (getState().getNeedHeader() && getState().getWithdrawCoinListEmpty() && this.f18587a0.length() == 0) {
            m19001w4();
        } else {
            m18991a4();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m18990Z3() {
        Boolean boolValueOf;
        String str;
        String strM56285z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56252i(arguments, "from_include_page", false));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.areEqual(Boolean.TRUE, boolValueOf)) {
            Bundle arguments2 = getArguments();
            String str2 = "";
            if (arguments2 != null && (strM56285z = RouteExKt.m56285z(arguments2, "spm", "")) != null) {
                str2 = strM56285z;
            }
            String pageId = getF34288V();
            if (pageId != null) {
                Pair pairM90091to = TuplesKt.m90091to("pre_spm_id", str2);
                Pair pairM90091to2 = TuplesKt.m90091to("norm_version", "1");
                if (m18986O3() == 1) {
                    str = "DEPOSIT";
                } else {
                    str = "WITHDRAW";
                }
                C43852m.m96594f(pageId, "page", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("trade_type", str));
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m18991a4() {
        IndexBar indexBar;
        IndexBar indexBar2;
        C44879v0 c44879v0M18984M3 = m18984M3();
        if (c44879v0M18984M3 != null && (indexBar2 = c44879v0M18984M3.f100986d) != null) {
            indexBar2.setSourceDataList(null);
        }
        C44879v0 c44879v0M18984M4 = m18984M3();
        if (c44879v0M18984M4 != null && (indexBar = c44879v0M18984M4.f100986d) != null) {
            C27046k.m66700o(indexBar);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m18992b4() {
        RecyclerView recyclerView;
        m18987P3().setHasStableIds(true);
        C44879v0 c44879v0M18984M3 = m18984M3();
        if (c44879v0M18984M3 != null && (recyclerView = c44879v0M18984M3.f100984b) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAdapter(m18987P3());
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCoinInfoEntity();
            }
        }, new C108432(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCoinList();
            }
        }, new C108454(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((UIState) obj).getPosition());
            }
        }, new C108476(null));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m18994d4() {
        C44779h2 c44779h2;
        BaseTextView baseTextView;
        C44779h2 c44779h3;
        ClearEditText clearEditText;
        C44779h2 c44779h4;
        LinearLayout root;
        C44779h2 c44779h5;
        ClearEditText clearEditText2;
        C44779h2 c44779h6;
        LinearLayout root2;
        if (m18995k4()) {
            C44879v0 c44879v0M18984M3 = m18984M3();
            if (c44879v0M18984M3 != null && (c44779h6 = c44879v0M18984M3.f100985c) != null && (root2 = c44779h6.getRoot()) != null) {
                C27046k.m66700o(root2);
            }
        } else {
            HideIMEUtil.f19152a.m20049b(this);
            C44879v0 c44879v0M18984M4 = m18984M3();
            if (c44879v0M18984M4 != null && (c44779h4 = c44879v0M18984M4.f100985c) != null && (root = c44779h4.getRoot()) != null) {
                C27046k.m66685H(root);
            }
            C44879v0 c44879v0M18984M5 = m18984M3();
            if (c44879v0M18984M5 != null && (c44779h3 = c44879v0M18984M5.f100985c) != null && (clearEditText = c44779h3.f100024b) != null) {
                clearEditText.setHint(R$string.search_coin);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
                final Function1 function1 = new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m18956e4(booleanRef, this, (CharSequence) obj);
                    }
                };
                Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.assets.search.depositandwithdraw.l
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SearchCoinFragment.m18957f4(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m18958g4((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.search.depositandwithdraw.n
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SearchCoinFragment.m18959h4(function2, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                CompositeDisposable compositeDisposable = getCompositeDisposable();
                Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
                DisposableKt.addTo(disposableSubscribe, compositeDisposable);
            }
            C44879v0 c44879v0M18984M6 = m18984M3();
            if (c44879v0M18984M6 != null && (c44779h2 = c44879v0M18984M6.f100985c) != null && (baseTextView = c44779h2.f100025c) != null) {
                C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchCoinFragment.m18960i4(this.f18637b);
                    }
                }, 1, null);
            }
        }
        C44879v0 c44879v0M18984M7 = m18984M3();
        if (c44879v0M18984M7 != null && (c44779h5 = c44879v0M18984M7.f100985c) != null && (clearEditText2 = c44779h5.f100024b) != null) {
            clearEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.assets.search.depositandwithdraw.p
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    SearchCoinFragment.m18961j4(view, z11);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        super.getViewModeFactory();
        return new NewSearchCoinViewModeFactory(m18986O3());
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        m19000v4();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
        m18994d4();
        m18992b4();
        m18985N3();
        m18997o4();
        m18996m4();
        m18990Z3();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m18997o4() {
        IndexBar indexBar;
        C44879v0 c44879v0M18984M3 = m18984M3();
        if (c44879v0M18984M3 != null && (indexBar = c44879v0M18984M3.f100986d) != null) {
            indexBar.setOnIndexPressListener(new C10841b());
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ViewTreeObserverOnGlobalLayoutListenerC42150e viewTreeObserverOnGlobalLayoutListenerC42150e = this.f18584X;
        if (viewTreeObserverOnGlobalLayoutListenerC42150e != null) {
            viewTreeObserverOnGlobalLayoutListenerC42150e.m92492b();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final void m18998t4(List<SearchCoinEntity> list, String str) {
        List<SearchCoinEntity> listEmptyList;
        C44879v0 c44879v0M18984M3;
        RecyclerView recyclerView;
        SearchCoinListAdapter searchCoinListAdapterM18987P3 = m18987P3();
        if (list != null) {
            listEmptyList = list;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        searchCoinListAdapterM18987P3.m19023w(listEmptyList, str);
        if (!StringsKt.isBlank(str) && (c44879v0M18984M3 = m18984M3()) != null && (recyclerView = c44879v0M18984M3.f100984b) != null) {
            recyclerView.scrollToPosition(0);
        }
        if (m18987P3().getItemCount() == 0) {
            showEmpty();
        } else {
            showContentView();
        }
        String str2 = "";
        if (list != null && !list.isEmpty()) {
            if (m18986O3() == 1) {
                str2 = "B1depositCoinList_choose_coin_load";
            } else if (m18986O3() == 2) {
                str2 = "B1withdrawCoinList_choose_coin_load";
            }
            C43841b.m96557d(str2, "page_load_end", null, 4, null);
            return;
        }
        if (m18986O3() == 1) {
            str2 = "B1depositCoinList_choose_coin_load";
        } else if (m18986O3() == 2) {
            str2 = "B1withdrawCoinList_choose_coin_load";
        }
        C43841b.m96555b(str2, null, 2, null);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m19000v4() {
        String str;
        if (m18986O3() == 1) {
            str = "B1depositCoinList";
        } else {
            str = "B1withdrawCoinList";
        }
        setPageId(str);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m19002x4() {
        Collection data = m18987P3().getData();
        if (data != null && !data.isEmpty()) {
            List<T> data2 = m18987P3().getData();
            Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
            SearchCoinEntity searchCoinEntity = (SearchCoinEntity) CollectionsKt.lastOrNull((List) data2);
            if (searchCoinEntity != null && searchCoinEntity.getType() == 3) {
                sendIntent(new SearchCoinContract$UiIntent.StartSearchMode(true));
            }
        }
    }
}
