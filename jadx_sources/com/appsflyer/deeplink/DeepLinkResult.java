package com.appsflyer.deeplink;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class DeepLinkResult {

    @Nullable
    private final DeepLink deepLink;

    @Nullable
    private final Error error;

    @NonNull
    private final Status status;

    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR
    }

    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.error);
            jSONObject.put("status", this.status);
        } catch (JSONException e11) {
            AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", e11);
        }
        return jSONObject.toString();
    }

    public DeepLinkResult(@Nullable DeepLink deepLink, @Nullable Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }
}
