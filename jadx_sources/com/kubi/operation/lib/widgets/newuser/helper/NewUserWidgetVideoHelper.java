package com.kubi.operation.lib.widgets.newuser.helper;

import android.net.Uri;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.annotation.OptIn;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p022ui.PlayerView;
import com.blankj.utilcode.util.C5284n;
import com.blankj.utilcode.util.C5302w;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.monitor.utils.DeviceLevel;
import com.kubi.operation.lib.entity.NewUserVideoEntity;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.operation.lib.utils.OperationStoreId;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import cr.C36522b;
import java.io.Closeable;
import java.io.File;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41769w;
import o00.C42911a;
import o00.C42917g;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p772xs.C46329a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: NewUserWidgetVideoHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\u00020\u0011*\u00020\rH\u0002J\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0083@¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J.\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00052\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\u001fH\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/newuser/helper/NewUserWidgetVideoHelper;", "", "<init>", "()V", "videoFile", "Ljava/io/File;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "downloadAndPlay", "", "fragment", "Landroidx/fragment/app/Fragment;", "viewStub", "Landroid/view/ViewStub;", "url", "", "hasInflated", "", "pause", "resume", "onDestroy", "getFileByUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPlay", "playerView", "Landroidx/media3/ui/PlayerView;", "imgPlaceholderView", "Landroid/widget/ImageView;", "download", FirebaseAnalytics.Param.DESTINATION, "onResult", "Lkotlin/Function1;", "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewUserWidgetVideoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUserWidgetVideoHelper.kt\ncom/kubi/operation/lib/widgets/newuser/helper/NewUserWidgetVideoHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 5 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n+ 6 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,230:1\n153#2,2:231\n144#2,2:242\n178#3:233\n23#4,2:234\n52#5:236\n54#5:241\n45#5,2:245\n45#5,2:247\n47#6,4:237\n36#7:244\n*S KotlinDebug\n*F\n+ 1 NewUserWidgetVideoHelper.kt\ncom/kubi/operation/lib/widgets/newuser/helper/NewUserWidgetVideoHelper\n*L\n114#1:231,2\n138#1:242,2\n114#1:233\n191#1:234,2\n77#1:236\n77#1:241\n217#1:245,2\n225#1:247,2\n77#1:237,4\n180#1:244\n*E\n"})
public final class NewUserWidgetVideoHelper {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f36925c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public File f36926a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public ExoPlayer f36927b;

    /* JADX INFO: compiled from: NewUserWidgetVideoHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/newuser/helper/NewUserWidgetVideoHelper$Companion;", "", "<init>", "()V", "TAG", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.newuser.helper.NewUserWidgetVideoHelper$a */
    /* JADX INFO: compiled from: NewUserWidgetVideoHelper.kt */
    /* JADX INFO: loaded from: classes32.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/operation/lib/widgets/newuser/helper/NewUserWidgetVideoHelper$startPlay$1$1$1", "Landroidx/media3/common/Player$Listener;", "onRenderedFirstFrame", "", "onPlayerError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroidx/media3/common/PlaybackException;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19590a implements Player.Listener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ImageView f36928b;

        public C19590a(ImageView imageView) {
            this.f36928b = imageView;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            super.onPlayerError(error);
            C44128b.m97263g("NewUserWidgetVideoHelper", error);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
            C27046k.m66700o(this.f36928b);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m43750A(NewUserWidgetVideoHelper newUserWidgetVideoHelper) {
        ExoPlayer exoPlayer;
        ExoPlayer exoPlayer2 = newUserWidgetVideoHelper.f36927b;
        if (exoPlayer2 != null && !exoPlayer2.isPlaying() && (exoPlayer = newUserWidgetVideoHelper.f36927b) != null) {
            exoPlayer.play();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m43751C(NewUserWidgetVideoHelper newUserWidgetVideoHelper, PlayerView playerView, File file, ImageView imageView) {
        ExoPlayer exoPlayer = newUserWidgetVideoHelper.f36927b;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = newUserWidgetVideoHelper.f36927b;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        newUserWidgetVideoHelper.f36927b = null;
        playerView.setKeepContentOnPlayerReset(true);
        DefaultRenderersFactory defaultRenderersFactoryForceDisableMediaCodecAsynchronousQueueing = new DefaultRenderersFactory(playerView.getContext()).setEnableDecoderFallback(true).forceDisableMediaCodecAsynchronousQueueing();
        Intrinsics.checkNotNullExpressionValue(defaultRenderersFactoryForceDisableMediaCodecAsynchronousQueueing, "forceDisableMediaCodecAsynchronousQueueing(...)");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(playerView.getContext(), defaultRenderersFactoryForceDisableMediaCodecAsynchronousQueueing).build();
        exoPlayerBuild.setVideoScalingMode(2);
        playerView.setPlayer(exoPlayerBuild);
        exoPlayerBuild.addListener(new C19590a(imageView));
        MediaItem mediaItemFromUri = MediaItem.fromUri(Uri.fromFile(file));
        Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
        exoPlayerBuild.setMediaItem(mediaItemFromUri);
        exoPlayerBuild.setRepeatMode(1);
        exoPlayerBuild.prepare();
        exoPlayerBuild.setPlayWhenReady(true);
        newUserWidgetVideoHelper.f36927b = exoPlayerBuild;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, okhttp3.Response] */
    /* JADX INFO: renamed from: o */
    public static final void m43765o(String str, Function1 function1, File file) {
        Function0 function0;
        Function0 function2;
        Throwable th2;
        BufferedSink bufferedSink;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            ?? Execute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(new Request.Builder().url(str).build()));
            objectRef.element = Execute;
            ResponseBody responseBodyBody = Execute.body();
            if (((Response) objectRef.element).isSuccessful() && responseBodyBody != null) {
                if (C5284n.m6303f(file)) {
                    try {
                        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file, false, 1, null));
                        try {
                            bufferedSinkBuffer.writeAll(responseBodyBody.getBodySource());
                            Util.closeQuietly(bufferedSinkBuffer);
                            function1.invoke(file);
                            C44128b.m97259c("NewUserWidgetVideoHelper", "download success. destination=$" + file.getAbsolutePath());
                            Util.closeQuietly(bufferedSinkBuffer);
                        } catch (Throwable th3) {
                            th2 = th3;
                            bufferedSink = bufferedSinkBuffer;
                            try {
                                C44128b.m97263g("NewUserWidgetVideoHelper", th2);
                                function1.invoke(null);
                                if (!C42899b.m94075e(th2)) {
                                    C43846g.m96568c(new OperationException(th2, "NewUserWidgetVideoHelper", false, null, 8, null), null, 2, null);
                                }
                                if (bufferedSink != null) {
                                    Util.closeQuietly(bufferedSink);
                                }
                            } catch (Throwable th4) {
                                if (bufferedSink == null) {
                                    throw th4;
                                }
                                Util.closeQuietly(bufferedSink);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        bufferedSink = null;
                    }
                    Util.closeQuietly((Closeable) objectRef.element);
                    function0 = new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.h
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewUserWidgetVideoHelper.m43766p(objectRef);
                        }
                    };
                } else {
                    C44128b.m97259c("NewUserWidgetVideoHelper", "destination create failed. destination=$" + file.getAbsolutePath());
                    function1.invoke(null);
                    function2 = new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.h
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewUserWidgetVideoHelper.m43766p(objectRef);
                        }
                    };
                }
                C27100x0.m66924e(function0);
                return;
            }
            C44128b.m97259c("NewUserWidgetVideoHelper", "response not successful. " + objectRef.element);
            function1.invoke(null);
            function2 = new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewUserWidgetVideoHelper.m43766p(objectRef);
                }
            };
            C27100x0.m66924e(function2);
        } catch (Throwable th6) {
            try {
                C44128b.m97263g("NewUserWidgetVideoHelper", th6);
                function1.invoke(null);
                if (!C42899b.m94075e(th6)) {
                    C43846g.m96568c(new OperationException(th6, "NewUserWidgetVideoHelper", false, null, 8, null), null, 2, null);
                }
                function0 = new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewUserWidgetVideoHelper.m43766p(objectRef);
                    }
                };
            } catch (Throwable th7) {
                C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewUserWidgetVideoHelper.m43766p(objectRef);
                    }
                });
                throw th7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final Unit m43766p(Ref.ObjectRef objectRef) {
        Response response = (Response) objectRef.element;
        if (response != null) {
            Util.closeQuietly(response);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m43768t(NewUserVideoEntity newUserVideoEntity, String str, InterfaceC41769w interfaceC41769w, File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("downloaded-file: ");
        sb2.append(file != null ? file.getAbsolutePath() : null);
        C44128b.m97266j("NewUserWidgetVideoHelper", sb2.toString());
        if (file != null) {
            if (DayNightThemeManager.f28592a.m33187l()) {
                newUserVideoEntity.setDayVideoUrl(str);
                newUserVideoEntity.setDayFilePath(file.getAbsolutePath());
            } else {
                newUserVideoEntity.setDarkVideoUrl(str);
                newUserVideoEntity.setDarkFilePath(file.getAbsolutePath());
            }
            C46392a.m102331n(OperationStoreId.f36892a.m43685f(), newUserVideoEntity);
        }
        interfaceC41769w.mo91370n(file);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m43769w(NewUserWidgetVideoHelper newUserWidgetVideoHelper) {
        ExoPlayer exoPlayer = newUserWidgetVideoHelper.f36927b;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = newUserWidgetVideoHelper.f36927b;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        newUserWidgetVideoHelper.f36927b = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m43770y(NewUserWidgetVideoHelper newUserWidgetVideoHelper) {
        ExoPlayer exoPlayer;
        ExoPlayer exoPlayer2 = newUserWidgetVideoHelper.f36927b;
        if (exoPlayer2 != null && exoPlayer2.isPlaying() && (exoPlayer = newUserWidgetVideoHelper.f36927b) != null) {
            exoPlayer.pause();
        }
        return Unit.INSTANCE;
    }

    @OptIn(markerClass = {UnstableApi.class})
    /* JADX INFO: renamed from: B */
    public final void m43771B(final File file, final PlayerView playerView, final ImageView imageView) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidgetVideoHelper.m43751C(this.f36936b, playerView, file, imageView);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public final void m43772n(final String str, final File file, final Function1<? super File, Unit> function1) {
        C42917g.m94138d().execute(new Runnable() { // from class: com.kubi.operation.lib.widgets.newuser.helper.g
            @Override // java.lang.Runnable
            public final void run() {
                NewUserWidgetVideoHelper.m43765o(str, function1, file);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m43773q(@NotNull final Fragment fragment, @NotNull final ViewStub viewStub, @NotNull final String url) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        Intrinsics.checkNotNullParameter(url, "url");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidgetVideoHelper.m43767r(url, this, viewStub, fragment);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final Object m43774s(final String str, Continuation<? super File> continuation) {
        NewUserWidgetVideoHelper$getFileByUrl$1 newUserWidgetVideoHelper$getFileByUrl$1;
        if (continuation instanceof NewUserWidgetVideoHelper$getFileByUrl$1) {
            newUserWidgetVideoHelper$getFileByUrl$1 = (NewUserWidgetVideoHelper$getFileByUrl$1) continuation;
            int i11 = newUserWidgetVideoHelper$getFileByUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                newUserWidgetVideoHelper$getFileByUrl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                newUserWidgetVideoHelper$getFileByUrl$1 = new NewUserWidgetVideoHelper$getFileByUrl$1(this, continuation);
            }
        } else {
            newUserWidgetVideoHelper$getFileByUrl$1 = new NewUserWidgetVideoHelper$getFileByUrl$1(this, continuation);
        }
        Object obj = newUserWidgetVideoHelper$getFileByUrl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = newUserWidgetVideoHelper$getFileByUrl$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            final NewUserVideoEntity newUserVideoEntity = (NewUserVideoEntity) C46392a.f104043a.m102336j(OperationStoreId.f36892a.m43685f(), NewUserVideoEntity.class, null);
            if (newUserVideoEntity == null) {
                newUserVideoEntity = new NewUserVideoEntity(null, null, null, null, 15, null);
            }
            if (Intrinsics.areEqual(str, newUserVideoEntity.getDayVideoUrl()) && C5284n.m6313p(newUserVideoEntity.getDayFilePath())) {
                C44128b.m97266j("NewUserWidgetVideoHelper", "day-exist,use: " + newUserVideoEntity.getDayFilePath());
                return C5284n.m6311n(C27041f.m66668h(newUserVideoEntity.getDayFilePath()));
            }
            if (Intrinsics.areEqual(str, newUserVideoEntity.getDarkVideoUrl()) && C5284n.m6313p(newUserVideoEntity.getDarkFilePath())) {
                C44128b.m97266j("NewUserWidgetVideoHelper", "dark-exist,use: " + newUserVideoEntity.getDarkFilePath());
                return C5284n.m6311n(C27041f.m66668h(newUserVideoEntity.getDarkFilePath()));
            }
            int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C5302w.m6510e());
            sb2.append('/');
            String strSubstring = str.substring(iLastIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            String string = sb2.toString();
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            m43772n(str, new File(string), new Function1() { // from class: com.kubi.operation.lib.widgets.newuser.helper.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return NewUserWidgetVideoHelper.m43768t(newUserVideoEntity, str, interfaceC41769wM91388c, (File) obj2);
                }
            });
            newUserWidgetVideoHelper$getFileByUrl$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            newUserWidgetVideoHelper$getFileByUrl$1.L$1 = SpillingKt.nullOutSpilledVariable(newUserVideoEntity);
            newUserWidgetVideoHelper$getFileByUrl$1.L$2 = SpillingKt.nullOutSpilledVariable(string);
            newUserWidgetVideoHelper$getFileByUrl$1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
            newUserWidgetVideoHelper$getFileByUrl$1.I$0 = iLastIndexOf$default;
            newUserWidgetVideoHelper$getFileByUrl$1.label = 1;
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(newUserWidgetVideoHelper$getFileByUrl$1);
            return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
        } catch (Throwable th2) {
            C44128b.m97263g("NewUserWidgetVideoHelper", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m43776v() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidgetVideoHelper.m43769w(this.f36930b);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m43777x() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidgetVideoHelper.m43770y(this.f36931b);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m43778z() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.helper.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidgetVideoHelper.m43750A(this.f36929b);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m43767r(String str, NewUserWidgetVideoHelper newUserWidgetVideoHelper, ViewStub viewStub, Fragment fragment) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        DeviceLevel deviceLevelM81777g = C36522b.f79371a.m81777g();
        if (deviceLevelM81777g.getValue() <= DeviceLevel.LOW.getValue()) {
            C44128b.m97266j("NewUserWidgetVideoHelper", "lowDevice(" + deviceLevelM81777g + "), ignore video play, user image.");
            return Unit.INSTANCE;
        }
        if (!newUserWidgetVideoHelper.m43775u(viewStub)) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragment), C42911a.m94121c().plus(new C46329a(CoroutineExceptionHandler.INSTANCE)), null, new NewUserWidgetVideoHelper$downloadAndPlay$1$1(newUserWidgetVideoHelper, viewStub, str, null), 2, null);
            return Unit.INSTANCE;
        }
        C44128b.m97266j("NewUserWidgetVideoHelper", "viewStub.parent is null, viewStub has been inflated.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m43775u(ViewStub viewStub) {
        if (viewStub.getParent() == null) {
            return true;
        }
        return false;
    }
}
