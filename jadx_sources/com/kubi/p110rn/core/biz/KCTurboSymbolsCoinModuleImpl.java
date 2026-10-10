package com.kubi.p110rn.core.biz;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.data.coin.info.SymbolsInfo;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.p110rn.core.turbo.FuturesCoinInfo;
import com.kubi.p110rn.core.turbo.FuturesCoinInfoPageResult;
import com.kubi.p110rn.core.turbo.FuturesSymbolInfo;
import com.kubi.p110rn.core.turbo.FuturesSymbolInfoPageResult;
import com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs;
import com.kubi.p110rn.core.turbo.SpotCoinInfo;
import com.kubi.p110rn.core.turbo.SpotCoinInfoPageResult;
import com.kubi.p110rn.core.turbo.SpotSymbolInfo;
import com.kubi.p110rn.core.turbo.SpotSymbolPageResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.InterfaceC41781z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboSymbolsCoinModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J.\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u0019\u001a\u00020\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J.\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u001e\u001a\u00020\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J.\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010#\u001a\u00020\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J.\u0010$\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016Jh\u0010&\u001a\u00020\u000f\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010(2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0\u00120*2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0,\u0012\u0004\u0012\u0002H(0\u00112\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H(\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\b\u0010-\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "moduleJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getSpotCoinInfo", "Lcom/kubi/rn/core/turbo/SpotCoinInfo;", "code", "", "getSpotCoinInfoBatch", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "getSpotCoinInfoBatchByPage", "pageIndex", "pageSize", "Lcom/kubi/rn/core/turbo/SpotCoinInfoPageResult;", "getSpotSymbol", "Lcom/kubi/rn/core/turbo/SpotSymbolInfo;", "getSpotSymbolBatch", "getSpotSymbolBatchByPage", "Lcom/kubi/rn/core/turbo/SpotSymbolPageResult;", "getFuturesCoinInfo", "Lcom/kubi/rn/core/turbo/FuturesCoinInfo;", "getFuturesCoinInfoBatch", "getFuturesCoinInfoBatchByPage", "Lcom/kubi/rn/core/turbo/FuturesCoinInfoPageResult;", "getFuturesSymbolInfo", "Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;", "getFuturesSymbolInfoBatch", "getFuturesSymbolInfoBatchByPage", "Lcom/kubi/rn/core/turbo/FuturesSymbolInfoPageResult;", "loadPage", "Source", "Result", "sourceLoader", "Lkotlin/Function0;", "resultBuilder", "Lcom/kubi/rn/core/biz/SymbolsCoinPage;", "invalidate", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeSymbolsCoinTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboSymbolsCoinModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboSymbolsCoinModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1563#2:456\n1634#2,3:457\n1563#2:460\n1634#2,3:461\n774#2:465\n865#2,2:466\n1563#2:468\n1634#2,3:469\n1563#2:472\n1634#2,3:473\n1563#2:476\n1634#2,3:477\n1563#2:480\n1634#2,3:481\n774#2:484\n865#2,2:485\n1563#2:487\n1634#2,3:488\n1563#2:491\n1634#2,3:492\n1#3:464\n*S KotlinDebug\n*F\n+ 1 KCTurboSymbolsCoinModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImpl\n*L\n72#1:456\n72#1:457,3\n111#1:460\n111#1:461,3\n148#1:465\n148#1:466,2\n149#1:468\n149#1:469,3\n193#1:472\n193#1:473,3\n91#1:476\n91#1:477,3\n126#1:480\n126#1:481,3\n166#1:484\n166#1:485,2\n170#1:487\n170#1:488,3\n209#1:491\n209#1:492,3\n*E\n"})
public final class KCTurboSymbolsCoinModuleImpl extends NativeSymbolsCoinTurboModuleAbs {

    @NotNull
    private final InterfaceC41781z moduleJob;

    @NotNull
    private final InterfaceC41709m0 scope;

    /* JADX INFO: renamed from: com.kubi.rn.core.biz.KCTurboSymbolsCoinModuleImpl$getSpotCoinInfoBatchByPage$1 */
    /* JADX INFO: compiled from: KCTurboSymbolsCoinModuleImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C232381 extends FunctionReferenceImpl implements Function0<List<? extends CoinInfoEntity>> {
        public C232381(Object obj) {
            super(0, obj, C37890n.class, "getLocaleCoinListSync", "getLocaleCoinListSync()Ljava/util/List;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public final List<? extends CoinInfoEntity> invoke() {
            return ((C37890n) this.receiver).m85617y();
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.biz.KCTurboSymbolsCoinModuleImpl$loadPage$1 */
    /* JADX INFO: compiled from: KCTurboSymbolsCoinModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.biz.KCTurboSymbolsCoinModuleImpl$loadPage$1", m90122f = "KCTurboSymbolsCoinModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C232391 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Result, Unit> $callback;
        final /* synthetic */ SymbolsCoinPageRequest $request;
        final /* synthetic */ Function1<SymbolsCoinPage<Source>, Result> $resultBuilder;
        final /* synthetic */ Function0<List<Source>> $sourceLoader;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C232391(Function1<? super SymbolsCoinPage<Source>, ? extends Result> function1, Function0<? extends List<? extends Source>> function0, SymbolsCoinPageRequest symbolsCoinPageRequest, Function1<? super Result, Unit> function2, Continuation<? super C232391> continuation) {
            super(2, continuation);
            this.$resultBuilder = function1;
            this.$sourceLoader = function0;
            this.$request = symbolsCoinPageRequest;
            this.$callback = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C232391 c232391 = new C232391(this.$resultBuilder, this.$sourceLoader, this.$request, this.$callback, continuation);
            c232391.L$0 = obj;
            return c232391;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232391) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                objInvoke = this.$resultBuilder.invoke((SymbolsCoinPage<Source>) SymbolsCoinPaginationKt.paginate((List) this.$sourceLoader.invoke(), this.$request));
            } catch (Exception unused) {
                objInvoke = null;
            }
            C41783z1.m91406l(interfaceC41709m0.getF41921b());
            this.$callback.invoke((Result) objInvoke);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboSymbolsCoinModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        InterfaceC41781z interfaceC41781zM91192b = C41727q2.m91192b(null, 1, null);
        this.moduleJob = interfaceC41781zM91192b;
        this.scope = C41713n0.m91125a(C41782z0.m91392b().plus(interfaceC41781zM91192b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFuturesCoinInfoBatchByPage$lambda$24() {
        List<Map<String, Object>> listMo33252A = IKuMexService.f28731a.get().mo33252A();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo33252A) {
            if (!((Map) obj).isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesCoinInfoPageResult getFuturesCoinInfoBatchByPage$lambda$26(SymbolsCoinPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        List items = page.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(KCTurboSymbolsCoinModuleImplKt.toFuturesCoinInfo((Map) it.next()));
        }
        return new FuturesCoinInfoPageResult(arrayList, Double.valueOf(page.getPageIndex()), Double.valueOf(page.getPageSize()), Double.valueOf(page.getTotal()), Boolean.valueOf(page.getHasNext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFuturesSymbolInfoBatchByPage$lambda$32() {
        return IKuMexService.f28731a.get().mo33283k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesSymbolInfoPageResult getFuturesSymbolInfoBatchByPage$lambda$34(SymbolsCoinPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        List items = page.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(KCTurboSymbolsCoinModuleImplKt.toFuturesSymbolInfo((ContractEntity) it.next(), iKuMexService));
        }
        return new FuturesSymbolInfoPageResult(arrayList, Double.valueOf(page.getPageIndex()), Double.valueOf(page.getPageSize()), Double.valueOf(page.getTotal()), Boolean.valueOf(page.getHasNext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpotCoinInfoPageResult getSpotCoinInfoBatchByPage$lambda$6(SymbolsCoinPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        List items = page.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(KCTurboSymbolsCoinModuleImplKt.toBatchSpotCoinInfo((CoinInfoEntity) it.next()));
        }
        return new SpotCoinInfoPageResult(arrayList, Double.valueOf(page.getPageIndex()), Double.valueOf(page.getPageSize()), Double.valueOf(page.getTotal()), Boolean.valueOf(page.getHasNext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSpotSymbolBatch$lambda$10$lambda$8(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSpotSymbolBatchByPage$lambda$13() {
        return SymbolsInfo.f21457a.m23631u(new Function1() { // from class: com.kubi.rn.core.biz.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KCTurboSymbolsCoinModuleImpl.getSpotSymbolBatchByPage$lambda$13$lambda$12((SymbolInfoEntity) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSpotSymbolBatchByPage$lambda$13$lambda$12(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpotSymbolPageResult getSpotSymbolBatchByPage$lambda$15(SymbolsCoinPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        List items = page.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(KCTurboSymbolsCoinModuleImplKt.toSpotSymbolInfo((SymbolInfoEntity) it.next()));
        }
        return new SpotSymbolPageResult(arrayList, Double.valueOf(page.getPageIndex()), Double.valueOf(page.getPageSize()), Double.valueOf(page.getTotal()), Boolean.valueOf(page.getHasNext()));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    @Nullable
    public FuturesCoinInfo getFuturesCoinInfo(@NotNull String code) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            Result.Companion companion = Result.INSTANCE;
            Map<String, Object> mapMo33269S = IKuMexService.f28731a.get().mo33269S(code);
            if (mapMo33269S.isEmpty()) {
                mapMo33269S = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(mapMo33269S != null ? KCTurboSymbolsCoinModuleImplKt.toFuturesCoinInfo(mapMo33269S) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (FuturesCoinInfo) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getFuturesCoinInfoBatch(@NotNull Function1<? super List<FuturesCoinInfo>, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<Map<String, Object>> listMo33252A = IKuMexService.f28731a.get().mo33252A();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo33252A) {
                if (!((Map) obj).isEmpty()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(KCTurboSymbolsCoinModuleImplKt.toFuturesCoinInfo((Map) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((List) objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getFuturesCoinInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super FuturesCoinInfoPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadPage(pageIndex, pageSize, new Function0() { // from class: com.kubi.rn.core.biz.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboSymbolsCoinModuleImpl.getFuturesCoinInfoBatchByPage$lambda$24();
            }
        }, new Function1() { // from class: com.kubi.rn.core.biz.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSymbolsCoinModuleImpl.getFuturesCoinInfoBatchByPage$lambda$26((SymbolsCoinPage) obj);
            }
        }, callback);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    @Nullable
    public FuturesSymbolInfo getFuturesSymbolInfo(@NotNull String code) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService iKuMexService = IKuMexService.f28731a.get();
            Map<String, Object> mapMo33286o = iKuMexService.mo33286o(code);
            if (mapMo33286o.isEmpty()) {
                mapMo33286o = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(mapMo33286o != null ? KCTurboSymbolsCoinModuleImplKt.toFuturesSymbolInfo(mapMo33286o, iKuMexService, code) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (FuturesSymbolInfo) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getFuturesSymbolInfoBatch(@NotNull Function1<? super List<FuturesSymbolInfo>, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService iKuMexService = IKuMexService.f28731a.get();
            List<ContractEntity> listMo33283k = iKuMexService.mo33283k();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo33283k, 10));
            Iterator<T> it = listMo33283k.iterator();
            while (it.hasNext()) {
                arrayList.add(KCTurboSymbolsCoinModuleImplKt.toFuturesSymbolInfo((ContractEntity) it.next(), iKuMexService));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke(objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getFuturesSymbolInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super FuturesSymbolInfoPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadPage(pageIndex, pageSize, new Function0() { // from class: com.kubi.rn.core.biz.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboSymbolsCoinModuleImpl.getFuturesSymbolInfoBatchByPage$lambda$32();
            }
        }, new Function1() { // from class: com.kubi.rn.core.biz.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSymbolsCoinModuleImpl.getFuturesSymbolInfoBatchByPage$lambda$34((SymbolsCoinPage) obj);
            }
        }, callback);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    @Nullable
    public SpotCoinInfo getSpotCoinInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(code);
        if (coinInfoEntityM85613u == null) {
            return null;
        }
        return new SpotCoinInfo(coinInfoEntityM85613u.getCode(), coinInfoEntityM85613u.getCurrency(), coinInfoEntityM85613u.getName(), coinInfoEntityM85613u.getIconUrl(), String.valueOf(coinInfoEntityM85613u.getPrecision()), String.valueOf(coinInfoEntityM85613u.getStatus()), String.valueOf(coinInfoEntityM85613u.getWithdrawMinFee()), String.valueOf(coinInfoEntityM85613u.getWithdrawMinSize()), String.valueOf(coinInfoEntityM85613u.getWithdrawEnableAt()), String.valueOf(coinInfoEntityM85613u.getDepositEnableAt()), "", String.valueOf(coinInfoEntityM85613u.isDigital()), String.valueOf(coinInfoEntityM85613u.isWithdrawEnabled()), String.valueOf(coinInfoEntityM85613u.isDepositEnabled()), Boolean.valueOf(coinInfoEntityM85613u.isDigital()), Boolean.valueOf(coinInfoEntityM85613u.getProperties().isStableCoin()), Boolean.valueOf(Intrinsics.areEqual("TRUE", coinInfoEntityM85613u.getProperties().isDelisting())), Boolean.valueOf(coinInfoEntityM85613u.isDebitEnabled()), Boolean.valueOf(coinInfoEntityM85613u.isEarnEnabled()), Boolean.valueOf(!Intrinsics.areEqual(coinInfoEntityM85613u.getProperties().getIsTransferEnabled(), CredentialEntry.FALSE_STRING)));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getSpotCoinInfoBatch(@NotNull Function1<? super List<SpotCoinInfo>, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<CoinInfoEntity> listM85617y = C37890n.f85269a.m85617y();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85617y, 10));
            Iterator<T> it = listM85617y.iterator();
            while (it.hasNext()) {
                arrayList.add(KCTurboSymbolsCoinModuleImplKt.toBatchSpotCoinInfo((CoinInfoEntity) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((List) objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getSpotCoinInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super SpotCoinInfoPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadPage(pageIndex, pageSize, new C232381(C37890n.f85269a), new Function1() { // from class: com.kubi.rn.core.biz.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSymbolsCoinModuleImpl.getSpotCoinInfoBatchByPage$lambda$6((SymbolsCoinPage) obj);
            }
        }, callback);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    @Nullable
    public SpotSymbolInfo getSpotSymbol(@NotNull String code) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            Result.Companion companion = Result.INSTANCE;
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(code);
            objM103844constructorimpl = Result.m103844constructorimpl(symbolInfoEntityM85601B != null ? KCTurboSymbolsCoinModuleImplKt.toSpotSymbolInfo(symbolInfoEntityM85601B) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (SpotSymbolInfo) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getSpotSymbolBatch(@NotNull Function1<? super List<SpotSymbolInfo>, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<SymbolInfoEntity> listM23631u = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: com.kubi.rn.core.biz.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(KCTurboSymbolsCoinModuleImpl.getSpotSymbolBatch$lambda$10$lambda$8((SymbolInfoEntity) obj));
                }
            });
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM23631u, 10));
            Iterator<T> it = listM23631u.iterator();
            while (it.hasNext()) {
                arrayList.add(KCTurboSymbolsCoinModuleImplKt.toSpotSymbolInfo((SymbolInfoEntity) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke(objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleAbs
    public void getSpotSymbolBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super SpotSymbolPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadPage(pageIndex, pageSize, new Function0() { // from class: com.kubi.rn.core.biz.g1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboSymbolsCoinModuleImpl.getSpotSymbolBatchByPage$lambda$13();
            }
        }, new Function1() { // from class: com.kubi.rn.core.biz.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSymbolsCoinModuleImpl.getSpotSymbolBatchByPage$lambda$15((SymbolsCoinPage) obj);
            }
        }, callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        InterfaceC41775x1.a.m91377a(this.moduleJob, null, 1, null);
        super.invalidate();
    }

    private final <Source, Result> void loadPage(String pageIndex, String pageSize, Function0<? extends List<? extends Source>> sourceLoader, Function1<? super SymbolsCoinPage<Source>, ? extends Result> resultBuilder, Function1<? super Result, Unit> callback) {
        SymbolsCoinPageRequest symbolsCoinPageRequest = SymbolsCoinPaginationKt.symbolsCoinPageRequest(pageIndex, pageSize);
        if (symbolsCoinPageRequest != null) {
            C41696j.m91104d(this.scope, null, null, new C232391(resultBuilder, sourceLoader, symbolsCoinPageRequest, callback, null), 3, null);
        } else {
            callback.invoke(null);
        }
    }
}
