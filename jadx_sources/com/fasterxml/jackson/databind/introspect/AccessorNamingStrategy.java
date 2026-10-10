package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public abstract class AccessorNamingStrategy {

    public static abstract class Provider implements Serializable {
        private static final long serialVersionUID = 1;

        public abstract AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, C6406c c6406c, AbstractC6340b abstractC6340b);

        public abstract AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, C6406c c6406c);

        public abstract AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, C6406c c6406c);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo11433a(AnnotatedMethod annotatedMethod, String str);

    /* JADX INFO: renamed from: b */
    public abstract String mo11434b(AnnotatedMethod annotatedMethod, String str);

    /* JADX INFO: renamed from: c */
    public abstract String mo11435c(AnnotatedMethod annotatedMethod, String str);

    /* JADX INFO: renamed from: d */
    public abstract String mo11436d(AnnotatedField annotatedField, String str);
}
