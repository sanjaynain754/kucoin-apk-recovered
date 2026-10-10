package com.tencent.liteav.audio2.route;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
public class AudioDeviceProperty implements C34684a.a {
    private static final String TAG = "AudioDeviceProperty";
    private AudioDeviceCallback mAudioDeviceCallback;
    private C34684a mAudioEventBroadcastReceiver;
    private final AudioManager mAudioManager;
    private C34685b mBluetoothHeadsetListener;
    private final Context mContext;
    private long mNativeAudioDeviceProperty;
    private boolean mAudioDeviceCallbackAvailable = false;
    private boolean mUseBluetoothSco = false;

    public static class UsbAudioDeviceInfo {

        /* JADX INFO: renamed from: a */
        public String f73364a = "";

        /* JADX INFO: renamed from: b */
        public String f73365b = "";

        public String getName() {
            return this.f73364a;
        }

        public String getVidPid() {
            return this.f73365b;
        }
    }

    private boolean isCommunicationDeviceConnected(int i11) {
        try {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) AudioManager.class.getMethod("getCommunicationDevice", new Class[0]).invoke(this.mAudioManager, new Object[0]);
            return audioDeviceInfo != null && audioDeviceInfo.getType() == i11;
        } catch (Throwable th2) {
            Log.m76034i(TAG, "get communication device failed. ".concat(String.valueOf(th2)), new Object[0]);
            return false;
        }
    }

    public static boolean isUsbHeadsetDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i11 = 0; i11 < usbDevice.getInterfaceCount(); i11++) {
            try {
                if (usbDevice.getInterface(i11).getInterfaceClass() == 1) {
                    return true;
                }
            } catch (Throwable th2) {
                Log.m76033e(TAG, "Get interface exception " + th2.getMessage(), new Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyBluetoothConnectionChangedFromJava(long j11, boolean z11);

    private static native void nativeNotifyBluetoothScoConnectedFromJava(long j11, boolean z11);

    private static native void nativeNotifySystemVolumeChangedFromJava(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyUsbConnectionChangedFromJava(long j11, String str, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyWiredHeadsetConnectionChangedFromJava(long j11, boolean z11);

    public int getSystemVolume() {
        try {
            int i11 = this.mAudioManager.getMode() == 0 ? 3 : 0;
            int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(i11);
            if (streamMaxVolume <= 0) {
                return -1;
            }
            return (int) ((this.mAudioManager.getStreamVolume(i11) / streamMaxVolume) * 100.0f);
        } catch (Throwable th2) {
            Log.m76033e(TAG, "getStreamVolume exception " + th2.getMessage(), new Object[0]);
            return -1;
        }
    }

    public boolean isBluetoothConnected() {
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 35) {
                return isCommunicationDeviceConnected(7) || isCommunicationDeviceConnected(26);
            }
            Intent intentRegisterReceiver = ContextUtils.getApplicationContext().registerReceiver(null, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            return intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) == 1;
        } catch (Throwable th2) {
            Log.m76034i(TAG, "isBluetoothConnected exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isBluetoothOn() {
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 35) {
                return this.mAudioManager.isBluetoothScoOn();
            }
            return isCommunicationDeviceConnected(7) || isCommunicationDeviceConnected(26);
        } catch (Throwable th2) {
            Log.m76034i(TAG, "isBluetoothOn exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isUsbHeadsetAvailable() {
        try {
            UsbManager usbManager = (UsbManager) this.mContext.getSystemService("usb");
            if (usbManager == null) {
                return false;
            }
            Iterator<UsbDevice> it = usbManager.getDeviceList().values().iterator();
            while (it.hasNext()) {
                if (isUsbHeadsetDevice(it.next())) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            Log.m76034i(TAG, "getDeviceList exception " + th2.getMessage(), new Object[0]);
        }
        return false;
    }

    private void buildAudioDeviceCallback() {
        if (this.mAudioDeviceCallback != null) {
            return;
        }
        this.mAudioDeviceCallback = new AudioDeviceCallback() { // from class: com.tencent.liteav.audio2.route.AudioDeviceProperty.1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                Log.m76034i(AudioDeviceProperty.TAG, "add device size " + audioDeviceInfoArr.length, new Object[0]);
                AudioDeviceProperty.this.mAudioDeviceCallbackAvailable = true;
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.m76034i(AudioDeviceProperty.TAG, "added device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 26) {
                        AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    }
                }
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                Log.m76034i(AudioDeviceProperty.TAG, "remove device size " + audioDeviceInfoArr.length, new Object[0]);
                int length = audioDeviceInfoArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    AudioDeviceInfo audioDeviceInfo = audioDeviceInfoArr[i11];
                    Log.m76034i(AudioDeviceProperty.TAG, "removed device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
                    if ((audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) && !AudioDeviceProperty.this.isBluetoothHeadsetConnected()) {
                        AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    }
                }
            }
        };
    }

    private void registerAudioDeviceCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return;
        }
        if (this.mAudioDeviceCallback == null) {
            buildAudioDeviceCallback();
        }
        AudioDeviceCallback audioDeviceCallback = this.mAudioDeviceCallback;
        if (audioDeviceCallback == null) {
            return;
        }
        try {
            this.mAudioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
            Log.m76034i(TAG, "register audio device callback", new Object[0]);
        } catch (Throwable th2) {
            Log.m76033e(TAG, "registerAudioDeviceCallback exception " + th2.getMessage(), new Object[0]);
        }
    }

    private void setCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        try {
            boolean zBooleanValue = ((Boolean) AudioManager.class.getMethod("setCommunicationDevice", AudioDeviceInfo.class).invoke(this.mAudioManager, audioDeviceInfo)).booleanValue();
            if (!zBooleanValue) {
                AudioManager.class.getMethod("clearCommunicationDevice", new Class[0]).invoke(this.mAudioManager, new Object[0]);
            }
            Log.m76034i(TAG, "setCommunicationDevice: " + zBooleanValue + ", type: " + audioDeviceInfo.getType() + ", product name: " + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
        } catch (Throwable th2) {
            Log.m76034i(TAG, "set communication device failed. ".concat(String.valueOf(th2)), new Object[0]);
        }
    }

    private void unregisterAudioDeviceCallback() {
        AudioDeviceCallback audioDeviceCallback;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && (audioDeviceCallback = this.mAudioDeviceCallback) != null) {
            try {
                this.mAudioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
                Log.m76034i(TAG, "unregister audio device callback", new Object[0]);
            } catch (Throwable th2) {
                Log.m76033e(TAG, "unregisterAudioDeviceCallback exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    public UsbAudioDeviceInfo GetUsbAudioDeviceInfo(String str) {
        UsbAudioDeviceInfo usbAudioDeviceInfo = new UsbAudioDeviceInfo();
        try {
            UsbManager usbManager = (UsbManager) this.mContext.getSystemService("usb");
            if (usbManager != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                    if (!str.contains(usbDevice.getProductName()) && !isUsbHeadsetDevice(usbDevice)) {
                    }
                    usbAudioDeviceInfo.f73364a = usbDevice.getProductName();
                    usbAudioDeviceInfo.f73365b = String.valueOf(usbDevice.getVendorId()) + usbDevice.getProductId();
                    return usbAudioDeviceInfo;
                }
            }
        } catch (Throwable th2) {
            Log.m76034i(TAG, "getDeviceList exception " + th2.getMessage(), new Object[0]);
        }
        return usbAudioDeviceInfo;
    }

    public boolean checkBluetoothPermission() {
        return C34685b.m76023a(this.mContext);
    }

    public void connectBluetooth() {
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 35) {
                this.mUseBluetoothSco = true;
                this.mAudioManager.startBluetoothSco();
                Log.m76034i(TAG, "startBluetoothSco", new Object[0]);
                return;
            }
            List<AudioDeviceInfo> list = (List) AudioManager.class.getMethod("getAvailableCommunicationDevices", new Class[0]).invoke(this.mAudioManager, new Object[0]);
            if (list != null && !list.isEmpty()) {
                for (AudioDeviceInfo audioDeviceInfo : list) {
                    if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                        setCommunicationDevice(audioDeviceInfo);
                        return;
                    }
                }
                Log.m76036w(TAG, "not found available communication devices, try to startBluetoothSco", new Object[0]);
                this.mUseBluetoothSco = true;
                this.mAudioManager.startBluetoothSco();
            }
        } catch (Throwable th2) {
            Log.m76034i(TAG, "startBluetooth exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void disconnectBluetooth() {
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 35 && !this.mUseBluetoothSco) {
                AudioManager.class.getMethod("clearCommunicationDevice", new Class[0]).invoke(this.mAudioManager, new Object[0]);
                Log.m76034i(TAG, "clearCommunicationDevice", new Object[0]);
                return;
            }
            this.mUseBluetoothSco = false;
            this.mAudioManager.stopBluetoothSco();
            Log.m76034i(TAG, "stopBluetoothSco", new Object[0]);
        } catch (Throwable th2) {
            Log.m76034i(TAG, "stopBluetooth exception " + th2.getMessage(), new Object[0]);
        }
    }

    public int getMode() {
        try {
            return this.mAudioManager.getMode();
        } catch (Throwable th2) {
            Log.m76034i(TAG, "Get mode exception " + th2.getMessage(), new Object[0]);
            return 0;
        }
    }

    public boolean isBluetoothHeadsetConnected() {
        C34685b c34685b = this.mBluetoothHeadsetListener;
        if (c34685b != null) {
            return c34685b.m76028a();
        }
        Log.m76033e(TAG, "mBluetoothHeadsetListener is null", new Object[0]);
        return false;
    }

    public boolean isSpeakerphoneOn() {
        try {
            return this.mAudioManager.isSpeakerphoneOn();
        } catch (Throwable th2) {
            Log.m76034i(TAG, "isSpeakerphoneOn exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isWiredHeadsetOn() {
        try {
            return this.mAudioManager.isWiredHeadsetOn();
        } catch (Throwable th2) {
            Log.m76034i(TAG, "isWiredHeadsetOn exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    @Override // com.tencent.liteav.audio2.route.C34684a.a
    public void onBluetoothConnectionChanged(boolean z11) {
        if (z11 || !isBluetoothHeadsetConnected()) {
            nativeNotifyBluetoothConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z11);
        }
    }

    @Override // com.tencent.liteav.audio2.route.C34684a.a
    public void onBluetoothScoConnected(boolean z11) {
        nativeNotifyBluetoothScoConnectedFromJava(this.mNativeAudioDeviceProperty, z11);
    }

    @Override // com.tencent.liteav.audio2.route.C34684a.a
    public void onSystemVolumeChanged() {
        nativeNotifySystemVolumeChangedFromJava(this.mNativeAudioDeviceProperty);
    }

    @Override // com.tencent.liteav.audio2.route.C34684a.a
    public void onUsbConnectionChanged(String str, boolean z11) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyUsbConnectionChangedFromJava(this.mNativeAudioDeviceProperty, str, z11);
    }

    @Override // com.tencent.liteav.audio2.route.C34684a.a
    public void onWiredHeadsetConnectionChanged(boolean z11) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyWiredHeadsetConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z11);
    }

    public void setBluetoothOn(boolean z11) {
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 35) {
                this.mAudioManager.setBluetoothScoOn(z11);
                Log.m76034i(TAG, "setBluetoothScoOn ".concat(String.valueOf(z11)), new Object[0]);
            }
        } catch (Throwable th2) {
            Log.m76034i(TAG, "setBluetoothOn exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void setSpeakerphoneOn(boolean z11) {
        try {
            this.mAudioManager.setSpeakerphoneOn(z11);
            Log.m76034i(TAG, "setSpeakerphoneOn ".concat(String.valueOf(z11)), new Object[0]);
        } catch (Throwable th2) {
            Log.m76034i(TAG, "setSpeakerphoneOn exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void setVoip(boolean z11) {
        int i11 = z11 ? 3 : 0;
        try {
            this.mAudioManager.setMode(i11);
            Log.m76034i(TAG, "setMode ".concat(String.valueOf(i11)), new Object[0]);
        } catch (Throwable th2) {
            Log.m76034i(TAG, "Set mode exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void setWiredHeadsetOn(boolean z11) {
        try {
            this.mAudioManager.setWiredHeadsetOn(z11);
            Log.m76034i(TAG, "setWiredHeadsetOn ".concat(String.valueOf(z11)), new Object[0]);
        } catch (Throwable th2) {
            Log.m76034i(TAG, "setWiredHeadsetOn exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void stop() {
        Context context;
        C34684a c34684a = this.mAudioEventBroadcastReceiver;
        if (c34684a != null && (context = c34684a.f73366a) != null) {
            try {
                context.unregisterReceiver(c34684a);
            } catch (Exception unused) {
            }
        }
        this.mAudioEventBroadcastReceiver = null;
        C34685b c34685b = this.mBluetoothHeadsetListener;
        if (c34685b != null) {
            synchronized (c34685b.f73370c) {
                try {
                    if (c34685b.f73368a != null && c34685b.f73369b != null) {
                        c34685b.m76029b();
                        c34685b.f73369b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.mBluetoothHeadsetListener = null;
        unregisterAudioDeviceCallback();
    }

    public AudioDeviceProperty(long j11) {
        this.mNativeAudioDeviceProperty = j11;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        this.mAudioManager = (AudioManager) applicationContext.getSystemService("audio");
    }

    public boolean isBluetoothScoAvailable() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (AudioDeviceInfo audioDeviceInfo : this.mAudioManager.getDevices(2)) {
                arrayList.add(Integer.valueOf(audioDeviceInfo.getType()));
            }
        } catch (Throwable th2) {
            Log.m76034i(TAG, "isBluetoothScoAvailable exception " + th2.getMessage(), new Object[0]);
        }
        if (arrayList.isEmpty() || !arrayList.contains(8) || arrayList.contains(7)) {
            return true;
        }
        return false;
    }

    public void start() {
        registerAudioDeviceCallback();
        C34684a c34684a = new C34684a(this.mContext, this);
        this.mAudioEventBroadcastReceiver = c34684a;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            c34684a.f73366a.registerReceiver(c34684a, intentFilter);
        } catch (Throwable unused) {
            Log.m76033e("AudioEventBroadcastReceiver", "register broadcast exception", new Object[0]);
        }
        this.mBluetoothHeadsetListener = new C34685b(this.mContext);
    }
}
