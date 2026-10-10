package androidx.media3.common;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: renamed from: androidx.media3.common.c0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2737c0 implements ListenerSet.Event {
    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
