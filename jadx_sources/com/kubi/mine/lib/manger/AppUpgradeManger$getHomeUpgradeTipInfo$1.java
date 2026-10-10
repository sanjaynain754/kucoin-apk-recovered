package com.kubi.mine.lib.manger;

import androidx.fragment.app.FragmentManager;
import com.google.android.gms.stats.CodePackage;
import com.kubi.mine.lib.entity.AppUpgradeEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.json.JSONException;
import p538pq.C43521a;
import p694vk.AbstractC45585n0;
import p694vk.C45591t;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppUpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getHomeUpgradeTipInfo$1", m90122f = "AppUpgradeManger.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {219, 238}, m90125m = "invokeSuspend", m90126n = {"notifiedAppVersion", "notifiedCount", "notifiedDate", "notifiedAppVersion", "$this$onFail$iv", "it$iv", "it", "notifiedCount", "notifiedDate", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-AppUpgradeManger$getHomeUpgradeTipInfo$1$2"}, m90127s = {"L$0", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"})
@SourceDebugExtension({"SMAP\nAppUpgradeManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeManger.kt\ncom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n25#2:513\n26#2:515\n1#3:514\n*S KotlinDebug\n*F\n+ 1 AppUpgradeManger.kt\ncom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1\n*L\n237#1:513\n237#1:515\n237#1:514\n*E\n"})
public final class AppUpgradeManger$getHomeUpgradeTipInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC45585n0 $appUpgradeType;
    final /* synthetic */ Function0<Boolean> $isPageShow;
    final /* synthetic */ FragmentManager $manager;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeManger$getHomeUpgradeTipInfo$1$1 */
    /* JADX INFO: compiled from: AppUpgradeManger.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mine/lib/entity/AppUpgradeEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getHomeUpgradeTipInfo$1$1", m90122f = "AppUpgradeManger.kt", m90123i = {0}, m90124l = {220}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C189651 extends SuspendLambda implements Function2<AppUpgradeEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractC45585n0 $appUpgradeType;
        final /* synthetic */ Function0<Boolean> $isPageShow;
        final /* synthetic */ FragmentManager $manager;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeManger$getHomeUpgradeTipInfo$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AppUpgradeManger.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getHomeUpgradeTipInfo$1$1$1", m90122f = "AppUpgradeManger.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ AbstractC45585n0 $appUpgradeType;
            final /* synthetic */ Function0<Boolean> $isPageShow;
            final /* synthetic */ AppUpgradeEntity $it;
            final /* synthetic */ FragmentManager $manager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AppUpgradeEntity appUpgradeEntity, FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = appUpgradeEntity;
                this.$manager = fragmentManager;
                this.$appUpgradeType = abstractC45585n0;
                this.$isPageShow = function0;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.$manager, this.$appUpgradeType, this.$isPageShow, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws JSONException {
                String string;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppUpgradeEntity appUpgradeEntity = this.$it;
                    if (appUpgradeEntity == null || (string = appUpgradeEntity.toString()) == null) {
                        string = "AppUpgradeEntity=null";
                    }
                    C45591t.f102713a.m100681a("appUpgradeDialog-getHomeUpgradeTipInfo_onSuccess:" + string);
                    boolean z11 = false;
                    AppUpgradeManger.f35085g = 0;
                    AppUpgradeManger.f35082d.put("homepage_key", Boxing.boxBoolean(false));
                    Map map = AppUpgradeManger.f35083e;
                    AppUpgradeEntity appUpgradeEntity2 = this.$it;
                    if (appUpgradeEntity2 == null || appUpgradeEntity2.isNullOrEmptyData()) {
                        z11 = true;
                    }
                    map.put("homepage_key", Boxing.boxBoolean(z11));
                    if (Intrinsics.areEqual(AppUpgradeManger.f35083e.get("homepage_key"), Boxing.boxBoolean(true))) {
                        return Unit.INSTANCE;
                    }
                    AppUpgradeManger appUpgradeManger = AppUpgradeManger.f35079a;
                    appUpgradeManger.m41712r().put("homepage_key", this.$it);
                    AppUpgradeEntity appUpgradeEntity3 = appUpgradeManger.m41712r().get("homepage_key");
                    if (appUpgradeEntity3 != null) {
                        appUpgradeManger.m41713s(appUpgradeEntity3, this.$manager, this.$appUpgradeType, this.$isPageShow);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AppUpgradeEntity appUpgradeEntity, Continuation<? super Unit> continuation) {
            return ((C189651) create(appUpgradeEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189651(FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, Continuation<? super C189651> continuation) {
            super(2, continuation);
            this.$manager = fragmentManager;
            this.$appUpgradeType = abstractC45585n0;
            this.$isPageShow = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189651 c189651 = new C189651(this.$manager, this.$appUpgradeType, this.$isPageShow, continuation);
            c189651.L$0 = obj;
            return c189651;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppUpgradeEntity appUpgradeEntity = (AppUpgradeEntity) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(appUpgradeEntity, this.$manager, this.$appUpgradeType, this.$isPageShow, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(appUpgradeEntity);
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpgradeManger$getHomeUpgradeTipInfo$1(FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, Continuation<? super AppUpgradeManger$getHomeUpgradeTipInfo$1> continuation) {
        super(2, continuation);
        this.$manager = fragmentManager;
        this.$appUpgradeType = abstractC45585n0;
        this.$isPageShow = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppUpgradeManger$getHomeUpgradeTipInfo$1(this.$manager, this.$appUpgradeType, this.$isPageShow, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppUpgradeManger$getHomeUpgradeTipInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r9, r10, r13) == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i11;
        long j11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                j11 = this.J$0;
                i11 = this.I$0;
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C43521a c43521a = C43521a.f96057a;
        String strM95763a = c43521a.m95763a();
        int iM95768f = c43521a.m95768f();
        long jM95769g = c43521a.m95769g();
        InterfaceC41634e<AppUpgradeEntity> interfaceC41634eM86404a = AppUpgradeManger.f35079a.m41711q().m86404a(CodePackage.COMMON, strM95763a, iM95768f, jM95769g);
        C189651 c189651 = new C189651(this.$manager, this.$appUpgradeType, this.$isPageShow, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(strM95763a);
        this.I$0 = iM95768f;
        this.J$0 = jM95769g;
        this.label = 1;
        obj = RetrofitFlowExKt.m42825f(interfaceC41634eM86404a, false, c189651, this);
        if (obj != coroutine_suspended) {
            str = strM95763a;
            i11 = iM95768f;
            j11 = jM95769g;
        }
        return coroutine_suspended;
        C19334f c19334f = (C19334f) obj;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            AppUpgradeManger$getHomeUpgradeTipInfo$1$2$1 appUpgradeManger$getHomeUpgradeTipInfo$1$2$1 = new AppUpgradeManger$getHomeUpgradeTipInfo$1$2$1(null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(str);
            this.L$1 = c19334f;
            this.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
            this.L$3 = SpillingKt.nullOutSpilledVariable(throwable);
            this.I$0 = i11;
            this.J$0 = j11;
            this.I$1 = 0;
            this.I$2 = 0;
            this.I$3 = 0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
