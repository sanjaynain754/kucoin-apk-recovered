package com.kubi.kyc.pannumber;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kyc.entity.PanDialogConfigEntity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.base.entity.BaseEntity;
import java.lang.reflect.Type;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PanNumberBizErrorReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/pannumber/PanNumberBizErrorReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "pathWhiteList", "", "", "getPathWhiteList", "()Ljava/util/List;", "pathWhiteList$delegate", "Lkotlin/Lazy;", "invoke", "", "info", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPanNumberBizErrorReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanNumberBizErrorReceiver.kt\ncom/kubi/kyc/pannumber/PanNumberBizErrorReceiver\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n35#2,4:50\n39#2:56\n44#3,2:54\n*S KotlinDebug\n*F\n+ 1 PanNumberBizErrorReceiver.kt\ncom/kubi/kyc/pannumber/PanNumberBizErrorReceiver\n*L\n22#1:50,4\n22#1:56\n22#1:54,2\n*E\n"})
public final class PanNumberBizErrorReceiver implements InterfaceC46255c {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f31235c = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f31236b = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.pannumber.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PanNumberBizErrorReceiver.m36831d();
        }
    });

    /* JADX INFO: compiled from: PanNumberBizErrorReceiver.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kyc/pannumber/PanNumberBizErrorReceiver$Companion;", "", "<init>", "()V", "PAN_NUMBER_HANDLE_CODE", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.pannumber.PanNumberBizErrorReceiver$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C17118a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.kyc.pannumber.PanNumberBizErrorReceiver$invoke$1 */
    /* JADX INFO: compiled from: PanNumberBizErrorReceiver.kt */
    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kyc.pannumber.PanNumberBizErrorReceiver$invoke$1", m90122f = "PanNumberBizErrorReceiver.kt", m90123i = {0, 0, 0}, m90124l = {40}, m90125m = "invokeSuspend", m90126n = {"$this$launchOnTopLifecycleStart", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-PanNumberBizErrorReceiver$invoke$1$1"}, m90127s = {"L$0", "L$1", "I$0"})
    public static final class C171191 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C171191(Continuation<? super C171191> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171191 c171191 = new C171191(continuation);
            c171191.L$0 = obj;
            return c171191;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C171191) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM103844constructorimpl;
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    PanApi panApi = (PanApi) C42597a.m93386b().create(PanApi.class);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = panApi.m36834a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM103844constructorimpl = Result.m103844constructorimpl((PanDialogConfigEntity) ((BaseEntity) obj).getData());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                PanDialogConfigEntity panDialogConfigEntity = (PanDialogConfigEntity) objM103844constructorimpl;
                PanDialog panDialog = PanDialog.f31239a;
                Intrinsics.checkNotNull(panDialogConfigEntity);
                panDialog.m36843e(panDialogConfigEntity);
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n("PanNumberBizErrorReceiver", "queryPanDialogConfig error " + thM103847exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final List m36831d() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C17118a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("pan_number_handle_path_white_list", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        List list = (List) objM20457a;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m36832b() {
        return (List) this.f31236b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public void m36833c(@NotNull BizErrorInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Request request = info.getRequest();
        if (Intrinsics.areEqual(info.getBody().optString("code"), "600000") && m36832b().contains(request.url().encodedPath())) {
            MviExKt.m42518n(new C171191(null));
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m36833c((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }
}
