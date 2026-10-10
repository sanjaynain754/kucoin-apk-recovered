package ai.advance.network;

import androidx.browser.trusted.sharing.ShareTarget;

/* JADX INFO: loaded from: classes23.dex */
public enum BodyContentType {
    JSON("application/json"),
    FORM("application/x-www-form-urlencoded"),
    MULTIPART(ShareTarget.ENCODING_TYPE_MULTIPART);

    private final String value;

    public String getValue() {
        return this.value;
    }

    BodyContentType(String str) {
        this.value = str;
    }
}
