package com.kubi.quotefacade.helper;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.AlphaFavEntity;
import com.kubi.quotefacade.market.sort.SymbolsSortType;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CoinListSortHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000201J\u0006\u00103\u001a\u000201J\u0006\u00104\u001a\u000201J\u000e\u00105\u001a\u0002012\u0006\u00106\u001a\u00020(J\u0010\u00107\u001a\u0002012\b\b\u0002\u00108\u001a\u000209J\u0010\u0010:\u001a\u0002012\b\b\u0002\u00108\u001a\u000209J\u0010\u0010;\u001a\u0002012\b\b\u0002\u00108\u001a\u000209J\u0006\u0010<\u001a\u000201J$\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0A2\b\b\u0002\u0010B\u001a\u000209J.\u00102\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0Dj\b\u0012\u0004\u0012\u00020?`E2\u0006\u0010B\u001a\u000209H\u0002J.\u00100\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0Dj\b\u0012\u0004\u0012\u00020?`E2\u0006\u0010B\u001a\u000209H\u0002J.\u00103\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0Dj\b\u0012\u0004\u0012\u00020?`E2\u0006\u0010B\u001a\u000209H\u0002J.\u00107\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0Dj\b\u0012\u0004\u0012\u00020?`E2\u0006\u0010B\u001a\u000209H\u0002J&\u0010:\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0Dj\b\u0012\u0004\u0012\u00020?`EH\u0002J&\u0010;\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0Dj\b\u0012\u0004\u0012\u00020?`EH\u0002J\b\u0010F\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\fR\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\fR#\u0010\u001b\u001a\n \n*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010.\u001a\u00020(2\u0006\u0010-\u001a\u00020(@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*¨\u0006H"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/CoinListSortHelper;", "", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "isSortByAmount", "", "ivSortAmount", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvSortAmount", "()Landroid/widget/ImageView;", "ivSortAmount$delegate", "Lkotlin/Lazy;", "isSortByName", "ivSortName", "getIvSortName", "ivSortName$delegate", "isSortByPrice", "ivSortPrice", "getIvSortPrice", "ivSortPrice$delegate", "isSortByChangeRate", "ivSortChangeRate", "getIvSortChangeRate", "ivSortChangeRate$delegate", "tvSortChangeRate", "Lcom/kubi/resources/widget/BaseTextView;", "getTvSortChangeRate", "()Lcom/kubi/resources/widget/BaseTextView;", "tvSortChangeRate$delegate", "isSortByFundingRate", "isSortByMarketCap", "sortType", "getSortType", "()I", "setSortType", "(I)V", "sortName", "Lcom/kubi/quotefacade/market/sort/SymbolsSortType;", "getSortName", "()Lcom/kubi/quotefacade/market/sort/SymbolsSortType;", "setSortName", "(Lcom/kubi/quotefacade/market/sort/SymbolsSortType;)V", "value", "customRightSortName", "getCustomRightSortName", "sortByAmount", "", "sortByName", "sortByPrice", "changeCustomSortType", "updateCustomSortTypeLabel", "customSortType", "sortByChangeRate", "initialDefault", "", "sortByFundingRate", "sortByMarketCap", "resetDefaultForTop", "sortData", "", "Lcom/kubi/data/entity/TradeItemBean;", "list", "", "isAlphaSort", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSortUpResId", "getSortDownResId", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinListSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,483:1\n1021#2,2:484\n*S KotlinDebug\n*F\n+ 1 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n344#1:484,2\n*E\n"})
public final class CoinListSortHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FrameLayout f42007a;

    /* JADX INFO: renamed from: b */
    public int f42008b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f42009c;

    /* JADX INFO: renamed from: d */
    public int f42010d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f42011e;

    /* JADX INFO: renamed from: f */
    public int f42012f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f42013g;

    /* JADX INFO: renamed from: h */
    public int f42014h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f42015i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f42016j;

    /* JADX INFO: renamed from: k */
    public int f42017k;

    /* JADX INFO: renamed from: l */
    public int f42018l;

    /* JADX INFO: renamed from: m */
    public int f42019m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public SymbolsSortType f42020n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public SymbolsSortType f42021o;

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n360#2,3:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42022b;

        public b(boolean z11) {
            this.f42022b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42022b && (tradeItemBean instanceof AlphaFavEntity)) ? Double.valueOf(C27039d.m66647g(((AlphaFavEntity) tradeItemBean).getItemEntity().getTradingVolume())) : Double.valueOf(C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), (this.f42022b && (tradeItemBean2 instanceof AlphaFavEntity)) ? Double.valueOf(C27039d.m66647g(((AlphaFavEntity) tradeItemBean2).getItemEntity().getTradingVolume())) : Double.valueOf(C41014a.m89939m(tradeItemBean2.getValue(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n366#2,3:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42023b;

        public c(boolean z11) {
            this.f42023b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42023b && (tradeItemBean instanceof AlphaFavEntity)) ? Double.valueOf(-C27039d.m66647g(((AlphaFavEntity) tradeItemBean).getItemEntity().getTradingVolume())) : Double.valueOf(-C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), (this.f42023b && (tradeItemBean2 instanceof AlphaFavEntity)) ? Double.valueOf(-C27039d.m66647g(((AlphaFavEntity) tradeItemBean2).getItemEntity().getTradingVolume())) : Double.valueOf(-C41014a.m89939m(tradeItemBean2.getValue(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n402#2,3:329\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42024b;

        public d(boolean z11) {
            this.f42024b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42024b && (tradeItemBean instanceof AlphaFavEntity)) ? Double.valueOf(C27039d.m66647g(((AlphaFavEntity) tradeItemBean).getItemEntity().getPriceRate())) : Double.valueOf(C27039d.m66646f(tradeItemBean.getChangeRate())), (this.f42024b && (tradeItemBean2 instanceof AlphaFavEntity)) ? Double.valueOf(C27039d.m66647g(((AlphaFavEntity) tradeItemBean2).getItemEntity().getPriceRate())) : Double.valueOf(C27039d.m66646f(tradeItemBean2.getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n408#2,3:329\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42025b;

        public e(boolean z11) {
            this.f42025b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42025b && (tradeItemBean instanceof AlphaFavEntity)) ? Double.valueOf(-C27039d.m66647g(((AlphaFavEntity) tradeItemBean).getItemEntity().getPriceRate())) : Double.valueOf(-C27039d.m66646f(tradeItemBean.getChangeRate())), (this.f42025b && (tradeItemBean2 instanceof AlphaFavEntity)) ? Double.valueOf(-C27039d.m66647g(((AlphaFavEntity) tradeItemBean2).getItemEntity().getPriceRate())) : Double.valueOf(-C27039d.m66646f(tradeItemBean2.getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n422#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(((TradeItemBean) t11).fundingRate == null), Boolean.valueOf(((TradeItemBean) t12).fundingRate == null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n426#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(((TradeItemBean) t11).fundingRate == null), Boolean.valueOf(((TradeItemBean) t12).fundingRate == null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$h */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n436#2:329\n*E\n"})
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(((TradeItemBean) t11).fundingRate == null), Boolean.valueOf(((TradeItemBean) t12).fundingRate == null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$i */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n453#2:329\n*E\n"})
    public static final class i<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(((TradeItemBean) t11).marketCap == null), Boolean.valueOf(((TradeItemBean) t12).marketCap == null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$j */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n461#2:329\n*E\n"})
    public static final class j<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(((TradeItemBean) t11).marketCap == null), Boolean.valueOf(((TradeItemBean) t12).marketCap == null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$k */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n339#2,3:329\n*E\n"})
    public static final class k<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42026b;

        public k(boolean z11) {
            this.f42026b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42026b && (tradeItemBean instanceof AlphaFavEntity)) ? ((AlphaFavEntity) tradeItemBean).getItemEntity().getDisplayToken() : tradeItemBean.getShowSymbol(), (this.f42026b && (tradeItemBean2 instanceof AlphaFavEntity)) ? ((AlphaFavEntity) tradeItemBean2).getItemEntity().getDisplayToken() : tradeItemBean2.getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$l */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n345#2,3:329\n*E\n"})
    public static final class l<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42027b;

        public l(boolean z11) {
            this.f42027b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t12;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t11;
            return ComparisonsKt.compareValues((this.f42027b && (tradeItemBean instanceof AlphaFavEntity)) ? ((AlphaFavEntity) tradeItemBean).getItemEntity().getDisplayToken() : tradeItemBean.getShowSymbol(), (this.f42027b && (tradeItemBean2 instanceof AlphaFavEntity)) ? ((AlphaFavEntity) tradeItemBean2).getItemEntity().getDisplayToken() : tradeItemBean2.getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$m */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n381#2,3:329\n*E\n"})
    public static final class m<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42028b;

        public m(boolean z11) {
            this.f42028b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42028b && (tradeItemBean instanceof AlphaFavEntity)) ? Double.valueOf(C27039d.m66647g(((AlphaFavEntity) tradeItemBean).getItemEntity().getPrice())) : Double.valueOf(C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), (this.f42028b && (tradeItemBean2 instanceof AlphaFavEntity)) ? Double.valueOf(C27039d.m66647g(((AlphaFavEntity) tradeItemBean2).getItemEntity().getPrice())) : Double.valueOf(C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$n */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n387#2,3:329\n*E\n"})
    public static final class n<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f42029b;

        public n(boolean z11) {
            this.f42029b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            return ComparisonsKt.compareValues((this.f42029b && (tradeItemBean instanceof AlphaFavEntity)) ? Double.valueOf(-C27039d.m66647g(((AlphaFavEntity) tradeItemBean).getItemEntity().getPrice())) : Double.valueOf(-C41014a.m89939m(tradeItemBean.getLastDealPrice(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency())), (this.f42029b && (tradeItemBean2 instanceof AlphaFavEntity)) ? Double.valueOf(-C27039d.m66647g(((AlphaFavEntity) tradeItemBean2).getItemEntity().getPrice())) : Double.valueOf(-C41014a.m89939m(tradeItemBean2.getLastDealPrice(), tradeItemBean2.getSymbolInfoEntity().getQuoteCurrency())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.n0$a */
    /* JADX INFO: compiled from: CoinListSortHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SymbolsSortType.values().length];
            try {
                iArr[SymbolsSortType.CHANGE_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SymbolsSortType.FUNDING_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SymbolsSortType.MARKET_CAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoinListSortHelper(@NotNull FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f42007a = container;
        this.f42009c = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinListSortHelper.m51971F(this.f42097b);
            }
        });
        this.f42011e = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinListSortHelper.m51973H(this.f41965b);
            }
        });
        this.f42013g = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinListSortHelper.m51974I(this.f41974b);
            }
        });
        this.f42015i = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinListSortHelper.m51972G(this.f41979b);
            }
        });
        this.f42016j = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.helper.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinListSortHelper.m52012q0(this.f41985b);
            }
        });
        this.f42020n = SymbolsSortType.DEFAULT;
        this.f42021o = SymbolsSortType.CHANGE_RATE;
    }

    /* JADX INFO: renamed from: F */
    public static final ImageView m51971F(CoinListSortHelper coinListSortHelper) {
        return (ImageView) coinListSortHelper.f42007a.findViewById(R$id.iv_amount);
    }

    /* JADX INFO: renamed from: G */
    public static final ImageView m51972G(CoinListSortHelper coinListSortHelper) {
        return (ImageView) coinListSortHelper.f42007a.findViewById(R$id.iv_change_rate);
    }

    /* JADX INFO: renamed from: H */
    public static final ImageView m51973H(CoinListSortHelper coinListSortHelper) {
        return (ImageView) coinListSortHelper.f42007a.findViewById(R$id.iv_name);
    }

    /* JADX INFO: renamed from: I */
    public static final ImageView m51974I(CoinListSortHelper coinListSortHelper) {
        return (ImageView) coinListSortHelper.f42007a.findViewById(R$id.iv_price);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m51975N(CoinListSortHelper coinListSortHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        coinListSortHelper.m52025M(z11);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m51976Q(CoinListSortHelper coinListSortHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        coinListSortHelper.m52027P(z11);
    }

    /* JADX INFO: renamed from: R */
    public static final Double m51977R(TradeItemBean tradeItemBean) {
        return Double.valueOf(C27039d.m66647g(tradeItemBean.fundingRate));
    }

    /* JADX INFO: renamed from: V */
    public static final Double m51981V(TradeItemBean tradeItemBean) {
        return Double.valueOf(-C27039d.m66647g(tradeItemBean.fundingRate));
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m51987b0(CoinListSortHelper coinListSortHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        coinListSortHelper.m52029a0(z11);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Double m51989c0(TradeItemBean tradeItemBean) {
        return Double.valueOf(C27039d.m66647g(tradeItemBean.marketCap));
    }

    /* JADX INFO: renamed from: g0 */
    public static final Double m51997g0(TradeItemBean tradeItemBean) {
        return Double.valueOf(-C27039d.m66647g(tradeItemBean.marketCap));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Collection m52010p0(CoinListSortHelper coinListSortHelper, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return coinListSortHelper.m52034o0(list, z11);
    }

    /* JADX INFO: renamed from: q0 */
    public static final BaseTextView m52012q0(CoinListSortHelper coinListSortHelper) {
        return (BaseTextView) coinListSortHelper.f42007a.findViewById(R$id.tv_sort_change_rate);
    }

    /* JADX INFO: renamed from: A */
    public final ImageView m52017A() {
        return (ImageView) this.f42013g.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final int m52018B() {
        return R$mipmap.ic_sort_down;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final SymbolsSortType getF42020n() {
        return this.f42020n;
    }

    /* JADX INFO: renamed from: D */
    public final int m52020D() {
        return R$mipmap.ic_sort_up;
    }

    /* JADX INFO: renamed from: E */
    public final BaseTextView m52021E() {
        return (BaseTextView) this.f42016j.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final Collection<TradeItemBean> m52022J(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = this.f42008b % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new c(z11));
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new b(z11));
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public final void m52023K() {
        this.f42020n = SymbolsSortType.AMOUNT;
        this.f42008b++;
        this.f42012f = 0;
        ImageView imageViewM52017A = m52017A();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52017A.setImageResource(i11);
        this.f42014h = 0;
        this.f42017k = 0;
        this.f42018l = 0;
        m52039y().setImageResource(i11);
        this.f42010d = 0;
        m52040z().setImageResource(i11);
        int i12 = this.f42008b % 3;
        if (i12 == 1) {
            this.f42019m = 2;
            m52038x().setImageResource(m52018B());
        } else if (i12 != 2) {
            this.f42019m = 0;
            m52038x().setImageResource(i11);
        } else {
            this.f42019m = 1;
            m52038x().setImageResource(m52020D());
        }
    }

    /* JADX INFO: renamed from: L */
    public final Collection<TradeItemBean> m52024L(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = this.f42014h % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new e(z11));
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new d(z11));
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public final void m52025M(boolean z11) {
        SymbolsSortType symbolsSortType = SymbolsSortType.CHANGE_RATE;
        this.f42020n = symbolsSortType;
        this.f42021o = symbolsSortType;
        this.f42014h = z11 ? 0 : this.f42014h + 1;
        this.f42012f = 0;
        ImageView imageViewM52017A = m52017A();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52017A.setImageResource(i11);
        this.f42008b = 0;
        m52038x().setImageResource(i11);
        this.f42010d = 0;
        m52040z().setImageResource(i11);
        this.f42017k = 0;
        this.f42018l = 0;
        m52021E().setText(m52021E().getContext().getString(R$string.newcoin_change_rate_24h));
        int i12 = this.f42014h % 3;
        if (i12 == 1) {
            this.f42019m = 2;
            m52039y().setImageResource(m52018B());
        } else if (i12 != 2) {
            this.f42019m = 0;
            m52039y().setImageResource(i11);
        } else {
            this.f42019m = 1;
            m52039y().setImageResource(m52020D());
        }
    }

    /* JADX INFO: renamed from: O */
    public final Collection<TradeItemBean> m52026O(ArrayList<TradeItemBean> arrayList) {
        new f();
        int i11 = this.f42017k % 3;
        if (i11 == 1) {
            h hVar = new h();
            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.helper.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoinListSortHelper.m51981V((TradeItemBean) obj);
                }
            };
            Comparator comparatorThenComparing = hVar.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.t
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return CoinListSortHelper.m51982W(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoinListSortHelper.m51983X((TradeItemBean) obj);
                }
            };
            Comparator comparatorThenComparing2 = comparatorThenComparing.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.v
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return CoinListSortHelper.m51984Y(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(comparatorThenComparing2, "thenComparing(...)");
            CollectionsKt.sortWith(arrayList, comparatorThenComparing2);
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        g gVar = new g();
        final Function1 function3 = new Function1() { // from class: com.kubi.quotefacade.helper.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinListSortHelper.m51977R((TradeItemBean) obj);
            }
        };
        Comparator comparatorThenComparing3 = gVar.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CoinListSortHelper.m51978S(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.quotefacade.helper.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinListSortHelper.m51979T((TradeItemBean) obj);
            }
        };
        Comparator comparatorThenComparing4 = comparatorThenComparing3.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CoinListSortHelper.m51980U(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(comparatorThenComparing4, "thenComparing(...)");
        CollectionsKt.sortWith(arrayList, comparatorThenComparing4);
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public final void m52027P(boolean z11) {
        SymbolsSortType symbolsSortType = SymbolsSortType.FUNDING_RATE;
        this.f42020n = symbolsSortType;
        this.f42021o = symbolsSortType;
        this.f42017k = z11 ? 0 : this.f42017k + 1;
        this.f42012f = 0;
        ImageView imageViewM52017A = m52017A();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52017A.setImageResource(i11);
        this.f42008b = 0;
        m52038x().setImageResource(i11);
        this.f42010d = 0;
        m52040z().setImageResource(i11);
        this.f42014h = 0;
        this.f42018l = 0;
        m52021E().setText(m52021E().getContext().getString(R$string.bkumex_funding));
        int i12 = this.f42017k % 3;
        if (i12 == 1) {
            this.f42019m = 2;
            m52039y().setImageResource(m52018B());
        } else if (i12 != 2) {
            this.f42019m = 0;
            m52039y().setImageResource(i11);
        } else {
            this.f42019m = 1;
            m52039y().setImageResource(m52020D());
        }
    }

    /* JADX INFO: renamed from: Z */
    public final Collection<TradeItemBean> m52028Z(ArrayList<TradeItemBean> arrayList) {
        int i11 = this.f42018l % 3;
        if (i11 == 1) {
            j jVar = new j();
            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.helper.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoinListSortHelper.m51997g0((TradeItemBean) obj);
                }
            };
            Comparator comparatorThenComparing = jVar.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.b0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return CoinListSortHelper.m51999h0(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoinListSortHelper.m52001i0((TradeItemBean) obj);
                }
            };
            Comparator comparatorThenComparing2 = comparatorThenComparing.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.e0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return CoinListSortHelper.m52003j0(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(comparatorThenComparing2, "thenComparing(...)");
            CollectionsKt.sortWith(arrayList, comparatorThenComparing2);
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        i iVar = new i();
        final Function1 function3 = new Function1() { // from class: com.kubi.quotefacade.helper.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinListSortHelper.m51989c0((TradeItemBean) obj);
            }
        };
        Comparator comparatorThenComparing3 = iVar.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CoinListSortHelper.m51991d0(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.quotefacade.helper.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinListSortHelper.m51993e0((TradeItemBean) obj);
            }
        };
        Comparator comparatorThenComparing4 = comparatorThenComparing3.thenComparing(new Function() { // from class: com.kubi.quotefacade.helper.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CoinListSortHelper.m51995f0(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(comparatorThenComparing4, "thenComparing(...)");
        CollectionsKt.sortWith(arrayList, comparatorThenComparing4);
        return arrayList;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m52029a0(boolean z11) {
        SymbolsSortType symbolsSortType = SymbolsSortType.MARKET_CAP;
        this.f42020n = symbolsSortType;
        this.f42021o = symbolsSortType;
        this.f42018l = z11 ? 0 : this.f42018l + 1;
        this.f42012f = 0;
        ImageView imageViewM52017A = m52017A();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52017A.setImageResource(i11);
        this.f42008b = 0;
        m52038x().setImageResource(i11);
        this.f42010d = 0;
        m52040z().setImageResource(i11);
        this.f42014h = 0;
        this.f42017k = 0;
        m52021E().setText(m52021E().getContext().getString(R$string.market_cap_label));
        int i12 = this.f42018l % 3;
        if (i12 == 1) {
            this.f42019m = 2;
            m52039y().setImageResource(m52018B());
        } else if (i12 != 2) {
            this.f42019m = 0;
            m52039y().setImageResource(i11);
        } else {
            this.f42019m = 1;
            m52039y().setImageResource(m52020D());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final Collection<TradeItemBean> m52030k0(ArrayList<TradeItemBean> arrayList, boolean z11) {
        if (this.f42019m != 0) {
            int i11 = this.f42010d % 3;
            if (i11 == 1) {
                CollectionsKt.sortWith(arrayList, new k(z11));
                return arrayList;
            }
            if (i11 == 2 && arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new l(z11));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m52031l0() {
        this.f42020n = SymbolsSortType.NAME;
        this.f42010d++;
        this.f42012f = 0;
        ImageView imageViewM52017A = m52017A();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52017A.setImageResource(i11);
        this.f42014h = 0;
        this.f42017k = 0;
        this.f42018l = 0;
        m52039y().setImageResource(i11);
        this.f42008b = 0;
        m52038x().setImageResource(i11);
        int i12 = this.f42010d % 3;
        if (i12 == 1) {
            this.f42019m = 2;
            m52040z().setImageResource(m52020D());
        } else if (i12 != 2) {
            this.f42019m = 0;
            m52040z().setImageResource(i11);
        } else {
            this.f42019m = 1;
            m52040z().setImageResource(m52018B());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final Collection<TradeItemBean> m52032m0(ArrayList<TradeItemBean> arrayList, boolean z11) {
        int i11 = this.f42012f % 3;
        if (i11 == 1) {
            CollectionsKt.sortWith(arrayList, new n(z11));
            return arrayList;
        }
        if (i11 != 2) {
            return arrayList;
        }
        CollectionsKt.sortWith(arrayList, new m(z11));
        return arrayList;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m52033n0() {
        this.f42020n = SymbolsSortType.PRICE;
        this.f42012f++;
        this.f42008b = 0;
        ImageView imageViewM52038x = m52038x();
        int i11 = R$mipmap.ic_sort_default;
        imageViewM52038x.setImageResource(i11);
        this.f42014h = 0;
        this.f42017k = 0;
        this.f42018l = 0;
        m52039y().setImageResource(i11);
        this.f42010d = 0;
        m52040z().setImageResource(i11);
        int i12 = this.f42012f % 3;
        if (i12 == 1) {
            this.f42019m = 2;
            m52017A().setImageResource(m52018B());
        } else if (i12 != 2) {
            this.f42019m = 0;
            m52017A().setImageResource(i11);
        } else {
            this.f42019m = 1;
            m52017A().setImageResource(m52020D());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final Collection<TradeItemBean> m52034o0(@NotNull List<? extends TradeItemBean> list, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<TradeItemBean> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        if (this.f42010d > 0) {
            return m52030k0(arrayList, z11);
        }
        if (this.f42008b > 0) {
            return m52022J(arrayList, z11);
        }
        if (this.f42012f > 0) {
            return m52032m0(arrayList, z11);
        }
        if (this.f42014h > 0) {
            return m52024L(arrayList, z11);
        }
        if (this.f42017k > 0) {
            return m52026O(arrayList);
        }
        return this.f42018l > 0 ? m52028Z(arrayList) : arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m52035r0(@NotNull SymbolsSortType customSortType) {
        Intrinsics.checkNotNullParameter(customSortType, "customSortType");
        int i11 = a.$EnumSwitchMapping$0[customSortType.ordinal()];
        if (i11 == 1) {
            this.f42021o = SymbolsSortType.CHANGE_RATE;
            m52021E().setText(m52021E().getContext().getString(R$string.newcoin_change_rate_24h));
        } else if (i11 == 2) {
            this.f42021o = SymbolsSortType.FUNDING_RATE;
            m52021E().setText(m52021E().getContext().getString(R$string.bkumex_funding));
        } else {
            if (i11 != 3) {
                return;
            }
            this.f42021o = SymbolsSortType.MARKET_CAP;
            m52021E().setText(m52021E().getContext().getString(R$string.market_cap_label));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m52036v() {
        int i11 = a.$EnumSwitchMapping$0[this.f42021o.ordinal()];
        if (i11 == 1) {
            m51975N(this, false, 1, null);
        } else if (i11 == 2) {
            m51976Q(this, false, 1, null);
        } else {
            if (i11 != 3) {
                return;
            }
            m51987b0(this, false, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final SymbolsSortType getF42021o() {
        return this.f42021o;
    }

    /* JADX INFO: renamed from: x */
    public final ImageView m52038x() {
        return (ImageView) this.f42009c.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final ImageView m52039y() {
        return (ImageView) this.f42015i.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final ImageView m52040z() {
        return (ImageView) this.f42011e.getValue();
    }

    /* JADX INFO: renamed from: S */
    public static final Double m51978S(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final Double m51979T(TradeItemBean tradeItemBean) {
        return Double.valueOf(C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: U */
    public static final Double m51980U(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W */
    public static final Double m51982W(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static final Double m51983X(TradeItemBean tradeItemBean) {
        return Double.valueOf(-C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: Y */
    public static final Double m51984Y(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Double m51991d0(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static final Double m51993e0(TradeItemBean tradeItemBean) {
        return Double.valueOf(C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: f0 */
    public static final Double m51995f0(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Double m51999h0(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Double m52001i0(TradeItemBean tradeItemBean) {
        return Double.valueOf(-C41014a.m89939m(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: j0 */
    public static final Double m52003j0(Function1 function1, Object obj) {
        return (Double) function1.invoke(obj);
    }
}
