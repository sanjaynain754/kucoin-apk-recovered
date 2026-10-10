package com.trtc.uikit.livekit.component.networkInfo.store;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkInfoStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$registerBroadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "lastConnected", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkInfoStore$registerBroadcastReceiver$1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public boolean f77941a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NetworkInfoStore f77942b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean zM79833q = this.f77942b.m79833q(context);
        if (zM79833q != this.f77941a) {
            this.f77941a = zM79833q;
            this.f77942b.getF77928a().m79810l().setValue(Boolean.valueOf(zM79833q));
        }
    }
}
