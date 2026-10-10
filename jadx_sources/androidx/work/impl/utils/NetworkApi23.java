package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkApi23.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m90084d2 = {"getActiveNetworkCompat", "Landroid/net/Network;", "Landroid/net/ConnectivityManager;", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
@JvmName(name = "NetworkApi23")
public final class NetworkApi23 {
    @DoNotInline
    @Nullable
    public static final Network getActiveNetworkCompat(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
