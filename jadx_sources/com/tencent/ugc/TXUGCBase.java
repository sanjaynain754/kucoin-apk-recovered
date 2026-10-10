package com.tencent.ugc;

import android.content.Context;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.datereport.UGCDataReportDef;

/* JADX INFO: loaded from: classes2.dex */
public class TXUGCBase {
    private static TXUGCBase sInstance;
    private static TXUGCBaseListener sListener;

    public static abstract class TXUGCBaseListener {
        public abstract void onLicenceLoaded(int i11, String str);
    }

    public static TXUGCBase getInstance() {
        if (sInstance == null) {
            synchronized (TXUGCBase.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TXUGCBase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    public static /* synthetic */ void lambda$setLicence$0(int i11, String str) {
        TXUGCBaseListener tXUGCBaseListener = sListener;
        if (tXUGCBaseListener != null) {
            tXUGCBaseListener.onLicenceLoaded(i11, str);
        }
    }

    public static void setListener(TXUGCBaseListener tXUGCBaseListener) {
        sListener = tXUGCBaseListener;
    }

    static {
        SoLoader.loadAllLibraries();
    }

    private TXUGCBase() {
    }

    public String callExperimentalAPI(Context context, String str) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        return UGCBaseJni.callExperimentalAPI(str);
    }

    public String getLicenceInfo(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        return HouseBuilder.getInstance().getHouse(HouseBuilder.EnumC34767c.UGC);
    }

    public void setLicence(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        HouseBuilder.getInstance().setListener(C35515b.m79016a());
        HouseBuilder.getInstance().setHouse(HouseBuilder.EnumC34767c.UGC, str, str2);
        UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_UGCKIT);
    }
}
