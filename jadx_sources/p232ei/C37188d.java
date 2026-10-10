package p232ei;

import android.content.Context;
import com.kubi.futures.settings.FuturesConfirmationPreferencesBridge;
import com.kubi.futures.settings.FuturesLayoutPreferencesBridge;
import com.kubi.futures.settings.FuturesOrderPreferencesBridge;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36572g;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ei.d */
/* JADX INFO: compiled from: KCJsBridgeFutures.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2(\u0010\r\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\\\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\\\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/jsapi/KCJsBridgeFutures;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFuturesModule;", "<init>", "()V", "getFeaturesConfig", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "tabType", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "handleMenuAction", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, ReportDataTable.COLUMN_PARAMS, "", "forwardMenuAction", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeFutures.kt\ncom/kubi/futures/jsapi/KCJsBridgeFutures\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,101:1\n19#2,2:102\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeFutures.kt\ncom/kubi/futures/jsapi/KCJsBridgeFutures\n*L\n70#1:102,2\n*E\n"})
public final class C37188d implements InterfaceC36572g {
    /* JADX INFO: renamed from: h */
    public static final Unit m83182h(Function2 function2, Map map, ProtocolException protocolException) {
        if (protocolException != null) {
            function2.invoke(null, protocolException);
        } else {
            function2.invoke(map, null);
        }
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36572g
    /* JADX INFO: renamed from: a */
    public void mo81862a(@NotNull final Context ctx, @Nullable final Object obj, @NotNull final String source, @NotNull final String actionId, @NotNull final Map<String, ? extends Object> params, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (FuturesConfirmationPreferencesBridge.f23389a.m26337c(actionId) || FuturesLayoutPreferencesBridge.f23398a.m26345b(actionId) || FuturesOrderPreferencesBridge.f23409a.m26353b(actionId)) {
            m83184e(ctx, obj, source, actionId, params, callback);
        } else {
            C42917g.m94139e().execute(new Runnable() { // from class: ei.b
                @Override // java.lang.Runnable
                public final void run() {
                    C37188d.m83183i(this.f82479b, ctx, obj, source, actionId, params, callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m83184e(Context context, Object obj, String str, String str2, Map<String, ? extends Object> map, final Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService.f28731a.get().mo33274a(context, obj, str, str2, map, new Function2() { // from class: ei.c
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C37188d.m83181g(function2, (Boolean) obj2, (ProtocolException) obj3);
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            function2.invoke(Boolean.FALSE, new ProtocolException("-9002", thM103847exceptionOrNullimpl, thM103847exceptionOrNullimpl.getMessage(), false, 8, null));
        }
    }

    @Override // d00.InterfaceC36572g
    /* JADX INFO: renamed from: f */
    public void mo81863f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tabType, @NotNull final Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService.f28731a.get().mo33278f(ctx, obj, source, tabType, new Function2() { // from class: ei.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C37188d.m83182h(callback, (Map) obj2, (ProtocolException) obj3);
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("-9002", thM103847exceptionOrNullimpl, thM103847exceptionOrNullimpl.getMessage(), false, 8, null));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m83181g(Function2 function2, Boolean bool, ProtocolException protocolException) {
        function2.invoke(bool, protocolException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m83183i(C37188d c37188d, Context context, Object obj, String str, String str2, Map map, Function2 function2) {
        c37188d.m83184e(context, obj, str, str2, map, function2);
    }
}
