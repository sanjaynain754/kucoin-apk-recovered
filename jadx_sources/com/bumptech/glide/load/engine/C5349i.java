package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.InterfaceC5324e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p523p2.C43363j;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.i */
/* JADX INFO: compiled from: LoadPath.java */
/* JADX INFO: loaded from: classes.dex */
public class C5349i<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Class<Data> f6932a;

    /* JADX INFO: renamed from: b */
    public final Pools.Pool<List<Throwable>> f6933b;

    /* JADX INFO: renamed from: c */
    public final List<? extends C5345e<Data, ResourceType, Transcode>> f6934c;

    /* JADX INFO: renamed from: d */
    public final String f6935d;

    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<Transcode> m6824a(InterfaceC5324e<Data> interfaceC5324e, @NonNull C44613e c44613e, int i11, int i12, C5345e.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) C43363j.m95506d(this.f6933b.acquire());
        try {
            return m6825b(interfaceC5324e, c44613e, i11, i12, aVar, list);
        } finally {
            this.f6933b.release(list);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC45359j<Transcode> m6825b(InterfaceC5324e<Data> interfaceC5324e, @NonNull C44613e c44613e, int i11, int i12, C5345e.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f6934c.size();
        InterfaceC45359j<Transcode> interfaceC45359jM6779a = null;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                interfaceC45359jM6779a = this.f6934c.get(i13).m6779a(interfaceC5324e, i11, i12, c44613e, aVar);
            } catch (GlideException e11) {
                list.add(e11);
            }
            if (interfaceC45359jM6779a != null) {
                break;
            }
        }
        if (interfaceC45359jM6779a != null) {
            return interfaceC45359jM6779a;
        }
        throw new GlideException(this.f6935d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6934c.toArray()) + '}';
    }

    public C5349i(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C5345e<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f6932a = cls;
        this.f6933b = pool;
        this.f6934c = (List) C43363j.m95505c(list);
        this.f6935d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }
}
