package com.kubi.payment.fasttradev2.buy.paymentmethod;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$color;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import f00.C37304a;
import g00.InterfaceC37758j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37619f2;
import p270ft.C37624g2;
import p270ft.C37629h2;
import p275fy.C37728a;
import p275fy.C37732e;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyPaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\b2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "<init>", "()V", "onRechargeClickListener", "Lkotlin/Function1;", "", "", "setOnRechargeClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindCategory", C33954u6.f72238i, "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemFastBuyPaymentMethodCategoryBinding;", "item", "bindNormalPaymentMethod", "Lcom/kubi/otc/databinding/PaymentItemFastBuyPaymentMethodBinding;", "bindGuideP2P", "Lcom/kubi/otc/databinding/PaymentItemFastBuyPaymentMethodGuideP2pBinding;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyPaymentMethodAdapter extends KcBaseDifferMultiAdapter<BuyItemPaymentMethod> {

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super String, Unit> f39272k;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodAdapter$2 */
    /* JADX INFO: compiled from: BuyPaymentMethodAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C208182 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37624g2> {
        public static final C208182 INSTANCE = new C208182();

        public final C37624g2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37624g2.m84830c(p11, viewGroup, z11);
        }

        public C208182() {
            super(3, C37624g2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastBuyPaymentMethodCategoryBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37624g2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodAdapter$4 */
    /* JADX INFO: compiled from: BuyPaymentMethodAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C208194 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37619f2> {
        public static final C208194 INSTANCE = new C208194();

        public final C37619f2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37619f2.m84819c(p11, viewGroup, z11);
        }

        public C208194() {
            super(3, C37619f2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastBuyPaymentMethodBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37619f2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodAdapter$6 */
    /* JADX INFO: compiled from: BuyPaymentMethodAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C208206 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37629h2> {
        public static final C208206 INSTANCE = new C208206();

        public final C37629h2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37629h2.m84841c(p11, viewGroup, z11);
        }

        public C208206() {
            super(3, C37629h2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastBuyPaymentMethodGuideP2pBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37629h2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodAdapter$a */
    /* JADX INFO: compiled from: BuyPaymentMethodAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodAdapter$bindGuideP2P$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20821a extends ClickableSpan {
        public C20821a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37758j.a.m85162k(C37304a.f82764a, null, null, null, null, 15, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(BuyPaymentMethodAdapter.this.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    public BuyPaymentMethodAdapter() {
        super(new BuyPaymentMethodDiffCallBack(), CollectionsKt.emptyList());
        C37732e.m85036d(this, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BuyPaymentMethodAdapter.m47816s((BuyItemPaymentMethod) obj));
            }
        });
        C37732e.m85034b(this, 0, C208182.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.f
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BuyPaymentMethodAdapter.m47817t(this.f39293b, (C37728a) obj, ((Integer) obj2).intValue(), (BuyItemPaymentMethod) obj3);
            }
        });
        C37732e.m85034b(this, 1, C208194.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.g
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BuyPaymentMethodAdapter.m47818u(this.f39294b, (C37728a) obj, ((Integer) obj2).intValue(), (BuyItemPaymentMethod) obj3);
            }
        });
        C37732e.m85034b(this, 2, C208206.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.h
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BuyPaymentMethodAdapter.m47819v(this.f39295b, (C37728a) obj, ((Integer) obj2).intValue(), (BuyItemPaymentMethod) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m47810A(BuyPaymentMethodAdapter buyPaymentMethodAdapter, BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod) {
        BuyPaymentMethod.Response.PaymentMethod paymentMethod;
        Function1<? super String, Unit> function1 = buyPaymentMethodAdapter.f39272k;
        if (function1 != null) {
            function1.invoke((itemNormalPaymentMethod == null || (paymentMethod = itemNormalPaymentMethod.getPaymentMethod()) == null) ? null : paymentMethod.getFiatCurrency());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final int m47816s(BuyItemPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof BuyItemPaymentMethod.ItemCategory) {
            return 0;
        }
        if (it instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) {
            return 1;
        }
        if (it instanceof BuyItemPaymentMethod.ItemGuideP2P) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m47817t(BuyPaymentMethodAdapter buyPaymentMethodAdapter, C37728a holder, int i11, BuyItemPaymentMethod item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        buyPaymentMethodAdapter.m47822w(holder, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m47818u(BuyPaymentMethodAdapter buyPaymentMethodAdapter, C37728a holder, int i11, BuyItemPaymentMethod item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        buyPaymentMethodAdapter.m47823y(holder, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m47819v(BuyPaymentMethodAdapter buyPaymentMethodAdapter, C37728a holder, int i11, BuyItemPaymentMethod buyItemPaymentMethod) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(buyItemPaymentMethod, "<unused var>");
        buyPaymentMethodAdapter.m47820x(holder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m47821B(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39272k = listener;
    }

    /* JADX INFO: renamed from: x */
    private final void m47820x(C37728a<C37629h2> c37728a) {
        C37629h2 c37629h2 = (C37629h2) c37728a.m85032b();
        c37629h2.f83978c.setText(getContext().getString(R$string.payment_fast_sell_method_p2p_guide));
        c37629h2.f83978c.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView tvWaring = c37629h2.f83978c;
        Intrinsics.checkNotNullExpressionValue(tvWaring, "tvWaring");
        highlightTextHelper.m54120f(tvWaring, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C20821a()));
    }

    /* JADX INFO: renamed from: w */
    public final void m47822w(C37728a<C37624g2> c37728a, BuyItemPaymentMethod buyItemPaymentMethod) {
        BuyItemPaymentMethod.ItemCategory itemCategory;
        String title;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        C37624g2 c37624g2 = (C37624g2) c37728a.m85032b();
        String quoteType = null;
        if (buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemCategory) {
            itemCategory = (BuyItemPaymentMethod.ItemCategory) buyItemPaymentMethod;
        } else {
            itemCategory = null;
        }
        BaseTextView baseTextView = c37624g2.f83930d;
        if (itemCategory != null) {
            title = itemCategory.getTitle();
        } else {
            title = null;
        }
        baseTextView.setText(C27041f.m66668h(title));
        if (itemCategory != null) {
            boolValueOf = Boolean.valueOf(itemCategory.getCanEdit());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            AppCompatImageView ivEdit = c37624g2.f83928b;
            Intrinsics.checkNotNullExpressionValue(ivEdit, "ivEdit");
            C27046k.m66685H(ivEdit);
        } else {
            AppCompatImageView ivEdit2 = c37624g2.f83928b;
            Intrinsics.checkNotNullExpressionValue(ivEdit2, "ivEdit");
            C27046k.m66700o(ivEdit2);
        }
        if (itemCategory != null) {
            boolValueOf2 = Boolean.valueOf(itemCategory.getNeedHideEnd());
        } else {
            boolValueOf2 = null;
        }
        if (C27025c.m66566d(boolValueOf2)) {
            BaseTextView tvReceive = c37624g2.f83931e;
            Intrinsics.checkNotNullExpressionValue(tvReceive, "tvReceive");
            C27046k.m66700o(tvReceive);
            return;
        }
        if (itemCategory != null) {
            boolValueOf3 = Boolean.valueOf(itemCategory.getNeedShowUnitPrice());
        } else {
            boolValueOf3 = null;
        }
        if (C27025c.m66566d(boolValueOf3)) {
            c37624g2.f83931e.setText(getContext().getString(R$string.price));
        } else {
            if (itemCategory != null) {
                quoteType = itemCategory.getQuoteType();
            }
            if (Intrinsics.areEqual(quoteType, "FIAT")) {
                c37624g2.f83931e.setText(getContext().getString(R$string.payment_fast_buy_method_list_est_buy));
            } else {
                c37624g2.f83931e.setText(getContext().getString(R$string.payment_fast_buy_method_list_est_pay));
            }
        }
        BaseTextView tvReceive2 = c37624g2.f83931e;
        Intrinsics.checkNotNullExpressionValue(tvReceive2, "tvReceive");
        C27046k.m66685H(tvReceive2);
    }

    /* JADX INFO: renamed from: y */
    public final void m47823y(C37728a<C37619f2> c37728a, BuyItemPaymentMethod buyItemPaymentMethod) {
        final BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Boolean boolValueOf;
        BuyPaymentMethod.Response.PaymentMethod paymentMethod;
        Boolean boolIsEnabled;
        String iconUrl;
        String paymentMethodName;
        String description;
        String tag;
        String value;
        String currency;
        Boolean balanceSufficient;
        BuyPaymentMethod.Response.PaymentMethod paymentMethod2;
        BuyPaymentMethod.Response.PaymentMethod.RewardInfo rewardInfo;
        BuyPaymentMethod.Response.PaymentMethod paymentMethod3;
        BuyPaymentMethod.Response.PaymentMethod.BalanceInfo balanceInfo;
        C37619f2 c37619f2 = (C37619f2) c37728a.m85032b();
        String message = null;
        if (buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) {
            itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) buyItemPaymentMethod;
        } else {
            itemNormalPaymentMethod = null;
        }
        FrameLayout root = c37619f2.getRoot();
        if (itemNormalPaymentMethod != null) {
            boolValueOf = Boolean.valueOf(itemNormalPaymentMethod.isSelected());
        } else {
            boolValueOf = null;
        }
        root.setSelected(C27025c.m66566d(boolValueOf));
        if (itemNormalPaymentMethod != null) {
            paymentMethod = itemNormalPaymentMethod.getPaymentMethod();
        } else {
            paymentMethod = null;
        }
        if (paymentMethod != null) {
            boolIsEnabled = paymentMethod.isEnabled();
        } else {
            boolIsEnabled = null;
        }
        boolean zM66566d = C27025c.m66566d(boolIsEnabled);
        float f11 = 0.4f;
        if (zM66566d) {
            c37619f2.f83874f.setAlpha(1.0f);
            c37619f2.f83877i.setAlpha(1.0f);
            c37619f2.f83876h.setAlpha(1.0f);
            c37619f2.f83879k.setAlpha(1.0f);
            c37619f2.f83880l.setAlpha(1.0f);
        } else {
            c37619f2.f83874f.setAlpha(0.4f);
            c37619f2.f83877i.setAlpha(0.4f);
            c37619f2.f83876h.setAlpha(0.4f);
            c37619f2.f83879k.setAlpha(0.4f);
            c37619f2.f83880l.setAlpha(0.4f);
        }
        Context context = getContext();
        if (paymentMethod != null) {
            iconUrl = paymentMethod.getIconUrl();
        } else {
            iconUrl = null;
        }
        C24277v.m58540e(context, iconUrl, c37619f2.f83874f);
        BaseTextView baseTextView = c37619f2.f83877i;
        if (paymentMethod != null) {
            paymentMethodName = paymentMethod.getPaymentMethodName();
        } else {
            paymentMethodName = null;
        }
        baseTextView.setText(C27041f.m66668h(paymentMethodName));
        if (paymentMethod != null) {
            description = paymentMethod.getDescription();
        } else {
            description = null;
        }
        String strM66668h = C27041f.m66668h(description);
        if (strM66668h.length() == 0) {
            BaseTextView tvDescription = c37619f2.f83876h;
            Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
            C27046k.m66700o(tvDescription);
        } else {
            c37619f2.f83876h.setText(strM66668h);
            BaseTextView tvDescription2 = c37619f2.f83876h;
            Intrinsics.checkNotNullExpressionValue(tvDescription2, "tvDescription");
            C27046k.m66685H(tvDescription2);
        }
        if (paymentMethod != null) {
            tag = paymentMethod.getTag();
        } else {
            tag = null;
        }
        String strM66668h2 = C27041f.m66668h(tag);
        if (strM66668h2.length() == 0) {
            BaseTextView tvTag = c37619f2.f83879k;
            Intrinsics.checkNotNullExpressionValue(tvTag, "tvTag");
            C27046k.m66700o(tvTag);
        } else {
            c37619f2.f83879k.setText(strM66668h2);
            BaseTextView tvTag2 = c37619f2.f83879k;
            Intrinsics.checkNotNullExpressionValue(tvTag2, "tvTag");
            C27046k.m66685H(tvTag2);
        }
        BaseTextView baseTextView2 = c37619f2.f83880l;
        Context context2 = getContext();
        int i11 = R$string.payment_price;
        if (itemNormalPaymentMethod != null) {
            value = itemNormalPaymentMethod.getValue();
        } else {
            value = null;
        }
        String strM66668h3 = C27041f.m66668h(value);
        if (itemNormalPaymentMethod != null) {
            currency = itemNormalPaymentMethod.getCurrency();
        } else {
            currency = null;
        }
        baseTextView2.setText(context2.getString(i11, strM66668h3, C27041f.m66668h(currency)));
        if (itemNormalPaymentMethod != null && (paymentMethod3 = itemNormalPaymentMethod.getPaymentMethod()) != null && (balanceInfo = paymentMethod3.getBalanceInfo()) != null) {
            balanceSufficient = balanceInfo.getBalanceSufficient();
        } else {
            balanceSufficient = null;
        }
        if (!C27025c.m66567e(balanceSufficient, true) && C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit)) {
            BaseTextView tvRecharge = c37619f2.f83878j;
            Intrinsics.checkNotNullExpressionValue(tvRecharge, "tvRecharge");
            C27046k.m66685H(tvRecharge);
        } else {
            BaseTextView tvRecharge2 = c37619f2.f83878j;
            Intrinsics.checkNotNullExpressionValue(tvRecharge2, "tvRecharge");
            C27046k.m66700o(tvRecharge2);
        }
        BaseTextView tvRecharge3 = c37619f2.f83878j;
        Intrinsics.checkNotNullExpressionValue(tvRecharge3, "tvRecharge");
        C27046k.m66711z(tvRecharge3, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyPaymentMethodAdapter.m47810A(this.f39296b, itemNormalPaymentMethod);
            }
        }, 1, null);
        if (itemNormalPaymentMethod != null && (paymentMethod2 = itemNormalPaymentMethod.getPaymentMethod()) != null && (rewardInfo = paymentMethod2.getRewardInfo()) != null) {
            message = rewardInfo.getMessage();
        }
        if (message != null && message.length() != 0) {
            BaseTextView discountInfoTag = c37619f2.f83871c;
            Intrinsics.checkNotNullExpressionValue(discountInfoTag, "discountInfoTag");
            ViewExtKt.m66594y(discountInfoTag);
            c37619f2.f83871c.setText(message);
            BaseTextView baseTextView3 = c37619f2.f83871c;
            if (zM66566d) {
                f11 = 1.0f;
            }
            baseTextView3.setAlpha(f11);
            ConstraintLayout paymentMethodItem = c37619f2.f83875g;
            Intrinsics.checkNotNullExpressionValue(paymentMethodItem, "paymentMethodItem");
            C27046k.m66692g(paymentMethodItem, C27040e.m66658b(3));
            return;
        }
        BaseTextView discountInfoTag2 = c37619f2.f83871c;
        Intrinsics.checkNotNullExpressionValue(discountInfoTag2, "discountInfoTag");
        ViewExtKt.m66577h(discountInfoTag2);
        ConstraintLayout paymentMethodItem2 = c37619f2.f83875g;
        Intrinsics.checkNotNullExpressionValue(paymentMethodItem2, "paymentMethodItem");
        C27046k.m66692g(paymentMethodItem2, 0);
    }
}
