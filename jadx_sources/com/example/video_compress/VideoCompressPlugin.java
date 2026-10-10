package com.example.video_compress;

import aa0.C0217e;
import aa0.C0218f;
import aa0.InterfaceC0214b;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import ba0.C4524a;
import ba0.C4526c;
import ba0.C4527d;
import ba0.InterfaceC4528e;
import com.facebook.react.uimanager.ViewProps;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p783y2.C46365a;
import p783y2.C46366b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import q90.C43672c;
import q90.InterfaceC43673d;
import w90.C45770i;

/* JADX INFO: compiled from: VideoCompressPlugin.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, m90084d2 = {"Lcom/example/video_compress/VideoCompressPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Landroid/content/Context;", "context", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "b", "(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V", "Landroid/content/Context;", "_context", "Lio/flutter/plugin/common/MethodChannel;", "c", "Lio/flutter/plugin/common/MethodChannel;", "_channel", "", "d", "Ljava/lang/String;", "TAG", "Lw90/i;", "e", "Lw90/i;", "LOG", "Ljava/util/concurrent/Future;", "Ljava/lang/Void;", "f", "Ljava/util/concurrent/Future;", "transcodeFuture", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "setChannelName", "(Ljava/lang/String;)V", "channelName", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "video_compress_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class VideoCompressPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Context _context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MethodChannel _channel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Future<Void> transcodeFuture;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "VideoCompressPlugin";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C45770i LOG = new C45770i("VideoCompressPlugin");

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String channelName = "video_compress";

    /* JADX INFO: renamed from: com.example.video_compress.VideoCompressPlugin$a */
    /* JADX INFO: compiled from: VideoCompressPlugin.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"com/example/video_compress/VideoCompressPlugin$a", "Lq90/d;", "", "progress", "", "c", "(D)V", "", "successCode", "b", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "", "exception", "d", "(Ljava/lang/Throwable;)V", "video_compress_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C5470a implements InterfaceC43673d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MethodChannel f7512a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoCompressPlugin f7513b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f7514c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f7515d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ MethodChannel.Result f7516e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f7517f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f7518g;

        public C5470a(MethodChannel methodChannel, VideoCompressPlugin videoCompressPlugin, Context context, String str, MethodChannel.Result result, boolean z11, String str2) {
            this.f7512a = methodChannel;
            this.f7513b = videoCompressPlugin;
            this.f7514c = context;
            this.f7515d = str;
            this.f7516e = result;
            this.f7517f = z11;
            this.f7518g = str2;
        }

        @Override // q90.InterfaceC43673d
        /* JADX INFO: renamed from: a */
        public void mo7553a() {
            this.f7516e.success(null);
        }

        @Override // q90.InterfaceC43673d
        /* JADX INFO: renamed from: b */
        public void mo7554b(int successCode) throws JSONException, IOException {
            this.f7512a.invokeMethod("updateProgress", Double.valueOf(100.0d));
            JSONObject jSONObjectM102259d = new C46366b(this.f7513b.getChannelName()).m102259d(this.f7514c, this.f7515d);
            jSONObjectM102259d.put("isCancel", false);
            this.f7516e.success(jSONObjectM102259d.toString());
            if (this.f7517f) {
                new File(this.f7518g).delete();
            }
        }

        @Override // q90.InterfaceC43673d
        /* JADX INFO: renamed from: c */
        public void mo7555c(double progress) {
            this.f7512a.invokeMethod("updateProgress", Double.valueOf(progress * 100.0d));
        }

        @Override // q90.InterfaceC43673d
        /* JADX INFO: renamed from: d */
        public void mo7556d(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f7516e.success(null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: b */
    public final void m7552b(Context context, BinaryMessenger messenger) {
        MethodChannel methodChannel = new MethodChannel(messenger, this.channelName);
        methodChannel.setMethodCallHandler(this);
        this._context = context;
        this._channel = methodChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        m7552b(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this._channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this._context = null;
        this._channel = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        InterfaceC4528e c4527d;
        MethodChannel.Result result2 = result;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result2, "result");
        Context context = this._context;
        MethodChannel methodChannel = this._channel;
        if (context == null || methodChannel == null) {
            Log.w(this.TAG, "Calling VideoCompress plugin before initialization");
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1335238004:
                    if (str.equals("cancelCompression")) {
                        Future<Void> future = this.transcodeFuture;
                        if (future != null) {
                            future.cancel(true);
                        }
                        result2.success(Boolean.FALSE);
                        return;
                    }
                    break;
                case -442064102:
                    if (str.equals("getFileThumbnail")) {
                        String str2 = (String) call.argument("path");
                        Object objArgument = call.argument(C33757kf.f70665k);
                        Intrinsics.checkNotNull(objArgument);
                        int iIntValue = ((Number) objArgument).intValue();
                        Object objArgument2 = call.argument(ViewProps.POSITION);
                        Intrinsics.checkNotNull(objArgument2);
                        int iIntValue2 = ((Number) objArgument2).intValue();
                        C46365a c46365a = new C46365a("video_compress");
                        Intrinsics.checkNotNull(str2);
                        c46365a.m102255b(context, str2, iIntValue, iIntValue2, result2);
                        return;
                    }
                    break;
                case -309915358:
                    if (str.equals("setLogLevel")) {
                        Object objArgument3 = call.argument("logLevel");
                        Intrinsics.checkNotNull(objArgument3);
                        C45770i.m101063f(((Number) objArgument3).intValue());
                        result2.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -281136852:
                    if (str.equals("deleteAllCache")) {
                        new C46366b(this.channelName).m102256a(context, result2);
                        result2.success(Unit.INSTANCE);
                        return;
                    }
                    break;
                case 1306162446:
                    if (str.equals("getByteThumbnail")) {
                        String str3 = (String) call.argument("path");
                        Object objArgument4 = call.argument(C33757kf.f70665k);
                        Intrinsics.checkNotNull(objArgument4);
                        int iIntValue3 = ((Number) objArgument4).intValue();
                        Object objArgument5 = call.argument(ViewProps.POSITION);
                        Intrinsics.checkNotNull(objArgument5);
                        int iIntValue4 = ((Number) objArgument5).intValue();
                        C46365a c46365a2 = new C46365a(this.channelName);
                        Intrinsics.checkNotNull(str3);
                        c46365a2.m102254a(str3, iIntValue3, iIntValue4, result);
                        return;
                    }
                    result2 = result;
                    break;
                case 1729824313:
                    if (str.equals("compressVideo")) {
                        Object objArgument6 = call.argument("path");
                        Intrinsics.checkNotNull(objArgument6);
                        String str4 = (String) objArgument6;
                        Object objArgument7 = call.argument(C33757kf.f70665k);
                        Intrinsics.checkNotNull(objArgument7);
                        int iIntValue5 = ((Number) objArgument7).intValue();
                        Object objArgument8 = call.argument("deleteOrigin");
                        Intrinsics.checkNotNull(objArgument8);
                        boolean zBooleanValue = ((Boolean) objArgument8).booleanValue();
                        Integer num = (Integer) call.argument("startTime");
                        Integer num2 = (Integer) call.argument(TypedValues.TransitionType.S_DURATION);
                        Boolean bool = (Boolean) call.argument("includeAudio");
                        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : true;
                        Integer num3 = call.argument("frameRate") == null ? 30 : (Integer) call.argument("frameRate");
                        File externalFilesDir = context.getExternalFilesDir("video_compress");
                        Intrinsics.checkNotNull(externalFilesDir);
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        String str5 = absolutePath + File.separator + "VID_" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + str4.hashCode() + ".mp4";
                        C4526c c4526cM4390b = C4526c.m4382b(340).m4390b();
                        Intrinsics.checkNotNullExpressionValue(c4526cM4390b, "build(...)");
                        switch (iIntValue5) {
                            case 0:
                                c4526cM4390b = C4526c.m4382b(720).m4390b();
                                break;
                            case 1:
                                c4526cM4390b = C4526c.m4382b(TXVodDownloadDataSource.QUALITY_360P).m4390b();
                                break;
                            case 2:
                                c4526cM4390b = C4526c.m4382b(C33556b3.f69051i).m4390b();
                                break;
                            case 3:
                                C4526c.b bVarM4389a = new C4526c.b().m4392d(3.0f).m4389a(3686400L);
                                Intrinsics.checkNotNull(num3);
                                c4526cM4390b = bVarM4389a.m4391c(num3.intValue()).m4390b();
                                break;
                            case 4:
                                c4526cM4390b = C4526c.m4383c(TXVodDownloadDataSource.QUALITY_480P, C33556b3.f69051i).m4390b();
                                break;
                            case 5:
                                c4526cM4390b = C4526c.m4383c(540, 960).m4390b();
                                break;
                            case 6:
                                c4526cM4390b = C4526c.m4383c(720, 1280).m4390b();
                                break;
                            case 7:
                                c4526cM4390b = C4526c.m4383c(TXVodDownloadDataSource.QUALITY_1080P, 1920).m4390b();
                                break;
                        }
                        if (zBooleanValue2) {
                            c4527d = C4524a.m4365b().m4370b(-1).m4372d(-1).m4369a();
                            Intrinsics.checkNotNull(c4527d);
                        } else {
                            c4527d = new C4527d();
                        }
                        InterfaceC0214b c0218f = (num == null && num2 == null) ? new C0218f(context, Uri.parse(str4)) : new C0217e(new C0218f(context, Uri.parse(str4)), (num != null ? num.intValue() : 0) * 1000000, (num2 != null ? num2.intValue() : 0) * 1000000);
                        Intrinsics.checkNotNull(str5);
                        this.transcodeFuture = C43672c.m96095b(str5).m96122a(c0218f).m96124c(c4527d).m96126e(c4526cM4390b).m96125d(new C5470a(methodChannel, this, context, str5, result, zBooleanValue, str4)).m96127f();
                        return;
                    }
                    break;
                case 2130520060:
                    if (str.equals("getMediaInfo")) {
                        String str6 = (String) call.argument("path");
                        C46366b c46366b = new C46366b(this.channelName);
                        Intrinsics.checkNotNull(str6);
                        result2.success(c46366b.m102259d(context, str6).toString());
                        return;
                    }
                    break;
            }
        }
        result2.notImplemented();
    }
}
