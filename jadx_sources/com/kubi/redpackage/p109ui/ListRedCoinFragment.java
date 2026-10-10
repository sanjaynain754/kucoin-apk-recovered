package com.kubi.redpackage.p109ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$drawable;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$mipmap;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.entity.CurrenciesConfig;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p675uv.C45315a;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListRedCoinFragment.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J(\u0010&\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0015j\b\u0012\u0004\u0012\u00020\b`\u00162\b\u0010(\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0015j\b\u0012\u0004\u0012\u00020\b`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR\u0010\u0010%\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/redpackage/ui/ListRedCoinFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/redpackage/databinding/BredpackageActivityChooseCoinBinding;", "mAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/redpackage/entity/CurrenciesConfig;", "Lio/chad/library/adapter/base/BaseViewHolder;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "callBack", "Lio/reactivex/functions/Consumer;", "getCallBack", "()Lio/reactivex/functions/Consumer;", "setCallBack", "(Lio/reactivex/functions/Consumer;)V", "isTrade", "", "()Z", "isTrade$delegate", "Lkotlin/Lazy;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "currentConfig", "setList", "data", "coinConfig", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ListRedCoinFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @Nullable
    public C45315a f43150U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public BaseQuickAdapter<CurrenciesConfig, BaseViewHolder> f43151V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public WrapperLoadingView f43152W;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public Consumer<CurrenciesConfig> f43154Y;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public CurrenciesConfig f43156a0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ArrayList<CurrenciesConfig> f43153X = new ArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f43155Z = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ListRedCoinFragment.m53765o3(this.f43205b));
        }
    });

    /* JADX INFO: renamed from: com.kubi.redpackage.ui.ListRedCoinFragment$onViewCreated$2 */
    /* JADX INFO: compiled from: ListRedCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/redpackage/ui/ListRedCoinFragment$onViewCreated$2", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/redpackage/entity/CurrenciesConfig;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C227322 extends BaseQuickAdapter<CurrenciesConfig, BaseViewHolder> {
        public C227322(int i11, ArrayList<CurrenciesConfig> arrayList) {
            super(i11, arrayList);
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder helper, final CurrenciesConfig item) {
            int i11;
            String strM85570i;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            BigDecimal tradeCurrencyBalance = ListRedCoinFragment.this.m53764n3() ? item.getTradeCurrencyBalance() : item.getMainCurrencyBalance();
            boolean z11 = tradeCurrencyBalance == null || tradeCurrencyBalance.doubleValue() == 0.0d;
            helper.itemView.setEnabled(!z11);
            int i12 = R$id.tv_coin_name;
            helper.setTextColor(i12, ListRedCoinFragment.this.getColorRes(z11 ? R$color.c_text20 : R$color.c_text));
            int i13 = R$id.tv_balance;
            helper.setTextColor(i13, ListRedCoinFragment.this.getColorRes(z11 ? R$color.c_text20 : R$color.c_text));
            if (tradeCurrencyBalance != null) {
                i11 = i13;
                strM85570i = C37885i.m85570i(tradeCurrencyBalance, item.getCurrencyCode(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null);
            } else {
                i11 = i13;
                strM85570i = null;
            }
            helper.setText(i11, C27041f.m66669i(strM85570i, "- -"));
            helper.setText(i12, item.getCurrencyName());
            int i14 = R$id.image;
            String currencyCode = item.getCurrencyCode();
            CurrenciesConfig currenciesConfig = ListRedCoinFragment.this.f43156a0;
            helper.setVisible(i14, Intrinsics.areEqual(currencyCode, currenciesConfig != null ? currenciesConfig.getCurrencyCode() : null));
            View view = helper.itemView;
            String currencyCode2 = item.getCurrencyCode();
            CurrenciesConfig currenciesConfig2 = ListRedCoinFragment.this.f43156a0;
            view.setSelected(Intrinsics.areEqual(currencyCode2, currenciesConfig2 != null ? currenciesConfig2.getCurrencyCode() : null));
            ImageView imageView = (ImageView) helper.getView(R$id.iv_icon);
            C46338a.m102151a(imageView.getContext()).mo6634v(item.getCurrencyAvatar()).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(imageView);
            View view2 = helper.itemView;
            final ListRedCoinFragment listRedCoinFragment = ListRedCoinFragment.this;
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.redpackage.ui.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) throws Exception {
                    ListRedCoinFragment.C227322.m53770i(listRedCoinFragment, item, view3);
                }
            });
        }

        /* JADX INFO: renamed from: i */
        public static final void m53770i(ListRedCoinFragment listRedCoinFragment, CurrenciesConfig currenciesConfig, View view) throws Exception {
            Consumer<CurrenciesConfig> consumerM53766m3;
            if (!C27014a1.m66501a(view) && (consumerM53766m3 = listRedCoinFragment.m53766m3()) != null) {
                consumerM53766m3.accept(currenciesConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public final boolean m53764n3() {
        return ((Boolean) this.f43155Z.getValue()).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public final Consumer<CurrenciesConfig> m53766m3() {
        return this.f43154Y;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bredpackage_activity_choose_coin, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView recyclerView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45315a c45315aM100184a = C45315a.m100184a(view.findViewById(R$id.m_swipe_recycler_view));
        this.f43150U = c45315aM100184a;
        if (c45315aM100184a != null && (swipeRefreshRecyclerView2 = c45315aM100184a.f101880b) != null) {
            swipeRefreshRecyclerView2.setEnabled(false);
            this.f43152W = WrapperLoadingView.injectView(swipeRefreshRecyclerView2);
        }
        C227322 c227322 = new C227322(R$layout.bredpackage_item_coin_list, this.f43153X);
        this.f43151V = c227322;
        c227322.setHasStableIds(true);
        C45315a c45315a = this.f43150U;
        if (c45315a == null || (swipeRefreshRecyclerView = c45315a.f101880b) == null || (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAdapter(this.f43151V);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m53767p3(@Nullable Consumer<CurrenciesConfig> consumer) {
        this.f43154Y = consumer;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m53768q3(@NotNull ArrayList<CurrenciesConfig> data, @Nullable CurrenciesConfig currenciesConfig) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43156a0 = currenciesConfig;
        this.f43153X.clear();
        this.f43153X.addAll(data);
        BaseQuickAdapter<CurrenciesConfig, BaseViewHolder> baseQuickAdapter = this.f43151V;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.notifyDataSetChanged();
        }
        ArrayList<CurrenciesConfig> arrayList = this.f43153X;
        if (arrayList == null || arrayList.isEmpty()) {
            WrapperLoadingView wrapperLoadingView = this.f43152W;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
                return;
            }
            return;
        }
        WrapperLoadingView wrapperLoadingView2 = this.f43152W;
        if (wrapperLoadingView2 != null) {
            wrapperLoadingView2.showContent();
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final boolean m53765o3(ListRedCoinFragment listRedCoinFragment) {
        Boolean boolValueOf;
        Bundle arguments = listRedCoinFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isTrade"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }
}
