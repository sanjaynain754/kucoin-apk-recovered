package fd0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fd0.d */
/* JADX INFO: compiled from: BeautyUtils.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/BeautyUtils;", "", "<init>", "()V", "dialogWeakRef", "Ljava/lang/ref/WeakReference;", "Lcom/trtc/uikit/livekit/component/beauty/BeautyPanelDialog;", "showBeautyDialog", "", "context", "Landroid/content/Context;", "resetBeauty", "dismissBeautyDialog", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37436d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37436d f83036a = new C37436d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static WeakReference<DialogC37433a> f83037b = new WeakReference<>(null);

    /* JADX INFO: renamed from: fd0.d$a */
    /* JADX INFO: compiled from: BeautyUtils.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/BeautyUtils$showBeautyDialog$1", "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "onServiceCallback", "", "code", "", "message", "", "bundle", "Landroid/os/Bundle;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TUIServiceCallback {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f83038f;

        public a(Context context) {
            this.f83038f = context;
        }

        /* JADX INFO: renamed from: b */
        public static final void m84226b(DialogInterface dialogInterface) {
            TEBeautyManager.f77696a.m79591o();
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(int code, String message, Bundle bundle) {
            if (code == 0) {
                DialogC37433a dialogC37433a = new DialogC37433a(this.f83038f);
                C37436d c37436d = C37436d.f83036a;
                C37436d.f83037b = new WeakReference(dialogC37433a);
                dialogC37433a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fd0.c
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C37436d.a.m84226b(dialogInterface);
                    }
                });
                dialogC37433a.show();
                return;
            }
            AtomicToast.m88196j(AtomicToast.f87566a, this.f83038f, "check beauty resource failed:" + code + ",message:" + message, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m84221c() {
        DialogC37433a dialogC37433a = f83037b.get();
        if (dialogC37433a != null) {
            dialogC37433a.dismiss();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m84222d() {
        BaseBeautyStore.INSTANCE.shared().reset();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m84223e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TEBeautyManager tEBeautyManager = TEBeautyManager.f77696a;
        if (tEBeautyManager.m79594r()) {
            tEBeautyManager.m79586j(context, new a(context));
            return;
        }
        DialogC37433a dialogC37433a = new DialogC37433a(context);
        f83037b = new WeakReference<>(dialogC37433a);
        dialogC37433a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fd0.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C37436d.m84224f(dialogInterface);
            }
        });
        dialogC37433a.show();
    }

    /* JADX INFO: renamed from: f */
    public static final void m84224f(DialogInterface dialogInterface) {
        TEBeautyManager.f77696a.m79591o();
    }
}
