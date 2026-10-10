package androidx.window;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowSdkExtensions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m90084d2 = {"Landroidx/window/EmptyDecoratorWindowSdk;", "Landroidx/window/WindowSdkExtensionsDecorator;", "()V", "decorate", "Landroidx/window/WindowSdkExtensions;", "windowSdkExtensions", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
final class EmptyDecoratorWindowSdk implements WindowSdkExtensionsDecorator {

    @NotNull
    public static final EmptyDecoratorWindowSdk INSTANCE = new EmptyDecoratorWindowSdk();

    private EmptyDecoratorWindowSdk() {
    }

    @Override // androidx.window.WindowSdkExtensionsDecorator
    @NotNull
    public WindowSdkExtensions decorate(@NotNull WindowSdkExtensions windowSdkExtensions) {
        Intrinsics.checkNotNullParameter(windowSdkExtensions, "windowSdkExtensions");
        return windowSdkExtensions;
    }
}
