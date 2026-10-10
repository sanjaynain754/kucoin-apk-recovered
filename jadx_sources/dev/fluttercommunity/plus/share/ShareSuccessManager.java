package dev.fluttercommunity.plus.share;

import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareSuccessManager.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m90084d2 = {"Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/flutter/plugin/common/MethodChannel$Result;", TUIConstants.TUIChat.CALL_BACK, "", "b", "(Lio/flutter/plugin/common/MethodChannel$Result;)Z", "", "c", "()V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)Z", "", DbParams.KEY_CHANNEL_RESULT, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lio/flutter/plugin/common/MethodChannel$Result;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCalledBack", "e", "Companion", "share_plus_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ShareSuccessManager implements PluginRegistry.ActivityResultListener {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MethodChannel.Result callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AtomicBoolean isCalledBack;

    public ShareSuccessManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isCalledBack = new AtomicBoolean(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m82049a(String result) {
        MethodChannel.Result result2;
        if (!this.isCalledBack.compareAndSet(false, true) || (result2 = this.callback) == null) {
            return;
        }
        Intrinsics.checkNotNull(result2);
        result2.success(result);
        this.callback = null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m82050b(@NotNull MethodChannel.Result callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.isCalledBack.compareAndSet(true, false)) {
            callback.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        SharePlusPendingIntent.INSTANCE.setResult("");
        this.isCalledBack.set(false);
        this.callback = callback;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m82051c() {
        m82049a("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 22643) {
            return false;
        }
        m82049a(SharePlusPendingIntent.INSTANCE.getResult());
        return true;
    }
}
