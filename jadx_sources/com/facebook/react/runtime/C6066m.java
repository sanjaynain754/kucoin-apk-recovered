package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: renamed from: com.facebook.react.runtime.m */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes45.dex */
public final /* synthetic */ class C6066m implements Continuation {
    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        return (Task) task.getResult();
    }
}
