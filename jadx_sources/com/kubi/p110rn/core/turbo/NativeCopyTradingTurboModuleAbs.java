package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u00020!\"\b\b\u0000\u0010\"*\u00020#2\b\u0010$\u001a\u0004\u0018\u0001H\"¢\u0006\u0002\u0010%¨\u0006'"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "shareOptionPosition", "", "optionShareInfo", "Lcom/facebook/react/bridge/ReadableMap;", "footerInfo", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "shareCopyTradingPosition", "copyTradingData", "shareLeadTraderTotalPnl", "leadTraderTotalPnlData", "shareCopyTraderTotalPnl", "copyTraderTotalPnlData", "shareCopyTraderFollowOneTraderPnl", "copyTraderFollowOneTraderPnlData", "shareLeadUserInfo", "leadTradingUserInfo", "requestFutureMarketClosePosition", "subUid", "positionJson", "requestFuturePositionTpSl", "requestRefreshCopyTradingAccountInfo", "()Ljava/lang/Boolean;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeCopyTradingTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "CopyTrading";

    @Nullable
    public Boolean requestRefreshCopyTradingAccountInfo() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCopyTradingTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "CopyTrading";
    }

    public void requestFutureMarketClosePosition(@NotNull String subUid, @NotNull String positionJson, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void requestFuturePositionTpSl(@NotNull String subUid, @NotNull String positionJson, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareCopyTraderFollowOneTraderPnl(@NotNull ReadableMap copyTraderFollowOneTraderPnlData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(copyTraderFollowOneTraderPnlData, "copyTraderFollowOneTraderPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareCopyTraderTotalPnl(@NotNull ReadableMap copyTraderTotalPnlData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(copyTraderTotalPnlData, "copyTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareCopyTradingPosition(@NotNull ReadableMap copyTradingData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(copyTradingData, "copyTradingData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareLeadTraderTotalPnl(@NotNull ReadableMap leadTraderTotalPnlData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(leadTraderTotalPnlData, "leadTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareLeadUserInfo(@NotNull ReadableMap leadTradingUserInfo, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(leadTradingUserInfo, "leadTradingUserInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareOptionPosition(@NotNull ReadableMap optionShareInfo, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(optionShareInfo, "optionShareInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
