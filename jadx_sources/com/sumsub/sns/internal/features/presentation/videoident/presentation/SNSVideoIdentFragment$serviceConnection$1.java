package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.sumsub.sns.internal.features.presentation.videoident.chat.C32917q;
import com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatController$CameraId;
import com.sumsub.sns.internal.features.presentation.videoident.service.SNSServiceBinder;
import com.sumsub.sns.internal.features.presentation.videoident.service.SNSVideoChatService;
import com.twilio.video.VideoView;
import java.lang.ref.WeakReference;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"com/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$serviceConnection$1", "Landroid/content/ServiceConnection;", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "value", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;", NotificationCompat.CATEGORY_SERVICE, "getService", "()Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;", "serviceReference", "Ljava/lang/ref/WeakReference;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "binder", "Landroid/os/IBinder;", "onServiceDisconnected", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSVideoIdentFragment$serviceConnection$1 implements ServiceConnection {
    private boolean connected;
    private SNSVideoChatService service;
    private WeakReference<SNSVideoChatService> serviceReference;
    final /* synthetic */ SNSVideoIdentFragment this$0;

    public SNSVideoIdentFragment$serviceConnection$1(SNSVideoIdentFragment sNSVideoIdentFragment) {
        this.this$0 = sNSVideoIdentFragment;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final SNSVideoChatService getService() {
        WeakReference<SNSVideoChatService> weakReference;
        if (this.connected && (weakReference = this.serviceReference) != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void setConnected(boolean z11) {
        this.connected = z11;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder binder) {
        C32917q videoChatController;
        String value;
        AbstractC32895a.m71366a("onServiceConnected");
        if (binder instanceof SNSServiceBinder) {
            SNSServiceBinder sNSServiceBinder = (SNSServiceBinder) binder;
            this.serviceReference = sNSServiceBinder.getService();
            SNSVideoChatService sNSVideoChatService = sNSServiceBinder.getService().get();
            if (sNSVideoChatService != null && (videoChatController = sNSVideoChatService.getVideoChatController()) != null) {
                SNSVideoIdentFragment sNSVideoIdentFragment = this.this$0;
                this.connected = true;
                AbstractC32895a.m71366a("onServiceConnected: connected");
                sNSVideoIdentFragment.attachChatControllerListeners(videoChatController);
                VideoView localVideoView = sNSVideoIdentFragment.getLocalVideoView();
                if (localVideoView != null) {
                    videoChatController.m71378b(localVideoView);
                    VideoView localVideoView2 = sNSVideoIdentFragment.getLocalVideoView();
                    if (localVideoView2 != null) {
                        videoChatController.m71375a(localVideoView2);
                        String str = sNSVideoIdentFragment.currentCameraId;
                        if (str != null) {
                            SNSVideoChatController$CameraId sNSVideoChatController$CameraIdM71377b = videoChatController.m71377b();
                            if (sNSVideoChatController$CameraIdM71377b != null) {
                                value = sNSVideoChatController$CameraIdM71377b.getValue();
                            } else {
                                value = null;
                            }
                            if (!Intrinsics.areEqual(value, str)) {
                                sNSVideoIdentFragment.switchCameraAndUpdateMirroring();
                            }
                            sNSVideoIdentFragment.currentCameraId = null;
                        }
                        sNSVideoIdentFragment.handleState((SNSViewState) sNSVideoIdentFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().currentState(), (Bundle) null);
                        Function0 function0 = sNSVideoIdentFragment.startServiceAndConnectToRoom;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        SNSVideoChatService sNSVideoChatService;
        AbstractC32895a.m71366a("onServiceDisconnected");
        this.connected = false;
        WeakReference<SNSVideoChatService> weakReference = this.serviceReference;
        if (weakReference != null && (sNSVideoChatService = weakReference.get()) != null) {
            this.this$0.detachChatControllerListeners(sNSVideoChatService.getVideoChatController());
        }
        this.serviceReference = null;
    }
}
