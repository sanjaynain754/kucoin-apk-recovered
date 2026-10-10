package support.ada.embed.widget;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lsupport/ada/embed/widget/Event;", "", "Lorg/json/JSONObject;", TUIConstants.TUIContact.USER_DATA, "", "chatterTranscript", "eventName", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "getUserData", "()Lorg/json/JSONObject;", "b", "Ljava/lang/String;", "getChatterTranscript", "c", "d", "Companion", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
public final /* data */ class Event {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final JSONObject userData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String chatterTranscript;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String eventName;

    /* JADX INFO: compiled from: Event.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lsupport/ada/embed/widget/Event$Companion;", "", "()V", "CHATTER_TRANSCRIPT", "", "EVENT_NAME", "USER_DATA", "from", "Lsupport/ada/embed/widget/Event;", "event", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 1, 15})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Event from(@NotNull String event) {
            JSONObject jSONObject = new JSONObject(event);
            return new Event(jSONObject.optJSONObject(TrafficInfoTable.COLUMN_USERDATA), jSONObject.optString("chatter_transcript"), jSONObject.optString("event_name"));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.areEqual(this.userData, event.userData) && Intrinsics.areEqual(this.chatterTranscript, event.chatterTranscript) && Intrinsics.areEqual(this.eventName, event.eventName);
    }

    public int hashCode() {
        JSONObject jSONObject = this.userData;
        int iHashCode = (jSONObject != null ? jSONObject.hashCode() : 0) * 31;
        String str = this.chatterTranscript;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.eventName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Event(userData=" + this.userData + ", chatterTranscript=" + this.chatterTranscript + ", eventName=" + this.eventName + ")";
    }

    public Event(@Nullable JSONObject jSONObject, @Nullable String str, @Nullable String str2) {
        this.userData = jSONObject;
        this.chatterTranscript = str;
        this.eventName = str2;
    }
}
