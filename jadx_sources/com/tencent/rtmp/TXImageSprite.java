package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.p146a.C35198a;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public class TXImageSprite {
    private static final String TAG = "TXImageSprite";
    private Context mContext;
    private C35198a mImageSprite;

    public Bitmap getThumbnail(float f11) {
        C35198a c35198a = this.mImageSprite;
        if (c35198a != null) {
            return c35198a.getThumbnail(f11);
        }
        return null;
    }

    public void release() {
        C35198a c35198a = this.mImageSprite;
        if (c35198a != null) {
            c35198a.release();
            this.mImageSprite = null;
        }
    }

    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        LiteavLog.m76087i(TAG, "setVTTUrlAndImageUrls, vttUrl: " + str + " images: " + list);
        if (this.mImageSprite != null) {
            release();
        }
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1).reportDau(1555, 0, "");
        C35198a c35198a = new C35198a(this.mContext);
        this.mImageSprite = c35198a;
        c35198a.setVTTUrlAndImageUrls(str, list);
    }

    public TXImageSprite(Context context) {
        this.mContext = context.getApplicationContext();
    }
}
