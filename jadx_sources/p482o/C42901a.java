package p482o;

import ai.advance.network.NetworkFailedException;
import com.sensorsdata.abtest.entity.AppConstants;
import java.net.HttpURLConnection;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes23.dex */
public class C42901a implements InterfaceC42903c {
    @Override // p482o.InterfaceC42903c
    /* JADX INFO: renamed from: a */
    public String mo94080a(HttpURLConnection httpURLConnection, String str) throws NetworkFailedException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("code")) {
                String strOptString = jSONObject.optString("code");
                if (!AppConstants.AB_TEST_SUCCESS.equals(strOptString)) {
                    throw new NetworkFailedException(strOptString, jSONObject.optString("message"), str);
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }
}
