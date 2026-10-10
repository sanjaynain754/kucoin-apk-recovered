package com.trtc.uikit.livekit.p180kc.interceptor;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl;
import com.trtc.uikit.livekit.p180kc.helper.LiveHelper;
import com.trtc.uikit.livekit.p180kc.util.LiveMessage;
import java.util.concurrent.atomic.AtomicBoolean;
import k10.DialogC40864b;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import ne0.C42817b;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: LiveRouteInterceptor.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.interceptor.LiveRouteInterceptor$intercept$1", m90122f = "LiveRouteInterceptor.kt", m90123i = {}, m90124l = {79, 84}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nLiveRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,146:1\n43#2,4:147\n*S KotlinDebug\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1\n*L\n104#1:147,4\n*E\n"})
public final class LiveRouteInterceptor$intercept$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $fromInviteOpenId;
    final /* synthetic */ Ref.ObjectRef<DialogC40864b> $loadingDialog;
    final /* synthetic */ AtomicBoolean $loadingShown;
    final /* synthetic */ String $roomId;
    final /* synthetic */ String $roomOwnerId;
    final /* synthetic */ String $source;
    Object L$0;
    int label;
    final /* synthetic */ LiveRouteInterceptor this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.interceptor.LiveRouteInterceptor$intercept$1$1 */
    /* JADX INFO: compiled from: LiveRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.interceptor.LiveRouteInterceptor$intercept$1$1", m90122f = "LiveRouteInterceptor.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364061 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super DialogC40864b>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364061(FragmentActivity fragmentActivity, Continuation<? super C364061> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364061(this.$activity, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super DialogC40864b> continuation) {
            return ((C364061) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return new DialogC40864b(this.$activity, false, 2, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.interceptor.LiveRouteInterceptor$intercept$1$2 */
    /* JADX INFO: compiled from: LiveRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.interceptor.LiveRouteInterceptor$intercept$1$2", m90122f = "LiveRouteInterceptor.kt", m90123i = {1}, m90124l = {85, 95}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0"})
    @SourceDebugExtension({"SMAP\nLiveRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,146:1\n49#2,2:147\n*S KotlinDebug\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2\n*L\n98#1:147,2\n*E\n"})
    public static final class C364072 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ String $fromInviteOpenId;
        final /* synthetic */ String $roomId;
        final /* synthetic */ String $roomOwnerId;
        final /* synthetic */ String $source;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364072(FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, Continuation<? super C364072> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$roomId = str;
            this.$roomOwnerId = str2;
            this.$source = str3;
            this.$fromInviteOpenId = str4;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364072(this.$activity, this.$roomId, this.$roomOwnerId, this.$source, this.$fromInviteOpenId, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364072) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
        
            if (r1.m81514f(r2, r3, r11) == r0) goto L21;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveHelper liveHelper = LiveHelper.f79157a;
            Context applicationContext = this.$activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String str = this.$roomId;
            Intrinsics.checkNotNull(str);
            this.label = 1;
            obj = liveHelper.m81512d(applicationContext, str, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            String strM66668h = C27041f.m66668h((String) obj);
            if (!StringsKt.isBlank(strM66668h)) {
                VideoLiveKitImpl.Companion companion = VideoLiveKitImpl.f79326j;
                Context applicationContext2 = this.$activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                VideoLiveKitImpl videoLiveKitImplCreateInstance = companion.createInstance(applicationContext2);
                String str2 = this.$roomId;
                Intrinsics.checkNotNull(str2);
                String str3 = this.$roomOwnerId;
                Intrinsics.checkNotNull(str3);
                videoLiveKitImplCreateInstance.m81745i(str2, str3, strM66668h);
                if (Intrinsics.areEqual(this.$source, "SHARE")) {
                    String str4 = this.$fromInviteOpenId;
                    Intrinsics.checkNotNull(str4);
                    if (!StringsKt.isBlank(str4)) {
                        LiveHelper liveHelper2 = LiveHelper.f79157a;
                        String str5 = this.$roomId;
                        Intrinsics.checkNotNull(str5);
                        String str6 = this.$fromInviteOpenId;
                        Intrinsics.checkNotNull(str6);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(strM66668h);
                        this.label = 2;
                    }
                }
            } else {
                C43846g.m96568c(new LiveMessage("tx login failed", "LiveRouteInterceptor", false, 4, null), null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRouteInterceptor$intercept$1(Ref.ObjectRef<DialogC40864b> objectRef, LiveRouteInterceptor liveRouteInterceptor, FragmentActivity fragmentActivity, AtomicBoolean atomicBoolean, String str, String str2, String str3, String str4, Continuation<? super LiveRouteInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.$loadingDialog = objectRef;
        this.this$0 = liveRouteInterceptor;
        this.$activity = fragmentActivity;
        this.$loadingShown = atomicBoolean;
        this.$roomId = str;
        this.$roomOwnerId = str2;
        this.$source = str3;
        this.$fromInviteOpenId = str4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveRouteInterceptor$intercept$1(this.$loadingDialog, this.this$0, this.$activity, this.$loadingShown, this.$roomId, this.$roomOwnerId, this.$source, this.$fromInviteOpenId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LiveRouteInterceptor$intercept$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r15, r7, r14) == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DialogC40864b dialogC40864b;
        Ref.ObjectRef<DialogC40864b> objectRef;
        T t11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = this.$loadingDialog;
                AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
                C364061 c364061 = new C364061(this.$activity, null);
                this.L$0 = objectRef;
                this.label = 1;
                Object objM91049g = C41686h.m91049g(abstractC41586e2M91393c, c364061, this);
                t11 = objM91049g;
                if (objM91049g == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t11 = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            dialogC40864b = this.$loadingDialog.element;
            if (dialogC40864b != null) {
                LiveRouteInterceptor liveRouteInterceptor = this.this$0;
                DialogC40864b dialogC40864b2 = dialogC40864b;
            }
            return Unit.INSTANCE;
            objectRef.element = t11;
            this.this$0.m81534f(this.$activity, this.$loadingDialog.element, this.$loadingShown);
            C41685g2 c41685g2 = C41685g2.f91735b;
            C364072 c364072 = new C364072(this.$activity, this.$roomId, this.$roomOwnerId, this.$source, this.$fromInviteOpenId, null);
            this.L$0 = null;
            this.label = 2;
        } catch (Exception e11) {
            ToastCompat.m66437C(R$string.live_kc_common_error);
            C44128b.m97262f("Live", "LiveRouteInterceptor", e11);
            if (!C42899b.m94075e(e11)) {
                C42817b.m93883b(e11, "LiveRouteInterceptor");
            }
            dialogC40864b = this.$loadingDialog.element;
            if (dialogC40864b != null) {
            }
        } finally {
            DialogC40864b dialogC40864b3 = this.$loadingDialog.element;
            if (dialogC40864b3 != null) {
                this.this$0.m81533e(dialogC40864b3, this.$loadingShown);
            }
            this.this$0.f79167a.set(false);
        }
    }
}
