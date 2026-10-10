package p581r1;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC43896a {

    /* JADX INFO: renamed from: r1.a$a */
    /* JADX INFO: compiled from: GifDecoder.java */
    public interface a {
        @NonNull
        /* JADX INFO: renamed from: a */
        byte[] mo85246a(int i11);

        @NonNull
        /* JADX INFO: renamed from: b */
        Bitmap mo85247b(int i11, int i12, @NonNull Bitmap.Config config);

        /* JADX INFO: renamed from: c */
        void mo85248c(@NonNull Bitmap bitmap);

        @NonNull
        /* JADX INFO: renamed from: d */
        int[] mo85249d(int i11);

        /* JADX INFO: renamed from: e */
        void mo85250e(@NonNull byte[] bArr);

        /* JADX INFO: renamed from: f */
        void mo85251f(@NonNull int[] iArr);
    }

    /* JADX INFO: renamed from: a */
    int mo96671a();

    /* JADX INFO: renamed from: b */
    void mo96672b(@NonNull Bitmap.Config config);

    /* JADX INFO: renamed from: c */
    void mo96673c();

    void clear();

    /* JADX INFO: renamed from: d */
    int mo96674d();

    /* JADX INFO: renamed from: e */
    int mo96675e();

    @Nullable
    /* JADX INFO: renamed from: f */
    Bitmap mo96676f();

    /* JADX INFO: renamed from: g */
    void mo96677g();

    @NonNull
    ByteBuffer getData();

    /* JADX INFO: renamed from: h */
    int mo96678h();

    /* JADX INFO: renamed from: i */
    int mo96679i();
}
