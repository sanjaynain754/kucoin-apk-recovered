package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.c */
/* JADX INFO: compiled from: DataFetcherGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5343c {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.c$a */
    /* JADX INFO: compiled from: DataFetcherGenerator.java */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo6701b(InterfaceC44610b interfaceC44610b, Exception exc, InterfaceC5323d<?> interfaceC5323d, DataSource dataSource);

        /* JADX INFO: renamed from: c */
        void mo6702c(InterfaceC44610b interfaceC44610b, @Nullable Object obj, InterfaceC5323d<?> interfaceC5323d, DataSource dataSource, InterfaceC44610b interfaceC44610b2);

        /* JADX INFO: renamed from: d */
        void mo6703d();
    }

    /* JADX INFO: renamed from: a */
    boolean mo6753a();

    void cancel();
}
