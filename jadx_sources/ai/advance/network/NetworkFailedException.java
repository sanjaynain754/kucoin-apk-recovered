package ai.advance.network;

/* JADX INFO: loaded from: classes23.dex */
public class NetworkFailedException extends Exception {
    private final String code;
    private final String response;

    public String getCode() {
        return this.code;
    }

    public String getResponse() {
        return this.response;
    }

    public NetworkFailedException(String str, String str2, String str3) {
        super(str2);
        this.code = str;
        this.response = str3;
    }
}
