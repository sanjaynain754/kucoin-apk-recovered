package com.kubi.quotefacade.feed;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.flutter.delegate.IChannelRegister;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44127a;

/* JADX INFO: compiled from: FeedHandlerChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u001c\u0010\r\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fJ\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/FeedHandlerChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "notifyFeedTabPosChange", ReportDataTable.COLUMN_PARAMS, "", "", "", "jumpToFeedTop", "notifyVisibleHeight", "visibleHeight", "", "scrollWithVelocity", "velocity", "", "checkWaring", "name", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FeedHandlerChannel implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f41912b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f41913a;

    /* JADX INFO: compiled from: FeedHandlerChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/FeedHandlerChannel$Companion;", "", "<init>", "()V", "TAG", "", "LIFECYCLE_CHANNEL_NAME", "HOME_FEED_TAB_CHANGE", "HOME_FEED_JUMP_TO_FEED_TOP", "HOME_FEED_NOTIFY_VISIBLE_HEIGHT_CHANGE", "HOME_FEED_SCROLL_WITH_VELOCITY", "PARAMS_VELOCITY", "PARAMS_VISIBLE_HEIGHT", "HOME_FEED_ADD_POST", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m51734a(String str) {
        if (this.f41913a == null) {
            C44127a.m97245e("FeedHandlerChannel", str + " be called before register!");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m51735b() {
        MethodChannel methodChannel = this.f41913a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("home_feed_jump_to_feed_top", null);
        }
        m51734a("jumpToFeedTop");
    }

    /* JADX INFO: renamed from: c */
    public final void m51736c(@Nullable Map<String, ? extends Object> map) {
        MethodChannel methodChannel = this.f41913a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("home_feed_tab_change", map);
        }
        m51734a("notifyFeedTabPosChange");
    }

    /* JADX INFO: renamed from: d */
    public final void m51737d(int i11) {
        MethodChannel methodChannel = this.f41913a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("home_feed_update_visible_height", MapsKt.mapOf(TuplesKt.m90091to("visibleHeight", Integer.valueOf(i11))));
        }
        m51734a("notifyVisibleHeight");
    }

    /* JADX INFO: renamed from: e */
    public final void m51738e(double d11) {
        MethodChannel methodChannel = this.f41913a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("home_feed_scroll_with_velocity", MapsKt.mapOf(TuplesKt.m90091to("velocity", Double.valueOf(d11))));
        }
        m51734a("scrollWithVelocity");
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.f41913a = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "kc.homefeed", StandardMethodCodec.INSTANCE);
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f41913a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f41913a = null;
    }
}
