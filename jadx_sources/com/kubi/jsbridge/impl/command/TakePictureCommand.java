package com.kubi.jsbridge.impl.command;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.utils.extensions.C27041f;
import com.kubi.widget.web.ui.ActivityResultHost;
import com.kubi.widget.web.ui.ActivityResultListener;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: TakePictureCommand.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BU\u0012(\u0010\u0002\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\bJ\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020\u0005H\u0002J\b\u0010 \u001a\u00020!H\u0002R0\u0010\u0002\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/jsbridge/impl/command/TakePictureCommand;", "Lcom/kubi/widget/web/ui/ActivityResultListener;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "activity", "Lcom/kubi/sdk/BaseActivity;", BridgeParamKeyKt.CAPTURE, "", BridgeParamKeyKt.MAX_COUNT, "", "type", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/kubi/sdk/BaseActivity;ZILjava/lang/String;)V", "host", "Lcom/kubi/widget/web/ui/ActivityResultHost;", "execute", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "convert", "", "Lcom/kubi/jsbridge/impl/command/PhotoModel;", "Landroid/net/Uri;", "convertType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTakePictureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/jsbridge/impl/command/TakePictureCommand\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n19#2,2:108\n1869#3,2:110\n47#4,4:112\n1#5:116\n*S KotlinDebug\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/jsbridge/impl/command/TakePictureCommand\n*L\n42#1:108,2\n74#1:110,2\n100#1:112,4\n*E\n"})
public final class TakePictureCommand implements ActivityResultListener {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function2<Map<String, ? extends Object>, ProtocolException, Unit> f27388a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BaseActivity f27389b;

    /* JADX INFO: renamed from: c */
    public final boolean f27390c;

    /* JADX INFO: renamed from: d */
    public final int f27391d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f27392e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ActivityResultHost f27393f;

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.command.TakePictureCommand$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 TakePictureCommand.kt\ncom/kubi/jsbridge/impl/command/TakePictureCommand\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n101#2:50\n102#2,3:53\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/jsbridge/impl/command/TakePictureCommand\n*L\n101#1:51,2\n*E\n"})
    public static final class C15227a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TakePictureCommand f27394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15227a(CoroutineExceptionHandler.Companion companion, TakePictureCommand takePictureCommand) {
            super(companion);
            this.f27394b = takePictureCommand;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KCConfigException(exception, "H5TakePictureCommand", false, null, 8, null), null, 2, null);
            String message = exception.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            C44128b.m97262f("H5TakePictureCommand", message, exception);
            this.f27394b.f27388a.invoke(null, new ProtocolException("Failure. e:" + exception.getMessage(), null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.command.TakePictureCommand$onActivityResult$1 */
    /* JADX INFO: compiled from: TakePictureCommand.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.jsbridge.impl.command.TakePictureCommand$onActivityResult$1", m90122f = "TakePictureCommand.kt", m90123i = {}, m90124l = {56}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTakePictureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/jsbridge/impl/command/TakePictureCommand$onActivityResult$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1563#2:108\n1634#2,3:109\n*S KotlinDebug\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/jsbridge/impl/command/TakePictureCommand$onActivityResult$1\n*L\n59#1:108\n59#1:109,3\n*E\n"})
    public static final class C152281 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152281(Intent intent, Continuation<? super C152281> continuation) {
            super(2, continuation);
            this.$data = intent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TakePictureCommand.this.new C152281(this.$data, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C152281) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContextPlus = C42911a.m94120b().plus(TakePictureCommand.this.m31621g());
                TakePictureCommand$onActivityResult$1$outputModels$1 takePictureCommand$onActivityResult$1$outputModels$1 = new TakePictureCommand$onActivityResult$1$outputModels$1(TakePictureCommand.this, this.$data, null);
                this.label = 1;
                obj = C41686h.m91049g(coroutineContextPlus, takePictureCommand$onActivityResult$1$outputModels$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List<PhotoModel> list = (List) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (PhotoModel photoModel : list) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("uri", photoModel.getUri()), TuplesKt.m90091to("width", Boxing.boxInt(photoModel.getWidth())), TuplesKt.m90091to("height", Boxing.boxInt(photoModel.getHeight())), TuplesKt.m90091to("size", Boxing.boxDouble(photoModel.getSize())), TuplesKt.m90091to("type", photoModel.getType()), TuplesKt.m90091to(TypedValues.TransitionType.S_DURATION, Boxing.boxLong(photoModel.getDuration()))));
            }
            TakePictureCommand.this.f27388a.invoke(MapsKt.mapOf(TuplesKt.m90091to("photos", arrayList)), null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakePictureCommand(@NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback, @NotNull BaseActivity activity, boolean z11, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27388a = callback;
        this.f27389b = activity;
        this.f27390c = z11;
        this.f27391d = i11;
        this.f27392e = str;
        this.f27393f = activity instanceof ActivityResultHost ? (ActivityResultHost) activity : null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX INFO: renamed from: i */
    public static final void m31618i(TakePictureCommand takePictureCommand) {
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaTypeM31620f;
        BaseActivity baseActivity = takePictureCommand.f27389b;
        int i11 = takePictureCommand.f27391d;
        String str = takePictureCommand.f27392e;
        if (str == null) {
            visualMediaTypeM31620f = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null || (visualMediaTypeM31620f = takePictureCommand.m31620f(str)) == null) {
                visualMediaTypeM31620f = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
            }
        }
        ImagePickerHelper.m58394c(baseActivity, i11, InputDeviceCompat.SOURCE_TOUCHSCREEN, visualMediaTypeM31620f);
    }

    /* JADX INFO: renamed from: g */
    public final CoroutineExceptionHandler m31621g() {
        return new C15227a(CoroutineExceptionHandler.INSTANCE, this);
    }

    /* JADX INFO: renamed from: h */
    public final void m31622h() {
        ActivityResultHost activityResultHost = this.f27393f;
        if (activityResultHost == null) {
            this.f27388a.invoke(null, new ProtocolException("Activity must implement ActivityResultHost", null, null, false, 14, null));
            return;
        }
        activityResultHost.mo67454t(this);
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.jsbridge.impl.command.c
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureCommand.m31618i(this.f27402b);
            }
        });
    }

    @Override // com.kubi.widget.web.ui.ActivityResultListener
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        ActivityResultHost activityResultHost = this.f27393f;
        if (activityResultHost != null) {
            activityResultHost.mo67456x(this);
        }
        if (resultCode == -1 && requestCode == 4098) {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("H5转化图片uri").plus(C42911a.m94121c()).plus(m31621g())), null, null, new C152281(data, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<PhotoModel> m31619e(List<? extends Uri> list) {
        String string;
        Pair<Integer, Integer> pairM31628c;
        long jM31624f;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (list != null) {
            for (Uri uri : list) {
                if (StringsKt.contains$default((CharSequence) C27041f.m66668h(uri.getScheme()), (CharSequence) "content", false, 2, (Object) null)) {
                    H5PhotoUtils h5PhotoUtils = H5PhotoUtils.f27395a;
                    Uri uriM31626a = h5PhotoUtils.m31626a(this.f27389b, uri);
                    if (uriM31626a == null || (string = uriM31626a.toString()) == null) {
                        string = "";
                    }
                    String str = string;
                    boolean zM31625g = H5PhotoUtils.m31625g(this.f27389b, uri);
                    if (zM31625g) {
                        pairM31628c = H5PhotoUtils.m31623e(this.f27389b, uri);
                    } else {
                        pairM31628c = h5PhotoUtils.m31628c(this.f27389b, uri);
                    }
                    if (zM31625g) {
                        jM31624f = H5PhotoUtils.m31624f(this.f27389b, uri);
                    } else {
                        jM31624f = 0;
                    }
                    long j11 = jM31624f;
                    double dM31627b = h5PhotoUtils.m31627b(this.f27389b, uri);
                    String strM31629d = h5PhotoUtils.m31629d(this.f27389b, uri);
                    Pair<Integer, Integer> pair = pairM31628c;
                    listCreateListBuilder.add(new PhotoModel(str, pair.getFirst().intValue(), pair.getSecond().intValue(), dM31627b, strM31629d, j11));
                }
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* JADX INFO: renamed from: f */
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType m31620f(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 100313435) {
            if (iHashCode != 112202875) {
                if (iHashCode == 1060391146 && str.equals("image,video")) {
                    return ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
                }
            } else if (str.equals("video")) {
                return ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE;
            }
        } else if (str.equals("image")) {
            return ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
        }
        return ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
    }

    public /* synthetic */ TakePictureCommand(Function2 function2, BaseActivity baseActivity, boolean z11, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, baseActivity, z11, i11, (i12 & 16) != 0 ? null : str);
    }
}
