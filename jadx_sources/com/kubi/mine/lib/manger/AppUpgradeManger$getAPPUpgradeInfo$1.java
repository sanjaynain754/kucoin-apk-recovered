package com.kubi.mine.lib.manger;

import androidx.fragment.app.FragmentManager;
import com.kubi.mine.lib.entity.AppUpgradeEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p319hq.InterfaceC38284a;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppUpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getAPPUpgradeInfo$1", m90122f = "AppUpgradeManger.kt", m90123i = {1, 1, 1, 1, 1, 1}, m90124l = {BaseQuickAdapter.HEADER_VIEW, 296}, m90125m = "invokeSuspend", m90126n = {"$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-AppUpgradeManger$getAPPUpgradeInfo$1$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nAppUpgradeManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeManger.kt\ncom/kubi/mine/lib/manger/AppUpgradeManger$getAPPUpgradeInfo$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n25#2:513\n26#2:515\n1#3:514\n*S KotlinDebug\n*F\n+ 1 AppUpgradeManger.kt\ncom/kubi/mine/lib/manger/AppUpgradeManger$getAPPUpgradeInfo$1\n*L\n295#1:513\n295#1:515\n295#1:514\n*E\n"})
public final class AppUpgradeManger$getAPPUpgradeInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC45585n0 $appUpgradeType;
    final /* synthetic */ Function0<Boolean> $isPageShow;
    final /* synthetic */ FragmentManager $manager;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeManger$getAPPUpgradeInfo$1$1 */
    /* JADX INFO: compiled from: AppUpgradeManger.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mine/lib/entity/AppUpgradeEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getAPPUpgradeInfo$1$1", m90122f = "AppUpgradeManger.kt", m90123i = {0}, m90124l = {274}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C189641 extends SuspendLambda implements Function2<AppUpgradeEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractC45585n0 $appUpgradeType;
        final /* synthetic */ Function0<Boolean> $isPageShow;
        final /* synthetic */ FragmentManager $manager;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeManger$getAPPUpgradeInfo$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AppUpgradeManger.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getAPPUpgradeInfo$1$1$1", m90122f = "AppUpgradeManger.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ AbstractC45585n0 $appUpgradeType;
            final /* synthetic */ Function0<Boolean> $isPageShow;
            final /* synthetic */ AppUpgradeEntity $it;
            final /* synthetic */ FragmentManager $manager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AppUpgradeEntity appUpgradeEntity, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, FragmentManager fragmentManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = appUpgradeEntity;
                this.$appUpgradeType = abstractC45585n0;
                this.$isPageShow = function0;
                this.$manager = fragmentManager;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.$appUpgradeType, this.$isPageShow, this.$manager, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String string;
                boolean z11;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppUpgradeEntity appUpgradeEntity = this.$it;
                    if (appUpgradeEntity == null || (string = appUpgradeEntity.toString()) == null) {
                        string = "AppUpgradeEntity=null";
                    }
                    C45591t.f102713a.m100681a("appUpgradeDialog-getAPPUpgradeInfo_onSuccess:" + string);
                    Map map = AppUpgradeManger.f35083e;
                    AppUpgradeEntity appUpgradeEntity2 = this.$it;
                    if (appUpgradeEntity2 != null && !appUpgradeEntity2.isNullOrEmptyData()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    map.put("appUpgrade_key", Boxing.boxBoolean(z11));
                    AppUpgradeManger appUpgradeManger = AppUpgradeManger.f35079a;
                    if (appUpgradeManger.m41715v(this.$appUpgradeType, this.$isPageShow)) {
                        return Unit.INSTANCE;
                    }
                    appUpgradeManger.m41712r().put("appUpgrade_key", this.$it);
                    AppUpgradeEntity appUpgradeEntity3 = appUpgradeManger.m41712r().get("appUpgrade_key");
                    if (appUpgradeEntity3 != null) {
                        AbstractC45585n0 abstractC45585n0 = this.$appUpgradeType;
                        FragmentManager fragmentManager = this.$manager;
                        Function0<Boolean> function0 = this.$isPageShow;
                        AppUpgradeManger.f35082d.put(abstractC45585n0, Boxing.boxBoolean(false));
                        appUpgradeManger.m41705k(appUpgradeEntity3, abstractC45585n0, fragmentManager, function0);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AppUpgradeEntity appUpgradeEntity, Continuation<? super Unit> continuation) {
            return ((C189641) create(appUpgradeEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189641(AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, FragmentManager fragmentManager, Continuation<? super C189641> continuation) {
            super(2, continuation);
            this.$appUpgradeType = abstractC45585n0;
            this.$isPageShow = function0;
            this.$manager = fragmentManager;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189641 c189641 = new C189641(this.$appUpgradeType, this.$isPageShow, this.$manager, continuation);
            c189641.L$0 = obj;
            return c189641;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppUpgradeEntity appUpgradeEntity = (AppUpgradeEntity) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(appUpgradeEntity, this.$appUpgradeType, this.$isPageShow, this.$manager, null);
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
    public AppUpgradeManger$getAPPUpgradeInfo$1(AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, FragmentManager fragmentManager, Continuation<? super AppUpgradeManger$getAPPUpgradeInfo$1> continuation) {
        super(2, continuation);
        this.$appUpgradeType = abstractC45585n0;
        this.$isPageShow = function0;
        this.$manager = fragmentManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppUpgradeManger$getAPPUpgradeInfo$1(this.$appUpgradeType, this.$isPageShow, this.$manager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppUpgradeManger$getAPPUpgradeInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r4, r5, r17) == r6) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM42826g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM86403b = InterfaceC38284a.m86403b(AppUpgradeManger.f35079a.m41711q(), "CHECK", null, 0, 0L, 14, null);
            C189641 c189641 = new C189641(this.$appUpgradeType, this.$isPageShow, this.$manager, null);
            this.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM86403b, false, c189641, this, 1, null);
            if (objM42826g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(obj);
            objM42826g = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        C19334f c19334f = (C19334f) objM42826g;
        AbstractC45585n0 abstractC45585n0 = this.$appUpgradeType;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            AppUpgradeManger$getAPPUpgradeInfo$1$2$1 appUpgradeManger$getAPPUpgradeInfo$1$2$1 = new AppUpgradeManger$getAPPUpgradeInfo$1$2$1(abstractC45585n0, null);
            this.L$0 = c19334f;
            this.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
            this.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
            this.I$0 = 0;
            this.I$1 = 0;
            this.I$2 = 0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
