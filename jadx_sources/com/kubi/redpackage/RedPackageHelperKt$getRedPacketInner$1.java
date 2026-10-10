package com.kubi.redpackage;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.redpackage.entity.RedpacketInfoEntity;
import com.kubi.redpackage.p109ui.RedpacketRecieveDialogFragment;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.utils.C27057k;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.json.JSONException;
import org.json.JSONObject;
import p845zv.C46928a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RedPackageHelper.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.redpackage.RedPackageHelperKt$getRedPacketInner$1", m90122f = "RedPackageHelper.kt", m90123i = {0}, m90124l = {83}, m90125m = "invokeSuspend", m90126n = {"$this$launchWhenStarted"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nRedPackageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPackageHelper.kt\ncom/kubi/redpackage/RedPackageHelperKt$getRedPacketInner$1\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n106#2,2:160\n25#3:162\n26#3:164\n1#4:163\n*S KotlinDebug\n*F\n+ 1 RedPackageHelper.kt\ncom/kubi/redpackage/RedPackageHelperKt$getRedPacketInner$1\n*L\n82#1:160,2\n88#1:162\n88#1:164\n88#1:163\n*E\n"})
public final class RedPackageHelperKt$getRedPacketInner$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ RedPackageApi $api;
    final /* synthetic */ String $code;
    final /* synthetic */ Function1<Boolean, Unit> $onComplete;
    final /* synthetic */ Function1<JSONObject, Unit> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.redpackage.RedPackageHelperKt$getRedPacketInner$1$2 */
    /* JADX INFO: compiled from: RedPackageHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "packetInfo", "Lcom/kubi/redpackage/entity/RedpacketInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.redpackage.RedPackageHelperKt$getRedPacketInner$1$2", m90122f = "RedPackageHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C227212 extends SuspendLambda implements Function2<RedpacketInfoEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ String $code;
        final /* synthetic */ Function1<Boolean, Unit> $onComplete;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(RedpacketInfoEntity redpacketInfoEntity, Continuation<? super Unit> continuation) {
            return ((C227212) create(redpacketInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C227212(FragmentActivity fragmentActivity, String str, Function1<? super Boolean, Unit> function1, Continuation<? super C227212> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$code = str;
            this.$onComplete = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C227212 c227212 = new C227212(this.$activity, this.$code, this.$onComplete, continuation);
            c227212.L$0 = obj;
            return c227212;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            RedpacketInfoEntity redpacketInfoEntity = (RedpacketInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C27057k.m66746b("");
            RedpacketRecieveDialogFragment.Companion companion = RedpacketRecieveDialogFragment.f43196t0;
            FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            companion.show(supportFragmentManager, this.$code, redpacketInfoEntity);
            Function1<Boolean, Unit> function1 = this.$onComplete;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(true));
            }
            C46928a.m103398d(RedPkgCategory.RECEIVE_QUERY_RESULT, true, null, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RedPackageHelperKt$getRedPacketInner$1(RedPackageApi redPackageApi, String str, Function1<? super JSONObject, Unit> function1, FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function2, Continuation<? super RedPackageHelperKt$getRedPacketInner$1> continuation) {
        super(2, continuation);
        this.$api = redPackageApi;
        this.$code = str;
        this.$result = function1;
        this.$activity = fragmentActivity;
        this.$onComplete = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RedPackageHelperKt$getRedPacketInner$1 redPackageHelperKt$getRedPacketInner$1 = new RedPackageHelperKt$getRedPacketInner$1(this.$api, this.$code, this.$result, this.$activity, this.$onComplete, continuation);
        redPackageHelperKt$getRedPacketInner$1.L$0 = obj;
        return redPackageHelperKt$getRedPacketInner$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RedPackageHelperKt$getRedPacketInner$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM42824e;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<JSONObject, Unit> function1 = this.$result;
            if (C12573b.f21598a.m23696a()) {
                "com.kubi.redpackage_event:H5Result".length();
            }
            C12572a.m23693b(interfaceC41709m0, new C22722xe76bd7fb("com.kubi.redpackage_event:H5Result", null, function1));
            InterfaceC41634e<RedpacketInfoEntity> interfaceC41634eM53735j = this.$api.m53735j(this.$code);
            C227212 c227212 = new C227212(this.$activity, this.$code, this.$onComplete, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM53735j, false, c227212, this, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM42824e = obj;
        }
        Function1<JSONObject, Unit> function2 = this.$result;
        Function1<Boolean, Unit> function3 = this.$onComplete;
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            if (function2 != null) {
                function2.invoke(RedPackageHelperKt.m53721j(null, -1, Constants.IPC_BUNDLE_KEY_SEND_ERROR, false, 9, null));
            }
            if (function3 != null) {
                function3.invoke(Boxing.boxBoolean(false));
            }
            RedPkgCategory redPkgCategory = RedPkgCategory.RECEIVE_QUERY_RESULT;
            String strM66669i = C27041f.m66669i(throwable.getMessage(), "--");
            ApiException apiException = throwable instanceof ApiException ? (ApiException) throwable : null;
            C46928a.m103398d(redPkgCategory, false, strM66669i, C27041f.m66669i(apiException != null ? apiException.code : null, "--"), 1, null);
        }
        return Unit.INSTANCE;
    }
}
