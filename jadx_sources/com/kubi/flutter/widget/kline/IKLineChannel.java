package com.kubi.flutter.widget.kline;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.EventMessage;
import com.kubi.flutter.proto.kline.OrderList;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ViewControl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineContract.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineChannel;", "", "sendControl", "Lcom/kubi/flutter/proto/kline/Response;", SessionDescription.ATTR_CONTROL, "Lcom/kubi/flutter/proto/kline/ViewControl;", "(Lcom/kubi/flutter/proto/kline/ViewControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCandleList", "candleListData", "Lcom/kubi/flutter/proto/kline/CandleList;", "(Lcom/kubi/flutter/proto/kline/CandleList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOrderList", "orderListData", "Lcom/kubi/flutter/proto/kline/OrderList;", "(Lcom/kubi/flutter/proto/kline/OrderList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/flutter/widget/kline/IKLineChannel$EventListener;", "removeListener", "EventListener", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKLineChannel {

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.a$a */
    /* JADX INFO: compiled from: KLineContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineChannel$EventListener;", "", "onEventMessage", "Lcom/kubi/flutter/proto/kline/Response;", "eventMessage", "Lcom/kubi/flutter/proto/kline/EventMessage;", "(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        @Nullable
        /* JADX INFO: renamed from: a */
        Object mo24267a(@NotNull EventMessage eventMessage, @NotNull Continuation<? super Response> continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo24110a(@NotNull OrderList orderList, @NotNull Continuation<? super Response> continuation);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo24111b(@NotNull CandleList candleList, @NotNull Continuation<? super Response> continuation);

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo24112c(@NotNull ViewControl viewControl, @NotNull Continuation<? super Response> continuation);

    /* JADX INFO: renamed from: d */
    void mo24113d(@NotNull a aVar);
}
