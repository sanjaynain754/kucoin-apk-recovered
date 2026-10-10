package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.module.annotations.ReactModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeadlessJsTaskSupportModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = NativeHeadlessJsTaskSupportSpec.NAME)
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;", "Lcom/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "notifyTaskRetry", "", "taskIdDouble", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "notifyTaskFinished", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double taskIdDouble) {
        int i11 = (int) taskIdDouble;
        HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (headlessJsTaskContext.isTaskRunning(i11)) {
            headlessJsTaskContext.lambda$scheduleTaskTimeout$0(i11);
        } else {
            C45999a.m101486G(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i11));
        }
    }

    public HeadlessJsTaskSupportModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double taskIdDouble, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        int i11 = (int) taskIdDouble;
        HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (headlessJsTaskContext.isTaskRunning(i11)) {
            promise.resolve(Boolean.valueOf(headlessJsTaskContext.retryTask(i11)));
        } else {
            C45999a.m101486G(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i11));
            promise.resolve(Boolean.FALSE);
        }
    }
}
