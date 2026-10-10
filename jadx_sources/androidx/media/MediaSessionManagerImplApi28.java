package androidx.media;

import android.content.Context;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(28)
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    @RequiresApi(28)
    public static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

        public RemoteUserInfoImplApi28(String str, int i11, int i12) {
            super(str, i11, i12);
            this.mObject = C2705g.m2878a(str, i11, i12);
        }

        public RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.mObject = remoteUserInfo;
        }

        public static String getPackageName(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }
    }

    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return super.isTrustedForMediaControl(remoteUserInfoImpl);
    }
}
