package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.ConcurrentMutableList;
import com.jumio.core.util.ConcurrentMutableListKt;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import java.util.HashMap;
import java.util.TreeMap;
import jumio.core.C40691l3;
import jumio.core.C40696m3;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0002J*\u0010'\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010)\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010*\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u000fH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/jumio/core/models/ReportingModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "timeMap", "Ljava/util/TreeMap;", "", "Lcom/jumio/core/models/ReportingModel$CredentialTime;", "usedModulesList", "Lcom/jumio/core/util/ConcurrentMutableList;", "Lcom/jumio/core/plugins/PluginModule;", "lastCredentialId", "lastCredentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "lastScanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "getLastScanStep", "()Lcom/jumio/sdk/enums/JumioScanStep;", "setLastScanStep", "(Lcom/jumio/sdk/enums/JumioScanStep;)V", "startTimestamp", "", "start", "", "addUsedModule", "pluginModule", "startCredential", "id", "endCredential", "startScanPart", "credentialPart", "endScanPart", "getData", "Lcom/jumio/analytics/MetaInfo;", "credentialsModel", "Lcom/jumio/core/models/CredentialsModel;", "canceled", "", "constructDropOffData", "setDropOffData", "scanStep", "getCredentialPartOrder", "getScanStepOrder", "CredentialTime", "TimeSpan", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("ReportingModel")
@SourceDebugExtension({"SMAP\nReportingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportingModel.kt\ncom/jumio/core/models/ReportingModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n381#2,7:243\n381#2,7:250\n216#3,2:257\n1557#4:259\n1628#4,3:260\n360#4,7:264\n774#4:271\n865#4,2:272\n1#5:263\n*S KotlinDebug\n*F\n+ 1 ReportingModel.kt\ncom/jumio/core/models/ReportingModel\n*L\n56#1:243,7\n65#1:250,7\n80#1:257,2\n86#1:259\n86#1:260,3\n106#1:264,7\n113#1:271\n113#1:272,2\n*E\n"})
public final class ReportingModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final TreeMap f14304a = new TreeMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMutableList f14305b = ConcurrentMutableListKt.concurrentMutableListOf();

    /* JADX INFO: renamed from: c */
    public String f14306c = "";

    /* JADX INFO: renamed from: d */
    public JumioCredentialPart f14307d;

    /* JADX INFO: renamed from: e */
    public JumioScanStep f14308e;

    /* JADX INFO: renamed from: f */
    public long f14309f;

    /* JADX INFO: renamed from: a */
    public final void m14565a(String id2, JumioCredentialPart credentialPart) {
        HashMap map;
        C40696m3 c40696m3;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        C40691l3 c40691l3 = (C40691l3) this.f14304a.get(id2);
        if (c40691l3 == null || (map = c40691l3.f90321b) == null || (c40696m3 = (C40696m3) map.get(credentialPart)) == null) {
            return;
        }
        if (c40696m3.f90328a != 0) {
            c40696m3.f90329b = (System.currentTimeMillis() - c40696m3.f90328a) + c40696m3.f90329b;
        }
        c40696m3.f90328a = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m14566b(String id2, JumioCredentialPart credentialPart) {
        HashMap map;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        this.f14306c = id2;
        this.f14307d = credentialPart;
        this.f14308e = null;
        C40691l3 c40691l3 = (C40691l3) this.f14304a.get(id2);
        if (c40691l3 == null || (map = c40691l3.f90321b) == null) {
            return;
        }
        Object c40696m3 = map.get(credentialPart);
        if (c40696m3 == null) {
            c40696m3 = new C40696m3();
            map.put(credentialPart, c40696m3);
        }
        ((C40696m3) c40696m3).f90328a = System.currentTimeMillis();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0297 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0299  */
    /* JADX WARN: Code duplicated, block: B:113:0x029c  */
    /* JADX WARN: Code duplicated, block: B:114:0x029e  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02de  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:133:0x030a  */
    /* JADX WARN: Code duplicated, block: B:134:0x030d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0319  */
    /* JADX WARN: Code duplicated, block: B:140:0x031c  */
    /* JADX WARN: Code duplicated, block: B:142:0x031f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0324  */
    /* JADX WARN: Code duplicated, block: B:145:0x0327  */
    /* JADX WARN: Code duplicated, block: B:147:0x032a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0365  */
    /* JADX WARN: Code duplicated, block: B:158:0x0368  */
    /* JADX WARN: Code duplicated, block: B:166:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v18 java.lang.Object, still in use, count: 2, list:
          (r4v18 java.lang.Object) from 0x0275: PHI (r4 I:??) = (r4v3 java.lang.Object), (r4v18 java.lang.Object) binds: [B:101:0x0274, B:174:0x0275] A[DONT_GENERATE, DONT_INLINE]
          (r4v18 java.lang.Object) from 0x026b: CHECK_CAST (com.jumio.core.models.CredentialDataModel) (r4v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: a */
    public final com.jumio.analytics.MetaInfo m14564a(com.jumio.core.models.CredentialsModel r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.models.ReportingModel.m14564a(com.jumio.core.models.CredentialsModel, boolean):com.jumio.analytics.MetaInfo");
    }
}
