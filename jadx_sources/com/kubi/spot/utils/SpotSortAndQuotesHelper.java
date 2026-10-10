package com.kubi.spot.utils;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.R$id;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.utils.SpotSortAndQuotesHelper;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpotSortAndQuotesHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!2\b\b\u0002\u0010\"\u001a\u00020#J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001f0%j\b\u0012\u0004\u0012\u00020\u001f`&H\u0002J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001f0%j\b\u0012\u0004\u0012\u00020\u001f`&H\u0002J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001f0%j\b\u0012\u0004\u0012\u00020\u001f`&H\u0002J\u000e\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020#J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000f¨\u0006,"}, m90084d2 = {"Lcom/kubi/spot/utils/SpotSortAndQuotesHelper;", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "mQuotesKey", "", "getMQuotesKey", "()Ljava/lang/String;", "setMQuotesKey", "(Ljava/lang/String;)V", "ivSortName", "Landroid/widget/ImageView;", "getIvSortName", "()Landroid/widget/ImageView;", "ivSortName$delegate", "Lkotlin/Lazy;", "ivSortPrice", "getIvSortPrice", "ivSortPrice$delegate", "ivSortChangeRate", "getIvSortChangeRate", "ivSortChangeRate$delegate", "sortByName", "", "showFilterView", "sortByPrice", "sortByChangeRate", "sortData", "", "Lcom/kubi/data/entity/TradeItemBean;", "list", "", "filterQuote", "", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setSortVisible", ViewProps.VISIBLE, "setQuotesKey", "quotesKey", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSortAndQuotesHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n254#2:230\n254#2:231\n254#2:232\n254#2:233\n774#3:234\n865#3,2:235\n1021#3,2:237\n*S KotlinDebug\n*F\n+ 1 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n39#1:230\n61#1:231\n100#1:232\n122#1:233\n150#1:234\n150#1:235,2\n177#1:237,2\n*E\n"})
public final class SpotSortAndQuotesHelper {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f51250f = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static int f51251g;

    /* JADX INFO: renamed from: h */
    public static int f51252h;

    /* JADX INFO: renamed from: i */
    public static int f51253i;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final FrameLayout f51254a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f51255b = "";

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f51256c = LazyKt.lazy(new Function0() { // from class: f30.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSortAndQuotesHelper.m63069i(this.f82856b);
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f51257d = LazyKt.lazy(new Function0() { // from class: f30.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSortAndQuotesHelper.m63070j(this.f82857b);
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f51258e = LazyKt.lazy(new Function0() { // from class: f30.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSortAndQuotesHelper.m63068h(this.f82858b);
        }
    });

    /* JADX INFO: compiled from: SpotSortAndQuotesHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/utils/SpotSortAndQuotesHelper$Companion;", "", "<init>", "()V", "isSortByName", "", "isSortByChangeRate", "isSortByPrice", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.utils.SpotSortAndQuotesHelper$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n204#2:329\n*E\n"})
    public static final class C25844a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(-C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.utils.SpotSortAndQuotesHelper$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n207#2:329\n*E\n"})
    public static final class C25845b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.utils.SpotSortAndQuotesHelper$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n174#2:329\n*E\n"})
    public static final class C25846c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t11).getShowSymbol(), ((TradeItemBean) t12).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.utils.SpotSortAndQuotesHelper$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n177#2:329\n*E\n"})
    public static final class C25847d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t12).getShowSymbol(), ((TradeItemBean) t11).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.utils.SpotSortAndQuotesHelper$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n188#2:329\n*E\n"})
    public static final class C25848e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues(Double.valueOf(-C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(-C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.utils.SpotSortAndQuotesHelper$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/spot/utils/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n193#2:329\n*E\n"})
    public static final class C25849f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues(Double.valueOf(C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final ImageView m63068h(SpotSortAndQuotesHelper spotSortAndQuotesHelper) {
        FrameLayout frameLayout = spotSortAndQuotesHelper.f51254a;
        if (frameLayout != null) {
            return (ImageView) frameLayout.findViewById(R$id.iv_change_rate);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final ImageView m63069i(SpotSortAndQuotesHelper spotSortAndQuotesHelper) {
        FrameLayout frameLayout = spotSortAndQuotesHelper.f51254a;
        if (frameLayout != null) {
            return (ImageView) frameLayout.findViewById(R$id.iv_name);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final ImageView m63070j(SpotSortAndQuotesHelper spotSortAndQuotesHelper) {
        FrameLayout frameLayout = spotSortAndQuotesHelper.f51254a;
        if (frameLayout != null) {
            return (ImageView) frameLayout.findViewById(R$id.iv_price);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Collection m63071u(SpotSortAndQuotesHelper spotSortAndQuotesHelper, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return spotSortAndQuotesHelper.m63085t(list, z11);
    }

    /* JADX INFO: renamed from: d */
    public final ImageView m63072d() {
        return (ImageView) this.f51258e.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final ImageView m63073e() {
        return (ImageView) this.f51256c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m63074f() {
        return (ImageView) this.f51257d.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF51255b() {
        return this.f51255b;
    }

    /* JADX INFO: renamed from: k */
    public final void m63076k(@NotNull String quotesKey) {
        Intrinsics.checkNotNullParameter(quotesKey, "quotesKey");
        this.f51255b = quotesKey;
    }

    /* JADX INFO: renamed from: l */
    public final void m63077l(boolean z11) {
        int i11;
        FrameLayout frameLayout = this.f51254a;
        if (frameLayout != null) {
            if (z11) {
                m63078m();
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m63078m() {
        FrameLayout frameLayout = this.f51254a;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        int i11 = f51251g % 3;
        if (i11 == 1) {
            ImageView imageViewM63073e = m63073e();
            if (imageViewM63073e != null) {
                imageViewM63073e.setImageResource(R$mipmap.ic_sort_up);
            }
        } else if (i11 != 2) {
            ImageView imageViewM63073e2 = m63073e();
            if (imageViewM63073e2 != null) {
                imageViewM63073e2.setImageResource(R$mipmap.ic_sort_default);
            }
        } else {
            ImageView imageViewM63073e3 = m63073e();
            if (imageViewM63073e3 != null) {
                imageViewM63073e3.setImageResource(R$mipmap.ic_sort_down);
            }
        }
        int i12 = f51253i % 3;
        if (i12 == 1) {
            ImageView imageViewM63074f = m63074f();
            if (imageViewM63074f != null) {
                imageViewM63074f.setImageResource(R$mipmap.ic_sort_down);
            }
        } else if (i12 != 2) {
            ImageView imageViewM63074f2 = m63074f();
            if (imageViewM63074f2 != null) {
                imageViewM63074f2.setImageResource(R$mipmap.ic_sort_default);
            }
        } else {
            ImageView imageViewM63074f3 = m63074f();
            if (imageViewM63074f3 != null) {
                imageViewM63074f3.setImageResource(R$mipmap.ic_sort_up);
            }
        }
        int i13 = f51252h % 3;
        if (i13 == 1) {
            ImageView imageViewM63072d = m63072d();
            if (imageViewM63072d != null) {
                imageViewM63072d.setImageResource(R$mipmap.ic_sort_down);
                return;
            }
            return;
        }
        if (i13 != 2) {
            ImageView imageViewM63072d2 = m63072d();
            if (imageViewM63072d2 != null) {
                imageViewM63072d2.setImageResource(R$mipmap.ic_sort_default);
                return;
            }
            return;
        }
        ImageView imageViewM63072d3 = m63072d();
        if (imageViewM63072d3 != null) {
            imageViewM63072d3.setImageResource(R$mipmap.ic_sort_up);
        }
    }

    /* JADX INFO: renamed from: n */
    public final Collection<TradeItemBean> m63079n(ArrayList<TradeItemBean> arrayList) {
        int i11 = f51252h % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new C25844a());
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new C25845b());
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final void m63080o() {
        FrameLayout frameLayout = this.f51254a;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        f51252h++;
        f51253i = 0;
        ImageView imageViewM63074f = m63074f();
        if (imageViewM63074f != null) {
            imageViewM63074f.setImageResource(R$mipmap.ic_sort_default);
        }
        f51251g = 0;
        ImageView imageViewM63073e = m63073e();
        if (imageViewM63073e != null) {
            imageViewM63073e.setImageResource(R$mipmap.ic_sort_default);
        }
        int i11 = f51252h % 3;
        if (i11 == 1) {
            ImageView imageViewM63072d = m63072d();
            if (imageViewM63072d != null) {
                imageViewM63072d.setImageResource(R$mipmap.ic_sort_down);
                return;
            }
            return;
        }
        if (i11 != 2) {
            ImageView imageViewM63072d2 = m63072d();
            if (imageViewM63072d2 != null) {
                imageViewM63072d2.setImageResource(R$mipmap.ic_sort_default);
                return;
            }
            return;
        }
        ImageView imageViewM63072d3 = m63072d();
        if (imageViewM63072d3 != null) {
            imageViewM63072d3.setImageResource(R$mipmap.ic_sort_up);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Collection<TradeItemBean> m63081p(ArrayList<TradeItemBean> arrayList) {
        int i11 = f51251g % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new C25846c());
            return arrayList;
        }
        if (i11 == 2 && arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C25847d());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final void m63082q() {
        FrameLayout frameLayout = this.f51254a;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        f51251g++;
        f51253i = 0;
        ImageView imageViewM63074f = m63074f();
        if (imageViewM63074f != null) {
            imageViewM63074f.setImageResource(R$mipmap.ic_sort_default);
        }
        f51252h = 0;
        ImageView imageViewM63072d = m63072d();
        if (imageViewM63072d != null) {
            imageViewM63072d.setImageResource(R$mipmap.ic_sort_default);
        }
        int i11 = f51251g % 3;
        if (i11 == 1) {
            ImageView imageViewM63073e = m63073e();
            if (imageViewM63073e != null) {
                imageViewM63073e.setImageResource(R$mipmap.ic_sort_up);
                return;
            }
            return;
        }
        if (i11 != 2) {
            ImageView imageViewM63073e2 = m63073e();
            if (imageViewM63073e2 != null) {
                imageViewM63073e2.setImageResource(R$mipmap.ic_sort_default);
                return;
            }
            return;
        }
        ImageView imageViewM63073e3 = m63073e();
        if (imageViewM63073e3 != null) {
            imageViewM63073e3.setImageResource(R$mipmap.ic_sort_down);
        }
    }

    /* JADX INFO: renamed from: r */
    public final Collection<TradeItemBean> m63083r(ArrayList<TradeItemBean> arrayList) {
        int i11 = f51253i % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new C25848e());
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new C25849f());
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final void m63084s() {
        FrameLayout frameLayout = this.f51254a;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        f51253i++;
        f51252h = 0;
        ImageView imageViewM63072d = m63072d();
        if (imageViewM63072d != null) {
            imageViewM63072d.setImageResource(R$mipmap.ic_sort_default);
        }
        f51251g = 0;
        ImageView imageViewM63073e = m63073e();
        if (imageViewM63073e != null) {
            imageViewM63073e.setImageResource(R$mipmap.ic_sort_default);
        }
        int i11 = f51253i % 3;
        if (i11 == 1) {
            ImageView imageViewM63074f = m63074f();
            if (imageViewM63074f != null) {
                imageViewM63074f.setImageResource(R$mipmap.ic_sort_down);
                return;
            }
            return;
        }
        if (i11 != 2) {
            ImageView imageViewM63074f2 = m63074f();
            if (imageViewM63074f2 != null) {
                imageViewM63074f2.setImageResource(R$mipmap.ic_sort_default);
                return;
            }
            return;
        }
        ImageView imageViewM63074f3 = m63074f();
        if (imageViewM63074f3 != null) {
            imageViewM63074f3.setImageResource(R$mipmap.ic_sort_up);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final Collection<TradeItemBean> m63085t(@NotNull List<? extends TradeItemBean> list, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<TradeItemBean> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(this.f51255b) || !z11) {
            arrayList.addAll(list);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((TradeItemBean) obj).getSymbolInfoEntity().getQuoteCurrency(), this.f51255b)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (f51251g > 0) {
            return m63081p(arrayList);
        }
        if (f51253i > 0) {
            return m63083r(arrayList);
        }
        return f51252h > 0 ? m63079n(arrayList) : arrayList;
    }

    public SpotSortAndQuotesHelper(@Nullable FrameLayout frameLayout) {
        this.f51254a = frameLayout;
    }
}
