package com.kubi.sdk.websocket;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.p102vm.InterfaceC19308c;
import com.kubi.network.websocket.model.Message;
import com.kubi.sdk.websocket.C24337a;
import g10.C37779j;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.websocket.a */
/* JADX INFO: compiled from: SocketEx.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aH\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\tH\u0086\bø\u0001\u0000\u001a,\u0010\n\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\tH\u0086\bø\u0001\u0000\u001a,\u0010\f\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\tH\u0086\bø\u0001\u0000\u001a9\u0010\r\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\u0010\u001av\u0010\u0011\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0012\u0018\u0001\"\u0006\b\u0001\u0010\u0013\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\b\n\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\t2\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00010\tH\u0086\bø\u0001\u0000\u001a\u0015\u0010\u001a\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a\u0015\u0010\u001b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, m90084d2 = {"bindSocket", "", ExifInterface.GPS_DIRECTION_TRUE, "", "widgetLifecycleOwner", "Lcom/kubi/mvi/vm/WidgetLifecycleOwner;", "topicList", "", "block", "Lkotlin/Function1;", "bindSocketRequestData", "Lcom/kubi/network/websocket/model/Message;", "bindSocketData", "bindSocketMessage", "config", "Lcom/kubi/sdk/websocket/SocketTaskConfig;", "Lkotlin/ExtensionFunctionType;", "bindSocketHeartbeat", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "request", "Lokhttp3/Request;", "filter", "", "heartBeatBlock", "socketBlock", "unBindSocket", "destroySocket", "LWebSocket_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 2 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n36#2:224\n36#2:230\n137#3,5:225\n137#3,5:231\n1#4:236\n50#5,17:237\n46#6,2:254\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n*L\n64#1:224\n93#1:230\n64#1:225,5\n93#1:231,5\n119#1:237,17\n122#1:254,2\n*E\n"})
public final class C24337a {
    /* JADX INFO: renamed from: b */
    public static final void m58926b(@NotNull String str, @NotNull InterfaceC19308c widgetLifecycleOwner, @NotNull C37779j config, @Nullable final Function1<? super Message, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(widgetLifecycleOwner, "widgetLifecycleOwner");
        Intrinsics.checkNotNullParameter(config, "config");
        SocketTask.f48571i.obtain(str, widgetLifecycleOwner, config).m58912l(new Function1() { // from class: g10.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24337a.m58927c(function1, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m58927c(Function1 function1, Message it) throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (function1 != null) {
                function1.invoke(it);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【Socket 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
            C44128b.m97262f("socket", "Topic->" + thM103847exceptionOrNullimpl2 + "->【bindMessage】", thM103847exceptionOrNullimpl2);
        }
        return Unit.INSTANCE;
    }
}
