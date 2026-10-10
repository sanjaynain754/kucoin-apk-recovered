package com.datavisorobfus;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.os.Build;
import android.util.Base64;
import android.view.InputDevice;
import com.datavisor.vangogh.bridge.crypto;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.x0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5453x0 {

    /* JADX INFO: renamed from: b */
    private static C5453x0 f7395b;

    /* JADX INFO: renamed from: a */
    private Context f7396a;

    /* JADX INFO: renamed from: a */
    public static C5453x0 m7436a(Context context) {
        if (f7395b == null) {
            synchronized (C5439q0.class) {
                try {
                    if (f7395b == null) {
                        f7395b = new C5453x0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7395b;
    }

    /* JADX INFO: renamed from: b */
    private String m7439b() {
        int[] inputDeviceIds;
        String name;
        try {
            InputManager inputManager = (InputManager) this.f7396a.getSystemService("input");
            if (inputManager == null || (inputDeviceIds = inputManager.getInputDeviceIds()) == null) {
                return null;
            }
            for (int i11 : inputDeviceIds) {
                InputDevice inputDevice = inputManager.getInputDevice(i11);
                if (inputDevice != null && (name = inputDevice.getName()) != null) {
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.contains("cros_ec") || lowerCase.contains("cros-ec") || lowerCase.contains("chromeos") || lowerCase.contains("chrome os")) {
                        return name;
                    }
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m7442c(JSONArray jSONArray, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = jSONArray.getString(i11);
                if (!C5457z0.m7480a(string)) {
                    String strM7398e = C5444t.m7398e(string);
                    if (C5457z0.m7480a(strM7398e)) {
                        strM7398e = "empty";
                    }
                    jSONObject2.put(string, strM7398e);
                }
            }
            jSONObject.put(crypto.convert("PZeSzGs="), jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7444d(JSONArray jSONArray, JSONObject jSONObject) {
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = jSONArray.getString(i11);
                if (C5448v.m7419a(string)) {
                    jSONArray2.put(string);
                }
            }
            jSONObject.put(crypto.convert("PZeSzH3ErtMb"), jSONArray2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m7446e(JSONArray jSONArray, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = jSONArray.getString(i11);
                if (!C5457z0.m7480a(string)) {
                    String strM7396c = C5444t.m7396c(string);
                    if (!C5457z0.m7480a(strM7396c)) {
                        jSONObject2.put(string, strM7396c);
                    }
                }
            }
            jSONObject.put(crypto.convert("K4yR2Ws="), jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7440b(JSONArray jSONArray, JSONObject jSONObject) {
        try {
            String strM7398e = C5444t.m7398e("/proc/cpuinfo");
            if (C5457z0.m7480a(strM7398e)) {
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = jSONArray.getString(i11);
                if (strM7398e.toLowerCase().contains(string.toLowerCase())) {
                    jSONArray2.put(string);
                }
            }
            jSONObject.put(crypto.convert("OI6L"), jSONArray2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7443c(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("OZGf23w="), Build.BOARD);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7445d(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("OZGR3XTTpsQKQg=="), Build.BOOTLOADER);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m7447e(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("PY4="), Build.FINGERPRINT);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private void m7448f(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("K4yRzW3fsw=="), Build.PRODUCT);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    private void m7450h(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("N5eZwWzPos4cX4Y="), ((SensorManager) this.f7396a.getSystemService("sensor")).getDefaultSensor(5) != null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    private void m7451i(JSONObject jSONObject) {
        try {
            PackageManager packageManager = this.f7396a.getPackageManager();
            if (packageManager.hasSystemFeature("org.chromium.arc")) {
                jSONObject.put("chrome_book_arc_feature", "org.chromium.arc");
            }
            if (packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
                jSONObject.put("chrome_book_arc_device_management", "org.chromium.arc.device_management");
            }
            if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                jSONObject.put("chrome_book_pc_type_feature", "android.hardware.type.pc");
            }
            String str = Build.DEVICE;
            if (str != null && str.toLowerCase().contains("cheets")) {
                jSONObject.put("chrome_book_device_cheets", str);
            }
            String str2 = Build.PRODUCT;
            if (str2 != null && str2.toLowerCase().contains("cheets")) {
                jSONObject.put("chrome_book_product_cheets", str2);
            }
            String str3 = Build.HARDWARE;
            if (str3 != null && str3.toLowerCase().contains("cheets")) {
                jSONObject.put("chrome_book_hardware_cheets", str3);
            }
            if (str != null && str.toLowerCase().contains("arcvm")) {
                jSONObject.put("chrome_book_device_arcvm", str);
            }
            String strM7396c = C5444t.m7396c("ro.arc.version");
            if (C5457z0.m7482b(strM7396c)) {
                jSONObject.put("chrome_book_arc_version", strM7396c);
            }
            String strM7439b = m7439b();
            if (C5457z0.m7482b(strM7439b)) {
                jSONObject.put("chrome_book_input_device", strM7439b);
            }
            String str4 = Build.BOARD;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                if (lowerCase.contains("cheets") || lowerCase.contains("arcvm") || lowerCase.contains("bertha")) {
                    jSONObject.put("chrome_book_board_chromeos", str4);
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m7452j(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("PZKf2nA="), this.f7396a.getPackageManager().hasSystemFeature("android.hardware.camera.flash"));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public String m7453a() {
        JSONObject jSONObjectM7145a = C5417g.m7143a(this.f7396a).m7145a(crypto.convert("KJeT3HTds88d"));
        if (jSONObjectM7145a == null) {
            return "empty";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = jSONObjectM7145a.getJSONArray(crypto.convert("K4yR2Ws="));
            if (jSONArray != null && jSONArray.length() > 0) {
                m7446e(jSONArray, jSONObject);
            }
        } catch (Throwable unused) {
        }
        try {
            JSONArray jSONArray2 = jSONObjectM7145a.getJSONArray(crypto.convert("PZeSzH3ErtMb"));
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                m7444d(jSONArray2, jSONObject);
            }
        } catch (Throwable unused2) {
        }
        try {
            JSONArray jSONArray3 = jSONObjectM7145a.getJSONArray(crypto.convert("OI6L"));
            if (jSONArray3 != null && jSONArray3.length() > 0) {
                m7440b(jSONArray3, jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            JSONArray jSONArray4 = jSONObjectM7145a.getJSONArray(crypto.convert("OJOa"));
            if (jSONArray4 != null && jSONArray4.length() > 0) {
                m7437a(jSONArray4, jSONObject);
            }
        } catch (Throwable unused4) {
        }
        try {
            JSONArray jSONArray5 = jSONObjectM7145a.getJSONArray(crypto.convert("PZeSzGs="));
            if (jSONArray5 != null && jSONArray5.length() > 0) {
                m7442c(jSONArray5, jSONObject);
            }
        } catch (Throwable unused5) {
        }
        m7441b(jSONObject);
        m7450h(jSONObject);
        m7452j(jSONObject);
        m7438a(jSONObject);
        m7447e(jSONObject);
        m7448f(jSONObject);
        m7443c(jSONObject);
        m7445d(jSONObject);
        m7449g(jSONObject);
        m7451i(jSONObject);
        return jSONObject.toString();
    }

    private C5453x0(Context context) {
        this.f7396a = null;
        if (context != null) {
            this.f7396a = context;
            return;
        }
        throw new IllegalArgumentException("SimulatorDetect initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    private void m7437a(JSONArray jSONArray, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = jSONArray.getString(i11);
                if (!C5457z0.m7480a(string)) {
                    String strM7393a = C5444t.m7393a(string);
                    if (C5457z0.m7480a(strM7393a)) {
                        strM7393a = "empty";
                    }
                    jSONObject2.put(string, strM7393a);
                }
            }
            jSONObject.put(crypto.convert("OJOa"), jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7441b(JSONObject jSONObject) {
        String name;
        try {
            if (C5440r.m7280b(this.f7396a, "android.permission.BLUETOOTH")) {
                C5415f0.m7137a(C5440r.f7357f, "no permission BLUETOOTH");
                name = "no_permission";
            } else if (this.f7396a == null) {
                C5415f0.m7137a(C5440r.f7357f, "context is null");
                name = "para_err";
            } else {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    name = defaultAdapter.getName();
                    if (C5457z0.m7480a(name)) {
                    }
                }
                name = "empty";
            }
            if (!name.equals("no_permission") && !name.equals("para_err") && !name.equals("empty")) {
                name = Base64.encodeToString(name.getBytes(), 2);
            }
            jSONObject.put(crypto.convert("OYqQyHXZ"), name);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m7449g(JSONObject jSONObject) {
        try {
            String strM7180d = C5423i0.m7173c().m7180d(this.f7396a);
            if (C5457z0.m7480a(strM7180d)) {
                strM7180d = "empty";
            }
            jSONObject.put(crypto.convert("MpCKzGrapsMKXpVzFQ=="), strM7180d);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7438a(JSONObject jSONObject) {
        try {
            jSONObject.put(crypto.convert("KJuQ2nfOpM4b"), ((SensorManager) this.f7396a.getSystemService("sensor")).getSensorList(-1).size());
        } catch (Throwable unused) {
        }
    }
}
