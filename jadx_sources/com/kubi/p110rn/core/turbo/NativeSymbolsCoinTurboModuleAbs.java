package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J$\u0010\u000b\u001a\u00020\f2\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000eH\u0016J.\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u0007H\u0016J$\u0010\u0016\u001a\u00020\f2\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000eH\u0016J.\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\u0007H\u0016J$\u0010\u001b\u001a\u00020\f2\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000eH\u0016J.\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\u0007H\u0016J$\u0010 \u001a\u00020\f2\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000eH\u0016J.\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u001f\u0010#\u001a\u00020$\"\b\b\u0000\u0010%*\u00020&2\b\u0010'\u001a\u0004\u0018\u0001H%¢\u0006\u0002\u0010(¨\u0006*"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getSpotCoinInfo", "Lcom/kubi/rn/core/turbo/SpotCoinInfo;", "code", "getSpotCoinInfoBatch", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "getSpotCoinInfoBatchByPage", "pageIndex", "pageSize", "Lcom/kubi/rn/core/turbo/SpotCoinInfoPageResult;", "getSpotSymbol", "Lcom/kubi/rn/core/turbo/SpotSymbolInfo;", "getSpotSymbolBatch", "getSpotSymbolBatchByPage", "Lcom/kubi/rn/core/turbo/SpotSymbolPageResult;", "getFuturesCoinInfo", "Lcom/kubi/rn/core/turbo/FuturesCoinInfo;", "getFuturesCoinInfoBatch", "getFuturesCoinInfoBatchByPage", "Lcom/kubi/rn/core/turbo/FuturesCoinInfoPageResult;", "getFuturesSymbolInfo", "Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;", "getFuturesSymbolInfoBatch", "getFuturesSymbolInfoBatchByPage", "Lcom/kubi/rn/core/turbo/FuturesSymbolInfoPageResult;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeSymbolsCoinTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "SymbolsCoin";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSymbolsCoinTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public FuturesCoinInfo getFuturesCoinInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return null;
    }

    public void getFuturesCoinInfoBatch(@NotNull Function1<? super List<FuturesCoinInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getFuturesCoinInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super FuturesCoinInfoPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public FuturesSymbolInfo getFuturesSymbolInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return null;
    }

    public void getFuturesSymbolInfoBatch(@NotNull Function1<? super List<FuturesSymbolInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getFuturesSymbolInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super FuturesSymbolInfoPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SymbolsCoin";
    }

    @Nullable
    public SpotCoinInfo getSpotCoinInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return null;
    }

    public void getSpotCoinInfoBatch(@NotNull Function1<? super List<SpotCoinInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getSpotCoinInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super SpotCoinInfoPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public SpotSymbolInfo getSpotSymbol(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return null;
    }

    public void getSpotSymbolBatch(@NotNull Function1<? super List<SpotSymbolInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getSpotSymbolBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull Function1<? super SpotSymbolPageResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
