package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.base.plugin.listener.IDropFrameListener;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.C35186c;
import java.util.Iterator;
import org.json.JSONObject;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ca */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33584ca implements Function0<Integer> {

    /* JADX INFO: renamed from: b */
    public static final String f69411b = "RMonitor_looper_metric";

    @Override // p852kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer invoke() {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m72664a(DropFrameResultMeta dropFrameResultMeta) {
        try {
            Iterator it = ListenerManager.dropFrameListener.getListenerList().iterator();
            while (it.hasNext()) {
                ((IDropFrameListener) it.next()).onRecordData(dropFrameResultMeta);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72666b(String str, DropFrameResultMeta dropFrameResultMeta) {
        JSONObject jSONObject = new JSONObject();
        C34011x3.a.f72491a.m75426a(true, str, dropFrameResultMeta.scene, jSONObject);
        if (jSONObject.has("user_custom")) {
            try {
                dropFrameResultMeta.userCustom = jSONObject.getJSONObject("user_custom");
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m72667c(String str, DropFrameResultMeta dropFrameResultMeta) {
        DBHandler dbHandler;
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) {
            return false;
        }
        int iInsert = dbHandler.insert(new DropFrameTable(BaseInfo.makeBaseDBParam(), str, dropFrameResultMeta), this);
        if (iInsert == -1) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_metric", str + " save fail, meta: " + dropFrameResultMeta.toJSONObject());
        }
        return iInsert != -1;
    }

    /* JADX INFO: renamed from: a */
    public boolean m72665a(String str, DropFrameResultMeta dropFrameResultMeta) {
        int iM73554b = C33733jc.m73554b(dropFrameResultMeta);
        if (iM73554b != 0) {
            String string = dropFrameResultMeta == null ? "null" : dropFrameResultMeta.toJSONObject().toString();
            Logger.INSTANCE.mo77132i("RMonitor_looper_metric", "checkData, pluginName: " + str + ", ret: " + iM73554b + ", invalid data: " + string);
            if (iM73554b != 1) {
                C35186c.m77234a(InterfaceC33617e1.f69652a, str, String.valueOf(iM73554b), C33820nf.m74300a(BaseInfo.userMeta), string);
            }
        }
        return iM73554b == 0;
    }
}
