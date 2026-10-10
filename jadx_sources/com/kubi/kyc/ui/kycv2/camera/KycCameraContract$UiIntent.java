package com.kubi.kyc.ui.kycv2.camera;

import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycCameraContract.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "SwitchCameraClick", "ShutterButtonClick", "CameraInit", "CameraReset", "StartPreview", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraInit;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraReset;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$ShutterButtonClick;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$StartPreview;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$SwitchCameraClick;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class KycCameraContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: KycCameraContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraInit;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;", "<init>", "()V", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CameraInit extends KycCameraContract$UiIntent {

        @NotNull
        public static final CameraInit INSTANCE = new CameraInit();

        private CameraInit() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: KycCameraContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraReset;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;", "<init>", "()V", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CameraReset extends KycCameraContract$UiIntent {

        @NotNull
        public static final CameraReset INSTANCE = new CameraReset();

        private CameraReset() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: KycCameraContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$ShutterButtonClick;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;", "previewView", "Landroidx/camera/view/PreviewView;", "clipOutPathView", "Lcom/kubi/kyc/ui/kycv2/camera/ClipOutPathView;", "<init>", "(Landroidx/camera/view/PreviewView;Lcom/kubi/kyc/ui/kycv2/camera/ClipOutPathView;)V", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "getClipOutPathView", "()Lcom/kubi/kyc/ui/kycv2/camera/ClipOutPathView;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ShutterButtonClick extends KycCameraContract$UiIntent {

        @NotNull
        private final ClipOutPathView clipOutPathView;

        @NotNull
        private final PreviewView previewView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShutterButtonClick(@NotNull PreviewView previewView, @NotNull ClipOutPathView clipOutPathView) {
            super(null);
            Intrinsics.checkNotNullParameter(previewView, "previewView");
            Intrinsics.checkNotNullParameter(clipOutPathView, "clipOutPathView");
            this.previewView = previewView;
            this.clipOutPathView = clipOutPathView;
        }

        @NotNull
        public final ClipOutPathView getClipOutPathView() {
            return this.clipOutPathView;
        }

        @NotNull
        public final PreviewView getPreviewView() {
            return this.previewView;
        }
    }

    /* JADX INFO: compiled from: KycCameraContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$StartPreview;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "previewView", "Landroidx/camera/view/PreviewView;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class StartPreview extends KycCameraContract$UiIntent {

        @NotNull
        private final LifecycleOwner lifecycleOwner;

        @NotNull
        private final PreviewView previewView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartPreview(@NotNull LifecycleOwner lifecycleOwner, @NotNull PreviewView previewView) {
            super(null);
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(previewView, "previewView");
            this.lifecycleOwner = lifecycleOwner;
            this.previewView = previewView;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @NotNull
        public final PreviewView getPreviewView() {
            return this.previewView;
        }
    }

    /* JADX INFO: compiled from: KycCameraContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$SwitchCameraClick;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;", "<init>", "()V", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class SwitchCameraClick extends KycCameraContract$UiIntent {

        @NotNull
        public static final SwitchCameraClick INSTANCE = new SwitchCameraClick();

        private SwitchCameraClick() {
            super(null);
        }
    }

    public /* synthetic */ KycCameraContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KycCameraContract$UiIntent() {
    }
}
