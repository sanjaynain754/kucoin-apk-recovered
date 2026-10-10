package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5325f;
import com.bumptech.glide.load.data.InterfaceC5324e;
import com.bumptech.glide.load.engine.C5345e;
import com.bumptech.glide.load.engine.C5349i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p298h2.C38085f;
import p298h2.InterfaceC38084e;
import p390k2.C40865a;
import p390k2.C40866b;
import p390k2.C40867c;
import p390k2.C40868d;
import p390k2.C40869e;
import p390k2.C40870f;
import p546q2.C43591a;
import p628t1.InterfaceC44609a;
import p628t1.InterfaceC44614f;
import p628t1.InterfaceC44615g;
import p680v1.InterfaceC45359j;
import p817z1.C46637p;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a */
    public final C46637p f6638a;

    /* JADX INFO: renamed from: b */
    public final C40865a f6639b;

    /* JADX INFO: renamed from: c */
    public final C40869e f6640c;

    /* JADX INFO: renamed from: d */
    public final C40870f f6641d;

    /* JADX INFO: renamed from: e */
    public final C5325f f6642e;

    /* JADX INFO: renamed from: f */
    public final C38085f f6643f;

    /* JADX INFO: renamed from: g */
    public final C40866b f6644g;

    /* JADX INFO: renamed from: h */
    public final C40868d f6645h = new C40868d();

    /* JADX INFO: renamed from: i */
    public final C40867c f6646i = new C40867c();

    /* JADX INFO: renamed from: j */
    public final Pools.Pool<List<Throwable>> f6647j;

    /* JADX INFO: loaded from: classes34.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m11, @NonNull List<InterfaceC46635n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m11);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public <Data, TResource> Registry m6527a(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC44614f<Data, TResource> interfaceC44614f) {
        m6531e("legacy_append", cls, cls2, interfaceC44614f);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public <Model, Data> Registry m6528b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<Model, Data> interfaceC46636o) {
        this.f6638a.m102849a(cls, cls2, interfaceC46636o);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public <Data> Registry m6529c(@NonNull Class<Data> cls, @NonNull InterfaceC44609a<Data> interfaceC44609a) {
        this.f6639b.m89437a(cls, interfaceC44609a);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public <TResource> Registry m6530d(@NonNull Class<TResource> cls, @NonNull InterfaceC44615g<TResource> interfaceC44615g) {
        this.f6641d.m89455a(cls, interfaceC44615g);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <Data, TResource> Registry m6531e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC44614f<Data, TResource> interfaceC44614f) {
        this.f6640c.m89448a(str, interfaceC44614f, cls, cls2);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final <Data, TResource, Transcode> List<C5345e<Data, TResource, Transcode>> m6532f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f6640c.m89451d(cls, cls2)) {
            for (Class cls5 : this.f6643f.m85983b(cls4, cls3)) {
                arrayList.add(new C5345e(cls, cls4, cls5, this.f6640c.m89449b(cls, cls4), this.f6643f.m85982a(cls4, cls5), this.f6647j));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public List<ImageHeaderParser> m6533g() {
        List<ImageHeaderParser> listM89441b = this.f6644g.m89441b();
        if (listM89441b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM89441b;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public <Data, TResource, Transcode> C5349i<Data, TResource, Transcode> m6534h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        C5349i<Data, TResource, Transcode> c5349iM89442a = this.f6646i.m89442a(cls, cls2, cls3);
        C5349i<Data, TResource, Transcode> c5349i = null;
        if (this.f6646i.m89444c(c5349iM89442a)) {
            return null;
        }
        if (c5349iM89442a != null) {
            return c5349iM89442a;
        }
        List<C5345e<Data, TResource, Transcode>> listM6532f = m6532f(cls, cls2, cls3);
        if (listM6532f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c5349i = new C5349i<>(cls4, cls5, cls6, listM6532f, this.f6647j);
        }
        this.f6646i.m89445d(cls4, cls5, cls6, c5349i);
        return c5349i;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public <Model> List<InterfaceC46635n<Model, ?>> m6535i(@NonNull Model model) {
        return this.f6638a.m102851d(model);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m6536j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listM89446a = this.f6645h.m89446a(cls, cls2, cls3);
        if (listM89446a == null) {
            listM89446a = new ArrayList<>();
            Iterator<Class<?>> it = this.f6638a.m102850c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f6640c.m89451d(it.next(), cls2)) {
                    if (!this.f6643f.m85983b(cls4, cls3).isEmpty() && !listM89446a.contains(cls4)) {
                        listM89446a.add(cls4);
                    }
                }
            }
            this.f6645h.m89447b(cls, cls2, cls3, Collections.unmodifiableList(listM89446a));
        }
        return listM89446a;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public <X> InterfaceC44615g<X> m6537k(@NonNull InterfaceC45359j<X> interfaceC45359j) throws NoResultEncoderAvailableException {
        InterfaceC44615g<X> interfaceC44615gM89456b = this.f6641d.m89456b(interfaceC45359j.mo4266a());
        if (interfaceC44615gM89456b != null) {
            return interfaceC44615gM89456b;
        }
        throw new NoResultEncoderAvailableException(interfaceC45359j.mo4266a());
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public <X> InterfaceC5324e<X> m6538l(@NonNull X x11) {
        return this.f6642e.m6676a(x11);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public <X> InterfaceC44609a<X> m6539m(@NonNull X x11) throws NoSourceEncoderAvailableException {
        InterfaceC44609a<X> interfaceC44609aM89438b = this.f6639b.m89438b(x11.getClass());
        if (interfaceC44609aM89438b != null) {
            return interfaceC44609aM89438b;
        }
        throw new NoSourceEncoderAvailableException(x11.getClass());
    }

    /* JADX INFO: renamed from: n */
    public boolean m6540n(@NonNull InterfaceC45359j<?> interfaceC45359j) {
        return this.f6641d.m89456b(interfaceC45359j.mo4266a()) != null;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public <Data, TResource> Registry m6541o(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC44614f<Data, TResource> interfaceC44614f) {
        m6542p("legacy_prepend_all", cls, cls2, interfaceC44614f);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public <Data, TResource> Registry m6542p(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC44614f<Data, TResource> interfaceC44614f) {
        this.f6640c.m89452e(str, interfaceC44614f, cls, cls2);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public Registry m6543q(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f6644g.m89440a(imageHeaderParser);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Registry m6544r(@NonNull InterfaceC5324e.a<?> aVar) {
        this.f6642e.m6677b(aVar);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public <TResource, Transcode> Registry m6545s(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull InterfaceC38084e<TResource, Transcode> interfaceC38084e) {
        this.f6643f.m85984c(cls, cls2, interfaceC38084e);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public <Model, Data> Registry m6546t(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o) {
        this.f6638a.m102853f(cls, cls2, interfaceC46636o);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public final Registry m6547u(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f6640c.m89453f(arrayList);
        return this;
    }

    public Registry() {
        Pools.Pool<List<Throwable>> poolM95936e = C43591a.m95936e();
        this.f6647j = poolM95936e;
        this.f6638a = new C46637p(poolM95936e);
        this.f6639b = new C40865a();
        this.f6640c = new C40869e();
        this.f6641d = new C40870f();
        this.f6642e = new C5325f();
        this.f6643f = new C38085f();
        this.f6644g = new C40866b();
        m6547u(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }
}
