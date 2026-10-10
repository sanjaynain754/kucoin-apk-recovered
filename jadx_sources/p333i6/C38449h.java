package p333i6;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: i6.h */
/* JADX INFO: compiled from: InternalSettings.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Li6/h;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "b", "Ljava/lang/String;", "customUserAgent", "", "()Z", "isUnityApp$annotations", "isUnityApp", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38449h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38449h f86285a = new C38449h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile String customUserAgent;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m86713a() {
        return customUserAgent;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m86714b() {
        String str = customUserAgent;
        return str != null && StringsKt.startsWith$default(str, "Unity.", false, 2, (Object) null);
    }
}
