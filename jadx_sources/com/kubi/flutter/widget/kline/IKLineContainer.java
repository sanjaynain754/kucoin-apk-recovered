package com.kubi.flutter.widget.kline;

import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.flutter.proto.kline.OrderItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineContract.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0015\u0016J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0013H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineContainer;", "", "getChannel", "Lcom/kubi/flutter/widget/kline/IKLineChannel;", "updateState", "", "state", "Lcom/kubi/flutter/widget/kline/KLineLoadingState;", "changeLifecycleState", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onJumpOrder", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "removeListener", "addStateListener", "Lcom/kubi/flutter/widget/kline/IKLineContainer$StateListener;", "removeStateListener", "EventListener", "StateListener", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKLineContainer {

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.b$a */
    /* JADX INFO: compiled from: KLineContract.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "", "onFlutterUiDisplayed", "", "onFlutterFailed", "errorMessage", "", "onReload", "onJumpOrder", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        default void mo24268a(@NotNull OrderItem orderItem) {
            Intrinsics.checkNotNullParameter(orderItem, "orderItem");
        }

        /* JADX INFO: renamed from: b */
        default void mo24266b(@Nullable String str) {
        }

        default void onFlutterUiDisplayed() {
        }

        default void onReload() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.b$b */
    /* JADX INFO: compiled from: KLineContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineContainer$StateListener;", "", "onLoadStateChanged", "", "state", "Lcom/kubi/flutter/widget/kline/KLineLoadingState;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo24269a(@NotNull KLineLoadingState kLineLoadingState);
    }

    /* JADX INFO: renamed from: a */
    void mo24144a(@NotNull OrderItem orderItem);

    /* JADX INFO: renamed from: b */
    void mo24145b(@NotNull Lifecycle.Event event);

    /* JADX INFO: renamed from: d */
    void mo24147d(@NotNull KLineLoadingState kLineLoadingState);

    /* JADX INFO: renamed from: e */
    void mo24148e(@NotNull a aVar);

    @NotNull
    IKLineChannel getChannel();
}
