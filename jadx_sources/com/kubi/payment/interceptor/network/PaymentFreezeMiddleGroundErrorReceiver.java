package com.kubi.payment.interceptor.network;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mvi.common.MviExKt;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.entities.MiddleGroundResource;
import com.kubi.payment.data.source.PaymentRepository;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p477nt.AbstractC42878k;
import p477nt.C42879l;
import p569qq.C43846g;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentFreezeMiddleGroundErrorReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundErrorReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "pathWhiteList", "", "", "getPathWhiteList", "()Ljava/util/List;", "pathWhiteList$delegate", "Lkotlin/Lazy;", "invoke", "", "errorInfo", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "showMiddleGroundDialog", "res", "Lcom/kubi/payment/data/entities/MiddleGroundResource;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentFreezeMiddleGroundErrorReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFreezeMiddleGroundErrorReceiver.kt\ncom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundErrorReceiver\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,67:1\n35#2,4:68\n39#2:74\n44#3,2:72\n*S KotlinDebug\n*F\n+ 1 PaymentFreezeMiddleGroundErrorReceiver.kt\ncom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundErrorReceiver\n*L\n22#1:68,4\n22#1:74\n22#1:72,2\n*E\n"})
public final class PaymentFreezeMiddleGroundErrorReceiver implements InterfaceC46255c {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f39548c = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f39549b = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.interceptor.network.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentFreezeMiddleGroundErrorReceiver.m48253e();
        }
    });

    /* JADX INFO: compiled from: PaymentFreezeMiddleGroundErrorReceiver.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundErrorReceiver$Companion;", "", "<init>", "()V", "CODE", "", "MESSAGE", "PAYMENT_FREEZE_MIDDLE_GROUND_ERROR_CODE", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.interceptor.network.PaymentFreezeMiddleGroundErrorReceiver$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21017a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.payment.interceptor.network.PaymentFreezeMiddleGroundErrorReceiver$invoke$1 */
    /* JADX INFO: compiled from: PaymentFreezeMiddleGroundErrorReceiver.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.interceptor.network.PaymentFreezeMiddleGroundErrorReceiver$invoke$1", m90122f = "PaymentFreezeMiddleGroundErrorReceiver.kt", m90123i = {}, m90124l = {47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C210181 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $middleGroundResourceId;
        int label;
        final /* synthetic */ PaymentFreezeMiddleGroundErrorReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C210181(String str, PaymentFreezeMiddleGroundErrorReceiver paymentFreezeMiddleGroundErrorReceiver, Continuation<? super C210181> continuation) {
            super(2, continuation);
            this.$middleGroundResourceId = str;
            this.this$0 = paymentFreezeMiddleGroundErrorReceiver;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C210181(this.$middleGroundResourceId, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C210181) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MiddleGroundResource middleGroundResource;
            List list;
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
                PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
                String str = this.$middleGroundResourceId;
                this.label = 1;
                obj = paymentRepositoryM45618f.mo46265K(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map map = (Map) C42879l.m94041a((AbstractC42878k) obj);
            PaymentFreezeMiddleGroundErrorReceiver paymentFreezeMiddleGroundErrorReceiver = this.this$0;
            if (map != null && (list = (List) map.get(this.$middleGroundResourceId)) != null) {
                middleGroundResource = (MiddleGroundResource) CollectionsKt.firstOrNull(list);
            } else {
                middleGroundResource = null;
            }
            paymentFreezeMiddleGroundErrorReceiver.m48255f(middleGroundResource);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c */
    private final List<String> m48252c() {
        return (List) this.f39549b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final List m48253e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21017a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_freeze_middle_ground_handle_path_white_list", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        List list = (List) objM20457a;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: d */
    public void m48254d(@NotNull BizErrorInfo errorInfo) {
        String strOptString;
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        Request request = errorInfo.getRequest();
        JSONObject body = errorInfo.getBody();
        if (!Intrinsics.areEqual(body.optString("code"), "900000") || (strOptString = body.optString("msg")) == null || strOptString.length() == 0 || m48252c().contains(request.url().encodedPath())) {
            return;
        }
        MviExKt.m42518n(new C210181(strOptString, this, null));
    }

    /* JADX INFO: renamed from: f */
    public final void m48255f(MiddleGroundResource middleGroundResource) {
        PaymentFreezeMiddleGroundDialogManager.f39552a.m48262d(middleGroundResource);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m48254d((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }
}
