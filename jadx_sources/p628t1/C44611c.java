package p628t1;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: t1.c */
/* JADX INFO: compiled from: MultiTransformation.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44611c<T> implements InterfaceC44616h<T> {

    /* JADX INFO: renamed from: b */
    public final Collection<? extends InterfaceC44616h<T>> f98908b;

    @SafeVarargs
    public C44611c(@NonNull InterfaceC44616h<T>... interfaceC44616hArr) {
        if (interfaceC44616hArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f98908b = Arrays.asList(interfaceC44616hArr);
    }

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        Iterator<? extends InterfaceC44616h<T>> it = this.f98908b.iterator();
        while (it.hasNext()) {
            it.next().mo4268a(messageDigest);
        }
    }

    @Override // p628t1.InterfaceC44616h
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45359j<T> mo4269b(@NonNull Context context, @NonNull InterfaceC45359j<T> interfaceC45359j, int i11, int i12) {
        Iterator<? extends InterfaceC44616h<T>> it = this.f98908b.iterator();
        InterfaceC45359j<T> interfaceC45359j2 = interfaceC45359j;
        while (it.hasNext()) {
            InterfaceC45359j<T> interfaceC45359jMo4269b = it.next().mo4269b(context, interfaceC45359j2, i11, i12);
            if (interfaceC45359j2 != null && !interfaceC45359j2.equals(interfaceC45359j) && !interfaceC45359j2.equals(interfaceC45359jMo4269b)) {
                interfaceC45359j2.recycle();
            }
            interfaceC45359j2 = interfaceC45359jMo4269b;
        }
        return interfaceC45359j2;
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C44611c) {
            return this.f98908b.equals(((C44611c) obj).f98908b);
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return this.f98908b.hashCode();
    }

    public C44611c(@NonNull Collection<? extends InterfaceC44616h<T>> collection) {
        if (!collection.isEmpty()) {
            this.f98908b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
