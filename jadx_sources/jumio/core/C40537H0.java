package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.credentials.RequiredPart;
import com.jumio.core.data.UploadType;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.CredentialsModel;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.document.JumioDocumentType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jumio.core.C40537H0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.H0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40537H0 {
    /* JADX INFO: renamed from: a */
    public static final CredentialDataModel m89159a(boolean z11, C40537H0 c40537h0, JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String strOptString = jsonObject.optString("id");
        String string = jsonObject.getString("category");
        int i11 = (!z11 || Intrinsics.areEqual(string, "FACEMAP")) ? 0 : 1;
        JSONArray jSONArray = jsonObject.getJSONArray("capabilities");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        List map = JsonUtilKt.map(jSONArray, new Function1() { // from class: lg0.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89161a((JSONObject) obj);
            }
        });
        JSONArray jSONArray2 = jsonObject.getJSONArray("requiredParts");
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
        List map2 = JsonUtilKt.map(jSONArray2, new Function1() { // from class: lg0.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89158a((String) obj);
            }
        });
        if (string == null) {
            return null;
        }
        int iHashCode = string.hashCode();
        if (iHashCode == -374349377) {
            if (!string.equals("FACEMAP")) {
                return null;
            }
            Intrinsics.checkNotNull(strOptString);
            c40537h0.getClass();
            return new C40527F0(strOptString, map, m89170f(jsonObject), map2, i11);
        }
        if (iHashCode == 2331) {
            if (!string.equals("ID")) {
                return null;
            }
            Intrinsics.checkNotNull(strOptString);
            c40537h0.getClass();
            return new C40532G0(strOptString, map, m89165c(jsonObject), m89169e(jsonObject), map2, i11);
        }
        if (iHashCode != 1644347675 || !string.equals(UploadType.DOCUMENT)) {
            return null;
        }
        Intrinsics.checkNotNull(strOptString);
        c40537h0.getClass();
        return new C40522E0(strOptString, map, m89163b(jsonObject), m89167d(jsonObject), map2, i11);
    }

    /* JADX INFO: renamed from: b */
    public static final String m89162b(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: c */
    public static final String m89164c(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m89167d(JSONObject jSONObject) {
        return m89160a(jSONObject, "type", new Function1() { // from class: lg0.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89166d((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m89169e(JSONObject jSONObject) {
        return m89160a(jSONObject, "type", new Function1() { // from class: lg0.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89168e((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m89170f(JSONObject jSONObject) {
        return m89160a(jSONObject, "type", new Function1() { // from class: lg0.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89171f((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m89163b(JSONObject jSONObject) {
        return m89160a(jSONObject, "country", new Function1() { // from class: lg0.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89162b((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m89165c(JSONObject jSONObject) {
        return m89160a(jSONObject, "country", new Function1() { // from class: lg0.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89164c((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final String m89166d(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String upperCase = it.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX INFO: renamed from: e */
    public static final JumioDocumentType m89168e(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() == 0) {
            return null;
        }
        try {
            String upperCase = it.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return JumioDocumentType.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            Log.m14467e(it.concat(" is not a valid DocumentType"));
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final EnumC40680j2 m89171f(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() == 0) {
            return null;
        }
        try {
            String upperCase = it.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return EnumC40680j2.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            Log.m14467e(it.concat(" is not a valid LivenessType"));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C40512C0 m89161a(JSONObject item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return C40512C0.f89929c.fromJson(item);
    }

    /* JADX INFO: renamed from: a */
    public static final RequiredPart m89158a(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return RequiredPart.INSTANCE.fromString(item);
    }

    /* JADX INFO: renamed from: a */
    public final CredentialsModel m89172a(JSONArray jsonArray) {
        String strOptString;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        int length = jsonArray.length();
        int i11 = 0;
        while (true) {
            strOptString = "";
            if (i11 >= length) {
                break;
            }
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null && Intrinsics.areEqual(jSONObjectOptJSONObject.optString("category"), "ID")) {
                strOptString = jSONObjectOptJSONObject.optString("acquisitionMode", "");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                break;
            }
            i11++;
        }
        final boolean zAreEqual = Intrinsics.areEqual(strOptString, "REUSABLE_IDENTITY");
        return new CredentialsModel(JsonUtilKt.mapNotNull(jsonArray, new Function1() { // from class: lg0.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40537H0.m89159a(zAreEqual, this, (JSONObject) obj);
            }
        }), strOptString);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m89160a(JSONObject jSONObject, String str, Function1 function1) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        ArrayList arrayList = null;
        if (jSONObjectOptJSONObject != null && Intrinsics.areEqual(jSONObjectOptJSONObject.optString("predefinedType"), "DEFINED")) {
            arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String strOptString = jSONArrayOptJSONArray.optString(i11);
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                Object objInvoke = function1.invoke(StringsKt.trim((CharSequence) strOptString).toString());
                if (objInvoke != null) {
                    arrayList.add(objInvoke);
                }
            }
        }
        return arrayList;
    }
}
