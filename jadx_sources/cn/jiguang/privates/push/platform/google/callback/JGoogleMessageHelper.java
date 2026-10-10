package cn.jiguang.privates.push.platform.google.callback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.RemoteMessage;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class JGoogleMessageHelper {
    private static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    private static final int IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    @Nullable
    public static RemoteMessage handleMessageIntent(Context context, Intent intent) {
        String stringExtra;
        Bundle extras;
        try {
            String action = intent.getAction();
            if (action != null && action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                String stringExtra2 = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
                if (stringExtra2 == null) {
                    stringExtra2 = Constants.MessageTypes.MESSAGE;
                }
                if (!stringExtra2.equals(Constants.MessageTypes.MESSAGE) || (stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID)) == null || alreadyReceivedMessage(stringExtra) || (extras = intent.getExtras()) == null) {
                    return null;
                }
                return new RemoteMessage(extras);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void addMessageId(String str) {
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.size() >= 10) {
            queue.poll();
        }
        queue.add(str);
    }

    public static boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (recentlyReceivedMessageIds.contains(str)) {
            return true;
        }
        addMessageId(str);
        return false;
    }
}
