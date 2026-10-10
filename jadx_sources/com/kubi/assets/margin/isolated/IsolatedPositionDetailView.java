package com.kubi.assets.margin.isolated;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p637ta.C44735b6;
import p838zo.C46897a;
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
import w00.C45682f;

/* JADX INFO: compiled from: IsolatedPositionDetailView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/IsolatedPositionDetailView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewIsolatedAssetsDetailPositionBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewIsolatedAssetsDetailPositionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/margin/api/entity/MarginPosition;", "IsolatedDetailAdapter", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nIsolatedPositionDetailView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedPositionDetailView.kt\ncom/kubi/assets/margin/isolated/IsolatedPositionDetailView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n41#2:175\n65#2:176\n80#2,7:177\n1#3:184\n*S KotlinDebug\n*F\n+ 1 IsolatedPositionDetailView.kt\ncom/kubi/assets/margin/isolated/IsolatedPositionDetailView\n*L\n40#1:175\n40#1:176\n40#1:177,7\n*E\n"})
public final class IsolatedPositionDetailView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18049c = {Reflection.property1(new PropertyReference1Impl(IsolatedPositionDetailView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewIsolatedAssetsDetailPositionBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18050b;

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.IsolatedPositionDetailView$a */
    /* JADX INFO: compiled from: IsolatedPositionDetailView.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/IsolatedPositionDetailView$IsolatedDetailAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Landroid/util/Pair;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "list", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10455a extends BaseQuickAdapter<Pair<String, String>, BaseViewHolder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10455a(@NotNull List<? extends Pair<String, String>> list) {
            super(R$layout.item_isolated_detail_view, list);
            Intrinsics.checkNotNullParameter(list, "list");
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void convert(@NotNull BaseViewHolder helper, @NotNull Pair<String, String> item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setText(R$id.tvLabel, (CharSequence) item.first).setText(R$id.tvValue, (CharSequence) item.second);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedPositionDetailView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18050b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44735b6>() { // from class: com.kubi.assets.margin.isolated.IsolatedPositionDetailView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44735b6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44735b6.m98980a(C45682f.m100801b(viewGroup));
            }
        });
        setOrientation(1);
        LayoutInflater.from(context).inflate(R$layout.view_isolated_assets_detail_position, this);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m17991d(OldBaseFragment oldBaseFragment) {
        AssetsDepend.f18689a.m19183d().mo37968x(oldBaseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m17992e(OldBaseFragment oldBaseFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(oldBaseFragment.getString(R$string.margin_dialog_profit_loss_tips_new)).m54163T4(oldBaseFragment.getString(R$string.i_know), null).m54172c5(oldBaseFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    private final C44735b6 getBinding() {
        return (C44735b6) this.f18050b.getValue(this, f18049c[0]);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public final void m17993c(@NotNull final OldBaseFragment fragment, @NotNull MarginPosition entity) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entity, "entity");
        C37890n c37890n = C37890n.f85269a;
        CurrencyBalance baseAsset = entity.getBaseAsset();
        String currency = baseAsset != null ? baseAsset.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        C44735b6 binding = getBinding();
        if (binding != null) {
            C24277v.m58540e(fragment.getContext(), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, binding.f99636b);
            CurrencyBalance quoteAsset = entity.getQuoteAsset();
            String currency2 = quoteAsset != null ? quoteAsset.getCurrency() : null;
            if (currency2 == null) {
                currency2 = "";
            }
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(currency2);
            C24277v.m58540e(fragment.getContext(), coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null, binding.f99638d);
        }
        BaseViewHolder baseViewHolder = new BaseViewHolder(this);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_question);
        if (C27025c.m66566d(Boolean.valueOf(entity.showProfitDes()))) {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66594y(imageView);
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedPositionDetailView.m17991d(fragment);
                }
            }, 1, null);
        } else {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66577h(imageView);
        }
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(R$id.tv_profit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fragment.getString(R$string.margin_profit_loss));
        sb2.append('(');
        CurrencyBalance quoteAsset2 = entity.getQuoteAsset();
        sb2.append(C27041f.m66669i(quoteAsset2 != null ? quoteAsset2.getCurrencyName() : null, C33820nf.f71144W));
        sb2.append(')');
        dashTextView.setText(sb2.toString());
        dashTextView.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView);
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedPositionDetailView.m17992e(fragment);
            }
        }, 1, null);
        int i11 = R$id.tv_profit_value;
        IMarginService iMarginService = IMarginService.f32724a.get();
        String tag = entity.getTag();
        baseViewHolder.setText(i11, entity.getProfitValueString(iMarginService.mo37972z(tag != null ? tag : "")));
        Context context = fragment.getContext();
        if (context != null) {
            baseViewHolder.setTextColor(i11, C22890g.m54278c(context, C27039d.m66647g(entity.calculatorProfitValue()), R$color.emphasis));
        }
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_profit_value_legal);
        textView.setText(MarginPosition.getProfitValueLegalString$default(entity, null, 1, null));
        if (TextUtils.isEmpty(textView.getText())) {
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66577h(textView);
        } else {
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66594y(textView);
        }
        int i12 = R$id.tv_liquid;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(fragment.getString(R$string.margin_liquidation_price));
        sb3.append('(');
        CurrencyBalance quoteAsset3 = entity.getQuoteAsset();
        sb3.append(C27041f.m66669i(quoteAsset3 != null ? quoteAsset3.getCurrencyName() : null, C33820nf.f71144W));
        sb3.append(')');
        baseViewHolder.setText(i12, sb3.toString());
        baseViewHolder.setText(R$id.tv_liquid_price, entity.liquidationPriceString(AssetsDepend.f18689a.m19183d().mo37962u(true, C27041f.m66668h(entity.getTag()))));
        int i13 = R$id.tvBase;
        CurrencyBalance baseAsset2 = entity.getBaseAsset();
        baseViewHolder.setText(i13, C27041f.m66669i(baseAsset2 != null ? baseAsset2.getCurrencyName() : null, C33820nf.f71144W));
        int i14 = R$id.tvQuote;
        CurrencyBalance quoteAsset4 = entity.getQuoteAsset();
        baseViewHolder.setText(i14, C27041f.m66669i(quoteAsset4 != null ? quoteAsset4.getCurrencyName() : null, C33820nf.f71144W));
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recyclerViewBase);
        RecyclerView recyclerView2 = (RecyclerView) baseViewHolder.getView(R$id.recyclerViewQuote);
        Context context2 = getContext();
        int i15 = R$string.total_assets;
        String string = context2.getString(i15);
        CurrencyBalance baseAsset3 = entity.getBaseAsset();
        Pair pair = new Pair(string, C27041f.m66669i(baseAsset3 != null ? C46897a.m103305q(baseAsset3) : null, C33820nf.f71144W));
        Context context3 = getContext();
        int i16 = R$string.useful;
        String string2 = context3.getString(i16);
        CurrencyBalance baseAsset4 = entity.getBaseAsset();
        Pair pair2 = new Pair(string2, C27041f.m66669i(baseAsset4 != null ? C46897a.m103290b(baseAsset4) : null, C33820nf.f71144W));
        Context context4 = getContext();
        int i17 = R$string.lock;
        String string3 = context4.getString(i17);
        CurrencyBalance baseAsset5 = entity.getBaseAsset();
        Pair pair3 = new Pair(string3, C27041f.m66669i(baseAsset5 != null ? C46897a.m103301m(baseAsset5) : null, C33820nf.f71144W));
        Context context5 = getContext();
        int i18 = R$string.debt;
        String string4 = context5.getString(i18);
        CurrencyBalance baseAsset6 = entity.getBaseAsset();
        Pair pair4 = new Pair(string4, C27041f.m66669i(baseAsset6 != null ? C46897a.m103298j(baseAsset6) : null, C33820nf.f71144W));
        Context context6 = getContext();
        int i19 = R$string.margin_net_position;
        String string5 = context6.getString(i19);
        CurrencyBalance baseAsset7 = entity.getBaseAsset();
        Pair pair5 = new Pair(string5, C27041f.m66669i(baseAsset7 != null ? C46897a.m103294f(baseAsset7) : null, C33820nf.f71144W));
        Context context7 = getContext();
        int i21 = R$string.margin_max_out_transfer;
        String string6 = context7.getString(i21);
        CurrencyBalance baseAsset8 = entity.getBaseAsset();
        recyclerView.setAdapter(new C10455a(CollectionsKt.arrayListOf(pair, pair2, pair3, pair4, pair5, new Pair(string6, C27041f.m66669i(baseAsset8 != null ? C46897a.m103293e(baseAsset8) : null, C33820nf.f71144W)))));
        String string7 = getContext().getString(i15);
        CurrencyBalance quoteAsset5 = entity.getQuoteAsset();
        Pair pair6 = new Pair(string7, C27041f.m66669i(quoteAsset5 != null ? C46897a.m103305q(quoteAsset5) : null, C33820nf.f71144W));
        String string8 = getContext().getString(i16);
        CurrencyBalance quoteAsset6 = entity.getQuoteAsset();
        Pair pair7 = new Pair(string8, C27041f.m66669i(quoteAsset6 != null ? C46897a.m103290b(quoteAsset6) : null, C33820nf.f71144W));
        String string9 = getContext().getString(i17);
        CurrencyBalance quoteAsset7 = entity.getQuoteAsset();
        Pair pair8 = new Pair(string9, C27041f.m66669i(quoteAsset7 != null ? C46897a.m103301m(quoteAsset7) : null, C33820nf.f71144W));
        String string10 = getContext().getString(i18);
        CurrencyBalance quoteAsset8 = entity.getQuoteAsset();
        Pair pair9 = new Pair(string10, C27041f.m66669i(quoteAsset8 != null ? C46897a.m103298j(quoteAsset8) : null, C33820nf.f71144W));
        String string11 = getContext().getString(i19);
        CurrencyBalance quoteAsset9 = entity.getQuoteAsset();
        Pair pair10 = new Pair(string11, C27041f.m66669i(quoteAsset9 != null ? C46897a.m103294f(quoteAsset9) : null, C33820nf.f71144W));
        String string12 = getContext().getString(i21);
        CurrencyBalance quoteAsset10 = entity.getQuoteAsset();
        recyclerView2.setAdapter(new C10455a(CollectionsKt.arrayListOf(pair6, pair7, pair8, pair9, pair10, new Pair(string12, C27041f.m66669i(quoteAsset10 != null ? C46897a.m103293e(quoteAsset10) : null, C33820nf.f71144W)))));
    }
}
