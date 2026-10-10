package com.tencent.qcloud.tim.push.unity;

import com.tencent.qcloud.tim.push.TIMPushListener;
import com.tencent.qcloud.tim.push.TIMPushMessage;

/* JADX INFO: loaded from: classes56.dex */
public abstract class UnityPushListener {

    public interface IJava2CSharpListener {
        void onNotificationClicked(String str);

        void onRecvPushMessage(TIMPushMessage tIMPushMessage);

        void onRevokePushMessage(String str);
    }

    public static TIMPushListener createPushListener(final IJava2CSharpListener iJava2CSharpListener) {
        return new TIMPushListener() { // from class: com.tencent.qcloud.tim.push.unity.UnityPushListener.1
            @Override // com.tencent.qcloud.tim.push.TIMPushListener
            public void onNotificationClicked(String str) {
                iJava2CSharpListener.onNotificationClicked(str);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushListener
            public void onRecvPushMessage(TIMPushMessage tIMPushMessage) {
                iJava2CSharpListener.onRecvPushMessage(tIMPushMessage);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushListener
            public void onRevokePushMessage(String str) {
                iJava2CSharpListener.onRevokePushMessage(str);
            }
        };
    }
}
