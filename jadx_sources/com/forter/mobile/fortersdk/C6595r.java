package com.forter.mobile.fortersdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6595r {

    /* JADX INFO: renamed from: a */
    public int f11047a;

    /* JADX INFO: renamed from: b */
    public String f11048b;

    public C6595r(int i11, String str) {
        this.f11047a = i11;
        this.f11048b = str;
    }

    public C6595r(C6511aj.d dVar) {
        BufferedReader bufferedReaderM12510a;
        InputStream inputStreamM12136b = null;
        try {
            try {
                try {
                    HttpURLConnection httpURLConnection = dVar.f10846b;
                    this.f11047a = httpURLConnection.getResponseCode();
                    InputStream inputStream = dVar.f10847c;
                    if (inputStream != null) {
                        bufferedReaderM12510a = C6630y.m12510a(inputStream);
                    } else {
                        inputStreamM12136b = C6511aj.m12136b(httpURLConnection);
                        bufferedReaderM12510a = C6630y.m12510a(inputStreamM12136b);
                    }
                    this.f11048b = C6630y.m12511b(bufferedReaderM12510a);
                    if (inputStreamM12136b != null) {
                        inputStreamM12136b.close();
                    }
                } catch (IOException e11) {
                    this.f11047a = -1;
                    this.f11048b = "Could not read response body for rejected message: " + e11.toString();
                    if (inputStreamM12136b != null) {
                        inputStreamM12136b.close();
                    }
                }
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            if (inputStreamM12136b != null) {
                try {
                    inputStreamM12136b.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }
}
