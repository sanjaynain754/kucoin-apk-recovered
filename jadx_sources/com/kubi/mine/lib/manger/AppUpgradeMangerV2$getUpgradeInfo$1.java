package com.kubi.mine.lib.manger;

import androidx.fragment.app.FragmentManager;
import com.kubi.mine.lib.entity.AppUpgradeEntityV2;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.json.JSONException;
import p694vk.AbstractC45585n0;
import p694vk.C45590s;
import p694vk.C45591t;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppUpgradeMangerV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeMangerV2$getUpgradeInfo$1", m90122f = "AppUpgradeMangerV2.kt", m90123i = {0}, m90124l = {80}, m90125m = "invokeSuspend", m90126n = {"channelValue"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nAppUpgradeMangerV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeMangerV2.kt\ncom/kubi/mine/lib/manger/AppUpgradeMangerV2$getUpgradeInfo$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n25#2:260\n26#2:262\n1#3:261\n*S KotlinDebug\n*F\n+ 1 AppUpgradeMangerV2.kt\ncom/kubi/mine/lib/manger/AppUpgradeMangerV2$getUpgradeInfo$1\n*L\n102#1:260\n102#1:262\n102#1:261\n*E\n"})
public final class AppUpgradeMangerV2$getUpgradeInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC45585n0 $appUpgradeType;
    final /* synthetic */ Function1<Boolean, Unit> $dialogShow;
    final /* synthetic */ Function0<Boolean> $isPageShow;
    final /* synthetic */ FragmentManager $manager;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeMangerV2$getUpgradeInfo$1$1 */
    /* JADX INFO: compiled from: AppUpgradeMangerV2.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeMangerV2$getUpgradeInfo$1$1", m90122f = "AppUpgradeMangerV2.kt", m90123i = {0}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C189671 extends SuspendLambda implements Function2<AppUpgradeEntityV2, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractC45585n0 $appUpgradeType;
        final /* synthetic */ Function1<Boolean, Unit> $dialogShow;
        final /* synthetic */ Function0<Boolean> $isPageShow;
        final /* synthetic */ FragmentManager $manager;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeMangerV2$getUpgradeInfo$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AppUpgradeMangerV2.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeMangerV2$getUpgradeInfo$1$1$1", m90122f = "AppUpgradeMangerV2.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ AbstractC45585n0 $appUpgradeType;
            final /* synthetic */ Function1<Boolean, Unit> $dialogShow;
            final /* synthetic */ Function0<Boolean> $isPageShow;
            final /* synthetic */ AppUpgradeEntityV2 $it;
            final /* synthetic */ FragmentManager $manager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(AppUpgradeEntityV2 appUpgradeEntityV2, AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = appUpgradeEntityV2;
                this.$appUpgradeType = abstractC45585n0;
                this.$manager = fragmentManager;
                this.$isPageShow = function0;
                this.$dialogShow = function1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.$appUpgradeType, this.$manager, this.$isPageShow, this.$dialogShow, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws JSONException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45591t c45591t = C45591t.f102713a;
                    c45591t.m100681a("appUpgradeDialog-onSuccess it=" + this.$it);
                    AppUpgradeEntityV2 appUpgradeEntityV2 = this.$it;
                    if (appUpgradeEntityV2 != null && !appUpgradeEntityV2.isNullOrEmptyData()) {
                        AppUpgradeEntityV2 appUpgradeEntityV3 = this.$it;
                        if (appUpgradeEntityV3 != null) {
                            AppUpgradeMangerV2.f35086a.m41732l(appUpgradeEntityV3, this.$manager, this.$appUpgradeType, this.$isPageShow, this.$dialogShow);
                        }
                        return Unit.INSTANCE;
                    }
                    if (this.$appUpgradeType instanceof AbstractC45585n0.a) {
                        AppUpgradeMangerV2.f35086a.m41735p();
                    }
                    c45591t.m100681a("appUpgradeDialog-onSuccess null return");
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AppUpgradeEntityV2 appUpgradeEntityV2, Continuation<? super Unit> continuation) {
            return ((C189671) create(appUpgradeEntityV2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C189671(AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1, Continuation<? super C189671> continuation) {
            super(2, continuation);
            this.$appUpgradeType = abstractC45585n0;
            this.$manager = fragmentManager;
            this.$isPageShow = function0;
            this.$dialogShow = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189671 c189671 = new C189671(this.$appUpgradeType, this.$manager, this.$isPageShow, this.$dialogShow, continuation);
            c189671.L$0 = obj;
            return c189671;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppUpgradeEntityV2 appUpgradeEntityV2 = (AppUpgradeEntityV2) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(appUpgradeEntityV2, this.$appUpgradeType, this.$manager, this.$isPageShow, this.$dialogShow, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(appUpgradeEntityV2);
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
    /* JADX WARN: Multi-variable type inference failed */
    public AppUpgradeMangerV2$getUpgradeInfo$1(AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1, Continuation<? super AppUpgradeMangerV2$getUpgradeInfo$1> continuation) {
        super(2, continuation);
        this.$appUpgradeType = abstractC45585n0;
        this.$manager = fragmentManager;
        this.$isPageShow = function0;
        this.$dialogShow = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppUpgradeMangerV2$getUpgradeInfo$1(this.$appUpgradeType, this.$manager, this.$isPageShow, this.$dialogShow, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppUpgradeMangerV2$getUpgradeInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String strM100665P = C45590s.f102687a.m100665P();
            InterfaceC41634e<AppUpgradeEntityV2> interfaceC41634eM86405c = AppUpgradeMangerV2.f35086a.m41728g().m86405c(strM100665P);
            C189671 c189671 = new C189671(this.$appUpgradeType, this.$manager, this.$isPageShow, this.$dialogShow, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM100665P);
            this.label = 1;
            obj = RetrofitFlowExKt.m42825f(interfaceC41634eM86405c, false, c189671, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C45591t.f102713a.m100681a("appUpgradeDialog-onFail " + throwable);
        }
        return Unit.INSTANCE;
    }
}
