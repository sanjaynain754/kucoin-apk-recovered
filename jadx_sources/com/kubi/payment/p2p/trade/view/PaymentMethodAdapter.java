package com.kubi.payment.p2p.trade.view;

import android.annotation.SuppressLint;
import android.widget.TextView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.trade.view.PaymentMethodAdapter;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0015J\b\u0010\u0012\u001a\u00020\fH\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/PaymentMethodAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "paymentMethodList", "", "selectedPaymentMethodCodeSet", "", "", "updateData", "", "newData", "", "convert", "helper", "item", "reset", "onSearch", "", "keyword", "realSearch", "paymentMethodCodes", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodAdapter.kt\ncom/kubi/payment/p2p/trade/view/PaymentMethodAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n774#2:127\n865#2,2:128\n*S KotlinDebug\n*F\n+ 1 PaymentMethodAdapter.kt\ncom/kubi/payment/p2p/trade/view/PaymentMethodAdapter\n*L\n105#1:127\n105#1:128,2\n*E\n"})
public final class PaymentMethodAdapter extends BaseQuickAdapter<P2PMarketPaymentMethod, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<P2PMarketPaymentMethod> f40144i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Set<String> f40145j;

    public PaymentMethodAdapter() {
        super(R$layout.payment_p2p_filter_item_payment_method);
        this.f40144i = new ArrayList();
        this.f40145j = new LinkedHashSet();
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final P2PMarketPaymentMethod item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R$id.tv_name);
        textView.setText(item.getName());
        textView.setSelected(CollectionsKt.contains(this.f40145j, item.getCode()));
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: gu.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodAdapter.m49404i(item, this, helper);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m49406j(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        if (keyword.length() == 0) {
            replaceData(this.f40144i);
            return true;
        }
        List<P2PMarketPaymentMethod> listM49408l = m49408l(keyword);
        boolean z11 = !listM49408l.isEmpty();
        replaceData(listM49408l);
        return z11;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final String m49407k() {
        if (!this.f40145j.isEmpty() && this.f40145j.size() == 1 && this.f40145j.contains("ALL")) {
            return null;
        }
        return CollectionsKt.joinToString$default(this.f40145j, ",", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: l */
    public final List<P2PMarketPaymentMethod> m49408l(String str) {
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = str.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        List<P2PMarketPaymentMethod> list = this.f40144i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            P2PMarketPaymentMethod p2PMarketPaymentMethod = (P2PMarketPaymentMethod) obj;
            String strM66668h = C27041f.m66668h(p2PMarketPaymentMethod.getName());
            Locale ROOT2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
            String upperCase2 = strM66668h.toUpperCase(ROOT2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (!Intrinsics.areEqual(upperCase2, "ALL")) {
                String strM66668h2 = C27041f.m66668h(p2PMarketPaymentMethod.getCode());
                Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                String upperCase3 = strM66668h2.toUpperCase(ROOT2);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                if (!Intrinsics.areEqual(upperCase3, "ALL")) {
                    String strM66668h3 = C27041f.m66668h(p2PMarketPaymentMethod.getName());
                    Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                    String upperCase4 = strM66668h3.toUpperCase(ROOT2);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (!StringsKt.contains$default((CharSequence) upperCase4, (CharSequence) upperCase, false, 2, (Object) null)) {
                        String strM66668h4 = C27041f.m66668h(p2PMarketPaymentMethod.getCode());
                        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                        String upperCase5 = strM66668h4.toUpperCase(ROOT2);
                        Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                        if (StringsKt.contains$default((CharSequence) upperCase5, (CharSequence) upperCase, false, 2, (Object) null)) {
                        }
                    }
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: m */
    public final void m49409m() {
        this.f40145j.clear();
        this.f40145j.add("ALL");
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public final void m49410n(@NotNull List<P2PMarketPaymentMethod> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.f40145j.clear();
        this.f40145j.add("ALL");
        this.f40144i.clear();
        this.f40144i.addAll(newData);
        super.replaceData(this.f40144i);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m49404i(P2PMarketPaymentMethod p2PMarketPaymentMethod, PaymentMethodAdapter paymentMethodAdapter, BaseViewHolder baseViewHolder) {
        if (Intrinsics.areEqual(p2PMarketPaymentMethod.getCode(), "ALL")) {
            if (!paymentMethodAdapter.f40145j.contains(p2PMarketPaymentMethod.getCode())) {
                paymentMethodAdapter.m49409m();
            }
        } else if (CollectionsKt.contains(paymentMethodAdapter.f40145j, p2PMarketPaymentMethod.getCode())) {
            Set<String> set = paymentMethodAdapter.f40145j;
            TypeIntrinsics.asMutableCollection(set).remove(p2PMarketPaymentMethod.getCode());
            if (paymentMethodAdapter.f40145j.isEmpty()) {
                paymentMethodAdapter.f40145j.add("ALL");
                paymentMethodAdapter.notifyDataSetChanged();
            } else {
                paymentMethodAdapter.notifyItemChanged(baseViewHolder.getAdapterPosition());
            }
        } else {
            if (!CollectionsKt.contains(paymentMethodAdapter.f40145j, p2PMarketPaymentMethod.getCode())) {
                paymentMethodAdapter.f40145j.add(C27041f.m66668h(p2PMarketPaymentMethod.getCode()));
            }
            if (paymentMethodAdapter.f40145j.contains("ALL")) {
                paymentMethodAdapter.f40145j.remove("ALL");
                paymentMethodAdapter.notifyDataSetChanged();
            } else {
                paymentMethodAdapter.notifyItemChanged(baseViewHolder.getAdapterPosition());
            }
        }
        return Unit.INSTANCE;
    }
}
