package com.kubi.core.biz.margininfo.dialog;

import android.os.Bundle;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1", m90122f = "UnifyLoanCurrencySelectDialog.kt", m90123i = {0, 1, 1, 2, 2, 2, 2, 2}, m90124l = {184, 187, 207}, m90125m = "invokeSuspend", m90126n = {"unifyService", "unifyService", "loanConfigState", "unifyService", "loanConfigState", "userLeverageState", "visibleCurrencies", "loanCurrencyItems"}, m90127s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4"})
@SourceDebugExtension({"SMAP\nUnifyLoanCurrencySelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n504#2,7:251\n1617#3,9:258\n1869#3:267\n1870#3:269\n1626#3:270\n1#4:268\n*S KotlinDebug\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1\n*L\n191#1:251,7\n194#1:258,9\n194#1:267\n194#1:269\n194#1:270\n194#1:268\n*E\n"})
public final class UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ UnifyLoanCurrencySelectDialog this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1$1 */
    /* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1$1", m90122f = "UnifyLoanCurrencySelectDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119341 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<UnifyLoanCurrencySelectDialog.LoanCurrencyItem> $loanCurrencyItems;
        int label;
        final /* synthetic */ UnifyLoanCurrencySelectDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119341(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog, List<UnifyLoanCurrencySelectDialog.LoanCurrencyItem> list, Continuation<? super C119341> continuation) {
            super(2, continuation);
            this.this$0 = unifyLoanCurrencySelectDialog;
            this.$loanCurrencyItems = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C119341(this.this$0, this.$loanCurrencyItems, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C119341) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f20455u0 = this.$loanCurrencyItems;
                this.this$0.f20453s0.setValue(this.$loanCurrencyItems);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog, Continuation<? super UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1> continuation) {
        super(2, continuation);
        this.this$0 = unifyLoanCurrencySelectDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x012e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0181, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r9, r10, r18) == r1) goto L64;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IUnifyAccountService iUnifyAccountService;
        Object objM90884H;
        Object objM90884H2;
        IUnifyAccountService iUnifyAccountService2;
        Map map;
        Map mapEmptyMap;
        Bundle arguments;
        String string;
        Bundle arguments2;
        String string2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        List listEmptyList;
        CoinInfoEntity coinInfoEntityM85613u;
        UnifyLoanCurrencySelectDialog.LoanCurrencyItem loanCurrencyItem;
        String currency;
        String iconUrl;
        BigDecimal bigDecimal;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            iUnifyAccountService = IUnifyAccountService.f53155a.get();
            InterfaceC41634e<Map<String, List<BigDecimal>>> interfaceC41634eMo64990d = iUnifyAccountService.mo64990d();
            this.L$0 = iUnifyAccountService;
            this.label = 1;
            objM90884H = C41636g.m90884H(interfaceC41634eMo64990d, this);
            if (objM90884H != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            iUnifyAccountService = (IUnifyAccountService) this.L$0;
            ResultKt.throwOnFailure(obj);
            objM90884H = obj;
        } else if (i11 == 2) {
            map = (Map) this.L$1;
            IUnifyAccountService iUnifyAccountService3 = (IUnifyAccountService) this.L$0;
            ResultKt.throwOnFailure(obj);
            iUnifyAccountService2 = iUnifyAccountService3;
            objM90884H2 = obj;
            mapEmptyMap = (Map) objM90884H2;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            arguments = this.this$0.getArguments();
            if (arguments != null) {
                string = arguments.getString("baseCurrency");
            } else {
                string = null;
            }
            arguments2 = this.this$0.getArguments();
            if (arguments2 != null) {
                string2 = arguments2.getString("quoteCurrency");
            } else {
                string2 = null;
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!((List) entry.getValue()).isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> listM21947a = C11948c.m21947a(string, string2, linkedHashMap.keySet());
            arrayList = new ArrayList();
            for (String str : listM21947a) {
                listEmptyList = (List) map.get(str);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (listEmptyList.isEmpty()) {
                    loanCurrencyItem = null;
                } else {
                    coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
                    String strM66677q = C27041f.m66677q(str);
                    if (coinInfoEntityM85613u != null || (currency = coinInfoEntityM85613u.getCurrency()) == null) {
                        currency = str;
                    }
                    if (coinInfoEntityM85613u != null) {
                        iconUrl = coinInfoEntityM85613u.getIconUrl();
                    } else {
                        iconUrl = null;
                    }
                    bigDecimal = (BigDecimal) mapEmptyMap.get(str);
                    if (bigDecimal == null) {
                        bigDecimal = (BigDecimal) CollectionsKt.last(listEmptyList);
                    }
                    loanCurrencyItem = new UnifyLoanCurrencySelectDialog.LoanCurrencyItem(strM66677q, str, currency, iconUrl, bigDecimal);
                }
                if (loanCurrencyItem != null) {
                    arrayList.add(loanCurrencyItem);
                }
            }
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C119341 c119341 = new C119341(this.this$0, arrayList, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(iUnifyAccountService2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(map);
            this.L$2 = SpillingKt.nullOutSpilledVariable(mapEmptyMap);
            this.L$3 = SpillingKt.nullOutSpilledVariable(listM21947a);
            this.L$4 = SpillingKt.nullOutSpilledVariable(arrayList);
            this.label = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        Map mapEmptyMap2 = (Map) objM90884H;
        if (mapEmptyMap2 == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        InterfaceC41634e<Map<String, BigDecimal>> interfaceC41634eMo65005u = iUnifyAccountService.mo65005u();
        this.L$0 = SpillingKt.nullOutSpilledVariable(iUnifyAccountService);
        this.L$1 = mapEmptyMap2;
        this.label = 2;
        objM90884H2 = C41636g.m90884H(interfaceC41634eMo65005u, this);
        if (objM90884H2 != coroutine_suspended) {
            Map map2 = mapEmptyMap2;
            iUnifyAccountService2 = iUnifyAccountService;
            map = map2;
            mapEmptyMap = (Map) objM90884H2;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            arguments = this.this$0.getArguments();
            if (arguments != null) {
                string = arguments.getString("baseCurrency");
            } else {
                string = null;
            }
            arguments2 = this.this$0.getArguments();
            if (arguments2 != null) {
                string2 = arguments2.getString("quoteCurrency");
            } else {
                string2 = null;
            }
            linkedHashMap = new LinkedHashMap();
            while (r10.hasNext()) {
                if (!((List) entry.getValue()).isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> listM21947a2 = C11948c.m21947a(string, string2, linkedHashMap.keySet());
            arrayList = new ArrayList();
            while (r9.hasNext()) {
                listEmptyList = (List) map.get(str);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (listEmptyList.isEmpty()) {
                    loanCurrencyItem = null;
                } else {
                    coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
                    String strM66677q2 = C27041f.m66677q(str);
                    if (coinInfoEntityM85613u != null) {
                        currency = str;
                    } else {
                        currency = str;
                    }
                    if (coinInfoEntityM85613u != null) {
                        iconUrl = coinInfoEntityM85613u.getIconUrl();
                    } else {
                        iconUrl = null;
                    }
                    bigDecimal = (BigDecimal) mapEmptyMap.get(str);
                    if (bigDecimal == null) {
                        bigDecimal = (BigDecimal) CollectionsKt.last(listEmptyList);
                    }
                    loanCurrencyItem = new UnifyLoanCurrencySelectDialog.LoanCurrencyItem(strM66677q2, str, currency, iconUrl, bigDecimal);
                }
                if (loanCurrencyItem != null) {
                    arrayList.add(loanCurrencyItem);
                }
            }
            AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
            C119341 c119342 = new C119341(this.this$0, arrayList, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(iUnifyAccountService2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(map);
            this.L$2 = SpillingKt.nullOutSpilledVariable(mapEmptyMap);
            this.L$3 = SpillingKt.nullOutSpilledVariable(listM21947a2);
            this.L$4 = SpillingKt.nullOutSpilledVariable(arrayList);
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
