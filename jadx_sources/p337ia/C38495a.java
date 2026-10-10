package p337ia;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.advert.api.IAdvertService;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.retrofit.utils.ApiMonitor;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36567d0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p624sq.C44536b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44127a;
import ro.C44128b;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: compiled from: KCJSApiTrackModuleImpl.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002Jt\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JX\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JP\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JP\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\\\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J^\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J^\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JR\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JN\u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0(2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J^\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¨\u0006+"}, m90084d2 = {"Lcom/kubi/advert/jsapi/KCJSApiTrackModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTrackModule;", "<init>", "()V", "afTrack", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "eventId", ReportDataTable.COLUMN_PARAMS, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "tryParseParams", "", "kunlunTrack", "eventName", "dimensions", "", C33675gh.f70007m, "kunlunEventTrack", "category", "code", "", "kunlunTechTrack", "kunlunBizTrack", "kunlunLog", "message", FirebaseAnalytics.Param.LEVEL, "tag", "fbTrack", "firebaseTrack", "firebaseAddBreadcrumb", "setKunlunMonitorApis", "apiList", "", "clsTrack", "content", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiTrackModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiTrackModuleImpl.kt\ncom/kubi/advert/jsapi/KCJSApiTrackModuleImpl\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,247:1\n149#2:248\n463#3:249\n413#3:250\n463#3:268\n413#3:269\n1252#4,4:251\n1252#4,4:270\n123#5,13:255\n216#6,2:274\n*S KotlinDebug\n*F\n+ 1 KCJSApiTrackModuleImpl.kt\ncom/kubi/advert/jsapi/KCJSApiTrackModuleImpl\n*L\n46#1:248\n63#1:249\n63#1:250\n161#1:268\n161#1:269\n63#1:251,4\n161#1:270,4\n70#1:255,13\n182#1:274,2\n*E\n"})
public final class C38495a implements InterfaceC36567d0 {

    /* JADX INFO: renamed from: ia.a$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<Map<String, ? extends String>> {
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: a */
    public void mo81847a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventName, @NotNull String category, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            C43847h.m96574c(eventName, category, (int) j11);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("kunlunEventTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: b */
    public void mo81848b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String message, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            C43840a.m96550d(message, str);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("firebaseAddBreadcrumb error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: c */
    public void mo81849c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventId, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IAdvertService.f15070a.get().mo14765g(eventId, m87100l(str));
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: d */
    public void mo81850d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventName, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Map mapEmptyMap;
        Object doubleOrNull;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (map2 != null) {
                mapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                for (Object obj2 : map2.entrySet()) {
                    Object key = ((Map.Entry) obj2).getKey();
                    Object value = ((Map.Entry) obj2).getValue();
                    if (value instanceof Number) {
                        doubleOrNull = (Number) value;
                    } else if (value instanceof String) {
                        doubleOrNull = StringsKt.toDoubleOrNull((String) value);
                        if (doubleOrNull == null) {
                            doubleOrNull = 0;
                        }
                    } else {
                        doubleOrNull = 0;
                    }
                    mapEmptyMap.put(key, doubleOrNull);
                }
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (map == null || map.isEmpty()) {
                C44128b.m97260d("kunlun dimensions is null");
            } else {
                for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
                    if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
                        interfaceC44169a.mo94079b(eventName, MapsKt.toMutableMap(map));
                    } else {
                        interfaceC44169a.mo94078a(eventName, MapsKt.toMutableMap(mapEmptyMap), MapsKt.toMutableMap(map));
                    }
                }
            }
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("kunlunTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: e */
    public void mo81851e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String category, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            C43847h.m96576e(category, (int) j11);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("kunlunTechTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: f */
    public void mo81852f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventName, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (map != null) {
                mapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Object obj2 : map.entrySet()) {
                    mapEmptyMap.put(((Map.Entry) obj2).getKey(), ((Map.Entry) obj2).getValue().toString());
                }
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            IAdvertService.f15070a.get().mo14763e(eventName, mapEmptyMap);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("fbTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: h */
    public void mo81854h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventName, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (map == null || map.isEmpty()) {
                TechnologyEvent.m42386b(eventName);
            } else {
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        eventParametersBuilderAcquire.m42393d(key, (String) value);
                    } else if (value instanceof Integer) {
                        eventParametersBuilderAcquire.m42391b(key, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        eventParametersBuilderAcquire.m42392c(key, ((Number) value).longValue());
                    } else if (value instanceof Boolean) {
                        eventParametersBuilderAcquire.m42394e(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Double) {
                        eventParametersBuilderAcquire.m42395f(key, ((Number) value).doubleValue());
                    } else {
                        eventParametersBuilderAcquire.m42393d(key, value.toString());
                    }
                }
                TechnologyEvent.m42388d(eventName, eventParametersBuilderAcquire);
            }
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("firebaseTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: i */
    public void mo81855i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String category, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            C43847h.m96573b(category, (int) j11);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("kunlunBizTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: j */
    public void mo81856j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String message, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            int i11 = 3;
            if (str != null) {
                switch (str.hashCode()) {
                    case 3237038:
                        if (str.equals("info")) {
                            i11 = 4;
                        }
                        break;
                    case 3641990:
                        if (str.equals("warn")) {
                            i11 = 5;
                        }
                        break;
                    case 95458899:
                        str.equals("debug");
                        break;
                    case 96784904:
                        if (str.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            i11 = 6;
                        }
                        break;
                    case 351107458:
                        if (str.equals("verbose")) {
                            i11 = 2;
                        }
                        break;
                }
            }
            C44127a.m97252l(i11, str2, message, null);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("kunlunLog error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: k */
    public void mo81857k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String content, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Map map2 = map != null ? MapsKt.toMap(map) : null;
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            callback.invoke(Boolean.valueOf(C44536b.m98550d(content, map2)), null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("clsTrack error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36567d0
    /* JADX INFO: renamed from: g */
    public void mo81853g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<String> apiList, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(apiList, "apiList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            ApiMonitor.m42819b(apiList);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("setKunlunMonitorApis error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: l */
    public final Map<String, String> m87100l(String str) {
        if (str == null || str.length() == 0) {
            return MapsKt.emptyMap();
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            return (Map) C27099x.m66914d(str, new a().getType());
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }
}
