package com.tencent.timpush.fcm;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TIMPushFCMWorker extends ListenableWorker {

    /* JADX INFO: renamed from: a */
    public static final String f76637a = "TIMPushFCMWorker";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object m78954a(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            Data inputData = getInputData();
            HashMap map = new HashMap();
            map.put("url", inputData.getString("url"));
            map.put("pushId", inputData.getString("pushId"));
            map.put("time", Long.valueOf(inputData.getLong("time", System.currentTimeMillis() / 1000)));
            map.put("type", Integer.valueOf(inputData.getInt("type", 1)));
            TUICore.callService("TIMPushService", "reportPushMessageData", map, new TUIServiceCallback() { // from class: com.tencent.timpush.fcm.TIMPushFCMWorker.1
                @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
                public void onServiceCallback(int i11, String str, Bundle bundle) {
                    TIMPushLog.m78956d(TIMPushFCMWorker.f76637a, "Service callback success. Task finished.");
                    completer.set(ListenableWorker.Result.success());
                }
            });
            return "TIMPushReport";
        } catch (Exception e11) {
            TIMPushLog.m78957e(f76637a, "doWork exception:" + e11);
            completer.set(ListenableWorker.Result.failure());
            return "TIMPushReport";
        }
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture<ListenableWorker.Result> startWork() {
        TIMPushLog.m78956d(f76637a, "Starting asynchronous work.");
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.tencent.timpush.fcm.d
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f76641a.m78954a(completer);
            }
        });
    }

    public TIMPushFCMWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
