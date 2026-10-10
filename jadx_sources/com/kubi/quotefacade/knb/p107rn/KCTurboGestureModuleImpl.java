package com.kubi.quotefacade.knb.p107rn;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.core.turbo.NativeGestureTurboModuleAbs;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboGestureModuleImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/rn/KCTurboGestureModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeGestureTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "syncGestureRecognizerToNative", "", "state", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeGestureTurboModuleAbs.class})
public final class KCTurboGestureModuleImpl extends NativeGestureTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboGestureModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeGestureTurboModuleAbs
    @NotNull
    public Boolean syncGestureRecognizerToNative(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C12572a.m23695d("gesture_status", state, 0L, 4, null);
        return Boolean.TRUE;
    }
}
