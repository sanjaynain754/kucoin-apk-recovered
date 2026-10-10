package com.kubi.home.rank.impl.cache;

import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.restful.C23198n;
import com.kubi.utils.C27099x;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: RankCoinHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0087@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0083@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankCoinHelper;", "", "<init>", "()V", "needFetchCoinFromServer", "", "rankDao", "Lcom/kubi/home/rank/impl/cache/IRankDao;", "getRankDao", "()Lcom/kubi/home/rank/impl/cache/IRankDao;", "rankDao$delegate", "Lkotlin/Lazy;", "rankCoinApi", "Lcom/kubi/home/rank/impl/cache/IRankCoinApi;", "rankMemory", "Lcom/kubi/home/rank/impl/cache/IRankCoinMemory;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "RETRY_MAX", "", "getCoinEntity", "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;", FirebaseAnalytics.Param.CURRENCY, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinEntityFromLocal", "fetchCoinList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinEntityFromNet", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankCoinHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankCoinHelper.kt\ncom/kubi/home/rank/impl/cache/RankCoinHelper\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,134:1\n116#2,8:135\n125#2,2:144\n1#3:143\n149#4:146\n*S KotlinDebug\n*F\n+ 1 RankCoinHelper.kt\ncom/kubi/home/rank/impl/cache/RankCoinHelper\n*L\n65#1:135,8\n65#1:144,2\n90#1:146\n*E\n"})
public final class RankCoinHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RankCoinHelper f26031a = new RankCoinHelper();

    /* JADX INFO: renamed from: b */
    public static boolean f26032b = true;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f26033c = LazyKt.lazy(new Function0() { // from class: com.kubi.home.rank.impl.cache.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankCoinHelper.m29940j();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final IRankCoinApi f26034d = (IRankCoinApi) RetrofitFlowExKt.m42820a(IRankCoinApi.class);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final IRankCoinMemory f26035e = (IRankCoinMemory) new C23198n.a().m55669a().m55665b(IRankCoinMemory.class);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC44082a f26036f = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: g */
    public static final int f26037g = 3;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.RankCoinHelper$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C14770a extends TypeToken<List<? extends RankCoinEntity>> {
    }

    /* JADX INFO: renamed from: j */
    public static final IRankDao m29940j() {
        RankDatabaseProxy companion = RankDatabaseProxy.f26038a.getInstance();
        if (companion != null) {
            return companion.mo29948e();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008e -> B:29:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @android.annotation.SuppressLint({"CheckResult"})
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m29941e(@org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<? super java.util.List<com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.kubi.home.rank.impl.cache.RankCoinHelper$fetchCoinList$1
            if (r0 == 0) goto L13
            r0 = r11
            com.kubi.home.rank.impl.cache.RankCoinHelper$fetchCoinList$1 r0 = (com.kubi.home.rank.impl.cache.RankCoinHelper$fetchCoinList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.cache.RankCoinHelper$fetchCoinList$1 r0 = new com.kubi.home.rank.impl.cache.RankCoinHelper$fetchCoinList$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            p852kotlin.ResultKt.throwOnFailure(r11)
            r11 = r6
            goto L8f
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3e:
            int r2 = r0.I$3
            int r6 = r0.I$2
            int r7 = r0.I$1
            int r8 = r0.I$0
            p852kotlin.ResultKt.throwOnFailure(r11)
            r9 = r6
            r6 = r2
            r2 = r7
            r7 = r9
            goto L71
        L4e:
            p852kotlin.ResultKt.throwOnFailure(r11)
            int r11 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26037g
            r6 = r3
        L54:
            r2 = 0
            if (r6 >= r11) goto L93
            com.kubi.home.rank.impl.cache.RankCoinHelper r7 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26031a
            r0.L$0 = r2
            r0.I$0 = r11
            r0.I$1 = r6
            r0.I$2 = r6
            r0.I$3 = r3
            r0.label = r5
            java.lang.Object r2 = r7.m29944h(r0)
            if (r2 != r1) goto L6c
            goto L8d
        L6c:
            r8 = r11
            r11 = r2
            r2 = r6
            r7 = r2
            r6 = r3
        L71:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L92
            java.lang.Object r11 = p852kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r0.L$0 = r11
            r0.I$0 = r8
            r0.I$1 = r2
            r0.I$2 = r7
            r0.I$3 = r6
            r0.label = r4
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m90350b(r6, r0)
            if (r11 != r1) goto L8e
        L8d:
            return r1
        L8e:
            r11 = r8
        L8f:
            int r6 = r2 + 1
            goto L54
        L92:
            return r11
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.home.rank.impl.cache.RankCoinHelper.m29941e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:34:0x00a6, B:36:0x00aa, B:37:0x00ae, B:39:0x00b4, B:41:0x00c5, B:45:0x00d1, B:47:0x00d5, B:53:0x00e8), top: B:60:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:34:0x00a6, B:36:0x00aa, B:37:0x00ae, B:39:0x00b4, B:41:0x00c5, B:45:0x00d1, B:47:0x00d5, B:53:0x00e8), top: B:60:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:34:0x00a6, B:36:0x00aa, B:37:0x00ae, B:39:0x00b4, B:41:0x00c5, B:45:0x00d1, B:47:0x00d5, B:53:0x00e8), top: B:60:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1 A[EDGE_INSN: B:63:0x00d1->B:45:0x00d1 BREAK  A[LOOP:0: B:37:0x00ae->B:65:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity] */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m29942f(@NotNull String str, @NotNull Continuation<? super RankCoinEntity> continuation) throws Throwable {
        RankCoinHelper$getCoinEntity$1 rankCoinHelper$getCoinEntity$1;
        Ref.ObjectRef objectRef;
        InterfaceC44082a interfaceC44082a;
        String str2;
        Ref.ObjectRef objectRef2;
        int i11;
        InterfaceC44082a interfaceC44082a2;
        String str3;
        Ref.ObjectRef objectRef3;
        List list;
        T t11;
        Iterator it;
        Object next;
        RankCoinEntity rankCoinEntity;
        if (continuation instanceof RankCoinHelper$getCoinEntity$1) {
            rankCoinHelper$getCoinEntity$1 = (RankCoinHelper$getCoinEntity$1) continuation;
            int i12 = rankCoinHelper$getCoinEntity$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rankCoinHelper$getCoinEntity$1.label = i12 - Integer.MIN_VALUE;
            } else {
                rankCoinHelper$getCoinEntity$1 = new RankCoinHelper$getCoinEntity$1(this, continuation);
            }
        } else {
            rankCoinHelper$getCoinEntity$1 = new RankCoinHelper$getCoinEntity$1(this, continuation);
        }
        Object objM29941e = rankCoinHelper$getCoinEntity$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = rankCoinHelper$getCoinEntity$1.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(objM29941e);
                objectRef = new Ref.ObjectRef();
                ?? M29943g = m29943g(str);
                objectRef.element = M29943g;
                if (M29943g == 0 && f26032b) {
                    interfaceC44082a = f26036f;
                    rankCoinHelper$getCoinEntity$1.L$0 = str;
                    rankCoinHelper$getCoinEntity$1.L$1 = objectRef;
                    rankCoinHelper$getCoinEntity$1.L$2 = interfaceC44082a;
                    rankCoinHelper$getCoinEntity$1.I$0 = 0;
                    rankCoinHelper$getCoinEntity$1.label = 1;
                    if (interfaceC44082a.mo91344d(null, rankCoinHelper$getCoinEntity$1) != coroutine_suspended) {
                        str2 = str;
                        objectRef2 = objectRef;
                        i11 = 0;
                    }
                    return coroutine_suspended;
                }
                return objectRef.element;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) rankCoinHelper$getCoinEntity$1.L$3;
                interfaceC44082a2 = (InterfaceC44082a) rankCoinHelper$getCoinEntity$1.L$2;
                objectRef3 = (Ref.ObjectRef) rankCoinHelper$getCoinEntity$1.L$1;
                str3 = (String) rankCoinHelper$getCoinEntity$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM29941e);
                    list = (List) objM29941e;
                    if (list != null) {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            rankCoinEntity = (RankCoinEntity) next;
                            if (!Intrinsics.areEqual(rankCoinEntity.getCurrency(), str3)) {
                                break;
                            }
                        } while (!Intrinsics.areEqual(rankCoinEntity.getCode(), str3));
                        t11 = (RankCoinEntity) next;
                    } else {
                        t11 = 0;
                    }
                    objectRef2.element = t11;
                    f26032b = false;
                    objectRef = objectRef3;
                    Unit unit = Unit.INSTANCE;
                    interfaceC44082a2.mo91345e(null);
                    return objectRef.element;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC44082a2.mo91345e(null);
                    throw th;
                }
            }
            int i14 = rankCoinHelper$getCoinEntity$1.I$0;
            interfaceC44082a = (InterfaceC44082a) rankCoinHelper$getCoinEntity$1.L$2;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) rankCoinHelper$getCoinEntity$1.L$1;
            str2 = (String) rankCoinHelper$getCoinEntity$1.L$0;
            ResultKt.throwOnFailure(objM29941e);
            i11 = i14;
            objectRef2 = objectRef4;
            if (f26032b) {
                RankCoinHelper rankCoinHelper = f26031a;
                rankCoinHelper$getCoinEntity$1.L$0 = str2;
                rankCoinHelper$getCoinEntity$1.L$1 = objectRef2;
                rankCoinHelper$getCoinEntity$1.L$2 = interfaceC44082a;
                rankCoinHelper$getCoinEntity$1.L$3 = objectRef2;
                rankCoinHelper$getCoinEntity$1.I$0 = i11;
                rankCoinHelper$getCoinEntity$1.I$1 = 0;
                rankCoinHelper$getCoinEntity$1.label = 2;
                objM29941e = rankCoinHelper.m29941e(rankCoinHelper$getCoinEntity$1);
                if (objM29941e != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a;
                    str3 = str2;
                    objectRef3 = objectRef2;
                    list = (List) objM29941e;
                    if (list != null) {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            rankCoinEntity = (RankCoinEntity) next;
                            if (!Intrinsics.areEqual(rankCoinEntity.getCurrency(), str3)) {
                                break;
                                break;
                            }
                        } while (!Intrinsics.areEqual(rankCoinEntity.getCode(), str3));
                        t11 = (RankCoinEntity) next;
                    } else {
                        t11 = 0;
                    }
                    objectRef2.element = t11;
                    f26032b = false;
                    objectRef = objectRef3;
                }
                return coroutine_suspended;
            }
            objectRef2.element = f26031a.m29943g(str2);
            objectRef = objectRef2;
            interfaceC44082a2 = interfaceC44082a;
            Unit unit2 = Unit.INSTANCE;
            interfaceC44082a2.mo91345e(null);
            return objectRef.element;
        } catch (Throwable th3) {
            th = th3;
            interfaceC44082a2 = interfaceC44082a;
            interfaceC44082a2.mo91345e(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final RankCoinEntity m29943g(String str) throws Throwable {
        Object next;
        RankDBEntity rankDBEntityMo29935b;
        RankCoinEntity rankCoinEntity;
        Object obj = null;
        Iterator it = IRankCoinMemory.m29965c(f26035e, null, null, 3, null).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            rankCoinEntity = (RankCoinEntity) next;
            if (Intrinsics.areEqual(rankCoinEntity.getCurrency(), str)) {
                break;
            }
        } while (!Intrinsics.areEqual(rankCoinEntity.getCode(), str));
        RankCoinEntity rankCoinEntity2 = (RankCoinEntity) next;
        if (rankCoinEntity2 != null) {
            return rankCoinEntity2;
        }
        IRankDao iRankDaoM29945i = m29945i();
        if (iRankDaoM29945i == null || (rankDBEntityMo29935b = iRankDaoM29945i.mo29935b("coin")) == null) {
            return null;
        }
        String value = rankDBEntityMo29935b.getValue();
        C27099x c27099x = C27099x.f54458a;
        Object objM66914d = C27099x.m66914d(value, new C14770a().getType());
        IRankCoinMemory.m29966d(f26035e, (List) objM66914d, null, null, 6, null);
        for (Object obj2 : (Iterable) objM66914d) {
            RankCoinEntity rankCoinEntity3 = (RankCoinEntity) obj2;
            if (Intrinsics.areEqual(rankCoinEntity3.getCurrency(), str) || Intrinsics.areEqual(rankCoinEntity3.getCode(), str)) {
                obj = obj2;
                break;
            }
        }
        return (RankCoinEntity) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: h */
    public final Object m29944h(Continuation<? super List<RankCoinEntity>> continuation) {
        RankCoinHelper$getCoinEntityFromNet$1 rankCoinHelper$getCoinEntityFromNet$1;
        if (continuation instanceof RankCoinHelper$getCoinEntityFromNet$1) {
            rankCoinHelper$getCoinEntityFromNet$1 = (RankCoinHelper$getCoinEntityFromNet$1) continuation;
            int i11 = rankCoinHelper$getCoinEntityFromNet$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankCoinHelper$getCoinEntityFromNet$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankCoinHelper$getCoinEntityFromNet$1 = new RankCoinHelper$getCoinEntityFromNet$1(this, continuation);
            }
        } else {
            rankCoinHelper$getCoinEntityFromNet$1 = new RankCoinHelper$getCoinEntityFromNet$1(this, continuation);
        }
        Object objM42823d = rankCoinHelper$getCoinEntityFromNet$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankCoinHelper$getCoinEntityFromNet$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41634e<List<RankCoinEntity>> interfaceC41634eM29964a = f26034d.m29964a();
            RankCoinHelper$getCoinEntityFromNet$2 rankCoinHelper$getCoinEntityFromNet$2 = new RankCoinHelper$getCoinEntityFromNet$2(null);
            rankCoinHelper$getCoinEntityFromNet$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM29964a, false, rankCoinHelper$getCoinEntityFromNet$2, rankCoinHelper$getCoinEntityFromNet$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        return RetrofitFlowExKt.m42829j((C19334f) objM42823d);
    }

    /* JADX INFO: renamed from: i */
    public final IRankDao m29945i() {
        return (IRankDao) f26033c.getValue();
    }
}
