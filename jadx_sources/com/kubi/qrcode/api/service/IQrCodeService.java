package com.kubi.qrcode.api.service;

import android.graphics.Bitmap;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: IQrCodeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/qrcode/api/service/IQrCodeService;", "", "handleScanCodeResult", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "complete", "Lkotlin/Function1;", "", "handleScanCode", "fragment", "Lcom/kubi/sdk/BaseFragment;", "encodeAsBitmap", "Landroid/graphics/Bitmap;", "str", "width", "", "height", "Companion", "QrCodeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IQrCodeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f40829a = Companion.f40830a;

    /* JADX INFO: compiled from: IQrCodeService.kt */
    /* JADX INFO: loaded from: classes36.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/qrcode/api/service/IQrCodeService;", "QrCodeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f40830a = new Companion();

        @NotNull
        public final IQrCodeService get() {
            return (IQrCodeService) Router.f46192a.m56192n(IQrCodeService.class);
        }
    }

    @Nullable
    Bitmap encodeAsBitmap(@NotNull String str, int width, int height);

    void handleScanCode(@NotNull BaseFragment fragment);

    void handleScanCodeResult(@NotNull BaseActivity activity, @Nullable Function1<? super String, Unit> complete);
}
