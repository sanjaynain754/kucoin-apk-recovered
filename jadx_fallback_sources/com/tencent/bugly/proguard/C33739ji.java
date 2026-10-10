package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ji */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33739ji {

    /* JADX INFO: renamed from: h */
    public static final java.lang.String f70405h = "Matrix.WarmUpDelegate";

    /* JADX INFO: renamed from: i */
    public static final java.lang.String f70406i = "action.backtrace.warmed-up";

    /* JADX INFO: renamed from: j */
    public static final java.lang.String f70407j = ".backtrace.warmed_up";

    /* JADX INFO: renamed from: k */
    public static final java.lang.String f70408k = "warm-up";

    /* JADX INFO: renamed from: l */
    public static final java.lang.String f70409l = "clean-up";

    /* JADX INFO: renamed from: m */
    public static final java.lang.String f70410m = "consuming-up";

    /* JADX INFO: renamed from: n */
    public static final java.lang.String f70411n = "compute-disk-usage";

    /* JADX INFO: renamed from: o */
    public static volatile com.tencent.bugly.proguard.InterfaceC33781li f70412o;

    /* JADX INFO: renamed from: a */
    public boolean f70413a;

    /* JADX INFO: renamed from: b */
    public java.lang.String f70414b;

    /* JADX INFO: renamed from: c */
    public com.tencent.bugly.proguard.C33739ji.h f70415c;

    /* JADX INFO: renamed from: d */
    public com.tencent.bugly.proguard.C33739ji.g f70416d;

    /* JADX INFO: renamed from: e */
    public com.tencent.bugly.proguard.C33802mi f70417e;

    /* JADX INFO: renamed from: f */
    public com.tencent.bugly.proguard.C33865pi.c f70418f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f70419g;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ android.os.CancellationSignal f70420b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ com.tencent.bugly.proguard.C33739ji f70421c;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BUGLY */
        public class C46993a implements java.io.FileFilter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ com.tencent.bugly.proguard.InterfaceC33760ki f70422a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ com.tencent.bugly.proguard.C33739ji.a f70423b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public C46993a(com.tencent.bugly.proguard.C33739ji.a r1, com.tencent.bugly.proguard.InterfaceC33760ki r2) {
                    r0 = this;
                    r0.f70423b = r1
                    r0.f70422a = r2
                    r0.<init>()
                    return
            }

            @Override // java.io.FileFilter
            public boolean accept(java.io.File r5) {
                    r4 = this;
                    java.lang.String r0 = r5.getAbsolutePath()
                    boolean r5 = r5.exists()
                    r1 = 0
                    if (r5 == 0) goto L4f
                    com.tencent.bugly.proguard.ji$a r5 = r4.f70423b
                    com.tencent.bugly.proguard.ji r5 = r5.f70421c
                    boolean r5 = r5.m73587a(r0, r1)
                    if (r5 != 0) goto L4f
                    java.lang.String r5 = ".so"
                    boolean r5 = r0.endsWith(r5)
                    if (r5 != 0) goto L35
                    java.lang.String r5 = ".odex"
                    boolean r5 = r0.endsWith(r5)
                    if (r5 != 0) goto L35
                    java.lang.String r5 = ".oat"
                    boolean r5 = r0.endsWith(r5)
                    if (r5 != 0) goto L35
                    java.lang.String r5 = ".dex"
                    boolean r5 = r0.endsWith(r5)
                    if (r5 == 0) goto L4f
                L35:
                    java.lang.Object[] r5 = new java.lang.Object[]{r0}
                    java.lang.String r2 = "Matrix.WarmUpDelegate"
                    java.lang.String r3 = "Warming up so %s"
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r3, r5)
                    com.tencent.bugly.proguard.ki r5 = r4.f70422a
                    boolean r5 = r5.mo73594a(r0, r1)
                    if (r5 != 0) goto L4f
                    com.tencent.bugly.proguard.ji$a r5 = r4.f70423b
                    com.tencent.bugly.proguard.ji r5 = r5.f70421c
                    r5.m73589b(r0, r1)
                L4f:
                    return r1
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(com.tencent.bugly.proguard.C33739ji r1, android.os.CancellationSignal r2) {
                r0 = this;
                r0.f70421c = r1
                r0.f70420b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "Going to warm up."
                java.lang.String r3 = "Matrix.WarmUpDelegate"
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r2, r1)
                r1 = 0
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.ji r4 = r7.f70421c     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.pi$c r4 = r4.f70418f     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                java.lang.String r4 = com.tencent.bugly.proguard.C33844oi.m74469c(r4)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                boolean r2 = r2.isDirectory()     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                if (r2 != 0) goto L31
                java.lang.String r2 = "Saving path is not a directory."
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.C33858pb.m74522e(r3, r2, r4)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.ji r2 = r7.f70421c     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.mi r2 = r2.f70417e     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.mi$d r4 = com.tencent.bugly.proguard.C33802mi.d.f71000b     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                r2.m74169d(r4)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                return
            L2f:
                r2 = move-exception
                goto L70
            L31:
                com.tencent.bugly.proguard.ji r2 = r7.f70421c     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.ki r1 = r2.m73580a()     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                if (r1 != 0) goto L48
                java.lang.String r2 = "Failed to acquire warm-up invoker"
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.C33858pb.m74522e(r3, r2, r4)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                if (r1 == 0) goto Lb0
                com.tencent.bugly.proguard.ji r0 = r7.f70421c
                r0.m73583a(r1)
                return
            L48:
                com.tencent.bugly.proguard.ji r2 = r7.f70421c     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.pi$c r2 = r2.f70418f     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                java.util.HashSet<java.lang.String> r2 = r2.f71482c     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
            L52:
                boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                r5.<init>(r4)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                android.os.CancellationSignal r4 = r7.f70420b     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.ji$a$a r6 = new com.tencent.bugly.proguard.ji$a$a     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                r6.<init>(r7, r1)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                com.tencent.bugly.proguard.C33844oi.m74465a(r5, r4, r6)     // Catch: java.lang.Throwable -> L2f android.os.OperationCanceledException -> L85
                goto L52
            L6e:
                r2 = r0
                goto L88
            L70:
                java.lang.String r4 = ""
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L7c
                com.tencent.bugly.proguard.C33858pb.m74518a(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L7c
                if (r1 == 0) goto L7a
                goto L6e
            L7a:
                r2 = r0
                goto L8d
            L7c:
                r0 = move-exception
                if (r1 == 0) goto L84
                com.tencent.bugly.proguard.ji r2 = r7.f70421c
                r2.m73583a(r1)
            L84:
                throw r0
            L85:
                r2 = 1
                if (r1 == 0) goto L8d
            L88:
                com.tencent.bugly.proguard.ji r4 = r7.f70421c
                r4.m73583a(r1)
            L8d:
                if (r2 != 0) goto La9
                com.tencent.bugly.proguard.ji r1 = r7.f70421c
                com.tencent.bugly.proguard.mi r1 = r1.f70417e
                com.tencent.bugly.proguard.mi$d r2 = com.tencent.bugly.proguard.C33802mi.d.f71000b
                r1.m74169d(r2)
                com.tencent.bugly.proguard.ji r1 = r7.f70421c
                com.tencent.bugly.proguard.pi$c r2 = r1.f70418f
                android.content.Context r2 = r2.f71480a
                r1.m73581a(r2)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Warm-up done."
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r1, r0)
                goto Lb0
            La9:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Warm-up cancelled."
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r1, r0)
            Lb0:
                return
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ android.os.CancellationSignal f70424b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ com.tencent.bugly.proguard.C33739ji f70425c;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$b$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a implements java.io.FileFilter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ java.util.HashMap f70426a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ com.tencent.bugly.proguard.C33739ji.b f70427b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(com.tencent.bugly.proguard.C33739ji.b r1, java.util.HashMap r2) {
                    r0 = this;
                    r0.f70427b = r1
                    r0.f70426a = r2
                    r0.<init>()
                    return
            }

            @Override // java.io.FileFilter
            public boolean accept(java.io.File r18) {
                    r17 = this;
                    r1 = r17
                    r0 = r18
                    java.lang.String r2 = "Matrix.WarmUpDelegate"
                    r3 = 0
                    java.lang.String r4 = r0.getName()     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r5 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r6 = "_malformed_"
                    boolean r6 = r4.contains(r6)     // Catch: java.lang.Throwable -> L5a
                    r7 = 172800000(0xa4cb800, double:8.53745436E-316)
                    if (r6 != 0) goto L11b
                    java.lang.String r6 = "_temp_"
                    boolean r6 = r4.contains(r6)     // Catch: java.lang.Throwable -> L5a
                    if (r6 == 0) goto L24
                    goto L11b
                L24:
                    android.system.StructStat r6 = android.system.Os.lstat(r5)     // Catch: java.lang.Throwable -> L5a
                    long r9 = r6.st_atime     // Catch: java.lang.Throwable -> L5a
                    long r11 = r6.st_mtime     // Catch: java.lang.Throwable -> L5a
                    long r9 = java.lang.Math.max(r9, r11)     // Catch: java.lang.Throwable -> L5a
                    r11 = 1000(0x3e8, double:4.94E-321)
                    long r9 = r9 * r11
                    java.lang.String r6 = "File(%s) last access time %s"
                    java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object[] r11 = new java.lang.Object[]{r5, r11}     // Catch: java.lang.Throwable -> L5a
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r6, r11)     // Catch: java.lang.Throwable -> L5a
                    long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                    long r11 = r11 - r9
                    r13 = 259200000(0xf731400, double:1.280618154E-315)
                    int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                    if (r6 <= 0) goto L5d
                    r0.delete()     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r0 = "Delete long time no access file(%s)"
                    java.lang.Object[] r4 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L5a
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r0, r4)     // Catch: java.lang.Throwable -> L5a
                    goto L13c
                L5a:
                    r0 = move-exception
                    goto L135
                L5d:
                    long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                    int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r6 < 0) goto L7f
                    long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                    long r9 = r9 - r6
                    r6 = 604800000(0x240c8400, double:2.988109026E-315)
                    int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                    if (r4 < 0) goto L13c
                    r0.delete()     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r0 = "Delete future file(%s)"
                    java.lang.Object[] r4 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L5a
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r0, r4)     // Catch: java.lang.Throwable -> L5a
                    goto L13c
                L7f:
                    r5 = 46
                    int r5 = r4.lastIndexOf(r5)     // Catch: java.lang.Throwable -> L5a
                    r6 = -1
                    if (r5 != r6) goto L89
                    return r3
                L89:
                    java.lang.String r5 = r4.substring(r3, r5)     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r6 = ".hash"
                    boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> L5a
                    if (r6 == 0) goto L96
                    return r3
                L96:
                    java.util.HashMap r6 = r1.f70426a     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L5a
                    android.util.Pair r6 = (android.util.Pair) r6     // Catch: java.lang.Throwable -> L5a
                    if (r6 == 0) goto L10c
                    java.lang.Object r11 = r6.second     // Catch: java.lang.Throwable -> L5a
                    java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> L5a
                    long r11 = r11.longValue()     // Catch: java.lang.Throwable -> L5a
                    int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    java.lang.String r12 = "Delete file(%s) cause %s is newer(%s vs %s)."
                    if (r11 <= 0) goto Lea
                    long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object r11 = r6.second     // Catch: java.lang.Throwable -> L5a
                    java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> L5a
                    long r15 = r11.longValue()     // Catch: java.lang.Throwable -> L5a
                    long r13 = r13 - r15
                    int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                    if (r7 < 0) goto Ldb
                    java.lang.Object r7 = r6.first     // Catch: java.lang.Throwable -> L5a
                    java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L5a
                    r7.delete()     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object r7 = r6.first     // Catch: java.lang.Throwable -> L5a
                    java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object r6 = r6.second     // Catch: java.lang.Throwable -> L5a
                    java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r6, r8}     // Catch: java.lang.Throwable -> L5a
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r12, r4)     // Catch: java.lang.Throwable -> L5a
                Ldb:
                    java.util.HashMap r4 = r1.f70426a     // Catch: java.lang.Throwable -> L5a
                    android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.Throwable -> L5a
                    java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L5a
                    r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L5a
                    r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5a
                    goto L13c
                Lea:
                    long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                    long r13 = r13 - r9
                    int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                    if (r5 < 0) goto L13c
                    r0.delete()     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object r0 = r6.first     // Catch: java.lang.Throwable -> L5a
                    java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L5a
                    java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5a
                    java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object r6 = r6.second     // Catch: java.lang.Throwable -> L5a
                    java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r5, r6}     // Catch: java.lang.Throwable -> L5a
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r12, r0)     // Catch: java.lang.Throwable -> L5a
                    goto L13c
                L10c:
                    java.util.HashMap r4 = r1.f70426a     // Catch: java.lang.Throwable -> L5a
                    android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.Throwable -> L5a
                    java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L5a
                    r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L5a
                    r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5a
                    goto L13c
                L11b:
                    long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                    long r11 = r0.lastModified()     // Catch: java.lang.Throwable -> L5a
                    long r9 = r9 - r11
                    int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r4 < 0) goto L13c
                    java.lang.String r4 = "Delete malformed and temp file %s"
                    java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L5a
                    com.tencent.bugly.proguard.C33858pb.m74520c(r2, r4, r5)     // Catch: java.lang.Throwable -> L5a
                    r0.delete()     // Catch: java.lang.Throwable -> L5a
                    goto L13c
                L135:
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    java.lang.String r5 = ""
                    com.tencent.bugly.proguard.C33858pb.m74518a(r2, r0, r5, r4)
                L13c:
                    return r3
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(com.tencent.bugly.proguard.C33739ji r1, android.os.CancellationSignal r2) {
                r0 = this;
                r0.f70425c = r1
                r0.f70424b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.io.File r0 = new java.io.File
                com.tencent.bugly.proguard.ji r1 = r6.f70425c
                com.tencent.bugly.proguard.pi$c r1 = r1.f70418f
                java.lang.String r1 = com.tencent.bugly.proguard.C33844oi.m74469c(r1)
                r0.<init>(r1)
                java.io.File r1 = r0.getAbsoluteFile()
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Going to clean up saving path(%s).."
                java.lang.String r3 = "Matrix.WarmUpDelegate"
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r2, r1)
                boolean r1 = r0.isDirectory()
                if (r1 != 0) goto L2c
                com.tencent.bugly.proguard.ji r0 = r6.f70425c
                com.tencent.bugly.proguard.mi r0 = r0.f70417e
                com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.f71001c
                r0.m74169d(r1)
                return
            L2c:
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r2 = 0
                android.os.CancellationSignal r4 = r6.f70424b     // Catch: java.lang.Throwable -> L3d android.os.OperationCanceledException -> L70
                com.tencent.bugly.proguard.ji$b$a r5 = new com.tencent.bugly.proguard.ji$b$a     // Catch: java.lang.Throwable -> L3d android.os.OperationCanceledException -> L70
                r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> L3d android.os.OperationCanceledException -> L70
                com.tencent.bugly.proguard.C33844oi.m74465a(r0, r4, r5)     // Catch: java.lang.Throwable -> L3d android.os.OperationCanceledException -> L70
                goto L45
            L3d:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = ""
                com.tencent.bugly.proguard.C33858pb.m74518a(r3, r1, r5, r4)
            L45:
                com.tencent.bugly.proguard.ji r1 = r6.f70425c
                com.tencent.bugly.proguard.pi$c r1 = r1.f70418f
                android.content.Context r1 = r1.f71480a
                com.tencent.bugly.proguard.C33844oi.m74471d(r1)
                com.tencent.bugly.proguard.ji r1 = r6.f70425c
                com.tencent.bugly.proguard.mi r1 = r1.f70417e
                com.tencent.bugly.proguard.mi$d r4 = com.tencent.bugly.proguard.C33802mi.d.f71001c
                r1.m74169d(r4)
                java.io.File r0 = r0.getAbsoluteFile()
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "Clean up saving path(%s) done."
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r1, r0)
                com.tencent.bugly.proguard.li r0 = com.tencent.bugly.proguard.C33739ji.f70412o
                if (r0 == 0) goto L7d
                com.tencent.bugly.proguard.li$a r1 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70856c
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.m73997a(r1, r2)
                goto L7d
            L70:
                java.io.File r0 = r0.getAbsoluteFile()
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "Clean up saving path(%s) cancelled."
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r1, r0)
            L7d:
                return
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ android.os.CancellationSignal f70428b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ com.tencent.bugly.proguard.C33739ji f70429c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(com.tencent.bugly.proguard.C33739ji r1, android.os.CancellationSignal r2) {
                r0 = this;
                r0.f70429c = r1
                r0.f70428b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "Going to consume requested QUT."
                java.lang.String r3 = "Matrix.WarmUpDelegate"
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r2, r1)
                java.lang.String[] r1 = com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.consumeRequestedQut()
                com.tencent.bugly.proguard.ji r2 = r11.f70429c
                com.tencent.bugly.proguard.ki r2 = r2.m73580a()
                if (r2 != 0) goto L27
                com.tencent.bugly.proguard.ji r1 = r11.f70429c
                com.tencent.bugly.proguard.mi r1 = r1.f70417e
                com.tencent.bugly.proguard.mi$d r2 = com.tencent.bugly.proguard.C33802mi.d.f71002d
                r1.m74169d(r2)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Failed to acquire warm-up invoker."
                com.tencent.bugly.proguard.C33858pb.m74522e(r3, r1, r0)
                return
            L27:
                int r4 = r1.length     // Catch: java.lang.Throwable -> L61
                r5 = r0
            L29:
                if (r5 >= r4) goto L86
                r6 = r1[r5]     // Catch: java.lang.Throwable -> L61
                r7 = 58
                int r7 = r6.lastIndexOf(r7)     // Catch: java.lang.Throwable -> L61
                r8 = -1
                if (r7 == r8) goto L4b
                java.lang.String r8 = r6.substring(r0, r7)     // Catch: java.lang.Throwable -> L4b
                int r7 = r7 + 1
                java.lang.String r7 = r6.substring(r7)     // Catch: java.lang.Throwable -> L49
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L49
                int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L49
                goto L4d
            L49:
                r7 = r0
                goto L4d
            L4b:
                r7 = r0
                r8 = r6
            L4d:
                com.tencent.bugly.proguard.ji r9 = r11.f70429c     // Catch: java.lang.Throwable -> L61
                boolean r9 = r9.m73587a(r8, r7)     // Catch: java.lang.Throwable -> L61
                if (r9 != 0) goto L63
                boolean r9 = r2.mo73594a(r8, r7)     // Catch: java.lang.Throwable -> L61
                if (r9 != 0) goto L64
                com.tencent.bugly.proguard.ji r10 = r11.f70429c     // Catch: java.lang.Throwable -> L61
                r10.m73589b(r8, r7)     // Catch: java.lang.Throwable -> L61
                goto L64
            L61:
                r0 = move-exception
                goto L9c
            L63:
                r9 = r0
            L64:
                java.lang.String r7 = "Consumed requested QUT -> %s, ret = %s."
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L61
                java.lang.Object[] r6 = new java.lang.Object[]{r6, r8}     // Catch: java.lang.Throwable -> L61
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r7, r6)     // Catch: java.lang.Throwable -> L61
                android.os.CancellationSignal r6 = r11.f70428b     // Catch: java.lang.Throwable -> L61
                if (r6 == 0) goto L83
                boolean r6 = r6.isCanceled()     // Catch: java.lang.Throwable -> L61
                if (r6 == 0) goto L83
                java.lang.String r1 = "Consume requested QUT canceled."
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L61
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r1, r4)     // Catch: java.lang.Throwable -> L61
                goto L86
            L83:
                int r5 = r5 + 1
                goto L29
            L86:
                java.lang.String r1 = "Consume requested QUT done."
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L61
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r1, r0)     // Catch: java.lang.Throwable -> L61
                com.tencent.bugly.proguard.ji r0 = r11.f70429c
                r0.m73583a(r2)
                com.tencent.bugly.proguard.ji r0 = r11.f70429c
                com.tencent.bugly.proguard.mi r0 = r0.f70417e
                com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.f71002d
                r0.m74169d(r1)
                return
            L9c:
                com.tencent.bugly.proguard.ji r1 = r11.f70429c
                r1.m73583a(r2)
                com.tencent.bugly.proguard.ji r1 = r11.f70429c
                com.tencent.bugly.proguard.mi r1 = r1.f70417e
                com.tencent.bugly.proguard.mi$d r2 = com.tencent.bugly.proguard.C33802mi.d.f71002d
                r1.m74169d(r2)
                throw r0
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ android.os.CancellationSignal f70430b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ com.tencent.bugly.proguard.C33739ji f70431c;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$d$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a implements java.io.FileFilter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long[] f70432a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ com.tencent.bugly.proguard.C33739ji.d f70433b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(com.tencent.bugly.proguard.C33739ji.d r1, long[] r2) {
                    r0 = this;
                    r0.f70433b = r1
                    r0.f70432a = r2
                    r0.<init>()
                    return
            }

            @Override // java.io.FileFilter
            public boolean accept(java.io.File r10) {
                    r9 = this;
                    r0 = 0
                    java.lang.String r10 = r10.getAbsolutePath()     // Catch: android.system.ErrnoException -> L1e
                    android.system.StructStat r10 = android.system.Os.lstat(r10)     // Catch: android.system.ErrnoException -> L1e
                    long[] r1 = r9.f70432a     // Catch: android.system.ErrnoException -> L1e
                    r2 = r1[r0]     // Catch: android.system.ErrnoException -> L1e
                    r4 = 1
                    long r2 = r2 + r4
                    r1[r0] = r2     // Catch: android.system.ErrnoException -> L1e
                    r2 = 1
                    r3 = r1[r2]     // Catch: android.system.ErrnoException -> L1e
                    long r5 = r10.st_blocks     // Catch: android.system.ErrnoException -> L1e
                    long r7 = r10.st_blksize     // Catch: android.system.ErrnoException -> L1e
                    long r5 = r5 * r7
                    long r5 = r5 + r3
                    r1[r2] = r5     // Catch: android.system.ErrnoException -> L1e
                    goto L28
                L1e:
                    r10 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    java.lang.String r2 = "Matrix.WarmUpDelegate"
                    java.lang.String r3 = ""
                    com.tencent.bugly.proguard.C33858pb.m74518a(r2, r10, r3, r1)
                L28:
                    return r0
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(com.tencent.bugly.proguard.C33739ji r1, android.os.CancellationSignal r2) {
                r0 = this;
                r0.f70431c = r1
                r0.f70430b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.lang.String r0 = "Compute disk usage, file count(%s), disk usage(%s)"
                java.lang.String r1 = "Matrix.WarmUpDelegate"
                java.io.File r2 = new java.io.File
                com.tencent.bugly.proguard.ji r3 = r8.f70431c
                java.lang.String r3 = r3.f70414b
                r2.<init>(r3)
                boolean r3 = r2.isDirectory()
                if (r3 != 0) goto L1d
                com.tencent.bugly.proguard.ji r0 = r8.f70431c
                com.tencent.bugly.proguard.mi r0 = r0.f70417e
                com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.f71003e
                r0.m74169d(r1)
                return
            L1d:
                r3 = 2
                long[] r3 = new long[r3]
                r4 = 1
                r5 = 0
                android.os.CancellationSignal r6 = r8.f70430b     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L92
                com.tencent.bugly.proguard.ji$d$a r7 = new com.tencent.bugly.proguard.ji$d$a     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L92
                r7.<init>(r8, r3)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L92
                com.tencent.bugly.proguard.C33844oi.m74465a(r2, r6, r7)     // Catch: java.lang.Throwable -> L6b java.lang.Throwable -> L92
                com.tencent.bugly.proguard.ji r2 = r8.f70431c
                com.tencent.bugly.proguard.mi r2 = r2.f70417e
                com.tencent.bugly.proguard.mi$d r6 = com.tencent.bugly.proguard.C33802mi.d.f71003e
                r2.m74169d(r6)
                com.tencent.bugly.proguard.ji r2 = r8.f70431c
                com.tencent.bugly.proguard.pi$c r2 = r2.f70418f
                android.content.Context r2 = r2.f71480a
                com.tencent.bugly.proguard.C33844oi.m74472e(r2)
                r6 = r3[r5]
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r6 = r3[r4]
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r6}
                com.tencent.bugly.proguard.C33858pb.m74520c(r1, r0, r2)
                com.tencent.bugly.proguard.li r0 = com.tencent.bugly.proguard.C33739ji.f70412o
                if (r0 == 0) goto L6a
                com.tencent.bugly.proguard.li$a r1 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70861h
                r5 = r3[r5]
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r4 = r3[r4]
                java.lang.Long r3 = java.lang.Long.valueOf(r4)
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
                r0.m73997a(r1, r2)
            L6a:
                return
            L6b:
                r2 = move-exception
                com.tencent.bugly.proguard.ji r6 = r8.f70431c
                com.tencent.bugly.proguard.mi r6 = r6.f70417e
                com.tencent.bugly.proguard.mi$d r7 = com.tencent.bugly.proguard.C33802mi.d.f71003e
                r6.m74169d(r7)
                com.tencent.bugly.proguard.ji r6 = r8.f70431c
                com.tencent.bugly.proguard.pi$c r6 = r6.f70418f
                android.content.Context r6 = r6.f71480a
                com.tencent.bugly.proguard.C33844oi.m74472e(r6)
                r5 = r3[r5]
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = r3[r4]
                java.lang.Long r3 = java.lang.Long.valueOf(r6)
                java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
                com.tencent.bugly.proguard.C33858pb.m74520c(r1, r0, r3)
                throw r2
            L92:
                com.tencent.bugly.proguard.ji r2 = r8.f70431c
                com.tencent.bugly.proguard.mi r2 = r2.f70417e
                com.tencent.bugly.proguard.mi$d r6 = com.tencent.bugly.proguard.C33802mi.d.f71003e
                r2.m74169d(r6)
                com.tencent.bugly.proguard.ji r2 = r8.f70431c
                com.tencent.bugly.proguard.pi$c r2 = r2.f70418f
                android.content.Context r2 = r2.f71480a
                com.tencent.bugly.proguard.C33844oi.m74472e(r2)
                r5 = r3[r5]
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r4 = r3[r4]
                java.lang.Long r3 = java.lang.Long.valueOf(r4)
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
                com.tencent.bugly.proguard.C33858pb.m74520c(r1, r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class e implements com.tencent.bugly.proguard.InterfaceC33760ki {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ e(com.tencent.bugly.proguard.C33739ji.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33760ki
        /* JADX INFO: renamed from: a */
        public boolean mo73594a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                boolean r2 = com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.warmUp(r2, r3, r0)
                return r2
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$f */
    /* JADX INFO: compiled from: BUGLY */
    public static final class f implements com.tencent.bugly.proguard.InterfaceC33760ki, com.tencent.bugly.proguard.ServiceC33823ni.c {

        /* JADX INFO: renamed from: a */
        public com.tencent.bugly.proguard.ServiceC33823ni.e f70434a;

        /* JADX INFO: renamed from: b */
        public final java.lang.String f70435b;

        /* JADX INFO: renamed from: c */
        public android.content.Context f70436c;

        /* JADX INFO: renamed from: d */
        public android.os.Bundle f70437d;

        public f(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                com.tencent.bugly.proguard.ni$e r0 = new com.tencent.bugly.proguard.ni$e
                r0.<init>()
                r1.f70434a = r0
                r1.f70435b = r2
                return
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public void mo73595a(android.content.Context r2) {
                r1 = this;
                com.tencent.bugly.proguard.ni$e r0 = r1.f70434a
                r0.mo73595a(r2)
                return
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public boolean mo73596a() {
                r1 = this;
                com.tencent.bugly.proguard.ni$e r0 = r1.f70434a
                boolean r0 = r0.mo73596a()
                return r0
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public boolean mo73597a(android.content.Context r2, android.os.Bundle r3) {
                r1 = this;
                r1.f70436c = r2
                r1.f70437d = r3
                com.tencent.bugly.proguard.ni$e r0 = r1.f70434a
                boolean r2 = r0.mo73597a(r2, r3)
                return r2
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33760ki
        /* JADX INFO: renamed from: a */
        public boolean mo73594a(java.lang.String r5, int r6) {
                r4 = this;
                com.tencent.bugly.proguard.ni$e r0 = r4.f70434a
                boolean r0 = r0.mo73596a()
                r1 = 0
                if (r0 != 0) goto L14
                android.content.Context r0 = r4.f70436c
                android.os.Bundle r2 = r4.f70437d
                boolean r0 = r4.mo73597a(r0, r2)
                if (r0 != 0) goto L14
                return r1
            L14:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r2 = r4.f70435b
                java.lang.String r3 = "saving-path"
                r0.putString(r3, r2)
                java.lang.String r2 = "path-of-elf"
                r0.putString(r2, r5)
                java.lang.String r2 = "elf-start-offset"
                r0.putInt(r2, r6)
                com.tencent.bugly.proguard.ni$e r2 = r4.f70434a
                r3 = 100
                android.os.Bundle r0 = r2.mo74344a(r3, r0)
                if (r0 == 0) goto L3e
                java.lang.String r2 = "warm-up-result"
                int r0 = r0.getInt(r2)
                goto L40
            L3e:
                r0 = -100
            L40:
                if (r0 != 0) goto L43
                r1 = 1
            L43:
                if (r1 == 0) goto L48
                com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.notifyWarmedUp(r5, r6)
            L48:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r0}
                java.lang.String r6 = "Matrix.WarmUpDelegate"
                java.lang.String r0 = "Warm-up %s:%s - retCode %s"
                com.tencent.bugly.proguard.C33858pb.m74520c(r6, r0, r5)
                return r1
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$g */
    /* JADX INFO: compiled from: BUGLY */
    public static final class g implements java.lang.Runnable, android.os.Handler.Callback {

        /* JADX INFO: renamed from: i */
        public static final int f70438i = 1;

        /* JADX INFO: renamed from: j */
        public static final long f70439j = 300000;

        /* JADX INFO: renamed from: b */
        public java.lang.String f70440b;

        /* JADX INFO: renamed from: c */
        public java.lang.Thread f70441c;

        /* JADX INFO: renamed from: d */
        public java.util.HashMap<java.lang.String, java.lang.Runnable> f70442d;

        /* JADX INFO: renamed from: e */
        public java.util.Queue<java.lang.String> f70443e;

        /* JADX INFO: renamed from: f */
        public android.os.Handler f70444f;

        /* JADX INFO: renamed from: g */
        public boolean f70445g;

        /* JADX INFO: renamed from: h */
        public long[] f70446h;

        public g(java.lang.String r5) {
                r4 = this;
                r4.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.f70442d = r0
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r4.f70443e = r0
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1, r4)
                r4.f70444f = r0
                r0 = 0
                r4.f70445g = r0
                r1 = 1
                long[] r1 = new long[r1]
                r2 = 0
                r1[r0] = r2
                r4.f70446h = r1
                r4.f70440b = r5
                return
        }

        /* JADX INFO: renamed from: a */
        public void m73598a(java.lang.Runnable r3, java.lang.String r4) {
                r2 = this;
                java.util.Queue<java.lang.String> r0 = r2.f70443e
                monitor-enter(r0)
                java.util.Queue<java.lang.String> r1 = r2.f70443e     // Catch: java.lang.Throwable -> Ld
                boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> Ld
                if (r1 == 0) goto Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r3 = move-exception
                goto L46
            Lf:
                java.util.Queue<java.lang.String> r1 = r2.f70443e     // Catch: java.lang.Throwable -> Ld
                r1.add(r4)     // Catch: java.lang.Throwable -> Ld
                java.util.HashMap<java.lang.String, java.lang.Runnable> r1 = r2.f70442d     // Catch: java.lang.Throwable -> Ld
                r1.put(r4, r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                monitor-enter(r2)
                java.lang.Thread r3 = r2.f70441c     // Catch: java.lang.Throwable -> L26
                if (r3 == 0) goto L28
                boolean r3 = r3.isAlive()     // Catch: java.lang.Throwable -> L26
                if (r3 != 0) goto L42
                goto L28
            L26:
                r3 = move-exception
                goto L44
            L28:
                java.lang.Thread r3 = new java.lang.Thread     // Catch: java.lang.Throwable -> L26
                java.lang.String r4 = r2.f70440b     // Catch: java.lang.Throwable -> L26
                r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L26
                r2.f70441c = r3     // Catch: java.lang.Throwable -> L26
                r3.start()     // Catch: java.lang.Throwable -> L26
                android.os.Handler r3 = r2.f70444f     // Catch: java.lang.Throwable -> L26
                r4 = 1
                r3.removeMessages(r4)     // Catch: java.lang.Throwable -> L26
                android.os.Handler r3 = r2.f70444f     // Catch: java.lang.Throwable -> L26
                r0 = 300000(0x493e0, double:1.482197E-318)
                r3.sendEmptyMessageDelayed(r4, r0)     // Catch: java.lang.Throwable -> L26
            L42:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
                return
            L44:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
                throw r3
            L46:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        /* JADX INFO: renamed from: a */
        public boolean m73599a() {
                r1 = this;
                boolean r0 = r1.f70445g
                return r0
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r8) {
                r7 = this;
                int r8 = r8.what
                r0 = 0
                r1 = 1
                if (r8 != r1) goto L28
                long[] r8 = r7.f70446h
                monitor-enter(r8)
                long[] r2 = r7.f70446h     // Catch: java.lang.Throwable -> L15
                r3 = r2[r0]     // Catch: java.lang.Throwable -> L15
                r5 = 0
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 != 0) goto L17
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
                return r0
            L15:
                r0 = move-exception
                goto L26
            L17:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
                r7.f70445g = r1
                com.tencent.bugly.proguard.li r8 = com.tencent.bugly.proguard.C33739ji.f70412o
                if (r8 == 0) goto L28
                com.tencent.bugly.proguard.li$a r1 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70857d
                java.lang.Object[] r2 = new java.lang.Object[r0]
                r8.m73997a(r1, r2)
                goto L28
            L26:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L15
                throw r0
            L28:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                r0 = 0
                r11.f70445g = r0
                long[] r1 = r11.f70446h
                monitor-enter(r1)
                long[] r2 = r11.f70446h     // Catch: java.lang.Throwable -> Lbd
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbd
                r2[r0] = r3     // Catch: java.lang.Throwable -> Lbd
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbd
                r1 = 0
                r2 = r1
            L11:
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L6a
                long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
                java.lang.String r8 = "Matrix.WarmUpDelegate"
                java.lang.String r9 = "Before '%s' task execution.."
                java.lang.Object[] r10 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L53
                com.tencent.bugly.proguard.C33858pb.m74520c(r8, r9, r10)     // Catch: java.lang.Throwable -> L53
                r1.run()     // Catch: java.lang.Throwable -> L53
                java.lang.String r1 = "Matrix.WarmUpDelegate"
                java.lang.String r8 = "After '%s' task execution.."
                java.lang.Object[] r9 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L53
                com.tencent.bugly.proguard.C33858pb.m74520c(r1, r8, r9)     // Catch: java.lang.Throwable -> L53
                long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
                long r8 = r8 - r6
                com.tencent.bugly.proguard.li r1 = com.tencent.bugly.proguard.C33739ji.f70412o     // Catch: java.lang.Throwable -> L53
                if (r1 == 0) goto L6a
                java.lang.String r6 = "warm-up"
                boolean r6 = r6.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L53
                if (r6 == 0) goto L55
                com.tencent.bugly.proguard.li$a r2 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70859f     // Catch: java.lang.Throwable -> L53
                java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L53
                java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L53
                r1.m73997a(r2, r6)     // Catch: java.lang.Throwable -> L53
                goto L6a
            L53:
                r1 = move-exception
                goto Lac
            L55:
                java.lang.String r6 = "consuming-up"
                boolean r2 = r6.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L53
                if (r2 == 0) goto L6a
                com.tencent.bugly.proguard.li$a r2 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70860g     // Catch: java.lang.Throwable -> L53
                java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L53
                java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L53
                r1.m73997a(r2, r6)     // Catch: java.lang.Throwable -> L53
            L6a:
                java.util.Queue<java.lang.String> r1 = r11.f70443e     // Catch: java.lang.Throwable -> L53
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L53
                java.util.Queue<java.lang.String> r2 = r11.f70443e     // Catch: java.lang.Throwable -> L89
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L89
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L89
                if (r2 != 0) goto L8b
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
                long[] r2 = r11.f70446h
                monitor-enter(r2)
                long[] r1 = r11.f70446h     // Catch: java.lang.Throwable -> L86
                r1[r0] = r4     // Catch: java.lang.Throwable -> L86
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
                android.os.Handler r0 = r11.f70444f
                r0.removeMessages(r3)
                return
            L86:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
                throw r0
            L89:
                r2 = move-exception
                goto Laa
            L8b:
                java.util.HashMap<java.lang.String, java.lang.Runnable> r6 = r11.f70442d     // Catch: java.lang.Throwable -> L89
                java.lang.Object r6 = r6.remove(r2)     // Catch: java.lang.Throwable -> L89
                java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch: java.lang.Throwable -> L89
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
                if (r6 != 0) goto La7
                long[] r1 = r11.f70446h
                monitor-enter(r1)
                long[] r2 = r11.f70446h     // Catch: java.lang.Throwable -> La4
                r2[r0] = r4     // Catch: java.lang.Throwable -> La4
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
                android.os.Handler r0 = r11.f70444f
                r0.removeMessages(r3)
                return
            La4:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
                throw r0
            La7:
                r1 = r6
                goto L11
            Laa:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
                throw r2     // Catch: java.lang.Throwable -> L53
            Lac:
                long[] r2 = r11.f70446h
                monitor-enter(r2)
                long[] r6 = r11.f70446h     // Catch: java.lang.Throwable -> Lba
                r6[r0] = r4     // Catch: java.lang.Throwable -> Lba
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lba
                android.os.Handler r0 = r11.f70444f
                r0.removeMessages(r3)
                throw r1
            Lba:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lba
                throw r0
            Lbd:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbd
                throw r0
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$h */
    /* JADX INFO: compiled from: BUGLY */
    public static final class h extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public com.tencent.bugly.proguard.C33865pi.f f70447a;

        public h(com.tencent.bugly.proguard.C33865pi.f r1) {
                r0 = this;
                r0.<init>()
                r0.f70447a = r1
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "Warm-up received."
                java.lang.String r3 = "Matrix.WarmUpDelegate"
                com.tencent.bugly.proguard.C33858pb.m74520c(r3, r2, r1)
                java.lang.String r6 = r6.getAction()
                if (r6 != 0) goto L11
                goto L2f
            L11:
                java.lang.String r1 = "action.backtrace.warmed-up"
                boolean r6 = r6.equals(r1)
                if (r6 != 0) goto L1a
                goto L2f
            L1a:
                r6 = 1
                com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.setWarmedUp(r6)
                com.tencent.bugly.proguard.pi$f r6 = r4.f70447a
                com.tencent.bugly.proguard.C33739ji.m73578b(r6)
                r5.unregisterReceiver(r4)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r0]
                java.lang.String r0 = "Unregister receiver twice."
                com.tencent.bugly.proguard.C33858pb.m74518a(r3, r5, r0, r6)
            L2f:
                return
        }
    }

    public C33739ji() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f70413a = r0
            r1 = 1
            boolean[] r1 = new boolean[r1]
            r1[r0] = r0
            r2.f70419g = r1
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ com.tencent.bugly.proguard.C33865pi.c m73570a(com.tencent.bugly.proguard.C33739ji r0) {
            com.tencent.bugly.proguard.pi$c r0 = r0.f70418f
            return r0
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73571a(com.tencent.bugly.proguard.C33739ji r0, android.content.Context r1) {
            r0.m73581a(r1)
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73572a(com.tencent.bugly.proguard.C33739ji r0, com.tencent.bugly.proguard.InterfaceC33760ki r1) {
            r0.m73583a(r1)
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73573a(com.tencent.bugly.proguard.C33865pi.f r0) {
            m73578b(r0)
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m73574a(com.tencent.bugly.proguard.C33739ji r0, java.lang.String r1, int r2) {
            boolean r0 = r0.m73587a(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73575a(java.lang.String r0, int r1, boolean r2) {
            boolean r0 = com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.warmUp(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ com.tencent.bugly.proguard.C33802mi m73576b(com.tencent.bugly.proguard.C33739ji r0) {
            com.tencent.bugly.proguard.mi r0 = r0.f70417e
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m73577b(com.tencent.bugly.proguard.C33739ji r0, java.lang.String r1, int r2) {
            r0.m73589b(r1, r2)
            return
    }

    /* JADX INFO: renamed from: b */
    public static void m73578b(com.tencent.bugly.proguard.C33865pi.f r1) {
            com.tencent.bugly.proguard.pi$f r0 = com.tencent.bugly.proguard.C33865pi.f.f71500f
            if (r1 == r0) goto La
            com.tencent.bugly.proguard.pi$f r0 = com.tencent.bugly.proguard.C33865pi.f.f71501g
            if (r1 != r0) goto L9
            goto La
        L9:
            return
        La:
            com.tencent.bugly.proguard.pi$f r1 = com.tencent.bugly.proguard.C33865pi.f.f71498d
            int r1 = r1.f71503b
            com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.setBacktraceMode(r1)
            return
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ com.tencent.bugly.proguard.InterfaceC33760ki m73579c(com.tencent.bugly.proguard.C33739ji r0) {
            com.tencent.bugly.proguard.ki r0 = r0.m73580a()
            return r0
    }

    /* JADX INFO: renamed from: a */
    public final com.tencent.bugly.proguard.InterfaceC33760ki m73580a() {
            r4 = this;
            boolean r0 = r4.f70413a
            if (r0 == 0) goto L30
            com.tencent.bugly.proguard.ji$f r0 = new com.tencent.bugly.proguard.ji$f
            java.lang.String r1 = r4.f70414b
            r0.<init>(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.tencent.bugly.proguard.pi$c r2 = r4.f70418f
            boolean r2 = r2.f71493n
            java.lang.String r3 = "enable-logger"
            r1.putBoolean(r3, r2)
            com.tencent.bugly.proguard.pi$c r2 = r4.f70418f
            java.lang.String r2 = r2.f71494o
            java.lang.String r3 = "path-of-xlog-so"
            r1.putString(r3, r2)
            com.tencent.bugly.proguard.pi$c r2 = r4.f70418f
            android.content.Context r2 = r2.f71480a
            boolean r1 = r0.mo73597a(r2, r1)
            if (r1 == 0) goto L2e
            return r0
        L2e:
            r0 = 0
            return r0
        L30:
            com.tencent.bugly.proguard.ji$e r0 = new com.tencent.bugly.proguard.ji$e
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: a */
    public final void m73581a(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "Matrix.WarmUpDelegate"
            r1 = 0
            java.io.File r2 = com.tencent.bugly.proguard.C33844oi.m74477j(r6)     // Catch: java.io.IOException -> L14
            r2.createNewFile()     // Catch: java.io.IOException -> L14
            android.content.pm.ApplicationInfo r3 = r6.getApplicationInfo()     // Catch: java.io.IOException -> L14
            java.lang.String r3 = r3.nativeLibraryDir     // Catch: java.io.IOException -> L14
            com.tencent.bugly.proguard.C33844oi.m74466a(r2, r3)     // Catch: java.io.IOException -> L14
            goto L1c
        L14:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = ""
            com.tencent.bugly.proguard.C33858pb.m74518a(r0, r2, r4, r3)
        L1c:
            r2 = 1
            com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.setWarmedUp(r2)
            com.tencent.bugly.proguard.pi$c r2 = r5.f70418f
            com.tencent.bugly.proguard.pi$f r2 = r2.f71483d
            m73578b(r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Broadcast warmed up message to other processes."
            com.tencent.bugly.proguard.C33858pb.m74520c(r0, r3, r2)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "action.backtrace.warmed-up"
            r0.<init>(r2)
            int r2 = android.os.Process.myPid()
            java.lang.String r3 = "pid"
            r0.putExtra(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPackageName()
            r2.append(r3)
            java.lang.String r3 = ".backtrace.warmed_up"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.sendBroadcast(r0, r2)
            com.tencent.bugly.proguard.li r6 = com.tencent.bugly.proguard.C33739ji.f70412o
            if (r6 == 0) goto L62
            com.tencent.bugly.proguard.li$a r0 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70855b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.m73997a(r0, r1)
        L62:
            return
    }

    /* JADX INFO: renamed from: a */
    public void m73582a(android.os.CancellationSignal r3) {
            r2 = this;
            com.tencent.bugly.proguard.ji$g r0 = r2.f70416d
            com.tencent.bugly.proguard.ji$b r1 = new com.tencent.bugly.proguard.ji$b
            r1.<init>(r2, r3)
            java.lang.String r3 = "clean-up"
            r0.m73598a(r1, r3)
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m73583a(com.tencent.bugly.proguard.InterfaceC33760ki r2) {
            r1 = this;
            boolean r0 = r1.f70413a
            if (r0 == 0) goto Lf
            com.tencent.bugly.proguard.ji$f r2 = (com.tencent.bugly.proguard.C33739ji.f) r2
            com.tencent.bugly.proguard.pi$c r0 = r1.f70418f
            android.content.Context r0 = r0.f71480a
            com.tencent.bugly.proguard.ni$e r2 = r2.f70434a
            r2.mo73595a(r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: a */
    public void m73584a(com.tencent.bugly.proguard.C33865pi.c r10) {
            r9 = this;
            boolean[] r1 = r9.f70419g
            monitor-enter(r1)
            boolean[] r0 = r9.f70419g     // Catch: java.lang.Throwable -> L7e
            r2 = 0
            boolean r3 = r0[r2]     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto L81
        L10:
            r3 = 1
            r0[r2] = r3     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            r9.f70418f = r10
            boolean r0 = r10.f71489j
            r9.f70413a = r0
            com.tencent.bugly.proguard.ji$g r0 = new com.tencent.bugly.proguard.ji$g
            java.lang.String r1 = "WeChatBacktraceTask"
            r0.<init>(r1)
            r9.f70416d = r0
            com.tencent.bugly.proguard.mi r3 = new com.tencent.bugly.proguard.mi
            android.content.Context r5 = r10.f71480a
            com.tencent.bugly.proguard.pi$h r6 = r10.f71490k
            long r7 = r10.f71491l
            r4 = r9
            r3.<init>(r4, r5, r6, r7)
            r4.f70417e = r3
            boolean r0 = r10.f71488i
            if (r0 == 0) goto L7d
            android.content.Context r10 = r10.f71480a
            java.io.File r0 = com.tencent.bugly.proguard.C33844oi.m74477j(r10)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L51
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Matrix.WarmUpDelegate"
            java.lang.String r3 = "Has not been warmed up"
            com.tencent.bugly.proguard.C33858pb.m74520c(r1, r3, r0)
            com.tencent.bugly.proguard.mi r0 = r4.f70417e
            com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.f71000b
            r0.m74167b(r1)
        L51:
            boolean r0 = com.tencent.bugly.proguard.C33844oi.m74473f(r10)
            if (r0 == 0) goto L67
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Matrix.WarmUpDelegate"
            java.lang.String r3 = "Need clean up"
            com.tencent.bugly.proguard.C33858pb.m74520c(r1, r3, r0)
            com.tencent.bugly.proguard.mi r0 = r4.f70417e
            com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.f71001c
            r0.m74167b(r1)
        L67:
            boolean r10 = com.tencent.bugly.proguard.C33844oi.m74475h(r10)
            if (r10 == 0) goto L7d
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r0 = "Matrix.WarmUpDelegate"
            java.lang.String r1 = "Should schedule disk usage task."
            com.tencent.bugly.proguard.C33858pb.m74520c(r0, r1, r10)
            com.tencent.bugly.proguard.mi r10 = r4.f70417e
            com.tencent.bugly.proguard.mi$d r0 = com.tencent.bugly.proguard.C33802mi.d.f71003e
            r10.m74167b(r0)
        L7d:
            return
        L7e:
            r0 = move-exception
            r4 = r9
        L80:
            r10 = r0
        L81:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            throw r10
        L83:
            r0 = move-exception
            goto L80
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m73585a(com.tencent.bugly.proguard.C33865pi.c r10, com.tencent.bugly.proguard.C33865pi.f r11) {
            r9 = this;
            monitor-enter(r9)
            android.content.Context r0 = r10.f71480a     // Catch: java.lang.Throwable -> L9e
            java.io.File r0 = com.tencent.bugly.proguard.C33844oi.m74477j(r0)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto Lf
            monitor-exit(r9)
            return
        Lf:
            com.tencent.bugly.proguard.ji$h r0 = r9.f70415c     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto La1
            com.tencent.bugly.proguard.ji$h r0 = new com.tencent.bugly.proguard.ji$h     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L9e
            r9.f70415c = r0     // Catch: java.lang.Throwable -> L9e
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "Matrix.WarmUpDelegate"
            java.lang.String r2 = "Register warm-up receiver."
            com.tencent.bugly.proguard.C33858pb.m74520c(r1, r2, r0)     // Catch: java.lang.Throwable -> L9e
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L61
            r5.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "action.backtrace.warmed-up"
            r5.addAction(r0)     // Catch: java.lang.Throwable -> L61
            boolean r0 = com.tencent.bugly.common.utils.AndroidVersion.isOver34()     // Catch: java.lang.Throwable -> L61
            r1 = 0
            if (r0 == 0) goto L64
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r2 = "RECEIVER_NOT_EXPORTED"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L61
            int r8 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L61
            android.content.Context r3 = r10.f71480a     // Catch: java.lang.Throwable -> L61
            com.tencent.bugly.proguard.ji$h r4 = r9.f70415c     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            android.content.Context r10 = r10.f71480a     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Throwable -> L61
            r0.append(r10)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = ".backtrace.warmed_up"
            r0.append(r10)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L61
            r7 = 0
            com.tencent.bugly.proguard.C33614dj.m72865a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L61
            goto L9c
        L61:
            r0 = move-exception
            r10 = r0
            goto L83
        L64:
            android.content.Context r0 = r10.f71480a     // Catch: java.lang.Throwable -> L61
            com.tencent.bugly.proguard.ji$h r2 = r9.f70415c     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            android.content.Context r10 = r10.f71480a     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Throwable -> L61
            r3.append(r10)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = ".backtrace.warmed_up"
            r3.append(r10)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L61
            r0.registerReceiver(r2, r5, r10, r1)     // Catch: java.lang.Throwable -> L61
            goto L9c
        L83:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "failed to register warmed up receiver."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L9e
            r0.append(r10)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "Matrix.WarmUpDelegate"
            com.tencent.bugly.proguard.C33858pb.m74520c(r0, r10, r11)     // Catch: java.lang.Throwable -> L9e
        L9c:
            monitor-exit(r9)
            return
        L9e:
            r0 = move-exception
            r10 = r0
            goto La3
        La1:
            monitor-exit(r9)
            return
        La3:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9e
            throw r10
    }

    /* JADX INFO: renamed from: a */
    public void m73586a(java.lang.String r1) {
            r0 = this;
            r0.f70414b = r1
            com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative.setSavingPath(r1)
            return
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73587a(java.lang.String r3, int r4) {
            r2 = this;
            com.tencent.bugly.proguard.pi$c r0 = r2.f70418f
            android.content.Context r0 = r0.f71480a
            boolean r0 = com.tencent.bugly.proguard.C33844oi.a.m74480a(r0, r3, r4)
            r1 = r0 ^ 1
            if (r0 != 0) goto L1b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "Matrix.WarmUpDelegate"
            java.lang.String r0 = "Elf file %s:%s has blocked and will not do warm-up."
            com.tencent.bugly.proguard.C33858pb.m74522e(r4, r0, r3)
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: b */
    public void m73588b(android.os.CancellationSignal r3) {
            r2 = this;
            com.tencent.bugly.proguard.ji$g r0 = r2.f70416d
            com.tencent.bugly.proguard.ji$d r1 = new com.tencent.bugly.proguard.ji$d
            r1.<init>(r2, r3)
            java.lang.String r3 = "compute-disk-usage"
            r0.m73598a(r1, r3)
            return
    }

    /* JADX INFO: renamed from: b */
    public final void m73589b(java.lang.String r3, int r4) {
            r2 = this;
            com.tencent.bugly.proguard.li r0 = com.tencent.bugly.proguard.C33739ji.f70412o
            if (r0 == 0) goto L11
            com.tencent.bugly.proguard.li$a r1 = com.tencent.bugly.proguard.InterfaceC33781li.a.f70858e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            r0.m73997a(r1, r3)
        L11:
            return
    }

    /* JADX INFO: renamed from: b */
    public boolean m73590b() {
            r1 = this;
            com.tencent.bugly.proguard.ji$g r0 = r1.f70416d
            if (r0 == 0) goto L7
            boolean r0 = r0.f70445g
            return r0
        L7:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: c */
    public void m73591c() {
            r2 = this;
            com.tencent.bugly.proguard.pi$c r0 = r2.f70418f
            android.content.Context r0 = r0.f71480a
            java.io.File r0 = com.tencent.bugly.proguard.C33844oi.m74477j(r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lf
            return
        Lf:
            com.tencent.bugly.proguard.mi r0 = r2.f70417e
            com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.f71002d
            r0.m74167b(r1)
            return
    }

    /* JADX INFO: renamed from: c */
    public void m73592c(android.os.CancellationSignal r3) {
            r2 = this;
            com.tencent.bugly.proguard.ji$g r0 = r2.f70416d
            com.tencent.bugly.proguard.ji$c r1 = new com.tencent.bugly.proguard.ji$c
            r1.<init>(r2, r3)
            java.lang.String r3 = "consuming-up"
            r0.m73598a(r1, r3)
            return
    }

    /* JADX INFO: renamed from: d */
    public void m73593d(android.os.CancellationSignal r3) {
            r2 = this;
            com.tencent.bugly.proguard.ji$g r0 = r2.f70416d
            com.tencent.bugly.proguard.ji$a r1 = new com.tencent.bugly.proguard.ji$a
            r1.<init>(r2, r3)
            java.lang.String r3 = "warm-up"
            r0.m73598a(r1, r3)
            return
    }
}
