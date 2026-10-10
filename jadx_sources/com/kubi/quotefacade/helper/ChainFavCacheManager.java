package com.kubi.quotefacade.helper;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: ChainFavCacheManager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0003J\u0014\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0014\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0005J\u0010\u0010\u001d\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0016\u0010 \u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0002J\u0016\u0010!\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0002J\u0012\u0010\"\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00050\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/ChainFavCacheManager;", "", "<init>", "()V", "TAG", "", "CHAIN_FAVOR_LIST_LIMIT", "", "localFavorTokenList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "localTokenMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "onlineFavorTokenList", "onlineTokenMap", "loadLocalCacheFromSp", "", "observeLoginState", "updateOnlineFavorList", "tokens", "", "clearOnlineCache", "changeChainFavor", "tokenWithChain", "mChainBean", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "deleteList", "tokenList", "providerChainCacheList", "isNativeFavor", "toggleLocalFavor", "toggleOnlineFavor", "replaceLocalList", "replaceOnlineList", "save2Sp", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainFavCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainFavCacheManager.kt\ncom/kubi/quotefacade/helper/ChainFavCacheManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 6 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,199:1\n32#2:200\n23#2,2:243\n47#3,4:201\n1869#4,2:205\n1869#4,2:207\n1869#4,2:230\n1869#4,2:232\n45#5,7:209\n45#5,7:216\n45#5,7:223\n45#5,7:236\n15#6,2:234\n*S KotlinDebug\n*F\n+ 1 ChainFavCacheManager.kt\ncom/kubi/quotefacade/helper/ChainFavCacheManager\n*L\n44#1:200\n196#1:243,2\n46#1:201,4\n110#1:205,2\n113#1:207,2\n183#1:230,2\n190#1:232,2\n117#1:209,7\n158#1:216,7\n174#1:223,7\n62#1:236,7\n196#1:234,2\n*E\n"})
public final class ChainFavCacheManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ChainFavCacheManager f41922a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CopyOnWriteArrayList<String> f41923b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ConcurrentHashMap<String, Boolean> f41924c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CopyOnWriteArrayList<String> f41925d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final ConcurrentHashMap<String, Boolean> f41926e;

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.ChainFavCacheManager$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ChainFavCacheManager.kt\ncom/kubi/quotefacade/helper/ChainFavCacheManager\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,49:1\n47#2:50\n48#2:58\n45#3,7:51\n*S KotlinDebug\n*F\n+ 1 ChainFavCacheManager.kt\ncom/kubi/quotefacade/helper/ChainFavCacheManager\n*L\n47#1:51,7\n*E\n"})
    public static final class C22123a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C37266a.m83411b(exception, "ChainFavCacheManager");
        }

        public C22123a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m51775i() {
        synchronized (this) {
            f41925d.clear();
            f41926e.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m51785x(String str) {
        synchronized (this) {
            try {
                try {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap = f41924c;
                    Boolean bool = concurrentHashMap.get(str);
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.areEqual(bool, bool2)) {
                        f41923b.remove(str);
                        concurrentHashMap.remove(str);
                    } else {
                        CopyOnWriteArrayList<String> copyOnWriteArrayList = f41923b;
                        if (copyOnWriteArrayList.size() >= 100) {
                            concurrentHashMap.remove(copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1));
                        }
                        copyOnWriteArrayList.add(0, str);
                        concurrentHashMap.put(str, bool2);
                    }
                    f41922a.m51784v(f41923b);
                } catch (Exception e11) {
                    C37266a.m83411b(e11, "ChainFavCacheManager toggleLocalFavor error");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m51786y(String str) {
        synchronized (this) {
            try {
                try {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap = f41926e;
                    Boolean bool = concurrentHashMap.get(str);
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.areEqual(bool, bool2)) {
                        f41925d.remove(str);
                        concurrentHashMap.remove(str);
                    } else {
                        f41925d.add(0, str);
                        concurrentHashMap.put(str, bool2);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e11) {
                    C37266a.m83411b(e11, "ChainFavCacheManager toggleOnlineFavor error");
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static {
        ChainFavCacheManager chainFavCacheManager = new ChainFavCacheManager();
        f41922a = chainFavCacheManager;
        f41923b = new CopyOnWriteArrayList<>();
        f41924c = new ConcurrentHashMap<>();
        f41925d = new CopyOnWriteArrayList<>();
        f41926e = new ConcurrentHashMap<>();
        chainFavCacheManager.m51779m();
        chainFavCacheManager.m51780n();
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m51768o(Boolean bool) {
        f41922a.m51775i();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m51772w(ArrayList arrayList) {
        C46392a.m102333p(QuoteKV.f42044a.m52045e(), C27099x.m66919i(arrayList, false, 2, null));
    }

    /* JADX INFO: renamed from: g */
    public final void m51773g(@Nullable ChainItemEntity chainItemEntity) {
        if (chainItemEntity == null) {
            return;
        }
        m51774h(chainItemEntity.getToken() + '-' + chainItemEntity.getChain());
    }

    /* JADX INFO: renamed from: h */
    public final void m51774h(@NotNull String tokenWithChain) {
        Intrinsics.checkNotNullParameter(tokenWithChain, "tokenWithChain");
        if (UserInfo.a.n()) {
            m51786y(tokenWithChain);
        } else {
            m51785x(tokenWithChain);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m51776j(@NotNull List<String> tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        if (tokenList.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                try {
                    if (UserInfo.a.n()) {
                        f41925d.removeAll(CollectionsKt.toSet(tokenList));
                        Iterator<T> it = tokenList.iterator();
                        while (it.hasNext()) {
                            f41926e.remove((String) it.next());
                        }
                    } else {
                        f41923b.removeAll(CollectionsKt.toSet(tokenList));
                        Iterator<T> it2 = tokenList.iterator();
                        while (it2.hasNext()) {
                            f41924c.remove((String) it2.next());
                        }
                        f41922a.m51784v(f41923b);
                    }
                } catch (Exception e11) {
                    C37266a.m83411b(e11, "ChainFavCacheManager deleteList error");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m51777k(@Nullable ChainItemEntity chainItemEntity) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(chainItemEntity != null ? chainItemEntity.getToken() : null);
        sb2.append('-');
        sb2.append(chainItemEntity != null ? chainItemEntity.getChain() : null);
        return m51778l(sb2.toString());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m51778l(@NotNull String tokenWithChain) {
        Intrinsics.checkNotNullParameter(tokenWithChain, "tokenWithChain");
        if (UserInfo.a.n()) {
            Boolean bool = f41926e.get(tokenWithChain);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        Boolean bool2 = f41924c.get(tokenWithChain);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m51779m() {
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52045e(), "");
        if (TextUtils.isEmpty(strM102326h)) {
            return;
        }
        C41696j.m91104d(new QuoteCoroutineScope(C42911a.m94120b().plus(new C22123a(CoroutineExceptionHandler.INSTANCE)), "ChainFavCacheManager"), null, null, new ChainFavCacheManager$loadLocalCacheFromSp$2(strM102326h, null), 3, null);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: n */
    public final void m51780n() {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.helper.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainFavCacheManager.m51768o((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.quotefacade.helper.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChainFavCacheManager.m51769p(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainFavCacheManager.m51770q((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.helper.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChainFavCacheManager.m51771r(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final CopyOnWriteArrayList<String> m51781s() {
        return UserInfo.a.n() ? f41925d : f41923b;
    }

    /* JADX INFO: renamed from: t */
    public final void m51782t(List<String> list) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f41923b;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(list);
        f41924c.clear();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f41924c.put((String) it.next(), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m51783u(List<String> list) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f41925d;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(list);
        f41926e.clear();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f41926e.put((String) it.next(), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m51784v(CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(copyOnWriteArrayList);
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.quotefacade.helper.l
            @Override // java.lang.Runnable
            public final void run() {
                ChainFavCacheManager.m51772w(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m51787z(@NotNull List<String> tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        if (UserInfo.a.n()) {
            synchronized (this) {
                f41922a.m51783u(CollectionsKt.take(tokens, 100));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m51769p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m51770q(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37266a.m83411b(th2, "ChainFavCacheManager");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m51771r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
