package vc0;

import android.content.Context;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.permission.PermissionRequester;
import com.trtc.uikit.livekit.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vc0.f */
/* JADX INFO: compiled from: PermissionRequest.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/PermissionRequest;", "", "<init>", "()V", "requestMicrophonePermissions", "", "context", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "requestCameraPermissions", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45497f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45497f f102528a = new C45497f();

    /* JADX INFO: renamed from: vc0.f$a */
    /* JADX INFO: compiled from: PermissionRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/common/PermissionRequest$requestCameraPermissions$permissionCallback$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends AbstractC35867d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC35867d f102529a;

        public a(AbstractC35867d abstractC35867d) {
            this.f102529a = abstractC35867d;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            AbstractC35867d abstractC35867d = this.f102529a;
            if (abstractC35867d != null) {
                abstractC35867d.mo79394b();
            }
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: a */
        public void mo79393a() {
            super.mo79393a();
            AbstractC35867d abstractC35867d = this.f102529a;
            if (abstractC35867d != null) {
                abstractC35867d.mo79393a();
            }
        }
    }

    /* JADX INFO: renamed from: vc0.f$b */
    /* JADX INFO: compiled from: PermissionRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/common/PermissionRequest$requestMicrophonePermissions$permissionCallback$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends AbstractC35867d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC35867d f102530a;

        public b(AbstractC35867d abstractC35867d) {
            this.f102530a = abstractC35867d;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            AbstractC35867d abstractC35867d = this.f102530a;
            if (abstractC35867d != null) {
                abstractC35867d.mo79394b();
            }
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: a */
        public void mo79393a() {
            super.mo79393a();
            AbstractC35867d abstractC35867d = this.f102530a;
            if (abstractC35867d != null) {
                abstractC35867d.mo79393a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m100466a(@NotNull Context context, @Nullable AbstractC35867d abstractC35867d) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.common_permission_camera);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R$string.common_permission_camera_reason);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        PermissionRequester.m79375e("android.permission.CAMERA").m79389p(context.getString(R$string.common_permission_title, context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), string)).m79377c(string2).m79382i(context.getString(R$string.common_permission_tips, string) + '\n' + string2).m79376b(new a(abstractC35867d)).m79380g();
    }

    /* JADX INFO: renamed from: b */
    public final void m100467b(@NotNull Context context, @Nullable AbstractC35867d abstractC35867d) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.common_permission_microphone);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R$string.common_permission_mic_reason);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        PermissionRequester.m79375e("android.permission.RECORD_AUDIO").m79389p(context.getString(R$string.common_permission_title, context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), string)).m79377c(string2).m79382i(context.getString(R$string.common_permission_tips, string) + '\n' + string2).m79376b(new b(abstractC35867d)).m79380g();
    }
}
