package com.kubi.assets.margin.isolated;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p637ta.C44751d6;
import p838zo.C46897a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45682f;

/* JADX INFO: compiled from: IsolatedPositionView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/IsolatedPositionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewIsolatedAssetsPositionBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewIsolatedAssetsPositionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/margin/api/entity/MarginPosition;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nIsolatedPositionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedPositionView.kt\ncom/kubi/assets/margin/isolated/IsolatedPositionView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n41#2:150\n65#2:151\n80#2,7:152\n1#3:159\n*S KotlinDebug\n*F\n+ 1 IsolatedPositionView.kt\ncom/kubi/assets/margin/isolated/IsolatedPositionView\n*L\n44#1:150\n44#1:151\n44#1:152,7\n*E\n"})
public final class IsolatedPositionView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18051c = {Reflection.property1(new PropertyReference1Impl(IsolatedPositionView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewIsolatedAssetsPositionBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedPositionView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18052b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44751d6>() { // from class: com.kubi.assets.margin.isolated.IsolatedPositionView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44751d6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44751d6.m99016a(C45682f.m100801b(viewGroup));
            }
        });
        setOrientation(1);
        LayoutInflater.from(context).inflate(R$layout.view_isolated_assets_position, this);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m17997d(OldBaseFragment oldBaseFragment) {
        AssetsDepend.f18689a.m19183d().mo37968x(oldBaseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m17998e(OldBaseFragment oldBaseFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(oldBaseFragment.getString(R$string.margin_dialog_profit_loss_tips_new)).m54163T4(oldBaseFragment.getString(R$string.i_know), null).m54172c5(oldBaseFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    private final C44751d6 getBinding() {
        return (C44751d6) this.f18052b.getValue(this, f18051c[0]);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public final void m17999c(@NotNull final OldBaseFragment fragment, @NotNull MarginPosition entity) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entity, "entity");
        C44751d6 binding = getBinding();
        if (binding != null) {
            C37890n c37890n = C37890n.f85269a;
            CurrencyBalance baseAsset = entity.getBaseAsset();
            String currency = baseAsset != null ? baseAsset.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
            C24277v.m58540e(fragment.getContext(), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, binding.f99762b);
            CurrencyBalance quoteAsset = entity.getQuoteAsset();
            String currency2 = quoteAsset != null ? quoteAsset.getCurrency() : null;
            if (currency2 == null) {
                currency2 = "";
            }
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(currency2);
            C24277v.m58540e(fragment.getContext(), coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null, binding.f99764d);
        }
        BaseViewHolder baseViewHolder = new BaseViewHolder(this);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_question);
        if (C27025c.m66566d(Boolean.valueOf(entity.showProfitDes()))) {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66594y(imageView);
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedPositionView.m17997d(fragment);
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
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedPositionView.m17998e(fragment);
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
        int i14 = R$id.tv_base_total_balance;
        View view = baseViewHolder.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        CurrencyBalance baseAsset3 = entity.getBaseAsset();
        baseViewHolder.setText(i14, C27041f.m66669i(baseAsset3 != null ? C46897a.m103305q(baseAsset3) : null, C33820nf.f71144W));
        int i15 = R$id.tv_base_freeze_balance;
        View view2 = baseViewHolder.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        CurrencyBalance baseAsset4 = entity.getBaseAsset();
        baseViewHolder.setText(i15, C27041f.m66669i(baseAsset4 != null ? C46897a.m103301m(baseAsset4) : null, C33820nf.f71144W));
        int i16 = R$id.tv_base_debt;
        View view3 = baseViewHolder.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        CurrencyBalance baseAsset5 = entity.getBaseAsset();
        baseViewHolder.setText(i16, C27041f.m66669i(baseAsset5 != null ? C46897a.m103298j(baseAsset5) : null, C33820nf.f71144W));
        int i17 = R$id.tvQuote;
        CurrencyBalance quoteAsset4 = entity.getQuoteAsset();
        baseViewHolder.setText(i17, C27041f.m66669i(quoteAsset4 != null ? quoteAsset4.getCurrencyName() : null, C33820nf.f71144W));
        int i18 = R$id.tv_quote_total_balance;
        View view4 = baseViewHolder.getView(i18);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C44172b.m97383c((TextView) view4, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        CurrencyBalance quoteAsset5 = entity.getQuoteAsset();
        baseViewHolder.setText(i18, C27041f.m66669i(quoteAsset5 != null ? C46897a.m103305q(quoteAsset5) : null, C33820nf.f71144W));
        int i19 = R$id.tv_quote_freeze_balance;
        View view5 = baseViewHolder.getView(i19);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C44172b.m97383c((TextView) view5, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        CurrencyBalance quoteAsset6 = entity.getQuoteAsset();
        baseViewHolder.setText(i19, C27041f.m66669i(quoteAsset6 != null ? C46897a.m103301m(quoteAsset6) : null, C33820nf.f71144W));
        int i21 = R$id.tv_quote_debt;
        View view6 = baseViewHolder.getView(i21);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        C44172b.m97383c((TextView) view6, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        CurrencyBalance quoteAsset7 = entity.getQuoteAsset();
        baseViewHolder.setText(i21, C27041f.m66669i(quoteAsset7 != null ? C46897a.m103298j(quoteAsset7) : null, C33820nf.f71144W));
    }
}
