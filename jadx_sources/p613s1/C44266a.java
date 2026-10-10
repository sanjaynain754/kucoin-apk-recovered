package p613s1;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.InterfaceC5323d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p523p2.C43356c;
import p523p2.C43363j;
import p817z1.C46628g;

/* JADX INFO: renamed from: s1.a */
/* JADX INFO: compiled from: OkHttpStreamFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class C44266a implements InterfaceC5323d<InputStream>, Callback {

    /* JADX INFO: renamed from: b */
    public final Call.Factory f97813b;

    /* JADX INFO: renamed from: c */
    public final C46628g f97814c;

    /* JADX INFO: renamed from: d */
    public InputStream f97815d;

    /* JADX INFO: renamed from: e */
    public ResponseBody f97816e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5323d.a<? super InputStream> f97817f;

    /* JADX INFO: renamed from: g */
    public volatile Call f97818g;

    @Override // okhttp3.Callback
    public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f97817f.mo6675f(iOException);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo23a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: b */
    public void mo24b() {
        try {
            InputStream inputStream = this.f97815d;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f97816e;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f97817f = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: c */
    public DataSource mo25c() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    public void cancel() {
        Call call = this.f97818g;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: d */
    public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super InputStream> aVar) {
        Request.Builder builderUrl = new Request.Builder().url(this.f97814c.m102826h());
        for (Map.Entry<String, String> entry : this.f97814c.m102823e().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        Request requestBuild = builderUrl.build();
        this.f97817f = aVar;
        this.f97818g = this.f97813b.newCall(requestBuild);
        FirebasePerfOkHttpClient.enqueue(this.f97818g, this);
    }

    public C44266a(Call.Factory factory, C46628g c46628g) {
        this.f97813b = factory;
        this.f97814c = c46628g;
    }

    @Override // okhttp3.Callback
    public void onResponse(@NonNull Call call, @NonNull Response response) {
        this.f97816e = response.body();
        if (response.isSuccessful()) {
            InputStream inputStreamM95482b = C43356c.m95482b(this.f97816e.byteStream(), ((ResponseBody) C43363j.m95506d(this.f97816e)).getContentLength());
            this.f97815d = inputStreamM95482b;
            this.f97817f.mo6674e(inputStreamM95482b);
            return;
        }
        this.f97817f.mo6675f(new HttpException(response.message(), response.code()));
    }
}
