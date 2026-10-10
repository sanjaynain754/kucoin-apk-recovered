package com.kubi.kumex.market;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.market.IMarketService;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.helper.C16108t;
import com.kubi.kumex.market.tradingArea.ContractDrawerFragment;
import com.kubi.kumex.record.CommonHeadObject;
import com.kubi.kumex.utils.Selector;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.C24346y;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36755e3;
import h30.C38104b;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p236em.C37214b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: RecommendFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0002J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150-H\u0002J\u0010\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020%H\u0002J\b\u00102\u001a\u00020%H\u0002J\b\u00103\u001a\u00020%H\u0002J\u0014\u00104\u001a\u00020%*\u00020\u001d2\u0006\u00105\u001a\u000200H\u0002J\u001e\u00106\u001a\u00020%*\u0002072\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0002J\b\u00109\u001a\u00020\u000eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a¨\u0006;"}, m90084d2 = {"Lcom/kubi/kumex/market/RecommendFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bkumexFragmentRecommendBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentRecommendBinding;", "getBkumexFragmentRecommendBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentRecommendBinding;", "bkumexFragmentRecommendBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "init", "Ljava/util/concurrent/atomic/AtomicBoolean;", "selector", "Lcom/kubi/kumex/utils/Selector;", "", "getSelector", "()Lcom/kubi/kumex/utils/Selector;", "selector$delegate", "Lkotlin/Lazy;", "quotes", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "Lkotlin/collections/ArrayList;", "fromQuotes", "", "getFromQuotes", "()Z", "fromQuotes$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "subscribe", "toDisplayList", "", "", "quotesList", "", "notifyHeightForHome", "listItemCount", "", "initListener", "initObserver", "showOrHide", "setLayoutHeight", "height", "refresh", "Landroid/widget/TextView;", "data", "getParentPageId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/RecommendFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TradeBaseEx.kt\ncom/kubi/tradebase/TradeBaseExKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,466:1\n147#2,16:467\n1869#3,2:483\n1788#3,4:485\n63#4,7:489\n63#4,7:497\n347#5:496\n*S KotlinDebug\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/RecommendFragment\n*L\n61#1:467,16\n106#1:483,2\n122#1:485,4\n129#1:489,7\n194#1:497,7\n190#1:496\n*E\n"})
public class RecommendFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29404U = C45681e.m100799e(this, new Function1<RecommendFragment, C36755e3>() { // from class: com.kubi.kumex.market.RecommendFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36755e3 invoke(@NotNull RecommendFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36755e3.m82361a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36755e3, Unit>() { // from class: com.kubi.kumex.market.RecommendFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36755e3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36755e3 c36755e3) {
            invoke(c36755e3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final AtomicBoolean f29405V = new AtomicBoolean(false);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29406W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendFragment.m34340T3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ArrayList<QuotesEntity> f29407X = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29408Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(RecommendFragment.m34330F3(this.f29438b));
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f29403a0 = {Reflection.property1(new PropertyReference1Impl(RecommendFragment.class, "bkumexFragmentRecommendBinding", "getBkumexFragmentRecommendBinding()Lcom/kubi/kumex/databinding/BkumexFragmentRecommendBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f29402Z = new Companion(null);

    /* JADX INFO: compiled from: RecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/market/RecommendFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/market/RecommendFragment;", "isQuotes", "", "positionType", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ RecommendFragment newInstance$default(Companion companion, boolean z11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.newInstance(z11, str);
        }

        @JvmStatic
        @NotNull
        public final RecommendFragment newInstance(boolean isQuotes, @Nullable String positionType) {
            RecommendFragment recommendFragment = new RecommendFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("data", isQuotes);
            bundle.putString("positionType", positionType);
            recommendFragment.setArguments(bundle);
            return recommendFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.RecommendFragment$a */
    /* JADX INFO: compiled from: RecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/market/RecommendFragment$initListener$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/market/RecommendObject;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16190a implements ItemCallBack<RecommendObject> {
        public C16190a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, RecommendObject data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            RecommendFragment.this.m34372J3().m36524c(C27041f.m66668h(data.getF29453b().getSymbol()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.RecommendFragment$b */
    /* JADX INFO: compiled from: RecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/market/RecommendFragment$initListener$2", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/market/ButtonObject;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16191b implements ItemCallBack<ButtonObject> {
        public C16191b() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, ButtonObject data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            C16108t.m34073r(RecommendFragment.this.m34372J3().m36522a(), null, 2, null);
            RecommendFragment.this.f29405V.compareAndSet(true, false);
            RecommendFragment.this.m34372J3().m36526e(CollectionsKt.emptyList());
            if (RecommendFragment.this.m34331I3().length() > 0) {
                C43852m.m96591c(RecommendFragment.this.m34331I3(), "ContractList", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.RecommendFragment$c */
    /* JADX INFO: compiled from: RecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/market/RecommendFragment$initListener$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16192c extends RecyclerView.OnScrollListener {
        public C16192c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecommendFragment.this.m34375V3();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.RecommendFragment$d */
    /* JADX INFO: compiled from: RecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/kumex/market/RecommendFragment$initListener$4$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", ViewProps.POSITION, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16193d extends GridLayoutManager.SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            try {
                C36755e3 c36755e3M34370G3 = RecommendFragment.this.m34370G3();
                RecyclerView.Adapter adapter = (c36755e3M34370G3 == null || (recyclerView2 = c36755e3M34370G3.f79958d) == null) ? null : recyclerView2.getAdapter();
                BaseAdapter baseAdapter = adapter instanceof BaseAdapter ? (BaseAdapter) adapter : null;
                return (baseAdapter != null ? baseAdapter.getItem(position) : null) instanceof RecommendObject ? 1 : 2;
            } catch (Throwable th2) {
                C36755e3 c36755e3M34370G4 = RecommendFragment.this.m34370G3();
                RecyclerView.Adapter adapter2 = (c36755e3M34370G4 == null || (recyclerView = c36755e3M34370G4.f79958d) == null) ? null : recyclerView.getAdapter();
                BaseAdapter baseAdapter2 = adapter2 instanceof BaseAdapter ? (BaseAdapter) adapter2 : null;
                List data = baseAdapter2 != null ? baseAdapter2.getData() : null;
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("data is NUll: ");
                sb3.append(data == null);
                sb2.append(sb3.toString());
                if (data != null) {
                    if (data.size() <= position) {
                        sb2.append("data 角标越界");
                    } else if (data.get(position) == null) {
                        sb2.append("data 对应的position元素为null");
                    }
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                String message = th2.getMessage();
                if (message == null) {
                    message = "message is Null";
                }
                sb2.append(message);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                C37214b.m83257c(string, "RecommendFragment");
                return 1;
            }
        }

        public C16193d() {
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m34339R3(int i11, RecommendFragment recommendFragment) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.LayoutManager layoutManager;
        View childAt;
        RangesKt.coerceAtLeast((int) (((double) (i11 / 2.0f)) + 0.5d), 0);
        C27040e.m66658b(12);
        C27040e.m66658b(12);
        C36755e3 c36755e3M34370G3 = recommendFragment.m34370G3();
        Integer numValueOf = null;
        numValueOf = null;
        C27039d.m66650j((c36755e3M34370G3 == null || (recyclerView2 = c36755e3M34370G3.f79958d) == null || (layoutManager = recyclerView2.getLayoutManager()) == null || (childAt = layoutManager.getChildAt(0)) == null) ? null : Integer.valueOf(childAt.getMeasuredHeight()));
        C36755e3 c36755e3M34370G4 = recommendFragment.m34370G3();
        if (c36755e3M34370G4 != null && (recyclerView = c36755e3M34370G4.f79958d) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            numValueOf = Integer.valueOf(marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        C27039d.m66650j(numValueOf);
        C27040e.m66658b(40);
        C27040e.m66658b(12);
        C36755e3 c36755e3M34370G5 = recommendFragment.m34370G3();
        if (c36755e3M34370G5 == null || c36755e3M34370G5.f79958d == null) {
            return;
        }
        recommendFragment.getParentFragment();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m34373S3(TextView textView, List<Object> list) {
        Object objLastOrNull = list != null ? CollectionsKt.lastOrNull((List) list) : null;
        ButtonObject buttonObject = objLastOrNull instanceof ButtonObject ? (ButtonObject) objLastOrNull : null;
        if (buttonObject != null) {
            textView.setEnabled(buttonObject.getEnable());
            textView.setText(buttonObject.getContent());
        }
    }

    /* JADX INFO: renamed from: K3 */
    private final void m34332K3() {
        KcSecondaryButton kcSecondaryButton;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        KcSecondaryButton kcSecondaryButton4;
        KcSecondaryButton kcSecondaryButton5;
        C36755e3 c36755e3M34370G3;
        RecyclerView recyclerView;
        C36755e3 c36755e3M34370G4;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        RecyclerView recyclerView6;
        RecyclerView recyclerView7;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C36755e3 c36755e3M34370G5 = m34370G3();
        if (c36755e3M34370G5 != null && (recyclerView7 = c36755e3M34370G5.f79958d) != null) {
            recyclerView7.setAdapter(BaseAdapter.a.m57323c(BaseAdapter.a.m57323c(BaseAdapter.a.m57323c(new BaseAdapter.a(), CommonHeadObject.class, m34371H3() ? QuoteRecommendHeadObjectProxy.class : DrawerRecommendHeadObjectProxy.class, null, null, 12, null), RecommendObject.class, m34371H3() ? QuoteRecommendObjectProxy.class : DrawerRecommendObjectProxy.class, new C16190a(), null, 8, null), ButtonObject.class, m34371H3() ? QuotesButtonObjectProxy.class : DrawerButtonObjectProxy.class, new C16191b(), null, 8, null).m57324a());
        }
        C36755e3 c36755e3M34370G6 = m34370G3();
        if (c36755e3M34370G6 != null && (recyclerView6 = c36755e3M34370G6.f79958d) != null) {
            ViewExKt.m36476b(recyclerView6);
        }
        C36755e3 c36755e3M34370G7 = m34370G3();
        if (c36755e3M34370G7 != null && (recyclerView5 = c36755e3M34370G7.f79958d) != null) {
            recyclerView5.setOnScrollListener(new C16192c());
        }
        C36755e3 c36755e3M34370G8 = m34370G3();
        if (c36755e3M34370G8 != null && (recyclerView4 = c36755e3M34370G8.f79958d) != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
            gridLayoutManager.setSpanSizeLookup(new C16193d());
            recyclerView4.setLayoutManager(gridLayoutManager);
        }
        C36755e3 c36755e3M34370G9 = m34370G3();
        if (C27039d.m66650j((c36755e3M34370G9 == null || (recyclerView3 = c36755e3M34370G9.f79958d) == null) ? null : Integer.valueOf(recyclerView3.getItemDecorationCount())) <= 0 && (c36755e3M34370G4 = m34370G3()) != null && (recyclerView2 = c36755e3M34370G4.f79958d) != null) {
            recyclerView2.addItemDecoration(m34371H3() ? new QuotesRecommendDecoration(C38104b.m86030b(getArguments())) : new DrawerRecommendDecoration());
        }
        if (C38104b.m86030b(getArguments()) && (c36755e3M34370G3 = m34370G3()) != null && (recyclerView = c36755e3M34370G3.f79958d) != null) {
            ViewExtKt.m66585p(recyclerView, 0, C27040e.m66658b(12), 0, 0, 13, null);
        }
        if (m34371H3()) {
            C36755e3 c36755e3M34370G10 = m34370G3();
            if (c36755e3M34370G10 != null && (kcSecondaryButton5 = c36755e3M34370G10.f79956b) != null) {
                kcSecondaryButton5.setTextSize(16.0f);
            }
            C36755e3 c36755e3M34370G11 = m34370G3();
            if (c36755e3M34370G11 != null && (kcSecondaryButton4 = c36755e3M34370G11.f79956b) != null) {
                m34374U3(kcSecondaryButton4, (int) C27025c.m66565c(context, 44));
            }
        } else {
            C36755e3 c36755e3M34370G12 = m34370G3();
            if (c36755e3M34370G12 != null && (kcSecondaryButton2 = c36755e3M34370G12.f79956b) != null) {
                kcSecondaryButton2.setTextSize(14.0f);
            }
            C36755e3 c36755e3M34370G13 = m34370G3();
            if (c36755e3M34370G13 != null && (kcSecondaryButton = c36755e3M34370G13.f79956b) != null) {
                m34374U3(kcSecondaryButton, (int) C27025c.m66565c(context, 40));
            }
        }
        C36755e3 c36755e3M34370G14 = m34370G3();
        if (c36755e3M34370G14 != null && (kcSecondaryButton3 = c36755e3M34370G14.f79956b) != null) {
            C27046k.m66711z(kcSecondaryButton3, 0L, new Function0() { // from class: com.kubi.kumex.market.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendFragment.m34333L3(this.f29423b);
                }
            }, 1, null);
        }
        if (C38104b.m86030b(getArguments())) {
            C43852m.m96595g(HomeCardViewHolderProxy.PAGE_ID, "addfavorites", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static final CharSequence m34335N3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Selector m34340T3() {
        return new Selector();
    }

    /* JADX INFO: renamed from: W3 */
    private final void m34341W3() {
        Observable observableObserveOn = IMarketService.m24859o(RepositoryServiceLocator.f19236a.m20286e(), "recommend", null, 2, null).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m34348d4(this.f29440b, (List) obj);
            }
        };
        Observable map = observableObserveOn.map(new Function() { // from class: com.kubi.kumex.market.k0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RecommendFragment.m34349e4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m34350f4(this.f29443b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = map.doOnSubscribe(new Consumer() { // from class: com.kubi.kumex.market.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecommendFragment.m34351g4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m34342X3(this.f29448b, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecommendFragment.m34344Z3(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.market.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendFragment.m34345a4(this.f29450b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecommendFragment.m34347c4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: d4 */
    public static final List m34348d4(RecommendFragment recommendFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recommendFragment.f29407X.clear();
        recommendFragment.f29407X.addAll(it);
        if (recommendFragment.f29405V.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                arrayList.add(C27041f.m66668h(((QuotesEntity) it2.next()).getSymbol()));
            }
            recommendFragment.m34372J3().m36526e(arrayList);
        }
        return recommendFragment.m34352h4(it);
    }

    /* JADX INFO: renamed from: e4 */
    public static final List m34349e4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: h4 */
    private final List<Object> m34352h4(List<QuotesEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (!C38104b.m86030b(getArguments())) {
            arrayList.add(new CommonHeadObject(getStringRes(R$string.no_add_favorites_recommend_contract, new Object[0])));
        }
        for (QuotesEntity quotesEntity : list) {
            arrayList.add(new RecommendObject(m34372J3().m36523b(C27041f.m66668h(quotesEntity.getSymbol())), quotesEntity));
        }
        List<String> listM36522a = m34372J3().m36522a();
        arrayList.add(new ButtonObject(!(listM36522a == null || listM36522a.isEmpty()), getStringRes(R$string.market_add_self_choose, new Object[0]) + '(' + m34372J3().m36522a().size() + ')'));
        return arrayList;
    }

    /* JADX INFO: renamed from: G3 */
    public final C36755e3 m34370G3() {
        return (C36755e3) this.f29404U.getValue(this, f29403a0[0]);
    }

    /* JADX INFO: renamed from: H3 */
    public final boolean m34371H3() {
        return ((Boolean) this.f29408Y.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: J3 */
    public final Selector<String> m34372J3() {
        return (Selector) this.f29406W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_recommend, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m34332K3();
        m34336O3();
    }

    /* JADX INFO: renamed from: F3 */
    public static final boolean m34330F3(RecommendFragment recommendFragment) {
        Boolean boolValueOf;
        Bundle arguments = recommendFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public final String m34331I3() {
        if (getParentFragment() instanceof ContractDrawerFragment) {
            Fragment parentFragment = getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.ContractDrawerFragment");
            return ((ContractDrawerFragment) parentFragment).m34438R3();
        }
        return "";
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m34333L3(final RecommendFragment recommendFragment) {
        final List<String> listM36522a = recommendFragment.m34372J3().m36522a();
        C16108t.m34073r(listM36522a, null, 2, null);
        String strM34331I3 = recommendFragment.m34331I3();
        if (strM34331I3.length() > 0) {
            C43852m.m96591c(strM34331I3, "ContractList", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, null, 8, null);
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kumex.market.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendFragment.m34334M3(this.f29429b, listM36522a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m34334M3(RecommendFragment recommendFragment, List list) throws JSONException {
        if (C38104b.m86030b(recommendFragment.getArguments())) {
            String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.kubi.kumex.market.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendFragment.m34335N3((String) obj);
                }
            }, 30, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("labelId", strJoinToString$default);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "addfavorites", "1", jSONObject);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    private final void m34336O3() {
        m34372J3().m36525d(new Function0() { // from class: com.kubi.kumex.market.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendFragment.m34337P3(this.f29426b);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m34337P3(RecommendFragment recommendFragment) {
        RecyclerView recyclerView;
        C36755e3 c36755e3M34370G3 = recommendFragment.m34370G3();
        if (c36755e3M34370G3 != null && (recyclerView = c36755e3M34370G3.f79958d) != null) {
            C24346y.m59052b(recyclerView, recommendFragment.m34352h4(recommendFragment.f29407X));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m34338Q3(int i11) {
        RecyclerView recyclerView;
        if (C38104b.m86030b(getArguments())) {
            final int iCoerceAtLeast = RangesKt.coerceAtLeast(i11 - 1, 0);
            C36755e3 c36755e3M34370G3 = m34370G3();
            if (c36755e3M34370G3 != null && (recyclerView = c36755e3M34370G3.f79958d) != null) {
                C22912t.m54416n(recyclerView, new Runnable() { // from class: com.kubi.kumex.market.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecommendFragment.m34339R3(iCoerceAtLeast, this);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX INFO: renamed from: X3 */
    public static final Unit m34342X3(final RecommendFragment recommendFragment, List list) {
        C36755e3 c36755e3M34370G3;
        FrameLayout root;
        KcSecondaryButton kcSecondaryButton;
        RecyclerView recyclerView;
        FrameLayout root2;
        if (!list.isEmpty()) {
            Intrinsics.checkNotNull(list);
            int i11 = 0;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ((it.next() instanceof RecommendObject) && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i11 != 0) {
                C36755e3 c36755e3M34370G4 = recommendFragment.m34370G3();
                if (c36755e3M34370G4 != null && (root2 = c36755e3M34370G4.getRoot()) != null) {
                    C27046k.m66685H(root2);
                }
                recommendFragment.showContentView();
                C36755e3 c36755e3M34370G5 = recommendFragment.m34370G3();
                if (c36755e3M34370G5 != null && (recyclerView = c36755e3M34370G5.f79958d) != null) {
                    C24346y.m59052b(recyclerView, list);
                }
                C36755e3 c36755e3M34370G6 = recommendFragment.m34370G3();
                if (c36755e3M34370G6 != null && (kcSecondaryButton = c36755e3M34370G6.f79956b) != null) {
                    recommendFragment.m34373S3(kcSecondaryButton, list);
                }
                recommendFragment.m34338Q3(list.size());
                BaseFragment.runOnUiThread$default(recommendFragment, new Function0() { // from class: com.kubi.kumex.market.e0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecommendFragment.m34343Y3(this.f29428b);
                    }
                }, 200L, null, 4, null);
            } else {
                if (recommendFragment.m34371H3()) {
                    BaseFragment.showEmptyView$default(recommendFragment, R$string.fav_empty, 0, (View.OnClickListener) null, 6, (Object) null);
                } else {
                    c36755e3M34370G3 = recommendFragment.m34370G3();
                    if (c36755e3M34370G3 != null && (root = c36755e3M34370G3.getRoot()) != null) {
                        ViewExtKt.m66577h(root);
                    }
                    recommendFragment.showContentView();
                }
                if (recommendFragment.getView() != null) {
                    recommendFragment.getParentFragment();
                }
            }
        } else {
            if (recommendFragment.m34371H3()) {
                BaseFragment.showEmptyView$default(recommendFragment, R$string.fav_empty, 0, (View.OnClickListener) null, 6, (Object) null);
            } else {
                c36755e3M34370G3 = recommendFragment.m34370G3();
                if (c36755e3M34370G3 != null) {
                    ViewExtKt.m66577h(root);
                }
                recommendFragment.showContentView();
            }
            if (recommendFragment.getView() != null) {
                recommendFragment.getParentFragment();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m34343Y3(RecommendFragment recommendFragment) {
        recommendFragment.m34375V3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m34344Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m34345a4(final RecommendFragment recommendFragment, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        BaseFragment.showFailView$default(recommendFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.market.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecommendFragment.m34346b4(this.f29427b, view);
            }
        }, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m34346b4(RecommendFragment recommendFragment, View view) {
        recommendFragment.getVisibleDisposable().clear();
        recommendFragment.m34341W3();
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m34347c4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m34350f4(RecommendFragment recommendFragment, Disposable disposable) {
        C36755e3 c36755e3M34370G3;
        RecyclerView recyclerView;
        Integer viewStatus = recommendFragment.getViewStatus();
        if ((viewStatus == null || viewStatus.intValue() != 2) && (c36755e3M34370G3 = recommendFragment.m34370G3()) != null && (recyclerView = c36755e3M34370G3.f79958d) != null && C24346y.m59051a(recyclerView)) {
            BaseFragment.showLoadingView$default(recommendFragment, 0, 0, 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m34351g4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m34374U3(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m34375V3() {
        RecyclerView.Adapter adapter;
        BaseAdapter baseAdapter;
        RecyclerView.LayoutManager layoutManager;
        GridLayoutManager gridLayoutManager;
        C36755e3 c36755e3M34370G3;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C36755e3 c36755e3M34370G4 = m34370G3();
        Integer numValueOf = null;
        if (c36755e3M34370G4 != null && (recyclerView2 = c36755e3M34370G4.f79958d) != null) {
            adapter = recyclerView2.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof BaseAdapter) {
            baseAdapter = (BaseAdapter) adapter;
        } else {
            baseAdapter = null;
        }
        if (baseAdapter != null) {
            C36755e3 c36755e3M34370G5 = m34370G3();
            if (c36755e3M34370G5 != null && (recyclerView = c36755e3M34370G5.f79958d) != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof GridLayoutManager) {
                gridLayoutManager = (GridLayoutManager) layoutManager;
            } else {
                gridLayoutManager = null;
            }
            if (gridLayoutManager != null) {
                if (C38104b.m86030b(getArguments())) {
                    C36755e3 c36755e3M34370G6 = m34370G3();
                    if (c36755e3M34370G6 != null && (frameLayout2 = c36755e3M34370G6.f79957c) != null) {
                        C27046k.m66700o(frameLayout2);
                        return;
                    }
                    return;
                }
                int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
                if (iFindLastVisibleItemPosition < baseAdapter.getItemCount() - 1) {
                    C36755e3 c36755e3M34370G7 = m34370G3();
                    if (c36755e3M34370G7 != null && (frameLayout = c36755e3M34370G7.f79957c) != null) {
                        C27046k.m66685H(frameLayout);
                        return;
                    }
                    return;
                }
                View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
                if (viewFindViewByPosition != null && (c36755e3M34370G3 = m34370G3()) != null) {
                    int top = viewFindViewByPosition.getTop();
                    RecyclerView recyclerView3 = c36755e3M34370G3.f79958d;
                    if (recyclerView3 != null) {
                        numValueOf = Integer.valueOf(recyclerView3.getMeasuredHeight());
                    }
                    if (top < C27039d.m66650j(numValueOf) - c36755e3M34370G3.f79957c.getMeasuredHeight()) {
                        FrameLayout group = c36755e3M34370G3.f79957c;
                        Intrinsics.checkNotNullExpressionValue(group, "group");
                        C27046k.m66700o(group);
                    } else {
                        FrameLayout group2 = c36755e3M34370G3.f79957c;
                        Intrinsics.checkNotNullExpressionValue(group2, "group");
                        C27046k.m66685H(group2);
                    }
                }
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        Integer numValueOf;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        super.onShow();
        m34341W3();
        C36755e3 c36755e3M34370G3 = m34370G3();
        if (c36755e3M34370G3 != null && (recyclerView = c36755e3M34370G3.f79958d) != null && (adapter = recyclerView.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        if (iM66650j > 0) {
            m34338Q3(iM66650j);
        }
    }
}
