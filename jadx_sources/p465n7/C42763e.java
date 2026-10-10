package p465n7;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* JADX INFO: renamed from: n7.e */
/* JADX INFO: compiled from: Java7SupportImpl.java */
/* JADX INFO: loaded from: classes45.dex */
public class C42763e extends AbstractC42762d {

    /* JADX INFO: renamed from: b */
    public final Class<?> f94719b = ConstructorProperties.class;

    @Override // p465n7.AbstractC42762d
    /* JADX INFO: renamed from: b */
    public Boolean mo93697b(AbstractC6404a abstractC6404a) {
        Transient annotation = abstractC6404a.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // p465n7.AbstractC42762d
    /* JADX INFO: renamed from: c */
    public Boolean mo93698c(AbstractC6404a abstractC6404a) {
        if (abstractC6404a.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // p465n7.AbstractC42762d
    /* JADX INFO: renamed from: a */
    public PropertyName mo93696a(AnnotatedParameter annotatedParameter) {
        ConstructorProperties annotation;
        AnnotatedWithParams owner = annotatedParameter.getOwner();
        if (owner != null && (annotation = owner.getAnnotation(ConstructorProperties.class)) != null) {
            String[] strArrValue = annotation.value();
            int index = annotatedParameter.getIndex();
            if (index < strArrValue.length) {
                return PropertyName.construct(strArrValue[index]);
            }
            return null;
        }
        return null;
    }
}
