package com.tencent.liteav.audio2.route;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.route.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34684a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final Context f73366a;

    /* JADX INFO: renamed from: b */
    private final a f73367b;

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.route.a$a */
    public interface a {
        void onBluetoothConnectionChanged(boolean z11);

        void onBluetoothScoConnected(boolean z11);

        void onSystemVolumeChanged();

        void onUsbConnectionChanged(String str, boolean z11);

        void onWiredHeadsetConnectionChanged(boolean z11);
    }

    /* JADX INFO: renamed from: a */
    private static String m76022a(int i11) {
        switch (i11) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "unknown";
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String productName;
        String str;
        if (intent == null || context == null) {
            Log.m76033e("AudioEventBroadcastReceiver", "Receive intent or context is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "android.hardware.usb.action.USB_DEVICE_ATTACHED":
            case "android.hardware.usb.action.USB_DEVICE_DETACHED":
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                if (usbDevice != null) {
                    if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                        productName = usbDevice.getProductName();
                        Log.m76034i("AudioEventBroadcastReceiver", "Usb device attached " + productName + " manufacture " + usbDevice.getManufacturerName(), new Object[0]);
                    } else {
                        productName = "";
                    }
                    if (!AudioDeviceProperty.isUsbHeadsetDevice(usbDevice)) {
                        Log.m76034i("AudioEventBroadcastReceiver", "The attached usb device doesn't seem to support audio, ignore it", new Object[0]);
                    } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
                        this.f73367b.onUsbConnectionChanged(productName, true);
                    } else if (!"android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction())) {
                        Log.m76034i("AudioEventBroadcastReceiver", "Unknown action, ignore it " + intent.getAction(), new Object[0]);
                    } else {
                        this.f73367b.onUsbConnectionChanged(productName, false);
                    }
                    break;
                }
                break;
            case "android.media.VOLUME_CHANGED_ACTION":
                a aVar = this.f73367b;
                if (aVar != null) {
                    aVar.onSystemVolumeChanged();
                    break;
                }
                break;
            case "android.intent.action.HEADSET_PLUG":
                int iM76021a = m76021a(intent, "state", -1);
                Log.m76034i("AudioEventBroadcastReceiver", "Receive ACTION_HEADSET_PLUG, EXTRA_STATE:".concat(String.valueOf(iM76021a)), new Object[0]);
                if (iM76021a == -1) {
                    Log.m76033e("AudioEventBroadcastReceiver", "Unknown headset state, ignore...", new Object[0]);
                    break;
                } else {
                    this.f73367b.onWiredHeadsetConnectionChanged(iM76021a != 0);
                    break;
                }
                break;
            case "android.bluetooth.adapter.action.STATE_CHANGED":
                int iM76021a2 = m76021a(intent, "android.bluetooth.adapter.extra.STATE", 0);
                Log.m76034i("AudioEventBroadcastReceiver", "Receive ACTION_STATE_CHANGED, EXTRA_STATE:" + m76022a(iM76021a2) + " EXTRA_PREVIOUS_STATE: " + m76022a(m76021a(intent, "android.bluetooth.adapter.extra.PREVIOUS_STATE", 0)), new Object[0]);
                if (iM76021a2 == 10) {
                    this.f73367b.onBluetoothConnectionChanged(false);
                    break;
                }
                break;
            case "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED":
                int iM76021a3 = m76021a(intent, "android.bluetooth.profile.extra.STATE", 10);
                if (iM76021a3 == 12) {
                    Log.m76034i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_CONNECTED", new Object[0]);
                    this.f73367b.onBluetoothScoConnected(true);
                    break;
                } else {
                    if (iM76021a3 == 10) {
                        Log.m76034i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_DISCONNECTED", new Object[0]);
                        this.f73367b.onBluetoothScoConnected(false);
                    }
                    break;
                }
                break;
            case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                int iM76021a4 = m76021a(intent, "android.bluetooth.profile.extra.STATE", -1);
                if (iM76021a4 == 0) {
                    str = "STATE_DISCONNECTED";
                } else if (iM76021a4 == 1) {
                    str = "STATE_CONNECTING";
                } else if (iM76021a4 != 2) {
                    str = iM76021a4 != 3 ? "unknown" : "STATE_DISCONNECTING";
                } else {
                    str = "STATE_CONNECTED";
                }
                Log.m76034i("AudioEventBroadcastReceiver", "Receive bluetooth headset connection state changed: %s", str);
                if (iM76021a4 == 0) {
                    this.f73367b.onBluetoothConnectionChanged(false);
                    break;
                } else if (iM76021a4 == 2) {
                    this.f73367b.onBluetoothConnectionChanged(true);
                    break;
                }
                break;
            default:
                Log.m76036w("AudioEventBroadcastReceiver", "Ignore unknown Action:".concat(action), new Object[0]);
                break;
        }
    }

    public C34684a(Context context, a aVar) {
        this.f73366a = context;
        this.f73367b = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static int m76021a(Intent intent, String str, int i11) {
        try {
            return intent.getIntExtra(str, i11);
        } catch (Exception e11) {
            Log.m76033e("AudioEventBroadcastReceiver", "getIntentIntExtra ".concat(String.valueOf(e11)), new Object[0]);
            return i11;
        }
    }
}
