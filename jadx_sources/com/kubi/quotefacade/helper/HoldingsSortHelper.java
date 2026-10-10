package com.kubi.quotefacade.helper;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.HoldingEntity;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41016c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HoldingsSortHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020'J\u0006\u0010*\u001a\u00020'J\u0006\u0010+\u001a\u00020'J$\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.002\b\b\u0002\u00101\u001a\u000202J&\u0010(\u001a\b\u0012\u0004\u0012\u00020.0-2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020.04j\b\u0012\u0004\u0012\u00020.`5H\u0002J.\u0010&\u001a\b\u0012\u0004\u0012\u00020.0-2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020.04j\b\u0012\u0004\u0012\u00020.`52\u0006\u00101\u001a\u000202H\u0002J.\u0010)\u001a\b\u0012\u0004\u0012\u00020.0-2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020.04j\b\u0012\u0004\u0012\u00020.`52\u0006\u00101\u001a\u000202H\u0002J&\u0010*\u001a\b\u0012\u0004\u0012\u00020.0-2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020.04j\b\u0012\u0004\u0012\u00020.`5H\u0002J\b\u00106\u001a\u00020\u0007H\u0002J\b\u00107\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\fR\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00068"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/HoldingsSortHelper;", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "isSortByAmount", "", "ivSortAmount", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvSortAmount", "()Landroid/widget/ImageView;", "ivSortAmount$delegate", "Lkotlin/Lazy;", "isSortByName", "ivSortName", "getIvSortName", "ivSortName$delegate", "isSortByPrice", "ivSortPrice", "getIvSortPrice", "ivSortPrice$delegate", "isSortByChangeRate", "ivSortChangeRate", "getIvSortChangeRate", "ivSortChangeRate$delegate", "sortType", "getSortType", "()I", "setSortType", "(I)V", "sortName", "", "getSortName", "()Ljava/lang/String;", "setSortName", "(Ljava/lang/String;)V", "sortByAmount", "", "sortByName", "sortByPrice", "sortByChangeRate", "resetDefaultForTop", "sortData", "", "Lcom/kubi/quotefacade/entity/HoldingEntity;", "list", "", "isAlphaSort", "", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSortUpResId", "getSortDownResId", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldingsSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1021#2,2:295\n*S KotlinDebug\n*F\n+ 1 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n206#1:295,2\n*E\n"})
public final class HoldingsSortHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FrameLayout f42082a;

    /* JADX INFO: renamed from: b */
    public int f42083b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f42084c;

    /* JADX INFO: renamed from: d */
    public int f42085d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f42086e;

    /* JADX INFO: renamed from: f */
    public int f42087f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f42088g;

    /* JADX INFO: renamed from: h */
    public int f42089h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f42090i;

    /* JADX INFO: renamed from: j */
    public int f42091j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f42092k;

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n220#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66647g(((HoldingEntity) t11).getValue())), Double.valueOf(C27039d.m66647g(((HoldingEntity) t12).getValue())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n221#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66647g(((HoldingEntity) t11).getValue())), Double.valueOf(-C27039d.m66647g(((HoldingEntity) t12).getValue())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n266#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66647g(((HoldingEntity) t11).getChangeRate())), Double.valueOf(C27039d.m66647g(((HoldingEntity) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n270#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66647g(((HoldingEntity) t11).getChangeRate())), Double.valueOf(-C27039d.m66647g(((HoldingEntity) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n202#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((HoldingEntity) t11).getSymbol(), ((HoldingEntity) t12).getSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n206#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((HoldingEntity) t12).getSymbol(), ((HoldingEntity) t11).getSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n235#2,5:329\n*E\n"})
    public static final class g<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42093b;

        public g(boolean z11) {
            this.f42093b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Comparable comparableM89950x;
            Comparable comparableValueOf;
            HoldingEntity holdingEntity = (HoldingEntity) t11;
            String strM89950x = null;
            if (this.f42093b) {
                comparableM89950x = Double.valueOf(C27039d.m66647g(holdingEntity.getCurrentPrice()));
            } else {
                BigDecimal currentPrice = holdingEntity.getCurrentPrice();
                if (currentPrice != null) {
                    String quoteCurrency = holdingEntity.getQuoteCurrency();
                    if (quoteCurrency == null) {
                        quoteCurrency = C41016c.m89965c();
                    }
                    comparableM89950x = C41014a.m89950x(C41014a.m89940n(currentPrice, quoteCurrency), null, null, 0, false, false, false, false, 127, null);
                } else {
                    comparableM89950x = null;
                }
            }
            HoldingEntity holdingEntity2 = (HoldingEntity) t12;
            if (this.f42093b) {
                comparableValueOf = Double.valueOf(C27039d.m66647g(holdingEntity2.getCurrentPrice()));
            } else {
                BigDecimal currentPrice2 = holdingEntity2.getCurrentPrice();
                if (currentPrice2 != null) {
                    String quoteCurrency2 = holdingEntity2.getQuoteCurrency();
                    if (quoteCurrency2 == null) {
                        quoteCurrency2 = C41016c.m89965c();
                    }
                    strM89950x = C41014a.m89950x(C41014a.m89940n(currentPrice2, quoteCurrency2), null, null, 0, false, false, false, false, 127, null);
                }
                comparableValueOf = strM89950x;
            }
            return ComparisonsKt.compareValues(comparableM89950x, comparableValueOf);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.r1$h */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n247#2,5:329\n*E\n"})
    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42094b;

        public h(boolean z11) {
            this.f42094b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Double dValueOf;
            Double dValueOf2;
            HoldingEntity holdingEntity = (HoldingEntity) t11;
            if (this.f42094b) {
                dValueOf = Double.valueOf(-C27039d.m66647g(holdingEntity.getCurrentPrice()));
            } else {
                BigDecimal currentPrice = holdingEntity.getCurrentPrice();
                if (currentPrice == null) {
                    currentPrice = new BigDecimal(0);
                }
                String quoteCurrency = holdingEntity.getQuoteCurrency();
                if (quoteCurrency == null) {
                    quoteCurrency = C41016c.m89965c();
                }
                dValueOf = Double.valueOf(-C41014a.m89940n(currentPrice, quoteCurrency));
            }
            HoldingEntity holdingEntity2 = (HoldingEntity) t12;
            if (this.f42094b) {
                dValueOf2 = Double.valueOf(-C27039d.m66647g(holdingEntity2.getCurrentPrice()));
            } else {
                BigDecimal currentPrice2 = holdingEntity2.getCurrentPrice();
                if (currentPrice2 == null) {
                    currentPrice2 = new BigDecimal(0);
                }
                String quoteCurrency2 = holdingEntity2.getQuoteCurrency();
                if (quoteCurrency2 == null) {
                    quoteCurrency2 = C41016c.m89965c();
                }
                dValueOf2 = Double.valueOf(-C41014a.m89940n(currentPrice2, quoteCurrency2));
            }
            return ComparisonsKt.compareValues(dValueOf, dValueOf2);
        }
    }

    public HoldingsSortHelper(@NotNull FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f42082a = container;
        this.f42084c = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.n1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsSortHelper.m52092k(this.f42030b);
            }
        });
        this.f42086e = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsSortHelper.m52094m(this.f42037b);
            }
        });
        this.f42088g = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.p1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsSortHelper.m52095n(this.f42043b);
            }
        });
        this.f42090i = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.q1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsSortHelper.m52093l(this.f42067b);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static final ImageView m52092k(HoldingsSortHelper holdingsSortHelper) {
        return (ImageView) holdingsSortHelper.f42082a.findViewById(R$id.iv_amount);
    }

    /* JADX INFO: renamed from: l */
    public static final ImageView m52093l(HoldingsSortHelper holdingsSortHelper) {
        return (ImageView) holdingsSortHelper.f42082a.findViewById(R$id.iv_change_rate);
    }

    /* JADX INFO: renamed from: m */
    public static final ImageView m52094m(HoldingsSortHelper holdingsSortHelper) {
        return (ImageView) holdingsSortHelper.f42082a.findViewById(R$id.iv_name);
    }

    /* JADX INFO: renamed from: n */
    public static final ImageView m52095n(HoldingsSortHelper holdingsSortHelper) {
        return (ImageView) holdingsSortHelper.f42082a.findViewById(R$id.iv_price);
    }

    /* JADX INFO: renamed from: e */
    public final ImageView m52096e() {
        return (ImageView) this.f42084c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final ImageView m52097f() {
        return (ImageView) this.f42090i.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final ImageView m52098g() {
        return (ImageView) this.f42086e.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final ImageView m52099h() {
        return (ImageView) this.f42088g.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m52100i() {
        return DayNightThemeManager.f28592a.m33187l() ? R$mipmap.ic_sort_down : R$mipmap.ic_sort_up;
    }

    /* JADX INFO: renamed from: j */
    public final int m52101j() {
        return DayNightThemeManager.f28592a.m33187l() ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down;
    }

    /* JADX INFO: renamed from: o */
    public final Collection<HoldingEntity> m52102o(ArrayList<HoldingEntity> arrayList, boolean z11) {
        if (z11) {
            int i11 = this.f42083b % 3;
            if (i11 == 1) {
                CollectionsKt.sortWith(arrayList, new b());
            } else if (i11 == 2) {
                CollectionsKt.sortWith(arrayList, new a());
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m52103p() {
        this.f42092k = "amount";
        this.f42083b++;
        this.f42087f = 0;
        ImageView imageViewM52099h = m52099h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52099h.setImageResource(i11);
        this.f42089h = 0;
        m52097f().setImageResource(i11);
        this.f42085d = 0;
        m52098g().setImageResource(i11);
        int i12 = this.f42083b % 3;
        if (i12 == 1) {
            this.f42091j = 2;
            m52096e().setImageResource(m52100i());
        } else if (i12 != 2) {
            this.f42091j = 0;
            m52096e().setImageResource(i11);
        } else {
            this.f42091j = 1;
            m52096e().setImageResource(m52101j());
        }
    }

    /* JADX INFO: renamed from: q */
    public final Collection<HoldingEntity> m52104q(ArrayList<HoldingEntity> arrayList) {
        int i11 = this.f42089h % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new d());
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new c());
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public final void m52105r() {
        this.f42092k = KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN;
        this.f42089h++;
        this.f42087f = 0;
        ImageView imageViewM52099h = m52099h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52099h.setImageResource(i11);
        this.f42083b = 0;
        m52096e().setImageResource(i11);
        this.f42085d = 0;
        m52098g().setImageResource(i11);
        int i12 = this.f42089h % 3;
        if (i12 == 1) {
            this.f42091j = 2;
            m52097f().setImageResource(m52100i());
        } else if (i12 != 2) {
            this.f42091j = 0;
            m52097f().setImageResource(i11);
        } else {
            this.f42091j = 1;
            m52097f().setImageResource(m52101j());
        }
    }

    /* JADX INFO: renamed from: s */
    public final Collection<HoldingEntity> m52106s(ArrayList<HoldingEntity> arrayList) {
        if (this.f42091j != 0) {
            int i11 = this.f42085d % 3;
            if (i11 == 1) {
                CollectionsKt.sortWith(arrayList, new e());
                return arrayList;
            }
            if (i11 == 2 && arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new f());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public final void m52107t() {
        this.f42092k = "name";
        this.f42085d++;
        this.f42087f = 0;
        ImageView imageViewM52099h = m52099h();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52099h.setImageResource(i11);
        this.f42089h = 0;
        m52097f().setImageResource(i11);
        this.f42083b = 0;
        m52096e().setImageResource(i11);
        int i12 = this.f42085d % 3;
        if (i12 == 1) {
            this.f42091j = 2;
            m52098g().setImageResource(m52101j());
        } else if (i12 != 2) {
            this.f42091j = 0;
            m52098g().setImageResource(i11);
        } else {
            this.f42091j = 1;
            m52098g().setImageResource(m52100i());
        }
    }

    /* JADX INFO: renamed from: u */
    public final Collection<HoldingEntity> m52108u(ArrayList<HoldingEntity> arrayList, boolean z11) {
        int i11 = this.f42087f % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new h(z11));
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new g(z11));
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public final void m52109v() {
        this.f42092k = FirebaseAnalytics.Param.PRICE;
        this.f42087f++;
        this.f42083b = 0;
        ImageView imageViewM52096e = m52096e();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52096e.setImageResource(i11);
        this.f42089h = 0;
        m52097f().setImageResource(i11);
        this.f42085d = 0;
        m52098g().setImageResource(i11);
        int i12 = this.f42087f % 3;
        if (i12 == 1) {
            this.f42091j = 2;
            m52099h().setImageResource(m52100i());
        } else if (i12 != 2) {
            this.f42091j = 0;
            m52099h().setImageResource(i11);
        } else {
            this.f42091j = 1;
            m52099h().setImageResource(m52101j());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final Collection<HoldingEntity> m52110w(@NotNull List<HoldingEntity> list, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<HoldingEntity> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        if (this.f42085d > 0) {
            return m52106s(arrayList);
        }
        if (this.f42083b > 0) {
            return m52102o(arrayList, z11);
        }
        if (this.f42087f > 0) {
            return m52108u(arrayList, z11);
        }
        return this.f42089h > 0 ? m52104q(arrayList) : arrayList;
    }
}
