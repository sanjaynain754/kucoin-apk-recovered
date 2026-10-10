package com.sumsub.sns.internal.features.presentation.videoident.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.ServiceCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleService;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29214F1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29229I1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29239K1;
import com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage$ClientMessage$UserVisibilityState$Visibility;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29958A;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.sumsub.sns.internal.features.presentation.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32917q;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32921u;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32923x;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32924y;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32925z;
import com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatState;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.twilio.video.LocalAudioTrack;
import com.twilio.video.LocalDataTrack;
import com.twilio.video.LocalVideoTrack;
import com.twilio.video.RemoteVideoTrack;
import com.twilio.video.VideoTextureView;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tvi.webrtc.VideoProcessor;
import xg0.AbstractC46162a;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001>\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0003R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "state", "", "handleChatState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;)V", "registerDismissReceiver", "stopCallAndService", "doStopForeground", "unRegisterDismissReceiver", "", "message", "Landroid/app/Notification;", "createNotification", "(Ljava/lang/String;)Landroid/app/Notification;", "onCreate", "Landroid/content/Intent;", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onUnbind", "(Landroid/content/Intent;)Z", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/NotificationState;", "notificationState", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/NotificationState;", "notificationChannelName", "Ljava/lang/String;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;", "strings", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;", "Lcom/sumsub/sns/internal/core/domain/h;", "serviceLocator", "Lcom/sumsub/sns/internal/core/domain/h;", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;", "videoChatController", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;", "getVideoChatController", "()Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;", "value", "isInForeground", "Z", "()Z", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSServiceBinder;", "binder", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSServiceBinder;", "Landroid/content/BroadcastReceiver;", "dismissReceiver", "Landroid/content/BroadcastReceiver;", "com/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$activityLifecycleCallbacks$1", "activityLifecycleCallbacks", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$activityLifecycleCallbacks$1;", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVideoChatService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoChatService.kt\ncom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService\n+ 2 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,416:1\n27#2,4:417\n*S KotlinDebug\n*F\n+ 1 SNSVideoChatService.kt\ncom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService\n*L\n182#1:417,4\n*E\n"})
public final class SNSVideoChatService extends LifecycleService {

    @NotNull
    public static final String ACTION_INTERNAL_CLOSE = "com.sumsub.sns.internal.features.presentation.videoident.ACTION_INTERNAL_CLOSE";

    @NotNull
    public static final String ACTION_START_FOREGROUND = "com.sumsub.sns.internal.features.presentation.videoident.ACTION_START_FOREGROUND";

    @NotNull
    public static final String NOTIFICATION_CHANNEL_ID = "video_identification_service";
    public static final int NOTIFICATION_ID = 11;

    @NotNull
    public static final String SNS_EXTRA_SESSION = "sns_extra_session";

    @NotNull
    public static final String SNS_EXTRA_TOKEN = "sns_extra_token";

    @Nullable
    private SNSServiceBinder binder;

    @Nullable
    private BroadcastReceiver dismissReceiver;
    private boolean isInForeground;

    @Nullable
    private C28578h serviceLocator;

    @NotNull
    private NotificationState notificationState = NotificationState.NONE;

    @NotNull
    private String notificationChannelName = "";

    @NotNull
    private C29983l strings = new C29983l();

    @NotNull
    private final C32917q videoChatController = new C32917q();

    @NotNull
    private final SNSVideoChatService$activityLifecycleCallbacks$1 activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService$activityLifecycleCallbacks$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity instanceof InterfaceC28498u0) {
                C28578h c28578h = this.this$0.serviceLocator;
                if (c28578h == null) {
                    if (this.this$0.getIsInForeground()) {
                        C33272c c33272c = C33272c.f67812a;
                        Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "can't get service locator instance", null, 4, null);
                        return;
                    }
                    return;
                }
                AbstractC32895a.m71366a("onActivityStarted: chatState=" + this.this$0.getVideoChatController().f67342n.getValue());
                if (this.this$0.getVideoChatController().f67342n.getValue() instanceof C32924y) {
                    C32917q videoChatController = this.this$0.getVideoChatController();
                    AbstractC46162a abstractC46162a = c28578h.f58188z;
                    C29214F1 c29214f1 = C29239K1.Companion;
                    c29214f1.getClass();
                    C29239K1 c29239k1 = new C29239K1(new C29229I1(SNSMessage$ClientMessage$UserVisibilityState$Visibility.VISIBLE.getValue()));
                    abstractC46162a.getSerializersModule();
                    videoChatController.m71376a(abstractC46162a.mo99409b(c29214f1.serializer(), c29239k1));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity instanceof InterfaceC28498u0) {
                C28578h c28578h = this.this$0.serviceLocator;
                if (c28578h == null) {
                    if (this.this$0.getIsInForeground()) {
                        C33272c c33272c = C33272c.f67812a;
                        Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "can't get service locator instance", null, 4, null);
                        return;
                    }
                    return;
                }
                AbstractC32895a.m71366a("onActivityStopped: chatState=" + this.this$0.getVideoChatController().f67342n.getValue());
                if (this.this$0.getVideoChatController().f67342n.getValue() instanceof C32924y) {
                    C32917q videoChatController = this.this$0.getVideoChatController();
                    AbstractC46162a abstractC46162a = c28578h.f58188z;
                    C29214F1 c29214f1 = C29239K1.Companion;
                    c29214f1.getClass();
                    C29239K1 c29239k1 = new C29239K1(new C29229I1(SNSMessage$ClientMessage$UserVisibilityState$Visibility.HIDDEN.getValue()));
                    abstractC46162a.getSerializersModule();
                    videoChatController.m71376a(abstractC46162a.mo99409b(c29214f1.serializer(), c29239k1));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }
    };

    /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService$onCreate$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService$onCreate$1", m90122f = "SNSVideoChatService.kt", m90123i = {}, m90124l = {95, 98}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C330381 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService$onCreate$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
        @DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService$onCreate$1$2", m90122f = "SNSVideoChatService.kt", m90123i = {}, m90124l = {99}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SNSVideoChatService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SNSVideoChatService sNSVideoChatService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = sNSVideoChatService;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41669n interfaceC41669n = this.this$0.getVideoChatController().f67342n;
                    final SNSVideoChatService sNSVideoChatService = this.this$0;
                    InterfaceC41635f interfaceC41635f = new InterfaceC41635f() { // from class: com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService.onCreate.1.2.1
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((SNSVideoChatState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(SNSVideoChatState sNSVideoChatState, Continuation<? super Unit> continuation) {
                            sNSVideoChatService.handleChatState(sNSVideoChatState);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (interfaceC41669n.collect(interfaceC41635f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        public C330381(Continuation<? super C330381> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SNSVideoChatService.this.new C330381(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C330381) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r7 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r7, r1, r4, r6) == r0) goto L24;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC29984m interfaceC29984m;
            C29983l c29983l;
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
            C28578h c28578h = SNSVideoChatService.this.serviceLocator;
            if (c28578h != null && (interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue()) != null) {
                this.label = 1;
                C29967J c29967j = (C29967J) interfaceC29984m;
                obj = c29967j.m70040a(c29967j.f60204l.f60236h.getValue(), new C29958A(c29967j, null), this);
            } else {
                Lifecycle lifecycle = SNSVideoChatService.this.getLifecycle();
                Lifecycle.State state = Lifecycle.State.CREATED;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SNSVideoChatService.this, null);
                this.label = 2;
            }
            return coroutine_suspended;
            AbstractC29971N abstractC29971N = (AbstractC29971N) obj;
            if (abstractC29971N != null && (c29983l = (C29983l) abstractC29971N.m70051c()) != null) {
                SNSVideoChatService.this.strings = c29983l;
            }
            Lifecycle lifecycle2 = SNSVideoChatService.this.getLifecycle();
            Lifecycle.State state2 = Lifecycle.State.CREATED;
            AnonymousClass2 anonymousClass3 = new AnonymousClass2(SNSVideoChatService.this, null);
            this.label = 2;
        }
    }

    private final void doStopForeground() {
        AbstractC32895a.m71366a("doStopForeground");
        ServiceCompat.stopForeground(this, 1);
        this.isInForeground = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void handleChatState(SNSVideoChatState state) {
        NotificationState notificationState;
        if (this.serviceLocator == null) {
            if (this.isInForeground) {
                C33272c c33272c = C33272c.f67812a;
                Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "can't get service locator instance", null, 4, null);
                return;
            }
            return;
        }
        if (state instanceof C32925z) {
            notificationState = NotificationState.WAITING;
        } else if (state instanceof C32924y) {
            notificationState = NotificationState.CALL;
        } else if ((state instanceof C32923x) && this.isInForeground) {
            doStopForeground();
            notificationState = NotificationState.NONE;
        } else {
            notificationState = null;
        }
        if (notificationState == null || this.notificationState == notificationState) {
            return;
        }
        AbstractC32895a.m71366a("updating notification state=" + notificationState + ", isInForeground=" + this.isInForeground);
        if (!this.isInForeground || notificationState == NotificationState.NONE) {
            return;
        }
        this.notificationState = notificationState;
        NotificationManagerCompat.from(this).notify(11, createNotification(SNSVideoChatServiceKt.getMessage(notificationState, this.strings)));
    }

    private final void registerDismissReceiver() {
        if (this.dismissReceiver != null) {
            return;
        }
        this.dismissReceiver = new BroadcastReceiver() { // from class: com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService.registerDismissReceiver.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC32895a.m71366a((intent != null ? intent.getAction() : null) + " received. Finishing...");
                if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.sumsub.sns.intent.ACTION_CLOSE")) {
                    if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, SNSVideoChatService.ACTION_INTERNAL_CLOSE)) {
                        return;
                    }
                }
                SNSVideoChatService.this.stopCallAndService();
            }
        };
        try {
            Context applicationContext = getApplicationContext();
            BroadcastReceiver broadcastReceiver = this.dismissReceiver;
            IntentFilter intentFilter = new IntentFilter("com.sumsub.sns.intent.ACTION_CLOSE");
            intentFilter.addAction(ACTION_INTERNAL_CLOSE);
            Unit unit = Unit.INSTANCE;
            ContextCompat.registerReceiver(applicationContext, broadcastReceiver, intentFilter, 4);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "Receiver registering error", th2);
        }
    }

    private final void unRegisterDismissReceiver() {
        try {
            BroadcastReceiver broadcastReceiver = this.dismissReceiver;
            if (broadcastReceiver != null) {
                getApplicationContext().unregisterReceiver(broadcastReceiver);
                this.dismissReceiver = null;
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d(SNSVideoIdent.logTag, "Receiver unregistering error", th2);
        }
    }

    @NotNull
    public final C32917q getVideoChatController() {
        return this.videoChatController;
    }

    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public final boolean getIsInForeground() {
        return this.isInForeground;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        RemoteVideoTrack remoteVideoTrack;
        AbstractC32895a.m71366a("service destroyed, isInForeground=" + this.isInForeground);
        unRegisterDismissReceiver();
        Context applicationContext = getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
        C32917q c32917q = this.videoChatController;
        c32917q.f67329a = null;
        C41713n0.m91129e(c32917q.f67334f, null, 1, null);
        c32917q.m71371a();
        AbstractC32895a.m71366a("releaseLocalTracks");
        LocalVideoTrack localVideoTrack = c32917q.f67338j;
        if (localVideoTrack != null) {
            localVideoTrack.getVideoSource().setVideoProcessor((VideoProcessor) null);
            localVideoTrack.release();
            c32917q.f67338j = null;
        }
        LocalAudioTrack localAudioTrack = c32917q.f67337i;
        if (localAudioTrack != null) {
            localAudioTrack.release();
            c32917q.f67337i = null;
        }
        LocalDataTrack localDataTrack = c32917q.f67336h;
        if (localDataTrack != null) {
            localDataTrack.release();
            c32917q.f67336h = null;
        }
        C32921u c32921u = c32917q.f67335g;
        VideoTextureView videoTextureView = c32921u.f67357e;
        if (videoTextureView != null && (remoteVideoTrack = c32921u.f67356d) != null) {
            remoteVideoTrack.removeSink(videoTextureView);
        }
        c32921u.f67356d = null;
        c32921u.f67357e = null;
        C41713n0.m91129e(c32921u.f67353a, null, 1, null);
        c32921u.f67354b.getLooper().quit();
        c32917q.f67332d = false;
        InterfaceC41775x1 interfaceC41775x1 = c32917q.f67330b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            c32917q.f67330b = null;
        }
        c32917q.f67329a = null;
        this.isInForeground = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onTaskRemoved(@Nullable Intent rootIntent) {
        AbstractC32895a.m71366a("service task removed: " + rootIntent);
        stopCallAndService();
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        AbstractC32895a.m71366a("service unBind, isInForeground=" + this.isInForeground);
        this.binder = null;
        return super.onUnbind(intent);
    }

    private final Notification createNotification(String message) {
        Class<SNSAppActivity> cls;
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this);
        if (notificationManagerCompatFrom.getNotificationChannel(NOTIFICATION_CHANNEL_ID) == null) {
            notificationManagerCompatFrom.createNotificationChannel(new NotificationChannelCompat.Builder(NOTIFICATION_CHANNEL_ID, 4).setName(this.notificationChannelName).build());
        }
        try {
            cls = SNSAppActivity.class;
            int i11 = SNSAppActivity.f63146j;
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(SNSVideoIdent.logTag, "activity class missing", e11);
            cls = null;
        }
        Notification.Builder onlyAlertOnce = new Notification.Builder(this).setOngoing(true).setContentTitle(message).setOnlyAlertOnce(false);
        if (Build.VERSION.SDK_INT >= 31) {
            onlyAlertOnce.setForegroundServiceBehavior(1);
        }
        Notification.Builder smallIcon = onlyAlertOnce.setSmallIcon(R$drawable.sns_ic_videoident_intro_face);
        if (cls != null) {
            Intent intent = new Intent(this, cls);
            intent.putExtra("notification", true);
            intent.setFlags(603979776);
            smallIcon.setContentIntent(PendingIntent.getActivity(this, 1, intent, 201326592));
        }
        smallIcon.setCategory(NotificationCompat.CATEGORY_SERVICE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, smallIcon.build());
        builder.setChannelId(NOTIFICATION_CHANNEL_ID);
        builder.setPriority(2);
        builder.setSilent(false);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCallAndService() {
        AbstractC32895a.m71366a("stopCallAndService");
        this.videoChatController.m71371a();
        doStopForeground();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        super.onBind(intent);
        AbstractC32895a.m71366a("service bind, isInForeground=" + this.isInForeground);
        SNSServiceBinder sNSServiceBinder = new SNSServiceBinder(this);
        this.binder = sNSServiceBinder;
        return sNSServiceBinder;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    @SuppressLint({"NewApi"})
    public void onCreate() {
        super.onCreate();
        AbstractC32895a.m71366a("service created");
        registerDismissReceiver();
        Context applicationContext = getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C330381(null));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        String action;
        SNSSession sNSSession;
        String string;
        C28578h c28578h;
        super.onStartCommand(intent, flags, startId);
        AbstractC32895a.m71366a("service onStartCommand: " + intent);
        C28578h c28578h2 = null;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.areEqual(ACTION_START_FOREGROUND, action)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                sNSSession = (SNSSession) AbstractC28437b.m69320a(extras, SNS_EXTRA_SESSION, SNSSession.class, null);
            } else {
                sNSSession = null;
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                string = extras2.getString(SNS_EXTRA_TOKEN);
            } else {
                string = null;
            }
            if (sNSSession != null) {
                Context applicationContext = getApplicationContext().getApplicationContext();
                AbstractC28413P0.m69296a(applicationContext, sNSSession);
                C28578h c28578h3 = C28578h.f58143T;
                if (c28578h3 != null) {
                    if (Intrinsics.areEqual(c28578h3.f58164b, sNSSession.getSessionId())) {
                        c28578h2 = c28578h3;
                    }
                    if (c28578h2 == null) {
                        c28578h2 = new C28578h(applicationContext, sNSSession.getSessionId(), sNSSession.getUrl(), string);
                        c28578h = C28578h.f58143T;
                        if (c28578h != null) {
                            c28578h.m69470a();
                        }
                        C28578h.f58143T = c28578h2;
                    }
                } else {
                    c28578h2 = new C28578h(applicationContext, sNSSession.getSessionId(), sNSSession.getUrl(), string);
                    c28578h = C28578h.f58143T;
                    if (c28578h != null) {
                        c28578h.m69470a();
                    }
                    C28578h.f58143T = c28578h2;
                }
                this.serviceLocator = c28578h2;
            }
            String strM70061a = this.strings.m70061a("sns_videoident_state_followIntructions_title");
            if (strM70061a == null) {
                strM70061a = "Video Identification";
            }
            this.notificationChannelName = strM70061a;
            NotificationState notificationState = NotificationState.WAITING;
            Notification notificationCreateNotification = createNotification(SNSVideoChatServiceKt.getMessage(notificationState, this.strings));
            if (Build.VERSION.SDK_INT >= 30) {
                startForeground(11, notificationCreateNotification, 128);
            } else {
                startForeground(11, notificationCreateNotification);
            }
            this.notificationState = notificationState;
            this.isInForeground = true;
            return 2;
        }
        return 2;
    }
}
