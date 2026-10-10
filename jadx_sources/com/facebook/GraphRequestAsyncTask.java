package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: GraphRequestAsyncTask.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 %2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001&B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0015\"\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR4\u0010$\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, m90084d2 = {"Lcom/facebook/GraphRequestAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/GraphRequestBatch;", "requests", "<init>", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V", "(Lcom/facebook/GraphRequestBatch;)V", "", "toString", "()Ljava/lang/String;", "", "onPreExecute", "()V", DbParams.KEY_CHANNEL_RESULT, "b", "(Ljava/util/List;)V", "", ReportDataTable.COLUMN_PARAMS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Ljava/lang/Void;)Ljava/util/List;", "Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphRequestBatch;", "getRequests", "()Lcom/facebook/GraphRequestBatch;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "c", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "d", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<? extends GraphResponse>> {

    /* JADX INFO: renamed from: e */
    public static final String f7581e = GraphRequestAsyncTask.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GraphRequestBatch requests;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Exception exception;

    public GraphRequestAsyncTask(@Nullable HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.connection = httpURLConnection;
        this.requests = requests;
    }

    @NotNull
    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(@NotNull GraphRequestBatch requests) {
        this(null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }

    @VisibleForTesting(otherwise = 4)
    @Nullable
    /* JADX INFO: renamed from: a */
    public List<GraphResponse> m7714a(@NotNull Void... params) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(params, "params");
                try {
                    HttpURLConnection httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        return this.requests.m7724e();
                    }
                    return GraphRequest.INSTANCE.executeConnectionAndWait(httpURLConnection, this.requests);
                } catch (Exception e11) {
                    this.exception = e11;
                    return null;
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            C42757a.m93687b(th3, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7715b(@NotNull List<GraphResponse> result) {
        if (!C42757a.m93689d(this)) {
            try {
                if (!C42757a.m93689d(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(result, "result");
                        super.onPostExecute(result);
                        Exception exc = this.exception;
                        if (exc != null) {
                            String str = f7581e;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                            C5760c.m10065e0(str, str2);
                        }
                    } catch (Throwable th2) {
                        C42757a.m93687b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C42757a.m93687b(th3, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends GraphResponse> doInBackground(Void[] voidArr) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                return m7714a(voidArr);
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            C42757a.m93687b(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends GraphResponse> list) {
        if (!C42757a.m93689d(this)) {
            try {
                if (!C42757a.m93689d(this)) {
                    try {
                        m7715b(list);
                    } catch (Throwable th2) {
                        C42757a.m93687b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C42757a.m93687b(th3, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    @VisibleForTesting(otherwise = 4)
    public void onPreExecute() {
        Handler handler;
        if (!C42757a.m93689d(this)) {
            try {
                if (!C42757a.m93689d(this)) {
                    try {
                        super.onPreExecute();
                        if (C5501a.m7766B()) {
                            String str = f7581e;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                            C5760c.m10065e0(str, str2);
                        }
                        if (this.requests.getCallbackHandler() == null) {
                            if (Thread.currentThread() instanceof HandlerThread) {
                                handler = new Handler();
                            } else {
                                handler = new Handler(Looper.getMainLooper());
                            }
                            this.requests.m7719F(handler);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        C42757a.m93687b(th2, this);
                        return;
                    }
                    C42757a.m93687b(th, this);
                }
            } catch (Throwable th3) {
                C42757a.m93687b(th3, this);
            }
        }
    }
}
