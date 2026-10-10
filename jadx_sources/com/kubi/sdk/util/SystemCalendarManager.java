package com.kubi.sdk.util;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
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
import p852kotlin.p407io.CloseableKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.m1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SystemCalendarManager.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001f !\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005J:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/util/SystemCalendarManager;", "", "<init>", "()V", "TAG", "", "checkPermission", "context", "Landroid/content/Context;", "scope", "hasCalendarPermission", "", "listCalendars", "", "Lcom/kubi/sdk/util/SystemCalendarManager$CalendarItem;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "readEvents", "Lcom/kubi/sdk/util/SystemCalendarManager$EventItem;", "startAtMs", "", "endAtMs", "calendarIds", "options", "Lcom/kubi/sdk/util/SystemCalendarManager$ReadOptions;", "upsertEvent", "payload", "Lcom/kubi/sdk/util/SystemCalendarManager$EventPayload;", "deleteEvent", "eventId", TtmlNode.TAG_SPAN, "getDefaultCalendarId", "CalendarItem", "EventItem", "ReadOptions", "EventPayload", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSystemCalendarManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCalendarManager.kt\ncom/kubi/sdk/util/SystemCalendarManager\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,371:1\n37#2:372\n36#2,3:373\n1#3:376\n*S KotlinDebug\n*F\n+ 1 SystemCalendarManager.kt\ncom/kubi/sdk/util/SystemCalendarManager\n*L\n222#1:372\n222#1:373,3\n*E\n"})
public final class SystemCalendarManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SystemCalendarManager f48218a = new SystemCalendarManager();

    /* JADX INFO: renamed from: com.kubi.sdk.util.m1$a, reason: from toString */
    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u008b\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u00064"}, m90084d2 = {"Lcom/kubi/sdk/util/SystemCalendarManager$EventItem;", "", "id", "", "calendarId", "title", "startAtMs", "", "endAtMs", "allDay", "", "timezone", "notes", FirebaseAnalytics.Param.LOCATION, "url", "rrule", "hasAlarm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getCalendarId", "getTitle", "getStartAtMs", "()J", "getEndAtMs", "getAllDay", "()Z", "getTimezone", "getNotes", "getLocation", "getUrl", "getRrule", "getHasAlarm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class EventItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @SerializedName("id")
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from toString */
        @SerializedName("calendarId")
        @NotNull
        public final String calendarId;

        /* JADX INFO: renamed from: c, reason: from toString */
        @SerializedName("title")
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: d, reason: from toString */
        @SerializedName("startAtMs")
        public final long startAtMs;

        /* JADX INFO: renamed from: e, reason: from toString */
        @SerializedName("endAtMs")
        public final long endAtMs;

        /* JADX INFO: renamed from: f, reason: from toString */
        @SerializedName("allDay")
        public final boolean allDay;

        /* JADX INFO: renamed from: g, reason: from toString */
        @SerializedName("timezone")
        @Nullable
        public final String timezone;

        /* JADX INFO: renamed from: h, reason: from toString */
        @SerializedName("notes")
        @Nullable
        public final String notes;

        /* JADX INFO: renamed from: i, reason: from toString */
        @SerializedName(FirebaseAnalytics.Param.LOCATION)
        @Nullable
        public final String location;

        /* JADX INFO: renamed from: j, reason: from toString */
        @SerializedName("url")
        @Nullable
        public final String url;

        /* JADX INFO: renamed from: k, reason: from toString */
        @SerializedName("rrule")
        @Nullable
        public final String rrule;

        /* JADX INFO: renamed from: l, reason: from toString */
        @SerializedName("hasAlarm")
        public final boolean hasAlarm;

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

    /* JADX INFO: renamed from: com.kubi.sdk.util.m1$b, reason: from toString */
    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¤\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00069"}, m90084d2 = {"Lcom/kubi/sdk/util/SystemCalendarManager$EventPayload;", "", "id", "", "title", "startAtMs", "", "endAtMs", "allDay", "", "timezone", "notes", FirebaseAnalytics.Param.LOCATION, "url", "calendarId", "alarmsJson", "recurrenceJson", "attendeesJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getStartAtMs", "()J", "getEndAtMs", "getAllDay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimezone", "getNotes", "getLocation", "getUrl", "getCalendarId", "getAlarmsJson", "getRecurrenceJson", "getAttendeesJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/util/SystemCalendarManager$EventPayload;", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class EventPayload {

        /* JADX INFO: renamed from: a, reason: from toString */
        @SerializedName("id")
        @Nullable
        public final String id;

        /* JADX INFO: renamed from: b, reason: from toString */
        @SerializedName("title")
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: c, reason: from toString */
        @SerializedName("startAtMs")
        public final long startAtMs;

        /* JADX INFO: renamed from: d, reason: from toString */
        @SerializedName("endAtMs")
        public final long endAtMs;

        /* JADX INFO: renamed from: e, reason: from toString */
        @SerializedName("allDay")
        @Nullable
        public final Boolean allDay;

        /* JADX INFO: renamed from: f, reason: from toString */
        @SerializedName("timezone")
        @Nullable
        public final String timezone;

        /* JADX INFO: renamed from: g, reason: from toString */
        @SerializedName("notes")
        @Nullable
        public final String notes;

        /* JADX INFO: renamed from: h, reason: from toString */
        @SerializedName(FirebaseAnalytics.Param.LOCATION)
        @Nullable
        public final String location;

        /* JADX INFO: renamed from: i, reason: from toString */
        @SerializedName("url")
        @Nullable
        public final String url;

        /* JADX INFO: renamed from: j, reason: from toString */
        @SerializedName("calendarId")
        @Nullable
        public final String calendarId;

        /* JADX INFO: renamed from: k, reason: from toString */
        @SerializedName("alarmsJson")
        @Nullable
        public final String alarmsJson;

        /* JADX INFO: renamed from: l, reason: from toString */
        @SerializedName("recurrenceJson")
        @Nullable
        public final String recurrenceJson;

        /* JADX INFO: renamed from: m, reason: from toString */
        @SerializedName("attendeesJson")
        @Nullable
        public final String attendeesJson;

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

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getAllDay() {
            return this.allDay;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCalendarId() {
            return this.calendarId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getEndAtMs() {
            return this.endAtMs;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getRecurrenceJson() {
            return this.recurrenceJson;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getStartAtMs() {
            return this.startAtMs;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public String toString() {
            return "EventPayload(id=" + this.id + ", title=" + this.title + ", startAtMs=" + this.startAtMs + ", endAtMs=" + this.endAtMs + ", allDay=" + this.allDay + ", timezone=" + this.timezone + ", notes=" + this.notes + ", location=" + this.location + ", url=" + this.url + ", calendarId=" + this.calendarId + ", alarmsJson=" + this.alarmsJson + ", recurrenceJson=" + this.recurrenceJson + ", attendeesJson=" + this.attendeesJson + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.m1$c, reason: from toString */
    /* JADX INFO: compiled from: SystemCalendarManager.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/util/SystemCalendarManager$ReadOptions;", "", TUIConstants.TUIContact.LIMIT, "", InterfaceC33953u5.f72198E, "", "keyword", "includeCompleted", "", "dueOnly", "includeDeclined", "includeCanceled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCursor", "()Ljava/lang/String;", "getKeyword", "getIncludeCompleted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDueOnly", "getIncludeDeclined", "getIncludeCanceled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/sdk/util/SystemCalendarManager$ReadOptions;", "equals", "other", "hashCode", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ReadOptions {

        /* JADX INFO: renamed from: a, reason: from toString */
        @SerializedName(TUIConstants.TUIContact.LIMIT)
        @Nullable
        public final Integer limit;

        /* JADX INFO: renamed from: b, reason: from toString */
        @SerializedName(InterfaceC33953u5.f72198E)
        @Nullable
        public final String cursor;

        /* JADX INFO: renamed from: c, reason: from toString */
        @SerializedName("keyword")
        @Nullable
        public final String keyword;

        /* JADX INFO: renamed from: d, reason: from toString */
        @SerializedName("includeCompleted")
        @Nullable
        public final Boolean includeCompleted;

        /* JADX INFO: renamed from: e, reason: from toString */
        @SerializedName("dueOnly")
        @Nullable
        public final Boolean dueOnly;

        /* JADX INFO: renamed from: f, reason: from toString */
        @SerializedName("includeDeclined")
        @Nullable
        public final Boolean includeDeclined;

        /* JADX INFO: renamed from: g, reason: from toString */
        @SerializedName("includeCanceled")
        @Nullable
        public final Boolean includeCanceled;

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

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKeyword() {
            return this.keyword;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
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

    /* JADX INFO: renamed from: g */
    public static final CharSequence m58489g(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "?";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m58490b(@NotNull Context context, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0 ? "authorized" : "notDetermined";
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58491c(@NotNull Context context, @NotNull String eventId, @NotNull String span) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(span, "span");
        if (!m58493e(context)) {
            throw new SecurityException("Calendar permission not granted");
        }
        try {
            Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Long.parseLong(eventId));
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
            return context.getContentResolver().delete(uriWithAppendedId, null, null) > 0;
        } catch (Exception e11) {
            C44128b.m97270n("SystemCalendarManager", "deleteEvent error: " + e11.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m58492d(Context context) {
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

    /* JADX INFO: renamed from: e */
    public final boolean m58493e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<EventItem> m58494f(@NotNull Context context, long j11, long j12, @NotNull List<String> calendarIds, @NotNull ReadOptions options) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(calendarIds, "calendarIds");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!m58493e(context)) {
            C44128b.m97266j("SystemCalendarManager", "readEvents: no permission");
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"_id", "calendar_id", "title", "dtstart", "dtend", "allDay", "eventTimezone", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "eventLocation", "rrule", "hasAlarm", "deleted"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(dtstart >= ? AND dtstart <= ?)");
        sb2.append(" AND (deleted != 1 OR deleted IS NULL)");
        if (!calendarIds.isEmpty()) {
            sb2.append(" AND calendar_id IN (" + CollectionsKt.joinToString$default(calendarIds, ",", null, null, 0, null, new Function1() { // from class: com.kubi.sdk.util.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SystemCalendarManager.m58489g((String) obj);
                }
            }, 30, null) + ')');
        }
        if (options.getKeyword() != null) {
            sb2.append(" AND (title LIKE ? OR description LIKE ?)");
        }
        String string = sb2.toString();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(String.valueOf(j11));
        listCreateListBuilder.add(String.valueOf(j12));
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
                C44128b.m97270n("SystemCalendarManager", "readEvents error: " + e.getMessage());
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
                        long j13 = cursorQuery.getLong(3);
                        long j14 = cursorQuery.getLong(4);
                        boolean z11 = cursorQuery.getInt(5) == 1;
                        String string5 = cursorQuery.getString(6);
                        String string6 = cursorQuery.getString(7);
                        String string7 = cursorQuery.getString(8);
                        String string8 = cursorQuery.getString(9);
                        boolean z12 = cursorQuery.getInt(10) == 1;
                        if (cursorQuery.getInt(11) == 1) {
                            C44128b.m97266j("SystemCalendarManager", "Skipping deleted event: id=" + string2);
                        } else {
                            Intrinsics.checkNotNull(string2);
                            Intrinsics.checkNotNull(string3);
                            arrayList.add(new EventItem(string2, string3, str2, j13, j14, z11, string5, string6, string7, null, string8, z12));
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
            C44128b.m97270n("SystemCalendarManager", "readEvents error: " + e11.getMessage());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m58495h(@NotNull Context context, @NotNull EventPayload payload) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!m58493e(context)) {
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
            calendarId = f48218a.m58492d(context);
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
}
