package com.kubi.sdk.push;

import cn.jiguang.privates.core.api.JCorePrivatesApi;
import com.blankj.utilcode.util.C5287o0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.push.api.PushBindService;
import com.kubi.sdk.push.entity.PushBindParam;
import com.kubi.sdk.push.exception.PushMessage;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import i00.C38392a;
import java.util.TimeZone;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: compiled from: PushManger.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002J\u000e\u0010)\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010*\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020%H\u0086@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100J\u000e\u00101\u001a\u00020%H\u0086@¢\u0006\u0002\u0010,J\u000e\u00102\u001a\u00020%H\u0082@¢\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u00063"}, m90084d2 = {"Lcom/kubi/sdk/push/PushManger;", "", "<init>", "()V", "TAG", "", "CATEGORY", "SP_PUSH_ID", "SP_PUSH_TOKEN", "SP_PUSH_CHANNEL_TYPE", "SP_UPDATE_TIME", "SP_CATEGORY", "JPUSH_PLATFORM", "TRACK_NAME", "MIN_UPDATE_TIME_SPAN", "", "pushId", InterfaceC33826o0.f71244p, "channelType", "lastUpdateTime", "", "minUpdateTimeSpan", "getMinUpdateTimeSpan", "()I", "setMinUpdateTimeSpan", "(I)V", "pushIdDeferred", "Lkotlinx/coroutines/CompletableDeferred;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "kotlin.jvm.PlatformType", "getTimeZone", "()Ljava/lang/String;", "timeZone$delegate", "Lkotlin/Lazy;", "pushScope", "Lkotlinx/coroutines/CoroutineScope;", "load", "", "setPushId", TUIConstants.TIMPush.METHOD_SET_PUSH_TOKEN, "type", "updatePushId", "updatePushToken", "bind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindAnonymous", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "readPushId", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPushManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushManger.kt\ncom/kubi/sdk/push/PushManger\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 PushIssue.kt\ncom/kubi/sdk/push/exception/PushIssueKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,174:1\n47#2,4:175\n51#3,2:179\n71#4,4:181\n71#4,4:185\n71#4,4:189\n71#4,4:193\n*S KotlinDebug\n*F\n+ 1 PushManger.kt\ncom/kubi/sdk/push/PushManger\n*L\n56#1:175,4\n75#1:179,2\n104#1:181,4\n122#1:185,4\n145#1:189,4\n156#1:193,4\n*E\n"})
public final class PushManger {

    /* JADX INFO: renamed from: e */
    public static long f47514e;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PushManger f47510a = new PushManger();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f47511b = "";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f47512c = "";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f47513d = "";

    /* JADX INFO: renamed from: f */
    public static int f47515f = 86400000;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final InterfaceC41769w<String> f47516g = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f47517h = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.push.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PushManger.m57918l();
        }
    });

    /* JADX INFO: renamed from: com.kubi.sdk.push.PushManger$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 PushManger.kt\ncom/kubi/sdk/push/PushManger\n+ 3 PushIssue.kt\ncom/kubi/sdk/push/exception/PushIssueKt\n*L\n1#1,49:1\n57#2:50\n58#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 PushManger.kt\ncom/kubi/sdk/push/PushManger\n*L\n57#1:51,4\n*E\n"})
    public static final class C24087a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C24087a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C38392a.m86573b(exception, "push", "scope Error");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (r11 == r1) goto L23;
     */
    @Nullable
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57919c(@NotNull Continuation<? super Unit> continuation) {
        PushManger$bind$1 pushManger$bind$1;
        if (continuation instanceof PushManger$bind$1) {
            pushManger$bind$1 = (PushManger$bind$1) continuation;
            int i11 = pushManger$bind$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pushManger$bind$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pushManger$bind$1 = new PushManger$bind$1(this, continuation);
            }
        } else {
            pushManger$bind$1 = new PushManger$bind$1(this, continuation);
        }
        Object objM57933c = pushManger$bind$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pushManger$bind$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57933c);
            if (f47511b.length() == 0) {
                pushManger$bind$1.label = 1;
                if (m57924h(pushManger$bind$1) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM57933c);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM57933c);
        }
        boolean zBooleanValue = ((Boolean) objM57933c).booleanValue();
        if (zBooleanValue) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f47514e = jCurrentTimeMillis;
            C46396e.m102356m("push", "push_update_time", jCurrentTimeMillis);
        }
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "bind");
        eventParametersBuilderAcquire.m42393d("category", f47513d);
        eventParametersBuilderAcquire.m42394e("success", zBooleanValue);
        TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire);
        return Unit.INSTANCE;
        C43840a.m96550d("PushManger", "bind pushId:" + f47511b);
        String str = f47511b;
        String str2 = f47512c;
        String str3 = f47513d;
        String strM57921e = m57921e();
        Intrinsics.checkNotNullExpressionValue(strM57921e, "<get-timeZone>(...)");
        PushBindParam pushBindParam = new PushBindParam("JPUSH_PRIVATE", str, str2, str3, strM57921e);
        PushBindService pushBindService = PushBindService.f47596a;
        pushManger$bind$1.L$0 = SpillingKt.nullOutSpilledVariable(pushBindParam);
        pushManger$bind$1.label = 2;
        objM57933c = pushBindService.m57933c(pushBindParam, pushManger$bind$1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (m57924h(r0) == r1) goto L30;
     */
    @Nullable
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57920d(boolean z11, @NotNull Continuation<? super Unit> continuation) {
        PushManger$bindAnonymous$1 pushManger$bindAnonymous$1;
        long j11;
        long j12;
        boolean zBooleanValue;
        if (continuation instanceof PushManger$bindAnonymous$1) {
            pushManger$bindAnonymous$1 = (PushManger$bindAnonymous$1) continuation;
            int i11 = pushManger$bindAnonymous$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pushManger$bindAnonymous$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pushManger$bindAnonymous$1 = new PushManger$bindAnonymous$1(this, continuation);
            }
        } else {
            pushManger$bindAnonymous$1 = new PushManger$bindAnonymous$1(this, continuation);
        }
        Object objM57934d = pushManger$bindAnonymous$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pushManger$bindAnonymous$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                j11 = pushManger$bindAnonymous$1.J$0;
                z11 = pushManger$bindAnonymous$1.Z$0;
                ResultKt.throwOnFailure(objM57934d);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = pushManger$bindAnonymous$1.J$0;
                ResultKt.throwOnFailure(objM57934d);
            }
            zBooleanValue = ((Boolean) objM57934d).booleanValue();
            if (zBooleanValue) {
                f47514e = j12;
                C46396e.m102356m("push", "push_update_time", j12);
            }
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("type", "bindAnonymous");
            eventParametersBuilderAcquire.m42393d("category", f47513d);
            eventParametersBuilderAcquire.m42394e("success", zBooleanValue);
            TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM57934d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z11 && jCurrentTimeMillis - f47514e < f47515f) {
            C43840a.m96551e("bindAnonymous cancel ts:" + (((jCurrentTimeMillis - f47514e) / ((long) 60)) / ((long) 1000)) + 'm', null, 2, null);
            return Unit.INSTANCE;
        }
        if (f47511b.length() == 0) {
            pushManger$bindAnonymous$1.Z$0 = z11;
            pushManger$bindAnonymous$1.J$0 = jCurrentTimeMillis;
            pushManger$bindAnonymous$1.label = 1;
        }
        j11 = jCurrentTimeMillis;
        C43840a.m96550d("PushManger", "bind pushId:" + f47511b);
        String str = f47511b;
        String str2 = f47512c;
        String str3 = f47513d;
        String strM57921e = m57921e();
        Intrinsics.checkNotNullExpressionValue(strM57921e, "<get-timeZone>(...)");
        PushBindParam pushBindParam = new PushBindParam("JPUSH_PRIVATE", str, str2, str3, strM57921e);
        PushBindService pushBindService = PushBindService.f47596a;
        pushManger$bindAnonymous$1.L$0 = SpillingKt.nullOutSpilledVariable(pushBindParam);
        pushManger$bindAnonymous$1.Z$0 = z11;
        pushManger$bindAnonymous$1.J$0 = j11;
        pushManger$bindAnonymous$1.label = 2;
        objM57934d = pushBindService.m57934d(pushBindParam, pushManger$bindAnonymous$1);
        if (objM57934d != coroutine_suspended) {
            j12 = j11;
            zBooleanValue = ((Boolean) objM57934d).booleanValue();
            if (zBooleanValue) {
                f47514e = j12;
                C46396e.m102356m("push", "push_update_time", j12);
            }
            TechnologyEvent technologyEvent2 = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire2.m42393d("type", "bindAnonymous");
            eventParametersBuilderAcquire2.m42393d("category", f47513d);
            eventParametersBuilderAcquire2.m42394e("success", zBooleanValue);
            TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire2);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: e */
    public final String m57921e() {
        return (String) f47517h.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m57922f() {
        f47511b = C46396e.m102351h("push", "push_data_push_id", "");
        f47512c = C46396e.m102351h("push", "push_data_push_token", "");
        f47513d = C46396e.m102351h("push", "push_data_channel_type", "");
        f47514e = C46396e.m102349f("push", "push_update_time", 0L);
        if (f47511b.length() > 0) {
            f47516g.mo91370n(f47511b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41709m0 m57923g() {
        return C41713n0.m91125a(new CoroutineName("bingPush").plus(C42911a.m94120b()).plus(new C24087a(CoroutineExceptionHandler.INSTANCE)));
    }

    /* JADX INFO: renamed from: i */
    public final void m57925i(int i11) {
        f47515f = i11;
    }

    /* JADX INFO: renamed from: j */
    public final void m57926j(String str) {
        if (f47511b.length() > 0 && !Intrinsics.areEqual(f47511b, str)) {
            C43846g.m96568c(new PushMessage("update new pushId", "PushManger", false, 4, null), null, 2, null);
        }
        f47511b = str;
        f47516g.mo91370n(str);
        C46396e.m102358o("push", "push_data_push_id", str);
    }

    /* JADX INFO: renamed from: k */
    public final void m57927k(String str, String str2) {
        f47512c = str;
        f47513d = str2;
        C46396e.m102358o("push", "push_data_push_token", str);
        C46396e.m102358o("push", "push_data_channel_type", str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m57928m(@NotNull Continuation<? super Unit> continuation) {
        PushManger$unbind$1 pushManger$unbind$1;
        if (continuation instanceof PushManger$unbind$1) {
            pushManger$unbind$1 = (PushManger$unbind$1) continuation;
            int i11 = pushManger$unbind$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pushManger$unbind$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pushManger$unbind$1 = new PushManger$unbind$1(this, continuation);
            }
        } else {
            pushManger$unbind$1 = new PushManger$unbind$1(this, continuation);
        }
        Object objM57935e = pushManger$unbind$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pushManger$unbind$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57935e);
            C43840a.m96550d("unbind: pushId:" + f47511b, "push");
            String str = f47511b;
            String str2 = f47512c;
            String str3 = f47513d;
            String strM57921e = m57921e();
            Intrinsics.checkNotNullExpressionValue(strM57921e, "<get-timeZone>(...)");
            PushBindParam pushBindParam = new PushBindParam("JPUSH_PRIVATE", str, str2, str3, strM57921e);
            PushBindService pushBindService = PushBindService.f47596a;
            pushManger$unbind$1.L$0 = SpillingKt.nullOutSpilledVariable(pushBindParam);
            pushManger$unbind$1.label = 1;
            objM57935e = pushBindService.m57935e(pushBindParam, pushManger$unbind$1);
            if (objM57935e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM57935e);
        }
        boolean zBooleanValue = ((Boolean) objM57935e).booleanValue();
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "unbind");
        eventParametersBuilderAcquire.m42393d("category", f47513d);
        eventParametersBuilderAcquire.m42394e("success", zBooleanValue);
        TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m57929n(@NotNull String pushId) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (pushId.length() == 0) {
            C43840a.m96552g("updatePushId is empty", "push");
        } else {
            m57926j(pushId);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m57930o(@NotNull String token, @NotNull String type) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(type, "type");
        if (token.length() == 0) {
            C43840a.m96552g("updatePushToken is empty", "push");
            return;
        }
        m57927k(token, type);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", InterfaceC33826o0.f71244p);
        eventParametersBuilderAcquire.m42393d("category", type);
        TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: l */
    public static final String m57918l() {
        return TimeZone.getDefault().getID();
    }

    /* JADX INFO: renamed from: h */
    public final Object m57924h(Continuation<? super Unit> continuation) {
        String registrationId = JCorePrivatesApi.getRegistrationId(C5287o0.m6331a());
        if (registrationId != null && registrationId.length() != 0) {
            m57926j(registrationId);
            return Unit.INSTANCE;
        }
        C43840a.m96552g("updatePushId: pushId:" + registrationId, "push");
        Object objMo91198h = f47516g.mo91198h(continuation);
        if (objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objMo91198h;
        }
        return Unit.INSTANCE;
    }
}
