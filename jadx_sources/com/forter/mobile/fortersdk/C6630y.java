package com.forter.mobile.fortersdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6630y {
    /* JADX INFO: renamed from: a */
    public static BufferedReader m12510a(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
    }

    /* JADX INFO: renamed from: b */
    public static String m12511b(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb2.toString();
            }
            sb2.append(line);
        }
    }
}
