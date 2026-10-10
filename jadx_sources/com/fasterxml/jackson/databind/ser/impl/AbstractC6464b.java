package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b */
/* JADX INFO: compiled from: PropertySerializerMap.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6464b {

    /* JADX INFO: renamed from: a */
    public final boolean f10623a;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b$a */
    /* JADX INFO: compiled from: PropertySerializerMap.java */
    public static final class a extends AbstractC6464b {

        /* JADX INFO: renamed from: b */
        public final Class<?> f10624b;

        /* JADX INFO: renamed from: c */
        public final Class<?> f10625c;

        /* JADX INFO: renamed from: d */
        public final AbstractC6393h<Object> f10626d;

        /* JADX INFO: renamed from: e */
        public final AbstractC6393h<Object> f10627e;

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: j */
        public AbstractC6464b mo11807j(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
            return new c(this, new f[]{new f(this.f10624b, this.f10626d), new f(this.f10625c, this.f10627e), new f(cls, abstractC6393h)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: k */
        public AbstractC6393h<Object> mo11808k(Class<?> cls) {
            if (cls == this.f10624b) {
                return this.f10626d;
            }
            if (cls == this.f10625c) {
                return this.f10627e;
            }
            return null;
        }

        public a(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6393h<Object> abstractC6393h, Class<?> cls2, AbstractC6393h<Object> abstractC6393h2) {
            super(abstractC6464b);
            this.f10624b = cls;
            this.f10626d = abstractC6393h;
            this.f10625c = cls2;
            this.f10627e = abstractC6393h2;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b$b */
    /* JADX INFO: compiled from: PropertySerializerMap.java */
    public static final class b extends AbstractC6464b {

        /* JADX INFO: renamed from: b */
        public static final b f10628b = new b(false);

        /* JADX INFO: renamed from: c */
        public static final b f10629c = new b(true);

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: k */
        public AbstractC6393h<Object> mo11808k(Class<?> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: j */
        public AbstractC6464b mo11807j(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
            return new e(this, cls, abstractC6393h);
        }

        public b(boolean z11) {
            super(z11);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b$c */
    /* JADX INFO: compiled from: PropertySerializerMap.java */
    public static final class c extends AbstractC6464b {

        /* JADX INFO: renamed from: b */
        public final f[] f10630b;

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: j */
        public AbstractC6464b mo11807j(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
            f[] fVarArr = this.f10630b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.f10623a ? new e(this, cls, abstractC6393h) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, abstractC6393h);
            return new c(this, fVarArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: k */
        public AbstractC6393h<Object> mo11808k(Class<?> cls) {
            f[] fVarArr = this.f10630b;
            f fVar = fVarArr[0];
            if (fVar.f10635a == cls) {
                return fVar.f10636b;
            }
            f fVar2 = fVarArr[1];
            if (fVar2.f10635a == cls) {
                return fVar2.f10636b;
            }
            f fVar3 = fVarArr[2];
            if (fVar3.f10635a == cls) {
                return fVar3.f10636b;
            }
            switch (fVarArr.length) {
                case 8:
                    f fVar4 = fVarArr[7];
                    if (fVar4.f10635a == cls) {
                        return fVar4.f10636b;
                    }
                case 7:
                    f fVar5 = fVarArr[6];
                    if (fVar5.f10635a == cls) {
                        return fVar5.f10636b;
                    }
                case 6:
                    f fVar6 = fVarArr[5];
                    if (fVar6.f10635a == cls) {
                        return fVar6.f10636b;
                    }
                case 5:
                    f fVar7 = fVarArr[4];
                    if (fVar7.f10635a == cls) {
                        return fVar7.f10636b;
                    }
                case 4:
                    f fVar8 = fVarArr[3];
                    if (fVar8.f10635a == cls) {
                        return fVar8.f10636b;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public c(AbstractC6464b abstractC6464b, f[] fVarArr) {
            super(abstractC6464b);
            this.f10630b = fVarArr;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b$e */
    /* JADX INFO: compiled from: PropertySerializerMap.java */
    public static final class e extends AbstractC6464b {

        /* JADX INFO: renamed from: b */
        public final Class<?> f10633b;

        /* JADX INFO: renamed from: c */
        public final AbstractC6393h<Object> f10634c;

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: j */
        public AbstractC6464b mo11807j(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
            return new a(this, this.f10633b, this.f10634c, cls, abstractC6393h);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.AbstractC6464b
        /* JADX INFO: renamed from: k */
        public AbstractC6393h<Object> mo11808k(Class<?> cls) {
            if (cls == this.f10633b) {
                return this.f10634c;
            }
            return null;
        }

        public e(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
            super(abstractC6464b);
            this.f10633b = cls;
            this.f10634c = abstractC6393h;
        }
    }

    public AbstractC6464b(boolean z11) {
        this.f10623a = z11;
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC6464b mo11807j(Class<?> cls, AbstractC6393h<Object> abstractC6393h);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC6393h<Object> mo11808k(Class<?> cls);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b$d */
    /* JADX INFO: compiled from: PropertySerializerMap.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final AbstractC6393h<Object> f10631a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6464b f10632b;

        public d(AbstractC6393h<Object> abstractC6393h, AbstractC6464b abstractC6464b) {
            this.f10631a = abstractC6393h;
            this.f10632b = abstractC6464b;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.b$f */
    /* JADX INFO: compiled from: PropertySerializerMap.java */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final Class<?> f10635a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6393h<Object> f10636b;

        public f(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
            this.f10635a = cls;
            this.f10636b = abstractC6393h;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC6464b m11798c() {
        return b.f10628b;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6464b m11799d() {
        return b.f10629c;
    }

    /* JADX INFO: renamed from: a */
    public final d m11800a(JavaType javaType, AbstractC6393h<Object> abstractC6393h) {
        return new d(abstractC6393h, mo11807j(javaType.getRawClass(), abstractC6393h));
    }

    /* JADX INFO: renamed from: b */
    public final d m11801b(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
        return new d(abstractC6393h, mo11807j(cls, abstractC6393h));
    }

    public AbstractC6464b(AbstractC6464b abstractC6464b) {
        this.f10623a = abstractC6464b.f10623a;
    }

    /* JADX INFO: renamed from: e */
    public final d m11802e(Class<?> cls, AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hFindKeySerializer = abstractC6446m.findKeySerializer(cls, beanProperty);
        return new d(abstractC6393hFindKeySerializer, mo11807j(cls, abstractC6393hFindKeySerializer));
    }

    /* JADX INFO: renamed from: f */
    public final d m11803f(JavaType javaType, AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hFindPrimaryPropertySerializer = abstractC6446m.findPrimaryPropertySerializer(javaType, beanProperty);
        return new d(abstractC6393hFindPrimaryPropertySerializer, mo11807j(javaType.getRawClass(), abstractC6393hFindPrimaryPropertySerializer));
    }

    /* JADX INFO: renamed from: g */
    public final d m11804g(Class<?> cls, AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hFindPrimaryPropertySerializer = abstractC6446m.findPrimaryPropertySerializer(cls, beanProperty);
        return new d(abstractC6393hFindPrimaryPropertySerializer, mo11807j(cls, abstractC6393hFindPrimaryPropertySerializer));
    }

    /* JADX INFO: renamed from: h */
    public final d m11805h(JavaType javaType, AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hFindContentValueSerializer = abstractC6446m.findContentValueSerializer(javaType, beanProperty);
        return new d(abstractC6393hFindContentValueSerializer, mo11807j(javaType.getRawClass(), abstractC6393hFindContentValueSerializer));
    }

    /* JADX INFO: renamed from: i */
    public final d m11806i(Class<?> cls, AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hFindContentValueSerializer = abstractC6446m.findContentValueSerializer(cls, beanProperty);
        return new d(abstractC6393hFindContentValueSerializer, mo11807j(cls, abstractC6393hFindContentValueSerializer));
    }
}
