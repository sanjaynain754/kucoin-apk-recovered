package com.kubi.sdk.site.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeSiteTurboModuleAbs;
import com.kubi.p110rn.core.turbo.SupportSiteItem;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSiteSupportSiteItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36591z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboSiteModuleImpl.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J&\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0010\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016J&\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/site/jsapi/KCTurboSiteModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeSiteTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSiteModule;", "startChangeSite", "", "siteType", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "isSiteTypeSupport", "getSupportSiteList", "", "Lcom/kubi/rn/core/turbo/SupportSiteItem;", "startChangeSiteDirectly", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeSiteTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboSiteModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboSiteModuleImpl.kt\ncom/kubi/sdk/site/jsapi/KCTurboSiteModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1563#2:88\n1634#2,3:89\n*S KotlinDebug\n*F\n+ 1 KCTurboSiteModuleImpl.kt\ncom/kubi/sdk/site/jsapi/KCTurboSiteModuleImpl\n*L\n66#1:88\n66#1:89,3\n*E\n"})
public final class KCTurboSiteModuleImpl extends NativeSiteTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboSiteModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36591z bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36591z) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [T] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList, java.util.Collection] */
    public static final Unit getSupportSiteList$lambda$6(Ref.ObjectRef objectRef, List list, ProtocolException protocolException) {
        ?? EmptyList;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KCJSApiSiteSupportSiteItem kCJSApiSiteSupportSiteItem = (KCJSApiSiteSupportSiteItem) it.next();
                EmptyList.add(new SupportSiteItem(kCJSApiSiteSupportSiteItem.getSiteType(), kCJSApiSiteSupportSiteItem.getSiteName()));
            }
        } else {
            EmptyList = 0;
        }
        if (EmptyList == 0) {
            EmptyList = CollectionsKt.emptyList();
        }
        objectRef.element = EmptyList;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isSiteTypeSupport$lambda$4(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startChangeSite$lambda$2(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startChangeSiteDirectly$lambda$8(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.List] */
    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleAbs
    @Nullable
    public List<SupportSiteItem> getSupportSiteList() {
        InterfaceC36591z interfaceC36591zBridge = bridge();
        if (interfaceC36591zBridge == null) {
            return CollectionsKt.emptyList();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36591zBridge.mo58123g(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.sdk.site.jsapi.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSiteModuleImpl.getSupportSiteList$lambda$6(objectRef, (List) obj, (ProtocolException) obj2);
            }
        });
        return (List) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleAbs
    public void isSiteTypeSupport(@NotNull String siteType, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36591z interfaceC36591zBridge = bridge();
        if (interfaceC36591zBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36591zBridge.mo58118b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, siteType, new Function2() { // from class: com.kubi.sdk.site.jsapi.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSiteModuleImpl.isSiteTypeSupport$lambda$4(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleAbs
    public void startChangeSite(@NotNull String siteType, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36591z interfaceC36591zBridge = bridge();
        if (interfaceC36591zBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36591zBridge.mo58121e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, siteType, new Function2() { // from class: com.kubi.sdk.site.jsapi.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSiteModuleImpl.startChangeSite$lambda$2(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleAbs
    public void startChangeSiteDirectly(@NotNull String siteType, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36591z interfaceC36591zBridge = bridge();
        if (interfaceC36591zBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36591zBridge.mo58119c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, siteType, new Function2() { // from class: com.kubi.sdk.site.jsapi.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSiteModuleImpl.startChangeSiteDirectly$lambda$8(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }
}
