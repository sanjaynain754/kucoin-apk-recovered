package dd0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: dd0.a */
/* JADX INFO: compiled from: OnDecorViewListener.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "decorView", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener$OnKeyboardCallback;", "<init>", "(Landroid/view/View;Lcom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener$OnKeyboardCallback;)V", "screenHeight", "", "currentKeyboardHeight", "onGlobalLayout", "", "getKeyboardHeight", "clear", "OnKeyboardCallback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOnDecorViewListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDecorViewListener.kt\ncom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class ViewTreeObserverOnGlobalLayoutListenerC36662a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f79461b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final a f79462c;

    /* JADX INFO: renamed from: d */
    public int f79463d;

    /* JADX INFO: renamed from: e */
    public int f79464e;

    /* JADX INFO: renamed from: dd0.a$a */
    /* JADX INFO: compiled from: OnDecorViewListener.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener$OnKeyboardCallback;", "", "onKeyboardHeightUpdated", "", "keyboardHeight", "", "navigationBarHeight", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo79522a(int i11, int i12);
    }

    /* JADX INFO: renamed from: a */
    public final void m82028a() {
        this.f79464e = -1;
        this.f79463d = 0;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC36662a(@NotNull View decorView, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(decorView, "decorView");
        this.f79461b = decorView;
        this.f79462c = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m82029b() {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.f79461b);
        if (rootWindowInsets != null) {
            int i11 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.ime()).bottom;
            int i12 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
            boolean zIsVisible = rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime());
            if (zIsVisible && i11 > 0) {
                return i11;
            }
            if (!zIsVisible) {
                return 0;
            }
        }
        Rect rect = new Rect();
        this.f79461b.getWindowVisibleDisplayFrame(rect);
        Integer numValueOf = Integer.valueOf(this.f79463d);
        if (!(numValueOf.intValue() != 0)) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : rect.bottom;
        this.f79463d = iIntValue;
        return RangesKt.coerceAtLeast(iIntValue - rect.bottom, 0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        a aVar;
        int iM82029b = m82029b();
        int iM58271i = EdgeToEdgeCompat.f48106a.m58271i();
        int i11 = this.f79464e;
        if (i11 != -1 && i11 != iM82029b && (aVar = this.f79462c) != null) {
            aVar.mo79522a(iM82029b, iM58271i);
        }
        this.f79464e = iM82029b;
    }
}
