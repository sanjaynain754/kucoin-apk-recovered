package com.kubi.homern.krn;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.core.turbo.NativeHomeTurboModuleAbs;
import com.kubi.sdk.util.StartupTrace;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboHomeModuleImpl.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/homern/krn/KCTurboHomeModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "setHomeBottomTabScrollToTopState", "", "enabled", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "recordStartupTrace", "eventName", "", "properties", "Lcom/facebook/react/bridge/ReadableMap;", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "setHomeFeedRouteReadyState", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeHomeTurboModuleAbs.class})
public final class KCTurboHomeModuleImpl extends NativeHomeTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboHomeModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleAbs
    @NotNull
    public Boolean recordStartupTrace(@NotNull String eventName, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        StartupTrace startupTrace = StartupTrace.f48194a;
        startupTrace.m58456p(properties);
        startupTrace.m58450j("$event_duration");
        startupTrace.m58457q();
        return Boolean.TRUE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleAbs
    public void setHomeBottomTabScrollToTopState(boolean enabled, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_on_top", Boolean.valueOf(enabled), 0L, 4, null);
        callback.invoke(Boolean.TRUE);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleAbs
    public void setHomeFeedRouteReadyState(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.home.rn.HomeRNEvent:on_home_rn_load_ready", null, 0L, 6, null);
        callback.invoke(Boolean.TRUE);
    }
}
