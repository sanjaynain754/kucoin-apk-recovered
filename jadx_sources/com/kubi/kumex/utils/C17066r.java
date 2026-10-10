package com.kubi.kumex.utils;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.market.ContractObject;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37570e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kumex.utils.r */
/* JADX INFO: compiled from: ContractSortController.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a:\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a \u0010\u0018\u001a\u00020\u00192\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u001a\"\u0010\u001f\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0011\u001a\u001c\u0010\"\u001a\u00020\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020\u0011H\u0003\u001a\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\fH\u0002\"\u000e\u0010%\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"sortByName", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "sortByAmount", "sortByPrice", "sortByUpDown", "getCurrentSortType", "Lkotlin/Pair;", "", "sortData", "", "Lcom/kubi/kumex/market/ContractObject;", "datas", "sortName", "sortType", CheckIsFavorCommand.KEY_IS_FAV, "", "getSymbol", "it", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "sortAmount", "sortPrice", "sortUpDown", "sortDefault", "", "isStickShow", "contract", "resetSortType", "textView", "Landroid/widget/TextView;", "setSortDrawable", "type", "isName", "getSetSortType", "getSortAmount", "Ljava/math/BigDecimal;", "SORT_DEFAULT", "SORT_POSITIVE", "SORT_REVERSE", "SORT_NAME", "SORT_AMOUNT", "SORT_PRICE", "SORT_UP_DOWN", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractSortController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n1021#2,2:405\n*S KotlinDebug\n*F\n+ 1 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n139#1:405,2\n*E\n"})
public final class C17066r {

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n170#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(C17066r.m36601t((ContractObject) t11), C17066r.m36601t((ContractObject) t12));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n177#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalNegate = C17066r.m36601t((ContractObject) t11).negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            BigDecimal bigDecimalNegate2 = C17066r.m36601t((ContractObject) t12).negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
            return ComparisonsKt.compareValues(bigDecimalNegate, bigDecimalNegate2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n262#2:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f30811b;

        public c(boolean z11) {
            this.f30811b = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(C17066r.m36603v((ContractObject) t11, this.f30811b)), Boolean.valueOf(C17066r.m36603v((ContractObject) t12, this.f30811b)));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n146#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(C17066r.m36602u(((ContractObject) t11).getF29417b()), C17066r.m36602u(((ContractObject) t12).getF29417b()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n139#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(C17066r.m36602u(((ContractObject) t12).getF29417b()), C17066r.m36602u(((ContractObject) t11).getF29417b()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n202#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Double dValueOf;
            ContractObject contractObject = (ContractObject) t11;
            BigDecimal lastPrice = contractObject.getF29417b().getLastPrice();
            Double dValueOf2 = null;
            if (lastPrice != null) {
                ContractEntity f29420e = contractObject.getF29420e();
                dValueOf = Double.valueOf(C41014a.m89940n(lastPrice, f29420e != null ? f29420e.getQuoteCurrency() : null));
            } else {
                dValueOf = null;
            }
            ContractObject contractObject2 = (ContractObject) t12;
            BigDecimal lastPrice2 = contractObject2.getF29417b().getLastPrice();
            if (lastPrice2 != null) {
                ContractEntity f29420e2 = contractObject2.getF29420e();
                dValueOf2 = Double.valueOf(C41014a.m89940n(lastPrice2, f29420e2 != null ? f29420e2.getQuoteCurrency() : null));
            }
            return ComparisonsKt.compareValues(dValueOf, dValueOf2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n217#2,2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Double dValueOf;
            ContractObject contractObject = (ContractObject) t11;
            BigDecimal lastPrice = contractObject.getF29417b().getLastPrice();
            Double dValueOf2 = null;
            if (lastPrice != null) {
                ContractEntity f29420e = contractObject.getF29420e();
                dValueOf = Double.valueOf(C41014a.m89940n(lastPrice, f29420e != null ? f29420e.getQuoteCurrency() : null));
            } else {
                dValueOf = null;
            }
            Double dValueOf3 = Double.valueOf(-C27039d.m66646f(dValueOf));
            ContractObject contractObject2 = (ContractObject) t12;
            BigDecimal lastPrice2 = contractObject2.getF29417b().getLastPrice();
            if (lastPrice2 != null) {
                ContractEntity f29420e2 = contractObject2.getF29420e();
                dValueOf2 = Double.valueOf(C41014a.m89940n(lastPrice2, f29420e2 != null ? f29420e2.getQuoteCurrency() : null));
            }
            return ComparisonsKt.compareValues(dValueOf3, Double.valueOf(-C27039d.m66646f(dValueOf2)));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$h */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n241#2:329\n*E\n"})
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66647g(((ContractObject) t11).getF29417b().getPriceChgPct())), Double.valueOf(C27039d.m66647g(((ContractObject) t12).getF29417b().getPriceChgPct())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.utils.r$i */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ContractSortController.kt\ncom/kubi/kumex/utils/ContractSortControllerKt\n*L\n1#1,328:1\n252#2:329\n*E\n"})
    public static final class i<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66647g(((ContractObject) t11).getF29417b().getPriceChgPct())), Double.valueOf(-C27039d.m66647g(((ContractObject) t12).getF29417b().getPriceChgPct())));
        }
    }

    /* JADX INFO: renamed from: I */
    public static final List<ContractObject> m36569I(int i11, List<ContractObject> list, final boolean z11) {
        if (i11 == 1) {
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new e());
            }
            m36568H(list, z11);
            return list;
        }
        if (i11 != 2) {
            m36568H(list, z11);
            return list;
        }
        if (z11) {
            CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36570J(z11, (ContractObject) obj);
                }
            }, new Function1() { // from class: com.kubi.kumex.utils.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36571K((ContractObject) obj);
                }
            }));
            return list;
        }
        CollectionsKt.sortWith(list, new d());
        return list;
    }

    /* JADX INFO: renamed from: L */
    public static final List<ContractObject> m36572L(int i11, List<ContractObject> list, final boolean z11) {
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17066r.m36573M(z11, (ContractObject) obj);
                    }
                }, new Function1() { // from class: com.kubi.kumex.utils.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17066r.m36574N((ContractObject) obj);
                    }
                }));
                return list;
            }
            CollectionsKt.sortWith(list, new f());
            return list;
        }
        if (i11 != 2) {
            m36568H(list, z11);
            return list;
        }
        if (z11) {
            CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36575O(z11, (ContractObject) obj);
                }
            }, new Function1() { // from class: com.kubi.kumex.utils.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36576P((ContractObject) obj);
                }
            }));
            return list;
        }
        CollectionsKt.sortWith(list, new g());
        return list;
    }

    /* JADX INFO: renamed from: Q */
    public static final List<ContractObject> m36577Q(int i11, List<ContractObject> list, final boolean z11) {
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.n
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17066r.m36578R(z11, (ContractObject) obj);
                    }
                }, new Function1() { // from class: com.kubi.kumex.utils.o
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17066r.m36579S((ContractObject) obj);
                    }
                }));
                return list;
            }
            CollectionsKt.sortWith(list, new h());
            return list;
        }
        if (i11 != 2) {
            m36568H(list, z11);
            return list;
        }
        if (z11) {
            CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36580T(z11, (ContractObject) obj);
                }
            }, new Function1() { // from class: com.kubi.kumex.utils.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36581U((ContractObject) obj);
                }
            }));
            return list;
        }
        CollectionsKt.sortWith(list, new i());
        return list;
    }

    /* JADX INFO: renamed from: r */
    public static final int m36599r(TextView textView, boolean z11) {
        if (textView == null) {
            return 0;
        }
        Object tag = textView.getTag();
        Context context = textView.getContext();
        if (tag == null) {
            textView.setTag(2);
            int i11 = z11 ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down;
            Intrinsics.checkNotNull(context);
            C27014a1.m66505e(textView, i11, GravityCompat.END, (int) C27025c.m66565c(context, 2));
            return 2;
        }
        if (!(tag instanceof Integer)) {
            return 0;
        }
        int iIntValue = ((Number) tag).intValue();
        if (iIntValue == 0) {
            textView.setTag(2);
            int i12 = z11 ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down;
            Intrinsics.checkNotNull(context);
            C27014a1.m66505e(textView, i12, GravityCompat.END, (int) C27025c.m66565c(context, 2));
            return 2;
        }
        if (iIntValue != 1) {
            textView.setTag(1);
            int i13 = !z11 ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down;
            Intrinsics.checkNotNull(context);
            C27014a1.m66505e(textView, i13, GravityCompat.END, (int) C27025c.m66565c(context, 2));
            return 1;
        }
        textView.setTag(0);
        int i14 = R$mipmap.ic_sort_default;
        Intrinsics.checkNotNull(context);
        C27014a1.m66505e(textView, i14, GravityCompat.END, (int) C27025c.m66565c(context, 2));
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m36603v(ContractObject contractObject, boolean z11) {
        String symbol;
        if (!z11) {
            return true;
        }
        ContractEntity f29420e = contractObject.getF29420e();
        return !C27025c.m66566d((f29420e == null || (symbol = f29420e.getSymbol()) == null) ? null : Boolean.valueOf(C37570e.m84692g(symbol)));
    }

    /* JADX INFO: renamed from: y */
    public static final List<ContractObject> m36606y(int i11, List<ContractObject> list, final boolean z11) {
        if (i11 == 1) {
            if (z11) {
                CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17066r.m36607z(z11, (ContractObject) obj);
                    }
                }, new Function1() { // from class: com.kubi.kumex.utils.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17066r.m36561A((ContractObject) obj);
                    }
                }));
                return list;
            }
            CollectionsKt.sortWith(list, new a());
            return list;
        }
        if (i11 != 2) {
            m36568H(list, z11);
            return list;
        }
        if (z11) {
            CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.kumex.utils.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36562B(z11, (ContractObject) obj);
                }
            }, new Function1() { // from class: com.kubi.kumex.utils.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17066r.m36563C((ContractObject) obj);
                }
            }));
            return list;
        }
        CollectionsKt.sortWith(list, new b());
        return list;
    }

    /* JADX INFO: renamed from: A */
    public static final Comparable m36561A(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return m36601t(it);
    }

    /* JADX INFO: renamed from: B */
    public static final Comparable m36562B(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: C */
    public static final Comparable m36563C(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal bigDecimalNegate = m36601t(it).negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }

    /* JADX INFO: renamed from: D */
    public static final int m36564D(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextView textView = (TextView) view.findViewById(R$id.tv_name);
        TextView textView2 = (TextView) view.findViewById(R$id.tv_amount);
        TextView textView3 = (TextView) view.findViewById(R$id.tv_price);
        TextView textView4 = (TextView) view.findViewById(R$id.tv_upDown);
        m36604w(textView2);
        m36604w(textView3);
        m36604w(textView4);
        return m36599r(textView, true);
    }

    /* JADX INFO: renamed from: E */
    public static final int m36565E(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextView textView = (TextView) view.findViewById(R$id.tv_name);
        TextView textView2 = (TextView) view.findViewById(R$id.tv_amount);
        TextView textView3 = (TextView) view.findViewById(R$id.tv_price);
        TextView textView4 = (TextView) view.findViewById(R$id.tv_upDown);
        m36604w(textView2);
        m36604w(textView);
        m36604w(textView4);
        return m36600s(textView3, false, 2, null);
    }

    /* JADX INFO: renamed from: F */
    public static final int m36566F(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextView textView = (TextView) view.findViewById(R$id.tv_name);
        TextView textView2 = (TextView) view.findViewById(R$id.tv_amount);
        TextView textView3 = (TextView) view.findViewById(R$id.tv_price);
        TextView textView4 = (TextView) view.findViewById(R$id.tv_upDown);
        m36604w(textView2);
        m36604w(textView3);
        m36604w(textView);
        return m36600s(textView4, false, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public static final List<? extends ContractObject> m36567G(@NotNull List<? extends ContractObject> datas, @Nullable String str, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(datas);
        if (str == null || str.length() == 0) {
            if (z11) {
                m36568H(arrayList, z11);
            }
            return arrayList;
        }
        if (str == null) {
            return datas;
        }
        switch (str.hashCode()) {
            case -1413853096:
                return !str.equals("amount") ? datas : m36606y(i11, arrayList, z11);
            case -839786019:
                return !str.equals(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN) ? datas : m36577Q(i11, arrayList, z11);
            case 3373707:
                return !str.equals("name") ? datas : m36569I(i11, arrayList, z11);
            case 106934601:
                return !str.equals(FirebaseAnalytics.Param.PRICE) ? datas : m36572L(i11, arrayList, z11);
            default:
                return datas;
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m36568H(List<? extends ContractObject> list, boolean z11) {
        if (z11) {
            CollectionsKt.sortWith(list, new c(z11));
        }
    }

    /* JADX INFO: renamed from: J */
    public static final Comparable m36570J(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: K */
    public static final Comparable m36571K(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return m36602u(it.getF29417b());
    }

    /* JADX INFO: renamed from: M */
    public static final Comparable m36573M(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: N */
    public static final Comparable m36574N(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal lastPrice = it.getF29417b().getLastPrice();
        if (lastPrice == null) {
            return null;
        }
        ContractEntity f29420e = it.getF29420e();
        return Double.valueOf(C41014a.m89940n(lastPrice, f29420e != null ? f29420e.getQuoteCurrency() : null));
    }

    /* JADX INFO: renamed from: O */
    public static final Comparable m36575O(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: P */
    public static final Comparable m36576P(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal lastPrice = it.getF29417b().getLastPrice();
        Double dValueOf = null;
        if (lastPrice != null) {
            ContractEntity f29420e = it.getF29420e();
            dValueOf = Double.valueOf(C41014a.m89940n(lastPrice, f29420e != null ? f29420e.getQuoteCurrency() : null));
        }
        return Double.valueOf(-C27039d.m66646f(dValueOf));
    }

    /* JADX INFO: renamed from: R */
    public static final Comparable m36578R(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: S */
    public static final Comparable m36579S(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(C27039d.m66647g(it.getF29417b().getPriceChgPct()));
    }

    /* JADX INFO: renamed from: T */
    public static final Comparable m36580T(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: U */
    public static final Comparable m36581U(ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(-C27039d.m66647g(it.getF29417b().getPriceChgPct()));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m36600s(TextView textView, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m36599r(textView, z11);
    }

    /* JADX INFO: renamed from: w */
    public static final void m36604w(@Nullable TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTag(null);
        int i11 = R$mipmap.ic_sort_default;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C27014a1.m66505e(textView, i11, GravityCompat.END, (int) C27025c.m66565c(context, 2));
    }

    /* JADX INFO: renamed from: x */
    public static final void m36605x(@Nullable TextView textView, int i11, boolean z11) {
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        if (i11 == 0) {
            textView.setTag(0);
            int i12 = R$mipmap.ic_sort_default;
            Intrinsics.checkNotNull(context);
            C27014a1.m66505e(textView, i12, GravityCompat.END, (int) C27025c.m66565c(context, 2));
            return;
        }
        if (i11 != 2) {
            textView.setTag(1);
            int i13 = !z11 ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down;
            Intrinsics.checkNotNull(context);
            C27014a1.m66505e(textView, i13, GravityCompat.END, (int) C27025c.m66565c(context, 2));
            return;
        }
        textView.setTag(2);
        int i14 = z11 ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down;
        Intrinsics.checkNotNull(context);
        C27014a1.m66505e(textView, i14, GravityCompat.END, (int) C27025c.m66565c(context, 2));
    }

    /* JADX INFO: renamed from: z */
    public static final Comparable m36607z(boolean z11, ContractObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(m36603v(it, z11));
    }

    /* JADX INFO: renamed from: t */
    public static final BigDecimal m36601t(ContractObject contractObject) {
        Boolean boolValueOf;
        ContractEntity f29420e = contractObject.getF29420e();
        if (f29420e != null) {
            boolValueOf = Boolean.valueOf(f29420e.isInverse());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            return C27039d.m66656p(contractObject.getF29417b().getTurnover());
        }
        return C27039d.m66656p(contractObject.getF29417b().getVolume());
    }

    /* JADX INFO: renamed from: u */
    public static final String m36602u(QuotesEntity quotesEntity) {
        String symbol = quotesEntity.getSymbol();
        Boolean boolValueOf = null;
        if (symbol != null) {
            boolValueOf = Boolean.valueOf(StringsKt.contains$default((CharSequence) symbol, (CharSequence) "XBT", false, 2, (Object) null));
        }
        if (C27025c.m66566d(boolValueOf)) {
            return StringsKt.replace$default(C27041f.m66668h(quotesEntity.getSymbol()), "XBT", "BTC", false, 4, (Object) null);
        }
        return quotesEntity.getSymbol();
    }
}
