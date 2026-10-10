package p418l1;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: compiled from: DefaultLottieNetworkFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C42018b implements InterfaceC42021e {
    @Override // p418l1.InterfaceC42021e
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC42019c mo92122a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C42017a(httpURLConnection);
    }
}
