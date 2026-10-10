package p390k2;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: compiled from: ImageHeaderParserRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class C40866b {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f90872a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public synchronized void m89440a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f90872a.add(imageHeaderParser);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized List<ImageHeaderParser> m89441b() {
        return this.f90872a;
    }
}
