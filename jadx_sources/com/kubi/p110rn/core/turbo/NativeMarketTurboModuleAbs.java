package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeMarketTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00072\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00100\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016J\u001f\u0010\u001d\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\b\u0010!\u001a\u0004\u0018\u0001H\u001f¢\u0006\u0002\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getAlphaFavoriteList", "", "Lcom/kubi/rn/core/turbo/VisitorFavoriteEntity;", "isAlphaFavorite", "", "tokenChain", "(Ljava/lang/String;)Ljava/lang/Boolean;", "changeAlphaFavorite", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "getSpotFavoriteList", "isSpotFavorite", "symbol", "changeSpotFavorite", "getFutureFavoriteList", "isFutureFavorite", "changeFutureFavorite", "getFutureTag", "Lcom/facebook/react/bridge/ReadableMap;", "getUsStockExcludes", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeMarketTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Market";

    @Nullable
    public List<VisitorFavoriteEntity> getAlphaFavoriteList() {
        return null;
    }

    @Nullable
    public List<VisitorFavoriteEntity> getFutureFavoriteList() {
        return null;
    }

    @Nullable
    public List<VisitorFavoriteEntity> getSpotFavoriteList() {
        return null;
    }

    @Nullable
    public String getUsStockExcludes() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMarketTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public void changeAlphaFavorite(@NotNull String tokenChain, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean changeFutureFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    @Nullable
    public Boolean changeSpotFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    @Nullable
    public ReadableMap getFutureTag(@NotNull List<String> symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Market";
    }

    @Nullable
    public Boolean isAlphaFavorite(@NotNull String tokenChain) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        return null;
    }

    @Nullable
    public Boolean isFutureFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    @Nullable
    public Boolean isSpotFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
