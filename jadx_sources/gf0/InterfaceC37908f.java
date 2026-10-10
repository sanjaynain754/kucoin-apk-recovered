package gf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gf0.f */
/* JADX INFO: compiled from: HtmlTag.java */
/* JADX INFO: loaded from: classes60.dex */
public interface InterfaceC37908f {

    /* JADX INFO: renamed from: gf0.f$a */
    /* JADX INFO: compiled from: HtmlTag.java */
    public interface a extends InterfaceC37908f {
        @Nullable
        /* JADX INFO: renamed from: d */
        a mo85699d();

        @NonNull
        /* JADX INFO: renamed from: f */
        List<a> mo85700f();
    }

    /* JADX INFO: renamed from: gf0.f$b */
    /* JADX INFO: compiled from: HtmlTag.java */
    public interface b extends InterfaceC37908f {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    a mo85695a();

    @NonNull
    /* JADX INFO: renamed from: b */
    Map<String, String> mo85696b();

    /* JADX INFO: renamed from: c */
    int mo85697c();

    /* JADX INFO: renamed from: e */
    boolean mo85698e();

    boolean isClosed();

    @NonNull
    String name();

    int start();
}
