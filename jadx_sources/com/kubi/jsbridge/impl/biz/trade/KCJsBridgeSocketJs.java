package com.kubi.jsbridge.impl.biz.trade;

import android.content.Context;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsHybridSocketHttpTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPlainSocketTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPollingSocketTaskParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36561a0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.biz.trade.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCJsBridgeSocketJs.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JT\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00142(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JT\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00162(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JL\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J[\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/trade/KCJsBridgeSocketJs;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsModule;", "<init>", "()V", "createHybridSocketHttpTask", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "task", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsHybridSocketHttpTaskParams;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "createPlainSocketTask", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPlainSocketTaskParams;", "createPollingSocketTask", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPollingSocketTaskParams;", "pauseTask", "startTask", "pollImmediate", "", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJsBridgeSocketJs implements InterfaceC36561a0 {
    @Override // d00.InterfaceC36561a0
    /* JADX INFO: renamed from: a */
    public void mo31602a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, new ProtocolException("暂停任务暂时不支持", null, null, false, 14, null));
    }

    @Override // d00.InterfaceC36561a0
    /* JADX INFO: renamed from: b */
    public void mo31603b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Boolean bool, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, new ProtocolException("开始任务暂时不支持", null, null, false, 14, null));
    }

    @Override // d00.InterfaceC36561a0
    /* JADX INFO: renamed from: c */
    public void mo31604c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiSocketJsPlainSocketTaskParams task, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, new ProtocolException("普通socket的任务暂时不支持", null, null, false, 14, null));
    }

    @Override // d00.InterfaceC36561a0
    /* JADX INFO: renamed from: d */
    public void mo31605d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiSocketJsPollingSocketTaskParams task, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, new ProtocolException("轮询socket的任务暂时不支持", null, null, false, 14, null));
    }

    @Override // d00.InterfaceC36561a0
    /* JADX INFO: renamed from: e */
    public void mo31606e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiSocketJsHybridSocketHttpTaskParams task, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, new ProtocolException("混合socket和http的任务暂时不支持", null, null, false, 14, null));
    }
}
