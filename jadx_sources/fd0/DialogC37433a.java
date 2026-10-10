package fd0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.trtc.uikit.livekit.component.beauty.basicbeauty.BeautyListPanel;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyView;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fd0.a */
/* JADX INFO: compiled from: BeautyPanelDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/BeautyPanelDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogC37433a extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f83035m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC37433a(@NotNull Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83035m = context;
        m88185v(true);
        m88184u(false);
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        View beautyListPanel;
        super.onCreate(savedInstanceState);
        if (TEBeautyManager.f77696a.m79594r()) {
            beautyListPanel = new TEBeautyView(this.f83035m);
        } else {
            beautyListPanel = new BeautyListPanel(this.f83035m, null, 0, 6, null);
        }
        m88181q(beautyListPanel);
    }
}
