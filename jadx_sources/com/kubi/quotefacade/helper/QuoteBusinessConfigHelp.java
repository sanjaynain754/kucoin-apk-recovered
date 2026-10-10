package com.kubi.quotefacade.helper;

import android.annotation.SuppressLint;
import com.kubi.quotefacade.entity.ComplianceFinanceRuleEntity;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: QuoteBusinessConfigHelp.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/QuoteBusinessConfigHelp;", "", "<init>", "()V", "FUTURES_EXCLUDE_MARK", "", "ALPHA_EXCLUDE_MARK", "FUTURES_BIZ_CONTROL_SPM", "ALPHA_BIZ_ON_DO_SPM", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "excludes", "businessConfig", "Lcom/kubi/quotefacade/entity/ComplianceFinanceRuleEntity;", "mergeExcludesWithBizControl", "raw", "observeLoginState", "", "refreshBusinessConfigMarkList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBusinessConfigMarkList", "isFuturesMarksAllowed", "", "futuresMarks", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteBusinessConfigHelp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteBusinessConfigHelp.kt\ncom/kubi/quotefacade/helper/QuoteBusinessConfigHelp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,133:1\n1563#2:134\n1634#2,3:135\n774#2:138\n865#2,2:139\n774#2:152\n865#2,2:153\n1761#2,3:155\n116#3,11:141\n*S KotlinDebug\n*F\n+ 1 QuoteBusinessConfigHelp.kt\ncom/kubi/quotefacade/helper/QuoteBusinessConfigHelp\n*L\n52#1:134\n52#1:135,3\n53#1:138\n53#1:139,2\n127#1:152\n127#1:153,2\n128#1:155,3\n88#1:141,11\n*E\n"})
public final class QuoteBusinessConfigHelp {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final QuoteBusinessConfigHelp f41933a = new QuoteBusinessConfigHelp();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final QuoteMarketRepository f41934b = new QuoteMarketRepository();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC44082a f41935c = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41709m0 f41936d = C41713n0.m91125a(C42911a.m94120b());

    /* JADX INFO: renamed from: e */
    @Nullable
    public static String f41937e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static ComplianceFinanceRuleEntity f41938f;

    /* JADX INFO: renamed from: j */
    public final boolean m51846j(@Nullable List<String> list) {
        List listEmptyList;
        List listSplit$default;
        if (list != null && !list.isEmpty()) {
            String str = f41937e;
            if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) {
                listEmptyList = null;
            } else {
                listEmptyList = new ArrayList();
                for (Object obj : listSplit$default) {
                    if (((String) obj).length() > 0) {
                        listEmptyList.add(obj);
                    }
                }
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (listEmptyList == null || !listEmptyList.isEmpty()) {
                Iterator it = listEmptyList.iterator();
                while (it.hasNext()) {
                    if (list.contains((String) it.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static final Boolean m51837m(AccountEventState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(UserInfo.a.n());
    }

    /* JADX INFO: renamed from: n */
    public static final Boolean m51838n(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m51839o(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue();
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m51840p(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m51841q(Boolean bool) {
        C41696j.m91104d(f41936d, null, null, new QuoteBusinessConfigHelp$observeLoginState$3$1(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m51843s(Throwable th2) {
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m51845i() {
        String str = f41937e;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            return str;
        }
        C41686h.m91047e(C42911a.m94120b(), new QuoteBusinessConfigHelp$getBusinessConfigMarkList$1(null));
        String str2 = f41937e;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX INFO: renamed from: k */
    public final String m51847k(String str) {
        List arrayList;
        List listSplit$default;
        C38057a c38057a = C38057a.f85671a;
        boolean zM85928a = c38057a.m85928a("kcApp.B6FuturesTrade.More.AtsContract.1", true);
        boolean zM85928a2 = c38057a.m85928a("kcApp.B5marketAlpha.stocks.1", true);
        if (zM85928a && zM85928a2) {
            return str;
        }
        if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList = CollectionsKt.toMutableList((Collection) arrayList3);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        List list = arrayList;
        if (!zM85928a && !list.contains("Futures")) {
            list.add("Futures");
        }
        if (!zM85928a2 && !list.contains("Ondo")) {
            list.add("Ondo");
        }
        return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: l */
    public final void m51848l() {
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.helper.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteBusinessConfigHelp.m51837m((AccountEventState) obj);
            }
        };
        Observable observableDistinctUntilChanged = observableA.map(new Function() { // from class: com.kubi.quotefacade.helper.y1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return QuoteBusinessConfigHelp.m51838n(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.z1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(QuoteBusinessConfigHelp.m51839o((Boolean) obj));
            }
        };
        Observable observableFilter = observableDistinctUntilChanged.filter(new Predicate() { // from class: com.kubi.quotefacade.helper.a2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return QuoteBusinessConfigHelp.m51840p(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.quotefacade.helper.b2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteBusinessConfigHelp.m51841q((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.quotefacade.helper.c2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QuoteBusinessConfigHelp.m51842r(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.quotefacade.helper.d2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteBusinessConfigHelp.m51843s((Throwable) obj);
            }
        };
        observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.helper.e2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QuoteBusinessConfigHelp.m51844t(function4, obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[Catch: all -> 0x0032, Exception -> 0x00a5, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:35:0x008c, B:37:0x0090, B:40:0x00a5), top: B:46:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: u */
    public final Object m51849u(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1 quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1;
        InterfaceC44082a interfaceC44082a;
        int i11;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        ComplianceFinanceRuleEntity complianceFinanceRuleEntity;
        if (continuation instanceof QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1) {
            quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1 = (QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1) continuation;
            int i12 = quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.label = i12 - Integer.MIN_VALUE;
            } else {
                quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1 = new QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1(this, continuation);
            }
        } else {
            quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1 = new QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1(this, continuation);
        }
        Object obj = quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.label;
        try {
            try {
                if (i13 == 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC44082a = f41935c;
                    quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.L$0 = interfaceC44082a;
                    quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.I$0 = 0;
                    quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.label = 1;
                    if (interfaceC44082a.mo91344d(null, quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1) != coroutine_suspended) {
                        i11 = 0;
                    }
                    return coroutine_suspended;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC44082a2 = (InterfaceC44082a) quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            complianceFinanceRuleEntity = (ComplianceFinanceRuleEntity) obj;
                            if (complianceFinanceRuleEntity != null) {
                                f41938f = complianceFinanceRuleEntity;
                                f41937e = f41933a.m51847k(complianceFinanceRuleEntity.getExcludes());
                                QuoteBusinessConfigMMKV.f41982a.m51920e(complianceFinanceRuleEntity);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC44082a2.mo91345e(null);
                            throw th2;
                        }
                    } catch (Exception unused) {
                    }
                    Unit unit = Unit.INSTANCE;
                    interfaceC44082a2.mo91345e(null);
                    return Unit.INSTANCE;
                }
                i11 = quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.I$0;
                InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = interfaceC44082a3;
                QuoteMarketRepository quoteMarketRepository = f41934b;
                quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.L$0 = interfaceC44082a;
                quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.I$0 = i11;
                quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.I$1 = 0;
                quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1.label = 2;
                Object objM52998m = quoteMarketRepository.m52998m(quoteBusinessConfigHelp$refreshBusinessConfigMarkList$1);
                if (objM52998m != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a;
                    obj = objM52998m;
                    complianceFinanceRuleEntity = (ComplianceFinanceRuleEntity) obj;
                    if (complianceFinanceRuleEntity != null) {
                        f41938f = complianceFinanceRuleEntity;
                        f41937e = f41933a.m51847k(complianceFinanceRuleEntity.getExcludes());
                        QuoteBusinessConfigMMKV.f41982a.m51920e(complianceFinanceRuleEntity);
                    }
                    Unit unit2 = Unit.INSTANCE;
                    interfaceC44082a2.mo91345e(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Exception unused2) {
                interfaceC44082a2 = interfaceC44082a;
            }
            ComplianceFinanceRuleEntity complianceFinanceRuleEntityM51918b = QuoteBusinessConfigMMKV.f41982a.m51918b();
            f41938f = complianceFinanceRuleEntityM51918b;
            f41937e = f41933a.m51847k(complianceFinanceRuleEntityM51918b != null ? complianceFinanceRuleEntityM51918b.getExcludes() : null);
        } catch (Throwable th4) {
            interfaceC44082a2 = interfaceC44082a;
            th2 = th4;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m51842r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final void m51844t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
