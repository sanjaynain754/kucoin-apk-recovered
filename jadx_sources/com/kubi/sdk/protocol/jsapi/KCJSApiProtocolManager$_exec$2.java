package com.kubi.sdk.protocol.jsapi;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KCJSApiProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager", m90122f = "KCJSApiProtocolManager.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, m90124l = {1694, 2485, 3744, 3991, 4022, 4053}, m90125m = "_exec", m90126n = {"ctx", "obj", "source", FirebaseAnalytics.Param.METHOD, TUIConstants.TUIChat.CALL_BACK, "serviceImp", "ctx", "obj", "source", FirebaseAnalytics.Param.METHOD, TUIConstants.TUIChat.CALL_BACK, "serviceImp", "ctx", "obj", "source", FirebaseAnalytics.Param.METHOD, TUIConstants.TUIChat.CALL_BACK, "arguments", "serviceImp", "category", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "ctx", "obj", "source", FirebaseAnalytics.Param.METHOD, TUIConstants.TUIChat.CALL_BACK, "serviceImp", "ctx", "obj", "source", FirebaseAnalytics.Param.METHOD, TUIConstants.TUIChat.CALL_BACK, "serviceImp", "ctx", "obj", "source", FirebaseAnalytics.Param.METHOD, TUIConstants.TUIChat.CALL_BACK, "serviceImp"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class KCJSApiProtocolManager$_exec$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KCJSApiProtocolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCJSApiProtocolManager$_exec$2(KCJSApiProtocolManager kCJSApiProtocolManager, Continuation<? super KCJSApiProtocolManager$_exec$2> continuation) {
        super(continuation);
        this.this$0 = kCJSApiProtocolManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57893a(null, null, null, null, null, null, null, this);
    }
}
