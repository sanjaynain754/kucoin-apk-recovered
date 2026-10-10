package p465n7;

import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;

/* JADX INFO: renamed from: n7.c */
/* JADX INFO: compiled from: Java7HandlersImpl.java */
/* JADX INFO: loaded from: classes45.dex */
public class C42761c extends AbstractC42759a {

    /* JADX INFO: renamed from: b */
    public final Class<?> f94717b = C42760b.m93694a();

    @Override // p465n7.AbstractC42759a
    /* JADX INFO: renamed from: a */
    public AbstractC6390e<?> mo93692a(Class<?> cls) {
        if (cls == this.f94717b) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override // p465n7.AbstractC42759a
    /* JADX INFO: renamed from: b */
    public AbstractC6393h<?> mo93693b(Class<?> cls) {
        if (this.f94717b.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
