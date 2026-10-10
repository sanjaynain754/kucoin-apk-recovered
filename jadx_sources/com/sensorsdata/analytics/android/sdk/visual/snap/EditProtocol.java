package com.sensorsdata.analytics.android.sdk.visual.snap;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.visual.ViewSnapshot;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class EditProtocol {
    private static final Class<?>[] NO_PARAMS = new Class[0];
    private static final String TAG = "SA.EProtocol";
    private final ResourceIds mResourceIds;

    public static class BadInstructionsException extends Exception {
        private static final long serialVersionUID = -4062004792184145311L;

        public BadInstructionsException(String str) {
            super(str);
        }

        public BadInstructionsException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public ViewSnapshot readSnapshotConfig(JSONObject jSONObject) throws BadInstructionsException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("config").getJSONArray("classes");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                Class<?> cls = Class.forName(jSONObject2.getString("name"));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("properties");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    arrayList.add(readPropertyDescription(cls, jSONArray2.getJSONObject(i12)));
                }
            }
            return new ViewSnapshot(arrayList, this.mResourceIds);
        } catch (ClassNotFoundException e11) {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", e11);
        } catch (JSONException e12) {
            throw new BadInstructionsException("Can't read snapshot configuration", e12);
        }
    }

    public EditProtocol(ResourceIds resourceIds) {
        this.mResourceIds = resourceIds;
    }

    private PropertyDescription readPropertyDescription(Class<?> cls, JSONObject jSONObject) throws BadInstructionsException {
        Caller caller;
        try {
            String string = jSONObject.getString("name");
            String string2 = null;
            if (jSONObject.has("get")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("get");
                caller = new Caller(cls, jSONObject2.getString("selector"), NO_PARAMS, Class.forName(jSONObject2.getJSONObject(DbParams.KEY_CHANNEL_RESULT).getString("type")));
            } else {
                caller = null;
            }
            if (jSONObject.has("set")) {
                string2 = jSONObject.getJSONObject("set").getString("selector");
            }
            return new PropertyDescription(string, cls, caller, string2);
        } catch (ClassNotFoundException e11) {
            throw new BadInstructionsException("Can't read property JSON, relevant arg/return class not found", e11);
        } catch (NoSuchMethodException e12) {
            throw new BadInstructionsException("Can't create property reader", e12);
        } catch (JSONException e13) {
            throw new BadInstructionsException("Can't read property JSON", e13);
        }
    }
}
