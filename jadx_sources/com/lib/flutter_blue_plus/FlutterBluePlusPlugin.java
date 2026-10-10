package com.lib.flutter_blue_plus;

import android.annotation.TargetApi;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.lib.flutter_blue_plus.FlutterBluePlusPlugin;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes23.dex */
public class FlutterBluePlusPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener, ActivityAware {

    /* JADX INFO: renamed from: A */
    public ScanCallback f55369A;

    /* JADX INFO: renamed from: c */
    public Context f55372c;

    /* JADX INFO: renamed from: d */
    public MethodChannel f55373d;

    /* JADX INFO: renamed from: e */
    public BluetoothManager f55374e;

    /* JADX INFO: renamed from: f */
    public BluetoothAdapter f55375f;

    /* JADX INFO: renamed from: h */
    public FlutterPlugin.FlutterPluginBinding f55377h;

    /* JADX INFO: renamed from: i */
    public ActivityPluginBinding f55378i;

    /* JADX INFO: renamed from: b */
    public LogLevel f55371b = LogLevel.DEBUG;

    /* JADX INFO: renamed from: g */
    public boolean f55376g = false;

    /* JADX INFO: renamed from: j */
    public final Semaphore f55379j = new Semaphore(1);

    /* JADX INFO: renamed from: k */
    public final Map<String, BluetoothGatt> f55380k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public final Map<String, BluetoothGatt> f55381l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public final Map<String, BluetoothDevice> f55382m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n */
    public final Map<String, Integer> f55383n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: o */
    public final Map<String, BluetoothGatt> f55384o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p */
    public final Map<String, String> f55385p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    public final Map<String, String> f55386q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: r */
    public final Map<String, String> f55387r = new ConcurrentHashMap();

    /* JADX INFO: renamed from: s */
    public final Map<String, Integer> f55388s = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t */
    public HashMap<String, Object> f55389t = new HashMap<>();

    /* JADX INFO: renamed from: u */
    public final Map<Integer, InterfaceC27299g> f55390u = new HashMap();

    /* JADX INFO: renamed from: v */
    public int f55391v = 1452;

    /* JADX INFO: renamed from: w */
    public final int f55392w = 1879842617;

    /* JADX INFO: renamed from: x */
    public final C27300a f55393x = new C27300a();

    /* JADX INFO: renamed from: y */
    public final BroadcastReceiver f55394y = new C27293a();

    /* JADX INFO: renamed from: z */
    public final BroadcastReceiver f55395z = new C27294b();

    /* JADX INFO: renamed from: B */
    public final BluetoothGattCallback f55370B = new C27296d();

    public enum LogLevel {
        NONE,
        ERROR,
        WARNING,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$a */
    public class C27293a extends BroadcastReceiver {
        public C27293a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothLeScanner bluetoothLeScanner;
            String action = intent.getAction();
            if (action != null && "android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                LogLevel logLevel = LogLevel.DEBUG;
                flutterBluePlusPlugin.m67630r0(logLevel, "OnAdapterStateChanged: " + FlutterBluePlusPlugin.m67568J(intExtra));
                if (intExtra == 12 && FlutterBluePlusPlugin.this.f55375f != null && FlutterBluePlusPlugin.this.f55376g && (bluetoothLeScanner = FlutterBluePlusPlugin.this.f55375f.getBluetoothLeScanner()) != null) {
                    FlutterBluePlusPlugin.this.m67630r0(logLevel, "calling stopScan (Bluetooth Restarted)");
                    bluetoothLeScanner.stopScan(FlutterBluePlusPlugin.this.m67625k0());
                    FlutterBluePlusPlugin.this.f55376g = false;
                }
                HashMap map = new HashMap();
                map.put("adapter_state", Integer.valueOf(FlutterBluePlusPlugin.m67570M(intExtra)));
                FlutterBluePlusPlugin.this.m67627o0("OnAdapterStateChanged", map);
                if (intExtra == 13 || intExtra == 10) {
                    FlutterBluePlusPlugin.this.m67617Z("adapterTurnOff");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$b */
    public class C27294b extends BroadcastReceiver {
        public C27294b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String action = intent.getAction();
            if (action != null && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                } else {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                }
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                FlutterBluePlusPlugin.this.m67630r0(LogLevel.DEBUG, "OnBondStateChanged: " + FlutterBluePlusPlugin.m67574W(intExtra) + " prev: " + FlutterBluePlusPlugin.m67574W(intExtra2));
                String address = bluetoothDevice.getAddress();
                if (intExtra == 11) {
                    FlutterBluePlusPlugin.this.f55382m.put(address, bluetoothDevice);
                } else {
                    FlutterBluePlusPlugin.this.f55382m.remove(address);
                }
                HashMap map = new HashMap();
                map.put("remote_id", address);
                map.put("bond_state", Integer.valueOf(FlutterBluePlusPlugin.m67571R(intExtra)));
                map.put("prev_state", Integer.valueOf(FlutterBluePlusPlugin.m67571R(intExtra2)));
                FlutterBluePlusPlugin.this.m67627o0("OnBondStateChanged", map);
            }
        }
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$c */
    /* JADX INFO: loaded from: classes59.dex */
    public class C27295c extends ScanCallback {
        public C27295c() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            FlutterBluePlusPlugin.this.m67630r0(LogLevel.ERROR, "onScanFailed: " + FlutterBluePlusPlugin.m67602t0(i11));
            super.onScanFailed(i11);
            HashMap map = new HashMap();
            map.put("advertisements", new ArrayList());
            map.put("success", 0);
            map.put("error_code", Integer.valueOf(i11));
            map.put("error_string", FlutterBluePlusPlugin.m67602t0(i11));
            FlutterBluePlusPlugin.this.m67627o0("OnScanResponse", map);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, ScanResult scanResult) {
            FlutterBluePlusPlugin.this.m67630r0(LogLevel.VERBOSE, "onScanResult");
            super.onScanResult(i11, scanResult);
            BluetoothDevice device = scanResult.getDevice();
            String address = device.getAddress();
            ScanRecord scanRecord = scanResult.getScanRecord();
            String strM67575X = scanRecord != null ? FlutterBluePlusPlugin.m67575X(scanRecord.getBytes()) : "";
            if (!((Boolean) FlutterBluePlusPlugin.this.f55389t.get("continuous_updates")).booleanValue()) {
                boolean z11 = FlutterBluePlusPlugin.this.f55387r.containsKey(address) && ((String) FlutterBluePlusPlugin.this.f55387r.get(address)).equals(strM67575X);
                FlutterBluePlusPlugin.this.f55387r.put(address, strM67575X);
                if (z11) {
                    return;
                }
            }
            if (FlutterBluePlusPlugin.this.m67619b0((List) FlutterBluePlusPlugin.this.f55389t.get("with_keywords"), scanRecord != null ? scanRecord.getDeviceName() : "")) {
                if (!((Boolean) FlutterBluePlusPlugin.this.f55389t.get("continuous_updates")).booleanValue() || FlutterBluePlusPlugin.this.m67631s0(address) % ((Integer) FlutterBluePlusPlugin.this.f55389t.get("continuous_divisor")).intValue() == 0) {
                    HashMap map = new HashMap();
                    map.put("advertisements", Arrays.asList(FlutterBluePlusPlugin.this.m67616V(device, scanResult)));
                    FlutterBluePlusPlugin.this.m67627o0("OnScanResponse", map);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$d */
    public class C27296d extends BluetoothGattCallback {
        /* JADX INFO: renamed from: a */
        public final boolean m67636a(BluetoothGatt bluetoothGatt, int i11, String str) {
            if (i11 == 2) {
                if (FlutterBluePlusPlugin.this.f55381l.get(str) != null || FlutterBluePlusPlugin.this.f55384o.get(str) != null) {
                    return false;
                }
                FlutterBluePlusPlugin.this.m67630r0(LogLevel.DEBUG, "[unexpected connection] disconnecting now");
                FlutterBluePlusPlugin.this.f55380k.remove(str);
                FlutterBluePlusPlugin.this.f55382m.remove(str);
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
                return true;
            }
            if (i11 != 0 || FlutterBluePlusPlugin.this.f55381l.get(str) != null || FlutterBluePlusPlugin.this.f55380k.get(str) != null || FlutterBluePlusPlugin.this.f55384o.get(str) != null) {
                return false;
            }
            FlutterBluePlusPlugin.this.m67630r0(LogLevel.DEBUG, "[unexpected connection] disconnect complete");
            FlutterBluePlusPlugin.this.f55382m.remove(str);
            bluetoothGatt.close();
            return true;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @TargetApi(33)
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            LogLevel logLevel = LogLevel.DEBUG;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onCharacteristicChanged:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  chr: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getUuid()));
            m67637b(bluetoothGatt, bluetoothGattCharacteristic, bArr, 0);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @TargetApi(33)
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i11) {
            LogLevel logLevel = i11 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onCharacteristicRead:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  chr: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getUuid()));
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i11) + " (" + i11 + ")");
            m67637b(bluetoothGatt, bluetoothGattCharacteristic, bArr, i11);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @TargetApi(33)
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i11, byte[] bArr) {
            LogLevel logLevel = i11 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onDescriptorRead:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  chr: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getCharacteristic().getUuid()));
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  desc: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getUuid()));
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i11) + " (" + i11 + ")");
            BluetoothGattService bluetoothGattServiceM67589j0 = FlutterBluePlusPlugin.m67589j0(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
            HashMap map = new HashMap();
            map.put("remote_id", bluetoothGatt.getDevice().getAddress());
            map.put("service_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getCharacteristic().getService().getUuid()));
            map.put("characteristic_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getCharacteristic().getUuid()));
            map.put("descriptor_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getUuid()));
            map.put("value", FlutterBluePlusPlugin.m67575X(bArr));
            map.put("success", Integer.valueOf(i11 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i11));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i11));
            if (bluetoothGattServiceM67589j0 != null) {
                map.put("primary_service_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattServiceM67589j0.getUuid()));
            }
            FlutterBluePlusPlugin.this.m67627o0("OnDescriptorRead", map);
        }

        public C27296d() {
        }

        /* JADX INFO: renamed from: b */
        public void m67637b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i11) {
            if (FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getService().getUuid()) == "1800" && FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getUuid()) == "2A05") {
                FlutterBluePlusPlugin.this.m67627o0("OnServicesReset", FlutterBluePlusPlugin.this.m67613P(bluetoothGatt.getDevice()));
            }
            BluetoothGattService bluetoothGattServiceM67589j0 = FlutterBluePlusPlugin.m67589j0(bluetoothGatt, bluetoothGattCharacteristic);
            HashMap map = new HashMap();
            map.put("remote_id", bluetoothGatt.getDevice().getAddress());
            map.put("service_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getService().getUuid()));
            map.put("characteristic_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getUuid()));
            map.put("value", FlutterBluePlusPlugin.m67575X(bArr));
            map.put("success", Integer.valueOf(i11 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i11));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i11));
            if (bluetoothGattServiceM67589j0 != null) {
                map.put("primary_service_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattServiceM67589j0.getUuid()));
            }
            FlutterBluePlusPlugin.this.m67627o0("OnCharacteristicReceived", map);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            LogLevel logLevel = i11 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onCharacteristicWrite:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  chr: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getUuid()));
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i11) + " (" + i11 + ")");
            BluetoothGattService bluetoothGattServiceM67589j0 = FlutterBluePlusPlugin.m67589j0(bluetoothGatt, bluetoothGattCharacteristic);
            String address = bluetoothGatt.getDevice().getAddress();
            String strM67633v0 = FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getService().getUuid());
            String strM67633v1 = FlutterBluePlusPlugin.this.m67633v0(bluetoothGattCharacteristic.getUuid());
            String str = address + C33844oi.f71346o + strM67633v0 + C33844oi.f71346o + strM67633v1 + C33844oi.f71346o + (bluetoothGattServiceM67589j0 != null ? FlutterBluePlusPlugin.this.m67633v0(bluetoothGattServiceM67589j0.getUuid()) : "");
            String str2 = FlutterBluePlusPlugin.this.f55385p.get(str) != null ? (String) FlutterBluePlusPlugin.this.f55385p.get(str) : "";
            FlutterBluePlusPlugin.this.f55385p.remove(str);
            HashMap map = new HashMap();
            map.put("remote_id", address);
            map.put("service_uuid", strM67633v0);
            map.put("characteristic_uuid", strM67633v1);
            map.put("value", str2);
            map.put("success", Integer.valueOf(i11 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i11));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i11));
            if (bluetoothGattServiceM67589j0 != null) {
                map.put("primary_service_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattServiceM67589j0.getUuid()));
            }
            FlutterBluePlusPlugin.this.m67627o0("OnCharacteristicWritten", map);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i11, int i12) {
            try {
                FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                flutterBluePlusPlugin.m67609I(flutterBluePlusPlugin.f55379j);
                FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
                LogLevel logLevel = LogLevel.DEBUG;
                flutterBluePlusPlugin2.m67630r0(logLevel, "onConnectionStateChange:" + FlutterBluePlusPlugin.m67576Y(i12));
                FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67593m0(i11));
                if (i12 == 2 || i12 == 0) {
                    String address = bluetoothGatt.getDevice().getAddress();
                    if (!m67636a(bluetoothGatt, i12, address)) {
                        if (i12 == 2) {
                            FlutterBluePlusPlugin.this.f55380k.put(address, bluetoothGatt);
                            FlutterBluePlusPlugin.this.f55381l.remove(address);
                            FlutterBluePlusPlugin.this.f55383n.put(address, 23);
                        }
                        if (i12 == 0) {
                            FlutterBluePlusPlugin.this.f55380k.remove(address);
                            FlutterBluePlusPlugin.this.f55381l.remove(address);
                            FlutterBluePlusPlugin.this.f55382m.remove(address);
                            if (FlutterBluePlusPlugin.this.f55384o.containsKey(address)) {
                                FlutterBluePlusPlugin.this.m67630r0(logLevel, "autoconnect is true. skipping gatt.close()");
                            } else {
                                bluetoothGatt.close();
                            }
                        }
                        HashMap map = new HashMap();
                        map.put("remote_id", address);
                        map.put("connection_state", Integer.valueOf(FlutterBluePlusPlugin.m67573U(i12)));
                        map.put("disconnect_reason_code", Integer.valueOf(i11));
                        map.put("disconnect_reason_string", FlutterBluePlusPlugin.m67593m0(i11));
                        FlutterBluePlusPlugin.this.m67627o0("OnConnectionStateChanged", map);
                    }
                }
            } finally {
                FlutterBluePlusPlugin.this.f55379j.release();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
            LogLevel logLevel = i11 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onDescriptorWrite:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  chr: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getCharacteristic().getUuid()));
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  desc: " + FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getUuid()));
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i11) + " (" + i11 + ")");
            BluetoothGattService bluetoothGattServiceM67589j0 = FlutterBluePlusPlugin.m67589j0(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
            String address = bluetoothGatt.getDevice().getAddress();
            String strM67633v0 = FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getCharacteristic().getService().getUuid());
            String strM67633v1 = FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getCharacteristic().getUuid());
            String strM67633v2 = FlutterBluePlusPlugin.this.m67633v0(bluetoothGattDescriptor.getUuid());
            String str = address + C33844oi.f71346o + strM67633v0 + C33844oi.f71346o + strM67633v1 + C33844oi.f71346o + strM67633v2 + C33844oi.f71346o + (bluetoothGattServiceM67589j0 != null ? FlutterBluePlusPlugin.this.m67633v0(bluetoothGattServiceM67589j0.getUuid()) : "");
            String str2 = FlutterBluePlusPlugin.this.f55386q.get(str) != null ? (String) FlutterBluePlusPlugin.this.f55386q.get(str) : "";
            FlutterBluePlusPlugin.this.f55386q.remove(str);
            HashMap map = new HashMap();
            map.put("remote_id", address);
            map.put("service_uuid", strM67633v0);
            map.put("characteristic_uuid", strM67633v1);
            map.put("descriptor_uuid", strM67633v2);
            map.put("value", str2);
            map.put("success", Integer.valueOf(i11 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i11));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i11));
            if (bluetoothGattServiceM67589j0 != null) {
                map.put("primary_service_uuid", FlutterBluePlusPlugin.this.m67633v0(bluetoothGattServiceM67589j0.getUuid()));
            }
            FlutterBluePlusPlugin.this.m67627o0("OnDescriptorWritten", map);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i11, int i12) {
            LogLevel logLevel = i12 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onMtuChanged:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  mtu: " + i11);
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i12) + " (" + i12 + ")");
            String address = bluetoothGatt.getDevice().getAddress();
            FlutterBluePlusPlugin.this.f55383n.put(address, Integer.valueOf(i11));
            HashMap map = new HashMap();
            map.put("remote_id", address);
            map.put("mtu", Integer.valueOf(i11));
            map.put("success", Integer.valueOf(i12 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i12));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i12));
            FlutterBluePlusPlugin.this.m67627o0("OnMtuChanged", map);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i11, int i12) {
            LogLevel logLevel = i12 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onReadRemoteRssi:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  rssi: " + i11);
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i12) + " (" + i12 + ")");
            HashMap map = new HashMap();
            map.put("remote_id", bluetoothGatt.getDevice().getAddress());
            map.put("rssi", Integer.valueOf(i11));
            map.put("success", Integer.valueOf(i12 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i12));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i12));
            FlutterBluePlusPlugin.this.m67627o0("OnReadRssi", map);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i11) {
            LogLevel logLevel = i11 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onReliableWriteCompleted:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + FlutterBluePlusPlugin.m67580c0(i11) + " (" + i11 + ")");
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i11) {
            LogLevel logLevel = i11 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "onServicesDiscovered:");
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  count: " + bluetoothGatt.getServices().size());
            FlutterBluePlusPlugin.this.m67630r0(logLevel, "  status: " + i11 + FlutterBluePlusPlugin.m67580c0(i11));
            ArrayList arrayList = new ArrayList();
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                arrayList.add(FlutterBluePlusPlugin.this.m67614Q(bluetoothGatt.getDevice(), bluetoothGattService, null, bluetoothGatt));
                Iterator<BluetoothGattService> it = bluetoothGattService.getIncludedServices().iterator();
                while (it.hasNext()) {
                    arrayList.add(FlutterBluePlusPlugin.this.m67614Q(bluetoothGatt.getDevice(), it.next(), bluetoothGattService, bluetoothGatt));
                }
            }
            HashMap map = new HashMap();
            map.put("remote_id", bluetoothGatt.getDevice().getAddress());
            map.put("services", arrayList);
            map.put("success", Integer.valueOf(i11 == 0 ? 1 : 0));
            map.put("error_code", Integer.valueOf(i11));
            map.put("error_string", FlutterBluePlusPlugin.m67580c0(i11));
            FlutterBluePlusPlugin.this.m67627o0("OnDiscoveredServices", map);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i11);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
            onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i11, bluetoothGattDescriptor.getValue());
        }
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$f */
    /* JADX INFO: loaded from: classes59.dex */
    public class C27298f {

        /* JADX INFO: renamed from: a */
        public BluetoothGattCharacteristic f55402a;

        /* JADX INFO: renamed from: b */
        public String f55403b;

        public C27298f(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
            this.f55402a = bluetoothGattCharacteristic;
            this.f55403b = str;
        }
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$g */
    /* JADX INFO: loaded from: classes59.dex */
    public interface InterfaceC27299g {
        /* JADX INFO: renamed from: a */
        void mo67638a(boolean z11, String str);
    }

    /* JADX INFO: renamed from: U */
    public static int m67573U(int i11) {
        return i11 != 2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m67582e(FlutterBluePlusPlugin flutterBluePlusPlugin, MethodChannel.Result result, String str, boolean z11, boolean z12, String str2) {
        if (!z12) {
            flutterBluePlusPlugin.getClass();
            result.error(m67587i0(str2), String.format("FlutterBluePlus requires %s for new connection", str2), null);
            return;
        }
        if (!flutterBluePlusPlugin.m67628p0()) {
            result.error("connect", String.format("bluetooth must be turned on", new Object[0]), null);
            return;
        }
        if (flutterBluePlusPlugin.f55381l.get(str) != null) {
            flutterBluePlusPlugin.m67630r0(LogLevel.DEBUG, "already connecting");
            result.success(Boolean.TRUE);
            return;
        }
        if (flutterBluePlusPlugin.f55380k.get(str) != null) {
            flutterBluePlusPlugin.m67630r0(LogLevel.DEBUG, "already connected");
            result.success(Boolean.FALSE);
            return;
        }
        flutterBluePlusPlugin.m67634w0();
        BluetoothGatt bluetoothGattConnectGatt = flutterBluePlusPlugin.f55375f.getRemoteDevice(str).connectGatt(flutterBluePlusPlugin.f55372c, z11, flutterBluePlusPlugin.f55370B, 2);
        if (bluetoothGattConnectGatt == null) {
            result.error("connect", String.format("device.connectGatt returned null", new Object[0]), null);
            return;
        }
        flutterBluePlusPlugin.f55381l.put(str, bluetoothGattConnectGatt);
        if (z11) {
            flutterBluePlusPlugin.f55384o.put(str, bluetoothGattConnectGatt);
        } else {
            flutterBluePlusPlugin.f55384o.remove(str);
        }
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m67584g(FlutterBluePlusPlugin flutterBluePlusPlugin, MethodChannel.Result result, int i11, boolean z11, List list, List list2, List list3, List list4, List list5, List list6, HashMap map, boolean z12, String str) {
        if (!z12) {
            flutterBluePlusPlugin.getClass();
            result.error(m67587i0(str), String.format("FlutterBluePlus requires %s permission", str), null);
            return;
        }
        if (!flutterBluePlusPlugin.m67628p0()) {
            result.error("startScan", String.format("bluetooth must be turned on", new Object[0]), null);
            return;
        }
        BluetoothLeScanner bluetoothLeScanner = flutterBluePlusPlugin.f55375f.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            result.error("startScan", String.format("getBluetoothLeScanner() is null. Is the Adapter on?", new Object[0]), null);
            return;
        }
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setScanMode(i11);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setPhy(255);
            builder.setLegacy(z11);
        }
        ScanSettings scanSettingsBuild = builder.build();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(flutterBluePlusPlugin.m67632u0(list.get(i12)))).build());
        }
        for (int i13 = 0; i13 < list2.size(); i13++) {
            arrayList.add(new ScanFilter.Builder().setDeviceAddress((String) list2.get(i13)).build());
        }
        for (int i14 = 0; i14 < list3.size(); i14++) {
            arrayList.add(new ScanFilter.Builder().setDeviceName((String) list3.get(i14)).build());
        }
        if (Build.VERSION.SDK_INT >= 33 && list4.size() > 0) {
            ScanFilter scanFilterBuild = new ScanFilter.Builder().setAdvertisingDataType(8).build();
            ScanFilter scanFilterBuild2 = new ScanFilter.Builder().setAdvertisingDataType(9).build();
            arrayList.add(scanFilterBuild);
            arrayList.add(scanFilterBuild2);
        }
        for (int i15 = 0; i15 < list5.size(); i15++) {
            HashMap map2 = (HashMap) list5.get(i15);
            int iIntValue = ((Integer) map2.get("manufacturer_id")).intValue();
            byte[] bArrM67595n0 = m67595n0((String) map2.get("data"));
            byte[] bArrM67595n1 = m67595n0((String) map2.get("mask"));
            arrayList.add(bArrM67595n1.length == 0 ? new ScanFilter.Builder().setManufacturerData(iIntValue, bArrM67595n0).build() : new ScanFilter.Builder().setManufacturerData(iIntValue, bArrM67595n0, bArrM67595n1).build());
        }
        for (int i16 = 0; i16 < list6.size(); i16++) {
            HashMap map3 = (HashMap) list6.get(i16);
            ParcelUuid parcelUuidFromString = ParcelUuid.fromString(flutterBluePlusPlugin.m67632u0((String) map3.get(NotificationCompat.CATEGORY_SERVICE)));
            byte[] bArrM67595n2 = m67595n0((String) map3.get("data"));
            byte[] bArrM67595n3 = m67595n0((String) map3.get("mask"));
            arrayList.add(bArrM67595n3.length == 0 ? new ScanFilter.Builder().setServiceData(parcelUuidFromString, bArrM67595n2).build() : new ScanFilter.Builder().setServiceData(parcelUuidFromString, bArrM67595n2, bArrM67595n3).build());
        }
        flutterBluePlusPlugin.f55389t = map;
        flutterBluePlusPlugin.f55387r.clear();
        flutterBluePlusPlugin.f55388s.clear();
        bluetoothLeScanner.startScan(arrayList, scanSettingsBuild, flutterBluePlusPlugin.m67625k0());
        flutterBluePlusPlugin.f55376g = true;
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: n0 */
    public static byte[] m67595n0(String str) {
        if (str == null) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i11 = 0; i11 < length; i11 += 2) {
            bArr[i11 / 2] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: I */
    public final void m67609I(@NonNull Semaphore semaphore) {
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException unused) {
                m67630r0(LogLevel.ERROR, "failed to acquire mutex, retrying");
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final int m67624h0(String str, int i11, boolean z11) {
        if (i11 != 1 && z11) {
            return 512;
        }
        Integer num = this.f55383n.get(str);
        if (num == null) {
            num = 23;
        }
        return Math.min(num.intValue() - 3, 512);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x020d  */
    /* JADX WARN: Code duplicated, block: B:244:0x067c A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x08e0 A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x08eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:308:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:309:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:311:0x08f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:313:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:314:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:316:0x092f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x0931  */
    /* JADX WARN: Code duplicated, block: B:320:0x095c A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x0966 A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x0989 A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:325:0x0993 A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x099b A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x09a4 A[Catch: all -> 0x0041, Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x0006, B:5:0x0029, B:7:0x003c, B:13:0x0048, B:14:0x004a, B:17:0x0050, B:19:0x0058, B:21:0x0062, B:23:0x006d, B:25:0x0077, B:27:0x0081, B:29:0x008c, B:32:0x009a, B:36:0x00bc, B:129:0x0230, B:130:0x0235, B:131:0x024b, B:133:0x0259, B:134:0x025f, B:136:0x026f, B:137:0x0278, B:138:0x0285, B:140:0x0297, B:141:0x02a5, B:143:0x02c1, B:144:0x02cc, B:145:0x02d3, B:147:0x02e1, B:148:0x02e7, B:150:0x02f5, B:151:0x0303, B:153:0x030b, B:154:0x0319, B:156:0x031f, B:157:0x0327, B:158:0x032e, B:159:0x035d, B:160:0x036c, B:162:0x0372, B:163:0x0380, B:164:0x038f, B:166:0x0395, B:167:0x03af, B:169:0x03ec, B:170:0x03f5, B:171:0x0402, B:173:0x0408, B:174:0x0421, B:175:0x044b, B:177:0x046d, B:178:0x0476, B:180:0x0483, B:181:0x048e, B:182:0x0495, B:184:0x04a3, B:185:0x04ac, B:187:0x04b5, B:188:0x04c0, B:189:0x04c7, B:191:0x04ea, B:192:0x04f3, B:194:0x04fc, B:195:0x0507, B:196:0x050e, B:198:0x054e, B:199:0x0554, B:201:0x055f, B:202:0x0565, B:204:0x056d, B:205:0x0589, B:207:0x0595, B:209:0x05bc, B:213:0x05c7, B:219:0x05d8, B:222:0x05e5, B:224:0x05ef, B:227:0x05f5, B:229:0x05f9, B:233:0x0602, B:235:0x0637, B:237:0x063d, B:244:0x067c, B:238:0x0660, B:240:0x0666, B:241:0x066e, B:243:0x0674, B:230:0x05fc, B:245:0x0683, B:247:0x06bc, B:248:0x06c2, B:250:0x06cd, B:251:0x06d3, B:253:0x06df, B:254:0x0703, B:256:0x0718, B:259:0x0740, B:261:0x076f, B:263:0x0779, B:270:0x07bc, B:264:0x079c, B:266:0x07a6, B:267:0x07ae, B:269:0x07b4, B:271:0x07c3, B:273:0x07f3, B:274:0x07f9, B:276:0x0804, B:277:0x080a, B:279:0x0816, B:280:0x083a, B:282:0x0840, B:283:0x0848, B:284:0x084f, B:291:0x089a, B:293:0x08a4, B:294:0x08aa, B:296:0x08b5, B:297:0x08bb, B:299:0x08c0, B:301:0x08c8, B:305:0x08e0, B:315:0x0900, B:318:0x0933, B:320:0x095c, B:322:0x0966, B:329:0x09ac, B:323:0x0989, B:325:0x0993, B:326:0x099b, B:328:0x09a4, B:302:0x08d0, B:304:0x08d8, B:330:0x09b3, B:332:0x09db, B:333:0x09e1, B:335:0x09ec, B:336:0x09f2, B:338:0x09fc, B:339:0x0a04, B:341:0x0a0a, B:342:0x0a12, B:343:0x0a19, B:345:0x0a27, B:346:0x0a2f, B:348:0x0a3a, B:349:0x0a42, B:350:0x0a49, B:352:0x0a57, B:355:0x0a63, B:357:0x0a6d, B:359:0x0a77, B:361:0x0a90, B:362:0x0a9c, B:364:0x0aac, B:365:0x0ae3, B:366:0x0aea, B:370:0x0b07, B:372:0x0b12, B:373:0x0b17, B:374:0x0b21, B:376:0x0b2e, B:377:0x0b31, B:378:0x0b3b, B:380:0x0b43, B:381:0x0b4d, B:382:0x0b54, B:384:0x0bd3, B:386:0x0bda, B:387:0x0bdf, B:390:0x0be6, B:391:0x0beb, B:392:0x0bf6, B:394:0x0c03, B:397:0x0c0a, B:398:0x0c0f, B:399:0x0c19, B:401:0x0c26, B:404:0x0c2d, B:405:0x0c32, B:410:0x0c44, B:411:0x0c5b, B:415:0x0c62, B:416:0x0c6b, B:417:0x0c82, B:419:0x0ca6, B:420:0x0cab, B:421:0x0cb9, B:422:0x0cbf, B:424:0x0cc5, B:425:0x0ccf, B:427:0x0cd5, B:429:0x0cd9, B:430:0x0ce8, B:39:0x00c6, B:42:0x00d2, B:45:0x00df, B:48:0x00eb, B:51:0x00f5, B:54:0x00ff, B:57:0x010a, B:60:0x0117, B:63:0x0123, B:66:0x012f, B:69:0x013b, B:72:0x0147, B:75:0x0154, B:78:0x015e, B:81:0x016b, B:84:0x0175, B:87:0x0182, B:90:0x018f, B:93:0x019b, B:96:0x01a7, B:99:0x01b3, B:102:0x01bc, B:105:0x01c7, B:108:0x01d0, B:111:0x01d9, B:114:0x01e1, B:117:0x01ec, B:120:0x01f6, B:123:0x0201), top: B:437:0x0006, outer: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:322:0x0966, please report this as an issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NonNull MethodCall methodCall, @NonNull final MethodChannel.Result result) {
        int state;
        LogLevel logLevel;
        int iM67624h0;
        int length;
        int iWriteCharacteristic;
        String str;
        String str2;
        byte[] bArr;
        try {
            try {
                m67609I(this.f55379j);
                LogLevel logLevel2 = LogLevel.DEBUG;
                m67630r0(logLevel2, "onMethodCall: " + methodCall.method);
                if (this.f55375f == null) {
                    m67630r0(logLevel2, "initializing BluetoothAdapter");
                    BluetoothManager bluetoothManager = (BluetoothManager) this.f55372c.getSystemService("bluetooth");
                    this.f55374e = bluetoothManager;
                    this.f55375f = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                }
                if (this.f55375f != null || "flutterRestart".equals(methodCall.method) || "connectedCount".equals(methodCall.method) || "setLogLevel".equals(methodCall.method) || "isSupported".equals(methodCall.method) || "getAdapterState".equals(methodCall.method) || "openAppSettings".equals(methodCall.method)) {
                    switch (methodCall.method) {
                        case "flutterRestart":
                            BluetoothAdapter bluetoothAdapter = this.f55375f;
                            if (bluetoothAdapter == null) {
                                result.success(0);
                                break;
                            } else {
                                BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
                                if (bluetoothLeScanner != null && this.f55376g) {
                                    m67630r0(logLevel2, "calling stopScan (flutterRestart)");
                                    bluetoothLeScanner.stopScan(m67625k0());
                                    this.f55376g = false;
                                }
                                m67617Z("flutterRestart");
                                m67630r0(logLevel2, "connectedPeripherals: " + this.f55380k.size());
                                result.success(Integer.valueOf(this.f55380k.size()));
                                break;
                            }
                            break;
                        case "setOptions":
                            result.success(Boolean.TRUE);
                            break;
                        case "connectedCount":
                            m67630r0(logLevel2, "connectedPeripherals: " + this.f55380k.size());
                            if (this.f55380k.size() == 0) {
                                m67630r0(logLevel2, "Hot Restart: complete");
                            }
                            result.success(Integer.valueOf(this.f55380k.size()));
                            break;
                        case "setLogLevel":
                            this.f55371b = LogLevel.values()[((Integer) methodCall.arguments).intValue()];
                            result.success(Boolean.TRUE);
                            break;
                        case "isSupported":
                            boolean z11 = true;
                            if (this.f55375f == null) {
                                z11 = false;
                            }
                            result.success(Boolean.valueOf(z11));
                            break;
                        case "getAdapterState":
                            try {
                                state = this.f55375f.getState();
                                break;
                            } catch (Exception unused) {
                                state = -1;
                            }
                            HashMap map = new HashMap();
                            map.put("adapter_state", Integer.valueOf(m67570M(state)));
                            result.success(map);
                            break;
                        case "turnOn":
                            ArrayList arrayList = new ArrayList();
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 31) {
                                arrayList.add("android.permission.BLUETOOTH_CONNECT");
                            }
                            if (i11 <= 30) {
                                arrayList.add("android.permission.BLUETOOTH");
                            }
                            m67618a0(arrayList, new InterfaceC27299g() { // from class: e90.k
                                @Override // com.lib.flutter_blue_plus.FlutterBluePlusPlugin.InterfaceC27299g
                                /* JADX INFO: renamed from: a */
                                public final void mo67638a(boolean z12, String str3) {
                                    FlutterBluePlusPlugin.m67578b(this.f82374a, result, z12, str3);
                                }
                            });
                            break;
                        case "turnOff":
                            ArrayList arrayList2 = new ArrayList();
                            int i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 31) {
                                arrayList2.add("android.permission.BLUETOOTH_CONNECT");
                            }
                            if (i12 <= 30) {
                                arrayList2.add("android.permission.BLUETOOTH");
                            }
                            m67618a0(arrayList2, new InterfaceC27299g() { // from class: e90.n
                                @Override // com.lib.flutter_blue_plus.FlutterBluePlusPlugin.InterfaceC27299g
                                /* JADX INFO: renamed from: a */
                                public final void mo67638a(boolean z12, String str3) {
                                    FlutterBluePlusPlugin.m67577a(this.f82378a, result, z12, str3);
                                }
                            });
                            break;
                        case "startScan":
                            final HashMap map2 = (HashMap) methodCall.arguments();
                            final List list = (List) map2.get("with_services");
                            final List list2 = (List) map2.get("with_remote_ids");
                            final List list3 = (List) map2.get("with_names");
                            final List list4 = (List) map2.get("with_keywords");
                            final List list5 = (List) map2.get("with_msd");
                            final List list6 = (List) map2.get("with_service_data");
                            ((Boolean) map2.get("continuous_updates")).getClass();
                            final boolean zBooleanValue = ((Boolean) map2.get("android_legacy")).booleanValue();
                            final int iIntValue = ((Integer) map2.get("android_scan_mode")).intValue();
                            boolean zBooleanValue2 = ((Boolean) map2.get("android_uses_fine_location")).booleanValue();
                            ArrayList arrayList3 = new ArrayList();
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 31) {
                                arrayList3.add("android.permission.BLUETOOTH_SCAN");
                                if (zBooleanValue2) {
                                    arrayList3.add("android.permission.ACCESS_FINE_LOCATION");
                                }
                                arrayList3.add("android.permission.BLUETOOTH_CONNECT");
                            }
                            if (i13 <= 30) {
                                arrayList3.add("android.permission.ACCESS_FINE_LOCATION");
                            }
                            m67618a0(arrayList3, new InterfaceC27299g() { // from class: e90.o
                                @Override // com.lib.flutter_blue_plus.FlutterBluePlusPlugin.InterfaceC27299g
                                /* JADX INFO: renamed from: a */
                                public final void mo67638a(boolean z12, String str3) {
                                    FlutterBluePlusPlugin.m67584g(this.f82380a, result, iIntValue, zBooleanValue, list, list2, list3, list4, list5, list6, map2, z12, str3);
                                }
                            });
                            break;
                        case "stopScan":
                            BluetoothLeScanner bluetoothLeScanner2 = this.f55375f.getBluetoothLeScanner();
                            if (bluetoothLeScanner2 != null) {
                                bluetoothLeScanner2.stopScan(m67625k0());
                                this.f55376g = false;
                            }
                            result.success(Boolean.TRUE);
                            break;
                        case "getSystemDevices":
                            ArrayList arrayList4 = new ArrayList();
                            if (Build.VERSION.SDK_INT >= 31) {
                                arrayList4.add("android.permission.BLUETOOTH_CONNECT");
                            }
                            m67618a0(arrayList4, new InterfaceC27299g() { // from class: e90.p
                                @Override // com.lib.flutter_blue_plus.FlutterBluePlusPlugin.InterfaceC27299g
                                /* JADX INFO: renamed from: a */
                                public final void mo67638a(boolean z12, String str3) {
                                    FlutterBluePlusPlugin.m67583f(this.f82391a, result, z12, str3);
                                }
                            });
                            break;
                        case "connect":
                            final boolean z12 = true;
                            HashMap map3 = (HashMap) methodCall.arguments();
                            final String str3 = (String) map3.get("remote_id");
                            if (((Integer) map3.get("auto_connect")).intValue() == 0) {
                                z12 = false;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            if (Build.VERSION.SDK_INT >= 31) {
                                arrayList5.add("android.permission.BLUETOOTH_CONNECT");
                            }
                            m67618a0(arrayList5, new InterfaceC27299g() { // from class: e90.q
                                @Override // com.lib.flutter_blue_plus.FlutterBluePlusPlugin.InterfaceC27299g
                                /* JADX INFO: renamed from: a */
                                public final void mo67638a(boolean z13, String str4) {
                                    FlutterBluePlusPlugin.m67582e(this.f82393a, result, str3, z12, z13, str4);
                                }
                            });
                            break;
                        case "disconnect":
                            Object obj = (String) methodCall.arguments;
                            BluetoothGatt bluetoothGatt = this.f55381l.get(obj);
                            if (bluetoothGatt != null) {
                                logLevel = logLevel2;
                                m67630r0(logLevel, "disconnect: cancelling connection in progress");
                            } else {
                                logLevel = logLevel2;
                            }
                            if (bluetoothGatt == null) {
                                bluetoothGatt = this.f55380k.get(obj);
                            }
                            if (bluetoothGatt != null || (bluetoothGatt = this.f55384o.get(obj)) == null) {
                                if (bluetoothGatt != null) {
                                    this.f55384o.remove(obj);
                                    bluetoothGatt.disconnect();
                                    if (this.f55381l.get(obj) != null) {
                                        this.f55381l.remove(obj);
                                        bluetoothGatt.close();
                                        HashMap<String, Object> map4 = new HashMap<>();
                                        map4.put("remote_id", obj);
                                        map4.put("connection_state", Integer.valueOf(m67573U(0)));
                                        map4.put("disconnect_reason_code", 23789258);
                                        map4.put("disconnect_reason_string", "connection canceled");
                                        m67627o0("OnConnectionStateChanged", map4);
                                    }
                                    result.success(Boolean.TRUE);
                                } else {
                                    m67630r0(logLevel, "already disconnected");
                                    result.success(Boolean.FALSE);
                                }
                                break;
                            } else {
                                m67630r0(logLevel, "already disconnected. disabling autoconnect");
                                this.f55384o.remove(obj);
                                bluetoothGatt.disconnect();
                                bluetoothGatt.close();
                                result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "discoverServices":
                            BluetoothGatt bluetoothGatt2 = this.f55380k.get((String) methodCall.arguments);
                            if (bluetoothGatt2 == null) {
                                result.error("discoverServices", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                if (!bluetoothGatt2.discoverServices()) {
                                    result.error("discoverServices", "gatt.discoverServices() returned false", null);
                                } else {
                                    result.success(Boolean.TRUE);
                                }
                                break;
                            }
                            break;
                        case "readCharacteristic":
                            HashMap map5 = (HashMap) methodCall.arguments();
                            String str4 = (String) map5.get("remote_id");
                            String str5 = (String) map5.get("service_uuid");
                            String str6 = (String) map5.get("characteristic_uuid");
                            String str7 = (String) map5.get("primary_service_uuid");
                            BluetoothGatt bluetoothGatt3 = this.f55380k.get(str4);
                            if (bluetoothGatt3 == null) {
                                result.error("readCharacteristic", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                C27298f c27298fM67629q0 = m67629q0(bluetoothGatt3, str5, str6, str7);
                                String str8 = c27298fM67629q0.f55403b;
                                if (str8 == null) {
                                    BluetoothGattCharacteristic bluetoothGattCharacteristic = c27298fM67629q0.f55402a;
                                    if ((bluetoothGattCharacteristic.getProperties() & 2) == 0) {
                                        result.error("readCharacteristic", "The READ property is not supported by this BLE characteristic", null);
                                    } else if (!bluetoothGatt3.readCharacteristic(bluetoothGattCharacteristic)) {
                                        result.error("readCharacteristic", "gatt.readCharacteristic() returned false", null);
                                    } else {
                                        result.success(Boolean.TRUE);
                                    }
                                } else {
                                    result.error("readCharacteristic", str8, null);
                                }
                                break;
                            }
                            break;
                        case "writeCharacteristic":
                            HashMap map6 = (HashMap) methodCall.arguments();
                            String str9 = (String) map6.get("remote_id");
                            String str10 = (String) map6.get("service_uuid");
                            String str11 = (String) map6.get("characteristic_uuid");
                            String str12 = (String) map6.get("primary_service_uuid");
                            String str13 = (String) map6.get("value");
                            int iIntValue2 = ((Integer) map6.get("write_type")).intValue();
                            boolean z13 = ((Integer) map6.get("allow_long_write")).intValue() != 0;
                            int i14 = iIntValue2 == 0 ? 2 : 1;
                            BluetoothGatt bluetoothGatt4 = this.f55380k.get(str9);
                            if (bluetoothGatt4 == null) {
                                result.error("writeCharacteristic", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                C27298f c27298fM67629q1 = m67629q0(bluetoothGatt4, str10, str11, str12);
                                String str14 = c27298fM67629q1.f55403b;
                                if (str14 == null) {
                                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = c27298fM67629q1.f55402a;
                                    if (i14 != 1) {
                                        if ((bluetoothGattCharacteristic2.getProperties() & 8) != 0) {
                                            iM67624h0 = m67624h0(str9, i14, z13);
                                            length = m67595n0(str13).length;
                                            if (length > iM67624h0) {
                                                if (str12 == null) {
                                                    str12 = "";
                                                }
                                                this.f55385p.put(str9 + C33844oi.f71346o + str10 + C33844oi.f71346o + str11 + C33844oi.f71346o + str12, str13);
                                                if (Build.VERSION.SDK_INT >= 33) {
                                                    iWriteCharacteristic = bluetoothGatt4.writeCharacteristic(bluetoothGattCharacteristic2, m67595n0(str13), i14);
                                                    if (iWriteCharacteristic != 0) {
                                                        result.error("writeCharacteristic", "gatt.writeCharacteristic() returned " + iWriteCharacteristic + " : " + m67569L(iWriteCharacteristic), null);
                                                    }
                                                } else if (bluetoothGattCharacteristic2.setValue(m67595n0(str13))) {
                                                    result.error("writeCharacteristic", "characteristic.setValue() returned false", null);
                                                } else {
                                                    bluetoothGattCharacteristic2.setWriteType(i14);
                                                    if (!bluetoothGatt4.writeCharacteristic(bluetoothGattCharacteristic2)) {
                                                        result.error("writeCharacteristic", "gatt.writeCharacteristic() returned false", null);
                                                    }
                                                }
                                                result.success(Boolean.TRUE);
                                            } else {
                                                if (iIntValue2 == 0) {
                                                    str = "withResponse";
                                                } else {
                                                    str = "withoutResponse";
                                                }
                                                if (iIntValue2 == 0) {
                                                    str2 = "";
                                                } else if (z13) {
                                                    str2 = ", allowLongWrite";
                                                } else {
                                                    str2 = ", noLongWrite";
                                                }
                                                result.error("writeCharacteristic", "data longer than allowed. dataLen: " + length + " > max: " + iM67624h0 + " (" + str + str2 + ")", null);
                                            }
                                        } else {
                                            result.error("writeCharacteristic", "The WRITE property is not supported by this BLE characteristic", null);
                                        }
                                    } else if ((bluetoothGattCharacteristic2.getProperties() & 4) != 0) {
                                        iM67624h0 = m67624h0(str9, i14, z13);
                                        length = m67595n0(str13).length;
                                        if (length > iM67624h0) {
                                            if (str12 == null) {
                                                str12 = "";
                                            }
                                            this.f55385p.put(str9 + C33844oi.f71346o + str10 + C33844oi.f71346o + str11 + C33844oi.f71346o + str12, str13);
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                iWriteCharacteristic = bluetoothGatt4.writeCharacteristic(bluetoothGattCharacteristic2, m67595n0(str13), i14);
                                                if (iWriteCharacteristic != 0) {
                                                    result.error("writeCharacteristic", "gatt.writeCharacteristic() returned " + iWriteCharacteristic + " : " + m67569L(iWriteCharacteristic), null);
                                                }
                                            } else if (bluetoothGattCharacteristic2.setValue(m67595n0(str13))) {
                                                bluetoothGattCharacteristic2.setWriteType(i14);
                                                if (!bluetoothGatt4.writeCharacteristic(bluetoothGattCharacteristic2)) {
                                                    result.error("writeCharacteristic", "gatt.writeCharacteristic() returned false", null);
                                                }
                                            } else {
                                                result.error("writeCharacteristic", "characteristic.setValue() returned false", null);
                                            }
                                            result.success(Boolean.TRUE);
                                        } else {
                                            if (iIntValue2 == 0) {
                                                str = "withResponse";
                                            } else {
                                                str = "withoutResponse";
                                            }
                                            if (iIntValue2 == 0) {
                                                str2 = "";
                                            } else if (z13) {
                                                str2 = ", allowLongWrite";
                                            } else {
                                                str2 = ", noLongWrite";
                                            }
                                            result.error("writeCharacteristic", "data longer than allowed. dataLen: " + length + " > max: " + iM67624h0 + " (" + str + str2 + ")", null);
                                        }
                                    } else {
                                        result.error("writeCharacteristic", "The WRITE_NO_RESPONSE property is not supported by this BLE characteristic", null);
                                    }
                                } else {
                                    result.error("writeCharacteristic", str14, null);
                                }
                                break;
                            }
                            break;
                        case "readDescriptor":
                            HashMap map7 = (HashMap) methodCall.arguments();
                            String str15 = (String) map7.get("remote_id");
                            String str16 = (String) map7.get("service_uuid");
                            String str17 = (String) map7.get("characteristic_uuid");
                            String str18 = (String) map7.get("descriptor_uuid");
                            String str19 = (String) map7.get("primary_service_uuid");
                            BluetoothGatt bluetoothGatt5 = this.f55380k.get(str15);
                            if (bluetoothGatt5 == null) {
                                result.error("readDescriptor", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                C27298f c27298fM67629q2 = m67629q0(bluetoothGatt5, str16, str17, str19);
                                String str20 = c27298fM67629q2.f55403b;
                                if (str20 == null) {
                                    BluetoothGattDescriptor bluetoothGattDescriptorM67622f0 = m67622f0(str18, c27298fM67629q2.f55402a.getDescriptors());
                                    if (bluetoothGattDescriptorM67622f0 == null) {
                                        result.error("writeDescriptor", "descriptor not found on characteristic. (desc: " + str18 + " chr: " + str17 + ")", null);
                                    } else if (!bluetoothGatt5.readDescriptor(bluetoothGattDescriptorM67622f0)) {
                                        result.error("readDescriptor", "gatt.readDescriptor() returned false", null);
                                    } else {
                                        result.success(Boolean.TRUE);
                                    }
                                } else {
                                    result.error("readDescriptor", str20, null);
                                }
                                break;
                            }
                            break;
                        case "writeDescriptor":
                            HashMap map8 = (HashMap) methodCall.arguments();
                            String str21 = (String) map8.get("remote_id");
                            String str22 = (String) map8.get("service_uuid");
                            String str23 = (String) map8.get("characteristic_uuid");
                            String str24 = (String) map8.get("descriptor_uuid");
                            String str25 = (String) map8.get("primary_service_uuid");
                            String str26 = (String) map8.get("value");
                            BluetoothGatt bluetoothGatt6 = this.f55380k.get(str21);
                            if (bluetoothGatt6 == null) {
                                result.error("writeDescriptor", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                C27298f c27298fM67629q3 = m67629q0(bluetoothGatt6, str22, str23, str25);
                                String str27 = c27298fM67629q3.f55403b;
                                if (str27 == null) {
                                    BluetoothGattDescriptor bluetoothGattDescriptorM67622f1 = m67622f0(str24, c27298fM67629q3.f55402a.getDescriptors());
                                    if (bluetoothGattDescriptorM67622f1 != null) {
                                        int iIntValue3 = this.f55383n.get(str21).intValue() - 3;
                                        if (iIntValue3 >= m67595n0(str26).length) {
                                            if (str25 == null) {
                                                str25 = "";
                                            }
                                            this.f55386q.put(str21 + C33844oi.f71346o + str22 + C33844oi.f71346o + str23 + C33844oi.f71346o + str24 + C33844oi.f71346o + str25, str26);
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                int iWriteDescriptor = bluetoothGatt6.writeDescriptor(bluetoothGattDescriptorM67622f1, m67595n0(str26));
                                                if (iWriteDescriptor != 0) {
                                                    result.error("writeDescriptor", "gatt.writeDescriptor() returned " + iWriteDescriptor + " : " + m67569L(iWriteDescriptor), null);
                                                }
                                            } else if (!bluetoothGattDescriptorM67622f1.setValue(m67595n0(str26))) {
                                                result.error("writeDescriptor", "descriptor.setValue() returned false", null);
                                            } else if (!bluetoothGatt6.writeDescriptor(bluetoothGattDescriptorM67622f1)) {
                                                result.error("writeDescriptor", "gatt.writeDescriptor() returned false", null);
                                            }
                                            result.success(Boolean.TRUE);
                                        } else {
                                            result.error("writeDescriptor", "data longer than mtu allows. dataLength: " + m67595n0(str26).length + "> max: " + iIntValue3, null);
                                        }
                                    } else {
                                        result.error("writeDescriptor", "descriptor not found on characteristic. (desc: " + str24 + " chr: " + str23 + ")", null);
                                    }
                                } else {
                                    result.error("writeDescriptor", str27, null);
                                }
                                break;
                            }
                            break;
                        case "setNotifyValue":
                            HashMap map9 = (HashMap) methodCall.arguments();
                            String str28 = (String) map9.get("remote_id");
                            String str29 = (String) map9.get("service_uuid");
                            String str30 = (String) map9.get("characteristic_uuid");
                            String str31 = (String) map9.get("primary_service_uuid");
                            boolean zBooleanValue3 = ((Boolean) map9.get("force_indications")).booleanValue();
                            boolean zBooleanValue4 = ((Boolean) map9.get(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE)).booleanValue();
                            BluetoothGatt bluetoothGatt7 = this.f55380k.get(str28);
                            if (bluetoothGatt7 == null) {
                                result.error("setNotifyValue", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                C27298f c27298fM67629q4 = m67629q0(bluetoothGatt7, str29, str30, str31);
                                String str32 = c27298fM67629q4.f55403b;
                                if (str32 == null) {
                                    BluetoothGattCharacteristic bluetoothGattCharacteristic3 = c27298fM67629q4.f55402a;
                                    if (!bluetoothGatt7.setCharacteristicNotification(bluetoothGattCharacteristic3, zBooleanValue4)) {
                                        result.error("setNotifyValue", "gatt.setCharacteristicNotification(" + zBooleanValue4 + ") returned false", null);
                                    } else {
                                        BluetoothGattDescriptor bluetoothGattDescriptorM67622f2 = m67622f0("2902", bluetoothGattCharacteristic3.getDescriptors());
                                        if (bluetoothGattDescriptorM67622f2 != null) {
                                            if (zBooleanValue4) {
                                                boolean z14 = (bluetoothGattCharacteristic3.getProperties() & 16) > 0;
                                                boolean z15 = (bluetoothGattCharacteristic3.getProperties() & 32) > 0;
                                                if (!z15 && !z14) {
                                                    result.error("setNotifyValue", "neither NOTIFY nor INDICATE properties are supported by this BLE characteristic", null);
                                                } else if (zBooleanValue3 && !z15) {
                                                    result.error("setNotifyValue", "INDICATE not supported by this BLE characteristic", null);
                                                } else {
                                                    bArr = z15 ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : null;
                                                    if (z14) {
                                                        bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                                                    }
                                                    if (zBooleanValue3) {
                                                        bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                                                    }
                                                }
                                            } else {
                                                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                                            }
                                            if (str31 == null) {
                                                str31 = "";
                                            }
                                            this.f55386q.put(str28 + C33844oi.f71346o + str29 + C33844oi.f71346o + str30 + C33844oi.f71346o + "2902" + C33844oi.f71346o + str31, m67575X(bArr));
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                int iWriteDescriptor2 = bluetoothGatt7.writeDescriptor(bluetoothGattDescriptorM67622f2, bArr);
                                                if (iWriteDescriptor2 == 0) {
                                                    result.success(Boolean.TRUE);
                                                } else {
                                                    result.error("setNotifyValue", "gatt.writeDescriptor() returned " + iWriteDescriptor2 + " : " + m67569L(iWriteDescriptor2), null);
                                                }
                                            } else if (!bluetoothGattDescriptorM67622f2.setValue(bArr)) {
                                                result.error("setNotifyValue", "cccd.setValue() returned false", null);
                                            } else if (!bluetoothGatt7.writeDescriptor(bluetoothGattDescriptorM67622f2)) {
                                                result.error("setNotifyValue", "gatt.writeDescriptor() returned false", null);
                                            } else {
                                                result.success(Boolean.TRUE);
                                            }
                                        } else {
                                            String strM67633v0 = m67633v0(bluetoothGattCharacteristic3.getUuid());
                                            m67630r0(LogLevel.WARNING, "CCCD descriptor for characteristic not found: " + strM67633v0);
                                            result.success(Boolean.FALSE);
                                        }
                                    }
                                } else {
                                    result.error("setNotifyValue", str32, null);
                                }
                                break;
                            }
                            break;
                        case "requestMtu":
                            HashMap map10 = (HashMap) methodCall.arguments();
                            String str33 = (String) map10.get("remote_id");
                            int iIntValue4 = ((Integer) map10.get("mtu")).intValue();
                            BluetoothGatt bluetoothGatt8 = this.f55380k.get(str33);
                            if (bluetoothGatt8 == null) {
                                result.error("requestMtu", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                if (!bluetoothGatt8.requestMtu(iIntValue4)) {
                                    result.error("requestMtu", "gatt.requestMtu() returned false", null);
                                } else {
                                    result.success(Boolean.TRUE);
                                }
                                break;
                            }
                            break;
                        case "readRssi":
                            BluetoothGatt bluetoothGatt9 = this.f55380k.get((String) methodCall.arguments);
                            if (bluetoothGatt9 == null) {
                                result.error("readRssi", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                if (!bluetoothGatt9.readRemoteRssi()) {
                                    result.error("readRssi", "gatt.readRemoteRssi() returned false", null);
                                } else {
                                    result.success(Boolean.TRUE);
                                }
                                break;
                            }
                            break;
                        case "requestConnectionPriority":
                            HashMap map11 = (HashMap) methodCall.arguments();
                            String str34 = (String) map11.get("remote_id");
                            int iIntValue5 = ((Integer) map11.get("connection_priority")).intValue();
                            BluetoothGatt bluetoothGatt10 = this.f55380k.get(str34);
                            if (bluetoothGatt10 == null) {
                                result.error("requestConnectionPriority", "device is disconnected", null);
                                break;
                            } else {
                                m67634w0();
                                if (!bluetoothGatt10.requestConnectionPriority(m67572T(iIntValue5))) {
                                    result.error("requestConnectionPriority", "gatt.requestConnectionPriority() returned false", null);
                                } else {
                                    result.success(Boolean.TRUE);
                                }
                                break;
                            }
                            break;
                        case "getPhySupport":
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 < 26) {
                                result.error("getPhySupport", "Only supported on devices >= API 26. This device == " + i15, null);
                                break;
                            } else {
                                HashMap map12 = new HashMap();
                                map12.put("le_2M", Boolean.valueOf(this.f55375f.isLe2MPhySupported()));
                                map12.put("le_coded", Boolean.valueOf(this.f55375f.isLeCodedPhySupported()));
                                result.success(map12);
                                break;
                            }
                            break;
                        case "setPreferredPhy":
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 < 26) {
                                result.error("setPreferredPhy", "Only supported on devices >= API 26. This device == " + i16, null);
                                break;
                            } else {
                                HashMap map13 = (HashMap) methodCall.arguments();
                                String str35 = (String) map13.get("remote_id");
                                int iIntValue6 = ((Integer) map13.get("tx_phy")).intValue();
                                int iIntValue7 = ((Integer) map13.get("rx_phy")).intValue();
                                int iIntValue8 = ((Integer) map13.get("phy_options")).intValue();
                                BluetoothGatt bluetoothGatt11 = this.f55380k.get(str35);
                                if (bluetoothGatt11 != null) {
                                    m67634w0();
                                    bluetoothGatt11.setPreferredPhy(iIntValue6, iIntValue7, iIntValue8);
                                    result.success(Boolean.TRUE);
                                } else {
                                    result.error("setPreferredPhy", "device is disconnected", null);
                                }
                                break;
                            }
                            break;
                        case "getBondedDevices":
                            Set<BluetoothDevice> bondedDevices = this.f55375f.getBondedDevices();
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<BluetoothDevice> it = bondedDevices.iterator();
                            while (it.hasNext()) {
                                arrayList6.add(m67613P(it.next()));
                            }
                            HashMap map14 = new HashMap();
                            map14.put("devices", arrayList6);
                            result.success(map14);
                            break;
                        case "getBondState":
                            String str36 = (String) methodCall.arguments;
                            BluetoothDevice remoteDevice = this.f55375f.getRemoteDevice(str36);
                            HashMap map15 = new HashMap();
                            map15.put("remote_id", str36);
                            map15.put("bond_state", Integer.valueOf(m67571R(remoteDevice.getBondState())));
                            map15.put("prev_state", null);
                            result.success(map15);
                            break;
                        case "createBond":
                            String str37 = (String) methodCall.arguments;
                            if (this.f55380k.get(str37) == null) {
                                result.error("createBond", "device is disconnected", null);
                                break;
                            } else {
                                BluetoothDevice remoteDevice2 = this.f55375f.getRemoteDevice(str37);
                                if (remoteDevice2.getBondState() == 12) {
                                    m67630r0(LogLevel.WARNING, "already bonded");
                                    result.success(Boolean.FALSE);
                                } else if (remoteDevice2.getBondState() == 11) {
                                    m67630r0(LogLevel.WARNING, "bonding already in progress");
                                    result.success(Boolean.TRUE);
                                } else if (!remoteDevice2.createBond()) {
                                    result.error("createBond", "device.createBond() returned false", null);
                                } else {
                                    result.success(Boolean.TRUE);
                                }
                                break;
                            }
                            break;
                        case "removeBond":
                            BluetoothDevice remoteDevice3 = this.f55375f.getRemoteDevice((String) methodCall.arguments);
                            if (remoteDevice3.getBondState() == 10) {
                                m67630r0(LogLevel.WARNING, "already not bonded");
                                result.success(Boolean.FALSE);
                                break;
                            } else {
                                if (!((Boolean) remoteDevice3.getClass().getMethod("removeBond", new Class[0]).invoke(remoteDevice3, new Object[0])).booleanValue()) {
                                    result.error("removeBond", "device.removeBond() returned false", null);
                                } else {
                                    result.success(Boolean.TRUE);
                                }
                                break;
                            }
                            break;
                        case "clearGattCache":
                            BluetoothGatt bluetoothGatt12 = this.f55380k.get((String) methodCall.arguments);
                            if (bluetoothGatt12 == null) {
                                result.error("clearGattCache", "device is disconnected", null);
                                break;
                            } else {
                                Method method = bluetoothGatt12.getClass().getMethod("refresh", new Class[0]);
                                if (method != null) {
                                    method.invoke(bluetoothGatt12, new Object[0]);
                                    result.success(Boolean.TRUE);
                                } else {
                                    result.error("clearGattCache", "unsupported on this android version", null);
                                }
                                break;
                            }
                            break;
                        case "openAppSettings":
                            C27300a c27300a = this.f55393x;
                            Context context = this.f55372c;
                            Objects.requireNonNull(result);
                            c27300a.m67639a(context, new C27300a.b() { // from class: e90.l
                                @Override // com.lib.flutter_blue_plus.C27300a.b
                                /* JADX INFO: renamed from: a */
                                public final void mo67641a(boolean z16) {
                                    result.success(Boolean.valueOf(z16));
                                }
                            }, new C27300a.a() { // from class: e90.m
                                @Override // com.lib.flutter_blue_plus.C27300a.a
                                /* JADX INFO: renamed from: a */
                                public final void mo67640a(String str38, String str39) {
                                    result.error(str38, str39, null);
                                }
                            });
                            break;
                        default:
                            result.notImplemented();
                            break;
                    }
                    return;
                }
                result.error("bluetoothUnavailable", "the device does not support bluetooth", null);
            } catch (Exception e11) {
                StringWriter stringWriter = new StringWriter();
                e11.printStackTrace(new PrintWriter(stringWriter));
                result.error("androidException", e11.toString(), stringWriter.toString());
            }
        } finally {
            this.f55379j.release();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m67628p0() {
        try {
            return this.f55375f.getState() == 12;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.FlutterBluePlusPlugin$e */
    public static /* synthetic */ class C27297e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55401a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f55401a = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55401a[LogLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55401a[LogLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m67569L(int i11) {
        if (i11 == 0) {
            return AppConstants.AB_TEST_SUCCESS;
        }
        if (i11 == 1) {
            return "ERROR_BLUETOOTH_NOT_ENABLED";
        }
        if (i11 == 2) {
            return "ERROR_BLUETOOTH_NOT_ALLOWED";
        }
        if (i11 == 3) {
            return "ERROR_DEVICE_NOT_BONDED";
        }
        if (i11 == 6) {
            return "ERROR_MISSING_BLUETOOTH_CONNECT_PERMISSION";
        }
        if (i11 == Integer.MAX_VALUE) {
            return "ERROR_UNKNOWN";
        }
        if (i11 == 200) {
            return "ERROR_GATT_WRITE_NOT_ALLOWED";
        }
        if (i11 == 201) {
            return "ERROR_GATT_WRITE_REQUEST_BUSY";
        }
        switch (i11) {
            case 9:
                return "ERROR_PROFILE_SERVICE_NOT_BOUND";
            case 10:
                return "FEATURE_SUPPORTED";
            case 11:
                return "FEATURE_NOT_SUPPORTED";
            default:
                return "UNKNOWN_BLE_ERROR (" + i11 + ")";
        }
    }

    /* JADX INFO: renamed from: R */
    public static int m67571R(int i11) {
        if (i11 != 11) {
            return i11 != 12 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: T */
    public static int m67572T(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: X */
    public static String m67575X(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(Character.forDigit((b11 >> 4) & 15, 16));
            sb2.append(Character.forDigit(b11 & 15, 16));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: Y */
    public static String m67576Y(int i11) {
        if (i11 == 0) {
            return "disconnected";
        }
        if (i11 == 1) {
            return "connecting";
        }
        if (i11 == 2) {
            return "connected";
        }
        if (i11 == 3) {
            return "disconnecting";
        }
        return "UNKNOWN_CONNECTION_STATE (" + i11 + ")";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m67577a(FlutterBluePlusPlugin flutterBluePlusPlugin, MethodChannel.Result result, boolean z11, String str) {
        if (!z11) {
            flutterBluePlusPlugin.getClass();
            result.error(m67587i0(str), String.format("FlutterBluePlus requires %s permission", str), null);
        } else if (flutterBluePlusPlugin.f55375f.isEnabled()) {
            result.success(Boolean.valueOf(flutterBluePlusPlugin.f55375f.disable()));
        } else {
            result.success(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67578b(FlutterBluePlusPlugin flutterBluePlusPlugin, MethodChannel.Result result, boolean z11, String str) {
        if (!z11) {
            flutterBluePlusPlugin.getClass();
            result.error(m67587i0(str), String.format("FlutterBluePlus requires %s permission", str), null);
        } else {
            if (flutterBluePlusPlugin.f55375f.isEnabled()) {
                result.success(Boolean.FALSE);
                return;
            }
            flutterBluePlusPlugin.f55378i.getActivity().startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1879842617);
            result.success(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m67579c(FlutterBluePlusPlugin flutterBluePlusPlugin, String str, HashMap map) {
        MethodChannel methodChannel = flutterBluePlusPlugin.f55373d;
        if (methodChannel != null) {
            methodChannel.invokeMethod(str, map);
            return;
        }
        flutterBluePlusPlugin.m67630r0(LogLevel.WARNING, "invokeMethodUIThread: tried to call method on closed channel: " + str);
    }

    /* JADX INFO: renamed from: c0 */
    public static String m67580c0(int i11) {
        if (i11 == 257) {
            return "GATT_FAILURE";
        }
        switch (i11) {
            case 0:
                return "GATT_SUCCESS";
            case 1:
                return "GATT_INVALID_HANDLE";
            case 2:
                return "GATT_READ_NOT_PERMITTED";
            case 3:
                return "GATT_WRITE_NOT_PERMITTED";
            case 4:
                return "GATT_INVALID_PDU";
            case 5:
                return "GATT_INSUFFICIENT_AUTHENTICATION";
            case 6:
                return "GATT_REQUEST_NOT_SUPPORTED";
            case 7:
                return "GATT_INVALID_OFFSET";
            case 8:
                return "GATT_INSUFFICIENT_AUTHORIZATION";
            case 9:
                return "GATT_PREPARE_QUEUE_FULL";
            case 10:
                return "GATT_ATTR_NOT_FOUND";
            case 11:
                return "GATT_ATTR_NOT_LONG";
            case 12:
                return "GATT_INSUFFICIENT_KEY_SIZE";
            case 13:
                return "GATT_INVALID_ATTRIBUTE_LENGTH";
            case 14:
                return "GATT_UNLIKELY";
            case 15:
                return "GATT_INSUFFICIENT_ENCRYPTION";
            case 16:
                return "GATT_UNSUPPORTED_GROUP";
            case 17:
                return "GATT_INSUFFICIENT_RESOURCES";
            default:
                switch (i11) {
                    case 128:
                        return "GATT_NO_RESOURCES";
                    case 129:
                        return "GATT_INTERNAL_ERROR";
                    case 130:
                        return "GATT_WRONG_STATE";
                    case 131:
                        return "GATT_DB_FULL";
                    case 132:
                        return "GATT_BUSY";
                    case 133:
                        return "GATT_ERROR";
                    case 134:
                        return "GATT_CMD_STARTED";
                    case 135:
                        return "GATT_ILLEGAL_PARAMETER";
                    case 136:
                        return "GATT_PENDING";
                    case 137:
                        return "GATT_AUTH_FAIL";
                    case 138:
                        return "GATT_MORE";
                    case 139:
                        return "GATT_INVALID_CFG";
                    case 140:
                        return "GATT_SERVICE_STARTED";
                    case 141:
                        return "GATT_ENCRYPTED_NO_MITM";
                    case 142:
                        return "GATT_NOT_ENCRYPTED";
                    case 143:
                        return "GATT_CONNECTION_CONGESTED";
                    default:
                        return "UNKNOWN_GATT_ERROR (" + i11 + ")";
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m67583f(FlutterBluePlusPlugin flutterBluePlusPlugin, MethodChannel.Result result, boolean z11, String str) {
        if (!z11) {
            flutterBluePlusPlugin.getClass();
            result.error(m67587i0(str), String.format("FlutterBluePlus requires %s permission", str), null);
            return;
        }
        List<BluetoothDevice> connectedDevices = flutterBluePlusPlugin.f55374e.getConnectedDevices(7);
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (it.hasNext()) {
            arrayList.add(flutterBluePlusPlugin.m67613P(it.next()));
        }
        HashMap map = new HashMap();
        map.put("devices", arrayList);
        result.success(map);
    }

    /* JADX INFO: renamed from: m0 */
    public static String m67593m0(int i11) {
        if (i11 == 133) {
            return "ANDROID_SPECIFIC_ERROR";
        }
        if (i11 == 257) {
            return "FAILURE_REGISTERING_CLIENT";
        }
        switch (i11) {
            case 0:
                return AppConstants.AB_TEST_SUCCESS;
            case 1:
                return "UNKNOWN_COMMAND";
            case 2:
                return "UNKNOWN_CONNECTION_IDENTIFIER";
            case 3:
                return "HARDWARE_FAILURE";
            case 4:
                return "PAGE_TIMEOUT";
            case 5:
                return "AUTHENTICATION_FAILURE";
            case 6:
                return "PIN_OR_KEY_MISSING";
            case 7:
                return "MEMORY_FULL";
            case 8:
                return "LINK_SUPERVISION_TIMEOUT";
            case 9:
                return "CONNECTION_LIMIT_EXCEEDED";
            case 10:
                return "MAX_NUM_OF_CONNECTIONS_EXCEEDED";
            case 11:
                return "CONNECTION_ALREADY_EXISTS";
            case 12:
                return "COMMAND_DISALLOWED";
            case 13:
                return "CONNECTION_REJECTED_LIMITED_RESOURCES";
            case 14:
                return "CONNECTION_REJECTED_SECURITY_REASONS";
            case 15:
                return "CONNECTION_REJECTED_UNACCEPTABLE_MAC_ADDRESS";
            case 16:
                return "CONNECTION_ACCEPT_TIMEOUT_EXCEEDED";
            case 17:
                return "UNSUPPORTED_PARAMETER_VALUE";
            case 18:
                return "INVALID_COMMAND_PARAMETERS";
            case 19:
                return "REMOTE_USER_TERMINATED_CONNECTION";
            case 20:
                return "REMOTE_DEVICE_TERMINATED_CONNECTION_LOW_RESOURCES";
            case 21:
                return "REMOTE_DEVICE_TERMINATED_CONNECTION_POWER_OFF";
            case 22:
                return "CONNECTION_TERMINATED_BY_LOCAL_HOST";
            case 23:
                return "REPEATED_ATTEMPTS";
            case 24:
                return "PAIRING_NOT_ALLOWED";
            case 25:
                return "UNKNOWN_LMP_PDU";
            case 26:
                return "UNSUPPORTED_REMOTE_FEATURE";
            case 27:
                return "SCO_OFFSET_REJECTED";
            case 28:
                return "SCO_INTERVAL_REJECTED";
            case 29:
                return "SCO_AIR_MODE_REJECTED";
            case 30:
                return "INVALID_LMP_OR_LL_PARAMETERS";
            case 31:
                return "UNSPECIFIED";
            case 32:
                return "UNSUPPORTED_LMP_OR_LL_PARAMETER_VALUE";
            case 33:
                return "ROLE_CHANGE_NOT_ALLOWED";
            case 34:
                return "LMP_OR_LL_RESPONSE_TIMEOUT";
            case 35:
                return "LMP_OR_LL_ERROR_TRANS_COLLISION";
            case 36:
                return "LMP_PDU_NOT_ALLOWED";
            case 37:
                return "ENCRYPTION_MODE_NOT_ACCEPTABLE";
            case 38:
                return "LINK_KEY_CANNOT_BE_EXCHANGED";
            case 39:
                return "REQUESTED_QOS_NOT_SUPPORTED";
            case 40:
                return "INSTANT_PASSED";
            case 41:
                return "PAIRING_WITH_UNIT_KEY_NOT_SUPPORTED";
            case 42:
                return "DIFFERENT_TRANSACTION_COLLISION";
            case 43:
                return "UNDEFINED_0x2B";
            case 44:
                return "QOS_UNACCEPTABLE_PARAMETER";
            case 45:
                return "QOS_REJECTED";
            case 46:
                return "CHANNEL_CLASSIFICATION_NOT_SUPPORTED";
            case 47:
                return "INSUFFICIENT_SECURITY";
            case 48:
                return "PARAMETER_OUT_OF_RANGE";
            case 49:
                return "UNDEFINED_0x31";
            case 50:
                return "ROLE_SWITCH_PENDING";
            case 51:
                return "UNDEFINED_0x33";
            case 52:
                return "RESERVED_SLOT_VIOLATION";
            case 53:
                return "ROLE_SWITCH_FAILED";
            case 54:
                return "INQUIRY_RESPONSE_TOO_LARGE";
            case 55:
                return "SECURE_SIMPLE_PAIRING_NOT_SUPPORTED";
            case 56:
                return "HOST_BUSY_PAIRING";
            case 57:
                return "CONNECTION_REJECTED_NO_SUITABLE_CHANNEL";
            case 58:
                return "CONTROLLER_BUSY";
            case 59:
                return "UNACCEPTABLE_CONNECTION_PARAMETERS";
            case 60:
                return "ADVERTISING_TIMEOUT";
            case 61:
                return "CONNECTION_TERMINATED_MIC_FAILURE";
            case 62:
                return "CONNECTION_FAILED_ESTABLISHMENT";
            case 63:
                return "MAC_CONNECTION_FAILED";
            case 64:
                return "COARSE_CLOCK_ADJUSTMENT_REJECTED";
            case 65:
                return "TYPE0_SUBMAP_NOT_DEFINED";
            case 66:
                return "UNKNOWN_ADVERTISING_IDENTIFIER";
            case 67:
                return "LIMIT_REACHED";
            case 68:
                return "OPERATION_CANCELLED_BY_HOST";
            case 69:
                return "PACKET_TOO_LONG";
            default:
                return "UNKNOWN_HCI_ERROR (" + i11 + ")";
        }
    }

    /* JADX INFO: renamed from: N */
    public HashMap<String, Object> m67611N(BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGatt bluetoothGatt) {
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it.hasNext()) {
            arrayList.add(m67612O(bluetoothDevice, it.next(), bluetoothGatt));
        }
        BluetoothGattService bluetoothGattServiceM67589j0 = m67589j0(bluetoothGatt, bluetoothGattCharacteristic);
        HashMap<String, Object> map = new HashMap<>();
        map.put("remote_id", bluetoothDevice.getAddress());
        map.put("service_uuid", m67633v0(bluetoothGattCharacteristic.getService().getUuid()));
        map.put("characteristic_uuid", m67633v0(bluetoothGattCharacteristic.getUuid()));
        map.put("descriptors", arrayList);
        map.put("properties", m67615S(bluetoothGattCharacteristic.getProperties()));
        if (bluetoothGattServiceM67589j0 != null) {
            map.put("primary_service_uuid", m67633v0(bluetoothGattServiceM67589j0.getUuid()));
        }
        return map;
    }

    /* JADX INFO: renamed from: P */
    public HashMap<String, Object> m67613P(BluetoothDevice bluetoothDevice) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("remote_id", bluetoothDevice.getAddress());
        map.put("platform_name", bluetoothDevice.getName());
        return map;
    }

    /* JADX INFO: renamed from: Q */
    public HashMap<String, Object> m67614Q(BluetoothDevice bluetoothDevice, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, BluetoothGatt bluetoothGatt) {
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothGattCharacteristic> it = bluetoothGattService.getCharacteristics().iterator();
        while (it.hasNext()) {
            arrayList.add(m67611N(bluetoothDevice, it.next(), bluetoothGatt));
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("remote_id", bluetoothDevice.getAddress());
        map.put("service_uuid", m67633v0(bluetoothGattService.getUuid()));
        map.put("characteristics", arrayList);
        if (bluetoothGattService2 != null) {
            map.put("primary_service_uuid", m67633v0(bluetoothGattService2.getUuid()));
        }
        return map;
    }

    /* JADX INFO: renamed from: S */
    public HashMap<String, Object> m67615S(int i11) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("broadcast", Integer.valueOf((i11 & 1) != 0 ? 1 : 0));
        map.put("read", Integer.valueOf((i11 & 2) != 0 ? 1 : 0));
        map.put("write_without_response", Integer.valueOf((i11 & 4) != 0 ? 1 : 0));
        map.put("write", Integer.valueOf((i11 & 8) != 0 ? 1 : 0));
        map.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_ENABLE_NOTIFICATION, Integer.valueOf((i11 & 16) != 0 ? 1 : 0));
        map.put("indicate", Integer.valueOf((i11 & 32) != 0 ? 1 : 0));
        map.put("authenticated_signed_writes", Integer.valueOf((i11 & 64) != 0 ? 1 : 0));
        map.put("extended_properties", Integer.valueOf((i11 & 128) != 0 ? 1 : 0));
        map.put("notify_encryption_required", Integer.valueOf((i11 & 256) != 0 ? 1 : 0));
        map.put("indicate_encryption_required", Integer.valueOf((i11 & 512) != 0 ? 1 : 0));
        return map;
    }

    /* JADX INFO: renamed from: V */
    public HashMap<String, Object> m67616V(BluetoothDevice bluetoothDevice, ScanResult scanResult) {
        ScanRecord scanRecord = scanResult.getScanRecord();
        boolean zIsConnectable = Build.VERSION.SDK_INT >= 26 ? scanResult.isConnectable() : true;
        String deviceName = scanRecord != null ? scanRecord.getDeviceName() : null;
        int txPowerLevel = scanRecord != null ? scanRecord.getTxPowerLevel() : Integer.MIN_VALUE;
        int iM67620d0 = scanRecord != null ? m67620d0(scanRecord) : 0;
        Map<Integer, byte[]> mapM67623g0 = scanRecord != null ? m67623g0(scanRecord) : null;
        List<ParcelUuid> serviceUuids = scanRecord != null ? scanRecord.getServiceUuids() : null;
        Map<ParcelUuid, byte[]> serviceData = scanRecord != null ? scanRecord.getServiceData() : null;
        HashMap map = new HashMap();
        if (mapM67623g0 != null) {
            for (Map.Entry<Integer, byte[]> entry : mapM67623g0.entrySet()) {
                map.put(entry.getKey(), m67575X(entry.getValue()));
            }
        }
        HashMap map2 = new HashMap();
        if (serviceData != null) {
            for (Map.Entry<ParcelUuid, byte[]> entry2 : serviceData.entrySet()) {
                map2.put(m67633v0(entry2.getKey().getUuid()), m67575X(entry2.getValue()));
            }
        }
        ArrayList arrayList = new ArrayList();
        if (serviceUuids != null) {
            Iterator<ParcelUuid> it = serviceUuids.iterator();
            while (it.hasNext()) {
                arrayList.add(m67633v0(it.next().getUuid()));
            }
        }
        HashMap<String, Object> map3 = new HashMap<>();
        if (bluetoothDevice.getAddress() != null) {
            map3.put("remote_id", bluetoothDevice.getAddress());
        }
        if (bluetoothDevice.getName() != null) {
            map3.put("platform_name", bluetoothDevice.getName());
        }
        if (zIsConnectable) {
            map3.put("connectable", 1);
        }
        if (deviceName != null) {
            map3.put("adv_name", deviceName);
        }
        if (txPowerLevel != Integer.MIN_VALUE) {
            map3.put("tx_power_level", Integer.valueOf(txPowerLevel));
        }
        if (iM67620d0 != 0) {
            map3.put("appearance", Integer.valueOf(iM67620d0));
        }
        if (mapM67623g0 != null) {
            map3.put("manufacturer_data", map);
        }
        if (serviceData != null) {
            map3.put("service_data", map2);
        }
        if (serviceUuids != null) {
            map3.put("service_uuids", arrayList);
        }
        if (scanResult.getRssi() != 0) {
            map3.put("rssi", Integer.valueOf(scanResult.getRssi()));
        }
        return map3;
    }

    /* JADX INFO: renamed from: Z */
    public final void m67617Z(String str) {
        m67630r0(LogLevel.DEBUG, "disconnectAllDevices(" + str + ")");
        for (BluetoothGatt bluetoothGatt : this.f55380k.values()) {
            if (str == "adapterTurnOff") {
                this.f55370B.onConnectionStateChange(bluetoothGatt, 0, 0);
            } else {
                String address = bluetoothGatt.getDevice().getAddress();
                LogLevel logLevel = LogLevel.DEBUG;
                m67630r0(logLevel, "calling disconnect: " + address);
                bluetoothGatt.disconnect();
                m67630r0(logLevel, "calling close: " + address);
                bluetoothGatt.close();
            }
        }
        this.f55380k.clear();
        this.f55381l.clear();
        this.f55382m.clear();
        this.f55383n.clear();
        this.f55385p.clear();
        this.f55386q.clear();
        this.f55384o.clear();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m67618a0(List<String> list, InterfaceC27299g interfaceC27299g) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && ContextCompat.checkSelfPermission(this.f55372c, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            interfaceC27299g.mo67638a(true, null);
        } else {
            m67610K(arrayList, interfaceC27299g);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public int m67620d0(ScanRecord scanRecord) {
        int i11;
        int i12;
        if (Build.VERSION.SDK_INT >= 33) {
            Map advertisingDataMap = scanRecord.getAdvertisingDataMap();
            if (advertisingDataMap.containsKey(25)) {
                byte[] bArr = (byte[]) advertisingDataMap.get(25);
                if (bArr.length == 2) {
                    return ((bArr[1] & 255) * 256) + (bArr[0] & 255);
                }
            }
            return 0;
        }
        byte[] bytes = scanRecord.getBytes();
        int i13 = 0;
        while (i13 < bytes.length && (i11 = bytes[i13] & 255) > 0 && i13 + i11 < bytes.length && (i12 = bytes[i13 + 1] & 255) != 0) {
            if (i12 == 25 && i11 == 3) {
                return (bytes[i13 + 2] & 255) | ((bytes[i13 + 3] & 255) << 8);
            }
            i13 += i11 + 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k0 */
    public final ScanCallback m67625k0() {
        if (this.f55369A == null) {
            this.f55369A = new C27295c();
        }
        return this.f55369A;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m67627o0(final String str, final HashMap<String, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e90.r
            @Override // java.lang.Runnable
            public final void run() {
                FlutterBluePlusPlugin.m67579c(this.f82397b, str, map);
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        m67630r0(LogLevel.DEBUG, "onAttachedToActivity");
        this.f55378i = activityPluginBinding;
        activityPluginBinding.addRequestPermissionsResultListener(this);
        this.f55378i.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m67630r0(LogLevel.DEBUG, "onAttachedToEngine");
        this.f55377h = flutterPluginBinding;
        this.f55372c = (Application) flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_blue_plus/methods");
        this.f55373d = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f55372c.registerReceiver(this.f55394y, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f55372c.registerReceiver(this.f55395z, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m67630r0(LogLevel.DEBUG, "onDetachedFromActivity");
        this.f55378i.removeRequestPermissionsResultListener(this);
        this.f55378i = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        m67630r0(LogLevel.DEBUG, "onDetachedFromActivityForConfigChanges");
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BluetoothLeScanner bluetoothLeScanner;
        LogLevel logLevel = LogLevel.DEBUG;
        m67630r0(logLevel, "onDetachedFromEngine");
        m67627o0("OnDetachedFromEngine", new HashMap<>());
        this.f55377h = null;
        BluetoothAdapter bluetoothAdapter = this.f55375f;
        if (bluetoothAdapter != null && this.f55376g && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
            m67630r0(logLevel, "calling stopScan (OnDetachedFromEngine)");
            bluetoothLeScanner.stopScan(m67625k0());
            this.f55376g = false;
        }
        m67617Z("onDetachedFromEngine");
        this.f55372c.unregisterReceiver(this.f55395z);
        this.f55372c.unregisterReceiver(this.f55394y);
        this.f55372c = null;
        this.f55373d.setMethodCallHandler(null);
        this.f55373d = null;
        this.f55375f = null;
        this.f55374e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        m67630r0(LogLevel.DEBUG, "onReattachedToActivityForConfigChanges");
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        InterfaceC27299g interfaceC27299g = this.f55390u.get(Integer.valueOf(i11));
        this.f55390u.remove(Integer.valueOf(i11));
        if (interfaceC27299g == null || iArr.length <= 0) {
            return false;
        }
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] != 0) {
                interfaceC27299g.mo67638a(false, strArr[i12]);
                return true;
            }
        }
        interfaceC27299g.mo67638a(true, null);
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final C27298f m67629q0(BluetoothGatt bluetoothGatt, String str, String str2, String str3) {
        BluetoothGattService bluetoothGattServiceM67626l0;
        boolean z11 = str3 != null;
        if (str3 == null) {
            str3 = str;
        }
        BluetoothGattService bluetoothGattServiceM67626l1 = m67626l0(str3, bluetoothGatt.getServices());
        if (bluetoothGattServiceM67626l1 == null) {
            return new C27298f(null, "primary service not found '" + str3 + "'");
        }
        if (z11) {
            bluetoothGattServiceM67626l0 = m67626l0(str, bluetoothGattServiceM67626l1.getIncludedServices());
            if (bluetoothGattServiceM67626l0 == null) {
                return new C27298f(null, "secondary service not found '" + str + "' (primary service '" + str3 + "')");
            }
        } else {
            bluetoothGattServiceM67626l0 = null;
        }
        if (bluetoothGattServiceM67626l0 != null) {
            bluetoothGattServiceM67626l1 = bluetoothGattServiceM67626l0;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM67621e0 = m67621e0(str2, bluetoothGattServiceM67626l1.getCharacteristics());
        if (bluetoothGattCharacteristicM67621e0 != null) {
            return new C27298f(bluetoothGattCharacteristicM67621e0, null);
        }
        return new C27298f(null, "characteristic not found in service (chr: '" + str2 + "' svc: '" + str + "')");
    }

    /* JADX INFO: renamed from: s0 */
    public final int m67631s0(String str) {
        if (this.f55388s.get(str) == null) {
            this.f55388s.put(str, 0);
        }
        int iIntValue = this.f55388s.get(str).intValue();
        this.f55388s.put(str, Integer.valueOf(iIntValue + 1));
        return iIntValue;
    }

    /* JADX INFO: renamed from: u0 */
    public String m67632u0(Object obj) {
        if (!(obj instanceof UUID) && !(obj instanceof String)) {
            throw new IllegalArgumentException("input must be UUID or String");
        }
        String string = obj.toString();
        if (string.length() == 4) {
            return String.format("0000%s-0000-1000-8000-00805f9b34fb", string).toLowerCase();
        }
        return string.length() == 8 ? String.format("%s-0000-1000-8000-00805f9b34fb", string).toLowerCase() : string.toLowerCase();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m67634w0() {
        if (this.f55382m.isEmpty()) {
            return;
        }
        m67630r0(LogLevel.DEBUG, "[FBP] waiting for bonding to complete...");
        try {
            Thread.sleep(50L);
        } catch (Exception unused) {
        }
        m67630r0(LogLevel.DEBUG, "[FBP] bonding completed");
    }

    /* JADX INFO: renamed from: J */
    public static String m67568J(int i11) {
        switch (i11) {
            case 10:
                return "off";
            case 11:
                return "turningOn";
            case 12:
                return ViewProps.ON;
            case 13:
                return "turningOff";
            default:
                return "UNKNOWN_ADAPTER_STATE (" + i11 + ")";
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m67570M(int i11) {
        switch (i11) {
            case 10:
                return 6;
            case 11:
                return 3;
            case 12:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: W */
    public static String m67574W(int i11) {
        switch (i11) {
            case 10:
                return "bond-none";
            case 11:
                return "bonding";
            case 12:
                return "bonded";
            default:
                return "UNKNOWN_BOND_STATE (" + i11 + ")";
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static String m67587i0(String str) {
        str.getClass();
        switch (str) {
            case "android.permission.ACCESS_FINE_LOCATION":
                return "-2000";
            case "android.permission.BLUETOOTH_CONNECT":
                return "-1001";
            case "android.permission.BLUETOOTH":
                return "-1000";
            case "android.permission.BLUETOOTH_SCAN":
                return "-1002";
            default:
                return OtcAd.KYC_NOT_PASS;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static BluetoothGattService m67589j0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattService service = bluetoothGattCharacteristic.getService();
        if (service.getType() == 0) {
            return null;
        }
        for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            Iterator<BluetoothGattService> it = bluetoothGattService.getIncludedServices().iterator();
            while (it.hasNext()) {
                if (it.next().getUuid().equals(service.getUuid())) {
                    return bluetoothGattService;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public static String m67602t0(int i11) {
        switch (i11) {
            case 1:
                return "SCAN_FAILED_ALREADY_STARTED";
            case 2:
                return "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
            case 3:
                return "SCAN_FAILED_INTERNAL_ERROR";
            case 4:
                return "SCAN_FAILED_FEATURE_UNSUPPORTED";
            case 5:
                return "SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES";
            case 6:
                return "SCAN_FAILED_SCANNING_TOO_FREQUENTLY";
            default:
                return "UNKNOWN_SCAN_ERROR (" + i11 + ")";
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m67610K(List<String> list, InterfaceC27299g interfaceC27299g) {
        if (list.isEmpty()) {
            interfaceC27299g.mo67638a(true, null);
            return;
        }
        this.f55390u.put(Integer.valueOf(this.f55391v), interfaceC27299g);
        ActivityCompat.requestPermissions(this.f55378i.getActivity(), (String[]) list.toArray(new String[0]), this.f55391v);
        this.f55391v++;
    }

    /* JADX INFO: renamed from: O */
    public HashMap<String, Object> m67612O(BluetoothDevice bluetoothDevice, BluetoothGattDescriptor bluetoothGattDescriptor, BluetoothGatt bluetoothGatt) {
        BluetoothGattService bluetoothGattServiceM67589j0 = m67589j0(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
        HashMap<String, Object> map = new HashMap<>();
        map.put("remote_id", bluetoothDevice.getAddress());
        map.put("descriptor_uuid", m67633v0(bluetoothGattDescriptor.getUuid()));
        map.put("characteristic_uuid", m67633v0(bluetoothGattDescriptor.getCharacteristic().getUuid()));
        map.put("service_uuid", m67633v0(bluetoothGattDescriptor.getCharacteristic().getService().getUuid()));
        if (bluetoothGattServiceM67589j0 != null) {
            map.put("primary_service_uuid", m67633v0(bluetoothGattServiceM67589j0.getUuid()));
        }
        return map;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m67619b0(List<String> list, String str) {
        if (list.isEmpty()) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final BluetoothGattCharacteristic m67621e0(String str, List<BluetoothGattCharacteristic> list) {
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : list) {
            if (m67632u0(bluetoothGattCharacteristic.getUuid()).equals(m67632u0(str))) {
                return bluetoothGattCharacteristic;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public final BluetoothGattDescriptor m67622f0(String str, List<BluetoothGattDescriptor> list) {
        for (BluetoothGattDescriptor bluetoothGattDescriptor : list) {
            if (m67632u0(bluetoothGattDescriptor.getUuid()).equals(m67632u0(str))) {
                return bluetoothGattDescriptor;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public Map<Integer, byte[]> m67623g0(ScanRecord scanRecord) {
        int i11;
        byte[] bytes = scanRecord.getBytes();
        HashMap map = new HashMap();
        int i12 = 0;
        while (i12 < bytes.length && (i11 = bytes[i12] & 255) > 0 && i12 + i11 < bytes.length) {
            if ((bytes[i12 + 1] & 255) == 255 && i11 >= 3) {
                int i13 = (255 & bytes[i12 + 2]) | ((bytes[i12 + 3] & 255) << 8);
                int i14 = i11 - 3;
                int i15 = i12 + 4;
                if (map.containsKey(Integer.valueOf(i13))) {
                    byte[] bArr = (byte[]) map.get(Integer.valueOf(i13));
                    byte[] bArr2 = new byte[bArr.length + i14];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    System.arraycopy(bytes, i15, bArr2, bArr.length, i14);
                    map.put(Integer.valueOf(i13), bArr2);
                } else {
                    byte[] bArr3 = new byte[i14];
                    System.arraycopy(bytes, i15, bArr3, 0, i14);
                    map.put(Integer.valueOf(i13), bArr3);
                }
            }
            i12 += i11 + 1;
        }
        return map;
    }

    /* JADX INFO: renamed from: l0 */
    public final BluetoothGattService m67626l0(String str, List<BluetoothGattService> list) {
        for (BluetoothGattService bluetoothGattService : list) {
            if (m67632u0(bluetoothGattService.getUuid()).equals(m67632u0(str))) {
                return bluetoothGattService;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i11, int i12, Intent intent) {
        boolean z11 = false;
        if (i11 != 1879842617) {
            return false;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (i12 == -1) {
            z11 = true;
        }
        map.put("user_accepted", Boolean.valueOf(z11));
        m67627o0("OnTurnOnResponse", map);
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m67630r0(LogLevel logLevel, String str) {
        if (logLevel.ordinal() > this.f55371b.ordinal()) {
            return;
        }
        int i11 = C27297e.f55401a[logLevel.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    Log.d("[FBP-Android]", "[FBP] " + str);
                    return;
                }
                Log.e("[FBP-Android]", "[FBP] " + str);
                return;
            }
            Log.w("[FBP-Android]", "[FBP] " + str);
            return;
        }
        Log.d("[FBP-Android]", "[FBP] " + str);
    }

    /* JADX INFO: renamed from: v0 */
    public String m67633v0(Object obj) {
        String strM67632u0 = m67632u0(obj);
        boolean zStartsWith = strM67632u0.startsWith("0000");
        boolean zEndsWith = strM67632u0.endsWith("-0000-1000-8000-00805f9b34fb");
        if (zStartsWith && zEndsWith) {
            return strM67632u0.substring(4, 8);
        }
        if (zEndsWith) {
            return strM67632u0.substring(0, 8);
        }
        return strM67632u0;
    }
}
