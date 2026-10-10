package com.kubi.tradingbotkit.config;

import android.annotation.SuppressLint;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.tradingbotkit.entity.GridTradingItemEntity;
import h40.C38109b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.InterfaceC41634e;
import n50.C42756a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import u50.C45125a;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: TradingBotConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0086@¢\u0006\u0002\u0010\u0016J>\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0018\u00010\rj\u0018\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0018\u0001`\u000eH\u0082@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0018\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0012H\u0007J\u0006\u0010\u001c\u001a\u00020\u0012J\b\u0010\u001d\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR-\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/config/TradingBotConfig;", "", "<init>", "()V", "TAG", "", "gridTradingRepository", "Lcom/kubi/tradingbotkit/business/aggregation/GridTradingRepository;", "coroutineExceptionHandler", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineExceptionHandler", "()Lkotlin/coroutines/CoroutineContext;", "jumpH5PathGlobal", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getJumpH5PathGlobal", "()Ljava/util/HashMap;", "requestGridTradingList", "", "getGridTradingListByLanguage", "", "Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalJson", "saveGridTradingList", "hasLogin", "", "config", "requestGridCouponsH5Path", "requestGridGuidePicture", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingBotConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n+ 6 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,208:1\n172#2:209\n172#2:210\n162#2,2:211\n172#2:213\n162#2,2:214\n25#3:216\n26#3:222\n1#4:217\n45#5,4:218\n45#5,4:223\n47#6,4:227\n*S KotlinDebug\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig\n*L\n76#1:209\n90#1:210\n91#1:211,2\n99#1:213\n100#1:214,2\n141#1:216\n141#1:222\n141#1:217\n142#1:218,4\n185#1:223,4\n48#1:227,4\n*E\n"})
public final class TradingBotConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradingBotConfig f52449a = new TradingBotConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C38109b f52450b = new C38109b();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CoroutineContext f52451c = new C26208c(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HashMap<String, String> f52452d = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.config.TradingBotConfig$a */
    /* JADX INFO: compiled from: TradingBotConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradingbotkit/config/TradingBotConfig$config$1", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26206a implements MultiLanguageManager.a {
        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            TradingBotConfig.f52449a.m64166h();
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.config.TradingBotConfig$b */
    /* JADX INFO: compiled from: TradingBotConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/tradingbotkit/config/TradingBotConfig$config$2", "Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;", "onDisconnected", "", "onConnected", "networkType", "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26207b implements NetworkUtils.InterfaceC5242a {
        @Override // com.blankj.utilcode.util.NetworkUtils.InterfaceC5242a
        /* JADX INFO: renamed from: a */
        public void mo6072a(NetworkUtils.NetworkType networkType) {
            TradingBotConfig.f52449a.m64166h();
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.InterfaceC5242a
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.config.TradingBotConfig$c */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig\n+ 3 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,49:1\n49#2,2:50\n51#2:56\n45#3,4:52\n*S KotlinDebug\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig\n*L\n50#1:52,4\n*E\n"})
    public static final class C26208c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C26208c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97264h(exception);
            String simpleName = TradingBotConfig.f52449a.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (!C42899b.m94075e(exception)) {
                C42756a.m93685b(exception, simpleName);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, java.util.List] */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m64161c(@NotNull Continuation<? super List<GridTradingItemEntity>> continuation) {
        TradingBotConfig$getGridTradingListByLanguage$1 tradingBotConfig$getGridTradingListByLanguage$1;
        StorageId storageIdM99750e;
        Ref.ObjectRef objectRef;
        String str;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof TradingBotConfig$getGridTradingListByLanguage$1) {
            tradingBotConfig$getGridTradingListByLanguage$1 = (TradingBotConfig$getGridTradingListByLanguage$1) continuation;
            int i11 = tradingBotConfig$getGridTradingListByLanguage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradingBotConfig$getGridTradingListByLanguage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradingBotConfig$getGridTradingListByLanguage$1 = new TradingBotConfig$getGridTradingListByLanguage$1(this, continuation);
            }
        } else {
            tradingBotConfig$getGridTradingListByLanguage$1 = new TradingBotConfig$getGridTradingListByLanguage$1(this, continuation);
        }
        Object obj = tradingBotConfig$getGridTradingListByLanguage$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradingBotConfig$getGridTradingListByLanguage$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            String localString = MultiLanguageManager.f46811g.getLocalString();
            C45125a c45125a = C45125a.f101543a;
            storageIdM99750e = c45125a.m99750e(c45125a.m99749d(), localString);
            objectRef = new Ref.ObjectRef();
            ?? M102325g = C46392a.m102325g(storageIdM99750e, CollectionsKt.emptyList());
            objectRef.element = M102325g;
            if (((List) M102325g).isEmpty()) {
                tradingBotConfig$getGridTradingListByLanguage$1.L$0 = localString;
                tradingBotConfig$getGridTradingListByLanguage$1.L$1 = storageIdM99750e;
                tradingBotConfig$getGridTradingListByLanguage$1.L$2 = objectRef;
                tradingBotConfig$getGridTradingListByLanguage$1.label = 1;
                Object objM64163e = m64163e(tradingBotConfig$getGridTradingListByLanguage$1);
                if (objM64163e == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = localString;
                obj = objM64163e;
                objectRef2 = objectRef;
            }
            return ((List) objectRef.element).isEmpty() ? CollectionsKt.emptyList() : (List) objectRef.element;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) tradingBotConfig$getGridTradingListByLanguage$1.L$2;
        storageIdM99750e = (StorageId) tradingBotConfig$getGridTradingListByLanguage$1.L$1;
        str = (String) tradingBotConfig$getGridTradingListByLanguage$1.L$0;
        ResultKt.throwOnFailure(obj);
        HashMap map = (HashMap) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C45125a c45125a2 = C45125a.f101543a;
                StorageId storageIdM99750e2 = c45125a2.m99750e(c45125a2.m99749d(), (String) entry.getKey());
                ?? r11 = (List) entry.getValue();
                if (r11 != 0) {
                    if (Intrinsics.areEqual(LanguageType.ENGLISH.getLocalString(), entry.getKey())) {
                        objectRef2.element = r11;
                    }
                    if (C46392a.m102325g(storageIdM99750e2, CollectionsKt.emptyList()).isEmpty()) {
                        C46392a.m102332o(storageIdM99750e2, r11);
                    }
                    if (Intrinsics.areEqual(str, entry.getKey())) {
                        objectRef2.element = r11;
                    }
                }
            }
            if (C46392a.m102325g(storageIdM99750e, CollectionsKt.emptyList()).isEmpty()) {
                C46392a.m102332o(storageIdM99750e, (List) objectRef2.element);
            }
        }
        objectRef = objectRef2;
        if (((List) objectRef.element).isEmpty()) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final HashMap<String, String> m64162d() {
        return f52452d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m64167i(@NotNull Continuation<? super Unit> continuation) {
        TradingBotConfig$saveGridTradingList$1 tradingBotConfig$saveGridTradingList$1;
        if (continuation instanceof TradingBotConfig$saveGridTradingList$1) {
            tradingBotConfig$saveGridTradingList$1 = (TradingBotConfig$saveGridTradingList$1) continuation;
            int i11 = tradingBotConfig$saveGridTradingList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradingBotConfig$saveGridTradingList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradingBotConfig$saveGridTradingList$1 = new TradingBotConfig$saveGridTradingList$1(this, continuation);
            }
        } else {
            tradingBotConfig$saveGridTradingList$1 = new TradingBotConfig$saveGridTradingList$1(this, continuation);
        }
        Object objM42823d = tradingBotConfig$saveGridTradingList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradingBotConfig$saveGridTradingList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41634e<List<GridTradingItemEntity>> interfaceC41634eM86041d = f52450b.m86041d();
            TradingBotConfig$saveGridTradingList$2 tradingBotConfig$saveGridTradingList$2 = new TradingBotConfig$saveGridTradingList$2(null);
            tradingBotConfig$saveGridTradingList$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM86041d, false, tradingBotConfig$saveGridTradingList$2, tradingBotConfig$saveGridTradingList$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        Throwable throwable = ((C19334f) objM42823d).getThrowable();
        if (throwable != null) {
            String simpleName = TradingBotConfig.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (!C42899b.m94075e(throwable)) {
                C42756a.m93685b(throwable, simpleName);
            }
            C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b().plus(f52451c)), null, null, new TradingBotConfig$saveGridTradingList$3$1(null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: b */
    public final void m64160b() {
        m64166h();
        m64165g();
        m64164f();
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new C26206a());
        try {
            NetworkUtils.registerNetworkStatusChangedListener(new C26207b());
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C42756a.m93685b(e11, "TradingBotConfig");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m64163e(Continuation<? super HashMap<String, List<GridTradingItemEntity>>> continuation) {
        return C41696j.m91102b(C41713n0.m91125a(C42911a.m94120b().plus(f52451c)), null, null, new TradingBotConfig$getLocalJson$differ$1(null), 3, null).mo91198h(continuation);
    }

    /* JADX INFO: renamed from: f */
    public final void m64164f() {
        C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b()), f52451c, null, new TradingBotConfig$requestGridCouponsH5Path$1(null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m64165g() {
        C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b()), f52451c, null, new TradingBotConfig$requestGridGuidePicture$1(null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m64166h() {
        C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b().plus(f52451c)), null, null, new TradingBotConfig$requestGridTradingList$1(null), 3, null);
    }
}
