package fe0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import ee0.C37144f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fe0.b */
/* JADX INFO: compiled from: AudienceViewListenerList.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceViewListenerList;", "", "<init>", "()V", "listeners", "", "Ljava/lang/ref/WeakReference;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "clearListeners", "notifyListeners", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceViewListenerList$ListenerCallback;", "ListenerCallback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37439b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<WeakReference<C37144f.a>> f83041a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: fe0.b$a */
    /* JADX INFO: compiled from: AudienceViewListenerList.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceViewListenerList$ListenerCallback;", "", "onNotify", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo83073a(@NotNull C37144f.a aVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m84231a(@NotNull C37144f.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83041a.add(new WeakReference<>(listener));
    }

    /* JADX INFO: renamed from: b */
    public final void m84232b() {
        this.f83041a.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m84233c(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (WeakReference<C37144f.a> weakReference : this.f83041a) {
            C37144f.a aVar = weakReference.get();
            if (aVar == null) {
                arrayList.add(weakReference);
            } else {
                callback.mo83073a(aVar);
            }
        }
        this.f83041a.removeAll(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final void m84234d(@NotNull C37144f.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        for (WeakReference<C37144f.a> weakReference : this.f83041a) {
            if (Intrinsics.areEqual(weakReference.get(), listener)) {
                this.f83041a.remove(weakReference);
            }
        }
    }
}
