package com.jumio.core.models;

/* JADX INFO: loaded from: classes56.dex */
@kotlin.Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0002J*\u0010'\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010)\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010*\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u000fH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/jumio/core/models/ReportingModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "timeMap", "Ljava/util/TreeMap;", "", "Lcom/jumio/core/models/ReportingModel$CredentialTime;", "usedModulesList", "Lcom/jumio/core/util/ConcurrentMutableList;", "Lcom/jumio/core/plugins/PluginModule;", "lastCredentialId", "lastCredentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "lastScanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "getLastScanStep", "()Lcom/jumio/sdk/enums/JumioScanStep;", "setLastScanStep", "(Lcom/jumio/sdk/enums/JumioScanStep;)V", "startTimestamp", "", "start", "", "addUsedModule", "pluginModule", "startCredential", "id", "endCredential", "startScanPart", "credentialPart", "endScanPart", "getData", "Lcom/jumio/analytics/MetaInfo;", "credentialsModel", "Lcom/jumio/core/models/CredentialsModel;", "canceled", "", "constructDropOffData", "setDropOffData", "scanStep", "getCredentialPartOrder", "getScanStepOrder", "CredentialTime", "TimeSpan", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@com.jumio.commons.PersistWith("ReportingModel")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReportingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportingModel.kt\ncom/jumio/core/models/ReportingModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n381#2,7:243\n381#2,7:250\n216#3,2:257\n1557#4:259\n1628#4,3:260\n360#4,7:264\n774#4:271\n865#4,2:272\n1#5:263\n*S KotlinDebug\n*F\n+ 1 ReportingModel.kt\ncom/jumio/core/models/ReportingModel\n*L\n56#1:243,7\n65#1:250,7\n80#1:257,2\n86#1:259\n86#1:260,3\n106#1:264,7\n113#1:271\n113#1:272,2\n*E\n"})
public final class ReportingModel implements com.jumio.core.model.StaticModel {

    /* JADX INFO: renamed from: a */
    public final java.util.TreeMap f14304a;

    /* JADX INFO: renamed from: b */
    public final com.jumio.core.util.ConcurrentMutableList f14305b;

    /* JADX INFO: renamed from: c */
    public java.lang.String f14306c;

    /* JADX INFO: renamed from: d */
    public com.jumio.sdk.enums.JumioCredentialPart f14307d;

    /* JADX INFO: renamed from: e */
    public com.jumio.sdk.enums.JumioScanStep f14308e;

    /* JADX INFO: renamed from: f */
    public long f14309f;

    public ReportingModel() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.f14304a = r0
            com.jumio.core.util.ConcurrentMutableList r0 = com.jumio.core.util.ConcurrentMutableListKt.concurrentMutableListOf()
            r1.f14305b = r0
            java.lang.String r0 = ""
            r1.f14306c = r0
            return
    }

    /* JADX INFO: renamed from: a */
    public final com.jumio.analytics.MetaInfo m14564a(com.jumio.core.models.CredentialsModel r17, boolean r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "credentialsModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.jumio.analytics.MetaInfo r2 = new com.jumio.analytics.MetaInfo
            r2.<init>()
            r4 = 1
            r5 = 0
            if (r18 == 0) goto L1a4
            java.util.ArrayList r6 = r1.m14555a()
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L34
            java.lang.Object r7 = r6.next()
            r8 = r7
            com.jumio.sdk.credentials.JumioCredentialInfo r8 = (com.jumio.sdk.credentials.JumioCredentialInfo) r8
            java.lang.String r8 = r8.getId()
            java.lang.String r9 = r0.f14306c
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L1a
            goto L35
        L34:
            r7 = r5
        L35:
            com.jumio.sdk.credentials.JumioCredentialInfo r7 = (com.jumio.sdk.credentials.JumioCredentialInfo) r7
            if (r7 == 0) goto L85
            com.jumio.sdk.credentials.JumioCredentialCategory r6 = r7.getCategory()
            java.lang.String r6 = r6.toString()
            kotlin.jvm.internal.StringCompanionObject r8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.util.ArrayList r9 = r1.m14555a()
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L4e:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L6b
            java.lang.Object r11 = r9.next()
            com.jumio.sdk.credentials.JumioCredentialInfo r11 = (com.jumio.sdk.credentials.JumioCredentialInfo) r11
            java.lang.String r11 = r11.getId()
            java.lang.String r12 = r7.getId()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)
            if (r11 == 0) goto L69
            goto L6c
        L69:
            int r10 = r10 + r4
            goto L4e
        L6b:
            r10 = -1
        L6c:
            int r10 = r10 + r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String r9 = "%02d"
            java.lang.String r7 = java.lang.String.format(r8, r9, r7)
            java.lang.String r8 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            goto L88
        L85:
            java.lang.String r6 = ""
            r7 = r6
        L88:
            com.jumio.sdk.enums.JumioCredentialPart r8 = r0.f14307d
            java.lang.String r9 = " | "
            if (r8 == 0) goto La0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r9)
            r10.append(r8)
            java.lang.String r6 = r10.toString()
        La0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            com.jumio.sdk.enums.JumioCredentialPart r7 = r0.f14307d
            if (r7 != 0) goto Lae
            r7 = -1
            goto Lb6
        Lae:
            int[] r10 = jumio.core.AbstractC40701n3.f90338a
            int r7 = r7.ordinal()
            r7 = r10[r7]
        Lb6:
            java.lang.String r10 = "00"
            java.lang.String r11 = "70"
            switch(r7) {
                case -1: goto Ld7;
                case 0: goto Lbd;
                case 1: goto Ld4;
                case 2: goto Ld1;
                case 3: goto Lce;
                case 4: goto Lcb;
                case 5: goto Lc8;
                case 6: goto Lc5;
                case 7: goto Lc3;
                default: goto Lbd;
            }
        Lbd:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        Lc3:
            r7 = r11
            goto Ld8
        Lc5:
            java.lang.String r7 = "60"
            goto Ld8
        Lc8:
            java.lang.String r7 = "40"
            goto Ld8
        Lcb:
            java.lang.String r7 = "30"
            goto Ld8
        Lce:
            java.lang.String r7 = "0"
            goto Ld8
        Ld1:
            java.lang.String r7 = "20"
            goto Ld8
        Ld4:
            java.lang.String r7 = "10"
            goto Ld8
        Ld7:
            r7 = r10
        Ld8:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.jumio.sdk.enums.JumioScanStep r8 = r0.f14308e
            if (r8 == 0) goto Lf5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            r12.append(r9)
            r12.append(r8)
            java.lang.String r6 = r12.toString()
        Lf5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            com.jumio.sdk.enums.JumioScanStep r7 = r0.f14308e
            if (r7 != 0) goto L103
            r7 = -1
            goto L10b
        L103:
            int[] r9 = jumio.core.AbstractC40701n3.f90339b
            int r7 = r7.ordinal()
            r7 = r9[r7]
        L10b:
            switch(r7) {
                case -1: goto L13f;
                case 0: goto L10e;
                case 1: goto L13d;
                case 2: goto L13a;
                case 3: goto L137;
                case 4: goto L134;
                case 5: goto L131;
                case 6: goto L12e;
                case 7: goto L12b;
                case 8: goto L128;
                case 9: goto L125;
                case 10: goto L122;
                case 11: goto L11f;
                case 12: goto L11d;
                case 13: goto L11a;
                case 14: goto L117;
                case 15: goto L114;
                default: goto L10e;
            }
        L10e:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L114:
            java.lang.String r10 = "91"
            goto L13f
        L117:
            java.lang.String r10 = "84"
            goto L13f
        L11a:
            java.lang.String r10 = "77"
            goto L13f
        L11d:
            r10 = r11
            goto L13f
        L11f:
            java.lang.String r10 = "63"
            goto L13f
        L122:
            java.lang.String r10 = "56"
            goto L13f
        L125:
            java.lang.String r10 = "49"
            goto L13f
        L128:
            java.lang.String r10 = "42"
            goto L13f
        L12b:
            java.lang.String r10 = "38"
            goto L13f
        L12e:
            java.lang.String r10 = "35"
            goto L13f
        L131:
            java.lang.String r10 = "32"
            goto L13f
        L134:
            java.lang.String r10 = "28"
            goto L13f
        L137:
            java.lang.String r10 = "21"
            goto L13f
        L13a:
            java.lang.String r10 = "14"
            goto L13f
        L13d:
            java.lang.String r10 = "07"
        L13f:
            r8.append(r10)
            java.lang.String r7 = r8.toString()
            java.util.List r8 = r1.f14205a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L151:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L168
            java.lang.Object r10 = r8.next()
            r11 = r10
            com.jumio.core.models.CredentialDataModel r11 = (com.jumio.core.models.CredentialDataModel) r11
            boolean r11 = r11.mo14552a()
            if (r11 != 0) goto L151
            r9.add(r10)
            goto L151
        L168:
            java.util.ArrayList r8 = r1.m14555a()
            boolean r8 = r8.isEmpty()
            java.lang.String r10 = "000000"
            java.lang.String r11 = "SDK INIT"
            if (r8 == 0) goto L179
        L176:
            r7 = r10
            r6 = r11
            goto L18b
        L179:
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L184
            java.lang.String r6 = "SUBMISSION"
            java.lang.String r7 = "990000"
            goto L18b
        L184:
            int r8 = r6.length()
            if (r8 != 0) goto L18b
            goto L176
        L18b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r7 = 32
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "dropOffInfo"
            r2.put(r7, r6)
        L1a4:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.TreeMap r7 = r0.f14304a
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L1b3:
            boolean r8 = r7.hasNext()
            r9 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r10 = "total"
            if (r8 == 0) goto L21a
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r11 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            jumio.core.l3 r8 = (jumio.core.C40691l3) r8
            r8.getClass()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            jumio.core.m3 r13 = r8.f90320a
            long r13 = r13.f90329b
            long r3 = (long) r9
            long r13 = r13 / r3
            int r9 = (int) r13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.put(r10, r9)
            java.util.HashMap r8 = r8.f90321b
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L1ed:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L215
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            com.jumio.sdk.enums.JumioCredentialPart r10 = (com.jumio.sdk.enums.JumioCredentialPart) r10
            java.lang.String r10 = r10.toString()
            java.lang.Object r9 = r9.getValue()
            jumio.core.m3 r9 = (jumio.core.C40696m3) r9
            long r13 = r9.f90329b
            long r13 = r13 / r3
            int r9 = (int) r13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.put(r10, r9)
            goto L1ed
        L215:
            r6.put(r11, r12)
            r4 = 1
            goto L1b3
        L21a:
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r0.f14309f
            long r3 = r3 - r7
            long r7 = (long) r9
            long r3 = r3 / r7
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.put(r10, r3)
            java.lang.String r3 = "sec"
            r2.put(r3, r6)
            com.jumio.core.util.ConcurrentMutableList r3 = r0.f14305b
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r6)
            r4.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L241:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L255
            java.lang.Object r6 = r3.next()
            jumio.core.W2 r6 = (jumio.core.EnumC40613W2) r6
            java.lang.String r6 = r6.toString()
            r4.add(r6)
            goto L241
        L255:
            java.lang.String r3 = "usedModules"
            r2.put(r3, r4)
            java.util.List r3 = r1.f14205a
            java.util.Iterator r3 = r3.iterator()
        L260:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L274
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.jumio.core.models.CredentialDataModel r6 = (com.jumio.core.models.CredentialDataModel) r6
            com.jumio.sdk.credentials.JumioCredentialCategory r6 = r6.f14198b
            com.jumio.sdk.credentials.JumioCredentialCategory r7 = com.jumio.sdk.credentials.JumioCredentialCategory.FACE
            if (r6 != r7) goto L260
            goto L275
        L274:
            r4 = r5
        L275:
            com.jumio.core.models.CredentialDataModel r4 = (com.jumio.core.models.CredentialDataModel) r4
            r3 = 2
            if (r4 != 0) goto L27b
            goto L29c
        L27b:
            java.util.SortedMap r4 = r4.f14201e
            com.jumio.sdk.enums.JumioCredentialPart r6 = com.jumio.sdk.enums.JumioCredentialPart.FACE
            java.lang.Object r4 = r4.get(r6)
            com.jumio.core.models.ScanPartModel r4 = (com.jumio.core.models.ScanPartModel) r4
            if (r4 != 0) goto L288
            goto L29c
        L288:
            com.jumio.core.data.ScanMode r4 = r4.getMode()
            int[] r6 = jumio.core.AbstractC40706o3.f90343a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            r6 = 1
            if (r4 == r6) goto L2a4
            if (r4 == r3) goto L2a1
            r6 = 3
            if (r4 == r6) goto L29e
        L29c:
            r4 = r5
            goto L2a6
        L29e:
            java.lang.String r4 = "JUMIO_STANDARD"
            goto L2a6
        L2a1:
            java.lang.String r4 = "JUMIO_LIVENESS"
            goto L2a6
        L2a4:
            java.lang.String r4 = "JUMIO_PREMIUM"
        L2a6:
            if (r4 == 0) goto L2ad
            java.lang.String r6 = "livenessCaptureType"
            r2.put(r6, r4)
        L2ad:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r1 = r1.f14205a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2bd:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L2d4
            java.lang.Object r7 = r1.next()
            r8 = r7
            com.jumio.core.models.CredentialDataModel r8 = (com.jumio.core.models.CredentialDataModel) r8
            com.jumio.sdk.credentials.JumioCredentialCategory r8 = r8.f14198b
            com.jumio.sdk.credentials.JumioCredentialCategory r9 = com.jumio.sdk.credentials.JumioCredentialCategory.f14680ID
            if (r8 != r9) goto L2bd
            r6.add(r7)
            goto L2bd
        L2d4:
            java.util.Iterator r1 = r6.iterator()
        L2d8:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L35f
            java.lang.Object r6 = r1.next()
            com.jumio.core.models.CredentialDataModel r6 = (com.jumio.core.models.CredentialDataModel) r6
            java.util.SortedMap r7 = r6.f14201e
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2ee:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L35c
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            com.jumio.sdk.enums.JumioCredentialPart r9 = (com.jumio.sdk.enums.JumioCredentialPart) r9
            java.lang.Object r8 = r8.getValue()
            com.jumio.core.models.ScanPartModel r8 = (com.jumio.core.models.ScanPartModel) r8
            boolean r9 = r8 instanceof com.jumio.core.models.PhysicalIdScanPartModel
            if (r9 == 0) goto L30d
            com.jumio.core.models.PhysicalIdScanPartModel r8 = (com.jumio.core.models.PhysicalIdScanPartModel) r8
            goto L30e
        L30d:
            r8 = r5
        L30e:
            if (r8 != 0) goto L311
            goto L2ee
        L311:
            com.jumio.core.models.DocumentDataModel r9 = r8.getDocumentData()
            boolean r10 = r9 instanceof com.jumio.core.models.MrzDataModel
            if (r10 == 0) goto L31c
            com.jumio.core.models.MrzDataModel r9 = (com.jumio.core.models.MrzDataModel) r9
            goto L31d
        L31c:
            r9 = r5
        L31d:
            if (r9 == 0) goto L324
            com.jumio.core.enums.EMRTDStatus r9 = r9.getEmrtdStatus()
            goto L325
        L324:
            r9 = r5
        L325:
            if (r9 != 0) goto L32a
            r10 = -1
        L328:
            r15 = -1
            goto L333
        L32a:
            int[] r10 = jumio.core.AbstractC40706o3.f90344b
            int r11 = r9.ordinal()
            r10 = r10[r11]
            goto L328
        L333:
            if (r10 == r15) goto L2ee
            r11 = 1
            if (r10 == r11) goto L2ee
            if (r10 == r3) goto L2ee
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.lang.String r12 = "id"
            java.lang.String r13 = r6.f14197a
            r10.put(r12, r13)
            java.lang.String r8 = jumio.core.AbstractC40505A3.m89147a(r8)
            java.lang.String r12 = "uploadType"
            r10.put(r12, r8)
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "status"
            r10.put(r9, r8)
            r4.add(r10)
            goto L2ee
        L35c:
            r15 = -1
            goto L2d8
        L35f:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L366
            r5 = r4
        L366:
            if (r5 == 0) goto L36d
            java.lang.String r1 = "emrtdStatus"
            r2.put(r1, r5)
        L36d:
            return r2
    }

    /* JADX INFO: renamed from: a */
    public final void m14565a(java.lang.String r9, com.jumio.sdk.enums.JumioCredentialPart r10) {
            r8 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "credentialPart"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.TreeMap r0 = r8.f14304a
            java.lang.Object r9 = r0.get(r9)
            jumio.core.l3 r9 = (jumio.core.C40691l3) r9
            if (r9 == 0) goto L36
            java.util.HashMap r9 = r9.f90321b
            if (r9 == 0) goto L36
            java.lang.Object r9 = r9.get(r10)
            jumio.core.m3 r9 = (jumio.core.C40696m3) r9
            if (r9 == 0) goto L36
            long r0 = r9.f90328a
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L34
            long r0 = r9.f90329b
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r9.f90328a
            long r4 = r4 - r6
            long r4 = r4 + r0
            r9.f90329b = r4
        L34:
            r9.f90328a = r2
        L36:
            return
    }

    /* JADX INFO: renamed from: b */
    public final void m14566b(java.lang.String r2, com.jumio.sdk.enums.JumioCredentialPart r3) {
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "credentialPart"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.f14306c = r2
            r1.f14307d = r3
            r0 = 0
            r1.f14308e = r0
            java.util.TreeMap r0 = r1.f14304a
            java.lang.Object r2 = r0.get(r2)
            jumio.core.l3 r2 = (jumio.core.C40691l3) r2
            if (r2 == 0) goto L35
            java.util.HashMap r2 = r2.f90321b
            if (r2 == 0) goto L35
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L2d
            jumio.core.m3 r0 = new jumio.core.m3
            r0.<init>()
            r2.put(r3, r0)
        L2d:
            jumio.core.m3 r0 = (jumio.core.C40696m3) r0
            long r2 = java.lang.System.currentTimeMillis()
            r0.f90328a = r2
        L35:
            return
    }
}
