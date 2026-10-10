package com.trtc.uikit.livekit.p180kc.helper;

import android.content.Context;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveTxUserInfo;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: LiveHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.helper.LiveHelper$login$3", m90122f = "LiveHelper.kt", m90123i = {0}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "invokeSuspend", m90126n = {"$i$f$suspendCancellableCoroutine"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nLiveHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveHelper.kt\ncom/trtc/uikit/livekit/kc/helper/LiveHelper$login$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,154:1\n426#2,11:155\n*S KotlinDebug\n*F\n+ 1 LiveHelper.kt\ncom/trtc/uikit/livekit/kc/helper/LiveHelper$login$3\n*L\n60#1:155,11\n*E\n"})
public final class LiveHelper$login$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ LiveTxUserInfo $txUserInfo;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.helper.LiveHelper$login$3$a */
    /* JADX INFO: compiled from: LiveHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/kc/helper/LiveHelper$login$3$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36402a implements CompletionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC41708m<String> f79158a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveTxUserInfo f79159b;

        /* JADX WARN: Multi-variable type inference failed */
        public C36402a(InterfaceC41708m<? super String> interfaceC41708m, LiveTxUserInfo liveTxUserInfo) {
            this.f79158a = interfaceC41708m;
            this.f79159b = liveTxUserInfo;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ToastCompat.m66437C(R$string.live_kc_common_error);
            C44128b.m97261e("Live", "login fail errorCode: " + code + " errorMessage:" + desc);
            if (this.f79158a.isActive()) {
                this.f79158a.resumeWith(Result.m103844constructorimpl(null));
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            C44128b.m97266j("Live", "login tx onSuccess");
            if (this.f79158a.isActive()) {
                InterfaceC41708m<String> interfaceC41708m = this.f79158a;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(C27041f.m66668h(this.f79159b.getTxUserId())));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveHelper$login$3(Context context, LiveTxUserInfo liveTxUserInfo, Continuation<? super LiveHelper$login$3> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$txUserInfo = liveTxUserInfo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveHelper$login$3(this.$context, this.$txUserInfo, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((LiveHelper$login$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.$context;
        LiveTxUserInfo liveTxUserInfo = this.$txUserInfo;
        this.L$0 = context;
        this.L$1 = liveTxUserInfo;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        LoginStore.shared.login(context, C27039d.m66650j(liveTxUserInfo.getSdkAppId()), C27041f.m66668h(liveTxUserInfo.getTxUserId()), C27041f.m66668h(liveTxUserInfo.getTxUserSig()), new C36402a(c41716o, liveTxUserInfo));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
