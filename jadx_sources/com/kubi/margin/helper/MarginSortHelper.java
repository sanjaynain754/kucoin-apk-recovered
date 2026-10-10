package com.kubi.margin.helper;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$id;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.helper.MarginSortHelper;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginSortHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J(\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0%j\b\u0012\u0004\u0012\u00020\u001c`&H\u0002J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0%j\b\u0012\u0004\u0012\u00020\u001c`&2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0%j\b\u0012\u0004\u0012\u00020\u001c`&2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0%j\b\u0012\u0004\u0012\u00020\u001c`&2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0010\u0010\nR#\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\n¨\u0006*"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginSortHelper;", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "ivSortName", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvSortName", "()Landroid/widget/ImageView;", "ivSortName$delegate", "Lkotlin/Lazy;", "mQuotesKey", "", "ivSortPrice", "getIvSortPrice", "ivSortPrice$delegate", "ivSortChangeRate", "getIvSortChangeRate", "ivSortChangeRate$delegate", "showFilterView", "", "sortByName", "sortByPrice", "sortByChangeRate", "sortData", "", "Lcom/kubi/data/entity/TradeItemBean;", "list", "", "isFavor", "", "tradeType", "", "sortDefault", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setSortVisible", ViewProps.VISIBLE, "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n254#2:292\n254#2:293\n254#2:294\n254#2:295\n774#3:296\n865#3,2:297\n774#3:299\n865#3,2:300\n1021#3,2:302\n*S KotlinDebug\n*F\n+ 1 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n41#1:292\n80#1:293\n102#1:294\n124#1:295\n151#1:296\n151#1:297,2\n166#1:299\n166#1:300,2\n207#1:302,2\n*E\n"})
public final class MarginSortHelper {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f33031f = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static int f33032g;

    /* JADX INFO: renamed from: h */
    public static int f33033h;

    /* JADX INFO: renamed from: i */
    public static int f33034i;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FrameLayout f33035a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f33036b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f33037c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f33038d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f33039e;

    /* JADX INFO: compiled from: MarginSortHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginSortHelper$Companion;", "", "<init>", "()V", "isSortByName", "", "isSortByChangeRate", "isSortByPrice", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n263#2:329\n*E\n"})
    public static final class C17636a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n270#2:329\n*E\n"})
    public static final class C17637b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(-C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n203#2:329\n*E\n"})
    public static final class C17638c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t11).getShowSymbol(), ((TradeItemBean) t12).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n207#2:329\n*E\n"})
    public static final class C17639d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t12).getShowSymbol(), ((TradeItemBean) t11).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n230#2:329\n*E\n"})
    public static final class C17640e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues(Double.valueOf(C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n243#2:329\n*E\n"})
    public static final class C17641f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues(Double.valueOf(-C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(-C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.helper.MarginSortHelper$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginSortHelper.kt\ncom/kubi/margin/helper/MarginSortHelper\n*L\n1#1,328:1\n190#2:329\n*E\n"})
    public static final class C17642g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(!((TradeItemBean) t11).isTop()), Boolean.valueOf(!((TradeItemBean) t12).isTop()));
        }
    }

    /* JADX INFO: renamed from: B */
    public final Collection<TradeItemBean> m38378B(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = f33032g % 3;
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: hp.k0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginSortHelper.m38353D((TradeItemBean) obj);
                    }
                }, new Function1() { // from class: hp.l0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginSortHelper.m38354E((TradeItemBean) obj);
                    }
                }));
                return arrayList;
            }
            CollectionsKt.sortWith(arrayList, new C17638c());
            return arrayList;
        }
        if (i11 != 2) {
            m38383M(z11, arrayList);
            return arrayList;
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C17639d());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final Collection<TradeItemBean> m38380F(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = f33034i % 3;
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: hp.u0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginSortHelper.m38357J((TradeItemBean) obj);
                    }
                }, new Function1() { // from class: hp.j0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginSortHelper.m38358K((TradeItemBean) obj);
                    }
                }));
                return arrayList;
            }
            CollectionsKt.sortWith(arrayList, new C17641f());
            return arrayList;
        }
        if (i11 != 2) {
            m38383M(z11, arrayList);
            return arrayList;
        }
        if (z11) {
            CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: hp.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginSortHelper.m38355H((TradeItemBean) obj);
                }
            }, new Function1() { // from class: hp.t0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginSortHelper.m38356I((TradeItemBean) obj);
                }
            }));
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new C17640e());
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public final Collection<TradeItemBean> m38389v(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = f33033h % 3;
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: hp.q0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginSortHelper.m38377z((TradeItemBean) obj);
                    }
                }, new Function1() { // from class: hp.r0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginSortHelper.m38352A((TradeItemBean) obj);
                    }
                }));
                return arrayList;
            }
            CollectionsKt.sortWith(arrayList, new C17637b());
            return arrayList;
        }
        if (i11 != 2) {
            m38383M(z11, arrayList);
            return arrayList;
        }
        if (z11) {
            CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: hp.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginSortHelper.m38375x((TradeItemBean) obj);
                }
            }, new Function1() { // from class: hp.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginSortHelper.m38376y((TradeItemBean) obj);
                }
            }));
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new C17636a());
        return arrayList;
    }

    public MarginSortHelper(@NotNull FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f33035a = container;
        this.f33036b = LazyKt.lazy(new Function0() { // from class: hp.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSortHelper.m38373r(this.f85965b);
            }
        });
        this.f33037c = "";
        this.f33038d = LazyKt.lazy(new Function0() { // from class: hp.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSortHelper.m38374s(this.f85975b);
            }
        });
        this.f33039e = LazyKt.lazy(new Function0() { // from class: hp.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSortHelper.m38372q(this.f85979b);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Comparable m38352A(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(-C27039d.m66646f(it.getChangeRate()));
    }

    /* JADX INFO: renamed from: D */
    public static final Comparable m38353D(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: E */
    public static final Comparable m38354E(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String showSymbol = it.getShowSymbol();
        Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
        String upperCase = showSymbol.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX INFO: renamed from: H */
    public static final Comparable m38355H(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: I */
    public static final Comparable m38356I(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(C41014a.m89939m(it.getLastDealPrice(), it.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: J */
    public static final Comparable m38357J(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: K */
    public static final Comparable m38358K(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(-C41014a.m89939m(it.getLastDealPrice(), it.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: q */
    public static final ImageView m38372q(MarginSortHelper marginSortHelper) {
        return (ImageView) marginSortHelper.f33035a.findViewById(R$id.iv_change_rate);
    }

    /* JADX INFO: renamed from: r */
    public static final ImageView m38373r(MarginSortHelper marginSortHelper) {
        return (ImageView) marginSortHelper.f33035a.findViewById(R$id.iv_name);
    }

    /* JADX INFO: renamed from: s */
    public static final ImageView m38374s(MarginSortHelper marginSortHelper) {
        return (ImageView) marginSortHelper.f33035a.findViewById(R$id.iv_price);
    }

    /* JADX INFO: renamed from: x */
    public static final Comparable m38375x(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: y */
    public static final Comparable m38376y(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(C27039d.m66646f(it.getChangeRate()));
    }

    /* JADX INFO: renamed from: z */
    public static final Comparable m38377z(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: C */
    public final void m38379C() {
        if (this.f33035a.getVisibility() == 0) {
            f33032g++;
            f33034i = 0;
            ImageView imageViewM38386p = m38386p();
            int i11 = R$mipmap.ic_sort_default;
            imageViewM38386p.setImageResource(i11);
            f33033h = 0;
            m38384n().setImageResource(i11);
            int i12 = f33032g % 3;
            if (i12 == 1) {
                m38385o().setImageResource(R$mipmap.ic_sort_up);
            } else if (i12 != 2) {
                m38385o().setImageResource(i11);
            } else {
                m38385o().setImageResource(R$mipmap.ic_sort_down);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m38381G() {
        if (this.f33035a.getVisibility() == 0) {
            f33034i++;
            f33033h = 0;
            ImageView imageViewM38384n = m38384n();
            int i11 = R$mipmap.ic_sort_default;
            imageViewM38384n.setImageResource(i11);
            f33032g = 0;
            m38385o().setImageResource(i11);
            int i12 = f33034i % 3;
            if (i12 == 1) {
                m38386p().setImageResource(R$mipmap.ic_sort_down);
            } else if (i12 != 2) {
                m38386p().setImageResource(i11);
            } else {
                m38386p().setImageResource(R$mipmap.ic_sort_up);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final Collection<TradeItemBean> m38382L(@NotNull List<? extends TradeItemBean> list, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<TradeItemBean> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            TradeItemBean tradeItemBean = (TradeItemBean) obj;
            boolean zIsMarginEnabled = true;
            if (i11 == 1) {
                zIsMarginEnabled = tradeItemBean.getSymbolInfoEntity().isMarginEnabled();
            } else if (i11 == 2) {
                zIsMarginEnabled = tradeItemBean.getSymbolInfoEntity().isIsolatedMarginEnabled();
            }
            if (zIsMarginEnabled) {
                arrayList2.add(obj);
            }
        }
        if (TextUtils.isEmpty(this.f33037c)) {
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((TradeItemBean) obj2).getSymbolInfoEntity().getQuoteCurrency(), this.f33037c)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList.addAll(arrayList3);
        }
        if (f33032g > 0) {
            return m38378B(arrayList, z11);
        }
        if (f33034i > 0) {
            return m38380F(arrayList, z11);
        }
        if (f33033h > 0) {
            return m38389v(arrayList, z11);
        }
        m38383M(z11, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public final void m38383M(boolean z11, ArrayList<TradeItemBean> arrayList) {
        if (z11) {
            CollectionsKt.sortWith(arrayList, new C17642g());
        }
    }

    /* JADX INFO: renamed from: n */
    public final ImageView m38384n() {
        return (ImageView) this.f33039e.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final ImageView m38385o() {
        return (ImageView) this.f33036b.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final ImageView m38386p() {
        return (ImageView) this.f33038d.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m38387t(boolean z11) {
        this.f33035a.setVisibility(z11 ? 0 : 8);
        m38388u();
    }

    /* JADX INFO: renamed from: u */
    public final void m38388u() {
        if (this.f33035a.getVisibility() == 0) {
            int i11 = f33032g % 3;
            if (i11 == 1) {
                m38385o().setImageResource(R$mipmap.ic_sort_up);
            } else if (i11 != 2) {
                m38385o().setImageResource(R$mipmap.ic_sort_default);
            } else {
                m38385o().setImageResource(R$mipmap.ic_sort_down);
            }
            int i12 = f33034i % 3;
            if (i12 == 1) {
                m38386p().setImageResource(R$mipmap.ic_sort_down);
            } else if (i12 != 2) {
                m38386p().setImageResource(R$mipmap.ic_sort_default);
            } else {
                m38386p().setImageResource(R$mipmap.ic_sort_up);
            }
            int i13 = f33033h % 3;
            if (i13 == 1) {
                m38384n().setImageResource(R$mipmap.ic_sort_down);
            } else if (i13 != 2) {
                m38384n().setImageResource(R$mipmap.ic_sort_default);
            } else {
                m38384n().setImageResource(R$mipmap.ic_sort_up);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m38390w() {
        if (this.f33035a.getVisibility() == 0) {
            f33033h++;
            f33034i = 0;
            ImageView imageViewM38386p = m38386p();
            int i11 = R$mipmap.ic_sort_default;
            imageViewM38386p.setImageResource(i11);
            f33032g = 0;
            m38385o().setImageResource(i11);
            int i12 = f33033h % 3;
            if (i12 == 1) {
                m38384n().setImageResource(R$mipmap.ic_sort_down);
            } else if (i12 != 2) {
                m38384n().setImageResource(i11);
            } else {
                m38384n().setImageResource(R$mipmap.ic_sort_up);
            }
        }
    }
}
