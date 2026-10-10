package com.kubi.p110rn.modules.command.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.BridgeUtilsKt;
import com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand;
import com.kubi.p110rn.modules.command.model.PhotoModel;
import com.kubi.p110rn.p111ui.ReactRootFragment;
import com.kubi.p110rn.utils.RNPhotoUtils;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24267r0;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TakePictureCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J,\u0010\u0016\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001fH\u0002J\f\u0010\"\u001a\u00020#*\u00020\u000eH\u0002J\b\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/TakePictureCommand;", "Lcom/kubi/rn/modules/command/ReactBridgeCallbackCommand;", "Lcom/facebook/react/bridge/ActivityEventListener;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "activity", "Lcom/kubi/sdk/BaseActivity;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", BridgeParamKeyKt.CAPTURE, "", BridgeParamKeyKt.MAX_COUNT, "", "type", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "", "<init>", "(Lcom/facebook/react/bridge/Promise;Lcom/kubi/sdk/BaseActivity;Lcom/facebook/react/bridge/ReactApplicationContext;ZILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onExecute", "onActivityResult", "Landroid/app/Activity;", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onNewIntent", "intent", "convert", "", "Lcom/kubi/rn/modules/command/model/PhotoModel;", "Landroid/net/Uri;", "convertType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTakePictureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/rn/modules/command/impl/TakePictureCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n295#2,2:156\n1869#2,2:160\n19#3,2:158\n47#4,4:162\n1#5:166\n*S KotlinDebug\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/rn/modules/command/impl/TakePictureCommand\n*L\n66#1:156,2\n119#1:160,2\n75#1:158,2\n146#1:162,4\n*E\n"})
public final class TakePictureCommand extends ReactBridgeCallbackCommand implements ActivityEventListener {

    @NotNull
    private final BaseActivity activity;

    @NotNull
    private final Function1<ReadableMap, Unit> callback;
    private final boolean capture;
    private final int maxCount;

    @NotNull
    private final ReactApplicationContext reactContext;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.rn.modules.command.impl.TakePictureCommand$onActivityResult$1 */
    /* JADX INFO: compiled from: TakePictureCommand.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.modules.command.impl.TakePictureCommand$onActivityResult$1", m90122f = "TakePictureCommand.kt", m90123i = {}, m90124l = {92}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nTakePictureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/rn/modules/command/impl/TakePictureCommand$onActivityResult$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1869#2,2:156\n*S KotlinDebug\n*F\n+ 1 TakePictureCommand.kt\ncom/kubi/rn/modules/command/impl/TakePictureCommand$onActivityResult$1\n*L\n96#1:156,2\n*E\n"})
    public static final class C235741 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C235741(Intent intent, Continuation<? super C235741> continuation) {
            super(2, continuation);
            this.$data = intent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TakePictureCommand.this.new C235741(this.$data, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C235741) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CoroutineContext coroutineContextPlus = C42911a.m94120b().plus(TakePictureCommand.this.coroutineExceptionHandler());
                TakePictureCommand$onActivityResult$1$outputModels$1 takePictureCommand$onActivityResult$1$outputModels$1 = new TakePictureCommand$onActivityResult$1$outputModels$1(TakePictureCommand.this, this.$data, null);
                this.label = 1;
                obj = C41686h.m91049g(coroutineContextPlus, takePictureCommand$onActivityResult$1$outputModels$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (PhotoModel photoModel : (List) obj) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("uri", photoModel.getUri());
                writableMapCreateMap.putInt("width", photoModel.getWidth());
                writableMapCreateMap.putInt("height", photoModel.getHeight());
                writableMapCreateMap.putDouble("size", photoModel.getSize());
                writableMapCreateMap.putString("type", photoModel.getType());
                writableMapCreateMap.putDouble(TypedValues.TransitionType.S_DURATION, photoModel.getDuration());
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putArray("photos", writableArrayCreateArray);
            C24267r0.m58520d(writableMapCreateMap2);
            TakePictureCommand.this.callback.invoke(writableMapCreateMap2);
            TakePictureCommand.this.getPromise().resolve(writableMapCreateMap2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TakePictureCommand(Promise promise, BaseActivity baseActivity, ReactApplicationContext reactApplicationContext, boolean z11, int i11, String str, Function1 function1, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(promise, baseActivity, reactApplicationContext, z11, i11, (i12 & 32) != 0 ? null : str, (i12 & 64) != 0 ? new Function1() { // from class: com.kubi.rn.modules.command.impl.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TakePictureCommand._init_$lambda$0((ReadableMap) obj);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ReadableMap readableMap) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PhotoModel> convert(List<? extends Uri> list) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Uri uri : list) {
                if (StringsKt.contains$default((CharSequence) C27041f.m66668h(uri.getScheme()), (CharSequence) "content", false, 2, (Object) null)) {
                    Uri uriCopyUri = RNPhotoUtils.copyUri(this.reactContext, uri);
                    if (uriCopyUri == null || (string = uriCopyUri.toString()) == null) {
                        string = "";
                    }
                    String str = string;
                    boolean zIsVideo = RNPhotoUtils.isVideo(this.reactContext, uri);
                    Pair<Integer, Integer> videoDimensions = zIsVideo ? RNPhotoUtils.getVideoDimensions(this.reactContext, uri) : RNPhotoUtils.getImageDimensions(this.reactContext, uri);
                    long videoDuration = zIsVideo ? RNPhotoUtils.getVideoDuration(this.reactContext, uri) : 0L;
                    double fileSize = RNPhotoUtils.getFileSize(this.reactContext, uri);
                    String imgType = RNPhotoUtils.getImgType(this.reactContext, uri);
                    Pair<Integer, Integer> pair = videoDimensions;
                    arrayList.add(new PhotoModel(str, pair.getFirst().intValue(), pair.getSecond().intValue(), fileSize, imgType, videoDuration));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineExceptionHandler coroutineExceptionHandler() {
        return new C23573xc4b77484(CoroutineExceptionHandler.INSTANCE, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    public static final void onExecute$lambda$3(BaseFragment baseFragment, TakePictureCommand takePictureCommand) {
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaTypeConvertType;
        int i11 = takePictureCommand.maxCount;
        String str = takePictureCommand.type;
        if (str == null) {
            visualMediaTypeConvertType = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null || (visualMediaTypeConvertType = takePictureCommand.convertType(str)) == null) {
                visualMediaTypeConvertType = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
            }
        }
        ImagePickerHelper.m58395d(baseFragment, i11, FragmentTransaction.TRANSIT_FRAGMENT_OPEN, visualMediaTypeConvertType);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(@Nullable Activity activity, int requestCode, int resultCode, @Nullable Intent data) {
        this.reactContext.removeActivityEventListener(this);
        if (resultCode == -1 && requestCode == 4097) {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("RN转化图片uri").plus(C42911a.m94121c()).plus(coroutineExceptionHandler())), null, null, new C235741(data, null), 3, null);
        }
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand
    public void onExecute() {
        Object next;
        List<Fragment> fragments = this.activity.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Fragment) next) instanceof ReactRootFragment));
        final BaseFragment baseFragment = (BaseFragment) next;
        if (baseFragment == null) {
            getPromise().reject(BridgeUtilsKt.ERROR_CODE_PARAM, "fragment not exit");
            C24267r0.m58519c(new IllegalArgumentException("fragment is null"));
        } else {
            this.reactContext.addActivityEventListener(this);
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.rn.modules.command.impl.e
                @Override // java.lang.Runnable
                public final void run() {
                    TakePictureCommand.onExecute$lambda$3(baseFragment, this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TakePictureCommand(@Nullable Promise promise, @NotNull BaseActivity activity, @NotNull ReactApplicationContext reactContext, boolean z11, int i11, @Nullable String str, @NotNull Function1<? super ReadableMap, Unit> callback) {
        super(promise == null ? NoOpPromise.f46099a : promise);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.activity = activity;
        this.reactContext = reactContext;
        this.capture = z11;
        this.maxCount = i11;
        this.type = str;
        this.callback = callback;
    }

    private final ActivityResultContracts.PickVisualMedia.VisualMediaType convertType(String str) {
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

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(@Nullable Intent intent) {
    }
}
