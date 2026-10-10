package com.tencent.rmonitor.manager;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.C34008x0;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.bugly.proguard.InterfaceC33998wa;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.LinkDataTable;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/rmonitor/manager/LinkDataDBCacheMngImpl;", "Lcom/tencent/bugly/proguard/wa;", "Lcom/tencent/rmonitor/base/db/DBHelper;", "getDBHelper", "Lcom/tencent/bugly/proguard/x0;", "makeBaseDBParam", "", "launchID", "processLaunchID", "Ljava/util/ArrayList;", "Lcom/tencent/bugly/proguard/va;", "Lkotlin/collections/ArrayList;", "loadFromDB", "linkData", "", "saveToDB", "productID", "Ljava/lang/String;", "", "maxReadDataCount", "I", "dbHelper", "Lcom/tencent/rmonitor/base/db/DBHelper;", "<init>", "(Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class LinkDataDBCacheMngImpl implements InterfaceC33998wa {

    @Nullable
    private DBHelper dbHelper;
    private final int maxReadDataCount;

    @NotNull
    private final String productID;

    @Override // com.tencent.bugly.proguard.InterfaceC33998wa
    public boolean saveToDB(@Nullable C33978va linkData) {
        if (linkData == null) {
            return false;
        }
        DBHelper dBHelper = getDBHelper();
        if (dBHelper == null) {
            Logger logger = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("save record {");
            sb2.append(linkData.f72343b);
            sb2.append(", ");
            logger.mo77131e("RMonitor_link", C34025xh.m75464a(sb2, linkData.f72346e, "} to db fail for db helper is null."));
            return false;
        }
        int iInsert = dBHelper.getDbHandler().insert(new LinkDataTable(makeBaseDBParam(), linkData), new Function0<Integer>() { // from class: com.tencent.rmonitor.manager.LinkDataDBCacheMngImpl$saveToDB$ret$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return 0;
            }
        });
        if (iInsert == -2 || iInsert == -1) {
            Logger.INSTANCE.mo77131e("RMonitor_link", "save record {" + linkData.f72343b + ", " + linkData.f72346e + "} to db fail for ret = " + iInsert);
        }
        return (iInsert == -1 || iInsert == -2) ? false : true;
    }

    public LinkDataDBCacheMngImpl(@NotNull String productID) {
        Intrinsics.checkNotNullParameter(productID, "productID");
        this.productID = productID;
        this.maxReadDataCount = 1000;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33998wa
    @Nullable
    public ArrayList<C33978va> loadFromDB(@Nullable String launchID, @Nullable String processLaunchID) {
        if (TextUtils.isEmpty(launchID) || TextUtils.isEmpty(processLaunchID)) {
            Logger.INSTANCE.mo77131e("RMonitor_link", "load from db fail for invalid params.");
            return null;
        }
        DBHelper dBHelper = getDBHelper();
        if (dBHelper == null) {
            Logger.INSTANCE.mo77131e("RMonitor_link", "load from db fail for db helper is null.");
            return null;
        }
        C34008x0 c34008x0MakeBaseDBParam = makeBaseDBParam();
        c34008x0MakeBaseDBParam.f72486e = launchID;
        c34008x0MakeBaseDBParam.f72487f = processLaunchID;
        Object objSearch = dBHelper.getDbHandler().search(new LinkDataTable(c34008x0MakeBaseDBParam), new Function0<Object>() { // from class: com.tencent.rmonitor.manager.LinkDataDBCacheMngImpl.loadFromDB.1
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return Integer.valueOf(LinkDataDBCacheMngImpl.this.maxReadDataCount);
            }
        });
        if (objSearch != null) {
            return (ArrayList) objSearch;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<com.tencent.bugly.common.reporter.link.LinkData>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.bugly.common.reporter.link.LinkData> }");
    }

    private final DBHelper getDBHelper() {
        DBHandler dbHandler;
        Context contextM72772c = C33598d3.m72772c();
        if (this.dbHelper == null && contextM72772c != null) {
            DBHelper.Companion companion = DBHelper.INSTANCE;
            Context contextM72772c2 = C33598d3.m72772c();
            Intrinsics.checkNotNullExpressionValue(contextM72772c2, "getGlobalContext()");
            DBHelper companion2 = companion.getInstance(contextM72772c2);
            this.dbHelper = companion2;
            if (companion2 != null && (dbHandler = companion2.getDbHandler()) != null) {
                dbHandler.open();
            }
        }
        return this.dbHelper;
    }

    private final C34008x0 makeBaseDBParam() {
        Context contextM72772c = C33598d3.m72772c();
        C34008x0 c34008x0 = new C34008x0();
        c34008x0.f72483b = AppInfo.INSTANCE.obtainProcessName(contextM72772c);
        c34008x0.f72482a = this.productID;
        c34008x0.f72486e = C33591ch.m72741a(contextM72772c);
        c34008x0.f72487f = C33591ch.f69465f;
        return c34008x0;
    }
}
