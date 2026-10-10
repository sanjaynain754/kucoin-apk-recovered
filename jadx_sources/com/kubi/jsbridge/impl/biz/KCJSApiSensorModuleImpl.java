package com.kubi.jsbridge.impl.biz;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27023a;
import com.sensorsdata.abtest.SensorsABTest;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36589x;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCJSApiSensorModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016JP\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00132\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016Jh\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u00152(\u0010\u000f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016JP\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016JA\u0010\u0018\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u0002H\u00192\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0002¢\u0006\u0002\u0010\u001aJ^\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016Jx\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016JP\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¨\u0006%"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/KCJSApiSensorModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSensorModule;", "<init>", "()V", "fastFetchBoolTest", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "keyName", "defaultValue", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "fastFetchIntegerTest", "", "fastFetchJsonTest", "", "", "fastFetchStringTest", "fastFetchTest", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "sensorsTrackTurbo", "eventId", "properties", "sensorsExpose", "pageId", "blockId", "locationId", "siteId", "fetchKcAbTest", "experimentKey", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiSensorModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiSensorModuleImpl.kt\ncom/kubi/jsbridge/impl/biz/KCJSApiSensorModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,150:1\n216#2,2:151\n216#2,2:153\n*S KotlinDebug\n*F\n+ 1 KCJSApiSensorModuleImpl.kt\ncom/kubi/jsbridge/impl/biz/KCJSApiSensorModuleImpl\n*L\n90#1:151,2\n115#1:153,2\n*E\n"})
public final class KCJSApiSensorModuleImpl implements InterfaceC36589x {
    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: a */
    public void mo31556a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable String str, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (map != null) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
                C27023a.m66556c(pageId, blockId, locationId, jSONObject);
            } else {
                C43852m.m96606r(pageId, null, 2, null);
            }
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("sensorsExpose error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: j */
    public final <T> void m31563j(String str, T t11, Function2<? super T, ? super ProtocolException, Unit> function2) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            function2.invoke((Object) SensorsABTest.shareInstance().fetchCacheABTest(str, t11), null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            function2.invoke(null, new ProtocolException("-1000", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m31554k(String str, String str2, Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1(str, str2, function2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m31555l(Function2 function2) {
        function2.invoke(null, new ProtocolException("fetchKcAbTest error: host activity is null", null, null, false, 14, null));
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: b */
    public void mo31557b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String keyName, @NotNull String defaultValue, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m31563j(keyName, defaultValue, callback);
    }

    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: c */
    public void mo31558c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String keyName, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m31563j(keyName, Boolean.valueOf(z11), callback);
    }

    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: d */
    public void mo31559d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String keyName, long j11, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m31563j(keyName, Long.valueOf(j11), callback);
    }

    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: e */
    public void mo31560e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventId, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (map != null) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                C43852m.m96605q(eventId, jSONObject);
            } else {
                C43852m.m96606r(eventId, null, 2, null);
            }
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("sensorsTrackTurbo error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: f */
    public void mo31561f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String keyName, @NotNull Map<String, ? extends Object> defaultValue, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m31563j(keyName, defaultValue, callback);
    }

    @Override // d00.InterfaceC36589x
    /* JADX INFO: renamed from: g */
    public void mo31562g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final String experimentKey, @NotNull final String defaultValue, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(experimentKey, "experimentKey");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            C42899b.m94074d(new Function1() { // from class: com.kubi.jsbridge.impl.biz.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCJSApiSensorModuleImpl.m31554k(experimentKey, defaultValue, callback, (FragmentActivity) obj2);
                }
            }, new Function0() { // from class: com.kubi.jsbridge.impl.biz.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KCJSApiSensorModuleImpl.m31555l(callback);
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("fetchKcAbTest error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }
}
