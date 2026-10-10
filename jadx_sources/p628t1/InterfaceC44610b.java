package p628t1;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: t1.b */
/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC44610b {

    /* JADX INFO: renamed from: a */
    public static final Charset f98907a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    void mo4268a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
