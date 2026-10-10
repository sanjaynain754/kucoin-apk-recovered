package com.kubi.helpcenter;

import android.content.Context;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.entity.BotTypeEntity;
import com.kubi.helpcenter.entity.QueryBotTypeParams;
import com.kubi.helpcenter.exception.HelpCenterException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.core.Router;
import com.kubi.user.api.d;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vi.C45555b;
import vi.InterfaceC45554a;

/* JADX INFO: compiled from: CustomerServiceHelper.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.helpcenter.CustomerServiceHelper$Companion$toChatDirectly$1", m90122f = "CustomerServiceHelper.kt", m90123i = {}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCustomerServiceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerServiceHelper.kt\ncom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HelpCenterIssue.kt\ncom/kubi/helpcenter/exception/HelpCenterIssueKt\n*L\n1#1,152:1\n25#2:153\n26#2:157\n1#3:154\n44#4,2:155\n*S KotlinDebug\n*F\n+ 1 CustomerServiceHelper.kt\ncom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1\n*L\n105#1:153\n105#1:157\n105#1:154\n109#1:155,2\n*E\n"})
public final class CustomerServiceHelper$Companion$toChatDirectly$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ HashMap<String, String> $configMap;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $from;
    final /* synthetic */ boolean $isReset;
    final /* synthetic */ CustomerServiceType $source;
    int label;

    /* JADX INFO: renamed from: com.kubi.helpcenter.CustomerServiceHelper$Companion$toChatDirectly$1$1 */
    /* JADX INFO: compiled from: CustomerServiceHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "botTypeEntity", "Lcom/kubi/helpcenter/entity/BotTypeEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.helpcenter.CustomerServiceHelper$Companion$toChatDirectly$1$1", m90122f = "CustomerServiceHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C144741 extends SuspendLambda implements Function2<BotTypeEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ HashMap<String, String> $configMap;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $from;
        final /* synthetic */ boolean $isReset;
        final /* synthetic */ CustomerServiceType $source;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(BotTypeEntity botTypeEntity, Continuation<? super Unit> continuation) {
            return ((C144741) create(botTypeEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BotTypeEntity botTypeEntity = (BotTypeEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(botTypeEntity.getType(), BotTypeEntity.ADA_BOT_SDK)) {
                String str = this.$from;
                CustomerServiceHelper.f25162a.m28890b(this.$context, (str == null || str.length() <= 0) ? this.$source.getServiceType() : this.$from, this.$configMap, this.$isReset);
            } else {
                Boxing.boxBoolean(Router.f46192a.m56184f(botTypeEntity.getUrl()).m4048k());
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144741(String str, CustomerServiceType customerServiceType, Context context, HashMap<String, String> map, boolean z11, Continuation<? super C144741> continuation) {
            super(2, continuation);
            this.$from = str;
            this.$source = customerServiceType;
            this.$context = context;
            this.$configMap = map;
            this.$isReset = z11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144741 c144741 = new C144741(this.$from, this.$source, this.$context, this.$configMap, this.$isReset, continuation);
            c144741.L$0 = obj;
            return c144741;
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<BotTypeEntity> interfaceC41634eM100608b = ((InterfaceC45554a) C42597a.m93387c().create(InterfaceC45554a.class)).m100608b(new QueryBotTypeParams(null, true, this.$source.getServiceType(), null, 9, null));
            C144741 c144741 = new C144741(this.$from, this.$source, this.$context, this.$configMap, this.$isReset, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM100608b, false, c144741, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            Router.f46192a.m56184f(d.d(C45555b.f102657a.m100609a(CustomerServiceType.NONE.getServiceType()), false, 2, (Object) null)).m4048k();
            C43846g.m96568c(new HelpCenterException(throwable, "CustomerServiceHelper", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerServiceHelper$Companion$toChatDirectly$1(CustomerServiceType customerServiceType, String str, Context context, HashMap<String, String> map, boolean z11, Continuation<? super CustomerServiceHelper$Companion$toChatDirectly$1> continuation) {
        super(2, continuation);
        this.$source = customerServiceType;
        this.$from = str;
        this.$context = context;
        this.$configMap = map;
        this.$isReset = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerServiceHelper$Companion$toChatDirectly$1(this.$source, this.$from, this.$context, this.$configMap, this.$isReset, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CustomerServiceHelper$Companion$toChatDirectly$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
