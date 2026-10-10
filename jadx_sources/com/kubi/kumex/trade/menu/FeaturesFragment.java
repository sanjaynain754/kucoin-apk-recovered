package com.kubi.kumex.trade.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.trade.C16893k3;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36784j2;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FeaturesFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/FeaturesFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesMoreFeaturesBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesMoreFeaturesBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFeaturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturesFragment.kt\ncom/kubi/kumex/trade/menu/FeaturesFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n147#2,16:123\n774#3:139\n865#3,2:140\n*S KotlinDebug\n*F\n+ 1 FeaturesFragment.kt\ncom/kubi/kumex/trade/menu/FeaturesFragment\n*L\n50#1:123,16\n74#1:139\n74#1:140,2\n*E\n"})
public final class FeaturesFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f30573U = C45681e.m100799e(this, new Function1<FeaturesFragment, C36784j2>() { // from class: com.kubi.kumex.trade.menu.FeaturesFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36784j2 invoke(@NotNull FeaturesFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36784j2.m82426a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36784j2, Unit>() { // from class: com.kubi.kumex.trade.menu.FeaturesFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36784j2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36784j2 c36784j2) {
            invoke(c36784j2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f30572W = {Reflection.property1(new PropertyReference1Impl(FeaturesFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesMoreFeaturesBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f30571V = new Companion(null);

    /* JADX INFO: compiled from: FeaturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/FeaturesFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/trade/menu/FeaturesFragment;", "menuItems", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/trade/menu/MenuItem;", "Lkotlin/collections/ArrayList;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FeaturesFragment newInstance(@NotNull ArrayList<MenuItem> menuItems) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            FeaturesFragment featuresFragment = new FeaturesFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("data", menuItems);
            featuresFragment.setArguments(bundle);
            return featuresFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.FeaturesFragment$onViewCreated$1 */
    /* JADX INFO: compiled from: FeaturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/trade/menu/FeaturesFragment$onViewCreated$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/kumex/trade/menu/MenuItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C169091 extends BaseQuickAdapter<MenuItem, BaseViewHolder> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ FeaturesFragment f30574i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C169091(List<MenuItem> list, FeaturesFragment featuresFragment, int i11) {
            super(i11, list);
            this.f30574i = featuresFragment;
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder helper, final MenuItem item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            View itemView = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            final FeaturesFragment featuresFragment = this.f30574i;
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.kumex.trade.menu.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FeaturesFragment.C169091.m36331i(featuresFragment, item);
                }
            }, 1, null);
            int i11 = R$id.tvLabel;
            View view = helper.getView(i11);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C24256n1.m58513c((TextView) view);
            BaseViewHolder text = helper.setText(i11, item.getText());
            int i12 = R$id.ivIcon;
            text.setImageResource(i12, item.getIcon()).setVisible(R$id.dot, item.getDot());
            Integer tint = item.getTint();
            if (tint != null) {
                int iIntValue = tint.intValue();
                ImageView imageView = (ImageView) helper.getView(i12);
                Intrinsics.checkNotNull(imageView);
                C27046k.m66701p(imageView, iIntValue);
            }
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m36331i(FeaturesFragment featuresFragment, MenuItem menuItem) {
            FuturesFragment futuresFragmentM36300a = C16893k3.m36300a(featuresFragment);
            if (futuresFragmentM36300a != null) {
                futuresFragmentM36300a.m36145H6(menuItem);
            }
            featuresFragment.getParentFragmentManager().setFragmentResult("key_dismiss_dialog", BundleKt.bundleOf());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final C36784j2 m36329j3() {
        return (C36784j2) this.f30573U.getValue(this, f30572W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_futures_more_features, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        Iterable parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "data", MenuItem.class);
        if (parcelableArrayList == null) {
            parcelableArrayList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : parcelableArrayList) {
            if (((MenuItem) obj).isShow()) {
                arrayList.add(obj);
            }
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        C36784j2 c36784j2M36329j3 = m36329j3();
        if (c36784j2M36329j3 != null && (recyclerView2 = c36784j2M36329j3.f80324b) != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        C36784j2 c36784j2M36329j4 = m36329j3();
        if (c36784j2M36329j4 != null && (recyclerView = c36784j2M36329j4.f80324b) != null) {
            recyclerView.setAdapter(new C169091(arrayList, this, R$layout.item_grid_menu_view));
        }
        if (BrokerConfig.f19211a.m20201d().mo20241r0()) {
            IUnifyAccountService.m64976j(IUnifyAccountService.f53155a.get(), (ViewGroup) view.findViewById(R$id.unifyLayoutContainer), SearchCategory$Companion.FUTURES, null, 4, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g(C17060n0.m36552b(), "Futures_Features", "1", null, 8, null);
    }
}
