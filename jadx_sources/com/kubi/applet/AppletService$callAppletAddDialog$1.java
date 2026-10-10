package com.kubi.applet;

import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.kubi.sdk.applet.KCBaseProtocol;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AppletService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.applet.AppletService$callAppletAddDialog$1", m90122f = "AppletService.kt", m90123i = {0, 1}, m90124l = {112, 113}, m90125m = "invokeSuspend", m90126n = {"url", "url"}, m90127s = {"L$0", "L$0"})
public final class AppletService$callAppletAddDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $shortcutId;
    Object L$0;
    int label;
    final /* synthetic */ AppletService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppletService$callAppletAddDialog$1(AppletService appletService, FragmentActivity fragmentActivity, String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super AppletService$callAppletAddDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = appletService;
        this.$activity = fragmentActivity;
        this.$shortcutId = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppletService$callAppletAddDialog$1(this.this$0, this.$activity, this.$shortcutId, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppletService$callAppletAddDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (com.kubi.applet.AppletService.m15047J(r5, r6, r7, false, null, r10, 8, null) == r0) goto L28;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strUrl;
        AppletService$callAppletAddDialog$1 appletService$callAppletAddDialog$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    appletService$callAppletAddDialog$1 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                strUrl = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            appletService$callAppletAddDialog$1.$callback.invoke(Boxing.boxBoolean(true), null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.m15074q() && !AppMode.INSTANCE.isLiteMode()) {
            KeyEventDispatcher.Component component = this.$activity;
            if (component instanceof KCMiniAppBaseProtocol) {
                strUrl = ((KCBaseProtocol) component).url();
                if (((KCMiniAppBaseProtocol) this.$activity).supportAddHome() && strUrl.length() > 0) {
                    AppletService appletService = this.this$0;
                    String str = this.$shortcutId;
                    this.L$0 = strUrl;
                    this.label = 1;
                    obj = appletService.m15059A(strUrl, str, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
        }
        this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("showAddHomePageDialog failed,check activity!", null, null, false, 14, null));
        return Unit.INSTANCE;
        String str2 = strUrl;
        if (((Boolean) obj).booleanValue()) {
            AppletService appletService2 = this.this$0;
            FragmentActivity fragmentActivity = this.$activity;
            this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
            this.label = 2;
            appletService$callAppletAddDialog$1 = this;
        } else {
            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("over popup frequency！", null, null, false, 14, null));
            return Unit.INSTANCE;
        }
    }
}
