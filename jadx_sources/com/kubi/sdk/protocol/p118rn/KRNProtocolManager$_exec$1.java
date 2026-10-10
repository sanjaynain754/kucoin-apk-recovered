package com.kubi.sdk.protocol.p118rn;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KRNProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.protocol.rn.KRNProtocolManager", m90122f = "KRNProtocolManager.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12}, m90124l = {619, 635, 671, 687, 723, 739, 775, 791, 827, 843, 879, 895, 1516}, m90125m = "_exec", m90126n = {"ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "optionShareInfo", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "copyTradingData", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "leadTraderTotalPnlData", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "copyTraderTotalPnlData", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "copyTraderFollowOneTraderPnlData", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "leadTradingUserInfo", "ctx", TUIConstants.TUIChat.CALL_BACK, FirebaseAnalytics.Param.METHOD, "arguments", "category", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13"})
public final class KRNProtocolManager$_exec$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
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
    final /* synthetic */ KRNProtocolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRNProtocolManager$_exec$1(KRNProtocolManager kRNProtocolManager, Continuation<? super KRNProtocolManager$_exec$1> continuation) {
        super(continuation);
        this.this$0 = kRNProtocolManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57901a(null, null, null, this);
    }
}
