package com.kubi.quotefacade.chain;

import com.blankj.utilcode.util.C5303w0;
import com.kubi.config.exception.KCConfigMessage;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.quotefacade.chain.i */
/* JADX INFO: compiled from: ChainMarketEx.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"MAX_RATE", "Ljava/math/BigDecimal;", "formatTokenChangeRate", "", "divide", "", "sortCoinsLocal", "", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "sortName", "sortType", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainMarketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1#2:134\n48#3,2:135\n48#3,2:147\n1056#4:137\n1056#4:138\n1056#4:139\n1056#4:140\n1056#4:141\n1056#4:142\n1056#4:143\n1056#4:144\n1056#4:145\n1056#4:146\n*S KotlinDebug\n*F\n+ 1 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n38#1:135,2\n129#1:147,2\n57#1:137\n64#1:138\n71#1:139\n78#1:140\n85#1:141\n92#1:142\n99#1:143\n106#1:144\n113#1:145\n120#1:146\n*E\n"})
public final class C21781i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BigDecimal f41533a = new BigDecimal("9999.99");

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n121#2,2:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41534b;

        public b(boolean z11) {
            this.f41534b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalValueOf;
            BigDecimal bigDecimalValueOf2;
            Long createdAt = ((ChainItemEntity) t11).getCreatedAt();
            if (createdAt != null) {
                bigDecimalValueOf = BigDecimal.valueOf(createdAt.longValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalValueOf, null, 1, null);
            if (!this.f41534b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            Long createdAt2 = ((ChainItemEntity) t12).getCreatedAt();
            if (createdAt2 != null) {
                bigDecimalValueOf2 = BigDecimal.valueOf(createdAt2.longValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            } else {
                bigDecimalValueOf2 = null;
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(bigDecimalValueOf2, null, 1, null);
            if (!this.f41534b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n58#2,2:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41535b;

        public c(boolean z11) {
            this.f41535b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t11).getTokenTxVolumeUsd()), null, 1, null);
            if (!this.f41535b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t12).getTokenTxVolumeUsd()), null, 1, null);
            if (!this.f41535b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n65#2,2:329\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41536b;

        public d(boolean z11) {
            this.f41536b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(((ChainItemEntity) t11).getCurrentPriceUsd(), null, 1, null);
            if (!this.f41536b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(((ChainItemEntity) t12).getCurrentPriceUsd(), null, 1, null);
            if (!this.f41536b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n72#2,2:329\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41537b;

        public e(boolean z11) {
            this.f41537b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(((ChainItemEntity) t11).getTokenPriceChange(), null, 1, null);
            if (!this.f41537b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(((ChainItemEntity) t12).getTokenPriceChange(), null, 1, null);
            if (!this.f41537b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n79#2,2:329\n*E\n"})
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41538b;

        public f(boolean z11) {
            this.f41538b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalValueOf;
            BigDecimal bigDecimalValueOf2;
            Integer tokenTxCount = ((ChainItemEntity) t11).getTokenTxCount();
            if (tokenTxCount != null) {
                bigDecimalValueOf = BigDecimal.valueOf(tokenTxCount.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalValueOf, null, 1, null);
            if (!this.f41538b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            Integer tokenTxCount2 = ((ChainItemEntity) t12).getTokenTxCount();
            if (tokenTxCount2 != null) {
                bigDecimalValueOf2 = BigDecimal.valueOf(tokenTxCount2.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            } else {
                bigDecimalValueOf2 = null;
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(bigDecimalValueOf2, null, 1, null);
            if (!this.f41538b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n86#2,2:329\n*E\n"})
    public static final class g<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41539b;

        public g(boolean z11) {
            this.f41539b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalValueOf;
            BigDecimal bigDecimalValueOf2;
            Integer tokenMakers = ((ChainItemEntity) t11).getTokenMakers();
            if (tokenMakers != null) {
                bigDecimalValueOf = BigDecimal.valueOf(tokenMakers.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalValueOf, null, 1, null);
            if (!this.f41539b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            Integer tokenMakers2 = ((ChainItemEntity) t12).getTokenMakers();
            if (tokenMakers2 != null) {
                bigDecimalValueOf2 = BigDecimal.valueOf(tokenMakers2.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            } else {
                bigDecimalValueOf2 = null;
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(bigDecimalValueOf2, null, 1, null);
            if (!this.f41539b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$h */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n93#2,2:329\n*E\n"})
    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41540b;

        public h(boolean z11) {
            this.f41540b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalValueOf;
            BigDecimal bigDecimalValueOf2;
            Integer holders = ((ChainItemEntity) t11).getHolders();
            if (holders != null) {
                bigDecimalValueOf = BigDecimal.valueOf(holders.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalValueOf, null, 1, null);
            if (!this.f41540b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            Integer holders2 = ((ChainItemEntity) t12).getHolders();
            if (holders2 != null) {
                bigDecimalValueOf2 = BigDecimal.valueOf(holders2.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            } else {
                bigDecimalValueOf2 = null;
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(bigDecimalValueOf2, null, 1, null);
            if (!this.f41540b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$i */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n100#2,2:329\n*E\n"})
    public static final class i<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41541b;

        public i(boolean z11) {
            this.f41541b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t11).getMarketCap()), null, 1, null);
            if (!this.f41541b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t12).getMarketCap()), null, 1, null);
            if (!this.f41541b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$j */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n107#2,2:329\n*E\n"})
    public static final class j<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41542b;

        public j(boolean z11) {
            this.f41542b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t11).getFdv()), null, 1, null);
            if (!this.f41542b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t12).getFdv()), null, 1, null);
            if (!this.f41542b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$k */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChainMarketEx.kt\ncom/kubi/quotefacade/chain/ChainMarketExKt\n*L\n1#1,328:1\n114#2,2:329\n*E\n"})
    public static final class k<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f41543b;

        public k(boolean z11) {
            this.f41543b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t11).getTvl()), null, 1, null);
            if (!this.f41543b) {
                bigDecimalM89922G = bigDecimalM89922G.negate();
            }
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(C27041f.m66671k(((ChainItemEntity) t12).getTvl()), null, 1, null);
            if (!this.f41543b) {
                bigDecimalM89922G2 = bigDecimalM89922G2.negate();
            }
            return ComparisonsKt.compareValues(bigDecimalM89922G, bigDecimalM89922G2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m50836b(BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m50835a(bigDecimal, z11);
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.i$a */
    /* JADX INFO: compiled from: ChainMarketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChainSortItemEnum.values().length];
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_MAKERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_FDV.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_TVL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_CREATE_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m50835a(@Nullable BigDecimal bigDecimal, boolean z11) {
        if (bigDecimal == null) {
            return "--";
        }
        try {
            BigDecimal bigDecimal2 = f41533a;
            boolean z12 = bigDecimal.compareTo(bigDecimal2) > 0;
            BigDecimal bigDecimalM66654n = (BigDecimal) RangesKt.coerceAtMost(bigDecimal, bigDecimal2);
            if (z11) {
                bigDecimalM66654n = C27039d.m66654n(bigDecimalM66654n);
            }
            BigDecimal bigDecimal3 = bigDecimalM66654n;
            Intrinsics.checkNotNull(bigDecimal3);
            String strM92642g = C42180b.m92642g(bigDecimal3, null, null, 0, true, false, false, 23, null);
            String strM93911l = C42828b.m93911l(strM92642g);
            String strReplace$default = strM93911l == null ? strM92642g : strM93911l;
            if (z12) {
                strReplace$default = StringsKt.replace$default(strReplace$default, "+", C5303w0.m6511a() ? "<" : ">", false, 4, (Object) null);
            }
            String strM93915p = C42828b.m93915p(strReplace$default);
            return strM93915p == null ? strReplace$default : strM93915p;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C43846g.m96568c(new KCConfigMessage(message, "ChainMarketEx", false, 4, null), null, 2, null);
            return "--";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final List<ChainItemEntity> m50837c(@NotNull List<ChainItemEntity> list, @NotNull String sortName, @NotNull String sortType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        if (sortName.length() == 0 || sortType.length() == 0 || list.isEmpty()) {
            return list;
        }
        boolean zAreEqual = Intrinsics.areEqual(sortType, "asc");
        try {
            ChainSortItemEnum chainSortItemEnumFindEnumBySortType = ChainSortItemEnum.INSTANCE.findEnumBySortType(sortName);
            switch (chainSortItemEnumFindEnumBySortType == null ? -1 : a.$EnumSwitchMapping$0[chainSortItemEnumFindEnumBySortType.ordinal()]) {
                case 1:
                    return CollectionsKt.sortedWith(list, new c(zAreEqual));
                case 2:
                    return CollectionsKt.sortedWith(list, new d(zAreEqual));
                case 3:
                    return CollectionsKt.sortedWith(list, new e(zAreEqual));
                case 4:
                    return CollectionsKt.sortedWith(list, new f(zAreEqual));
                case 5:
                    return CollectionsKt.sortedWith(list, new g(zAreEqual));
                case 6:
                    return CollectionsKt.sortedWith(list, new h(zAreEqual));
                case 7:
                    return CollectionsKt.sortedWith(list, new i(zAreEqual));
                case 8:
                    return CollectionsKt.sortedWith(list, new j(zAreEqual));
                case 9:
                    return CollectionsKt.sortedWith(list, new k(zAreEqual));
                case 10:
                    return CollectionsKt.sortedWith(list, new b(zAreEqual));
                default:
                    return list;
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            C43846g.m96568c(new KCConfigMessage(message, "ChainMarketEx", false, 4, null), null, 2, null);
        }
    }
}
