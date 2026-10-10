package com.kubi.unify.funds;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.sdk.util.FlowExtKt;
import com.kubi.unify.UnifyStoreIds;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.unify.funds.e1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyFundsInfoViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0013J\u001a\u0010 \u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\t¨\u0006\""}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyFundsInfoViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "fundsInfoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "getFundsInfoList", "()Landroidx/lifecycle/LiveData;", "accountOverView", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "getAccountOverView", "_sortedFundsInfoList", "Landroidx/lifecycle/MutableLiveData;", "sortedFundsInfoList", "getSortedFundsInfoList", "_symbolPair", "Lkotlin/Pair;", "", "_hideSmall", "", "hideSmall", "getHideSmall", "_sortType", "sortType", "getSortType", "sortedFundsInfoListData", "", "hideSmallStatusChanged", "sortTypeChanged", "value", "symbolPairChanged", "pair", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyFundsInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyFundsInfoViewModel.kt\ncom/kubi/unify/funds/UnifyFundsInfoViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,140:1\n774#2:141\n865#2,2:142\n774#2:144\n865#2:145\n866#2:147\n295#2,2:148\n295#2,2:150\n295#2,2:152\n295#2,2:154\n1#3:146\n126#4,2:156\n23#4,2:158\n*S KotlinDebug\n*F\n+ 1 UnifyFundsInfoViewModel.kt\ncom/kubi/unify/funds/UnifyFundsInfoViewModel\n*L\n61#1:141\n61#1:142,2\n62#1:144\n62#1:145\n62#1:147\n80#1:148,2\n81#1:150,2\n84#1:152,2\n85#1:154,2\n120#1:156,2\n129#1:158,2\n*E\n"})
public final class UnifyFundsInfoViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final LiveData<List<UnifyFundsInfoEntity>> f53211V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<UnifyAccountOverviewEntity> f53212W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<List<UnifyFundsInfoEntity>> f53213X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<List<UnifyFundsInfoEntity>> f53214Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Pair<String, String>> f53215Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f53216a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<Boolean> f53217b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<String> f53218c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final LiveData<String> f53219d0;

    /* JADX INFO: renamed from: com.kubi.unify.funds.e1$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UnifyFundsInfoViewModel.kt\ncom/kubi/unify/funds/UnifyFundsInfoViewModel\n*L\n1#1,328:1\n92#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal bigDecimalAbs;
            BigDecimal bigDecimalAbs2;
            UnifyFundsInfoEntity unifyFundsInfoEntity = (UnifyFundsInfoEntity) t11;
            BigDecimal equity = unifyFundsInfoEntity.getEquity();
            Double dValueOf = null;
            Double dValueOf2 = Double.valueOf(-C27039d.m66646f((equity == null || (bigDecimalAbs2 = equity.abs()) == null) ? null : Double.valueOf(C41014a.m89940n(bigDecimalAbs2, unifyFundsInfoEntity.getCurrency()))));
            UnifyFundsInfoEntity unifyFundsInfoEntity2 = (UnifyFundsInfoEntity) t12;
            BigDecimal equity2 = unifyFundsInfoEntity2.getEquity();
            if (equity2 != null && (bigDecimalAbs = equity2.abs()) != null) {
                dValueOf = Double.valueOf(C41014a.m89940n(bigDecimalAbs, unifyFundsInfoEntity2.getCurrency()));
            }
            return ComparisonsKt.compareValues(dValueOf2, Double.valueOf(-C27039d.m66646f(dValueOf)));
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.funds.e1$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UnifyFundsInfoViewModel.kt\ncom/kubi/unify/funds/UnifyFundsInfoViewModel\n*L\n1#1,328:1\n98#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((UnifyFundsInfoEntity) t11).getCurrency(), ((UnifyFundsInfoEntity) t12).getCurrency());
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0210  */
    /* JADX WARN: Code duplicated, block: B:109:0x021c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0224  */
    /* JADX WARN: Code duplicated, block: B:129:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0287  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX INFO: renamed from: u */
    public final void m65209u() {
        List mutableList;
        UnifyFundsInfoEntity unifyFundsInfoEntity;
        UnifyFundsInfoEntity unifyFundsInfoEntity2;
        Pair<String, String> value;
        String first;
        UnifyFundsInfoEntity unifyFundsInfoEntity3;
        Object next;
        String currency;
        Pair<String, String> value2;
        Object next2;
        String currency2;
        Pair<String, String> value3;
        Pair<String, String> value4;
        String second;
        UnifyFundsInfoEntity unifyFundsInfoEntity4;
        Object next3;
        String currency3;
        Pair<String, String> value5;
        Object next4;
        String currency4;
        Pair<String, String> value6;
        IAssetsCenterService.Companion companion = IAssetsCenterService.f16464a;
        double dM89940n = C41014a.m89940n(C41014a.m89921F(companion.get().mo15336a(), "5"), C27041f.m66669i(companion.get().mo15339d(), "USDT"));
        List<UnifyFundsInfoEntity> value7 = this.f53211V.getValue();
        List<UnifyFundsInfoEntity> listSortedWith = null;
        List mutableList2 = value7 != null ? CollectionsKt.toMutableList((Collection) value7) : null;
        if (mutableList2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : mutableList2) {
                UnifyFundsInfoEntity unifyFundsInfoEntity5 = (UnifyFundsInfoEntity) obj;
                if (!C41014a.m89917B(unifyFundsInfoEntity5.getEquity()) || !C41014a.m89917B(unifyFundsInfoEntity5.getLiability())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                UnifyFundsInfoEntity unifyFundsInfoEntity6 = (UnifyFundsInfoEntity) obj2;
                Boolean value8 = this.f53216a0.getValue();
                boolean zBooleanValue = value8 != null ? value8.booleanValue() : false;
                String value9 = this.f53218c0.getValue();
                Pair<String, String> value10 = this.f53215Z.getValue();
                if (zBooleanValue && (!Intrinsics.areEqual(value9, "default") || value10 == null || (!Intrinsics.areEqual(unifyFundsInfoEntity6.getCurrency(), value10.getFirst()) && !Intrinsics.areEqual(unifyFundsInfoEntity6.getCurrency(), value10.getSecond())))) {
                    BigDecimal bigDecimalAbs = C41014a.m89922G(unifyFundsInfoEntity6.getEquity(), null, 1, null).abs();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                    if (C27039d.m66646f(Double.valueOf(C41014a.m89940n(bigDecimalAbs, unifyFundsInfoEntity6.getCurrency()))) >= dM89940n) {
                    }
                }
                arrayList2.add(obj2);
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        } else {
            mutableList = null;
        }
        if (Intrinsics.areEqual(this.f53218c0.getValue(), "default")) {
            if (mutableList != null) {
                Iterator it = mutableList.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    } else {
                        next4 = it.next();
                        currency4 = ((UnifyFundsInfoEntity) next4).getCurrency();
                        value6 = this.f53215Z.getValue();
                    }
                } while (!Intrinsics.areEqual(currency4, value6 != null ? value6.getSecond() : null));
                unifyFundsInfoEntity = (UnifyFundsInfoEntity) next4;
            } else {
                unifyFundsInfoEntity = null;
            }
            if (unifyFundsInfoEntity == null && mutableList != null) {
                if (mutableList2 != null) {
                    Iterator it2 = mutableList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        } else {
                            next3 = it2.next();
                            currency3 = ((UnifyFundsInfoEntity) next3).getCurrency();
                            value5 = this.f53215Z.getValue();
                        }
                    } while (!Intrinsics.areEqual(currency3, value5 != null ? value5.getSecond() : null));
                    unifyFundsInfoEntity4 = (UnifyFundsInfoEntity) next3;
                    if (unifyFundsInfoEntity4 == null) {
                        value4 = this.f53215Z.getValue();
                        if (value4 != null) {
                            second = value4.getSecond();
                        } else {
                            second = null;
                        }
                        unifyFundsInfoEntity4 = new UnifyFundsInfoEntity(second, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                    }
                } else {
                    value4 = this.f53215Z.getValue();
                    if (value4 != null) {
                        second = value4.getSecond();
                    } else {
                        second = null;
                    }
                    unifyFundsInfoEntity4 = new UnifyFundsInfoEntity(second, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                }
                mutableList.add(unifyFundsInfoEntity4);
            }
            if (mutableList != null) {
                Iterator it3 = mutableList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        currency2 = ((UnifyFundsInfoEntity) next2).getCurrency();
                        value3 = this.f53215Z.getValue();
                    }
                } while (!Intrinsics.areEqual(currency2, value3 != null ? value3.getFirst() : null));
                unifyFundsInfoEntity2 = (UnifyFundsInfoEntity) next2;
            } else {
                unifyFundsInfoEntity2 = null;
            }
            if (unifyFundsInfoEntity2 == null && mutableList != null) {
                if (mutableList2 != null) {
                    Iterator it4 = mutableList2.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it4.next();
                            currency = ((UnifyFundsInfoEntity) next).getCurrency();
                            value2 = this.f53215Z.getValue();
                        }
                    } while (!Intrinsics.areEqual(currency, value2 != null ? value2.getFirst() : null));
                    unifyFundsInfoEntity3 = (UnifyFundsInfoEntity) next;
                    if (unifyFundsInfoEntity3 == null) {
                        value = this.f53215Z.getValue();
                        if (value != null) {
                            first = value.getFirst();
                        } else {
                            first = null;
                        }
                        unifyFundsInfoEntity3 = new UnifyFundsInfoEntity(first, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                    }
                } else {
                    value = this.f53215Z.getValue();
                    if (value != null) {
                        first = value.getFirst();
                    } else {
                        first = null;
                    }
                    unifyFundsInfoEntity3 = new UnifyFundsInfoEntity(first, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                }
                mutableList.add(unifyFundsInfoEntity3);
            }
        }
        MutableLiveData<List<UnifyFundsInfoEntity>> mutableLiveData = this.f53213X;
        String value11 = this.f53218c0.getValue();
        if (value11 != null) {
            int iHashCode = value11.hashCode();
            if (iHashCode != 111972721) {
                if (iHashCode == 575402001 && value11.equals(FirebaseAnalytics.Param.CURRENCY)) {
                    if (mutableList != null) {
                        listSortedWith = CollectionsKt.sortedWith(mutableList, new b());
                    }
                } else if (mutableList != null) {
                    listSortedWith = CollectionsKt.sortedWith(mutableList, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.unify.funds.b1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return UnifyFundsInfoViewModel.m65201x(this.f53203b, (UnifyFundsInfoEntity) obj3);
                        }
                    }, new Function1() { // from class: com.kubi.unify.funds.c1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return UnifyFundsInfoViewModel.m65199v(this.f53207b, (UnifyFundsInfoEntity) obj3);
                        }
                    }, new Function1() { // from class: com.kubi.unify.funds.d1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return UnifyFundsInfoViewModel.m65200w((UnifyFundsInfoEntity) obj3);
                        }
                    }));
                }
            } else if (value11.equals("value")) {
                if (mutableList != null) {
                    listSortedWith = CollectionsKt.sortedWith(mutableList, new a());
                }
            } else if (mutableList != null) {
                listSortedWith = CollectionsKt.sortedWith(mutableList, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.unify.funds.b1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return UnifyFundsInfoViewModel.m65201x(this.f53203b, (UnifyFundsInfoEntity) obj3);
                    }
                }, new Function1() { // from class: com.kubi.unify.funds.c1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return UnifyFundsInfoViewModel.m65199v(this.f53207b, (UnifyFundsInfoEntity) obj3);
                    }
                }, new Function1() { // from class: com.kubi.unify.funds.d1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return UnifyFundsInfoViewModel.m65200w((UnifyFundsInfoEntity) obj3);
                    }
                }));
            }
        } else if (mutableList != null) {
            listSortedWith = CollectionsKt.sortedWith(mutableList, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.unify.funds.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return UnifyFundsInfoViewModel.m65201x(this.f53203b, (UnifyFundsInfoEntity) obj3);
                }
            }, new Function1() { // from class: com.kubi.unify.funds.c1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return UnifyFundsInfoViewModel.m65199v(this.f53207b, (UnifyFundsInfoEntity) obj3);
                }
            }, new Function1() { // from class: com.kubi.unify.funds.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return UnifyFundsInfoViewModel.m65200w((UnifyFundsInfoEntity) obj3);
                }
            }));
        }
        mutableLiveData.setValue(listSortedWith);
    }

    /* JADX INFO: renamed from: v */
    public static final Comparable m65199v(UnifyFundsInfoViewModel unifyFundsInfoViewModel, UnifyFundsInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String currency = it.getCurrency();
        Pair<String, String> value = unifyFundsInfoViewModel.f53215Z.getValue();
        return Boolean.valueOf(!Intrinsics.areEqual(currency, value != null ? value.getSecond() : null));
    }

    /* JADX INFO: renamed from: w */
    public static final Comparable m65200w(UnifyFundsInfoEntity it) {
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal equity = it.getEquity();
        return Double.valueOf(-C27039d.m66646f((equity == null || (bigDecimalAbs = equity.abs()) == null) ? null : Double.valueOf(C41014a.m89940n(bigDecimalAbs, it.getCurrency()))));
    }

    /* JADX INFO: renamed from: x */
    public static final Comparable m65201x(UnifyFundsInfoViewModel unifyFundsInfoViewModel, UnifyFundsInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String currency = it.getCurrency();
        Pair<String, String> value = unifyFundsInfoViewModel.f53215Z.getValue();
        return Boolean.valueOf(!Intrinsics.areEqual(currency, value != null ? value.getFirst() : null));
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<UnifyAccountOverviewEntity> m65202n() {
        return this.f53212W;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<List<UnifyFundsInfoEntity>> m65203o() {
        return this.f53211V;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<Boolean> m65204p() {
        return this.f53217b0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<String> m65205q() {
        return this.f53219d0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final LiveData<List<UnifyFundsInfoEntity>> m65206r() {
        return this.f53214Y;
    }

    /* JADX INFO: renamed from: s */
    public final void m65207s(boolean z11) {
        this.f53216a0.setValue(Boolean.valueOf(z11));
        m65209u();
        C46392a.m102328k(UnifyStoreIds.f53305a.m65248j(), z11);
    }

    /* JADX INFO: renamed from: t */
    public final void m65208t(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53218c0.setValue(value);
        m65209u();
        C46392a.m102333p(UnifyStoreIds.f53305a.m65251m(), value);
    }

    /* JADX INFO: renamed from: y */
    public final void m65210y(@NotNull Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        MutableLiveData<Pair<String, String>> mutableLiveData = this.f53215Z;
        String strM66677q = C27041f.m66677q(pair.getFirst());
        if (strM66677q == null) {
            strM66677q = "";
        }
        String strM66677q2 = C27041f.m66677q(pair.getSecond());
        mutableLiveData.setValue(new Pair<>(strM66677q, strM66677q2 != null ? strM66677q2 : ""));
        m65209u();
    }

    public UnifyFundsInfoViewModel() {
        UnifyDataStreamManager unifyDataStreamManager = UnifyDataStreamManager.f53365a;
        this.f53211V = FlowExtKt.m58321a(unifyDataStreamManager.m65362u().m65393c());
        this.f53212W = FlowExtKt.m58321a(unifyDataStreamManager.m65362u().m65392b());
        MutableLiveData<List<UnifyFundsInfoEntity>> mutableLiveData = new MutableLiveData<>();
        this.f53213X = mutableLiveData;
        this.f53214Y = mutableLiveData;
        this.f53215Z = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f53216a0 = mutableLiveData2;
        this.f53217b0 = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.f53218c0 = mutableLiveData3;
        this.f53219d0 = mutableLiveData3;
    }
}
