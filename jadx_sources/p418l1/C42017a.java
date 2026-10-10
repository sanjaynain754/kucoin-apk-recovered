package p418l1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p484o1.C42924f;

/* JADX INFO: renamed from: l1.a */
/* JADX INFO: compiled from: DefaultLottieFetchResult.java */
/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C42017a implements InterfaceC42019c {

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HttpURLConnection f92210b;

    @Override // p418l1.InterfaceC42019c
    public boolean isSuccessful() {
        try {
            return this.f92210b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p418l1.InterfaceC42019c
    @Nullable
    /* JADX INFO: renamed from: A */
    public String mo92119A() {
        return this.f92210b.getContentType();
    }

    @Override // p418l1.InterfaceC42019c
    @NonNull
    /* JADX INFO: renamed from: B */
    public InputStream mo92120B() throws IOException {
        return this.f92210b.getInputStream();
    }

    /* JADX INFO: renamed from: a */
    public final String m92121a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92210b.disconnect();
    }

    public C42017a(@NonNull HttpURLConnection httpURLConnection) {
        this.f92210b = httpURLConnection;
    }

    @Override // p418l1.InterfaceC42019c
    @Nullable
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f92210b.getURL() + ". Failed with " + this.f92210b.getResponseCode() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m92121a(this.f92210b);
        } catch (IOException e11) {
            C42924f.m94159d("get error failed ", e11);
            return e11.getMessage();
        }
    }
}
