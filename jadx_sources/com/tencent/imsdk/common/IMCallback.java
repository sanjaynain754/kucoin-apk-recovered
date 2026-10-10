package com.tencent.imsdk.common;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import com.tencent.imsdk.p128v2.V2TIMCompleteCallback;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;

/* JADX INFO: loaded from: classes59.dex */
public abstract class IMCallback<T> {
    protected V2TIMCallback callback;
    protected V2TIMCompleteCallback<T> completeCallback;
    protected V2TIMValueCallback<T> valueCallback;

    public IMCallback(V2TIMCallback v2TIMCallback) {
        this.callback = v2TIMCallback;
    }

    public void fail(final int i11, final String str) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.common.IMCallback.2
            @Override // java.lang.Runnable
            public void run() {
                IMCallback iMCallback = IMCallback.this;
                V2TIMCallback v2TIMCallback = iMCallback.callback;
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(i11, str);
                    return;
                }
                V2TIMValueCallback<T> v2TIMValueCallback = iMCallback.valueCallback;
                if (v2TIMValueCallback != null) {
                    v2TIMValueCallback.onError(i11, str);
                }
            }
        });
    }

    public void fail(final int i11, final String str, final T t11) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.common.IMCallback.3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                IMCallback iMCallback = IMCallback.this;
                V2TIMCallback v2TIMCallback = iMCallback.callback;
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(i11, str);
                    return;
                }
                V2TIMValueCallback<T> v2TIMValueCallback = iMCallback.valueCallback;
                if (v2TIMValueCallback != null) {
                    v2TIMValueCallback.onError(i11, str);
                    return;
                }
                V2TIMCompleteCallback<T> v2TIMCompleteCallback = iMCallback.completeCallback;
                if (v2TIMCompleteCallback != 0) {
                    v2TIMCompleteCallback.onComplete(i11, str, t11);
                }
            }
        });
    }

    public IMCallback(V2TIMValueCallback<T> v2TIMValueCallback) {
        this.valueCallback = v2TIMValueCallback;
    }

    public void success(final T t11) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.common.IMCallback.1
            @Override // java.lang.Runnable
            public void run() {
                IMCallback iMCallback = IMCallback.this;
                V2TIMCallback v2TIMCallback = iMCallback.callback;
                if (v2TIMCallback != null) {
                    v2TIMCallback.onSuccess();
                    return;
                }
                V2TIMValueCallback<T> v2TIMValueCallback = iMCallback.valueCallback;
                if (v2TIMValueCallback != null) {
                    v2TIMValueCallback.onSuccess((T) t11);
                    return;
                }
                V2TIMCompleteCallback<T> v2TIMCompleteCallback = iMCallback.completeCallback;
                if (v2TIMCompleteCallback != null) {
                    v2TIMCompleteCallback.onComplete(0, "", (T) t11);
                }
            }
        });
    }

    public IMCallback(V2TIMCompleteCallback<T> v2TIMCompleteCallback) {
        this.completeCallback = v2TIMCompleteCallback;
    }
}
