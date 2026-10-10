package com.kubi.p110rn.protocol;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.kubi.p110rn.calendar.SystemCalendarManager;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37010b;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: compiled from: KCBridgeCalendarCallImp.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0002J.\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016J.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016JN\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016JV\u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016JN\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0010\u0010\u001b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/rn/protocol/KCBridgeCalendarCallImp;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCalendarCall;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "TAG", "", "checkPermissionOrError", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "getPermission", "requestPermission", "queryCalendar", "data", "updateCalendarItem", "eventType", "deleteCalendarItem", "parseReadOptions", "Lcom/kubi/rn/calendar/SystemCalendarManager$ReadOptions;", "optionsMap", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBridgeCalendarCallImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBridgeCalendarCallImp.kt\ncom/kubi/rn/protocol/KCBridgeCalendarCallImp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1617#2,9:263\n1869#2:272\n1870#2:274\n1626#2:275\n1617#2,9:276\n1869#2:285\n1870#2:287\n1626#2:288\n1#3:273\n1#3:286\n*S KotlinDebug\n*F\n+ 1 KCBridgeCalendarCallImp.kt\ncom/kubi/rn/protocol/KCBridgeCalendarCallImp\n*L\n98#1:263,9\n98#1:272\n98#1:274\n98#1:275\n217#1:276,9\n217#1:285\n217#1:287\n217#1:288\n98#1:273\n217#1:286\n*E\n"})
public final class KCBridgeCalendarCallImp implements InterfaceC37010b {

    @NotNull
    private final Gson gson = new Gson();

    @NotNull
    private final String TAG = "KCBridgeCalendarCallImp";

    /* JADX WARN: Code duplicated, block: B:178:0x02ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // e00.InterfaceC37010b
    public void updateCalendarItem(@NotNull Context ctx, @NotNull String eventType, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Object obj;
        ?? r11;
        String message;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!checkPermissionOrError(ctx, callback)) {
            return;
        }
        try {
            boolean zAreEqual = Intrinsics.areEqual(eventType, "add");
            obj = FirebaseAnalytics.Param.LOCATION;
            try {
                try {
                    try {
                        if (zAreEqual) {
                            Object obj2 = data.get("title");
                            String str = obj2 instanceof String ? (String) obj2 : null;
                            String str2 = str == null ? "Untitled" : str;
                            Object obj3 = data.get("startAtMs");
                            Number number = obj3 instanceof Number ? (Number) obj3 : null;
                            if (number == null) {
                                throw new IllegalArgumentException("startAtMs is required");
                            }
                            long jLongValue = number.longValue();
                            Object obj4 = data.get("endAtMs");
                            Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                            if (number2 == null) {
                                throw new IllegalArgumentException("endAtMs is required");
                            }
                            long jLongValue2 = number2.longValue();
                            Object obj5 = data.get("allDay");
                            Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
                            Object obj6 = data.get("timezone");
                            String str3 = obj6 instanceof String ? (String) obj6 : null;
                            Object obj7 = data.get("notes");
                            String str4 = obj7 instanceof String ? (String) obj7 : null;
                            Object obj8 = data.get(FirebaseAnalytics.Param.LOCATION);
                            String str5 = obj8 instanceof String ? (String) obj8 : null;
                            Object obj9 = data.get("url");
                            String str6 = obj9 instanceof String ? (String) obj9 : null;
                            Object obj10 = data.get("calendarId");
                            String str7 = obj10 instanceof String ? (String) obj10 : null;
                            Object obj11 = data.get("alarmsJson");
                            String str8 = obj11 instanceof String ? (String) obj11 : null;
                            Object obj12 = data.get("recurrenceJson");
                            String str9 = obj12 instanceof String ? (String) obj12 : null;
                            Object obj13 = data.get("attendeesJson");
                            callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to("id", SystemCalendarManager.INSTANCE.upsertEvent(ctx, new SystemCalendarManager.EventPayload(null, str2, jLongValue, jLongValue2, bool, str3, str4, str5, str6, str7, str8, str9, obj13 instanceof String ? (String) obj13 : null))), TuplesKt.m90091to(TUIConstants.TIMPush.NOTIFICATION.ENTITY, "event")))), null);
                            return;
                        }
                        if (!Intrinsics.areEqual(eventType, "update")) {
                            throw new IllegalArgumentException("Invalid event type: " + eventType + ". Expected 'add' or 'update'");
                        }
                        Object obj14 = data.get("id");
                        String str10 = obj14 instanceof String ? (String) obj14 : null;
                        if (str10 == null) {
                            throw new IllegalArgumentException("id is required for update operation");
                        }
                        Object obj15 = data.get("title");
                        String str11 = obj15 instanceof String ? (String) obj15 : null;
                        String str12 = str11 == null ? "Untitled" : str11;
                        Object obj16 = data.get("startAtMs");
                        Number number3 = obj16 instanceof Number ? (Number) obj16 : null;
                        if (number3 == null) {
                            throw new IllegalArgumentException("startAtMs is required");
                        }
                        long jLongValue3 = number3.longValue();
                        Object obj17 = data.get("endAtMs");
                        Number number4 = obj17 instanceof Number ? (Number) obj17 : null;
                        if (number4 == null) {
                            throw new IllegalArgumentException("endAtMs is required");
                        }
                        long jLongValue4 = number4.longValue();
                        Object obj18 = data.get("allDay");
                        Boolean bool2 = obj18 instanceof Boolean ? (Boolean) obj18 : null;
                        Object obj19 = data.get("timezone");
                        String str13 = obj19 instanceof String ? (String) obj19 : null;
                        Object obj20 = data.get("notes");
                        String str14 = obj20 instanceof String ? (String) obj20 : null;
                        Object obj21 = data.get(FirebaseAnalytics.Param.LOCATION);
                        String str15 = obj21 instanceof String ? (String) obj21 : null;
                        Object obj22 = data.get("url");
                        String str16 = obj22 instanceof String ? (String) obj22 : null;
                        Object obj23 = data.get("calendarId");
                        String str17 = obj23 instanceof String ? (String) obj23 : null;
                        Object obj24 = data.get("alarmsJson");
                        String str18 = obj24 instanceof String ? (String) obj24 : null;
                        Object obj25 = data.get("recurrenceJson");
                        String str19 = obj25 instanceof String ? (String) obj25 : null;
                        Object obj26 = data.get("attendeesJson");
                        callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to("id", SystemCalendarManager.INSTANCE.upsertEvent(ctx, new SystemCalendarManager.EventPayload(str10, str12, jLongValue3, jLongValue4, bool2, str13, str14, str15, str16, str17, str18, str19, obj26 instanceof String ? (String) obj26 : null))), TuplesKt.m90091to(TUIConstants.TIMPush.NOTIFICATION.ENTITY, "event")))), null);
                    } catch (Exception e11) {
                        e = e11;
                        r11 = obj;
                        C44128b.m97262f(this.TAG, "updateCalendarItem error", e);
                        message = e.getMessage();
                        if (message == null) {
                            message = "Update failed";
                        }
                        r11.invoke(null, new ProtocolException(message, null, null, false, 14, null));
                    }
                } catch (Exception e12) {
                    e = e12;
                    r11 = callback;
                    C44128b.m97262f(this.TAG, "updateCalendarItem error", e);
                    message = e.getMessage();
                    if (message == null) {
                        message = "Update failed";
                    }
                    r11.invoke(null, new ProtocolException(message, null, null, false, 14, null));
                }
            } catch (Exception e13) {
                e = e13;
                obj = callback;
                r11 = obj;
                C44128b.m97262f(this.TAG, "updateCalendarItem error", e);
                message = e.getMessage();
                if (message == null) {
                    message = "Update failed";
                }
                r11.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        } catch (Exception e14) {
            e = e14;
            obj = callback;
        }
    }

    private final boolean checkPermissionOrError(Context ctx, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        if (SystemCalendarManager.INSTANCE.hasCalendarPermission(ctx)) {
            return true;
        }
        callback.invoke(null, new ProtocolException("Calendar permission not granted", null, null, false, 14, null));
        return false;
    }

    private final SystemCalendarManager.ReadOptions parseReadOptions(Map<?, ?> optionsMap) {
        if (optionsMap == null) {
            return new SystemCalendarManager.ReadOptions(null, null, null, null, null, null, null, 127, null);
        }
        Object obj = optionsMap.get(TUIConstants.TUIContact.LIMIT);
        Number number = obj instanceof Number ? (Number) obj : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        Object obj2 = optionsMap.get("keyword");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = optionsMap.get("includeCompleted");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = optionsMap.get("dueOnly");
        Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        Object obj5 = optionsMap.get("includeDeclined");
        Boolean bool3 = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        Object obj6 = optionsMap.get("includeCanceled");
        return new SystemCalendarManager.ReadOptions(numValueOf, null, str, bool, bool2, bool3, obj6 instanceof Boolean ? (Boolean) obj6 : null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$2(KCBridgeCalendarCallImp kCBridgeCalendarCallImp, Function2 function2, Throwable th2) {
        C44128b.m97262f(kCBridgeCalendarCallImp.TAG, "requestPermission error", th2);
        String message = th2.getMessage();
        if (message == null) {
            message = "Request permission failed";
        }
        function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
        return Unit.INSTANCE;
    }

    @Override // e00.InterfaceC37010b
    public void deleteCalendarItem(@NotNull Context ctx, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (checkPermissionOrError(ctx, callback)) {
            try {
                Object obj = data.get("ids");
                List list = obj instanceof List ? (List) obj : null;
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
                    if (!SystemCalendarManager.INSTANCE.deleteEvent(ctx, str, "")) {
                        throw new IllegalStateException("Failed to delete event with id: " + str);
                    }
                    arrayList2.add(str);
                }
                callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to("successIds", arrayList2)))), null);
            } catch (Exception e11) {
                C44128b.m97262f(this.TAG, "deleteCalendarItem error", e11);
                String message = e11.getMessage();
                if (message == null) {
                    message = "Delete failed";
                }
                callback.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        }
    }

    @Override // e00.InterfaceC37010b
    public void getPermission(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(SystemCalendarManager.INSTANCE.checkPermission(ctx, "events_full"), null);
    }

    @Override // e00.InterfaceC37010b
    public void queryCalendar(@NotNull Context ctx, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        List<String> listEmptyList;
        List<SystemCalendarManager.EventItem> listEmptyList2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (checkPermissionOrError(ctx, callback)) {
            try {
                Object obj = data.get(TUIConstants.TIMPush.NOTIFICATION.ENTITY);
                String str = obj instanceof String ? (String) obj : null;
                String str2 = str == null ? "event" : str;
                Object obj2 = data.get("startAtMs");
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                long jLongValue = number != null ? number.longValue() : System.currentTimeMillis();
                Object obj3 = data.get("endAtMs");
                Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                long jLongValue2 = number2 != null ? number2.longValue() : 2592000000L + jLongValue;
                Object obj4 = data.get("calendarIds");
                List list = obj4 instanceof List ? (List) obj4 : null;
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
                Object obj5 = data.get("options");
                SystemCalendarManager.ReadOptions readOptions = parseReadOptions(obj5 instanceof Map ? (Map) obj5 : null);
                if (Intrinsics.areEqual(str2, "event")) {
                    listEmptyList2 = SystemCalendarManager.INSTANCE.readEvents(ctx, jLongValue, jLongValue2, listEmptyList, readOptions);
                } else {
                    if (!Intrinsics.areEqual(str2, NotificationCompat.CATEGORY_REMINDER)) {
                        throw new IllegalArgumentException("Invalid entity: " + str2);
                    }
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                callback.invoke(MapsKt.mapOf(TuplesKt.m90091to("ok", 1), TuplesKt.m90091to("data", MapsKt.mapOf(TuplesKt.m90091to(TUIConstants.TIMPush.NOTIFICATION.ENTITY, str2), TuplesKt.m90091to("itemsJson", this.gson.toJson(listEmptyList2))))), null);
            } catch (Exception e11) {
                C44128b.m97262f(this.TAG, "queryCalendar error", e11);
                String message = e11.getMessage();
                if (message == null) {
                    message = "Query failed";
                }
                callback.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        }
    }

    @Override // e00.InterfaceC37010b
    public void requestPermission(@NotNull Context ctx, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Activity currentActivity;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            if (ctx instanceof ReactApplicationContext) {
                currentActivity = ((ReactApplicationContext) ctx).getCurrentActivity();
            } else {
                currentActivity = ctx instanceof Activity ? (Activity) ctx : null;
            }
            if (currentActivity == null) {
                callback.invoke(null, new ProtocolException("Cannot get Activity from Context", null, null, false, 14, null));
                return;
            }
            if (!(currentActivity instanceof FragmentActivity)) {
                callback.invoke(null, new ProtocolException("Activity must be FragmentActivity", null, null, false, 14, null));
                return;
            }
            Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b((FragmentActivity) currentActivity), "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
            final Function1 function1 = new Function1() { // from class: com.kubi.rn.protocol.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCBridgeCalendarCallImp.requestPermission$lambda$0(callback, (Boolean) obj);
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.rn.protocol.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.rn.protocol.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCBridgeCalendarCallImp.requestPermission$lambda$2(this.f46106b, callback, (Throwable) obj);
                }
            };
            observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.rn.protocol.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
        } catch (Exception e11) {
            C44128b.m97262f(this.TAG, "requestPermission error", e11);
            String message = e11.getMessage();
            if (message == null) {
                message = "Request permission failed";
            }
            callback.invoke(null, new ProtocolException(message, null, null, false, 14, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$0(Function2 function2, Boolean bool) {
        if (bool.booleanValue()) {
            function2.invoke("authorized", null);
        } else {
            function2.invoke("denied", null);
        }
        return Unit.INSTANCE;
    }
}
