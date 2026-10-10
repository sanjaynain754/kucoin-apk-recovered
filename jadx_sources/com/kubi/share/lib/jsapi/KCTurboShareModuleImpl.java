package com.kubi.share.lib.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeShareTurboModuleAbs;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import com.kubi.sdk.util.C24267r0;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36590y;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboShareModuleImpl.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J\u008f\u0001\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J?\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010!\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\u000bH\u0002¨\u0006%"}, m90084d2 = {"Lcom/kubi/share/lib/jsapi/KCTurboShareModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeShareTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareModule;", "shareWithOptions", "", "options", "Lcom/facebook/react/bridge/ReadableMap;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", FirebaseAnalytics.Event.SHARE, "category", "", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/jvm/functions/Function1;)V", "saveShareImage", "imgData", "showShareView", SignTermItem.LINK, "isCopyText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "entityConvert", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeShareTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboShareModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboShareModuleImpl.kt\ncom/kubi/share/lib/jsapi/KCTurboShareModuleImpl\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n19#2,2:141\n1#3:143\n*S KotlinDebug\n*F\n+ 1 KCTurboShareModuleImpl.kt\ncom/kubi/share/lib/jsapi/KCTurboShareModuleImpl\n*L\n110#1:141,2\n*E\n"})
public final class KCTurboShareModuleImpl extends NativeShareTurboModuleAbs {
    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleAbs
    public void share(@NotNull String category, @Nullable String utmSource, @Nullable String rcode, @Nullable String pic, @Nullable String qrCodeUrl, @Nullable Boolean needQrCode, @Nullable Boolean onlyDarkMode, @Nullable String title, @Nullable String content, @Nullable String linkUrl, @Nullable ReadableMap data, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36590y interfaceC36590yBridge = bridge();
        if (interfaceC36590yBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        String str = utmSource == null ? "" : utmSource;
        String str2 = rcode == null ? "" : rcode;
        Boolean bool = Boolean.TRUE;
        interfaceC36590yBridge.mo59670c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, category, str, str2, Intrinsics.areEqual(needQrCode, bool), Intrinsics.areEqual(onlyDarkMode, bool), pic == null ? "" : pic, qrCodeUrl == null ? "" : qrCodeUrl, title == null ? "" : title, content == null ? "" : content, linkUrl == null ? "" : linkUrl, data != null ? entityConvert(data) : null, new Function2() { // from class: com.kubi.share.lib.jsapi.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboShareModuleImpl.share$lambda$4(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboShareModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36590y bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36590y) Router.f46192a.m56192n(InterfaceC36590y.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36590y) objM103844constructorimpl;
    }

    private final KCJSApiShareGalleryDataEntity entityConvert(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        boolean z11 = readableMap.getBoolean(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
        String string = readableMap.getString("galleryType");
        if (string == null) {
            string = "";
        }
        String string2 = readableMap.getString("galleryLink");
        return new KCJSApiShareGalleryDataEntity(z11, string, string2 != null ? string2 : "", Long.valueOf(readableMap.getLong("galleryIndex")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static final void showShareView$lambda$12(KCTurboShareModuleImpl kCTurboShareModuleImpl, String str, String str2, final Function1 function1) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IShareService iShareService = IShareService.f49268a.get();
            TextShareParam textShareParam = new TextShareParam("envInfo", null, null, null, 14, null);
            textShareParam.setContent(str);
            if (str2 == null) {
                str2 = null;
            } else {
                if (!(str2.length() > 0 && !Intrinsics.areEqual(str2, str))) {
                    str2 = null;
                }
            }
            textShareParam.setLinkUrl(str2);
            iShareService.mo40f(textShareParam, new Function1() { // from class: com.kubi.share.lib.jsapi.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCTurboShareModuleImpl.showShareView$lambda$12$lambda$10$lambda$9(function1, ((Boolean) obj).booleanValue());
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleAbs
    public void saveShareImage(@NotNull String imgData, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(imgData, "imgData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36590y interfaceC36590yBridge = bridge();
        if (interfaceC36590yBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36590yBridge.mo59668a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, imgData, new Function2() { // from class: com.kubi.share.lib.jsapi.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboShareModuleImpl.saveShareImage$lambda$6(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleAbs
    public void shareWithOptions(@NotNull ReadableMap options, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36590y interfaceC36590yBridge = bridge();
        if (interfaceC36590yBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36590yBridge.mo59669b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, C24267r0.m58526j(options), new Function2() { // from class: com.kubi.share.lib.jsapi.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboShareModuleImpl.shareWithOptions$lambda$2(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleAbs
    public void showShareView(@NotNull final String content, @Nullable final String link, @Nullable Boolean isCopyText, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.share.lib.jsapi.d
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboShareModuleImpl.showShareView$lambda$12(this.f49373b, content, link, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveShareImage$lambda$6(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit share$lambda$4(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareWithOptions$lambda$2(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showShareView$lambda$12$lambda$10$lambda$9(Function1 function1, boolean z11) {
        function1.invoke(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }
}
