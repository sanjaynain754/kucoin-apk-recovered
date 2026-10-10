package com.tencent.qcloud.tim.push.unity;

import com.tencent.qcloud.tim.push.TIMPushCallback;

/* JADX INFO: loaded from: classes56.dex */
public class UnityPushCallback {

    public interface IJava2CSharpCallback {
        void onError(int i11, String str, Object obj);

        void onSuccess(Object obj);
    }

    public static TIMPushCallback createPushCallback(final IJava2CSharpCallback iJava2CSharpCallback) {
        return new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.unity.UnityPushCallback.1
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(int i11, String str, Object obj) {
                iJava2CSharpCallback.onError(i11, str, obj);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                iJava2CSharpCallback.onSuccess(obj);
            }
        };
    }
}
