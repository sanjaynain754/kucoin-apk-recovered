package com.kubi.payment.fasttradev2.sell.paymentmethod;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fasttradev2.sell.paymentmethod.SellItemPaymentMethod;
import com.kubi.payment.fasttradev2.sell.paymentmethod.SellPaymentMethodAdapter;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import f00.C37304a;
import g00.InterfaceC37758j;
import p270ft.C37639j2;
import p270ft.C37644k2;
import p270ft.C37649l2;
import p275fy.C37728a;
import p275fy.C37732e;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellPaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellPaymentMethodAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "<init>", "()V", "bindCategory", "", C33954u6.f72238i, "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemFastSellPaymentMethodCategoryBinding;", "item", "bindNormalPaymentMethod", "Lcom/kubi/otc/databinding/PaymentItemFastSellPaymentMethodBinding;", "bindGuideP2P", "Lcom/kubi/otc/databinding/PaymentItemFastSellPaymentMethodGuideP2pBinding;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellPaymentMethodAdapter extends KcBaseDifferMultiAdapter<SellItemPaymentMethod> {

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.paymentmethod.SellPaymentMethodAdapter$2 */
    /* JADX INFO: compiled from: SellPaymentMethodAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C209512 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37644k2> {
        public static final C209512 INSTANCE = new C209512();

        public final C37644k2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37644k2.m84872c(p11, viewGroup, z11);
        }

        public C209512() {
            super(3, C37644k2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastSellPaymentMethodCategoryBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37644k2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.paymentmethod.SellPaymentMethodAdapter$4 */
    /* JADX INFO: compiled from: SellPaymentMethodAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C209524 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37639j2> {
        public static final C209524 INSTANCE = new C209524();

        public final C37639j2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37639j2.m84862c(p11, viewGroup, z11);
        }

        public C209524() {
            super(3, C37639j2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastSellPaymentMethodBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37639j2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.paymentmethod.SellPaymentMethodAdapter$6 */
    /* JADX INFO: compiled from: SellPaymentMethodAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C209536 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37649l2> {
        public static final C209536 INSTANCE = new C209536();

        public final C37649l2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37649l2.m84882c(p11, viewGroup, z11);
        }

        public C209536() {
            super(3, C37649l2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastSellPaymentMethodGuideP2pBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37649l2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.paymentmethod.SellPaymentMethodAdapter$a */
    /* JADX INFO: compiled from: SellPaymentMethodAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/sell/paymentmethod/SellPaymentMethodAdapter$bindGuideP2P$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20954a extends ClickableSpan {
        public C20954a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37758j.a.m85163l(C37304a.f82764a, 0L, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(SellPaymentMethodAdapter.this.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    public SellPaymentMethodAdapter() {
        super(new SellPaymentMethodDiffCallBack(), CollectionsKt.emptyList());
        C37732e.m85036d(this, new Function1() { // from class: zt.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(SellPaymentMethodAdapter.m48089r((SellItemPaymentMethod) obj));
            }
        });
        C37732e.m85034b(this, 0, C209512.INSTANCE, new Function3() { // from class: zt.b
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SellPaymentMethodAdapter.m48090s(this.f104785b, (C37728a) obj, ((Integer) obj2).intValue(), (SellItemPaymentMethod) obj3);
            }
        });
        C37732e.m85034b(this, 1, C209524.INSTANCE, new Function3() { // from class: zt.c
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SellPaymentMethodAdapter.m48091t(this.f104786b, (C37728a) obj, ((Integer) obj2).intValue(), (SellItemPaymentMethod) obj3);
            }
        });
        C37732e.m85034b(this, 2, C209536.INSTANCE, new Function3() { // from class: zt.d
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SellPaymentMethodAdapter.m48092u(this.f104787b, (C37728a) obj, ((Integer) obj2).intValue(), (SellItemPaymentMethod) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static final int m48089r(SellItemPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof SellItemPaymentMethod.ItemCategory) {
            return 0;
        }
        if (it instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) {
            return 1;
        }
        if (it instanceof SellItemPaymentMethod.ItemGuideP2P) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m48090s(SellPaymentMethodAdapter sellPaymentMethodAdapter, C37728a holder, int i11, SellItemPaymentMethod item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        sellPaymentMethodAdapter.m48094v(holder, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m48091t(SellPaymentMethodAdapter sellPaymentMethodAdapter, C37728a holder, int i11, SellItemPaymentMethod item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        sellPaymentMethodAdapter.m48095x(holder, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m48092u(SellPaymentMethodAdapter sellPaymentMethodAdapter, C37728a holder, int i11, SellItemPaymentMethod sellItemPaymentMethod) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(sellItemPaymentMethod, "<unused var>");
        sellPaymentMethodAdapter.m48093w(holder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    private final void m48093w(C37728a<C37649l2> c37728a) {
        C37649l2 c37649l2 = (C37649l2) c37728a.m85032b();
        c37649l2.f84238c.setText(getContext().getString(R$string.payment_fast_sell_method_p2p_guide));
        c37649l2.f84238c.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView tvWaring = c37649l2.f84238c;
        Intrinsics.checkNotNullExpressionValue(tvWaring, "tvWaring");
        highlightTextHelper.m54120f(tvWaring, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C20954a()));
    }

    /* JADX INFO: renamed from: v */
    public final void m48094v(C37728a<C37644k2> c37728a, SellItemPaymentMethod sellItemPaymentMethod) {
        SellItemPaymentMethod.ItemCategory itemCategory;
        String title;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        C37644k2 c37644k2 = (C37644k2) c37728a.m85032b();
        String quoteType = null;
        if (sellItemPaymentMethod instanceof SellItemPaymentMethod.ItemCategory) {
            itemCategory = (SellItemPaymentMethod.ItemCategory) sellItemPaymentMethod;
        } else {
            itemCategory = null;
        }
        BaseTextView baseTextView = c37644k2.f84173d;
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
        if (C45148b.m99792b(boolValueOf)) {
            AppCompatImageView ivEdit = c37644k2.f84171b;
            Intrinsics.checkNotNullExpressionValue(ivEdit, "ivEdit");
            C27046k.m66685H(ivEdit);
        } else {
            AppCompatImageView ivEdit2 = c37644k2.f84171b;
            Intrinsics.checkNotNullExpressionValue(ivEdit2, "ivEdit");
            C27046k.m66700o(ivEdit2);
        }
        if (itemCategory != null) {
            boolValueOf2 = Boolean.valueOf(itemCategory.getNeedHideEnd());
        } else {
            boolValueOf2 = null;
        }
        if (C45148b.m99792b(boolValueOf2)) {
            BaseTextView tvReceive = c37644k2.f84174e;
            Intrinsics.checkNotNullExpressionValue(tvReceive, "tvReceive");
            C27046k.m66700o(tvReceive);
            return;
        }
        if (itemCategory != null) {
            boolValueOf3 = Boolean.valueOf(itemCategory.getNeedShowUnitPrice());
        } else {
            boolValueOf3 = null;
        }
        if (C45148b.m99792b(boolValueOf3)) {
            c37644k2.f84174e.setText(getContext().getString(R$string.price));
        } else {
            if (itemCategory != null) {
                quoteType = itemCategory.getQuoteType();
            }
            if (Intrinsics.areEqual(quoteType, "FIAT")) {
                c37644k2.f84174e.setText(getContext().getString(R$string.payment_fast_sell_method_list_buy));
            } else {
                c37644k2.f84174e.setText(getContext().getString(R$string.payment_fast_sell_method_list_esreceive));
            }
        }
        BaseTextView tvReceive2 = c37644k2.f84174e;
        Intrinsics.checkNotNullExpressionValue(tvReceive2, "tvReceive");
        C27046k.m66685H(tvReceive2);
    }

    /* JADX INFO: renamed from: x */
    public final void m48095x(C37728a<C37639j2> c37728a, SellItemPaymentMethod sellItemPaymentMethod) {
        SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Boolean boolValueOf;
        SellPaymentMethod.Response.PaymentMethod paymentMethod;
        Boolean boolIsEnabled;
        String iconUrl;
        String paymentMethodName;
        String description;
        String tag;
        String value;
        C37639j2 c37639j2 = (C37639j2) c37728a.m85032b();
        String currency = null;
        if (sellItemPaymentMethod instanceof SellItemPaymentMethod.ItemNormalPaymentMethod) {
            itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) sellItemPaymentMethod;
        } else {
            itemNormalPaymentMethod = null;
        }
        ConstraintLayout root = c37639j2.getRoot();
        if (itemNormalPaymentMethod != null) {
            boolValueOf = Boolean.valueOf(itemNormalPaymentMethod.isSelected());
        } else {
            boolValueOf = null;
        }
        root.setSelected(C45148b.m99792b(boolValueOf));
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
        if (C45148b.m99792b(boolIsEnabled)) {
            c37639j2.f84095c.setAlpha(1.0f);
            c37639j2.f84097e.setAlpha(1.0f);
            c37639j2.f84096d.setAlpha(1.0f);
            c37639j2.f84098f.setAlpha(1.0f);
            c37639j2.f84099g.setAlpha(1.0f);
        } else {
            c37639j2.f84095c.setAlpha(0.4f);
            c37639j2.f84097e.setAlpha(0.4f);
            c37639j2.f84096d.setAlpha(0.4f);
            c37639j2.f84098f.setAlpha(0.4f);
            c37639j2.f84099g.setAlpha(0.4f);
        }
        Context context = getContext();
        if (paymentMethod != null) {
            iconUrl = paymentMethod.getIconUrl();
        } else {
            iconUrl = null;
        }
        C24277v.m58540e(context, iconUrl, c37639j2.f84095c);
        BaseTextView baseTextView = c37639j2.f84097e;
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
            BaseTextView tvDescription = c37639j2.f84096d;
            Intrinsics.checkNotNullExpressionValue(tvDescription, "tvDescription");
            C27046k.m66700o(tvDescription);
        } else {
            c37639j2.f84096d.setText(strM66668h);
            BaseTextView tvDescription2 = c37639j2.f84096d;
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
            BaseTextView tvTag = c37639j2.f84098f;
            Intrinsics.checkNotNullExpressionValue(tvTag, "tvTag");
            C27046k.m66700o(tvTag);
        } else {
            c37639j2.f84098f.setText(strM66668h2);
            BaseTextView tvTag2 = c37639j2.f84098f;
            Intrinsics.checkNotNullExpressionValue(tvTag2, "tvTag");
            C27046k.m66685H(tvTag2);
        }
        BaseTextView baseTextView2 = c37639j2.f84099g;
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
        }
        baseTextView2.setText(context2.getString(i11, strM66668h3, C27041f.m66668h(currency)));
    }
}
