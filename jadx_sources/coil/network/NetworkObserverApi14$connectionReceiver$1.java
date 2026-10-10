package coil.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p781y0.C46359b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"coil/network/NetworkObserverApi14$connectionReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class NetworkObserverApi14$connectionReceiver$1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetworkObserver.InterfaceC5048a f5820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C46359b f5821b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(intent == null ? null : intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            this.f5820a.mo5501a(this.f5821b.mo5500a());
        }
    }
}
