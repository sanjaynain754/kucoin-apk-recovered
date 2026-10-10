package com.kubi.utils;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import v70.C45463a;

/* JADX INFO: compiled from: ActivityResultLauncherWrapper.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/utils/ActivityResultLauncherWrapper;", "I", "O", "Landroidx/activity/result/ActivityResultCallback;", "<init>", "()V", "input", TUIConstants.TUIChat.CALL_BACK, "", "b", "(Ljava/lang/Object;Landroidx/activity/result/ActivityResultCallback;)V", DbParams.KEY_CHANNEL_RESULT, "onActivityResult", "(Ljava/lang/Object;)V", "Landroidx/activity/result/ActivityResultLauncher;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "Landroidx/activity/result/ActivityResultCallback;", "c", "Companion", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ActivityResultLauncherWrapper<I, O> implements ActivityResultCallback<O> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ActivityResultLauncher<I> launcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ActivityResultCallback<O> callback;

    /* JADX INFO: compiled from: ActivityResultLauncherWrapper.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\nH\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/utils/ActivityResultLauncherWrapper$Companion;", "", "()V", "registerForActivityResult", "Lcom/kubi/utils/ActivityResultLauncherWrapper;", "I", "O", "activity", "Landroidx/activity/result/ActivityResultCaller;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final <I, O> ActivityResultLauncherWrapper<I, O> registerForActivityResult(@NotNull ActivityResultCaller activity, @NotNull ActivityResultContract<I, O> contract) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(contract, "contract");
            ActivityResultLauncherWrapper<I, O> activityResultLauncherWrapper = new ActivityResultLauncherWrapper<>();
            ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = activity.registerForActivityResult(contract, activityResultLauncherWrapper);
            Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "activity.registerForActivityResult(contract, this)");
            activityResultLauncherWrapper.launcher = activityResultLauncherRegisterForActivityResult;
            return activityResultLauncherWrapper;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66355b(I input, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = new C27062m0(callback);
        try {
            ActivityResultLauncher<I> activityResultLauncher = this.launcher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("launcher");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(input);
        } catch (Throwable th2) {
            callback.onActivityResult(null);
            C45463a.m100408a(th2, "ActivityResultLauncherWrapper");
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(O result) {
        ActivityResultCallback<O> activityResultCallback = this.callback;
        if (activityResultCallback != null) {
            activityResultCallback.onActivityResult(result);
        }
    }
}
