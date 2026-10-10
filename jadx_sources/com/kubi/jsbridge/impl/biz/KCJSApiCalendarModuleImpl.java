package com.kubi.jsbridge.impl.biz;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.SystemCalendarManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36564c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCJSApiCalendarModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0002J@\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016J@\u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016J`\u0010\u0017\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016Jh\u0010\u0019\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016J`\u0010\u001b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0010\u0010\u001e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/KCJSApiCalendarModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCalendarModule;", "<init>", "()V", "TAG", "", "gson", "Lcom/google/gson/Gson;", "checkPermissionOrError", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "getPermission", "obj", "Ljava/lang/Object;", "source", "requestPermission", "queryCalendar", "data", "updateCalendarItem", "eventType", "deleteCalendarItem", "parseReadOptions", "Lcom/kubi/sdk/util/SystemCalendarManager$ReadOptions;", "optionsMap", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiCalendarModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiCalendarModuleImpl.kt\ncom/kubi/jsbridge/impl/biz/KCJSApiCalendarModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1617#2,9:280\n1869#2:289\n1870#2:291\n1626#2:292\n1617#2,9:293\n1869#2:302\n1870#2:304\n1626#2:305\n1#3:290\n1#3:303\n*S KotlinDebug\n*F\n+ 1 KCJSApiCalendarModuleImpl.kt\ncom/kubi/jsbridge/impl/biz/KCJSApiCalendarModuleImpl\n*L\n110#1:280,9\n110#1:289\n110#1:291\n110#1:292\n232#1:293,9\n232#1:302\n232#1:304\n232#1:305\n110#1:290\n232#1:303\n*E\n"})
public final class KCJSApiCalendarModuleImpl implements InterfaceC36564c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f27359a = "KCBridgeCalendarCallImp";

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Gson f27360b = new Gson();

    /* JADX WARN: Code duplicated, block: B:178:0x0306  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // d00.InterfaceC36564c
    /* JADX INFO: renamed from: d */
    public void mo31540d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventType, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Object obj2;
        ?? r11;
        String message;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!m31542g(ctx, callback)) {
            return;
        }
        try {
            boolean zAreEqual = Intrinsics.areEqual(eventType, "add");
            obj2 = FirebaseAnalytics.Param.LOCATION;
            try {
                try {
                    try {
                        if (zAreEqual) {
                            Object obj3 = data.get("title");
                            String str = obj3 instanceof String ? (String) obj3 : null;
                            String str2 = str == null ? "Untitled" : str;
                            Object obj4 = data.get("startAtMs");
                            Number number = obj4 instanceof Number ? (Number) obj4 : null;
                            if (number == null) {
                                throw new IllegalArgumentException("startAtMs is required");
                            }
                            long jLongValue = number.longValue();
                            Object obj5 = data.get("endAtMs");
                            Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
                            if (number2 == null) {
                                throw new IllegalArgumentException("endAtMs is required");
                            }
                            long jLongValue2 = number2.longValue();
                            Object obj6 = data.get("allDay");
                            Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
                            Object obj7 = data.get("timezone");
                            String str3 = obj7 instanceof String ? (String) obj7 : null;
                            Object obj8 = data.get("notes");
                            String str4 = obj8 instanceof String ? (String) obj8 : null;
                            Object obj9 = data.get(FirebaseAnalytics.Param.LOCATION);
                            String str5 = obj9 instanceof String ? (String) obj9 : null;
                            Object obj10 = data.get("url");
                            String str6 = obj10 instanceof String ? (String) obj10 : null;
                            Object obj11 = data.get("calendarId");
                            String str7 = obj11 instanceof String ? (String) obj11 : null;
                            Object obj12 = data.get("alarmsJson");
                            String str8 = obj12 instanceof String ? (String) obj12 : null;
                            Object obj13 = data.get("recurrenceJson");
                            String str9 = obj13 instanceof String ? (String) obj13 : null;
                            Object obj14 = data.get("attendeesJson");
                            callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to("id", SystemCalendarManager.f48218a.m58495h(ctx, new SystemCalendarManager.EventPayload(null, str2, jLongValue, jLongValue2, bool, str3, str4, str5, str6, str7, str8, str9, obj14 instanceof String ? (String) obj14 : null))), TuplesKt.m90091to(TUIConstants.TIMPush.NOTIFICATION.ENTITY, "event")))), null);
                            return;
                        }
                        if (!Intrinsics.areEqual(eventType, "update")) {
                            throw new IllegalArgumentException("Invalid event type: " + eventType + ". Expected 'add' or 'update'");
                        }
                        Object obj15 = data.get("id");
                        String str10 = obj15 instanceof String ? (String) obj15 : null;
                        if (str10 == null) {
                            throw new IllegalArgumentException("id is required for update operation");
                        }
                        Object obj16 = data.get("title");
                        String str11 = obj16 instanceof String ? (String) obj16 : null;
                        String str12 = str11 == null ? "Untitled" : str11;
                        Object obj17 = data.get("startAtMs");
                        Number number3 = obj17 instanceof Number ? (Number) obj17 : null;
                        if (number3 == null) {
                            throw new IllegalArgumentException("startAtMs is required");
                        }
                        long jLongValue3 = number3.longValue();
                        Object obj18 = data.get("endAtMs");
                        Number number4 = obj18 instanceof Number ? (Number) obj18 : null;
                        if (number4 == null) {
                            throw new IllegalArgumentException("endAtMs is required");
                        }
                        long jLongValue4 = number4.longValue();
                        Object obj19 = data.get("allDay");
                        Boolean bool2 = obj19 instanceof Boolean ? (Boolean) obj19 : null;
                        Object obj20 = data.get("timezone");
                        String str13 = obj20 instanceof String ? (String) obj20 : null;
                        Object obj21 = data.get("notes");
                        String str14 = obj21 instanceof String ? (String) obj21 : null;
                        Object obj22 = data.get(FirebaseAnalytics.Param.LOCATION);
                        String str15 = obj22 instanceof String ? (String) obj22 : null;
                        Object obj23 = data.get("url");
                        String str16 = obj23 instanceof String ? (String) obj23 : null;
                        Object obj24 = data.get("calendarId");
                        String str17 = obj24 instanceof String ? (String) obj24 : null;
                        Object obj25 = data.get("alarmsJson");
                        String str18 = obj25 instanceof String ? (String) obj25 : null;
                        Object obj26 = data.get("recurrenceJson");
                        String str19 = obj26 instanceof String ? (String) obj26 : null;
                        Object obj27 = data.get("attendeesJson");
                        callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to("id", SystemCalendarManager.f48218a.m58495h(ctx, new SystemCalendarManager.EventPayload(str10, str12, jLongValue3, jLongValue4, bool2, str13, str14, str15, str16, str17, str18, str19, obj27 instanceof String ? (String) obj27 : null))), TuplesKt.m90091to(TUIConstants.TIMPush.NOTIFICATION.ENTITY, "event")))), null);
                    } catch (Exception e11) {
                        e = e11;
                        r11 = callback;
                        C44128b.m97262f(this.f27359a, "updateCalendarItem error", e);
                        message = e.getMessage();
                        if (message == null) {
                            message = "Update failed";
                        }
                        r11.invoke(null, new ProtocolException(message, null, null, false, 14, null));
                    }
                } catch (Exception e12) {
                    e = e12;
                    obj2 = callback;
                    r11 = obj2;
                    C44128b.m97262f(this.f27359a, "updateCalendarItem error", e);
                    message = e.getMessage();
                    if (message == null) {
                        message = "Update failed";
                    }
                    r11.invoke(null, new ProtocolException(message, null, null, false, 14, null));
                }
            } catch (Exception e13) {
                e = e13;
                r11 = obj2;
                C44128b.m97262f(this.f27359a, "updateCalendarItem error", e);
                message = e.getMessage();
                if (message == null) {
                    message = "Update failed";
                }
                r11.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        } catch (Exception e14) {
            e = e14;
            obj2 = callback;
        }
    }

    @Override // d00.InterfaceC36564c
    /* JADX INFO: renamed from: a */
    public void mo31537a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(SystemCalendarManager.f48218a.m58490b(ctx, "events_full"), null);
    }

    @Override // d00.InterfaceC36564c
    /* JADX INFO: renamed from: b */
    public void mo31538b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        List<String> listEmptyList;
        List<SystemCalendarManager.EventItem> listEmptyList2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m31542g(ctx, callback)) {
            try {
                Object obj2 = data.get(TUIConstants.TIMPush.NOTIFICATION.ENTITY);
                String str = obj2 instanceof String ? (String) obj2 : null;
                String str2 = str == null ? "event" : str;
                Object obj3 = data.get("startAtMs");
                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                long jLongValue = number != null ? number.longValue() : System.currentTimeMillis();
                Object obj4 = data.get("endAtMs");
                Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                long jLongValue2 = number2 != null ? number2.longValue() : 2592000000L + jLongValue;
                Object obj5 = data.get("calendarIds");
                List list = obj5 instanceof List ? (List) obj5 : null;
                if (list != null) {
                    listEmptyList = new ArrayList<>();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String string = next != null ? next.toString() : null;
                        if (string != null) {
                            listEmptyList.add(string);
                        }
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Object obj6 = data.get("options");
                SystemCalendarManager.ReadOptions readOptionsM31543h = m31543h(obj6 instanceof Map ? (Map) obj6 : null);
                if (Intrinsics.areEqual(str2, "event")) {
                    listEmptyList2 = SystemCalendarManager.f48218a.m58494f(ctx, jLongValue, jLongValue2, listEmptyList, readOptionsM31543h);
                } else {
                    if (!Intrinsics.areEqual(str2, NotificationCompat.CATEGORY_REMINDER)) {
                        throw new IllegalArgumentException("Invalid entity: " + str2);
                    }
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to(TUIConstants.TIMPush.NOTIFICATION.ENTITY, str2), TuplesKt.m90091to("itemsJson", listEmptyList2))));
                C44128b.m97266j(this.f27359a, "queryCalendar success: " + mapMapOf);
                callback.invoke(mapMapOf, null);
            } catch (Exception e11) {
                C44128b.m97262f(this.f27359a, "queryCalendar error", e11);
                String message = e11.getMessage();
                if (message == null) {
                    message = "Query failed";
                }
                callback.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        }
    }

    @Override // d00.InterfaceC36564c
    /* JADX INFO: renamed from: c */
    public void mo31539c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m31542g(ctx, callback)) {
            try {
                Object obj2 = data.get("ids");
                List list = obj2 instanceof List ? (List) obj2 : null;
                if (list == null) {
                    throw new IllegalArgumentException("ids array is required");
                }
                ArrayList<String> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String string = next != null ? next.toString() : null;
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("ids array cannot be empty");
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    if (!SystemCalendarManager.f48218a.m58491c(ctx, str, "")) {
                        throw new IllegalStateException("Failed to delete event with id: " + str);
                    }
                    arrayList2.add(str);
                }
                callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to("successIds", arrayList2)))), null);
            } catch (Exception e11) {
                C44128b.m97262f(this.f27359a, "deleteCalendarItem error", e11);
                String message = e11.getMessage();
                if (message == null) {
                    message = "Delete failed";
                }
                callback.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        }
    }

    @Override // d00.InterfaceC36564c
    /* JADX INFO: renamed from: e */
    public void mo31541e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCJSApiCalendarModuleImpl$requestPermission$1(ctx, callback, this, null));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31542g(Context context, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        if (SystemCalendarManager.f48218a.m58493e(context)) {
            return true;
        }
        function2.invoke(null, new ProtocolException("Calendar permission not granted", null, null, false, 14, null));
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final SystemCalendarManager.ReadOptions m31543h(Map<?, ?> map) {
        if (map == null) {
            return new SystemCalendarManager.ReadOptions(null, null, null, null, null, null, null, 127, null);
        }
        Object obj = map.get(TUIConstants.TUIContact.LIMIT);
        Number number = obj instanceof Number ? (Number) obj : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        Object obj2 = map.get("keyword");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("includeCompleted");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map.get("dueOnly");
        Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        Object obj5 = map.get("includeDeclined");
        Boolean bool3 = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        Object obj6 = map.get("includeCanceled");
        return new SystemCalendarManager.ReadOptions(numValueOf, null, str, bool, bool2, bool3, obj6 instanceof Boolean ? (Boolean) obj6 : null, 2, null);
    }
}
