package com.tencent.rtmp.video;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes56.dex */
public class TXScreenCapture {

    public static class TXScreenCaptureAssistantActivity extends Activity {
        private static final int REQUEST_CODE = 100;
        private static final String TAG = "TXScreenCaptureAssistantActivity";
        private volatile boolean mIsStop = false;
        private MediaProjectionManager mMediaProjectionManager;

        public boolean isStop() {
            return this.mIsStop;
        }

        @Override // android.app.Activity
        public void onActivityResult(int i11, int i12, Intent intent) {
            BaseBridge.printLog(TAG, "onActivityResult " + this + ", resultCode:" + i12 + ", data:" + intent);
            MediaProjection mediaProjection = null;
            if (intent == null) {
                VirtualDisplayManagerProxy.getInstance().signalSessionRequestFinish(null);
                finish();
                return;
            }
            if (BaseBridge.getSystemOSVersion() >= 26) {
                BaseBridge.printLog(TAG, "startForegroundService");
                Intent intent2 = new Intent(this, (Class<?>) ScreenCaptureService.class);
                intent2.putExtra("code", i12);
                intent2.putExtra("data", intent);
                startForegroundService(intent2);
            } else {
                try {
                    mediaProjection = this.mMediaProjectionManager.getMediaProjection(i12, intent);
                } catch (Throwable th2) {
                    BaseBridge.printLog(TAG, "onActivityResult mMediaProjectionManager.getMediaProjection fail.".concat(String.valueOf(th2)));
                }
                BaseBridge.printLog(TAG, "ProjectionManger get mediaProjection:".concat(String.valueOf(mediaProjection)));
                VirtualDisplayManagerProxy.getInstance().signalSessionRequestFinish(mediaProjection);
            }
            finish();
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            BaseBridge.printLog(TAG, "onCreate ".concat(String.valueOf(this)));
            requestWindowFeature(1);
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            this.mMediaProjectionManager = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
                VirtualDisplayManagerProxy.getInstance().registerRequestPermissionActivity(this);
            } catch (Throwable th2) {
                BaseBridge.printLog(TAG, "Start permission activity failed. ".concat(String.valueOf(th2)));
                VirtualDisplayManagerProxy.getInstance().signalSessionRequestFinish(null);
                finish();
            }
        }

        @Override // android.app.Activity
        public void onDestroy() {
            BaseBridge.printLog(TAG, "onDestroy ".concat(String.valueOf(this)));
            VirtualDisplayManagerProxy.getInstance().unRegisterRequestPermissionActivity(this);
            super.onDestroy();
        }

        @Override // android.app.Activity
        public void onStart() {
            super.onStart();
            this.mIsStop = false;
            BaseBridge.printLog(TAG, "onStart:".concat(String.valueOf(this)));
        }

        @Override // android.app.Activity
        public void onStop() {
            super.onStop();
            this.mIsStop = true;
            BaseBridge.printLog(TAG, "onStop:".concat(String.valueOf(this)));
        }
    }
}
