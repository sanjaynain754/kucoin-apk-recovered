package ge0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: ge0.b */
/* JADX INFO: compiled from: EndStatisticsStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/endstatistics/store/EndStatisticsStore;", "", "<init>", "()V", "internalState", "Lcom/trtc/uikit/livekit/features/endstatistics/store/EndStatisticsState;", "getState", "setRoomId", "", "roomId", "", "setOwnerName", TUIConstantDefine.OWNER_NAME, "setOwnerAvatarUrl", TUIConstantDefine.OWNER_AVATAR_URL, "setLiveDuration", TypedValues.TransitionType.S_DURATION, "", "setMaxViewersCount", "count", "setMessageCount", "setLikeCount", "setGiftIncome", "setGiftSenderCount", "formatSeconds", "timeSeconds", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37874b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37873a f85249a = new C37873a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m85507a(int i11) {
        if (i11 <= 0) {
            return "-- --";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 3600), Integer.valueOf((i11 % 3600) / 60), Integer.valueOf(i11 % 60)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C37873a getF85249a() {
        return this.f85249a;
    }

    /* JADX INFO: renamed from: c */
    public final void m85509c(long j11) {
        this.f85249a.m85498a().setValue(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: d */
    public final void m85510d(long j11) {
        this.f85249a.m85499b().setValue(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: e */
    public final void m85511e(long j11) {
        this.f85249a.m85500c().setValue(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: f */
    public final void m85512f(long j11) {
        this.f85249a.m85501d().setValue(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: g */
    public final void m85513g(long j11) {
        this.f85249a.m85502e().setValue(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: h */
    public final void m85514h(long j11) {
        this.f85249a.m85503f().setValue(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: i */
    public final void m85515i(@NotNull String ownerAvatarUrl) {
        Intrinsics.checkNotNullParameter(ownerAvatarUrl, "ownerAvatarUrl");
        this.f85249a.m85504g().setValue(ownerAvatarUrl);
    }

    /* JADX INFO: renamed from: j */
    public final void m85516j(@NotNull String ownerName) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        this.f85249a.m85505h().setValue(ownerName);
    }

    /* JADX INFO: renamed from: k */
    public final void m85517k(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f85249a.m85506i().setValue(roomId);
    }
}
