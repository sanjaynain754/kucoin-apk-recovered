package cn.jiguang.privates.analysis.api;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.common.log.JCommonLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public class ExposureEvent extends Event {
    private static final int CUSTOM_SIZE = 2;
    private static final String TAG = "ExposureEvent";
    public Activity activity;
    public String tag;
    public View view;

    public ExposureEvent(Activity activity, String str, View view) {
        super(JAnalysisConstants.TYPE_EXPOSURE);
        if (activity != null) {
            this.activity = (Activity) new WeakReference(activity).get();
        }
        if (view != null) {
            this.view = view;
        }
        this.tag = str;
    }

    @Override // cn.jiguang.privates.analysis.api.Event
    public ExposureEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.getClass();
        if (str.equals("tag") || str.equals("count")) {
            JCommonLog.m5430d(TAG, "key [" + str + "] is invalid");
            return this;
        }
        if (this.extraAttrMap.size() < 48) {
            return (ExposureEvent) super.putExtraAttr(str, obj);
        }
        JCommonLog.m5430d(TAG, "can't put [" + str + "], exposure event extraAttrMap size can't be no more than 48");
        return this;
    }
}
