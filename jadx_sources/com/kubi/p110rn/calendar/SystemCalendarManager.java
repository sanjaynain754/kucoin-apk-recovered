package com.kubi.p110rn.calendar;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.calendar.SystemCalendarManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: SystemCalendarManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001f !\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005J:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/rn/calendar/SystemCalendarManager;", "", "<init>", "()V", "TAG", "", "checkPermission", "context", "Landroid/content/Context;", "scope", "hasCalendarPermission", "", "listCalendars", "", "Lcom/kubi/rn/calendar/SystemCalendarManager$CalendarItem;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "readEvents", "Lcom/kubi/rn/calendar/SystemCalendarManager$EventItem;", "startAtMs", "", "endAtMs", "calendarIds", "options", "Lcom/kubi/rn/calendar/SystemCalendarManager$ReadOptions;", "upsertEvent", "payload", "Lcom/kubi/rn/calendar/SystemCalendarManager$EventPayload;", "deleteEvent", "eventId", TtmlNode.TAG_SPAN, "getDefaultCalendarId", "CalendarItem", "EventItem", "ReadOptions", "EventPayload", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSystemCalendarManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCalendarManager.kt\ncom/kubi/rn/calendar/SystemCalendarManager\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,371:1\n37#2:372\n36#2,3:373\n1#3:376\n*S KotlinDebug\n*F\n+ 1 SystemCalendarManager.kt\ncom/kubi/rn/calendar/SystemCalendarManager\n*L\n222#1:372\n222#1:373,3\n*E\n"})
public final class SystemCalendarManager {

    @NotNull
    public static final SystemCalendarManager INSTANCE = new SystemCalendarManager();

    @NotNull
    private static final String TAG = "SystemCalendarManager";

    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\\\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/rn/calendar/SystemCalendarManager$CalendarItem;", "", "id", "", "title", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "source", "isReadOnly", "", "color", "timezone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getEntity", "getSource", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getColor", "getTimezone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/calendar/SystemCalendarManager$CalendarItem;", "equals", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CalendarItem {

        @SerializedName("color")
        @Nullable
        private final String color;

        @SerializedName(TUIConstants.TIMPush.NOTIFICATION.ENTITY)
        @NotNull
        private final String entity;

        @SerializedName("id")
        @NotNull
        private final String id;

        @SerializedName("isReadOnly")
        @Nullable
        private final Boolean isReadOnly;

        @SerializedName("source")
        @Nullable
        private final String source;

        @SerializedName("timezone")
        @Nullable
        private final String timezone;

        @SerializedName("title")
        @NotNull
        private final String title;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarItem)) {
                return false;
            }
            CalendarItem calendarItem = (CalendarItem) other;
            return Intrinsics.areEqual(this.id, calendarItem.id) && Intrinsics.areEqual(this.title, calendarItem.title) && Intrinsics.areEqual(this.entity, calendarItem.entity) && Intrinsics.areEqual(this.source, calendarItem.source) && Intrinsics.areEqual(this.isReadOnly, calendarItem.isReadOnly) && Intrinsics.areEqual(this.color, calendarItem.color) && Intrinsics.areEqual(this.timezone, calendarItem.timezone);
        }

        public CalendarItem(@NotNull String id2, @NotNull String title, @NotNull String entity, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.id = id2;
            this.title = title;
            this.entity = entity;
            this.source = str;
            this.isReadOnly = bool;
            this.color = str2;
            this.timezone = str3;
        }

        public static /* synthetic */ CalendarItem copy$default(CalendarItem calendarItem, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = calendarItem.id;
            }
            if ((i11 & 2) != 0) {
                str2 = calendarItem.title;
            }
            if ((i11 & 4) != 0) {
                str3 = calendarItem.entity;
            }
            if ((i11 & 8) != 0) {
                str4 = calendarItem.source;
            }
            if ((i11 & 16) != 0) {
                bool = calendarItem.isReadOnly;
            }
            if ((i11 & 32) != 0) {
                str5 = calendarItem.color;
            }
            if ((i11 & 64) != 0) {
                str6 = calendarItem.timezone;
            }
            String str7 = str5;
            String str8 = str6;
            Boolean bool2 = bool;
            String str9 = str3;
            return calendarItem.copy(str, str2, str9, str4, bool2, str7, str8);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEntity() {
            return this.entity;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getIsReadOnly() {
            return this.isReadOnly;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        @NotNull
        public final CalendarItem copy(@NotNull String id2, @NotNull String title, @NotNull String entity, @Nullable String source, @Nullable Boolean isReadOnly, @Nullable String color, @Nullable String timezone) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(entity, "entity");
            return new CalendarItem(id2, title, entity, source, isReadOnly, color, timezone);
        }

        @Nullable
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getEntity() {
            return this.entity;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }

        @Nullable
        public final String getTimezone() {
            return this.timezone;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.entity.hashCode()) * 31;
            String str = this.source;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isReadOnly;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.color;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.timezone;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Nullable
        public final Boolean isReadOnly() {
            return this.isReadOnly;
        }

        @NotNull
        public String toString() {
            return "CalendarItem(id=" + this.id + ", title=" + this.title + ", entity=" + this.entity + ", source=" + this.source + ", isReadOnly=" + this.isReadOnly + ", color=" + this.color + ", timezone=" + this.timezone + ')';
        }
    }

    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u008b\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u00064"}, m90084d2 = {"Lcom/kubi/rn/calendar/SystemCalendarManager$EventItem;", "", "id", "", "calendarId", "title", "startAtMs", "", "endAtMs", "allDay", "", "timezone", "notes", FirebaseAnalytics.Param.LOCATION, "url", "rrule", "hasAlarm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getCalendarId", "getTitle", "getStartAtMs", "()J", "getEndAtMs", "getAllDay", "()Z", "getTimezone", "getNotes", "getLocation", "getUrl", "getRrule", "getHasAlarm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class EventItem {

        @SerializedName("allDay")
        private final boolean allDay;

        @SerializedName("calendarId")
        @NotNull
        private final String calendarId;

        @SerializedName("endAtMs")
        private final long endAtMs;

        @SerializedName("hasAlarm")
        private final boolean hasAlarm;

        @SerializedName("id")
        @NotNull
        private final String id;

        @SerializedName(FirebaseAnalytics.Param.LOCATION)
        @Nullable
        private final String location;

        @SerializedName("notes")
        @Nullable
        private final String notes;

        @SerializedName("rrule")
        @Nullable
        private final String rrule;

        @SerializedName("startAtMs")
        private final long startAtMs;

        @SerializedName("timezone")
        @Nullable
        private final String timezone;

        @SerializedName("title")
        @NotNull
        private final String title;

        @SerializedName("url")
        @Nullable
        private final String url;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventItem)) {
                return false;
            }
            EventItem eventItem = (EventItem) other;
            return Intrinsics.areEqual(this.id, eventItem.id) && Intrinsics.areEqual(this.calendarId, eventItem.calendarId) && Intrinsics.areEqual(this.title, eventItem.title) && this.startAtMs == eventItem.startAtMs && this.endAtMs == eventItem.endAtMs && this.allDay == eventItem.allDay && Intrinsics.areEqual(this.timezone, eventItem.timezone) && Intrinsics.areEqual(this.notes, eventItem.notes) && Intrinsics.areEqual(this.location, eventItem.location) && Intrinsics.areEqual(this.url, eventItem.url) && Intrinsics.areEqual(this.rrule, eventItem.rrule) && this.hasAlarm == eventItem.hasAlarm;
        }

        public EventItem(@NotNull String id2, @NotNull String calendarId, @NotNull String title, long j11, long j12, boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z12) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(calendarId, "calendarId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id2;
            this.calendarId = calendarId;
            this.title = title;
            this.startAtMs = j11;
            this.endAtMs = j12;
            this.allDay = z11;
            this.timezone = str;
            this.notes = str2;
            this.location = str3;
            this.url = str4;
            this.rrule = str5;
            this.hasAlarm = z12;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getRrule() {
            return this.rrule;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getHasAlarm() {
            return this.hasAlarm;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCalendarId() {
            return this.calendarId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getStartAtMs() {
            return this.startAtMs;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getEndAtMs() {
            return this.endAtMs;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getAllDay() {
            return this.allDay;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @NotNull
        public final EventItem copy(@NotNull String id2, @NotNull String calendarId, @NotNull String title, long startAtMs, long endAtMs, boolean allDay, @Nullable String timezone, @Nullable String notes, @Nullable String location, @Nullable String url, @Nullable String rrule, boolean hasAlarm) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(calendarId, "calendarId");
            Intrinsics.checkNotNullParameter(title, "title");
            return new EventItem(id2, calendarId, title, startAtMs, endAtMs, allDay, timezone, notes, location, url, rrule, hasAlarm);
        }

        public final boolean getAllDay() {
            return this.allDay;
        }

        @NotNull
        public final String getCalendarId() {
            return this.calendarId;
        }

        public final long getEndAtMs() {
            return this.endAtMs;
        }

        public final boolean getHasAlarm() {
            return this.hasAlarm;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getLocation() {
            return this.location;
        }

        @Nullable
        public final String getNotes() {
            return this.notes;
        }

        @Nullable
        public final String getRrule() {
            return this.rrule;
        }

        public final long getStartAtMs() {
            return this.startAtMs;
        }

        @Nullable
        public final String getTimezone() {
            return this.timezone;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + this.calendarId.hashCode()) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.startAtMs)) * 31) + Long.hashCode(this.endAtMs)) * 31) + Boolean.hashCode(this.allDay)) * 31;
            String str = this.timezone;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.notes;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.location;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.url;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.rrule;
            return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasAlarm);
        }

        @NotNull
        public String toString() {
            return "EventItem(id=" + this.id + ", calendarId=" + this.calendarId + ", title=" + this.title + ", startAtMs=" + this.startAtMs + ", endAtMs=" + this.endAtMs + ", allDay=" + this.allDay + ", timezone=" + this.timezone + ", notes=" + this.notes + ", location=" + this.location + ", url=" + this.url + ", rrule=" + this.rrule + ", hasAlarm=" + this.hasAlarm + ')';
        }
    }

    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¤\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00069"}, m90084d2 = {"Lcom/kubi/rn/calendar/SystemCalendarManager$EventPayload;", "", "id", "", "title", "startAtMs", "", "endAtMs", "allDay", "", "timezone", "notes", FirebaseAnalytics.Param.LOCATION, "url", "calendarId", "alarmsJson", "recurrenceJson", "attendeesJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getStartAtMs", "()J", "getEndAtMs", "getAllDay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimezone", "getNotes", "getLocation", "getUrl", "getCalendarId", "getAlarmsJson", "getRecurrenceJson", "getAttendeesJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/calendar/SystemCalendarManager$EventPayload;", "equals", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class EventPayload {

        @SerializedName("alarmsJson")
        @Nullable
        private final String alarmsJson;

        @SerializedName("allDay")
        @Nullable
        private final Boolean allDay;

        @SerializedName("attendeesJson")
        @Nullable
        private final String attendeesJson;

        @SerializedName("calendarId")
        @Nullable
        private final String calendarId;

        @SerializedName("endAtMs")
        private final long endAtMs;

        @SerializedName("id")
        @Nullable
        private final String id;

        @SerializedName(FirebaseAnalytics.Param.LOCATION)
        @Nullable
        private final String location;

        @SerializedName("notes")
        @Nullable
        private final String notes;

        @SerializedName("recurrenceJson")
        @Nullable
        private final String recurrenceJson;

        @SerializedName("startAtMs")
        private final long startAtMs;

        @SerializedName("timezone")
        @Nullable
        private final String timezone;

        @SerializedName("title")
        @NotNull
        private final String title;

        @SerializedName("url")
        @Nullable
        private final String url;

        public EventPayload(@Nullable String str, @NotNull String title, long j11, long j12, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = str;
            this.title = title;
            this.startAtMs = j11;
            this.endAtMs = j12;
            this.allDay = bool;
            this.timezone = str2;
            this.notes = str3;
            this.location = str4;
            this.url = str5;
            this.calendarId = str6;
            this.alarmsJson = str7;
            this.recurrenceJson = str8;
            this.attendeesJson = str9;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventPayload)) {
                return false;
            }
            EventPayload eventPayload = (EventPayload) other;
            return Intrinsics.areEqual(this.id, eventPayload.id) && Intrinsics.areEqual(this.title, eventPayload.title) && this.startAtMs == eventPayload.startAtMs && this.endAtMs == eventPayload.endAtMs && Intrinsics.areEqual(this.allDay, eventPayload.allDay) && Intrinsics.areEqual(this.timezone, eventPayload.timezone) && Intrinsics.areEqual(this.notes, eventPayload.notes) && Intrinsics.areEqual(this.location, eventPayload.location) && Intrinsics.areEqual(this.url, eventPayload.url) && Intrinsics.areEqual(this.calendarId, eventPayload.calendarId) && Intrinsics.areEqual(this.alarmsJson, eventPayload.alarmsJson) && Intrinsics.areEqual(this.recurrenceJson, eventPayload.recurrenceJson) && Intrinsics.areEqual(this.attendeesJson, eventPayload.attendeesJson);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getCalendarId() {
            return this.calendarId;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getAlarmsJson() {
            return this.alarmsJson;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getRecurrenceJson() {
            return this.recurrenceJson;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getAttendeesJson() {
            return this.attendeesJson;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getStartAtMs() {
            return this.startAtMs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getEndAtMs() {
            return this.endAtMs;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getAllDay() {
            return this.allDay;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final EventPayload copy(@Nullable String id2, @NotNull String title, long startAtMs, long endAtMs, @Nullable Boolean allDay, @Nullable String timezone, @Nullable String notes, @Nullable String location, @Nullable String url, @Nullable String calendarId, @Nullable String alarmsJson, @Nullable String recurrenceJson, @Nullable String attendeesJson) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new EventPayload(id2, title, startAtMs, endAtMs, allDay, timezone, notes, location, url, calendarId, alarmsJson, recurrenceJson, attendeesJson);
        }

        @Nullable
        public final String getAlarmsJson() {
            return this.alarmsJson;
        }

        @Nullable
        public final Boolean getAllDay() {
            return this.allDay;
        }

        @Nullable
        public final String getAttendeesJson() {
            return this.attendeesJson;
        }

        @Nullable
        public final String getCalendarId() {
            return this.calendarId;
        }

        public final long getEndAtMs() {
            return this.endAtMs;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getLocation() {
            return this.location;
        }

        @Nullable
        public final String getNotes() {
            return this.notes;
        }

        @Nullable
        public final String getRecurrenceJson() {
            return this.recurrenceJson;
        }

        public final long getStartAtMs() {
            return this.startAtMs;
        }

        @Nullable
        public final String getTimezone() {
            return this.timezone;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.startAtMs)) * 31) + Long.hashCode(this.endAtMs)) * 31;
            Boolean bool = this.allDay;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.timezone;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.notes;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.location;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.url;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.calendarId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.alarmsJson;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.recurrenceJson;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.attendeesJson;
            return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "EventPayload(id=" + this.id + ", title=" + this.title + ", startAtMs=" + this.startAtMs + ", endAtMs=" + this.endAtMs + ", allDay=" + this.allDay + ", timezone=" + this.timezone + ", notes=" + this.notes + ", location=" + this.location + ", url=" + this.url + ", calendarId=" + this.calendarId + ", alarmsJson=" + this.alarmsJson + ", recurrenceJson=" + this.recurrenceJson + ", attendeesJson=" + this.attendeesJson + ')';
        }

        public /* synthetic */ EventPayload(String str, String str2, long j11, long j12, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, j11, j12, (i11 & 16) != 0 ? Boolean.FALSE : bool, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10);
        }
    }

    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015¨\u0006'"}, m90084d2 = {"Lcom/kubi/rn/calendar/SystemCalendarManager$ReadOptions;", "", TUIConstants.TUIContact.LIMIT, "", InterfaceC33953u5.f72198E, "", "keyword", "includeCompleted", "", "dueOnly", "includeDeclined", "includeCanceled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCursor", "()Ljava/lang/String;", "getKeyword", "getIncludeCompleted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDueOnly", "getIncludeDeclined", "getIncludeCanceled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/rn/calendar/SystemCalendarManager$ReadOptions;", "equals", "other", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ReadOptions {

        @SerializedName(InterfaceC33953u5.f72198E)
        @Nullable
        private final String cursor;

        @SerializedName("dueOnly")
        @Nullable
        private final Boolean dueOnly;

        @SerializedName("includeCanceled")
        @Nullable
        private final Boolean includeCanceled;

        @SerializedName("includeCompleted")
        @Nullable
        private final Boolean includeCompleted;

        @SerializedName("includeDeclined")
        @Nullable
        private final Boolean includeDeclined;

        @SerializedName("keyword")
        @Nullable
        private final String keyword;

        @SerializedName(TUIConstants.TUIContact.LIMIT)
        @Nullable
        private final Integer limit;

        public ReadOptions() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadOptions)) {
                return false;
            }
            ReadOptions readOptions = (ReadOptions) other;
            return Intrinsics.areEqual(this.limit, readOptions.limit) && Intrinsics.areEqual(this.cursor, readOptions.cursor) && Intrinsics.areEqual(this.keyword, readOptions.keyword) && Intrinsics.areEqual(this.includeCompleted, readOptions.includeCompleted) && Intrinsics.areEqual(this.dueOnly, readOptions.dueOnly) && Intrinsics.areEqual(this.includeDeclined, readOptions.includeDeclined) && Intrinsics.areEqual(this.includeCanceled, readOptions.includeCanceled);
        }

        public ReadOptions(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
            this.limit = num;
            this.cursor = str;
            this.keyword = str2;
            this.includeCompleted = bool;
            this.dueOnly = bool2;
            this.includeDeclined = bool3;
            this.includeCanceled = bool4;
        }

        public static /* synthetic */ ReadOptions copy$default(ReadOptions readOptions, Integer num, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = readOptions.limit;
            }
            if ((i11 & 2) != 0) {
                str = readOptions.cursor;
            }
            if ((i11 & 4) != 0) {
                str2 = readOptions.keyword;
            }
            if ((i11 & 8) != 0) {
                bool = readOptions.includeCompleted;
            }
            if ((i11 & 16) != 0) {
                bool2 = readOptions.dueOnly;
            }
            if ((i11 & 32) != 0) {
                bool3 = readOptions.includeDeclined;
            }
            if ((i11 & 64) != 0) {
                bool4 = readOptions.includeCanceled;
            }
            Boolean bool5 = bool3;
            Boolean bool6 = bool4;
            Boolean bool7 = bool2;
            String str3 = str2;
            return readOptions.copy(num, str, str3, bool, bool7, bool5, bool6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getLimit() {
            return this.limit;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCursor() {
            return this.cursor;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getKeyword() {
            return this.keyword;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getIncludeCompleted() {
            return this.includeCompleted;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getDueOnly() {
            return this.dueOnly;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIncludeDeclined() {
            return this.includeDeclined;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getIncludeCanceled() {
            return this.includeCanceled;
        }

        @NotNull
        public final ReadOptions copy(@Nullable Integer limit, @Nullable String cursor, @Nullable String keyword, @Nullable Boolean includeCompleted, @Nullable Boolean dueOnly, @Nullable Boolean includeDeclined, @Nullable Boolean includeCanceled) {
            return new ReadOptions(limit, cursor, keyword, includeCompleted, dueOnly, includeDeclined, includeCanceled);
        }

        @Nullable
        public final String getCursor() {
            return this.cursor;
        }

        @Nullable
        public final Boolean getDueOnly() {
            return this.dueOnly;
        }

        @Nullable
        public final Boolean getIncludeCanceled() {
            return this.includeCanceled;
        }

        @Nullable
        public final Boolean getIncludeCompleted() {
            return this.includeCompleted;
        }

        @Nullable
        public final Boolean getIncludeDeclined() {
            return this.includeDeclined;
        }

        @Nullable
        public final String getKeyword() {
            return this.keyword;
        }

        @Nullable
        public final Integer getLimit() {
            return this.limit;
        }

        public int hashCode() {
            Integer num = this.limit;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.cursor;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.keyword;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.includeCompleted;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.dueOnly;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.includeDeclined;
            int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.includeCanceled;
            return iHashCode6 + (bool4 != null ? bool4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReadOptions(limit=" + this.limit + ", cursor=" + this.cursor + ", keyword=" + this.keyword + ", includeCompleted=" + this.includeCompleted + ", dueOnly=" + this.dueOnly + ", includeDeclined=" + this.includeDeclined + ", includeCanceled=" + this.includeCanceled + ')';
        }

        public /* synthetic */ ReadOptions(Integer num, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? Boolean.FALSE : bool2, (i11 & 32) != 0 ? Boolean.FALSE : bool3, (i11 & 64) != 0 ? Boolean.FALSE : bool4);
        }
    }

    @NotNull
    public final List<CalendarItem> listCalendars(@NotNull Context context, @NotNull String entity) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        String entity2 = entity;
        Intrinsics.checkNotNullParameter(entity2, "entity");
        if (!hasCalendarPermission(context)) {
            C44128b.m97266j(TAG, "listCalendars: no permission");
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id", "calendar_displayName", "account_name", "calendar_access_level", "calendar_color", "calendar_timezone", "deleted", ViewProps.VISIBLE}, "(deleted != 1 OR deleted IS NULL) AND visible = 1", null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "Unknown";
                        }
                        String string3 = cursorQuery.getString(2);
                        int i11 = cursorQuery.getInt(3);
                        int i12 = cursorQuery.getInt(4);
                        String string4 = cursorQuery.getString(5);
                        int i13 = cursorQuery.getInt(6);
                        int i14 = cursorQuery.getInt(7);
                        if (i13 == 1 || i14 != 1) {
                            C44128b.m97266j(TAG, "Skipping deleted/hidden calendar: id=" + string + ", deleted=" + i13 + ", visible=" + i14);
                        } else {
                            if (string3 == null || !StringsKt.contains((CharSequence) string3, (CharSequence) "google", true)) {
                                str = (string3 == null || !StringsKt.contains((CharSequence) string3, (CharSequence) "exchange", true)) ? ImagesContract.LOCAL : "exchange";
                            } else {
                                str = "google";
                            }
                            boolean z11 = i11 < 500;
                            Intrinsics.checkNotNull(string);
                            Boolean boolValueOf = Boolean.valueOf(z11);
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i12 & 16777215)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                            arrayList.add(new CalendarItem(string, string2, entity2, str, boolValueOf, str2, string4));
                        }
                        entity2 = entity;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                return arrayList;
            }
        } catch (Exception e11) {
            C44128b.m97270n(TAG, "listCalendars error: " + e11.getMessage());
        }
        return arrayList;
    }

    private final String getDefaultCalendarId(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id"}, "calendar_access_level >= ?", new String[]{"500"}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    CloseableKt.closeFinally(cursorQuery, null);
                    return string;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        throw new IllegalStateException("No writable calendar found");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence readEvents$lambda$3$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "?";
    }

    @NotNull
    public final String checkPermission(@NotNull Context context, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0 ? "authorized" : "notDetermined";
    }

    public final boolean deleteEvent(@NotNull Context context, @NotNull String eventId, @NotNull String span) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(span, "span");
        if (!hasCalendarPermission(context)) {
            throw new SecurityException("Calendar permission not granted");
        }
        try {
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(eventId));
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
            return context.getContentResolver().delete(uriWithAppendedId, null, null) > 0;
        } catch (Exception e11) {
            C44128b.m97270n(TAG, "deleteEvent error: " + e11.getMessage());
            return false;
        }
    }

    public final boolean hasCalendarPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") == 0;
    }

    @NotNull
    public final List<EventItem> readEvents(@NotNull Context context, long startAtMs, long endAtMs, @NotNull List<String> calendarIds, @NotNull ReadOptions options) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(calendarIds, "calendarIds");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!hasCalendarPermission(context)) {
            C44128b.m97266j(TAG, "readEvents: no permission");
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"_id", "calendar_id", "title", "dtstart", "dtend", "allDay", "eventTimezone", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "eventLocation", "rrule", "hasAlarm", "deleted"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(dtstart >= ? AND dtstart <= ?)");
        sb2.append(" AND (deleted != 1 OR deleted IS NULL)");
        if (!calendarIds.isEmpty()) {
            sb2.append(" AND calendar_id IN (" + CollectionsKt.joinToString$default(calendarIds, ",", null, null, 0, null, new Function1() { // from class: nx.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SystemCalendarManager.readEvents$lambda$3$lambda$1((String) obj);
                }
            }, 30, null) + ')');
        }
        if (options.getKeyword() != null) {
            sb2.append(" AND (title LIKE ? OR description LIKE ?)");
        }
        String string = sb2.toString();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(String.valueOf(startAtMs));
        listCreateListBuilder.add(String.valueOf(endAtMs));
        listCreateListBuilder.addAll(calendarIds);
        String keyword = options.getKeyword();
        if (keyword != null) {
            listCreateListBuilder.add('%' + keyword + '%');
            listCreateListBuilder.add('%' + keyword + '%');
        }
        String[] strArr2 = (String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]);
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = CalendarContract.Events.CONTENT_URI;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("dtstart ASC");
            Integer limit = options.getLimit();
            if (limit != null) {
                str = " LIMIT " + limit.intValue();
                if (str == null) {
                    str = "";
                }
                C44128b.m97270n(TAG, "readEvents error: " + e.getMessage());
                return arrayList;
            }
            str = "";
            sb3.append(str);
            Cursor cursorQuery = contentResolver.query(uri, strArr, string, strArr2, sb3.toString());
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String string2 = cursorQuery.getString(0);
                        String string3 = cursorQuery.getString(1);
                        String string4 = cursorQuery.getString(2);
                        if (string4 == null) {
                            string4 = "No Title";
                        }
                        String str2 = string4;
                        long j11 = cursorQuery.getLong(3);
                        long j12 = cursorQuery.getLong(4);
                        boolean z11 = cursorQuery.getInt(5) == 1;
                        String string5 = cursorQuery.getString(6);
                        String string6 = cursorQuery.getString(7);
                        String string7 = cursorQuery.getString(8);
                        String string8 = cursorQuery.getString(9);
                        boolean z12 = cursorQuery.getInt(10) == 1;
                        if (cursorQuery.getInt(11) == 1) {
                            C44128b.m97266j(TAG, "Skipping deleted event: id=" + string2);
                        } else {
                            Intrinsics.checkNotNull(string2);
                            Intrinsics.checkNotNull(string3);
                            arrayList.add(new EventItem(string2, string3, str2, j11, j12, z11, string5, string6, string7, null, string8, z12));
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                return arrayList;
            }
        } catch (Exception e11) {
            C44128b.m97270n(TAG, "readEvents error: " + e11.getMessage());
        }
        return arrayList;
    }

    @NotNull
    public final String upsertEvent(@NotNull Context context, @NotNull EventPayload payload) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!hasCalendarPermission(context)) {
            throw new SecurityException("Calendar permission not granted");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", payload.getTitle());
        contentValues.put("dtstart", Long.valueOf(payload.getStartAtMs()));
        contentValues.put("dtend", Long.valueOf(payload.getEndAtMs()));
        contentValues.put("allDay", Integer.valueOf(Intrinsics.areEqual(payload.getAllDay(), Boolean.TRUE) ? 1 : 0));
        String timezone = payload.getTimezone();
        if (timezone == null) {
            timezone = TimeZone.getDefault().getID();
        }
        contentValues.put("eventTimezone", timezone);
        contentValues.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, payload.getNotes());
        contentValues.put("eventLocation", payload.getLocation());
        String calendarId = payload.getCalendarId();
        if (calendarId == null) {
            calendarId = INSTANCE.getDefaultCalendarId(context);
        }
        contentValues.put("calendar_id", calendarId);
        payload.getRecurrenceJson();
        if (payload.getId() != null) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(payload.getId()));
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
            context.getContentResolver().update(uriWithAppendedId, contentValues, null, null);
            return payload.getId();
        }
        Uri uriInsert = context.getContentResolver().insert(CalendarContract.Events.CONTENT_URI, contentValues);
        if (uriInsert == null || (lastPathSegment = uriInsert.getLastPathSegment()) == null) {
            throw new IllegalStateException("Failed to insert event");
        }
        return lastPathSegment;
    }

    private SystemCalendarManager() {
    }
}
