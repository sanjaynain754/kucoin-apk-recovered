package com.tencent.liteav.audio2.route;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.route.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34685b implements BluetoothProfile.ServiceListener {

    /* JADX INFO: renamed from: a */
    final BluetoothAdapter f73368a;

    /* JADX INFO: renamed from: b */
    BluetoothProfile f73369b = null;

    /* JADX INFO: renamed from: c */
    final Object f73370c = new Object();

    /* JADX INFO: renamed from: d */
    private final Context f73371d;

    /* JADX INFO: renamed from: e */
    private AudioManager f73372e;

    /* JADX INFO: renamed from: f */
    private boolean m76027f() {
        try {
            return ((Integer) BluetoothAdapter.class.getMethod("isLeAudioSupported", new Class[0]).invoke(this.f73368a, new Object[0])).intValue() == 10;
        } catch (Throwable th2) {
            Log.m76036w("BluetoothHeadsetListener", "get le audio supported failed. ".concat(String.valueOf(th2)), new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76028a() {
        boolean z11;
        List<BluetoothDevice> listM76025d;
        if (this.f73368a == null || !m76026e()) {
            return false;
        }
        synchronized (this.f73370c) {
            try {
                if (this.f73369b == null) {
                    try {
                        Log.m76034i("BluetoothHeadsetListener", "mBluetoothHeadsetProfile is null ,wait for 1000ms", new Object[0]);
                        this.f73370c.wait(1000L);
                    } catch (Throwable th2) {
                        Log.m76036w("BluetoothHeadsetListener", "Wait exception " + th2.getMessage(), new Object[0]);
                    }
                    if (this.f73369b == null) {
                        Log.m76034i("BluetoothHeadsetListener", "mBluetoothHeadsetProfile is still null", new Object[0]);
                    } else {
                        Log.m76034i("BluetoothHeadsetListener", "mBluetoothHeadsetProfile service is connected now", new Object[0]);
                    }
                }
                try {
                    z11 = true;
                    if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
                        if (!m76023a(this.f73371d) || (listM76025d = m76025d()) == null || listM76025d.size() <= 0) {
                            z11 = false;
                            break;
                        }
                    } else {
                        AudioDeviceInfo[] devices = this.f73372e.getDevices(2);
                        int length = devices.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                z11 = false;
                                break;
                            }
                            AudioDeviceInfo audioDeviceInfo = devices[i11];
                            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                                break;
                                break;
                                break;
                            }
                            i11++;
                        }
                    }
                } catch (Throwable th3) {
                    Log.m76033e("BluetoothHeadsetListener", "get connected bluetooth devices failed." + th3.getMessage(), new Object[0]);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        Log.m76034i("BluetoothHeadsetListener", "find bluetooth device " + z11 + ", le audio supported is " + m76027f(), new Object[0]);
        return z11;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i11, BluetoothProfile bluetoothProfile) {
        BluetoothProfile bluetoothProfile2;
        if (i11 != 1) {
            return;
        }
        synchronized (this.f73370c) {
            try {
                if (this.f73368a != null && (bluetoothProfile2 = this.f73369b) != null) {
                    Log.m76034i("BluetoothHeadsetListener", "Bluetooth Headset proxy changed from %s to %s", bluetoothProfile2, bluetoothProfile);
                    m76029b();
                }
                this.f73369b = bluetoothProfile;
                this.f73370c.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i11) {
        if (i11 != 1) {
            return;
        }
        synchronized (this.f73370c) {
            try {
                if (this.f73368a != null && this.f73369b != null) {
                    m76029b();
                    this.f73369b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private List<BluetoothDevice> m76025d() {
        try {
            return this.f73369b.getConnectedDevices();
        } catch (Throwable th2) {
            Log.m76036w("BluetoothHeadsetListener", "Get connected devices exception " + th2.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m76026e() {
        try {
            return this.f73368a.isEnabled();
        } catch (Throwable th2) {
            Log.m76036w("BluetoothHeadsetListener", "Get bluetooth adapter status exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76029b() {
        try {
            this.f73368a.closeProfileProxy(1, this.f73369b);
        } catch (Throwable th2) {
            Log.m76036w("BluetoothHeadsetListener", "Close profile proxy exception " + th2.getMessage(), new Object[0]);
        }
    }

    public C34685b(Context context) {
        this.f73371d = context;
        BluetoothAdapter bluetoothAdapterM76024c = m76024c();
        this.f73368a = bluetoothAdapterM76024c;
        if (bluetoothAdapterM76024c != null) {
            try {
                bluetoothAdapterM76024c.getProfileProxy(context, this, 1);
            } catch (Throwable th2) {
                Log.m76036w("BluetoothHeadsetListener", "Get profile proxy exception " + th2.getMessage(), new Object[0]);
            }
        } else {
            Log.m76034i("BluetoothHeadsetListener", "Bluetooth adapter is null", new Object[0]);
        }
        this.f73372e = (AudioManager) this.f73371d.getSystemService("audio");
    }

    /* JADX INFO: renamed from: c */
    private static BluetoothAdapter m76024c() {
        try {
            return BluetoothAdapter.getDefaultAdapter();
        } catch (Throwable th2) {
            Log.m76036w("BluetoothHeadsetListener", "Get default adapter exception " + th2.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76023a(Context context) {
        if (context != null && LiteavSystemInfo.getSystemOSVersionInt() >= 31) {
            try {
                return context.checkPermission("android.permission.BLUETOOTH_CONNECT", Process.myPid(), Process.myUid()) == 0;
            } catch (Throwable th2) {
                Log.m76036w("BluetoothHeadsetListener", "checkPermission exception " + th2.getMessage(), new Object[0]);
            }
        }
        return true;
    }
}
