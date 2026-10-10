package com.trtc.uikit.livekit.features.anchorprepare.store;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareViewListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.store.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnchorPrepareListenerDispatch.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareListenerDispatch;", "", "<init>", "()V", "listenerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareViewListener;", "addAnchorPrepareViewListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeAnchorPrepareViewListener", "clearAnchorPrepareViewListeners", "notifyAnchorPrepareViewListener", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareListenerDispatch$AnchorPrepareViewCallback;", "AnchorPrepareViewCallback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorPrepareListenerDispatch {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CopyOnWriteArrayList<WeakReference<AnchorPrepareViewListener>> f78490a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.store.a$a */
    /* JADX INFO: compiled from: AnchorPrepareListenerDispatch.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareListenerDispatch$AnchorPrepareViewCallback;", "", "onNotify", "", "observer", "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareViewListener;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4449a(@NotNull AnchorPrepareViewListener anchorPrepareViewListener);
    }

    /* JADX INFO: renamed from: a */
    public final void m80646a(@NotNull AnchorPrepareViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78490a.add(new WeakReference<>(listener));
    }

    /* JADX INFO: renamed from: b */
    public final void m80647b(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<AnchorPrepareViewListener>> it = this.f78490a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<AnchorPrepareViewListener> next = it.next();
            AnchorPrepareViewListener anchorPrepareViewListener = next.get();
            if (anchorPrepareViewListener == null) {
                Intrinsics.checkNotNull(next);
                arrayList.add(next);
            } else {
                callback.mo4449a(anchorPrepareViewListener);
            }
        }
        this.f78490a.removeAll(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final void m80648c(@NotNull AnchorPrepareViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<AnchorPrepareViewListener>> it = this.f78490a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<AnchorPrepareViewListener> next = it.next();
            if (Intrinsics.areEqual(next.get(), listener)) {
                Intrinsics.checkNotNull(next);
                arrayList.add(next);
            }
        }
        this.f78490a.removeAll(arrayList);
    }
}
