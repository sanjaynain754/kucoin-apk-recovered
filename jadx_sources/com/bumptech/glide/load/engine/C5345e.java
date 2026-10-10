package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5324e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p298h2.InterfaceC38084e;
import p523p2.C43363j;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.e */
/* JADX INFO: compiled from: DecodePath.java */
/* JADX INFO: loaded from: classes.dex */
public class C5345e<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Class<DataType> f6861a;

    /* JADX INFO: renamed from: b */
    public final List<? extends InterfaceC44614f<DataType, ResourceType>> f6862b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38084e<ResourceType, Transcode> f6863c;

    /* JADX INFO: renamed from: d */
    public final Pools.Pool<List<Throwable>> f6864d;

    /* JADX INFO: renamed from: e */
    public final String f6865e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$a */
    /* JADX INFO: compiled from: DecodePath.java */
    public interface a<ResourceType> {
        @NonNull
        /* JADX INFO: renamed from: a */
        InterfaceC45359j<ResourceType> mo6729a(@NonNull InterfaceC45359j<ResourceType> interfaceC45359j);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC45359j<ResourceType> m6780b(InterfaceC5324e<DataType> interfaceC5324e, int i11, int i12, @NonNull C44613e c44613e) throws GlideException {
        List<Throwable> list = (List) C43363j.m95506d(this.f6864d.acquire());
        try {
            return m6781c(interfaceC5324e, i11, i12, c44613e, list);
        } finally {
            this.f6864d.release(list);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC45359j<ResourceType> m6781c(InterfaceC5324e<DataType> interfaceC5324e, int i11, int i12, @NonNull C44613e c44613e, List<Throwable> list) throws GlideException {
        int size = this.f6862b.size();
        InterfaceC45359j<ResourceType> interfaceC45359jMo4261a = null;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC44614f<DataType, ResourceType> interfaceC44614f = this.f6862b.get(i13);
            try {
                if (interfaceC44614f.mo4262b(interfaceC5324e.mo6660a(), c44613e)) {
                    interfaceC45359jMo4261a = interfaceC44614f.mo4261a(interfaceC5324e.mo6660a(), i11, i12, c44613e);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC44614f, e11);
                }
                list.add(e11);
            }
            if (interfaceC45359jMo4261a != null) {
                break;
            }
        }
        if (interfaceC45359jMo4261a != null) {
            return interfaceC45359jMo4261a;
        }
        throw new GlideException(this.f6865e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f6861a + ", decoders=" + this.f6862b + ", transcoder=" + this.f6863c + '}';
    }

    public C5345e(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC44614f<DataType, ResourceType>> list, InterfaceC38084e<ResourceType, Transcode> interfaceC38084e, Pools.Pool<List<Throwable>> pool) {
        this.f6861a = cls;
        this.f6862b = list;
        this.f6863c = interfaceC38084e;
        this.f6864d = pool;
        this.f6865e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<Transcode> m6779a(InterfaceC5324e<DataType> interfaceC5324e, int i11, int i12, @NonNull C44613e c44613e, a<ResourceType> aVar) throws GlideException {
        return this.f6863c.mo85980a(aVar.mo6729a(m6780b(interfaceC5324e, i11, i12, c44613e)), c44613e);
    }
}
