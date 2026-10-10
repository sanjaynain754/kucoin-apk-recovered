package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.InterfaceC6363h;
import com.fasterxml.jackson.databind.ser.InterfaceC6469k;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p465n7.AbstractC42759a;

/* JADX INFO: loaded from: classes45.dex */
public class OptionalHandlerFactory implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f10364b;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f10365c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC42759a f10366d;
    public static final OptionalHandlerFactory instance;
    private static final long serialVersionUID = 1;
    private final Map<String, String> _sqlDeserializers;
    private final Map<String, Object> _sqlSerializers;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0007
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L8
        L6:
            r1 = r0
        L7:
            r2 = r0
        L8:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10364b = r1
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10365c = r2
            n7.a r0 = p465n7.AbstractC42759a.m93691c()     // Catch: java.lang.Throwable -> L10
        L10:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10366d = r0
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r0 = new com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
            r0.<init>()
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.instance = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.<clinit>():void");
    }

    /* JADX INFO: renamed from: c */
    public final Object m11427c(Class<?> cls, JavaType javaType) {
        try {
            return C6490g.m11946l(cls, false);
        } catch (Throwable th2) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + C6490g.m11904G(javaType) + ", problem: (" + th2.getClass().getName() + ") " + th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11425a(Class<?> cls, Class<?> cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    public boolean hasDeserializerFor(Class<?> cls) {
        if (m11425a(cls, f10364b) || m11425a(cls, f10365c)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("javax.xml.") || m11426b(cls, "javax.xml.")) {
            return true;
        }
        return this._sqlDeserializers.containsKey(name);
    }

    public OptionalHandlerFactory() {
        HashMap map = new HashMap();
        this._sqlDeserializers = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this._sqlSerializers = map2;
        map2.put("java.sql.Timestamp", DateSerializer.instance);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11426b(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final Object m11428d(String str, JavaType javaType) {
        try {
            return m11427c(Class.forName(str), javaType);
        } catch (Throwable th2) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + C6490g.m11904G(javaType) + ", problem: (" + th2.getClass().getName() + ") " + th2.getMessage());
        }
    }

    public AbstractC6390e<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Object objM11428d;
        AbstractC6390e<?> abstractC6390eMo93692a;
        Class<?> rawClass = javaType.getRawClass();
        AbstractC42759a abstractC42759a = f10366d;
        if (abstractC42759a != null && (abstractC6390eMo93692a = abstractC42759a.mo93692a(rawClass)) != null) {
            return abstractC6390eMo93692a;
        }
        if (m11425a(rawClass, f10364b)) {
            return (AbstractC6390e) m11428d("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", javaType);
        }
        if (m11425a(rawClass, f10365c)) {
            return (AbstractC6390e) m11428d("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", javaType);
        }
        String name = rawClass.getName();
        String str = this._sqlDeserializers.get(name);
        if (str != null) {
            return (AbstractC6390e) m11428d(str, javaType);
        }
        if ((!name.startsWith("javax.xml.") && !m11426b(rawClass, "javax.xml.")) || (objM11428d = m11428d("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", javaType)) == null) {
            return null;
        }
        return ((InterfaceC6363h) objM11428d).m11278a(javaType, deserializationConfig, abstractC6340b);
    }

    public AbstractC6393h<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC6340b abstractC6340b) {
        Object objM11428d;
        AbstractC6393h<?> abstractC6393hMo93693b;
        Class<?> rawClass = javaType.getRawClass();
        if (m11425a(rawClass, f10364b)) {
            return (AbstractC6393h) m11428d("com.fasterxml.jackson.databind.ext.DOMSerializer", javaType);
        }
        AbstractC42759a abstractC42759a = f10366d;
        if (abstractC42759a != null && (abstractC6393hMo93693b = abstractC42759a.mo93693b(rawClass)) != null) {
            return abstractC6393hMo93693b;
        }
        String name = rawClass.getName();
        Object obj = this._sqlSerializers.get(name);
        if (obj != null) {
            if (obj instanceof AbstractC6393h) {
                return (AbstractC6393h) obj;
            }
            return (AbstractC6393h) m11428d((String) obj, javaType);
        }
        if ((!name.startsWith("javax.xml.") && !m11426b(rawClass, "javax.xml.")) || (objM11428d = m11428d("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", javaType)) == null) {
            return null;
        }
        return ((InterfaceC6469k) objM11428d).m11824b(serializationConfig, javaType, abstractC6340b);
    }
}
