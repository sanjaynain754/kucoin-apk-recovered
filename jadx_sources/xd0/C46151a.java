package xd0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.features.anchorboardcast.AnchorViewListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xd0.a */
/* JADX INFO: compiled from: AnchorViewListenerDispatcher.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u001a\u0010\r\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/dispatcher/AnchorViewListenerDispatcher;", "", "<init>", "()V", "listenerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorViewListener;", "addAnchorViewListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeAnchorViewListener", "clearAnchorViewListeners", "notifyAnchorViewListener", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46151a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CopyOnWriteArrayList<WeakReference<AnchorViewListener>> f103657a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m101743a(@NotNull AnchorViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f103657a.add(new WeakReference<>(listener));
    }

    /* JADX INFO: renamed from: b */
    public final void m101744b() {
        this.f103657a.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m101745c(@NotNull Function1<? super AnchorViewListener, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<AnchorViewListener>> it = this.f103657a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<AnchorViewListener> next = it.next();
            AnchorViewListener anchorViewListener = next.get();
            if (anchorViewListener == null) {
                Intrinsics.checkNotNull(next);
                arrayList.add(next);
            } else {
                callback.invoke(anchorViewListener);
            }
        }
        this.f103657a.removeAll(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final void m101746d(@NotNull AnchorViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<AnchorViewListener>> it = this.f103657a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<AnchorViewListener> next = it.next();
            if (Intrinsics.areEqual(next.get(), listener)) {
                Intrinsics.checkNotNull(next);
                arrayList.add(next);
            }
        }
        this.f103657a.removeAll(arrayList);
    }
}
