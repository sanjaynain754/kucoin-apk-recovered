package com.kubi.tradingbotkit.util;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpotSortAndQuotesHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010!\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$H\u0002J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020 J\u000e\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR#\u0010\u0012\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\f¨\u0006*"}, m90084d2 = {"Lcom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper;", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "mQuotesKey", "", "ivSortName", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvSortName", "()Landroid/widget/ImageView;", "ivSortName$delegate", "Lkotlin/Lazy;", "ivSortPrice", "getIvSortPrice", "ivSortPrice$delegate", "ivSortChangeRate", "getIvSortChangeRate", "ivSortChangeRate$delegate", "sortByName", "", "showFilterView", "sortByPrice", "sortByChangeRate", "sortData", "", "Lcom/kubi/data/entity/TradeItemBean;", "list", "", "isFavor", "", "sortDefault", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setSortVisible", ViewProps.VISIBLE, "setQuotesKey", "quotesKey", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSortAndQuotesHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,299:1\n254#2:300\n254#2:301\n254#2:302\n254#2:303\n774#3:304\n865#3,2:305\n1021#3,2:307\n*S KotlinDebug\n*F\n+ 1 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n39#1:300\n61#1:301\n100#1:302\n122#1:303\n147#1:304\n147#1:305,2\n211#1:307,2\n*E\n"})
public final class SpotSortAndQuotesHelper {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f52489f = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static int f52490g;

    /* JADX INFO: renamed from: h */
    public static int f52491h;

    /* JADX INFO: renamed from: i */
    public static int f52492i;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FrameLayout f52493a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f52494b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f52495c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f52496d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f52497e;

    /* JADX INFO: compiled from: SpotSortAndQuotesHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper$Companion;", "", "<init>", "()V", "isSortByName", "", "isSortByChangeRate", "isSortByPrice", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n267#2:329\n*E\n"})
    public static final class C26239a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n274#2:329\n*E\n"})
    public static final class C26240b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(-C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n207#2:329\n*E\n"})
    public static final class C26241c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t11).getShowSymbol(), ((TradeItemBean) t12).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n211#2:329\n*E\n"})
    public static final class C26242d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t12).getShowSymbol(), ((TradeItemBean) t11).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n234#2:329\n*E\n"})
    public static final class C26243e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues(Double.valueOf(C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n247#2:329\n*E\n"})
    public static final class C26244f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues(Double.valueOf(-C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(-C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.util.SpotSortAndQuotesHelper$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotSortAndQuotesHelper.kt\ncom/kubi/tradingbotkit/util/SpotSortAndQuotesHelper\n*L\n1#1,328:1\n194#2:329\n*E\n"})
    public static final class C26245g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t12;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t11;
            return ComparisonsKt.compareValues(Double.valueOf(C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), Double.valueOf(C41014a.m89939m(tradeItemBean2.getValue(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: D */
    public final Collection<TradeItemBean> m64309D(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = f52490g % 3;
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: v50.o
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSortAndQuotesHelper.m64282F((TradeItemBean) obj);
                    }
                }, new Function1() { // from class: v50.p
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSortAndQuotesHelper.m64283G((TradeItemBean) obj);
                    }
                }));
                return arrayList;
            }
            CollectionsKt.sortWith(arrayList, new C26241c());
            return arrayList;
        }
        if (i11 != 2) {
            m64314O(z11, arrayList);
            return arrayList;
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C26242d());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final Collection<TradeItemBean> m64311H(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = f52492i % 3;
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: v50.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSortAndQuotesHelper.m64286L((TradeItemBean) obj);
                    }
                }, new Function1() { // from class: v50.n
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSortAndQuotesHelper.m64287M((TradeItemBean) obj);
                    }
                }));
                return arrayList;
            }
            CollectionsKt.sortWith(arrayList, new C26244f());
            return arrayList;
        }
        if (i11 != 2) {
            m64314O(z11, arrayList);
            return arrayList;
        }
        if (z11) {
            CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: v50.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotSortAndQuotesHelper.m64284J((TradeItemBean) obj);
                }
            }, new Function1() { // from class: v50.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotSortAndQuotesHelper.m64285K((TradeItemBean) obj);
                }
            }));
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new C26243e());
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public final Collection<TradeItemBean> m64320x(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = f52491h % 3;
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: v50.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSortAndQuotesHelper.m64280B((TradeItemBean) obj);
                    }
                }, new Function1() { // from class: v50.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSortAndQuotesHelper.m64281C((TradeItemBean) obj);
                    }
                }));
                return arrayList;
            }
            CollectionsKt.sortWith(arrayList, new C26240b());
            return arrayList;
        }
        if (i11 != 2) {
            m64314O(z11, arrayList);
            return arrayList;
        }
        if (z11) {
            CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: v50.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotSortAndQuotesHelper.m64308z((TradeItemBean) obj);
                }
            }, new Function1() { // from class: v50.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotSortAndQuotesHelper.m64279A((TradeItemBean) obj);
                }
            }));
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new C26239a());
        return arrayList;
    }

    public SpotSortAndQuotesHelper(@NotNull FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f52493a = container;
        this.f52494b = "";
        this.f52495c = LazyKt.lazy(new Function0() { // from class: v50.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSortAndQuotesHelper.m64306t(this.f102464b);
            }
        });
        this.f52496d = LazyKt.lazy(new Function0() { // from class: v50.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSortAndQuotesHelper.m64307u(this.f102466b);
            }
        });
        this.f52497e = LazyKt.lazy(new Function0() { // from class: v50.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSortAndQuotesHelper.m64305s(this.f102467b);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Comparable m64279A(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(C27039d.m66646f(it.getChangeRate()));
    }

    /* JADX INFO: renamed from: B */
    public static final Comparable m64280B(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: C */
    public static final Comparable m64281C(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(-C27039d.m66646f(it.getChangeRate()));
    }

    /* JADX INFO: renamed from: F */
    public static final Comparable m64282F(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: G */
    public static final Comparable m64283G(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String showSymbol = it.getShowSymbol();
        Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
        String upperCase = showSymbol.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX INFO: renamed from: J */
    public static final Comparable m64284J(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: K */
    public static final Comparable m64285K(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(C41014a.m89939m(it.getLastDealPrice(), it.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: L */
    public static final Comparable m64286L(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: M */
    public static final Comparable m64287M(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(-C41014a.m89939m(it.getLastDealPrice(), it.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: s */
    public static final ImageView m64305s(SpotSortAndQuotesHelper spotSortAndQuotesHelper) {
        return (ImageView) spotSortAndQuotesHelper.f52493a.findViewById(R$id.iv_change_rate);
    }

    /* JADX INFO: renamed from: t */
    public static final ImageView m64306t(SpotSortAndQuotesHelper spotSortAndQuotesHelper) {
        return (ImageView) spotSortAndQuotesHelper.f52493a.findViewById(R$id.iv_name);
    }

    /* JADX INFO: renamed from: u */
    public static final ImageView m64307u(SpotSortAndQuotesHelper spotSortAndQuotesHelper) {
        return (ImageView) spotSortAndQuotesHelper.f52493a.findViewById(R$id.iv_price);
    }

    /* JADX INFO: renamed from: z */
    public static final Comparable m64308z(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isTop());
    }

    /* JADX INFO: renamed from: E */
    public final void m64310E() {
        if (this.f52493a.getVisibility() == 0) {
            f52490g++;
            f52492i = 0;
            ImageView imageViewM64317r = m64317r();
            int i11 = R$mipmap.ic_sort_default;
            imageViewM64317r.setImageResource(i11);
            f52491h = 0;
            m64315p().setImageResource(i11);
            int i12 = f52490g % 3;
            if (i12 == 1) {
                m64316q().setImageResource(R$mipmap.ic_sort_up);
            } else if (i12 != 2) {
                m64316q().setImageResource(i11);
            } else {
                m64316q().setImageResource(R$mipmap.ic_sort_down);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m64312I() {
        if (this.f52493a.getVisibility() == 0) {
            f52492i++;
            f52491h = 0;
            ImageView imageViewM64315p = m64315p();
            int i11 = R$mipmap.ic_sort_default;
            imageViewM64315p.setImageResource(i11);
            f52490g = 0;
            m64316q().setImageResource(i11);
            int i12 = f52492i % 3;
            if (i12 == 1) {
                m64317r().setImageResource(R$mipmap.ic_sort_down);
            } else if (i12 != 2) {
                m64317r().setImageResource(i11);
            } else {
                m64317r().setImageResource(R$mipmap.ic_sort_up);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final Collection<TradeItemBean> m64313N(@NotNull List<? extends TradeItemBean> list, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<TradeItemBean> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(this.f52494b)) {
            arrayList.addAll(list);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((TradeItemBean) obj).getSymbolInfoEntity().getQuoteCurrency(), this.f52494b)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (f52490g > 0) {
            return m64309D(arrayList, z11);
        }
        if (f52492i > 0) {
            return m64311H(arrayList, z11);
        }
        if (f52491h > 0) {
            return m64320x(arrayList, z11);
        }
        m64314O(z11, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final void m64314O(boolean z11, ArrayList<TradeItemBean> arrayList) {
        if (!z11) {
            CollectionsKt.sortWith(arrayList, new C26245g());
        } else {
            final Function2 function2 = new Function2() { // from class: v50.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(SpotSortAndQuotesHelper.m64288P((TradeItemBean) obj, (TradeItemBean) obj2));
                }
            };
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: v50.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SpotSortAndQuotesHelper.m64289Q(function2, obj, obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final ImageView m64315p() {
        return (ImageView) this.f52497e.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final ImageView m64316q() {
        return (ImageView) this.f52495c.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final ImageView m64317r() {
        return (ImageView) this.f52496d.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final void m64318v(boolean z11) {
        this.f52493a.setVisibility(z11 ? 0 : 8);
        m64319w();
    }

    /* JADX INFO: renamed from: w */
    public final void m64319w() {
        if (this.f52493a.getVisibility() == 0) {
            int i11 = f52490g % 3;
            if (i11 == 1) {
                m64316q().setImageResource(R$mipmap.ic_sort_up);
            } else if (i11 != 2) {
                m64316q().setImageResource(R$mipmap.ic_sort_default);
            } else {
                m64316q().setImageResource(R$mipmap.ic_sort_down);
            }
            int i12 = f52492i % 3;
            if (i12 == 1) {
                m64317r().setImageResource(R$mipmap.ic_sort_down);
            } else if (i12 != 2) {
                m64317r().setImageResource(R$mipmap.ic_sort_default);
            } else {
                m64317r().setImageResource(R$mipmap.ic_sort_up);
            }
            int i13 = f52491h % 3;
            if (i13 == 1) {
                m64315p().setImageResource(R$mipmap.ic_sort_down);
            } else if (i13 != 2) {
                m64315p().setImageResource(R$mipmap.ic_sort_default);
            } else {
                m64315p().setImageResource(R$mipmap.ic_sort_up);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m64321y() {
        if (this.f52493a.getVisibility() == 0) {
            f52491h++;
            f52492i = 0;
            ImageView imageViewM64317r = m64317r();
            int i11 = R$mipmap.ic_sort_default;
            imageViewM64317r.setImageResource(i11);
            f52490g = 0;
            m64316q().setImageResource(i11);
            int i12 = f52491h % 3;
            if (i12 == 1) {
                m64315p().setImageResource(R$mipmap.ic_sort_down);
            } else if (i12 != 2) {
                m64315p().setImageResource(i11);
            } else {
                m64315p().setImageResource(R$mipmap.ic_sort_up);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static final int m64288P(TradeItemBean tradeItemBean, TradeItemBean tradeItemBean2) {
        if (tradeItemBean2.isTop() == tradeItemBean.isTop()) {
            if (C41014a.m89939m(tradeItemBean2.getValue(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency()) == C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())) {
                String showSymbol = tradeItemBean.getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                char cFirst = StringsKt.first(showSymbol);
                String showSymbol2 = tradeItemBean.getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol2, "getShowSymbol(...)");
                char cFirst2 = StringsKt.first(showSymbol2);
                if (cFirst == '0') {
                    cFirst2 = (char) (cFirst2 + '\n');
                }
                String showSymbol3 = tradeItemBean2.getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol3, "getShowSymbol(...)");
                char cFirst3 = StringsKt.first(showSymbol3);
                String showSymbol4 = tradeItemBean2.getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol4, "getShowSymbol(...)");
                char cFirst4 = StringsKt.first(showSymbol4);
                if (cFirst3 == '0') {
                    cFirst4 = (char) (cFirst4 + '\n');
                }
                return Intrinsics.compare((int) cFirst2, (int) cFirst4);
            }
            return Double.compare(C41014a.m89939m(tradeItemBean2.getValue(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency()), C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
        }
        return Boolean.compare(tradeItemBean2.isTop(), tradeItemBean.isTop());
    }

    /* JADX INFO: renamed from: Q */
    public static final int m64289Q(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }
}
