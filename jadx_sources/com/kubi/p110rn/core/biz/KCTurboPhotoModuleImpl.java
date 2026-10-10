package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativePhotoTurboModuleAbs;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.command.impl.TakePictureCommand;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36583r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboPhotoModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016JA\u0010\u0011\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboPhotoModuleImpl;", "Lcom/kubi/rn/core/turbo/NativePhotoTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPhotoModule;", "takePicture", "", BridgeParamKeyKt.CAPTURE, "", BridgeParamKeyKt.MAX_COUNT, "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "appAlbumSelect", "mediaType", "", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativePhotoTurboModuleAbs.class})
public final class KCTurboPhotoModuleImpl extends NativePhotoTurboModuleAbs {

    @NotNull
    private final ReactApplicationContext ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboPhotoModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
    }

    private final InterfaceC36583r bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36583r) Router.f46192a.m56192n(InterfaceC36583r.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36583r) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativePhotoTurboModuleAbs
    public void appAlbumSelect(@Nullable Double maxCount, @Nullable String mediaType, @Nullable Boolean capture, @NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = (BaseActivity) getCurrentActivity();
        if (baseActivity == null) {
            callback.invoke(null);
        } else {
            new TakePictureCommand(null, baseActivity, this.ctx, Intrinsics.areEqual(capture, Boolean.TRUE), maxCount != null ? (int) maxCount.doubleValue() : 5, mediaType, callback).execute();
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativePhotoTurboModuleAbs
    public void takePicture(boolean capture, double maxCount, @NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = (BaseActivity) getCurrentActivity();
        if (baseActivity == null) {
            callback.invoke(null);
        } else {
            new TakePictureCommand(null, baseActivity, this.ctx, capture, (int) maxCount, null, callback, 32, null).execute();
        }
    }
}
