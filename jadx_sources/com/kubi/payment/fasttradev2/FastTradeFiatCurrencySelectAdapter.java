package com.kubi.payment.fasttradev2;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37664o2;
import p270ft.C37669p2;
import p275fy.C37728a;
import p275fy.C37732e;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bJ\u001e\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u001e\u0010\u0011\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeFiatCurrencySelectAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;", "Landroid/widget/Filterable;", "<init>", "()V", "originList", "", "updateData", "", "newList", "", "bindHeader", C33954u6.f72238i, "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemFastTradeSelectFiatCurrencyHeaderBinding;", "item", "bindItemNormal", "Lcom/kubi/otc/databinding/PaymentItemFastTradeSelectFiatCurrencyBinding;", "getFilter", "Landroid/widget/Filter;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTradeFiatCurrencySelectAdapter extends KcBaseDifferMultiAdapter<ItemFiatCurrency> implements Filterable {

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<ItemFiatCurrency> f38980k;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeFiatCurrencySelectAdapter$2 */
    /* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C206842 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37669p2> {
        public static final C206842 INSTANCE = new C206842();

        public final C37669p2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37669p2.m84924c(p11, viewGroup, z11);
        }

        public C206842() {
            super(3, C37669p2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastTradeSelectFiatCurrencyHeaderBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37669p2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeFiatCurrencySelectAdapter$4 */
    /* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C206854 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37664o2> {
        public static final C206854 INSTANCE = new C206854();

        public final C37664o2 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37664o2.m84913c(p11, viewGroup, z11);
        }

        public C206854() {
            super(3, C37664o2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentItemFastTradeSelectFiatCurrencyBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37664o2 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeFiatCurrencySelectAdapter$a */
    /* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/FastTradeFiatCurrencySelectAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastTradeFiatCurrencySelectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeFiatCurrencySelectAdapter.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatCurrencySelectAdapter$getFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n774#2:160\n865#2,2:161\n*S KotlinDebug\n*F\n+ 1 FastTradeFiatCurrencySelectAdapter.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatCurrencySelectAdapter$getFilter$1\n*L\n99#1:160\n99#1:161,2\n*E\n"})
    public static final class C20686a extends Filter {
        public C20686a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            ArrayList arrayList = new ArrayList();
            if (constraint == null || StringsKt.isBlank(constraint)) {
                arrayList.addAll(FastTradeFiatCurrencySelectAdapter.this.f38980k);
            } else {
                String lowerCase = constraint.toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string = StringsKt.trim((CharSequence) lowerCase).toString();
                List listDrop = CollectionsKt.drop(FastTradeFiatCurrencySelectAdapter.this.f38980k, 1);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listDrop) {
                    ItemFiatCurrency itemFiatCurrency = (ItemFiatCurrency) obj;
                    if (StringsKt.contains((CharSequence) C27041f.m66668h(itemFiatCurrency.getFiatCurrency().getTitle()), (CharSequence) string, true) || StringsKt.contains((CharSequence) C27041f.m66668h(itemFiatCurrency.getFiatCurrency().getSubTitle()), (CharSequence) string, true)) {
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
            FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter = FastTradeFiatCurrencySelectAdapter.this;
            Object obj = results != null ? results.values : null;
            fastTradeFiatCurrencySelectAdapter.submitList(obj instanceof List ? (List) obj : null);
        }
    }

    public FastTradeFiatCurrencySelectAdapter() {
        super(new FastTradeFiatCurrencyItemCallback(), CollectionsKt.emptyList());
        this.f38980k = new ArrayList();
        C37732e.m85036d(this, new Function1() { // from class: com.kubi.payment.fasttradev2.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(FastTradeFiatCurrencySelectAdapter.m47215q((ItemFiatCurrency) obj));
            }
        });
        C37732e.m85034b(this, 0, C206842.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.u
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FastTradeFiatCurrencySelectAdapter.m47216r(this.f39470b, (C37728a) obj, ((Integer) obj2).intValue(), (ItemFiatCurrency) obj3);
            }
        });
        C37732e.m85034b(this, 1, C206854.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.v
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FastTradeFiatCurrencySelectAdapter.m47217s(this.f39471b, (C37728a) obj, ((Integer) obj2).intValue(), (ItemFiatCurrency) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final int m47215q(ItemFiatCurrency it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ItemFiatCurrency.ItemHeader) {
            return 0;
        }
        if (it instanceof ItemFiatCurrency.ItemNormal) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m47216r(FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter, C37728a holder, int i11, ItemFiatCurrency item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        fastTradeFiatCurrencySelectAdapter.m47219u(holder, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m47217s(FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter, C37728a holder, int i11, ItemFiatCurrency item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        fastTradeFiatCurrencySelectAdapter.m47220v(holder, item);
        return Unit.INSTANCE;
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new C20686a();
    }

    /* JADX INFO: renamed from: w */
    public final void m47221w(@Nullable List<? extends ItemFiatCurrency> list) {
        this.f38980k.clear();
        this.f38980k.addAll(C27024b.m66560c(list));
        submitList(list);
    }

    /* JADX INFO: renamed from: u */
    public final void m47219u(C37728a<C37669p2> c37728a, ItemFiatCurrency itemFiatCurrency) {
        C37669p2 c37669p2 = (C37669p2) c37728a.m85032b();
        FastTradeFiatCurrency.Response fiatCurrency = itemFiatCurrency.getFiatCurrency();
        c37669p2.getRoot().setSelected(C45148b.m99792b(Boolean.valueOf(fiatCurrency.isSelected())));
        C24277v.m58540e(getContext(), C27041f.m66668h(fiatCurrency.getIconUrl()), c37669p2.f84396b);
        ((C37669p2) c37728a.m85032b()).f84398d.setText(C27041f.m66668h(fiatCurrency.getTitle()));
        ((C37669p2) c37728a.m85032b()).f84397c.setText(C27041f.m66668h(fiatCurrency.getSubTitle()));
    }

    /* JADX INFO: renamed from: v */
    public final void m47220v(C37728a<C37664o2> c37728a, ItemFiatCurrency itemFiatCurrency) {
        C37664o2 c37664o2 = (C37664o2) c37728a.m85032b();
        FastTradeFiatCurrency.Response fiatCurrency = itemFiatCurrency.getFiatCurrency();
        c37664o2.getRoot().setSelected(C45148b.m99792b(Boolean.valueOf(fiatCurrency.isSelected())));
        C24277v.m58540e(getContext(), C27041f.m66668h(fiatCurrency.getIconUrl()), c37664o2.f84364b);
        ((C37664o2) c37728a.m85032b()).f84366d.setText(C27041f.m66668h(fiatCurrency.getTitle()));
        ((C37664o2) c37728a.m85032b()).f84365c.setText(C27041f.m66668h(fiatCurrency.getSubTitle()));
    }
}
