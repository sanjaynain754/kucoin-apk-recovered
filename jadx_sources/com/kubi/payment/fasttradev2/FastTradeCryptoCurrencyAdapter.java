package com.kubi.payment.fasttradev2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AsyncDifferConfig;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.R$color;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.util.C21457l;
import com.kubi.sdk.adapter.KcBaseDifferAdapter;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27019d;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37659n2;
import p275fy.C37728a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FastTradeCryptoCurrencyAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeCryptoCurrencyAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemFastTradeSelectCryptoCurrencyBinding;", "Landroid/widget/Filterable;", "<init>", "()V", "originList", "", "updateData", "", "newList", "", "getFilter", "Landroid/widget/Filter;", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "item", "bindData", "binding", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTradeCryptoCurrencyAdapter extends KcBaseDifferAdapter<FastTradeCryptoCurrency.Response, C37728a<C37659n2>> implements Filterable {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<FastTradeCryptoCurrency.Response> f38978i;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeCryptoCurrencyAdapter$a */
    /* JADX INFO: compiled from: FastTradeCryptoCurrencyAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/FastTradeCryptoCurrencyAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastTradeCryptoCurrencyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeCryptoCurrencyAdapter.kt\ncom/kubi/payment/fasttradev2/FastTradeCryptoCurrencyAdapter$getFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n774#2:145\n865#2,2:146\n*S KotlinDebug\n*F\n+ 1 FastTradeCryptoCurrencyAdapter.kt\ncom/kubi/payment/fasttradev2/FastTradeCryptoCurrencyAdapter$getFilter$1\n*L\n56#1:145\n56#1:146,2\n*E\n"})
    public static final class C20683a extends Filter {
        public C20683a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            ArrayList arrayList = new ArrayList();
            if (constraint == null || constraint.length() == 0) {
                arrayList.addAll(FastTradeCryptoCurrencyAdapter.this.f38978i);
            } else {
                String lowerCase = constraint.toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string = StringsKt.trim((CharSequence) lowerCase).toString();
                List list = FastTradeCryptoCurrencyAdapter.this.f38978i;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    FastTradeCryptoCurrency.Response response = (FastTradeCryptoCurrency.Response) obj;
                    if (StringsKt.contains((CharSequence) C27041f.m66668h(response.getTitle()), (CharSequence) string, true) || StringsKt.contains((CharSequence) C27041f.m66668h(response.getSubTitle()), (CharSequence) string, true)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence constraint, Filter.FilterResults results) {
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = FastTradeCryptoCurrencyAdapter.this;
            Object obj = results != null ? results.values : null;
            fastTradeCryptoCurrencyAdapter.submitList(obj instanceof List ? (List) obj : null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m47208q(final C37659n2 c37659n2, final FastTradeCryptoCurrency.Response response) {
        C24277v.m58540e(c37659n2.getRoot().getContext(), C27041f.m66668h(response != null ? response.getIconUrl() : null), c37659n2.f84328e);
        c37659n2.f84330g.setText(C27041f.m66668h(response != null ? response.getTitle() : null));
        c37659n2.f84329f.setText(C27041f.m66668h(response != null ? response.getSubTitle() : null));
        c37659n2.getRoot().setSelected(C27025c.m66566d(response != null ? Boolean.valueOf(response.isSelected()) : null));
        final boolean z11 = DowngradeExKt.m66538h(response != null ? response.getBalance() : null, 0.0d, 1, null) > 0.0d;
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.fasttradev2.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FastTradeCryptoCurrencyAdapter.m47204r(response));
            }
        }, new View[]{c37659n2.f84326c}, new Function0() { // from class: com.kubi.payment.fasttradev2.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeCryptoCurrencyAdapter.m47205s(c37659n2, response, this, z11);
            }
        });
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.fasttradev2.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FastTradeCryptoCurrencyAdapter.m47206t(z11, response));
            }
        }, new View[]{c37659n2.f84327d}, new Function0() { // from class: com.kubi.payment.fasttradev2.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeCryptoCurrencyAdapter.m47207u(c37659n2, this, response);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FastTradeCryptoCurrencyAdapter() {
        AsyncDifferConfig asyncDifferConfigBuild = new AsyncDifferConfig.Builder(new FastTradeCryptoCurrencyItemCallback()).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        super(asyncDifferConfigBuild, CollectionsKt.emptyList());
        this.f38978i = new ArrayList();
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m47204r(FastTradeCryptoCurrency.Response response) {
        String balance = response != null ? response.getBalance() : null;
        return !(balance == null || balance.length() == 0);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m47205s(C37659n2 c37659n2, FastTradeCryptoCurrency.Response response, FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter, boolean z11) {
        c37659n2.f84326c.setText(C20915q.m47935a(response != null ? response.getBalance() : null, C27041f.m66668h(response != null ? response.getTitle() : null)));
        c37659n2.f84326c.setTextColor(ContextCompat.getColor(fastTradeCryptoCurrencyAdapter.getContext(), z11 ? R$color.c_text : R$color.c_text40));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m47206t(boolean z11, FastTradeCryptoCurrency.Response response) {
        if (!z11) {
            return false;
        }
        String conversionBalance = response != null ? response.getConversionBalance() : null;
        if (conversionBalance == null || conversionBalance.length() == 0) {
            return false;
        }
        String conversionCurrency = response != null ? response.getConversionCurrency() : null;
        return (conversionCurrency == null || conversionCurrency.length() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m47207u(C37659n2 c37659n2, FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter, FastTradeCryptoCurrency.Response response) {
        c37659n2.f84327d.setText(C27019d.m66519a(fastTradeCryptoCurrencyAdapter.getContext(), R$string.payment_fast_sell_fiat_balance, new String[]{C20915q.m47935a(response != null ? response.getConversionBalance() : null, C27041f.m66668h(response != null ? response.getConversionCurrency() : null)), C27041f.m66668h(response != null ? response.getConversionCurrency() : null)}));
        return Unit.INSTANCE;
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new C20683a();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C37728a<C37659n2> holder, int i11, @Nullable FastTradeCryptoCurrency.Response response) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m47208q((C37659n2) holder.m85032b(), response);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C37728a<C37659n2> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37659n2 c37659n2M84902c = C37659n2.m84902c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c37659n2M84902c, "inflate(...)");
        return new C37728a<>(c37659n2M84902c);
    }

    /* JADX INFO: renamed from: x */
    public final void m47211x(@Nullable List<FastTradeCryptoCurrency.Response> list) {
        this.f38978i.clear();
        this.f38978i.addAll(C27024b.m66560c(list));
        submitList(list);
    }
}
