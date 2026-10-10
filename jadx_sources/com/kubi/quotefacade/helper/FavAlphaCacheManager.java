package com.kubi.quotefacade.helper;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import cv.C36544a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: FavCacheManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0003J\u0014\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\u0006\u0010\u0013\u001a\u00020\rJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J,\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005J*\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0007J*\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0007J(\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00052\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0003J\b\u0010#\u001a\u00020\rH\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010%\u001a\u00020\rH\u0002J:\u0010&\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010'\u001a\u00020\u001b2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010(J@\u0010&\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010'\u001a\u00020\u001b2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/FavAlphaCacheManager;", "", "<init>", "()V", "TAG", "", "localAlphaFavorList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/quotefacade/helper/FavItem;", "onlineAlphaFavorList", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "init", "", "loadLocalCacheFromSp", "observeLoginState", "updateOnlineFavorList", "tokenChains", "", "clearOnlineCache", "getAlphaFavorList", "getAlphaFavorListTimestamp", "currentFavorList", "saveNewList", "symbols", "onSuccess", "Lkotlin/Function1;", "", "isNativeFavor", "tokenChain", "changedFavor", "onAddSuccess", "item", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "toggleLocalFavor", "saveLocal2Sp", "toggleOnlineFavor", "showOnlineFavorLimitToast", "changedFavorLogin", "isToast", "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CheckIsFavorCommand.KEY_IS_FAV, "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCacheManager.kt\ncom/kubi/quotefacade/helper/FavAlphaCacheManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,654:1\n32#2:655\n23#2,2:719\n149#3:656\n45#4,7:657\n45#4,7:676\n45#4,7:686\n45#4,7:698\n45#4,7:705\n45#4,7:712\n1563#5:664\n1634#5,3:665\n1563#5:668\n1634#5,3:669\n1563#5:672\n1634#5,3:673\n1761#5,3:683\n1761#5,3:695\n15#6,2:693\n*S KotlinDebug\n*F\n+ 1 FavCacheManager.kt\ncom/kubi/quotefacade/helper/FavAlphaCacheManager\n*L\n432#1:655\n561#1:719,2\n436#1:656\n447#1:657,7\n506#1:676,7\n551#1:686,7\n613#1:698,7\n648#1:705,7\n455#1:712,7\n466#1:664\n466#1:665,3\n478#1:668\n478#1:669,3\n502#1:672\n502#1:673,3\n512#1:683,3\n568#1:695,3\n557#1:693,2\n*E\n"})
public final class FavAlphaCacheManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FavAlphaCacheManager f41929a = new FavAlphaCacheManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CopyOnWriteArrayList<FavItem> f41930b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CopyOnWriteArrayList<FavItem> f41931c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final QuoteMarketRepository f41932d = new QuoteMarketRepository();

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.FavAlphaCacheManager$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C22125a extends TypeToken<ArrayList<FavItem>> {
    }

    /* JADX INFO: renamed from: K */
    public final void m51815K(final String str) {
        synchronized (this) {
            try {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41931c;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<T> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((FavItem) it.next()).getSymbol(), str)) {
                            CopyOnWriteArrayList<FavItem> copyOnWriteArrayList2 = f41931c;
                            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.helper.u0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(FavAlphaCacheManager.m51795L(str, (FavItem) obj));
                                }
                            };
                            copyOnWriteArrayList2.removeIf(new Predicate() { // from class: com.kubi.quotefacade.helper.v0
                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return FavAlphaCacheManager.m51796M(function1, obj);
                                }
                            });
                        }
                    }
                }
                f41931c.add(0, new FavItem(str, System.nanoTime()));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m51821r() {
        synchronized (this) {
            f41931c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m51792E() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.addAll(f41930b);
            C46392a.m102333p(QuoteKV.f42044a.m52041a(), C27099x.m66919i(copyOnWriteArrayList, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m51806l(FavAlphaCacheManager favAlphaCacheManager, AlphaItemEntity alphaItemEntity, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        favAlphaCacheManager.m51817j(alphaItemEntity, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m51807m(FavAlphaCacheManager favAlphaCacheManager, String str, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        favAlphaCacheManager.m51818k(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m51808p(FavAlphaCacheManager favAlphaCacheManager, AlphaItemEntity alphaItemEntity, boolean z11, Function1 function1, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return favAlphaCacheManager.m51819n(alphaItemEntity, z11, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m51809q(FavAlphaCacheManager favAlphaCacheManager, String str, boolean z11, boolean z12, Function1 function1, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return favAlphaCacheManager.m51820o(str, z11, z13, function1, continuation);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m51810z(Boolean bool) {
        f41929a.m51821r();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final void m51812F(@NotNull List<String> symbols, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        if (C22220x0.m52130c()) {
            return;
        }
        C44128b.m97266j("FavAlphaCacheManager", "saveNewList=" + symbols);
        try {
            if (f41930b.size() + symbols.size() > 150) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            List listSortedDescending = CollectionsKt.sortedDescending(symbols);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedDescending, 10));
            Iterator it = listSortedDescending.iterator();
            while (it.hasNext()) {
                arrayList.add(new FavItem((String) it.next(), System.nanoTime()));
            }
            f41930b.addAll(arrayList);
            m51811D();
        } catch (Exception e11) {
            C37266a.m83411b(e11, "FavAlphaCacheManager saveNewList error");
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m51813G() {
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
    }

    /* JADX INFO: renamed from: N */
    public final void m51816N(@NotNull List<String> tokenChains) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        if (C22220x0.m52130c()) {
            synchronized (this) {
                try {
                    CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41931c;
                    copyOnWriteArrayList.clear();
                    List listTake = CollectionsKt.take(tokenChains, 150);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                    Iterator it = listTake.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FavItem((String) it.next(), System.nanoTime()));
                    }
                    copyOnWriteArrayList.addAll(arrayList);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: j */
    public final void m51817j(@Nullable AlphaItemEntity alphaItemEntity, @Nullable Function1<? super Boolean, Unit> function1) {
        if (alphaItemEntity == null || C22220x0.m52130c()) {
            return;
        }
        C44128b.m97266j("FavAlphaCacheManager", "Token-Chain=" + alphaItemEntity.getUniqueCode());
        m51814H(alphaItemEntity.getUniqueCode(), function1);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: k */
    public final void m51818k(@Nullable String str, @Nullable Function1<? super Boolean, Unit> function1) {
        if (str == null || StringsKt.isBlank(str) || C22220x0.m52130c()) {
            return;
        }
        m51814H(str, function1);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m51819n(@Nullable AlphaItemEntity alphaItemEntity, boolean z11, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        FavAlphaCacheManager$changedFavorLogin$1 favAlphaCacheManager$changedFavorLogin$1;
        Function1<? super Boolean, Unit> function2;
        String str;
        boolean z12;
        if (continuation instanceof FavAlphaCacheManager$changedFavorLogin$1) {
            favAlphaCacheManager$changedFavorLogin$1 = (FavAlphaCacheManager$changedFavorLogin$1) continuation;
            int i11 = favAlphaCacheManager$changedFavorLogin$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favAlphaCacheManager$changedFavorLogin$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favAlphaCacheManager$changedFavorLogin$1 = new FavAlphaCacheManager$changedFavorLogin$1(this, continuation);
            }
        } else {
            favAlphaCacheManager$changedFavorLogin$1 = new FavAlphaCacheManager$changedFavorLogin$1(this, continuation);
        }
        Object obj = favAlphaCacheManager$changedFavorLogin$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favAlphaCacheManager$changedFavorLogin$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (alphaItemEntity == null || !C22220x0.m52130c()) {
                return Unit.INSTANCE;
            }
            String uniqueCode = alphaItemEntity.getUniqueCode();
            boolean zM81808a = C36544a.m81808a(alphaItemEntity);
            if (!zM81808a && f41931c.size() >= 150) {
                m51813G();
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }
            try {
                QuoteMarketRepository quoteMarketRepository = f41932d;
                List<String> listListOf = CollectionsKt.listOf(uniqueCode);
                favAlphaCacheManager$changedFavorLogin$1.L$0 = SpillingKt.nullOutSpilledVariable(alphaItemEntity);
                favAlphaCacheManager$changedFavorLogin$1.L$1 = function1;
                favAlphaCacheManager$changedFavorLogin$1.L$2 = uniqueCode;
                favAlphaCacheManager$changedFavorLogin$1.Z$0 = z11;
                favAlphaCacheManager$changedFavorLogin$1.Z$1 = zM81808a;
                favAlphaCacheManager$changedFavorLogin$1.label = 1;
                if (quoteMarketRepository.m52992f(listListOf, favAlphaCacheManager$changedFavorLogin$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function2 = function1;
                str = uniqueCode;
                z12 = zM81808a;
            } catch (ApiException e11) {
                e = e11;
                if (Intrinsics.areEqual(e.code, "420000")) {
                    m51813G();
                }
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(false));
                }
            } catch (Exception e12) {
                e = e12;
                C37266a.m83411b(e, "FavAlphaCacheManager");
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(false));
                }
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.common_text_network_error, new Object[0]), new Object[0]);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = favAlphaCacheManager$changedFavorLogin$1.Z$1;
            z11 = favAlphaCacheManager$changedFavorLogin$1.Z$0;
            str = (String) favAlphaCacheManager$changedFavorLogin$1.L$2;
            function2 = (Function1) favAlphaCacheManager$changedFavorLogin$1.L$1;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (ApiException e13) {
                e = e13;
                function1 = function2;
                if (Intrinsics.areEqual(e.code, "420000")) {
                    m51813G();
                }
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(false));
                }
            } catch (Exception e14) {
                e = e14;
                function1 = function2;
                C37266a.m83411b(e, "FavAlphaCacheManager");
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(false));
                }
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.common_text_network_error, new Object[0]), new Object[0]);
            }
        }
        m51815K(str);
        if (z11) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(z12 ? R$string.cancel_favor_ok : R$string.add_favorites_ok, new Object[0]), new Object[0]);
        }
        if (function2 != null) {
            function2.invoke(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m51820o(@NotNull String str, boolean z11, boolean z12, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        FavAlphaCacheManager$changedFavorLogin$2 favAlphaCacheManager$changedFavorLogin$2;
        if (continuation instanceof FavAlphaCacheManager$changedFavorLogin$2) {
            favAlphaCacheManager$changedFavorLogin$2 = (FavAlphaCacheManager$changedFavorLogin$2) continuation;
            int i11 = favAlphaCacheManager$changedFavorLogin$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favAlphaCacheManager$changedFavorLogin$2.label = i11 - Integer.MIN_VALUE;
            } else {
                favAlphaCacheManager$changedFavorLogin$2 = new FavAlphaCacheManager$changedFavorLogin$2(this, continuation);
            }
        } else {
            favAlphaCacheManager$changedFavorLogin$2 = new FavAlphaCacheManager$changedFavorLogin$2(this, continuation);
        }
        Object obj = favAlphaCacheManager$changedFavorLogin$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favAlphaCacheManager$changedFavorLogin$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!C22220x0.m52130c()) {
                    return Unit.INSTANCE;
                }
                if (!z11 && f41931c.size() >= 150) {
                    m51813G();
                    if (function1 != null) {
                        function1.invoke(Boxing.boxBoolean(false));
                    }
                    return Unit.INSTANCE;
                }
                QuoteMarketRepository quoteMarketRepository = f41932d;
                List<String> listListOf = CollectionsKt.listOf(str);
                favAlphaCacheManager$changedFavorLogin$2.L$0 = str;
                favAlphaCacheManager$changedFavorLogin$2.L$1 = function1;
                favAlphaCacheManager$changedFavorLogin$2.Z$0 = z11;
                favAlphaCacheManager$changedFavorLogin$2.Z$1 = z12;
                favAlphaCacheManager$changedFavorLogin$2.label = 1;
                if (quoteMarketRepository.m52992f(listListOf, favAlphaCacheManager$changedFavorLogin$2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = favAlphaCacheManager$changedFavorLogin$2.Z$1;
                z11 = favAlphaCacheManager$changedFavorLogin$2.Z$0;
                function1 = (Function1) favAlphaCacheManager$changedFavorLogin$2.L$1;
                str = (String) favAlphaCacheManager$changedFavorLogin$2.L$0;
                ResultKt.throwOnFailure(obj);
            }
            m51815K(str);
            if (z12) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(z11 ? R$string.cancel_favor_ok : R$string.add_favorites_ok, new Object[0]), new Object[0]);
            }
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(true));
            }
        } catch (ApiException e11) {
            if (Intrinsics.areEqual(e11.code, "420000")) {
                m51813G();
            }
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(false));
            }
        } catch (Exception e12) {
            C37266a.m83411b(e12, "FavAlphaCacheManager");
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(false));
            }
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.common_text_network_error, new Object[0]), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m51826w(@NotNull String tokenChain) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        C44128b.m97266j("FavAlphaCacheManager", "isNativeFavor=" + tokenChain);
        CopyOnWriteArrayList<FavItem> copyOnWriteArrayListM51822s = m51822s();
        if (copyOnWriteArrayListM51822s != null && copyOnWriteArrayListM51822s.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayListM51822s.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((FavItem) it.next()).getSymbol(), tokenChain)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m51827x() {
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52041a(), "");
        C44128b.m97266j("FavAlphaCacheManager", "init alphaDataListStr=" + strM102326h);
        if (TextUtils.isEmpty(strM102326h)) {
            return;
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            ArrayList arrayList = (ArrayList) C27099x.m66914d(strM102326h, new C22125a().getType());
            if (!arrayList.isEmpty()) {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41930b;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(CollectionsKt.take(arrayList, 150));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("init local=");
            CopyOnWriteArrayList<FavItem> copyOnWriteArrayList2 = f41930b;
            sb2.append(copyOnWriteArrayList2);
            C44128b.m97266j("FavAlphaCacheManager", sb2.toString());
            C43840a.m96550d("alpha_favor_data init finish, size=" + copyOnWriteArrayList2.size() + '.', "FavAlphaCacheManager");
        } catch (Throwable th2) {
            C37266a.m83411b(th2, "AddFavorManager");
        }
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: y */
    public final void m51828y() {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.helper.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavAlphaCacheManager.m51810z((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.quotefacade.helper.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavAlphaCacheManager.m51789A(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavAlphaCacheManager.m51790B((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.helper.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavAlphaCacheManager.m51791C(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final void m51789A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m51790B(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37266a.m83411b(th2, "FavAlphaCacheManager");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m51791C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m51793I(String str, FavItem favItem) {
        return Intrinsics.areEqual(favItem.getSymbol(), str);
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m51794J(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m51795L(String str, FavItem favItem) {
        return Intrinsics.areEqual(favItem.getSymbol(), str);
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m51796M(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    public final void m51811D() {
        if (C22220x0.m52130c()) {
            return;
        }
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.quotefacade.helper.w0
            @Override // java.lang.Runnable
            public final void run() {
                FavAlphaCacheManager.m51792E();
            }
        });
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: H */
    public final void m51814H(final String str, Function1<? super Boolean, Unit> function1) {
        try {
            if (m51826w(str)) {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41930b;
                final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.s0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(FavAlphaCacheManager.m51793I(str, (FavItem) obj));
                    }
                };
                copyOnWriteArrayList.removeIf(new Predicate() { // from class: com.kubi.quotefacade.helper.t0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return FavAlphaCacheManager.m51794J(function2, obj);
                    }
                });
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.cancel_favor_ok, new Object[0]), new Object[0]);
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            } else {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList2 = f41930b;
                if (copyOnWriteArrayList2.size() >= 150) {
                    ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                copyOnWriteArrayList2.add(0, new FavItem(str, System.nanoTime()));
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.add_favorites_ok, new Object[0]), new Object[0]);
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
            m51811D();
        } catch (Exception e11) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            C37266a.m83411b(e11, "FavAlphaCacheManager toggleLocalFavor error");
        }
    }

    /* JADX INFO: renamed from: s */
    public final CopyOnWriteArrayList<FavItem> m51822s() {
        if (C22220x0.m52130c()) {
            return f41931c;
        }
        return f41930b;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final List<String> m51823t() {
        CopyOnWriteArrayList<FavItem> copyOnWriteArrayListM51822s = m51822s();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(copyOnWriteArrayListM51822s, 10));
        Iterator<T> it = copyOnWriteArrayListM51822s.iterator();
        while (it.hasNext()) {
            arrayList.add(((FavItem) it.next()).getSymbol());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<FavItem> m51824u() {
        return m51822s();
    }

    /* JADX INFO: renamed from: v */
    public final void m51825v() {
        m51827x();
        m51828y();
    }
}
