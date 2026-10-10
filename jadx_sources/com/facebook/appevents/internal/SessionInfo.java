package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SessionInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001,B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR$\u0010!\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b \u0010\u0014R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*¨\u0006-"}, m90084d2 = {"Lcom/facebook/appevents/internal/SessionInfo;", "", "", "sessionStartTime", "sessionLastEventTime", "Ljava/util/UUID;", "sessionId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()V", "m", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Long;", "getSessionStartTime", "()Ljava/lang/Long;", "b", "e", "k", "(Ljava/lang/Long;)V", "c", "Ljava/util/UUID;", "d", "()Ljava/util/UUID;", "j", "(Ljava/util/UUID;)V", "", "<set-?>", "I", "()I", "interruptionCount", "i", "diskRestoreTime", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "f", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "g", "()Lcom/facebook/appevents/internal/SourceApplicationInfo;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/facebook/appevents/internal/SourceApplicationInfo;)V", "sourceApplicationInfo", "()J", "sessionLength", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SessionInfo {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Long sessionStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Long sessionLastEventTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public UUID sessionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int interruptionCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Long diskRestoreTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public SourceApplicationInfo sourceApplicationInfo;

    /* JADX INFO: compiled from: SessionInfo.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/facebook/appevents/internal/SessionInfo$Companion;", "", "()V", "INTERRUPTION_COUNT_KEY", "", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "clearSavedSessionFromDisk", "", "getStoredSessionInfo", "Lcom/facebook/appevents/internal/SessionInfo;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void clearSavedSessionFromDisk() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            SourceApplicationInfo.INSTANCE.clearSavedSourceApplicationInfoFromDisk();
        }

        @JvmStatic
        @Nullable
        public final SessionInfo getStoredSessionInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m());
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j12 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j11 == 0 || j12 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j11), Long.valueOf(j12), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            sessionInfo.m8253l(SourceApplicationInfo.INSTANCE.getStoredSourceApplicatioInfo());
            sessionInfo.m8250i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(sessionIDStr)");
            sessionInfo.m8251j(uuidFromString);
            return sessionInfo;
        }
    }

    @JvmOverloads
    public SessionInfo(@Nullable Long l11, @Nullable Long l12, @NotNull UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionStartTime = l11;
        this.sessionLastEventTime = l12;
        this.sessionId = sessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Long m8243b() {
        Long l11 = this.diskRestoreTime;
        if (l11 == null) {
            return 0L;
        }
        return l11;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    /* JADX INFO: renamed from: f */
    public final long m8247f() {
        Long l11;
        if (this.sessionStartTime == null || (l11 = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l11 != null) {
            return l11.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    /* JADX INFO: renamed from: h */
    public final void m8249h() {
        this.interruptionCount++;
    }

    /* JADX INFO: renamed from: i */
    public final void m8250i(@Nullable Long l11) {
        this.diskRestoreTime = l11;
    }

    /* JADX INFO: renamed from: j */
    public final void m8251j(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    /* JADX INFO: renamed from: k */
    public final void m8252k(@Nullable Long l11) {
        this.sessionLastEventTime = l11;
    }

    /* JADX INFO: renamed from: l */
    public final void m8253l(@Nullable SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    /* JADX INFO: renamed from: m */
    public final void m8254m() {
        long jLongValue;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m()).edit();
        Long l11 = this.sessionStartTime;
        long jLongValue2 = 0;
        if (l11 != null) {
            jLongValue = l11.longValue();
        } else {
            jLongValue = 0;
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", jLongValue);
        Long l12 = this.sessionLastEventTime;
        if (l12 != null) {
            jLongValue2 = l12.longValue();
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", jLongValue2);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.interruptionCount);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.sessionId.toString());
        editorEdit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo != null && sourceApplicationInfo != null) {
            sourceApplicationInfo.m8255a();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionInfo(Long l11, Long l12, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(l11, l12, uuid);
    }
}
