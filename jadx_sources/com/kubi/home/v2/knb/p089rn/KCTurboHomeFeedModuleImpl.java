package com.kubi.home.v2.knb.p089rn;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.core.turbo.NativeHomeFeedTurboModuleAbs;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboHomeFeedModuleImpl.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/v2/knb/rn/KCTurboHomeFeedModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "sendFeedTabOffsetX", "", TypedValues.CycleType.S_WAVE_OFFSET, "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeHomeFeedTurboModuleAbs.class})
public final class KCTurboHomeFeedModuleImpl extends NativeHomeFeedTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboHomeFeedModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeFeedTurboModuleAbs
    public void sendFeedTabOffsetX(double offset, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_tab_offset_x_change", Double.valueOf(offset), 0L, 4, null);
        callback.invoke(Boolean.TRUE);
    }
}
