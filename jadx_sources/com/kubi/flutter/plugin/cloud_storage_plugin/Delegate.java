package com.kubi.flutter.plugin.cloud_storage_plugin;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.otc.entity.OtcAd;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: Delegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR*\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"¨\u0006%"}, m90084d2 = {"Lcom/kubi/flutter/plugin/cloud_storage_plugin/Delegate;", "", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "d", "(Landroid/app/Activity;)V", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "b", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "key", "value", "e", "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V", "c", "(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)Z", "Landroid/app/Activity;", "Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;", "Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;", "storage", "Lkotlin/Triple;", "Lkotlin/Triple;", "currentData", "Companion", "cloud_storage_plugin_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class Delegate implements PluginRegistry.ActivityResultListener {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Activity activity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final GoogleDriveStorage storage = new GoogleDriveStorage();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Triple<String, String, ? extends MethodChannel.Result> currentData;

    /* JADX INFO: renamed from: com.kubi.flutter.plugin.cloud_storage_plugin.Delegate$onActivityResult$1 */
    /* JADX INFO: compiled from: Delegate.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.flutter.plugin.cloud_storage_plugin.Delegate$onActivityResult$1", m90122f = "Delegate.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C126281 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C12632c $driveHelper;
        final /* synthetic */ Triple<String, String, MethodChannel.Result> $triple;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126281(C12632c c12632c, Triple<String, String, ? extends MethodChannel.Result> triple, Continuation<? super C126281> continuation) {
            super(2, continuation);
            this.$driveHelper = c12632c;
            this.$triple = triple;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Delegate.this.new C126281(this.$driveHelper, this.$triple, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C126281) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    GoogleDriveStorage googleDriveStorage = Delegate.this.storage;
                    C12632c c12632c = this.$driveHelper;
                    String first = this.$triple.getFirst();
                    String second = this.$triple.getSecond();
                    this.label = 1;
                    obj = googleDriveStorage.m23884i(c12632c, first, second, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.$triple.getThird().success(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                C12631b.f22061a.m23888a(th2, "CloudStoragePlugin");
                this.$triple.getThird().success(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.plugin.cloud_storage_plugin.Delegate$onActivityResult$2 */
    /* JADX INFO: compiled from: Delegate.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.flutter.plugin.cloud_storage_plugin.Delegate$onActivityResult$2", m90122f = "Delegate.kt", m90123i = {}, m90124l = {96}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C126292 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C12632c $driveHelper;
        final /* synthetic */ Triple<String, String, MethodChannel.Result> $triple;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126292(C12632c c12632c, Triple<String, String, ? extends MethodChannel.Result> triple, Continuation<? super C126292> continuation) {
            super(2, continuation);
            this.$driveHelper = c12632c;
            this.$triple = triple;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Delegate.this.new C126292(this.$driveHelper, this.$triple, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C126292) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    GoogleDriveStorage googleDriveStorage = Delegate.this.storage;
                    C12632c c12632c = this.$driveHelper;
                    String first = this.$triple.getFirst();
                    this.label = 1;
                    obj = googleDriveStorage.m23881f(c12632c, first, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.$triple.getThird().success((String) obj);
            } catch (Throwable th2) {
                C12631b.f22061a.m23888a(th2, "CloudStoragePlugin");
                this.$triple.getThird().success(OtcAd.KYC_NOT_PASS);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23872b(@NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Activity activity = this.activity;
        if (activity == null) {
            result.error(OtcAd.KYC_NOT_PASS, "activity is null", null);
        } else {
            result.success(Boolean.valueOf(this.storage.m23878c(activity)));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m23873c(@NotNull String key, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(result, "result");
        Activity activity = this.activity;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            result.error(OtcAd.KYC_NOT_PASS, "activity is null", null);
            return;
        }
        C44128b.m97265i("Delegate:getCloudStorageValue");
        if (!this.storage.m23878c(fragmentActivity)) {
            result.success(OtcAd.KYC_NOT_PASS);
            return;
        }
        this.currentData = new Triple<>(key, "", result);
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.startActivityForResult(this.storage.m23885j(fragmentActivity), 200002);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23874d(@Nullable Activity activity) {
        this.activity = activity;
        if (activity == null) {
            this.currentData = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m23875e(@NotNull String key, @NotNull String value, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(result, "result");
        Activity activity = this.activity;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            result.error(OtcAd.KYC_NOT_PASS, "activity is null", null);
            return;
        }
        C44128b.m97265i("Delegate:setCloudStorageValue");
        if (!this.storage.m23878c(fragmentActivity)) {
            result.success(Boolean.FALSE);
            return;
        }
        this.currentData = new Triple<>(key, value, result);
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.startActivityForResult(this.storage.m23885j(fragmentActivity), 200001);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Triple<String, String, ? extends MethodChannel.Result> triple;
        Activity activity = this.activity;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (triple = this.currentData) == null) {
            return false;
        }
        C12632c c12632cM23880e = this.storage.m23880e(fragmentActivity, data);
        switch (requestCode) {
            case 200001:
                if (c12632cM23880e == null) {
                    triple.getThird().success(Boolean.FALSE);
                } else {
                    LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new C126281(c12632cM23880e, triple, null));
                }
                break;
            case 200002:
                if (c12632cM23880e == null) {
                    triple.getThird().success(OtcAd.KYC_NOT_PASS);
                } else {
                    LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new C126292(c12632cM23880e, triple, null));
                }
                break;
        }
        this.currentData = null;
        return false;
    }
}
