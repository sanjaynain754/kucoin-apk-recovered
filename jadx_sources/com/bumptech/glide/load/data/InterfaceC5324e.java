package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.e */
/* JADX INFO: compiled from: DataRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5324e<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.e$a */
    /* JADX INFO: compiled from: DataRewinder.java */
    public interface a<T> {
        @NonNull
        /* JADX INFO: renamed from: a */
        Class<T> mo6663a();

        @NonNull
        /* JADX INFO: renamed from: b */
        InterfaceC5324e<T> mo6664b(@NonNull T t11);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    T mo6660a() throws IOException;

    /* JADX INFO: renamed from: b */
    void mo6661b();
}
