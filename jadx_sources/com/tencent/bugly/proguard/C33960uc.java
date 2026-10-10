package com.tencent.bugly.proguard;

import android.os.MessageQueue;
import androidx.annotation.NonNull;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.p145fd.FdLeakMonitor;
import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.uc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33960uc implements MessageQueue.OnFileDescriptorEventListener {
    @Override // android.os.MessageQueue.OnFileDescriptorEventListener
    public int onFileDescriptorEvents(@NonNull FileDescriptor fileDescriptor, int i11) {
        if (i11 == 1) {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                byte[] bArr = new byte[1024];
                if (fileInputStream.read(bArr) > 0 && bArr[0] == 101) {
                    FdLeakMonitor.C35155b.f75264a.m77164a(true);
                }
            } catch (Throwable th2) {
                FdLeakMonitor.nEnableLeakDetectThisTime(false);
                Logger.INSTANCE.exception(FdLeakMonitor.f75244h, th2);
                return 0;
            }
        }
        return 1;
    }
}
