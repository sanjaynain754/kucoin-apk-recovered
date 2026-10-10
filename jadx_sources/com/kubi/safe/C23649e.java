package com.kubi.safe;

import java.io.Closeable;
import java.io.IOException;
import ro.C44127a;

/* JADX INFO: renamed from: com.kubi.safe.e */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class C23649e {
    /* JADX INFO: renamed from: a */
    public static void m56361a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                C44127a.m97248h(e11);
            }
        }
    }
}
