package com.kubi.payment.fasttrade.sell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AsyncDifferConfig;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.adapter.KcBaseDifferAdapter;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27024b;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37654m2;
import p275fy.C37728a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FastSellCryptoCurrencyAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", "Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrency;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemFastSellSelectCryptoCurrencyBinding;", "Landroid/widget/Filterable;", "<init>", "()V", "originList", "", "updateData", "", "newList", "", "getFilter", "Landroid/widget/Filter;", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "item", "bindData", "binding", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastSellCryptoCurrencyAdapter extends KcBaseDifferAdapter<FastSellCryptoCurrency, C37728a<C37654m2>> implements Filterable {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<FastSellCryptoCurrency> f38784i;

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellCryptoCurrencyAdapter$a */
    /* JADX INFO: compiled from: FastSellCryptoCurrencyAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastSellCryptoCurrencyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellCryptoCurrencyAdapter.kt\ncom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyAdapter$getFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n774#2:110\n865#2,2:111\n*S KotlinDebug\n*F\n+ 1 FastSellCryptoCurrencyAdapter.kt\ncom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyAdapter$getFilter$1\n*L\n47#1:110\n47#1:111,2\n*E\n"})
    public static final class C20584a extends Filter {
        public C20584a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            ArrayList arrayList = new ArrayList();
            if (constraint == null || constraint.length() == 0) {
                arrayList.addAll(FastSellCryptoCurrencyAdapter.this.f38784i);
            } else {
                String lowerCase = constraint.toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string = StringsKt.trim((CharSequence) lowerCase).toString();
                List list = FastSellCryptoCurrencyAdapter.this.f38784i;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (StringsKt.contains((CharSequence) ((FastSellCryptoCurrency) obj).getTitle(), (CharSequence) string, true)) {
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
            FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter = FastSellCryptoCurrencyAdapter.this;
            Object obj = results != null ? results.values : null;
            fastSellCryptoCurrencyAdapter.submitList(obj instanceof List ? (List) obj : null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FastSellCryptoCurrencyAdapter() {
        AsyncDifferConfig asyncDifferConfigBuild = new AsyncDifferConfig.Builder(new FastSellCryptoCurrencyItemCallback()).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        super(asyncDifferConfigBuild, CollectionsKt.emptyList());
        this.f38784i = new ArrayList();
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new C20584a();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C37728a<C37654m2> holder, int i11, @Nullable FastSellCryptoCurrency fastSellCryptoCurrency) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m46823m((C37654m2) holder.m85032b(), fastSellCryptoCurrency);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C37728a<C37654m2> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37654m2 c37654m2M84892c = C37654m2.m84892c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c37654m2M84892c, "inflate(...)");
        return new C37728a<>(c37654m2M84892c);
    }

    /* JADX INFO: renamed from: p */
    public final void m46826p(@Nullable List<FastSellCryptoCurrency> list) {
        this.f38784i.clear();
        this.f38784i.addAll(C27024b.m66560c(list));
        submitList(list);
    }

    /* JADX INFO: renamed from: m */
    public final void m46823m(C37654m2 c37654m2, FastSellCryptoCurrency fastSellCryptoCurrency) {
        String iconUrl;
        String title;
        Context context = c37654m2.getRoot().getContext();
        Boolean boolValueOf = null;
        if (fastSellCryptoCurrency != null) {
            iconUrl = fastSellCryptoCurrency.getIconUrl();
        } else {
            iconUrl = null;
        }
        C24277v.m58540e(context, C45148b.m99794d(iconUrl), c37654m2.f84275b);
        BaseTextView baseTextView = c37654m2.f84276c;
        if (fastSellCryptoCurrency != null) {
            title = fastSellCryptoCurrency.getTitle();
        } else {
            title = null;
        }
        baseTextView.setText(C45148b.m99794d(title));
        ConstraintLayout root = c37654m2.getRoot();
        if (fastSellCryptoCurrency != null) {
            boolValueOf = Boolean.valueOf(fastSellCryptoCurrency.isSelected());
        }
        root.setSelected(C45148b.m99792b(boolValueOf));
    }
}
