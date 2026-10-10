package com.tencent.cloud.tuikit.engine.impl.call;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.tencent.cloud.tuikit.engine.call.TUICallEngine;
import com.tencent.cloud.tuikit.engine.common.ContextProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Objects;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class PlatformBroadcastReceiver {
    final String TAG = "PlatformBroadcastReceiver";
    final int PUSH_RECEIVED_ID = 171012;
    private final String APP_WAKEUP_BY_PUSH_EVENT = TUIConstants.TIMPush.BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP;

    private String parseCallIdFromIntent(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("ext");
            if (stringExtra == null || stringExtra.isEmpty()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(stringExtra);
            if (jSONObject.has("call_id")) {
                return jSONObject.getString("call_id");
            }
            return null;
        } catch (JSONException e11) {
            Logger.getLogger("PlatformBroadcastReceiver").info("Failed to parse call_id from intent: " + e11.getMessage());
            return null;
        }
    }

    private void reportEvent(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventId", 171012);
        jSONObject.put(TUIConstants.TUICalling.CALL_ID, str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("api", "reportEventToChatKibana");
        jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
        TUICallEngine.createInstance(ContextProvider.getApplicationContext()).callExperimentalAPI(jSONObject2.toString());
    }

    public PlatformBroadcastReceiver() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.cloud.tuikit.engine.impl.call.PlatformBroadcastReceiver.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                PlatformBroadcastReceiver.this.onReceiveHandler(intent);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(TUIConstants.TIMPush.BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP);
        LocalBroadcastManager.getInstance(ContextProvider.getApplicationContext()).registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReceiveHandler(Intent intent) {
        if (Objects.equals(intent.getAction(), TUIConstants.TIMPush.BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP)) {
            try {
                String callIdFromIntent = parseCallIdFromIntent(intent);
                if (callIdFromIntent != null && !callIdFromIntent.isEmpty()) {
                    reportEvent(callIdFromIntent);
                }
            } catch (Exception e11) {
                Logger.getLogger("PlatformBroadcastReceiver").info("Error handling VoIP push: " + e11.getMessage());
            }
        }
    }
}
