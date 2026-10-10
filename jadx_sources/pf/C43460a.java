package pf;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pf.a */
/* JADX INFO: compiled from: FlowDataEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lpf/a;", "Lpf/b;", "", "keyEvent", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "FlowEventBus_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@PublishedApi
public final class C43460a implements InterfaceC43461b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String keyEvent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object data;

    public C43460a(@NotNull String keyEvent, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(data, "data");
        this.keyEvent = keyEvent;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKeyEvent() {
        return this.keyEvent;
    }
}
