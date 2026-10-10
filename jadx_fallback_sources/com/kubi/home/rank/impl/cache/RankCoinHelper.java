package com.kubi.home.rank.impl.cache;

/* JADX INFO: compiled from: RankCoinHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0087@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0083@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankCoinHelper;", "", "<init>", "()V", "needFetchCoinFromServer", "", "rankDao", "Lcom/kubi/home/rank/impl/cache/IRankDao;", "getRankDao", "()Lcom/kubi/home/rank/impl/cache/IRankDao;", "rankDao$delegate", "Lkotlin/Lazy;", "rankCoinApi", "Lcom/kubi/home/rank/impl/cache/IRankCoinApi;", "rankMemory", "Lcom/kubi/home/rank/impl/cache/IRankCoinMemory;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "RETRY_MAX", "", "getCoinEntity", "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;", "currency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinEntityFromLocal", "fetchCoinList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinEntityFromNet", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRankCoinHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankCoinHelper.kt\ncom/kubi/home/rank/impl/cache/RankCoinHelper\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,134:1\n116#2,8:135\n125#2,2:144\n1#3:143\n149#4:146\n*S KotlinDebug\n*F\n+ 1 RankCoinHelper.kt\ncom/kubi/home/rank/impl/cache/RankCoinHelper\n*L\n65#1:135,8\n65#1:144,2\n90#1:146\n*E\n"})
public final class RankCoinHelper {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.home.rank.impl.cache.RankCoinHelper f26031a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f26032b;

    /* JADX INFO: renamed from: c */
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Lazy f26033c = null;

    /* JADX INFO: renamed from: d */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.home.rank.impl.cache.InterfaceC14774a f26034d = null;

    /* JADX INFO: renamed from: e */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.home.rank.impl.cache.InterfaceC14775b f26035e = null;

    /* JADX INFO: renamed from: f */
    @org.jetbrains.annotations.NotNull
    public static final rg0.InterfaceC44082a f26036f = null;

    /* JADX INFO: renamed from: g */
    public static final int f26037g = 0;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.RankCoinHelper$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C14770a extends com.google.gson.reflect.TypeToken<java.util.List<? extends com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity>> {
        public C14770a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.kubi.home.rank.impl.cache.RankCoinHelper r0 = new com.kubi.home.rank.impl.cache.RankCoinHelper
            r0.<init>()
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26031a = r0
            r0 = 1
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26032b = r0
            com.kubi.home.rank.impl.cache.d r1 = new com.kubi.home.rank.impl.cache.d
            r1.<init>()
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26033c = r1
            java.lang.Class<com.kubi.home.rank.impl.cache.a> r1 = com.kubi.home.rank.impl.cache.InterfaceC14774a.class
            java.lang.Object r1 = com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42820a(r1)
            com.kubi.home.rank.impl.cache.a r1 = (com.kubi.home.rank.impl.cache.InterfaceC14774a) r1
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26034d = r1
            com.kubi.restful.n$a r1 = new com.kubi.restful.n$a
            r1.<init>()
            com.kubi.restful.n r1 = r1.m55669a()
            java.lang.Class<com.kubi.home.rank.impl.cache.b> r2 = com.kubi.home.rank.impl.cache.InterfaceC14775b.class
            java.lang.Object r1 = r1.m55665b(r2)
            com.kubi.home.rank.impl.cache.b r1 = (com.kubi.home.rank.impl.cache.InterfaceC14775b) r1
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26035e = r1
            r1 = 0
            r2 = 0
            rg0.a r0 = rg0.C44087f.m97144b(r1, r0, r2)
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26036f = r0
            r0 = 3
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26037g = r0
            return
    }

    public RankCoinHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ com.kubi.home.rank.impl.cache.IRankDao m29936a() {
            com.kubi.home.rank.impl.cache.IRankDao r0 = m29940j()
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ java.lang.Object m29937b(com.kubi.home.rank.impl.cache.RankCoinHelper r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.m29944h(r1)
            return r0
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ com.kubi.home.rank.impl.cache.IRankDao m29938c(com.kubi.home.rank.impl.cache.RankCoinHelper r0) {
            com.kubi.home.rank.impl.cache.IRankDao r0 = r0.m29945i()
            return r0
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ com.kubi.home.rank.impl.cache.InterfaceC14775b m29939d() {
            com.kubi.home.rank.impl.cache.b r0 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26035e
            return r0
    }

    /* JADX INFO: renamed from: j */
    public static final com.kubi.home.rank.impl.cache.IRankDao m29940j() {
            com.kubi.home.rank.impl.cache.RankDatabaseProxy$Companion r0 = com.kubi.home.rank.impl.cache.RankDatabaseProxy.f26038a
            com.kubi.home.rank.impl.cache.RankDatabaseProxy r0 = r0.getInstance()
            if (r0 == 0) goto Ld
            com.kubi.home.rank.impl.cache.IRankDao r0 = r0.mo29948e()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"CheckResult"})
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m29941e(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity>> r11) {
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            kotlin.ResultKt.throwOnFailure(r11)
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
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r6
            r6 = r2
            r2 = r7
            r7 = r9
            goto L71
        L4e:
            kotlin.ResultKt.throwOnFailure(r11)
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
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
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
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: f */
    public final java.lang.Object m29942f(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity> r10) {
            r8 = this;
            boolean r0 = r10 instanceof com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntity$1
            if (r0 == 0) goto L13
            r0 = r10
            com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntity$1 r0 = (com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntity$1 r0 = new com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntity$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L5e
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r9 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r1 = r0.L$2
            rg0.a r1 = (rg0.InterfaceC44082a) r1
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3f
            goto La6
        L3f:
            r9 = move-exception
            goto Lee
        L42:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4a:
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$2
            rg0.a r2 = (rg0.InterfaceC44082a) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            r9 = r4
            goto L88
        L5e:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r2 = r8.m29943g(r9)
            r10.element = r2
            if (r2 != 0) goto Lf2
            boolean r2 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26032b
            if (r2 == 0) goto Lf2
            rg0.a r2 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26036f
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r2
            r0.I$0 = r5
            r0.label = r4
            java.lang.Object r4 = r2.mo91344d(r6, r0)
            if (r4 != r1) goto L85
            goto La2
        L85:
            r7 = r9
            r9 = r10
            r10 = r5
        L88:
            boolean r4 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26032b     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto Lde
            com.kubi.home.rank.impl.cache.RankCoinHelper r4 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26031a     // Catch: java.lang.Throwable -> Ldb
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Ldb
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Ldb
            r0.L$2 = r2     // Catch: java.lang.Throwable -> Ldb
            r0.L$3 = r9     // Catch: java.lang.Throwable -> Ldb
            r0.I$0 = r10     // Catch: java.lang.Throwable -> Ldb
            r0.I$1 = r5     // Catch: java.lang.Throwable -> Ldb
            r0.label = r3     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r10 = r4.m29941e(r0)     // Catch: java.lang.Throwable -> Ldb
            if (r10 != r1) goto La3
        La2:
            return r1
        La3:
            r1 = r2
            r0 = r7
            r2 = r9
        La6:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto Ld4
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L3f
        Lae:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L3f
            r4 = r3
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r4 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r4     // Catch: java.lang.Throwable -> L3f
            java.lang.String r7 = r4.getCurrency()     // Catch: java.lang.Throwable -> L3f
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)     // Catch: java.lang.Throwable -> L3f
            if (r7 != 0) goto Ld1
            java.lang.String r4 = r4.getCode()     // Catch: java.lang.Throwable -> L3f
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto Lae
            goto Ld1
        Ld0:
            r3 = r6
        Ld1:
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r3 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r3     // Catch: java.lang.Throwable -> L3f
            goto Ld5
        Ld4:
            r3 = r6
        Ld5:
            r9.element = r3     // Catch: java.lang.Throwable -> L3f
            com.kubi.home.rank.impl.cache.RankCoinHelper.f26032b = r5     // Catch: java.lang.Throwable -> L3f
            r10 = r2
            goto Le8
        Ldb:
            r9 = move-exception
            r1 = r2
            goto Lee
        Lde:
            com.kubi.home.rank.impl.cache.RankCoinHelper r10 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26031a     // Catch: java.lang.Throwable -> Ldb
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r10 = r10.m29943g(r7)     // Catch: java.lang.Throwable -> Ldb
            r9.element = r10     // Catch: java.lang.Throwable -> Ldb
            r10 = r9
            r1 = r2
        Le8:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
            r1.mo91345e(r6)
            goto Lf2
        Lee:
            r1.mo91345e(r6)
            throw r9
        Lf2:
            T r9 = r10.element
            return r9
    }

    /* JADX INFO: renamed from: g */
    public final com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity m29943g(java.lang.String r10) {
            r9 = this;
            com.kubi.home.rank.impl.cache.b r0 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26035e
            r1 = 3
            r2 = 0
            java.util.List r0 = com.kubi.home.rank.impl.cache.InterfaceC14775b.m29965c(r0, r2, r2, r1, r2)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r3 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r3
            java.lang.String r4 = r3.getCurrency()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r10)
            if (r4 != 0) goto L2f
            java.lang.String r3 = r3.getCode()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r3 == 0) goto Lc
            goto L2f
        L2e:
            r1 = r2
        L2f:
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r1 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r1
            if (r1 != 0) goto L8b
            com.kubi.home.rank.impl.cache.IRankDao r0 = r9.m29945i()
            if (r0 == 0) goto L8a
            java.lang.String r1 = "coin"
            com.kubi.home.rank.impl.cache.RankDBEntity r0 = r0.mo29935b(r1)
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.getValue()
            com.kubi.utils.x r1 = com.kubi.utils.C27099x.f54458a
            com.kubi.home.rank.impl.cache.RankCoinHelper$a r1 = new com.kubi.home.rank.impl.cache.RankCoinHelper$a
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r0 = com.kubi.utils.C27099x.m66914d(r0, r1)
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            com.kubi.home.rank.impl.cache.b r3 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26035e
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            com.kubi.home.rank.impl.cache.InterfaceC14775b.m29966d(r3, r4, r5, r6, r7, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r3 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r3
            java.lang.String r4 = r3.getCurrency()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r10)
            if (r4 != 0) goto L87
            java.lang.String r3 = r3.getCode()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r3 == 0) goto L66
        L87:
            r2 = r1
        L88:
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r2 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r2
        L8a:
            return r2
        L8b:
            return r1
    }

    @android.annotation.SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: h */
    public final java.lang.Object m29944h(kotlin.coroutines.Continuation<? super java.util.List<com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity>> r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$1
            if (r0 == 0) goto L13
            r0 = r6
            com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$1 r0 = (com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$1 r0 = new com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            com.kubi.home.rank.impl.cache.a r6 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26034d
            kotlinx.coroutines.flow.e r6 = r6.m29964a()
            com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$2 r2 = new com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$2
            r4 = 0
            r2.<init>(r4)
            r0.label = r3
            r3 = 0
            java.lang.Object r6 = com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r6, r3, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.kubi.network.retrofit.utils.f r6 = (com.kubi.network.retrofit.utils.C19334f) r6
            java.lang.Object r6 = com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42829j(r6)
            return r6
    }

    /* JADX INFO: renamed from: i */
    public final com.kubi.home.rank.impl.cache.IRankDao m29945i() {
            r1 = this;
            kotlin.Lazy r0 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26033c
            java.lang.Object r0 = r0.getValue()
            com.kubi.home.rank.impl.cache.IRankDao r0 = (com.kubi.home.rank.impl.cache.IRankDao) r0
            return r0
    }
}
