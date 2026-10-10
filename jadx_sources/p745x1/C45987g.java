package p745x1;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p523p2.C43360g;
import p628t1.InterfaceC44610b;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: x1.g */
/* JADX INFO: compiled from: LruResourceCache.java */
/* JADX INFO: loaded from: classes.dex */
public class C45987g extends C43360g<InterfaceC44610b, InterfaceC45359j<?>> implements InterfaceC45988h {

    /* JADX INFO: renamed from: e */
    public InterfaceC45988h.a f103450e;

    @Override // p745x1.InterfaceC45988h
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo101447a(int i11) {
        if (i11 >= 40) {
            m95491c();
        } else if (i11 >= 20 || i11 == 15) {
            m95499m(m95494h() / 2);
        }
    }

    @Override // p745x1.InterfaceC45988h
    /* JADX INFO: renamed from: e */
    public void mo101450e(@NonNull InterfaceC45988h.a aVar) {
        this.f103450e = aVar;
    }

    @Override // p523p2.C43360g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo95495i(@Nullable InterfaceC45359j<?> interfaceC45359j) {
        return interfaceC45359j == null ? super.mo95495i(null) : interfaceC45359j.getSize();
    }

    @Override // p523p2.C43360g
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo95496j(@NonNull InterfaceC44610b interfaceC44610b, @Nullable InterfaceC45359j<?> interfaceC45359j) {
        InterfaceC45988h.a aVar = this.f103450e;
        if (aVar == null || interfaceC45359j == null) {
            return;
        }
        aVar.mo6786d(interfaceC45359j);
    }

    public C45987g(long j11) {
        super(j11);
    }

    @Override // p745x1.InterfaceC45988h
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC45359j mo101448b(@NonNull InterfaceC44610b interfaceC44610b) {
        return (InterfaceC45359j) super.m95498l(interfaceC44610b);
    }

    @Override // p745x1.InterfaceC45988h
    @Nullable
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC45359j mo101449d(@NonNull InterfaceC44610b interfaceC44610b, @Nullable InterfaceC45359j interfaceC45359j) {
        return (InterfaceC45359j) super.m95497k(interfaceC44610b, interfaceC45359j);
    }
}
