package com.jumio.core.models;

import android.content.Context;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.PersistWith;
import com.jumio.commons.log.Log;
import com.jumio.core.model.StaticModel;
import com.tencent.bugly.proguard.C33556b3;
import java.util.ArrayList;
import java.util.List;
import jumio.core.AbstractC40547J0;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/core/models/AdditionalDataPointsModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "localeString", "", "screenResolutionX", "", "screenResolutionY", "timezone", "isRooted", "", "countryForIp", "stateForIp", "localeCountry", "issuingCountry", "grantedPermissions", "", "setAnalyticsDataModel", "", "scrX", "scrY", "setIssuingCountry", "scanPart", "Lcom/jumio/core/models/PhysicalIdScanPartModel;", "getAdditionalDataPointsMap", "Lcom/jumio/analytics/MetaInfo;", "context", "Landroid/content/Context;", "currentTime", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("AdditionalDataPointsModel")
@SourceDebugExtension({"SMAP\nAdditionalDataPointsModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalDataPointsModel.kt\ncom/jumio/core/models/AdditionalDataPointsModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n774#2:90\n865#2,2:91\n*S KotlinDebug\n*F\n+ 1 AdditionalDataPointsModel.kt\ncom/jumio/core/models/AdditionalDataPointsModel\n*L\n76#1:90\n76#1:91,2\n*E\n"})
public final class AdditionalDataPointsModel implements StaticModel {

    /* JADX INFO: renamed from: b */
    public int f14164b;

    /* JADX INFO: renamed from: c */
    public int f14165c;

    /* JADX INFO: renamed from: d */
    public int f14166d;

    /* JADX INFO: renamed from: e */
    public boolean f14167e;

    /* JADX INFO: renamed from: a */
    public String f14163a = "";

    /* JADX INFO: renamed from: f */
    public String f14168f = "";

    /* JADX INFO: renamed from: g */
    public String f14169g = "";

    /* JADX INFO: renamed from: h */
    public String f14170h = "";

    /* JADX INFO: renamed from: i */
    public String f14171i = "";

    /* JADX INFO: renamed from: j */
    public List f14172j = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: a */
    public final void m14549a(String localeString, int i11, int i12, int i13, boolean z11, String localeCountry, String countryForIp, String stateForIp, List grantedPermissions) {
        Intrinsics.checkNotNullParameter(localeString, "localeString");
        Intrinsics.checkNotNullParameter(localeCountry, "localeCountry");
        Intrinsics.checkNotNullParameter(countryForIp, "countryForIp");
        Intrinsics.checkNotNullParameter(stateForIp, "stateForIp");
        Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
        this.f14163a = localeString;
        this.f14164b = i11;
        this.f14165c = i12;
        this.f14166d = i13;
        this.f14167e = z11;
        this.f14170h = localeCountry;
        this.f14168f = countryForIp;
        this.f14169g = stateForIp;
        this.f14172j = grantedPermissions;
    }

    /* JADX INFO: renamed from: a */
    public static MetaInfo m14548a(AdditionalDataPointsModel additionalDataPointsModel, Context context) {
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        additionalDataPointsModel.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            j11 = (jCurrentTimeMillis - context.getSharedPreferences("Jumio01", 0).getLong("Jumio06", -1L)) / ((long) 1000);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            j11 = 0;
        }
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("locale", additionalDataPointsModel.f14163a);
        metaInfo.put("srX", Integer.valueOf(additionalDataPointsModel.f14164b));
        metaInfo.put("srY", Integer.valueOf(additionalDataPointsModel.f14165c));
        metaInfo.put("timezone", Integer.valueOf(additionalDataPointsModel.f14166d));
        metaInfo.put("isRooted", Boolean.valueOf(additionalDataPointsModel.f14167e));
        metaInfo.put("countryForIP", additionalDataPointsModel.f14168f);
        metaInfo.put("stateForIp", additionalDataPointsModel.f14169g);
        metaInfo.put("localeCountry", additionalDataPointsModel.f14170h);
        metaInfo.put("issuingCountry", additionalDataPointsModel.f14171i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio04", "key");
        metaInfo.put("numOfVerifications", Integer.valueOf(context.getSharedPreferences("Jumio01", 0).getInt("Jumio04", 0)));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        metaInfo.put("numOfRetakes", Integer.valueOf(context.getSharedPreferences("Jumio01", 0).getInt("Jumio03", 0)));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio05", "key");
        metaInfo.put("numOfCancels", Integer.valueOf(context.getSharedPreferences("Jumio01", 0).getInt("Jumio05", 0)));
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{additionalDataPointsModel.f14170h, additionalDataPointsModel.f14171i, additionalDataPointsModel.f14168f});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        metaInfo.put("numOfCountries", Integer.valueOf(CollectionsKt.distinct(arrayList).size()));
        metaInfo.put("secInSdk", Long.valueOf(j11));
        metaInfo.put("grantedPermissions", additionalDataPointsModel.f14172j);
        metaInfo.put("installationSourceAppId", AbstractC40547J0.m89197c(context));
        metaInfo.put("calendar", AbstractC40547J0.m89192a());
        metaInfo.put(C33556b3.f69066l2, context.getPackageName());
        metaInfo.put("appName", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
        metaInfo.put("minSdkVersion", 23);
        return metaInfo;
    }
}
