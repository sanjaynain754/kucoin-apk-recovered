package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.d */
/* JADX INFO: compiled from: DataFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5323d<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.d$a */
    /* JADX INFO: compiled from: DataFetcher.java */
    public interface a<T> {
        /* JADX INFO: renamed from: e */
        void mo6674e(@Nullable T t11);

        /* JADX INFO: renamed from: f */
        void mo6675f(@NonNull Exception exc);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    Class<T> mo23a();

    /* JADX INFO: renamed from: b */
    void mo24b();

    @NonNull
    /* JADX INFO: renamed from: c */
    DataSource mo25c();

    void cancel();

    /* JADX INFO: renamed from: d */
    void mo26d(@NonNull Priority priority, @NonNull a<? super T> aVar);
}
