package com.kubi.sdk.web.jsapi;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.web.listener.dispatch.WeakListenerDispatcher;
import com.kubi.sdk.web.util.C24329b;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsEventDispatcher.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsEventDispatcher;", "", "<init>", "()V", "Lcom/kubi/sdk/web/jsapi/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/web/jsapi/d;)V", "c", "", "event", ReportDataTable.COLUMN_PARAMS, "b", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kubi/sdk/web/listener/dispatch/WeakListenerDispatcher;", "Lcom/kubi/sdk/web/listener/dispatch/WeakListenerDispatcher;", "listeners", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class JsEventDispatcher {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final JsEventDispatcher f48474a = new JsEventDispatcher();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final WeakListenerDispatcher<InterfaceC24319d> listeners = new WeakListenerDispatcher<>();

    /* JADX INFO: renamed from: a */
    public final void m58754a(@NotNull InterfaceC24319d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.m58776a(listener);
    }

    /* JADX INFO: renamed from: b */
    public final void m58755b(@NotNull String event, @NotNull String params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        C43840a.m96550d("postEventAll event: " + event, "HybridPostEvent");
        final JsEventObj jsEventObj = new JsEventObj(event, params, null, null, 4, null);
        listeners.m58778c(new Function1<InterfaceC24319d, Unit>() { // from class: com.kubi.sdk.web.jsapi.JsEventDispatcher$postEventAll$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24319d interfaceC24319d) {
                invoke2(interfaceC24319d);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC24319d on2) {
                Intrinsics.checkNotNullParameter(on2, "$this$on");
                if (on2.isClosed()) {
                    C24329b.f48558a.m58864d("JsEventDispatcher", "JsEventDispatcher postEventAll block~");
                } else {
                    on2.mo58657a(jsEventObj);
                }
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m58756c(@NotNull InterfaceC24319d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.m58779d(listener);
    }
}
