package com.facebook.react.packagerconnection;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import okio.ByteString;
import org.json.JSONObject;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public final class JSPackagerClient implements ReconnectingWebSocket.MessageCallback {
    private static final int PROTOCOL_VERSION = 2;
    private static final String TAG = "JSPackagerClient";
    private Map<String, RequestHandler> mRequestHandlers;
    private ReconnectingWebSocket mWebSocket;

    public class ResponderImpl implements Responder {
        private Object mId;

        public ResponderImpl(Object obj) {
            this.mId = obj;
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void error(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.mId);
                jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e11) {
                C45999a.m101508n(JSPackagerClient.TAG, "Responding with error failed", e11);
            }
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void respond(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.mId);
                jSONObject.put(DbParams.KEY_CHANNEL_RESULT, obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e11) {
                C45999a.m101508n(JSPackagerClient.TAG, "Responding failed", e11);
            }
        }
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map) {
        this(str, packagerConnectionSettings, map, null);
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt(ReportDataTable.COLUMN_PARAMS);
            if (iOptInt != 2) {
                C45999a.m101507m(TAG, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                abortOnMessage(objOpt, "No method provided");
                return;
            }
            RequestHandler requestHandler = this.mRequestHandlers.get(strOptString);
            if (requestHandler == null) {
                abortOnMessage(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                requestHandler.onNotification(objOpt2);
            } else {
                requestHandler.onRequest(objOpt2, new ResponderImpl(objOpt));
            }
        } catch (Exception e11) {
            C45999a.m101508n(TAG, "Handling the message failed", e11);
        }
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map, @Nullable ReconnectingWebSocket.ConnectionCallback connectionCallback) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(packagerConnectionSettings.getDebugServerHost()).appendPath("message").appendQueryParameter("device", AndroidInfoHelpers.getFriendlyDeviceName()).appendQueryParameter("app", packagerConnectionSettings.getPackageName()).appendQueryParameter("clientid", str);
        this.mWebSocket = new ReconnectingWebSocket(builder.build().toString(), this, connectionCallback);
        this.mRequestHandlers = map;
    }

    private void abortOnMessage(Object obj, String str) {
        if (obj != null) {
            new ResponderImpl(obj).error(str);
        }
        C45999a.m101507m(TAG, "Handling the message failed with reason: " + str);
    }

    public void close() {
        this.mWebSocket.closeQuietly();
    }

    public void init() {
        this.mWebSocket.connect();
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(ByteString byteString) {
        C45999a.m101488I(TAG, "Websocket received message with payload of unexpected type binary");
    }
}
