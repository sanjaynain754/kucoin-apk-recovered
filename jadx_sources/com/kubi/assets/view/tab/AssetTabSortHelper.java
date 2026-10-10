package com.kubi.assets.view.tab;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AccountSortIndexItem;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.C9459a;
import com.kubi.assets.entity.AccountOrderEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.sort.C10997l;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41726q1;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0015\u001a\u00020\u000fJ\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u001c\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010%H\u0086@¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u0004\u0018\u00010(H\u0086@¢\u0006\u0002\u0010&R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/view/tab/AssetTabSortHelper;", "", "<init>", "()V", "assetV2Api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetV2Api", "()Lcom/kubi/assets/AssetV2Api;", "assetV2Api$delegate", "Lkotlin/Lazy;", "tabManager", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/assets/view/tab/TabManager;", "getSortType", "", "getCachedOrders", "", "getNewCachedOrders", "sortListByCustom", "defaultList", "sorts", "sortByAssetValue", "Lcom/kubi/assets/AccountSortIndexItem;", "oldList", "getCustomOrder", "getDefaultOrder", "getLocalDefaultOrder", "registerTabManager", "", "manager", "refreshAssetsPageTabs", "saveCustomOrder", "sortType", "orders", "getTabOrders", "asyncLoadAccountOrders", "Lcom/kubi/assets/entity/AccountOrderEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncGetAccountAssets", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetTabSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetTabSortHelper.kt\ncom/kubi/assets/view/tab/AssetTabSortHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,518:1\n32#2:519\n32#2:520\n32#2:534\n32#2:535\n135#2,2:536\n23#2,2:538\n23#2,2:540\n23#2,2:542\n1563#3:521\n1634#3,3:522\n1563#3:525\n1634#3,3:526\n1573#3:529\n1604#3,4:530\n1563#3:544\n1634#3,3:545\n975#4:548\n1046#4,3:549\n47#5,4:552\n*S KotlinDebug\n*F\n+ 1 AssetTabSortHelper.kt\ncom/kubi/assets/view/tab/AssetTabSortHelper\n*L\n50#1:519\n83#1:520\n148#1:534\n160#1:535\n187#1:536,2\n321#1:538,2\n324#1:540,2\n327#1:542,2\n85#1:521\n85#1:522,3\n96#1:525\n96#1:526,3\n119#1:529\n119#1:530,4\n338#1:544\n338#1:545,3\n351#1:548\n351#1:549,3\n382#1:552,4\n*E\n"})
public final class AssetTabSortHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetTabSortHelper f19161a = new AssetTabSortHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f19162b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.view.tab.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetTabSortHelper.m20060e();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static WeakReference<TabManager> f19163c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CoroutineExceptionHandler f19164d = new C11281a(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: com.kubi.assets.view.tab.AssetTabSortHelper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AssetTabSortHelper.kt\ncom/kubi/assets/view/tab/AssetTabSortHelper\n*L\n1#1,49:1\n383#2,2:50\n*E\n"})
    public static final class C11281a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            AssetsLog.Common.m15234e("AssetTabSortHelper exception: " + exception);
        }

        public C11281a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.kubi.assets.view.tab.AssetTabSortHelper$asyncGetAccountAssets$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.kubi.assets.h0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.kubi.assets.h0] */
    /* JADX WARN: Type inference failed for: r9v19, types: [T, java.lang.Object] */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m20063f(@NotNull Continuation<? super AssetV2OverviewEntity> continuation) {
        ?? assetTabSortHelper$asyncGetAccountAssets$1;
        Object objM103844constructorimpl;
        ?? r11;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        BaseEntity baseEntity;
        if (continuation instanceof AssetTabSortHelper$asyncGetAccountAssets$1) {
            AssetTabSortHelper$asyncGetAccountAssets$1 assetTabSortHelper$asyncGetAccountAssets$2 = (AssetTabSortHelper$asyncGetAccountAssets$1) continuation;
            int i11 = assetTabSortHelper$asyncGetAccountAssets$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetTabSortHelper$asyncGetAccountAssets$2.label = i11 - Integer.MIN_VALUE;
                assetTabSortHelper$asyncGetAccountAssets$1 = assetTabSortHelper$asyncGetAccountAssets$2;
            } else {
                assetTabSortHelper$asyncGetAccountAssets$1 = new AssetTabSortHelper$asyncGetAccountAssets$1(this, continuation);
            }
        } else {
            assetTabSortHelper$asyncGetAccountAssets$1 = new AssetTabSortHelper$asyncGetAccountAssets$1(this, continuation);
        }
        Object obj = assetTabSortHelper$asyncGetAccountAssets$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetTabSortHelper$asyncGetAccountAssets$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (C10997l.m19368a()) {
                        ?? M20065h = m20065h();
                        assetTabSortHelper$asyncGetAccountAssets$1.L$0 = objectRef3;
                        assetTabSortHelper$asyncGetAccountAssets$1.L$1 = SpillingKt.nullOutSpilledVariable(balanceCurrency);
                        assetTabSortHelper$asyncGetAccountAssets$1.L$2 = SpillingKt.nullOutSpilledVariable(this);
                        assetTabSortHelper$asyncGetAccountAssets$1.I$0 = 0;
                        assetTabSortHelper$asyncGetAccountAssets$1.label = 1;
                        Object objM17178y1 = M20065h.m17178y1(balanceCurrency, assetTabSortHelper$asyncGetAccountAssets$1);
                        if (objM17178y1 != coroutine_suspended) {
                            objectRef2 = objectRef3;
                            obj = objM17178y1;
                            baseEntity = (BaseEntity) obj;
                            assetTabSortHelper$asyncGetAccountAssets$1 = objectRef2;
                        }
                    } else {
                        ?? M20065h2 = m20065h();
                        assetTabSortHelper$asyncGetAccountAssets$1.L$0 = objectRef3;
                        assetTabSortHelper$asyncGetAccountAssets$1.L$1 = SpillingKt.nullOutSpilledVariable(balanceCurrency);
                        assetTabSortHelper$asyncGetAccountAssets$1.L$2 = SpillingKt.nullOutSpilledVariable(this);
                        assetTabSortHelper$asyncGetAccountAssets$1.I$0 = 0;
                        assetTabSortHelper$asyncGetAccountAssets$1.label = 2;
                        Object objM17112Y0 = M20065h2.m17112Y0(balanceCurrency, assetTabSortHelper$asyncGetAccountAssets$1);
                        if (objM17112Y0 != coroutine_suspended) {
                            objectRef = objectRef3;
                            obj = objM17112Y0;
                            baseEntity = (BaseEntity) obj;
                            assetTabSortHelper$asyncGetAccountAssets$1 = objectRef;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    assetTabSortHelper$asyncGetAccountAssets$1 = objectRef3;
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                    r11 = assetTabSortHelper$asyncGetAccountAssets$1;
                }
            } else if (i12 == 1) {
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) assetTabSortHelper$asyncGetAccountAssets$1.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef2 = objectRef4;
                baseEntity = (BaseEntity) obj;
                assetTabSortHelper$asyncGetAccountAssets$1 = objectRef2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) assetTabSortHelper$asyncGetAccountAssets$1.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef = objectRef5;
                baseEntity = (BaseEntity) obj;
                assetTabSortHelper$asyncGetAccountAssets$1 = objectRef;
            }
            if (baseEntity.getSuccess() && baseEntity.getData() != null) {
                assetTabSortHelper$asyncGetAccountAssets$1.element = baseEntity.getData();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            r11 = assetTabSortHelper$asyncGetAccountAssets$1;
        } catch (Throwable th3) {
            th = th3;
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            AssetsLog.Common.m15236i("asyncGetAccountAssets: " + thM103847exceptionOrNullimpl);
        }
        return r11.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Object] */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m20064g(@NotNull Continuation<? super AccountOrderEntity> continuation) {
        AssetTabSortHelper$asyncLoadAccountOrders$1 assetTabSortHelper$asyncLoadAccountOrders$1;
        AssetTabSortHelper assetTabSortHelper;
        Ref.ObjectRef objectRef;
        Object objM103844constructorimpl;
        ArrayList arrayList;
        List<String> accountTypeList;
        String strJoinToString$default;
        if (continuation instanceof AssetTabSortHelper$asyncLoadAccountOrders$1) {
            assetTabSortHelper$asyncLoadAccountOrders$1 = (AssetTabSortHelper$asyncLoadAccountOrders$1) continuation;
            int i11 = assetTabSortHelper$asyncLoadAccountOrders$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetTabSortHelper$asyncLoadAccountOrders$1.label = i11 - Integer.MIN_VALUE;
                assetTabSortHelper = this;
            } else {
                assetTabSortHelper = this;
                assetTabSortHelper$asyncLoadAccountOrders$1 = new AssetTabSortHelper$asyncLoadAccountOrders$1(assetTabSortHelper, continuation);
            }
        } else {
            assetTabSortHelper = this;
            assetTabSortHelper$asyncLoadAccountOrders$1 = new AssetTabSortHelper$asyncLoadAccountOrders$1(assetTabSortHelper, continuation);
        }
        Object objM17085H0 = assetTabSortHelper$asyncLoadAccountOrders$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetTabSortHelper$asyncLoadAccountOrders$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM17085H0);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                Result.Companion companion = Result.INSTANCE;
                AssetV2Api assetV2ApiM20065h = assetTabSortHelper.m20065h();
                assetTabSortHelper$asyncLoadAccountOrders$1.L$0 = objectRef2;
                assetTabSortHelper$asyncLoadAccountOrders$1.L$1 = SpillingKt.nullOutSpilledVariable(assetTabSortHelper);
                assetTabSortHelper$asyncLoadAccountOrders$1.I$0 = 0;
                assetTabSortHelper$asyncLoadAccountOrders$1.label = 1;
                objM17085H0 = assetV2ApiM20065h.m17085H0(assetTabSortHelper$asyncLoadAccountOrders$1);
                if (objM17085H0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) assetTabSortHelper$asyncLoadAccountOrders$1.L$0;
            try {
                ResultKt.throwOnFailure(objM17085H0);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        }
        BaseEntity baseEntity = (BaseEntity) objM17085H0;
        if (baseEntity.getSuccess() && baseEntity.getData() != null) {
            AssetsLog assetsLog = AssetsLog.Common;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("asyncLoadAccountOrders: ");
            AccountOrderEntity accountOrderEntity = (AccountOrderEntity) baseEntity.getData();
            if (accountOrderEntity == null || (accountTypeList = accountOrderEntity.getAccountTypeList()) == null || (strJoinToString$default = CollectionsKt.joinToString$default(accountTypeList, ",", null, null, 0, null, null, 62, null)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(strJoinToString$default.length());
                for (int i13 = 0; i13 < strJoinToString$default.length(); i13++) {
                    arrayList.add(Boxing.boxChar(strJoinToString$default.charAt(i13)));
                }
            }
            sb2.append(arrayList);
            assetsLog.m15236i(sb2.toString());
            objectRef.element = baseEntity.getData();
        }
        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            AssetsLog.Common.m15236i("asyncLoadAccountOrders: " + thM103847exceptionOrNullimpl);
        }
        return objectRef.element;
    }

    /* JADX INFO: renamed from: h */
    public final AssetV2Api m20065h() {
        return (AssetV2Api) f19162b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<String> m20067j() {
        String strM102326h = C46392a.m102326h(C42153h.f93593a.m92515e(), "");
        return !StringsKt.isBlank(strM102326h) ? m20077v(m20068k(), strM102326h) : m20068k();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<String> m20068k() {
        String strM102326h = C46392a.m102326h(C42153h.f93593a.m92516f(), "");
        return !StringsKt.isBlank(strM102326h) ? m20077v(m20069l(), strM102326h) : m20069l();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<String> m20069l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("main");
        if (C24129b.m58030b(SiteVisibleConfigKey.UNIFIED)) {
            arrayList.add("unified");
        }
        arrayList.add("trade");
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            arrayList.add(ViewProps.MARGIN);
        }
        if (C9459a.m15238a()) {
            arrayList.add("kumex");
        }
        if (AssetsDepend.f18689a.m19185f().mo50712o() && C46392a.m102322d(C42153h.f93593a.m92499C(), false)) {
            arrayList.add("alpha");
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
            arrayList.add("robot");
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
            arrayList.add(SearchCategory$Companion.EARN);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Option)) {
            arrayList.add(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
            arrayList.add("copyTrading");
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.CLOUD_MINING)) {
            arrayList.add("mining");
        }
        IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
        if (!iUnifyAccountService.mo64979C()) {
            if (!iUnifyAccountService.mo64991e()) {
                arrayList.remove("unified");
                return arrayList;
            }
            arrayList.remove("unified");
            arrayList.add("unified");
            return arrayList;
        }
        arrayList.remove("unified");
        arrayList.add(1, "unified");
        arrayList.remove("trade");
        arrayList.remove(ViewProps.MARGIN);
        arrayList.add("trade");
        arrayList.add(ViewProps.MARGIN);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final List<String> m20070m() {
        String strM102326h = C46392a.m102326h(C42153h.f93593a.m92535y(), "");
        if (StringsKt.isBlank(strM102326h)) {
            return m20068k();
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strM102326h, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final String m20071n() {
        return C46392a.m102326h(C42153h.f93593a.m92517g(), "DEFAULT");
    }

    /* JADX INFO: renamed from: p */
    public final void m20073p() {
        C41696j.m91104d(C41726q1.f91773b, C41782z0.m91392b().plus(f19164d), null, new AssetTabSortHelper$refreshAssetsPageTabs$1(null), 2, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m20074q(@NotNull TabManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        f19163c = new WeakReference<>(manager);
    }

    /* JADX INFO: renamed from: r */
    public final void m20075r(@NotNull String sortType, @NotNull List<String> orders) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(orders, "orders");
        C42153h c42153h = C42153h.f93593a;
        C46392a.m102333p(c42153h.m92517g(), sortType);
        int iHashCode = sortType.hashCode();
        if (iHashCode == -2032180703) {
            if (sortType.equals("DEFAULT")) {
                C46392a.m102333p(c42153h.m92516f(), CollectionsKt.joinToString$default(orders, ",", null, null, 0, null, null, 62, null));
                return;
            }
            return;
        }
        if (iHashCode != -2028086330) {
            if (iHashCode != -1737473857 || !sortType.equals("VALUE_DESC")) {
                return;
            }
        } else if (!sortType.equals("MANUAL")) {
            return;
        }
        C46392a.m102333p(c42153h.m92515e(), CollectionsKt.joinToString$default(orders, ",", null, null, 0, null, null, 62, null));
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final List<AccountSortIndexItem> m20076s(@NotNull List<AccountSortIndexItem> oldList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        List<String> listM20068k = m20068k();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20068k, 10));
        int i11 = 0;
        for (Object obj : listM20068k) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.m90091to((String) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        final Map map = MapsKt.toMap(arrayList);
        final Function2 function2 = new Function2() { // from class: com.kubi.assets.view.tab.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(AssetTabSortHelper.m20061t(map, (AccountSortIndexItem) obj2, (AccountSortIndexItem) obj3));
            }
        };
        return CollectionsKt.sortedWith(oldList, new Comparator() { // from class: com.kubi.assets.view.tab.c
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return AssetTabSortHelper.m20062u(function2, obj2, obj3);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final List<String> m20077v(@NotNull List<String> defaultList, @NotNull String sorts) {
        Intrinsics.checkNotNullParameter(defaultList, "defaultList");
        Intrinsics.checkNotNullParameter(sorts, "sorts");
        List listSplit$default = StringsKt.split$default((CharSequence) sorts, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (defaultList.contains(str)) {
                arrayList2.add(str);
            }
        }
        for (String str2 : defaultList) {
            if (!arrayList.contains(str2) && !arrayList2.contains(str2)) {
                arrayList2.add(str2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static final AssetV2Api m20060e() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: t */
    public static final int m20061t(Map map, AccountSortIndexItem accountSortIndexItem, AccountSortIndexItem accountSortIndexItem2) {
        int iIntValue;
        try {
            int iCompareTo = accountSortIndexItem2.getF16607c().compareTo(accountSortIndexItem.getF16607c());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            Integer num = (Integer) map.get(accountSortIndexItem.getF16605a());
            int iIntValue2 = Integer.MAX_VALUE;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            Integer num2 = (Integer) map.get(accountSortIndexItem2.getF16605a());
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            return Intrinsics.compare(iIntValue, iIntValue2);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final int m20062u(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<String> m20066i() {
        if (C10997l.m19368a()) {
            return m20070m();
        }
        String strM20071n = m20071n();
        int iHashCode = strM20071n.hashCode();
        if (iHashCode != -2032180703) {
            return iHashCode != -2028086330 ? m20067j() : m20067j();
        }
        if (strM20071n.equals("DEFAULT")) {
            return m20068k();
        }
        return m20068k();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<String> m20072o() {
        List<String> listM20066i = m20066i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20066i, 10));
        Iterator<T> it = listM20066i.iterator();
        while (it.hasNext()) {
            arrayList.add(C11296e.m20095b((String) it.next()));
        }
        return arrayList;
    }
}
