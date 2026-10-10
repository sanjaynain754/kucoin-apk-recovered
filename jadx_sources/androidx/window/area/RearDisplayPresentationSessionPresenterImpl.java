package androidx.window.area;

import android.content.Context;
import android.view.View;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RearDisplayPresentationSessionPresenterImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalWindowApi
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/window/area/RearDisplayPresentationSessionPresenterImpl;", "Landroidx/window/area/WindowAreaSessionPresenter;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "presentation", "Landroidx/window/extensions/area/ExtensionWindowAreaPresentation;", "(Landroidx/window/extensions/area/WindowAreaComponent;Landroidx/window/extensions/area/ExtensionWindowAreaPresentation;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "close", "", "setContentView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RearDisplayPresentationSessionPresenterImpl implements WindowAreaSessionPresenter {

    @NotNull
    private final Context context;

    @NotNull
    private final ExtensionWindowAreaPresentation presentation;

    @NotNull
    private final WindowAreaComponent windowAreaComponent;

    @Override // androidx.window.area.WindowAreaSession
    public void close() {
        this.windowAreaComponent.endRearDisplayPresentationSession();
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    @NotNull
    public Context getContext() {
        return this.context;
    }

    public RearDisplayPresentationSessionPresenterImpl(@NotNull WindowAreaComponent windowAreaComponent, @NotNull ExtensionWindowAreaPresentation presentation) {
        Intrinsics.checkNotNullParameter(windowAreaComponent, "windowAreaComponent");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        this.windowAreaComponent = windowAreaComponent;
        this.presentation = presentation;
        Context presentationContext = presentation.getPresentationContext();
        Intrinsics.checkNotNullExpressionValue(presentationContext, "presentation.presentationContext");
        this.context = presentationContext;
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.presentation.setPresentationView(view);
    }
}
