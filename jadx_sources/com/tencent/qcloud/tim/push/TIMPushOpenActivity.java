package com.tencent.qcloud.tim.push;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushOpenActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static final String f74827a = "TIMPushOpenActivity";

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TIMPushLog.m77016d(f74827a, "onCreate" + getIntent());
        TIMPushManagerImpl.m76884c().m76899a(getIntent(), getApplicationContext());
        finish();
    }
}
