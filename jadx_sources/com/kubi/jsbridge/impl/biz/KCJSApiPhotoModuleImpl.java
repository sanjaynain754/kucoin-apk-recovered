package com.kubi.jsbridge.impl.biz;

import android.app.Activity;
import android.content.Context;
import com.blankj.utilcode.util.C5258a;
import com.kubi.jsbridge.impl.command.TakePictureCommand;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36583r;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.biz.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCJSApiPhotoModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102(\u0010\u0011\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0012H\u0016Jd\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2(\u0010\u0011\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/KCJSApiPhotoModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPhotoModule;", "<init>", "()V", "TAG", "", "takePicture", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", BridgeParamKeyKt.CAPTURE, "", BridgeParamKeyKt.MAX_COUNT, "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "appAlbumSelect", "mediaType", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJSApiPhotoModuleImpl implements InterfaceC36583r {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f27366a = "KCJSApiPhotoModuleImpl";

    @Override // d00.InterfaceC36583r
    /* JADX INFO: renamed from: a */
    public void mo31564a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, long j11, @NotNull String mediaType, boolean z11, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if ((activityM6125h instanceof KWebBaseActivity) && activityM6125h != null) {
            new TakePictureCommand(callback, (BaseActivity) activityM6125h, z11, (int) j11, mediaType).m31622h();
        } else {
            C44128b.m97266j(this.f27366a, "appAlbumSelect: top activity is not KWebBaseActivity or not ActivityResultHost");
            callback.invoke(null, new ProtocolException("appAlbumSelect: invalid activity", null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36583r
    /* JADX INFO: renamed from: b */
    public void mo31565b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, long j11, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if ((activityM6125h instanceof KWebBaseActivity) && activityM6125h != null) {
            new TakePictureCommand(callback, (BaseActivity) activityM6125h, z11, (int) j11, null, 16, null).m31622h();
        } else {
            C44128b.m97266j(this.f27366a, "takePicture: top activity is not KWebBaseActivity or not ActivityResultHost");
            callback.invoke(null, new ProtocolException("takePicture: invalid activity", null, null, false, 14, null));
        }
    }
}
