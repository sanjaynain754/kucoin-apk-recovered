package p680v1;

import androidx.annotation.NonNull;
import java.io.File;
import p628t1.C44613e;
import p628t1.InterfaceC44609a;
import p745x1.InterfaceC45981a;

/* JADX INFO: renamed from: v1.b */
/* JADX INFO: compiled from: DataCacheWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class C45351b<DataType> implements InterfaceC45981a.b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC44609a<DataType> f101951a;

    /* JADX INFO: renamed from: b */
    public final DataType f101952b;

    /* JADX INFO: renamed from: c */
    public final C44613e f101953c;

    @Override // p745x1.InterfaceC45981a.b
    /* JADX INFO: renamed from: a */
    public boolean mo100249a(@NonNull File file) {
        return this.f101951a.mo4852a(this.f101952b, file, this.f101953c);
    }

    public C45351b(InterfaceC44609a<DataType> interfaceC44609a, DataType datatype, C44613e c44613e) {
        this.f101951a = interfaceC44609a;
        this.f101952b = datatype;
        this.f101953c = c44613e;
    }
}
