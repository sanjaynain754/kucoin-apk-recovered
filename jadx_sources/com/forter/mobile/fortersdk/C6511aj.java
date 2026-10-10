package com.forter.mobile.fortersdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C6511aj {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final C6560k f10842a;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.aj$a */
    /* JADX INFO: loaded from: classes45.dex */
    public class a extends d {
        public a(HttpURLConnection httpURLConnection, OutputStream outputStream) {
            super(httpURLConnection, null, outputStream);
        }

        @Override // com.forter.mobile.fortersdk.C6511aj.d, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            String strM12511b;
            try {
                int responseCode = this.f10846b.getResponseCode();
                if (responseCode < 300) {
                    super.close();
                    OutputStream outputStream = this.f10848d;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                InputStream inputStreamM12136b = null;
                try {
                    try {
                        inputStreamM12136b = C6511aj.m12136b(this.f10846b);
                        strM12511b = C6630y.m12511b(C6630y.m12510a(inputStreamM12136b));
                        if (inputStreamM12136b != null) {
                            try {
                                inputStreamM12136b.close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (inputStreamM12136b != null) {
                            try {
                                inputStreamM12136b.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    strM12511b = "Could not read response body for rejected message: " + e11.toString();
                    if (inputStreamM12136b != null) {
                    }
                }
                throw new b(responseCode, this.f10846b.getResponseMessage(), strM12511b);
            } catch (Throwable th3) {
                super.close();
                OutputStream outputStream2 = this.f10848d;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.aj$b */
    public static class b extends IOException {

        /* JADX INFO: renamed from: a */
        final int f10843a;

        /* JADX INFO: renamed from: b */
        final String f10844b;

        /* JADX INFO: renamed from: c */
        final String f10845c;

        public b(int i11, String str, String str2) {
            super("HTTP " + i11 + ": " + str + ". Response: " + str2);
            this.f10843a = i11;
            this.f10844b = str;
            this.f10845c = str2;
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.aj$d */
    public static abstract class d implements Closeable {

        /* JADX INFO: renamed from: b */
        public final HttpURLConnection f10846b;

        /* JADX INFO: renamed from: c */
        public final InputStream f10847c;

        /* JADX INFO: renamed from: d */
        public final OutputStream f10848d;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f10846b.disconnect();
        }

        public d(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            if (httpURLConnection != null) {
                this.f10846b = httpURLConnection;
                this.f10847c = inputStream;
                this.f10848d = outputStream;
                return;
            }
            throw new IllegalArgumentException("connection == null");
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.aj$c */
    public class c extends d {
        public c(HttpURLConnection httpURLConnection, InputStream inputStream) {
            super(httpURLConnection, inputStream, null);
        }

        @Override // com.forter.mobile.fortersdk.C6511aj.d, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            InputStream inputStream = this.f10847c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final d m12137a(@NonNull String str, @Nullable Map<String, String> map, @Nullable InterfaceC6565l interfaceC6565l) throws IOException {
        HttpURLConnection httpURLConnectionM12407a = this.f10842a.m12407a(str);
        C6560k.m12406b(httpURLConnectionM12407a, map);
        if (interfaceC6565l != null) {
            interfaceC6565l.mo12418a(httpURLConnectionM12407a);
        }
        return new c(httpURLConnectionM12407a, m12136b(httpURLConnectionM12407a));
    }

    public C6511aj(@NonNull C6560k c6560k) {
        this.f10842a = c6560k;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static InputStream m12136b(@NonNull HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }
}
