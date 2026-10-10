package com.fasterxml.jackson.databind.ext;

/* JADX INFO: loaded from: classes45.dex */
public class OptionalHandlerFactory implements java.io.Serializable {

    /* JADX INFO: renamed from: b */
    public static final java.lang.Class<?> f10364b = null;

    /* JADX INFO: renamed from: c */
    public static final java.lang.Class<?> f10365c = null;

    /* JADX INFO: renamed from: d */
    public static final p465n7.AbstractC42759a f10366d = null;
    public static final com.fasterxml.jackson.databind.ext.OptionalHandlerFactory instance = null;
    private static final long serialVersionUID = 1;
    private final java.util.Map<java.lang.String, java.lang.String> _sqlDeserializers;
    private final java.util.Map<java.lang.String, java.lang.Object> _sqlSerializers;

    static {
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
    }

    public OptionalHandlerFactory() {
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4._sqlDeserializers = r0
            java.lang.String r1 = "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"
            java.lang.String r2 = "java.sql.Date"
            r0.put(r2, r1)
            java.lang.String r1 = "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer"
            java.lang.String r3 = "java.sql.Timestamp"
            r0.put(r3, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4._sqlSerializers = r0
            com.fasterxml.jackson.databind.ser.std.DateSerializer r1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.instance
            r0.put(r3, r1)
            java.lang.String r1 = "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"
            r0.put(r2, r1)
            java.lang.String r1 = "java.sql.Time"
            java.lang.String r2 = "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer"
            r0.put(r1, r2)
            java.lang.String r1 = "java.sql.Blob"
            java.lang.String r2 = "com.fasterxml.jackson.databind.ext.SqlBlobSerializer"
            r0.put(r1, r2)
            java.lang.String r1 = "javax.sql.rowset.serial.SerialBlob"
            r0.put(r1, r2)
            return
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11425a(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            r0 = this;
            if (r2 == 0) goto La
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11426b(java.lang.Class<?> r3, java.lang.String r4) {
            r2 = this;
        L0:
            java.lang.Class r3 = r3.getSuperclass()
            r0 = 0
            if (r3 == 0) goto L18
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r3 != r1) goto Lc
            return r0
        Lc:
            java.lang.String r0 = r3.getName()
            boolean r0 = r0.startsWith(r4)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
        L18:
            return r0
    }

    /* JADX INFO: renamed from: c */
    public final java.lang.Object m11427c(java.lang.Class<?> r5, com.fasterxml.jackson.databind.JavaType r6) {
            r4 = this;
            r0 = 0
            java.lang.Object r5 = com.fasterxml.jackson.databind.util.C6490g.m11946l(r5, r0)     // Catch: java.lang.Throwable -> L6
            return r5
        L6:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to create instance of `"
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = "` for handling values of type "
            r2.append(r5)
            java.lang.String r5 = com.fasterxml.jackson.databind.util.C6490g.m11904G(r6)
            r2.append(r5)
            java.lang.String r5 = ", problem: ("
            r2.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = ") "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    /* JADX INFO: renamed from: d */
    public final java.lang.Object m11428d(java.lang.String r5, com.fasterxml.jackson.databind.JavaType r6) {
            r4 = this;
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.Object r5 = r4.m11427c(r0, r6)     // Catch: java.lang.Throwable -> L9
            return r5
        L9:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to find class `"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "` for handling values of type "
            r2.append(r5)
            java.lang.String r5 = com.fasterxml.jackson.databind.util.C6490g.m11904G(r6)
            r2.append(r5)
            java.lang.String r5 = ", problem: ("
            r2.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = ") "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    public com.fasterxml.jackson.databind.AbstractC6390e<?> findDeserializer(com.fasterxml.jackson.databind.JavaType r5, com.fasterxml.jackson.databind.DeserializationConfig r6, com.fasterxml.jackson.databind.AbstractC6340b r7) throws com.fasterxml.jackson.databind.JsonMappingException {
            r4 = this;
            java.lang.Class r0 = r5.getRawClass()
            n7.a r1 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10366d
            if (r1 == 0) goto Lf
            com.fasterxml.jackson.databind.e r1 = r1.mo93692a(r0)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            java.lang.Class<?> r1 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10364b
            boolean r1 = r4.m11425a(r0, r1)
            if (r1 == 0) goto L20
            java.lang.String r6 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer"
            java.lang.Object r5 = r4.m11428d(r6, r5)
            com.fasterxml.jackson.databind.e r5 = (com.fasterxml.jackson.databind.AbstractC6390e) r5
            return r5
        L20:
            java.lang.Class<?> r1 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10365c
            boolean r1 = r4.m11425a(r0, r1)
            if (r1 == 0) goto L31
            java.lang.String r6 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"
            java.lang.Object r5 = r4.m11428d(r6, r5)
            com.fasterxml.jackson.databind.e r5 = (com.fasterxml.jackson.databind.AbstractC6390e) r5
            return r5
        L31:
            java.lang.String r1 = r0.getName()
            java.util.Map<java.lang.String, java.lang.String> r2 = r4._sqlDeserializers
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L46
            java.lang.Object r5 = r4.m11428d(r2, r5)
            com.fasterxml.jackson.databind.e r5 = (com.fasterxml.jackson.databind.AbstractC6390e) r5
            return r5
        L46:
            java.lang.String r2 = "javax.xml."
            boolean r1 = r1.startsWith(r2)
            r3 = 0
            if (r1 != 0) goto L57
            boolean r0 = r4.m11426b(r0, r2)
            if (r0 == 0) goto L56
            goto L57
        L56:
            return r3
        L57:
            java.lang.String r0 = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"
            java.lang.Object r0 = r4.m11428d(r0, r5)
            if (r0 != 0) goto L60
            return r3
        L60:
            com.fasterxml.jackson.databind.deser.h r0 = (com.fasterxml.jackson.databind.deser.InterfaceC6363h) r0
            com.fasterxml.jackson.databind.e r5 = r0.m11278a(r5, r6, r7)
            return r5
    }

    public com.fasterxml.jackson.databind.AbstractC6393h<?> findSerializer(com.fasterxml.jackson.databind.SerializationConfig r5, com.fasterxml.jackson.databind.JavaType r6, com.fasterxml.jackson.databind.AbstractC6340b r7) {
            r4 = this;
            java.lang.Class r0 = r6.getRawClass()
            java.lang.Class<?> r1 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10364b
            boolean r1 = r4.m11425a(r0, r1)
            if (r1 == 0) goto L15
            java.lang.String r5 = "com.fasterxml.jackson.databind.ext.DOMSerializer"
            java.lang.Object r5 = r4.m11428d(r5, r6)
            com.fasterxml.jackson.databind.h r5 = (com.fasterxml.jackson.databind.AbstractC6393h) r5
            return r5
        L15:
            n7.a r1 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10366d
            if (r1 == 0) goto L20
            com.fasterxml.jackson.databind.h r1 = r1.mo93693b(r0)
            if (r1 == 0) goto L20
            return r1
        L20:
            java.lang.String r1 = r0.getName()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4._sqlSerializers
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L3c
            boolean r5 = r2 instanceof com.fasterxml.jackson.databind.AbstractC6393h
            if (r5 == 0) goto L33
            com.fasterxml.jackson.databind.h r2 = (com.fasterxml.jackson.databind.AbstractC6393h) r2
            return r2
        L33:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r4.m11428d(r2, r6)
            com.fasterxml.jackson.databind.h r5 = (com.fasterxml.jackson.databind.AbstractC6393h) r5
            return r5
        L3c:
            java.lang.String r2 = "javax.xml."
            boolean r1 = r1.startsWith(r2)
            r3 = 0
            if (r1 != 0) goto L4d
            boolean r0 = r4.m11426b(r0, r2)
            if (r0 == 0) goto L4c
            goto L4d
        L4c:
            return r3
        L4d:
            java.lang.String r0 = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers"
            java.lang.Object r0 = r4.m11428d(r0, r6)
            if (r0 != 0) goto L56
            return r3
        L56:
            com.fasterxml.jackson.databind.ser.k r0 = (com.fasterxml.jackson.databind.ser.InterfaceC6469k) r0
            com.fasterxml.jackson.databind.h r5 = r0.m11824b(r5, r6, r7)
            return r5
    }

    public boolean hasDeserializerFor(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<?> r0 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10364b
            boolean r0 = r4.m11425a(r5, r0)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.Class<?> r0 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f10365c
            boolean r0 = r4.m11425a(r5, r0)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = "javax.xml."
            boolean r3 = r0.startsWith(r2)
            if (r3 != 0) goto L2d
            boolean r5 = r4.m11426b(r5, r2)
            if (r5 == 0) goto L26
            goto L2d
        L26:
            java.util.Map<java.lang.String, java.lang.String> r5 = r4._sqlDeserializers
            boolean r5 = r5.containsKey(r0)
            return r5
        L2d:
            return r1
    }
}
